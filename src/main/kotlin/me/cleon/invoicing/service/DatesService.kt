package me.cleon.invoicing.service

import java.text.SimpleDateFormat
import java.util.*


class DatesService

fun getDaysInCurrentMonth(): MutableList<Date>{
    val workDays: MutableList<Date> = ArrayList()

    val cal = Calendar.getInstance()
    cal[Calendar.DAY_OF_MONTH] = 1
    val month = cal[Calendar.MONTH]
    do {
        val dayOfWeek = cal[Calendar.DAY_OF_WEEK]
        if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) workDays.add(cal.time)
        cal.add(Calendar.DAY_OF_MONTH, 1)
    } while (cal[Calendar.MONTH] == month)

    val fmt = SimpleDateFormat("EEE M/d/yyyy")
    for (date in workDays) println(fmt.format(date))
    return workDays
}