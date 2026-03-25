package o;

import android.app.ActivityManager;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rAG implements InterfaceC43234rlT {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rAG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    @Override // o.InterfaceC43234rlT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        boolean z;
        OKComplianceRestrictionService.Feature feature;
        rTU rtu;
        java.lang.String strGEmmrt;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        pUU.EZpvd("KYCDeepLinkHandler", "PATH==kyc/risk");
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        if (activityOLrzqt == null) {
            activityOLrzqt = C54819xWm.KWHzl().AEQbTJ();
        }
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
        try {
            z = true;
        } catch (java.lang.Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 26) {
            java.util.List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            if (C33129mqd.KWHzl((java.util.Collection) appTasks)) {
                java.lang.String canonicalName = ActivityC42162rIq.class.getCanonicalName();
                android.content.ComponentName componentName = appTasks.get(0).getTaskInfo().topActivity;
                if (!Intrinsics.EZpvd((java.lang.Object) canonicalName, (java.lang.Object) (componentName != null ? componentName.getClassName() : null))) {
                    z = false;
                }
            }
        } else {
            java.util.List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            if (C33129mqd.KWHzl((java.util.Collection) runningTasks)) {
                java.lang.String canonicalName2 = ActivityC42162rIq.class.getCanonicalName();
                android.content.ComponentName componentName2 = runningTasks.get(0).topActivity;
                if (!Intrinsics.EZpvd((java.lang.Object) canonicalName2, (java.lang.Object) (componentName2 != null ? componentName2.getClassName() : null))) {
                }
            }
        }
        java.lang.Object obj = map.get("type");
        if (obj != null && (strGEmmrt = C33129mqd.gEmmrt(obj)) != null) {
            str = strGEmmrt;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            feature = null;
            for (OKComplianceRestrictionService.Feature feature2 : OKComplianceRestrictionService.Feature.values()) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) feature2.getType())) {
                    feature = feature2;
                }
            }
        } else {
            feature = null;
        }
        if (activityOLrzqt == null || z || !(activityOLrzqt instanceof FragmentActivity) || (rtu = (rTU) C43251rlk.OLrzqt(rTU.class)) == null) {
            return;
        }
        rtu.EZpvd((FragmentActivity) activityOLrzqt, new Function1() { // from class: o.rAD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return rAG.OLrzqt(((java.lang.Boolean) obj2).booleanValue());
            }
        }, java.lang.Boolean.TRUE, feature != null ? java.lang.Integer.valueOf(feature.getCode()) : null, null, new Function1() { // from class: o.rAF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return rAG.OLrzqt(((java.lang.Integer) obj2).intValue());
            }
        }, new Function1() { // from class: o.rAL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return rAG.KWHzl((java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.rAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return rAG.AEQbTJ((ResultBackStatus) obj2);
            }
        });
    }

    public static final Unit OLrzqt(boolean z) {
        if (!z) {
            C7323ahf.KWHzl().AEQbTJ("derivatives_flow_unlimit_notification", null, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(int i) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ResultBackStatus resultBackStatus) {
        return Unit.INSTANCE;
    }
}
