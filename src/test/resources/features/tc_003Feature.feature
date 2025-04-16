Feature: Validar límite de tamaño del documento

  Scenario: Verificar que el sistema maneja adecuadamente documentos que exceden el tamaño permitido
    Given el usuario navega a la página de carga
    When el usuario selecciona un documento que supera el límite de tamaño permitido
    And intenta subir el documento
    Then el sistema muestra un mensaje de error sobre el tamaño excedido