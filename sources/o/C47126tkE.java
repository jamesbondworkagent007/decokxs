package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47126tkE {
    public static final C47126tkE OLrzqt = new C47126tkE();

    private C47126tkE() {
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return C33129mqd.OLrzqt(java.lang.Float.valueOf((intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) : -1) / (intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1)));
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return java.lang.String.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1);
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33129mqd.OLrzqt(java.lang.Float.valueOf((context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")) != null ? r3.getIntExtra("temperature", -1) : -1) / 10.0f));
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        java.lang.String stringExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getStringExtra("technology") : null;
        return stringExtra == null ? "" : stringExtra;
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return java.lang.String.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("health", -1) : -1);
    }

    public final java.lang.String djBIcL(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33129mqd.OLrzqt(java.lang.Float.valueOf((context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")) != null ? r3.getIntExtra("voltage", -1) : -1) / 1000.0f));
    }

    public final java.lang.String gEmmrt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return java.lang.String.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("plugged", -1) : -1);
    }
}
