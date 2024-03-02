package org.example;


import java.util.Random;

public class Mane {
   public static void main (String[] args) {
      String[] str1 = {"красивый", "черный", "странный"};
      String[] str2 = {"человек", "кот", "ворон"};
      String[] str3 = {"сидел на дереве", "летал в облаках", "воровал рыбу"};
      Random random = new Random();

      StringBuilder strBuilder = new StringBuilder("Сегодня я увидел как ");
      strBuilder.append(str1[random.nextInt(3)])// Указать количество слов в str1 вместо 0.
              .append(" ")
              .append(str2[random.nextInt(3)])
              .append(" ")
              .append(str3[random.nextInt(3)]);

      System.out.println(strBuilder.toString());
   }
}