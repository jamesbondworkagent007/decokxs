package o;

import androidx.lifecycle.LiveData;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.okimcore.feature.message.manager.ChannelMessenger$deleteLocalAndRemoteMessage$1;
import com.okinc.okimcore.feature.message.manager.ChannelMessenger$deleteLocalAndRemoteMessage$2;
import com.okinc.okimcore.feature.message.manager.ChannelMessenger$login$1;
import com.okinc.okimcore.feature.message.manager.ChannelMessenger$onChannelConnectionStatusChanged$2;
import com.okinc.okimcore.feature.message.manager.ChannelMessenger$onChannelConnectionStatusChanged$3;
import com.okinc.okimcore.feature.message.manager.ChannelMessenger$onChannelConnectionStatusChanged$4;
import com.okinc.okimcore.feature.message.manager.ChannelMessenger$onChannelConnectionStatusChanged$5;
import com.okinc.okimcore.feature.message.manager.ChannelMessenger$onReceiveMessage$1;
import com.okinc.okimcore.feature.message.manager.ChannelMessenger$recallMessage$1;
import com.okinc.okimcore.model.biz.AbsOKInformationNotificationMessage;
import com.okinc.okimcore.model.biz.GroupMuteInfoNtfMessage;
import com.okinc.okimcore.model.biz.OKBizCustomMessage;
import com.okinc.okimcore.model.im.ChannelConnectionStatus;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.RecallMsgMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.sKH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sKk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC44292sKk implements sKH, InterfaceC44304sKw, sEH {
    public final CoroutineScope AYXKKw;
    public final sGF AkhnZx;
    public final sKD AuCTel;
    public boolean DbNXlk;
    public Job ejfBZ;
    public final java.util.Set<Function1<java.lang.String, Unit>> fARcdN;
    public int fIwbmz;
    public long fetchVPNInfo;
    public boolean isConnected;
    public final sHZ valueOf;
    public android.os.Handler values;

    /* JADX INFO: renamed from: o.sKk$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChannelConnectionStatus.values().length];
            try {
                iArr[ChannelConnectionStatus.Unknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelConnectionStatus.KickedOff.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChannelConnectionStatus.Timeout.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ChannelConnectionStatus.Connected.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public java.lang.Object AEQbTJ(@NotNull OKMessage oKMessage, java.lang.String str, @NotNull Continuation<? super sKH.StateListAnimator> continuation) {
        return OLrzqt(this, oKMessage, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public sHZ AuCTel() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public java.lang.Object EZpvd(@NotNull OKConversation oKConversation, @NotNull OKMessage[] oKMessageArr, @NotNull Continuation<? super sKH.TaskDescription> continuation) {
        return AEQbTJ(this, oKConversation, oKMessageArr, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public java.lang.Object EZpvd(@NotNull OKMessage oKMessage, @NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, oKMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public java.lang.Object KWHzl(@NotNull sNH snh, @NotNull Continuation<? super sNM> continuation) {
        return AEQbTJ(this, snh, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public java.lang.Object KWHzl(@NotNull sNO sno, @NotNull Continuation<? super java.util.List<OKMessage>> continuation) {
        return KWHzl(this, sno, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public java.lang.Object OLrzqt(@NotNull OKMessage oKMessage, java.lang.String str, @NotNull Continuation<? super C44461sQr> continuation) {
        return EZpvd(this, oKMessage, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, boolean z, @NotNull Continuation<? super java.util.List<ReactionDetail>> continuation) {
        return copydefault(this, str, j, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sKD fIwbmz() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void getNewProxyInstance() {
        this.fIwbmz = 0;
        this.fetchVPNInfo = 0L;
        this.values = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sHZ values() {
        return this.valueOf;
    }

    public AbstractC44292sKk(@NotNull sHZ shz, @NotNull sKD skd, @NotNull sGF sgf, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(shz, "");
        Intrinsics.checkNotNullParameter(skd, "");
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.valueOf = shz;
        this.AuCTel = skd;
        this.AkhnZx = sgf;
        this.AYXKKw = coroutineScope;
        this.fARcdN = new LinkedHashSet();
    }

    @Override // o.sKH
    public LiveData<java.lang.String> isConnected() {
        return sKH.Activity.EZpvd(this);
    }

    @Override // o.sEH
    public final void bp_() {
        C44124sEe.imLogCore$default("onUserLogin", null, 2, null);
        C44124sEe.imLogLogin$default("On user login", null, 2, null);
        fJNWhG();
    }

    public final void fJNWhG() {
        if (C44157sFk.gEmmrt().values()) {
            C44196sGw.copydefault.EZpvd();
            Job job = this.ejfBZ;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.ejfBZ = BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, sDN.copydefault.copydefault(), null, new ChannelMessenger$login$1(this, null), 2, null);
            C44124sEe.imLogLogin$default("Login success: Try connect websocket", null, 2, null);
            getNewProxyInstance();
            AEQbTJ();
        }
    }

    @Override // o.sEH
    public final void bq_() {
        C44124sEe.imLogLogin$default("On user logout", null, 2, null);
        AkhnZx();
        this.isConnected = false;
        getNewProxyInstance();
        Job job = this.ejfBZ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public final void fARcdN() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ejfBZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(final OKMessage oKMessage, boolean z, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ChannelMessenger$onReceiveMessage$1 channelMessenger$onReceiveMessage$1;
        AbstractC44292sKk abstractC44292sKk;
        if (continuation instanceof ChannelMessenger$onReceiveMessage$1) {
            channelMessenger$onReceiveMessage$1 = (ChannelMessenger$onReceiveMessage$1) continuation;
            int i = channelMessenger$onReceiveMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                channelMessenger$onReceiveMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                channelMessenger$onReceiveMessage$1 = new ChannelMessenger$onReceiveMessage$1(this, continuation);
            }
        }
        java.lang.Object obj = channelMessenger$onReceiveMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = channelMessenger$onReceiveMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("", "onReceive Message===" + oKMessage);
            if (OKConversationType.GROUP == oKMessage.getConversationType()) {
                OKMessageContent content = oKMessage.getContent();
                if ((content != null ? content.getUserInfo() : null) != null) {
                    this.valueOf.copydefault().OLrzqt(oKMessage);
                }
            }
            if (oKMessage.getContent() != null && (oKMessage.getContent() instanceof OKBizCustomMessage)) {
                copydefault(oKMessage);
            }
            if (!z) {
                channelMessenger$onReceiveMessage$1.L$0 = this;
                channelMessenger$onReceiveMessage$1.L$1 = oKMessage;
                channelMessenger$onReceiveMessage$1.L$2 = str;
                channelMessenger$onReceiveMessage$1.label = 1;
                if (C44170sFx.EZpvd(oKMessage, true, channelMessenger$onReceiveMessage$1) == objCopydefault) {
                    return objCopydefault;
                }
                abstractC44292sKk = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (java.lang.String) channelMessenger$onReceiveMessage$1.L$2;
        oKMessage = (OKMessage) channelMessenger$onReceiveMessage$1.L$1;
        abstractC44292sKk = (AbstractC44292sKk) channelMessenger$onReceiveMessage$1.L$0;
        C56391yDq.AEQbTJ(obj);
        abstractC44292sKk.AuCTel.copydefault(new Function1() { // from class: o.sKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AbstractC44292sKk.EZpvd(oKMessage, (InterfaceC44291sKj) obj2);
            }
        });
        abstractC44292sKk.AuCTel.copydefault(oKMessage);
        sDZ.AEQbTJ.AYXKKw().AEQbTJ(oKMessage.getConversationType(), oKMessage.getTargetId(), oKMessage.getSenderUserId(), str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
        Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
        interfaceC44291sKj.KWHzl(new C44467sQx(oKMessage));
        return Unit.INSTANCE;
    }

    public final void KWHzl(final OKMessage oKMessage) {
        this.AuCTel.copydefault(new Function1() { // from class: o.sKp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC44292sKk.copydefault(oKMessage, (InterfaceC44291sKj) obj);
            }
        });
    }

    public static final Unit copydefault(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
        Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
        interfaceC44291sKj.EZpvd(new C44462sQs(oKMessage));
        return Unit.INSTANCE;
    }

    public final void copydefault(final OKMessage oKMessage, final OKRecallNotificationMessage oKRecallNotificationMessage) {
        pUU.EZpvd("", "onRecall Message===");
        this.AuCTel.copydefault(new Function1() { // from class: o.sKq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC44292sKk.OLrzqt(oKMessage, oKRecallNotificationMessage, (InterfaceC44291sKj) obj);
            }
        });
        this.AkhnZx.AEQbTJ(true);
    }

    public static final Unit OLrzqt(OKMessage oKMessage, OKRecallNotificationMessage oKRecallNotificationMessage, InterfaceC44291sKj interfaceC44291sKj) {
        Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
        interfaceC44291sKj.EZpvd(new C44464sQu(oKMessage, oKRecallNotificationMessage));
        return Unit.INSTANCE;
    }

    public final void EZpvd(final OKMessage oKMessage) {
        this.AuCTel.copydefault(new Function1() { // from class: o.sKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC44292sKk.AYXKKw(oKMessage, (InterfaceC44291sKj) obj);
            }
        });
    }

    public static final Unit AYXKKw(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
        Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
        interfaceC44291sKj.KWHzl(new C44469sQz(oKMessage));
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        sNI.AEQbTJ.KWHzl("im_recall_msg", RecallMsgMessage.class);
        OLrzqt(1, GroupMuteInfoNtfMessage.class);
    }

    public final void KWHzl(java.lang.String str) {
        java.util.Iterator<T> it = this.fARcdN.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(str);
        }
    }

    public final void AEQbTJ(@NotNull final ChannelConnectionStatus channelConnectionStatus) {
        Intrinsics.checkNotNullParameter(channelConnectionStatus, "");
        C44124sEe.imLogConnectionStatus$default("onChannelConnectionStatusChanged: " + channelConnectionStatus.name(), null, 2, null);
        int i = StateListAnimator.copydefault[channelConnectionStatus.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.isConnected = true;
                sEG segGEmmrt = sDZ.AEQbTJ.gEmmrt();
                if (segGEmmrt != null) {
                    segGEmmrt.AEQbTJ(new Function0() { // from class: o.sKr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC44292sKk.copydefault(this.EZpvd);
                        }
                    });
                }
            } else if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                AEQbTJ(new ChannelMessenger$onChannelConnectionStatusChanged$2(this), new ChannelMessenger$onChannelConnectionStatusChanged$3(this), new ChannelMessenger$onChannelConnectionStatusChanged$4(this), new ChannelMessenger$onChannelConnectionStatusChanged$5(this));
            }
        }
        this.AuCTel.EZpvd(new Function1() { // from class: o.sKv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC44292sKk.OLrzqt(channelConnectionStatus, (InterfaceC44287sKf) obj);
            }
        });
    }

    public static final Unit copydefault(AbstractC44292sKk abstractC44292sKk) {
        C44124sEe.imLogLogin$default("Login triggered from onChannelConnectionStatusChanged", null, 2, null);
        abstractC44292sKk.isConnected = false;
        abstractC44292sKk.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ChannelConnectionStatus channelConnectionStatus, InterfaceC44287sKf interfaceC44287sKf) {
        Intrinsics.checkNotNullParameter(interfaceC44287sKf, "");
        interfaceC44287sKf.KWHzl(channelConnectionStatus);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object KWHzl(AbstractC44292sKk abstractC44292sKk, sNO sno, Continuation<? super java.util.List<OKMessage>> continuation) {
        return abstractC44292sKk.valueOf.EZpvd().OLrzqt(sno, continuation);
    }

    @Override // o.sKH
    public void KWHzl(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.EZpvd().KWHzl(str, j);
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(AbstractC44292sKk abstractC44292sKk, sNH snh, Continuation<? super sNM> continuation) {
        return abstractC44292sKk.valueOf.EZpvd().KWHzl(snh, continuation);
    }

    @Override // o.sKH
    public void EZpvd(@NotNull InterfaceC44294sKm interfaceC44294sKm) {
        Intrinsics.checkNotNullParameter(interfaceC44294sKm, "");
        this.valueOf.KWHzl().copydefault(interfaceC44294sKm);
    }

    @Override // o.sKH
    public void AEQbTJ(@NotNull InterfaceC44294sKm interfaceC44294sKm) {
        Intrinsics.checkNotNullParameter(interfaceC44294sKm, "");
        this.valueOf.KWHzl().EZpvd(interfaceC44294sKm);
    }

    @Override // o.sKH
    public void KWHzl(@NotNull OKMessage oKMessage, InterfaceC44289sKh interfaceC44289sKh) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.valueOf.KWHzl().AEQbTJ(oKMessage, interfaceC44289sKh);
    }

    @Override // o.sKH
    public void OLrzqt(@NotNull WSSendReactionData wSSendReactionData, InterfaceC44295sKn interfaceC44295sKn) {
        Intrinsics.checkNotNullParameter(wSSendReactionData, "");
        this.valueOf.KWHzl().OLrzqt(wSSendReactionData, interfaceC44295sKn);
    }

    public static /* synthetic */ java.lang.Object copydefault(AbstractC44292sKk abstractC44292sKk, java.lang.String str, long j, boolean z, Continuation<? super java.util.List<ReactionDetail>> continuation) {
        if (z) {
            return abstractC44292sKk.valueOf.EZpvd().EZpvd(str, j, continuation);
        }
        return abstractC44292sKk.valueOf.EZpvd().KWHzl(str, j, continuation);
    }

    @Override // o.sKH
    public void KWHzl(@NotNull OKMessage oKMessage, @NotNull java.lang.String str, @NotNull java.lang.String str2, InterfaceC44289sKh interfaceC44289sKh) {
        java.lang.String bizName;
        java.lang.String serviceName;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OKMessageContent content = oKMessage.getContent();
        OKCustomMessage oKCustomMessage = content instanceof OKCustomMessage ? (OKCustomMessage) content : null;
        if (oKCustomMessage != null && ((bizName = oKCustomMessage.getBizName()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) bizName) || (serviceName = oKCustomMessage.getServiceName()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) serviceName))) {
            C44124sEe.imLogSendMessage$default(oKMessage.getTargetId(), "Biz or Service name is null or empty, but will still try sending.", null, 4, null);
        }
        this.valueOf.KWHzl().AEQbTJ(oKMessage, interfaceC44289sKh);
    }

    @Override // o.sKH
    public void AEQbTJ(@NotNull OKMessage oKMessage, InterfaceC44290sKi interfaceC44290sKi) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.valueOf.KWHzl().OLrzqt(oKMessage, interfaceC44290sKi);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object OLrzqt(AbstractC44292sKk abstractC44292sKk, OKMessage oKMessage, java.lang.String str, Continuation<? super sKH.StateListAnimator> continuation) throws java.lang.Throwable {
        ChannelMessenger$recallMessage$1 channelMessenger$recallMessage$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof ChannelMessenger$recallMessage$1) {
            channelMessenger$recallMessage$1 = (ChannelMessenger$recallMessage$1) continuation;
            int i = channelMessenger$recallMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                channelMessenger$recallMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                channelMessenger$recallMessage$1 = new ChannelMessenger$recallMessage$1(abstractC44292sKk, continuation);
            }
        }
        java.lang.Object obj = channelMessenger$recallMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = channelMessenger$recallMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                if (!(!ThreadUtils.valueOf())) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                InterfaceC44282sKa interfaceC44282sKaOLrzqt = abstractC44292sKk.valueOf.OLrzqt();
                channelMessenger$recallMessage$1.label = 1;
                if (interfaceC44282sKaOLrzqt.KWHzl(oKMessage, str, channelMessenger$recallMessage$1) == objCopydefault) {
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
            return sKH.StateListAnimator.TaskDescription.OLrzqt;
        }
        return new sKH.StateListAnimator.Activity(thM7380exceptionOrNullimpl);
    }

    public final void EZpvd(final OKConversation oKConversation, final java.util.List<java.lang.String> list) {
        this.AuCTel.copydefault(new Function1() { // from class: o.sKx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC44292sKk.AEQbTJ(oKConversation, list, (InterfaceC44291sKj) obj);
            }
        });
    }

    public static final Unit AEQbTJ(OKConversation oKConversation, java.util.List list, InterfaceC44291sKj interfaceC44291sKj) {
        Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
        interfaceC44291sKj.OLrzqt(new C44454sQk(oKConversation.getTargetId(), list, oKConversation.getConversationType()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object AEQbTJ(AbstractC44292sKk abstractC44292sKk, OKConversation oKConversation, OKMessage[] oKMessageArr, Continuation<? super sKH.TaskDescription> continuation) throws java.lang.Throwable {
        ChannelMessenger$deleteLocalAndRemoteMessage$1 channelMessenger$deleteLocalAndRemoteMessage$1;
        if (continuation instanceof ChannelMessenger$deleteLocalAndRemoteMessage$1) {
            channelMessenger$deleteLocalAndRemoteMessage$1 = (ChannelMessenger$deleteLocalAndRemoteMessage$1) continuation;
            int i = channelMessenger$deleteLocalAndRemoteMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                channelMessenger$deleteLocalAndRemoteMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                channelMessenger$deleteLocalAndRemoteMessage$1 = new ChannelMessenger$deleteLocalAndRemoteMessage$1(abstractC44292sKk, continuation);
            }
        }
        java.lang.Object obj = channelMessenger$deleteLocalAndRemoteMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = channelMessenger$deleteLocalAndRemoteMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (OKMessage oKMessage : oKMessageArr) {
                java.lang.String clientMessageId = oKMessage.getClientMessageId();
                if (clientMessageId != null) {
                    arrayList.add(clientMessageId);
                }
            }
            MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
            ChannelMessenger$deleteLocalAndRemoteMessage$2 channelMessenger$deleteLocalAndRemoteMessage$2 = new ChannelMessenger$deleteLocalAndRemoteMessage$2(abstractC44292sKk, oKConversation, arrayList, null);
            channelMessenger$deleteLocalAndRemoteMessage$1.label = 1;
            if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, channelMessenger$deleteLocalAndRemoteMessage$2, channelMessenger$deleteLocalAndRemoteMessage$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return sKH.TaskDescription.C0938TaskDescription.copydefault;
    }

    @Override // o.sKH
    public void AEQbTJ(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (oKMessage.getSentStatus() == OKMessage.SentStatus.FAILED) {
            this.valueOf.KWHzl().KWHzl(oKMessage);
        }
    }

    @Override // o.sKH
    public void KWHzl(@NotNull java.util.List<OKMessage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf.EZpvd().AEQbTJ(list);
    }

    public static /* synthetic */ java.lang.Object EZpvd(AbstractC44292sKk abstractC44292sKk, OKMessage oKMessage, Continuation<? super Unit> continuation) {
        java.lang.Object objHandleNotifyMessageModel$default = sJP.handleNotifyMessageModel$default(sJP.EZpvd, oKMessage, false, continuation, 2, null);
        return objHandleNotifyMessageModel$default == C56442yFn.copydefault() ? objHandleNotifyMessageModel$default : Unit.INSTANCE;
    }

    @Override // o.sKH
    public void copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        sNI.AEQbTJ.OLrzqt(oKMessage);
    }

    @Override // o.sKH
    public void OLrzqt(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        sJV.OLrzqt.OLrzqt(oKMessage);
    }

    public static /* synthetic */ java.lang.Object EZpvd(AbstractC44292sKk abstractC44292sKk, OKMessage oKMessage, java.lang.String str, Continuation<? super C44461sQr> continuation) {
        return abstractC44292sKk.OLrzqt().copydefault(oKMessage, str, continuation);
    }

    public void OLrzqt(int i, @NotNull java.lang.Class<? extends AbsOKInformationNotificationMessage<?>> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        sJV.OLrzqt.KWHzl(i, cls);
    }

    @Override // o.sKH
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.Class<? extends sJU<?>> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(cls, "");
        sMP.AEQbTJ.OLrzqt(str, list, cls);
    }

    @Override // o.sKH
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.Class<? extends sJU<?>> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        sMP.AEQbTJ.copydefault(str, cls);
    }

    @Override // o.sKH
    public void OLrzqt(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.fARcdN.add(function1);
    }

    @Override // o.sKH
    public void AEQbTJ(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.fARcdN.remove(function1);
    }
}
