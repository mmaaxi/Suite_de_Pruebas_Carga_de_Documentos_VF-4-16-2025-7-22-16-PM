Feature: Validar generación de log de auditoría tras la carga

  Scenario: Subida de documento PDF y verificación en el log de auditoría
    Given que el usuario está en la página de carga de documentos
    When el usuario carga un documento PDF válido
    Then el documento se carga correctamente

    When el usuario accede al sistema de auditoría
    Then se registra una entrada correspondiente a la acción de carga

    When el usuario verifica la información en el log de auditoría
    Then el log contiene detalles precisos de la acción y el usuario que realizó la carga