package o;

import android.os.Build;
import com.okinc.components.security.api.RiskLevel;
import com.okinc.components.security.scanner.AccessibilityServiceInfoDetails;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32757mjc {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mjd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32757mjc.KWHzl(this.AEQbTJ);
        }
    });
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public static final C32687miL EZpvd = new C32687miL();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: renamed from: o.mjc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mjc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C32687miL AEQbTJ() {
            return C32757mjc.EZpvd;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mjc$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RiskLevel checkRiskLevel$default(StateListAnimator stateListAnimator, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = null;
            }
            return stateListAnimator.copydefault(list);
        }

        public final RiskLevel copydefault(java.util.List<java.lang.String> list) {
            C32757mjc c32757mjc = new C32757mjc();
            if (list == null) {
                list = AEQbTJ().EZpvd();
            }
            return c32757mjc.EZpvd(list).isEmpty() ^ true ? RiskLevel.HIGH : c32757mjc.copydefault(list).isEmpty() ^ true ? RiskLevel.MEDIUM : RiskLevel.NONE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mjc$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean hasRisk$default(StateListAnimator stateListAnimator, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = null;
            }
            return stateListAnimator.OLrzqt(list);
        }

        public final boolean OLrzqt(java.util.List<java.lang.String> list) {
            return copydefault(list) != RiskLevel.NONE;
        }
    }

    public final java.util.List<AccessibilityServiceInfoDetails> OLrzqt() {
        return (java.util.List) this.OLrzqt.getValue();
    }

    public static final java.util.List KWHzl(C32757mjc c32757mjc) {
        return getEnabledAccessibilityServicesInfo$default(c32757mjc, false, 1, null);
    }

    public static /* synthetic */ java.util.List getEnabledAccessibilityServicesInfo$default(C32757mjc c32757mjc, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c32757mjc.copydefault(z);
    }

    public final java.util.List<AccessibilityServiceInfoDetails> copydefault(boolean z) {
        android.content.Context applicationContext = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        java.lang.Object systemService = applicationContext.getSystemService("accessibility");
        Intrinsics.copydefault(systemService, "");
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = ((android.view.accessibility.AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1);
        android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            java.lang.String str = accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName;
            try {
                java.lang.String string = packageManager.getApplicationLabel(accessibilityServiceInfo.getResolveInfo().serviceInfo.applicationInfo).toString();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add("android.permission.BIND_ACCESSIBILITY_SERVICE");
                if (EZpvd() < 30) {
                    try {
                        java.lang.String[] strArr = packageManager.getPackageInfo(str, 4096).requestedPermissions;
                        if (strArr != null) {
                            C56406yEe.KWHzl(arrayList2, yDV.AwvSrB(strArr));
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                        C32789mkH c32789mkH = C32789mkH.KWHzl;
                        android.content.pm.ApplicationInfo applicationInfo = accessibilityServiceInfo.getResolveInfo().serviceInfo.applicationInfo;
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "");
                        C56406yEe.KWHzl(arrayList2, c32789mkH.AEQbTJ(applicationInfo));
                    }
                } else {
                    C32789mkH c32789mkH2 = C32789mkH.KWHzl;
                    android.content.pm.ApplicationInfo applicationInfo2 = accessibilityServiceInfo.getResolveInfo().serviceInfo.applicationInfo;
                    Intrinsics.checkNotNullExpressionValue(applicationInfo2, "");
                    C56406yEe.KWHzl(arrayList2, c32789mkH2.AEQbTJ(applicationInfo2));
                }
                Intrinsics.copydefault((java.lang.Object) str);
                arrayList.add(new AccessibilityServiceInfoDetails(string, str, arrayList2));
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    public final java.util.List<AccessibilityServiceInfoDetails> EZpvd(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            for (AccessibilityServiceInfoDetails accessibilityServiceInfoDetails : OLrzqt()) {
                if (!list.contains(accessibilityServiceInfoDetails.getPackageName()) && accessibilityServiceInfoDetails.getPermissions().contains("android.permission.WAKE_LOCK")) {
                    arrayList.add(accessibilityServiceInfoDetails);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<AccessibilityServiceInfoDetails> copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            for (AccessibilityServiceInfoDetails accessibilityServiceInfoDetails : OLrzqt()) {
                if (!list.contains(accessibilityServiceInfoDetails.getPackageName())) {
                    arrayList.add(accessibilityServiceInfoDetails);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<AccessibilityServiceInfoDetails> KWHzl() {
        return OLrzqt();
    }
}
