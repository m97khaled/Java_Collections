public class city {
    double code;
    String name;
    double population;
    String country_code;
    public city(double code,String name,double population,String country_code ){
        this.code=code;
        this.name=name;
        this.population=population;
        this.country_code=country_code;
    }
    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

}
