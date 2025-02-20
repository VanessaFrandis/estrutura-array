package com.example.auladados;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

@SpringBootApplication
public class AulaDadosApplication {

    public static void main(String[] args) {

        int []num = {0,1,2,50,8,9,10,11,12,13,14,15,16,180,18,19,20};
        int sum = 0;
        //System.out.println(num[2]); // BIG O(1);
                for (int n : num){
                    if(n == 180) {
                        for (int j = 0; j < num.length; j++) {
                            System.out.print(j + "||");
                            System.out.println(num[j]);
                        }
                    }
        }
        int num2= num.length;
        System.out.println("Quantidade de posições "+ num2);


    }
}
