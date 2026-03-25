package o;

import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47207tlg {
    public static final C47207tlg KWHzl = new C47207tlg();

    private C47207tlg() {
    }

    public final TelephonyManager KWHzl(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        Intrinsics.copydefault(systemService, "");
        return (TelephonyManager) systemService;
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0 || Build.VERSION.SDK_INT < 30) ? "" : java.lang.String.valueOf(KWHzl(context).getSubscriptionId());
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0 ? KWHzl(context).getNetworkOperator().toString() : "";
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0 ? KWHzl(context).getSimOperator().toString() : "";
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0 ? KWHzl(context).getNetworkCountryIso().toString() : "";
    }
}
