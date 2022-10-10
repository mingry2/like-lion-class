package studyclass.java_1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PopulationStatistics {
    // 한 글자씩
    void readByChar(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        // 파일을 읽지 않음.
        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    // BuffereadReader buffer를 사용하기 때문에 FileReader보다 좀 더 효율적으로 파일 읽기 가능
    // 파일을 한 줄씩 읽어서 리턴, 더 이상 읽을 내용이 없으면 null 리턴
    public List<PopulationMove> readByLine(String filePath) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String str;
        while ((str = reader.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();

        return pml;
    }

    public void readByLine2(String filePath) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filePath), StandardCharsets.UTF_8)){

            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        String[] splittedLine = data.split(",");

        return new PopulationMove(splittedLine[1], splittedLine[0]);
    }
    
    public void createFile(String filePath) {
        File file = new File(filePath);

        try {
            file.createNewFile();
        } catch (IOException e){
            throw  new RuntimeException();
        }
    }

    public void write(List<String> strs, String filePath){
        File file = new File(filePath);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String str : strs) {
                writer.write(str + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido();
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml){

        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "D:\\workspace\\2021_인구관련연간자료_20221007_58860.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine((filePath));


        Map<String, Integer> map = populationStatistics.getMoveCntMap(pml);
        String targetFilename = "each_sido_cnt.txt";
        populationStatistics.createFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String s = String.format("key:%s value:%d\n", key, map.get(key));
            cntResult.add(s);
           //System.out.println("key:%s value:%d\n", key, map.get(key));
        }
        populationStatistics.write(cntResult, targetFilename);

//        populationStatistics.createFile("from_to.text");
//
//        List<String> strList = new ArrayList<>();
//        populationStatistics.write(strList,"/from_to.txt");

//        for(PopulationMove pm : pml) {
//            System.out.printf("전입 : %s, 전출 : %s \n", pm.getFromSido(), pm.getToSido());
//        }
        //System.out.println(pml.size());
    }
}
