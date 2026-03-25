package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.okinc.business.defi.biz.database.extra.entity.DeletedWalletEntity;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final class cHH implements InterfaceC11269cHz {
    public final EntityInsertAdapter<DeletedWalletEntity> AEQbTJ = new EntityInsertAdapter<DeletedWalletEntity>() { // from class: o.cHH.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `deleted_wallet` (`id`,`xpriv`,`xpub`,`status`) VALUES (?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull DeletedWalletEntity deletedWalletEntity) {
            if (deletedWalletEntity.getId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, deletedWalletEntity.getId());
            }
            if (deletedWalletEntity.getXpriv() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, deletedWalletEntity.getXpriv());
            }
            if (deletedWalletEntity.getXpub() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, deletedWalletEntity.getXpub());
            }
            sQLiteStatement.mo5793bindLong(4, deletedWalletEntity.getStatus());
        }
    };
    public final EntityDeleteOrUpdateAdapter<DeletedWalletEntity> KWHzl = new EntityDeleteOrUpdateAdapter<DeletedWalletEntity>() { // from class: o.cHH.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `deleted_wallet` SET `id` = ?,`xpriv` = ?,`xpub` = ?,`status` = ? WHERE `id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull DeletedWalletEntity deletedWalletEntity) {
            if (deletedWalletEntity.getId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, deletedWalletEntity.getId());
            }
            if (deletedWalletEntity.getXpriv() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, deletedWalletEntity.getXpriv());
            }
            if (deletedWalletEntity.getXpub() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, deletedWalletEntity.getXpub());
            }
            sQLiteStatement.mo5793bindLong(4, deletedWalletEntity.getStatus());
            if (deletedWalletEntity.getId() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, deletedWalletEntity.getId());
            }
        }
    };
    public final RoomDatabase copydefault;

    public cHH(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.copydefault = roomDatabase;
    }

    @Override // o.InterfaceC11269cHz
    public java.util.List<java.lang.Long> EZpvd(final java.util.List<DeletedWalletEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AEQbTJ.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11269cHz
    public int OLrzqt(final java.util.List<DeletedWalletEntity> list) {
        list.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.KWHzl.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.InterfaceC11269cHz
    public java.util.List<DeletedWalletEntity> EZpvd(final int i) {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.cHD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cHH.KWHzl(i, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List KWHzl(int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM deleted_wallet WHERE status = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpub");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = null;
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                arrayList.add(new DeletedWalletEntity(text2, text3, text, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11269cHz
    public int AEQbTJ(final java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM deleted_wallet WHERE id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cHH.KWHzl(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer KWHzl(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
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
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11269cHz
    public int copydefault() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cHM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cHH.KWHzl((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer KWHzl(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM deleted_wallet WHERE status = 0");
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

    public static java.util.List<java.lang.Class<?>> EZpvd() {
        return Collections.emptyList();
    }
}
