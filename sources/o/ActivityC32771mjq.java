package o;

import android.app.ActivityManager;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.components.security.scanner.DeviceScanner;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC32771mjq;
import o.C32113mPz;
import o.C32726miy;
import o.C32788mkG;
import o.C32808mka;
import o.ServiceC32756mjb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC32771mjq extends AbstractActivityC33041mov implements InterfaceC32766mjl {
    public C32808mka AYXKKw;
    public boolean AhwBna;
    public C32808mka gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static final java.lang.String copydefault = "showLastRecord";
    public static final java.lang.String EZpvd = "scene";
    public java.util.List<EnsecureAppInfo> KWHzl = new java.util.ArrayList();
    public final C58216yxB AEQbTJ = new C58216yxB();

    public final boolean djBIcL() {
        return getIntent().getBooleanExtra(copydefault, false);
    }

    public final java.lang.String gEmmrt() {
        java.lang.String stringExtra = getIntent().getStringExtra(EZpvd);
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX INFO: renamed from: o.mjq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mjq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void start$default(Application application, android.content.Context context, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            application.EZpvd(context, str, z, z2);
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (C33482mxL.KWHzl()) {
                KWHzl(context);
                return;
            }
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC32771mjq.class);
            intent.putExtra(ActivityC32771mjq.copydefault, z);
            intent.putExtra(ActivityC32771mjq.EZpvd, str);
            if (z2) {
                intent.addFlags(268435456);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) FirebaseAnalytics.Event.LOGIN) && (context instanceof android.app.Activity) && !z2) {
                ((android.app.Activity) context).startActivityForResult(intent, 1001);
            } else {
                context.startActivity(intent);
            }
        }

        public final void KWHzl(final android.content.Context context) {
            java.lang.String string = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C32726miy.Dialog.QfsBiF));
            viewOnClickListenerC54939xaY.EZpvd(C33069mpW.KWHzl(context, C32726miy.Dialog.QUSxYX, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("app", string))));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C32726miy.Dialog.RJOkX), new View.OnClickListener() { // from class: o.mjw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC32771mjq.Application.OLrzqt(viewOnClickListenerC54939xaY, context, view);
                }
            });
            ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C32726miy.Dialog.fetchVPNInfo), (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }

        public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.content.Context context, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
            context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(C33070mpX.AYXKKw(C32113mPz.LoaderManager.copydefault))));
        }

        public final void EZpvd(@NotNull final android.content.Context context, final int i, @NotNull final java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.mjA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC32771mjq.Application.AEQbTJ(context, i, str);
                }
            });
        }

        public static final void AEQbTJ(final android.content.Context context, int i, final java.lang.String str) {
            java.lang.String string;
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null) {
                return;
            }
            C55097xdX c55097xdX = new C55097xdX(activityAEQbTJ, null, 0, 4, null);
            c55097xdX.setOnCloseCallback(new Function0() { // from class: o.mjt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC32771mjq.Application.EZpvd();
                }
            });
            java.lang.String string2 = context.getResources().getString(C32726miy.Dialog.DTwDnp);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55097xdX.setTitle(string2);
            if (i == 0) {
                c55097xdX.setMessage(context.getResources().getString(C32726miy.Dialog.QKVWgx));
                c55097xdX.setState(2);
                string = context.getResources().getString(C32726miy.Dialog.OcIXYQ);
            } else {
                c55097xdX.setMessage(pTD.EZpvd(context, C32726miy.Application.copydefault, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i)))));
                c55097xdX.setState(5);
                string = context.getResources().getString(C32726miy.Dialog.ORxRYg);
            }
            c55097xdX.copydefault((java.lang.String) null, (Function0<Unit>) null);
            c55097xdX.OLrzqt(string, new Function0() { // from class: o.mju
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC32771mjq.Application.OLrzqt(context, str);
                }
            });
            c55097xdX.setType(1);
            c55097xdX.setCloseBtnShow(true);
            C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 600000L, 0, 0, 0, 28, null);
        }

        public static final Unit EZpvd() {
            C57656ymY.OLrzqt.valueOf();
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(android.content.Context context, java.lang.String str) {
            ActivityC32771mjq.Companion.EZpvd(context, str, true, true);
            C57656ymY.OLrzqt.valueOf();
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C32726miy.ActionBar.copydefault);
        fARcdN();
        this.AhwBna = djBIcL();
        fetchVPNInfo();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.AEQbTJ.OLrzqt();
        fARcdN();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.AEQbTJ.OLrzqt();
    }

    public final void fetchVPNInfo() {
        int iOLrzqt = OLrzqt();
        if (iOLrzqt == DeviceScanner.ScannerStatus.START.getValue()) {
            values();
            return;
        }
        DeviceScanner.ScannerStatus scannerStatus = DeviceScanner.ScannerStatus.RUNNING;
        if (iOLrzqt == scannerStatus.getValue()) {
            C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, scannerStatus.getValue(), null, 2, null);
            isConnected();
            return;
        }
        DeviceScanner.ScannerStatus scannerStatus2 = DeviceScanner.ScannerStatus.COMPLETED;
        if (iOLrzqt == scannerStatus2.getValue()) {
            this.AhwBna = true;
            C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, scannerStatus2.getValue(), null, 2, null);
            EZpvd(this.AhwBna);
        } else if (iOLrzqt == DeviceScanner.ScannerStatus.PENDING.getValue()) {
            isConnected();
        } else if (this.AhwBna) {
            C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, scannerStatus2.getValue(), null, 2, null);
            EZpvd(this.AhwBna);
        } else {
            values();
        }
    }

    public final void fARcdN() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C32764mjj.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(C33024moe.KWHzl(abstractC58185ywXKWHzl), this, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.mjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC32771mjq.copydefault(this.EZpvd, (C32764mjj) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC32771mjq.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.mjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC32771mjq.OLrzqt((java.lang.Throwable) obj);
            }
        };
        this.AEQbTJ.AEQbTJ(abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mjx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC32771mjq.EZpvd(function12, obj);
            }
        }));
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC32771mjq activityC32771mjq, C32764mjj c32764mjj) {
        if (c32764mjj.EZpvd() == 0) {
            activityC32771mjq.KWHzl = c32764mjj.OLrzqt();
            C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, DeviceScanner.ScannerStatus.COMPLETED.getValue(), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void values() {
        AkhnZx();
        isConnected();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mka.TaskDescription.newInstance$default(o.mka$TaskDescription, boolean, boolean, java.lang.String, int, java.lang.Object):o.mka */
    public final void isConnected() {
        C32808mka c32808mkaNewInstance$default = C32808mka.TaskDescription.newInstance$default(C32808mka.Companion, false, false, gEmmrt(), 2, null);
        this.AYXKKw = c32808mkaNewInstance$default;
        C32808mka c32808mka = null;
        if (c32808mkaNewInstance$default == null) {
            Intrinsics.gEmmrt("");
            c32808mkaNewInstance$default = null;
        }
        c32808mkaNewInstance$default.AEQbTJ(this);
        C32808mka c32808mka2 = this.AYXKKw;
        if (c32808mka2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32808mka = c32808mka2;
        }
        OLrzqt(c32808mka);
    }

    public static /* synthetic */ void showScanResultFragment$default(ActivityC32771mjq activityC32771mjq, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        activityC32771mjq.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        C32808mka c32808mkaEZpvd = C32808mka.Companion.EZpvd(true, z, gEmmrt());
        this.gEmmrt = c32808mkaEZpvd;
        C32808mka c32808mka = null;
        if (c32808mkaEZpvd == null) {
            Intrinsics.gEmmrt("");
            c32808mkaEZpvd = null;
        }
        c32808mkaEZpvd.AEQbTJ(this);
        C32808mka c32808mka2 = this.gEmmrt;
        if (c32808mka2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32808mka = c32808mka2;
        }
        OLrzqt(c32808mka);
    }

    private final void OLrzqt(androidx.fragment.app.Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(C32726miy.Activity.isConnected, fragment).commit();
    }

    @Override // o.InterfaceC32766mjl
    public void EZpvd() {
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        if (Intrinsics.EZpvd((java.lang.Object) gEmmrt(), (java.lang.Object) FirebaseAnalytics.Event.LOGIN)) {
            DbNXlk();
        }
        super.finish();
    }

    public final void DbNXlk() {
        int iOLrzqt = OLrzqt();
        if (iOLrzqt == DeviceScanner.ScannerStatus.COMPLETED.getValue()) {
            getTAG();
            setResult(1002);
        } else if (iOLrzqt == DeviceScanner.ScannerStatus.IDLE.getValue()) {
            getTAG();
            setResult(1003);
        } else {
            getTAG();
            setResult(1004);
        }
    }

    public void AkhnZx() {
        if (AhwBna()) {
            C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, DeviceScanner.ScannerStatus.PENDING.getValue(), null, 2, null);
            isConnected();
        } else {
            AYXKKw();
        }
    }

    @Override // o.InterfaceC32766mjl
    public void KWHzl() {
        this.KWHzl.clear();
        C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, DeviceScanner.ScannerStatus.START.getValue(), null, 2, null);
        values();
    }

    public final void AYXKKw() {
        C32866mlf.onEvent$default("DeviceScanning_Total_Button_View", (TrackChannel[]) null, new Function1() { // from class: o.mjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC32771mjq.EZpvd(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, DeviceScanner.ScannerStatus.START.getValue(), null, 2, null);
        isConnected();
        ServiceC32756mjb.Application.start$default(ServiceC32756mjb.Companion, this, 0, gEmmrt(), 2, null);
    }

    public static final Unit EZpvd(ActivityC32771mjq activityC32771mjq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("total", "1", false);
        EventParamsList.put$default(eventParamsList, "scene", C32677miB.OLrzqt.KWHzl(activityC32771mjq.gEmmrt()), false, 4, null);
        return Unit.INSTANCE;
    }

    public final int OLrzqt() {
        int scanstatus$default = C32788mkG.StateListAnimator.readScanstatus$default(C32788mkG.Companion, null, 1, null);
        return (scanstatus$default != DeviceScanner.ScannerStatus.RUNNING.getValue() || valueOf()) ? scanstatus$default : DeviceScanner.ScannerStatus.IDLE.getValue();
    }

    public final boolean AhwBna() {
        return C32788mkG.Companion.gEmmrt("status_background") == DeviceScanner.ScannerStatus.RUNNING_BACKGROUND.getValue() && valueOf();
    }

    public final boolean valueOf() {
        java.lang.Object systemService = getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        java.util.List<ActivityManager.RunningServiceInfo> runningServices = ((android.app.ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE);
        Intrinsics.checkNotNullExpressionValue(runningServices, "");
        if (!(runningServices instanceof java.util.Collection) || !runningServices.isEmpty()) {
            java.util.Iterator<T> it = runningServices.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), (java.lang.Object) ServiceC32756mjb.class.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
