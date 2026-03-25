package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.business.defi.biz.database.extra.entity.FullAssetCoinRelationEntity;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.FactionInfo;
import com.okinc.business.defi.biz.net.bean.FactionInfoExtData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.Collections;
import kotlin.jvm.functions.Function1;
import o.InterfaceC11262cHs;

/* JADX INFO: renamed from: o.cHr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11261cHr implements InterfaceC11262cHs {
    public final RoomDatabase copydefault;
    public final EntityInsertAdapter<CoinMetaBean> KWHzl = new EntityInsertAdapter<CoinMetaBean>() { // from class: o.cHr.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `coin_meta` (`coinId`,`baseCoinId`,`chainId`,`realChainId`,`name`,`chainName`,`symbol`,`imageUrl`,`chainImageUrl`,`address`,`decimalNum`,`vdecimalNum`,`orderDecimalNum`,`coinType`,`tokenType`,`isDefault`,`isVisible`,`sort`,`isHotNetwork`,`hotNetworkRank`,`aggregationType`,`tokenSort`,`supportPush`,`supportShowDetail`,`explorerUrl`,`systemToken`,`platformType`,`currencyId`,`cefiSupport`,`aaSupport`,`supportVersion`,`supportFullHistory`,`protocolId`,`protocolType`,`coinCategory`,`riskType`,`isHighQuality`,`stableCoin`,`displayPrecision`,`supportStableCoinInterest`,`chainAddressPrefix`,`factionType`,`cosmosPrefix`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CoinMetaBean coinMetaBean) {
            sQLiteStatement.mo5793bindLong(1, coinMetaBean.getCoinId());
            sQLiteStatement.mo5793bindLong(2, coinMetaBean.getBaseCoinId());
            sQLiteStatement.mo5793bindLong(3, coinMetaBean.getChainId());
            sQLiteStatement.mo5793bindLong(4, coinMetaBean.getRealChainId());
            if (coinMetaBean.getName() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, coinMetaBean.getName());
            }
            if (coinMetaBean.getChainName() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, coinMetaBean.getChainName());
            }
            if (coinMetaBean.getSymbol() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, coinMetaBean.getSymbol());
            }
            if (coinMetaBean.getImageUrl() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, coinMetaBean.getImageUrl());
            }
            if (coinMetaBean.getChainImageUrl() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, coinMetaBean.getChainImageUrl());
            }
            if (coinMetaBean.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(10);
            } else {
                sQLiteStatement.mo5795bindText(10, coinMetaBean.getAddress());
            }
            sQLiteStatement.mo5793bindLong(11, coinMetaBean.getDecimalNum());
            sQLiteStatement.mo5793bindLong(12, coinMetaBean.getVdecimalNum());
            sQLiteStatement.mo5793bindLong(13, coinMetaBean.getOrderDecimalNum());
            sQLiteStatement.mo5793bindLong(14, coinMetaBean.getCoinType());
            if (coinMetaBean.getTokenType() == null) {
                sQLiteStatement.mo5794bindNull(15);
            } else {
                sQLiteStatement.mo5795bindText(15, coinMetaBean.getTokenType());
            }
            sQLiteStatement.mo5793bindLong(16, coinMetaBean.isDefault() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(17, coinMetaBean.isVisible() ? 1L : 0L);
            if (coinMetaBean.getSort() == null) {
                sQLiteStatement.mo5794bindNull(18);
            } else {
                sQLiteStatement.mo5793bindLong(18, coinMetaBean.getSort().intValue());
            }
            sQLiteStatement.mo5793bindLong(19, coinMetaBean.isHotNetwork() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(20, coinMetaBean.getHotNetworkRank());
            sQLiteStatement.mo5793bindLong(21, coinMetaBean.getAggregationType());
            sQLiteStatement.mo5793bindLong(22, coinMetaBean.getTokenSort());
            sQLiteStatement.mo5793bindLong(23, coinMetaBean.getSupportPush() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(24, coinMetaBean.getSupportShowDetail() ? 1L : 0L);
            if (coinMetaBean.getExplorerUrl() == null) {
                sQLiteStatement.mo5794bindNull(25);
            } else {
                sQLiteStatement.mo5795bindText(25, coinMetaBean.getExplorerUrl());
            }
            if ((coinMetaBean.getSystemToken() == null ? null : java.lang.Integer.valueOf(coinMetaBean.getSystemToken().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.mo5794bindNull(26);
            } else {
                sQLiteStatement.mo5793bindLong(26, r0.intValue());
            }
            sQLiteStatement.mo5793bindLong(27, coinMetaBean.getPlatformType());
            sQLiteStatement.mo5793bindLong(28, coinMetaBean.getCurrencyId());
            sQLiteStatement.mo5793bindLong(29, coinMetaBean.getCefiSupport() ? 1L : 0L);
            if ((coinMetaBean.getAaSupport() == null ? null : java.lang.Integer.valueOf(coinMetaBean.getAaSupport().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.mo5794bindNull(30);
            } else {
                sQLiteStatement.mo5793bindLong(30, r0.intValue());
            }
            if (coinMetaBean.getSupportVersion() == null) {
                sQLiteStatement.mo5794bindNull(31);
            } else {
                sQLiteStatement.mo5793bindLong(31, coinMetaBean.getSupportVersion().longValue());
            }
            if ((coinMetaBean.getSupportFullHistory() != null ? java.lang.Integer.valueOf(coinMetaBean.getSupportFullHistory().booleanValue() ? 1 : 0) : null) == null) {
                sQLiteStatement.mo5794bindNull(32);
            } else {
                sQLiteStatement.mo5793bindLong(32, r1.intValue());
            }
            if (coinMetaBean.getProtocolId() == null) {
                sQLiteStatement.mo5794bindNull(33);
            } else {
                sQLiteStatement.mo5793bindLong(33, coinMetaBean.getProtocolId().intValue());
            }
            if (coinMetaBean.getProtocolType() == null) {
                sQLiteStatement.mo5794bindNull(34);
            } else {
                sQLiteStatement.mo5793bindLong(34, coinMetaBean.getProtocolType().intValue());
            }
            sQLiteStatement.mo5793bindLong(35, coinMetaBean.getCoinCategory());
            if (coinMetaBean.getRiskType() == null) {
                sQLiteStatement.mo5794bindNull(36);
            } else {
                sQLiteStatement.mo5793bindLong(36, coinMetaBean.getRiskType().intValue());
            }
            if (coinMetaBean.isHighQuality() == null) {
                sQLiteStatement.mo5794bindNull(37);
            } else {
                sQLiteStatement.mo5793bindLong(37, coinMetaBean.isHighQuality().intValue());
            }
            sQLiteStatement.mo5793bindLong(38, coinMetaBean.getStableCoin() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(39, coinMetaBean.getDisplayPrecision());
            sQLiteStatement.mo5793bindLong(40, coinMetaBean.getSupportStableCoinInterest() ? 1L : 0L);
            if (coinMetaBean.getChainAddressPrefix() == null) {
                sQLiteStatement.mo5794bindNull(41);
            } else {
                sQLiteStatement.mo5795bindText(41, coinMetaBean.getChainAddressPrefix());
            }
            FactionInfo factionInfo = coinMetaBean.getFactionInfo();
            if (factionInfo != null) {
                sQLiteStatement.mo5793bindLong(42, factionInfo.getFactionType());
                FactionInfoExtData extData = factionInfo.getExtData();
                if (extData != null) {
                    if (extData.getCosmosPrefix() == null) {
                        sQLiteStatement.mo5794bindNull(43);
                        return;
                    } else {
                        sQLiteStatement.mo5795bindText(43, extData.getCosmosPrefix());
                        return;
                    }
                }
                sQLiteStatement.mo5794bindNull(43);
                return;
            }
            sQLiteStatement.mo5794bindNull(42);
            sQLiteStatement.mo5794bindNull(43);
        }
    };
    public final EntityInsertAdapter<FullAssetCoinRelationEntity> AEQbTJ = new EntityInsertAdapter<FullAssetCoinRelationEntity>() { // from class: o.cHr.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `full_asset_coin_relation` (`walletId`,`coinId`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull FullAssetCoinRelationEntity fullAssetCoinRelationEntity) {
            if (fullAssetCoinRelationEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, fullAssetCoinRelationEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, fullAssetCoinRelationEntity.getCoinId());
        }
    };

    public C11261cHr(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.copydefault = roomDatabase;
    }

    @Override // o.InterfaceC11262cHs
    public java.util.List<java.lang.Long> copydefault(final java.util.List<CoinMetaBean> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.KWHzl.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11262cHs
    public java.util.List<java.lang.Long> KWHzl(final java.util.List<FullAssetCoinRelationEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AEQbTJ.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11262cHs
    public java.util.List<java.lang.Long> AEQbTJ(final java.util.List<CoinMetaBean> list) {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11262cHs.Application.copydefault(this, list);
    }

    @Override // o.InterfaceC11262cHs
    public java.util.List<java.lang.Long> KWHzl(final boolean z, final java.util.List<FullAssetCoinRelationEntity> list, final java.util.List<CoinMetaBean> list2) {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.OLrzqt(z, list, list2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List OLrzqt(boolean z, java.util.List list, java.util.List list2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11262cHs.Application.EZpvd(this, z, list, list2);
    }

    @Override // o.InterfaceC11262cHs
    public int EZpvd() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AhwBna((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer AhwBna(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(InterfaceC11262cHs.Application.OLrzqt(this));
    }

    @Override // o.InterfaceC11262cHs
    public java.util.List<CoinMetaBean> AEQbTJ() {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.cHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11261cHr.OLrzqt((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List OLrzqt(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.String text2;
        int i6;
        boolean z;
        int i7;
        boolean z2;
        int i8;
        int i9;
        java.lang.Integer numValueOf;
        int i10;
        int i11;
        boolean z3;
        int i12;
        boolean z4;
        int i13;
        boolean z5;
        java.lang.String text3;
        int i14;
        int i15;
        int i16;
        java.lang.Integer numValueOf2;
        java.lang.Boolean boolValueOf;
        int i17;
        int i18;
        boolean z6;
        int i19;
        int i20;
        java.lang.Integer numValueOf3;
        java.lang.Boolean boolValueOf2;
        int i21;
        java.lang.Long lValueOf;
        int i22;
        int i23;
        int i24;
        java.lang.Integer numValueOf4;
        java.lang.Boolean boolValueOf3;
        int i25;
        int i26;
        int i27;
        java.lang.Integer numValueOf5;
        int i28;
        int i29;
        java.lang.Integer numValueOf6;
        int i30;
        int i31;
        int i32;
        java.lang.Integer numValueOf7;
        int i33;
        int i34;
        java.lang.Integer numValueOf8;
        int i35;
        int i36;
        boolean z7;
        int i37;
        boolean z8;
        java.lang.String text4;
        int i38;
        int i39;
        int i40;
        int i41;
        FactionInfo factionInfo;
        int i42;
        int i43;
        FactionInfoExtData factionInfoExtData;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM coin_meta ORDER BY sort ASC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "baseCoinId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "realChainId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "imageUrl");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainImageUrl");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "decimalNum");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "vdecimalNum");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderDecimalNum");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinType");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenType");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDefault");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isVisible");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sort");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHotNetwork");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hotNetworkRank");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aggregationType");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenSort");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supportPush");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supportShowDetail");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "explorerUrl");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "systemToken");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformType");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyId");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cefiSupport");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaSupport");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supportVersion");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supportFullHistory");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "protocolId");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "protocolType");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinCategory");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "riskType");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHighQuality");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stableCoin");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayPrecision");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supportStableCoinInterest");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddressPrefix");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "factionType");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cosmosPrefix");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    i2 = columnIndexOrThrow2;
                    i = columnIndexOrThrow3;
                    text = null;
                } else {
                    i = columnIndexOrThrow3;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                    i2 = columnIndexOrThrow2;
                }
                int i44 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                int i45 = columnIndexOrThrow4;
                int i46 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                int i47 = columnIndexOrThrow5;
                int i48 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                int i49 = columnIndexOrThrow6;
                int i50 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14);
                int i51 = columnIndexOrThrow15;
                if (sQLiteStatementPrepare.isNull(i51)) {
                    i3 = columnIndexOrThrow;
                    i4 = i51;
                    i5 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    i3 = columnIndexOrThrow;
                    i4 = i51;
                    i5 = columnIndexOrThrow16;
                    text2 = sQLiteStatementPrepare.getText(i51);
                }
                int i52 = columnIndexOrThrow7;
                if (((int) sQLiteStatementPrepare.getLong(i5)) != 0) {
                    i6 = columnIndexOrThrow17;
                    z = true;
                } else {
                    i6 = columnIndexOrThrow17;
                    z = false;
                }
                int i53 = columnIndexOrThrow8;
                if (((int) sQLiteStatementPrepare.getLong(i6)) != 0) {
                    i7 = columnIndexOrThrow18;
                    z2 = true;
                } else {
                    i7 = columnIndexOrThrow18;
                    z2 = false;
                }
                if (sQLiteStatementPrepare.isNull(i7)) {
                    i8 = columnIndexOrThrow9;
                    i10 = columnIndexOrThrow19;
                    numValueOf = null;
                    i9 = i6;
                } else {
                    i8 = columnIndexOrThrow9;
                    i9 = i6;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i7));
                    i10 = columnIndexOrThrow19;
                }
                int i54 = i7;
                if (((int) sQLiteStatementPrepare.getLong(i10)) != 0) {
                    i11 = columnIndexOrThrow20;
                    z3 = true;
                } else {
                    i11 = columnIndexOrThrow20;
                    z3 = false;
                }
                int i55 = i10;
                int i56 = (int) sQLiteStatementPrepare.getLong(i11);
                int i57 = i9;
                int i58 = columnIndexOrThrow21;
                int i59 = columnIndexOrThrow10;
                int i60 = (int) sQLiteStatementPrepare.getLong(i58);
                int i61 = columnIndexOrThrow12;
                int i62 = columnIndexOrThrow22;
                int i63 = columnIndexOrThrow11;
                int i64 = (int) sQLiteStatementPrepare.getLong(i62);
                int i65 = columnIndexOrThrow14;
                int i66 = columnIndexOrThrow23;
                int i67 = columnIndexOrThrow13;
                if (((int) sQLiteStatementPrepare.getLong(i66)) != 0) {
                    i12 = columnIndexOrThrow24;
                    z4 = true;
                } else {
                    i12 = columnIndexOrThrow24;
                    z4 = false;
                }
                java.util.ArrayList arrayList2 = arrayList;
                if (((int) sQLiteStatementPrepare.getLong(i12)) != 0) {
                    i13 = columnIndexOrThrow25;
                    z5 = true;
                } else {
                    i13 = columnIndexOrThrow25;
                    z5 = false;
                }
                if (sQLiteStatementPrepare.isNull(i13)) {
                    i14 = columnIndexOrThrow26;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(i13);
                    i14 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i14)) {
                    i15 = i66;
                    i16 = i12;
                    numValueOf2 = null;
                } else {
                    i15 = i66;
                    i16 = i12;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i14));
                }
                if (numValueOf2 == null) {
                    i17 = columnIndexOrThrow27;
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf2.intValue() != 0);
                    i17 = columnIndexOrThrow27;
                }
                int i68 = i13;
                int i69 = (int) sQLiteStatementPrepare.getLong(i17);
                int i70 = columnIndexOrThrow28;
                int i71 = i17;
                int i72 = (int) sQLiteStatementPrepare.getLong(i70);
                int i73 = columnIndexOrThrow29;
                int i74 = i14;
                if (((int) sQLiteStatementPrepare.getLong(i73)) != 0) {
                    i18 = columnIndexOrThrow30;
                    z6 = true;
                } else {
                    i18 = columnIndexOrThrow30;
                    z6 = false;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    i19 = i72;
                    i20 = i73;
                    numValueOf3 = null;
                } else {
                    i19 = i72;
                    i20 = i73;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i18));
                }
                if (numValueOf3 == null) {
                    i21 = columnIndexOrThrow31;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = java.lang.Boolean.valueOf(numValueOf3.intValue() != 0);
                    i21 = columnIndexOrThrow31;
                }
                if (sQLiteStatementPrepare.isNull(i21)) {
                    i22 = columnIndexOrThrow32;
                    lValueOf = null;
                } else {
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i21));
                    i22 = columnIndexOrThrow32;
                }
                if (sQLiteStatementPrepare.isNull(i22)) {
                    i23 = i18;
                    i24 = i19;
                    numValueOf4 = null;
                } else {
                    i23 = i18;
                    i24 = i19;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i22));
                }
                if (numValueOf4 == null) {
                    i25 = columnIndexOrThrow33;
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = java.lang.Boolean.valueOf(numValueOf4.intValue() != 0);
                    i25 = columnIndexOrThrow33;
                }
                if (sQLiteStatementPrepare.isNull(i25)) {
                    i26 = i21;
                    i27 = i22;
                    i28 = columnIndexOrThrow34;
                    numValueOf5 = null;
                } else {
                    i26 = i21;
                    i27 = i22;
                    numValueOf5 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i25));
                    i28 = columnIndexOrThrow34;
                }
                if (sQLiteStatementPrepare.isNull(i28)) {
                    i29 = i25;
                    i30 = columnIndexOrThrow35;
                    numValueOf6 = null;
                } else {
                    i29 = i25;
                    numValueOf6 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i28));
                    i30 = columnIndexOrThrow35;
                }
                int i75 = i26;
                int i76 = (int) sQLiteStatementPrepare.getLong(i30);
                int i77 = columnIndexOrThrow36;
                if (sQLiteStatementPrepare.isNull(i77)) {
                    i31 = i28;
                    i32 = i30;
                    i33 = columnIndexOrThrow37;
                    numValueOf7 = null;
                } else {
                    i31 = i28;
                    i32 = i30;
                    numValueOf7 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i77));
                    i33 = columnIndexOrThrow37;
                }
                if (sQLiteStatementPrepare.isNull(i33)) {
                    i34 = i76;
                    i35 = columnIndexOrThrow38;
                    numValueOf8 = null;
                } else {
                    i34 = i76;
                    numValueOf8 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i33));
                    i35 = columnIndexOrThrow38;
                }
                int i78 = i33;
                if (((int) sQLiteStatementPrepare.getLong(i35)) != 0) {
                    i36 = columnIndexOrThrow39;
                    z7 = true;
                } else {
                    i36 = columnIndexOrThrow39;
                    z7 = false;
                }
                int i79 = i35;
                int i80 = (int) sQLiteStatementPrepare.getLong(i36);
                int i81 = columnIndexOrThrow40;
                int i82 = i36;
                if (((int) sQLiteStatementPrepare.getLong(i81)) != 0) {
                    i37 = columnIndexOrThrow41;
                    z8 = true;
                } else {
                    i37 = columnIndexOrThrow41;
                    z8 = false;
                }
                if (sQLiteStatementPrepare.isNull(i37)) {
                    i38 = columnIndexOrThrow42;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i37);
                    i38 = columnIndexOrThrow42;
                }
                if (sQLiteStatementPrepare.isNull(i38)) {
                    i39 = i5;
                    i40 = columnIndexOrThrow43;
                    if (sQLiteStatementPrepare.isNull(i40)) {
                        i41 = i40;
                        i43 = i81;
                        i42 = i37;
                        factionInfo = null;
                        arrayList2.add(new CoinMetaBean(j, j2, j3, j4, text5, text6, text7, text8, text9, text, i44, i46, i48, i50, text2, z, z2, numValueOf, z3, i56, i60, i64, z4, z5, text3, factionInfo, boolValueOf, i69, i24, z6, boolValueOf2, lValueOf, boolValueOf3, numValueOf5, numValueOf6, i34, numValueOf7, numValueOf8, z7, i80, z8, text4));
                        columnIndexOrThrow = i3;
                        columnIndexOrThrow7 = i52;
                        columnIndexOrThrow9 = i8;
                        columnIndexOrThrow18 = i54;
                        columnIndexOrThrow19 = i55;
                        columnIndexOrThrow11 = i63;
                        columnIndexOrThrow13 = i67;
                        columnIndexOrThrow23 = i15;
                        columnIndexOrThrow24 = i16;
                        columnIndexOrThrow25 = i68;
                        columnIndexOrThrow27 = i71;
                        columnIndexOrThrow26 = i74;
                        columnIndexOrThrow29 = i20;
                        columnIndexOrThrow30 = i23;
                        columnIndexOrThrow32 = i27;
                        columnIndexOrThrow33 = i29;
                        columnIndexOrThrow31 = i75;
                        columnIndexOrThrow34 = i31;
                        columnIndexOrThrow36 = i77;
                        columnIndexOrThrow38 = i79;
                        columnIndexOrThrow39 = i82;
                        columnIndexOrThrow16 = i39;
                        columnIndexOrThrow40 = i43;
                        columnIndexOrThrow41 = i42;
                        columnIndexOrThrow3 = i;
                        columnIndexOrThrow4 = i45;
                        columnIndexOrThrow5 = i47;
                        columnIndexOrThrow15 = i4;
                        columnIndexOrThrow12 = i61;
                        columnIndexOrThrow14 = i65;
                        columnIndexOrThrow28 = i70;
                        columnIndexOrThrow35 = i32;
                        columnIndexOrThrow37 = i78;
                        columnIndexOrThrow43 = i41;
                        columnIndexOrThrow20 = i11;
                        columnIndexOrThrow22 = i62;
                        columnIndexOrThrow42 = i38;
                        columnIndexOrThrow10 = i59;
                        columnIndexOrThrow6 = i49;
                        arrayList = arrayList2;
                        columnIndexOrThrow21 = i58;
                        columnIndexOrThrow8 = i53;
                        columnIndexOrThrow2 = i2;
                        columnIndexOrThrow17 = i57;
                    }
                } else {
                    i39 = i5;
                    i40 = columnIndexOrThrow43;
                }
                i43 = i81;
                i42 = i37;
                int i83 = (int) sQLiteStatementPrepare.getLong(i38);
                if (sQLiteStatementPrepare.isNull(i40)) {
                    i41 = i40;
                    factionInfoExtData = null;
                } else {
                    i41 = i40;
                    factionInfoExtData = new FactionInfoExtData(sQLiteStatementPrepare.isNull(i40) ? null : sQLiteStatementPrepare.getText(i40));
                }
                factionInfo = new FactionInfo(i83, factionInfoExtData);
                arrayList2.add(new CoinMetaBean(j, j2, j3, j4, text5, text6, text7, text8, text9, text, i44, i46, i48, i50, text2, z, z2, numValueOf, z3, i56, i60, i64, z4, z5, text3, factionInfo, boolValueOf, i69, i24, z6, boolValueOf2, lValueOf, boolValueOf3, numValueOf5, numValueOf6, i34, numValueOf7, numValueOf8, z7, i80, z8, text4));
                columnIndexOrThrow = i3;
                columnIndexOrThrow7 = i52;
                columnIndexOrThrow9 = i8;
                columnIndexOrThrow18 = i54;
                columnIndexOrThrow19 = i55;
                columnIndexOrThrow11 = i63;
                columnIndexOrThrow13 = i67;
                columnIndexOrThrow23 = i15;
                columnIndexOrThrow24 = i16;
                columnIndexOrThrow25 = i68;
                columnIndexOrThrow27 = i71;
                columnIndexOrThrow26 = i74;
                columnIndexOrThrow29 = i20;
                columnIndexOrThrow30 = i23;
                columnIndexOrThrow32 = i27;
                columnIndexOrThrow33 = i29;
                columnIndexOrThrow31 = i75;
                columnIndexOrThrow34 = i31;
                columnIndexOrThrow36 = i77;
                columnIndexOrThrow38 = i79;
                columnIndexOrThrow39 = i82;
                columnIndexOrThrow16 = i39;
                columnIndexOrThrow40 = i43;
                columnIndexOrThrow41 = i42;
                columnIndexOrThrow3 = i;
                columnIndexOrThrow4 = i45;
                columnIndexOrThrow5 = i47;
                columnIndexOrThrow15 = i4;
                columnIndexOrThrow12 = i61;
                columnIndexOrThrow14 = i65;
                columnIndexOrThrow28 = i70;
                columnIndexOrThrow35 = i32;
                columnIndexOrThrow37 = i78;
                columnIndexOrThrow43 = i41;
                columnIndexOrThrow20 = i11;
                columnIndexOrThrow22 = i62;
                columnIndexOrThrow42 = i38;
                columnIndexOrThrow10 = i59;
                columnIndexOrThrow6 = i49;
                arrayList = arrayList2;
                columnIndexOrThrow21 = i58;
                columnIndexOrThrow8 = i53;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow17 = i57;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11262cHs
    public java.util.List<FullAssetCoinRelationEntity> copydefault() {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.cHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11261cHr.copydefault((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM full_asset_coin_relation");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinId");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new FullAssetCoinRelationEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11262cHs
    public int copydefault(final int i) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11261cHr.EZpvd(i, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer EZpvd(int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM coin_meta WHERE coinCategory = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11262cHs
    public int KWHzl() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11261cHr.djBIcL((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer djBIcL(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM full_asset_coin_relation");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> OLrzqt() {
        return Collections.emptyList();
    }
}
