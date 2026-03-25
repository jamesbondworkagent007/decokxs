package com.okinc.biz.statistics.db;

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
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C6942aYr;
import o.InterfaceC6944aYt;

/* JADX INFO: loaded from: classes23.dex */
public final class ReportDatabase_Impl extends ReportDatabase {
    public volatile InterfaceC6944aYt OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(3, "f36ab62bdc89ee5a9002586c5e74c07a", "34f96b540cbafce853f5ecdc09e5f133") { // from class: com.okinc.biz.statistics.db.ReportDatabase_Impl.1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `event_info` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `event_name` TEXT, `event_params` TEXT)");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f36ab62bdc89ee5a9002586c5e74c07a')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `event_info`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                ReportDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(3);
                map.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, 1));
                map.put(MTAnalysisConstants.EVENT_NAME, new TableInfo.Column(MTAnalysisConstants.EVENT_NAME, "TEXT", false, 0, null, 1));
                map.put("event_params", new TableInfo.Column("event_params", "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("event_info", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "event_info");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "event_info(com.okinc.biz.statistics.data.bean.EventInfo).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "event_info");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "event_info");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC6944aYt.class, C6942aYr.KWHzl());
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

    @Override // com.okinc.biz.statistics.db.ReportDatabase
    public InterfaceC6944aYt KWHzl() {
        InterfaceC6944aYt interfaceC6944aYt;
        if (this.OLrzqt != null) {
            return this.OLrzqt;
        }
        synchronized (this) {
            if (this.OLrzqt == null) {
                this.OLrzqt = new C6942aYr(this);
            }
            interfaceC6944aYt = this.OLrzqt;
        }
        return interfaceC6944aYt;
    }
}
