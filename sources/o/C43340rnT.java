package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.okinc.okex.safety.NativeApi;
import com.okinc.okuser.data.Token;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.rnT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43340rnT implements Interceptor {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC43339rnS OLrzqt;

    /* JADX INFO: renamed from: o.rnT$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.Map<java.lang.String, ? extends java.lang.Object>> {
    }

    /* JADX INFO: renamed from: o.rnT$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rnT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final boolean EZpvd(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "");
            return Intrinsics.EZpvd((java.lang.Object) "TIME", (java.lang.Object) request.header("Encrypt-Strategy")) && C59449zhJ.gEmmrt(request.method(), "POST", true);
        }

        public final boolean AEQbTJ(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "");
            return 1 == C33129mqd.AhwBna(request.header("Encrypt-ignore-extra-body-param"));
        }
    }

    public C43340rnT(InterfaceC43339rnS interfaceC43339rnS) {
        this.OLrzqt = interfaceC43339rnS;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        InterfaceC43339rnS interfaceC43339rnS;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.lang.String strEncodedPath = request.url().encodedPath();
        java.lang.String strHeader = request.header("sign");
        java.lang.String strHeader2 = request.header("Authorization");
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        Token tokenAhwBna = c43292rmY.AwvSrB().AhwBna();
        java.lang.String value = tokenAhwBna != null ? tokenAhwBna.getValue() : null;
        if (strHeader2 == null) {
            strHeader2 = value == null ? "unknown token" : value;
        }
        if (strHeader == null) {
            strHeader = strHeader2;
        }
        RequestBody requestBodyBody = request.body();
        Activity activity = Companion;
        if (activity.EZpvd(request)) {
            boolean zAEQbTJ = activity.AEQbTJ(request);
            if (requestBodyBody == null) {
                if (zAEQbTJ) {
                    if (c43292rmY.ORxRYg()) {
                        throw new java.lang.IllegalArgumentException("OKEncrypt can't support empty body request, please check for it !!!");
                    }
                    return chain.proceed(request);
                }
                requestBodyBody = RequestBody.Companion.create$default(RequestBody.Companion, "{\"appTime\": \"" + java.lang.System.currentTimeMillis() + "\"}", (MediaType) null, 1, (java.lang.Object) null);
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            try {
                interfaceC43339rnS = this.OLrzqt;
            } catch (java.lang.Exception unused) {
            }
            long jKWHzl = interfaceC43339rnS != null ? interfaceC43339rnS.KWHzl() : jCurrentTimeMillis;
            pUU.EZpvd("OKEncryptInterceptor", "getTime: " + jKWHzl + ", currentTime: " + jCurrentTimeMillis);
            long j = jCurrentTimeMillis - jKWHzl;
            if (1 > j || j >= 11) {
                jCurrentTimeMillis = jKWHzl;
            }
            java.lang.String strOLrzqt = OLrzqt(requestBodyBody, zAEQbTJ);
            if (strOLrzqt.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
                if (C43292rmY.OLrzqt.ORxRYg()) {
                    throw new java.lang.IllegalArgumentException("OKEncrypt interface must have body!");
                }
                return chain.proceed(request);
            }
            Request.Builder builderNewBuilder = request.newBuilder();
            java.lang.String strEZpvd = EZpvd(strHeader, jCurrentTimeMillis, strOLrzqt);
            pUU.KWHzl("OKEncryptInterceptor", "path:" + strEncodedPath + "\noriginalBody: " + strOLrzqt + "\nbody:" + ((java.lang.Object) strEZpvd));
            java.lang.String strMethod = request.method();
            RequestBody.Companion companion = RequestBody.Companion;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("{\"body\": \"");
            sb.append((java.lang.Object) strEZpvd);
            sb.append("\"}");
            builderNewBuilder.method(strMethod, companion.create(sb.toString(), requestBodyBody.contentType()));
            builderNewBuilder.removeHeader("Encrypt-Strategy");
            Response responseProceed = chain.proceed(builderNewBuilder.build());
            ResponseBody responseBodyBody = responseProceed.body();
            MediaType mediaTypeContentType = responseBodyBody != null ? responseBodyBody.contentType() : null;
            java.lang.String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (EZpvd(strString)) {
                Request.Builder builderNewBuilder2 = request.newBuilder();
                java.lang.String strEncryptContent = NativeApi.encryptContent(strHeader);
                Intrinsics.checkNotNullExpressionValue(strEncryptContent, "");
                return chain.proceed(builderNewBuilder2.header("X-Client-Time", strEncryptContent).build());
            }
            return responseProceed.newBuilder().body(strString != null ? ResponseBody.Companion.create(strString, mediaTypeContentType) : null).build();
        }
        return chain.proceed(request);
    }

    public final boolean EZpvd(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            return new JSONObject(str).optInt("code", -1) == 400100;
        } catch (JSONException e) {
            e.printStackTrace();
            pUU.valueOf("OKEncryptInterceptor", "needRetry exception: " + Unit.INSTANCE);
            return false;
        }
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("OKEncryptInterceptor", "encryptBodyOptimized");
        return OLrzqt(str, j, str2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strEncryptBodyOptimized = NativeApi.encryptBodyOptimized(str, j, str2);
        Intrinsics.checkNotNullExpressionValue(strEncryptBodyOptimized, "");
        return strEncryptBodyOptimized;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String OLrzqt(RequestBody requestBody, boolean z) {
        okio.Buffer buffer = new okio.Buffer();
        try {
            requestBody.writeTo(buffer);
            java.lang.String utf8 = buffer.readUtf8();
            yFA.copydefault(buffer, null);
            if (!z && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) utf8, (java.lang.CharSequence) "appTime", false, 2, (java.lang.Object) null)) {
                if (requestBody instanceof FormBody) {
                    return utf8 + "&appTime=" + java.lang.System.currentTimeMillis();
                }
                try {
                    if (((LinkedTreeMap) new Gson().fromJson(utf8, new TaskDescription().getType())) == null) {
                        LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                        linkedTreeMap.put("appTime", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                        utf8 = new JSONObject(linkedTreeMap).toString();
                    } else if (C59449zhJ.endsWith$default(utf8, "}", false, 2, null)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(utf8.subSequence(0, utf8.length() - 1));
                        sb.append(",\"appTime\":\"" + java.lang.System.currentTimeMillis() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                        sb.append("}");
                        utf8 = sb.toString();
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    pUU.copydefault("OKEncryptInterceptor", "encrypt exception: " + Unit.INSTANCE);
                }
            }
            return utf8;
        } finally {
        }
    }
}
