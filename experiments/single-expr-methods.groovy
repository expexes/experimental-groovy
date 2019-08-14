import java.util.stream.Collectors

def sum(int a, int b) = a + b
assert sum(1, 2) == 3


def oddOnly(List<Integer> nums) = nums.stream().filter(n -> n % 2 != 0).collect(Collectors.toList())
assert oddOnly([1, 2, 3, 4, 5]) == [1, 3, 5]


def buildUrl(String method) = "https://api.teslex.tech/$method"
assert buildUrl("restart") == "https://api.teslex.tech/restart"

interface Executable {
	default execute() = println "executing"
}

new Executable(){}.execute()

def except(Closure cl) = try () {
	cl()
	return true
} catch (Exception e) {
	return false
}

assert except {
	throw new RuntimeException("false")
}
