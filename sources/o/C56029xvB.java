package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56029xvB {
    public static final C56029xvB KWHzl = new C56029xvB();

    private C56029xvB() {
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = OLrzqt(str, "deeplink");
        if (strOLrzqt == null) {
            return false;
        }
        return C59449zhJ.gEmmrt(OLrzqt(strOLrzqt, "route_biz"), "trading_bot", true);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("BotQrCodeHelper", "qrCode is " + str);
        java.lang.String strOLrzqt = OLrzqt(str, "deeplink");
        if (strOLrzqt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
            return;
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43248rlh.KWHzl.AEQbTJ(InterfaceC43294rma.class), context, strOLrzqt, null, new Function1() { // from class: o.xvz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56029xvB.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 4, null);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("?");
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            sb.append(((java.lang.Object) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((java.lang.Object) entry.getValue()) + ContainerUtils.FIELD_DELIMITER);
        }
        sb.append("route_biz=trading_bot");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        try {
            return android.net.Uri.parse(str).getQueryParameter(str2);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
