package dev.multitasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Calculations {
    private Vector<Character> operators;
    private ArrayList<Integer> values;
    private int result;

    public Calculations(){
        operators = new Vector<>();
        values = new ArrayList<>();
    }

    public Calculations(Character []operators){
        this.operators.addAll(Arrays.asList(operators));
    }

    public void put(Character operator){
        operators.add(operator);
    }

    public Vector<Character> getOperators(){
        return operators;
    }

    public void getValues(Integer[] values){
        this.values.addAll(Arrays.asList(values));
    }

    public void calculateValues(Character operator){
        int result = 0;
        for(Character current_operator : this.operators){
            if(current_operator == operator){
                for(int value : values){
                    result += value;
                }
                this.result = result;
                break;
            }
        }
    }

    public void getResult(){
        System.out.println(result);
    }
}
