public class CollegeParser {
    private String dataSet;

    public CollegeParser(String dataSet) {
        String[] dataSet = getDataSetParsed()
        this.dataSet = dataSet;
    }

    public CollegeData[] getDataSetParsed() {
       // CollegeData parsedData []  = new CollegeData[dataSet.length];
        // convert list of strings to list of object
        for(int i =0; i < parsedData.length; i++) {
            parsedData[i] = parseRow(dataSet[i]);
        }
        return parsedData;
        return CollegeData[];
    }

    private CollegeData parseRow(String row) {

        String[] data = row.split(",", -1);

        CollegeData College = new CollegeData();
        String date = data[0];

        College.setDate(date);

        String state = data[1];
        College.setState(state);

        String county = data[2];
        College.setCounty(county);


        String city = data[3];
        College.setCity(city);


        String ipeds_id = data[4];
        College.setIpeds_id(ipeds_id);


        String college = data[5];
        College.setCollege(college);


        String cases = data[6];
        College.setTotalCases(cases);


        String cases2021;
        if(data[7].equals("")){
            cases2021 = null;
        } else{
            cases2021 = data[7];
        }


        String notes;
        if (data[8].equals("")) {
            notes = "";
        }else {
            notes = data[8];
        }

        College.setNotes(notes);


        College.setCases2021(cases2021);

        return College;
    }
}
