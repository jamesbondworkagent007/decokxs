package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.im.group.VipRmGroupStatus;
import com.okinc.okimcore.model.remote.AddMembersResponse;
import com.okinc.okimcore.model.remote.CreateGroupInviteRequest;
import com.okinc.okimcore.model.remote.CreateGroupInviteResponse;
import com.okinc.okimcore.model.remote.CreateGroupRequest;
import com.okinc.okimcore.model.remote.GetExistingInviteResponse;
import com.okinc.okimcore.model.remote.GetMaxMemberCountResponse;
import com.okinc.okimcore.model.remote.GroupAddOrRemoveMemberRequest;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import com.okinc.okimcore.model.remote.GroupInviteRequest;
import com.okinc.okimcore.model.remote.GroupJoinApplicationIdsRequest;
import com.okinc.okimcore.model.remote.GroupJoinApplicationRequest;
import com.okinc.okimcore.model.remote.GroupJoinApplicationResponse;
import com.okinc.okimcore.model.remote.GroupJoinApplicationResultResponse;
import com.okinc.okimcore.model.remote.GroupOwnerTransferRequest;
import com.okinc.okimcore.model.remote.GroupRecommendationResponse;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import com.okinc.okimcore.model.remote.InHouseIMAddGroupAnnouncementResponse;
import com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupMemberList;
import com.okinc.okimcore.model.remote.InHouseIMPaidGroupCategories;
import com.okinc.okimcore.model.remote.ListGroupJoinApplicationResponse;
import com.okinc.okimcore.model.remote.ListGroupJoinApplicationsRequest;
import com.okinc.okimcore.model.remote.ResultDataResponse;
import com.okinc.okimcore.model.remote.RevokePastInvitesRequest;
import com.okinc.okimcore.model.remote.SetGroupSettingsReq;
import com.okinc.okimcore.model.remote.groupvoicecall.JoinGroupVoiceCallResponse;
import com.okinc.okimcore.model.remote.groupvoicecall.StartGroupVoiceCallResponse;
import com.okinc.okimcore.model.room.inhouseim.GroupMemberWithDetails;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44256sJb {
    java.lang.Object AEQbTJ(long j, java.util.List<java.lang.Long> list, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super ResponseData<GetExistingInviteResponse>> continuation);

    java.lang.Object AEQbTJ(@NotNull CreateGroupRequest createGroupRequest, @NotNull Continuation<? super ResponseData<InHouseIMGroupEntity>> continuation);

    java.lang.Object AEQbTJ(@NotNull GroupInviteRequest groupInviteRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    java.lang.Object AEQbTJ(@NotNull ListGroupJoinApplicationsRequest listGroupJoinApplicationsRequest, @NotNull Continuation<? super ResponseData<ListGroupJoinApplicationResponse>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<JoinGroupVoiceCallResponse>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(long j, long j2, @NotNull Continuation<? super InHouseIMGroupMemberInfo> continuation);

    java.lang.Object EZpvd(long j, java.lang.Integer num, @NotNull Continuation<? super InHouseIMGroupInfo> continuation);

    java.lang.Object EZpvd(long j, @NotNull Continuation<? super InHouseIMGroupMemberList> continuation);

    java.lang.Object EZpvd(@NotNull GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, @NotNull Continuation<? super ResponseData<GroupJoinApplicationResultResponse>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<java.lang.Boolean>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    Flow<java.util.List<GroupMemberWithDetails>> EZpvd(@NotNull java.lang.String str);

    java.lang.Object KWHzl(long j, long j2, java.lang.String str, java.lang.Boolean bool, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(long j, @NotNull Continuation<? super ResponseData<InHouseIMPaidGroupCategories>> continuation);

    java.lang.Object KWHzl(@NotNull CreateGroupInviteRequest createGroupInviteRequest, @NotNull Continuation<? super ResponseData<CreateGroupInviteResponse>> continuation);

    java.lang.Object KWHzl(@NotNull GroupOwnerTransferRequest groupOwnerTransferRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<StartGroupVoiceCallResponse>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<GroupInvitationInfoResponse>> continuation);

    java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, java.lang.Integer num, @NotNull Continuation<? super InHouseIMAddGroupAnnouncementResponse> continuation);

    java.lang.Object OLrzqt(long j, @NotNull Continuation<? super java.util.List<InHouseIMGroupAnnouncementInfo>> continuation);

    java.lang.Object OLrzqt(@NotNull GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    Flow<InHouseIMGroupEntity> OLrzqt(@NotNull java.lang.String str);

    java.lang.Object copydefault(long j, @NotNull Continuation<? super ResponseData<VipRmGroupStatus>> continuation);

    java.lang.Object copydefault(@NotNull GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest, @NotNull Continuation<? super ResponseData<AddMembersResponse>> continuation);

    java.lang.Object copydefault(@NotNull GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, @NotNull Continuation<? super ResponseData<GroupJoinApplicationResultResponse>> continuation);

    java.lang.Object copydefault(@NotNull GroupJoinApplicationRequest groupJoinApplicationRequest, @NotNull Continuation<? super ResponseData<GroupJoinApplicationResponse>> continuation);

    java.lang.Object copydefault(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, @NotNull Continuation<? super ResponseData<GetMaxMemberCountResponse>> continuation);

    java.lang.Object copydefault(@NotNull RevokePastInvitesRequest revokePastInvitesRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    java.lang.Object copydefault(@NotNull SetGroupSettingsReq setGroupSettingsReq, @NotNull Continuation<? super ResponseData<ResultDataResponse>> continuation);

    java.lang.Object copydefault(java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<GroupRecommendationResponse>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    Flow<InHouseIMGroupSettingEntity> copydefault(@NotNull java.lang.String str);
}
