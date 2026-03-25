package com.okinc.okimcore.feature.group.repository.local;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMGroupInfoDao extends BaseDao {

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String OLrzqt(@NotNull InHouseIMGroupInfoDao inHouseIMGroupInfoDao) {
            return "InHouseIMGroupInfoDao";
        }
    }

    Object deleteGroupInfoById(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object getGroupInfoById(@NotNull String str, @NotNull Continuation<? super InHouseIMGroupEntity> continuation);

    Flow<InHouseIMGroupEntity> getGroupInfoByIdFlow(@NotNull String str);

    Object insert(@NotNull InHouseIMGroupEntity inHouseIMGroupEntity, @NotNull Continuation<? super Unit> continuation);

    void modifyNoticeShowStatus(@NotNull String str, @NotNull String str2);

    Object update(@NotNull InHouseIMGroupEntity inHouseIMGroupEntity, @NotNull Continuation<? super Unit> continuation);
}
