package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8116awf {
    public static final C8116awf KWHzl = new C8116awf();

    private C8116awf() {
    }

    public static final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl.EZpvd(context);
    }

    public static final void EZpvd(@NotNull android.app.Activity activity, @NotNull InterfaceC8117awg interfaceC8117awg) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(interfaceC8117awg, "");
        FragmentC8119awi.Companion.OLrzqt(activity, interfaceC8117awg);
    }

    public final void AEQbTJ(@NotNull android.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        KWHzl(fragment);
    }

    public final boolean OLrzqt(android.content.Context context) {
        return C8122awl.EZpvd(context);
    }

    public final boolean EZpvd(android.content.Context context) {
        if (C8125awo.OLrzqt.copydefault()) {
            return OLrzqt(context);
        }
        try {
            java.lang.Object objInvoke = android.provider.Settings.class.getDeclaredMethod("canDrawOverlays", android.content.Context.class).invoke(null, context);
            if (objInvoke != null) {
                return ((java.lang.Boolean) objInvoke).booleanValue();
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
            return true;
        }
    }

    public final void KWHzl(android.app.Fragment fragment) {
        if (C8125awo.OLrzqt.copydefault()) {
            C8122awl.copydefault(fragment);
            return;
        }
        try {
            OLrzqt(fragment);
        } catch (java.lang.Exception e) {
            C8130awt c8130awt = C8130awt.OLrzqt;
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            c8130awt.copydefault("PermissionUtils--->", stackTraceString);
        }
    }

    public static final void OLrzqt(@NotNull android.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        try {
            android.content.Intent intent = new android.content.Intent(android.provider.Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION").get(null).toString());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("package:");
            android.app.Activity activity = fragment.getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "");
            sb.append(activity.getPackageName());
            intent.setData(android.net.Uri.parse(sb.toString()));
            fragment.startActivityForResult(intent, 199);
        } catch (java.lang.Exception e) {
            C8130awt.OLrzqt.copydefault("PermissionUtils--->", java.lang.String.valueOf(e));
        }
    }
}
