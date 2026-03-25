package o;

import com.okinc.im.call.domain.PrivateCallManager$acceptCall$1;
import com.okinc.im.call.domain.PrivateCallManager$startCall$1;
import com.okinc.im.call.model.CallDirection;
import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallStateV2;
import com.okinc.im.call.model.CallType;
import com.okinc.im.call.model.MediaType;
import com.okinc.okimcore.model.im.OKCallCommon;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.AbstractC35264nrz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35224nrL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public StateListAnimator AEQbTJ;
    public Function0<? extends CallStateV2> EZpvd;
    public final InterfaceC35234nrV KWHzl;

    /* JADX INFO: renamed from: o.nrL$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(@NotNull AbstractC35264nrz abstractC35264nrz);
    }

    /* JADX INFO: renamed from: o.nrL$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKCallCommon.OKVoiceCallType.values().length];
            try {
                iArr[OKCallCommon.OKVoiceCallType.GROUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKCallCommon.OKVoiceCallType.QUEUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function0<? extends CallStateV2> function0, @NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.EZpvd = function0;
        this.AEQbTJ = stateListAnimator;
    }

    @yCM
    public C35224nrL(@NotNull InterfaceC35234nrV interfaceC35234nrV) {
        Intrinsics.checkNotNullParameter(interfaceC35234nrV, "");
        this.KWHzl = interfaceC35234nrV;
    }

    /* JADX INFO: renamed from: o.nrL$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) throws java.lang.Throwable {
        PrivateCallManager$startCall$1 privateCallManager$startCall$1;
        C35224nrL c35224nrL;
        AbstractC35226nrN abstractC35226nrN;
        AbstractC35226nrN abstractC35226nrN2;
        C35224nrL c35224nrL2;
        AbstractC35226nrN abstractC35226nrN3;
        AbstractC35226nrN abstractC35226nrN4;
        if (continuation instanceof PrivateCallManager$startCall$1) {
            privateCallManager$startCall$1 = (PrivateCallManager$startCall$1) continuation;
            int i = privateCallManager$startCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                privateCallManager$startCall$1.label = i - Integer.MIN_VALUE;
            } else {
                privateCallManager$startCall$1 = new PrivateCallManager$startCall$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = privateCallManager$startCall$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = privateCallManager$startCall$1.label;
        StateListAnimator stateListAnimator = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            KWHzl("startCall: conversationId=" + str + ", calleeUserId=" + str2);
            Function0<? extends CallStateV2> function0 = this.EZpvd;
            if (function0 == null) {
                Intrinsics.gEmmrt("");
                function0 = null;
            }
            CallStateV2 callStateV2Invoke = function0.invoke();
            if (callStateV2Invoke.OLrzqt()) {
                KWHzl("startCall: REJECTED - already active (" + C56524yIo.AEQbTJ(callStateV2Invoke.getClass()).valueOf() + ")");
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.TaskDescription.AEQbTJ);
            }
            if (!this.KWHzl.EZpvd()) {
                KWHzl("startCall: REJECTED - network unavailable");
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.Fragment.OLrzqt);
            }
            KWHzl("startCall: Initiating call via repository");
            InterfaceC35234nrV interfaceC35234nrV = this.KWHzl;
            privateCallManager$startCall$1.L$0 = this;
            privateCallManager$startCall$1.label = 1;
            objEZpvd = interfaceC35234nrV.EZpvd(str, str2, privateCallManager$startCall$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c35224nrL = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC35226nrN3 = (AbstractC35226nrN) privateCallManager$startCall$1.L$2;
                abstractC35226nrN = (AbstractC35226nrN) privateCallManager$startCall$1.L$1;
                c35224nrL2 = (C35224nrL) privateCallManager$startCall$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                abstractC35226nrN4 = (AbstractC35226nrN) objEZpvd;
                if (abstractC35226nrN4 instanceof AbstractC35226nrN.ActionBar) {
                    c35224nrL2.KWHzl("startCall: Successfully joined Agora channel");
                }
                if (abstractC35226nrN4 instanceof AbstractC35226nrN.Application) {
                    AbstractC35221nrI abstractC35221nrIOLrzqt = ((AbstractC35226nrN.Application) abstractC35226nrN4).OLrzqt();
                    c35224nrL2.KWHzl("startCall: Failed to join channel: " + abstractC35221nrIOLrzqt.AEQbTJ());
                    StateListAnimator stateListAnimator2 = c35224nrL2.AEQbTJ;
                    if (stateListAnimator2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        stateListAnimator = stateListAnimator2;
                    }
                    stateListAnimator.AEQbTJ(new AbstractC35264nrz.Activity(new java.lang.Exception(abstractC35221nrIOLrzqt.AEQbTJ())));
                }
                abstractC35226nrN2 = abstractC35226nrN;
                abstractC35226nrN = abstractC35226nrN3;
                c35224nrL = c35224nrL2;
                if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
                    c35224nrL.KWHzl("startCall: Failed to initiate call: " + ((AbstractC35226nrN.Application) abstractC35226nrN).OLrzqt().AEQbTJ());
                }
                return abstractC35226nrN2;
            }
            c35224nrL = (C35224nrL) privateCallManager$startCall$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        abstractC35226nrN = (AbstractC35226nrN) objEZpvd;
        if (abstractC35226nrN instanceof AbstractC35226nrN.ActionBar) {
            CallSessionV2 callSessionV2 = (CallSessionV2) ((AbstractC35226nrN.ActionBar) abstractC35226nrN).EZpvd();
            c35224nrL.KWHzl("startCall: Call initiated successfully, callId=" + callSessionV2.gEmmrt());
            StateListAnimator stateListAnimator3 = c35224nrL.AEQbTJ;
            if (stateListAnimator3 == null) {
                Intrinsics.gEmmrt("");
                stateListAnimator3 = null;
            }
            stateListAnimator3.AEQbTJ(new AbstractC35264nrz.LoaderManager(callSessionV2));
            c35224nrL.KWHzl("startCall: Joining Agora channel");
            InterfaceC35234nrV interfaceC35234nrV2 = c35224nrL.KWHzl;
            privateCallManager$startCall$1.L$0 = c35224nrL;
            privateCallManager$startCall$1.L$1 = abstractC35226nrN;
            privateCallManager$startCall$1.L$2 = abstractC35226nrN;
            privateCallManager$startCall$1.label = 2;
            objEZpvd = interfaceC35234nrV2.OLrzqt(callSessionV2, privateCallManager$startCall$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c35224nrL2 = c35224nrL;
            abstractC35226nrN3 = abstractC35226nrN;
            abstractC35226nrN4 = (AbstractC35226nrN) objEZpvd;
            if (abstractC35226nrN4 instanceof AbstractC35226nrN.ActionBar) {
            }
            if (abstractC35226nrN4 instanceof AbstractC35226nrN.Application) {
            }
            abstractC35226nrN2 = abstractC35226nrN;
            abstractC35226nrN = abstractC35226nrN3;
            c35224nrL = c35224nrL2;
            if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
            }
            return abstractC35226nrN2;
        }
        abstractC35226nrN2 = abstractC35226nrN;
        if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
        }
        return abstractC35226nrN2;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull OKCallCommon.OKVoiceCallType oKVoiceCallType) {
        CallType callType;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(oKVoiceCallType, "");
        int i = TaskDescription.KWHzl[oKVoiceCallType.ordinal()];
        if (i == 1) {
            callType = CallType.GROUP;
        } else if (i == 2) {
            callType = CallType.QUEUE;
        } else {
            callType = CallType.P2P;
        }
        CallType callType2 = callType;
        boolean z = callType2 == CallType.GROUP;
        KWHzl("initFromPushNotification: conversationId=" + str + ", localUserId=" + str2 + ", remoteUserId=" + str3 + ", callType=" + callType2 + ", isGroupCall=" + z);
        Function0<? extends CallStateV2> function0 = this.EZpvd;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallStateV2 callStateV2Invoke = function0.invoke();
        if (!(callStateV2Invoke instanceof CallStateV2.Idle)) {
            KWHzl("initFromPushNotification: SKIPPED - not Idle (" + C56524yIo.AEQbTJ(callStateV2Invoke.getClass()).valueOf() + ")");
            return;
        }
        CallSessionV2 callSessionV2 = new CallSessionV2((java.lang.String) null, str, str2, str3, str2, (java.lang.String) null, (java.lang.String) null, 0, callType2, (MediaType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0L, (java.lang.String) null, z ? str : null, false, 98017, (DefaultConstructorMarker) null);
        KWHzl("initFromPushNotification: Emitting IncomingCall event with callId=" + callSessionV2.gEmmrt() + ", callType=" + callSessionV2.djBIcL() + ", groupId=" + callSessionV2.valueOf());
        StateListAnimator stateListAnimator = this.AEQbTJ;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        stateListAnimator.AEQbTJ(new AbstractC35264nrz.Application(callSessionV2));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) throws java.lang.Throwable {
        PrivateCallManager$acceptCall$1 privateCallManager$acceptCall$1;
        C35224nrL c35224nrL;
        AbstractC35226nrN abstractC35226nrN;
        C35224nrL c35224nrL2;
        if (continuation instanceof PrivateCallManager$acceptCall$1) {
            privateCallManager$acceptCall$1 = (PrivateCallManager$acceptCall$1) continuation;
            int i = privateCallManager$acceptCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                privateCallManager$acceptCall$1.label = i - Integer.MIN_VALUE;
            } else {
                privateCallManager$acceptCall$1 = new PrivateCallManager$acceptCall$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = privateCallManager$acceptCall$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = privateCallManager$acceptCall$1.label;
        StateListAnimator stateListAnimator = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            KWHzl("acceptCall: Attempting to accept incoming call");
            Function0<? extends CallStateV2> function0 = this.EZpvd;
            if (function0 == null) {
                Intrinsics.gEmmrt("");
                function0 = null;
            }
            CallStateV2 callStateV2Invoke = function0.invoke();
            if (callStateV2Invoke instanceof CallStateV2.Ringing) {
                CallStateV2.Ringing ringing = (CallStateV2.Ringing) callStateV2Invoke;
                if (ringing.valueOf() == CallDirection.INCOMING) {
                    KWHzl("acceptCall: Valid state, processing accept for callId=" + ringing.djBIcL().gEmmrt());
                    StateListAnimator stateListAnimator2 = this.AEQbTJ;
                    if (stateListAnimator2 == null) {
                        Intrinsics.gEmmrt("");
                        stateListAnimator2 = null;
                    }
                    stateListAnimator2.AEQbTJ(AbstractC35264nrz.Dialog.EZpvd);
                    KWHzl("acceptCall: Sending accept via repository");
                    InterfaceC35234nrV interfaceC35234nrV = this.KWHzl;
                    CallSessionV2 callSessionV2DjBIcL = ringing.djBIcL();
                    privateCallManager$acceptCall$1.L$0 = this;
                    privateCallManager$acceptCall$1.label = 1;
                    objKWHzl = interfaceC35234nrV.KWHzl(callSessionV2DjBIcL, privateCallManager$acceptCall$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    c35224nrL = this;
                }
            }
            KWHzl("acceptCall: REJECTED - not Ringing(IN) (" + C56524yIo.AEQbTJ(callStateV2Invoke.getClass()).valueOf() + ")");
            return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.PendingIntent("Not in incoming ringing state"));
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35224nrL2 = (C35224nrL) privateCallManager$acceptCall$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            abstractC35226nrN = (AbstractC35226nrN) objKWHzl;
            if (abstractC35226nrN instanceof AbstractC35226nrN.ActionBar) {
                c35224nrL2.KWHzl("acceptCall: Successfully joined Agora channel");
            }
            if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
                AbstractC35221nrI abstractC35221nrIOLrzqt = ((AbstractC35226nrN.Application) abstractC35226nrN).OLrzqt();
                c35224nrL2.KWHzl("acceptCall: Failed to join channel: " + abstractC35221nrIOLrzqt.AEQbTJ());
                StateListAnimator stateListAnimator3 = c35224nrL2.AEQbTJ;
                if (stateListAnimator3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator = stateListAnimator3;
                }
                stateListAnimator.AEQbTJ(new AbstractC35264nrz.Activity(new java.lang.Exception(abstractC35221nrIOLrzqt.AEQbTJ())));
            }
            return abstractC35226nrN;
        }
        c35224nrL = (C35224nrL) privateCallManager$acceptCall$1.L$0;
        C56391yDq.AEQbTJ(objKWHzl);
        abstractC35226nrN = (AbstractC35226nrN) objKWHzl;
        if (abstractC35226nrN instanceof AbstractC35226nrN.ActionBar) {
            CallSessionV2 callSessionV2 = (CallSessionV2) ((AbstractC35226nrN.ActionBar) abstractC35226nrN).EZpvd();
            c35224nrL.KWHzl("acceptCall: Accept sent successfully, joining Agora channel");
            InterfaceC35234nrV interfaceC35234nrV2 = c35224nrL.KWHzl;
            privateCallManager$acceptCall$1.L$0 = c35224nrL;
            privateCallManager$acceptCall$1.label = 2;
            objKWHzl = interfaceC35234nrV2.OLrzqt(callSessionV2, privateCallManager$acceptCall$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c35224nrL2 = c35224nrL;
            abstractC35226nrN = (AbstractC35226nrN) objKWHzl;
            if (abstractC35226nrN instanceof AbstractC35226nrN.ActionBar) {
            }
            if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
            }
            return abstractC35226nrN;
        }
        if (!(abstractC35226nrN instanceof AbstractC35226nrN.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return abstractC35226nrN;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        KWHzl("rejectCall: Attempting to reject incoming call");
        Function0<? extends CallStateV2> function0 = this.EZpvd;
        StateListAnimator stateListAnimator = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallStateV2 callStateV2Invoke = function0.invoke();
        if (callStateV2Invoke instanceof CallStateV2.Ringing) {
            CallStateV2.Ringing ringing = (CallStateV2.Ringing) callStateV2Invoke;
            if (ringing.valueOf() == CallDirection.INCOMING) {
                KWHzl("rejectCall: Rejecting callId=" + ringing.djBIcL().gEmmrt());
                StateListAnimator stateListAnimator2 = this.AEQbTJ;
                if (stateListAnimator2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator = stateListAnimator2;
                }
                stateListAnimator.AEQbTJ(AbstractC35264nrz.Fragment.AEQbTJ);
                return this.KWHzl.EZpvd(ringing.djBIcL(), continuation);
            }
        }
        KWHzl("rejectCall: REJECTED - invalid state (state=" + C56524yIo.AEQbTJ(callStateV2Invoke.getClass()).valueOf() + ")");
        return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.PendingIntent("Not in incoming ringing state"));
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        KWHzl("cancelCall: Attempting to cancel outgoing call");
        Function0<? extends CallStateV2> function0 = this.EZpvd;
        StateListAnimator stateListAnimator = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallStateV2 callStateV2Invoke = function0.invoke();
        if (callStateV2Invoke instanceof CallStateV2.Ringing) {
            CallStateV2.Ringing ringing = (CallStateV2.Ringing) callStateV2Invoke;
            if (ringing.valueOf() == CallDirection.OUTGOING) {
                KWHzl("cancelCall: Cancelling callId=" + ringing.djBIcL().gEmmrt());
                StateListAnimator stateListAnimator2 = this.AEQbTJ;
                if (stateListAnimator2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator = stateListAnimator2;
                }
                stateListAnimator.AEQbTJ(AbstractC35264nrz.PendingIntent.OLrzqt);
                return this.KWHzl.AEQbTJ(ringing.djBIcL(), continuation);
            }
        }
        KWHzl("cancelCall: REJECTED - invalid state (state=" + C56524yIo.AEQbTJ(callStateV2Invoke.getClass()).valueOf() + ")");
        return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.PendingIntent("Not in outgoing ringing state"));
    }

    public static /* synthetic */ java.lang.Object endCall$default(C35224nrL c35224nrL, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c35224nrL.copydefault(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(boolean z, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        boolean z2;
        java.lang.String strDbNXlk;
        KWHzl("endCall: bypassWebsocket=" + z);
        Function0<? extends CallStateV2> function0 = this.EZpvd;
        StateListAnimator stateListAnimator = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallStateV2 callStateV2Invoke = function0.invoke();
        CallSessionV2 callSessionV2AEQbTJ = callStateV2Invoke.AEQbTJ();
        if (callSessionV2AEQbTJ != null) {
            z2 = (!callSessionV2AEQbTJ.fJNWhG() || (strDbNXlk = callSessionV2AEQbTJ.DbNXlk()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) ? false : true;
        }
        if (z || z2) {
            if (!z) {
                KWHzl("endCall: callback QUEUE call (meetingId=" + (callSessionV2AEQbTJ != null ? callSessionV2AEQbTJ.DbNXlk() : null) + ") — auto-skipping WS signalling");
            }
            StateListAnimator stateListAnimator2 = this.AEQbTJ;
            if (stateListAnimator2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                stateListAnimator = stateListAnimator2;
            }
            stateListAnimator.AEQbTJ(AbstractC35264nrz.FragmentManager.EZpvd);
            return this.KWHzl.EZpvd(continuation);
        }
        if (callStateV2Invoke instanceof CallStateV2.Connected) {
            CallStateV2.Connected connected = (CallStateV2.Connected) callStateV2Invoke;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - connected.EZpvd();
            KWHzl("endCall: Ending connected call, duration=" + jCurrentTimeMillis + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
            StateListAnimator stateListAnimator3 = this.AEQbTJ;
            if (stateListAnimator3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                stateListAnimator = stateListAnimator3;
            }
            stateListAnimator.AEQbTJ(AbstractC35264nrz.FragmentManager.EZpvd);
            return this.KWHzl.KWHzl(connected.AYXKKw(), jCurrentTimeMillis, continuation);
        }
        if (callStateV2Invoke instanceof CallStateV2.Ringing) {
            CallStateV2.Ringing ringing = (CallStateV2.Ringing) callStateV2Invoke;
            KWHzl("endCall: In ringing state, direction=" + ringing.valueOf());
            if (ringing.valueOf() == CallDirection.OUTGOING) {
                return EZpvd(continuation);
            }
            return copydefault(continuation);
        }
        if (callStateV2Invoke instanceof CallStateV2.Connecting) {
            CallStateV2.Connecting connecting = (CallStateV2.Connecting) callStateV2Invoke;
            CallSessionV2 callSessionV2AYXKKw = connecting.AYXKKw();
            KWHzl("endCall: In connecting state, direction=" + connecting.valueOf());
            if (connecting.valueOf() == CallDirection.OUTGOING) {
                KWHzl("endCall: Remote already accepted, sending COMPLETE with duration=0");
                StateListAnimator stateListAnimator4 = this.AEQbTJ;
                if (stateListAnimator4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator = stateListAnimator4;
                }
                stateListAnimator.AEQbTJ(AbstractC35264nrz.FragmentManager.EZpvd);
                return this.KWHzl.KWHzl(callSessionV2AYXKKw, 0L, continuation);
            }
            StateListAnimator stateListAnimator5 = this.AEQbTJ;
            if (stateListAnimator5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                stateListAnimator = stateListAnimator5;
            }
            stateListAnimator.AEQbTJ(AbstractC35264nrz.FragmentManager.EZpvd);
            return this.KWHzl.EZpvd(callSessionV2AYXKKw, continuation);
        }
        KWHzl("endCall: REJECTED - no active call (" + C56524yIo.AEQbTJ(callStateV2Invoke.getClass()).valueOf() + ")");
        return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.PendingIntent("No active call to end"));
    }

    public final void KWHzl(java.lang.String str) {
        C44124sEe.imLogVoiceCall$default("PrivateCallManager: " + str, null, 2, null);
    }
}
