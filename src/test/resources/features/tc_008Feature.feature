Feature: Validar extracción y verificación de metadatos del documento

  Scenario: El usuario sube un documento, extrae y verifica los metadatos
    Given el usuario carga un documento con metadatos embebidos
    When el usuario extrae los metadatos del documento cargado
    Then el sistema muestra los metadatos correctos conforme al documento
    And los metadatos coinciden con los valores esperados