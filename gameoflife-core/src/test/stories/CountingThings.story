scenario 'Adding two integers', {
    given 'two integer values of 1 and 2', {
        a = 1
        b = 2
    }
    when 'we calculate the sum of the two values', {
        sum = a + b
    }
<<<<<<< HEAD
    then 'the sum should be 3',  {
=======
    then 'the sum should be 3', {
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        sum.shouldBe 3
    }
}