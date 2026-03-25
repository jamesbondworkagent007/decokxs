package o;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ozH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37723ozH {
    public static final C37723ozH OLrzqt = new C37723ozH();

    private C37723ozH() {
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return str2;
        }
        android.net.Uri uri = android.net.Uri.parse(str2);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (uri.getQueryParameterNames().contains("tag")) {
            Intrinsics.copydefault(builderBuildUpon);
            return OLrzqt(uri, builderBuildUpon, str);
        }
        java.lang.String string = builderBuildUpon.appendQueryParameter("tag", str).build().toString();
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public final java.lang.String OLrzqt(android.net.Uri uri, Uri.Builder builder, java.lang.String str) {
        builder.clearQuery();
        java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        for (java.lang.String str2 : queryParameterNames) {
            java.lang.String queryParameter = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "tag") ? str : uri.getQueryParameter(str2);
            if (queryParameter != null) {
                builder.appendQueryParameter(str2, queryParameter);
            }
        }
        java.lang.String string = builder.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
