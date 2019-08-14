# Single-Expression Methods

### You can't use:
- `if` statement
- `for` loop statement
- `return`

### You can use:
- `switch`
- `try catch`
- lambda
- any one-line expression

```groovy
def sum(a, b) = a + b
```

```groovy
def oddOnly(List<Number> numbers) = numbers.stream()
                                          .filter(n -> n % 2 != 0)
```

```groovy
enum Status {
	OK, NOT_FOUND, CREATED
}

def code(Status s) = switch(s) {
	case OK: return 200
	case NOT_FOUND: return 404
	case CREATED: return 201
	default: 0
}
```
