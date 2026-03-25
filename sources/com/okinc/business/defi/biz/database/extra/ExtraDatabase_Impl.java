package com.okinc.business.defi.biz.database.extra;

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
import com.ibm.icu.text.DateFormat;
import com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C11261cHr;
import o.C11271cIa;
import o.InterfaceC11262cHs;
import o.InterfaceC11269cHz;
import o.cHH;
import o.cHI;
import o.cHJ;
import o.cHL;
import o.cHP;
import o.cHW;
import o.cHZ;

/* JADX INFO: loaded from: classes23.dex */
public final class ExtraDatabase_Impl extends ExtraDatabase {
    public volatile PasswordKeyDao AuCTel;
    public volatile InterfaceC11269cHz DbNXlk;
    public volatile cHP ejfBZ;
    public volatile cHZ fIwbmz;
    public volatile InterfaceC11262cHs fetchVPNInfo;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(14, "089a2e4ec0049a57693182988c0c4c42", "bd33551a8addc39186d6a6e8db9f365c") { // from class: com.okinc.business.defi.biz.database.extra.ExtraDatabase_Impl.4
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `deleted_wallet` (`id` TEXT NOT NULL, `xpriv` TEXT NOT NULL, `xpub` TEXT NOT NULL, `status` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `coin_meta` (`coinId` INTEGER NOT NULL, `baseCoinId` INTEGER NOT NULL, `chainId` INTEGER NOT NULL, `realChainId` INTEGER NOT NULL, `name` TEXT NOT NULL, `chainName` TEXT NOT NULL, `symbol` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `chainImageUrl` TEXT NOT NULL, `address` TEXT NOT NULL, `decimalNum` INTEGER NOT NULL, `vdecimalNum` INTEGER NOT NULL, `orderDecimalNum` INTEGER NOT NULL, `coinType` INTEGER NOT NULL, `tokenType` TEXT NOT NULL, `isDefault` INTEGER NOT NULL, `isVisible` INTEGER NOT NULL, `sort` INTEGER, `isHotNetwork` INTEGER NOT NULL, `hotNetworkRank` INTEGER NOT NULL, `aggregationType` INTEGER NOT NULL, `tokenSort` INTEGER NOT NULL, `supportPush` INTEGER NOT NULL, `supportShowDetail` INTEGER NOT NULL, `explorerUrl` TEXT NOT NULL, `systemToken` INTEGER, `platformType` INTEGER NOT NULL, `currencyId` INTEGER NOT NULL, `cefiSupport` INTEGER NOT NULL, `aaSupport` INTEGER, `supportVersion` INTEGER, `supportFullHistory` INTEGER, `protocolId` INTEGER, `protocolType` INTEGER, `coinCategory` INTEGER NOT NULL, `riskType` INTEGER, `isHighQuality` INTEGER, `stableCoin` INTEGER NOT NULL, `displayPrecision` INTEGER NOT NULL, `supportStableCoinInterest` INTEGER NOT NULL, `chainAddressPrefix` TEXT NOT NULL, `factionType` INTEGER, `cosmosPrefix` TEXT, PRIMARY KEY(`coinId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_coin_meta_sort` ON `coin_meta` (`sort`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `full_asset_coin_relation` (`walletId` TEXT NOT NULL, `coinId` INTEGER NOT NULL, PRIMARY KEY(`walletId`, `coinId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `key_value` (`k` TEXT NOT NULL, `v` TEXT NOT NULL, PRIMARY KEY(`k`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `support_pnl_chain` (`chainId` INTEGER NOT NULL, `chainName` TEXT NOT NULL, `chainLogo` TEXT NOT NULL, PRIMARY KEY(`chainId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `referral_info` (`walletType` TEXT NOT NULL, `walletAddress` TEXT NOT NULL, `encryptedReferralInfo` TEXT NOT NULL, `createdTime` INTEGER NOT NULL, `updatedTime` INTEGER NOT NULL, PRIMARY KEY(`walletType`, `walletAddress`))");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '089a2e4ec0049a57693182988c0c4c42')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `deleted_wallet`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `coin_meta`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `full_asset_coin_relation`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `key_value`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `support_pnl_chain`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `referral_info`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                ExtraDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(4);
                map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                map.put("xpriv", new TableInfo.Column("xpriv", "TEXT", true, 0, null, 1));
                map.put("xpub", new TableInfo.Column("xpub", "TEXT", true, 0, null, 1));
                map.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("deleted_wallet", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "deleted_wallet");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "deleted_wallet(com.okinc.business.defi.biz.database.extra.entity.DeletedWalletEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(43);
                map2.put("coinId", new TableInfo.Column("coinId", "INTEGER", true, 1, null, 1));
                map2.put("baseCoinId", new TableInfo.Column("baseCoinId", "INTEGER", true, 0, null, 1));
                map2.put("chainId", new TableInfo.Column("chainId", "INTEGER", true, 0, null, 1));
                map2.put("realChainId", new TableInfo.Column("realChainId", "INTEGER", true, 0, null, 1));
                map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map2.put("chainName", new TableInfo.Column("chainName", "TEXT", true, 0, null, 1));
                map2.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
                map2.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", true, 0, null, 1));
                map2.put("chainImageUrl", new TableInfo.Column("chainImageUrl", "TEXT", true, 0, null, 1));
                map2.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, new TableInfo.Column(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "TEXT", true, 0, null, 1));
                map2.put("decimalNum", new TableInfo.Column("decimalNum", "INTEGER", true, 0, null, 1));
                map2.put("vdecimalNum", new TableInfo.Column("vdecimalNum", "INTEGER", true, 0, null, 1));
                map2.put("orderDecimalNum", new TableInfo.Column("orderDecimalNum", "INTEGER", true, 0, null, 1));
                map2.put("coinType", new TableInfo.Column("coinType", "INTEGER", true, 0, null, 1));
                map2.put("tokenType", new TableInfo.Column("tokenType", "TEXT", true, 0, null, 1));
                map2.put("isDefault", new TableInfo.Column("isDefault", "INTEGER", true, 0, null, 1));
                map2.put("isVisible", new TableInfo.Column("isVisible", "INTEGER", true, 0, null, 1));
                map2.put("sort", new TableInfo.Column("sort", "INTEGER", false, 0, null, 1));
                map2.put("isHotNetwork", new TableInfo.Column("isHotNetwork", "INTEGER", true, 0, null, 1));
                map2.put("hotNetworkRank", new TableInfo.Column("hotNetworkRank", "INTEGER", true, 0, null, 1));
                map2.put("aggregationType", new TableInfo.Column("aggregationType", "INTEGER", true, 0, null, 1));
                map2.put("tokenSort", new TableInfo.Column("tokenSort", "INTEGER", true, 0, null, 1));
                map2.put("supportPush", new TableInfo.Column("supportPush", "INTEGER", true, 0, null, 1));
                map2.put("supportShowDetail", new TableInfo.Column("supportShowDetail", "INTEGER", true, 0, null, 1));
                map2.put("explorerUrl", new TableInfo.Column("explorerUrl", "TEXT", true, 0, null, 1));
                map2.put("systemToken", new TableInfo.Column("systemToken", "INTEGER", false, 0, null, 1));
                map2.put("platformType", new TableInfo.Column("platformType", "INTEGER", true, 0, null, 1));
                map2.put("currencyId", new TableInfo.Column("currencyId", "INTEGER", true, 0, null, 1));
                map2.put("cefiSupport", new TableInfo.Column("cefiSupport", "INTEGER", true, 0, null, 1));
                map2.put("aaSupport", new TableInfo.Column("aaSupport", "INTEGER", false, 0, null, 1));
                map2.put("supportVersion", new TableInfo.Column("supportVersion", "INTEGER", false, 0, null, 1));
                map2.put("supportFullHistory", new TableInfo.Column("supportFullHistory", "INTEGER", false, 0, null, 1));
                map2.put("protocolId", new TableInfo.Column("protocolId", "INTEGER", false, 0, null, 1));
                map2.put("protocolType", new TableInfo.Column("protocolType", "INTEGER", false, 0, null, 1));
                map2.put("coinCategory", new TableInfo.Column("coinCategory", "INTEGER", true, 0, null, 1));
                map2.put("riskType", new TableInfo.Column("riskType", "INTEGER", false, 0, null, 1));
                map2.put("isHighQuality", new TableInfo.Column("isHighQuality", "INTEGER", false, 0, null, 1));
                map2.put("stableCoin", new TableInfo.Column("stableCoin", "INTEGER", true, 0, null, 1));
                map2.put("displayPrecision", new TableInfo.Column("displayPrecision", "INTEGER", true, 0, null, 1));
                map2.put("supportStableCoinInterest", new TableInfo.Column("supportStableCoinInterest", "INTEGER", true, 0, null, 1));
                map2.put("chainAddressPrefix", new TableInfo.Column("chainAddressPrefix", "TEXT", true, 0, null, 1));
                map2.put("factionType", new TableInfo.Column("factionType", "INTEGER", false, 0, null, 1));
                map2.put("cosmosPrefix", new TableInfo.Column("cosmosPrefix", "TEXT", false, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new TableInfo.Index("index_coin_meta_sort", false, Arrays.asList("sort"), Arrays.asList("ASC")));
                TableInfo tableInfo3 = new TableInfo("coin_meta", map2, hashSet, hashSet2);
                TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "coin_meta");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "coin_meta(com.okinc.business.defi.biz.net.bean.CoinMetaBean).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                HashMap map3 = new HashMap(2);
                map3.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map3.put("coinId", new TableInfo.Column("coinId", "INTEGER", true, 2, null, 1));
                TableInfo tableInfo5 = new TableInfo("full_asset_coin_relation", map3, new HashSet(0), new HashSet(0));
                TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "full_asset_coin_relation");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "full_asset_coin_relation(com.okinc.business.defi.biz.database.extra.entity.FullAssetCoinRelationEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                HashMap map4 = new HashMap(2);
                map4.put("k", new TableInfo.Column("k", "TEXT", true, 1, null, 1));
                map4.put(DateFormat.ABBR_GENERIC_TZ, new TableInfo.Column(DateFormat.ABBR_GENERIC_TZ, "TEXT", true, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("key_value", map4, new HashSet(0), new HashSet(0));
                TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "key_value");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(false, "key_value(com.okinc.business.defi.biz.database.extra.entity.KeyValueEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                HashMap map5 = new HashMap(3);
                map5.put("chainId", new TableInfo.Column("chainId", "INTEGER", true, 1, null, 1));
                map5.put("chainName", new TableInfo.Column("chainName", "TEXT", true, 0, null, 1));
                map5.put("chainLogo", new TableInfo.Column("chainLogo", "TEXT", true, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo("support_pnl_chain", map5, new HashSet(0), new HashSet(0));
                TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "support_pnl_chain");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenDelegate.ValidationResult(false, "support_pnl_chain(com.okinc.business.defi.biz.database.extra.entity.SupportPnlChainEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                HashMap map6 = new HashMap(5);
                map6.put("walletType", new TableInfo.Column("walletType", "TEXT", true, 1, null, 1));
                map6.put("walletAddress", new TableInfo.Column("walletAddress", "TEXT", true, 2, null, 1));
                map6.put("encryptedReferralInfo", new TableInfo.Column("encryptedReferralInfo", "TEXT", true, 0, null, 1));
                map6.put("createdTime", new TableInfo.Column("createdTime", "INTEGER", true, 0, null, 1));
                map6.put("updatedTime", new TableInfo.Column("updatedTime", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo11 = new TableInfo("referral_info", map6, new HashSet(0), new HashSet(0));
                TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "referral_info");
                if (!tableInfo11.equals(tableInfo12)) {
                    return new RoomOpenDelegate.ValidationResult(false, "referral_info(com.okinc.business.defi.biz.database.extra.entity.ReferralInfoEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "deleted_wallet", "coin_meta", "full_asset_coin_relation", "key_value", "support_pnl_chain", "referral_info");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "deleted_wallet", "coin_meta", "full_asset_coin_relation", "key_value", "support_pnl_chain", "referral_info");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC11269cHz.class, cHH.EZpvd());
        map.put(InterfaceC11262cHs.class, C11261cHr.OLrzqt());
        map.put(cHL.class, cHJ.copydefault());
        map.put(PasswordKeyDao.class, cHI.AEQbTJ());
        map.put(cHZ.class, C11271cIa.EZpvd());
        map.put(cHP.class, cHW.AEQbTJ());
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

    @Override // com.okinc.business.defi.biz.database.extra.ExtraDatabase
    public InterfaceC11269cHz values() {
        InterfaceC11269cHz interfaceC11269cHz;
        if (this.DbNXlk != null) {
            return this.DbNXlk;
        }
        synchronized (this) {
            if (this.DbNXlk == null) {
                this.DbNXlk = new cHH(this);
            }
            interfaceC11269cHz = this.DbNXlk;
        }
        return interfaceC11269cHz;
    }

    @Override // com.okinc.business.defi.biz.database.extra.ExtraDatabase
    public InterfaceC11262cHs fetchVPNInfo() {
        InterfaceC11262cHs interfaceC11262cHs;
        if (this.fetchVPNInfo != null) {
            return this.fetchVPNInfo;
        }
        synchronized (this) {
            if (this.fetchVPNInfo == null) {
                this.fetchVPNInfo = new C11261cHr(this);
            }
            interfaceC11262cHs = this.fetchVPNInfo;
        }
        return interfaceC11262cHs;
    }

    @Override // com.okinc.business.defi.biz.database.extra.ExtraDatabase
    public PasswordKeyDao ejfBZ() {
        PasswordKeyDao passwordKeyDao;
        if (this.AuCTel != null) {
            return this.AuCTel;
        }
        synchronized (this) {
            if (this.AuCTel == null) {
                this.AuCTel = new cHI(this);
            }
            passwordKeyDao = this.AuCTel;
        }
        return passwordKeyDao;
    }

    @Override // com.okinc.business.defi.biz.database.extra.ExtraDatabase
    public cHZ fARcdN() {
        cHZ chz;
        if (this.fIwbmz != null) {
            return this.fIwbmz;
        }
        synchronized (this) {
            if (this.fIwbmz == null) {
                this.fIwbmz = new C11271cIa(this);
            }
            chz = this.fIwbmz;
        }
        return chz;
    }

    @Override // com.okinc.business.defi.biz.database.extra.ExtraDatabase
    public cHP fIwbmz() {
        cHP chp;
        if (this.ejfBZ != null) {
            return this.ejfBZ;
        }
        synchronized (this) {
            if (this.ejfBZ == null) {
                this.ejfBZ = new cHW(this);
            }
            chp = this.ejfBZ;
        }
        return chp;
    }
}
