package com.catalystone.msbclient.client;

import com.catalystone.msbclient.domain.Theater;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class UserRestClient extends RestTemplate {

    private static final String MBS_URL ="http://localhost:8080/";

    public List<Theater> getTheaterList() {
        log.info("into rest client");
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

       // return (List<Theater>) this.exchange(MBS_URL + "getTheaters", HttpMethod.GET, entity , ResponseEntity.class);
    return this.getForObject(MBS_URL + "getTheaters", List.class);
    }



}
