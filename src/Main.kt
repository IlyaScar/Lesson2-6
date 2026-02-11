import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //task 1
    val prices = listOf(99.99,25.50,75.00)
      val max = prices.min()
      println(max)
      val min = prices.max()
      println(min)
      val averagePrice = prices.average()
      println(averagePrice)
      for (prices in prices) {
          if (prices > 50) {

              println(prices)
          }

      }

     //task 2
      val users = listOf("alice", "bob", "charlie", "david", "eve")
          val upper = users[0].uppercase()
          println(upper)
          for (users in users) {
              if (users.length > 4) {

                  println(users[0])
              }

          }
          val sort = users.sortedBy { it.length }
          println(sort)

    //task 3
    val apiResponse = mapOf(
        "data" to listOf(
            mapOf("id" to 1, "status" to "active"),
            mapOf("id" to 2, "status" to "inactive"),
            mapOf("id" to 3, "status" to "active")

        ),
        "total" to 3
    )

   // val results = apiResponse.values
   // println(results)
    val results2 = apiResponse.filterValues { apiResponse.contains("active") }
    println(results2)







}