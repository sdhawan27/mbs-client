package com.catalystone.msbclient.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ShowTimings {

    private Long id;

    private String movieId;

    private String theaterid;

    private Integer noOfTickets;

    private Date showTime;
}
