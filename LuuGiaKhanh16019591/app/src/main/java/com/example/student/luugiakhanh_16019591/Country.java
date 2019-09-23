package com.example.student.luugiakhanh_16019591;

public class Country {
    private String countryName;


    private String flimName;
    private int population;

    public Country( String flimName,String countryName, int population) {

        this.flimName= flimName;
        this.countryName= countryName;
        this.population= population;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFlimName() {
        return flimName;
    }

    public void setFlagName(String flimName) {
        this.flimName = flimName;
    }

    @Override
    public String toString()  {
        return this.flimName + this.countryName+" (Population: "+ this.population+")";
    }
}
