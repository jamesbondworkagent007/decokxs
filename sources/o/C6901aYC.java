package o;

import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C6901aYC;

/* JADX INFO: renamed from: o.aYC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6901aYC {
    public static StateListAnimator EZpvd;
    public static final C6901aYC copydefault = new C6901aYC();
    public static AtomicBoolean AEQbTJ = new AtomicBoolean(false);
    public static final int OLrzqt = 8;

    private C6901aYC() {
    }

    /* JADX INFO: renamed from: o.aYC$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public boolean EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                z2 = stateListAnimator.EZpvd;
            }
            boolean z3 = z2;
            if ((i & 4) != 0) {
                str = stateListAnimator.KWHzl;
            }
            java.lang.String str4 = str;
            if ((i & 8) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            java.lang.String str5 = str2;
            if ((i & 16) != 0) {
                str3 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.AEQbTJ(z, z3, str4, str5, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            return new StateListAnimator(z, z2, str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.copydefault == stateListAnimator.copydefault && this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
            int iHashCode2 = java.lang.Boolean.hashCode(this.EZpvd);
            java.lang.String str = this.KWHzl;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.OLrzqt;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DeviceCheckedInfo(isRooted=" + this.copydefault + ", isDebugApp=" + this.EZpvd + ", initSvcADBD=" + this.KWHzl + ", gsmSimState=" + this.AEQbTJ + ", roBuildFingerprint=" + this.OLrzqt + ")";
        }

        public StateListAnimator(boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.copydefault = z;
            this.EZpvd = z2;
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.OLrzqt = str3;
        }
    }

    public final C6900aYB EZpvd() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        EZpvd(C43246rlf.OLrzqt.valueOf());
        C6900aYB c6900aYBAEQbTJ = AEQbTJ();
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        pUU.EZpvd("DataReporter", "buildClientInfo-->costTime:" + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms， currentThread: " + java.lang.Thread.currentThread());
        return c6900aYBAEQbTJ;
    }

    public final void EZpvd(android.content.Context context) {
        if (AEQbTJ.get() || EZpvd != null) {
            return;
        }
        AEQbTJ.set(true);
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just(context);
        final Function1 function1 = new Function1() { // from class: o.aYE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6901aYC.OLrzqt((android.content.Context) obj);
            }
        };
        AbstractC58247yxg map = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.aYA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C6901aYC.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "");
        AbstractC58247yxg abstractC58247yxgKWHzl = C33527myD.KWHzl(map);
        final Function1 function12 = new Function1() { // from class: o.aYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6901aYC.AEQbTJ(jCurrentTimeMillis, (C6901aYC.StateListAnimator) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.aYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6901aYC.copydefault(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.aYI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6901aYC.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58247yxgKWHzl.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.aYH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6901aYC.valueOf(function13, obj);
            }
        });
    }

    public static final StateListAnimator OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (StateListAnimator) function1.invoke(obj);
    }

    public static final StateListAnimator OLrzqt(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        boolean zCopydefault = C34702nhN.OLrzqt.copydefault();
        C6981aZd c6981aZd = C6981aZd.OLrzqt;
        return new StateListAnimator(zCopydefault, false, c6981aZd.OLrzqt("getprop init.svc.adbd"), c6981aZd.OLrzqt("getprop gsm.sim.state"), c6981aZd.OLrzqt("getprop ro.build.fingerprint"));
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(long j, StateListAnimator stateListAnimator) {
        EZpvd = stateListAnimator;
        AEQbTJ.set(false);
        pUU.KWHzl("DataReporter", "asyncCheckDeviceInfo-->onNext-->costTime:" + (java.lang.System.currentTimeMillis() - j) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        AEQbTJ.set(false);
        pUU.copydefault("DataReporter", "asyncCheckDeviceInfo-->onError-->:" + th);
        return Unit.INSTANCE;
    }

    public final C6900aYB AEQbTJ() {
        java.lang.String strKWHzl;
        java.lang.String strAEQbTJ;
        java.lang.String strOLrzqt;
        C6900aYB c6900aYB = new C6900aYB();
        android.app.Application applicationValueOf = C43246rlf.OLrzqt.valueOf();
        c6900aYB.deviceId = xVW.copydefault();
        C32864mld c32864mld = C32864mld.OLrzqt;
        c6900aYB.ampDeviceId = c32864mld.AhwBna().invoke();
        c6900aYB.dataFinderDeviceId = c32864mld.gEmmrt().invoke();
        c6900aYB.deviceModel = android.os.Build.MODEL;
        c6900aYB.manufacturer = android.os.Build.MANUFACTURER;
        c6900aYB.osType = "Android";
        c6900aYB.timestamp = java.lang.System.currentTimeMillis();
        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = KWHzl(applicationValueOf);
        c6900aYB.carrier = pairKWHzl.getSecond();
        c6900aYB.netType = EZpvd(pairKWHzl.getFirst());
        android.util.DisplayMetrics displayMetrics = applicationValueOf.getResources().getDisplayMetrics();
        c6900aYB.screenH = displayMetrics.heightPixels;
        c6900aYB.screenW = displayMetrics.widthPixels;
        java.lang.String strValueOf = c32864mld.valueOf();
        java.lang.String str = "";
        if (strValueOf == null) {
            strValueOf = "";
        }
        c6900aYB.afId = strValueOf;
        c6900aYB.packageId = applicationValueOf.getPackageName();
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairAEQbTJ = AEQbTJ(applicationValueOf);
        c6900aYB.batteryState = pairAEQbTJ.getFirst().intValue();
        c6900aYB.batteryLevel = pairAEQbTJ.getSecond().intValue();
        StateListAnimator stateListAnimator = EZpvd;
        c6900aYB.isRooted = stateListAnimator != null ? stateListAnimator.EZpvd() : false;
        StateListAnimator stateListAnimator2 = EZpvd;
        c6900aYB.isDebugApp = stateListAnimator2 != null ? stateListAnimator2.copydefault() : false;
        StateListAnimator stateListAnimator3 = EZpvd;
        if (stateListAnimator3 == null || (strKWHzl = stateListAnimator3.KWHzl()) == null) {
            strKWHzl = "";
        }
        c6900aYB.initSvcADBD = strKWHzl;
        StateListAnimator stateListAnimator4 = EZpvd;
        java.util.List listSplit$default = (stateListAnimator4 == null || (strOLrzqt = stateListAnimator4.OLrzqt()) == null) ? null : StringsKt__StringsKt.split$default((java.lang.CharSequence) strOLrzqt, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default == null || listSplit$default.isEmpty()) {
            c6900aYB.gsmSimState = "";
            c6900aYB.gsmSimState2 = "";
        } else if (listSplit$default.size() == 1) {
            c6900aYB.gsmSimState = (java.lang.String) listSplit$default.get(0);
            c6900aYB.gsmSimState2 = "";
        } else {
            c6900aYB.gsmSimState = (java.lang.String) listSplit$default.get(0);
            c6900aYB.gsmSimState2 = (java.lang.String) listSplit$default.get(1);
        }
        StateListAnimator stateListAnimator5 = EZpvd;
        if (stateListAnimator5 != null && (strAEQbTJ = stateListAnimator5.AEQbTJ()) != null) {
            str = strAEQbTJ;
        }
        c6900aYB.roBuildFingerprint = str;
        c6900aYB.systemBootTime = C6981aZd.OLrzqt.copydefault();
        return c6900aYB;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        android.net.NetworkInfo networkInfoKWHzl = C43457rpe.OLrzqt(C43246rlf.OLrzqt.valueOf()).KWHzl();
        if (networkInfoKWHzl == null) {
            return "UNKNOWN";
        }
        java.lang.String typeName = networkInfoKWHzl.getTypeName();
        if (C59449zhJ.gEmmrt(typeName, "WIFI", true)) {
            return "WIFI";
        }
        return C59449zhJ.gEmmrt(typeName, "MOBILE", true) ? str : "UNKNOWN";
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(android.content.Context context) {
        java.lang.String str;
        try {
            java.lang.Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            Intrinsics.copydefault(systemService, "");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            switch (telephonyManager.getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                    str = "2G";
                    break;
                case 3:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                    str = "3G";
                    break;
                case 13:
                    str = "4G";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            return new kotlin.Pair<>(str, telephonyManager.getNetworkOperatorName());
        } catch (java.lang.Exception unused) {
            return new kotlin.Pair<>("UNKNOWN", "UNKNOWN");
        }
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> AEQbTJ(android.content.Context context) {
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = 0;
        if (intentRegisterReceiver == null) {
            return C56390yDp.OLrzqt(0, -1);
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        int iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf((C33129mqd.djBIcL(java.lang.Integer.valueOf(intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1))) / C33129mqd.djBIcL(java.lang.Integer.valueOf(intentRegisterReceiver.getIntExtra("scale", -1)))) * 100));
        if (intExtra != 1) {
            if (intExtra == 2) {
                i = 1;
            } else if (intExtra != 3 && intExtra != 4 && intExtra == 5) {
                i = 2;
            }
        }
        return new kotlin.Pair<>(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iAhwBna));
    }
}
