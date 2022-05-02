/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdatabase.Controller;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import projectdatabase.Query.UserQuery;
import projectdatabase.Helper.UserHelper;
/**
 *
 * @author USER
 */
public class MainController extends BaseController{
UserQuery query = new UserQuery();
UserHelper helper = new UserHelper();


    public ResultSet get() {
        String sql = this.query.get;
        return this.get(sql);
    }
    
    
    public ResultSet showByTitle(String title) {
        String sql = this.query.showByTitle;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(title));
        
        return this.getWithParameter(map, sql);
    }
public ResultSet showByArtist(String artist) {
        String sql = this.query.showByArtist;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(artist));
        
        return this.getWithParameter(map, sql);
    }
public ResultSet showByYear(String year) {
        String sql = this.query.showByYears;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(year));
        
        return this.getWithParameter(map, sql);
    }
    public ResultSet showByPrice(String price) {
        String sql = this.query.showByPrice;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, price);
        
        return this.getWithParameter(map, sql);
    }
    public ResultSet showByStock(String stock) {
        String sql = this.query.showByStock;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, stock);
        
        return this.getWithParameter(map, sql);
        
    }
}