📱 Finly – Personal Expense Tracker App
Finly is a modern Android application built with Jetpack Compose, designed to help users manage their personal finances with ease and clarity. Whether you're budgeting for daily expenses or planning long-term savings, Finly provides the tools to track, analyze, and improve your spending habits.
🔧 Tech Stack
- Jetpack Compose – Declarative UI toolkit for building native Android interfaces
- MVVM Architecture – Separation of concerns with ViewModel and LiveData/StateFlow
- Hilt – Dependency injection for scalable and testable code
- Room – Local database for storing transactions
- Navigation Compose – Seamless screen transitions
- DataStore – Lightweight storage for user preferences
- Biometric API – Optional fingerprint/FaceID protection
- MPAndroidChart – Visualize spending with charts
- Coil – Load images efficiently in Compose

✨ Features
- Add income and expense transactions with category tags
- View financial summaries by day, week, or month
- Set budgets and receive alerts when limits are exceeded
- Visualize spending with pie and bar charts
- Secure app access with biometric authentication
- Offline-first: all data stored locally on device
- Clean, responsive UI with light/dark mode support

### 🗃️ Database Schema (Room)

Finly uses Room as its local database solution. The schema is designed to support flexible and efficient tracking of personal finances.

#### Tables:

- **Transaction**
    - Stores individual income and expense records.
    - Linked to a category for classification.
    - Includes amount, type, note, and timestamp.

- **Category**
    - Defines types of transactions (e.g., Food, Salary, Transport).
    - Used for filtering and visualizing data.
    - Supports both income and expense types.

- **Budget** (optional)
    - Allows users to set spending limits per category.
    - Useful for alerts and budget tracking.

All tables are normalized and indexed for performance. Room handles migrations and type safety via Kotlin data classes and DAO interfaces.
