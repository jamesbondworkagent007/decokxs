package o;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.rxutils.RxBus;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.GzipSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57347ygh implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.lang.String strEncodedPath = request.url().encodedPath();
        Response responseProceed = chain.proceed(request);
        try {
            if (responseProceed.code() == 401 || responseProceed.code() == 403) {
                RxBus.AEQbTJ(new C57362ygw(strEncodedPath, responseProceed.code(), OLrzqt(EZpvd(responseProceed))));
            }
        } catch (java.lang.Exception e) {
            pUU.KWHzl(e);
        }
        return responseProceed;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Throwable added to exception handler: 'JsonSyntaxException | IllegalStateException', keep only Throwable */
    public final JsonObject EZpvd(Response response) throws java.io.IOException {
        java.nio.charset.Charset charset;
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            return null;
        }
        long jContentLength = responseBodyBody.contentLength();
        Headers headers = response.headers();
        BufferedSource bufferedSourceSource = responseBodyBody.source();
        bufferedSourceSource.request(Long.MAX_VALUE);
        okio.Buffer buffer = bufferedSourceSource.getBuffer();
        if (C59449zhJ.gEmmrt("gzip", headers.get("Content-Encoding"), true)) {
            GzipSource gzipSource = new GzipSource(buffer.clone());
            try {
                buffer = new okio.Buffer();
                buffer.writeAll(gzipSource);
                yFA.copydefault(gzipSource, null);
            } finally {
            }
        }
        MediaType mediaTypeContentType = responseBodyBody.contentType();
        if (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(StandardCharsets.UTF_8)) == null) {
            charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
        }
        if (jContentLength != 0) {
            try {
                return JsonParser.parseString(buffer.clone().readString(charset)).getAsJsonObject();
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    public final java.lang.String OLrzqt(JsonObject jsonObject) {
        if (jsonObject == null || !jsonObject.has("code")) {
            return "";
        }
        java.lang.String asString = jsonObject.get("code").getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "");
        return asString;
    }
}
