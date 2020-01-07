package com.spring.context.struct;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-11-25 16:22
 */

import java.util.Comparator;

/**
 * @Auther chenhao
 * @Date 2019/11/25
 */
public class Node<T>  implements Comparable<Node<T>> {

    private Node<T> left;

    private Node<T> right;

    private T value;

    private int frequency;


    public Node(T value, int frequency) {
        this.value = value;
        this.frequency = frequency;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public int compareTo(Node<T> o) {
        if(o.getFrequency()>this.getFrequency()){
            return 1;
        }
        if(o.getFrequency()<this.getFrequency()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                ", frequency=" + frequency +
                '}';
    }
}
