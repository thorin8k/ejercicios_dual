package org.example;

public class Search {
    public static int count(int[] array, int lesserThan) {
        int count1=0;
        for(int i=0;i< array.length;i++){
            if(array[i]<lesserThan) {
                count1= count1+1;
            }
        }
        return count1;
    }
}
