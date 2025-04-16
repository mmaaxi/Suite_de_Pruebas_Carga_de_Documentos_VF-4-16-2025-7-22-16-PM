Feature: Validar carga de documento con formato PDF válido

  Scenario: Carga de documento PDF
    Given Estoy en la página de carga de documentos
    When Selecciono un documento PDF válido
    And Subo el documento
    Then Verifico mensaje de confirmación de carga exitosa