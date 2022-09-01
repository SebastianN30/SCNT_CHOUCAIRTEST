Feature: Crear un nuevo registro en utest
  Yo soy un nuevo usuario
  necesito registrarme en el modulo
  para empezar a usar el aplicativo web

  Scenario: Usuario registrado de forma correcta
    Given Sebastian desea registrarse por primera vez en pagina de Utestcom
    When El usuario Sebastian diligencia todos los datos requeridos del formulario
      | strNombre | strApellido | strEmail                    | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad | strCodigoPostal | strPais  | strComputador | strVersion       | strLenguaje | strCelular | strModelo | strSistema | setStrPassword |
      | Sebastian | Nope        | sebastiannope347@gmail.com  | Janaury          | 30               | 2003             | Bogota    | 1212            | Colombia | macOs         | Catalina 10.15.7 | Spanish     |  Apple     | Iphone XS | IOS 12.1   | Sara23$ |

    Then El registro se termina con exito cuando aparece el boton de Complete SetUp
      | strTextoFinal |
      | Logueado      |