package o;

import android.content.res.Resources;
import android.view.View;
import com.okinc.components.security.api.ProtectionMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.miS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32694miS {
    public static final C32694miS OLrzqt = new C32694miS();
    public static final C32687miL copydefault = new C32687miL();

    /* JADX INFO: renamed from: o.miS$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ProtectionMode.values().length];
            try {
                iArr[ProtectionMode.DISABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ProtectionMode.DETECTION_ONLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtectionMode.BLOCKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    private C32694miS() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.miS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setupClickProtection$default(C32694miS c32694miS, android.view.View view, C32678miC c32678miC, Function1 function1, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c32678miC = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        c32694miS.OLrzqt(view, c32678miC, function1, function2);
    }

    public final void OLrzqt(@NotNull android.view.View view, C32678miC c32678miC, Function1<? super C32680miE, Unit> function1, Function2<? super android.view.View, ? super android.view.MotionEvent, java.lang.Boolean> function2) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd(view, c32678miC, null, function1, function2);
    }

    public final void EZpvd(@NotNull android.view.View view, C32678miC c32678miC, android.content.Context context, Function1<? super C32680miE, Unit> function1, Function2<? super android.view.View, ? super android.view.MotionEvent, java.lang.Boolean> function2) {
        java.lang.Object objM7377constructorimpl;
        ProtectionMode protectionModeEZpvd;
        ProtectionMode protectionModeAEQbTJ;
        ProtectionMode protectionModeCopydefault;
        java.lang.String str;
        boolean zIsEnabled;
        View.AccessibilityDelegate accessibilityDelegateKWHzl;
        java.lang.String resourceEntryName;
        Intrinsics.checkNotNullParameter(view, "");
        try {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(mNP.AEQbTJ.copydefault()));
            } catch (java.lang.Exception e) {
                try {
                    view.setAccessibilityDelegate(null);
                    view.setOnTouchListener(null);
                    return;
                } catch (java.lang.Exception unused) {
                    e.printStackTrace();
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = java.lang.Boolean.FALSE;
        }
        if (((java.lang.Boolean) objM7377constructorimpl).booleanValue()) {
            return;
        }
        if (AEQbTJ(view)) {
            AEQbTJ(view, c32678miC, context, function1, function2);
            return;
        }
        C32687miL c32687miL = copydefault;
        if (c32687miL.copydefault()) {
            protectionModeEZpvd = c32687miL.OLrzqt() ? ProtectionMode.BLOCKING : ProtectionMode.DETECTION_ONLY;
        } else {
            protectionModeEZpvd = ProtectionMode.DISABLED;
        }
        if (c32687miL.valueOf()) {
            protectionModeAEQbTJ = c32687miL.djBIcL() ? ProtectionMode.BLOCKING : ProtectionMode.DETECTION_ONLY;
        } else {
            protectionModeAEQbTJ = ProtectionMode.DISABLED;
        }
        if (c32687miL.gEmmrt()) {
            protectionModeCopydefault = c32687miL.AYXKKw() ? ProtectionMode.BLOCKING : ProtectionMode.DETECTION_ONLY;
        } else {
            protectionModeCopydefault = ProtectionMode.DISABLED;
        }
        ProtectionMode protectionMode = ProtectionMode.DISABLED;
        if (protectionModeEZpvd == protectionMode && c32678miC != null) {
            protectionModeEZpvd = c32678miC.EZpvd();
        }
        if (protectionModeAEQbTJ == protectionMode && c32678miC != null) {
            protectionModeAEQbTJ = c32678miC.AEQbTJ();
        }
        if (protectionModeCopydefault == protectionMode && c32678miC != null) {
            protectionModeCopydefault = c32678miC.copydefault();
        }
        C32678miC c32678miC2 = new C32678miC(protectionModeEZpvd, protectionModeAEQbTJ, protectionModeCopydefault);
        if (context == null || view.getId() == -1) {
            str = null;
        } else {
            try {
                resourceEntryName = context.getResources().getResourceEntryName(view.getId());
            } catch (Resources.NotFoundException unused2) {
                resourceEntryName = null;
            }
            str = resourceEntryName;
        }
        if (context != null) {
            java.lang.Object systemService = context.getSystemService("accessibility");
            Intrinsics.copydefault(systemService, "");
            zIsEnabled = ((android.view.accessibility.AccessibilityManager) systemService).isEnabled();
        } else {
            zIsEnabled = true;
        }
        int i = Application.AEQbTJ[c32678miC2.EZpvd().ordinal()];
        if (i == 1) {
            accessibilityDelegateKWHzl = null;
        } else if (i == 2) {
            accessibilityDelegateKWHzl = C32691miP.copydefault.KWHzl(function1, str);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            accessibilityDelegateKWHzl = C32691miP.copydefault.AEQbTJ(function1, str);
        }
        view.setAccessibilityDelegate(accessibilityDelegateKWHzl);
        ProtectionMode protectionModeAEQbTJ2 = c32678miC2.AEQbTJ();
        ProtectionMode protectionMode2 = ProtectionMode.DISABLED;
        if (protectionModeAEQbTJ2 == protectionMode2 && c32678miC2.copydefault() == protectionMode2) {
            return;
        }
        view.setOnTouchListener(C32699miX.copydefault.EZpvd(c32678miC2, zIsEnabled, function1, str, function2));
    }

    public final boolean AEQbTJ(android.view.View view) {
        return view instanceof wYF;
    }

    public final void AEQbTJ(android.view.View view, C32678miC c32678miC, android.content.Context context, Function1<? super C32680miE, Unit> function1, Function2<? super android.view.View, ? super android.view.MotionEvent, java.lang.Boolean> function2) {
        Intrinsics.copydefault(view, "");
        wYF wyf = (wYF) view;
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            OLrzqt.EZpvd(c52794wYpCopydefault, c32678miC, context, function1, function2);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            OLrzqt.EZpvd(c52794wYpAEQbTJ, c32678miC, context, function1, function2);
        }
    }
}
