package o;

import com.google.android.gms.common.util.VisibleForTesting;
import com.okinc.okpush.sdk.config.OKPushConfig;
import com.okinc.okpush.sdk.init.PushInitManager;
import com.okinc.okuser.data.User;
import com.okinc.rxutils.RxBus;
import com.onesignal.OneSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C46926tgQ;
import o.C57763yoZ;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tgQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46926tgQ implements InterfaceC46921tgL {
    public final InterfaceC57812ypV EZpvd;
    public final C43292rmY OLrzqt;
    public final android.content.Context copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46921tgL
    public java.lang.String KWHzl() {
        return "2";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46921tgL
    public java.lang.String OLrzqt() {
        return "OneSignal";
    }

    public C46926tgQ(@NotNull android.content.Context context, @NotNull C43292rmY c43292rmY) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c43292rmY, "");
        this.copydefault = context;
        this.OLrzqt = c43292rmY;
        ActionBar actionBar = new ActionBar();
        this.EZpvd = actionBar;
        OneSignal.EZpvd(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.copydefault(actionBar);
        pUU.KWHzl("OneSignalPushImpl", "OneSignal initWithContext");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        OneSignal.fetchVPNInfo(context);
        pUU.KWHzl("OneSignalPushImpl", "OneSignal initWithContext cost time:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        OneSignal.gEmmrt(OKPushConfig.copydefault.valueOf());
        OneSignal.EZpvd(true);
        gEmmrt();
        OneSignal.copydefault(new OneSignal.PictureInPictureParams() { // from class: o.tgX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.onesignal.OneSignal.PictureInPictureParams
            public final void AEQbTJ(C57746yoI c57746yoI) {
                C46926tgQ.OLrzqt(c57746yoI);
            }
        });
        OneSignal.AEQbTJ(new OneSignal.VoiceInteractor() { // from class: o.tgW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.onesignal.OneSignal.VoiceInteractor
            public final void EZpvd(C57747yoJ c57747yoJ) {
                C46926tgQ.KWHzl(this.EZpvd, c57747yoJ);
            }
        });
        AkhnZx();
        isConnected();
        AYXKKw();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46926tgQ(@NotNull android.content.Context context) {
        this(context, C43292rmY.OLrzqt);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: renamed from: o.tgQ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tgQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.tgQ$ActionBar */
    public static final class ActionBar implements InterfaceC57812ypV {
        @Override // o.InterfaceC57812ypV
        public void AEQbTJ(C57807ypQ c57807ypQ) {
            Intrinsics.checkNotNullParameter(c57807ypQ, "");
            pUU.KWHzl("OneSignalLog", c57807ypQ.KWHzl());
        }
    }

    public static final void OLrzqt(final C57746yoI c57746yoI) {
        C46960tgy.AEQbTJ.copydefault(c57746yoI.KWHzl(), new Function1() { // from class: o.tgU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46926tgQ.EZpvd(c57746yoI, (java.lang.Boolean) obj);
            }
        });
        pUU.KWHzl("OneSignalPushImpl", "willshow: " + c57746yoI.KWHzl().KWHzl());
    }

    public static final Unit EZpvd(C57746yoI c57746yoI, java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            c57746yoI.EZpvd(c57746yoI.KWHzl());
        } else {
            c57746yoI.EZpvd(null);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C46926tgQ c46926tgQ, C57747yoJ c57747yoJ) {
        pUU.KWHzl("OneSignalPushImpl", "Opened: " + c57747yoJ.EZpvd());
        c46926tgQ.KWHzl(c57747yoJ);
    }

    @VisibleForTesting
    public final void AYXKKw() {
        if (djBIcL()) {
            if (!android.text.TextUtils.isEmpty(valueOf())) {
                pUU.KWHzl("OneSignalPushImpl", "checkPlayerIdAndBindInfo, not null, return");
            } else {
                OneSignal.KWHzl(new InterfaceC57756yoS() { // from class: com.okinc.okpush.sdk.service.OneSignalPushImpl$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final void onOSSubscriptionChanged(C57763yoZ c57763yoZ) {
                        C46926tgQ.AEQbTJ(c57763yoZ);
                    }
                });
            }
        }
    }

    public static final void AEQbTJ(C57763yoZ c57763yoZ) {
        pUU.KWHzl("OneSignalPushImpl", "stateChanges.from:" + c57763yoZ.AEQbTJ() + ", stateChanges.to:" + c57763yoZ.copydefault());
        if (c57763yoZ.AEQbTJ().OLrzqt() || !c57763yoZ.copydefault().OLrzqt()) {
            return;
        }
        if (!PushInitManager.OLrzqt.gEmmrt()) {
            pUU.KWHzl("OneSignalPushImpl", "subscription observed after fallback, ignore bind on OneSignal");
            return;
        }
        pUU.KWHzl("OneSignalPushImpl", "stateChanges. playerId:" + c57763yoZ.copydefault().EZpvd());
        C46945tgj.AEQbTJ.AhwBna().OLrzqt("BIND_FROM_ONESIGNAL_CONNECT");
    }

    public final boolean djBIcL() {
        return C43308rmo.KWHzl(OKPushConfig.copydefault.copydefault());
    }

    public final void AkhnZx() {
        if (djBIcL()) {
            if (this.OLrzqt.AwvSrB().values()) {
                pUU.KWHzl("OneSignalPushImpl", "setOneSignalTag isLogin");
                User userOLrzqt = this.OLrzqt.AwvSrB().OLrzqt();
                java.lang.String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
                if (tk == null) {
                    tk = "";
                }
                OneSignal.valueOf(tk);
                OneSignal.KWHzl("isNotLogin");
                return;
            }
            pUU.KWHzl("OneSignalPushImpl", "setOneSignalTag logout");
            OneSignal.EZpvd("isNotLogin", "1");
            OneSignal.ffGIBT();
        }
    }

    public final void isConnected() {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("EVENT_CHANGE_LANGUAGE");
        final java.lang.Object obj = new java.lang.Object();
        abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<java.lang.String>(obj) { // from class: com.okinc.okpush.sdk.service.OneSignalPushImpl$setLanguageChangeListener$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                this.this$0.gEmmrt();
            }
        });
    }

    public final void gEmmrt() {
        OneSignal.djBIcL(C46994thf.OLrzqt.EZpvd());
    }

    @Override // o.InterfaceC46921tgL
    public void AEQbTJ() {
        pUU.KWHzl("OneSignalPushImpl", "isLogin");
        AkhnZx();
    }

    @Override // o.InterfaceC46921tgL
    public void AhwBna() {
        pUU.KWHzl("OneSignalPushImpl", "logout");
        AkhnZx();
    }

    @VisibleForTesting
    public final void KWHzl(C57747yoJ c57747yoJ) {
        if (c57747yoJ == null) {
            pUU.valueOf("OneSignalPushImpl", "onNotificationOpened but result is null");
            return;
        }
        C46938tgc c46938tgc = C46938tgc.copydefault;
        java.lang.String strAEQbTJ = c57747yoJ.EZpvd().AEQbTJ();
        JSONObject jSONObjectKWHzl = c57747yoJ.EZpvd().KWHzl();
        Intrinsics.checkNotNullExpressionValue(jSONObjectKWHzl, "");
        c46938tgc.AEQbTJ(new C46941tgf(null, null, strAEQbTJ, jSONObjectKWHzl, 3, null));
        pUU.EZpvd("OneSignalPushImpl", "onNotificationOpened message dispatched");
    }

    @Override // o.InterfaceC46921tgL
    public java.lang.String EZpvd() {
        return valueOf();
    }

    public final java.lang.String valueOf() {
        C57767yod c57767yodHDKMBd = OneSignal.hDKMBd();
        java.lang.String strEZpvd = c57767yodHDKMBd != null ? c57767yodHDKMBd.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        pUU.KWHzl("OneSignalPushImpl", "getPlayerId : " + strEZpvd);
        return strEZpvd;
    }

    @Override // o.InterfaceC46921tgL
    public java.lang.Boolean copydefault() {
        C57767yod c57767yodHDKMBd = OneSignal.hDKMBd();
        if (c57767yodHDKMBd != null) {
            return java.lang.Boolean.valueOf(c57767yodHDKMBd.KWHzl());
        }
        return null;
    }
}
