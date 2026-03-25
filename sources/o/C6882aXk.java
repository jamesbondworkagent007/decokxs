package o;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.biz.net.common.CustomCanceledException;
import com.okinc.biz.net.common.OKNetWorkException;
import com.okinc.network.okg.request.tag.IgnoreTKInvalidNotification;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.rxutils.RxBus;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.StreamResetException;
import okio.BufferedSource;
import okio.GzipSource;
import org.apache.http.conn.ConnectTimeoutException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6882aXk implements Interceptor {
    public static final Activity Companion = new Activity(null);

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws OKServerException {
        Intrinsics.checkNotNullParameter(chain, "");
        try {
            Request request = chain.request();
            java.lang.String strEncodedPath = request.url().encodedPath();
            InterfaceC43424roy interfaceC43424roy = (InterfaceC43424roy) C43422row.AEQbTJ(request, InterfaceC43424roy.class);
            Response responseProceed = chain.proceed(request);
            if (responseProceed.code() < 200 || responseProceed.code() >= 300) {
                EZpvd(responseProceed, request, strEncodedPath);
                throw new KotlinNothingValueException();
            }
            if (interfaceC43424roy != null) {
                return responseProceed;
            }
            AEQbTJ(EZpvd(responseProceed), strEncodedPath, request, responseProceed.code());
            return responseProceed;
        } catch (java.io.IOException e) {
            HttpUrl httpUrlUrl = chain.request().url();
            pUU.KWHzl("HandleExceptionInterceptor", "got network error msg from intercept catch");
            OKServerException oKServerExceptionOLrzqt = C43422row.OLrzqt(copydefault(e, C43422row.OLrzqt(), chain.call().isCanceled()));
            oKServerExceptionOLrzqt.setRequestUrl(httpUrlUrl.encodedPath());
            throw oKServerExceptionOLrzqt;
        }
    }

    public final java.lang.Void EZpvd(@NotNull Response response, @NotNull Request request, @NotNull java.lang.String str) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(response, "");
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(str, "");
        C43466rpn c43466rpn = C43466rpn.OLrzqt;
        boolean zAEQbTJ = c43466rpn.AEQbTJ(request);
        pUU.KWHzl("HandleExceptionInterceptor", "receive back-end http error: " + response.request().url() + ",code:" + response.code() + ", isWeb3Request: " + zAEQbTJ);
        if ((response.code() == 401 || response.code() == 403) && !c43466rpn.AEQbTJ(str) && !copydefault(request) && !zAEQbTJ) {
            RxBus.AEQbTJ(new C43470rpr(str, response.code(), copydefault(EZpvd(response))));
        }
        ResponseBody responseBodyBody = response.body();
        throw copydefault(response.code(), responseBodyBody != null ? responseBodyBody.string() : null, request);
    }

    public final void AEQbTJ(JsonObject jsonObject, @NotNull java.lang.String str, @NotNull Request request, int i) throws OKServerException {
        int i2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(request, "");
        java.lang.String strCopydefault = copydefault(jsonObject);
        if (strCopydefault.length() <= 0 || (i2 = java.lang.Integer.parseInt(strCopydefault)) == 0) {
            return;
        }
        Function1<java.lang.Integer, java.lang.Boolean> function1AYXKKw = C43292rmY.OLrzqt.AYXKKw();
        if (function1AYXKKw != null && function1AYXKKw.invoke(java.lang.Integer.valueOf(i2)).booleanValue()) {
            RxBus.AEQbTJ(new C43455rpc(str, i2, jsonObject));
        }
        pUU.KWHzl("HandleExceptionInterceptor", "response code != 0: " + request.url());
        OKServerException oKServerException = new OKServerException(i2, jsonObject != null ? C43422row.OLrzqt(jsonObject) : null, jsonObject, null, 8, null);
        oKServerException.setRequestUrl(str);
        oKServerException.setHttpCode(java.lang.Integer.valueOf(i));
        throw oKServerException;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Throwable added to exception handler: 'JsonSyntaxException | IllegalStateException', keep only Throwable */
    public final JsonObject EZpvd(@NotNull Response response) {
        java.nio.charset.Charset charset;
        Intrinsics.checkNotNullParameter(response, "");
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            return null;
        }
        long jContentLength = responseBodyBody.contentLength();
        Headers headers = response.headers();
        MediaType mediaTypeContentType = responseBodyBody.contentType();
        if (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(StandardCharsets.UTF_8)) == null) {
            charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
        }
        if (jContentLength != 0) {
            try {
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
                return JsonParser.parseString(buffer.clone().readString(charset)).getAsJsonObject();
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    public final java.lang.String copydefault(JsonObject jsonObject) {
        if (jsonObject == null || !jsonObject.has("code")) {
            return "";
        }
        java.lang.String asString = jsonObject.get("code").getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "");
        return asString;
    }

    public final java.io.IOException copydefault(@NotNull java.io.IOException iOException, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(iOException, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String message = iOException.getMessage();
        if (message != null) {
            str = message;
        }
        if (z) {
            CustomCanceledException customCanceledException = new CustomCanceledException(str);
            customCanceledException.initCause(iOException);
            return customCanceledException;
        }
        if (iOException instanceof UnknownHostException) {
            return new UnknownHostException(str);
        }
        if (iOException instanceof ConnectException) {
            return new ConnectException(str);
        }
        if (iOException instanceof SocketTimeoutException) {
            return new SocketTimeoutException(str);
        }
        if (iOException instanceof ConnectTimeoutException) {
            return new ConnectTimeoutException(str);
        }
        if (iOException instanceof StreamResetException) {
            return new OKNetWorkException(str, iOException);
        }
        if (iOException instanceof OKServerException) {
            return iOException;
        }
        if (Intrinsics.EZpvd((java.lang.Object) iOException.getMessage(), (java.lang.Object) "Canceled")) {
            return new CustomCanceledException(str);
        }
        try {
            java.lang.Object objNewInstance = iOException.getClass().getConstructor(java.lang.String.class).newInstance(str);
            Intrinsics.copydefault(objNewInstance);
            return (java.io.IOException) objNewInstance;
        } catch (java.lang.Throwable unused) {
            return new OKNetWorkException(str, iOException);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0007 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final java.io.IOException copydefault(int i, java.lang.String str, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        try {
            if (str != null) {
                JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                Intrinsics.copydefault(asJsonObject);
                i = EZpvd(i, C43422row.OLrzqt(asJsonObject), asJsonObject, request, null, java.lang.Integer.valueOf((int) i));
            } else {
                pUU.KWHzl("HandleExceptionInterceptor", "got network error msg from parseErrRespToCustomException else");
                i = EZpvd(i, C43422row.OLrzqt(), null, request, null, java.lang.Integer.valueOf((int) i));
            }
            return i;
        } catch (java.lang.Exception e) {
            pUU.KWHzl("HandleExceptionInterceptor", "got network error msg from parseErrRespToCustomException catch");
            return EZpvd(i == true ? 1 : 0, C43422row.OLrzqt(), null, request, e, java.lang.Integer.valueOf((int) i));
        }
    }

    public final OKServerException EZpvd(int i, java.lang.String str, JsonObject jsonObject, Request request, java.lang.Throwable th, java.lang.Integer num) {
        OKServerException oKServerException = new OKServerException(i, str, jsonObject, th);
        oKServerException.setRequestUrl(request.url().encodedPath());
        oKServerException.setHttpCode(num);
        return oKServerException;
    }

    public final boolean copydefault(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        return request.tag(IgnoreTKInvalidNotification.class) != null;
    }

    /* JADX INFO: renamed from: o.aXk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
