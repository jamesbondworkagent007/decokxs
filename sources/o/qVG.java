package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.market.watch.data.GroupMarketUserFavorite;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.UserGroup;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import o.qVF;

/* JADX INFO: loaded from: classes23.dex */
public final class qVG implements qVF {
    public final RoomDatabase copydefault;
    public final EntityInsertAdapter<MarketUserFavorite> AEQbTJ = new EntityInsertAdapter<MarketUserFavorite>() { // from class: o.qVG.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `MarketUserFavorite` (`id`,`instId`,`userId`,`instType`,`alias`,`expTime`,`chainId`,`tokenContractAddress`,`tokenSymbol`,`tokenName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull MarketUserFavorite marketUserFavorite) {
            sQLiteStatement.mo5793bindLong(1, marketUserFavorite.getId());
            if (marketUserFavorite.getInstId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, marketUserFavorite.getInstId());
            }
            if (marketUserFavorite.getUserId() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, marketUserFavorite.getUserId());
            }
            if (marketUserFavorite.getInstType() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, marketUserFavorite.getInstType());
            }
            if (marketUserFavorite.getAlias() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, marketUserFavorite.getAlias());
            }
            if (marketUserFavorite.getExpTime() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, marketUserFavorite.getExpTime());
            }
            if (marketUserFavorite.getChainId() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, marketUserFavorite.getChainId());
            }
            if (marketUserFavorite.getTokenContractAddress() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, marketUserFavorite.getTokenContractAddress());
            }
            if (marketUserFavorite.getTokenSymbol() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, marketUserFavorite.getTokenSymbol());
            }
            if (marketUserFavorite.getTokenName() == null) {
                sQLiteStatement.mo5794bindNull(10);
            } else {
                sQLiteStatement.mo5795bindText(10, marketUserFavorite.getTokenName());
            }
        }
    };
    public final EntityInsertAdapter<GroupMarketUserFavorite> OLrzqt = new EntityInsertAdapter<GroupMarketUserFavorite>() { // from class: o.qVG.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `GroupMarketUserFavorite` (`id`,`groupName`,`userId`,`instId`,`instType`,`alias`,`chainId`,`tokenContractAddress`,`tokenSymbol`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull GroupMarketUserFavorite groupMarketUserFavorite) {
            sQLiteStatement.mo5793bindLong(1, groupMarketUserFavorite.getId());
            if (groupMarketUserFavorite.getGroupName() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, groupMarketUserFavorite.getGroupName());
            }
            if (groupMarketUserFavorite.getUserId() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, groupMarketUserFavorite.getUserId());
            }
            if (groupMarketUserFavorite.getInstId() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, groupMarketUserFavorite.getInstId());
            }
            if (groupMarketUserFavorite.getInstType() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, groupMarketUserFavorite.getInstType());
            }
            if (groupMarketUserFavorite.getAlias() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, groupMarketUserFavorite.getAlias());
            }
            if (groupMarketUserFavorite.getChainId() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, groupMarketUserFavorite.getChainId());
            }
            if (groupMarketUserFavorite.getTokenContractAddress() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, groupMarketUserFavorite.getTokenContractAddress());
            }
            if (groupMarketUserFavorite.getTokenSymbol() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, groupMarketUserFavorite.getTokenSymbol());
            }
        }
    };
    public final EntityInsertAdapter<UserGroup> EZpvd = new EntityInsertAdapter<UserGroup>() { // from class: o.qVG.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `UserGroup` (`groupName`,`userId`,`groupIndex`,`isHidden`,`isPreset`,`translatedGroupName`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull UserGroup userGroup) {
            if (userGroup.getGroupName() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, userGroup.getGroupName());
            }
            if (userGroup.getUserId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, userGroup.getUserId());
            }
            sQLiteStatement.mo5793bindLong(3, userGroup.getGroupIndex());
            sQLiteStatement.mo5793bindLong(4, userGroup.isHidden() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(5, userGroup.isPreset() ? 1L : 0L);
            if (userGroup.getTranslatedGroupName() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, userGroup.getTranslatedGroupName());
            }
        }
    };

    public qVG(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.copydefault = roomDatabase;
    }

    @Override // o.qVF
    public void OLrzqt(final MarketUserFavorite marketUserFavorite) {
        marketUserFavorite.getClass();
        DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.qVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.KWHzl(marketUserFavorite, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object KWHzl(MarketUserFavorite marketUserFavorite, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AEQbTJ.insert(sQLiteConnection, marketUserFavorite);
        return null;
    }

    @Override // o.qVF
    public java.lang.Object copydefault(final GroupMarketUserFavorite groupMarketUserFavorite, Continuation<? super Unit> continuation) {
        groupMarketUserFavorite.getClass();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.qVW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.KWHzl(groupMarketUserFavorite, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit KWHzl(GroupMarketUserFavorite groupMarketUserFavorite, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.OLrzqt.insert(sQLiteConnection, groupMarketUserFavorite);
        return Unit.INSTANCE;
    }

    @Override // o.qVF
    public java.lang.Object OLrzqt(final UserGroup userGroup, Continuation<? super Unit> continuation) {
        userGroup.getClass();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.qWb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.OLrzqt(userGroup, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit OLrzqt(UserGroup userGroup, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.EZpvd.insert(sQLiteConnection, userGroup);
        return Unit.INSTANCE;
    }

    @Override // o.qVF
    public java.lang.Object EZpvd(final java.util.List<MarketUserFavorite> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.qVS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.EZpvd(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit EZpvd(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AEQbTJ.insert(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    @Override // o.qVF
    public void copydefault(final java.util.List<MarketUserFavorite> list) {
        DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.qVN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        qVF.Application.AEQbTJ(this, (java.util.List<MarketUserFavorite>) list);
        return Unit.INSTANCE;
    }

    @Override // o.qVF
    public void copydefault(final MarketUserFavorite marketUserFavorite) {
        DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.qVQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.EZpvd(marketUserFavorite, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit EZpvd(MarketUserFavorite marketUserFavorite, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        qVF.Application.OLrzqt(this, marketUserFavorite);
        return Unit.INSTANCE;
    }

    @Override // o.qVF
    public java.lang.Object copydefault(final java.lang.String str, Continuation<? super java.util.List<C40453qWk>> continuation) {
        return DBUtil.performInTransactionSuspending(this.copydefault, new Function1() { // from class: o.qWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(str, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object OLrzqt(java.lang.String str, Continuation continuation) {
        return qVF.Application.copydefault(this, str, continuation);
    }

    @Override // o.qVF
    public java.lang.Object AEQbTJ(final java.lang.String str, final java.util.List<C40453qWk> list, Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.copydefault, new Function1() { // from class: o.qVP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(str, list, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object OLrzqt(java.lang.String str, java.util.List list, Continuation continuation) {
        return qVF.Application.copydefault(this, str, list, continuation);
    }

    @Override // o.qVF
    public java.util.List<MarketUserFavorite> copydefault(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.qVY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.AYXKKw(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AYXKKw(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MarketUserFavorite WHERE userId = ? order by id");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MTPushConstants.Operation.KEY_ALIAS);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenContractAddress");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenSymbol");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenName");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new MarketUserFavorite(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public Flow<java.lang.Boolean> OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6) {
        return FlowUtil.createFlow(this.copydefault, false, new java.lang.String[]{"MarketUserFavorite"}, new Function1() { // from class: o.qVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.OLrzqt(str, str2, str3, str4, str5, str6, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Boolean OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM MarketUserFavorite WHERE userId = ? AND instId = ? AND instType = ? AND alias = ? AND chainId = ? AND tokenContractAddress = ? LIMIT 1)");
        boolean z = true;
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
            if (str4 == null) {
                sQLiteStatementPrepare.mo5794bindNull(4);
            } else {
                sQLiteStatementPrepare.mo5795bindText(4, str4);
            }
            if (str5 == null) {
                sQLiteStatementPrepare.mo5794bindNull(5);
            } else {
                sQLiteStatementPrepare.mo5795bindText(5, str5);
            }
            if (str6 == null) {
                sQLiteStatementPrepare.mo5794bindNull(6);
            } else {
                sQLiteStatementPrepare.mo5795bindText(6, str6);
            }
            java.lang.Boolean boolValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z = false;
                    }
                    boolValueOf = java.lang.Boolean.valueOf(z);
                }
            }
            return boolValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public Flow<java.lang.Boolean> copydefault(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        return FlowUtil.createFlow(this.copydefault, false, new java.lang.String[]{"MarketUserFavorite"}, new Function1() { // from class: o.qVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.djBIcL(str, str2, str3, str4, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Boolean djBIcL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM MarketUserFavorite WHERE userId = ? AND instId = ? AND instType = ? AND alias = ? LIMIT 1)");
        boolean z = true;
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
            if (str4 == null) {
                sQLiteStatementPrepare.mo5794bindNull(4);
            } else {
                sQLiteStatementPrepare.mo5795bindText(4, str4);
            }
            java.lang.Boolean boolValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z = false;
                    }
                    boolValueOf = java.lang.Boolean.valueOf(z);
                }
            }
            return boolValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public Flow<java.lang.Boolean> KWHzl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        return FlowUtil.createFlow(this.copydefault, false, new java.lang.String[]{"MarketUserFavorite"}, new Function1() { // from class: o.qVO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.AYXKKw(str, str2, str3, str4, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Boolean AYXKKw(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM MarketUserFavorite WHERE userId = ? AND instType = ? AND chainId = ? AND tokenContractAddress = ? LIMIT 1)");
        boolean z = true;
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
            if (str4 == null) {
                sQLiteStatementPrepare.mo5794bindNull(4);
            } else {
                sQLiteStatementPrepare.mo5795bindText(4, str4);
            }
            java.lang.Boolean boolValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z = false;
                    }
                    boolValueOf = java.lang.Boolean.valueOf(z);
                }
            }
            return boolValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public boolean AEQbTJ(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        return ((java.lang.Boolean) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.qVR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.gEmmrt(str, str2, str3, str4, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Boolean gEmmrt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM MarketUserFavorite WHERE userId = ? AND instId = ? AND instType = ? AND alias = ? LIMIT 1)");
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
            if (str4 == null) {
                sQLiteStatementPrepare.mo5794bindNull(4);
            } else {
                sQLiteStatementPrepare.mo5795bindText(4, str4);
            }
            if (sQLiteStatementPrepare.step()) {
                z = ((int) sQLiteStatementPrepare.getLong(0)) != 0;
            }
            sQLiteStatementPrepare.close();
            return java.lang.Boolean.valueOf(z);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.qVF
    public boolean EZpvd(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        return ((java.lang.Boolean) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.qVH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.AhwBna(str, str2, str3, str4, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Boolean AhwBna(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM MarketUserFavorite WHERE userId = ? AND instType = ? AND chainId = ? AND tokenContractAddress = ? LIMIT 1)");
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
            if (str4 == null) {
                sQLiteStatementPrepare.mo5794bindNull(4);
            } else {
                sQLiteStatementPrepare.mo5795bindText(4, str4);
            }
            if (sQLiteStatementPrepare.step()) {
                z = ((int) sQLiteStatementPrepare.getLong(0)) != 0;
            }
            sQLiteStatementPrepare.close();
            return java.lang.Boolean.valueOf(z);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.qVF
    public boolean copydefault(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6) {
        return ((java.lang.Boolean) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.qVV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.copydefault(str, str2, str3, str4, str5, str6, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Boolean copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM MarketUserFavorite WHERE userId = ? AND instId = ? AND instType = ? AND alias = ? AND chainId = ? AND tokenContractAddress = ? LIMIT 1)");
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
            if (str4 == null) {
                sQLiteStatementPrepare.mo5794bindNull(4);
            } else {
                sQLiteStatementPrepare.mo5795bindText(4, str4);
            }
            if (str5 == null) {
                sQLiteStatementPrepare.mo5794bindNull(5);
            } else {
                sQLiteStatementPrepare.mo5795bindText(5, str5);
            }
            if (str6 == null) {
                sQLiteStatementPrepare.mo5794bindNull(6);
            } else {
                sQLiteStatementPrepare.mo5795bindText(6, str6);
            }
            if (sQLiteStatementPrepare.step()) {
                z = ((int) sQLiteStatementPrepare.getLong(0)) != 0;
            }
            sQLiteStatementPrepare.close();
            return java.lang.Boolean.valueOf(z);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.qVF
    public Flow<java.util.List<MarketUserFavorite>> OLrzqt(final java.lang.String str) {
        return FlowUtil.createFlow(this.copydefault, false, new java.lang.String[]{"MarketUserFavorite"}, new Function1() { // from class: o.qVT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.AkhnZx(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AkhnZx(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MarketUserFavorite WHERE userId = ? order by id ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MTPushConstants.Operation.KEY_ALIAS);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenContractAddress");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenSymbol");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenName");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new MarketUserFavorite(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public java.util.List<UserGroup> AEQbTJ(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.qVZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.isConnected(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List isConnected(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM UserGroup WHERE userId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupName");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupIndex");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isPreset");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "translatedGroupName");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i2 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                int i3 = columnIndexOrThrow2;
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0) {
                    i = columnIndexOrThrow3;
                    z = true;
                } else {
                    i = columnIndexOrThrow3;
                    z = false;
                }
                arrayList.add(new UserGroup(text, text2, i2, z, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow3 = i;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public Flow<java.util.List<MarketUserFavorite>> AEQbTJ(final java.lang.String str, final java.lang.String str2) {
        return FlowUtil.createFlow(this.copydefault, false, new java.lang.String[]{"MarketUserFavorite", "GroupMarketUserFavorite"}, new Function1() { // from class: o.qWa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.OLrzqt(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List OLrzqt(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n    SELECT m.* FROM MarketUserFavorite m\n    JOIN GroupMarketUserFavorite g ON m.userId = g.userId AND m.instId = g.instId AND m.instType = g.instType AND m.alias = g.alias  AND m.chainId = g.chainId AND m.tokenContractAddress = g.tokenContractAddress\n    WHERE LOWER(g.groupName) = LOWER(?) AND g.userId = ?\n    ORDER BY g.id \n");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MTPushConstants.Operation.KEY_ALIAS);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenContractAddress");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenSymbol");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenName");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new MarketUserFavorite(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public java.util.List<MarketUserFavorite> EZpvd(final java.lang.String str, final java.lang.String str2) {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.qVX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.copydefault(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n    SELECT m.* FROM MarketUserFavorite m\n    JOIN GroupMarketUserFavorite g ON m.userId = g.userId AND m.instId = g.instId AND m.instType = g.instType AND m.alias = g.alias  AND m.chainId = g.chainId AND m.tokenContractAddress = g.tokenContractAddress\n    WHERE LOWER(g.groupName) = LOWER(?) AND g.userId = ?\n    ORDER BY g.id \n");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MTPushConstants.Operation.KEY_ALIAS);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenContractAddress");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenSymbol");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenName");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new MarketUserFavorite(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public void OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.qWd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.valueOf(str, str2, str3, str4, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM MarketUserFavorite WHERE userId = ? AND instId = ? AND instType = ? AND alias = ?");
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
            if (str4 == null) {
                sQLiteStatementPrepare.mo5794bindNull(4);
            } else {
                sQLiteStatementPrepare.mo5795bindText(4, str4);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.qVF
    public java.lang.Object AEQbTJ(final java.lang.String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.qVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.AhwBna(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit AhwBna(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM UserGroup WHERE userId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public java.lang.Object EZpvd(final java.lang.String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.qVM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.valueOf(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit valueOf(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM MarketUserFavorite WHERE userId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public java.lang.Object KWHzl(final java.lang.String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.qVI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVG.gEmmrt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit gEmmrt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM GroupMarketUserFavorite WHERE userId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.qVF
    public void EZpvd(MarketUserFavorite marketUserFavorite) {
        qVF.Application.AEQbTJ(this, marketUserFavorite);
    }

    public static java.util.List<java.lang.Class<?>> copydefault() {
        return Collections.emptyList();
    }
}
