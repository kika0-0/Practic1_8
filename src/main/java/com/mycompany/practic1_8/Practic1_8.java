/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practic1_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Practic1_8 {
    public static ArrayList<Telephone> addTelephone(ArrayList<Telephone> tList, Telephone telephone){
        tList.add(telephone);
        return tList;
    }

    public static void main(String[] args) {
        System.out.println("Коржавина Виктория РИБО-03-22");
        ArrayList<Telephone> telephoneList = new ArrayList<>();
        telephoneList.add(new Telephone("Samsung", "qwerty", "blue", true));
        telephoneList.add(new Telephone("Iphone", "12345", "black", false));
        telephoneList.add(new Telephone("Honor", "hnfdj", "gold", true));



        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавление телефона в список");
            System.out.println("2. Удаление телефона по серийному номеру");
            System.out.println("3. Удаление всех телефонов из списка");
            System.out.println("4. Выход");
            System.out.print("Ввод: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите модель телефона: ");
                    String model = scanner.next();
                    System.out.print("Введите серийный номер: ");
                    String number = scanner.next();

                    boolean check = false;
                    for (int i = 0; i < telephoneList.size(); i++){
                        if (telephoneList.get(i).getNumber().equals(number)) {
                            check = true;
                        }
                    }
                    if (check) {
                        System.out.println("Телефон с таким серийным номером уже есть");
                    }
                    else {
                        System.out.print("Введите цвет: ");
                        String colour = scanner.next();
                        System.out.println("Этот телефон мобильный? (true/false):");
                        boolean isMobile = scanner.nextBoolean();
                        Telephone newTelephone = new Telephone(model, number, colour, isMobile);
                        addTelephone(telephoneList, newTelephone);
                    }
                    break;
                            

                case 2:
                    System.out.print("Введите серийный номер для удаления телефона: ");
                    String NumberToRemove = scanner.next();
                    telephoneList.removeIf(telephone -> telephone.getNumber().equals(NumberToRemove));
                    System.out.println("Телефон удален!");
                    break;

                case 3:
                    telephoneList.removeAll(telephoneList);
                    System.out.println("Все телефоны удалены!!");
                    break;

                case 4:
                    System.out.println("Выход");
                    return;

                default:
                    System.out.println("Ошибка");
            }


            System.out.println("Список всех телефонов:");
            for (Telephone telephone : telephoneList) {
                System.out.println(telephone);
            }
        }
    }
}


