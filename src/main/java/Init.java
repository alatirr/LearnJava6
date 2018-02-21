import java.util.ArrayList;

public class Init {
    public static void main(String []args){

        UploadFile uploadFile = new UploadFile();
        String st = uploadFile.getFileString("file.txt");
        TreatmentStrig treatmentString = new TreatmentStrig();
        ArrayList<String> stList = treatmentString.StringToWord(st);
        ArrayList<String> stList2 =treatmentString.sortABC(stList);
        treatmentString.findMaxWordAndCount(stList2);
    }
}
