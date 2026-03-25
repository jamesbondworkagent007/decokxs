package o;

import com.google.gson.JsonObject;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OKCache;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43275rmH implements Interceptor {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final C43276rmI KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43275rmH() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C43275rmH(@NotNull C43276rmI c43276rmI) {
        Intrinsics.checkNotNullParameter(c43276rmI, "");
        this.KWHzl = c43276rmI;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:o.rmI:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.rmI:0x0004: INVOKE  STATIC call: o.rmI.AEQbTJ():o.rmI A[MD:():o.rmI (m), WRAPPED] (LINE:20)) : (r1v0 o.rmI))
 A[MD:(o.rmI):void (m)] (LINE:20) call: o.rmH.<init>(o.rmI):void type: THIS */
    public /* synthetic */ C43275rmH(C43276rmI c43276rmI, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C43276rmI.AEQbTJ() : c43276rmI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [27=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        if (!Intrinsics.EZpvd((java.lang.Object) chain.request().method(), (java.lang.Object) "GET")) {
            return chain.proceed(chain.request());
        }
        java.lang.String strHeader = chain.request().header("Cache-Strategy");
        if (strHeader != null) {
            switch (strHeader.hashCode()) {
                case -1931622157:
                    if (strHeader.equals("FIRST_CACHE")) {
                        return AEQbTJ(chain);
                    }
                    break;
                case -1617752220:
                    if (strHeader.equals("NO_CACHE")) {
                        return KWHzl(chain);
                    }
                    break;
                case 440260447:
                    if (strHeader.equals("FIRST_NETWORK")) {
                        return copydefault(chain);
                    }
                    break;
                case 1884471567:
                    if (strHeader.equals("ONLY_CACHE")) {
                        return OLrzqt(chain);
                    }
                    break;
            }
        }
        return chain.proceed(chain.request());
    }

    public final Response AEQbTJ(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseAEQbTJ = AEQbTJ(chain.request());
        if (responseAEQbTJ != null) {
            return responseAEQbTJ;
        }
        Response responseProceed = chain.proceed(EZpvd(chain));
        return responseProceed.isSuccessful() ? EZpvd(responseProceed, responseAEQbTJ) : responseProceed;
    }

    public final Response copydefault(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseAEQbTJ = AEQbTJ(chain.request());
        try {
            Response responseProceed = chain.proceed(EZpvd(chain));
            if (responseProceed.isSuccessful()) {
                responseProceed = EZpvd(responseProceed, responseAEQbTJ);
                if (responseAEQbTJ != null) {
                    responseAEQbTJ.close();
                }
            } else if (responseAEQbTJ != null) {
                responseProceed.close();
                return responseAEQbTJ;
            }
            return responseProceed;
        } catch (java.lang.Exception e) {
            if (responseAEQbTJ != null) {
                return responseAEQbTJ;
            }
            throw new java.io.IOException(e.getMessage());
        }
    }

    public final Response KWHzl(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseAEQbTJ = AEQbTJ(chain.request());
        Response responseProceed = chain.proceed(EZpvd(chain));
        if (responseProceed.isSuccessful()) {
            responseProceed = EZpvd(responseProceed, responseAEQbTJ);
            if (responseAEQbTJ != null) {
                responseAEQbTJ.close();
            }
        } else if (responseAEQbTJ != null) {
            responseAEQbTJ.close();
        }
        return responseProceed;
    }

    public final Response OLrzqt(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseAEQbTJ = AEQbTJ(chain.request());
        if (responseAEQbTJ != null) {
            return responseAEQbTJ;
        }
        throw new java.io.IOException("No Cache Data");
    }

    public final Response EZpvd(@NotNull Response response, Response response2) {
        Intrinsics.checkNotNullParameter(response, "");
        Response responseBuild = response.newBuilder().cacheResponse(AEQbTJ(response2)).build();
        try {
            C43276rmI c43276rmI = this.KWHzl;
            Response responseKWHzl = c43276rmI.KWHzl(c43276rmI.put$OKNetwork_network(responseBuild), responseBuild);
            Intrinsics.copydefault(responseKWHzl);
            return responseKWHzl;
        } catch (java.lang.Exception unused) {
            return response;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: okhttp3.OKCache.get$default(okhttp3.OKCache, okhttp3.Request, boolean, int, java.lang.Object):okhttp3.Response */
    public final Response AEQbTJ(@NotNull Request request) {
        int iAhwBna;
        Intrinsics.checkNotNullParameter(request, "");
        try {
            Response response = OKCache.get$default(this.KWHzl, request, false, 2, null);
            if (response != null && response.isSuccessful()) {
                java.lang.String strHeader = request.header("Cache-Expire");
                if (strHeader != null && (C33129mqd.AhwBna(strHeader) < (iAhwBna = C33129mqd.AhwBna(java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - response.receivedResponseAtMillis()) / ((long) 1000)))) || iAhwBna < 0)) {
                    this.KWHzl.remove(request);
                    return null;
                }
                return EZpvd(response);
            }
        } catch (java.lang.Exception e) {
            if (e instanceof java.lang.IllegalArgumentException) {
                java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException(e.getMessage() + ", url:" + request.url(), e);
                yHO<java.lang.Throwable, java.util.Map<java.lang.String, java.lang.String>, java.lang.Boolean, Unit> yhoIsConnected = C43292rmY.OLrzqt.isConnected();
                if (yhoIsConnected != null) {
                    yhoIsConnected.invoke(illegalArgumentException, C56424yEw.KWHzl(), java.lang.Boolean.FALSE);
                }
            }
        }
        return null;
    }

    public final Response EZpvd(@NotNull Response response) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(response, "");
        ResponseBody responseBody = null;
        try {
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                return response;
            }
            try {
                MediaType mediaTypeContentType = responseBodyBody.contentType();
                java.lang.String strString = responseBodyBody.string();
                JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(strString);
                if (jsonObjectOLrzqt == null) {
                    return response.newBuilder().body(ResponseBody.Companion.create(strString, responseBodyBody.contentType())).build();
                }
                jsonObjectOLrzqt.addProperty("_cIsFromCache", java.lang.Boolean.TRUE);
                java.lang.String string = jsonObjectOLrzqt.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return response.newBuilder().body(ResponseBody.Companion.create(string, mediaTypeContentType)).build();
            } catch (java.lang.Throwable unused) {
                str = null;
                responseBody = responseBodyBody;
                pUU.copydefault("OKCacheInterceptor", "addCacheFlagToResponse, error.");
                try {
                    if (responseBody != null && str != null) {
                        response = response.newBuilder().body(ResponseBody.Companion.create(str, responseBody.contentType())).build();
                    } else {
                        response = response.newBuilder().build();
                    }
                    return response;
                } catch (java.lang.Throwable unused2) {
                    return response.newBuilder().build();
                }
            }
        } catch (java.lang.Throwable unused3) {
            str = null;
        }
    }

    public final Request EZpvd(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.request().newBuilder().removeHeader("Cache-Strategy").removeHeader("Cache-Expire").build();
    }

    public final Response AEQbTJ(Response response) {
        return (response != null ? response.body() : null) != null ? response.newBuilder().body(null).build() : response;
    }

    /* JADX INFO: renamed from: o.rmH$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rmH.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
