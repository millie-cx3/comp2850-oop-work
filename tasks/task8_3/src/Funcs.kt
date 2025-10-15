// Task 8.3: functions for temperature analysis

typealias Record = Pair<String,Double>

fun fetchData(): List<Record> {
  // Create and return a simulated dataset here
  // Use the listOf() and to() functions to create the dataset

  return listOf(
    "Monday" to 14.5,
    "Tuesday" to 15.6,
    "Wednesday" to 16.2,
    "Thursday" to 13.2,
    "Friday" to 17.1,
    "Saturday" to 20.5,
    "Sunday" to 18.3
  )
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
