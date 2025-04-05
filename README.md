# Exam-Schedular-Data-Structures-and-algorithm
# 🎓 Exam Scheduler DSA

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![Status](https://img.shields.io/badge/Status-Working-brightgreen)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

A simple and interactive command-line Java application for scheduling **lecture**, **tutorial**, and **lab** exams using **Data Structures** like `Map`, `PriorityQueue`, and arrays.

---

## 📌 Features

- ✅ **Lecture Exam Scheduling** via priority queue (slots 7–12).
- ✅ **Tutorial Scheduling** with fixed slots (1 & 6).
- ✅ **Lab Scheduling** with search for 3 consecutive available slots (1–10).
- ✅ Prevents slot conflicts across all courses.
- ✅ CLI interface with live feedback.

---

## 📊 Scheduler Slot Layout

┌────────────┬──────────────┬───────────────────────┐ │ Slot Type │ Time Slots │ Note │ ├────────────┼──────────────┼───────────────────────┤ │ Lecture │ 7 → 12 │ Uses Priority Queue │ │ Tutorial │ 1 & 6 │ Fixed slots │ │ Lab │ 1 → 10 │ Needs 3 consecutive │ └────────────┴──────────────┴───────────────────────┘

yaml
Copy
Edit

---

## 🚀 Getting Started

### 🛠️ Requirements

- Java 8 or higher
- Terminal / Command Prompt
- Basic knowledge of Java I/O

### 🔧 Installation & Run

1. **Clone or download** this repo.
2. Compile:

   ```bash
   javac ExamSchedulerDSA.java
Run:

bash
Copy
Edit
java ExamSchedulerDSA
🧑‍💻 Example Usage
bash
Copy
Edit
Enter course name (or 'exit' to finish): 
CS101
Enter exam type (lecture/tutorial/lab): 
lecture
✅ Exam scheduled successfully!

Enter course name (or 'exit' to finish): 
CS201
Enter exam type (lecture/tutorial/lab): 
lab
✅ Exam scheduled successfully!

Enter course name (or 'exit' to finish): 
exit

Exam Schedule:
{CS101=7, CS201=1, CS201=2, CS201=3}
⚠️ Note: Due to how maps work, lab courses currently overwrite earlier slots under the same course name. You can extend the program to use Map<String, List<Integer>> for better accuracy.

🧠 Concepts Used
Map<String, Integer> for storing scheduled exams.

PriorityQueue<Integer> for efficient lecture slot assignment.

Array iteration for slot availability.

Input handling with Scanner.

📂 File Structure
Copy
Edit
📦ExamSchedulerDSA
 ┗ 📜 ExamSchedulerDSA.java
📃 License
This project is licensed under the MIT License – feel free to use and modify.

🙋‍♀️ Author
Satya Mishra
Feel free to fork and extend this project.

