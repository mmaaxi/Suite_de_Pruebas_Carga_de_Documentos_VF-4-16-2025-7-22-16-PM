Feature: Validar integridad de datos tras la carga

  Scenario: Subir y validar documento PDF
    Given El usuario está en la página de carga de documentos
    When El usuario sube un documento PDF con metadatos correctos
    Then El documento se carga exitosamente

    When El usuario accede a la descripción y metadatos del documento cargado
    Then Los metadatos coinciden con la información original

    When El usuario verifica la integridad del contenido del documento
    Then El contenido del documento no presenta alteraciones