import java.util.stream.Collectors

def sum(a, b) = a + b
assert sum(1, 2) == 3


def oddOnly(List<Number> nums) = nums.stream().filter(n -> n % 2 != 0).collect(Collectors.toList())
assert oddOnly([1, 2, 3, 4, 5]) == [1, 3, 5]


def buildUrl(method) = "https://api.teslex.tech/$method"
assert buildUrl("restart") == "https://api.teslex.tech/restart"

interface Executable {
	default execute() = println "executing"
}

new Executable(){}.execute()
