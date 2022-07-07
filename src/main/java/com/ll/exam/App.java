package com.ll.exam;
import java.util.Scanner;
public class App {

    public void run() {
        System.out.println(("==명언SSG=="));


        Scanner sc = new Scanner(System.in);
        int count = 0;
        outer:


        while(true){
            System.out.print("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd) {
                case "종료" :
                    break outer;

            }

            switch (cmd){
                case "등록" :

                    System.out.print("명언 : ");
                    String 명언 = sc.nextLine().trim();
                    count ++;
                    System.out.print("작가 : ");
                    String 작가 = sc.nextLine().trim();
                    System.out.println(count + "번 명언이 등록되었습니다.");

            }

            switch (cmd) {
                case "목록" :
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------");

            }
        }

        sc. close();
    }
}

