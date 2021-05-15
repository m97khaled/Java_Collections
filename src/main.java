import java.util.*;

public class main {
    public static void main(String[] args)
    {
        ListCreator creator = new ListCreator();
        List<city> cities= creator.ReadCity("cities.csv");
        List<country> countries= creator.ReadCountry("Countries.txt");

        Hashtable<String, List<city>> my_dict = new Hashtable<String, List<city>>();
        for(int i=0;i<countries.size();i++){
            String country=countries.get(i).getCounty_code();
            List<city> citiesList= new ArrayList<>();
            List<Double> pop= new ArrayList<>();

            for(int j=0;j<cities.size();j++) {
                String Cit=cities.get(j).getCountry_code().replaceAll(" ","");
                if(country.equals(Cit)){
                    citiesList.add(cities.get(j));
                }

            }
            sortList(citiesList,"asc");
            my_dict.put(country,citiesList);



        }
        my_dict.forEach((country,citiesList) -> {
            System.out.print("Country code: " +country +"=");
            citiesList.forEach(city -> {
                System.out.print(city.getName() + "," + city.getPopulation() + " ,");

            });
            System.out.print("\b\n");


        });

    }
    public static void sortList(List<city> citiesList, String rule){
        citiesList.sort(Comparator.comparing(city::getPopulation));
        if(rule=="desc"){
            Collections.reverse(citiesList);
        }

    }

}
