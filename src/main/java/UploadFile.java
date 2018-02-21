import java.io.*;

public class UploadFile {
        public String getFileString(String puthFile){
            String everything = "";
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(puthFile).getFile());
            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                everything = sb.toString();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return everything;
        }


}
