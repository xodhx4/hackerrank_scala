class Student(Person):
    #   Class Constructor
    #   
    #   Parameters:
    #   firstName - A string denoting the Person's first name.
    #   lastName - A string denoting the Person's last name.
    #   id - An integer denoting the Person's ID number.
    #   scores - An array of integers denoting the Person's test scores.
    #
    # Write your constructor here
    def __init__(self, firstName, lastName, idNumber, socres):
        Person.__init__(self, firstName, lastName, idNumber)
        self.scores = scores
    def calculate(self):
        mean = sum(self.scores) / len(self.scores)
        if mean >= 90:
            return "O"
        elif mean >= 80:
            return "E"
        elif mean >= 70:
            return "A"
        elif mean >= 55:
            return "P"
        elif mean >= 40:
            return "D"
        else:
            return "T"
        

    #   Function Name: calculate
    #   Return: A character denoting the grade.
    #
    # Write your function here
    