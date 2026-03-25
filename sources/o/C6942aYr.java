package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.aYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C6942aYr implements InterfaceC6944aYt {
    public final RoomDatabase AEQbTJ;
    public final EntityInsertAdapter<C6913aYO> copydefault = new EntityInsertAdapter<C6913aYO>() { // from class: o.aYr.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `event_info` (`_id`,`event_name`,`event_params`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, C6913aYO c6913aYO) {
            sQLiteStatement.mo5793bindLong(1, c6913aYO.AEQbTJ);
            if (c6913aYO.AEQbTJ() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, c6913aYO.AEQbTJ());
            }
            java.lang.String strEZpvd = C6908aYJ.EZpvd(c6913aYO.EZpvd());
            if (strEZpvd == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, strEZpvd);
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<C6913aYO> OLrzqt = new EntityDeleteOrUpdateAdapter<C6913aYO>() { // from class: o.aYr.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `event_info` WHERE `_id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, C6913aYO c6913aYO) {
            sQLiteStatement.mo5793bindLong(1, c6913aYO.AEQbTJ);
        }
    };

    public C6942aYr(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.AEQbTJ = roomDatabase;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt([Ljava/lang/Object;)[J */
    @Override // o.InterfaceC6905aYG
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public long[] OLrzqt(final C6913aYO... c6913aYOArr) {
        c6913aYOArr.getClass();
        return (long[]) DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.aYz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.EZpvd(c6913aYOArr, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ long[] EZpvd(C6913aYO[] c6913aYOArr, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.copydefault.insertAndReturnIdsArray(sQLiteConnection, c6913aYOArr);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault([Ljava/lang/Object;)V */
    @Override // o.InterfaceC6905aYG
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(final C6913aYO... c6913aYOArr) {
        c6913aYOArr.getClass();
        DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.aYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(c6913aYOArr, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object OLrzqt(C6913aYO[] c6913aYOArr, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.OLrzqt.handleMultiple(sQLiteConnection, c6913aYOArr);
        return null;
    }

    @Override // o.InterfaceC6905aYG
    public java.util.List<C6913aYO> OLrzqt(final long j, final long j2) {
        return (java.util.List) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.aYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6942aYr.AEQbTJ(j, j2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(long j, long j2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM event_info ORDER BY _id  LIMIT ?,? ");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, j);
            sQLiteStatementPrepare.mo5793bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MTAnalysisConstants.EVENT_NAME);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event_params");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                C6913aYO c6913aYO = new C6913aYO();
                c6913aYO.AEQbTJ = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                java.lang.String text = null;
                c6913aYO.AEQbTJ(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                c6913aYO.copydefault(C6908aYJ.AEQbTJ(text));
                arrayList.add(c6913aYO);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC6905aYG
    public java.util.List<C6913aYO> KWHzl(final long j, final long j2, final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.aYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6942aYr.EZpvd(str, j, j2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List EZpvd(java.lang.String str, long j, long j2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n    SELECT * FROM event_info\n    WHERE \n        (\n            ? <> '' \n            AND event_params LIKE '%\"_user_id\":\"' || ? || '\"%'\n        )\n        OR\n        (\n            ? = '' \n            AND event_params LIKE '%\"_user_id\":\"\"%'\n        )\n    ORDER BY _id\n    LIMIT ?,?\n");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(3);
            } else {
                sQLiteStatementPrepare.mo5795bindText(3, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(4, j);
            sQLiteStatementPrepare.mo5793bindLong(5, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MTAnalysisConstants.EVENT_NAME);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event_params");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                C6913aYO c6913aYO = new C6913aYO();
                c6913aYO.AEQbTJ = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                java.lang.String text = null;
                c6913aYO.AEQbTJ(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                c6913aYO.copydefault(C6908aYJ.AEQbTJ(text));
                arrayList.add(c6913aYO);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC6905aYG
    public long EZpvd() {
        return ((java.lang.Long) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.aYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6942aYr.OLrzqt((androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public static /* synthetic */ java.lang.Long OLrzqt(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT count(*) FROM event_info");
        try {
            long j = sQLiteStatementPrepare.step() ? sQLiteStatementPrepare.getLong(0) : 0L;
            sQLiteStatementPrepare.close();
            return java.lang.Long.valueOf(j);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC6905aYG
    public long copydefault(final java.lang.String str) {
        return ((java.lang.Long) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.aYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6942aYr.OLrzqt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public static /* synthetic */ java.lang.Long OLrzqt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n    SELECT COUNT(*)\n    FROM event_info\n    WHERE \n        (? <> '' AND event_params LIKE '%\"_user_id\":\"' || ? || '\"%')\n        OR\n        (? = ''  AND event_params LIKE '%\"_user_id\":\"\"%')\n");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(3);
            } else {
                sQLiteStatementPrepare.mo5795bindText(3, str);
            }
            long j = sQLiteStatementPrepare.step() ? sQLiteStatementPrepare.getLong(0) : 0L;
            sQLiteStatementPrepare.close();
            return java.lang.Long.valueOf(j);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
