package com.example.transcriberbackend

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<TransCriberBackendApplication>().with(TestcontainersConfiguration::class).run(*args)
}
