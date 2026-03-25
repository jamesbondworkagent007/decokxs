package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.okinc.okimcore.stickers.local.StickerEntity;
import com.okinc.okimcore.stickers.local.StickersDao;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public final class sRB implements StickersDao {
    public final EntityInsertAdapter<StickerEntity> EZpvd = new EntityInsertAdapter<StickerEntity>() { // from class: o.sRB.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `im_sticker` (`stickerId`,`packId`,`position`,`path`) VALUES (?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull StickerEntity stickerEntity) {
            if (stickerEntity.getStickerId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, stickerEntity.getStickerId());
            }
            if (stickerEntity.getPackId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, stickerEntity.getPackId());
            }
            sQLiteStatement.mo5793bindLong(3, stickerEntity.getPosition());
            if (stickerEntity.getPath() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, stickerEntity.getPath());
            }
        }
    };
    public final RoomDatabase KWHzl;

    public sRB(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.KWHzl = roomDatabase;
    }

    @Override // com.okinc.okimcore.stickers.local.StickersDao
    public java.lang.Object insert(final java.util.List<StickerEntity> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.sRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.EZpvd.insert(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.stickers.local.StickersDao
    public java.lang.Object getStickers(final java.lang.String str, final int i, final int i2, Continuation<? super java.util.List<StickerEntity>> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sRB.copydefault(str, i2, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, int i, int i2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        SELECT * FROM im_sticker\n        WHERE packId = ?\n        ORDER BY position DESC\n        LIMIT ? OFFSET (? * ?)\n    ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            long j = i;
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.mo5793bindLong(3, i2);
            sQLiteStatementPrepare.mo5793bindLong(4, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stickerId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "packId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "position");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "path");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new StickerEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.stickers.local.StickersDao
    public java.lang.Object doesStickerExist(final java.lang.String str, final java.lang.String str2, Continuation<? super java.lang.Boolean> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sRG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sRB.OLrzqt(str2, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Boolean OLrzqt(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        SELECT EXISTS (\n            SELECT 1 FROM im_sticker\n            WHERE stickerId = ? AND packId = ?\n        )\n    ");
        boolean z = true;
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
            java.lang.Boolean boolValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z = false;
                    }
                    boolValueOf = java.lang.Boolean.valueOf(z);
                }
            }
            return boolValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.stickers.local.StickersDao
    public java.lang.Object countStickersByPackId(final java.lang.String str, Continuation<? super java.lang.Long> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sRB.OLrzqt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Long OLrzqt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        SELECT COUNT(*) FROM im_sticker\n        WHERE packId = ?\n    ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            return (!sQLiteStatementPrepare.step() || sQLiteStatementPrepare.isNull(0)) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(0));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.stickers.local.StickersDao
    public java.lang.Object getAllIds(Continuation<? super java.util.List<C44491sRu>> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sRF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sRB.AEQbTJ((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List AEQbTJ(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT stickerId,packId FROM im_sticker");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = null;
                java.lang.String text2 = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0);
                if (!sQLiteStatementPrepare.isNull(1)) {
                    text = sQLiteStatementPrepare.getText(1);
                }
                arrayList.add(new C44491sRu(text, text2));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.stickers.local.StickersDao
    public java.lang.Object getLastNullablePosition(final java.lang.String str, Continuation<? super java.lang.Long> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sRE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sRB.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Long copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        SELECT MAX(position) FROM im_sticker\n        WHERE packId = ?\n    ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            return (!sQLiteStatementPrepare.step() || sQLiteStatementPrepare.isNull(0)) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(0));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.stickers.local.StickersDao
    public java.lang.Object deleteStickersByIds(final java.lang.String str, final java.util.Set<java.lang.String> set, Continuation<? super java.lang.Integer> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n");
        sb.append("        DELETE FROM im_sticker");
        sb.append("\n");
        sb.append("        WHERE stickerId IN (");
        final int size = set.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(") AND packId = ");
        sb.append("?");
        sb.append("\n");
        sb.append("    ");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.sRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sRB.OLrzqt(string, set, size, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer OLrzqt(java.lang.String str, java.util.Set set, int i, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = set.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (str3 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i2);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i2, str3);
                }
                i2++;
            }
            int i3 = i + 1;
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(i3);
            } else {
                sQLiteStatementPrepare.mo5795bindText(i3, str2);
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

    @Override // com.okinc.okimcore.stickers.local.StickersDao
    public java.lang.Object delete(final java.lang.String str, final java.util.Set<java.lang.String> set, Continuation<? super Unit> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM im_sticker WHERE packId = ");
        sb.append("?");
        sb.append(" AND stickerId IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append(") ");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.sRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sRB.KWHzl(string, str, set, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit KWHzl(java.lang.String str, java.lang.String str2, java.util.Set set, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str2);
            }
            java.util.Iterator it = set.iterator();
            int i = 2;
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (str3 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i, str3);
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.stickers.local.StickersDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return StickersDao.StateListAnimator.KWHzl(this);
    }

    @Override // com.okinc.okimcore.stickers.local.StickersDao
    public java.lang.Object getLastPosition(java.lang.String str, Continuation<? super java.lang.Long> continuation) {
        return StickersDao.StateListAnimator.copydefault(this, str, continuation);
    }

    public static java.util.List<java.lang.Class<?>> EZpvd() {
        return Collections.emptyList();
    }
}
