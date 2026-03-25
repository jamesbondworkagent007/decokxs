package o;

import com.okinc.im.call.domain.CallSignalProcessor$handleIncomingCall$2;
import com.okinc.im.call.domain.CallSignalProcessor$startObserving$1;
import com.okinc.im.call.model.CallDirection;
import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallStateV2;
import com.okinc.im.call.model.CallType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35238nrZ;
import o.AbstractC35264nrz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35220nrH {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public Function0<? extends CallStateV2> AEQbTJ;
    public final InterfaceC35234nrV AhwBna;
    public StateListAnimator EZpvd;
    public ActionBar KWHzl;
    public boolean copydefault;
    public CoroutineScope valueOf;

    /* JADX INFO: renamed from: o.nrH$ActionBar */
    public interface ActionBar {
        java.lang.Object EZpvd(@NotNull AbstractC35238nrZ.PendingIntent pendingIntent, @NotNull Continuation<? super Unit> continuation);

        void OLrzqt(@NotNull AbstractC35238nrZ.Dialog dialog);

        void copydefault(@NotNull AbstractC35238nrZ.FragmentManager fragmentManager);
    }

    /* JADX INFO: renamed from: o.nrH$StateListAnimator */
    public interface StateListAnimator {
        void OLrzqt(@NotNull AbstractC35264nrz abstractC35264nrz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull CoroutineScope coroutineScope, @NotNull Function0<? extends CallStateV2> function0, @NotNull StateListAnimator stateListAnimator, @NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.valueOf = coroutineScope;
        this.AEQbTJ = function0;
        this.EZpvd = stateListAnimator;
        this.KWHzl = actionBar;
    }

    @yCM
    public C35220nrH(@NotNull InterfaceC35234nrV interfaceC35234nrV) {
        Intrinsics.checkNotNullParameter(interfaceC35234nrV, "");
        this.AhwBna = interfaceC35234nrV;
    }

    /* JADX INFO: renamed from: o.nrH$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AhwBna() {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2 = this.valueOf;
        if (coroutineScope2 == null) {
            Intrinsics.gEmmrt("");
            coroutineScope = null;
        } else {
            coroutineScope = coroutineScope2;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CallSignalProcessor$startObserving$1(this, null), 3, null);
    }

    public final java.lang.Object OLrzqt(AbstractC35238nrZ abstractC35238nrZ, Continuation<? super Unit> continuation) {
        AEQbTJ("handleCallSignal: " + abstractC35238nrZ);
        if (abstractC35238nrZ instanceof AbstractC35238nrZ.Fragment) {
            java.lang.Object objAEQbTJ = AEQbTJ((AbstractC35238nrZ.Fragment) abstractC35238nrZ, continuation);
            return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
        }
        if (abstractC35238nrZ instanceof AbstractC35238nrZ.StateListAnimator) {
            AEQbTJ();
        } else {
            ActionBar actionBar = null;
            StateListAnimator stateListAnimator = null;
            StateListAnimator stateListAnimator2 = null;
            StateListAnimator stateListAnimator3 = null;
            StateListAnimator stateListAnimator4 = null;
            StateListAnimator stateListAnimator5 = null;
            StateListAnimator stateListAnimator6 = null;
            ActionBar actionBar2 = null;
            ActionBar actionBar3 = null;
            if (abstractC35238nrZ instanceof AbstractC35238nrZ.VoiceInteractor) {
                StateListAnimator stateListAnimator7 = this.EZpvd;
                if (stateListAnimator7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator = stateListAnimator7;
                }
                stateListAnimator.OLrzqt(AbstractC35264nrz.AssistContent.AEQbTJ);
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.ActionBar) {
                StateListAnimator stateListAnimator8 = this.EZpvd;
                if (stateListAnimator8 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator2 = stateListAnimator8;
                }
                stateListAnimator2.OLrzqt(AbstractC35264nrz.SharedElementCallback.OLrzqt);
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.Application) {
                StateListAnimator stateListAnimator9 = this.EZpvd;
                if (stateListAnimator9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator3 = stateListAnimator9;
                }
                stateListAnimator3.OLrzqt(AbstractC35264nrz.TaskStackBuilder.KWHzl);
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.ComponentName) {
                AEQbTJ("handleCallSignal: CALL_SIGNAL_TERMINATE from remote, treating as hangup");
                StateListAnimator stateListAnimator10 = this.EZpvd;
                if (stateListAnimator10 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator4 = stateListAnimator10;
                }
                stateListAnimator4.OLrzqt(AbstractC35264nrz.TaskStackBuilder.KWHzl);
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.PictureInPictureParams) {
                StateListAnimator stateListAnimator11 = this.EZpvd;
                if (stateListAnimator11 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator5 = stateListAnimator11;
                }
                stateListAnimator5.OLrzqt(AbstractC35264nrz.ComponentCallbacks2.copydefault);
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.TaskDescription) {
                KWHzl();
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.SharedElementCallback) {
                OLrzqt();
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.TaskStackBuilder) {
                this.copydefault = false;
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.BroadcastReceiver) {
                StateListAnimator stateListAnimator12 = this.EZpvd;
                if (stateListAnimator12 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    stateListAnimator6 = stateListAnimator12;
                }
                stateListAnimator6.OLrzqt(AbstractC35264nrz.ComponentName.AEQbTJ);
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.ClipData) {
                copydefault();
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.LoaderManager) {
                EZpvd();
            } else if (abstractC35238nrZ instanceof AbstractC35238nrZ.Activity) {
                KWHzl((AbstractC35238nrZ.Activity) abstractC35238nrZ);
            } else if (!(abstractC35238nrZ instanceof AbstractC35238nrZ.AssistContent)) {
                if (abstractC35238nrZ instanceof AbstractC35238nrZ.PendingIntent) {
                    ActionBar actionBar4 = this.KWHzl;
                    if (actionBar4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        actionBar2 = actionBar4;
                    }
                    java.lang.Object objEZpvd = actionBar2.EZpvd((AbstractC35238nrZ.PendingIntent) abstractC35238nrZ, continuation);
                    return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
                }
                if (abstractC35238nrZ instanceof AbstractC35238nrZ.Dialog) {
                    ActionBar actionBar5 = this.KWHzl;
                    if (actionBar5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        actionBar3 = actionBar5;
                    }
                    actionBar3.OLrzqt((AbstractC35238nrZ.Dialog) abstractC35238nrZ);
                } else {
                    if (!(abstractC35238nrZ instanceof AbstractC35238nrZ.FragmentManager)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActionBar actionBar6 = this.KWHzl;
                    if (actionBar6 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        actionBar = actionBar6;
                    }
                    actionBar.copydefault((AbstractC35238nrZ.FragmentManager) abstractC35238nrZ);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(AbstractC35238nrZ.Fragment fragment, Continuation<? super Unit> continuation) {
        CoroutineScope coroutineScope;
        Function0<? extends CallStateV2> function0 = this.AEQbTJ;
        StateListAnimator stateListAnimator = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallStateV2 callStateV2Invoke = function0.invoke();
        if (callStateV2Invoke.OLrzqt()) {
            CallSessionV2 callSessionV2AEQbTJ = callStateV2Invoke.AEQbTJ();
            if (Intrinsics.EZpvd((java.lang.Object) (callSessionV2AEQbTJ != null ? callSessionV2AEQbTJ.AYXKKw() : null), (java.lang.Object) fragment.OLrzqt())) {
                AEQbTJ("handleIncomingCall: Duplicate INIT for current call (conversationId=" + fragment.OLrzqt() + "), ignoring");
            } else {
                AEQbTJ("handleIncomingCall: Already in call, rejecting different call");
                CoroutineScope coroutineScope2 = this.valueOf;
                if (coroutineScope2 == null) {
                    Intrinsics.gEmmrt("");
                    coroutineScope = null;
                } else {
                    coroutineScope = coroutineScope2;
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CallSignalProcessor$handleIncomingCall$2(fragment, this, null), 3, null);
            }
            return Unit.INSTANCE;
        }
        java.lang.String strKWHzl = C44157sFk.KWHzl();
        if (strKWHzl == null) {
            return Unit.INSTANCE;
        }
        CallSessionV2 callSessionV2Copydefault = fragment.copydefault(strKWHzl);
        StateListAnimator stateListAnimator2 = this.EZpvd;
        if (stateListAnimator2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            stateListAnimator = stateListAnimator2;
        }
        stateListAnimator.OLrzqt(new AbstractC35264nrz.Application(callSessionV2Copydefault));
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        Function0<? extends CallStateV2> function0 = this.AEQbTJ;
        StateListAnimator stateListAnimator = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallStateV2 callStateV2Invoke = function0.invoke();
        if ((callStateV2Invoke instanceof CallStateV2.Ringing) && ((CallStateV2.Ringing) callStateV2Invoke).valueOf() == CallDirection.INCOMING) {
            StateListAnimator stateListAnimator2 = this.EZpvd;
            if (stateListAnimator2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                stateListAnimator = stateListAnimator2;
            }
            stateListAnimator.OLrzqt(AbstractC35264nrz.ActionBar.EZpvd);
        }
    }

    public final void OLrzqt() {
        this.copydefault = true;
        StateListAnimator stateListAnimator = this.EZpvd;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        stateListAnimator.OLrzqt(AbstractC35264nrz.TaskDescription.AEQbTJ);
    }

    public final void AEQbTJ() {
        StateListAnimator stateListAnimator = this.EZpvd;
        StateListAnimator stateListAnimator2 = null;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        stateListAnimator.OLrzqt(AbstractC35264nrz.VoiceInteractor.KWHzl);
        if (this.copydefault) {
            AEQbTJ("handleAccepted: Re-emitting ChannelJoined (Agora joined before ACCEPT)");
            StateListAnimator stateListAnimator3 = this.EZpvd;
            if (stateListAnimator3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                stateListAnimator2 = stateListAnimator3;
            }
            stateListAnimator2.OLrzqt(AbstractC35264nrz.TaskDescription.AEQbTJ);
        }
    }

    public final void copydefault() {
        Function0<? extends CallStateV2> function0 = this.AEQbTJ;
        StateListAnimator stateListAnimator = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallStateV2 callStateV2Invoke = function0.invoke();
        if (callStateV2Invoke instanceof CallStateV2.Connected) {
            if (((CallStateV2.Connected) callStateV2Invoke).AYXKKw().AuCTel()) {
                AEQbTJ("handleRemoteLeft: Ignoring for group call");
            } else {
                StateListAnimator stateListAnimator2 = this.EZpvd;
                if (stateListAnimator2 == null) {
                    Intrinsics.gEmmrt("");
                    stateListAnimator2 = null;
                }
                stateListAnimator2.OLrzqt(AbstractC35264nrz.BroadcastReceiver.KWHzl);
            }
        }
        if ((callStateV2Invoke instanceof CallStateV2.Connecting) && ((CallStateV2.Connecting) callStateV2Invoke).AYXKKw().djBIcL() == CallType.QUEUE) {
            StateListAnimator stateListAnimator3 = this.EZpvd;
            if (stateListAnimator3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                stateListAnimator = stateListAnimator3;
            }
            stateListAnimator.OLrzqt(AbstractC35264nrz.TaskStackBuilder.KWHzl);
        }
    }

    public final void EZpvd() {
        Function0<? extends CallStateV2> function0 = this.AEQbTJ;
        StateListAnimator stateListAnimator = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallSessionV2 callSessionV2AEQbTJ = function0.invoke().AEQbTJ();
        CallType callTypeDjBIcL = callSessionV2AEQbTJ != null ? callSessionV2AEQbTJ.djBIcL() : null;
        if (callTypeDjBIcL == CallType.P2P) {
            StateListAnimator stateListAnimator2 = this.EZpvd;
            if (stateListAnimator2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                stateListAnimator = stateListAnimator2;
            }
            stateListAnimator.OLrzqt(AbstractC35264nrz.StateListAnimator.copydefault);
            return;
        }
        AEQbTJ("handleConnectionBanned: Non-P2P (" + callTypeDjBIcL + "), treating as RemoteHangup");
        StateListAnimator stateListAnimator3 = this.EZpvd;
        if (stateListAnimator3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            stateListAnimator = stateListAnimator3;
        }
        stateListAnimator.OLrzqt(AbstractC35264nrz.TaskStackBuilder.KWHzl);
    }

    public final void KWHzl(AbstractC35238nrZ.Activity activity) {
        Function0<? extends CallStateV2> function0 = this.AEQbTJ;
        StateListAnimator stateListAnimator = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallSessionV2 callSessionV2AEQbTJ = function0.invoke().AEQbTJ();
        CallType callTypeDjBIcL = callSessionV2AEQbTJ != null ? callSessionV2AEQbTJ.djBIcL() : null;
        if (callTypeDjBIcL == CallType.P2P) {
            StateListAnimator stateListAnimator2 = this.EZpvd;
            if (stateListAnimator2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                stateListAnimator = stateListAnimator2;
            }
            stateListAnimator.OLrzqt(new AbstractC35264nrz.Activity(new java.lang.Exception("Agora error: " + activity.KWHzl())));
            return;
        }
        AEQbTJ("handleAgoraError: AgoraError(" + activity.KWHzl() + ") for " + callTypeDjBIcL + ", treating as RemoteHangup");
        StateListAnimator stateListAnimator3 = this.EZpvd;
        if (stateListAnimator3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            stateListAnimator = stateListAnimator3;
        }
        stateListAnimator.OLrzqt(AbstractC35264nrz.TaskStackBuilder.KWHzl);
    }

    public final void AEQbTJ(java.lang.String str) {
        C44124sEe.imLogVoiceCall$default("CallSignalProcessor: " + str, null, 2, null);
    }
}
