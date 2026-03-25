package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao;
import com.okinc.business.defi.biz.database.extra.entity.KeyValueEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final class cHI implements PasswordKeyDao {
    public final EntityInsertAdapter<KeyValueEntity> AEQbTJ = new EntityInsertAdapter<KeyValueEntity>() { // from class: o.cHI.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `key_value` (`k`,`v`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull KeyValueEntity keyValueEntity) {
            if (keyValueEntity.getKey() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, keyValueEntity.getKey());
            }
            if (keyValueEntity.getValue() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, keyValueEntity.getValue());
            }
        }
    };
    public final RoomDatabase EZpvd;

    public cHI(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao
    public long OLrzqt(final KeyValueEntity keyValueEntity) {
        keyValueEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cHO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.AEQbTJ(keyValueEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(KeyValueEntity keyValueEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.AEQbTJ.insertAndReturnId(sQLiteConnection, keyValueEntity));
    }

    @Override // com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao
    public void EZpvd(final PasswordKeyDao.PasswordKey passwordKey) {
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.EZpvd(passwordKey, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit EZpvd(PasswordKeyDao.PasswordKey passwordKey, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        PasswordKeyDao.ActionBar.copydefault(this, passwordKey);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao
    public void OLrzqt() {
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cHQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.KWHzl((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit KWHzl(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        PasswordKeyDao.ActionBar.copydefault(this);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao
    public java.util.List<KeyValueEntity> OLrzqt(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cHR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cHI.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM key_value WHERE k = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "k");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, com.ibm.icu.text.DateFormat.ABBR_GENERIC_TZ);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = null;
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                arrayList.add(new KeyValueEntity(text2, text));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao
    public int EZpvd(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cHN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cHI.KWHzl(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer KWHzl(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM key_value WHERE k = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
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

    @Override // com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao
    public PasswordKeyDao.PasswordKey KWHzl() {
        return PasswordKeyDao.ActionBar.OLrzqt(this);
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }
}
