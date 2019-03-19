JFLAGS = -g 
JC = javac 
.SUFFIXES: .java .class 
.java.class: 
	$(JC) $(JFLAGS) $*.java 

CLASSES = art/Askisi3.java art/artifacts.java art/con.java art/masterpiece.java art/mate.java art/move.java art/paintings.java art/sculptures.java art/techn.java 

default: classes 

classes: $(CLASSES:.java=.class) 

run1:
	java art/Askisi3 10 impressionism good

run2:
	java art/Askisi3 20 impressionism good

clean: 
	$(RM) $(CLASSES:.java=.class)
