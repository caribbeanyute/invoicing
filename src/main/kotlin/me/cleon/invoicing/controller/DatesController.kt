package me.cleon.invoicing.controller

import me.cleon.invoicing.service.getDaysInCurrentMonth
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class DatesController {

        @GetMapping(
            value = ["/getdates"],
        )
        fun postBody(): MutableList<Date> {
            return getDaysInCurrentMonth()

        }

}