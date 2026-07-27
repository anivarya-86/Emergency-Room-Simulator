# 🚨 VIP Emergency Room Simulator (Priority Desk)

A high-performance Java console application simulating a hospital Emergency Room (ER) triage system. It utilizes a heap-based dynamic data structure to dynamically order patients based on medical severity rather than arrival order (FIFO).

---

## 🚀 Key Features & Concepts Implemented

* **Priority Queue & Min/Max Heaps:** Implemented `java.util.PriorityQueue` to handle dynamic priority-based patient queues[cite: 24].
* **Comparable Interface:** Overrode `compareTo()` in `PatientNode` to automatically re-order the queue whenever a new patient is added based on their severity level (1-Low to 5-Critical)[cite: 26].
* **Data Abstraction & Encapsulation:** Encapsulated patient metadata (Name, Age, Severity) with full getter/setter controls and clear state formatters[cite: 26].
* **Clean State Transitions:** Provided single-poll processing (`treatNextPatient()`) to dequeue high-priority cases while maintaining queue state[cite: 24].

---

## 🏗️ Architecture Overview

```text
📦 EmergencyRoomSimulator
 ├── 📄 PatientNode.java       --> Data Model & Comparable implementation for Priority Queue[cite: 26]
 ├── 📄 EmergencyRoom.java     --> Priority Queue manager driving patient registration & triage polling[cite: 24]
 └── 📄 ERManagementSystem.java--> Driver application driving the interactive menu loop[cite: 25]
