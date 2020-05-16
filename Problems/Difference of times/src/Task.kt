import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val startHours = scanner.nextInt()
    val startMinutes = scanner.nextInt()
    val startSeconds = scanner.nextInt()
    
    val endHours = scanner.nextInt()
    val endMinutes = scanner.nextInt()
    val endSeconds = scanner.nextInt()
    
    println((endHours - startHours) * 3600 + (endMinutes - startMinutes) * 60 + (endSeconds - startSeconds))
}
