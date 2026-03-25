package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinBalanceEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaStatusEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainWalletCoinEntity;
import java.util.Collections;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o.cIL;

/* JADX INFO: loaded from: classes23.dex */
public final class cIM implements cIL {
    public final RoomDatabase OLrzqt;
    public final EntityInsertAdapter<CustomChainMetaEntity> AYXKKw = new EntityInsertAdapter<CustomChainMetaEntity>() { // from class: o.cIM.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `custom_chain_meta` (`chain_id`,`real_chain_id`,`chain_name`,`icon_url`,`from_custom`,`rpc_url`,`faucet_url`,`explorer_url`,`create_at`,`update_at`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CustomChainMetaEntity customChainMetaEntity) {
            sQLiteStatement.mo5793bindLong(1, customChainMetaEntity.getChainId());
            sQLiteStatement.mo5793bindLong(2, customChainMetaEntity.getRealChainId());
            if (customChainMetaEntity.getChainName() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, customChainMetaEntity.getChainName());
            }
            if (customChainMetaEntity.getIconUrl() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, customChainMetaEntity.getIconUrl());
            }
            sQLiteStatement.mo5793bindLong(5, customChainMetaEntity.getFromCustom());
            if (customChainMetaEntity.getRpcUrl() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, customChainMetaEntity.getRpcUrl());
            }
            if (customChainMetaEntity.getFaucetUrl() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, customChainMetaEntity.getFaucetUrl());
            }
            if (customChainMetaEntity.getExplorerUrl() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, customChainMetaEntity.getExplorerUrl());
            }
            sQLiteStatement.mo5793bindLong(9, customChainMetaEntity.getCreateAt());
            sQLiteStatement.mo5793bindLong(10, customChainMetaEntity.getUpdateAt());
        }
    };
    public final EntityInsertAdapter<CustomChainCoinMetaEntity> copydefault = new EntityInsertAdapter<CustomChainCoinMetaEntity>() { // from class: o.cIM.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `custom_chain_coin_meta` (`chain_id`,`real_chain_id`,`coin_id`,`symbol`,`name`,`icon_url`,`contract_address`,`base_coin_id`,`coin_type`,`decimal_num`,`create_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CustomChainCoinMetaEntity customChainCoinMetaEntity) {
            sQLiteStatement.mo5793bindLong(1, customChainCoinMetaEntity.getChainId());
            sQLiteStatement.mo5793bindLong(2, customChainCoinMetaEntity.getRealChainId());
            sQLiteStatement.mo5793bindLong(3, customChainCoinMetaEntity.getCoinId());
            if (customChainCoinMetaEntity.getSymbol() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, customChainCoinMetaEntity.getSymbol());
            }
            if (customChainCoinMetaEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, customChainCoinMetaEntity.getName());
            }
            if (customChainCoinMetaEntity.getIconUrl() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, customChainCoinMetaEntity.getIconUrl());
            }
            if (customChainCoinMetaEntity.getContractAddress() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, customChainCoinMetaEntity.getContractAddress());
            }
            sQLiteStatement.mo5793bindLong(8, customChainCoinMetaEntity.getBaseCoinId());
            sQLiteStatement.mo5793bindLong(9, customChainCoinMetaEntity.getCoinType());
            sQLiteStatement.mo5793bindLong(10, customChainCoinMetaEntity.getDecimalNum());
            sQLiteStatement.mo5793bindLong(11, customChainCoinMetaEntity.getCreateAt());
        }
    };
    public final EntityInsertAdapter<CustomChainWalletCoinEntity> valueOf = new EntityInsertAdapter<CustomChainWalletCoinEntity>() { // from class: o.cIM.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `custom_chain_wallet_coin` (`wallet_id`,`coin_id`,`create_at`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CustomChainWalletCoinEntity customChainWalletCoinEntity) {
            if (customChainWalletCoinEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, customChainWalletCoinEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, customChainWalletCoinEntity.getCoinId());
            sQLiteStatement.mo5793bindLong(3, customChainWalletCoinEntity.getCreateAt());
        }
    };
    public final EntityInsertAdapter<CustomChainAddressEntity> AEQbTJ = new EntityInsertAdapter<CustomChainAddressEntity>() { // from class: o.cIM.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `custom_chain_address` (`wallet_id`,`coin_id`,`address`,`public_key`,`derive_path`,`create_at`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CustomChainAddressEntity customChainAddressEntity) {
            if (customChainAddressEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, customChainAddressEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, customChainAddressEntity.getCoinId());
            if (customChainAddressEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, customChainAddressEntity.getAddress());
            }
            if (customChainAddressEntity.getPublicKey() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, customChainAddressEntity.getPublicKey());
            }
            if (customChainAddressEntity.getDerivePath() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, customChainAddressEntity.getDerivePath());
            }
            sQLiteStatement.mo5793bindLong(6, customChainAddressEntity.getCreateAt());
        }
    };
    public final EntityInsertAdapter<CustomChainCoinBalanceEntity> EZpvd = new EntityInsertAdapter<CustomChainCoinBalanceEntity>() { // from class: o.cIM.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `custom_chain_coin_balance` (`wallet_id`,`coin_id`,`amount`,`ccy_amount`,`order_value`,`create_at`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CustomChainCoinBalanceEntity customChainCoinBalanceEntity) {
            if (customChainCoinBalanceEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, customChainCoinBalanceEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, customChainCoinBalanceEntity.getCoinId());
            if (customChainCoinBalanceEntity.getAmount() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, customChainCoinBalanceEntity.getAmount());
            }
            if (customChainCoinBalanceEntity.getCcyAmount() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, customChainCoinBalanceEntity.getCcyAmount());
            }
            sQLiteStatement.mo5793bindLong(5, customChainCoinBalanceEntity.getOrderValue());
            sQLiteStatement.mo5793bindLong(6, customChainCoinBalanceEntity.getCreateAt());
        }
    };
    public final EntityInsertAdapter<CustomChainMetaStatusEntity> AhwBna = new EntityInsertAdapter<CustomChainMetaStatusEntity>() { // from class: o.cIM.7
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `custom_chain_meta_status` (`chain_id`,`used`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CustomChainMetaStatusEntity customChainMetaStatusEntity) {
            sQLiteStatement.mo5793bindLong(1, customChainMetaStatusEntity.getChainId());
            sQLiteStatement.mo5793bindLong(2, customChainMetaStatusEntity.getUsed());
        }
    };
    public final EntityDeleteOrUpdateAdapter<CustomChainMetaEntity> KWHzl = new EntityDeleteOrUpdateAdapter<CustomChainMetaEntity>() { // from class: o.cIM.9
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `custom_chain_meta` WHERE `chain_id` = ? AND `rpc_url` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CustomChainMetaEntity customChainMetaEntity) {
            sQLiteStatement.mo5793bindLong(1, customChainMetaEntity.getChainId());
            if (customChainMetaEntity.getRpcUrl() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, customChainMetaEntity.getRpcUrl());
            }
        }
    };

    public cIM(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.OLrzqt = roomDatabase;
    }

    @Override // o.cIL
    public void copydefault(final CustomChainMetaEntity customChainMetaEntity) {
        customChainMetaEntity.getClass();
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(customChainMetaEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object copydefault(CustomChainMetaEntity customChainMetaEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AYXKKw.insert(sQLiteConnection, customChainMetaEntity);
        return null;
    }

    @Override // o.cIL
    public void AhwBna(final java.util.List<CustomChainMetaEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AYXKKw.insert(sQLiteConnection, list);
        return null;
    }

    @Override // o.cIL
    public void OLrzqt(final CustomChainCoinMetaEntity customChainCoinMetaEntity) {
        customChainCoinMetaEntity.getClass();
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(customChainCoinMetaEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object copydefault(CustomChainCoinMetaEntity customChainCoinMetaEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.copydefault.insert(sQLiteConnection, customChainCoinMetaEntity);
        return null;
    }

    @Override // o.cIL
    public void valueOf(final java.util.List<CustomChainCoinMetaEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AYXKKw(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object AYXKKw(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.copydefault.insert(sQLiteConnection, list);
        return null;
    }

    @Override // o.cIL
    public long OLrzqt(final CustomChainWalletCoinEntity customChainWalletCoinEntity) {
        customChainWalletCoinEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.copydefault(customChainWalletCoinEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long copydefault(CustomChainWalletCoinEntity customChainWalletCoinEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.valueOf.insertAndReturnId(sQLiteConnection, customChainWalletCoinEntity));
    }

    @Override // o.cIL
    public java.util.List<java.lang.Long> djBIcL(final java.util.List<CustomChainWalletCoinEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.gEmmrt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List gEmmrt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.valueOf.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cIL
    public java.util.List<java.lang.Long> KWHzl(final java.util.List<CustomChainAddressEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AEQbTJ.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cIL
    public void AYXKKw(final java.util.List<CustomChainCoinBalanceEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.EZpvd(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object EZpvd(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.EZpvd.insert(sQLiteConnection, list);
        return null;
    }

    @Override // o.cIL
    public long EZpvd(final CustomChainMetaStatusEntity customChainMetaStatusEntity) {
        customChainMetaStatusEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(customChainMetaStatusEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long OLrzqt(CustomChainMetaStatusEntity customChainMetaStatusEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.AhwBna.insertAndReturnId(sQLiteConnection, customChainMetaStatusEntity));
    }

    @Override // o.cIL
    public java.util.List<java.lang.Long> gEmmrt(final java.util.List<CustomChainMetaStatusEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AhwBna(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AhwBna(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AhwBna.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cIL
    public void OLrzqt(final java.util.List<CustomChainMetaEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.KWHzl.handleMultiple(sQLiteConnection, list);
        return null;
    }

    @Override // o.cIL
    public void KWHzl(final java.util.List<CustomChainMetaEntity> list, final java.util.List<CustomChainMetaStatusEntity> list2, final java.util.List<java.lang.Long> list3, final java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>> list4) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(list, list2, list3, list4, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit OLrzqt(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cIL.ActionBar.AEQbTJ(this, list, list2, list3, list4);
        return Unit.INSTANCE;
    }

    @Override // o.cIL
    public void KWHzl(final long j, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final long j2) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.copydefault(j, str, str2, str3, str4, j2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit copydefault(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cIL.ActionBar.copydefault(this, j, str, str2, str3, str4, j2);
        return Unit.INSTANCE;
    }

    @Override // o.cIL
    public void KWHzl(final long j, final java.lang.String str) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.copydefault(j, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit copydefault(long j, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cIL.ActionBar.AEQbTJ(this, j, str);
        return Unit.INSTANCE;
    }

    @Override // o.cIL
    public void AEQbTJ(final long j, final java.lang.String str) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.EZpvd(j, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit EZpvd(long j, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cIL.ActionBar.EZpvd(this, j, str);
        return Unit.INSTANCE;
    }

    @Override // o.cIL
    public void DbNXlk(final java.util.List<kotlin.Pair<java.lang.Long, java.lang.Long>> list) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.djBIcL(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit djBIcL(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cIL.ActionBar.KWHzl(this, list);
        return Unit.INSTANCE;
    }

    @Override // o.cIL
    public void copydefault(final CustomChainCoinMetaEntity customChainCoinMetaEntity) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(customChainCoinMetaEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit AEQbTJ(CustomChainCoinMetaEntity customChainCoinMetaEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cIL.ActionBar.AEQbTJ(this, customChainCoinMetaEntity);
        return Unit.INSTANCE;
    }

    @Override // o.cIL
    public void AEQbTJ(final java.util.List<CustomChainCoinBalanceEntity> list) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cIL.ActionBar.OLrzqt(this, list);
        return Unit.INSTANCE;
    }

    @Override // o.cIL
    public void copydefault(final java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>> list, final CustomChainMetaEntity customChainMetaEntity) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(list, customChainMetaEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit OLrzqt(java.util.List list, CustomChainMetaEntity customChainMetaEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cIL.ActionBar.KWHzl(this, list, customChainMetaEntity);
        return Unit.INSTANCE;
    }

    @Override // o.cIL
    public java.util.List<cSW> KWHzl() {
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cIO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.gEmmrt((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List gEmmrt(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        java.lang.String text2;
        int i3;
        int i4;
        int i5;
        java.lang.String text3;
        java.lang.String text4;
        int i6;
        java.lang.String text5;
        int i7;
        java.lang.String text6;
        int i8;
        java.lang.String text7;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM view_custom_chain_coin_meta ORDER BY create_at ASC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "real_chain_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon_url");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from_custom");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rpc_url");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "faucet_url");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "explorer_url");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_at");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_ids");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbols");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "names");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon_urls");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contract_addresses");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "base_coin_ids");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_types");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "decimal_nums");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_ats");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    i2 = columnIndexOrThrow2;
                    i = columnIndexOrThrow3;
                    text = null;
                } else {
                    i = columnIndexOrThrow3;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                    i2 = columnIndexOrThrow2;
                }
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i3 = columnIndexOrThrow15;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i3 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i3)) {
                    i4 = columnIndexOrThrow;
                    i5 = columnIndexOrThrow16;
                    text3 = null;
                } else {
                    i4 = columnIndexOrThrow;
                    i5 = columnIndexOrThrow16;
                    text3 = sQLiteStatementPrepare.getText(i3);
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    columnIndexOrThrow16 = i5;
                    i6 = columnIndexOrThrow17;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i5);
                    columnIndexOrThrow16 = i5;
                    i6 = columnIndexOrThrow17;
                }
                if (sQLiteStatementPrepare.isNull(i6)) {
                    columnIndexOrThrow17 = i6;
                    i7 = columnIndexOrThrow18;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i6);
                    columnIndexOrThrow17 = i6;
                    i7 = columnIndexOrThrow18;
                }
                if (sQLiteStatementPrepare.isNull(i7)) {
                    columnIndexOrThrow18 = i7;
                    i8 = columnIndexOrThrow19;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i7);
                    columnIndexOrThrow18 = i7;
                    i8 = columnIndexOrThrow19;
                }
                if (sQLiteStatementPrepare.isNull(i8)) {
                    columnIndexOrThrow19 = i8;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i8);
                    columnIndexOrThrow19 = i8;
                }
                arrayList.add(new cSW(j, j2, text8, text, i9, text9, text10, text11, j3, j4, text12, text13, text14, text2, text3, text4, text5, text6, text7));
                columnIndexOrThrow = i4;
                columnIndexOrThrow15 = i3;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow3 = i;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cIL
    public java.util.List<CustomChainMetaEntity> copydefault() {
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cJr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.KWHzl((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List KWHzl(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM custom_chain_meta ORDER BY create_at ASC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "real_chain_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon_url");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from_custom");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rpc_url");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "faucet_url");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "explorer_url");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_at");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                CustomChainMetaEntity customChainMetaEntity = new CustomChainMetaEntity();
                customChainMetaEntity.setChainId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                customChainMetaEntity.setRealChainId(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                customChainMetaEntity.setChainName(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                customChainMetaEntity.setIconUrl(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                customChainMetaEntity.setFromCustom((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                customChainMetaEntity.setRpcUrl(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                customChainMetaEntity.setFaucetUrl(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                customChainMetaEntity.setExplorerUrl(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                customChainMetaEntity.setCreateAt(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                customChainMetaEntity.setUpdateAt(sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                arrayList.add(customChainMetaEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cIL
    public java.util.List<cSW> OLrzqt(final java.lang.Long l, final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.AEQbTJ(l, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(java.lang.Long l, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        java.lang.String text2;
        int i3;
        int i4;
        java.lang.String text3;
        java.lang.String text4;
        int i5;
        java.lang.String str2;
        java.lang.String text5;
        int i6;
        java.lang.String text6;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM view_custom_chain_coin_meta WHERE chain_id = ? AND rpc_url = ? ORDER BY create_at ASC");
        try {
            if (l == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5793bindLong(1, l.longValue());
            }
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "real_chain_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon_url");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from_custom");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rpc_url");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "faucet_url");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "explorer_url");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_at");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_ids");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbols");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "names");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon_urls");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contract_addresses");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "base_coin_ids");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_types");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "decimal_nums");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_ats");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    i2 = columnIndexOrThrow2;
                    i = columnIndexOrThrow3;
                    text = null;
                } else {
                    i = columnIndexOrThrow3;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                    i2 = columnIndexOrThrow2;
                }
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i3 = columnIndexOrThrow15;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i3 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i3)) {
                    i4 = columnIndexOrThrow;
                    text3 = null;
                } else {
                    i4 = columnIndexOrThrow;
                    text3 = sQLiteStatementPrepare.getText(i3);
                }
                int i8 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i8)) {
                    columnIndexOrThrow16 = i8;
                    text4 = null;
                } else {
                    columnIndexOrThrow16 = i8;
                    text4 = sQLiteStatementPrepare.getText(i8);
                }
                int i9 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i9)) {
                    columnIndexOrThrow17 = i9;
                    i5 = columnIndexOrThrow18;
                    str2 = null;
                } else {
                    java.lang.String text14 = sQLiteStatementPrepare.getText(i9);
                    columnIndexOrThrow17 = i9;
                    i5 = columnIndexOrThrow18;
                    str2 = text14;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    columnIndexOrThrow18 = i5;
                    i6 = columnIndexOrThrow19;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i5);
                    columnIndexOrThrow18 = i5;
                    i6 = columnIndexOrThrow19;
                }
                if (sQLiteStatementPrepare.isNull(i6)) {
                    columnIndexOrThrow19 = i6;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i6);
                    columnIndexOrThrow19 = i6;
                }
                arrayList.add(new cSW(j, j2, text7, text, i7, text8, text9, text10, j3, j4, text11, text12, text13, text2, text3, text4, str2, text5, text6));
                columnIndexOrThrow = i4;
                columnIndexOrThrow15 = i3;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow3 = i;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cIL
    public java.util.List<CustomChainMetaEntity> AEQbTJ(final long j) {
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.OLrzqt(j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List OLrzqt(long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM custom_chain_meta WHERE chain_id = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "real_chain_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon_url");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from_custom");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rpc_url");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "faucet_url");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "explorer_url");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_at");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                CustomChainMetaEntity customChainMetaEntity = new CustomChainMetaEntity();
                customChainMetaEntity.setChainId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                customChainMetaEntity.setRealChainId(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                customChainMetaEntity.setChainName(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                customChainMetaEntity.setIconUrl(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                customChainMetaEntity.setFromCustom((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                customChainMetaEntity.setRpcUrl(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                customChainMetaEntity.setFaucetUrl(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                customChainMetaEntity.setExplorerUrl(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                customChainMetaEntity.setCreateAt(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                customChainMetaEntity.setUpdateAt(sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                arrayList.add(customChainMetaEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cIL
    public java.util.List<CustomChainCoinMetaEntity> OLrzqt(final long j) {
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.KWHzl(j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List KWHzl(long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * from custom_chain_coin_meta WHERE coin_id = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "real_chain_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon_url");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contract_address");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "base_coin_id");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "decimal_num");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow2;
                int i2 = columnIndexOrThrow3;
                arrayList.add(new CustomChainCoinMetaEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.getLong(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), sQLiteStatementPrepare.getLong(columnIndexOrThrow11)));
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cIL
    public java.util.List<CustomChainMetaStatusEntity> OLrzqt() {
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.AEQbTJ((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM custom_chain_meta_status");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "used");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new CustomChainMetaStatusEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cIL
    public void OLrzqt(final long j, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final long j2) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.AEQbTJ(str, str2, str3, j2, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_meta SET chain_name = ?, rpc_url = ?, explorer_url = ?, update_at = ? WHERE chain_id = ? and rpc_url = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str2);
            }
            if (str3 == null) {
                sQLiteStatementPrepare.mo5794bindNull(3);
            } else {
                sQLiteStatementPrepare.mo5795bindText(3, str3);
            }
            sQLiteStatementPrepare.mo5793bindLong(4, j);
            sQLiteStatementPrepare.mo5793bindLong(5, j2);
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(6);
            } else {
                sQLiteStatementPrepare.mo5795bindText(6, str2);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cIL
    public int EZpvd(final long j, final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.AYXKKw(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer AYXKKw(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_meta SET icon_url = ? WHERE chain_id = ?");
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

    @Override // o.cIL
    public java.lang.Object KWHzl(final java.util.HashSet<java.lang.Long> hashSet, Continuation<? super java.lang.Integer> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UPDATE custom_chain_meta SET from_custom = 1 WHERE chain_id IN (");
        StringUtil.appendPlaceholders(sb, hashSet.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.OLrzqt, false, true, new Function1() { // from class: o.cIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.EZpvd(string, hashSet, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer EZpvd(java.lang.String str, java.util.HashSet hashSet, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = hashSet.iterator();
            int i = 1;
            while (it.hasNext()) {
                java.lang.Long l = (java.lang.Long) it.next();
                if (l == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i, l.longValue());
                }
                i++;
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

    @Override // o.cIL
    public void copydefault(final java.util.List<java.lang.Long> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM custom_chain_meta WHERE chain_id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(") and from_custom == 0");
        final java.lang.String string = sb.toString();
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.EZpvd(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object EZpvd(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                java.lang.Long l = (java.lang.Long) it.next();
                if (l == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i, l.longValue());
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cIL
    public void copydefault(final long j, final java.lang.String str) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.OLrzqt(j, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object OLrzqt(long j, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM custom_chain_meta WHERE chain_id = ? AND rpc_url = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, j);
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cIL
    public void EZpvd(final long j, final long j2) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.OLrzqt(j2, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object OLrzqt(long j, long j2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_meta SET create_at = ?, update_at = ? WHERE chain_id = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, j);
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.mo5793bindLong(3, j2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cIL
    public void copydefault(final java.lang.String str, final long j) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.djBIcL(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object djBIcL(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_coin_meta SET symbol = ? WHERE chain_id = ? AND coin_type = 1");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cIL
    public void OLrzqt(final long j, final java.lang.String str) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.gEmmrt(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object gEmmrt(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_coin_meta SET icon_url = ? WHERE chain_id = ? AND coin_type = 1");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cIL
    public int KWHzl(final java.lang.String str, final long j) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.copydefault(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer copydefault(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM custom_chain_wallet_coin WHERE wallet_id = ? AND coin_id = ?");
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

    @Override // o.cIL
    public void EZpvd(final java.util.List<java.lang.Long> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM custom_chain_meta_status WHERE chain_id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.KWHzl(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object KWHzl(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                java.lang.Long l = (java.lang.Long) it.next();
                if (l == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i, l.longValue());
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cIL
    public void EZpvd(final long j, final int i) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cIM.copydefault(i, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object copydefault(int i, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_meta_status SET used = ? WHERE chain_id = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }
}
