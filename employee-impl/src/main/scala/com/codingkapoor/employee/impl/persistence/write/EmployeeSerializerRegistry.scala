package com.codingkapoor.employee.impl.persistence.write

import com.lightbend.lagom.scaladsl.playjson.{JsonSerializer, JsonSerializerRegistry}

import scala.collection.immutable.Seq

object EmployeeSerializerRegistry extends JsonSerializerRegistry {
  override def serializers: Seq[JsonSerializer[_]] = Seq(
    JsonSerializer[EmployeeState],
    JsonSerializer[AddEmployee],
    JsonSerializer[EmployeeAdded],
    JsonSerializer[UpdateEmployee],
    JsonSerializer[EmployeeUpdated],
    JsonSerializer[TerminateEmployee],
    JsonSerializer[EmployeeTerminated],
    JsonSerializer[DeleteEmployee],
    JsonSerializer[EmployeeDeleted],
    JsonSerializer[CreateIntimation],
    JsonSerializer[IntimationCreated],
    JsonSerializer[UpdateIntimation],
    JsonSerializer[IntimationUpdated],
    JsonSerializer[CancelIntimation],
    JsonSerializer[IntimationCancelled],
    JsonSerializer[LastLeavesSaved]
  )
}
