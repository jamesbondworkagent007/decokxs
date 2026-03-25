package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final class cHW implements cHP {
    public final RoomDatabase OLrzqt;
    public final EntityInsertAdapter<C11276cIf> KWHzl = new EntityInsertAdapter<C11276cIf>() { // from class: o.cHW.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `referral_info` (`walletType`,`walletAddress`,`encryptedReferralInfo`,`createdTime`,`updatedTime`) VALUES (?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull C11276cIf c11276cIf) {
            if (c11276cIf.copydefault() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, c11276cIf.copydefault());
            }
            if (c11276cIf.KWHzl() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, c11276cIf.KWHzl());
            }
            if (c11276cIf.OLrzqt() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, c11276cIf.OLrzqt());
            }
            sQLiteStatement.mo5793bindLong(4, c11276cIf.AEQbTJ());
            sQLiteStatement.mo5793bindLong(5, c11276cIf.EZpvd());
        }
    };
    public final EntityDeleteOrUpdateAdapter<C11276cIf> EZpvd = new EntityDeleteOrUpdateAdapter<C11276cIf>() { // from class: o.cHW.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `referral_info` SET `walletType` = ?,`walletAddress` = ?,`encryptedReferralInfo` = ?,`createdTime` = ?,`updatedTime` = ? WHERE `walletType` = ? AND `walletAddress` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull C11276cIf c11276cIf) {
            if (c11276cIf.copydefault() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, c11276cIf.copydefault());
            }
            if (c11276cIf.KWHzl() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, c11276cIf.KWHzl());
            }
            if (c11276cIf.OLrzqt() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, c11276cIf.OLrzqt());
            }
            sQLiteStatement.mo5793bindLong(4, c11276cIf.AEQbTJ());
            sQLiteStatement.mo5793bindLong(5, c11276cIf.EZpvd());
            if (c11276cIf.copydefault() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, c11276cIf.copydefault());
            }
            if (c11276cIf.KWHzl() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, c11276cIf.KWHzl());
            }
        }
    };

    public cHW(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.OLrzqt = roomDatabase;
    }

    @Override // o.cHP
    public java.lang.Object AEQbTJ(final C11276cIf c11276cIf, Continuation<? super java.lang.Long> continuation) {
        c11276cIf.getClass();
        return DBUtil.performSuspending(this.OLrzqt, false, true, new Function1() { // from class: o.cHT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.KWHzl(c11276cIf, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Long KWHzl(C11276cIf c11276cIf, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.KWHzl.insertAndReturnId(sQLiteConnection, c11276cIf));
    }

    @Override // o.cHP
    public java.lang.Object KWHzl(final C11276cIf c11276cIf, Continuation<? super java.lang.Integer> continuation) {
        c11276cIf.getClass();
        return DBUtil.performSuspending(this.OLrzqt, false, true, new Function1() { // from class: o.cHU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.EZpvd(c11276cIf, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Integer EZpvd(C11276cIf c11276cIf, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.EZpvd.handle(sQLiteConnection, c11276cIf));
    }

    @Override // o.cHP
    public java.lang.Object copydefault(final java.lang.String str, final java.lang.String str2, Continuation<? super C11276cIf> continuation) {
        return DBUtil.performSuspending(this.OLrzqt, true, false, new Function1() { // from class: o.cHS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cHW.AEQbTJ(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ C11276cIf AEQbTJ(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM referral_info WHERE walletType = ? AND walletAddress = ?");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletType");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletAddress");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptedReferralInfo");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedTime");
            C11276cIf c11276cIf = null;
            if (sQLiteStatementPrepare.step()) {
                c11276cIf = new C11276cIf(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
            }
            return c11276cIf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cHP
    public java.lang.Object KWHzl(Continuation<? super java.util.List<C11276cIf>> continuation) {
        return DBUtil.performSuspending(this.OLrzqt, true, false, new Function1() { // from class: o.cHV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cHW.EZpvd((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List EZpvd(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM referral_info");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletType");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletAddress");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptedReferralInfo");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedTime");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new C11276cIf(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cHP
    public java.lang.Object OLrzqt(final java.lang.String str, final java.lang.String str2, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.OLrzqt, false, true, new Function1() { // from class: o.cHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cHW.KWHzl(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer KWHzl(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM referral_info WHERE walletType = ? AND walletAddress = ?");
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
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }
}
