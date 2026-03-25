package com.okinc.okimcore.feature.group.repository.local;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMGroupSettingDao extends BaseDao {

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String OLrzqt(@NotNull InHouseIMGroupSettingDao inHouseIMGroupSettingDao) {
            return "InHouseIMGroupSettingDao";
        }
    }

    void deleteSettingInfoById(@NotNull String str);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object getSettingInfoById(@NotNull String str, @NotNull Continuation<? super InHouseIMGroupSettingEntity> continuation);

    Flow<InHouseIMGroupSettingEntity> getSettingInfoByIdFlow(@NotNull String str);

    Object insert(@NotNull InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity, @NotNull Continuation<? super Unit> continuation);
}
