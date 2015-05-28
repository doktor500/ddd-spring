package com.kenfos.ddd.domain

import com.kenfos.ddd.components.Dependency

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Configurable

@Configurable
class Client {
  @Autowired private Dependency dependency
}