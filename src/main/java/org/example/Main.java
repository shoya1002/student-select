package org.example;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> studentNameList = List.of("田中浩二","白井建造","林健斗","五臓六腑順","核健斗",
    "高橋武蔵","佐々木虎狼","田中修","向井修","岩本駿");

    studentNameList.stream()
        .filter(name -> 4 <= name.length())
        .forEachOrdered(System.out::println);
  }
}
