package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatics {

    public List<PopulationMove> readByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(filename));

        String str = "";
        while((str = reader.readLine())!= null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return  pml;
    }

    public void creatAFile (String filename) {
        File file = new File(filename);

        try {
            file.createNewFile();
        } catch ( IOException e ) {
            throw new RuntimeException(e);
        }

    }

    public void write(List<String> strs, String filename) throws IOException {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
             writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 1. 키만들기
    // 2. 키를 이용하여 벨류값을 측정하고 벨류가 없으면 -1
    // 3. 베률 있으면 +1
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml){
               // key  value
        Map<String, Integer> moveCntMap = new HashMap<>();
        // ㄴ 새로운 정보를 넣을 map을 하나 만들어둔다

        for(PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key, 1);
            }else {
                moveCntMap.put(key, moveCntMap.get(key) + 1);
            }
        } return moveCntMap;
    }

    public PopulationMove parse(String data) {
                        // ㄴPopulationMove 리턴타입
        String[] sidoData = data.split("\\,");

        return new PopulationMove(sidoData[0], sidoData[1]);
    }



    public static void main(String[] args) throws IOException {
        String address = "from_to2.txt";
        PopulationStatics ps = new PopulationStatics();
//      ps.readByLine(address);

        // ps.creatAFile("from_to2.txt");

        List<PopulationMove> pml = ps.readByLine(address);
//        List<String> strings = new ArrayList<>();
//
//        for (PopulationMove pm : pml) {
//        System.out.printf("전입 : %s 전출 : %s\n", pm.getFromSido(), pm.getToSido());
//          String fromTo = pm.getFromSido() + "," + pm.getToSido() + "\n";
//          strings.add(fromTo);
//        }
//        ps.write(strings, "from_to2.txt");

        Map<String, Integer> map = ps.getMoveCntMap(pml);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String s = String.format("key : %s value : %d\n", key, map.get(key));
            cntResult.add(s);
        }
//        ps.creatAFile("fromto_sido_cnt.txt");

        ps.write(cntResult, "fromto_sido_cnt.txt");
    }

}
