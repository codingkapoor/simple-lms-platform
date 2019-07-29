package com.codingkapoor.employee.persistence.write

import com.lightbend.lagom.scaladsl.playjson.{JsonSerializer, JsonSerializerRegistry}

import scala.collection.immutable.Seq

object EmployeeSerializerRegistry extends JsonSerializerRegistry {
  override def serializers: Seq[JsonSerializer[_]] = Seq(
    JsonSerializer[EmployeeState],
    JsonSerializer[AddEmployee],
    JsonSerializer[UpdateEmployee],
    JsonSerializer[EmployeeAdded],
    JsonSerializer[EmployeeUpdated]
  )
}