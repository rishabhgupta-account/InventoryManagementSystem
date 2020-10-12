package com.inventory.controller;

import com.inventory.entity.Pricing;
import com.inventory.entity.TheLogConverter;
import com.inventory.service.PricingLogService;
import com.inventory.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by Rishabh Gupta on 10/12/2020.
 */

/**
 * Because of the Business entity confliction we have to consider that pricing
 * happens on each product wise and not generalized for entities.
 */

@RestController
@RequestMapping("/categories/{id}/products/{id}/pricings")
public class PricingController {


    @Autowired
    public PricingService pricingService;
    @Autowired
    private PricingLogService pricingLogService;

    @RequestMapping("")
    public Iterable<Pricing> getAllPricing() {
        return pricingService.findAll();
    }


    @RequestMapping("/{id}")
    public Optional<Pricing> searchPricing(@PathVariable int id) {
        return pricingService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addPricing(@RequestBody Pricing pricing) {
        pricingService.insert(pricing);
        pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Pricing pricing) {
        pricingService.updatePricing(pricing);
        pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deletePricing(@RequestBody Pricing pricing) {
        pricingService.deletePricing(pricing);
        pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
    }


}

