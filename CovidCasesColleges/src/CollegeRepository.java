import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CollegeRepository {
    private CollegeData[] colleges;

    public CollegeData[] getColleges() {
        return colleges;
    }

    public CollegeRepository(CollegeData[] colleges) {
        this.colleges = colleges;
    }

    public CollegeRepository(String csvPath) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(csvPath));
        reader.readLine();

        String line;
        int lineCount= 0;

        while( (line = reader.readLine()) != null ){
                if (line.length() > 0){
                    lineCount++;
                    CollegeParser parser = new CollegeParser(line);
                }
               // String[] lines = (String[]) reader.lines().toArray();

           colleges = new CollegeData[lineCount];
           // CollegeParser parser = new CollegeParser(lines);
            /*this.colleges = parser.getDataSetParsed();*/
        }
       /* String lines[] = (String[]) reader.lines().toArray();
        CollegeParser parser = new CollegeParser(lines);*/
        //this.colleges = parser.getDataSetParsed();
    }
}
