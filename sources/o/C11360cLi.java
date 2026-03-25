package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.business.defi.biz.database.wallet.entity.WalletClosedCoinEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetPartialEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetPnlEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletOpenedCoinEntity;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Collections;
import kotlin.jvm.functions.Function1;
import o.InterfaceC11353cLb;

/* JADX INFO: renamed from: o.cLi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11360cLi implements InterfaceC11353cLb {
    public final RoomDatabase EZpvd;
    public final EntityInsertAdapter<WalletCoinAssetEntity> KWHzl = new EntityInsertAdapter<WalletCoinAssetEntity>() { // from class: o.cLi.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `coin_asset` (`walletId`,`coinId`,`amount`,`amountInt`,`ccyAmount`,`dailyChange`,`orderValue`,`address`,`voucherToken`,`unPnl`,`unPnlYield`,`platformName`,`walletInvestmentType`,`spotBalance`,`holdAvgPrice`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
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
    public final EntityInsertAdapter<WalletOpenedCoinEntity> valueOf = new EntityInsertAdapter<WalletOpenedCoinEntity>() { // from class: o.cLi.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `opened_coin` (`walletId`,`coinId`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletOpenedCoinEntity walletOpenedCoinEntity) {
            if (walletOpenedCoinEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletOpenedCoinEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletOpenedCoinEntity.getCoinId());
        }
    };
    public final EntityInsertAdapter<WalletClosedCoinEntity> AEQbTJ = new EntityInsertAdapter<WalletClosedCoinEntity>() { // from class: o.cLi.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `closed_coin` (`walletId`,`coinId`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletClosedCoinEntity walletClosedCoinEntity) {
            if (walletClosedCoinEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletClosedCoinEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletClosedCoinEntity.getCoinId());
        }
    };
    public final EntityDeleteOrUpdateAdapter<WalletOpenedCoinEntity> copydefault = new EntityDeleteOrUpdateAdapter<WalletOpenedCoinEntity>() { // from class: o.cLi.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `opened_coin` WHERE `walletId` = ? AND `coinId` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletOpenedCoinEntity walletOpenedCoinEntity) {
            if (walletOpenedCoinEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletOpenedCoinEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletOpenedCoinEntity.getCoinId());
        }
    };
    public final EntityDeleteOrUpdateAdapter<WalletClosedCoinEntity> OLrzqt = new EntityDeleteOrUpdateAdapter<WalletClosedCoinEntity>() { // from class: o.cLi.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `closed_coin` WHERE `walletId` = ? AND `coinId` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletClosedCoinEntity walletClosedCoinEntity) {
            if (walletClosedCoinEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletClosedCoinEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletClosedCoinEntity.getCoinId());
        }
    };
    public final EntityDeleteOrUpdateAdapter<WalletCoinAssetPartialEntity> djBIcL = new EntityDeleteOrUpdateAdapter<WalletCoinAssetPartialEntity>() { // from class: o.cLi.9
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `coin_asset` SET `walletId` = ?,`coinId` = ?,`address` = ?,`ccyAmount` = ?,`unPnl` = ?,`unPnlYield` = ? WHERE `walletId` = ? AND `coinId` = ? AND `address` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletCoinAssetPartialEntity walletCoinAssetPartialEntity) {
            if (walletCoinAssetPartialEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletCoinAssetPartialEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletCoinAssetPartialEntity.getCoinId());
            if (walletCoinAssetPartialEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, walletCoinAssetPartialEntity.getAddress());
            }
            if (walletCoinAssetPartialEntity.getCcyAmount() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, walletCoinAssetPartialEntity.getCcyAmount());
            }
            if (walletCoinAssetPartialEntity.getUnPnl() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, walletCoinAssetPartialEntity.getUnPnl());
            }
            if (walletCoinAssetPartialEntity.getUnPnlYield() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, walletCoinAssetPartialEntity.getUnPnlYield());
            }
            if (walletCoinAssetPartialEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, walletCoinAssetPartialEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(8, walletCoinAssetPartialEntity.getCoinId());
            if (walletCoinAssetPartialEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, walletCoinAssetPartialEntity.getAddress());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<WalletCoinAssetPnlEntity> AhwBna = new EntityDeleteOrUpdateAdapter<WalletCoinAssetPnlEntity>() { // from class: o.cLi.10
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `coin_asset` SET `walletId` = ?,`coinId` = ?,`address` = ?,`unPnl` = ?,`unPnlYield` = ?,`spotBalance` = ?,`holdAvgPrice` = ? WHERE `walletId` = ? AND `coinId` = ? AND `address` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletCoinAssetPnlEntity walletCoinAssetPnlEntity) {
            if (walletCoinAssetPnlEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletCoinAssetPnlEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletCoinAssetPnlEntity.getCoinId());
            if (walletCoinAssetPnlEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, walletCoinAssetPnlEntity.getAddress());
            }
            if (walletCoinAssetPnlEntity.getUnPnl() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, walletCoinAssetPnlEntity.getUnPnl());
            }
            if (walletCoinAssetPnlEntity.getUnPnlYield() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, walletCoinAssetPnlEntity.getUnPnlYield());
            }
            if (walletCoinAssetPnlEntity.getSpotBalance() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, walletCoinAssetPnlEntity.getSpotBalance());
            }
            if (walletCoinAssetPnlEntity.getHoldAvgPrice() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, walletCoinAssetPnlEntity.getHoldAvgPrice());
            }
            if (walletCoinAssetPnlEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, walletCoinAssetPnlEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(9, walletCoinAssetPnlEntity.getCoinId());
            if (walletCoinAssetPnlEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(10);
            } else {
                sQLiteStatement.mo5795bindText(10, walletCoinAssetPnlEntity.getAddress());
            }
        }
    };

    public C11360cLi(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // o.InterfaceC11353cLb
    public long EZpvd(final WalletCoinAssetEntity walletCoinAssetEntity) {
        walletCoinAssetEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AEQbTJ(walletCoinAssetEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(WalletCoinAssetEntity walletCoinAssetEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.KWHzl.insertAndReturnId(sQLiteConnection, walletCoinAssetEntity));
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<java.lang.Long> djBIcL(final java.util.List<WalletCoinAssetEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AYXKKw(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AYXKKw(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.KWHzl.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<java.lang.Long> AhwBna(final java.util.List<WalletCoinAssetEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.gEmmrt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List gEmmrt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.KWHzl.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11353cLb
    public long KWHzl(final WalletOpenedCoinEntity walletOpenedCoinEntity) {
        walletOpenedCoinEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(walletOpenedCoinEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(WalletOpenedCoinEntity walletOpenedCoinEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.valueOf.insertAndReturnId(sQLiteConnection, walletOpenedCoinEntity));
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<java.lang.Long> gEmmrt(final java.util.List<WalletOpenedCoinEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.AhwBna(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AhwBna(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.valueOf.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11353cLb
    public long AEQbTJ(final WalletClosedCoinEntity walletClosedCoinEntity) {
        walletClosedCoinEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(walletClosedCoinEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(WalletClosedCoinEntity walletClosedCoinEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.AEQbTJ.insertAndReturnId(sQLiteConnection, walletClosedCoinEntity));
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<java.lang.Long> EZpvd(final java.util.List<WalletClosedCoinEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AEQbTJ.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11353cLb
    public int KWHzl(final java.util.List<WalletOpenedCoinEntity> list) {
        list.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.copydefault.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.InterfaceC11353cLb
    public int OLrzqt(final java.util.List<WalletClosedCoinEntity> list) {
        list.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.OLrzqt.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.InterfaceC11353cLb
    public int valueOf(final java.util.List<WalletCoinAssetPartialEntity> list) {
        list.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.djBIcL(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer djBIcL(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.djBIcL.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.InterfaceC11353cLb
    public int AYXKKw(final java.util.List<WalletCoinAssetPnlEntity> list) {
        list.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.valueOf(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer valueOf(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.AhwBna.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.InterfaceC11353cLb
    public long EZpvd(final WalletOpenedCoinEntity walletOpenedCoinEntity) {
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(walletOpenedCoinEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long KWHzl(WalletOpenedCoinEntity walletOpenedCoinEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(InterfaceC11353cLb.Application.AEQbTJ(this, walletOpenedCoinEntity));
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<java.lang.Long> copydefault(final java.util.List<WalletOpenedCoinEntity> list) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11353cLb.Application.AEQbTJ(this, (java.util.List<WalletOpenedCoinEntity>) list);
    }

    @Override // o.InterfaceC11353cLb
    public long KWHzl(final WalletClosedCoinEntity walletClosedCoinEntity) {
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.EZpvd(walletClosedCoinEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long EZpvd(WalletClosedCoinEntity walletClosedCoinEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(InterfaceC11353cLb.Application.KWHzl(this, walletClosedCoinEntity));
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<java.lang.Long> AEQbTJ(final java.util.List<WalletClosedCoinEntity> list) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.EZpvd(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List EZpvd(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11353cLb.Application.copydefault(this, list);
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<java.lang.Long> copydefault(final java.lang.String str, final java.util.List<WalletCoinAssetEntity> list) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.KWHzl(str, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List KWHzl(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11353cLb.Application.EZpvd(this, str, list);
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<java.lang.Long> AEQbTJ(final java.lang.String str, final long j, final java.lang.String str2) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.EZpvd(str, j, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List EZpvd(java.lang.String str, long j, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11353cLb.Application.EZpvd(this, str, j, str2);
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<WalletCoinAssetEntity> AEQbTJ(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cLw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11360cLi.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM coin_asset WHERE walletId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, OtcExtraKeys.AMOUNT);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountInt");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ccyAmount");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailyChange");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherToken");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnl");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnlYield");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformName");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletInvestmentType");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spotBalance");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holdAvgPrice");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    text = null;
                } else {
                    i = columnIndexOrThrow2;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i2 = columnIndexOrThrow3;
                }
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    i3 = columnIndexOrThrow4;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                    i3 = columnIndexOrThrow4;
                }
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i4 = columnIndexOrThrow15;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i4 = columnIndexOrThrow15;
                }
                int i7 = columnIndexOrThrow;
                arrayList.add(new WalletCoinAssetEntity(text4, j, text5, text6, text7, text, i5, text2, i6, text8, text9, text10, text11, text3, sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4)));
                columnIndexOrThrow = i7;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow15 = i4;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<WalletCoinAssetEntity> copydefault(final java.lang.String str, final long j) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cLg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11360cLi.OLrzqt(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List OLrzqt(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        int i2;
        java.lang.String text;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM coin_asset WHERE walletId = ? AND coinId=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, OtcExtraKeys.AMOUNT);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountInt");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ccyAmount");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailyChange");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherToken");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnl");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnlYield");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformName");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletInvestmentType");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spotBalance");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holdAvgPrice");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    text = null;
                } else {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    i3 = columnIndexOrThrow4;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                    i3 = columnIndexOrThrow4;
                }
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i4 = columnIndexOrThrow15;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i4 = columnIndexOrThrow15;
                }
                int i7 = columnIndexOrThrow;
                arrayList.add(new WalletCoinAssetEntity(text4, j2, text5, text6, text7, text, i5, text2, i6, text8, text9, text10, text11, text3, sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4)));
                columnIndexOrThrow = i7;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow15 = i4;
                columnIndexOrThrow4 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11353cLb
    public java.util.List<java.lang.Long> KWHzl() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cLv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11360cLi.AEQbTJ((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT DISTINCT coinId FROM coin_asset");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(0)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11353cLb
    public int EZpvd(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11360cLi.AEQbTJ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer AEQbTJ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM coin_asset WHERE walletId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11353cLb
    public int OLrzqt(final java.lang.String str, final long j) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cLx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11360cLi.KWHzl(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer KWHzl(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM coin_asset WHERE walletId = ? AND coinId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> EZpvd() {
        return Collections.emptyList();
    }
}
