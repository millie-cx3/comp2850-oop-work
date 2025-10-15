// Task 9.6: application to compute dataset variance
import java.io.FileNotFoundException
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    try {
        require(args.isNotEmpty()) { "Must give file name as command line argument" }

        val file = args[0]
        val data = readData(file)

        require(data.isNotEmpty()) { "Error: $file is empty" }
        require(data.size > 1) { "Error: $file contains only one value"}

        val fileVar = variance(data)
        println("Size of dataset: ${data.size}")
        println("Variance of dataset: %.2f".format(fileVar))   
    }

    catch (e: FileNotFoundException) {
        println("Error: file not found")
        exitProcess(1)
    }

    catch (e: NumberFormatException) {
        println("Error: file should only contain numbers")
        exitProcess(1)
    }

    catch (e: IllegalArgumentException) {
        println("${e.message}")
        exitProcess(1)
    }

    catch (e: Exception) {
        println("Some error occurred")
        exitProcess(1)
    }

}