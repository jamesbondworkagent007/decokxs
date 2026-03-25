package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.AffiliateMemberFilter;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.GroupAddOrRemoveMemberRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44263sJi {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation);

    Flow<java.util.List<GroupMemberInfo>> AEQbTJ(@NotNull java.lang.String str);

    java.lang.Object AhwBna(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<GroupMemberInfo>> continuation);

    java.lang.Object EZpvd(long j, @NotNull java.util.List<AffiliateMemberFilter> list, @NotNull Continuation<? super GroupAddMembersResult> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, C44461sQr c44461sQr, @NotNull OKMessage oKMessage, @NotNull Continuation<? super C44461sQr> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation);

    GroupMemberInfo OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super GroupMemberInfo> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<GroupMemberInfo>> continuation);

    java.lang.Object copydefault(@NotNull GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest, @NotNull Continuation<? super GroupAddMembersResult> continuation);
}
