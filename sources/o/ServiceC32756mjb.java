package o;

import android.app.ActivityManager;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.components.security.scanner.DeviceScanner;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC32771mjq;
import o.C32788mkG;
import o.ServiceC32756mjb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class ServiceC32756mjb extends android.app.Service {
    public java.lang.String copydefault = "";
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: o.mjb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mjb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void start$default(Application application, android.content.Context context, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 1;
            }
            if ((i2 & 4) != 0) {
                str = "";
            }
            application.copydefault(context, i, str);
        }

        public final void copydefault(@NotNull android.content.Context context, int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ServiceC32756mjb.class);
            intent.putExtra("scan_type", i);
            intent.putExtra("scene", str);
            context.startService(intent);
        }

        public final void KWHzl() {
            if (C32757mjc.Companion.AEQbTJ().AEQbTJ()) {
                C32788mkG.StateListAnimator stateListAnimator = C32788mkG.Companion;
                if (stateListAnimator.gEmmrt("status_background") == DeviceScanner.ScannerStatus.IDLE_BACKGROUND.getValue()) {
                    C43246rlf c43246rlf = C43246rlf.OLrzqt;
                    if (C32786mkE.KWHzl.OLrzqt(c43246rlf.valueOf().getApplicationContext())) {
                        stateListAnimator.OLrzqt(DeviceScanner.ScannerStatus.PENDING_BACKGROUND.getValue(), "status_background");
                        return;
                    }
                    android.content.Context applicationContext = c43246rlf.valueOf().getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    copydefault(applicationContext, 0, "defi");
                }
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        RxBus.AEQbTJ(new C32765mjk(true, 0L, 2, null));
        int intExtra = intent.getIntExtra("scan_type", 1);
        java.lang.String stringExtra = intent.getStringExtra("scene");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.copydefault = stringExtra;
        if (intExtra == 0) {
            copydefault();
            return 2;
        }
        if (intExtra != 1) {
            return 2;
        }
        AEQbTJ();
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        RxBus.AEQbTJ(new C32765mjk(false, 0L, 2, null));
    }

    public final void copydefault() {
        C32796mkO c32796mkO = C32796mkO.EZpvd;
        if (!c32796mkO.OLrzqt(this) || c32796mkO.EZpvd(this)) {
            C32788mkG.StateListAnimator stateListAnimator = C32788mkG.Companion;
            if (C32788mkG.StateListAnimator.readScanstatus$default(stateListAnimator, null, 1, null) == DeviceScanner.ScannerStatus.PENDING.getValue()) {
                C32788mkG.StateListAnimator.recordScanStatus$default(stateListAnimator, DeviceScanner.ScannerStatus.IDLE.getValue(), null, 2, null);
            }
            stateListAnimator.OLrzqt(DeviceScanner.ScannerStatus.RUNNING_BACKGROUND.getValue(), "status_background");
            new DeviceScanner(this).OLrzqt(new StateListAnimator());
        }
    }

    /* JADX INFO: renamed from: o.mjb$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC32767mjm {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC32767mjm
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        public StateListAnimator() {
        }

        @Override // o.InterfaceC32767mjm
        public void KWHzl(java.util.List<EnsecureAppInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (ServiceC32756mjb.this.KWHzl()) {
                RxBus.AEQbTJ(new C32764mjj(list, 1));
            }
        }

        @Override // o.InterfaceC32767mjm
        public void AEQbTJ(java.util.List<EnsecureAppInfo> list) {
            int value;
            Intrinsics.checkNotNullParameter(list, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (EnsecureAppInfo ensecureAppInfo : list) {
                kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(ensecureAppInfo.getPackageName(), ensecureAppInfo.getScanResult());
                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
            }
            C32788mkG.StateListAnimator stateListAnimator = C32788mkG.Companion;
            if (C32788mkG.StateListAnimator.readScanstatus$default(stateListAnimator, null, 1, null) == DeviceScanner.ScannerStatus.PENDING.getValue()) {
                C32788mkG.StateListAnimator.recordLastScanTimestamp$default(stateListAnimator, null, 1, null);
                C32788mkG.StateListAnimator.recordScanResult$default(stateListAnimator, linkedHashMap, null, 2, null);
                if (ServiceC32756mjb.this.KWHzl()) {
                    RxBus.AEQbTJ(new C32764mjj(list, 0, 2, null));
                } else {
                    C32788mkG.StateListAnimator.recordScanStatus$default(stateListAnimator, DeviceScanner.ScannerStatus.COMPLETED.getValue(), null, 2, null);
                    ActivityC32771mjq.Application application = ActivityC32771mjq.Companion;
                    android.content.Context applicationContext = C43246rlf.OLrzqt.valueOf().getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    application.EZpvd(applicationContext, ServiceC32756mjb.this.OLrzqt(list).size(), "defi");
                }
            }
            stateListAnimator.EZpvd(linkedHashMap, "lastRecord_background");
            if (list.isEmpty()) {
                value = DeviceScanner.ScannerStatus.COMPLETED_NO_RISK_BACKGROUND.getValue();
            } else {
                value = DeviceScanner.ScannerStatus.COMPLETED_RISKY_BACKGROUND.getValue();
            }
            stateListAnimator.OLrzqt(value, "status_background");
            ServiceC32756mjb.this.stopSelf();
        }
    }

    public final void AEQbTJ() {
        new DeviceScanner(this).OLrzqt(new ActionBar());
    }

    /* JADX INFO: renamed from: o.mjb$ActionBar */
    public static final class ActionBar implements InterfaceC32767mjm {
        public ActionBar() {
        }

        @Override // o.InterfaceC32767mjm
        public void KWHzl(java.util.List<EnsecureAppInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (ServiceC32756mjb.this.KWHzl()) {
                RxBus.AEQbTJ(new C32764mjj(list, 1));
            }
        }

        @Override // o.InterfaceC32767mjm
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C32866mlf.onEvent$default("security_scan_applist_permission_granted", (TrackChannel[]) null, new Function1() { // from class: o.miZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ServiceC32756mjb.ActionBar.AEQbTJ((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "granted", "0", false, 4, null);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.mkG.StateListAnimator.recordLastScanTimestamp$default(o.mkG$StateListAnimator, java.lang.String, int, java.lang.Object):void */
        @Override // o.InterfaceC32767mjm
        public void AEQbTJ(java.util.List<EnsecureAppInfo> list) {
            int value;
            Intrinsics.checkNotNullParameter(list, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (EnsecureAppInfo ensecureAppInfo : list) {
                kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(ensecureAppInfo.getPackageName(), ensecureAppInfo.getScanResult());
                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
            }
            C32788mkG.StateListAnimator stateListAnimator = C32788mkG.Companion;
            if (stateListAnimator.gEmmrt("status_background") == DeviceScanner.ScannerStatus.PENDING_BACKGROUND.getValue()) {
                stateListAnimator.EZpvd(linkedHashMap, "lastRecord_background");
                if (list.isEmpty()) {
                    value = DeviceScanner.ScannerStatus.COMPLETED_NO_RISK_BACKGROUND.getValue();
                } else {
                    value = DeviceScanner.ScannerStatus.COMPLETED_RISKY_BACKGROUND.getValue();
                }
                stateListAnimator.OLrzqt(value, "status_background");
            }
            C32788mkG.StateListAnimator.recordLastScanTimestamp$default(stateListAnimator, null, 1, null);
            C32788mkG.StateListAnimator.recordScanResult$default(stateListAnimator, linkedHashMap, null, 2, null);
            if (ServiceC32756mjb.this.KWHzl()) {
                RxBus.AEQbTJ(new C32764mjj(list, 0, 2, null));
            } else {
                C32788mkG.StateListAnimator.recordScanStatus$default(stateListAnimator, DeviceScanner.ScannerStatus.COMPLETED.getValue(), null, 2, null);
                ActivityC32771mjq.Application application = ActivityC32771mjq.Companion;
                android.content.Context applicationContext = C43246rlf.OLrzqt.valueOf().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                application.EZpvd(applicationContext, ServiceC32756mjb.this.OLrzqt(list).size(), ServiceC32756mjb.this.copydefault);
            }
            ServiceC32756mjb.this.stopSelf();
        }
    }

    public final boolean KWHzl() {
        android.content.ComponentName componentName;
        java.lang.Object systemService = getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        java.util.List<ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) systemService).getRunningTasks(1);
        Intrinsics.copydefault(runningTasks);
        if (!(!runningTasks.isEmpty()) || (componentName = runningTasks.get(0).topActivity) == null) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) componentName.getPackageName(), (java.lang.Object) getPackageName()) && Intrinsics.EZpvd((java.lang.Object) componentName.getClassName(), (java.lang.Object) ActivityC32771mjq.class.getName());
    }

    public final java.util.List<EnsecureAppInfo> OLrzqt(java.util.List<EnsecureAppInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!C32788mkG.Companion.copydefault(((EnsecureAppInfo) obj).getPackageName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
