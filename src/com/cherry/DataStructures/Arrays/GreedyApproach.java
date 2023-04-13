package com.cherry.DataStructures.Arrays;

import java.util.Arrays;

public class GreedyApproach {
    public static void main(String[] args) {
        int[] fuel = {5, 3, 7, 1, 12};
        int[] dist = {8, 4, 7, 4, 5};
//        int answer = gasstation(fuel, dist);
//        System.out.println(answer);
//        Covering the tweaks and edge cases.
        int n = fuel.length;
        int station = gasstationoptimized(fuel, dist, n);
        System.out.println(station);
    }

    public static int gasstationoptimized(int[] fuel, int[] dist, int n) {
        int last = 0;
        int position = 0;
        int min_fuel = Integer.MAX_VALUE;
        int min_pos = 0;

        while (position < n) {
            last = last + fuel[position];
            last = last - dist[position];
            position++;

            if (last < min_fuel) {
                min_fuel = last;
                min_pos = position % n;
            }
        }
        return fuel[min_pos];
    }

//    public static int gasstation(int[] fuel, int[] dist) {
//        int fuel_total = Arrays.stream(fuel).sum();
//        int dist_total = Arrays.stream(dist).sum();
//        int total = 0;
//        int res = 0;
//
//        if (dist_total > fuel_total) {
//            return -1;
//        }
//
//        for (int i = 0; i < fuel.length; i++) {
//            total = total + (fuel[i] - dist[i]);
//
//            if (total < 0) {
//                total = 0;
//                res = i + 1;
//            }
//        }
//        return fuel[res];
//    }
}
