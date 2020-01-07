package com.spring.context.struct;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-25 16:43
 */

import java.util.*;

/**
 * @Auther chenhao
 * @Date 2019/11/25
 */
public class HuffmanTree<T> {

    //哈曼树生成
    public static <T> Node<T> createTree(List<Node<T>> nodes){
        while(nodes.size()>1){
            Collections.sort(nodes);
            Node<T>left=nodes.get(nodes.size()-1);
            Node<T>right=nodes.get(nodes.size()-2);
            Node<T> parent=new Node<>(null,left.getFrequency()+right.getFrequency());
            parent.setLeft(left);
            parent.setRight(right);
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    public static <T> List<Node<T>> breath(Node<T> root){
        List<Node<T>> list=new ArrayList<>();
        Queue<Node<T>> queue = new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
           Node<T> node=queue.poll();
           list.add(node);
           if(node.getLeft()!=null){
               queue.add(node.getLeft());
           }
           if(node.getRight()!=null){
               queue.add(node.getRight());
           }
       }
        return list;
    }

    public static void main(String[] args) {
        List<Node<String>> nodes = new ArrayList<Node<String>>();
        nodes.add(new Node<String>("b", 5));
        nodes.add(new Node<String>("a", 7));
        nodes.add(new Node<String>("d", 2));
        nodes.add(new Node<String>("c", 4));
        Node<String> root = HuffmanTree.createTree(nodes);
        System.out.println(HuffmanTree.breath(root));
    }
}
