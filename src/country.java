public class country {
    String name;
    double population;
    String country_code;
    public country(String county_code,String name,double population){
        this.country_code=county_code;
        this.name=name;
        this.population=population;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {return population; }

    public void setPopulation(double population) {this.population = population; }

    public String getCounty_code() {
        return country_code;
    }

    public void setCounty_code(String county_code) {
        this.country_code = county_code;
    }

}
