package view;

import controller.HumanManager;
import model.Human;
import model.Pilot;
import model.SugarBaby;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static controller.HumanManager.*;

public class Client {
    public static ArrayList<Human> humanArrayListClient = HumanManager.humanArrayList;

    public static void main(String[] args) {
        showMenu();
    }

    public static Pilot creatNewPilot() {
        Scanner inputIdPilot = new Scanner(System.in);
        System.out.println("Nhập ID Pilot: ");
        String idPilot = inputIdPilot.nextLine();

        for (int i = 0; i < humanArrayListClient.size(); i++) {
            if (humanArrayListClient.get(i).getId().equals(idPilot)){
                System.out.println("Id bạn nhập vào bị trùng . Mời bạn nhập lại. ");
                Pilot newPilot = creatNewPilot();
                return newPilot;
            }
        }

        Scanner inputNamePilot = new Scanner(System.in);
        System.out.println("Nhập tên của Pilot: ");
        String namePilot = inputNamePilot.nextLine();

        Scanner inputAgePilot = new Scanner(System.in);
        System.out.println("Nhập tuổi của Pilot : ");
        int agePilot = inputAgePilot.nextInt();

        Scanner inputHeightPilot = new Scanner(System.in);
        System.out.println("Nhập chiều cao của Pilot : ");
        Double heightOfPilot = inputHeightPilot.nextDouble();

        Scanner inputWeightPilot = new Scanner(System.in);
        System.out.println("Nhập cân nặng của Pilot : ");
        Double weightOfPilot = inputWeightPilot.nextDouble();

        Scanner inputPrice = new Scanner(System.in);
        System.out.println("Nhập giá tour một ngày : ");
        double priceOfPilot = inputPrice.nextDouble();

        Scanner inputNationnality = new Scanner(System.in);
        System.out.println("Nhập tính cách của Pilot : ");
        String nationnalityOfPilot = inputNationnality.nextLine();

        ArrayList<LocalDate> datesOfPilot = new ArrayList<>();

        Pilot newPilot = new Pilot(idPilot, namePilot, heightOfPilot, weightOfPilot, agePilot, priceOfPilot, datesOfPilot, nationnalityOfPilot);
        return newPilot;
    }

    public static SugarBaby creatNewSugarBaby() {
        Scanner inputIdSugarBaBy = new Scanner(System.in);
        System.out.println("Nhập ID SugarBaby: ");
        String idSugarBaby = inputIdSugarBaBy.nextLine();

        for (int i = 0; i < humanArrayListClient.size(); i++) {
            if (humanArrayListClient.get(i).getId()==idSugarBaby){
               SugarBaby newSugarBaby =  creatNewSugarBaby();
               return newSugarBaby;
            }
        }

        Scanner inputNameSugarBaBy = new Scanner(System.in);
        System.out.println("Nhập tên của SugarBaby: ");
        String nameSugarBaBy = inputNameSugarBaBy.nextLine();

        Scanner inputAgeSugarBaBy = new Scanner(System.in);
        System.out.println("Nhập tuổi của SugarBaby : ");
        int ageSugarBaBy = inputAgeSugarBaBy.nextInt();

        Scanner inputHeightSugarBaBy = new Scanner(System.in);
        System.out.println("Nhập chiều cao của SugarBaby : ");
        Double heightOfSugarBaBy = inputHeightSugarBaBy.nextDouble();

        Scanner inputWeightSugarBaBy = new Scanner(System.in);
        System.out.println("Nhập cân nặng của SugarBaby : ");
        Double weightOfSugarBaBy = inputWeightSugarBaBy.nextDouble();

        Scanner inputPrice = new Scanner(System.in);
        System.out.println("Nhập giá tour một ngày : ");
        double priceOfSugarBaBy = inputPrice.nextDouble();

        ArrayList<LocalDate> datesOfSugarBaby = new ArrayList<>();

        Scanner inputBust = new Scanner(System.in);
        System.out.println("Nhập vòng 1 của SugarBaby : ");
        double bustOfSugarBaBy = inputBust.nextDouble();

        Scanner inputWaist = new Scanner(System.in);
        System.out.println("Nhập vòng 2 của SugarBaby : ");
        double waistOfSugarBaBy = inputWaist.nextDouble();

        Scanner inputHip = new Scanner(System.in);
        System.out.println("Nhập vòng 3 của SugarBaby : ");
        double hipOfSugarBaBy = inputHip.nextDouble();

        SugarBaby newSugarBaby = new SugarBaby(idSugarBaby, nameSugarBaBy, heightOfSugarBaBy, weightOfSugarBaBy, ageSugarBaBy, priceOfSugarBaBy, datesOfSugarBaby, bustOfSugarBaBy, waistOfSugarBaBy, hipOfSugarBaBy);
        return newSugarBaby;
    }

    public static int getHumanId() {
        Scanner inputHumanId = new Scanner(System.in);
        System.out.println("Nhập Id của mặt hàng mà bạn cần  : ");
        String humanId = inputHumanId.nextLine();
        for (int i = 0; i < humanArrayListClient.size(); i++) {
            Human human = humanArrayListClient.get(i);
            if (human.getId().equals(humanId)) {
                return i;
            }
        }
        return -1;
    }

    public static Pilot editPilot(int index) {
        int choice1 = -1;
        Scanner inputChoice1 = new Scanner(System.in);
        Pilot editPilot = (Pilot) humanArrayListClient.get(index);
        while (choice1 != 0) {
            System.out.println("Menu");
            System.out.println("1. Sửa Id của Pilot");
            System.out.println("2. Sửa tên của Pilot ");
            System.out.println("3. Sửa chiều cao của Pilot");
            System.out.println("4. Sửa cân nặng của Pilot");
            System.out.println("5. Sửa tuổi của Pilot");
            System.out.println("6. Sửa giá của Pilot");
            System.out.println("7. Sửa tính cách của Pilot");
            System.out.println("0. Quay lại Menu");
            choice1 = inputChoice1.nextInt();
            switch (choice1) {
                case 1:
                    Scanner inputEditId = new Scanner(System.in);
                    System.out.println("Nhập Id mà bạn muốn sửa : ");
                    String newId = inputEditId.nextLine();
                    humanArrayListClient.get(index).setId(newId);
                    break;
                case 2:
                    Scanner inputEditFullName = new Scanner(System.in);
                    System.out.println("Nhập tên mà bạn muốn sửa : ");
                    String newFullName = inputEditFullName.nextLine();
                    humanArrayListClient.get(index).setFullName(newFullName);
                    break;
                case 3:
                    Scanner inputEditHeight = new Scanner(System.in);
                    System.out.println("Nhập chiều cao mà bạn muốn sửa : ");
                    Double newHeight = inputEditHeight.nextDouble();
                    humanArrayListClient.get(index).setHeight(newHeight);
                    break;
                case 4:
                    Scanner inputEditWeight = new Scanner(System.in);
                    System.out.println("Nhập cân nặng mà bạn muốn sửa : ");
                    Double newWeight = inputEditWeight.nextDouble();
                    humanArrayListClient.get(index).setWeight(newWeight);
                    break;
                case 5:
                    Scanner inputEditAge = new Scanner(System.in);
                    System.out.println("Nhập tuổi mà bạn muốn sửa : ");
                    int newAge = inputEditAge.nextInt();
                    humanArrayListClient.get(index).setAge(newAge);
                    break;
                case 6:
                    Scanner inputEditPrice = new Scanner(System.in);
                    System.out.println("Nhập giá mà bạn muốn sửa : ");
                    Double newPrice = inputEditPrice.nextDouble();
                    humanArrayListClient.get(index).setWeight(newPrice);
                    break;
                case 7:
                    Scanner inputEditNationnality = new Scanner(System.in);
                    System.out.println("Nhập tính cách mà bạn muốn sửa : ");
                    String newNationnality = inputEditNationnality.nextLine();
                    ((Pilot) humanArrayListClient.get(index)).setNationnality(newNationnality);
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Mời bạn chọn lại ");
            }
        }
        return editPilot;
    }

    public static SugarBaby editSugarBaby(int index) {
        int choice2 = -1;
        Scanner inputChoice2 = new Scanner(System.in);
        while (choice2 != 0) {
            System.out.println("Menu");
            System.out.println("1. Sửa Id của SugarBaby");
            System.out.println("2. Sửa tên của SugarBaby ");
            System.out.println("3. Sửa chiều cao của SugarBaby");
            System.out.println("4. Sửa cân nặng của SugarBaby");
            System.out.println("5. Sửa tuổi của SugarBaby");
            System.out.println("6. Sửa giá của SugarBaby");
            System.out.println("7. Sửa vòng 1 của SugarBaby");
            System.out.println("8. Sửa vòng 2 của SugarBaby");
            System.out.println("9. Sửa vòng 3 của SugarBaby");
            System.out.println("0. Quay lại Menu");
            choice2 = inputChoice2.nextInt();
            switch (choice2) {
                case 1:
                    Scanner inputEditId = new Scanner(System.in);
                    System.out.println("Nhập Id mà bạn muốn sửa : ");
                    String newId = inputEditId.nextLine();
                    humanArrayListClient.get(index).setId(newId);
                    break;
                case 2:
                    Scanner inputEditFullName = new Scanner(System.in);
                    System.out.println("Nhập tên mà bạn muốn sửa : ");
                    String newFullName = inputEditFullName.nextLine();
                    humanArrayListClient.get(index).setFullName(newFullName);
                    break;
                case 3:
                    Scanner inputEditHeight = new Scanner(System.in);
                    System.out.println("Nhập chiều cao mà bạn muốn sửa : ");
                    Double newHeight = inputEditHeight.nextDouble();
                    humanArrayListClient.get(index).setHeight(newHeight);
                    break;
                case 4:
                    Scanner inputEditWeight = new Scanner(System.in);
                    System.out.println("Nhập cân nặng mà bạn muốn sửa : ");
                    Double newWeight = inputEditWeight.nextDouble();
                    humanArrayListClient.get(index).setWeight(newWeight);
                    break;
                case 5:
                    Scanner inputEditAge = new Scanner(System.in);
                    System.out.println("Nhập tuổi mà bạn muốn sửa : ");
                    int newAge = inputEditAge.nextInt();
                    humanArrayListClient.get(index).setAge(newAge);
                    break;
                case 6:
                    Scanner inputEditPrice = new Scanner(System.in);
                    System.out.println("Nhập giá mà bạn muốn sửa : ");
                    Double newPrice = inputEditPrice.nextDouble();
                    humanArrayListClient.get(index).setWeight(newPrice);
                    break;
                case 7:
                    Scanner inputEditBust = new Scanner(System.in);
                    System.out.println("Nhập số đo vòng 1 mà bạn muốn sửa : ");
                    Double newBust = inputEditBust.nextDouble();
                    ((SugarBaby) humanArrayListClient.get(index)).setBust(newBust);
                    break;
                case 8:
                    Scanner inputEditWaist = new Scanner(System.in);
                    System.out.println("Nhập số đo vòng 2 mà bạn muốn sửa : ");
                    Double newWaist = inputEditWaist.nextDouble();
                    ((SugarBaby) humanArrayListClient.get(index)).setBust(newWaist);
                    break;
                case 9:
                    Scanner inputEditHip = new Scanner(System.in);
                    System.out.println("Nhập số đo vòng 3 mà bạn muốn sửa : ");
                    Double newHip = inputEditHip.nextDouble();
                    ((SugarBaby) humanArrayListClient.get(index)).setBust(newHip);
                    break;
                case 0:
                    showMenu();
                default:
                    System.out.println("Mời bạn chọn lại ");
            }
        }
        SugarBaby editSugarBaby = (SugarBaby) humanArrayListClient.get(index);
        return editSugarBaby;
    }

    public static void displayDateOfHuman() {
        for (int i = 0; i < humanArrayListClient.size(); i++) {
            ArrayList<LocalDate> dates = humanArrayListClient.get(i).getDates();
            System.out.println("Lịch của nhân viên có Id " + humanArrayListClient.get(i).getId() + " và tên " + humanArrayList.get(i).getFullName() + " =" + dates);
        }
    }

    public static void enterCustomerBook() {
        System.out.println("Lịch của nhân viên : ");
        displayDateOfHuman();
        // Book lịch
        Scanner inputDayBook = new Scanner(System.in);
        System.out.println("Nhập ngày khách muốn book : ");
        int dayBook = inputDayBook.nextInt();
        Scanner inputMonthBook = new Scanner(System.in);
        System.out.println("Nhập tháng mà khách muốn book : ");
        int monthBook = inputMonthBook.nextInt();
        Scanner inputYearBook = new Scanner(System.in);
        System.out.println("Nhập năm mà khách muốn book : ");
        int yearBook = inputYearBook.nextInt();
        Scanner inputDate = new Scanner(System.in);
        System.out.println("Nhập số  ngày khách muốn book lịch");
        int dateBook = inputDate.nextInt();
        LocalDate khachMuonBook = LocalDate.of(yearBook, monthBook, dayBook);
        ArrayList<LocalDate> lichBook = new ArrayList<>();
        int index = getHumanId();
        if ((humanArrayListClient.get(index).getDates()).size() == 0) {
            for (int k = dateBook; k > 0; k--) {
                lichBook.add(khachMuonBook.plusDays(dateBook - k));
            }
        } else {
            for (int j = 0; j < humanArrayListClient.get(index).getDates().size(); j++) {
                for (int k = dateBook; k > 0; k--) {
                    if (humanArrayListClient.get(index).getDates().get(j).isEqual(khachMuonBook.plusDays(dateBook - k))) {
                        System.out.println("Nhân viên có Id " + humanArrayListClient.get(index).getId() + " đã có lịch trùng vào ngày " + khachMuonBook.plusDays(dateBook - k) + ". Mời bạn chọn và xem lại lịch. ");
                        lichBook = new ArrayList<>();
                        break;
                    } else if (lichBook.size() < dateBook) {
                        lichBook.add(khachMuonBook.plusDays(dateBook - k));
                    }
                }
            }
        }
        for (int j = humanArrayListClient.get(index).getDates().size() - 1; j >= 0; j--) {
            for (int k = dateBook; k > 0; k--) {
                if (humanArrayListClient.get(index).getDates().get(j).isEqual(khachMuonBook.plusDays(dateBook - k))) {
                    lichBook = new ArrayList<>();
                    break;
                }
            }
        }
        if (lichBook.size() > 0) {
            System.out.println("Bạn đã book lịch thành công");
            humanArrayListClient.get(index).getDates().addAll(lichBook);
        }
    }

    public static void displaySalaryById() {

        Scanner inputYear = new Scanner(System.in);
        System.out.println("Nhập năm mà bạn muốn tính lương : ");
        int year = inputYear.nextInt();

        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Nhập tháng mà bạn muốn tính lương : ");
        int month = inputMonth.nextInt();

        int index = getHumanId();
        int countDateSalary = 0;
        for (int i = 0; i < humanArrayListClient.get(index).getDates().size(); i++) {
            if (humanArrayListClient.get(index).getDates().get(i).getMonth().getValue() == month && humanArrayListClient.get(index).getDates().get(i).getYear() == year) {
                countDateSalary += 1;
            }
        }
        double salaryOfHuman = humanArrayListClient.get(index).getPrice() * countDateSalary * 0.5;
        System.out.println("Lương tháng " + month+"/"+year + " của nhân viên " + humanArrayListClient.get(index).getFullName() + "là : " + salaryOfHuman);
    }

    public static void displayProfit() {

        Scanner inputYear = new Scanner(System.in);
        System.out.println("Nhập năm mà bạn muốn tính lợi nhuận : ");
        int year = inputYear.nextInt();

        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Nhập tháng mà bạn muốn tính lợi nhuận : ");
        int month = inputMonth.nextInt();

        int countDateProfit = 0;

        double profitOfMonth = 0;
        for (int i = 0; i < humanArrayListClient.size(); i++) {
            for (int j = 0; j < humanArrayListClient.get(i).getDates().size(); j++) {
                if (humanArrayListClient.get(i).getDates().get(j).getMonth().getValue() == month && humanArrayListClient.get(i).getDates().get(j).getYear() == year) {
                    countDateProfit += 1;
                }
            }
            profitOfMonth = countDateProfit * humanArrayListClient.get(i).getPrice() * countDateProfit * 0.5;
        }

        System.out.println("Lợi nhuận của tháng " + month + "/" + year + " là : " + profitOfMonth);

    }
public static void sortHumanWithSalary (){
        ArrayList<Human> newHumanArrayList = humanArrayListClient;
        newHumanArrayList.sort(((o1, o2) -> (int) (o1.getPrice()- o2.getPrice())));
    display(newHumanArrayList);
}

    public static void showMenu() {
        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm Pilot ");
            System.out.println("3. Thêm SGBB");
            System.out.println("4. Sửa thông tin hàng theo Id ");
            System.out.println("5. Xóa hàng theo Id");
            System.out.println("6. Book lịch");
            System.out.println("7. Hiển thị lương phải trả theo tháng,năm của nhân viên bằng Id");
            System.out.println("8. Hiển thị lợi nhuận");
            System.out.println("9. Sắp xếp nhân viên theo giá tăng dần");
            System.out.println("0. Exit!");
            System.out.println("Nhập lựa chọn: ");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    HumanManager.displayHuman();
                    break;
                case 2:
                    addNewPilot();
                    break;
                case 3:
                    addNewSugarBaby();
                    break;
                case 4:
                    editHumanById();
                    break;
                case 5:
                    deleteHuman();
                    break;
                case 6:
                    enterCustomerBook();
                    break;
                case 7:
                    displaySalaryById();
                    break;
                case 8 :
                    displayProfit();
                    break;
                case 9 :
                    sortHumanWithSalary();
                    break;
                case 0:
                    exitSystem();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
            }
        }
    }
}
