package o;

import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5724aBq {
    public static final C5724aBq EZpvd = new C5724aBq();

    private C5724aBq() {
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", "/help/passkey-error-50162-on-android-devices")), null, 4, null);
    }

    public final void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", "/help/how-to-fix-pay-passkey-error-50162-on-android-devices")), null, 4, null);
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.net.Uri uri = android.net.Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.gms");
            Intrinsics.checkNotNullExpressionValue(uri, "");
            context.startActivity(new android.content.Intent("android.intent.action.VIEW", uri));
        } catch (java.lang.Exception e) {
            pUU.copydefault("URL", "No app can handle this URL: https://play.google.com/store/apps/details?id=com.google.android.gms: " + e.getMessage());
            java.lang.String message = e.getMessage();
            if (message != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            }
        }
    }
}
