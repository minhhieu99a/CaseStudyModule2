package storage;

import model.Human;

import java.io.IOException;
import java.util.ArrayList;

public interface IHumanData {
    ArrayList<Human>readFile();
void writeFile(ArrayList<Human> arrayList) throws IOException;
}
