package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.biz.net.common.InterceptorTimeoutMonitor;
import com.okinc.biz.net.common.SignTypeEnum;
import com.okinc.network.okg.tag.RequestTagEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C43340rnT;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aXg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6878aXg implements Interceptor {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final RequestTagEnum AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6878aXg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C6878aXg(@NotNull RequestTagEnum requestTagEnum) {
        Intrinsics.checkNotNullParameter(requestTagEnum, "");
        this.AEQbTJ = requestTagEnum;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:com.okinc.network.okg.tag.RequestTagEnum:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.network.okg.tag.RequestTagEnum:0x0004: SGET  A[WRAPPED] (LINE:16) com.okinc.network.okg.tag.RequestTagEnum.EXCHANGE com.okinc.network.okg.tag.RequestTagEnum) : (r1v0 com.okinc.network.okg.tag.RequestTagEnum))
 A[MD:(com.okinc.network.okg.tag.RequestTagEnum):void (m)] (LINE:16) call: o.aXg.<init>(com.okinc.network.okg.tag.RequestTagEnum):void type: THIS */
    public /* synthetic */ C6878aXg(RequestTagEnum requestTagEnum, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RequestTagEnum.EXCHANGE : requestTagEnum);
    }

    /* JADX INFO: renamed from: o.aXg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        java.lang.String strKWHzl;
        C6885aXn c6885aXnEZpvd;
        long j;
        InterceptorTimeoutMonitor interceptorTimeoutMonitor;
        strKWHzl = "";
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        if (!OLrzqt(request)) {
            copydefault(builderNewBuilder);
            return chain.proceed(builderNewBuilder.build());
        }
        InterceptorTimeoutMonitor interceptorTimeoutMonitor2 = InterceptorTimeoutMonitor.AEQbTJ;
        long jMarkStart$default = InterceptorTimeoutMonitor.markStart$default(interceptorTimeoutMonitor2, request.url().toString(), request.method(), "AsymmetricSignInterceptor", 0L, 8, null);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strHeader = request.header("X-Sign-Type-Key");
        pUU.KWHzl("AsymmetricSign", "method:" + request.method() + " signType: " + strHeader + " signTime: " + jCurrentTimeMillis + " path:" + request.url().encodedPath());
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (Intrinsics.EZpvd((java.lang.Object) strHeader, (java.lang.Object) SignTypeEnum.K1.getType())) {
            c6885aXnEZpvd = KWHzl(request);
            java.lang.String strKWHzl2 = KWHzl(request, builderNewBuilder, jCurrentTimeMillis);
            strKWHzl = strKWHzl2 != null ? C6887aXp.copydefault.AEQbTJ(strKWHzl2, c6885aXnEZpvd) : "";
            j = jMarkStart$default;
            interceptorTimeoutMonitor = interceptorTimeoutMonitor2;
        } else {
            c6885aXnEZpvd = EZpvd(request);
            java.lang.String strEncodedPath = request.url().encodedPath();
            boolean z = c6885aXnEZpvd == null;
            long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
            j = jMarkStart$default;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("path:");
            sb.append(strEncodedPath);
            sb.append(" , keyBean==null ");
            sb.append(z);
            sb.append("，costTime ");
            interceptorTimeoutMonitor = interceptorTimeoutMonitor2;
            sb.append(jCurrentTimeMillis3 - jCurrentTimeMillis2);
            pUU.KWHzl("AsymmetricSign", sb.toString());
            java.lang.String strKWHzl3 = KWHzl(request, builderNewBuilder, jCurrentTimeMillis);
            if (strKWHzl3 != null) {
                C6887aXp c6887aXp = C6887aXp.copydefault;
                byte[] bytes = strKWHzl3.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                strKWHzl = c6887aXp.KWHzl(bytes, c6885aXnEZpvd);
            }
        }
        copydefault(builderNewBuilder);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl) && c6885aXnEZpvd != null) {
            builderNewBuilder.header("X-Request-Timestamp", java.lang.String.valueOf(jCurrentTimeMillis));
            builderNewBuilder.header("X-Client-Signature", strKWHzl);
            builderNewBuilder.header("X-Client-Public-Key", c6885aXnEZpvd.EZpvd());
        }
        pUU.KWHzl("AsymmetricSign", "path:" + request.url().encodedPath() + " ,signature not empty " + C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl) + ",costTime " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis2));
        interceptorTimeoutMonitor.AEQbTJ(j);
        return chain.proceed(builderNewBuilder.build());
    }

    public final java.lang.String EZpvd(Request request, long j) {
        java.lang.String strEncodedPath = request.url().encodedPath();
        java.lang.String strEncodedQuery = request.url().encodedQuery();
        if (strEncodedQuery == null) {
            strEncodedQuery = "";
        }
        return strEncodedPath + strEncodedQuery + j;
    }

    public final java.lang.String OLrzqt(Request request, Request.Builder builder, long j) {
        if (request.body() instanceof MultipartBody) {
            pUU.KWHzl("AsymmetricSign", "MultipartBody " + request.url() + " do not sign");
            return null;
        }
        try {
            return request.url().encodedPath() + EZpvd(request, builder, j) + j;
        } catch (java.lang.Throwable th) {
            pUU.KWHzl("AsymmetricSign", "postRequestData " + request.url() + " " + th);
            return null;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String EZpvd(Request request, Request.Builder builder, long j) throws JSONException {
        RequestBody requestBodyCreate;
        RequestBody requestBodyBody = request.body();
        okio.Buffer buffer = new okio.Buffer();
        if (requestBodyBody != null) {
            try {
                requestBodyBody.writeTo(buffer);
            } finally {
            }
        }
        java.lang.String utf8 = buffer.readUtf8();
        yFA.copydefault(buffer, null);
        C43340rnT.Activity activity = C43340rnT.Companion;
        if (activity.EZpvd(request) && !activity.AEQbTJ(request)) {
            if (requestBodyBody == null) {
                java.lang.String str = "{\"appTime\": \"" + j + "\"}";
                requestBodyCreate = RequestBody.Companion.create$default(RequestBody.Companion, str, (MediaType) null, 1, (java.lang.Object) null);
                utf8 = str;
            } else {
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null && Intrinsics.EZpvd((java.lang.Object) mediaTypeContentType.subtype(), (java.lang.Object) MTPushConstants.Analysis.KEY_JSON)) {
                    JSONObject jSONObject = new JSONObject(utf8);
                    jSONObject.put("appTime", java.lang.String.valueOf(j));
                    utf8 = jSONObject.toString();
                } else if (requestBodyBody instanceof FormBody) {
                    utf8 = utf8 + "&appTime=" + j;
                }
                requestBodyCreate = RequestBody.Companion.create(utf8, mediaTypeContentType);
            }
            builder.method(request.method(), requestBodyCreate);
        }
        return utf8;
    }

    public final C6885aXn KWHzl(Request request) {
        java.lang.String strHeader = request.header("X-Client-Public-Key");
        java.lang.String str = strHeader == null ? "" : strHeader;
        java.lang.String strHeader2 = request.header("X-Client-Private-Key");
        java.lang.String str2 = strHeader2 == null ? "" : strHeader2;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return new C6885aXn(str, null, str2, 2, null);
        }
        InterfaceC6884aXm interfaceC6884aXmAEQbTJ = C6887aXp.copydefault.AEQbTJ();
        if (interfaceC6884aXmAEQbTJ != null) {
            return interfaceC6884aXmAEQbTJ.AEQbTJ();
        }
        return null;
    }

    public final boolean OLrzqt(Request request) {
        java.lang.String strHeader = request.header("OKAsymmetricSignEnable");
        boolean z = java.lang.Boolean.parseBoolean(strHeader);
        if (z) {
            return true;
        }
        if (this.AEQbTJ == RequestTagEnum.WEB3 || Intrinsics.EZpvd((java.lang.Object) strHeader, (java.lang.Object) "false")) {
            return z;
        }
        java.lang.String upperCase = request.method().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "POST")) {
            return true;
        }
        return z;
    }

    public final C6885aXn EZpvd(Request request) {
        java.lang.String strHeader = request.header("X-Alias-Key");
        if (strHeader != null) {
            C6891aXt c6891aXt = C6891aXt.KWHzl;
            return new C6885aXn(c6891aXt.copydefault(strHeader), c6891aXt.OLrzqt(strHeader), null, 4, null);
        }
        InterfaceC6884aXm interfaceC6884aXmOLrzqt = C6887aXp.copydefault.OLrzqt();
        if (interfaceC6884aXmOLrzqt != null) {
            return interfaceC6884aXmOLrzqt.AEQbTJ();
        }
        return null;
    }

    public final java.lang.String KWHzl(Request request, Request.Builder builder, long j) {
        java.lang.String upperCase = request.method().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "GET")) {
            return EZpvd(request, j);
        }
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "POST")) {
            return OLrzqt(request, builder, j);
        }
        return null;
    }

    public final void copydefault(Request.Builder builder) {
        builder.removeHeader("X-Sign-Type-Key");
        builder.removeHeader("X-Alias-Key");
        builder.removeHeader("X-Client-Public-Key");
        builder.removeHeader("X-Client-Private-Key");
    }
}
