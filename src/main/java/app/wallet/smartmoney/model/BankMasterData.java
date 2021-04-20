package app.wallet.smartmoney.model;

import java.util.HashMap;

public class BankMasterData {

    public BankMasterData() {
    }

    public String _id;
    public String company_id = null;
    public Boolean is_active = true;
    public Boolean is_deleted = false;
    public Long created_date = System.currentTimeMillis() / 1000;
    public String created_by = null;
    public Long updated_date = null;
    public String updated_by = null;
    public String bank_name = null;
    public String bank_image = null;
    public HashMap<String, Object> bank_code = null;
}