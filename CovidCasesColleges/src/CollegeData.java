import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CollegeData {

    private Date date;
    private String state;
    private String county;
    private String city;
    public String collegeName;
    private int ipeds_id;
    private int totalCases;
    private int cases2021;
    private String notes;

    public CollegeData() {

    }

    public CollegeData(String collegeName, String totalCases) {
        this.collegeName = collegeName;
        this.totalCases = Integer.parseInt(totalCases);
    }

    public Date setDate(String date) {

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dateParsed= null;
        try {
            dateParsed = formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.date = dateParsed;
        return dateParsed;
    }

    public Date getDate() {
        return date;
    }

    public String setState(String State) {
        this.state = State;
        return state;
    }

    public String getState() {
        return state;
    }

    public String setCollege(String CollegeName) {
        this.collegeName = CollegeName;
        return collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String setCounty(String County) {
        this.county = County;
        return county;
    }

    public String getCounty() {
        return county;
    }

    public String setCity(String City) {
        this.city = City;
        return city;
    }

    public String getCity() {
        return city;
    }

    public Integer setIpeds_id(String id) {
        int idParsed = Integer.parseInt(id);
        this.ipeds_id = idParsed;
        return ipeds_id;
    }

    public int getIpeds_id() {
        return ipeds_id;
    }

    public Integer setTotalCases(String TotalCases) {
        int cases = Integer.parseInt(TotalCases);
        this.totalCases = cases;
        return totalCases;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public Integer setCases2021(String cases2021) {
        if (cases2021 == null) return null;
        int cases = Integer.parseInt(cases2021);
        this.cases2021 = cases;
        return cases;
    }

    public int getCases2021() {
        return cases2021;
    }

    public String setNotes(String notes){
        this.notes = notes;
        return notes;
    }
    public String getNotes(){
        return notes;
    }
}

