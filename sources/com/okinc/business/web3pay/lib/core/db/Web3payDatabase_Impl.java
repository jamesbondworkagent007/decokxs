package com.okinc.business.web3pay.lib.core.db;

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
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C31243lqO;
import o.C31259lqe;
import o.C31261lqg;
import o.C31262lqh;
import o.C31288lrG;
import o.InterfaceC31244lqP;
import o.InterfaceC31289lrH;

/* JADX INFO: loaded from: classes23.dex */
public final class Web3payDatabase_Impl extends Web3payDatabase {
    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(4, "4edbdd0dc14b1280bf64023c12d18692", "7d5b3c161bd7d1a96531b50a6b8912ea") { // from class: com.okinc.business.web3pay.lib.core.db.Web3payDatabase_Impl.3
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pay_order` (`key` TEXT NOT NULL, `index` INTEGER NOT NULL, `orderId` TEXT NOT NULL, `orderType` INTEGER NOT NULL, `chainIndex` TEXT NOT NULL, `tokenSymbol` TEXT NOT NULL, `tokenAddress` TEXT, `tokenAmount` TEXT NOT NULL, `currencyAmount` TEXT NOT NULL, `tokenDecimal` INTEGER NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `areaCode` TEXT, `status` INTEGER NOT NULL, `createTime` INTEGER NOT NULL, `receiverType` INTEGER, PRIMARY KEY(`key`, `orderId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pay_order_cache` (`key` TEXT NOT NULL, `nextCursor` TEXT NOT NULL, PRIMARY KEY(`key`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pending_claim_order` (`key` TEXT NOT NULL, `index` INTEGER NOT NULL, `orderId` TEXT NOT NULL, `from` TEXT NOT NULL, `avatar` TEXT, `comment` TEXT, `tokenLogo` TEXT NOT NULL, `chainIndex` TEXT NOT NULL, `tokenAmount` TEXT NOT NULL, `tokenDecimal` INTEGER NOT NULL, `tokenSymbol` TEXT NOT NULL, `tokenAddress` TEXT NOT NULL, `usdAmount` TEXT NOT NULL, `createTime` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`key`, `orderId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pending_claim_order_cache` (`key` TEXT NOT NULL, `nextCursor` TEXT NOT NULL, `total` TEXT NOT NULL, PRIMARY KEY(`key`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `web3pay_recent_contact` (`key` TEXT NOT NULL, `contactId` INTEGER, `contactName` TEXT NOT NULL, `contactAvatar` TEXT, `contactDisplay` TEXT NOT NULL, `contactInfo` TEXT NOT NULL, `contactType` TEXT NOT NULL, `createdTime` INTEGER NOT NULL, PRIMARY KEY(`key`, `contactInfo`, `contactType`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transaction_order_for_token` (`key` TEXT NOT NULL, `requestChainIndex` TEXT NOT NULL, `requestTokenCoinTypeNo` TEXT NOT NULL, `index` INTEGER NOT NULL, `orderId` TEXT NOT NULL, `orderType` INTEGER NOT NULL, `merchantId` TEXT, `productCode` TEXT, `tokenSymbol` TEXT NOT NULL, `tokenDecimal` INTEGER NOT NULL, `chainIndex` TEXT NOT NULL, `tokenAddress` TEXT, `tokenAmount` TEXT NOT NULL, `currencyAmount` TEXT NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `areaCode` TEXT, `status` INTEGER NOT NULL, `createTime` INTEGER NOT NULL, `receiverType` INTEGER, `subStatus` INTEGER, `tokenCoinTypeNo` TEXT NOT NULL, `convertInfo` TEXT, PRIMARY KEY(`key`, `requestChainIndex`, `requestTokenCoinTypeNo`, `orderId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transaction_order_for_token_cache` (`key` TEXT NOT NULL, `chainIndex` TEXT NOT NULL, `tokenCoinTypeNo` TEXT NOT NULL, `nextCursor` TEXT NOT NULL, PRIMARY KEY(`key`, `chainIndex`, `tokenCoinTypeNo`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transaction_order` (`key` TEXT NOT NULL, `index` INTEGER NOT NULL, `orderId` TEXT NOT NULL, `orderType` INTEGER NOT NULL, `merchantId` TEXT, `productCode` TEXT, `tokenSymbol` TEXT NOT NULL, `tokenDecimal` INTEGER NOT NULL, `chainIndex` TEXT NOT NULL, `tokenAddress` TEXT, `tokenAmount` TEXT NOT NULL, `currencyAmount` TEXT NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `areaCode` TEXT, `status` INTEGER NOT NULL, `createTime` INTEGER NOT NULL, `receiverType` INTEGER, `subStatus` INTEGER, `tokenCoinTypeNo` TEXT NOT NULL, `convertInfo` TEXT, PRIMARY KEY(`key`, `orderId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transaction_order_cache` (`key` TEXT NOT NULL, `nextCursor` TEXT NOT NULL, PRIMARY KEY(`key`))");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4edbdd0dc14b1280bf64023c12d18692')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pay_order`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pay_order_cache`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pending_claim_order`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pending_claim_order_cache`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `web3pay_recent_contact`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `transaction_order_for_token`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `transaction_order_for_token_cache`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `transaction_order`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `transaction_order_cache`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                Web3payDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(16);
                map.put(JwtUtilsKt.DID_METHOD_KEY, new TableInfo.Column(JwtUtilsKt.DID_METHOD_KEY, "TEXT", true, 1, null, 1));
                map.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
                map.put("orderId", new TableInfo.Column("orderId", "TEXT", true, 2, null, 1));
                map.put("orderType", new TableInfo.Column("orderType", "INTEGER", true, 0, null, 1));
                map.put("chainIndex", new TableInfo.Column("chainIndex", "TEXT", true, 0, null, 1));
                map.put("tokenSymbol", new TableInfo.Column("tokenSymbol", "TEXT", true, 0, null, 1));
                map.put("tokenAddress", new TableInfo.Column("tokenAddress", "TEXT", false, 0, null, 1));
                map.put("tokenAmount", new TableInfo.Column("tokenAmount", "TEXT", true, 0, null, 1));
                map.put("currencyAmount", new TableInfo.Column("currencyAmount", "TEXT", true, 0, null, 1));
                map.put("tokenDecimal", new TableInfo.Column("tokenDecimal", "INTEGER", true, 0, null, 1));
                map.put("from", new TableInfo.Column("from", "TEXT", true, 0, null, 1));
                map.put("to", new TableInfo.Column("to", "TEXT", true, 0, null, 1));
                map.put("areaCode", new TableInfo.Column("areaCode", "TEXT", false, 0, null, 1));
                map.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                map.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, 1));
                map.put("receiverType", new TableInfo.Column("receiverType", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("pay_order", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "pay_order");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "pay_order(com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PayOrderEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(2);
                map2.put(JwtUtilsKt.DID_METHOD_KEY, new TableInfo.Column(JwtUtilsKt.DID_METHOD_KEY, "TEXT", true, 1, null, 1));
                map2.put("nextCursor", new TableInfo.Column("nextCursor", "TEXT", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("pay_order_cache", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "pay_order_cache");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "pay_order_cache(com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PayOrderCacheEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                HashMap map3 = new HashMap(15);
                map3.put(JwtUtilsKt.DID_METHOD_KEY, new TableInfo.Column(JwtUtilsKt.DID_METHOD_KEY, "TEXT", true, 1, null, 1));
                map3.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
                map3.put("orderId", new TableInfo.Column("orderId", "TEXT", true, 2, null, 1));
                map3.put("from", new TableInfo.Column("from", "TEXT", true, 0, null, 1));
                map3.put("avatar", new TableInfo.Column("avatar", "TEXT", false, 0, null, 1));
                map3.put("comment", new TableInfo.Column("comment", "TEXT", false, 0, null, 1));
                map3.put("tokenLogo", new TableInfo.Column("tokenLogo", "TEXT", true, 0, null, 1));
                map3.put("chainIndex", new TableInfo.Column("chainIndex", "TEXT", true, 0, null, 1));
                map3.put("tokenAmount", new TableInfo.Column("tokenAmount", "TEXT", true, 0, null, 1));
                map3.put("tokenDecimal", new TableInfo.Column("tokenDecimal", "INTEGER", true, 0, null, 1));
                map3.put("tokenSymbol", new TableInfo.Column("tokenSymbol", "TEXT", true, 0, null, 1));
                map3.put("tokenAddress", new TableInfo.Column("tokenAddress", "TEXT", true, 0, null, 1));
                map3.put("usdAmount", new TableInfo.Column("usdAmount", "TEXT", true, 0, null, 1));
                map3.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, 1));
                map3.put("uid", new TableInfo.Column("uid", "TEXT", true, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("pending_claim_order", map3, new HashSet(0), new HashSet(0));
                TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "pending_claim_order");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "pending_claim_order(com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PendingClaimOrderEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                HashMap map4 = new HashMap(3);
                map4.put(JwtUtilsKt.DID_METHOD_KEY, new TableInfo.Column(JwtUtilsKt.DID_METHOD_KEY, "TEXT", true, 1, null, 1));
                map4.put("nextCursor", new TableInfo.Column("nextCursor", "TEXT", true, 0, null, 1));
                map4.put("total", new TableInfo.Column("total", "TEXT", true, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("pending_claim_order_cache", map4, new HashSet(0), new HashSet(0));
                TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "pending_claim_order_cache");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(false, "pending_claim_order_cache(com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PendingClaimOrderCacheEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                HashMap map5 = new HashMap(8);
                map5.put(JwtUtilsKt.DID_METHOD_KEY, new TableInfo.Column(JwtUtilsKt.DID_METHOD_KEY, "TEXT", true, 1, null, 1));
                map5.put("contactId", new TableInfo.Column("contactId", "INTEGER", false, 0, null, 1));
                map5.put("contactName", new TableInfo.Column("contactName", "TEXT", true, 0, null, 1));
                map5.put("contactAvatar", new TableInfo.Column("contactAvatar", "TEXT", false, 0, null, 1));
                map5.put("contactDisplay", new TableInfo.Column("contactDisplay", "TEXT", true, 0, null, 1));
                map5.put("contactInfo", new TableInfo.Column("contactInfo", "TEXT", true, 2, null, 1));
                map5.put("contactType", new TableInfo.Column("contactType", "TEXT", true, 3, null, 1));
                map5.put("createdTime", new TableInfo.Column("createdTime", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo("web3pay_recent_contact", map5, new HashSet(0), new HashSet(0));
                TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "web3pay_recent_contact");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenDelegate.ValidationResult(false, "web3pay_recent_contact(com.okinc.business.web3pay.lib.features.contacts.data.entity.Web3PayRecentContactEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                HashMap map6 = new HashMap(23);
                map6.put(JwtUtilsKt.DID_METHOD_KEY, new TableInfo.Column(JwtUtilsKt.DID_METHOD_KEY, "TEXT", true, 1, null, 1));
                map6.put("requestChainIndex", new TableInfo.Column("requestChainIndex", "TEXT", true, 2, null, 1));
                map6.put("requestTokenCoinTypeNo", new TableInfo.Column("requestTokenCoinTypeNo", "TEXT", true, 3, null, 1));
                map6.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
                map6.put("orderId", new TableInfo.Column("orderId", "TEXT", true, 4, null, 1));
                map6.put("orderType", new TableInfo.Column("orderType", "INTEGER", true, 0, null, 1));
                map6.put("merchantId", new TableInfo.Column("merchantId", "TEXT", false, 0, null, 1));
                map6.put("productCode", new TableInfo.Column("productCode", "TEXT", false, 0, null, 1));
                map6.put("tokenSymbol", new TableInfo.Column("tokenSymbol", "TEXT", true, 0, null, 1));
                map6.put("tokenDecimal", new TableInfo.Column("tokenDecimal", "INTEGER", true, 0, null, 1));
                map6.put("chainIndex", new TableInfo.Column("chainIndex", "TEXT", true, 0, null, 1));
                map6.put("tokenAddress", new TableInfo.Column("tokenAddress", "TEXT", false, 0, null, 1));
                map6.put("tokenAmount", new TableInfo.Column("tokenAmount", "TEXT", true, 0, null, 1));
                map6.put("currencyAmount", new TableInfo.Column("currencyAmount", "TEXT", true, 0, null, 1));
                map6.put("from", new TableInfo.Column("from", "TEXT", true, 0, null, 1));
                map6.put("to", new TableInfo.Column("to", "TEXT", true, 0, null, 1));
                map6.put("areaCode", new TableInfo.Column("areaCode", "TEXT", false, 0, null, 1));
                map6.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                map6.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, 1));
                map6.put("receiverType", new TableInfo.Column("receiverType", "INTEGER", false, 0, null, 1));
                map6.put("subStatus", new TableInfo.Column("subStatus", "INTEGER", false, 0, null, 1));
                map6.put("tokenCoinTypeNo", new TableInfo.Column("tokenCoinTypeNo", "TEXT", true, 0, null, 1));
                map6.put("convertInfo", new TableInfo.Column("convertInfo", "TEXT", false, 0, null, 1));
                TableInfo tableInfo11 = new TableInfo("transaction_order_for_token", map6, new HashSet(0), new HashSet(0));
                TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "transaction_order_for_token");
                if (!tableInfo11.equals(tableInfo12)) {
                    return new RoomOpenDelegate.ValidationResult(false, "transaction_order_for_token(com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderForTokenEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
                }
                HashMap map7 = new HashMap(4);
                map7.put(JwtUtilsKt.DID_METHOD_KEY, new TableInfo.Column(JwtUtilsKt.DID_METHOD_KEY, "TEXT", true, 1, null, 1));
                map7.put("chainIndex", new TableInfo.Column("chainIndex", "TEXT", true, 2, null, 1));
                map7.put("tokenCoinTypeNo", new TableInfo.Column("tokenCoinTypeNo", "TEXT", true, 3, null, 1));
                map7.put("nextCursor", new TableInfo.Column("nextCursor", "TEXT", true, 0, null, 1));
                TableInfo tableInfo13 = new TableInfo("transaction_order_for_token_cache", map7, new HashSet(0), new HashSet(0));
                TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "transaction_order_for_token_cache");
                if (!tableInfo13.equals(tableInfo14)) {
                    return new RoomOpenDelegate.ValidationResult(false, "transaction_order_for_token_cache(com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderForTokenCacheEntity).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
                }
                HashMap map8 = new HashMap(21);
                map8.put(JwtUtilsKt.DID_METHOD_KEY, new TableInfo.Column(JwtUtilsKt.DID_METHOD_KEY, "TEXT", true, 1, null, 1));
                map8.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
                map8.put("orderId", new TableInfo.Column("orderId", "TEXT", true, 2, null, 1));
                map8.put("orderType", new TableInfo.Column("orderType", "INTEGER", true, 0, null, 1));
                map8.put("merchantId", new TableInfo.Column("merchantId", "TEXT", false, 0, null, 1));
                map8.put("productCode", new TableInfo.Column("productCode", "TEXT", false, 0, null, 1));
                map8.put("tokenSymbol", new TableInfo.Column("tokenSymbol", "TEXT", true, 0, null, 1));
                map8.put("tokenDecimal", new TableInfo.Column("tokenDecimal", "INTEGER", true, 0, null, 1));
                map8.put("chainIndex", new TableInfo.Column("chainIndex", "TEXT", true, 0, null, 1));
                map8.put("tokenAddress", new TableInfo.Column("tokenAddress", "TEXT", false, 0, null, 1));
                map8.put("tokenAmount", new TableInfo.Column("tokenAmount", "TEXT", true, 0, null, 1));
                map8.put("currencyAmount", new TableInfo.Column("currencyAmount", "TEXT", true, 0, null, 1));
                map8.put("from", new TableInfo.Column("from", "TEXT", true, 0, null, 1));
                map8.put("to", new TableInfo.Column("to", "TEXT", true, 0, null, 1));
                map8.put("areaCode", new TableInfo.Column("areaCode", "TEXT", false, 0, null, 1));
                map8.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                map8.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, 1));
                map8.put("receiverType", new TableInfo.Column("receiverType", "INTEGER", false, 0, null, 1));
                map8.put("subStatus", new TableInfo.Column("subStatus", "INTEGER", false, 0, null, 1));
                map8.put("tokenCoinTypeNo", new TableInfo.Column("tokenCoinTypeNo", "TEXT", true, 0, null, 1));
                map8.put("convertInfo", new TableInfo.Column("convertInfo", "TEXT", false, 0, null, 1));
                TableInfo tableInfo15 = new TableInfo("transaction_order", map8, new HashSet(0), new HashSet(0));
                TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "transaction_order");
                if (!tableInfo15.equals(tableInfo16)) {
                    return new RoomOpenDelegate.ValidationResult(false, "transaction_order(com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderEntity).\n Expected:\n" + tableInfo15 + "\n Found:\n" + tableInfo16);
                }
                HashMap map9 = new HashMap(2);
                map9.put(JwtUtilsKt.DID_METHOD_KEY, new TableInfo.Column(JwtUtilsKt.DID_METHOD_KEY, "TEXT", true, 1, null, 1));
                map9.put("nextCursor", new TableInfo.Column("nextCursor", "TEXT", true, 0, null, 1));
                TableInfo tableInfo17 = new TableInfo("transaction_order_cache", map9, new HashSet(0), new HashSet(0));
                TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "transaction_order_cache");
                if (!tableInfo17.equals(tableInfo18)) {
                    return new RoomOpenDelegate.ValidationResult(false, "transaction_order_cache(com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderCacheEntity).\n Expected:\n" + tableInfo17 + "\n Found:\n" + tableInfo18);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "pay_order", "pay_order_cache", "pending_claim_order", "pending_claim_order_cache", "web3pay_recent_contact", "transaction_order_for_token", "transaction_order_for_token_cache", "transaction_order", "transaction_order_cache");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "pay_order", "pay_order_cache", "pending_claim_order", "pending_claim_order_cache", "web3pay_recent_contact", "transaction_order_for_token", "transaction_order_for_token_cache", "transaction_order", "transaction_order_cache");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC31244lqP.class, C31243lqO.AEQbTJ());
        map.put(InterfaceC31289lrH.class, C31288lrG.KWHzl());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        HashSet hashSet = new HashSet();
        hashSet.add(C31262lqh.class);
        return hashSet;
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C31261lqg(map.get(C31262lqh.class)));
        arrayList.add(new C31259lqe());
        return arrayList;
    }
}
