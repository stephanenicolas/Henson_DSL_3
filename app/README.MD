This repo was created to try out ideas of how to write intent builders in Dart & Henson version 3. 
It takes into account that intent builders can be created accross multiple modules and can inherit each other. 
Then the goal for us is to create the intent builder of the subclasses by using the intent builders
of the super class so that we avoid re-processing the super class (processing would entail to discover the annotated fields again, 
all the way up in the hierarchy).

The main idea for now in this repo is to split intent builders into their required and optional parts. 
The required parts of the super class can be merged with the required part of the subclass using composition in most cases; 
whereas their optional parts are merged via inheritance.

Hence, we have the following matrix of possible scenarios:

* both: both required parts and optional parts are present
* req: only the required part is present, no optional fields
* opt: only the optional part is present, no required field

If any position in this matrix returns a form of intent builder that follows 
the same pattern/form of intent builder than its parents, then this procedure is recursive. This form 
is to separate the required and optional parts, and re-using in a standard way the intent builder of the super class.

* `x` means the case works well
* `0` means the case works less well, still needs works
* ` ` means the case was not studied

|    |both|req|opt|
|----|----|---|---|
|both| x  | x |   |
| req| 0  | x |   |
| opt| x  | x |   |
