LATEX = xelatex -interaction=nonstopmode -file-line-error
BIBTEX = bibtex
MAIN = thesis

.PHONY: all pdf clean distclean rebuild

all: pdf

pdf: $(MAIN).pdf

$(MAIN).pdf: $(MAIN).tex $(MAIN).bib $(wildcard chapters/*.tex) njuthesis.cls njuthesis.cfg gbt7714-2005.bst
	$(LATEX) $(MAIN).tex
	$(BIBTEX) $(MAIN)
	$(LATEX) $(MAIN).tex
	$(LATEX) $(MAIN).tex

clean:
	rm -f $(MAIN).aux $(MAIN).log $(MAIN).out $(MAIN).toc $(MAIN).lof $(MAIN).lot
	rm -f $(MAIN).bbl $(MAIN).blg $(MAIN).fls $(MAIN).fdb_latexmk $(MAIN).xdv
	rm -f $(MAIN).synctex.gz $(MAIN).nav $(MAIN).snm $(MAIN).vrb
	rm -f chapters/*.aux

distclean: clean
	rm -f $(MAIN).pdf

rebuild: clean pdf
