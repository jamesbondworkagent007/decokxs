package com.okinc.okimcore.feature.group.repository.remote;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.im.group.VipRmGroupStatus;
import com.okinc.okimcore.model.remote.AddGroupAnnouncementReq;
import com.okinc.okimcore.model.remote.AddMembersResponse;
import com.okinc.okimcore.model.remote.BillingConfig;
import com.okinc.okimcore.model.remote.CreateGroupInviteRequest;
import com.okinc.okimcore.model.remote.CreateGroupInviteResponse;
import com.okinc.okimcore.model.remote.CreateGroupRequest;
import com.okinc.okimcore.model.remote.CreatePaidGroupPaymentRequest;
import com.okinc.okimcore.model.remote.CreatePaidGroupPaymentResponse;
import com.okinc.okimcore.model.remote.DeleteGroupAnnouncementsReq;
import com.okinc.okimcore.model.remote.EditGroupAnnouncementReq;
import com.okinc.okimcore.model.remote.GetExistingInviteResponse;
import com.okinc.okimcore.model.remote.GetGroupBannersReq;
import com.okinc.okimcore.model.remote.GetMaxMemberCountResponse;
import com.okinc.okimcore.model.remote.GroupAddOrRemoveMemberRequest;
import com.okinc.okimcore.model.remote.GroupBannerList;
import com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse;
import com.okinc.okimcore.model.remote.GroupEntryCurrencyListResponse;
import com.okinc.okimcore.model.remote.GroupEntryVerifyAsset;
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
import com.okinc.okimcore.model.remote.InHouseIMDeleteGroupAnnouncementsResponse;
import com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupMemberList;
import com.okinc.okimcore.model.remote.InHouseIMPaidGroupCategories;
import com.okinc.okimcore.model.remote.ListGroupJoinApplicationResponse;
import com.okinc.okimcore.model.remote.PaidGroupTransactionsListResponse;
import com.okinc.okimcore.model.remote.PaidGroupTransactionsSummaryResponse;
import com.okinc.okimcore.model.remote.PublicGroupInfoList;
import com.okinc.okimcore.model.remote.QuitGroupReq;
import com.okinc.okimcore.model.remote.ResultDataResponse;
import com.okinc.okimcore.model.remote.RevokePastInvitesRequest;
import com.okinc.okimcore.model.remote.SetGroupSettingsReq;
import com.okinc.okimcore.model.remote.SetOrRemoveAdminReq;
import com.okinc.okimcore.model.remote.UpdatePaymentRequiredStatusRequest;
import com.okinc.okimcore.model.remote.WithdrawPaidGroupPaymentRequest;
import com.okinc.okimcore.model.remote.groupvoicecall.JoinGroupVoiceCallRequest;
import com.okinc.okimcore.model.remote.groupvoicecall.JoinGroupVoiceCallResponse;
import com.okinc.okimcore.model.remote.groupvoicecall.RingGroupVoiceCallRequest;
import com.okinc.okimcore.model.remote.groupvoicecall.StartGroupVoiceCallRequest;
import com.okinc.okimcore.model.remote.groupvoicecall.StartGroupVoiceCallResponse;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMGroupService {
    @POST("/priapi/v1/im/group/v1/accept-invite")
    Object acceptGroupInvite(@Body @NotNull GroupInviteRequest groupInviteRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/im/group/v1/add-member")
    Object addGroupMember(@Body @NotNull GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest, @NotNull Continuation<? super ResponseData<AddMembersResponse>> continuation);

    @POST("/priapi/v1/im/group/application/v1/approve")
    Object approveGroupJoinApplications(@Body @NotNull GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, @NotNull Continuation<? super ResponseData<GroupJoinApplicationResultResponse>> continuation);

    @POST("/priapi/v1/im/group/v1/create")
    Object createGroup(@Body @NotNull CreateGroupRequest createGroupRequest, @NotNull Continuation<? super ResponseData<InHouseIMGroupEntity>> continuation);

    @POST("/priapi/v1/im/group/announcement/v1/add")
    Object createGroupAnnouncement(@Body @NotNull AddGroupAnnouncementReq addGroupAnnouncementReq, @NotNull Continuation<? super ResponseData<InHouseIMAddGroupAnnouncementResponse>> continuation);

    @POST("/priapi/v1/im/group/entry/v1/upsert")
    Object createGroupEntryVerificationDetails(@Body @NotNull GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/im/group/v1/create-invite")
    Object createGroupInvite(@Body @NotNull CreateGroupInviteRequest createGroupInviteRequest, @NotNull Continuation<? super ResponseData<CreateGroupInviteResponse>> continuation);

    @POST("/priapi/v1/im/paid-group/v1/transactions/create")
    Object createPaidGroupPayment(@Body @NotNull CreatePaidGroupPaymentRequest createPaidGroupPaymentRequest, @NotNull Continuation<? super ResponseData<CreatePaidGroupPaymentResponse>> continuation);

    @POST("/priapi/v1/im/group/announcement/v1/delete")
    Object deleteGroupAnnouncements(@Body @NotNull DeleteGroupAnnouncementsReq deleteGroupAnnouncementsReq, @NotNull Continuation<? super ResponseData<InHouseIMDeleteGroupAnnouncementsResponse>> continuation);

    @POST("/priapi/v1/im/group/announcement/v1/update")
    Object editGroupAnnouncement(@Body @NotNull EditGroupAnnouncementReq editGroupAnnouncementReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/priapi/v1/im/group/v1/current-invite-link")
    Object getCurrentInviteLink(@Query(RemoteMessageConst.Notification.CHANNEL_ID) long j, @NotNull Continuation<? super ResponseData<GetExistingInviteResponse>> continuation);

    @GET("/priapi/v1/im/group/announcement/v1/list")
    Object getGroupAnnouncementsList(@Query("groupId") long j, @NotNull Continuation<? super ResponseData<List<InHouseIMGroupAnnouncementInfo>>> continuation);

    @POST("/priapi/v1/im/group-banner/v1/list")
    Object getGroupBanners(@Body @NotNull GetGroupBannersReq getGroupBannersReq, @NotNull Continuation<? super ResponseData<GroupBannerList>> continuation);

    @GET("/priapi/v1/im/group/entry/v1/billing-model/config")
    Object getGroupBillingModelConfig(@NotNull Continuation<? super ResponseData<BillingConfig>> continuation);

    @GET("/priapi/v1/im/group/entry/v1/asset/currency")
    Object getGroupEntryListCurrency(@NotNull Continuation<? super ResponseData<GroupEntryCurrencyListResponse>> continuation);

    @GET("/priapi/v1/im/group/entry/v1/get")
    Object getGroupEntryVerificationDetails(@Query("groupId") long j, @NotNull Continuation<? super ResponseData<GroupEntryCreateVerificationRequestResponse>> continuation);

    @GET("/priapi/v1/im/group/v1/info")
    Object getGroupInfoById(@Query("groupId") long j, @Query("maxMembersToReturn") Integer num, @NotNull Continuation<? super ResponseData<InHouseIMGroupInfo>> continuation);

    @GET("/priapi/v1/im/group/member/v1/info")
    Object getGroupMemberInfoById(@Query("groupId") long j, @Query("memberUid") long j2, @NotNull Continuation<? super ResponseData<InHouseIMGroupMemberInfo>> continuation);

    @GET("/priapi/v1/im/group/member/v1/list")
    Object getGroupMemberListById(@Query("groupId") long j, @Query("pageIndex") Integer num, @Query("pageSize") Integer num2, @Query("filters") String str, @NotNull Continuation<? super ResponseData<InHouseIMGroupMemberList>> continuation);

    @GET("/priapi/v1/im/group/v1/recommendation")
    Object getGroupRecommendations(@Query("excludePaidGroups") Boolean bool, @NotNull Continuation<? super ResponseData<GroupRecommendationResponse>> continuation);

    @GET("/priapi/v1/im/group/v1/max-member-count")
    Object getMaxMemberCount(@NotNull @Query("service") GroupServiceType groupServiceType, @NotNull @Query("scenarioType") GroupScenarioType groupScenarioType, @NotNull Continuation<? super ResponseData<GetMaxMemberCountResponse>> continuation);

    @GET("/priapi/v1/im/paid-group/member/v1/categories")
    Object getPaidGroupMemberListCategories(@Query("groupId") long j, @NotNull Continuation<? super ResponseData<InHouseIMPaidGroupCategories>> continuation);

    @GET("/priapi/v1/im/paid-group/v1/transactions/list")
    Object getPaidGroupTransactionsList(@Query("groupId") long j, @Query("lastTransactionId") String str, @Query("pageSize") Integer num, @NotNull Continuation<? super ResponseData<PaidGroupTransactionsListResponse>> continuation);

    @GET("/priapi/v1/im/paid-group/v1/transactions/summary")
    Object getPaidGroupTransactionsSummary(@Query("groupId") long j, @NotNull Continuation<? super ResponseData<PaidGroupTransactionsSummaryResponse>> continuation);

    @GET("/priapi/v1/im/group/v1/public-group-info")
    Object getPublicGroupInfo(@NotNull @Query("ownerUid") String str, @NotNull Continuation<? super ResponseData<PublicGroupInfoList>> continuation);

    @GET("/priapi/v1/im/group/v1/status")
    Object getVipGroupStatus(@Query("groupId") long j, @NotNull Continuation<? super ResponseData<VipRmGroupStatus>> continuation);

    @POST("/priapi/v1/im/group/voice-call/v1/join")
    Object joinGroupVoiceCall(@Body @NotNull JoinGroupVoiceCallRequest joinGroupVoiceCallRequest, @NotNull Continuation<? super ResponseData<JoinGroupVoiceCallResponse>> continuation);

    @GET("/priapi/v1/im/group/application/v1/list")
    Object listGroupJoinApplications(@Query("groupId") long j, @Query("status") Integer num, @Query("fromApplicationId") String str, @Query("pageSize") Integer num2, @NotNull Continuation<? super ResponseData<ListGroupJoinApplicationResponse>> continuation);

    @POST("/priapi/v1/im/group/v1/update")
    Object manageGroupSettings(@Body @NotNull SetGroupSettingsReq setGroupSettingsReq, @NotNull Continuation<? super ResponseData<ResultDataResponse>> continuation);

    @GET("/priapi/v1/im/group/v1/query-invitation-info")
    Object queryGroupInvite(@NotNull @Query("invitationId") String str, @NotNull Continuation<? super ResponseData<GroupInvitationInfoResponse>> continuation);

    @POST("/priapi/v1/im/group/member/v1/quit")
    Object quitGroup(@Body @NotNull QuitGroupReq quitGroupReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/im/group/application/v1/reject")
    Object rejectGroupJoinApplications(@Body @NotNull GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, @NotNull Continuation<? super ResponseData<GroupJoinApplicationResultResponse>> continuation);

    @POST("/priapi/v1/im/group/v1/remove-member")
    Object removeGroupMember(@Body @NotNull GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/im/group/v1/revoke-past-invitations")
    Object revokePastInvitations(@Body @NotNull RevokePastInvitesRequest revokePastInvitesRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/im/group/voice-call/v1/ring")
    Object ringGroupVoiceCall(@Body @NotNull RingGroupVoiceCallRequest ringGroupVoiceCallRequest, @NotNull Continuation<? super ResponseData<Boolean>> continuation);

    @POST("/priapi/v1/im/group/v1/set-role")
    Object setOrRemoveGroupAdmin(@Body @NotNull SetOrRemoveAdminReq setOrRemoveAdminReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/im/group/voice-call/v1/start")
    Object startGroupVoiceCall(@Body @NotNull StartGroupVoiceCallRequest startGroupVoiceCallRequest, @NotNull Continuation<? super ResponseData<StartGroupVoiceCallResponse>> continuation);

    @POST("/priapi/v1/im/group/application/v1/submit")
    Object submitGroupJoinApplication(@Body @NotNull GroupJoinApplicationRequest groupJoinApplicationRequest, @NotNull Continuation<? super ResponseData<GroupJoinApplicationResponse>> continuation);

    @POST("/priapi/v1/im/group/v1/transfer-owner")
    Object transferGroupOwner(@Body @NotNull GroupOwnerTransferRequest groupOwnerTransferRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/im/paid-group/member/v1/payment-required-status/update")
    Object updatePaymentRequiredStatus(@Body @NotNull UpdatePaymentRequiredStatusRequest updatePaymentRequiredStatusRequest, @NotNull Continuation<? super ResponseData<Boolean>> continuation);

    @POST("/priapi/v1/im/group/entry/v1/verify")
    Object verifyAsset(@Body @NotNull GroupEntryVerifyAsset groupEntryVerifyAsset, @NotNull Continuation<? super ResponseData<Boolean>> continuation);

    @POST("/priapi/v1/im/group/application/v1/withdraw")
    Object withdrawPaidGroupPayment(@Body @NotNull WithdrawPaidGroupPaymentRequest withdrawPaidGroupPaymentRequest, @NotNull Continuation<? super ResponseData<Boolean>> continuation);

    public static final class Activity {
        public static /* synthetic */ Object getGroupInfoById$default(InHouseIMGroupService inHouseIMGroupService, long j, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGroupInfoById");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return inHouseIMGroupService.getGroupInfoById(j, num, continuation);
        }

        public static /* synthetic */ Object getGroupMemberListById$default(InHouseIMGroupService inHouseIMGroupService, long j, Integer num, Integer num2, String str, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return inHouseIMGroupService.getGroupMemberListById(j, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGroupMemberListById");
        }

        public static /* synthetic */ Object getGroupRecommendations$default(InHouseIMGroupService inHouseIMGroupService, Boolean bool, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGroupRecommendations");
            }
            if ((i & 1) != 0) {
                bool = Boolean.FALSE;
            }
            return inHouseIMGroupService.getGroupRecommendations(bool, continuation);
        }
    }
}
