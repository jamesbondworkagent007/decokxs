package com.okinc.okimcore.feature.group.repository.local;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.room.inhouseim.GroupMemberWithDetails;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMGroupMemberDao extends BaseDao {

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String copydefault(@NotNull InHouseIMGroupMemberDao inHouseIMGroupMemberDao) {
            return "InHouseIMGroupMemberDao";
        }
    }

    void deleteGroupMemberList(@NotNull String str);

    Object deleteMemberById(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object getGroupMemberList(@NotNull String str, @NotNull Continuation<? super List<InHouseIMGroupMemberEntity>> continuation);

    Object getGroupMemberListByRole(@NotNull String str, int i, @NotNull Continuation<? super List<InHouseIMGroupMemberEntity>> continuation);

    Flow<List<GroupMemberWithDetails>> getGroupMemberListFlow(@NotNull String str);

    Object getGroupTopNMemberList(@NotNull String str, int i, @NotNull Continuation<? super List<InHouseIMGroupMemberEntity>> continuation);

    InHouseIMGroupMemberEntity getMemberInfoById(@NotNull String str, @NotNull String str2);

    Object insert(@NotNull InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, @NotNull Continuation<? super Unit> continuation);

    Object insert(@NotNull List<InHouseIMGroupMemberEntity> list, @NotNull Continuation<? super Unit> continuation);
}
