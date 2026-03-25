package com.okinc.components.report.db;

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
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C32709mih;
import o.InterfaceC32710mii;

/* JADX INFO: loaded from: classes23.dex */
public final class ReportEventDataBase_Impl extends ReportEventDataBase {
    public volatile InterfaceC32710mii OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(1, "5c8a1f1976f1338a1ae009e55431ac60", "93c792c8763c7e789ef6d6f7e3a82f97") { // from class: com.okinc.components.report.db.ReportEventDataBase_Impl.2
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `report_event_data` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `footprintId` TEXT, `act` TEXT, `source` TEXT, `time` INTEGER, `path` TEXT, `code` TEXT, `msg` TEXT, `env` TEXT, `attrs` TEXT)");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5c8a1f1976f1338a1ae009e55431ac60')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `report_event_data`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                ReportEventDataBase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(10);
                map.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, 1));
                map.put("footprintId", new TableInfo.Column("footprintId", "TEXT", false, 0, null, 1));
                map.put("act", new TableInfo.Column("act", "TEXT", false, 0, null, 1));
                map.put("source", new TableInfo.Column("source", "TEXT", false, 0, null, 1));
                map.put(CrashHianalyticsData.TIME, new TableInfo.Column(CrashHianalyticsData.TIME, "INTEGER", false, 0, null, 1));
                map.put("path", new TableInfo.Column("path", "TEXT", false, 0, null, 1));
                map.put("code", new TableInfo.Column("code", "TEXT", false, 0, null, 1));
                map.put("msg", new TableInfo.Column("msg", "TEXT", false, 0, null, 1));
                map.put("env", new TableInfo.Column("env", "TEXT", false, 0, null, 1));
                map.put("attrs", new TableInfo.Column("attrs", "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("report_event_data", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "report_event_data");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "report_event_data(com.okinc.components.report.db.EventData).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "report_event_data");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "report_event_data");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC32710mii.class, C32709mih.AEQbTJ());
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

    @Override // com.okinc.components.report.db.ReportEventDataBase
    public InterfaceC32710mii OLrzqt() {
        InterfaceC32710mii interfaceC32710mii;
        if (this.OLrzqt != null) {
            return this.OLrzqt;
        }
        synchronized (this) {
            if (this.OLrzqt == null) {
                this.OLrzqt = new C32709mih(this);
            }
            interfaceC32710mii = this.OLrzqt;
        }
        return interfaceC32710mii;
    }
}
