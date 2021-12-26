package com.udacity.timeszones.client;

import com.udacity.timezones.client.WorldTimeApiClient;

import java.util.List;

public class FakeWorldTimeApiClient implements WorldTimeApiClient {

    private List<String> validTimeZones;
    public FakeWorldTimeApiClient(List<String> validTimeZones) {
        this.validTimeZones = validTimeZones;
    }

    @Override
    public List<String> getValidTimeZones(String area) {
        return validTimeZones;
    }
}