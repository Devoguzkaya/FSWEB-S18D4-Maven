# PROJECT_MEMORY.md
> **Project Name:** [Proje Adı Buraya]
> **Last Updated:** 6 Aralık 2025 Cumartesi
> **Current Phase:** Core Features - Implementation
> **Active Context:** PAUSED. DAO layer is fully implemented. Exception classes (BurgerException, BurgerErrorResponse) are created. Stopped right before creating 'GlobalExceptionHandler'.

---

## [1. PROJECT VISION & GOALS]
* **Core Concept:** [Projenin tek cümlelik özeti. Örn: Kumarhane temalı flört uygulaması]
* **Target Audience:** [Hedef Kitle]
* **Success Criteria:** [Proje ne zaman başarılı sayılacak?]

## [2. TECH STACK & CONSTRAINTS]
* **Language/Framework:** [Örn: Flutter, React, Python]
* **Backend/DB:** [Örn: Supabase, Firebase, AWS]
* **State Management:** [Örn: Riverpod, Redux]
* **Key Packages:** [Kullanılan ana kütüphaneler], org.json
* **Constraints:** [Örn: No External CSS, Mobile First, Offline Support]

## [3. ARCHITECTURE & PATTERNS]
* **Design Pattern:** [Örn: Clean Architecture, MVVM, MVC]
* **Folder Structure:**
    * `/src/main/java/com/workintech/s18d1/entity`: Entities and Enums
    * `/src/main/java/com/workintech/s18d1/dao`: Data Access Objects (Interfaces & Impl)
    * `/src/main/java/com/workintech/s18d1/controller`: REST Controllers
    * `/src/main/java/com/workintech/s18d1/exceptions`: Custom Exceptions & Global Handler
    * `/src/main/java/com/workintech/s18d1/util`: Validations
* **Naming Conventions:** [Örn: camelCase for vars, snake_case for DB]

## [4. ACTIVE RULES (The "Laws")]
*(Yapay zekanın asla çiğnememesi gereken kurallar)*
1.  [Örn: Asla API Key'leri koda gömme, .env kullan]
2.  [Örn: Her fonksiyonun unit testini yaz]
3.  [Örn: UI tasarımlarında Glassmorphism kullan]

## [5. PROGRESS & ROADMAP]
- [x] Phase 1: Setup & Configuration
- [ ] Phase 2: Core Features
    - [x] application.properties dosyasını düzenle
    - [x] BreadType Enum oluştur
    - [x] Burger Entity oluştur
    - [x] BurgerDao Interface oluştur
    - [x] BurgerDaoImpl Class oluştur
    - [x] BurgerErrorResponse Class oluştur
    - [x] BurgerException Class oluştur
    - [ ] GlobalExceptionHandler Class oluştur (NEXT STEP)
    - [ ] BurgerValidation Class oluştur
    - [ ] BurgerController Class oluştur
- [ ] Phase 3: UI Polish
- [ ] Phase 4: Testing & Deployment

## [6. DECISION LOG & ANTI-PATTERNS]
*(Hatalardan ders çıkarma günlüğü)*
* **[Karar - Tarih]:** [Neden bu teknolojiyi seçtik?]
* **[Anti-Pattern]:** JDK yolu çakışması ve dosya bozulması.
    * *Çözüm:* Ortam değişkeni (JAVA_HOME) bozuk JDK yerine sağlam olana (Eclipse Adoptium) kalıcı olarak yönlendirildi.
* **[Karar - 06.12.2025]:** BurgerDao için JpaRepository yerine özel implementasyon (BurgerDaoImpl) yapıldı (README gereksinimi).
* **[Refactor - 06.12.2025]:** Paket yapısı entity, dao, controller, exceptions, util şeklinde düzenlendi.

---
**OPERATIONAL DIRECTIVE:**
1.  **Read First:** Before answering any prompt, check this file for context.
2.  **Update Often:** If a task is completed, check the box [x]. If a tech decision changes, update Section 2.
3.  **Stay Consistent:** Do not suggest code that violates "Active Rules".
