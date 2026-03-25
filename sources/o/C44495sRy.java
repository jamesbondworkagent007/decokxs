package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.okinc.okimcore.stickers.local.StickerPackEntity;
import com.okinc.okimcore.stickers.local.StickerPacksDao;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: o.sRy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44495sRy implements StickerPacksDao {
    public final EntityInsertAdapter<StickerPackEntity> KWHzl = new EntityInsertAdapter<StickerPackEntity>() { // from class: o.sRy.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `im_sticker_packs` (`packId`,`title`,`pathDay`,`pathNight`,`position`) VALUES (?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull StickerPackEntity stickerPackEntity) {
            if (stickerPackEntity.getPackId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, stickerPackEntity.getPackId());
            }
            if (stickerPackEntity.getTitle() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, stickerPackEntity.getTitle());
            }
            if (stickerPackEntity.getPathDay() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, stickerPackEntity.getPathDay());
            }
            if (stickerPackEntity.getPathNight() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, stickerPackEntity.getPathNight());
            }
            sQLiteStatement.mo5793bindLong(5, stickerPackEntity.getPosition());
        }
    };
    public final RoomDatabase copydefault;

    public C44495sRy(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.copydefault = roomDatabase;
    }

    @Override // com.okinc.okimcore.stickers.local.StickerPacksDao
    public java.lang.Object insert(final java.util.List<StickerPackEntity> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.sRD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.KWHzl.insert(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.stickers.local.StickerPacksDao
    public Flow<java.util.List<StickerPackEntity>> getAll() {
        return FlowUtil.createFlow(this.copydefault, false, new java.lang.String[]{"im_sticker_packs"}, new Function1() { // from class: o.sRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44495sRy.EZpvd((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List EZpvd(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM im_sticker_packs ORDER BY position DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "packId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pathDay");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pathNight");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "position");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new StickerPackEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.stickers.local.StickerPacksDao
    public java.lang.Object getAllIds(Continuation<? super java.util.List<java.lang.String>> continuation) {
        return DBUtil.performSuspending(this.copydefault, true, false, new Function1() { // from class: o.sRz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44495sRy.AEQbTJ((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List AEQbTJ(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT packId FROM im_sticker_packs");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.stickers.local.StickerPacksDao
    public java.lang.Object delete(final java.util.Set<java.lang.String> set, Continuation<? super Unit> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM im_sticker_packs WHERE packId IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.copydefault, false, true, new Function1() { // from class: o.sRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44495sRy.copydefault(string, set, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit copydefault(java.lang.String str, java.util.Set set, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = set.iterator();
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
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.stickers.local.StickerPacksDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return StickerPacksDao.Activity.copydefault(this);
    }

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
