package storage;

import model.Human;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class HumanFromFileBinary implements IHumanData {
    public ArrayList<Human> readFile() {
        File file = new File("heaven.hieu");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            ArrayList<Human> humanArrayList = (ArrayList<Human>) result;
            ois.close();
            fis.close();
            return humanArrayList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public void writeFile(ArrayList<Human> arrayList) throws IOException {
        File file = new File("heaven.hieu");
        FileOutputStream fos =null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(arrayList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
            fos.close();
        }
    }
}
