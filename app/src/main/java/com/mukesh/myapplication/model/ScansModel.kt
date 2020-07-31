package com.mukesh.myapplication.model


class ScansModel(val itemsList: List<ScanItem>)

class ScanItem( val id: Int,  val name: String,  val tag: String,  val color: String,  val criteria: List<ScanCriteria>)

class ScanCriteria( val type: String,  val text: String,  val variable: Map<String, CriteriaValue>)

class CriteriaValue(
     val type: String,
     val study_type: String,
     val parameter_name: String,
     val min_value: Int,
     val max_value: Int,
     val default_value: Int,
     val values: List<Int>
)