package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.market.alert.data.MarketUserAlert;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.InterfaceC38367pWd;

/* JADX INFO: renamed from: o.pWg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C38370pWg implements InterfaceC38367pWd {
    public final RoomDatabase KWHzl;
    public final EntityInsertAdapter<MarketUserAlert> OLrzqt = new EntityInsertAdapter<MarketUserAlert>() { // from class: o.pWg.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `MarketUserAlert` (`id`,`instId`,`userId`,`instType`,`createTime`,`ruleId`,`chainId`,`tokenAddress`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull MarketUserAlert marketUserAlert) {
            sQLiteStatement.mo5793bindLong(1, marketUserAlert.getId());
            if (marketUserAlert.getInstId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, marketUserAlert.getInstId());
            }
            if (marketUserAlert.getUserId() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, marketUserAlert.getUserId());
            }
            if (marketUserAlert.getInstType() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, marketUserAlert.getInstType());
            }
            sQLiteStatement.mo5793bindLong(5, marketUserAlert.getCreateTime());
            if (marketUserAlert.getRuleId() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, marketUserAlert.getRuleId());
            }
            if (marketUserAlert.getChainId() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, marketUserAlert.getChainId());
            }
            if (marketUserAlert.getTokenAddress() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, marketUserAlert.getTokenAddress());
            }
        }
    };
    public final EntityInsertAdapter<MarketUserAlert> EZpvd = new EntityInsertAdapter<MarketUserAlert>() { // from class: o.pWg.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR IGNORE INTO `MarketUserAlert` (`id`,`instId`,`userId`,`instType`,`createTime`,`ruleId`,`chainId`,`tokenAddress`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull MarketUserAlert marketUserAlert) {
            sQLiteStatement.mo5793bindLong(1, marketUserAlert.getId());
            if (marketUserAlert.getInstId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, marketUserAlert.getInstId());
            }
            if (marketUserAlert.getUserId() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, marketUserAlert.getUserId());
            }
            if (marketUserAlert.getInstType() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, marketUserAlert.getInstType());
            }
            sQLiteStatement.mo5793bindLong(5, marketUserAlert.getCreateTime());
            if (marketUserAlert.getRuleId() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, marketUserAlert.getRuleId());
            }
            if (marketUserAlert.getChainId() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, marketUserAlert.getChainId());
            }
            if (marketUserAlert.getTokenAddress() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, marketUserAlert.getTokenAddress());
            }
        }
    };

    public C38370pWg(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.KWHzl = roomDatabase;
    }

    @Override // o.InterfaceC38367pWd
    public void copydefault(final MarketUserAlert marketUserAlert) {
        marketUserAlert.getClass();
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.pWh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(marketUserAlert, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object copydefault(MarketUserAlert marketUserAlert, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.OLrzqt.insert(sQLiteConnection, marketUserAlert);
        return null;
    }

    @Override // o.InterfaceC38367pWd
    public void copydefault(final java.util.List<MarketUserAlert> list) {
        list.getClass();
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.pWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.EZpvd.insert(sQLiteConnection, list);
        return null;
    }

    @Override // o.InterfaceC38367pWd
    public void OLrzqt(final java.util.List<MarketUserAlert> list) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.pWm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.EZpvd(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit EZpvd(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        InterfaceC38367pWd.StateListAnimator.AEQbTJ(this, list);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38367pWd
    public void copydefault(final java.lang.String str, final java.util.List<MarketUserAlert> list) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.pWo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(str, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit AEQbTJ(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        InterfaceC38367pWd.StateListAnimator.KWHzl(this, str, list);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38367pWd
    public java.util.List<MarketUserAlert> AEQbTJ(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.KWHzl, true, false, new Function1() { // from class: o.pWl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38370pWg.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MarketUserAlert WHERE userId = ? order by id desc");
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
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ruleId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAddress");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new MarketUserAlert(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC38367pWd
    public boolean EZpvd(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        return ((java.lang.Boolean) DBUtil.performBlocking(this.KWHzl, true, false, new Function1() { // from class: o.pWi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38370pWg.AEQbTJ(str, str2, str3, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Boolean AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM MarketUserAlert WHERE userId = ? AND instId = ? AND instType = ? LIMIT 1)");
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

    @Override // o.InterfaceC38367pWd
    public boolean KWHzl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        return ((java.lang.Boolean) DBUtil.performBlocking(this.KWHzl, true, false, new Function1() { // from class: o.pWf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38370pWg.KWHzl(str, str2, str3, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Boolean KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM MarketUserAlert WHERE userId = ? AND chainId = ? AND tokenAddress = ? LIMIT 1)");
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

    @Override // o.InterfaceC38367pWd
    public void KWHzl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final long j, final java.lang.String str4) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.pWk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38370pWg.OLrzqt(str, str2, str3, j, str4, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM MarketUserAlert WHERE userId = ? AND instId = ? AND instType = ? AND createTime = ? AND ruleId = ?");
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
            if (str4 == null) {
                sQLiteStatementPrepare.mo5794bindNull(5);
            } else {
                sQLiteStatementPrepare.mo5795bindText(5, str4);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC38367pWd
    public void OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final long j, final java.lang.String str4) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.pWe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38370pWg.copydefault(str, str2, str3, j, str4, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM MarketUserAlert WHERE userId = ? AND chainId = ? AND tokenAddress = ? AND createTime = ? AND ruleId = ?");
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
            if (str4 == null) {
                sQLiteStatementPrepare.mo5794bindNull(5);
            } else {
                sQLiteStatementPrepare.mo5795bindText(5, str4);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC38367pWd
    public void OLrzqt(final java.lang.String str) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.pWj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38370pWg.KWHzl(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object KWHzl(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM MarketUserAlert WHERE userId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC38367pWd
    public void KWHzl(MarketUserAlert marketUserAlert) {
        InterfaceC38367pWd.StateListAnimator.KWHzl(this, marketUserAlert);
    }

    public static java.util.List<java.lang.Class<?>> OLrzqt() {
        return Collections.emptyList();
    }
}
