package dev.test

import io.quarkus.scheduler.Scheduled
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class TaskProcessor() {

    @Scheduled(cron = "0 0/5 * * * ?")
    fun test() {
        val value = org.tempuri.Divide()
        println("Created $value")
    }
}