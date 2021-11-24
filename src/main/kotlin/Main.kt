

 fun main(args: Array<String>) {

     //Create array
     val favMovies = arrayListOf<String>()

     //variable to count loop
     var time = 0

     //Create while loop to ake user enter three movies
     while (true) {

         print("Enter your three favorite movies ${time + 1} : ")
         favMovies.add(readLine()!!.toString())
         time++

         // if user user want add more movies have the choice
         if (time >= 3) {

             print("Do you want to add more ?")
             val answer = readLine()!!.toString()

             // if they don't want to add more movies,break project
             if (answer == "N" || answer == "n") {

                 print("Your favorite movies are :")
                 print(favMovies)
                 break
             }
         }
     }

 }