package atua.anddev.globaltv.database.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

import atua.anddev.globaltv.entity.Channel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHANNEL".
*/
public class ChannelDao extends AbstractDao<Channel, Long> {

    public static final String TABLENAME = "CHANNEL";

    /**
     * Properties of entity Channel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Url = new Property(2, String.class, "url", false, "URL");
        public final static Property Category = new Property(3, String.class, "category", false, "CATEGORY");
        public final static Property Icon = new Property(4, String.class, "icon", false, "ICON");
        public final static Property Provider = new Property(5, String.class, "provider", false, "PROVIDER");
    }


    public ChannelDao(DaoConfig config) {
        super(config);
    }
    
    public ChannelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHANNEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"URL\" TEXT," + // 2: url
                "\"CATEGORY\" TEXT," + // 3: category
                "\"ICON\" TEXT," + // 4: icon
                "\"PROVIDER\" TEXT);"); // 5: provider
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHANNEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Channel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(3, url);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(4, category);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(5, icon);
        }
 
        String provider = entity.getProvider();
        if (provider != null) {
            stmt.bindString(6, provider);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Channel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(3, url);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(4, category);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(5, icon);
        }
 
        String provider = entity.getProvider();
        if (provider != null) {
            stmt.bindString(6, provider);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Channel readEntity(Cursor cursor, int offset) {
        Channel entity = new Channel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // url
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // category
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // icon
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // provider
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Channel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCategory(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIcon(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setProvider(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Channel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Channel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Channel entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
