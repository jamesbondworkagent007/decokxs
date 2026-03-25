package o;

import com.okinc.okex.safety.NativeApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6892aXu implements Interceptor {
    public static java.lang.String KWHzl;
    public final InterfaceC43339rnS AEQbTJ;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.aXu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public C6892aXu(InterfaceC43339rnS interfaceC43339rnS) {
        this.AEQbTJ = interfaceC43339rnS;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(copydefault(chain.request()));
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return NativeApi.netApiSignature(str, j, str2);
    }

    public final Request copydefault(@NotNull Request request) {
        InterfaceC43339rnS interfaceC43339rnS;
        Intrinsics.checkNotNullParameter(request, "");
        Request.Builder builderNewBuilder = request.newBuilder();
        boolean z = Intrinsics.EZpvd((java.lang.Object) request.method(), (java.lang.Object) "GET") || Intrinsics.EZpvd((java.lang.Object) request.method(), (java.lang.Object) "POST");
        if (!z) {
            pUU.AEQbTJ("OKSignInterceptor:not support originalRequest.method=" + request.method());
        }
        if (request.headers().names().contains("OK-VERIFY-TOKEN") && z) {
            boolean zEZpvd = C43340rnT.Companion.EZpvd(request);
            java.lang.String strHeader = request.header("OK-VERIFY-TOKEN");
            java.lang.String strAEQbTJ = null;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strHeader)) {
                strHeader = null;
            }
            if (strHeader == null) {
                strHeader = EZpvd(builderNewBuilder);
            }
            if (!zEZpvd) {
                java.lang.String strKWHzl = KWHzl(request);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                    try {
                        interfaceC43339rnS = this.AEQbTJ;
                    } catch (java.lang.Exception unused) {
                    }
                    long jKWHzl = interfaceC43339rnS != null ? interfaceC43339rnS.KWHzl() : jCurrentTimeMillis;
                    try {
                        Intrinsics.copydefault((java.lang.Object) strKWHzl);
                        strAEQbTJ = AEQbTJ(strHeader, jKWHzl, strKWHzl);
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("OKSignInterceptor", th);
                    }
                    pUU.AEQbTJ("[OKNetwork]: generate OKSign," + request.method() + ", path:" + request.url().encodedPath() + ",currentTimeStamp:" + jCurrentTimeMillis + ",timestamp:" + jKWHzl);
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
                        Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
                        builderNewBuilder.addHeader("OK-VERIFY-SIGN", strAEQbTJ);
                        return builderNewBuilder.build();
                    }
                } else {
                    pUU.AEQbTJ("OKSignInterceptor:signContent is null," + request.url().encodedPath() + " sign fail");
                }
            } else if (C43292rmY.OLrzqt.ORxRYg()) {
                throw new java.lang.IllegalArgumentException("can't sign the encrypt request,please check it !!!");
            }
            builderNewBuilder.removeHeader("OK-VERIFY-TOKEN");
        }
        return builderNewBuilder.build();
    }

    public final java.lang.String KWHzl(@NotNull Request request) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(request, "");
        java.lang.String strMethod = request.method();
        if (Intrinsics.EZpvd((java.lang.Object) strMethod, (java.lang.Object) "GET")) {
            java.lang.String strEncodedQuery = request.url().encodedQuery();
            if (strEncodedQuery != null) {
                return request.url().encodedPath() + strEncodedQuery;
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) strMethod, (java.lang.Object) "POST") && (strCopydefault = copydefault(request.body())) != null) {
            return request.url().encodedPath() + strCopydefault;
        }
        return null;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String copydefault(RequestBody requestBody) {
        if (requestBody == null) {
            return null;
        }
        okio.Buffer buffer = new okio.Buffer();
        try {
            requestBody.writeTo(buffer);
            java.lang.String utf8 = buffer.readUtf8();
            yFA.copydefault(buffer, null);
            return utf8;
        } finally {
        }
    }

    public final java.lang.String EZpvd(Request.Builder builder) {
        java.lang.String str = KWHzl;
        if (str == null || str.length() == 0) {
            ByteString.Companion companion = ByteString.Companion;
            java.lang.String strCopydefault = xVW.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            KWHzl = companion.encodeUtf8(strCopydefault).md5().hex();
        }
        Request.Builder builderRemoveHeader = builder.removeHeader("OK-VERIFY-TOKEN");
        java.lang.String str2 = KWHzl;
        Intrinsics.copydefault((java.lang.Object) str2);
        builderRemoveHeader.addHeader("OK-VERIFY-TOKEN", str2);
        java.lang.String str3 = KWHzl;
        Intrinsics.copydefault((java.lang.Object) str3);
        return str3;
    }
}
