package Greedy;

import java.util.ArrayList;

public class DistributeCandies {
    
    public static void main(String[] args) {

        ArrayList<Integer> ratings = new ArrayList<>();
        ratings.add(1);
        ratings.add(5);
        ratings.add(2);
        ratings.add(1);

        System.out.println(candies(ratings));
        
    }

    public static int candies(ArrayList<Integer> ratings){
        int length = ratings.size();

        // input valdiation
        if(length<=1){
            return length;
        }

        // initialize new array and set each element to 1
        ArrayList<Integer> candies = new ArrayList<>();

        for(int i=0; i<length; i++){
            candies.add(1);
        }

        // traverse: left to right
        // compare current element rating with element to the left
        // update the candies count accordingly
        for(int i=1; i<length; i++){
            if(ratings.get(i)>ratings.get(i-1)){
                candies.set(i, candies.get(i-1)+1);
            }
        }

        // traverse: right to left
        // compare current element rating with element to the right
        // update the candies count if current element has less or equal
        for(int i=length-2; i>=0; i--){
            if(ratings.get(i)>ratings.get(i+1) && candies.get(i)<=candies.get(i+1)){
                candies.set(i, candies.get(i+1)+1);
            }
        }
        int totalCandies = 0;

        for(Integer candy : candies){
            totalCandies = totalCandies + candy;
        }

        return totalCandies;
    }
}
