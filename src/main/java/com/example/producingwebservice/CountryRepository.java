package com.example.producingwebservice;

import com.baeldung.springsoap.gen.Country;
import com.baeldung.springsoap.gen.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map

        Country spain = new Country();
        spain.setName("Spain");
        spain.setPopulation(1111);
        spain.setCapital("Colombo");
        spain.setCurrency(Currency.EUR);

        Country lanka = new Country();
        lanka.setName("Lanka");
        lanka.setPopulation(1111);
        lanka.setCapital("Colombo");
        lanka.setCurrency(Currency.GBP);


        Country india = new Country();
        india.setName("India");
        india.setPopulation(1111);
        india.setCapital("Colombo");
        india.setCurrency(Currency.EUR);

        countries.put(spain.getName(), spain);
        countries.put(lanka.getName(), lanka);
        countries.put(india.getName(), india);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
