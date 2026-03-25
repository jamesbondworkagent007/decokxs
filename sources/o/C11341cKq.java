package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.okinc.business.defi.biz.database.wallet.entity.KVEntity;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.cKq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11341cKq implements InterfaceC11342cKr {
    public final RoomDatabase EZpvd;
    public final EntityInsertAdapter<KVEntity> KWHzl = new EntityInsertAdapter<KVEntity>() { // from class: o.cKq.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `keyValues` (`_key`,`_value`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull KVEntity kVEntity) {
            if (kVEntity.get_key() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, kVEntity.get_key());
            }
            if (kVEntity.get_value() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, kVEntity.get_value());
            }
        }
    };
    public final EntityInsertAdapter<KVEntity> copydefault = new EntityInsertAdapter<KVEntity>() { // from class: o.cKq.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `keyValues` (`_key`,`_value`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull KVEntity kVEntity) {
            if (kVEntity.get_key() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, kVEntity.get_key());
            }
            if (kVEntity.get_value() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, kVEntity.get_value());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<KVEntity> OLrzqt = new EntityDeleteOrUpdateAdapter<KVEntity>() { // from class: o.cKq.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `keyValues` WHERE `_key` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull KVEntity kVEntity) {
            if (kVEntity.get_key() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, kVEntity.get_key());
            }
        }
    };

    public C11341cKq(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // o.InterfaceC11342cKr
    public long OLrzqt(final KVEntity kVEntity) {
        kVEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cKp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.OLrzqt(kVEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long OLrzqt(KVEntity kVEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.KWHzl.insertAndReturnId(sQLiteConnection, kVEntity));
    }

    @Override // o.InterfaceC11342cKr
    public java.util.List<java.lang.String> AEQbTJ(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11341cKq.EZpvd(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List EZpvd(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT _value FROM keyValues WHERE _key = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
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

    public static java.util.List<java.lang.Class<?>> OLrzqt() {
        return Collections.emptyList();
    }
}
