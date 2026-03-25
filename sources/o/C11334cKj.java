package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.cKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11334cKj implements InterfaceC11330cKf {
    public final RoomDatabase AEQbTJ;
    public final EntityInsertAdapter<C11449cOr> OLrzqt = new EntityInsertAdapter<C11449cOr>() { // from class: o.cKj.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `eip_7702_info` (`wallet_id`,`chain_index`,`upgrade_status`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull C11449cOr c11449cOr) {
            if (c11449cOr.KWHzl() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, c11449cOr.KWHzl());
            }
            sQLiteStatement.mo5793bindLong(2, c11449cOr.EZpvd());
            sQLiteStatement.mo5793bindLong(3, c11449cOr.OLrzqt());
        }
    };

    public C11334cKj(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.AEQbTJ = roomDatabase;
    }

    @Override // o.InterfaceC11330cKf
    public java.lang.Object copydefault(final java.util.List<C11449cOr> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.AEQbTJ, false, true, new Function1() { // from class: o.cKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.OLrzqt.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11330cKf
    public java.lang.Object KWHzl(final java.util.List<java.lang.String> list, Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<C11449cOr>>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM eip_7702_info WHERE wallet_id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.AEQbTJ, true, false, new Function1() { // from class: o.cKi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11334cKj.copydefault(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.Map copydefault(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.List list2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i, str2);
                }
                i++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_index");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgrade_status");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = null;
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (linkedHashMap.containsKey(text2)) {
                    list2 = (java.util.List) linkedHashMap.get(text2);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    linkedHashMap.put(text2, arrayList);
                    list2 = arrayList;
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow3) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                        text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                    }
                    list2.add(new C11449cOr(text, sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)));
                }
            }
            return linkedHashMap;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11330cKf
    public java.lang.Object KWHzl(final java.lang.String str, final long j, Continuation<? super java.util.List<C11449cOr>> continuation) {
        return DBUtil.performSuspending(this.AEQbTJ, true, false, new Function1() { // from class: o.cKm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11334cKj.KWHzl(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List KWHzl(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM eip_7702_info WHERE wallet_id = ? AND chain_index = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_index");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgrade_status");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new C11449cOr(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11330cKf
    public java.lang.Object EZpvd(final java.util.List<java.lang.String> list, final int i, final int i2, final java.util.List<java.lang.Long> list2, Continuation<? super java.util.List<java.lang.String>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n");
        sb.append("            SELECT DISTINCT w.id");
        sb.append("\n");
        sb.append("            FROM wallet AS w");
        sb.append("\n");
        sb.append("            JOIN chain_address as ca ON w.id = ca.walletId");
        sb.append("\n");
        sb.append("            WHERE (w.type = ");
        sb.append("?");
        sb.append(" OR w.type = ");
        sb.append("?");
        sb.append(" AND ca.chainId IN (");
        final int size = list2.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append("))");
        sb.append("\n");
        sb.append("            AND w.id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        sb.append("\n");
        sb.append("        ");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.AEQbTJ, true, false, new Function1() { // from class: o.cKk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11334cKj.EZpvd(string, i, i2, list2, size, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List EZpvd(java.lang.String str, int i, int i2, java.util.List list, int i3, java.util.List list2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            sQLiteStatementPrepare.mo5793bindLong(2, i2);
            java.util.Iterator it = list.iterator();
            int i4 = 3;
            while (it.hasNext()) {
                java.lang.Long l = (java.lang.Long) it.next();
                if (l == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i4);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i4, l.longValue());
                }
                i4++;
            }
            int i5 = i3 + 3;
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                java.lang.String str2 = (java.lang.String) it2.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i5);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i5, str2);
                }
                i5++;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static java.util.List<java.lang.Class<?>> copydefault() {
        return Collections.emptyList();
    }
}
