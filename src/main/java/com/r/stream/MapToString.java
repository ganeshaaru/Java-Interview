package com.r.stream;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class MapToString {

    static class Node{
        private String value;

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node("String 1"));
        nodes.add(new Node("String 2"));

        Set<String> collect = nodes.stream().map(Node::getValue).collect(Collectors.toSet());

        for (String s : collect) {
            System.out.println(s);
        }
    }
}
