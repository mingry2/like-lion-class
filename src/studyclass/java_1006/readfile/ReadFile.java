package studyclass.java_1006.readfile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public void printFiles() {
        File dir = new File("./");
        // 디렉토리로 접근
        File files[] = dir.listFiles();
        // 파일 안에 뭐가 들었는지 확인가능
        System.out.println(files[0]);
        for(File file : files){
            System.out.println(file);
        }
    }

    public char readAChar(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);

        return (char)fileReader.read();
    }

    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public static void main(String[] args) throws IOException {
        // './' 현재 디렉토리에서 불러오기 (path 찾기가 제일 간단)
        // FileReader fileReader = new FileReader("./a_file.txt");
        // FileReader 읽어오는                         ㄴ 파일위치, 파일명
        // 파일이 없을 때 예외가 날수있기때문에 thows
        ReadFile readFile = new ReadFile();
        String c = readFile.read2Chars("a_file.txt");
        System.out.println(c);
/*
안녕
 */

    }

}
