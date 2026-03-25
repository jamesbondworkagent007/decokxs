package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32540mfX {
    public static final C32540mfX KWHzl = new C32540mfX();

    private C32540mfX() {
    }

    public final C4326BbW AEQbTJ(@NotNull Response response) {
        byte[] bArrBytes;
        MediaType mediaTypeContentType;
        Intrinsics.checkNotNullParameter(response, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair : response.headers()) {
            linkedHashMap.put(pair.component1(), pair.component2());
        }
        ResponseBody responseBodyBody = response.body();
        C56396yDv c56396yDvKWHzl = null;
        java.lang.String string = (responseBodyBody == null || (mediaTypeContentType = responseBodyBody.contentType()) == null) ? null : mediaTypeContentType.toString();
        if (responseBodyBody != null) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(responseBodyBody.contentLength());
            if (lValueOf.longValue() < 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                c56396yDvKWHzl = C56396yDv.KWHzl(C56396yDv.copydefault(lValueOf.longValue()));
            }
        }
        C56396yDv c56396yDv = c56396yDvKWHzl;
        java.lang.String strName = response.protocol().name();
        if (responseBodyBody == null || (bArrBytes = responseBodyBody.bytes()) == null) {
            bArrBytes = new byte[0];
        }
        return new C4326BbW(yDB.AEQbTJ((short) response.code()), linkedHashMap, response.request().url().toString(), bArrBytes, string, c56396yDv, strName, null);
    }
}
