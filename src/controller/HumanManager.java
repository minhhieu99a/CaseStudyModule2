package controller;

import model.Human;
import model.Pilot;
import model.SugarBaby;
import storage.HumanFromFileBinary;
import storage.IHumanData;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import static view.Client.*;

public class HumanManager {
    private static IHumanData humanData = new HumanFromFileBinary();
    public static ArrayList<Human> humanArrayList = humanData.readFile();

    public static void displayHuman() {
        for (Human e : humanArrayList
        ) {
            System.out.println(e);
        }
    }

    public static void addNewPilot() {
        Pilot pilot = creatNewPilot();
        humanArrayList.add(pilot);
        try {
            humanData.writeFile(humanArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewSugarBaby() {
        SugarBaby sugarBaby = creatNewSugarBaby();
        humanArrayList.add(sugarBaby);
        try {
            humanData.writeFile(humanArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void editHumanById(){
        int index = getHumanId();
        if (humanArrayList.get(index)instanceof Pilot){
             editPilot(index);
        }else {
            editSugarBaby(index);
        }
    }
    public static void exitSystem(){
        try {
            humanData.writeFile(humanArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
    public static void deleteHuman(){
        int index =getHumanId();
        humanArrayList.remove(index);
        try {
            humanData.writeFile(humanArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void bookTour(){
        int index = getHumanId();
        if (humanArrayList.get(index)instanceof Pilot){
            Pilot pilot = (Pilot) humanArrayList.get(index);
            if (LocalDate.of(year,month,day))
        }
    }
}
