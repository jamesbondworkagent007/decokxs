package o;

import com.okinc.network.engine.bean.EngineBean;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43277rmJ {
    public static final C43277rmJ EZpvd = new C43277rmJ();

    private C43277rmJ() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Response OLrzqt(@NotNull Interceptor.Chain chain) {
        java.lang.String str;
        EngineBean.Rule.Action action;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        EngineBean.Rule ruleEZpvd = C43274rmG.EZpvd.EZpvd(request);
        java.lang.String type = (ruleEZpvd == null || (action = ruleEZpvd.getAction()) == null) ? null : action.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -614252534:
                    if (type.equals("forwardRequest")) {
                        pUU.KWHzl("RuleAction", "forwardRequest " + request.url() + " match " + ruleEZpvd.getName());
                        return chain.proceed(AEQbTJ(request, ruleEZpvd.getAction()));
                    }
                    break;
                case 3357066:
                    if (type.equals("mock")) {
                        pUU.KWHzl("RuleAction", "mock " + request.url() + " match " + ruleEZpvd.getName());
                        return KWHzl(request, ruleEZpvd.getAction());
                    }
                    break;
                case 94416770:
                    str = "cache";
                    type.equals(str);
                    break;
                case 276802677:
                    if (type.equals("modifyRequest")) {
                        pUU.KWHzl("RuleAction", "modifyRequest " + request.url() + " match " + ruleEZpvd.getName());
                        return chain.proceed(OLrzqt(request, ruleEZpvd.getAction()));
                    }
                    break;
                case 1052666732:
                    str = "transform";
                    type.equals(str);
                    break;
            }
        }
        return null;
    }

    public final Response KWHzl(@NotNull Request request, @NotNull EngineBean.Rule.Action action) {
        Protocol protocol;
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(action, "");
        if (action.getResponse() == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        java.util.Map<java.lang.String, java.lang.String> headers = action.getResponse().getHeaders();
        if (headers != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : headers.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (value != null) {
                    builder.add(key, value);
                }
            }
        }
        Headers headersBuild = builder.build();
        try {
            Protocol.Companion companion = Protocol.Companion;
            java.lang.String hTTPVersion = action.getResponse().getHTTPVersion();
            if (hTTPVersion == null) {
                hTTPVersion = "";
            }
            protocol = companion.get(hTTPVersion);
        } catch (java.lang.Exception unused) {
            protocol = Protocol.HTTP_1_1;
        }
        if (action.getResponse().getBody() == null) {
            Response.Builder builderProtocol = new Response.Builder().request(request).code(action.getResponse().getStatusCode()).protocol(protocol);
            java.lang.String message = action.getResponse().getMessage();
            return builderProtocol.message(message != null ? message : "").headers(headersBuild).build();
        }
        MediaType mediaType = MediaType.Companion.get("application/json");
        Response.Builder builderHeaders = new Response.Builder().request(request).protocol(protocol).code(action.getResponse().getStatusCode()).headers(headersBuild);
        java.lang.String message2 = action.getResponse().getMessage();
        if (message2 == null) {
            message2 = "";
        }
        Response.Builder builderMessage = builderHeaders.message(message2);
        ResponseBody.Companion companion2 = ResponseBody.Companion;
        java.lang.String string = action.getResponse().getBody().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return builderMessage.body(companion2.create(string, mediaType)).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Request OLrzqt(@NotNull Request request, @NotNull EngineBean.Rule.Action action) {
        java.lang.String upperCase;
        RequestBody requestBodyBody;
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(action, "");
        EngineBean.Rule.Action.Modification modification = action.getModification();
        if (modification == null) {
            return request;
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        java.util.Map<java.lang.String, java.lang.String> headers = modification.getHeaders();
        if (headers != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : headers.entrySet()) {
                builderNewBuilder.header(entry.getKey(), entry.getValue());
            }
        }
        java.util.Map<java.lang.String, java.lang.String> queries = modification.getQueries();
        if (queries != null) {
            HttpUrl.Builder builderNewBuilder2 = request.url().newBuilder();
            for (Map.Entry<java.lang.String, java.lang.String> entry2 : queries.entrySet()) {
                java.lang.String key = entry2.getKey();
                java.lang.String value = entry2.getValue();
                builderNewBuilder2.removeAllQueryParameters(key);
                builderNewBuilder2.addQueryParameter(key, value);
            }
            builderNewBuilder.url(builderNewBuilder2.build());
        }
        java.lang.String method = modification.getMethod();
        if (method != null) {
            upperCase = method.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (upperCase == null) {
                upperCase = request.method().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            }
        }
        if (!HttpMethod.permitsRequestBody(upperCase) && modification.getBody() == null) {
            builderNewBuilder.method(upperCase, null);
        } else {
            if (modification.getBody() != null) {
                MediaType mediaType = MediaType.Companion.get("application/json");
                RequestBody.Companion companion = RequestBody.Companion;
                java.lang.String string = modification.getBody().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                requestBodyBody = companion.create(string, mediaType);
            } else {
                requestBodyBody = request.body();
            }
            builderNewBuilder.method(upperCase, requestBodyBody);
        }
        return builderNewBuilder.build();
    }

    public final Request AEQbTJ(@NotNull Request request, @NotNull EngineBean.Rule.Action action) {
        java.lang.String path;
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(action, "");
        EngineBean.Rule.Action.ForwardConfig forwardConfig = action.getForwardConfig();
        return (forwardConfig == null || (path = forwardConfig.getPath()) == null || path.length() == 0) ? request : request.newBuilder().url(request.url().newBuilder().encodedPath(path).build()).build();
    }
}
