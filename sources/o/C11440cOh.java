package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.okinc.business.defi.biz.database.wallet.entity.WalletSignDataEntity;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.cOh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11440cOh implements InterfaceC11433cOa {
    public final EntityInsertAdapter<WalletSignDataEntity> AEQbTJ = new EntityInsertAdapter<WalletSignDataEntity>() { // from class: o.cOh.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `wallet_sign_data` (`wallet_id`,`op_type`,`sync_type`,`address_type`,`chain_index`,`chain_sign`,`base_chain_index`,`base_chain_sign`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletSignDataEntity walletSignDataEntity) {
            if (walletSignDataEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletSignDataEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletSignDataEntity.getOperationType());
            sQLiteStatement.mo5793bindLong(3, walletSignDataEntity.getSyncType());
            sQLiteStatement.mo5793bindLong(4, walletSignDataEntity.getAddressType());
            sQLiteStatement.mo5793bindLong(5, walletSignDataEntity.getChainIndex());
            if (walletSignDataEntity.getChainSign() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, walletSignDataEntity.getChainSign());
            }
            if (walletSignDataEntity.getBaseChainIndex() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5793bindLong(7, walletSignDataEntity.getBaseChainIndex().longValue());
            }
            if (walletSignDataEntity.getBaseChainSign() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, walletSignDataEntity.getBaseChainSign());
            }
        }
    };
    public final RoomDatabase copydefault;

    public C11440cOh(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.copydefault = roomDatabase;
    }

    @Override // o.InterfaceC11433cOa
    public java.lang.Object copydefault(final java.util.List<WalletSignDataEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.cOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AEQbTJ.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11433cOa
    public java.lang.Object copydefault(final java.util.List<java.lang.String> list, final int i, Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<WalletSignDataEntity>>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM wallet_sign_data WHERE wallet_id IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(") AND op_type = ");
        sb.append("?");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.copydefault, true, false, new Function1() { // from class: o.cOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11440cOh.AEQbTJ(string, list, size, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.Map AEQbTJ(java.lang.String str, java.util.List list, int i, int i2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.List list2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i3 = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i3);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i3, str2);
                }
                i3++;
            }
            sQLiteStatementPrepare.mo5793bindLong(i + 1, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "op_type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sync_type");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address_type");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_index");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_sign");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "base_chain_index");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "base_chain_sign");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (linkedHashMap.containsKey(text)) {
                    list2 = (java.util.List) linkedHashMap.get(text);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    linkedHashMap.put(text, arrayList);
                    list2 = arrayList;
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow3) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow4) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow5) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow6) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow7) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow8) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    list2.add(new WalletSignDataEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                }
            }
            return linkedHashMap;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11433cOa
    public java.lang.Object AEQbTJ(final java.util.List<java.lang.String> list, final int i, Continuation<? super java.lang.Integer> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM wallet_sign_data WHERE wallet_id IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(") AND op_type = ");
        sb.append("?");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.cOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11440cOh.KWHzl(string, list, size, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer KWHzl(java.lang.String str, java.util.List list, int i, int i2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i3 = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i3);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i3, str2);
                }
                i3++;
            }
            sQLiteStatementPrepare.mo5793bindLong(i + 1, i2);
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11433cOa
    public java.lang.Object KWHzl(final int i, final java.lang.String str, final java.util.List<java.lang.Long> list, final int i2, Continuation<? super java.lang.Integer> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM wallet_sign_data WHERE op_type = ");
        sb.append("?");
        sb.append(" AND wallet_id = ");
        sb.append("?");
        sb.append(" AND chain_index IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(") AND sync_type = ");
        sb.append("?");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.cOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11440cOh.OLrzqt(string, i, str, list, size, i2, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer OLrzqt(java.lang.String str, int i, java.lang.String str2, java.util.List list, int i2, int i3, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str2);
            }
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
            sQLiteStatementPrepare.mo5793bindLong(i2 + 3, i3);
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11433cOa
    public int EZpvd(final java.lang.String str, final long j) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11440cOh.KWHzl(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer KWHzl(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM wallet_sign_data WHERE wallet_id = ? AND chain_index = ?");
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

    public static java.util.List<java.lang.Class<?>> copydefault() {
        return Collections.emptyList();
    }
}
