package com.geekteek;

public class Main {

    public static void main(String[] args)  {
	// write your code here
      BankAccount client = new BankAccount();
      client.deposit(20000);

      while (true){
          try {
              client.withDraw(6000);
          } catch (LimitException e) {
              try {
                  client.withDraw((int) client.getAmount());
              } catch (LimitException limitException) {
                  limitException.printStackTrace();
              }
              break;
          }
      }
    }
}
/*
* Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом,
*  при этом отлавливать исключение LimitException и при возникновении такого исключения снимать только ту сумму,
*  которая осталась на счете и завершать бесконечный цикл
* */