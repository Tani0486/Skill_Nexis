"""Assignment 1: Student Class Implementation"""


class Student:
    """Represents a student with basic details and a method to display them."""

    def __init__(self, name, roll_no, student_class, marks):
        self.name = name
        self.roll_no = roll_no
        self.student_class = student_class
        self.marks = marks

    def display_info(self):
        print("----- Student Information -----")
        print(f"Name   : {self.name}")
        print(f"Roll No: {self.roll_no}")
        print(f"Class  : {self.student_class}")
        print(f"Marks  : {self.marks}")

    def get_grade(self):
        if self.marks >= 90:
            return "A"
        elif self.marks >= 75:
            return "B"
        elif self.marks >= 50:
            return "C"
        return "F"

    def display_result(self):
        self.display_info()
        print(f"Grade  : {self.get_grade()}")
        print()


if __name__ == "__main__":
    s1 = Student("Amit Sharma", 101, "10-A", 88)
    s2 = Student("Priya Das", 102, "10-B", 93)
    s3 = Student("Rahul Roy", 103, "10-A", 45)

    for student in (s1, s2, s3):
        student.display_result()
