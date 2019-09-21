package com.codingkapoor.employee.api.model

import java.time.LocalDate

import play.api.libs.json.{Format, Json}

case class Employee(id: String, name: String, gender: String, doj: LocalDate, pfn: String, isActive: Boolean = true, leaves: Leaves = Leaves())

object Employee {
  implicit val format: Format[Employee] = Json.using[Json.WithDefaultValues].format[Employee]
}
