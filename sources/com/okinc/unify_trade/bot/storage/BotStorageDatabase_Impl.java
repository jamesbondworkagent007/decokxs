package com.okinc.unify_trade.bot.storage;

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
import o.C55985xuK;
import o.InterfaceC55986xuL;

/* JADX INFO: loaded from: classes24.dex */
public final class BotStorageDatabase_Impl extends BotStorageDatabase {
    public volatile InterfaceC55986xuL copydefault;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(1, "c198889aca31081d7e985a78c8bdce74", "f28f20de8ce0bb2a72b105d96e7ea9e3") { // from class: com.okinc.unify_trade.bot.storage.BotStorageDatabase_Impl.5
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `coin_margined_contract_profit_display` (`algoId` TEXT NOT NULL, `selectedDisplay` INTEGER NOT NULL, `lastUpdated` INTEGER NOT NULL, PRIMARY KEY(`algoId`))");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c198889aca31081d7e985a78c8bdce74')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `coin_margined_contract_profit_display`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                BotStorageDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(3);
                map.put("algoId", new TableInfo.Column("algoId", "TEXT", true, 1, null, 1));
                map.put("selectedDisplay", new TableInfo.Column("selectedDisplay", "INTEGER", true, 0, null, 1));
                map.put("lastUpdated", new TableInfo.Column("lastUpdated", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("coin_margined_contract_profit_display", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "coin_margined_contract_profit_display");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "coin_margined_contract_profit_display(com.okinc.unify_trade.bot.storage.CoinMarginedContractProfitDisplayEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "coin_margined_contract_profit_display");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "coin_margined_contract_profit_display");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC55986xuL.class, C55985xuK.KWHzl());
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

    @Override // com.okinc.unify_trade.bot.storage.BotStorageDatabase
    public InterfaceC55986xuL AEQbTJ() {
        InterfaceC55986xuL interfaceC55986xuL;
        if (this.copydefault != null) {
            return this.copydefault;
        }
        synchronized (this) {
            if (this.copydefault == null) {
                this.copydefault = new C55985xuK(this);
            }
            interfaceC55986xuL = this.copydefault;
        }
        return interfaceC55986xuL;
    }
}
