package o;

import androidx.core.os.BundleKt;
import com.just.agentweb.DefaultWebClient;
import com.okinc.web.WebActivity;
import java.net.URLDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pHR {
    public static final pHR copydefault = new pHR();

    private pHR() {
    }

    public final void AEQbTJ(@NotNull java.lang.String str) throws java.io.UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(str, "");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (C59449zhJ.AYXKKw(str, DefaultWebClient.HTTPS_SCHEME, true) || C59449zhJ.AYXKKw(str, DefaultWebClient.HTTP_SCHEME, true)) {
            C33569myt.copydefault(C54819xWm.KWHzl().AEQbTJ(), android.net.Uri.parse(str));
            return;
        }
        for (java.lang.String str2 : C34704nhP.copydefault.KWHzl()) {
            if (C59449zhJ.AYXKKw(str, str2, true)) {
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
                InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, activityAEQbTJ, str, null, new Function1() { // from class: o.pHQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return pHR.AEQbTJ((AbstractC43238rlX) obj);
                    }
                }, 4, null);
                return;
            }
        }
        java.lang.String strDecode = URLDecoder.decode(str, "utf-8");
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.app.Activity activityAEQbTJ2 = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ2, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, activityAEQbTJ2, BundleKt.bundleOf(C56390yDp.OLrzqt("url", strDecode)), null, 4, null);
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
