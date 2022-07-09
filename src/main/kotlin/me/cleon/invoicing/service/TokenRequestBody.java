package me.cleon.invoicing.service;

public class TokenRequestBody {
    String client_id;
    String client_secret;
    String code;
    String grant_type;
    Long expiry_time;

}
