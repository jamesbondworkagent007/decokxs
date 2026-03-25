package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageTagsDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageTagsEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.sMd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44339sMd implements InHouseIMMessageTagsDao {
    public final EntityInsertAdapter<InHouseIMMessageTagsEntity> EZpvd = new EntityInsertAdapter<InHouseIMMessageTagsEntity>() { // from class: o.sMd.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `message_tag` (`id`,`messageId`,`atUserId`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull InHouseIMMessageTagsEntity inHouseIMMessageTagsEntity) {
            sQLiteStatement.mo5793bindLong(1, inHouseIMMessageTagsEntity.getId());
            if (inHouseIMMessageTagsEntity.getMessageId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, inHouseIMMessageTagsEntity.getMessageId());
            }
            if (inHouseIMMessageTagsEntity.getAtUserId() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, inHouseIMMessageTagsEntity.getAtUserId());
            }
        }
    };
    public final RoomDatabase OLrzqt;

    public C44339sMd(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.OLrzqt = roomDatabase;
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageTagsDao
    public java.lang.Object insertOrReplace(final InHouseIMMessageTagsEntity[] inHouseIMMessageTagsEntityArr, Continuation<? super Unit> continuation) {
        inHouseIMMessageTagsEntityArr.getClass();
        return DBUtil.performSuspending(this.OLrzqt, false, true, new Function1() { // from class: o.sMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.KWHzl(inHouseIMMessageTagsEntityArr, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit KWHzl(InHouseIMMessageTagsEntity[] inHouseIMMessageTagsEntityArr, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.EZpvd.insert(sQLiteConnection, inHouseIMMessageTagsEntityArr);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageTagsDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return InHouseIMMessageTagsDao.Activity.AEQbTJ(this);
    }

    public static java.util.List<java.lang.Class<?>> OLrzqt() {
        return Collections.emptyList();
    }
}
