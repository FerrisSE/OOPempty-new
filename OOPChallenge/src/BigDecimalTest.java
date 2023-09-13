import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//code to push 
public class BigDecimalTest
{
static BigDecimal x = new BigDecimal ("1.0");
static BigDecimal y = new BigDecimal ("1.00");
//Fact: !x.equals (y), but x.compareTo (y) == 0
static Set <BigDecimal> BigDecimalTree = new TreeSet <BigDecimal> ();
public static void main(String[] args) {

	BigDecimalTree.add(x);

	BigDecimalTree.add (y);
// TreeSet uses compareTo(), so BigDecimalTree now has 1 element

Set <BigDecimal> BigDecimalHash = new HashSet <BigDecimal> ();

BigDecimalHash.add (x);
BigDecimalHash.add (y);

System.out.println ("BigDecimalTree = " + BigDecimalTree);
System.out.println ("BigDecimalHash = " + BigDecimalHash);

// HashSet uses equals(), so BigDecimalHash now has 2 elements
}
}
// Test: System.out.println ("BigDecimalTree = " + BigDecimalTree);
// System.out.println ("BigDecimalHash = " + BigDecimalHash);
// Expected: BigDecimalTree = 1; BigDecimalHash = 1
// See Java Doc for add() in Set Interface
// The problem is that in BigDecimal, equals() and compareTo()
// are inconsistent. Let’s suppose we decide that compareTo() is correct,
// and that equals()is faulty.
