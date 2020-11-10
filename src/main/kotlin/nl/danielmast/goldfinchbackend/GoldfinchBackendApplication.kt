package nl.danielmast.goldfinchbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GoldfinchBackendApplication

fun main(args: Array<String>) {
    runApplication<GoldfinchBackendApplication>(*args)
}
