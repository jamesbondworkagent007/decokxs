package com.okinc.network.okg.decrypt;

import com.okinc.okex.safety.NativeApi;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56521yIl;
import o.pUU;
import o.pUX;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class OKDecryptInterceptor implements Interceptor {
    public static final Application Companion = new Application(null);

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.decrypt.OKDecryptInterceptor.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.code() < 200 || responseProceed.code() >= 300) {
            return responseProceed;
        }
        String strHeader$default = Response.header$default(responseProceed, "x-response-time", null, 2, null);
        String strHeader$default2 = Response.header$default(responseProceed, "x-response-authorization", null, 2, null);
        if (strHeader$default == null || strHeader$default.length() == 0 || strHeader$default2 == null || strHeader$default2.length() == 0) {
            return responseProceed;
        }
        long jCopydefault = C33129mqd.copydefault(C56521yIl.copydefault, (Object) strHeader$default) / ((long) 1000);
        ResponseBody responseBodyBody = responseProceed.body();
        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
        if (strString == null || strString.length() == 0) {
            return responseProceed;
        }
        byte[] bArrCopydefault = copydefault(strHeader$default2, jCopydefault, strString);
        Response.Builder builderNewBuilder = responseProceed.newBuilder();
        ResponseBody.Companion companion = ResponseBody.Companion;
        ResponseBody responseBodyBody2 = responseProceed.body();
        return builderNewBuilder.body(companion.create(bArrCopydefault, responseBodyBody2 != null ? responseBodyBody2.contentType() : null)).build();
    }

    public final byte[] copydefault(String str, long j, String str2) throws DecryptException {
        pUU.KWHzl("OKDecryptInterceptor", "decryptBodyOptimized");
        byte[] bArrEZpvd = EZpvd(str, j, str2);
        if (bArrEZpvd != null) {
            return bArrEZpvd;
        }
        pUU.KWHzl("OKDecryptInterceptor", "Decrypt Failed");
        throw new DecryptException("Decrypt Failed");
    }

    public final byte[] EZpvd(String str, long j, String str2) {
        try {
            return NativeApi.decryptBodyOptimized(str, j, str2);
        } catch (Throwable th) {
            pUU.copydefault("OKDecryptInterceptor", "doDecryptBodyOptimized " + th);
            pUX.OLrzqt.AEQbTJ(th);
            return null;
        }
    }

    public static final class DecryptException extends IOException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DecryptException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public DecryptException(String str) {
            super(str);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Decrypt Failed") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:81) call: com.okinc.network.okg.decrypt.OKDecryptInterceptor.DecryptException.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ DecryptException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Decrypt Failed" : str);
        }
    }
}
