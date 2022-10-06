package studyclass.java_1006.readfile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        // './' 현재 디렉토리에서 불러오기 (path 찾기가 제일 간단)
        // FileReader fileReader = new FileReader("./a_file.txt");
        // FileReader 읽어오는                             ㄴ 파일위치, 파일명
        // 파일이 없을 때 예외가 날수있기때문에 thows
        File dir = new File("./");
        // 디렉토리로 접근
        File files[] = dir.listFiles();
        // 파일 안에 뭐가 들었는지 확인가능
        System.out.println(files[0]);
        for(File file : files){
            System.out.println(file);
        }
/*
"C:\Program Files\Java\jdk1.8.0_341\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=61217:D:\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_341\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_341\jre\lib\rt.jar;D:\workspace\git\likelionstudy01\out\production\likelionstudy01" studyclass.java_1006.readfile.ReadFile
.\.git
.\.git
.\.idea
.\a_file.txt
.\likelionstudy01.iml
.\out
.\README.md
.\src

Process finished with exit code 0

*/
    }

}
