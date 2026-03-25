package o;

import com.okinc.network.okg.cache.CacheStrategy;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import retrofit2.Invocation;
import retrofit2.http.Body;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.dbp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13929dbp implements Interceptor {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.dbp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dbp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ba A[LOOP:0: B:43:0x00b4->B:45:0x00ba, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0143 A[LOOP:3: B:70:0x013d->B:72:0x0143, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0094 A[EDGE_INSN: B:80:0x0094->B:42:0x0094 BREAK  A[LOOP:1: B:37:0x0083->B:82:?], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0121 A[EDGE_INSN: B:87:0x0121->B:69:0x0121 BREAK  A[LOOP:4: B:64:0x0110->B:89:?], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Request.Builder copydefault(Request.Builder builder, Request request) {
            java.lang.reflect.Method method;
            InterfaceC13893dbF[] interfaceC13893dbFArr;
            InterfaceC13893dbF interfaceC13893dbF;
            boolean z;
            java.util.Iterator it;
            boolean z2;
            java.util.Iterator it2;
            Invocation invocation = (Invocation) request.tag(Invocation.class);
            if (invocation != null && (method = invocation.method()) != null && (interfaceC13893dbFArr = (InterfaceC13893dbF[]) method.getAnnotationsByType(InterfaceC13893dbF.class)) != null && (interfaceC13893dbF = (InterfaceC13893dbF) yDV.zsXlph(interfaceC13893dbFArr)) != null) {
                java.lang.Object objTag = request.tag(C13894dbG.class);
                if (objTag == null) {
                    throw new java.lang.IllegalStateException(("SignRequestData is null when SignRequest(isEncrypted=" + interfaceC13893dbF.EZpvd() + ") is present").toString());
                }
                C13894dbG c13894dbG = (C13894dbG) objTag;
                int iCopydefault = interfaceC13893dbF.copydefault();
                boolean z3 = false;
                if (iCopydefault == 1) {
                    java.lang.annotation.Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "");
                    java.util.List listOLrzqt = yDN.OLrzqt(parameterAnnotations);
                    boolean z4 = listOLrzqt instanceof java.util.Collection;
                    if (z4 && listOLrzqt.isEmpty()) {
                        z = false;
                        java.lang.String strKWHzl = C13929dbp.Companion.KWHzl(request, z);
                        if (z4) {
                            it = listOLrzqt.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                            }
                            while (r1.hasNext()) {
                            }
                        }
                    } else {
                        java.util.Iterator it3 = listOLrzqt.iterator();
                        while (it3.hasNext()) {
                            if (((java.lang.annotation.Annotation) it3.next()) instanceof Query) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        java.lang.String strKWHzl2 = C13929dbp.Companion.KWHzl(request, z);
                        if (z4 || !listOLrzqt.isEmpty()) {
                            it = listOLrzqt.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((java.lang.annotation.Annotation) it.next()) instanceof Body) {
                                    z3 = true;
                                    break;
                                }
                            }
                        }
                        for (Map.Entry<java.lang.String, java.lang.String> entry : C13934dbu.Companion.OLrzqt(c13894dbG.OLrzqt(), c13894dbG.AEQbTJ(), strKWHzl2, C13929dbp.Companion.EZpvd(request, z3)).entrySet()) {
                            builder.header(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (iCopydefault == 2) {
                    java.lang.annotation.Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                    Intrinsics.checkNotNullExpressionValue(parameterAnnotations2, "");
                    java.util.List listOLrzqt2 = yDN.OLrzqt(parameterAnnotations2);
                    boolean z5 = listOLrzqt2 instanceof java.util.Collection;
                    if (z5 && listOLrzqt2.isEmpty()) {
                        z2 = false;
                        java.lang.String strKWHzl3 = C13929dbp.Companion.KWHzl(request, z2);
                        if (z5) {
                            it2 = listOLrzqt2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                }
                            }
                            while (r1.hasNext()) {
                            }
                        }
                    } else {
                        java.util.Iterator it4 = listOLrzqt2.iterator();
                        while (it4.hasNext()) {
                            if (((java.lang.annotation.Annotation) it4.next()) instanceof Query) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        java.lang.String strKWHzl32 = C13929dbp.Companion.KWHzl(request, z2);
                        if (z5 || !listOLrzqt2.isEmpty()) {
                            it2 = listOLrzqt2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((java.lang.annotation.Annotation) it2.next()) instanceof Body) {
                                    z3 = true;
                                    break;
                                }
                            }
                        }
                        for (Map.Entry<java.lang.String, java.lang.String> entry2 : C13934dbu.Companion.AEQbTJ(c13894dbG.OLrzqt(), c13894dbG.KWHzl(), c13894dbG.AEQbTJ(), strKWHzl32, C13929dbp.Companion.EZpvd(request, z3)).entrySet()) {
                            builder.header(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                if (interfaceC13893dbF.EZpvd()) {
                    builder.header("Encrypt-Strategy", "TIME");
                    builder.header("Encrypt-ignore-extra-body-param", "1");
                }
            }
            return builder;
        }

        public final java.lang.String EZpvd(Request request, boolean z) throws java.io.IOException {
            java.lang.String string = "";
            if (!z) {
                return "";
            }
            RequestBody requestBodyBody = request.body();
            if (requestBodyBody != null && !requestBodyBody.isOneShot()) {
                okio.Buffer buffer = new okio.Buffer();
                requestBodyBody.writeTo(buffer);
                try {
                    JsonElement jsonElement = (JsonElement) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) JsonElement.Companion.serializer(), buffer.readUtf8());
                    if (jsonElement instanceof JsonObject) {
                        string = C13933dbt.AEQbTJ((JsonObject) jsonElement);
                    } else if (jsonElement instanceof JsonArray) {
                        string = C13933dbt.KWHzl((JsonArray) jsonElement).toString();
                    }
                } catch (java.lang.Throwable th) {
                    pUU.AEQbTJ("WalletInterceptor", "Failed when deserializing body", th);
                }
            }
            return string;
        }

        public final Request.Builder OLrzqt(Request.Builder builder, Request request) {
            CacheStrategy cacheStrategy = (CacheStrategy) request.tag(CacheStrategy.class);
            if (cacheStrategy != null) {
                builder.header("Cache-Strategy", cacheStrategy.name()).header("Cache-Token-Valid", "0");
            }
            return builder;
        }

        public final java.lang.String KWHzl(Request request, boolean z) {
            if (!z) {
                return "";
            }
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            for (java.lang.String str : request.url().queryParameterNames()) {
                java.lang.String strQueryParameter = request.url().queryParameter(str);
                if (strQueryParameter != null) {
                    JsonElementBuildersKt.put(jsonObjectBuilder, str, strQueryParameter);
                }
            }
            return C13933dbt.AEQbTJ(jsonObjectBuilder.build());
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        for (Map.Entry<java.lang.String, java.lang.String> entry : C13934dbu.Companion.OLrzqt().entrySet()) {
            builderNewBuilder.header(entry.getKey(), entry.getValue());
        }
        Activity activity = Companion;
        return chain.proceed(activity.copydefault(activity.OLrzqt(builderNewBuilder, request), request).build());
    }
}
