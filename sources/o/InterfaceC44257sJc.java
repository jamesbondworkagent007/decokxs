package o;

import com.okinc.okimcore.model.other.AffiliateMemberFilter;
import com.okinc.okimcore.model.remote.CreateGroupInviteRequest;
import com.okinc.okimcore.model.remote.GroupJoinApplicationIdsRequest;
import com.okinc.okimcore.model.remote.GroupJoinApplicationRequest;
import com.okinc.okimcore.model.remote.ListGroupJoinApplicationsRequest;
import com.okinc.okimcore.model.utility.PrepareGroupCreation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44257sJc {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AYXKKw(@NotNull java.lang.String str, @NotNull Continuation<? super sOD> continuation);

    java.lang.Object EZpvd(@NotNull CreateGroupInviteRequest createGroupInviteRequest, @NotNull Continuation<? super AbstractC44393sOd> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.net.Uri uri, @NotNull java.util.List<AffiliateMemberFilter> list, @NotNull Continuation<? super AbstractC44396sOg> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC44395sOf> continuation);

    java.lang.Object KWHzl(long j, @NotNull Continuation<? super sOQ> continuation);

    java.lang.Object KWHzl(@NotNull GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, @NotNull Continuation<? super sOE> continuation);

    java.lang.Object KWHzl(@NotNull ListGroupJoinApplicationsRequest listGroupJoinApplicationsRequest, @NotNull Continuation<? super sOM> continuation);

    java.lang.Object OLrzqt(@NotNull GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, @NotNull Continuation<? super sOE> continuation);

    java.lang.Object copydefault(@NotNull GroupJoinApplicationRequest groupJoinApplicationRequest, @NotNull Continuation<? super sOA> continuation);

    java.lang.Object copydefault(@NotNull PrepareGroupCreation prepareGroupCreation, @NotNull Continuation<? super AbstractC44396sOg> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);
}
