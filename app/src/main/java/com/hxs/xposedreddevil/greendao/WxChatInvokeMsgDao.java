package com.hxs.xposedreddevil.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WX_CHAT_INVOKE_MSG".
*/
public class WxChatInvokeMsgDao extends AbstractDao<WxChatInvokeMsg, String> {

    public static final String TABLENAME = "WX_CHAT_INVOKE_MSG";

    /**
     * Properties of entity WxChatInvokeMsg.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property MsgId = new Property(0, String.class, "msgId", true, "MSG_ID");
        public final static Property MsgSeq = new Property(1, String.class, "msgSeq", false, "MSG_SEQ");
        public final static Property CreateTime = new Property(2, String.class, "createTime", false, "CREATE_TIME");
    }


    public WxChatInvokeMsgDao(DaoConfig config) {
        super(config);
    }
    
    public WxChatInvokeMsgDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WX_CHAT_INVOKE_MSG\" (" + //
                "\"MSG_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: msgId
                "\"MSG_SEQ\" TEXT," + // 1: msgSeq
                "\"CREATE_TIME\" TEXT);"); // 2: createTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WX_CHAT_INVOKE_MSG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WxChatInvokeMsg entity) {
        stmt.clearBindings();
 
        String msgId = entity.getMsgId();
        if (msgId != null) {
            stmt.bindString(1, msgId);
        }
 
        String msgSeq = entity.getMsgSeq();
        if (msgSeq != null) {
            stmt.bindString(2, msgSeq);
        }
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(3, createTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WxChatInvokeMsg entity) {
        stmt.clearBindings();
 
        String msgId = entity.getMsgId();
        if (msgId != null) {
            stmt.bindString(1, msgId);
        }
 
        String msgSeq = entity.getMsgSeq();
        if (msgSeq != null) {
            stmt.bindString(2, msgSeq);
        }
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(3, createTime);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public WxChatInvokeMsg readEntity(Cursor cursor, int offset) {
        WxChatInvokeMsg entity = new WxChatInvokeMsg( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // msgId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // msgSeq
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // createTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WxChatInvokeMsg entity, int offset) {
        entity.setMsgId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setMsgSeq(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCreateTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final String updateKeyAfterInsert(WxChatInvokeMsg entity, long rowId) {
        return entity.getMsgId();
    }
    
    @Override
    public String getKey(WxChatInvokeMsg entity) {
        if(entity != null) {
            return entity.getMsgId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(WxChatInvokeMsg entity) {
        return entity.getMsgId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}