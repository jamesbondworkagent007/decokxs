package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.pTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C38298pTp implements InterfaceC38295pTm {
    public final RoomDatabase EZpvd;
    public final EntityInsertAdapter<C38291pTi> OLrzqt = new EntityInsertAdapter<C38291pTi>() { // from class: o.pTp.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `used_source` (`type`,`value`,`is_upload`,`app_version`,`ph_key_content`,`key_language`,`is_startup_key`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull C38291pTi c38291pTi) {
            if (c38291pTi.OLrzqt() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, c38291pTi.OLrzqt());
            }
            if (c38291pTi.AhwBna() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, c38291pTi.AhwBna());
            }
            sQLiteStatement.mo5793bindLong(3, c38291pTi.AYXKKw() ? 1L : 0L);
            if (c38291pTi.AEQbTJ() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, c38291pTi.AEQbTJ());
            }
            if (c38291pTi.KWHzl() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, c38291pTi.KWHzl());
            }
            if (c38291pTi.copydefault() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, c38291pTi.copydefault());
            }
            sQLiteStatement.mo5793bindLong(7, c38291pTi.gEmmrt() ? 1L : 0L);
        }
    };
    public final EntityDeleteOrUpdateAdapter<C38291pTi> copydefault = new EntityDeleteOrUpdateAdapter<C38291pTi>() { // from class: o.pTp.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `used_source` WHERE `value` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull C38291pTi c38291pTi) {
            if (c38291pTi.AhwBna() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, c38291pTi.AhwBna());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<C38291pTi> AEQbTJ = new EntityDeleteOrUpdateAdapter<C38291pTi>() { // from class: o.pTp.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `used_source` SET `type` = ?,`value` = ?,`is_upload` = ?,`app_version` = ?,`ph_key_content` = ?,`key_language` = ?,`is_startup_key` = ? WHERE `value` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull C38291pTi c38291pTi) {
            if (c38291pTi.OLrzqt() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, c38291pTi.OLrzqt());
            }
            if (c38291pTi.AhwBna() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, c38291pTi.AhwBna());
            }
            sQLiteStatement.mo5793bindLong(3, c38291pTi.AYXKKw() ? 1L : 0L);
            if (c38291pTi.AEQbTJ() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, c38291pTi.AEQbTJ());
            }
            if (c38291pTi.KWHzl() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, c38291pTi.KWHzl());
            }
            if (c38291pTi.copydefault() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, c38291pTi.copydefault());
            }
            sQLiteStatement.mo5793bindLong(7, c38291pTi.gEmmrt() ? 1L : 0L);
            if (c38291pTi.AhwBna() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, c38291pTi.AhwBna());
            }
        }
    };

    public C38298pTp(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // o.InterfaceC38295pTm
    public void OLrzqt(final java.util.List<C38291pTi> list) {
        list.getClass();
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.pTo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.OLrzqt.insert(sQLiteConnection, list);
        return null;
    }

    @Override // o.InterfaceC38295pTm
    public void copydefault(final java.util.List<C38291pTi> list) {
        list.getClass();
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.pTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AEQbTJ.handleMultiple(sQLiteConnection, list);
        return null;
    }

    @Override // o.InterfaceC38295pTm
    public java.util.List<C38291pTi> EZpvd() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.pTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38298pTp.EZpvd((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List EZpvd(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM used_source");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_upload");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "app_version");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ph_key_content");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key_language");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_startup_key");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new C38291pTi(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC38295pTm
    public void AEQbTJ(final java.lang.String str) {
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.pTq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38298pTp.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM used_source WHERE value != ?");
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

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
