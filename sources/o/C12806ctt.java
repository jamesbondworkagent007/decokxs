package o;

import android.view.View;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ctt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12806ctt {
    public static volatile boolean AEQbTJ;
    public static ViewOnClickListenerC54939xaY EZpvd;
    public static final C12806ctt copydefault = new C12806ctt();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        AEQbTJ = z;
    }

    private C12806ctt() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ctt */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showDialog$default(C12806ctt c12806ctt, java.lang.String str, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c12806ctt.AEQbTJ(str, z, function0);
    }

    public final void AEQbTJ(java.lang.String str, final boolean z, final Function0<Unit> function0) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ.isDestroyed() || str == null || str.length() == 0 || AEQbTJ) {
            return;
        }
        try {
            Result.Application application = Result.Companion;
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityAEQbTJ);
            EZpvd = viewOnClickListenerC54939xaY;
            viewOnClickListenerC54939xaY.setCancelable(false);
            AEQbTJ = true;
            viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.DSiOMJ);
            int i = C13754dXa.FragmentManager.removeCancellable;
            Intrinsics.copydefault((java.lang.Object) str);
            viewOnClickListenerC54939xaY.EZpvd(pTD.KWHzl(activityAEQbTJ, i, C56424yEw.AYXKKw(C56390yDp.OLrzqt(OtcExtraKeys.AREA, str))));
            if (!C14728dqt.KWHzl.KWHzl()) {
                if (z) {
                    string = activityAEQbTJ.getString(C13754dXa.FragmentManager.DIIpTV);
                } else {
                    string = activityAEQbTJ.getString(C13754dXa.FragmentManager.setEnabled);
                }
                Intrinsics.copydefault((java.lang.Object) string);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.ctv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C12806ctt.KWHzl(viewOnClickListenerC54939xaY, z, function0, view);
                    }
                });
            }
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = EZpvd;
            if (viewOnClickListenerC54939xaY2 != null) {
                viewOnClickListenerC54939xaY2.show();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(activityAEQbTJ);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            EZpvd = null;
            AEQbTJ = false;
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        EZpvd = null;
        AEQbTJ = false;
        if (z || function0 == null) {
            return;
        }
        function0.invoke();
    }
}
