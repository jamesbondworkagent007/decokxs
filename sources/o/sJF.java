package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes24.dex */
public final class sJF implements InHouseIMGroupSettingDao {
    public final RoomDatabase AEQbTJ;
    public final EntityInsertAdapter<InHouseIMGroupSettingEntity> copydefault = new EntityInsertAdapter<InHouseIMGroupSettingEntity>() { // from class: o.sJF.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `group_setting` (`group_id`,`group_nick_name`,`user_nick_name`,`role`,`is_no_disturb`,`is_top`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity) {
            if (inHouseIMGroupSettingEntity.getGroupId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, inHouseIMGroupSettingEntity.getGroupId());
            }
            if (inHouseIMGroupSettingEntity.getGroupNickName() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, inHouseIMGroupSettingEntity.getGroupNickName());
            }
            if (inHouseIMGroupSettingEntity.getUserNickName() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, inHouseIMGroupSettingEntity.getUserNickName());
            }
            sQLiteStatement.mo5793bindLong(4, inHouseIMGroupSettingEntity.getRole());
            sQLiteStatement.mo5793bindLong(5, inHouseIMGroupSettingEntity.getNoDisturbStatus());
            sQLiteStatement.mo5793bindLong(6, inHouseIMGroupSettingEntity.getTopStatus());
        }
    };

    public sJF(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.AEQbTJ = roomDatabase;
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao
    public java.lang.Object insert(final InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity, Continuation<? super Unit> continuation) {
        inHouseIMGroupSettingEntity.getClass();
        return DBUtil.performSuspending(this.AEQbTJ, false, true, new Function1() { // from class: o.sJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(inHouseIMGroupSettingEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit AEQbTJ(InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.copydefault.insert(sQLiteConnection, inHouseIMGroupSettingEntity);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao
    public java.lang.Object getSettingInfoById(final java.lang.String str, Continuation<? super InHouseIMGroupSettingEntity> continuation) {
        return DBUtil.performSuspending(this.AEQbTJ, true, false, new Function1() { // from class: o.sJO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sJF.OLrzqt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ InHouseIMGroupSettingEntity OLrzqt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM group_setting WHERE group_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_nick_name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user_nick_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "role");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_no_disturb");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_top");
            InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity = null;
            java.lang.String text = null;
            if (sQLiteStatementPrepare.step()) {
                InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity2 = new InHouseIMGroupSettingEntity();
                inHouseIMGroupSettingEntity2.setGroupId(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                inHouseIMGroupSettingEntity2.setGroupNickName(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                inHouseIMGroupSettingEntity2.setUserNickName(text);
                inHouseIMGroupSettingEntity2.setRole((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                inHouseIMGroupSettingEntity2.setNoDisturbStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                inHouseIMGroupSettingEntity2.setTopStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                inHouseIMGroupSettingEntity = inHouseIMGroupSettingEntity2;
            }
            return inHouseIMGroupSettingEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao
    public Flow<InHouseIMGroupSettingEntity> getSettingInfoByIdFlow(final java.lang.String str) {
        return FlowUtil.createFlow(this.AEQbTJ, false, new java.lang.String[]{"group_setting"}, new Function1() { // from class: o.sJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sJF.gEmmrt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ InHouseIMGroupSettingEntity gEmmrt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM group_setting WHERE group_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_nick_name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user_nick_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "role");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_no_disturb");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_top");
            InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity = null;
            java.lang.String text = null;
            if (sQLiteStatementPrepare.step()) {
                InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity2 = new InHouseIMGroupSettingEntity();
                inHouseIMGroupSettingEntity2.setGroupId(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                inHouseIMGroupSettingEntity2.setGroupNickName(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                inHouseIMGroupSettingEntity2.setUserNickName(text);
                inHouseIMGroupSettingEntity2.setRole((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                inHouseIMGroupSettingEntity2.setNoDisturbStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                inHouseIMGroupSettingEntity2.setTopStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                inHouseIMGroupSettingEntity = inHouseIMGroupSettingEntity2;
            }
            return inHouseIMGroupSettingEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao
    public void deleteSettingInfoById(final java.lang.String str) {
        DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.sJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sJF.KWHzl(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object KWHzl(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM group_setting WHERE group_id = ?");
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

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return InHouseIMGroupSettingDao.Activity.OLrzqt(this);
    }

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
