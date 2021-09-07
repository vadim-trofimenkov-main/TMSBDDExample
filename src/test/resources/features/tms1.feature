Feature: Course search
  Scenario Outline: Automation course search
    Given Course name <name>
    When User opens course
    Then Page title is <title>
    Examples:
      | name                                      | title                                                                                            |
      | "Автоматизированное тестирование на Java" | "Курсы тестировщиков в Минске – QA курсы по автоматизированному тестированию с трудоустройством" |
      | "Android"                                 | "Курсы андроид разработчика и мобильной разработки приложений на Android в Минске"               |