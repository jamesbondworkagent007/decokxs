package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.core.util.SPUtils;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$changeDoNotDisturbStatus$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$flaggedConversation$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getAnnouncementBanner$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getConversationTextDraft$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getConversationTextDraftOnChannel$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getIMQrCode$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getQRCodeResult$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getQRCodeResultV2$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getReferenceSequenceDraft$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getTotalUnreadCount$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getTotalUnreadCountByChannelTypeFlow$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$getTotalUnreadCountFlow$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$joinLiveStream$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$leaveLiveStream$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$markConversationMessagesRead$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$markConversationRead$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$pinConversation$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$saveConversationDraftMessageModel$1;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.other.AnnouncementBanner;
import com.okinc.okimcore.model.other.QRCodeResultInfo;
import com.okinc.okimcore.model.remote.InhouseIMQueryMyQRCodeResponse;
import com.okinc.okimcore.model.remote.InhouseIMQueryQRCodeScanResponse;
import com.okinc.okimcore.model.remote.ScanQRCodeRequestBody;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.sGI;
import o.sNF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sEA implements sNF {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final CoroutineScope AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final sFQ KWHzl;
    public final sHU copydefault;

    @Override // o.sNF
    public long OLrzqt() {
        return 0L;
    }

    public sEA(@NotNull sHU shu, @NotNull sFQ sfq, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(shu, "");
        Intrinsics.checkNotNullParameter(sfq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.copydefault = shu;
        this.KWHzl = sfq;
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull OKConversation oKConversation, boolean z, @NotNull Continuation<? super sNF.Application> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$changeDoNotDisturbStatus$1 inHouseIMUtilityImpl$changeDoNotDisturbStatus$1;
        java.lang.Object objM7377constructorimpl;
        OKConversation oKConversation2;
        boolean z2;
        sEA sea;
        if (continuation instanceof InHouseIMUtilityImpl$changeDoNotDisturbStatus$1) {
            inHouseIMUtilityImpl$changeDoNotDisturbStatus$1 = (InHouseIMUtilityImpl$changeDoNotDisturbStatus$1) continuation;
            int i = inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$changeDoNotDisturbStatus$1 = new InHouseIMUtilityImpl$changeDoNotDisturbStatus$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.L$0 = oKConversation;
                inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.L$1 = this;
                inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.Z$0 = z;
                inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.label = 1;
                objEZpvd = EZpvd(oKConversation, z, inHouseIMUtilityImpl$changeDoNotDisturbStatus$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                oKConversation2 = oKConversation;
                z2 = z;
                sea = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.Z$0;
                sea = (sEA) inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.L$1;
                OKConversation oKConversation3 = (OKConversation) inHouseIMUtilityImpl$changeDoNotDisturbStatus$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                oKConversation2 = oKConversation3;
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (((java.lang.Boolean) objEZpvd).booleanValue()) {
            sea.KWHzl.EZpvd(oKConversation2.getTargetId(), z2);
            sea.KWHzl.AEQbTJ(oKConversation2.copy(((-4097) & 1) != 0 ? oKConversation2.conversationType : null, ((-4097) & 2) != 0 ? oKConversation2.targetId : null, ((-4097) & 4) != 0 ? oKConversation2.contactId : null, ((-4097) & 8) != 0 ? oKConversation2.conversationTitle : null, ((-4097) & 16) != 0 ? oKConversation2.bizGroupName : null, ((-4097) & 32) != 0 ? oKConversation2.groupName : null, ((-4097) & 64) != 0 ? oKConversation2.portraitUrl : null, ((-4097) & 128) != 0 ? oKConversation2.unreadMessageCount : 0, ((-4097) & 256) != 0 ? oKConversation2.unreadMentionedCount : 0, ((-4097) & 512) != 0 ? oKConversation2.mentionedType : null, ((-4097) & 1024) != 0 ? oKConversation2.isTop : false, ((-4097) & 2048) != 0 ? oKConversation2.isFlagged : false, ((-4097) & 4096) != 0 ? oKConversation2.isNoDisturb : z2, ((-4097) & 8192) != 0 ? oKConversation2.latestMessage : null, ((-4097) & 16384) != 0 ? oKConversation2.sentStatus : null, ((-4097) & 32768) != 0 ? oKConversation2.receivedTime : 0L, ((-4097) & 65536) != 0 ? oKConversation2.sentTime : 0L, ((-4097) & 131072) != 0 ? oKConversation2.senderUserId : null, (262144 & (-4097)) != 0 ? oKConversation2.draftMessageModel : null, ((-4097) & 524288) != 0 ? oKConversation2.officialTagInfo : null, ((-4097) & 1048576) != 0 ? oKConversation2.messageListTab : null, ((-4097) & 2097152) != 0 ? oKConversation2.shouldFetchNameAndAvatarFromRemote : false, ((-4097) & 4194304) != 0 ? oKConversation2.inGroupStatus : null, ((-4097) & 8388608) != 0 ? oKConversation2.groupStatus : null, ((-4097) & 16777216) != 0 ? oKConversation2.groupType : null, ((-4097) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? oKConversation2.role : null, ((-4097) & 67108864) != 0 ? oKConversation2.extra : null, ((-4097) & 134217728) != 0 ? oKConversation2.conversationStatus : null, ((-4097) & 268435456) != 0 ? oKConversation2.lastReadMsgSeq : null, ((-4097) & 536870912) != 0 ? oKConversation2.startMsgSeq : null, ((-4097) & 1073741824) != 0 ? oKConversation2.groupEntityType : null, ((-4097) & Integer.MIN_VALUE) != 0 ? oKConversation2.conversationIcons : null, (1 & 1) != 0 ? oKConversation2.disbandServiceScenarioType : null));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
                return sNF.Application.C0941Application.AEQbTJ;
            }
            return new sNF.Application.StateListAnimator(thM7380exceptionOrNullimpl);
        }
        throw new java.lang.Throwable("Fail to mute conversation with some reason");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super sNF.StateListAnimator> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$pinConversation$1 inHouseIMUtilityImpl$pinConversation$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.String str2;
        sEA sea;
        if (continuation instanceof InHouseIMUtilityImpl$pinConversation$1) {
            inHouseIMUtilityImpl$pinConversation$1 = (InHouseIMUtilityImpl$pinConversation$1) continuation;
            int i = inHouseIMUtilityImpl$pinConversation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$pinConversation$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$pinConversation$1 = new InHouseIMUtilityImpl$pinConversation$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMUtilityImpl$pinConversation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$pinConversation$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                inHouseIMUtilityImpl$pinConversation$1.L$0 = str;
                inHouseIMUtilityImpl$pinConversation$1.L$1 = this;
                inHouseIMUtilityImpl$pinConversation$1.Z$0 = z;
                inHouseIMUtilityImpl$pinConversation$1.label = 1;
                objEZpvd = EZpvd(str, z, z2, inHouseIMUtilityImpl$pinConversation$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                str2 = str;
                sea = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = inHouseIMUtilityImpl$pinConversation$1.Z$0;
                sea = (sEA) inHouseIMUtilityImpl$pinConversation$1.L$1;
                str2 = (java.lang.String) inHouseIMUtilityImpl$pinConversation$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (((java.lang.Boolean) objEZpvd).booleanValue()) {
            sea.KWHzl.copydefault(str2, z);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
                return sNF.StateListAnimator.Activity.KWHzl;
            }
            return new sNF.StateListAnimator.Application(thM7380exceptionOrNullimpl);
        }
        throw new java.lang.Throwable("Fail to pin conversation with some reason");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super sNF.ActionBar> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$flaggedConversation$1 inHouseIMUtilityImpl$flaggedConversation$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.String str2;
        sEA sea;
        if (continuation instanceof InHouseIMUtilityImpl$flaggedConversation$1) {
            inHouseIMUtilityImpl$flaggedConversation$1 = (InHouseIMUtilityImpl$flaggedConversation$1) continuation;
            int i = inHouseIMUtilityImpl$flaggedConversation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$flaggedConversation$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$flaggedConversation$1 = new InHouseIMUtilityImpl$flaggedConversation$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = inHouseIMUtilityImpl$flaggedConversation$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$flaggedConversation$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                inHouseIMUtilityImpl$flaggedConversation$1.L$0 = str;
                inHouseIMUtilityImpl$flaggedConversation$1.L$1 = this;
                inHouseIMUtilityImpl$flaggedConversation$1.Z$0 = z;
                inHouseIMUtilityImpl$flaggedConversation$1.label = 1;
                objCopydefault = copydefault(str, z, z2, inHouseIMUtilityImpl$flaggedConversation$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                str2 = str;
                sea = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = inHouseIMUtilityImpl$flaggedConversation$1.Z$0;
                sea = (sEA) inHouseIMUtilityImpl$flaggedConversation$1.L$1;
                str2 = (java.lang.String) inHouseIMUtilityImpl$flaggedConversation$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (((java.lang.Boolean) objCopydefault).booleanValue()) {
            sea.KWHzl.KWHzl(str2, z);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
                return sNF.ActionBar.Activity.OLrzqt;
            }
            return new sNF.ActionBar.C0939ActionBar(thM7380exceptionOrNullimpl);
        }
        throw new java.lang.Throwable("Fail to pin conversation with some reason");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull OKConversation oKConversation, @NotNull Continuation<? super sNF.Activity> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$getConversationTextDraft$1 inHouseIMUtilityImpl$getConversationTextDraft$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof InHouseIMUtilityImpl$getConversationTextDraft$1) {
            inHouseIMUtilityImpl$getConversationTextDraft$1 = (InHouseIMUtilityImpl$getConversationTextDraft$1) continuation;
            int i = inHouseIMUtilityImpl$getConversationTextDraft$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$getConversationTextDraft$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$getConversationTextDraft$1 = new InHouseIMUtilityImpl$getConversationTextDraft$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = inHouseIMUtilityImpl$getConversationTextDraft$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$getConversationTextDraft$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Result.Application application = Result.Companion;
                inHouseIMUtilityImpl$getConversationTextDraft$1.label = 1;
                objAEQbTJ = AEQbTJ(oKConversation, inHouseIMUtilityImpl$getConversationTextDraft$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.lang.String) objAEQbTJ);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return new sNF.Activity.C0940Activity((java.lang.String) objM7377constructorimpl);
        }
        return new sNF.Activity.StateListAnimator(thM7380exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull OKConversation oKConversation, @NotNull Continuation<? super sNF.TaskDescription> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$getReferenceSequenceDraft$1 inHouseIMUtilityImpl$getReferenceSequenceDraft$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof InHouseIMUtilityImpl$getReferenceSequenceDraft$1) {
            inHouseIMUtilityImpl$getReferenceSequenceDraft$1 = (InHouseIMUtilityImpl$getReferenceSequenceDraft$1) continuation;
            int i = inHouseIMUtilityImpl$getReferenceSequenceDraft$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$getReferenceSequenceDraft$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$getReferenceSequenceDraft$1 = new InHouseIMUtilityImpl$getReferenceSequenceDraft$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMUtilityImpl$getReferenceSequenceDraft$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$getReferenceSequenceDraft$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                inHouseIMUtilityImpl$getReferenceSequenceDraft$1.label = 1;
                objEZpvd = EZpvd(oKConversation, inHouseIMUtilityImpl$getReferenceSequenceDraft$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.lang.String) objEZpvd);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return new sNF.TaskDescription.ActionBar((java.lang.String) objM7377constructorimpl);
        }
        return new sNF.TaskDescription.Application(thM7380exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, DraftMessageModel draftMessageModel, @NotNull Continuation<? super sNF.Dialog> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$saveConversationDraftMessageModel$1 inHouseIMUtilityImpl$saveConversationDraftMessageModel$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof InHouseIMUtilityImpl$saveConversationDraftMessageModel$1) {
            inHouseIMUtilityImpl$saveConversationDraftMessageModel$1 = (InHouseIMUtilityImpl$saveConversationDraftMessageModel$1) continuation;
            int i = inHouseIMUtilityImpl$saveConversationDraftMessageModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$saveConversationDraftMessageModel$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$saveConversationDraftMessageModel$1 = new InHouseIMUtilityImpl$saveConversationDraftMessageModel$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMUtilityImpl$saveConversationDraftMessageModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$saveConversationDraftMessageModel$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                sGI sgiOLrzqt = this.copydefault.OLrzqt();
                inHouseIMUtilityImpl$saveConversationDraftMessageModel$1.label = 1;
                if (sgiOLrzqt.AEQbTJ(str, draftMessageModel, inHouseIMUtilityImpl$saveConversationDraftMessageModel$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return sNF.Dialog.TaskDescription.EZpvd;
        }
        return new sNF.Dialog.Application(thM7380exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super AnnouncementBanner> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$getAnnouncementBanner$1 inHouseIMUtilityImpl$getAnnouncementBanner$1;
        if (continuation instanceof InHouseIMUtilityImpl$getAnnouncementBanner$1) {
            inHouseIMUtilityImpl$getAnnouncementBanner$1 = (InHouseIMUtilityImpl$getAnnouncementBanner$1) continuation;
            int i = inHouseIMUtilityImpl$getAnnouncementBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$getAnnouncementBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$getAnnouncementBanner$1 = new InHouseIMUtilityImpl$getAnnouncementBanner$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = inHouseIMUtilityImpl$getAnnouncementBanner$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$getAnnouncementBanner$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            inHouseIMUtilityImpl$getAnnouncementBanner$1.label = 1;
            objAEQbTJ = AEQbTJ(inHouseIMUtilityImpl$getAnnouncementBanner$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        AnnouncementBanner announcementBanner = (AnnouncementBanner) objAEQbTJ;
        if (announcementBanner != null) {
            if (C33129mqd.valueOf(announcementBanner.getUpdateTime()) > SPUtils.getLong("cancelled_banner_update_time", 0L).longValue() && announcementBanner.getContent() != null) {
                return announcementBanner;
            }
            C44124sEe.imLogConversation$default("This announcement banner is already cancelled by user", null, 2, null);
        }
        return null;
    }

    @Override // o.sNF
    public void copydefault(@NotNull AnnouncementBanner announcementBanner) {
        Intrinsics.checkNotNullParameter(announcementBanner, "");
        java.lang.String updateTime = announcementBanner.getUpdateTime();
        if (updateTime != null) {
            SPUtils.put("cancelled_banner_update_time", java.lang.Long.valueOf(C33129mqd.valueOf(updateTime)));
        }
    }

    @Override // o.sNF
    public boolean EZpvd(@NotNull AnnouncementBanner announcementBanner) {
        Intrinsics.checkNotNullParameter(announcementBanner, "");
        java.lang.Long l = SPUtils.getLong("cancelled_banner_update_time", 0L);
        return l != null && l.longValue() == C33129mqd.valueOf(announcementBanner.getUpdateTime());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super QRCodeResultInfo> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$getQRCodeResult$1 inHouseIMUtilityImpl$getQRCodeResult$1;
        QRCodeResultInfo qRCodeResultInfoOLrzqt;
        if (continuation instanceof InHouseIMUtilityImpl$getQRCodeResult$1) {
            inHouseIMUtilityImpl$getQRCodeResult$1 = (InHouseIMUtilityImpl$getQRCodeResult$1) continuation;
            int i = inHouseIMUtilityImpl$getQRCodeResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$getQRCodeResult$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$getQRCodeResult$1 = new InHouseIMUtilityImpl$getQRCodeResult$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = inHouseIMUtilityImpl$getQRCodeResult$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$getQRCodeResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.copydefault.AEQbTJ();
            ScanQRCodeRequestBody scanQRCodeRequestBody = new ScanQRCodeRequestBody(str);
            inHouseIMUtilityImpl$getQRCodeResult$1.label = 1;
            objCopydefault = interfaceC44178sGeAEQbTJ.copydefault(scanQRCodeRequestBody, inHouseIMUtilityImpl$getQRCodeResult$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        InhouseIMQueryQRCodeScanResponse inhouseIMQueryQRCodeScanResponse = (InhouseIMQueryQRCodeScanResponse) objCopydefault;
        if (inhouseIMQueryQRCodeScanResponse == null || (qRCodeResultInfoOLrzqt = sSM.AEQbTJ.OLrzqt(inhouseIMQueryQRCodeScanResponse)) == null) {
            throw new OKIMException("Get QR code scan result fail", -1);
        }
        return qRCodeResultInfoOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super QRCodeResultInfo> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$getQRCodeResultV2$1 inHouseIMUtilityImpl$getQRCodeResultV2$1;
        QRCodeResultInfo qRCodeResultInfoOLrzqt;
        if (continuation instanceof InHouseIMUtilityImpl$getQRCodeResultV2$1) {
            inHouseIMUtilityImpl$getQRCodeResultV2$1 = (InHouseIMUtilityImpl$getQRCodeResultV2$1) continuation;
            int i = inHouseIMUtilityImpl$getQRCodeResultV2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$getQRCodeResultV2$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$getQRCodeResultV2$1 = new InHouseIMUtilityImpl$getQRCodeResultV2$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = inHouseIMUtilityImpl$getQRCodeResultV2$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$getQRCodeResultV2$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.copydefault.AEQbTJ();
            ScanQRCodeRequestBody scanQRCodeRequestBody = new ScanQRCodeRequestBody(str);
            inHouseIMUtilityImpl$getQRCodeResultV2$1.label = 1;
            objKWHzl = interfaceC44178sGeAEQbTJ.KWHzl(scanQRCodeRequestBody, inHouseIMUtilityImpl$getQRCodeResultV2$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        InhouseIMQueryQRCodeScanResponse inhouseIMQueryQRCodeScanResponse = (InhouseIMQueryQRCodeScanResponse) objKWHzl;
        if (inhouseIMQueryQRCodeScanResponse == null || (qRCodeResultInfoOLrzqt = sSM.AEQbTJ.OLrzqt(inhouseIMQueryQRCodeScanResponse)) == null) {
            throw new OKIMException("Get QR code scan result fail", -1);
        }
        return qRCodeResultInfoOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$getIMQrCode$1 inHouseIMUtilityImpl$getIMQrCode$1;
        java.lang.String qrcode;
        if (continuation instanceof InHouseIMUtilityImpl$getIMQrCode$1) {
            inHouseIMUtilityImpl$getIMQrCode$1 = (InHouseIMUtilityImpl$getIMQrCode$1) continuation;
            int i = inHouseIMUtilityImpl$getIMQrCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$getIMQrCode$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$getIMQrCode$1 = new InHouseIMUtilityImpl$getIMQrCode$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = inHouseIMUtilityImpl$getIMQrCode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$getIMQrCode$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.copydefault.AEQbTJ();
            inHouseIMUtilityImpl$getIMQrCode$1.label = 1;
            objAEQbTJ = interfaceC44178sGeAEQbTJ.AEQbTJ(inHouseIMUtilityImpl$getIMQrCode$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        InhouseIMQueryMyQRCodeResponse inhouseIMQueryMyQRCodeResponse = (InhouseIMQueryMyQRCodeResponse) objAEQbTJ;
        return (inhouseIMQueryMyQRCodeResponse == null || (qrcode = sSM.AEQbTJ.KWHzl(inhouseIMQueryMyQRCodeResponse).getQrcode()) == null) ? "" : qrcode;
    }

    public java.lang.Object EZpvd(@NotNull OKConversation oKConversation, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.OLrzqt().copydefault(C33129mqd.gEmmrt(oKConversation.getTargetId()), z, continuation);
    }

    public java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.OLrzqt().AEQbTJ(str, z, z2, continuation);
    }

    public java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.OLrzqt().OLrzqt(str, z, z2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull OKConversation oKConversation, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$getConversationTextDraftOnChannel$1 inHouseIMUtilityImpl$getConversationTextDraftOnChannel$1;
        DraftMessageModel draftMessage;
        java.lang.String message;
        if (continuation instanceof InHouseIMUtilityImpl$getConversationTextDraftOnChannel$1) {
            inHouseIMUtilityImpl$getConversationTextDraftOnChannel$1 = (InHouseIMUtilityImpl$getConversationTextDraftOnChannel$1) continuation;
            int i = inHouseIMUtilityImpl$getConversationTextDraftOnChannel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$getConversationTextDraftOnChannel$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$getConversationTextDraftOnChannel$1 = new InHouseIMUtilityImpl$getConversationTextDraftOnChannel$1(this, continuation);
            }
        }
        InHouseIMUtilityImpl$getConversationTextDraftOnChannel$1 inHouseIMUtilityImpl$getConversationTextDraftOnChannel$12 = inHouseIMUtilityImpl$getConversationTextDraftOnChannel$1;
        java.lang.Object andSaveSingleConversation$default = inHouseIMUtilityImpl$getConversationTextDraftOnChannel$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$getConversationTextDraftOnChannel$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(andSaveSingleConversation$default);
            sGI sgiOLrzqt = this.copydefault.OLrzqt();
            java.lang.String targetId = oKConversation.getTargetId();
            inHouseIMUtilityImpl$getConversationTextDraftOnChannel$12.label = 1;
            andSaveSingleConversation$default = sGI.TaskDescription.getAndSaveSingleConversation$default(sgiOLrzqt, targetId, false, inHouseIMUtilityImpl$getConversationTextDraftOnChannel$12, 2, null);
            if (andSaveSingleConversation$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(andSaveSingleConversation$default);
        }
        InHouseIMConversationListData inHouseIMConversationListData = (InHouseIMConversationListData) andSaveSingleConversation$default;
        return (inHouseIMConversationListData == null || (draftMessage = inHouseIMConversationListData.getDraftMessage()) == null || (message = draftMessage.getMessage()) == null) ? "" : message;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull OKConversation oKConversation, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1 inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1;
        sEA sea;
        DraftMessageModel draftMessage;
        java.lang.String quotedMessageId;
        if (continuation instanceof InHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1) {
            inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1 = (InHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1) continuation;
            int i = inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1 = new InHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            sGI sgiOLrzqt = this.copydefault.OLrzqt();
            java.lang.String targetId = oKConversation.getTargetId();
            inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.L$0 = this;
            inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.L$1 = oKConversation;
            inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.label = 1;
            if (sGI.TaskDescription.getAndSaveSingleConversation$default(sgiOLrzqt, targetId, false, inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1, 2, null) == objCopydefault) {
                return objCopydefault;
            }
            sea = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                InHouseIMConversationEntity inHouseIMConversationEntity = (InHouseIMConversationEntity) objKWHzl;
                return (inHouseIMConversationEntity != null || (draftMessage = inHouseIMConversationEntity.getDraftMessage()) == null || (quotedMessageId = draftMessage.getQuotedMessageId()) == null) ? "" : quotedMessageId;
            }
            oKConversation = (OKConversation) inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.L$1;
            sea = (sEA) inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        sGI sgiOLrzqt2 = sea.copydefault.OLrzqt();
        java.lang.String targetId2 = oKConversation.getTargetId();
        inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.L$0 = null;
        inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.L$1 = null;
        inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1.label = 2;
        objKWHzl = sgiOLrzqt2.KWHzl(targetId2, inHouseIMUtilityImpl$getReferenceSequenceDraftOnChannel$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        InHouseIMConversationEntity inHouseIMConversationEntity2 = (InHouseIMConversationEntity) objKWHzl;
        if (inHouseIMConversationEntity2 != null) {
        }
    }

    @Override // o.sNF
    public Flow<java.lang.Integer> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.OLrzqt().copydefault(str);
    }

    @Override // o.sNF
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return this.copydefault.OLrzqt().OLrzqt(str, continuation);
    }

    @Override // o.sNF
    public Flow<java.lang.Integer> copydefault(boolean z) {
        ReceiveMessageOptionType receiveMessageOptionType;
        sGI sgiOLrzqt = this.copydefault.OLrzqt();
        if (z) {
            receiveMessageOptionType = ReceiveMessageOptionType.RECEIVE_SILENTLY;
        } else {
            receiveMessageOptionType = ReceiveMessageOptionType.RECEIVE;
        }
        return FlowKt.onEach(sgiOLrzqt.copydefault(receiveMessageOptionType), new InHouseIMUtilityImpl$getTotalUnreadCountFlow$1(null));
    }

    @Override // o.sNF
    public Flow<java.lang.Integer> EZpvd(boolean z, @NotNull java.util.List<? extends InHouseIMChannelType> list) {
        ReceiveMessageOptionType receiveMessageOptionType;
        Intrinsics.checkNotNullParameter(list, "");
        sGI sgiOLrzqt = this.copydefault.OLrzqt();
        if (z) {
            receiveMessageOptionType = ReceiveMessageOptionType.RECEIVE_SILENTLY;
        } else {
            receiveMessageOptionType = ReceiveMessageOptionType.RECEIVE;
        }
        return FlowKt.onEach(sgiOLrzqt.KWHzl(receiveMessageOptionType, list), new InHouseIMUtilityImpl$getTotalUnreadCountByChannelTypeFlow$1(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$getTotalUnreadCount$1 inHouseIMUtilityImpl$getTotalUnreadCount$1;
        ReceiveMessageOptionType receiveMessageOptionType;
        if (continuation instanceof InHouseIMUtilityImpl$getTotalUnreadCount$1) {
            inHouseIMUtilityImpl$getTotalUnreadCount$1 = (InHouseIMUtilityImpl$getTotalUnreadCount$1) continuation;
            int i = inHouseIMUtilityImpl$getTotalUnreadCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$getTotalUnreadCount$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$getTotalUnreadCount$1 = new InHouseIMUtilityImpl$getTotalUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = inHouseIMUtilityImpl$getTotalUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$getTotalUnreadCount$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            sGI sgiOLrzqt = this.copydefault.OLrzqt();
            if (z) {
                receiveMessageOptionType = ReceiveMessageOptionType.RECEIVE_SILENTLY;
            } else {
                receiveMessageOptionType = ReceiveMessageOptionType.RECEIVE;
            }
            inHouseIMUtilityImpl$getTotalUnreadCount$1.label = 1;
            objOLrzqt = sgiOLrzqt.OLrzqt(receiveMessageOptionType, inHouseIMUtilityImpl$getTotalUnreadCount$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        int iIntValue = ((java.lang.Number) objOLrzqt).intValue();
        C43296rmc.AEQbTJ("InHouseUtilityImpl", "getTotalUnreadCount => unreadCount=" + iIntValue);
        return C56443yFo.AEQbTJ(iIntValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AYXKKw(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$markConversationRead$1 inHouseIMUtilityImpl$markConversationRead$1;
        if (continuation instanceof InHouseIMUtilityImpl$markConversationRead$1) {
            inHouseIMUtilityImpl$markConversationRead$1 = (InHouseIMUtilityImpl$markConversationRead$1) continuation;
            int i = inHouseIMUtilityImpl$markConversationRead$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$markConversationRead$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$markConversationRead$1 = new InHouseIMUtilityImpl$markConversationRead$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMUtilityImpl$markConversationRead$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$markConversationRead$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44301sKt interfaceC44301sKtAkhnZx = this.copydefault.AkhnZx();
            inHouseIMUtilityImpl$markConversationRead$1.label = 1;
            if (interfaceC44301sKtAkhnZx.OLrzqt(str, inHouseIMUtilityImpl$markConversationRead$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        InHouseIMUtilityImpl$markConversationMessagesRead$1 inHouseIMUtilityImpl$markConversationMessagesRead$1;
        if (continuation instanceof InHouseIMUtilityImpl$markConversationMessagesRead$1) {
            inHouseIMUtilityImpl$markConversationMessagesRead$1 = (InHouseIMUtilityImpl$markConversationMessagesRead$1) continuation;
            int i = inHouseIMUtilityImpl$markConversationMessagesRead$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMUtilityImpl$markConversationMessagesRead$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMUtilityImpl$markConversationMessagesRead$1 = new InHouseIMUtilityImpl$markConversationMessagesRead$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMUtilityImpl$markConversationMessagesRead$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMUtilityImpl$markConversationMessagesRead$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44301sKt interfaceC44301sKtAkhnZx = this.copydefault.AkhnZx();
            inHouseIMUtilityImpl$markConversationMessagesRead$1.label = 1;
            if (interfaceC44301sKtAkhnZx.copydefault(str, inHouseIMUtilityImpl$markConversationMessagesRead$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(true);
    }

    @Override // o.sNF
    public void AEQbTJ(@NotNull java.lang.String str, InterfaceC44197sGx interfaceC44197sGx) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, this.EZpvd, null, new InHouseIMUtilityImpl$joinLiveStream$1(this, str, interfaceC44197sGx, null), 2, null);
    }

    @Override // o.sNF
    public void copydefault(@NotNull java.lang.String str, sGC sgc) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, this.EZpvd, null, new InHouseIMUtilityImpl$leaveLiveStream$1(this, str, sgc, null), 2, null);
    }

    @Override // o.sNF
    public java.lang.Object gEmmrt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.OLrzqt().gEmmrt(str, continuation);
    }

    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AnnouncementBanner> continuation) {
        return this.copydefault.OLrzqt().EZpvd(continuation);
    }

    @Override // o.sNF
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.AkhnZx().KWHzl(continuation);
    }

    @Override // o.sNF
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = this.copydefault.AkhnZx().KWHzl(str, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    @Override // o.sNF
    public Flow<java.lang.Integer> KWHzl() {
        return this.copydefault.OLrzqt().copydefault();
    }

    @Override // o.sNF
    public Flow<java.lang.Integer> AEQbTJ() {
        return this.copydefault.OLrzqt().EZpvd();
    }

    @Override // o.sNF
    public Flow<java.lang.Integer> copydefault() {
        return this.copydefault.OLrzqt().gEmmrt();
    }

    @Override // o.sNF
    public java.lang.Object AhwBna(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation) {
        return this.copydefault.OLrzqt().AhwBna(str, continuation);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sEA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
