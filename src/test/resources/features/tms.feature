Feature: Course search
  Scenario: Automation course search
    Given Course name "Автоматизированное тестирование на Java"
    When User opens course
    Then Page title is "Курсы тестировщиков в Минске – QA курсы по автоматизированному тестированию с трудоустройством"
  Scenario: Automation course search
    Given Course name "Android"
    When User opens course
    Then Page title is "Курсы андроид разработчика и мобильной разработки приложений на Android в Минске"
