
##
## EPITECH PROJECT, 2020
## makefile exe
## File description:
## fct
##

PACKAGE = 108/src/re/fazan/trigo

SRC = $(PACKAGE)/Main.java		\

CLASSDIR = class

METAINF = META-INF/MANIFEST.MF

JARNAME	= 108trigo.jar 

EXENAME	= exec.sh

NAME = 108trigo

all: buildjar $(NAME)

buildjar:
	mkdir $(CLASSDIR)
	javac -d $(CLASSDIR) $(SRC)
	jar cfm $(JARNAME) $(METAINF) -C $(CLASSDIR) re

$(NAME):
	cp $(EXENAME) $(NAME)
	chmod +x $(NAME)

clean:
	rm -rf $(CLASSDIR)
	rm -f $(JARNAME)

fclean: clean
	rm -f $(NAME)

re:	fclean all
