package com.okinc.localization.report.db;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C38298pTp;
import o.InterfaceC38295pTm;

/* JADX INFO: loaded from: classes23.dex */
public final class UsedSourceDataBase_Impl extends UsedSourceDataBase {
    public volatile InterfaceC38295pTm EZpvd;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(3, "3913939f6ff14f409e942efaf77f7ffe", "948406674f6b55bb1c8f0749ea610194") { // from class: com.okinc.localization.report.db.UsedSourceDataBase_Impl.3
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `used_source` (`type` TEXT NOT NULL, `value` TEXT NOT NULL, `is_upload` INTEGER NOT NULL, `app_version` TEXT NOT NULL, `ph_key_content` TEXT, `key_language` TEXT, `is_startup_key` INTEGER NOT NULL, PRIMARY KEY(`value`))");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3913939f6ff14f409e942efaf77f7ffe')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `used_source`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                UsedSourceDataBase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(7);
                map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                map.put("value", new TableInfo.Column("value", "TEXT", true, 1, null, 1));
                map.put("is_upload", new TableInfo.Column("is_upload", "INTEGER", true, 0, null, 1));
                map.put("app_version", new TableInfo.Column("app_version", "TEXT", true, 0, null, 1));
                map.put("ph_key_content", new TableInfo.Column("ph_key_content", "TEXT", false, 0, null, 1));
                map.put("key_language", new TableInfo.Column("key_language", "TEXT", false, 0, null, 1));
                map.put("is_startup_key", new TableInfo.Column("is_startup_key", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("used_source", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "used_source");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "used_source(com.okinc.localization.report.db.UsedSource).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "used_source");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "used_source");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC38295pTm.class, C38298pTp.KWHzl());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // com.okinc.localization.report.db.UsedSourceDataBase
    public InterfaceC38295pTm EZpvd() {
        InterfaceC38295pTm interfaceC38295pTm;
        if (this.EZpvd != null) {
            return this.EZpvd;
        }
        synchronized (this) {
            if (this.EZpvd == null) {
                this.EZpvd = new C38298pTp(this);
            }
            interfaceC38295pTm = this.EZpvd;
        }
        return interfaceC38295pTm;
    }
}
