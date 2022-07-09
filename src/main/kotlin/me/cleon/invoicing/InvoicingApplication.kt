package me.cleon.invoicing

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InvoicingApplication

fun main(args: Array<String>) {
    runApplication<InvoicingApplication>(*args)
}
