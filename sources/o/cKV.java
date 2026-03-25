package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.okinc.business.defi.biz.database.wallet.entity.PartTeeStatusInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.TeeStatusInfoEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o.cKU;

/* JADX INFO: loaded from: classes23.dex */
public final class cKV implements cKU {
    public final RoomDatabase copydefault;
    public final EntityInsertAdapter<TeeStatusInfoEntity> OLrzqt = new EntityInsertAdapter<TeeStatusInfoEntity>() { // from class: o.cKV.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `wallet_tee` (`account_id`,`tee_id`,`is_created`,`is_active`,`expired_timestamp`,`is_verify`,`has_show_expired_alert`,`is_disabled_by_user`,`create_at`,`update_at`,`model`,`canUseSa2`,`auto_renew`,`upgrade_status`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull TeeStatusInfoEntity teeStatusInfoEntity) {
            if (teeStatusInfoEntity.getAccountId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, teeStatusInfoEntity.getAccountId());
            }
            if (teeStatusInfoEntity.getTeeId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, teeStatusInfoEntity.getTeeId());
            }
            sQLiteStatement.mo5793bindLong(3, teeStatusInfoEntity.isCreated() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(4, teeStatusInfoEntity.isActive() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(5, teeStatusInfoEntity.getExpiredTimestamp());
            sQLiteStatement.mo5793bindLong(6, teeStatusInfoEntity.isVerify() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(7, teeStatusInfoEntity.getHasShowExpiredAlert() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(8, teeStatusInfoEntity.isDisabledByUser() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(9, teeStatusInfoEntity.getCreateAt());
            sQLiteStatement.mo5793bindLong(10, teeStatusInfoEntity.getUpdateAt());
            sQLiteStatement.mo5793bindLong(11, teeStatusInfoEntity.getModel());
            sQLiteStatement.mo5793bindLong(12, teeStatusInfoEntity.getCanUseSa2());
            sQLiteStatement.mo5793bindLong(13, teeStatusInfoEntity.getAutoRenew());
            sQLiteStatement.mo5793bindLong(14, teeStatusInfoEntity.getUpgradeStatus());
        }
    };
    public final EntityDeleteOrUpdateAdapter<PartTeeStatusInfoEntity> EZpvd = new EntityDeleteOrUpdateAdapter<PartTeeStatusInfoEntity>() { // from class: o.cKV.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `wallet_tee` SET `account_id` = ?,`is_created` = ?,`is_active` = ?,`expired_timestamp` = ?,`is_verify` = ?,`has_show_expired_alert` = ?,`is_disabled_by_user` = ?,`update_at` = ?,`canUseSa2` = ?,`auto_renew` = ?,`upgrade_status` = ? WHERE `account_id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull PartTeeStatusInfoEntity partTeeStatusInfoEntity) {
            if (partTeeStatusInfoEntity.getAccountId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, partTeeStatusInfoEntity.getAccountId());
            }
            sQLiteStatement.mo5793bindLong(2, partTeeStatusInfoEntity.isCreated() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(3, partTeeStatusInfoEntity.isActive() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(4, partTeeStatusInfoEntity.getExpiredTimestamp());
            sQLiteStatement.mo5793bindLong(5, partTeeStatusInfoEntity.isVerify() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(6, partTeeStatusInfoEntity.getHasShowExpiredAlert() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(7, partTeeStatusInfoEntity.isDisabledByUser() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(8, partTeeStatusInfoEntity.getUpdateAt());
            sQLiteStatement.mo5793bindLong(9, partTeeStatusInfoEntity.getCanUseSa2());
            sQLiteStatement.mo5793bindLong(10, partTeeStatusInfoEntity.getAutoRenew());
            sQLiteStatement.mo5793bindLong(11, partTeeStatusInfoEntity.getUpgradeStatus());
            if (partTeeStatusInfoEntity.getAccountId() == null) {
                sQLiteStatement.mo5794bindNull(12);
            } else {
                sQLiteStatement.mo5795bindText(12, partTeeStatusInfoEntity.getAccountId());
            }
        }
    };

    public cKV(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.copydefault = roomDatabase;
    }

    @Override // o.cKU
    public java.lang.Object EZpvd(final TeeStatusInfoEntity teeStatusInfoEntity, Continuation<? super java.lang.Long> continuation) {
        teeStatusInfoEntity.getClass();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.cKX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.KWHzl(teeStatusInfoEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Long KWHzl(TeeStatusInfoEntity teeStatusInfoEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.OLrzqt.insertAndReturnId(sQLiteConnection, teeStatusInfoEntity));
    }

    @Override // o.cKU
    public java.lang.Object copydefault(final java.util.List<TeeStatusInfoEntity> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.cKY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.OLrzqt.insert(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    @Override // o.cKU
    public java.lang.Object EZpvd(final PartTeeStatusInfoEntity partTeeStatusInfoEntity, Continuation<? super java.lang.Integer> continuation) {
        partTeeStatusInfoEntity.getClass();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.cKW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.OLrzqt(partTeeStatusInfoEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Integer OLrzqt(PartTeeStatusInfoEntity partTeeStatusInfoEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.EZpvd.handle(sQLiteConnection, partTeeStatusInfoEntity));
    }

    @Override // o.cKU
    public java.lang.Object EZpvd(final java.lang.String str, Continuation<? super TeeStatusInfoEntity> continuation) {
        return DBUtil.performSuspending(this.copydefault, true, false, new Function1() { // from class: o.cKR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKV.AEQbTJ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ TeeStatusInfoEntity AEQbTJ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet_tee WHERE account_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tee_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_created");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_active");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expired_timestamp");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_verify");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "has_show_expired_alert");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_disabled_by_user");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_at");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "auto_renew");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgrade_status");
            TeeStatusInfoEntity teeStatusInfoEntity = null;
            if (sQLiteStatementPrepare.step()) {
                teeStatusInfoEntity = new TeeStatusInfoEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow5), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
            }
            return teeStatusInfoEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cKU
    public java.lang.Object KWHzl(final java.util.List<java.lang.String> list, Continuation<? super java.util.List<TeeStatusInfoEntity>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM wallet_tee WHERE account_id in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.copydefault, true, false, new Function1() { // from class: o.cKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKV.AEQbTJ(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List AEQbTJ(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i2);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i2, str2);
                }
                i2++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tee_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_created");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_active");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expired_timestamp");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_verify");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "has_show_expired_alert");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_disabled_by_user");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_at");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "auto_renew");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgrade_status");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.util.ArrayList arrayList2 = arrayList;
                int i3 = columnIndexOrThrow2;
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0) {
                    i = columnIndexOrThrow3;
                    z = true;
                } else {
                    i = columnIndexOrThrow3;
                    z = false;
                }
                int i4 = columnIndexOrThrow4;
                int i5 = columnIndexOrThrow5;
                int i6 = columnIndexOrThrow6;
                arrayList2.add(new TeeStatusInfoEntity(text, text2, z, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow5), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14)));
                columnIndexOrThrow3 = i;
                arrayList = arrayList2;
                columnIndexOrThrow4 = i4;
                columnIndexOrThrow5 = i5;
                columnIndexOrThrow6 = i6;
                columnIndexOrThrow2 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cKU
    public java.lang.Object copydefault(final java.lang.String str, Continuation<? super TeeStatusInfoEntity> continuation) {
        return DBUtil.performSuspending(this.copydefault, true, false, new Function1() { // from class: o.cKT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKV.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ TeeStatusInfoEntity copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet_tee WHERE tee_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tee_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_created");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_active");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expired_timestamp");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_verify");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "has_show_expired_alert");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_disabled_by_user");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_at");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "auto_renew");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgrade_status");
            TeeStatusInfoEntity teeStatusInfoEntity = null;
            if (sQLiteStatementPrepare.step()) {
                teeStatusInfoEntity = new TeeStatusInfoEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow5), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
            }
            return teeStatusInfoEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cKU
    public java.lang.Object OLrzqt(final java.util.List<java.lang.String> list, Continuation<? super java.util.List<TeeStatusInfoEntity>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM wallet_tee WHERE tee_id in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.copydefault, true, false, new Function1() { // from class: o.cLc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKV.KWHzl(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List KWHzl(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i2);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i2, str2);
                }
                i2++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tee_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_created");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_active");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expired_timestamp");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_verify");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "has_show_expired_alert");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_disabled_by_user");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_at");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "auto_renew");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgrade_status");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.util.ArrayList arrayList2 = arrayList;
                int i3 = columnIndexOrThrow2;
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0) {
                    i = columnIndexOrThrow3;
                    z = true;
                } else {
                    i = columnIndexOrThrow3;
                    z = false;
                }
                int i4 = columnIndexOrThrow4;
                int i5 = columnIndexOrThrow5;
                int i6 = columnIndexOrThrow6;
                arrayList2.add(new TeeStatusInfoEntity(text, text2, z, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow5), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14)));
                columnIndexOrThrow3 = i;
                arrayList = arrayList2;
                columnIndexOrThrow4 = i4;
                columnIndexOrThrow5 = i5;
                columnIndexOrThrow6 = i6;
                columnIndexOrThrow2 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cKU
    public java.lang.Object KWHzl(Continuation<? super java.lang.Boolean> continuation) {
        return DBUtil.performSuspending(this.copydefault, true, false, new Function1() { // from class: o.cKZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKV.OLrzqt((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Boolean OLrzqt(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM wallet_tee WHERE is_created = 1 LIMIT 1)");
        try {
            java.lang.Boolean boolValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                if (numValueOf != null) {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                }
            }
            return boolValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cKU
    public java.lang.Object EZpvd(Continuation<? super TeeStatusInfoEntity> continuation) {
        return DBUtil.performSuspending(this.copydefault, true, false, new Function1() { // from class: o.cLd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKV.copydefault((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ TeeStatusInfoEntity copydefault(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet_tee WHERE is_created = 1 ORDER BY expired_timestamp DESC LIMIT 1");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tee_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_created");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_active");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expired_timestamp");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_verify");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "has_show_expired_alert");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_disabled_by_user");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_at");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "auto_renew");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgrade_status");
            TeeStatusInfoEntity teeStatusInfoEntity = null;
            if (sQLiteStatementPrepare.step()) {
                teeStatusInfoEntity = new TeeStatusInfoEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow5), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
            }
            return teeStatusInfoEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cKU
    public java.lang.Object KWHzl(final java.lang.String str, final boolean z, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.cLa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKV.copydefault(z, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer copydefault(boolean z, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE wallet_tee SET has_show_expired_alert = ? WHERE account_id = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, z ? 1L : 0L);
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
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

    @Override // o.cKU
    public java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, Continuation<? super TeeStatusInfoEntity> continuation) {
        return cKU.Application.copydefault(this, str, str2, continuation);
    }

    public static java.util.List<java.lang.Class<?>> EZpvd() {
        return Collections.emptyList();
    }
}
