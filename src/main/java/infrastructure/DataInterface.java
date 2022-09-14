package infrastructure;

import java.util.List;

public interface DataInterface {
  List<Object> getColumnByName(String colName);

  List<Object> getRowByIdx(int idx);

  List<List<Object>> getRows();

  void setByColumnNameAndIdx(String colName, int idx);

  Object getByColumnNameAndIdx(String colName, int idx);
}
