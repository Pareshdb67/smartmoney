package app.wallet.smartmoney.model;


public class LanguageMasterData {

    public LanguageMasterData() {

    }

    public String _id;
    public String company_id = null;
    public Long created_date = System.currentTimeMillis() / 1000L;
    public String created_by = null;
    public Long updated_date = null;
    public String updated_by = null;
    public Boolean is_active = null;
    public Boolean is_deleted = null;
    public String language_code = null;
    public String language_name = null;
    public String csv_sample_file_path = null;
    public String csv_actual_file_path = null;
    public String translated_json_file_path = null;
    public Integer user_app_type = null;
}
