package com.baeldung.springsoap;

import com.baeldung.springsoap.gen.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";
    private static final Logger logger = LoggerFactory.getLogger(CountryEndpoint.class);
    private CountryRepository countryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
    	logger.debug("CountryEndpoint : getCountry : start");
    	long start = System.currentTimeMillis();
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));
        try
        {
          Thread.sleep(1000);   
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.debug("CountryEndpoint : getCountry : end");
        logger.debug("CountryEndpoint : getCountry : Time Taken : "+ (end - start));
        return response;
    }
    
    //1.
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequestA")
    @ResponsePayload
    public GetCountryResponseA getCountryA(@RequestPayload GetCountryRequestA request) {
      	logger.debug("CountryEndpoint : getCountryA : start");
    	long start = System.currentTimeMillis();
    	GetCountryResponseA response = new GetCountryResponseA();
        Country a = new Country();
        a.setName("Australia");
        a.setCapital("Canberra");
        a.setCurrency(Currency.GBP);
        a.setPopulation(1234567);
        response.setCountry(a);
        try
        {
          Thread.sleep(500);   
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.debug("CountryEndpoint : getCountryA : end");
        logger.debug("CountryEndpoint : getCountryA : Time Taken : "+ (end - start));
        return response;
    }
    //2.
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequestB")
    @ResponsePayload
    public GetCountryResponseB getCountryB(@RequestPayload GetCountryRequestB request) {
    	logger.debug("CountryEndpoint : getCountryB : start");
    	long start = System.currentTimeMillis();
        GetCountryResponseB response = new GetCountryResponseB();
        Country b = new Country();
        b.setName("Belgium");
        b.setCapital("Brussels");
        b.setCurrency(Currency.GBP);
        b.setPopulation(2134567);
        response.setCountry(b);
        try
        {
        	Thread.sleep(1500);   
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.debug("CountryEndpoint : getCountryB : end");
        logger.debug("CountryEndpoint : getCountryB : Time Taken : "+ (end - start));
        return response;
    }
    //3.
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequestC")
    @ResponsePayload
    public GetCountryResponseC getCountryC(@RequestPayload GetCountryRequestC request) {
    	logger.debug("CountryEndpoint : getCountryC : start");
    	long start = System.currentTimeMillis();
        GetCountryResponseC response = new GetCountryResponseC();
        Country c = new Country();
        c.setName("Cambodia");
        c.setCapital("Phnom Penh");
        c.setCurrency(Currency.GBP);
        c.setPopulation(3124567);
        response.setCountry(c);
        try
        {
        	Thread.sleep(2000);   
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.debug("CountryEndpoint : getCountryC : end");
        logger.debug("CountryEndpoint : getCountryC : Time Taken : "+ (end - start));
        return response;
    }
    //4.
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequestD")
    @ResponsePayload
    public GetCountryResponseD getCountryD(@RequestPayload GetCountryRequestD request) {
    	logger.debug("CountryEndpoint : getCountryD : start");
    	long start = System.currentTimeMillis();
        GetCountryResponseD response = new GetCountryResponseD();
        Country d = new Country();
        d.setName("Denmark");
        d.setCapital("Copenhagen");
        d.setCurrency(Currency.GBP);
        d.setPopulation(4123567);
        response.setCountry(d);
        try
        {
        	Thread.sleep(1000);   
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.debug("CountryEndpoint : getCountryD : end");
        logger.debug("CountryEndpoint : getCountryD : Time Taken : "+ (end - start));
        return response;
    }
}
