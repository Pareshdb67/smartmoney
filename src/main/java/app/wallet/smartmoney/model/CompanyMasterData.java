package app.wallet.smartmoney.model;

public class CompanyMasterData {

    public CompanyMasterData() {
    }

    public String _id;
    public Boolean is_deleted;
    public Boolean is_active;
    public String company_name = null;
    public String email = null;
    public String dial_code = null;
    public Long phone_number = null;
    public Long toll_free_number = null;
    public String address = null;
    public String postal_code = null;
    public String country_id = null;
    public Long created_date = System.currentTimeMillis() / 1000L;
    public String created_by = null;
    public Long updated_date = null;
    public String updated_by = null;
    public String subdomain = null;
    public String parent_id = null;
    public String domain = null;
    public String currency = null;
    public String timezone = null;
    public String language = null;
    public Integer date_format = null;
    public Integer time_format = null;
    public String city_id = null;
    public Integer fuel_unit = null;
    public String state_id = null;
    public Integer postal_code_type;
}
