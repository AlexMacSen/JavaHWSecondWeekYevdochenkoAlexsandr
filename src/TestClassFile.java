import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

/**
 * Created by user on 08.02.2017.
 */
public class TestClassFile {

    public String readLine() {
        // считываем данные с консоли в поток, а затем в буфер
        String line = "";

        try {
            InputStream in = System.in;
            InputStreamReader charsInFile = new InputStreamReader(in, "UTF-8");
            BufferedReader bufferedharsInFile = new BufferedReader(charsInFile);
            System.out.println("Input Line:");
            line = bufferedharsInFile.readLine();

        } catch (IOException e) {
            e.printStackTrace();

        }
        return line;
    }

    public String createDirFile() {
        String pathDir = "C://TestDir";
        String pathFile = "C://TestDir//TestFile.txt";
        // проверяем существует ли директория и файл по указанномму пути, если нет то создаем их
        File dir = new File(pathDir);
        File file = new File(pathFile);
        try {
            if (!dir.exists()) {
                dir.mkdir();
                System.out.println("Каталог успешно создан");
                if (!file.exists()) {
                    file.createNewFile();
                    System.out.println("Файл успешо создан");

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pathFile;
    }

    public static void main(String[] args) throws IOException {
        TestClassFile testClassFile = new TestClassFile();
        FileWriter filewriter = new FileWriter(testClassFile.createDirFile(), false);
        BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
        bufferedWriter.write(testClassFile.readLine());
        bufferedWriter.flush();
        bufferedWriter.close();
        FileReader fileReader = new FileReader(testClassFile.createDirFile());
        BufferedReader bufferedharsInCon = new BufferedReader(fileReader);
        System.out.println("Output Line:" + "\n" + bufferedharsInCon.readLine());

    }
}
