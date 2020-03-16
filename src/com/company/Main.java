package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gato tommy = new Gato("Tommy");
        Raton jerry = new Raton("Jerry", 10);
        List<Raton> ratones = new ArrayList<>();
        ratones.add(jerry);
        

        tommy.comerRaton(jerry);
        tommy.correr(3);
        tommy.comerRatones();
    }
}
