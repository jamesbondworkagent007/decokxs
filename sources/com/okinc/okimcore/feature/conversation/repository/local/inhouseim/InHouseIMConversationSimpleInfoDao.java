package com.okinc.okimcore.feature.conversation.repository.local.inhouseim;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMConversationSimpleInfoDao extends BaseDao {

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String OLrzqt(@NotNull InHouseIMConversationSimpleInfoDao inHouseIMConversationSimpleInfoDao) {
            return "InHouseIMConversationSimpleInfoDao";
        }
    }

    Object delete(@NotNull Set<String> set, @NotNull Continuation<? super Unit> continuation);

    Object getAllSimpleConversationInfo(@NotNull Continuation<? super List<InHouseIMConversationSimpleInfoEntity>> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object insertAll(@NotNull List<InHouseIMConversationSimpleInfoEntity> list, @NotNull Continuation<? super Unit> continuation);
}
