Feature: Validar eliminación de documento cargado

  Scenario: Eliminar documento PDF cargado
    Given que se ha cargado un documento PDF válido
    When selecciono el documento en la lista
    And ejecuto la acción de eliminación
    Then el documento ya no aparece en la lista