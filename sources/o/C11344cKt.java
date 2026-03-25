package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.okinc.business.defi.biz.database.wallet.entity.AddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.KVEntity;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.SyncItemEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.InterfaceC11338cKn;

/* JADX INFO: renamed from: o.cKt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11344cKt implements InterfaceC11338cKn {
    public final RoomDatabase EZpvd;
    public final EntityInsertAdapter<RootWalletEntity> AYXKKw = new EntityInsertAdapter<RootWalletEntity>() { // from class: o.cKt.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `root_wallet` (`rootId`,`name`,`sortIndex`,`createAt`,`createIndex`) VALUES (?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull RootWalletEntity rootWalletEntity) {
            if (rootWalletEntity.getRootId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, rootWalletEntity.getRootId());
            }
            if (rootWalletEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, rootWalletEntity.getName());
            }
            sQLiteStatement.mo5793bindLong(3, rootWalletEntity.getSortIndex());
            sQLiteStatement.mo5793bindLong(4, rootWalletEntity.getCreateAt());
            sQLiteStatement.mo5793bindLong(5, rootWalletEntity.getCreateIndex());
        }
    };
    public final EntityInsertAdapter<WalletEntity> fetchVPNInfo = new EntityInsertAdapter<WalletEntity>() { // from class: o.cKt.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `wallet` (`id`,`type`,`data`,`chainId`,`language`,`name`,`modifiedName`,`backup`,`cloudBackup`,`iHuaweiBackup`,`main`,`xpub`,`xpriv`,`isSegWit`,`fromCreate`,`createAt`,`orderValue`,`rootWalletId`,`addressIndex`,`syncStatus`,`completedSyncOperation`,`syncOperation`,`eoaWalletType`,`aaWalletStatus`,`createVersion`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletEntity walletEntity) {
            if (walletEntity.getId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletEntity.getId());
            }
            sQLiteStatement.mo5793bindLong(2, walletEntity.getType());
            if (walletEntity.getData() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, walletEntity.getData());
            }
            sQLiteStatement.mo5793bindLong(4, walletEntity.getChainId());
            if (walletEntity.getLanguage() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, walletEntity.getLanguage());
            }
            if (walletEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, walletEntity.getName());
            }
            sQLiteStatement.mo5793bindLong(7, walletEntity.getModifiedName());
            sQLiteStatement.mo5793bindLong(8, walletEntity.getBackup());
            sQLiteStatement.mo5793bindLong(9, walletEntity.getCloudBackup());
            sQLiteStatement.mo5793bindLong(10, walletEntity.getIHuaweiBackup());
            sQLiteStatement.mo5793bindLong(11, walletEntity.getMain());
            if (walletEntity.getXpub() == null) {
                sQLiteStatement.mo5794bindNull(12);
            } else {
                sQLiteStatement.mo5795bindText(12, walletEntity.getXpub());
            }
            if (walletEntity.getXpriv() == null) {
                sQLiteStatement.mo5794bindNull(13);
            } else {
                sQLiteStatement.mo5795bindText(13, walletEntity.getXpriv());
            }
            sQLiteStatement.mo5793bindLong(14, walletEntity.isSegWit());
            sQLiteStatement.mo5793bindLong(15, walletEntity.getFromCreate());
            sQLiteStatement.mo5793bindLong(16, walletEntity.getCreateAt());
            sQLiteStatement.mo5793bindLong(17, walletEntity.getOrderValue());
            if (walletEntity.getRootWalletId() == null) {
                sQLiteStatement.mo5794bindNull(18);
            } else {
                sQLiteStatement.mo5795bindText(18, walletEntity.getRootWalletId());
            }
            sQLiteStatement.mo5793bindLong(19, walletEntity.getAddressIndex());
            sQLiteStatement.mo5793bindLong(20, walletEntity.getSyncStatus());
            if (walletEntity.getCompletedSyncOperation() == null) {
                sQLiteStatement.mo5794bindNull(21);
            } else {
                sQLiteStatement.mo5795bindText(21, walletEntity.getCompletedSyncOperation());
            }
            if (walletEntity.getSyncOperation() == null) {
                sQLiteStatement.mo5794bindNull(22);
            } else {
                sQLiteStatement.mo5795bindText(22, walletEntity.getSyncOperation());
            }
            sQLiteStatement.mo5793bindLong(23, walletEntity.getEoaWalletType());
            sQLiteStatement.mo5793bindLong(24, walletEntity.getAaWalletStatus());
            if (walletEntity.getCreateVersion() == null) {
                sQLiteStatement.mo5794bindNull(25);
            } else {
                sQLiteStatement.mo5795bindText(25, walletEntity.getCreateVersion());
            }
        }
    };
    public final EntityInsertAdapter<AddressEntity> KWHzl = new EntityInsertAdapter<AddressEntity>() { // from class: o.cKt.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `address` (`address`,`coinId`,`remark`,`createAt`,`domain`) VALUES (?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull AddressEntity addressEntity) {
            if (addressEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, addressEntity.getAddress());
            }
            sQLiteStatement.mo5793bindLong(2, addressEntity.getCoinId());
            if (addressEntity.getRemark() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, addressEntity.getRemark());
            }
            sQLiteStatement.mo5793bindLong(4, addressEntity.getCreateAt());
            if (addressEntity.getDomain() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, addressEntity.getDomain());
            }
        }
    };
    public final EntityInsertAdapter<ChainAddressEntity> AEQbTJ = new EntityInsertAdapter<ChainAddressEntity>() { // from class: o.cKt.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `chain_address` (`walletId`,`chainId`,`address`,`addressType`,`publicKey`,`derivePath`,`proxyAddress`,`eoaAddress`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull ChainAddressEntity chainAddressEntity) {
            if (chainAddressEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, chainAddressEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, chainAddressEntity.getChainId());
            if (chainAddressEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, chainAddressEntity.getAddress());
            }
            sQLiteStatement.mo5793bindLong(4, chainAddressEntity.getAddressType());
            if (chainAddressEntity.getPublicKey() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, chainAddressEntity.getPublicKey());
            }
            if (chainAddressEntity.getDerivePath() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, chainAddressEntity.getDerivePath());
            }
            if (chainAddressEntity.getProxyAddress() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, chainAddressEntity.getProxyAddress());
            }
            if (chainAddressEntity.getEoaAddress() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, chainAddressEntity.getEoaAddress());
            }
        }
    };
    public final EntityInsertAdapter<WalletCoinAssetEntity> AhwBna = new EntityInsertAdapter<WalletCoinAssetEntity>() { // from class: o.cKt.8
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `coin_asset` (`walletId`,`coinId`,`amount`,`amountInt`,`ccyAmount`,`dailyChange`,`orderValue`,`address`,`voucherToken`,`unPnl`,`unPnlYield`,`platformName`,`walletInvestmentType`,`spotBalance`,`holdAvgPrice`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletCoinAssetEntity walletCoinAssetEntity) {
            if (walletCoinAssetEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletCoinAssetEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletCoinAssetEntity.getCoinId());
            if (walletCoinAssetEntity.getAmount() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, walletCoinAssetEntity.getAmount());
            }
            if (walletCoinAssetEntity.getAmountInt() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, walletCoinAssetEntity.getAmountInt());
            }
            if (walletCoinAssetEntity.getCcyAmount() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, walletCoinAssetEntity.getCcyAmount());
            }
            if (walletCoinAssetEntity.getDailyChange() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, walletCoinAssetEntity.getDailyChange());
            }
            sQLiteStatement.mo5793bindLong(7, walletCoinAssetEntity.getOrderValue());
            if (walletCoinAssetEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, walletCoinAssetEntity.getAddress());
            }
            sQLiteStatement.mo5793bindLong(9, walletCoinAssetEntity.getVoucherToken());
            if (walletCoinAssetEntity.getUnPnl() == null) {
                sQLiteStatement.mo5794bindNull(10);
            } else {
                sQLiteStatement.mo5795bindText(10, walletCoinAssetEntity.getUnPnl());
            }
            if (walletCoinAssetEntity.getUnPnlYield() == null) {
                sQLiteStatement.mo5794bindNull(11);
            } else {
                sQLiteStatement.mo5795bindText(11, walletCoinAssetEntity.getUnPnlYield());
            }
            if (walletCoinAssetEntity.getPlatformName() == null) {
                sQLiteStatement.mo5794bindNull(12);
            } else {
                sQLiteStatement.mo5795bindText(12, walletCoinAssetEntity.getPlatformName());
            }
            if (walletCoinAssetEntity.getWalletInvestmentType() == null) {
                sQLiteStatement.mo5794bindNull(13);
            } else {
                sQLiteStatement.mo5795bindText(13, walletCoinAssetEntity.getWalletInvestmentType());
            }
            if (walletCoinAssetEntity.getSpotBalance() == null) {
                sQLiteStatement.mo5794bindNull(14);
            } else {
                sQLiteStatement.mo5795bindText(14, walletCoinAssetEntity.getSpotBalance());
            }
            if (walletCoinAssetEntity.getHoldAvgPrice() == null) {
                sQLiteStatement.mo5794bindNull(15);
            } else {
                sQLiteStatement.mo5795bindText(15, walletCoinAssetEntity.getHoldAvgPrice());
            }
        }
    };
    public final EntityInsertAdapter<EOSInfoEntity> OLrzqt = new EntityInsertAdapter<EOSInfoEntity>() { // from class: o.cKt.7
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `EOSInfo` (`walletId`,`accountName`,`state`,`pubKey`,`activeKey`,`ownerKey`,`shouldBeDeleted`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull EOSInfoEntity eOSInfoEntity) {
            if (eOSInfoEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, eOSInfoEntity.getWalletId());
            }
            if (eOSInfoEntity.getAccountName() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, eOSInfoEntity.getAccountName());
            }
            sQLiteStatement.mo5793bindLong(3, eOSInfoEntity.getState());
            if (eOSInfoEntity.getPubKey() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, eOSInfoEntity.getPubKey());
            }
            if (eOSInfoEntity.getActiveKey() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, eOSInfoEntity.getActiveKey());
            }
            if (eOSInfoEntity.getOwnerKey() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, eOSInfoEntity.getOwnerKey());
            }
            sQLiteStatement.mo5793bindLong(7, eOSInfoEntity.getShouldBeDeleted());
        }
    };
    public final EntityInsertAdapter<KVEntity> copydefault = new EntityInsertAdapter<KVEntity>() { // from class: o.cKt.9
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `keyValues` (`_key`,`_value`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull KVEntity kVEntity) {
            if (kVEntity.get_key() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, kVEntity.get_key());
            }
            if (kVEntity.get_value() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, kVEntity.get_value());
            }
        }
    };
    public final EntityInsertAdapter<C11451cOt> valueOf = new EntityInsertAdapter<C11451cOt>() { // from class: o.cKt.6
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `message` (`walletId`,`id`,`rowId`,`timestamp`,`read`,`msg`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull C11451cOt c11451cOt) {
            if (c11451cOt.djBIcL() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, c11451cOt.djBIcL());
            }
            sQLiteStatement.mo5793bindLong(2, c11451cOt.AEQbTJ());
            if (c11451cOt.OLrzqt() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, c11451cOt.OLrzqt());
            }
            sQLiteStatement.mo5793bindLong(4, c11451cOt.KWHzl());
            sQLiteStatement.mo5793bindLong(5, c11451cOt.EZpvd());
            if (c11451cOt.copydefault() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, c11451cOt.copydefault());
            }
        }
    };
    public final EntityInsertAdapter<SepInfoEntity> djBIcL = new EntityInsertAdapter<SepInfoEntity>() { // from class: o.cKt.10
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `sepInfo` (`walletId`,`coinId`,`state`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull SepInfoEntity sepInfoEntity) {
            if (sepInfoEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, sepInfoEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, sepInfoEntity.getCoinId());
            if (sepInfoEntity.getState() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, sepInfoEntity.getState());
            }
        }
    };
    public final EntityInsertAdapter<SyncItemEntity> gEmmrt = new EntityInsertAdapter<SyncItemEntity>() { // from class: o.cKt.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `sync` (`id`,`data`) VALUES (nullif(?, 0),?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull SyncItemEntity syncItemEntity) {
            sQLiteStatement.mo5793bindLong(1, syncItemEntity.getId());
            if (syncItemEntity.getData() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, syncItemEntity.getData());
            }
        }
    };

    public C11344cKt(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> valueOf(final java.util.List<RootWalletEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.AhwBna(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AhwBna(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AYXKKw.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> djBIcL(final java.util.List<WalletEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AYXKKw(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AYXKKw(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.fetchVPNInfo.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> AEQbTJ(final java.util.List<AddressEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.KWHzl.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> OLrzqt(final java.util.List<ChainAddressEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AEQbTJ.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> KWHzl(final java.util.List<WalletCoinAssetEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.EZpvd(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List EZpvd(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AhwBna.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> EZpvd(final java.util.List<EOSInfoEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.OLrzqt.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> copydefault(final java.util.List<KVEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.copydefault.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> gEmmrt(final java.util.List<C11451cOt> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.gEmmrt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List gEmmrt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.valueOf.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> AYXKKw(final java.util.List<SepInfoEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.djBIcL(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List djBIcL(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.djBIcL.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public java.util.List<java.lang.Long> AhwBna(final java.util.List<SyncItemEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.valueOf(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List valueOf(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.gEmmrt.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11338cKn
    public void AEQbTJ(final java.util.List<RootWalletEntity> list, final java.util.List<WalletEntity> list2, final java.util.List<AddressEntity> list3, final java.util.List<ChainAddressEntity> list4, final java.util.List<WalletCoinAssetEntity> list5, final java.util.List<EOSInfoEntity> list6, final java.util.List<KVEntity> list7, final java.util.List<C11451cOt> list8, final java.util.List<SepInfoEntity> list9, final java.util.List<SyncItemEntity> list10) {
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit OLrzqt(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, java.util.List list7, java.util.List list8, java.util.List list9, java.util.List list10, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        InterfaceC11338cKn.ActionBar.copydefault(this, list, list2, list3, list4, list5, list6, list7, list8, list9, list10);
        return Unit.INSTANCE;
    }

    public static java.util.List<java.lang.Class<?>> OLrzqt() {
        return Collections.emptyList();
    }
}
