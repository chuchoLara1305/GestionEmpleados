package Almacenamiento;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Almacenamiento_Archivo implements Almacenamiento_Base{
	public Document documento;
	
	public Almacenamiento_Archivo() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factoria.newDocumentBuilder();
		documento = builder.parse(new File ("C:\\Users\\migue\\OneDrive\\Escritorio\\XML\\AlmacenamientoArchivo.xml.txt"));	
	}
	
	public  void guardarInformacion(Empleado a) throws TransformerException, ParserConfigurationException, SAXException, IOException {
		
	
		//SE OBTIENE EL NODO RAIZ
		Node nodoRaiz = documento.getDocumentElement();
		
		//SE CREA EL ELEMENTO NUEVO EMPLEADO, EL CUAL TENDRÁ EL USUARIO DE CADA EMPLEADO
		Element nuevoEmpleado = documento.createElement((a.getNombre()).replace(" ", "_"));
		nodoRaiz.appendChild(nuevoEmpleado);
		
		
		//AQUI SE CREAN TODOS LOS DEMAS NODOS ATRIBUTOS, DE DONDE SE VACIARÁ TODO EL ESTADO OBJETO EMPLEADO 
		Element nombre = documento.createElement("Nombre");
		nuevoEmpleado.appendChild(nombre);	
		nombre.appendChild(documento.createTextNode(a.getNombre()));
		
		Element sueldo = documento.createElement("Sueldo");
		nuevoEmpleado.appendChild(sueldo);
		sueldo.appendChild(documento.createTextNode(String.valueOf(a.getSueldo())));
		
		Element afiliacion = documento.createElement("Afiliacion");
		nuevoEmpleado.appendChild(afiliacion);
		afiliacion.appendChild(documento.createTextNode(a.getAfiliacion()));
		
		Element añoServicio = documento.createElement("Años-De-Servicio");
		nuevoEmpleado.appendChild(añoServicio);
		añoServicio.appendChild(documento.createTextNode(String.valueOf(a.getAñosDeServicio())));
		
		
		Element telefono = documento.createElement("Telefono");
		nuevoEmpleado.appendChild(telefono);
		telefono.appendChild(documento.createTextNode(a.getTelefono()));
		
		Element correo = documento.createElement("Correo");
		nuevoEmpleado.appendChild(correo);
		correo.appendChild(documento.createTextNode(a.getCorreo()));
		
		Element edad = documento.createElement("Edad");
		nuevoEmpleado.appendChild(edad);
		edad.appendChild(documento.createTextNode(String.valueOf(a.getEdad())));
		
		TransformerFactory factor = TransformerFactory.newInstance();
		Transformer transformador = factor.newTransformer();
		
		DOMSource entrada = new DOMSource(documento);
		StreamResult salida = new StreamResult(new File ("C:\\Users\\migue\\OneDrive\\Escritorio\\XML\\AlmacenamientoArchivo.xml.txt"));
		
		transformador.transform(entrada, salida);
	}


	
	public ArrayList<String> buscarUsuario(String nombre) throws SAXException, IOException {
		ArrayList<String> usuario = new ArrayList<String>();
		Node raiz = documento.getDocumentElement();
		NodeList lista = raiz.getChildNodes();
		nombre.replace(" ", "_"); 
		for(int i = 0; i < lista.getLength(); i++) {
			Node Usuario = lista.item(i);
			if(Usuario.getNodeName().equals(nombre)) {
				NodeList Lista = Usuario.getChildNodes();
				for(int j = 0; j < Lista.getLength(); j++) {
					Node datos = Lista.item(j);
					usuario.add(datos.getTextContent());
				}
				break;
			}
		}
		if(usuario.size()==0) {
			System.out.println("Usuario No encontrado");
		}
		else {
			System.out.println("Usuario encontrado");
		}
		return usuario;
	}


	@Override
	public ArrayList<ArrayList<String>> devolverAlmacenamiento() {
		ArrayList<ArrayList<String>> almac = new ArrayList<ArrayList<String>>();
		Node raiz = documento.getDocumentElement();
		NodeList lista = raiz.getChildNodes();
		
		for (int i = 0; i < lista.getLength(); i++) {
			Node usuario = lista.item(i);
			NodeList lista_2 = usuario.getChildNodes();
			ArrayList<String> temp = new ArrayList<String>();
			for(int j = 0; j < lista_2.getLength(); j++) {
				
				Node campos = lista_2.item(j);
				temp.add(campos.getTextContent());
				if(j+1 == lista_2.getLength()) {
					almac.add(temp);
				}
			}
			
		}
		
		return almac;
	}
}
