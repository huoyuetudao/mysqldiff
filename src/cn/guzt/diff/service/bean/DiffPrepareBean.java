package cn.guzt.diff.service.bean;


import cn.guzt.diff.util.mybatis.bean.DbProperties;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class DiffPrepareBean implements Serializable {

    private static final long serialVersionUID = 3496678422493861606L;

    private List<JSONObject> originalRow; // 数据库对象列表

    private DbProperties db;

    /**
     * 数据库对象列表 （ 唯一标识 : List<JSONObject>originalRow ） 唯一标识参见 {@link cn.guzt.diff.properties.Constant}
     */
    private Map<String, JSONObject> targetMapRow;

    private List<String> targetRowKey; // 数据库对象唯一标识列表

    public List<JSONObject> getOriginalRow() {
        return originalRow;
    }

    public void setOriginalRow(List<JSONObject> originalRow) {
        this.originalRow = originalRow;
    }

    public Map<String, JSONObject> getTargetMapRow() {
        return targetMapRow;
    }

    public void setTargetMapRow(Map<String, JSONObject> targetMapRow) {
        this.targetMapRow = targetMapRow;
    }

    public List<String> getTargetRowKey() {
        return targetRowKey;
    }

    public void setTargetRowKey(List<String> targetRowKey) {
        this.targetRowKey = targetRowKey;
    }

    public DbProperties getDb() {
        return db;
    }

    public void setDb(DbProperties db) {
        this.db = db;
    }
}
