package o;

import android.os.StrictMode;
import com.okinc.base.thread.TPM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C57911yrO;
import o.C58043yto;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6700aUL {
    public static int OLrzqt;
    public static InterfaceC6711aUW djBIcL;
    public static final C6700aUL EZpvd = new C6700aUL();
    public static C6713aUZ copydefault = new C6713aUZ(0);
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.aUK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6700aUL.copydefault();
        }
    });
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.aUL$ActionBar */
    public static final class ActionBar implements TPM.Application {
        public final java.lang.String EZpvd = "Matrix";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.base.thread.TPM.Application
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC6711aUW EZpvd() {
        return djBIcL;
    }

    private C6700aUL() {
    }

    public final java.util.concurrent.Executor AEQbTJ() {
        return (java.util.concurrent.Executor) AEQbTJ.getValue();
    }

    public static final java.util.concurrent.Executor copydefault() {
        return TPM.singleExecutor$default(TPM.AEQbTJ, new ActionBar(), TPM.Priority.HIGH, null, 4, null);
    }

    public final void OLrzqt(@NotNull android.app.Application application, int i, @NotNull InterfaceC6711aUW interfaceC6711aUW) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(interfaceC6711aUW, "");
        OLrzqt = i;
        djBIcL = interfaceC6711aUW;
        C6713aUZ c6713aUZ = new C6713aUZ(i);
        copydefault = c6713aUZ;
        if (!c6713aUZ.gEmmrt()) {
            pUU.KWHzl("Matrix", "Matrix init enable false.");
            return;
        }
        C57911yrO.copydefault(new C6702aUN());
        C57911yrO.Activity activity = new C57911yrO.Activity(application);
        activity.AEQbTJ(new C6712aUY(application));
        activity.KWHzl(copydefault(copydefault, application));
        C6698aUJ.AEQbTJ.copydefault();
        activity.copydefault(KWHzl());
        C57911yrO.KWHzl(activity.AEQbTJ());
        C57911yrO.EZpvd().OLrzqt();
        pUU.KWHzl("Matrix", "init done in [" + java.lang.Thread.currentThread().getName() + "]");
        if (copydefault.EZpvd()) {
            try {
                android.os.StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectCustomSlowCalls().detectNetwork().penaltyLog().penaltyDeathOnNetwork().build());
                android.os.StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectActivityLeaks().detectLeakedClosableObjects().detectLeakedRegistrationObjects().detectLeakedSqlLiteObjects().penaltyLog().build());
            } catch (java.lang.Throwable th) {
                pUU.AEQbTJ("Matrix", "strictMode", th);
            }
        }
    }

    public final C58041ytm copydefault(C6713aUZ c6713aUZ, android.app.Application application) {
        boolean zKWHzl = c6713aUZ.KWHzl();
        boolean zAEQbTJ = c6713aUZ.AEQbTJ();
        boolean zCopydefault = c6713aUZ.copydefault();
        boolean zAYXKKw = c6713aUZ.AYXKKw();
        boolean zOLrzqt = c6713aUZ.OLrzqt();
        boolean zValueOf = c6713aUZ.valueOf();
        return new C58041ytm(new C58043yto.StateListAnimator().OLrzqt(c6713aUZ).copydefault(zKWHzl).KWHzl(zAEQbTJ).OLrzqt(zCopydefault).AYXKKw(zAYXKKw).AhwBna(c6713aUZ.AhwBna()).AEQbTJ(zOLrzqt).EZpvd(zValueOf).EZpvd(OLrzqt(application).getAbsolutePath()).KWHzl(KWHzl(application).getAbsolutePath()).copydefault(2).AEQbTJ("com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity;").valueOf(c6713aUZ.EZpvd()).djBIcL(false).KWHzl());
    }

    public final C57921yrY KWHzl() {
        return new C57921yrY(new C57974ysY(true, true, new java.util.ArrayList()), true, true, new C57919yrW(AEQbTJ(), 0, 0L, null, null, 30, null), true);
    }

    public final java.io.File OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.io.File file = new java.io.File(context.getFilesDir(), "matrix_trace");
        if (!file.exists() && file.mkdirs()) {
            C58013ytK.OLrzqt("Matrix", "failed to create traceFileDir", new java.lang.Object[0]);
        }
        return new java.io.File(file, "anr_trace.txt");
    }

    public final java.io.File KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.io.File file = new java.io.File(context.getFilesDir(), "matrix_trace");
        if (!file.exists() && file.mkdirs()) {
            C58013ytK.OLrzqt("Matrix", "failed to create traceFileDir", new java.lang.Object[0]);
        }
        return new java.io.File(file, "print_trace.txt");
    }
}
