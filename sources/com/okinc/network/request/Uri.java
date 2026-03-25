package com.okinc.network.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Uri {
    private static final String TAG = "Uri";
    private final String host;
    private final android.net.Uri proxy;
    private final String scheme;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHost() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.net.Uri getOriginal() {
        return this.proxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScheme() {
        return this.scheme;
    }

    public Uri(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.net.Uri uri = android.net.Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        if (uri.getScheme() == null || uri.getHost() == null) {
            String str2 = "Uri scheme or host is null, please check the url: " + str;
            pUU.copydefault(TAG, str2);
            throw new IllegalArgumentException(str2);
        }
        this.proxy = uri;
        String scheme = uri.getScheme();
        Intrinsics.copydefault((Object) scheme);
        this.scheme = scheme;
        String host = uri.getHost();
        Intrinsics.copydefault((Object) host);
        this.host = host;
    }

    public String toString() {
        String string = this.proxy.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(Uri.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        return Intrinsics.EZpvd(this.proxy, ((Uri) obj).proxy);
    }

    public int hashCode() {
        return this.proxy.hashCode();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.request.Uri.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
