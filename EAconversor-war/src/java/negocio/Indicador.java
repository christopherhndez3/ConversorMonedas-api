
package negocio;

import com.google.gson.Gson;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@Generated("jsonschema2pojo")
public class Indicador {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("autor")
    @Expose
    private String autor;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("unidad_medida")
    @Expose
    private String unidadMedida;
    @SerializedName("serie")
    @Expose
    private List<Serie> serie = null;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public List<Serie> getSerie() {
        return serie;
    }

    public void setSerie(List<Serie> serie) {
        this.serie = serie;
    }
    
    public double obtenerValorDolarApi() throws MalformedURLException{
        double valorDolar = 0;
        try{
        //Determinar la fecha actual
        Date date               = new Date();
        DateFormat dateFormat   = new SimpleDateFormat("dd-MM-yyyy");
        String fechaActual      = dateFormat.format(date);
        //Configurar REQUEST
        URL url = new URL("https://mindicador.cl/api/dolar/"+fechaActual);
        HttpURLConnection conexionHTTP = (HttpURLConnection) url.openConnection();
        conexionHTTP.setRequestMethod("GET");
        conexionHTTP.setRequestProperty("accept", "application/json");
        
        //Configurar RESPONSE
        InputStreamReader inputStreamReader = new InputStreamReader(conexionHTTP.getInputStream());
        BufferedReader reader               = new BufferedReader(inputStreamReader);
        //Crear objeto Java con datos JSON
        //Pasamos  a una variable local de tipo string la respuesta JSON recibida desde la API
        String respuestaJSON                = reader.readLine();
        //Creamos un objeto de la clase Gson que nos permite pasar de JSON a Java
        Gson gson                           = new Gson();
        //Invocamos el método fromJSON que permite ejecutar la generación de un objeto JAVA según JSON
        Indicador indicador                 = gson.fromJson(respuestaJSON,Indicador.class);
        //Creamos una lista para acceder a los datos de fecha y valor UF.
        List<Serie> listaSerie              = indicador.getSerie();
        //Obtenemos valor uf
        valorDolar = listaSerie.get(0).getValor();
        
        //Obtenemos valor uf desde objeto java
        
        }catch(IOException ex){
            Logger.getLogger(Indicador.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        return valorDolar;
    }
    
    public double obtenerValorEuroApi() throws MalformedURLException{
        double valorEuro = 0;
        try{
        //Determinar la fecha actual
        Date date               = new Date();
        DateFormat dateFormat   = new SimpleDateFormat("dd-MM-yyyy");
        String fechaActual      = dateFormat.format(date);
        //Configurar REQUEST
        URL url = new URL("https://mindicador.cl/api/euro/"+fechaActual);
        HttpURLConnection conexionHTTP = (HttpURLConnection) url.openConnection();
        conexionHTTP.setRequestMethod("GET");
        conexionHTTP.setRequestProperty("accept", "application/json");
        
        //Configurar RESPONSE
        InputStreamReader inputStreamReader = new InputStreamReader(conexionHTTP.getInputStream());
        BufferedReader reader               = new BufferedReader(inputStreamReader);
        //Crear objeto Java con datos JSON
        //Pasamos  a una variable local de tipo string la respuesta JSON recibida desde la API
        String respuestaJSON                = reader.readLine();
        //Creamos un objeto de la clase Gson que nos permite pasar de JSON a Java
        Gson gson                           = new Gson();
        //Invocamos el método fromJSON que permite ejecutar la generación de un objeto JAVA según JSON
        Indicador indicador                 = gson.fromJson(respuestaJSON,Indicador.class);
        //Creamos una lista para acceder a los datos de fecha y valor UF.
        List<Serie> listaSerie              = indicador.getSerie();
        //Obtenemos valor uf
        valorEuro = listaSerie.get(0).getValor();
        
        //Obtenemos valor uf desde objeto java
        
        }catch(IOException ex){
            Logger.getLogger(Indicador.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        return valorEuro;
    }
    
}
