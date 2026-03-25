package com.okinc.business.defi.biz.database.addressbook;

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
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.cGQ;
import o.cGT;
import o.cGW;
import o.cGY;

/* JADX INFO: loaded from: classes23.dex */
public final class WalletAddressBookDatabase_Impl extends WalletAddressBookDatabase {
    public volatile cGT AEQbTJ;
    public volatile cGW copydefault;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(2, "5573fd47e62b3499869257f496f04899", "373716db58e84d599939602f1bbe17d9") { // from class: com.okinc.business.defi.biz.database.addressbook.WalletAddressBookDatabase_Impl.4
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `address_book` (`name` TEXT NOT NULL, `address` TEXT NOT NULL, `chainNames` TEXT NOT NULL, `chainUrls` TEXT NOT NULL, `createTime` INTEGER NOT NULL, `updateTime` INTEGER NOT NULL, `smartContract` INTEGER NOT NULL, PRIMARY KEY(`address`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `send_coin_record` (`address` TEXT NOT NULL, `chainId` TEXT NOT NULL, `chainName` TEXT NOT NULL, `walletId` TEXT NOT NULL, `chainUrl` TEXT NOT NULL, `createTime` INTEGER NOT NULL, `smartContract` INTEGER NOT NULL, PRIMARY KEY(`address`))");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5573fd47e62b3499869257f496f04899')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `address_book`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `send_coin_record`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                WalletAddressBookDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(7);
                map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, new TableInfo.Column(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "TEXT", true, 1, null, 1));
                map.put("chainNames", new TableInfo.Column("chainNames", "TEXT", true, 0, null, 1));
                map.put("chainUrls", new TableInfo.Column("chainUrls", "TEXT", true, 0, null, 1));
                map.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, 1));
                map.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, 1));
                map.put("smartContract", new TableInfo.Column("smartContract", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("address_book", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "address_book");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "address_book(com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(7);
                map2.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, new TableInfo.Column(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "TEXT", true, 1, null, 1));
                map2.put("chainId", new TableInfo.Column("chainId", "TEXT", true, 0, null, 1));
                map2.put("chainName", new TableInfo.Column("chainName", "TEXT", true, 0, null, 1));
                map2.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 0, null, 1));
                map2.put("chainUrl", new TableInfo.Column("chainUrl", "TEXT", true, 0, null, 1));
                map2.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, 1));
                map2.put("smartContract", new TableInfo.Column("smartContract", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("send_coin_record", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "send_coin_record");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "send_coin_record(com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "address_book", "send_coin_record");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "address_book", "send_coin_record");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(cGT.class, cGQ.KWHzl());
        map.put(cGW.class, cGY.OLrzqt());
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

    @Override // com.okinc.business.defi.biz.database.addressbook.WalletAddressBookDatabase
    public cGT KWHzl() {
        cGT cgt;
        if (this.AEQbTJ != null) {
            return this.AEQbTJ;
        }
        synchronized (this) {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new cGQ(this);
            }
            cgt = this.AEQbTJ;
        }
        return cgt;
    }

    @Override // com.okinc.business.defi.biz.database.addressbook.WalletAddressBookDatabase
    public cGW EZpvd() {
        cGW cgw;
        if (this.copydefault != null) {
            return this.copydefault;
        }
        synchronized (this) {
            if (this.copydefault == null) {
                this.copydefault = new cGY(this);
            }
            cgw = this.copydefault;
        }
        return cgw;
    }
}
