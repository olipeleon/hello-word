package com.example;


public class HolaMundo
{
  public static void main(String[] pars)
  {
    System.out.println("Hola mundo 2!!");
    System.out.println("Otra prueba");

    System.out.println("Esto es otra prueba");

    try {
      System.out.println("Otra prueba mas");
      throw new Exception();
    } catch (Exception e) 
    {
      e.printStackTrace();
    }
  }
}