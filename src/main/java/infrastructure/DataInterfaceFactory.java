package infrastructure;

public class DataInterfaceFactory {
  public static DataInterface getDataInterface(String dataType){
    if (dataType.equalsIgnoreCase("SHEET")){
      return new GSpreadSheetDataInterfaceImpl();
    }else{
      throw new UnsupportedOperationException("The only supported data interface is google sheets for the moment.");
    }
  }
}
