package guru.qa;

import guru.qa.example.Phone;

public class Main {

  public static void main(String[] args) {
    // Примитивные типы данных
    // 1. Целочисленные типы данных
    byte varByte = 10; //  8bit   -128 ... 127   2^(bits -1)
    short varShort = 10; //  16bit -32768 ... 32767
    int varInt = 10; //* 32bit -2147483648 ... 2147483647
    long varLong = 10L; // 64 bit
    // 2. Числа с плавающей точкой
    float varFloat = 1.2F; // 32bit
    double varDouble = 1.2; //* 64 bit
    // 3. Символьный тип
    char varChar = 'a';
    // 4. логический тип
    boolean varBoolean = true; //*

    //  Ссылочные (объектные)
    String s = "Hello, world!";
    Phone pixel = new Phone();
    pixel.printName();


    //  Операторы
    // 1. присвоение = (присваивает то что справа в переменную слева)
    String s1 = "Hello, world!";
    // 2. арифметические +, -, *, /, %,
    int divideResult = 7/3; // 2
    int residueResult = 7%3; // 1 (остаток)
    // 3. операторы сравнения >, <, >=, <=, !=, ==
    boolean result = "Dima".equals("Dima");
    // 4. логические операторы &, &&, |, ||, !
    int age = 16;
    String sex = "male";
    boolean canDrinkAlcoholAnd = age > 18 && sex.equals("male");
    boolean canDrinkAlcoholOr = age > 18 || sex.equals("male");
    boolean canDrinkAlcoholInvert = !(age > 18 && sex.equals("male"));

    String name = null;
    boolean canDrinkAlcoholByName = name != null && name.equals("Dima");
    // 5. оператор instanceof
    boolean isString = name instanceof String;
    // 6. тернарный оператор ? :
    String processor = "m1";
    int coreCount = processor.equals("m1")
        ? 2
        : 4;

    if (processor.equals("m1")) {
      coreCount = 2;
    } else if (processor.equals("intel")) {
      coreCount = 4;
    } else {
      coreCount = 8;
    }











  }


  public static int calculate(int first, int second) {
    return first + second;
  }
}