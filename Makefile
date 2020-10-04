CLASSPATH = .:./Pokemon.jar
JAVAC = javac
JAVA = java

FILES_JAVA = $(shell find . -type f -name '*.java')
FILES_CLASS = $(FILES_JAVA:%.java=%.class)

all: $(FILES_CLASS)

run: all
	$(JAVA) -classpath $(CLASSPATH) Main

%.class: %.java
	$(JAVAC) -classpath $(CLASSPATH) $<

