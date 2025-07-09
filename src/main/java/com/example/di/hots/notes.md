# Spring Dependency Injection Precedence Notes

## 1. `autowire="byType"`
- Uses **default constructor**.
- Injects dependencies using **setter injection** by matching the type.
- Fails if multiple beans of the same type are present (throws `NoUniqueBeanDefinitionException`).

---

## 2. `autowire="byName"`
- Uses **default constructor**.
- Injects dependencies using **setter injection**, but only if the **property name matches the bean ID**.
- Careful with naming – it must match exactly.

---

## 3. Constructor Injection + Field Injection
- **Parameterized constructor** is called first.
- Then **field injection** is applied via setter 
- **Field injection can override constructor-injected values**, depending on how the field is declared and whether the same dependency is injected again.
---

## 4. Constructor + Setter + Field Injection
- **Constructor injection** occurs first.
- Then **setter injection** is applied (if defined).
- **Setter injection overrides** the field value injected via reflection.
- Field injection is **skipped if setter exists**.

---

## 5. `@Autowired` (Field Injection)
- Field is injected **by type** using **reflection**.
- Constructor or setter are not required.
- Can be combined with `@Qualifier` for disambiguation.
- Used when simplicity is preferred, but harder to test.

