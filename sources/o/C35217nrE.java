package o;

import com.okinc.im.call.domain.CallOrchestrator$acceptCallForNonLoginUser$1;
import com.okinc.im.call.domain.CallOrchestrator$acceptCallWithToken$1;
import com.okinc.im.call.domain.CallOrchestrator$endCall$1;
import com.okinc.im.call.domain.CallOrchestrator$handleStateTransition$1;
import com.okinc.im.call.domain.CallOrchestrator$handleStateTransition$2;
import com.okinc.im.call.domain.CallOrchestrator$handleStateTransition$3;
import com.okinc.im.call.domain.CallOrchestrator$handleStateTransition$4;
import com.okinc.im.call.model.CallDirection;
import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallStateV2;
import com.okinc.im.call.model.CallType;
import com.okinc.im.call.model.DisconnectReason;
import com.okinc.okimcore.model.im.OKCallCommon;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.AbstractC35264nrz;
import o.C35216nrD;
import o.C35220nrH;
import o.C35222nrJ;
import o.C35224nrL;
import o.C35225nrM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C35217nrE implements C35220nrH.StateListAnimator, C35222nrJ.Activity, C35224nrL.StateListAnimator, C35225nrM.Application {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<C35233nrU> AEQbTJ;
    public final InterfaceC35234nrV AYXKKw;
    public final C35225nrM AhwBna;
    public final C35222nrJ AkhnZx;
    public final C35220nrH DbNXlk;
    public final CoroutineDispatcher EZpvd;
    public final MutableStateFlow<CallStateV2> OLrzqt;
    public final StateFlow<CallStateV2> copydefault;
    public final C35224nrL djBIcL;
    public final CoroutineScope gEmmrt;
    public final StateFlow<C35233nrU> valueOf;

    /* JADX INFO: renamed from: o.nrE$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CallDirection.values().length];
            try {
                iArr[CallDirection.OUTGOING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CallDirection.INCOMING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C35233nrU> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<CallStateV2> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public C35217nrE(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC35234nrV interfaceC35234nrV, @NotNull C35220nrH c35220nrH, @NotNull C35222nrJ c35222nrJ, @NotNull C35224nrL c35224nrL, @NotNull C35225nrM c35225nrM) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC35234nrV, "");
        Intrinsics.checkNotNullParameter(c35220nrH, "");
        Intrinsics.checkNotNullParameter(c35222nrJ, "");
        Intrinsics.checkNotNullParameter(c35224nrL, "");
        Intrinsics.checkNotNullParameter(c35225nrM, "");
        this.EZpvd = coroutineDispatcher;
        this.AYXKKw = interfaceC35234nrV;
        this.DbNXlk = c35220nrH;
        this.AkhnZx = c35222nrJ;
        this.djBIcL = c35224nrL;
        this.AhwBna = c35225nrM;
        this.gEmmrt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        MutableStateFlow<CallStateV2> MutableStateFlow = StateFlowKt.MutableStateFlow(CallStateV2.Idle.INSTANCE);
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C35233nrU> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow2;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow2);
        copydefault();
        c35220nrH.AhwBna();
    }

    /* JADX INFO: renamed from: o.nrE$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final CallStateV2 copydefault(C35217nrE c35217nrE) {
        return c35217nrE.OLrzqt.getValue();
    }

    public final void copydefault() {
        Function0<? extends CallStateV2> function0 = new Function0() { // from class: o.nrF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35217nrE.copydefault(this.KWHzl);
            }
        };
        this.DbNXlk.copydefault(this.gEmmrt, function0, this, this.AhwBna);
        this.AkhnZx.copydefault(this.gEmmrt, function0, this);
        this.djBIcL.AEQbTJ(function0, this);
        this.AhwBna.KWHzl(this.gEmmrt, function0, this, new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.nrE$StateListAnimator */
    public static final class StateListAnimator implements C35225nrM.Activity {
        public StateListAnimator() {
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0025  */
        @Override // o.C35225nrM.Activity
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void copydefault(C35233nrU c35233nrU) {
            java.lang.String str;
            if (c35233nrU != null) {
                str = "groupId=" + c35233nrU.KWHzl() + ", agoraUid=" + c35233nrU.AEQbTJ();
                if (str == null) {
                    str = AbstractJsonLexerKt.NULL;
                }
            }
            C35217nrE.this.EZpvd("updateParticipation: " + str);
            C35217nrE.this.AEQbTJ.setValue(c35233nrU);
        }
    }

    @Override // o.C35220nrH.StateListAnimator
    public void OLrzqt(@NotNull AbstractC35264nrz abstractC35264nrz) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(abstractC35264nrz, "");
            CallStateV2 value = this.OLrzqt.getValue();
            C35216nrD.Activity activityOLrzqt = C35216nrD.AEQbTJ.OLrzqt(value, abstractC35264nrz);
            if (activityOLrzqt instanceof C35216nrD.Activity.TaskDescription) {
                EZpvd("processEvent: " + abstractC35264nrz + " | " + C35219nrG.AEQbTJ(value) + " → " + C35219nrG.AEQbTJ(((C35216nrD.Activity.TaskDescription) activityOLrzqt).KWHzl()));
                this.OLrzqt.setValue(((C35216nrD.Activity.TaskDescription) activityOLrzqt).KWHzl());
                OLrzqt(value, ((C35216nrD.Activity.TaskDescription) activityOLrzqt).KWHzl());
            } else if (!(activityOLrzqt instanceof C35216nrD.Activity.Application)) {
                if (activityOLrzqt instanceof C35216nrD.Activity.StateListAnimator) {
                    logError$default(this, "INVALID processEvent: " + abstractC35264nrz + " | state=" + C35219nrG.AEQbTJ(value) + ", session=" + C35219nrG.EZpvd(value), null, 2, null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    @Override // o.C35224nrL.StateListAnimator, o.C35225nrM.Application
    public void AEQbTJ(@NotNull AbstractC35264nrz abstractC35264nrz) {
        Intrinsics.checkNotNullParameter(abstractC35264nrz, "");
        OLrzqt(abstractC35264nrz);
    }

    @Override // o.C35222nrJ.Activity
    public void AhwBna() {
        OLrzqt(AbstractC35264nrz.ComponentCallbacks2.copydefault);
    }

    public final void OLrzqt(CallStateV2 callStateV2, CallStateV2 callStateV22) {
        CallSessionV2 callSessionV2AhwBna;
        EZpvd("handleStateTransition: " + C35219nrG.AEQbTJ(callStateV2) + " → " + C35219nrG.AEQbTJ(callStateV22));
        if (callStateV22 instanceof CallStateV2.Ringing) {
            if (((CallStateV2.Ringing) callStateV22).valueOf() == CallDirection.OUTGOING) {
                EZpvd("handleStateTransition: Starting no-answer timeout for outgoing call");
                this.AkhnZx.KWHzl();
                return;
            }
            return;
        }
        if (callStateV22 instanceof CallStateV2.Connecting) {
            EZpvd("handleStateTransition: Cancelling no-answer timeout (connecting)");
            this.AkhnZx.EZpvd();
            return;
        }
        if (callStateV22 instanceof CallStateV2.Connected) {
            EZpvd("handleStateTransition: Call connected, cancelling timeout");
            this.AkhnZx.EZpvd();
            return;
        }
        if (callStateV22 instanceof CallStateV2.Disconnected) {
            CallStateV2.Disconnected disconnected = (CallStateV2.Disconnected) callStateV22;
            EZpvd("handleStateTransition: Call disconnected, reason=" + disconnected.valueOf());
            this.AkhnZx.EZpvd();
            if (disconnected.valueOf() == DisconnectReason.NO_ANSWER && disconnected.AhwBna() != null) {
                BuildersKt__Builders_commonKt.launch$default(this.gEmmrt, null, null, new CallOrchestrator$handleStateTransition$1(this, callStateV22, null), 3, null);
            }
            if (disconnected.valueOf() == DisconnectReason.AGORA_ERROR && (callSessionV2AhwBna = disconnected.AhwBna()) != null && callSessionV2AhwBna.djBIcL() == CallType.P2P) {
                BuildersKt__Builders_commonKt.launch$default(this.gEmmrt, null, null, new CallOrchestrator$handleStateTransition$2(this, callSessionV2AhwBna, null), 3, null);
            }
            CallSessionV2 callSessionV2AhwBna2 = disconnected.AhwBna();
            if (callSessionV2AhwBna2 != null && callSessionV2AhwBna2.AuCTel() && this.AEQbTJ.getValue() != null) {
                EZpvd("handleStateTransition: Clearing stale group call participation");
                this.AEQbTJ.setValue(null);
            }
            BuildersKt__Builders_commonKt.launch$default(this.gEmmrt, null, null, new CallOrchestrator$handleStateTransition$3(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(this.gEmmrt, null, null, new CallOrchestrator$handleStateTransition$4(this, null), 3, null);
            return;
        }
        if (!(callStateV22 instanceof CallStateV2.Idle)) {
            throw new NoWhenBranchMatchedException();
        }
        EZpvd("handleStateTransition: Now idle");
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return this.djBIcL.AEQbTJ(str, str2, continuation);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull OKCallCommon.OKVoiceCallType oKVoiceCallType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(oKVoiceCallType, "");
        EZpvd("initFromPushNotification: conversationId=" + str + ", remoteUserId=" + str3);
        this.djBIcL.KWHzl(str, str2, str3, oKVoiceCallType);
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return this.djBIcL.AEQbTJ(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) throws java.lang.Throwable {
        CallOrchestrator$acceptCallWithToken$1 callOrchestrator$acceptCallWithToken$1;
        int i2;
        java.lang.Object objCopydefault;
        C35217nrE c35217nrE;
        AbstractC35226nrN abstractC35226nrN;
        AbstractC35226nrN abstractC35226nrN2;
        java.lang.Object objOLrzqt;
        CallSessionV2 callSessionV2;
        AbstractC35226nrN abstractC35226nrN3;
        AbstractC35226nrN abstractC35226nrN4;
        C35217nrE c35217nrE2;
        AbstractC35226nrN abstractC35226nrN5;
        AbstractC35226nrN abstractC35226nrN6;
        AbstractC35226nrN abstractC35226nrN7;
        if (continuation instanceof CallOrchestrator$acceptCallWithToken$1) {
            callOrchestrator$acceptCallWithToken$1 = (CallOrchestrator$acceptCallWithToken$1) continuation;
            int i3 = callOrchestrator$acceptCallWithToken$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                callOrchestrator$acceptCallWithToken$1.label = i3 - Integer.MIN_VALUE;
            } else {
                callOrchestrator$acceptCallWithToken$1 = new CallOrchestrator$acceptCallWithToken$1(this, continuation);
            }
        }
        java.lang.Object obj = callOrchestrator$acceptCallWithToken$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i4 = callOrchestrator$acceptCallWithToken$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            EZpvd("acceptCallWithToken: conversationId=" + str + ", meetingId=" + str6);
            if (this.OLrzqt.getValue().OLrzqt()) {
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.TaskDescription.AEQbTJ);
            }
            InterfaceC35234nrV interfaceC35234nrV = this.AYXKKw;
            callOrchestrator$acceptCallWithToken$1.L$0 = this;
            callOrchestrator$acceptCallWithToken$1.label = 1;
            i2 = 2;
            objCopydefault = interfaceC35234nrV.copydefault(str, str2, str3, i, str4, str5, str6, str7, callOrchestrator$acceptCallWithToken$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c35217nrE = this;
        } else if (i4 == 1) {
            C35217nrE c35217nrE3 = (C35217nrE) callOrchestrator$acceptCallWithToken$1.L$0;
            C56391yDq.AEQbTJ(obj);
            c35217nrE = c35217nrE3;
            objCopydefault = obj;
            i2 = 2;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC35226nrN6 = (AbstractC35226nrN) callOrchestrator$acceptCallWithToken$1.L$3;
                abstractC35226nrN5 = (AbstractC35226nrN) callOrchestrator$acceptCallWithToken$1.L$2;
                abstractC35226nrN7 = (AbstractC35226nrN) callOrchestrator$acceptCallWithToken$1.L$1;
                c35217nrE2 = (C35217nrE) callOrchestrator$acceptCallWithToken$1.L$0;
                C56391yDq.AEQbTJ(obj);
                i2 = 2;
                abstractC35226nrN4 = abstractC35226nrN6;
                abstractC35226nrN = abstractC35226nrN5;
                abstractC35226nrN2 = abstractC35226nrN7;
                c35217nrE = c35217nrE2;
                if (abstractC35226nrN4 instanceof AbstractC35226nrN.Application) {
                    AbstractC35221nrI abstractC35221nrIOLrzqt = ((AbstractC35226nrN.Application) abstractC35226nrN4).OLrzqt();
                    logError$default(c35217nrE, "acceptCallWithToken: Failed to join channel: " + abstractC35221nrIOLrzqt.AEQbTJ(), null, i2, null);
                    c35217nrE.OLrzqt(new AbstractC35264nrz.Activity(new java.lang.Exception(abstractC35221nrIOLrzqt.AEQbTJ())));
                }
                if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
                    logError$default(c35217nrE, "acceptCallWithToken: Failed to create session: " + ((AbstractC35226nrN.Application) abstractC35226nrN).OLrzqt().AEQbTJ(), null, i2, null);
                }
                if (!(abstractC35226nrN2 instanceof AbstractC35226nrN.ActionBar)) {
                    return new AbstractC35226nrN.ActionBar(Unit.INSTANCE);
                }
                if (abstractC35226nrN2 instanceof AbstractC35226nrN.Application) {
                    return abstractC35226nrN2;
                }
                throw new NoWhenBranchMatchedException();
            }
            callSessionV2 = (CallSessionV2) callOrchestrator$acceptCallWithToken$1.L$3;
            AbstractC35226nrN abstractC35226nrN8 = (AbstractC35226nrN) callOrchestrator$acceptCallWithToken$1.L$2;
            AbstractC35226nrN abstractC35226nrN9 = (AbstractC35226nrN) callOrchestrator$acceptCallWithToken$1.L$1;
            C35217nrE c35217nrE4 = (C35217nrE) callOrchestrator$acceptCallWithToken$1.L$0;
            C56391yDq.AEQbTJ(obj);
            abstractC35226nrN2 = abstractC35226nrN9;
            abstractC35226nrN3 = abstractC35226nrN8;
            c35217nrE = c35217nrE4;
            objOLrzqt = obj;
            i2 = 2;
            abstractC35226nrN4 = (AbstractC35226nrN) objOLrzqt;
            if (!(abstractC35226nrN4 instanceof AbstractC35226nrN.ActionBar)) {
                c35217nrE.EZpvd("acceptCallWithToken: Successfully joined Agora channel");
                c35217nrE.OLrzqt(AbstractC35264nrz.TaskDescription.AEQbTJ);
                c35217nrE.EZpvd("acceptCallWithToken: Sending accept signal after Agora join");
                InterfaceC35234nrV interfaceC35234nrV2 = c35217nrE.AYXKKw;
                callOrchestrator$acceptCallWithToken$1.L$0 = c35217nrE;
                callOrchestrator$acceptCallWithToken$1.L$1 = abstractC35226nrN2;
                callOrchestrator$acceptCallWithToken$1.L$2 = abstractC35226nrN3;
                callOrchestrator$acceptCallWithToken$1.L$3 = abstractC35226nrN4;
                callOrchestrator$acceptCallWithToken$1.label = 3;
                if (interfaceC35234nrV2.copydefault(callSessionV2, callOrchestrator$acceptCallWithToken$1) == objCopydefault2) {
                    return objCopydefault2;
                }
                c35217nrE2 = c35217nrE;
                abstractC35226nrN5 = abstractC35226nrN3;
                abstractC35226nrN6 = abstractC35226nrN4;
                abstractC35226nrN7 = abstractC35226nrN2;
                abstractC35226nrN4 = abstractC35226nrN6;
                abstractC35226nrN = abstractC35226nrN5;
                abstractC35226nrN2 = abstractC35226nrN7;
                c35217nrE = c35217nrE2;
                if (abstractC35226nrN4 instanceof AbstractC35226nrN.Application) {
                }
                if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
                }
                if (!(abstractC35226nrN2 instanceof AbstractC35226nrN.ActionBar)) {
                }
            } else {
                abstractC35226nrN = abstractC35226nrN3;
                if (abstractC35226nrN4 instanceof AbstractC35226nrN.Application) {
                }
                if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
                }
                if (!(abstractC35226nrN2 instanceof AbstractC35226nrN.ActionBar)) {
                }
            }
        }
        abstractC35226nrN = (AbstractC35226nrN) objCopydefault;
        if (abstractC35226nrN instanceof AbstractC35226nrN.ActionBar) {
            CallSessionV2 callSessionV22 = (CallSessionV2) ((AbstractC35226nrN.ActionBar) abstractC35226nrN).EZpvd();
            c35217nrE.EZpvd("acceptCallWithToken: Session created, transitioning state");
            c35217nrE.OLrzqt(new AbstractC35264nrz.Application(callSessionV22));
            c35217nrE.OLrzqt(AbstractC35264nrz.Dialog.EZpvd);
            c35217nrE.EZpvd("acceptCallWithToken: Joining Agora channel=" + callSessionV22.AEQbTJ());
            InterfaceC35234nrV interfaceC35234nrV3 = c35217nrE.AYXKKw;
            callOrchestrator$acceptCallWithToken$1.L$0 = c35217nrE;
            callOrchestrator$acceptCallWithToken$1.L$1 = abstractC35226nrN;
            callOrchestrator$acceptCallWithToken$1.L$2 = abstractC35226nrN;
            callOrchestrator$acceptCallWithToken$1.L$3 = callSessionV22;
            callOrchestrator$acceptCallWithToken$1.label = i2;
            objOLrzqt = interfaceC35234nrV3.OLrzqt(callSessionV22, callOrchestrator$acceptCallWithToken$1);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
            abstractC35226nrN2 = abstractC35226nrN;
            callSessionV2 = callSessionV22;
            abstractC35226nrN3 = abstractC35226nrN2;
            abstractC35226nrN4 = (AbstractC35226nrN) objOLrzqt;
            if (!(abstractC35226nrN4 instanceof AbstractC35226nrN.ActionBar)) {
            }
        } else {
            abstractC35226nrN2 = abstractC35226nrN;
            if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
            }
            if (!(abstractC35226nrN2 instanceof AbstractC35226nrN.ActionBar)) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C35251nrm c35251nrm, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) throws java.lang.Throwable {
        CallOrchestrator$acceptCallForNonLoginUser$1 callOrchestrator$acceptCallForNonLoginUser$1;
        C35217nrE c35217nrE;
        if (continuation instanceof CallOrchestrator$acceptCallForNonLoginUser$1) {
            callOrchestrator$acceptCallForNonLoginUser$1 = (CallOrchestrator$acceptCallForNonLoginUser$1) continuation;
            int i = callOrchestrator$acceptCallForNonLoginUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                callOrchestrator$acceptCallForNonLoginUser$1.label = i - Integer.MIN_VALUE;
            } else {
                callOrchestrator$acceptCallForNonLoginUser$1 = new CallOrchestrator$acceptCallForNonLoginUser$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = callOrchestrator$acceptCallForNonLoginUser$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = callOrchestrator$acceptCallForNonLoginUser$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            EZpvd("acceptCallForNonLoginUser: channelId=" + c35251nrm.copydefault());
            if (this.OLrzqt.getValue().OLrzqt()) {
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.TaskDescription.AEQbTJ);
            }
            InterfaceC35234nrV interfaceC35234nrV = this.AYXKKw;
            callOrchestrator$acceptCallForNonLoginUser$1.L$0 = this;
            callOrchestrator$acceptCallForNonLoginUser$1.label = 1;
            objKWHzl = interfaceC35234nrV.KWHzl(c35251nrm, callOrchestrator$acceptCallForNonLoginUser$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c35217nrE = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35217nrE = (C35217nrE) callOrchestrator$acceptCallForNonLoginUser$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        AbstractC35226nrN abstractC35226nrN = (AbstractC35226nrN) objKWHzl;
        boolean z = abstractC35226nrN instanceof AbstractC35226nrN.ActionBar;
        if (z) {
            CallSessionV2 callSessionV2 = (CallSessionV2) ((AbstractC35226nrN.ActionBar) abstractC35226nrN).EZpvd();
            c35217nrE.EZpvd("acceptCallForNonLoginUser: Session created, transitioning state");
            c35217nrE.OLrzqt(new AbstractC35264nrz.Application(callSessionV2));
            c35217nrE.OLrzqt(AbstractC35264nrz.Dialog.EZpvd);
            c35217nrE.EZpvd("acceptCallForNonLoginUser: Successfully connected to Agora");
            c35217nrE.OLrzqt(AbstractC35264nrz.TaskDescription.AEQbTJ);
        }
        boolean z2 = abstractC35226nrN instanceof AbstractC35226nrN.Application;
        if (z2) {
            logError$default(c35217nrE, "acceptCallForNonLoginUser: Failed: " + ((AbstractC35226nrN.Application) abstractC35226nrN).OLrzqt().AEQbTJ(), null, 2, null);
        }
        if (z) {
            return new AbstractC35226nrN.ActionBar(Unit.INSTANCE);
        }
        if (z2) {
            return abstractC35226nrN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ java.lang.Object endCall$default(C35217nrE c35217nrE, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c35217nrE.AEQbTJ(z, (Continuation<? super AbstractC35226nrN<Unit>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) throws java.lang.Throwable {
        CallOrchestrator$endCall$1 callOrchestrator$endCall$1;
        AbstractC35264nrz abstractC35264nrz;
        if (continuation instanceof CallOrchestrator$endCall$1) {
            callOrchestrator$endCall$1 = (CallOrchestrator$endCall$1) continuation;
            int i = callOrchestrator$endCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                callOrchestrator$endCall$1.label = i - Integer.MIN_VALUE;
            } else {
                callOrchestrator$endCall$1 = new CallOrchestrator$endCall$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = callOrchestrator$endCall$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = callOrchestrator$endCall$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                return AbstractC35226nrN.Companion.copydefault(Unit.INSTANCE);
            }
            if (i2 == 2) {
                C56391yDq.AEQbTJ(objCopydefault);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objCopydefault);
        CallStateV2 value = this.OLrzqt.getValue();
        CallSessionV2 callSessionV2AEQbTJ = value.AEQbTJ();
        if (callSessionV2AEQbTJ != null && callSessionV2AEQbTJ.AuCTel()) {
            if (value instanceof CallStateV2.Ringing) {
                int i3 = ActionBar.AEQbTJ[((CallStateV2.Ringing) value).valueOf().ordinal()];
                if (i3 == 1) {
                    abstractC35264nrz = AbstractC35264nrz.PendingIntent.OLrzqt;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC35264nrz = AbstractC35264nrz.Fragment.AEQbTJ;
                }
                OLrzqt(abstractC35264nrz);
                Unit unit = Unit.INSTANCE;
            } else {
                callOrchestrator$endCall$1.label = 1;
                if (EZpvd(callOrchestrator$endCall$1) == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return AbstractC35226nrN.Companion.copydefault(Unit.INSTANCE);
        }
        C35224nrL c35224nrL = this.djBIcL;
        callOrchestrator$endCall$1.label = 2;
        objCopydefault = c35224nrL.copydefault(z, callOrchestrator$endCall$1);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return this.AhwBna.OLrzqt(str, list, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return this.AhwBna.KWHzl(str, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return this.AhwBna.KWHzl(list, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return this.AhwBna.KWHzl(continuation);
    }

    public final boolean AEQbTJ(boolean z) {
        return this.AYXKKw.EZpvd(z);
    }

    public final boolean OLrzqt() {
        return this.AYXKKw.AEQbTJ();
    }

    public final boolean copydefault(boolean z) {
        return this.AYXKKw.OLrzqt(z);
    }

    public final boolean djBIcL() {
        return this.AYXKKw.OLrzqt();
    }

    public final boolean AEQbTJ() {
        return this.OLrzqt.getValue().OLrzqt();
    }

    public final void AYXKKw() {
        EZpvd("preConnectWebSocket");
        this.AYXKKw.copydefault();
    }

    public final void EZpvd(java.lang.String str) {
        C44124sEe.imLogVoiceCall$default("CallOrchestrator: " + str, null, 2, null);
    }

    public static /* synthetic */ void logError$default(C35217nrE c35217nrE, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        c35217nrE.AEQbTJ(str, th);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.Throwable th) {
        C44124sEe.fIwbmz("CallOrchestrator: ERROR - " + str, th);
    }
}
