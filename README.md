# Интерактивная информационная система сопровождения учебного процесса Военного учебного центра при РТУ МИРЭА

## Описание
Данный проект посвящен внедрению интерактивного мобильного ассистента, способного упорядочить и упростить организацию учебного процесса в Военном учебном центре при РТУ МИРЭА. Одной из основных проблем, с которой сталкиваются студенты – это продолжительная адаптация к порядку организации учебного процесса в ВУЦ, связанная с невозможностью получения оперативной информации по изменениям в расписании учебных занятий (месту и порядку проведения занятий, информации по преподавателям и	т.п.).
> [!WARNING]
> Данный проект имеет лицензию [MIT](https://ru.ruwiki.ru/wiki/%D0%9B%D0%B8%D1%86%D0%B5%D0%BD%D0%B7%D0%B8%D1%8F_MIT) 

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/159028556/8c89b6eb-4791-4061-b7ff-b01803681eef" width="200" height="450">
</div>

## Сбор требований
### Способы сбора требований 
Прежде, чем начать собирать требования, необходимо выявить всех заинтересованных лиц (стейкхолдеров), которые будут пользоваться данной системой. Чем точнее будет этот список, тем полнее будут требования. В нашем проекте стейкхолдерами будут только студенты и руководящий преподавательский состав. Заинтересованные лица могут разделяться на внешних и на внутренних.

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/aec9f1d5-7153-486b-b518-75a45e2e9647" width="300" height="300">
</div>

Существует множество различных техник сбора требований, которые помогут лучше понять, что хочет видеть пользователь в конечном итоге. Мы использовали такие техники сбора требований, как интервьюирование и мозговой штурм.

**Интервью**

Сбор требований с помощью интервью осуществлялся в несколько этапов:
1. Подготовительный этап. На данном этапе осуществлялась подготовка полного списка вопросов и тем обсуждения для лучшего понимания целей создания мобильного приложения;
2. Выбор участников. На данном этапе определялся список участников на интервью;
3. Ход проведения интервью. На данном этапе задавались открытые вопросы для получения максимально подробного ответа, при необходимости нужно задавать уточняющие вопросы;
4. Фиксация требований. На данном этапе все полученные требования фиксировались в письменном виде для дальнейшего анализа и создания спецификации;
5. Анализ. После интервью проводился анализ полученных данных и выделялись основные требования;
6. Обратная связь. При необходимости стейкхолдеры давали обратную связь по возможным коррективам требований. 

**Мозговой штурм**

Благодаря данному подходу собиралось множество идей от небольшой группы студентов и преподавателей в кратчайшие сроки, стейкхолдеры на презентации разработки накидывали множество идей, связанных со способом решения существующей технологии сопровождения учебного процесса в ВУЦ. В ходе мозгового штурма каждая идея фиксировалась в особый список, из которого затем отбирались лучшие варианты. Затем лучшие варианты попадают в схему мозгового штурма для визуализации будущего проекта.

![Мозговой штурм drawio](https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/41af920f-9427-4ea7-93cd-dac8821ace66)

### Методика сбора требований
Выбор методики сбора требований помогает определить и уточнить пожелания заказчика и будущих пользователей системы. Методики помогают конкретизировать требования к системе, позволяя сконцентрироваться на отдельных аспектах проекта, что положительно может повлиять на его своевременное завершение. 
<!-- Возможно не подойдет такой метод сбора требований из-за методологии разработки по Канбану -->
В нашем проекте мы будем руководствоваться принципам **`каскадного метода`** сбора требований, которая предполагает последовательный сбор информации, ее анализ, проектирование проекта, разработку, тестирование и внедрение.

### Наблюдение за текущем процессом
Пока не каждое учебное заведение обладает мобильной информационной системой, которая поможет повысить эффективность обучения студентов. Студентам ВУЦ приходится тратить время на поиск расписания на сайте учебного заведения, загружать сторонний файл, ориентироваться по дате в огромной таблице, осуществляя поиск своего учебного взвода. Все перечисленные действия требуют высоких затрат по времени на их выполнение, а сложная структура может ввести в заблуждение поступившего. Такое представление информации кажется проблемным для отдельных студентов. При этом в существующем расписании отсутствует информация о предстоящем предмете, а также о преподавателе и его должности.

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/8724f9b8-be2d-4c71-98dc-6ed013bac77f">
</div>

> Образец существующего расписания ВУЦ

![BPMN AS IS](https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/587c7142-a47e-43f4-938a-a2e33a001412)
> Модель сопровождения учебного процесса ВУЦ AS IS в нотации BPMN 2.0

## Анализ требований
### Структуризация требований 
После того, как требования были зафиксированы во время их сбора у стейкхолдеров, необходимо провести тщательный анализ и структуризировать их.

На этапе структуризации проводится проверка требований на их полноту, согласованность, однозначность и реалистичность. Это включает в себя проверку на противоречия, недостатки и недостающие элементы.

После этого требования структурируются в специальной схеме, чтоб лучше разделить требования на **`функциональный`** и **`нефункциональный`** характер, а также разделить на три уровня:
1. Уровень бизнес-требований
2. Уровень пользовательских требований 
3. Уровень функциональных требований

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/0214af55-1c05-4729-aae9-1c43e035d564" width="500" height="400">
</div>

### Уровень бизнес-требований

Данный уровень включает в себя Бизнес-требования (функциональный характер) и бизнес-правила (нефункциональный характер). 
Бизнес-правила - ценный источник требований.

Они влияют на следующие типы требований к системе:
1. Бизнес-требования
2. Пользовательские и функциональные требования
3. Атрибуты качества

| Бизнес-правило             | Требование к системе          |
|----------------------------|-------------------------|
| Пользователи должны иметь возможность просматривать расписание занятий на определенный день (неделю) | На главном экране (где показывается расписание занятий) пользователь должен иметь возможность переключать расписание занятий на главном экране  с помощью специальных кнопок (стрелочек) или свайпом влево/вправо |
| Информация о занятиях должна быть актуальной и своевременно обновляться | Пользователь тоже проходить авторизацию в системе путем ввода только номера учебного взвода, после этого система автоматически через специальный сервер подгружает расписание занятий. Так же должно происходить обновление расписание при нажатии на специальную кнопку (зацикленная стрелочка) или свайпом вниз |
| Должна быть предусмотрена возможность оставлять отзывы после использования приложения для улучшения качества сервиса | Должна быть отдельная вкладка настроек, где должна будет быть кнопка для быстрого перехода в Telegram, где автоматически откроется чат технической поддержки | 

Но при этом бизнес-требования не относятся напрямую к реализации проекта, а в первую очередь они отражают цели учебного процесса, абстрагированные от реализации системы. 
Главная **`бизнес-цель`** проекта сформирована по методике SMART: 

***Повысить эффективность адаптации поступивших студентов с помощью новой технологии упорядочивания и упрощения организации учебного процесса в Военном учебном центре при РТУ МИРЭА, чтобы разработанная технология пользовалась постоянным спросом как минимум у 500 студентов в течение двух лет.*** 

В конечном итоге бизнес-цель определяет какие будут бизнес-требования, а уже бизнес-требования формируют **`Документ бизнес-требований (BRD)`**.

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/7e9500f1-20ee-4aaf-a270-26bcc668394a" width="700" height="600">
</div>


### Уровень пользовательских требований

Данный уровень включает в себя пользовательские требования (функциональный характер) и атрибуты качества (нефункциональный характер). 
Пользовательские требования содержат:
- Цели и задачи пользователей
- Сценарии использования — способ решения задачи пользователей
- Как следствие, описание самих пользователей системы:
  - пользовательские роли
  - уровни доступа

Пользовательские требования описывались по следующему шаблону: 
***Пользователь должен иметь возможность + {тезис}***

**1) User Story**

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/f694c006-0653-4cd2-9769-7e29998d0bb7" width="250" height="250">
</div>

| Роль             | Цель/Действие          | Ожидаемый результат          |
|------------------|------------------------|------------------------------|
| Студент | Пройти авторизацию в системе | Актуальная информация о том учебного взводе, номер которого был введен в поле ввода | 

**1) Use Case**

**`Цель`** пользователя в том, что он вводит свой номер учебного взвода и свое имя (необязательно), после этого получает актуальную информацию о своем взводе и расписании занятий.

**`Задачи пользователя`**
- Ввод номера учебного взвода в поле ввода на экране авторизации.
- Ввод имени пользователя в поле ввода на экране авторизации (необязательная функция).

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/e9656424-7b7a-45f1-aaba-179849d63a93" width="350" height="300">
</div>

| Название Use Case | Авторизация | 
|-------------------|-------------|
| ***Описание Use Case*** | Пользователь авторизуется в системе, чтоб получить актуальную информацию по своему взводу и расписанию занятий |
| ***Акторы*** | Студенты | 
| ***Предусловия*** | Система должна быть подсоединена к сети Интернет для получения актуальной информации; Для ввода номера учебного взвода используется только числовой тип данных; Для ввода имени пользователя используется только текстовый тип данных, также имя может принимать NULL; При некорректном вводе выводится ошибка. | 

**1) Wireframe**

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/eb774c6e-4e7e-4d22-976e-96b97211b870" width="200" height="300">
</div>

**1) Пользовательское требование**

Пользователь должен иметь возможность авторизовываться в системе по номеру учебного взвода.

**2) User Story**

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/d5ef8dfa-e0f5-4b76-80bd-53e862b31a32" width="250" height="250">
</div>

| Роль             | Цель/Действие          | Ожидаемый результат          |
|------------------|------------------------|------------------------------|
| Студент | Получить актуальное расписание | Актуальная расписание занятий на текущий или выбранный период времени | 

**2) Use Case**

**`Цель`** пользователя в том, что ему необходимо как можно быстро получить актуальное расписание.

**`Задачи пользователя`**
- Задач у пользователя нет, так как после успешного прохождения авторизации пользователю автоматически на главном экране должно подгружаться расписание занятий.

> [!NOTE]
> Если пользовательских задач нет, то диаграмма вариантов использования не требуется.

**2) Wireframe**

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/e527c620-6da6-422f-9b7d-0c6a0f40e5d5" width="200" height="350">
</div>

**2) Пользовательское требование**

Пользователь должен иметь возможность всегда получать актуальную информацию о расписании занятий.

**3) User Story**

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/3d580608-eb79-422d-9926-f8551f9dee0e" width="250" height="250">
</div>

| Роль             | Цель/Действие          | Ожидаемый результат          |
|------------------|------------------------|------------------------------|
| Студент | Оперативно получать нужную информацию | Удобная панель навигации | 

**3) Use Case**

**`Цель`** пользователя в том, что он должен достигать своих целей в приложении как можно быстро с помощью специального меню.

**`Задачи пользователя`**
- Переключаться между вкладками с помощью меню быстрого доступа.

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/ca557068-8018-4772-9858-106a446ffae1" width="400" height="350">
</div>

| Название Use Case | Авторизация | 
|-------------------|-------------|
| ***Описание Use Case*** | Пользователь оперативно получает нужную ему информацию с помощью меню быстрого доступа |
| ***Акторы*** | Студенты | 
| ***Предусловия*** | - | 

**3) Wireframe**

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/f22eaa9d-e764-43dd-90a7-18ef074c5eed" width="500" height="350">
</div>

**3) Пользовательское требование**

Пользователь должен иметь возможность быстро и удобно достигать своих целей в системе.

**4) User Story**

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/0ac57621-a31e-40b8-b610-534367cfc54d" width="250" height="250">
</div>

| Роль             | Цель/Действие          | Ожидаемый результат          |
|------------------|------------------------|------------------------------|
| Студент | Получить связь с технической поддержкой | Переход в “два клика” в Telegram чат технической поддержкой | 

**4) Use Case**

**`Цель`** пользователя в том, что он в случае возникновения различных багов и ошибок мог быстро решить эту проблему путем обращения напрямую к разработчикам через данную систему. 

**`Задачи пользователя`**
- Перейти на вкладку настроек.
- Из настроек перейти в Telegram-канал с помощью специальной ссылки.

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/9ae6e86b-2b4f-41d0-a969-017d8cbddd5f" width="300" height="250">
</div>

| Название Use Case | Авторизация | 
|-------------------|-------------|
| ***Описание Use Case*** | Пользователь переходит в Telegram-канал, при возникновение каких-либо ошибок или багов |
| ***Акторы*** | Студенты | 
| ***Предусловия*** | Система должна быть подсоединена к сети Интернет для обращения в техническую поддержку | 

**4) Wireframe**

<div align="center">
<img src="https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/74067d6a-fa52-4f6d-8f6d-d2d5844eddc2" width="300" height="350">
</div>

**4) Пользовательское требование**

Пользователь должен иметь возможность через систему связаться с технической поддержкой.


После внедрение новой технологии сопровождения учебного процесса ВУЦ, бизнес процесс изменит свой вид на более оптимизированную модель.
![BPMN TO BE](https://github.com/SportivityTeam/assistant-vuc-mirea/assets/90286544/858f353d-62f0-4ed0-9fd1-9db42b644834)
> Модель сопровождения учебного процесса ВУЦ TO BE в нотации BPMN 2.0

Следовательно, пользовательские требования должны формировать **`Документ требований к продукту (PRD)`**.

**Атрибуты качества (нефункциональные требования):**

***Удобство использования***

Главная цель разработанной системы будет являться оперативное получение информации по расписанию занятий, соответственно, к удобству использования будет относится:
- После ввода номера учебного взвода и при нажатии кнопки «Войти», пользователь должен будет сразу же попасть на «Главный» экран системы, в котором будет уже загружено расписание занятий
- Навигация по приложению (то есть переключение между вкладками) должна обеспечиваться меню быстрого доступа в нижней части экрана мобильного устройства

***Производительность***

- Разрабатываемая система не предрасполагает большое количество запросов в секунду, так как для загрузки актуального расписания требуется совершить один запрос в семестр (4 месяца), при условии, что оно не будет изменять в течение этого времени
- Допустимое время ответа сервера: от 500мс. до 1000 мс. (1с.)
- Ожидаемое кол-во пользователей зависит от среднего кол-ва обучающихся в Военном учебном центре – это порядка 500 студентов
- Никаких ограничений по техническим характеристикам серверов нет, минимальных мощностей серверов будет достаточно для примитивного запроса для получения расписания занятий

***Защищенность***

- Ни на какие роли система не разделяется, она имеет только один общий доступ для всех видов пользователей
- Работа с персональными данными не предусматривается, соответственно, создавать резервную копию или наличие правил создания точек сохранения базы данных - будет нецелесообразным. Расписание занятий будет браться из сайта военного учебного центра

***Совместимость***

Проектируемая система должна быть доступной практически для всех студентов на мобильном устройстве на ОС Android и IOS. Из этого выходит, что основными пользователями системы будут являться студенты. 
Поэтому на основе этого для комфортной работы в данной информационной системе были выдвинуты минимальные системные требования устройств:
- На ОС Android:
   - Версия ОС - Android 9.0-10.0;
   - Архитектура - 32-разрядная;
   - Частота процессора - 1,1 ГГц;
   - ОЗУ - 2 ГБ;
   - Кол-во свободного места - До 50 МБ;
   - Доступ к сети Интернет.
- На ОС IOS:
<!-- Нужно будет добавить инфу про IOS -->
### Уровень функциональных требований

Функциональные требования являются результатом декомпозиции верхнеуровневых требований и описывают атомарные функции, которые должны быть реализованы в системе. Например:

1. “Пользователь должен иметь возможность авторизовываться в системе по номеру учебного взвода”:
  - Функция 1 - ввод в специальную область только числовое значение (для номера учебного взвода)
  - Функция 2 - ввод в специальную область только строковое значение (для имени пользователя)
  - Функция 3 - вывод на главный экран приложения актуальное расписание (расписание является актуальным, если у нас расписание относится именно тому учебному взводу)
2. “Пользователь должен иметь возможность всегда получать актуальную информацию о расписании занятий”:
  - Функция 1 – парсинг расписания из Excel-файла;
  - Функция 2 – вывод на экран расписания отсортированного по номеру взвода и текущего числа (недели);
  - Функция 3 – вывод ключевой информации (номер пары, время занятий, название предмета, преподаватель и номер аудитории) по каждому предмету
  - Функция 4 - кнопка “Обновить” должна обновлять текущее расписание занятий без необходимости выходить из приложения и получать актуальное расписание за счет повторной авторизации в системе.
3. “Пользователь должен иметь возможность быстро и удобно достигать своих целей в системе”:
  - Функция 1 - система должна иметь навигационное меню в нижней части экрана 
  - Функция 2 - переключение должно быть только по вкладкам - “О ВУЦ”, “Расписание” и “Преподаватели”
4. “Пользователь должен иметь возможность через систему связаться с технической поддержкой”: 
  - Функция 1 - во вкладке “Настройки” должна быть кнопка для быстрого перехода в чат с разработчиками (Telegram платформа)

> [!NOTE]
> Расписание является актуальным, если у нас расписание:
> 1. Относится именно к тому учебному взводу, которое было введено в момент авторизации 
> 2. Вывод на главный экран системы учебных занятий, которые относятся к текущей учебной недели (за исключением зимних и летних каникул, а также дней пересдач)
> 3. Содержит информацию о: название текущего занятия, ФИО преподавателя по данному занятию и номер аудитории, где будет проводится это занятие

Следовательно, функциональные требования должны формировать **`Документ функциональной спецификации (FSD)`**.


### Functional Specifications Document
