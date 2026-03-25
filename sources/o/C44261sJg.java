package o;

import com.google.android.exoplayer2.audio.WavUtil;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$acceptGroupInvite$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$addGroupMember$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$approveGroupJoinApplications$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$createGroup$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$createGroupAnnouncement$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$createGroupInvite$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$deleteGroupAnnouncements$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$disbandGroup$1;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$editGroupAnnouncement$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$getCurrentInviteLink$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$getGroupAnnouncementsList$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$getGroupInfoById$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$getGroupMemberInfoById$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$getGroupMemberListById$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$getGroupRecommendations$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$getMaxMemberCount$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$getPaidGroupMemberListCategories$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$listGroupJoinApplications$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$queryGroupInvite$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$quitGroup$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$rejectGroupJoinApplications$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$removeGroupMember$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$revokePastInvites$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$setOrRemoveGroupAdmin$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$submitGroupJoinApplication$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$transferGroupOwner$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$updateGroupSettings$2;
import com.okinc.okimcore.feature.group.manager.InHouseIMGroupManagerImpl$upgradeGroupLimitSize$1;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import com.okinc.okimcore.model.im.group.VipRmGroupStatus;
import com.okinc.okimcore.model.remote.AddGroupAnnouncementReq;
import com.okinc.okimcore.model.remote.AddMembersResponse;
import com.okinc.okimcore.model.remote.CreateGroupInviteRequest;
import com.okinc.okimcore.model.remote.CreateGroupInviteResponse;
import com.okinc.okimcore.model.remote.CreateGroupRequest;
import com.okinc.okimcore.model.remote.EditGroupAnnouncementReq;
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
import com.okinc.okimcore.model.remote.InHouseUserInfo;
import com.okinc.okimcore.model.remote.ListGroupJoinApplicationResponse;
import com.okinc.okimcore.model.remote.ListGroupJoinApplicationsRequest;
import com.okinc.okimcore.model.remote.ResultDataResponse;
import com.okinc.okimcore.model.remote.RevokePastInvitesRequest;
import com.okinc.okimcore.model.remote.SetGroupSettingsReq;
import com.okinc.okimcore.model.remote.groupvoicecall.JoinGroupVoiceCallRequest;
import com.okinc.okimcore.model.remote.groupvoicecall.JoinGroupVoiceCallResponse;
import com.okinc.okimcore.model.remote.groupvoicecall.RingGroupVoiceCallRequest;
import com.okinc.okimcore.model.remote.groupvoicecall.StartGroupVoiceCallRequest;
import com.okinc.okimcore.model.remote.groupvoicecall.StartGroupVoiceCallResponse;
import com.okinc.okimcore.model.room.inhouseim.GroupMemberWithDetails;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44261sJg implements InterfaceC44256sJb {
    public final InHouseIMGroupService AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final sIC KWHzl;

    @yCM
    public C44261sJg(@NotNull sIC sic, @NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sic;
        this.AEQbTJ = inHouseIMGroupService;
        this.EZpvd = coroutineDispatcher;
    }

    public final InHouseIMGroupMemberDao OLrzqt() {
        return this.KWHzl.copydefault().AYXKKw();
    }

    public final InHouseIMGroupInfoDao EZpvd() {
        return this.KWHzl.copydefault().EZpvd();
    }

    public final InHouseIMGroupSettingDao copydefault() {
        return this.KWHzl.copydefault().valueOf();
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object EZpvd(long j, java.lang.Integer num, @NotNull Continuation<? super InHouseIMGroupInfo> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$getGroupInfoById$2(this, j, num, null), continuation);
    }

    public final void OLrzqt(InHouseUserInfo inHouseUserInfo) {
        C44124sEe.imLogGroup$default("InHouseIMGroupImpl => update user info ", null, 2, null);
        sFU sfuValueOf = sDZ.AEQbTJ.valueOf();
        com.okinc.okimcore.model.remote.UserInfo userInfoOLrzqt = sfuValueOf.OLrzqt();
        if (userInfoOLrzqt != null) {
            sfuValueOf.EZpvd(userInfoOLrzqt.copy((524287 & 1) != 0 ? userInfoOLrzqt.identifyId : null, (524287 & 2) != 0 ? userInfoOLrzqt.avatar : inHouseUserInfo.getAvatar(), (524287 & 4) != 0 ? userInfoOLrzqt.avatarStatus : null, (524287 & 8) != 0 ? userInfoOLrzqt.petname : inHouseUserInfo.getNickname(), (524287 & 16) != 0 ? userInfoOLrzqt.enPetname : inHouseUserInfo.getEnNickname(), (524287 & 32) != 0 ? userInfoOLrzqt.rcToken : null, (524287 & 64) != 0 ? userInfoOLrzqt.sign : null, (524287 & 128) != 0 ? userInfoOLrzqt.phoneSearchStatus : null, (524287 & 256) != 0 ? userInfoOLrzqt.qrSearchStatus : null, (524287 & 512) != 0 ? userInfoOLrzqt.petnameSearchStatus : null, (524287 & 1024) != 0 ? userInfoOLrzqt.groupStatus : null, (524287 & 2048) != 0 ? userInfoOLrzqt.allowContactDiscovery : null, (524287 & 4096) != 0 ? userInfoOLrzqt.timestamp : null, (524287 & 8192) != 0 ? userInfoOLrzqt.officialTag : null, (524287 & 16384) != 0 ? userInfoOLrzqt.allowGenerateQrCode : null, (524287 & 32768) != 0 ? userInfoOLrzqt.allowCreateGroup : null, (524287 & 65536) != 0 ? userInfoOLrzqt.allowSearchUuid : null, (524287 & 131072) != 0 ? userInfoOLrzqt.phoneSyncQuota : null, (524287 & 262144) != 0 ? userInfoOLrzqt.allowInAppNotification : null, (524287 & 524288) != 0 ? userInfoOLrzqt.allowChatViaProfile : null));
        }
    }

    @Override // o.InterfaceC44256sJb
    public Flow<InHouseIMGroupEntity> OLrzqt(@NotNull java.lang.String str) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(str, "");
        InHouseIMGroupInfoDao inHouseIMGroupInfoDaoEZpvd = EZpvd();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow<InHouseIMGroupEntity> groupInfoByIdFlow = EZpvd().getGroupInfoByIdFlow(str);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMGroupInfoDaoEZpvd, jValueOf);
                return FlowKt.distinctUntilChanged(groupInfoByIdFlow);
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMGroupInfoDaoEZpvd, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // o.InterfaceC44256sJb
    public Flow<InHouseIMGroupSettingEntity> copydefault(@NotNull java.lang.String str) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(str, "");
        InHouseIMGroupSettingDao inHouseIMGroupSettingDaoCopydefault = copydefault();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow<InHouseIMGroupSettingEntity> settingInfoByIdFlow = copydefault().getSettingInfoByIdFlow(str);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMGroupSettingDaoCopydefault, jValueOf);
                return FlowKt.distinctUntilChanged(settingInfoByIdFlow);
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMGroupSettingDaoCopydefault, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object EZpvd(long j, @NotNull Continuation<? super InHouseIMGroupMemberList> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$getGroupMemberListById$2(this, j, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public Flow<java.util.List<GroupMemberWithDetails>> EZpvd(@NotNull java.lang.String str) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(str, "");
        InHouseIMGroupMemberDao inHouseIMGroupMemberDaoOLrzqt = OLrzqt();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                try {
                    try {
                        long jNanoTime = java.lang.System.nanoTime();
                        Flow<java.util.List<GroupMemberWithDetails>> groupMemberListFlow = OLrzqt().getGroupMemberListFlow(str);
                        long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        longRef.element = jValueOf;
                        C44159sFm.EZpvd(inHouseIMGroupMemberDaoOLrzqt, jValueOf);
                        return groupMemberListFlow;
                    } catch (java.lang.IllegalStateException e) {
                        java.lang.String message = e.getMessage();
                        if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e);
                            throw e;
                        }
                        C44159sFm.copydefault(e);
                        throw e;
                    }
                } catch (java.lang.Exception e2) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                try {
                    C44159sFm.copydefault(e3, exc);
                    i++;
                    exc = e3;
                } finally {
                    C44159sFm.EZpvd(inHouseIMGroupMemberDaoOLrzqt, longRef.element);
                }
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super ResponseData<GetExistingInviteResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$getCurrentInviteLink$2(this, j, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object copydefault(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, @NotNull Continuation<? super ResponseData<GetMaxMemberCountResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$getMaxMemberCount$2(this, groupServiceType, groupScenarioType, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object EZpvd(long j, long j2, @NotNull Continuation<? super InHouseIMGroupMemberInfo> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$getGroupMemberInfoById$2(this, j, j2, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object AEQbTJ(@NotNull CreateGroupRequest createGroupRequest, @NotNull Continuation<? super ResponseData<InHouseIMGroupEntity>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$createGroup$2(this, createGroupRequest, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$setOrRemoveGroupAdmin$2(str, list, z, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object copydefault(@NotNull SetGroupSettingsReq setGroupSettingsReq, @NotNull Continuation<? super ResponseData<ResultDataResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$updateGroupSettings$2(this, setGroupSettingsReq, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$quitGroup$2(str, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC44256sJb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        InHouseIMGroupManagerImpl$disbandGroup$1 inHouseIMGroupManagerImpl$disbandGroup$1;
        if (continuation instanceof InHouseIMGroupManagerImpl$disbandGroup$1) {
            inHouseIMGroupManagerImpl$disbandGroup$1 = (InHouseIMGroupManagerImpl$disbandGroup$1) continuation;
            int i = inHouseIMGroupManagerImpl$disbandGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMGroupManagerImpl$disbandGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMGroupManagerImpl$disbandGroup$1 = new InHouseIMGroupManagerImpl$disbandGroup$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = inHouseIMGroupManagerImpl$disbandGroup$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = inHouseIMGroupManagerImpl$disbandGroup$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            SetGroupSettingsReq setGroupSettingsReq = new SetGroupSettingsReq(C56443yFo.KWHzl(C33129mqd.valueOf(str)), (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, C56443yFo.AEQbTJ(1), (java.lang.Long) null, (java.lang.Long) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, 129022, (DefaultConstructorMarker) null);
            inHouseIMGroupManagerImpl$disbandGroup$1.label = 1;
            objCopydefault = copydefault(setGroupSettingsReq, inHouseIMGroupManagerImpl$disbandGroup$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        ResultDataResponse resultDataResponse = (ResultDataResponse) ((ResponseData) objCopydefault).getData();
        return C56443yFo.KWHzl(resultDataResponse != null ? resultDataResponse.isSuccess() : false);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, java.lang.Integer num, @NotNull Continuation<? super InHouseIMAddGroupAnnouncementResponse> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$createGroupAnnouncement$2(this, new AddGroupAnnouncementReq(j, str, num), null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object KWHzl(long j, long j2, java.lang.String str, java.lang.Boolean bool, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Integer num;
        java.lang.Integer numAEQbTJ;
        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
            numAEQbTJ = C56443yFo.AEQbTJ(1);
        } else {
            if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(false))) {
                num = null;
                return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$editGroupAnnouncement$2(this, new EditGroupAnnouncementReq(j, j2, str, num), null), continuation);
            }
            numAEQbTJ = C56443yFo.AEQbTJ(0);
        }
        num = numAEQbTJ;
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$editGroupAnnouncement$2(this, new EditGroupAnnouncementReq(j, j2, str, num), null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object AEQbTJ(long j, java.util.List<java.lang.Long> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$deleteGroupAnnouncements$2(j, list, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object OLrzqt(long j, @NotNull Continuation<? super java.util.List<InHouseIMGroupAnnouncementInfo>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$getGroupAnnouncementsList$2(this, j, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object copydefault(@NotNull GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest, @NotNull Continuation<? super ResponseData<AddMembersResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$addGroupMember$2(this, groupAddOrRemoveMemberRequest, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object OLrzqt(@NotNull GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$removeGroupMember$2(this, groupAddOrRemoveMemberRequest, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object KWHzl(@NotNull GroupOwnerTransferRequest groupOwnerTransferRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$transferGroupOwner$2(this, groupOwnerTransferRequest, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object KWHzl(@NotNull CreateGroupInviteRequest createGroupInviteRequest, @NotNull Continuation<? super ResponseData<CreateGroupInviteResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$createGroupInvite$2(this, createGroupInviteRequest, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object copydefault(@NotNull RevokePastInvitesRequest revokePastInvitesRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$revokePastInvites$2(this, revokePastInvitesRequest, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<GroupInvitationInfoResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$queryGroupInvite$2(this, str, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object AEQbTJ(@NotNull GroupInviteRequest groupInviteRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$acceptGroupInvite$2(this, groupInviteRequest, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object copydefault(@NotNull GroupJoinApplicationRequest groupJoinApplicationRequest, @NotNull Continuation<? super ResponseData<GroupJoinApplicationResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$submitGroupJoinApplication$2(this, groupJoinApplicationRequest, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object AEQbTJ(@NotNull ListGroupJoinApplicationsRequest listGroupJoinApplicationsRequest, @NotNull Continuation<? super ResponseData<ListGroupJoinApplicationResponse>> continuation) {
        GroupApplicationStatus status = listGroupJoinApplicationsRequest.getStatus();
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$listGroupJoinApplications$2(this, listGroupJoinApplicationsRequest, status != null ? C56443yFo.AEQbTJ(status.getRawValue()) : null, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object copydefault(@NotNull GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, @NotNull Continuation<? super ResponseData<GroupJoinApplicationResultResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$approveGroupJoinApplications$2(this, groupJoinApplicationIdsRequest, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object EZpvd(@NotNull GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, @NotNull Continuation<? super ResponseData<GroupJoinApplicationResultResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$rejectGroupJoinApplications$2(this, groupJoinApplicationIdsRequest, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object KWHzl(long j, @NotNull Continuation<? super ResponseData<InHouseIMPaidGroupCategories>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$getPaidGroupMemberListCategories$2(this, j, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object copydefault(java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<GroupRecommendationResponse>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InHouseIMGroupManagerImpl$getGroupRecommendations$2(this, bool, null), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object copydefault(long j, @NotNull Continuation<? super ResponseData<VipRmGroupStatus>> continuation) {
        return this.AEQbTJ.getVipGroupStatus(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC44256sJb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        InHouseIMGroupManagerImpl$upgradeGroupLimitSize$1 inHouseIMGroupManagerImpl$upgradeGroupLimitSize$1;
        if (continuation instanceof InHouseIMGroupManagerImpl$upgradeGroupLimitSize$1) {
            inHouseIMGroupManagerImpl$upgradeGroupLimitSize$1 = (InHouseIMGroupManagerImpl$upgradeGroupLimitSize$1) continuation;
            int i = inHouseIMGroupManagerImpl$upgradeGroupLimitSize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMGroupManagerImpl$upgradeGroupLimitSize$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMGroupManagerImpl$upgradeGroupLimitSize$1 = new InHouseIMGroupManagerImpl$upgradeGroupLimitSize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = inHouseIMGroupManagerImpl$upgradeGroupLimitSize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = inHouseIMGroupManagerImpl$upgradeGroupLimitSize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            SetGroupSettingsReq setGroupSettingsReq = new SetGroupSettingsReq(C56443yFo.KWHzl(C33129mqd.valueOf(str)), (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Integer) null, (java.lang.String) null, C56443yFo.AEQbTJ(1), WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null);
            inHouseIMGroupManagerImpl$upgradeGroupLimitSize$1.label = 1;
            objCopydefault = copydefault(setGroupSettingsReq, inHouseIMGroupManagerImpl$upgradeGroupLimitSize$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        ResultDataResponse resultDataResponse = (ResultDataResponse) ((ResponseData) objCopydefault).getData();
        return C56443yFo.KWHzl(resultDataResponse != null ? resultDataResponse.isSuccess() : false);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<StartGroupVoiceCallResponse>> continuation) {
        return this.AEQbTJ.startGroupVoiceCall(new StartGroupVoiceCallRequest(str, list), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<JoinGroupVoiceCallResponse>> continuation) {
        return this.AEQbTJ.joinGroupVoiceCall(new JoinGroupVoiceCallRequest(str), continuation);
    }

    @Override // o.InterfaceC44256sJb
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<java.lang.Boolean>> continuation) {
        return this.AEQbTJ.ringGroupVoiceCall(new RingGroupVoiceCallRequest(str, list), continuation);
    }
}
