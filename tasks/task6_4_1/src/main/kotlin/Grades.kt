// Task 6.4.1: functions for handling exam grades
// distinction failed bc range 71..100
// changed to 70..100

fun grade(mark: Int) = when (mark) {
    in 70..100 -> "Distinction"
    in 40..69  -> "Pass"
    in 0..39   -> "Fail"
    else       -> "?"
}

fun displayGrades(marks: Map<String,Int>) {
    if (marks.isEmpty()) {
        println("No marks available")
    }
    else {
        for ((name, mark) in marks) {
            println("$name: ${grade(mark)}")
        }
    }
}
