import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


class CovidData {


    public static void main(String[] args) throws IOException, ParseException {

        String filePath = "C:\\Users\\RMWar\\IdeaProjects\\CovidCasesColleges\\src\\colleges1.csv";

        CollegeRepository repo = new CollegeRepository(filePath);

       // System.out.println(repo.getColleges());


        }
    }



    /**
     * Use wrapper classes instead of primitive types for parsed fields - setting to a default value would throw off
     * any aggregations I did on that column if there is a failure to parse
     */