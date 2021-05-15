import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListCreator {
    public ListCreator(){}

    public List<city> ReadCity(String fileName){
        List<city> lst = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");

                city City =createCity(data);
                lst.add(City);

                line = br.readLine();
                if (line==null)
                {
                 br.close();
                 }

            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return lst;
    }
    public List<country> ReadCountry(String fileName){
        List<country> lst2 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");

                country Country =createCountry(data);
                lst2.add(Country);

                line = br.readLine();
                if (line==null)
                {
                    br.close();
                }

            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return lst2;
    }
    public city createCity(String[] metadata) {

        double code = Double.parseDouble(metadata[0]);
        String name = metadata[1];
        double population = Double.parseDouble(metadata[2]);
        String country_code=metadata[3];

        return new city(code, name, population, country_code);
    }
    public country createCountry(String[] metadata) {

        String country_code = metadata[0];
        String name = metadata[1];
        double population = Double.parseDouble(metadata[2]);

        return new country(country_code,name,population) ;
    }

}