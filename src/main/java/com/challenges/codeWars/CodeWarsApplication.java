package com.challenges.codeWars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CodeWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeWarsApplication.class, args);
    }

    public static String listSquared(long m, long n) {
        if (1 > m || m > n) {
            return "";
        }
        List<List<Long>> sqrt = new ArrayList<>();
        for (; m <= n; m++) {
            long squad = 0;
            long sum = 0;
            for (int i = 1; i <= m; i++) {
                if (m % i == 0) {
                    squad = i * i;
                    sum += squad;
                }
            }
            if (Math.sqrt(sum) % 1 == 0) {
                sqrt.add(Arrays.asList(m, sum));
            }
        }
        return sqrt.toString();
    }
}
