package com.company;

public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator1= new NumberGenerator();

        numberGenerator.setName("A");
        numberGenerator1.setName("B");
//        numberGenerator.start();
//        numberGenerator1.start();

        numberGenerator.setPriority(10); // sét múc đọ ưu tiên Priority không có thay dổi gì nhiều
        numberGenerator1.setPriority(1);
        numberGenerator.start();
        numberGenerator1.start();








    }
}
