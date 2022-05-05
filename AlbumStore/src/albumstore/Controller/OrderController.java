/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Controller;

import albumstore.Helper.Helper;
import albumstore.Model.AdminModel;
import albumstore.Query.OrderQuery;
import albumstore.Query.UserQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author USER
 */
public class OrderController extends BaseController {
OrderQuery oq = new OrderQuery();
UserQuery uq = new UserQuery();
AdminModel model = new AdminModel();
Helper helper = new Helper();

    public ResultSet get() {
        String sql = this.oq.get;
        return this.get(sql);
    }
    
    public ResultSet showByTitle(String title) {
        String sql = this.oq.showByTitle;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, title);
        
        return this.getWithParameter(map, sql);
    }
    
    public ResultSet showByType(String type) {
        String sql = this.oq.showByType;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, this.oq.showByType);
        
        return this.getWithParameter(map, sql);
    }
public boolean create(AdminModel model) throws ParseException {
        //ID nya belomm
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.get());
        map.put(2, model.getTitle());
        map.put(3, model.getPrice());
        map.put(4, model.getAmount());
        
        String sql = this.uq.create;
        
        return this.preparedStatement(map, sql);
    }
}
