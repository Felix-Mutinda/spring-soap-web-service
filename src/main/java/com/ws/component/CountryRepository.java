package com.ws.component;

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
        Country spain = new Country();
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setName("Spain");
        spain.setPopulation(4599889);

        countries.put("Spain", spain);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
