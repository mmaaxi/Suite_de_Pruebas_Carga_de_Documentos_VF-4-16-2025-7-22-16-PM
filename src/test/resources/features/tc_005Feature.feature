Feature: Validar carga múltiple de documentos

  Scenario: Carga exitosa de múltiples documentos PDFs
    Given el usuario navega a la sección de carga múltiple
    When el usuario selecciona dos o más documentos PDF válidos
    And el usuario sube los documentos simultáneamente
    Then todos los documentos se cargan sin errores y se muestran en la lista