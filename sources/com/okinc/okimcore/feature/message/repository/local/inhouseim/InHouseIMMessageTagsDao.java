package com.okinc.okimcore.feature.message.repository.local.inhouseim;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageTagsEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMMessageTagsDao extends BaseDao {

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String AEQbTJ(@NotNull InHouseIMMessageTagsDao inHouseIMMessageTagsDao) {
            return "InHouseIMMessageTagsDao";
        }
    }

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object insertOrReplace(@NotNull InHouseIMMessageTagsEntity[] inHouseIMMessageTagsEntityArr, @NotNull Continuation<? super Unit> continuation);
}
