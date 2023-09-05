package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
        public static void main(String[] args) {

            System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает ");

          for (int i = 1; i <= 3; i++)
          {
              if (i==1) {
                  System.out.println("Введите Подсказка если вам нужна помощь");
              }
              Scanner scan = new Scanner(System.in);
              String str=scan.nextLine();
              if (str.equals("Подсказка"))
              {
                  if (i==1) {System.out.println("Вредоностная программа, предствавленный в сжатом виде");}
                  else {System.out.println("Подсказка уже не доступна");}
                   scan = new Scanner(System.in);
                   str=scan.nextLine();
              }

           if (str.equals("Заархивированный вирус"))
           {System.out.println("Правильно!");break;}
           else if (i!=3){
               System.out.println("Подумай еще!");
           }
              else
           {
               System.out.println("Обидно, приходи в другой раз!");
           }

          }

        }
        }
