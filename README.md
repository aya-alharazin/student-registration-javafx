# 🎓 Student Registration System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-25.0.2-blue?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-Academic-orange?style=for-the-badge)

> A desktop application built with **JavaFX** that allows users to manage student records with a clean and interactive UI. Students can be added with their name, gender, and preferred programming languages. All data is automatically saved and loaded using Java Object Serialization.

---

## 📋 Table of Contents

- [Features](#-features)
- [Technologies Used](#️-technologies-used)
- [How to Run](#-how-to-run)
- [Project Structure](#-project-structure)
- [UI Overview](#-ui-overview)
- [Author](#️-author)

---

## ✨ Features

| Feature | Description |
|---|---|
| ➕ Add Students | Register students with name, gender, and programming language preferences |
| 🔍 Search by ID | View and load existing student data using a ComboBox |
| 🔀 Language Selector | Move programming languages between preferred and selected lists |
| ✅ Validation | Input validation with user-friendly error messages |
| 💾 Auto Save | Automatically saves all data to file on window close |
| 📂 Auto Load | Automatically loads all students from file on startup |
| 🎨 UI Customizer | Customize font size, text style, and background color |
| 🖌️ Color Picker | Custom color picker for button styling |

---

## 🛠️ Technologies Used

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX_25-007396?style=flat-square&logo=java&logoColor=white)
![CSS](https://img.shields.io/badge/CSS-1572B6?style=flat-square&logo=css3&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans_IDE-1B6AC6?style=flat-square&logo=apache-netbeans-ide&logoColor=white)

| Technology | Purpose |
|---|---|
| **Java** | Core programming language |
| **JavaFX 25** | UI framework for desktop applications |
| **Object Serialization** | File I/O for persistent data storage |
| **NetBeans IDE** | Development environment |
| **CSS** | Custom styling for the UI |

---

## 🚀 How to Run

### Prerequisites

![Java](https://img.shields.io/badge/JDK-17%2B-ED8B00?style=flat-square&logo=openjdk)
![JavaFX](https://img.shields.io/badge/JavaFX_SDK-25.0.2-blue?style=flat-square)

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/aya-alharazin/student-registration-javafx.git
   ```

2. **Open in NetBeans IDE**
   - Go to `File` → `Open Project`
   - Select the cloned folder

3. **Configure JavaFX SDK**
   - Go to `Project Properties` → `Libraries`
   - Add JavaFX SDK path to the classpath

4. **Run the project**
   - Right-click `Week4.java` → `Run File`

---

## 📁 Project Structure

```
student-registration-javafx/
│
├── src/
│   └── javafx2/pkgfinal/
│       ├── Week4.java        # Main UI and event handling
│       ├── Student.java      # Student model class
│       └── style.css         # UI styling
│
├── .gitignore                # Excludes .dat and build files
└── README.md
```

---

## 📸 UI Overview

```
┌─────────────────────────────────────────────────────────┐
│              Student Registration System                 │
├──────────────┬──────────────────────┬───────────────────┤
│              │   ID:   [ComboBox]   │                   │
│ Design Tools │   Name: [TextField]  │  Saved Students   │
│              │   Gender: ○M  ○F     │                   │
│ □ Normal     │   PL: [List]→[List]  │  STD-1 - Ahmad    │
│ □ Bold       │                      │  STD-2 - Sara     │
│ □ Italic     │      [Save Btn]      │  STD-3 - Omar     │
│              │                      │                   │
│ ○ Red        │                      │                   │
│ ○ Green      │                      │                   │
│ ○ Blue       │                      │                   │
│ FontSize [v] │                      │                   │
│ Color [pick] │                      │                   │
└──────────────┴──────────────────────┴───────────────────┘
```

| Panel | Description |
|---|---|
| ⬅️ Left | Design tools — style, color, font size |
| 🎯 Center | Student registration form |
| ➡️ Right | List of all saved students |

---

## 👩‍💻 Author

<table>
  <tr>
    <td align="center">
      <b>Aya Nabil Alharazin</b><br>
      <sub>Programming 3 - Lab CSCI 2108 · 2026</sub>
    </td>
  </tr>
</table>

![Made with Love](https://img.shields.io/badge/Made%20with-❤️-red?style=for-the-badge)
![Java](https://img.shields.io/badge/Powered%20by-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
