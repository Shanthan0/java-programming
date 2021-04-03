Implement a class called Tool. It should have an int field called strength and a char field called type. The Tool class should also contain the function void setStrength(int), which sets the strength for the Tool. Create 3 more classes called Rock, Paper, and Scissors, which inherit from Tool. Each of these classes will need a constructor which will take in an int that is used to initialize the strength field. The constructor should also initialize the type field using 'r' for Rock, 'p' for Paper, and 's' for Scissors. These classes will also need a public function bool fight (Tool) that compares their strengths in the following way: 

a. Rock's strength is doubled (temporarily) when fighting scissors, but halved (temporarily) when fighting paper.  

b. In the same way, paper has the advantage against rock, and scissors against paper.  

c. The strength field shouldn't change in the function, which returns true if the original class wins in strength and false otherwise. Write the code without changing the following main function code:
