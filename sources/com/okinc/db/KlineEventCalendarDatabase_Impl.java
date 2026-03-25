package com.okinc.db;

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
import o.mJB;
import o.mJC;

/* JADX INFO: loaded from: classes23.dex */
public final class KlineEventCalendarDatabase_Impl extends KlineEventCalendarDatabase {
    public volatile mJB KWHzl;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(1, "b8455332de11d93ab106396fec58a7f9", "7d8ba362cda5490c360e0d491e12ca41") { // from class: com.okinc.db.KlineEventCalendarDatabase_Impl.1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `kline_event_calendar_data` (`calendarId` TEXT NOT NULL, `eventId` INTEGER NOT NULL, `eventDate` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, PRIMARY KEY(`calendarId`))");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b8455332de11d93ab106396fec58a7f9')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `kline_event_calendar_data`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                KlineEventCalendarDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(5);
                map.put("calendarId", new TableInfo.Column("calendarId", "TEXT", true, 1, null, 1));
                map.put("eventId", new TableInfo.Column("eventId", "INTEGER", true, 0, null, 1));
                map.put("eventDate", new TableInfo.Column("eventDate", "INTEGER", true, 0, null, 1));
                map.put("startTime", new TableInfo.Column("startTime", "INTEGER", true, 0, null, 1));
                map.put("endTime", new TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("kline_event_calendar_data", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "kline_event_calendar_data");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "kline_event_calendar_data(com.okinc.kline.api.bean.KlineEventCalendarEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "kline_event_calendar_data");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "kline_event_calendar_data");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(mJB.class, mJC.OLrzqt());
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

    @Override // com.okinc.db.KlineEventCalendarDatabase
    public mJB copydefault() {
        mJB mjb;
        if (this.KWHzl != null) {
            return this.KWHzl;
        }
        synchronized (this) {
            if (this.KWHzl == null) {
                this.KWHzl = new mJC(this);
            }
            mjb = this.KWHzl;
        }
        return mjb;
    }
}
