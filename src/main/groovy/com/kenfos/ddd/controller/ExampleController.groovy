package com.kenfos.ddd.controller

import com.kenfos.ddd.domain.Client

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController {

    @RequestMapping('/')
    boolean index() {
        client.dependency
    }

    private getClient() {
      Client client = new Client()
      client
    }
}
