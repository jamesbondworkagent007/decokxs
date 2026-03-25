package com.okinc.market.alert.database;

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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C38370pWg;
import o.InterfaceC38367pWd;

/* JADX INFO: loaded from: classes23.dex */
public final class MarketAlertDataBase_Impl extends MarketAlertDataBase {
    public volatile InterfaceC38367pWd OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(2, "3b47cc6a45c73fb8e283ff592e60046c", "f7d95a5ade3a6dd91ea30089045089dc") { // from class: com.okinc.market.alert.database.MarketAlertDataBase_Impl.3
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `MarketUserAlert` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `instId` TEXT NOT NULL, `userId` TEXT NOT NULL, `instType` TEXT NOT NULL, `createTime` INTEGER NOT NULL, `ruleId` TEXT NOT NULL, `chainId` TEXT NOT NULL, `tokenAddress` TEXT NOT NULL)");
                SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_MarketUserAlert_ruleId` ON `MarketUserAlert` (`ruleId`)");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_MarketUserAlert_instId` ON `MarketUserAlert` (`instId`)");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_MarketUserAlert_userId` ON `MarketUserAlert` (`userId`)");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3b47cc6a45c73fb8e283ff592e60046c')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `MarketUserAlert`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                MarketAlertDataBase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(8);
                map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map.put("instId", new TableInfo.Column("instId", "TEXT", true, 0, null, 1));
                map.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                map.put("instType", new TableInfo.Column("instType", "TEXT", true, 0, null, 1));
                map.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, 1));
                map.put("ruleId", new TableInfo.Column("ruleId", "TEXT", true, 0, null, 1));
                map.put("chainId", new TableInfo.Column("chainId", "TEXT", true, 0, null, 1));
                map.put("tokenAddress", new TableInfo.Column("tokenAddress", "TEXT", true, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(3);
                hashSet2.add(new TableInfo.Index("index_MarketUserAlert_ruleId", true, Arrays.asList("ruleId"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_MarketUserAlert_instId", false, Arrays.asList("instId"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_MarketUserAlert_userId", false, Arrays.asList("userId"), Arrays.asList("ASC")));
                TableInfo tableInfo = new TableInfo("MarketUserAlert", map, hashSet, hashSet2);
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "MarketUserAlert");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "MarketUserAlert(com.okinc.market.alert.data.MarketUserAlert).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "MarketUserAlert");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "MarketUserAlert");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC38367pWd.class, C38370pWg.OLrzqt());
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

    @Override // com.okinc.market.alert.database.MarketAlertDataBase
    public InterfaceC38367pWd copydefault() {
        InterfaceC38367pWd interfaceC38367pWd;
        if (this.OLrzqt != null) {
            return this.OLrzqt;
        }
        synchronized (this) {
            if (this.OLrzqt == null) {
                this.OLrzqt = new C38370pWg(this);
            }
            interfaceC38367pWd = this.OLrzqt;
        }
        return interfaceC38367pWd;
    }
}
