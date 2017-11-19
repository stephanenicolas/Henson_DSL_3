This repo was created to try out ideas of how to write intent builders in Dart & Henson version 3. 
It takes into account that intent builders can be created accross multiple modules and can inherit each other. 
Then the goal for us is to create the intent builder of the subclasses by using the intent builders
of the super class so that we avoid re-processing the super class (processing would entail to discover the annotated fields again, 
all the way up in the hierarchy).

The main idea for now in this repo is to split intent builders into their required and optional parts. 
The required parts of the super class can be merged with the required part of the subclass using composition in most cases; 
whereas their optional parts are merged via inheritance.

A document in the assets folder explains the design and the various cases that we have to deal with.
