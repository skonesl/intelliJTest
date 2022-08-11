package gestorPassword;

public class Password {

    /*
        Creamos los atributos que tendrá nuestro objeto Password
     */
    private int longitud = 8;
    private String password = "";

    /*
        En este caso tendremos dos constructores:
        1º- Uno por defecto (Está vacío)
        2º- Otro al que podremos pasar un número. Nos servirá para modificar la longitud de nuestra password
     */
    public Password() {
    }
    public Password(int longitud) {
        this.longitud = longitud;
    }

    //Generamos los Getters y Setters
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    /*
        Implementamos un método que comprobará si la contraseña generada es fuerte:
        Para ser fuerte deberá tener más de 2 mayúsculas, más de 1 minúsucla y más de 5 números
     */

    public boolean esFuerte (String password) {

        int contNum = 0, contMayus  = 0, contMinus = 0;
        boolean esFuerte = false;

        for (int i = 0; i < password.length(); i++) {

            if (password.charAt(i)>='0' && password.charAt(i)<='9') {
                contNum++;
            } else if (password.charAt(i)>='A' && password.charAt(i)<='Z') {
                contMayus++;
            } else if (password.charAt(i)<='z' && password.charAt(i)>='a') {
                contMinus++;
            }
        }
        if (contNum > 2 && contMayus > 2 && contMinus > 1) {
            esFuerte = true;
        }
        return esFuerte;
    }

    /*
        Implementamos un método que generará una contraseña aleatoria
     */

    public void generarPassword(int longitud) {
        for (int i = 0; i < longitud; i++) {
            boolean aux = false;
            while (aux == false) {
                int codigoAscii = (int)Math.floor(Math.random()* 123);
                if ((codigoAscii >= 48 && codigoAscii <= 57)) {
                    password = password + (char)codigoAscii;
                    aux = true;
                } else if ((codigoAscii >= 65 && codigoAscii <= 90)) {
                    password = password + (char)codigoAscii;
                    aux = true;
                } else if ((codigoAscii >= 97 && codigoAscii <= 122)) {
                    password = password + (char)codigoAscii;
                    aux = true;
                }
            }
        }
    }
}