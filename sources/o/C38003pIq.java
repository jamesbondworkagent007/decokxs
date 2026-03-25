package o;

import kotlin.jvm.internal.Intrinsics;
import o.C38002pIp;
import o.pIG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38003pIq extends pIA {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38003pIq(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.pIA
    public void copydefault(java.lang.Thread thread, java.lang.Throwable th) {
        java.lang.String string;
        if (th != null) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th.printStackTrace(new java.io.PrintWriter(stringWriter));
            string = stringWriter.toString();
        } else {
            string = null;
        }
        pIF.log$default("--->onUncaughtExceptionHappened:" + thread + "<--- " + string, true, null, null, 6, null);
    }

    @Override // o.pIA
    public void KWHzl(java.lang.Throwable th) {
        java.lang.String string;
        if (th != null) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th.printStackTrace(new java.io.PrintWriter(stringWriter));
            string = stringWriter.toString();
        } else {
            string = null;
        }
        pIF.log$default("---> onBandageExceptionHappened <--- +" + string, true, null, null, 6, null);
        AEQbTJ(pIG.StateListAnimator.AEQbTJ);
    }

    @Override // o.pIA
    public void OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        AEQbTJ(pIG.StateListAnimator.OLrzqt);
        pIF.log$default("---> onEnterSafeMode <---", true, null, null, 6, null);
        C38002pIp.Application application = C38002pIp.Companion;
        if (application.ejfBZ()) {
            application.hDKMBd();
        }
    }

    @Override // o.pIA
    public void EZpvd(java.lang.Throwable th) {
        super.EZpvd(th);
        pIF.log$default("--->onMayBeBlackScreen:<---", true, null, null, 6, null);
    }

    public final void AEQbTJ(int i) {
        android.widget.Toast.makeText(AEQbTJ(), AEQbTJ().getResources().getString(i), 1).show();
    }
}
