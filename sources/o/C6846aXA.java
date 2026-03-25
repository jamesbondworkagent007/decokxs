package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6846aXA {
    public final Response KWHzl;
    public final byte[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C6846aXA copy$default(C6846aXA c6846aXA, Response response, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            response = c6846aXA.KWHzl;
        }
        if ((i & 2) != 0) {
            bArr = c6846aXA.copydefault;
        }
        return c6846aXA.copydefault(response, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6846aXA copydefault(@NotNull Response response, byte[] bArr) {
        Intrinsics.checkNotNullParameter(response, "");
        return new C6846aXA(response, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SingleFlightCachedResponse(originalResponse=" + this.KWHzl + ", body=" + java.util.Arrays.toString(this.copydefault) + ")";
    }

    public C6846aXA(@NotNull Response response, byte[] bArr) {
        Intrinsics.checkNotNullParameter(response, "");
        this.KWHzl = response;
        this.copydefault = bArr;
    }

    public final Response KWHzl() {
        Response.Builder builderNewBuilder = this.KWHzl.newBuilder();
        if (this.copydefault != null) {
            ResponseBody responseBodyBody = this.KWHzl.body();
            builderNewBuilder.body(ResponseBody.Companion.create(Okio.buffer(Okio.source(new java.io.ByteArrayInputStream(this.copydefault))), responseBodyBody != null ? responseBodyBody.contentType() : null, this.copydefault.length));
        } else {
            builderNewBuilder.body(null);
        }
        return builderNewBuilder.build();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(C6846aXA.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        C6846aXA c6846aXA = (C6846aXA) obj;
        return Intrinsics.EZpvd(this.KWHzl, c6846aXA.KWHzl) && java.util.Arrays.equals(this.copydefault, c6846aXA.copydefault);
    }

    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        byte[] bArr = this.copydefault;
        return (iHashCode * 31) + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }
}
