package com.sourcegraph;

public class Main {
    public static void main(String[] args) {
        Overloaded o = new Overloaded();
        // In Java 7, this is inferred to be `Overloaded.append(Object)`. In Java 8, the type inferencer cannot determine
        // whether to infer the method call as `Overloaded.append(char[])` or `Overloaded.append(CharSequence)`.
        o.append(get("goodbye"));
    }

    public static <V> V get(String s) {
        return (V)s;
    }
}
