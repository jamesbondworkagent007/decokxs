package o;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qIR {
    public static final qIR EZpvd = new qIR();

    private qIR() {
    }

    public final android.net.Uri AEQbTJ(@NotNull android.net.Uri uri, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (queryParameterNames.contains(str)) {
            builderBuildUpon.clearQuery();
            for (java.lang.String str3 : queryParameterNames) {
                if (!android.text.TextUtils.isEmpty(str3)) {
                    builderBuildUpon.appendQueryParameter(str3, Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) str) ? str2 : uri.getQueryParameter(str3));
                }
            }
        } else {
            builderBuildUpon.appendQueryParameter(str, str2);
        }
        return builderBuildUpon.build();
    }
}
