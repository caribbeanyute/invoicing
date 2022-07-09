package me.cleon.invoicing.service

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class ZohoClient {
    @Autowired
    lateinit var restTemplate: RestTemplate

    val logger: org.slf4j.Logger? = LoggerFactory.getLogger(this.javaClass)

    fun getOAUTHToken(clientId: String, clientSecret: String, code: String): String {

    }

}
