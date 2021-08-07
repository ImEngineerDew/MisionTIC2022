package Euro;

public class EuroCountry
{
    protected String nameCountry;
    protected String languageCountry;
    protected Integer GDP;
    protected Integer population;
    protected Double HDI;

    public EuroCountry()
    {
        nameCountry = "Spain";
        languageCountry = "ES";
        GDP = 38600;
        population = 45600000;
        HDI = 0.861;
    }
    public EuroCountry(String nameCountry,String languageCountry,Integer GDP,Integer population, Double HDI)
    {
        this.nameCountry = nameCountry;
        this.languageCountry = languageCountry;
        this.GDP = GDP;
        this.population = population;
        this.HDI =  HDI;
    }

}
