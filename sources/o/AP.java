package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AP implements Interceptor {
    public static final AP copydefault = new AP();

    private AP() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        AK akAEQbTJ;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        C4409Bd c4409Bd = (C4409Bd) request.tag(C4409Bd.class);
        if (c4409Bd == null || (akAEQbTJ = c4409Bd.AEQbTJ()) == null) {
            return chain.proceed(request);
        }
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("server.address", request.url().host() + AbstractJsonLexerKt.COLON + request.url().port());
        InterfaceC56293yA interfaceC56293yAAEQbTJ = c58002yt.AEQbTJ();
        if (request.body() != null) {
            Request.Builder builderNewBuilder = request.newBuilder();
            java.lang.String strMethod = request.method();
            RequestBody requestBodyBody = request.body();
            request = builderNewBuilder.method(strMethod, requestBodyBody != null ? AO.KWHzl(requestBodyBody, akAEQbTJ.OLrzqt(), interfaceC56293yAAEQbTJ) : null).build();
        }
        Response responseProceed = chain.proceed(request);
        ResponseBody responseBodyBody = responseProceed.body();
        if (responseBodyBody != null && responseBodyBody.contentLength() == 0) {
            return responseProceed;
        }
        Response.Builder builderNewBuilder2 = responseProceed.newBuilder();
        ResponseBody responseBodyBody2 = responseProceed.body();
        return builderNewBuilder2.body(responseBodyBody2 != null ? AO.AEQbTJ(responseBodyBody2, akAEQbTJ.EZpvd(), interfaceC56293yAAEQbTJ) : null).build();
    }
}
