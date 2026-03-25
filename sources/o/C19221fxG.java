package o;

import com.just.agentweb.DefaultWebClient;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19221fxG {
    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String host = new java.net.URL(copydefault(str)).getHost();
            Intrinsics.copydefault((java.lang.Object) host);
            return StringsKt__StringsKt.KWHzl(host, (java.lang.CharSequence) "www.");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("String.domain: not a valid url", e);
            return null;
        }
    }

    public static final java.lang.String copydefault(java.lang.String str) {
        if (C59449zhJ.startsWith$default(str, DefaultWebClient.HTTP_SCHEME, false, 2, null) || C59449zhJ.startsWith$default(str, DefaultWebClient.HTTPS_SCHEME, false, 2, null)) {
            return str;
        }
        return DefaultWebClient.HTTP_SCHEME + str;
    }
}
