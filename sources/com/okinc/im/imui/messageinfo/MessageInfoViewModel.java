package com.okinc.im.imui.messageinfo;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.message.MessageClusterType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.remote.MessageReadInfo;
import com.okinc.okimcore.model.remote.ReadUser;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C34282nYe;
import o.C35254nrp;
import o.C35805oEi;
import o.C35806oEj;
import o.C35807oEk;
import o.C44157sFk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.oDI;
import o.oDQ;
import o.oGH;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageInfoViewModel extends ViewModel {
    public final C35805oEi AEQbTJ;
    public final StateFlow<Application> AYXKKw;
    public final StateFlow<Boolean> AhwBna;
    public final Set<Integer> AkhnZx;
    public final MutableStateFlow<Application> EZpvd;
    public final C35807oEk KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final oGH copydefault;
    public final oDI djBIcL;
    public Job gEmmrt;
    public final C35806oEj valueOf;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.AhwBna;
    }

    @yCM
    public MessageInfoViewModel(@NotNull C35806oEj c35806oEj, @NotNull C35805oEi c35805oEi, @NotNull oGH ogh, @NotNull C35807oEk c35807oEk, @NotNull oDI odi) {
        Intrinsics.checkNotNullParameter(c35806oEj, "");
        Intrinsics.checkNotNullParameter(c35805oEi, "");
        Intrinsics.checkNotNullParameter(ogh, "");
        Intrinsics.checkNotNullParameter(c35807oEk, "");
        Intrinsics.checkNotNullParameter(odi, "");
        this.valueOf = c35806oEj;
        this.AEQbTJ = c35805oEi;
        this.copydefault = ogh;
        this.KWHzl = c35807oEk;
        this.djBIcL = odi;
        MutableStateFlow<Application> MutableStateFlow = StateFlowKt.MutableStateFlow(new Application(false, null, null, 0L, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null));
        this.EZpvd = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        this.AkhnZx = yEE.AhwBna(Integer.valueOf(GroupTagType.VIP_CHAT_GROUP.getValue()), Integer.valueOf(GroupTagType.RM_VIP_GROUP.getValue()));
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.OLrzqt = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public static final class Application {
        public final Throwable AEQbTJ;
        public final C35254nrp AYXKKw;
        public final MessageReadInfo AhwBna;
        public final OKMessage EZpvd;
        public final OKConversationType KWHzl;
        public final boolean OLrzqt;
        public final String copydefault;
        public final long djBIcL;
        public final List<C34282nYe> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(false, null, null, 0L, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.okinc.im.imui.messageinfo.MessageInfoViewModel$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, boolean z, String str, OKConversationType oKConversationType, long j, OKMessage oKMessage, C35254nrp c35254nrp, MessageReadInfo messageReadInfo, List list, Throwable th, int i, Object obj) {
            return application.EZpvd((i & 1) != 0 ? application.OLrzqt : z, (i & 2) != 0 ? application.copydefault : str, (i & 4) != 0 ? application.KWHzl : oKConversationType, (i & 8) != 0 ? application.djBIcL : j, (i & 16) != 0 ? application.EZpvd : oKMessage, (i & 32) != 0 ? application.AYXKKw : c35254nrp, (i & 64) != 0 ? application.AhwBna : messageReadInfo, (i & 128) != 0 ? application.gEmmrt : list, (i & 256) != 0 ? application.AEQbTJ : th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35254nrp AEQbTJ() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(boolean z, @NotNull String str, @NotNull OKConversationType oKConversationType, long j, OKMessage oKMessage, C35254nrp c35254nrp, MessageReadInfo messageReadInfo, @NotNull List<C34282nYe> list, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKConversationType, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(z, str, oKConversationType, j, oKMessage, c35254nrp, messageReadInfo, list, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<C34282nYe> EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversationType OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MessageReadInfo copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && this.KWHzl == application.KWHzl && this.djBIcL == application.djBIcL && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, application.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, application.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, application.gEmmrt) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.OLrzqt);
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            int iHashCode4 = Long.hashCode(this.djBIcL);
            OKMessage oKMessage = this.EZpvd;
            int iHashCode5 = oKMessage == null ? 0 : oKMessage.hashCode();
            C35254nrp c35254nrp = this.AYXKKw;
            int iHashCode6 = c35254nrp == null ? 0 : c35254nrp.hashCode();
            MessageReadInfo messageReadInfo = this.AhwBna;
            int iHashCode7 = messageReadInfo == null ? 0 : messageReadInfo.hashCode();
            int iHashCode8 = this.gEmmrt.hashCode();
            Throwable th = this.AEQbTJ;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (th != null ? th.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiState(isLoading=" + this.OLrzqt + ", channelId=" + this.copydefault + ", conversationType=" + this.KWHzl + ", messageSeq=" + this.djBIcL + ", message=" + this.EZpvd + ", uiMessage=" + this.AYXKKw + ", messageReadInfo=" + this.AhwBna + ", readUsers=" + this.gEmmrt + ", error=" + this.AEQbTJ + ")";
        }

        public Application(boolean z, @NotNull String str, @NotNull OKConversationType oKConversationType, long j, OKMessage oKMessage, C35254nrp c35254nrp, MessageReadInfo messageReadInfo, @NotNull List<C34282nYe> list, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKConversationType, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = z;
            this.copydefault = str;
            this.KWHzl = oKConversationType;
            this.djBIcL = j;
            this.EZpvd = oKMessage;
            this.AYXKKw = c35254nrp;
            this.AhwBna = messageReadInfo;
            this.gEmmrt = list;
            this.AEQbTJ = th;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005c: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.OKConversationType:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: SGET  A[WRAPPED] (LINE:49) com.okinc.okimcore.model.im.OKConversationType.NONE com.okinc.okimcore.model.im.OKConversationType) : (r14v0 com.okinc.okimcore.model.im.OKConversationType))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r15v0 long))
  (wrap:com.okinc.okimcore.model.im.OKMessage:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKMessage) : (r17v0 com.okinc.okimcore.model.im.OKMessage))
  (wrap:o.nrp:?: TERNARY null = ((wrap:int:0x002a: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.nrp) : (r18v0 o.nrp))
  (wrap:com.okinc.okimcore.model.remote.MessageReadInfo:?: TERNARY null = ((wrap:int:0x0032: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.MessageReadInfo) : (r19v0 com.okinc.okimcore.model.remote.MessageReadInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003a: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:54)) : (r20v0 java.util.List))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0045: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Throwable) : (null java.lang.Throwable))
 A[MD:(boolean, java.lang.String, com.okinc.okimcore.model.im.OKConversationType, long, com.okinc.okimcore.model.im.OKMessage, o.nrp, com.okinc.okimcore.model.remote.MessageReadInfo, java.util.List<o.nYe>, java.lang.Throwable):void (m)] (LINE:46) call: com.okinc.im.imui.messageinfo.MessageInfoViewModel.Application.<init>(boolean, java.lang.String, com.okinc.okimcore.model.im.OKConversationType, long, com.okinc.okimcore.model.im.OKMessage, o.nrp, com.okinc.okimcore.model.remote.MessageReadInfo, java.util.List, java.lang.Throwable):void type: THIS */
        public /* synthetic */ Application(boolean z, String str, OKConversationType oKConversationType, long j, OKMessage oKMessage, C35254nrp c35254nrp, MessageReadInfo messageReadInfo, List list, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? OKConversationType.NONE : oKConversationType, (i & 8) != 0 ? -1L : j, (i & 16) != 0 ? null : oKMessage, (i & 32) != 0 ? null : c35254nrp, (i & 64) != 0 ? null : messageReadInfo, (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) == 0 ? th : null);
        }
    }

    public static /* synthetic */ void load$default(MessageInfoViewModel messageInfoViewModel, String str, long j, MessageClusterType messageClusterType, int i, Object obj) {
        if ((i & 4) != 0) {
            messageClusterType = null;
        }
        messageInfoViewModel.AEQbTJ(str, j, messageClusterType);
    }

    public final void AEQbTJ(@NotNull String str, long j, MessageClusterType messageClusterType) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((CharSequence) str) || j <= 0) {
            this.EZpvd.setValue(new Application(false, str, null, j, null, null, null, null, new IllegalArgumentException("Invalid channelId/messageSeq"), 228, null));
            return;
        }
        this.EZpvd.setValue(new Application(true, str, null, j, null, null, null, null, null, 500, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageInfoViewModel$load$1(this, str, j, messageClusterType, null), 3, null);
    }

    public final Object copydefault(String str, long j, Continuation<? super Pair<OKConversation, OKMessage>> continuation) {
        return SupervisorKt.supervisorScope(new MessageInfoViewModel$fetchConversationAndMessage$2(str, this, j, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, long j, Continuation<? super OKMessage> continuation) throws Throwable {
        MessageInfoViewModel$fetchMessage$1 messageInfoViewModel$fetchMessage$1;
        Object objM7377constructorimpl;
        MessageInfoViewModel messageInfoViewModel;
        Object objM7377constructorimpl2;
        if (continuation instanceof MessageInfoViewModel$fetchMessage$1) {
            messageInfoViewModel$fetchMessage$1 = (MessageInfoViewModel$fetchMessage$1) continuation;
            int i = messageInfoViewModel$fetchMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageInfoViewModel$fetchMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messageInfoViewModel$fetchMessage$1 = new MessageInfoViewModel$fetchMessage$1(this, continuation);
            }
        }
        Object objOLrzqt = messageInfoViewModel$fetchMessage$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageInfoViewModel$fetchMessage$1.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            try {
                Result.Application application2 = Result.Companion;
                C35805oEi c35805oEi = this.AEQbTJ;
                messageInfoViewModel$fetchMessage$1.L$0 = this;
                messageInfoViewModel$fetchMessage$1.L$1 = str;
                messageInfoViewModel$fetchMessage$1.J$0 = j;
                messageInfoViewModel$fetchMessage$1.label = 1;
                objOLrzqt = c35805oEi.OLrzqt(str, j, messageInfoViewModel$fetchMessage$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                messageInfoViewModel = this;
            } catch (Throwable th2) {
                th = th2;
                messageInfoViewModel = this;
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) objOLrzqt);
                return (OKMessage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
            j = messageInfoViewModel$fetchMessage$1.J$0;
            str = (String) messageInfoViewModel$fetchMessage$1.L$1;
            messageInfoViewModel = (MessageInfoViewModel) messageInfoViewModel$fetchMessage$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
            } catch (Throwable th3) {
                th = th3;
                Result.Application application32 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl2 = Result.m7377constructorimpl((OKMessage) objOLrzqt);
        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
            objM7377constructorimpl2 = null;
        }
        OKMessage oKMessage = (OKMessage) objM7377constructorimpl2;
        if (oKMessage != null) {
            return oKMessage;
        }
        Result.Application application4 = Result.Companion;
        C35806oEj c35806oEj = messageInfoViewModel.valueOf;
        messageInfoViewModel$fetchMessage$1.L$0 = null;
        messageInfoViewModel$fetchMessage$1.L$1 = null;
        messageInfoViewModel$fetchMessage$1.label = 2;
        objOLrzqt = c35806oEj.OLrzqt(str, j, messageInfoViewModel$fetchMessage$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) objOLrzqt);
        return (OKMessage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final OKConversationType copydefault(OKConversation oKConversation, OKMessage oKMessage) {
        OKConversationType conversationType;
        return (oKConversation == null || (conversationType = oKConversation.getConversationType()) == null) ? oKMessage != null ? oKMessage.getConversationType() : OKConversationType.NONE : conversationType;
    }

    public final void KWHzl(CoroutineScope coroutineScope, OKConversationType oKConversationType, String str) {
        Job job = this.gEmmrt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (oKConversationType == OKConversationType.GROUP) {
            this.gEmmrt = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MessageInfoViewModel$updateVipGroupObservation$1(this, str, null), 3, null);
        } else {
            this.OLrzqt.setValue(Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(OKMessage oKMessage, MessageClusterType messageClusterType, Continuation<? super C35254nrp> continuation) throws Throwable {
        MessageInfoViewModel$buildPreviewUiMessage$1 messageInfoViewModel$buildPreviewUiMessage$1;
        Object objM7377constructorimpl;
        MessageClusterType messageClusterType2;
        C35254nrp c35254nrpCopydefault;
        if (continuation instanceof MessageInfoViewModel$buildPreviewUiMessage$1) {
            messageInfoViewModel$buildPreviewUiMessage$1 = (MessageInfoViewModel$buildPreviewUiMessage$1) continuation;
            int i = messageInfoViewModel$buildPreviewUiMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageInfoViewModel$buildPreviewUiMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messageInfoViewModel$buildPreviewUiMessage$1 = new MessageInfoViewModel$buildPreviewUiMessage$1(this, continuation);
            }
        }
        MessageInfoViewModel$buildPreviewUiMessage$1 messageInfoViewModel$buildPreviewUiMessage$12 = messageInfoViewModel$buildPreviewUiMessage$1;
        Object obj = messageInfoViewModel$buildPreviewUiMessage$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageInfoViewModel$buildPreviewUiMessage$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (oKMessage == null) {
                    return null;
                }
                Result.Application application = Result.Companion;
                oGH ogh = this.copydefault;
                List listEZpvd = C56402yEa.EZpvd(oKMessage);
                Boolean boolKWHzl = C56443yFo.KWHzl(false);
                messageInfoViewModel$buildPreviewUiMessage$12.L$0 = messageClusterType;
                messageInfoViewModel$buildPreviewUiMessage$12.label = 1;
                Object objEZpvd = ogh.EZpvd(oKMessage, (256 & 2) != 0 ? yDY.AhwBna() : listEZpvd, (256 & 4) != 0 ? null : null, (256 & 8) != 0 ? null : null, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : null, (256 & 64) != 0 ? null : null, (256 & 128) != 0 ? 0 : null, (256 & 256) != 0 ? null : boolKWHzl, messageInfoViewModel$buildPreviewUiMessage$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                messageClusterType2 = messageClusterType;
                obj = objEZpvd;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MessageClusterType messageClusterType3 = (MessageClusterType) messageInfoViewModel$buildPreviewUiMessage$12.L$0;
                C56391yDq.AEQbTJ(obj);
                messageClusterType2 = messageClusterType3;
            }
            C35254nrp c35254nrp = (C35254nrp) obj;
            if (messageClusterType2 != null && (c35254nrpCopydefault = c35254nrp.copydefault((CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1) != 0 ? c35254nrp.AYXKKw : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2) != 0 ? c35254nrp.AEQbTJ : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4) != 0 ? c35254nrp.values : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8) != 0 ? c35254nrp.AhwBna : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16) != 0 ? c35254nrp.valueOf : messageClusterType2, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32) != 0 ? c35254nrp.djBIcL : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 64) != 0 ? c35254nrp.KWHzl : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 128) != 0 ? c35254nrp.copydefault : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 256) != 0 ? c35254nrp.OLrzqt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 512) != 0 ? c35254nrp.fJNWhG : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1024) != 0 ? c35254nrp.AuCTel : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2048) != 0 ? c35254nrp.isConnected : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4096) != 0 ? c35254nrp.AkhnZx : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8192) != 0 ? c35254nrp.DbNXlk : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16384) != 0 ? c35254nrp.fARcdN : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32768) != 0 ? c35254nrp.gEmmrt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 65536) != 0 ? c35254nrp.fetchVPNInfo : 0)) != null) {
                c35254nrp = c35254nrpCopydefault;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(c35254nrp);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }

    public final void EZpvd(String str, long j, OKConversationType oKConversationType, OKMessage oKMessage, C35254nrp c35254nrp) {
        MutableStateFlow<Application> mutableStateFlow = this.EZpvd;
        mutableStateFlow.setValue(Application.copy$default(mutableStateFlow.getValue(), false, str, oKConversationType, j, oKMessage, c35254nrp, null, null, oKMessage == null ? new IllegalStateException("Message not found") : null, 192, null));
    }

    public final Object AEQbTJ(OKConversationType oKConversationType, String str, long j, OKConversation oKConversation, OKMessage oKMessage, Continuation<? super Unit> continuation) throws Throwable {
        int i = StateListAnimator.EZpvd[oKConversationType.ordinal()];
        if (i == 1) {
            Object objEZpvd = EZpvd(str, j, continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }
        if (i == 2) {
            copydefault(str, oKConversation, oKMessage);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, long j, Continuation<? super Unit> continuation) throws Throwable {
        MessageInfoViewModel$loadGroupReadStatus$1 messageInfoViewModel$loadGroupReadStatus$1;
        String str2;
        MessageInfoViewModel messageInfoViewModel;
        C35807oEk c35807oEk;
        Object objM7377constructorimpl;
        ResponseData responseData;
        MessageReadInfo messageReadInfo;
        MessageInfoViewModel messageInfoViewModel2;
        if (continuation instanceof MessageInfoViewModel$loadGroupReadStatus$1) {
            messageInfoViewModel$loadGroupReadStatus$1 = (MessageInfoViewModel$loadGroupReadStatus$1) continuation;
            int i = messageInfoViewModel$loadGroupReadStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageInfoViewModel$loadGroupReadStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                messageInfoViewModel$loadGroupReadStatus$1 = new MessageInfoViewModel$loadGroupReadStatus$1(this, continuation);
            }
        }
        Object objEZpvd = messageInfoViewModel$loadGroupReadStatus$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageInfoViewModel$loadGroupReadStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str);
            if (fieldNames == null) {
                return Unit.INSTANCE;
            }
            long jLongValue = fieldNames.longValue();
            try {
                Result.Application application = Result.Companion;
                c35807oEk = this.KWHzl;
                messageInfoViewModel$loadGroupReadStatus$1.L$0 = this;
                str2 = str;
            } catch (Throwable th) {
                th = th;
                str2 = str;
            }
            try {
                messageInfoViewModel$loadGroupReadStatus$1.L$1 = str2;
                messageInfoViewModel$loadGroupReadStatus$1.label = 1;
                objEZpvd = c35807oEk.EZpvd(jLongValue, j, messageInfoViewModel$loadGroupReadStatus$1);
            } catch (Throwable th2) {
                th = th2;
                messageInfoViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                responseData = (ResponseData) objM7377constructorimpl;
                if (responseData != null) {
                }
                return Unit.INSTANCE;
            }
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            messageInfoViewModel = this;
            objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) objEZpvd);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
            responseData = (ResponseData) objM7377constructorimpl;
            if (responseData != null) {
            }
            return Unit.INSTANCE;
        }
        if (i2 == 1) {
            String str3 = (String) messageInfoViewModel$loadGroupReadStatus$1.L$1;
            messageInfoViewModel = (MessageInfoViewModel) messageInfoViewModel$loadGroupReadStatus$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                str2 = str3;
            } catch (Throwable th3) {
                th = th3;
                str2 = str3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                responseData = (ResponseData) objM7377constructorimpl;
                if (responseData != null) {
                }
                return Unit.INSTANCE;
            }
            try {
                objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) objEZpvd);
            } catch (Throwable th4) {
                th = th4;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            responseData = (ResponseData) objM7377constructorimpl;
            if (responseData != null || (messageReadInfo = (MessageReadInfo) responseData.getData()) == null) {
                return Unit.INSTANCE;
            }
            MutableStateFlow<Application> mutableStateFlow = messageInfoViewModel.EZpvd;
            mutableStateFlow.setValue(Application.copy$default(mutableStateFlow.getValue(), false, null, null, 0L, null, null, messageReadInfo, null, null, 447, null));
            List<ReadUser> userUidList = messageReadInfo.getUserUidList();
            if (userUidList == null) {
                userUidList = yDY.AhwBna();
            }
            messageInfoViewModel$loadGroupReadStatus$1.L$0 = messageInfoViewModel;
            messageInfoViewModel$loadGroupReadStatus$1.L$1 = null;
            messageInfoViewModel$loadGroupReadStatus$1.label = 2;
            objEZpvd = messageInfoViewModel.OLrzqt(str2, userUidList, messageInfoViewModel$loadGroupReadStatus$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            messageInfoViewModel2 = messageInfoViewModel;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            messageInfoViewModel2 = (MessageInfoViewModel) messageInfoViewModel$loadGroupReadStatus$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        List list = (List) objEZpvd;
        MutableStateFlow<Application> mutableStateFlow2 = messageInfoViewModel2.EZpvd;
        mutableStateFlow2.setValue(Application.copy$default(mutableStateFlow2.getValue(), false, null, null, 0L, null, null, null, list, null, 383, null));
        return Unit.INSTANCE;
    }

    public final void copydefault(String str, OKConversation oKConversation, OKMessage oKMessage) {
        List<C34282nYe> listEZpvd = EZpvd(str, oKConversation, oKMessage);
        MutableStateFlow<Application> mutableStateFlow = this.EZpvd;
        mutableStateFlow.setValue(Application.copy$default(mutableStateFlow.getValue(), false, null, null, 0L, null, null, null, listEZpvd, null, 383, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C34282nYe> EZpvd(String str, OKConversation oKConversation, OKMessage oKMessage) {
        boolean z;
        String contactId;
        String str2;
        String strKWHzl = C44157sFk.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        if ((oKMessage != null ? oKMessage.getMessageDirection() : null) != OKMessage.MessageDirection.SEND) {
            z = false;
        } else {
            String senderUserId = oKMessage.getSenderUserId();
            if (senderUserId == null) {
                senderUserId = "";
            }
            if (Intrinsics.EZpvd((Object) senderUserId, (Object) strKWHzl)) {
                z = true;
            }
        }
        boolean z2 = (oKMessage != null ? oKMessage.getSentStatus() : null) == OKMessage.SentStatus.READ;
        if (oKConversation == null || (contactId = oKConversation.getContactId()) == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) contactId))) {
            contactId = null;
        }
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) str)) && oKConversation != null && oKMessage != null && z && z2 && contactId != null) {
            String conversationTitle = oKConversation.getConversationTitle();
            if (conversationTitle == null) {
                str2 = contactId == null ? "" : contactId;
            } else {
                String str3 = StringsKt__StringsKt.fARcdN((CharSequence) conversationTitle) ^ true ? conversationTitle : null;
                if (str3 != null) {
                    str2 = str3;
                }
            }
            String str4 = contactId == null ? "" : contactId;
            String portraitUrl = oKConversation.getPortraitUrl();
            return C56402yEa.EZpvd(oDQ.EZpvd(new GroupMemberInfo(str4, str, str2, str2, (String) null, portraitUrl == null ? "" : portraitUrl, false, GroupRole.Unknown, oKConversation.getOfficialTagInfo(), (String) null, (String) null, (String) null, (PaidGroupMemberStatus) null, 1024, (DefaultConstructorMarker) null)));
        }
        return yDY.AhwBna();
    }

    public final Object OLrzqt(String str, List<ReadUser> list, Continuation<? super List<C34282nYe>> continuation) {
        return SupervisorKt.supervisorScope(new MessageInfoViewModel$buildReadUsersDisplayList$2(str, list, null), continuation);
    }
}
