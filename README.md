# Experimental groovy
[Apache Groovy](https://github.com/apache/groovy) with Proof of Concept of some new features

### Features:
- [single-expression methods](experiments/single-expr-methods.md)
- compile static with `FileSystemCompiler (groovyc)` by default
- `-cs`, `-cd`, `-tc` arguments
- ... and more in future



### Build from source:

**Distribution**:
```shell
./gradlew dist
```

**Only groovy core**:
```shell
./gradlew :jarjar
```

**Run**:
```shell
java -jar target/libs/groovy-3.0.0-*-EXPERIMENTAL.jar
```
