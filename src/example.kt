fun boxAndUnBoxExample() {

    val a: Int = 10      // primitive
    val b: Int? = a     // BOXING → Integer(10)
    //Object se primitive nikalna
    val c: Int = b!!


    /* int a = 10;
     Integer b = Integer.valueOf(a); // boxing
     int c = b.intValue();*/


    var x: Int? = 5
    x = null
    // Primitive null nahi ho sakta


    val z: Int? = 10
    val y = z?.plus(5)

    /* x boxed Integer
      JVM unbox karega
      Add operation
      Result primitive   */

    //❌ Dangerous loop

    var sum: Int? = 0

    for (i in 1..1_000_000) {
        sum = sum!! + i   // boxing + unboxing EVERY iteration 😬
    }
    /* sum!! → unboxing

     + i → primitive add

     result → boxing again

     💣 1 million objects created*/

    //Right Answare
    var sums = 0

    for (i in 1..1_000_000) {
        sums += i
    }

    // ✅ Primitive array
    val arr = IntArray(1_000_000) { it }
    //  Raw ints
    //  No boxing
    //  Cache friendly

    /* ✅ DO

     Nullable Int avoid in loops

     Use IntArray, LongArray

     Use inline functions (reduce object creation)

     👉 Boxing = convenience cost
 👉 Unboxing = performance tax
     */


   /* Boxing

    Primitive value ko object me wrap karna

    Unboxing

    Object se primitive nikalna*/

   /*1) Kotlin me semicolon kyu nahi hota?
    Agar line change ho rahi hai, to Kotlin assume karta hai ki statement khatam:

    Rare cases me, jab same line me multiple statements likhne ho:
    val a = 10; val b = 20; println(a + b)*/

/*    9. Function references (::)

    fun printNum(n: Int) = println(n)

    list.forEach(::printNum)

    java

    list.forEach(this::printNum);*/

/*        ..........................................*/

/*    Java inline funcation kyu possible nhi hai

    Java compiler bahut kam optimization karta hai
    Optimization JVM (JIT) ka kaam hai

     Java language me compile-time inline ka concept hi nahi hai
    JVM JIT for runtime inlining,

    Java JIT lambda object creation remove nahi karta reliably*/

    /*if,when expression kevay km k return kre chhe.
    when multiple value,Range,condition based,type checking kri ske j switch no kri ske
    java  ma statement kevay kmk return krtu nhi*/

    /*Android Jetpack ek set of libraries hai jo Android app ko
    easy, clean, secure aur maintainable banata hai.*/

}