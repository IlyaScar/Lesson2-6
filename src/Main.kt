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
    //Тут надо испольозвать функции filter и foreach
    //а зачем for each?
    val moreFifty = prices.filter { it > 50 }
    println(moreFifty)

     //task 2
      val users = listOf("alice", "bob", "charlie", "david", "eve")
        //Вид к которому ты приводшь первое имя отличается от того что в задании, + приводить надо все имена, а не первое
        val upper = users.map { (it.uppercase())
        }
          //Узнали про циклы и забываем их использовать в коллекциях,там все готовые методы есть из коробки, про которые я рассказывал, тут нужно использовать find
         val longName = users.find { it.length > 4 }
         val groupByName = users.groupBy { it.length }

    //task 3
    val apiResponse = mapOf(
        "data" to listOf(
            mapOf("id" to 1, "status" to "active"),
            mapOf("id" to 2, "status" to "inactive"),
            mapOf("id" to 3, "status" to "active")
        ),
        "total" to 3
    )

   //Вывод проверял тут? У меняне выводит ни количество активных пользователей, не их самих
    //поправил, но не могу понять у меня синтаксиси не правильный или я что то не так делаю
    // я не прошу тут ответ расписывать, просто небольшую подсказку или голосом можно если долго писать
    //сначала необходимо получить значение по ключу "data" из мапы, потом скастить это значение к листу мап, дальше в этом листе найти количество с помощью метода count{}
    val results = apiResponse.values
    val activeUsers = results.filter{ it["status"] == "active" }
    val countActive = activeUsers.size
    println(activeUsers)
    println(countActive)
}
