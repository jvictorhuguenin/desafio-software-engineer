package infrastructure;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.SheetsScopes;
import java.util.Collections;
import java.util.List;

public class ExcelDataInterfaceImpl implements DataInterface{
  // three rows with data that doesn't belong to user, or are metadata, like field titles.
  private final static Integer dataOffSet = 3;

  private static final String APPLICATION_NAME = "Students scores evaluator";
  private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
  private static final String TOKENS_DIRECTORY_PATH = "tokens";

  private static final List<String> SCOPES =
      Collections.singletonList(SheetsScopes.SPREADSHEETS);
  private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

  @Override
  public List<Object> getColumnByName(String colName) {
    return null;
  }

  @Override
  public List<Object> getRowByIdx(int idx) {
    return null;
  }

  @Override
  public List<List<Object>> getRows() {
    return null;
  }

  @Override
  public void setByColumnNameAndIdx(String colName, int idx) {

  }

  @Override
  public Object getByColumnNameAndIdx(String colName, int idx) {
    return null;
  }
}
