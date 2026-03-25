package o;

import android.view.View;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity;
import com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams;
import com.okinc.im.imui.messages.audio.call.model.CallRequest;
import com.okinc.im.imui.messages.audio.call.model.CallStatus;
import com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1;
import com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$groupInfo$1;
import com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1;
import com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1;
import com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$showMediaCallNoticeView$1;
import com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$startObservingCallTimer$1;
import com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$subscribeToAudioCallCommands$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.im.AudioCallStatus;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.AbstractC37160oob;
import o.AbstractC37171oom;
import o.ActivityC42573rXw;
import o.C35399nuc;
import o.C37159ooa;
import o.C44124sEe;
import o.InterfaceC35259nru;
import o.InterfaceC35336ntR;
import o.oHA;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.oos, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ServiceC37177oos extends android.app.Service implements InterfaceC35215nrC {
    public static volatile boolean EZpvd;
    public Job KWHzl;
    public Job values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ooq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ServiceC37177oos.fJNWhG(this.OLrzqt);
        }
    });
    public final C37165oog fetchVPNInfo = new C37165oog(new InterfaceC37144ooL() { // from class: o.oot
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC37144ooL
        public final void copydefault(CallStatus callStatus, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
            ServiceC37177oos.EZpvd(this.KWHzl, callStatus, oKCallDisconnectedReason);
        }
    });
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public final CoroutineScope djBIcL = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(sDN.copydefault.AEQbTJ()));
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ooC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ServiceC37177oos.fARcdN(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ooI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ServiceC37177oos.AkhnZx(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ooE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ServiceC37177oos.AuCTel(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ooH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ServiceC37177oos.getFieldNames(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.oos$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AudioCallStatus.values().length];
            try {
                iArr[AudioCallStatus.OnCallIn.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AudioCallStatus.OnCallOut.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioCallStatus.Idle.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioCallStatus.CallInComing.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioCallStatus.CallOutGoing.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35215nrC
    public void AEQbTJ(@NotNull C44455sQl c44455sQl, boolean z) {
        Intrinsics.checkNotNullParameter(c44455sQl, "");
    }

    /* JADX INFO: renamed from: o.oos$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oos.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final boolean AEQbTJ() {
            return ServiceC37177oos.EZpvd;
        }

        public final long EZpvd() {
            return C37170ool.AEQbTJ.AEQbTJ().getValue().longValue();
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull AbstractC37162ood abstractC37162ood) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(abstractC37162ood, "");
            return AbstractC37162ood.Companion.KWHzl(context, abstractC37162ood);
        }
    }

    public final C37161ooc AkhnZx() {
        return (C37161ooc) this.AYXKKw.getValue();
    }

    public static final C37161ooc fJNWhG(ServiceC37177oos serviceC37177oos) {
        return new C37161ooc(serviceC37177oos, "okex_im", "okex", MTAnalysisConstants.MainWhat.INIT);
    }

    public static final void EZpvd(ServiceC37177oos serviceC37177oos, CallStatus callStatus, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
        Intrinsics.checkNotNullParameter(callStatus, "");
        serviceC37177oos.AEQbTJ(callStatus, oKCallDisconnectedReason);
    }

    public final C37147ooO values() {
        return this.fetchVPNInfo.copydefault();
    }

    public static final C37148ooP fARcdN(ServiceC37177oos serviceC37177oos) {
        return new C37148ooP(serviceC37177oos);
    }

    public final C37148ooP fetchVPNInfo() {
        return (C37148ooP) this.valueOf.getValue();
    }

    public static final C35902oHy AkhnZx(ServiceC37177oos serviceC37177oos) {
        return new C35902oHy(serviceC37177oos);
    }

    public final C35902oHy AhwBna() {
        return (C35902oHy) this.AEQbTJ.getValue();
    }

    public static final oHA AuCTel(ServiceC37177oos serviceC37177oos) {
        return new oHA(serviceC37177oos, null, 0, 6, null);
    }

    public final oHA isConnected() {
        return (oHA) this.OLrzqt.getValue();
    }

    public final InterfaceC35259nru gEmmrt() {
        return C37127onv.AEQbTJ.AhwBna();
    }

    public final OKCallSession valueOf() {
        return gEmmrt().OLrzqt().getSecond();
    }

    public final C37169ook DbNXlk() {
        return (C37169ook) this.AhwBna.getValue();
    }

    public static final C37169ook getFieldNames(ServiceC37177oos serviceC37177oos) {
        android.content.Context applicationContext = serviceC37177oos.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return ((InterfaceC35331ntM) C58114yvF.OLrzqt(applicationContext, InterfaceC35331ntM.class)).DCJXGO();
    }

    /* JADX INFO: renamed from: o.oos$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oos.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.oos$Application$StateListAnimator */
        public static final class StateListAnimator extends Application {
            public final java.lang.String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((StateListAnimator) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ShowBeingBlockedDialog(remoteUserId=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        private Application() {
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C44124sEe.imLogVoiceCall$default("service:onCreate", null, 2, null);
        AkhnZx().EZpvd();
        AkhnZx().copydefault(values().EZpvd(), values().AEQbTJ());
        gEmmrt().AEQbTJ(this);
        getFieldNames();
        zLjUOn();
        AubY();
    }

    public final void zLjUOn() {
        zsXlph();
        AuCTelauCTel();
    }

    /* JADX INFO: renamed from: o.oos$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ServiceC37177oos AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ServiceC37177oos serviceC37177oos) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = serviceC37177oos;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd((C44455sQl) null, false);
                this.AEQbTJ.AhwBna().OLrzqt();
            }
        }
    }

    public final void AubY() {
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new OKIMAudioCallFloatingViewService$subscribeToAudioCallCommands$1(this, null), 3, null);
    }

    public final void zsXlph() {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("day_night_change");
        final java.lang.Object obj = this.gEmmrt;
        abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<java.lang.String>(obj) { // from class: com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$subscribeToDayNightChanges$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                C44124sEe.imLogVoiceCall$default("service:event_received_day_night_change event[" + str + "]", null, 2, null);
                this.this$0.AhwBna().fJNWhG();
            }
        });
    }

    public final void AuCTelauCTel() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(ActivityC42573rXw.Activity.class, new java.lang.String[0]).KWHzl(C58266yxz.OLrzqt());
        final java.lang.Object obj = this.gEmmrt;
        abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<ActivityC42573rXw.Activity>(obj) { // from class: com.okinc.im.imui.messages.audio.call.service.OKIMAudioCallFloatingViewService$subscribeToVoiceCallSetupResults$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(ActivityC42573rXw.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                this.this$0.EZpvd(activity);
            }
        });
    }

    public final void EZpvd(ActivityC42573rXw.Activity activity) {
        int iEZpvd = activity.EZpvd();
        boolean z = activity.KWHzl().getBoolean("KEY_IS_FROM_NOTICE", false);
        java.lang.String string = activity.KWHzl().getString("key_audio_call_target_id");
        java.util.ArrayList<java.lang.String> stringArrayList = activity.KWHzl().getStringArrayList("key_group_call_target_uid_list");
        boolean z2 = !(string == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string));
        java.lang.String strAYXKKw = null;
        C44124sEe.imLogVoiceCall$default("service:event_received_voice_call_setup_result resultCode[" + iEZpvd + "] isFromNoticeView[" + z + "] isJoinFromChatScreen[" + z2 + "]", null, 2, null);
        if (iEZpvd != 1) {
            if (iEZpvd == 2) {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.iRxXKY);
            } else if (iEZpvd == 3) {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.DAIeex);
            }
            C55326xho.toast$default(strAYXKKw, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            fJNWhG();
            return;
        }
        if (z) {
            OLrzqt();
        } else if (z2) {
            KWHzl(string, stringArrayList);
        } else {
            AEQbTJ();
        }
    }

    public final void AEQbTJ(AbstractC37160oob abstractC37160oob) {
        C44124sEe.imLogVoiceCall$default("service:event_received_audio_call_command " + abstractC37160oob.getClass().getSimpleName(), null, 2, null);
        if (Intrinsics.EZpvd(abstractC37160oob, AbstractC37160oob.PendingIntent.OLrzqt)) {
            isConnected().EZpvd();
            AhwBna().AhwBna();
            C37103onX.EZpvd.EZpvd();
            return;
        }
        if (Intrinsics.EZpvd(abstractC37160oob, AbstractC37160oob.ActionBar.copydefault)) {
            AhwBna().OLrzqt();
            return;
        }
        if (Intrinsics.EZpvd(abstractC37160oob, AbstractC37160oob.TaskDescription.EZpvd)) {
            AuCTel();
            return;
        }
        if (Intrinsics.EZpvd(abstractC37160oob, AbstractC37160oob.LoaderManager.KWHzl)) {
            fARcdN();
            return;
        }
        if (Intrinsics.EZpvd(abstractC37160oob, AbstractC37160oob.Application.AEQbTJ)) {
            C37103onX.EZpvd.EZpvd();
            ActivityC42573rXw.Application application = ActivityC42573rXw.Companion;
            android.content.Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            android.content.Intent intentOLrzqt = application.OLrzqt(applicationContext);
            intentOLrzqt.setFlags(268435456);
            startActivity(intentOLrzqt);
            return;
        }
        if (!Intrinsics.EZpvd(abstractC37160oob, AbstractC37160oob.StateListAnimator.KWHzl) && !Intrinsics.EZpvd(abstractC37160oob, AbstractC37160oob.Activity.AEQbTJ)) {
            throw new NoWhenBranchMatchedException();
        }
        fJNWhG();
    }

    public final void AuCTel() {
        isConnected().EZpvd();
        this.fetchVPNInfo.KWHzl(true);
        int i = Activity.EZpvd[gEmmrt().OLrzqt().getFirst().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return;
        }
        if (i == 4) {
            C37103onX.EZpvd.AEQbTJ(this);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            C37103onX.EZpvd.copydefault(this);
        }
    }

    public final void fARcdN() {
        AudioCallStatus first = gEmmrt().OLrzqt().getFirst();
        if (first == AudioCallStatus.CallInComing && !isConnected().isConnected() && !values().AYXKKw()) {
            C44124sEe.imLogVoiceCall$default("service:ACTION_AUDIO_CALL_CALL_IN showing notice view", null, 2, null);
            OKCallSession oKCallSessionValueOf = valueOf();
            if (oKCallSessionValueOf != null) {
                EZpvd(oKCallSessionValueOf);
                C37103onX.EZpvd.AEQbTJ(this);
                return;
            }
            return;
        }
        C44124sEe.imLogVoiceCall$default("service:ACTION_AUDIO_CALL_CALL_IN skipped - status: " + first + ", isShowing: " + isConnected().isConnected() + ", isShowingCallView: " + values().AYXKKw(), null, 2, null);
    }

    public final void AEQbTJ() {
        EZpvd(false);
    }

    public final void OLrzqt() {
        EZpvd(true);
    }

    public final void KWHzl(java.lang.String str, java.util.List<java.lang.String> list) {
        C44124sEe.imLogVoiceCall$default("service:acceptCallFromChatScreen groupId[" + str + "] uidList[" + (list != null ? java.lang.Integer.valueOf(list.size()) : null) + "]", null, 2, null);
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            C44124sEe.imLogVoiceCall$default("service:acceptCallFromChatScreen groupId is null or blank, skip", null, 2, null);
            return;
        }
        this.fetchVPNInfo.copydefault(str, str, true);
        isConnected().EZpvd();
        C37103onX.EZpvd.EZpvd();
        if (list == null || list.isEmpty()) {
            EZpvd(true);
        } else {
            gEmmrt().AEQbTJ(str, list, new Function1() { // from class: o.ooz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ServiceC37177oos.AYXKKw(this.KWHzl, (InterfaceC35336ntR) obj);
                }
            }, new Function0() { // from class: o.ooB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ServiceC37177oos.AhwBna(this.EZpvd);
                }
            });
        }
    }

    public static final Unit AYXKKw(ServiceC37177oos serviceC37177oos, InterfaceC35336ntR interfaceC35336ntR) {
        Intrinsics.checkNotNullParameter(interfaceC35336ntR, "");
        C44124sEe.imLogVoiceCall$default("service:acceptCallFromChatScreen startGroupCall error[" + interfaceC35336ntR + "]", null, 2, null);
        serviceC37177oos.AEQbTJ(interfaceC35336ntR);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ServiceC37177oos serviceC37177oos) {
        C44124sEe.imLogVoiceCall$default("service:acceptCallFromChatScreen startGroupCall success", null, 2, null);
        C37165oog.setStatus$default(serviceC37177oos.fetchVPNInfo, CallStatus.DIALING_OUT, null, 2, null);
        serviceC37177oos.EZpvd((C44455sQl) null, false);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final boolean z) {
        C44124sEe.imLogVoiceCall$default("service:executeAcceptCall isGroupCall[" + values().gEmmrt() + "] conversationId[" + values().EZpvd() + "] shouldShowActivity[" + z + "]", null, 2, null);
        final Function0 function0 = new Function0() { // from class: o.oow
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ServiceC37177oos.KWHzl(this.KWHzl, z);
            }
        };
        if (values().gEmmrt()) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) values().EZpvd())) {
                gEmmrt().AEQbTJ(values().EZpvd(), new Function1() { // from class: o.oov
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ServiceC37177oos.valueOf(this.KWHzl, (InterfaceC35336ntR) obj);
                    }
                }, new Function0() { // from class: o.oox
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ServiceC37177oos.copydefault(function0);
                    }
                });
            }
        } else {
            OKCallSession oKCallSessionValueOf = valueOf();
            java.lang.String callId = oKCallSessionValueOf != null ? oKCallSessionValueOf.getCallId() : null;
            if (callId != null && C33129mqd.OLrzqt((java.lang.CharSequence) callId)) {
                gEmmrt().AEQbTJ(callId);
            }
            function0.invoke();
        }
    }

    public static final Unit KWHzl(ServiceC37177oos serviceC37177oos, boolean z) {
        C37165oog c37165oog = serviceC37177oos.fetchVPNInfo;
        CallStatus callStatus = CallStatus.CONNECTED;
        C37165oog.setStatus$default(c37165oog, callStatus, null, 2, null);
        if (z) {
            serviceC37177oos.EZpvd((C44455sQl) null, true);
            C37127onv c37127onv = C37127onv.AEQbTJ;
            java.lang.String string = serviceC37177oos.getString(C35399nuc.LoaderManager.swzYdv);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c37127onv.copydefault(string);
        } else {
            serviceC37177oos.iwGUEr();
            serviceC37177oos.hDKMBd();
            serviceC37177oos.AhwBna().KWHzl(callStatus, Companion.EZpvd());
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ServiceC37177oos serviceC37177oos, InterfaceC35336ntR interfaceC35336ntR) {
        Intrinsics.checkNotNullParameter(interfaceC35336ntR, "");
        C44124sEe.imLogVoiceCall$default("service:executeAcceptCall joinGroupCall error[" + interfaceC35336ntR + "]", null, 2, null);
        serviceC37177oos.AEQbTJ(interfaceC35336ntR);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0) {
        C44124sEe.imLogVoiceCall$default("service:executeAcceptCall joinGroupCall success", null, 2, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        C44124sEe.imLogVoiceCall$default("service:onStartCommand", null, 2, null);
        AkhnZx().copydefault(values().EZpvd(), values().AEQbTJ());
        uzCIH();
        getNewProxyInstance();
        if (intent != null && !djBIcL(intent)) {
            C44124sEe.imLogVoiceCall$default("service:onStartCommand processIntentAction returned false, stopping service", null, 2, null);
            stopSelf();
            return 2;
        }
        iwGUEr();
        EZpvd = true;
        return 2;
    }

    public final void uzCIH() {
        C35902oHy c35902oHyAhwBna = AhwBna();
        c35902oHyAhwBna.setOnClickListener(new ActionBar(c35902oHyAhwBna, 1000L, this));
    }

    /* JADX INFO: renamed from: o.oos$TaskDescription */
    public static final class TaskDescription implements oHA.StateListAnimator {
        public TaskDescription() {
        }
    }

    public final void getNewProxyInstance() {
        isConnected().setViewNotAccessibleListener(new TaskDescription());
        isConnected().setViewClickListener(new Fragment());
    }

    /* JADX INFO: renamed from: o.oos$Fragment */
    public static final class Fragment implements oHA.TaskDescription {
        public Fragment() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.oog.setStatus$default(o.oog, com.okinc.im.imui.messages.audio.call.model.CallStatus, com.okinc.okimcore.model.im.OKCallCommon$OKCallDisconnectedReason, int, java.lang.Object):void */
        @Override // o.oHA.TaskDescription
        public void EZpvd() {
            ServiceC37177oos.this.isConnected().EZpvd();
            C37165oog.setStatus$default(ServiceC37177oos.this.fetchVPNInfo, CallStatus.DIALING_IN, null, 2, null);
            ServiceC37177oos.this.EZpvd((C44455sQl) null, false);
        }

        @Override // o.oHA.TaskDescription
        public void copydefault() {
            C37103onX.EZpvd.EZpvd();
            ServiceC37177oos.this.isConnected().EZpvd();
            ServiceC37177oos serviceC37177oos = ServiceC37177oos.this;
            ActivityC42573rXw.Application application = ActivityC42573rXw.Companion;
            android.content.Context applicationContext = serviceC37177oos.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            android.content.Intent intentOLrzqt = application.OLrzqt(applicationContext);
            intentOLrzqt.setFlags(268435456);
            android.os.Bundle extras = intentOLrzqt.getExtras();
            if (extras == null) {
                extras = BundleKt.bundleOf();
            }
            extras.putBoolean("KEY_IS_FROM_NOTICE", true);
            intentOLrzqt.putExtras(extras);
            serviceC37177oos.startActivity(intentOLrzqt);
        }

        @Override // o.oHA.TaskDescription
        public void AEQbTJ() {
            C37127onv c37127onv = C37127onv.AEQbTJ;
            java.lang.String string = ServiceC37177oos.this.getString(C35399nuc.LoaderManager.fhwtiV);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c37127onv.copydefault(string);
            ServiceC37177oos.this.fJNWhG();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [491=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r0.equals("action_audio_call_call_in") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r0.equals("action_audio_call_incoming_group_call") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return OLrzqt(r6);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean djBIcL(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("key_audio_call_event");
        if (!Intrinsics.EZpvd((java.lang.Object) stringExtra, (java.lang.Object) "action_audio_call_resume")) {
            this.fetchVPNInfo.OLrzqt((AudioCallUIParams) IntentCompat.getParcelableExtra(intent, "key_audio_call_ui_params", AudioCallUIParams.class));
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -1494158212:
                    if (stringExtra.equals("action_audio_call_resume")) {
                        fIwbmz();
                    }
                    break;
                case -1103680796:
                    if (stringExtra.equals("action_audio_call_join_group_call")) {
                        return EZpvd(intent);
                    }
                    break;
                case -407222038:
                    if (stringExtra.equals("action_audio_call_start_call")) {
                        return AhwBna(intent);
                    }
                    break;
                case -297211416:
                    break;
                case 376819767:
                    break;
                case 533905575:
                    if (stringExtra.equals("action_audio_call_ring_group_call_users")) {
                        return KWHzl(intent);
                    }
                    break;
                case 1114681564:
                    if (stringExtra.equals("action_audio_call_show_floating_directly")) {
                        return copydefault(intent);
                    }
                    break;
                case 1363880362:
                    if (stringExtra.equals("action_audio_call_start_group_call")) {
                        return gEmmrt(intent);
                    }
                    break;
            }
        }
        return true;
    }

    public final void fIwbmz() {
        C44124sEe.imLogVoiceCall$default("service:action_audio_call_resume", null, 2, null);
        EZpvd((C44455sQl) null, false);
        AhwBna().OLrzqt();
    }

    public final boolean OLrzqt(android.content.Intent intent) {
        fetchVPNInfo().copydefault();
        C37165oog.setStatus$default(this.fetchVPNInfo, CallStatus.DIALING_IN, null, 2, null);
        OKCallSession oKCallSession = (OKCallSession) IntentCompat.getParcelableExtra(intent, "key_audio_call_call_session_event", OKCallSession.class);
        if (oKCallSession == null) {
            return false;
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) oKCallSession.getTargetId()) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) oKCallSession.getContactId())) {
            C44124sEe.imLogVoiceCall$default("service:action_audio_call_call_in conversationId[" + oKCallSession.getTargetId() + "] remoteUserId[" + oKCallSession.getContactId() + "] no target id or contact id, kill service...", null, 2, null);
            stopSelf();
            return false;
        }
        this.fetchVPNInfo.copydefault(oKCallSession.getTargetId(), oKCallSession.getContactId(), oKCallSession.getCallType() == OKCallCommon.OKVoiceCallType.GROUP);
        AudioCallUIParams audioCallUIParamsKWHzl = values().KWHzl();
        if (audioCallUIParamsKWHzl != null && audioCallUIParamsKWHzl.copydefault()) {
            Job job = this.KWHzl;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            isConnected().EZpvd();
            this.fetchVPNInfo.KWHzl(true);
            C44124sEe.imLogVoiceCall$default("service:action_audio_call_call_in isFromBackgroundPush=true, skipping presentIncomingCall (activity already started by push handler)", null, 2, null);
            java.lang.String strEZpvd = C44157sFk.EZpvd();
            java.lang.String contactId = oKCallSession.getContactId();
            OKCallCommon.OKVoiceCallType callType = oKCallSession.getCallType();
            if (callType == null) {
                callType = OKCallCommon.OKVoiceCallType.DEFAULT;
            }
            C44124sEe.imLogVoiceCall$default("service:action_audio_call_call_in initialising controller from push: conversationId=" + oKCallSession.getTargetId() + ", localUserId=" + strEZpvd + ", remoteUserId=" + contactId + ", callType=" + callType, null, 2, null);
            gEmmrt().copydefault(oKCallSession.getTargetId(), strEZpvd, contactId, callType);
            C37103onX.EZpvd.AEQbTJ(this);
        } else {
            AEQbTJ(oKCallSession);
        }
        return true;
    }

    public final void AEQbTJ(OKCallSession oKCallSession) {
        if (values().AYXKKw()) {
            C44124sEe.imLogVoiceCall$default("service:presentIncomingCall: skipped, call view already showing", null, 2, null);
            return;
        }
        boolean zValueOf = C32986mnt.EZpvd.valueOf();
        C37119onn c37119onn = C37119onn.copydefault;
        boolean zEZpvd = c37119onn.EZpvd(this);
        boolean zKWHzl = c37119onn.KWHzl(this);
        if (zValueOf) {
            EZpvd(oKCallSession);
            C37103onX.EZpvd.AEQbTJ(this);
            C44124sEe.imLogVoiceCall$default("service:ACTION_AUDIO_CALL_CALL_IN showing notice view (app in foreground)", null, 2, null);
            return;
        }
        if (zEZpvd && zKWHzl) {
            C37103onX.EZpvd.AEQbTJ(this);
            copydefault(oKCallSession);
            C44124sEe.imLogVoiceCall$default("service:ACTION_AUDIO_CALL_CALL_IN showing full-screen intent (all permissions granted)", null, 2, null);
            return;
        }
        C37103onX.EZpvd.AEQbTJ(this);
        EZpvd((C44455sQl) null, false);
        C44124sEe.imLogVoiceCall$default("service:ACTION_AUDIO_CALL_CALL_IN showing regular activity (missing permissions: fullscreen=" + zEZpvd + ", shouldShowFullScreen=" + zKWHzl + ")", null, 2, null);
    }

    public final boolean copydefault(android.content.Intent intent) {
        C37103onX.EZpvd.EZpvd();
        C37165oog c37165oog = this.fetchVPNInfo;
        CallStatus callStatus = CallStatus.CONNECTED;
        C37165oog.setStatus$default(c37165oog, callStatus, null, 2, null);
        final OKCallSession oKCallSession = (OKCallSession) IntentCompat.getParcelableExtra(intent, "key_audio_call_call_session_event", OKCallSession.class);
        if (oKCallSession == null) {
            return false;
        }
        this.fetchVPNInfo.copydefault(new Function1() { // from class: o.ooJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ServiceC37177oos.EZpvd(oKCallSession, (C37147ooO) obj);
            }
        });
        AEQbTJ(intent);
        C35902oHy c35902oHyAhwBna = AhwBna();
        StateListAnimator stateListAnimator = Companion;
        c35902oHyAhwBna.KWHzl(callStatus, stateListAnimator.EZpvd());
        C44124sEe.imLogVoiceCall$default("service:show_floating_directly changeStatus to CONNECTED with time=" + stateListAnimator.EZpvd(), null, 2, null);
        AhwBna().AhwBna();
        hDKMBd();
        return true;
    }

    public static final C37147ooO EZpvd(OKCallSession oKCallSession, C37147ooO c37147ooO) {
        Intrinsics.checkNotNullParameter(c37147ooO, "");
        return C37147ooO.copy$default(c37147ooO, oKCallSession.getTargetId(), oKCallSession.getContactId(), false, null, false, null, 60, null);
    }

    public final void AEQbTJ(android.content.Intent intent) {
        java.lang.Float fValueOf = java.lang.Float.valueOf(intent.getFloatExtra("key_floating_view_x", -1.0f));
        if (fValueOf.floatValue() < 0.0f) {
            fValueOf = null;
        }
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(intent.getFloatExtra("key_floating_view_y", -1.0f));
        if (fValueOf2.floatValue() < 0.0f) {
            fValueOf2 = null;
        }
        if (fValueOf == null || fValueOf2 == null) {
            return;
        }
        AhwBna().setPosition(fValueOf, fValueOf2);
        C44124sEe.imLogVoiceCall$default("service:show_floating_directly with position x=" + fValueOf + ", y=" + fValueOf2, null, 2, null);
    }

    public static final C37147ooO EZpvd(C37147ooO c37147ooO) {
        Intrinsics.checkNotNullParameter(c37147ooO, "");
        return C37147ooO.copy$default(c37147ooO, null, null, false, null, false, null, 59, null);
    }

    public final boolean AhwBna(android.content.Intent intent) {
        final java.lang.String stringExtra;
        final java.lang.String stringExtra2;
        this.fetchVPNInfo.copydefault(new Function1() { // from class: o.ooN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ServiceC37177oos.EZpvd((C37147ooO) obj);
            }
        });
        if (gEmmrt().KWHzl()) {
            EZpvd((C44455sQl) null, false);
            return true;
        }
        try {
            stringExtra = intent.getStringExtra("key_audio_call_target_id");
        } catch (java.lang.Exception e) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            pUU.copydefault("tag", stackTraceString);
        }
        if (stringExtra != null && (stringExtra2 = intent.getStringExtra("key_audio_call_contact_id")) != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra) && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra2)) {
            this.fetchVPNInfo.copydefault(new Function1() { // from class: o.ooK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ServiceC37177oos.OLrzqt(stringExtra, stringExtra2, (C37147ooO) obj);
                }
            });
            gEmmrt().KWHzl(values().EZpvd(), values().AEQbTJ(), new Function1() { // from class: o.ooM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ServiceC37177oos.isConnected(this.OLrzqt, (InterfaceC35336ntR) obj);
                }
            });
            return true;
        }
        return false;
    }

    public static final C37147ooO OLrzqt(java.lang.String str, java.lang.String str2, C37147ooO c37147ooO) {
        Intrinsics.checkNotNullParameter(c37147ooO, "");
        return C37147ooO.copy$default(c37147ooO, str, str2, false, null, false, null, 60, null);
    }

    public static final Unit isConnected(ServiceC37177oos serviceC37177oos, InterfaceC35336ntR interfaceC35336ntR) {
        Intrinsics.checkNotNullParameter(interfaceC35336ntR, "");
        serviceC37177oos.AEQbTJ(interfaceC35336ntR);
        C37103onX.EZpvd.EZpvd();
        return Unit.INSTANCE;
    }

    public final boolean gEmmrt(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("key_audio_call_group_id");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_audio_call_target_uids");
        if (stringExtra == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra) || stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            C44124sEe.imLogVoiceCall$default("service:action_start_group_call groupId[" + stringExtra + "] targetUids[" + (stringArrayListExtra != null ? java.lang.Integer.valueOf(stringArrayListExtra.size()) : null) + "] missing required params, skip", null, 2, null);
            return false;
        }
        C44124sEe.imLogVoiceCall$default("service:action_start_group_call groupId[" + stringExtra + "] targetUids[" + stringArrayListExtra.size() + "]", null, 2, null);
        if (gEmmrt().KWHzl()) {
            C44124sEe.imLogVoiceCall$default("service:action_start_group_call already on call, skip", null, 2, null);
            return true;
        }
        this.fetchVPNInfo.copydefault(stringExtra, stringExtra, true);
        gEmmrt().AEQbTJ(stringExtra, stringArrayListExtra, new Function1() { // from class: o.oop
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ServiceC37177oos.values(this.EZpvd, (InterfaceC35336ntR) obj);
            }
        }, new Function0() { // from class: o.ooy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ServiceC37177oos.ejfBZ(this.AEQbTJ);
            }
        });
        return true;
    }

    public static final Unit values(ServiceC37177oos serviceC37177oos, InterfaceC35336ntR interfaceC35336ntR) {
        Intrinsics.checkNotNullParameter(interfaceC35336ntR, "");
        serviceC37177oos.AEQbTJ(interfaceC35336ntR);
        C37103onX.EZpvd.EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ServiceC37177oos serviceC37177oos) {
        C44124sEe.imLogVoiceCall$default("service:action_start_group_call success, showing activity", null, 2, null);
        C37165oog.setStatus$default(serviceC37177oos.fetchVPNInfo, CallStatus.CONNECTED, null, 2, null);
        serviceC37177oos.EZpvd((C44455sQl) null, false);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("key_audio_call_group_id");
        if (stringExtra == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra)) {
            C44124sEe.imLogVoiceCall$default("service:action_join_group_call groupId[" + stringExtra + "] missing required params, skip", null, 2, null);
            return false;
        }
        C44124sEe.imLogVoiceCall$default("service:action_join_group_call groupId[" + stringExtra + "]", null, 2, null);
        if (gEmmrt().KWHzl()) {
            C44124sEe.imLogVoiceCall$default("service:action_join_group_call already on call, skip", null, 2, null);
            return true;
        }
        this.fetchVPNInfo.copydefault(stringExtra, stringExtra, true);
        gEmmrt().AEQbTJ(stringExtra, new Function1() { // from class: o.ooF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ServiceC37177oos.djBIcL(this.KWHzl, (InterfaceC35336ntR) obj);
            }
        }, new Function0() { // from class: o.ooG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ServiceC37177oos.fIwbmz(this.AEQbTJ);
            }
        });
        return true;
    }

    public static final Unit djBIcL(ServiceC37177oos serviceC37177oos, InterfaceC35336ntR interfaceC35336ntR) {
        Intrinsics.checkNotNullParameter(interfaceC35336ntR, "");
        serviceC37177oos.AEQbTJ(interfaceC35336ntR);
        C37103onX.EZpvd.EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(ServiceC37177oos serviceC37177oos) {
        C44124sEe.imLogVoiceCall$default("service:action_join_group_call success, showing activity", null, 2, null);
        C37165oog.setStatus$default(serviceC37177oos.fetchVPNInfo, CallStatus.CONNECTED, null, 2, null);
        serviceC37177oos.EZpvd((C44455sQl) null, false);
        return Unit.INSTANCE;
    }

    public final boolean KWHzl(android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_audio_call_target_uids");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            C44124sEe.imLogVoiceCall$default("service:action_ring_group_call_users targetUids[" + (stringArrayListExtra != null ? java.lang.Integer.valueOf(stringArrayListExtra.size()) : null) + "] missing required params, skip", null, 2, null);
            return false;
        }
        C44124sEe.imLogVoiceCall$default("service:action_ring_group_call_users targetUids[" + stringArrayListExtra.size() + "]", null, 2, null);
        gEmmrt().OLrzqt(stringArrayListExtra, new Function1() { // from class: o.ooA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ServiceC37177oos.gEmmrt(this.OLrzqt, (InterfaceC35336ntR) obj);
            }
        }, new Function0() { // from class: o.ooD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ServiceC37177oos.EZpvd();
            }
        });
        return true;
    }

    public static final Unit gEmmrt(ServiceC37177oos serviceC37177oos, InterfaceC35336ntR interfaceC35336ntR) {
        Intrinsics.checkNotNullParameter(interfaceC35336ntR, "");
        serviceC37177oos.AEQbTJ(interfaceC35336ntR);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        C44124sEe.imLogVoiceCall$default("service:action_ring_group_call_users success", null, 2, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(InterfaceC35336ntR interfaceC35336ntR) {
        if (interfaceC35336ntR instanceof InterfaceC35336ntR.TaskStackBuilder) {
            java.lang.Throwable thEZpvd = ((InterfaceC35336ntR.TaskStackBuilder) interfaceC35336ntR).EZpvd();
            OKServerException oKServerException = thEZpvd instanceof OKServerException ? (OKServerException) thEZpvd : null;
            if (oKServerException != null && oKServerException.getCode() == 30003) {
                C44124sEe.imLogVoiceCall$default("Need show being blocked dialog", null, 2, null);
                C37127onv.AEQbTJ.KWHzl(new C32989mnw<>(new Application.StateListAnimator(values().AEQbTJ())));
                return;
            }
        }
        C37159ooa.ActionBar actionBarOLrzqt = C37159ooa.copydefault.OLrzqt(interfaceC35336ntR);
        C37127onv c37127onv = C37127onv.AEQbTJ;
        java.lang.String string = getString(actionBarOLrzqt.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(string, "");
        c37127onv.copydefault(string);
        if (actionBarOLrzqt.copydefault()) {
            EZpvd((C44455sQl) null, false);
        }
    }

    public final void EZpvd(C44455sQl c44455sQl, final boolean z) {
        fetchVPNInfo().KWHzl();
        Job job = this.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        isConnected().EZpvd();
        this.fetchVPNInfo.OLrzqt(new Function1() { // from class: o.oou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ServiceC37177oos.copydefault(z, (AudioCallUIParams) obj);
            }
        });
        android.content.Intent intentCopydefault = OKIMAudioCallViewActivity.Companion.copydefault(this, djBIcL());
        intentCopydefault.putExtra("key_audio_call_call_session_event", valueOf());
        intentCopydefault.putExtra("key_audio_call_ui_params", values().KWHzl());
        if (c44455sQl != null) {
            KWHzl(intentCopydefault, c44455sQl);
        }
        startActivity(intentCopydefault);
        AhwBna().KWHzl(values().copydefault(), Companion.EZpvd());
    }

    public static final AudioCallUIParams copydefault(boolean z, AudioCallUIParams audioCallUIParams) {
        AudioCallUIParams audioCallUIParamsAEQbTJ;
        return (audioCallUIParams == null || (audioCallUIParamsAEQbTJ = audioCallUIParams.AEQbTJ((223 & 1) != 0 ? audioCallUIParams.djBIcL : false, (223 & 2) != 0 ? audioCallUIParams.gEmmrt : false, (223 & 4) != 0 ? audioCallUIParams.OLrzqt : false, (223 & 8) != 0 ? audioCallUIParams.EZpvd : null, (223 & 16) != 0 ? audioCallUIParams.KWHzl : null, (223 & 32) != 0 ? audioCallUIParams.valueOf : z, (223 & 64) != 0 ? audioCallUIParams.AEQbTJ : false, (223 & 128) != 0 ? audioCallUIParams.copydefault : false)) == null) ? new AudioCallUIParams(false, false, false, null, null, z, false, false, 223, null) : audioCallUIParamsAEQbTJ;
    }

    public final void KWHzl(android.content.Intent intent, C44455sQl c44455sQl) {
        intent.putExtra("key_audio_call_call_session_event", c44455sQl.AEQbTJ());
        OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReasonOLrzqt = c44455sQl.OLrzqt();
        if (oKCallDisconnectedReasonOLrzqt != null) {
            intent.putExtra("key_audio_call_call_disconnected_reason", oKCallDisconnectedReasonOLrzqt.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(OKCallSession oKCallSession) {
        AudioCallUIParams audioCallUIParams;
        java.lang.Object objM7377constructorimpl;
        fetchVPNInfo().KWHzl();
        boolean z = oKCallSession.getCallType() == OKCallCommon.OKVoiceCallType.GROUP;
        C44124sEe.imLogVoiceCall$default("service:showAudioCallActivityWithFullScreenIntent conversationId[" + oKCallSession.getTargetId() + "] remoteUserId[" + oKCallSession.getContactId() + "] isGroupCall[" + z + "]", null, 2, null);
        android.content.Intent intentCopydefault = OKIMAudioCallViewActivity.Companion.copydefault(this, OLrzqt(oKCallSession));
        intentCopydefault.setFlags(335544320);
        intentCopydefault.putExtra("key_audio_call_call_session_event", oKCallSession);
        AudioCallUIParams audioCallUIParamsKWHzl = values().KWHzl();
        if (audioCallUIParamsKWHzl == null) {
            audioCallUIParams = new AudioCallUIParams(false, false, false, null, null, false, false, false, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, null);
        } else {
            AudioCallUIParams audioCallUIParamsKWHzl2 = values().KWHzl();
            audioCallUIParams = audioCallUIParamsKWHzl.AEQbTJ((223 & 1) != 0 ? audioCallUIParamsKWHzl.djBIcL : false, (223 & 2) != 0 ? audioCallUIParamsKWHzl.gEmmrt : false, (223 & 4) != 0 ? audioCallUIParamsKWHzl.OLrzqt : false, (223 & 8) != 0 ? audioCallUIParamsKWHzl.EZpvd : null, (223 & 16) != 0 ? audioCallUIParamsKWHzl.KWHzl : null, (223 & 32) != 0 ? audioCallUIParamsKWHzl.valueOf : false, (223 & 64) != 0 ? audioCallUIParamsKWHzl.AEQbTJ : audioCallUIParamsKWHzl2 != null ? audioCallUIParamsKWHzl2.AEQbTJ() : false, (223 & 128) != 0 ? audioCallUIParamsKWHzl.copydefault : false);
            if (audioCallUIParams == null) {
            }
        }
        intentCopydefault.putExtra("key_audio_call_ui_params", audioCallUIParams);
        try {
            Result.Application application = Result.Companion;
            startActivity(intentCopydefault);
            C44124sEe.imLogVoiceCall$default("service:showAudioCallActivityWithFullScreenIntent activity launched directly (no notification)", null, 2, null);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.fIwbmz("service:showAudioCallActivityWithFullScreenIntent failed to launch activity", thM7380exceptionOrNullimpl);
        }
    }

    public final CallRequest djBIcL() {
        if (values().gEmmrt()) {
            return new CallRequest.GroupCall(values().EZpvd());
        }
        return new CallRequest.OneToOne(values().EZpvd(), values().AEQbTJ());
    }

    public final CallRequest OLrzqt(OKCallSession oKCallSession) {
        if (oKCallSession.getCallType() == OKCallCommon.OKVoiceCallType.GROUP) {
            return new CallRequest.GroupCall(oKCallSession.getTargetId());
        }
        return new CallRequest.OneToOne(oKCallSession.getTargetId(), oKCallSession.getContactId());
    }

    public final void fJNWhG() {
        isConnected().EZpvd();
        AhwBna().KWHzl(values().copydefault(), Companion.EZpvd());
        wlaJM();
        stopForeground(1);
        stopSelf();
    }

    public final boolean ejfBZ() {
        return fetchVPNInfo().AEQbTJ();
    }

    @Override // android.app.Service
    public void onDestroy() {
        fetchVPNInfo().KWHzl();
        C44124sEe.imLogVoiceCall$default("service:onDestroy", null, 2, null);
        AYXKKw();
        gEmmrt().AEQbTJ(true);
        gEmmrt().KWHzl(true);
        C44124sEe.imLogVoiceCall$default("service:on_destroy setLocalAudioEnable[true] setSpeakerphoneEnable[true]", null, 2, null);
        if (gEmmrt().KWHzl()) {
            C37103onX.EZpvd.EZpvd();
            OKCallSession oKCallSessionValueOf = valueOf();
            java.lang.String callId = oKCallSessionValueOf != null ? oKCallSessionValueOf.getCallId() : null;
            if (callId != null && C33129mqd.OLrzqt((java.lang.CharSequence) callId)) {
                InterfaceC35259nru.TaskDescription.hangUpCall$default(gEmmrt(), callId, java.lang.Long.valueOf(Companion.EZpvd()), false, 4, null);
            }
        }
        CoroutineScopeKt.cancel$default(this.djBIcL, null, 1, null);
        gEmmrt().EZpvd(this);
        SubHelper.AEQbTJ(this.gEmmrt);
        DbNXlk().KWHzl();
        this.fetchVPNInfo.KWHzl();
        EZpvd = false;
        wlaJM();
        Job job = this.values;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return new android.os.Binder();
    }

    public final void EZpvd(OKCallSession oKCallSession) {
        C44124sEe.imLogVoiceCall$default("service:showMediaCallNoticeView conversationId[" + oKCallSession.getTargetId() + "] remoteUserId[" + oKCallSession.getContactId() + "] callerUserId[" + oKCallSession.getCallerUserId() + "] callType[" + oKCallSession.getCallType() + "]", null, 2, null);
        boolean z = oKCallSession.getCallType() == OKCallCommon.OKVoiceCallType.GROUP;
        Job job = this.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.KWHzl = BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new OKIMAudioCallFloatingViewService$showMediaCallNoticeView$1(z, this, oKCallSession, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(InterfaceC35331ntM interfaceC35331ntM, OKCallSession oKCallSession, Continuation<? super kotlin.Pair<java.lang.String, OfficialTagInfo>> continuation) throws java.lang.Throwable {
        OKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1 oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1;
        java.lang.String str;
        if (continuation instanceof OKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1) {
            oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1 = (OKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1) continuation;
            int i = oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1 = new OKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            java.lang.String targetId = oKCallSession.getTargetId();
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            OKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$groupInfo$1 oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$groupInfo$1 = new OKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$groupInfo$1(interfaceC35331ntM, targetId, null);
            oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1.L$0 = targetId;
            oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault, oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$groupInfo$1, oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            str = targetId;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) oKIMAudioCallFloatingViewService$resolveGroupDisplayInfo$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        GroupInfo groupInfo = (GroupInfo) objWithContext;
        if (groupInfo == null) {
            C44124sEe.imLogVoiceCall$default("service:showMediaCallNoticeView: group info is null for groupId=" + str + ", using fallback", null, 2, null);
        }
        java.lang.String name = groupInfo != null ? groupInfo.getName() : null;
        if (name != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) name)) {
            str = name;
        }
        return C56390yDp.OLrzqt(str, groupInfo != null ? groupInfo.getOfficialTags() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(InterfaceC35331ntM interfaceC35331ntM, OKCallSession oKCallSession, Continuation<? super kotlin.Pair<java.lang.String, OfficialTagInfo>> continuation) throws java.lang.Throwable {
        OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1 oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1;
        java.lang.String strAYXKKw;
        if (continuation instanceof OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1) {
            oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1 = (OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1) continuation;
            int i = oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1 = new OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            java.lang.String contactId = oKCallSession.getContactId();
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1 oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1 = new OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1(interfaceC35331ntM, contactId, null);
            oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1.L$0 = contactId;
            oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault, oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1, oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            strAYXKKw = contactId;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strAYXKKw = (java.lang.String) oKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        RelationInfo relationInfo = (RelationInfo) objWithContext;
        if (relationInfo == null) {
            C44124sEe.imLogVoiceCall$default("service:showMediaCallNoticeView: relation info is null for remoteUserId=" + strAYXKKw + ", using fallback", null, 2, null);
        }
        java.lang.String displayName$default = relationInfo != null ? C44157sFk.getDisplayName$default(relationInfo, null, 1, null) : null;
        if (displayName$default != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) displayName$default)) {
            strAYXKKw = displayName$default;
        } else if (C59449zhJ.startsWith$default(strAYXKKw, "-", false, 2, null)) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.gmHjFq);
        }
        return C56390yDp.OLrzqt(strAYXKKw, relationInfo != null ? relationInfo.getOfficialTags() : null);
    }

    public static /* synthetic */ void sendStatusEvent$default(ServiceC37177oos serviceC37177oos, CallStatus callStatus, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            oKCallDisconnectedReason = null;
        }
        serviceC37177oos.AEQbTJ(callStatus, oKCallDisconnectedReason);
    }

    public final void AEQbTJ(CallStatus callStatus, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
        C44124sEe.imLogVoiceCall$default("service:send_status_event status[" + callStatus + "] disconnectReason[" + oKCallDisconnectedReason + "]", null, 2, null);
        DbNXlk().copydefault(new AbstractC37171oom.TaskDescription(callStatus, oKCallDisconnectedReason));
    }

    public final void getFieldNames() {
        this.values = BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new OKIMAudioCallFloatingViewService$startObservingCallTimer$1(this, null), 3, null);
    }

    public final void hDKMBd() {
        C37170ool.AEQbTJ.EZpvd();
    }

    public final void wlaJM() {
        C37170ool.AEQbTJ.gEmmrt();
    }

    public final void iwGUEr() {
        C37161ooc c37161oocAkhnZx = AkhnZx();
        CoroutineScope coroutineScope = this.djBIcL;
        java.lang.String strEZpvd = values().EZpvd();
        java.lang.String strAEQbTJ = values().AEQbTJ();
        boolean zGEmmrt = values().gEmmrt();
        CallRequest callRequestDjBIcL = djBIcL();
        InterfaceC35259nru interfaceC35259nruGEmmrt = gEmmrt();
        Function0<java.lang.Boolean> function0 = new Function0() { // from class: o.oor
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ServiceC37177oos.getNewProxyInstance(this.AEQbTJ));
            }
        };
        AudioCallUIParams audioCallUIParamsKWHzl = values().KWHzl();
        c37161oocAkhnZx.KWHzl(coroutineScope, strEZpvd, strAEQbTJ, zGEmmrt, callRequestDjBIcL, interfaceC35259nruGEmmrt, function0, audioCallUIParamsKWHzl != null ? audioCallUIParamsKWHzl.KWHzl() : null);
    }

    public static final boolean getNewProxyInstance(ServiceC37177oos serviceC37177oos) {
        return serviceC37177oos.ejfBZ();
    }

    public final void AYXKKw() {
        AkhnZx().KWHzl(values().EZpvd(), values().AEQbTJ());
    }

    @Override // o.InterfaceC35215nrC
    public void copydefault(@NotNull C44455sQl c44455sQl) {
        Intrinsics.checkNotNullParameter(c44455sQl, "");
        C44124sEe.imLogVoiceCall$default("service:onCallOutgoingEvent conversationId[" + values().EZpvd() + "] remoteUserId[" + values().AEQbTJ() + "] callOutgoingEvent[" + c44455sQl + "]", null, 2, null);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) values().EZpvd())) {
            return;
        }
        C37165oog.setStatus$default(this.fetchVPNInfo, CallStatus.DIALING_OUT, null, 2, null);
        EZpvd(c44455sQl, false);
    }

    @Override // o.InterfaceC35215nrC
    public void EZpvd(@NotNull C44455sQl c44455sQl) {
        Intrinsics.checkNotNullParameter(c44455sQl, "");
        C44124sEe.imLogVoiceCall$default("service:onCallConnectedEvent conversationId[" + values().EZpvd() + "] remoteUserId[" + values().AEQbTJ() + "] callConnectedEvent[" + c44455sQl + "]", null, 2, null);
        C37103onX.EZpvd.EZpvd();
        C37165oog c37165oog = this.fetchVPNInfo;
        CallStatus callStatus = CallStatus.CONNECTED;
        C37165oog.setStatus$default(c37165oog, callStatus, null, 2, null);
        iwGUEr();
        hDKMBd();
        AhwBna().KWHzl(callStatus, Companion.EZpvd());
        C37127onv c37127onv = C37127onv.AEQbTJ;
        java.lang.String string = getString(C35399nuc.LoaderManager.swzYdv);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c37127onv.copydefault(string);
    }

    @Override // o.InterfaceC35215nrC
    public void KWHzl(@NotNull C44455sQl c44455sQl) {
        Intrinsics.checkNotNullParameter(c44455sQl, "");
        C44124sEe.imLogVoiceCall$default("service:onCallDisconnectedEvent conversationId[" + values().EZpvd() + "] remoteUserId[" + values().AEQbTJ() + "] callSessionEvent[" + c44455sQl + "]", null, 2, null);
        C37103onX.EZpvd.EZpvd();
        this.fetchVPNInfo.OLrzqt(CallStatus.DISCONNECTED, c44455sQl.OLrzqt());
        fJNWhG();
        int iOLrzqt = C37159ooa.copydefault.OLrzqt(c44455sQl.OLrzqt());
        C37127onv c37127onv = C37127onv.AEQbTJ;
        java.lang.String string = getString(iOLrzqt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c37127onv.copydefault(string);
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        super.onTaskRemoved(intent);
        java.lang.String strEZpvd = values().EZpvd();
        boolean z = intent != null;
        C44124sEe.imLogVoiceCall$default("service:onTaskRemoved conversationId[" + strEZpvd + "] hasRootIntent[" + z + "] remoteUserId[" + values().AEQbTJ() + "]", null, 2, null);
        C37165oog.setStatus$default(this.fetchVPNInfo, CallStatus.DISCONNECTED, null, 2, null);
        C37103onX.EZpvd.EZpvd();
        fJNWhG();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
