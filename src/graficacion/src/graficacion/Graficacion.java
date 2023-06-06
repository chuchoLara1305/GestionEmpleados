package graficacion;

import java.util.ArrayList;

import com.aspose.cells.Chart;
import com.aspose.cells.ChartType;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
	
public abstract class Graficacion {

	private String titulo;
	private String tituloGrupo;
	private String nombreArchivo;
	
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public void setTituloGrupo(String tituloGrupo) {
		this.tituloGrupo = tituloGrupo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void graficar(ArrayList<Grupo> grupos) {
		try {
			
			/*
			 * Se mando a llamar la libreria de aspose.cells para poder mandar a llamar a Excel
			 */
			
			// Se crea una instancia de la clase Workbook
			Workbook workbook = new Workbook();
	
			Worksheet worksheet = workbook.getWorksheets().get(0);
			worksheet.getCells().setColumnWidth(0, 22);

			
			worksheet.getCells().get("A1").putValue(tituloGrupo);	
			worksheet.getCells().get("B1").putValue("Cantidad");
			
			for(int i=0; i<grupos.size(); i ++) {
				Grupo grupito = grupos.get(i);
				
				System.out.println (grupito.getNombre());
				System.out.println(grupito.getValor());
				
				worksheet.getCells().get("A"+ (i + 2)).putValue(grupito.getNombre());
				worksheet.getCells().get("B"+ (i + 2)).putValue(grupito.getValor());
				
			}
			
			// Se agrega una tabla a la worksheet
			int chartIndex = worksheet.getCharts().add(ChartType.COLUMN, 2, 3, 30, 16);
	
			// Se accede a la instancia de la tabla recien agregada
			Chart chart = worksheet.getCharts().get(chartIndex);
	
			// Se declara el rango de la tabla
			chart.setChartDataRange("A1:B9", true);
			chart.getTitle().setText(titulo);
			
			workbook.save(nombreArchivo + ".xlsx", SaveFormat.XLSX);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void graficar(ArrayList<Grupo> gruposA, ArrayList<Grupo> gruposB) {
		try {
			/*
			 * Se manda a llamar la libreria de aspose.cells para poder mandar a llamar a Excel
			 */
			
			// Se crea una instancia de la clase Workbook
			Workbook workbook = new Workbook();
			ArrayList<Grupo> grupos;
			for(int j = 0; j < 2; j++) {
				if (j==0) {
					grupos = gruposA;
					tituloGrupo = "Rango de edades";
					titulo = "Gr\u00e1fica de edades";
				}
				else {
					grupos = gruposB;
					tituloGrupo = "Rango de sueldos";
					titulo = "Gr\u00e1fica de sueldos";
					workbook.getWorksheets().add();	
				}
				
				
				Worksheet worksheet = workbook.getWorksheets().get(j);
				worksheet.getCells().setColumnWidth(0, 22);
				worksheet.setName(titulo);
				
				worksheet.getCells().get("A1").putValue(tituloGrupo);	
				worksheet.getCells().get("B1").putValue("Cantidad");
				
				for(int i=0; i<grupos.size(); i ++) {
					Grupo grupito = grupos.get(i);
					
					System.out.println (grupito.getNombre());
					System.out.println(grupito.getValor());
					
					worksheet.getCells().get("A"+ (i + 2)).putValue(grupito.getNombre());
					worksheet.getCells().get("B"+ (i + 2)).putValue(grupito.getValor());
					
				}
				
				// Se agrega una tabla a la worksheet
				int chartIndex = worksheet.getCharts().add(ChartType.COLUMN, 2, 3, 30, 16);
		
				// Se accede a la instancia de la tabla recien agregada
				Chart chart = worksheet.getCharts().get(chartIndex);
		
				// Declarar el rango de la tabla
				chart.setChartDataRange("A1:B9", true);
				chart.getTitle().setText(titulo);
			}
			workbook.save(nombreArchivo + ".xlsx", SaveFormat.XLSX);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
