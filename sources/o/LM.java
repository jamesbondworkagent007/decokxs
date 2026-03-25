package o;

import com.amplitude.experiment.evaluation.EvaluationFlag;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import o.InterfaceC5306Mq;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LM {
    public final HttpUrl AEQbTJ;
    public final java.lang.String EZpvd;
    public final OkHttpClient copydefault;

    public LM(@NotNull java.lang.String str, @NotNull HttpUrl httpUrl, @NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        this.EZpvd = str;
        this.AEQbTJ = httpUrl;
        this.copydefault = okHttpClient;
    }

    public Future<java.util.Map<java.lang.String, EvaluationFlag>> OLrzqt(LO lo, Function1<? super java.util.Map<java.lang.String, EvaluationFlag>, Unit> function1) {
        Request.Builder builderAddHeader = new Request.Builder().get().url(this.AEQbTJ.newBuilder().addPathSegments("sdk/v2/flags").addQueryParameter(com.ibm.icu.text.DateFormat.ABBR_GENERIC_TZ, "0").build()).addHeader("Authorization", "Api-Key " + this.EZpvd);
        if (lo != null && lo.OLrzqt().length() > 0 && lo.EZpvd().length() > 0) {
            builderAddHeader.addHeader("X-Amp-Exp-Library", lo.OLrzqt() + JsonPointer.SEPARATOR + lo.EZpvd());
        }
        Call callNewCall = this.copydefault.newCall(builderAddHeader.build());
        if (lo != null) {
            callNewCall.timeout().timeout(lo.KWHzl(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        FutureC5301Ml futureC5301Ml = new FutureC5301Ml(callNewCall, function1);
        callNewCall.enqueue(new Activity(futureC5301Ml));
        return futureC5301Ml;
    }

    public static final class Activity implements okhttp3.Callback {
        public final /* synthetic */ FutureC5301Ml<java.util.Map<java.lang.String, EvaluationFlag>> copydefault;

        public Activity(FutureC5301Ml<java.util.Map<java.lang.String, EvaluationFlag>> futureC5301Ml) {
            this.copydefault = futureC5301Ml;
        }

        @Override // okhttp3.Callback
        public void onResponse(@NotNull Call call, @NotNull Response response) {
            java.lang.String strString;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            try {
                C5310Mu c5310Mu = C5310Mu.copydefault;
                c5310Mu.KWHzl("Received fetch flags response: " + response);
                if (response.isSuccessful()) {
                    ResponseBody responseBodyBody = response.body();
                    if (responseBodyBody != null && (strString = responseBodyBody.string()) != null) {
                        str = strString;
                    }
                    Json json = LU.OLrzqt;
                    java.lang.Iterable iterable = (java.lang.Iterable) json.decodeFromString(SerializersKt.serializer(json.getSerializersModule(), C56524yIo.copydefault(java.util.List.class, KTypeProjection.copydefault.KWHzl(C56524yIo.copydefault(EvaluationFlag.class)))), str);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterable, 10)), 16));
                    for (java.lang.Object obj : iterable) {
                        linkedHashMap.put(((EvaluationFlag) obj).KWHzl(), obj);
                    }
                    this.copydefault.copydefault(linkedHashMap);
                    return;
                }
                InterfaceC5306Mq.ActionBar.e$default(c5310Mu, "Non-successful response: " + response.code(), null, 2, null);
                this.copydefault.OLrzqt(new java.io.IOException("Non-successful response: " + response.code()));
            } catch (java.io.IOException e) {
                onFailure(call, e);
            } catch (SerializationException e2) {
                InterfaceC5306Mq.ActionBar.e$default(C5310Mu.copydefault, "Error decoding JSON: " + e2.getMessage(), null, 2, null);
                this.copydefault.OLrzqt(e2);
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(@NotNull Call call, @NotNull java.io.IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            this.copydefault.OLrzqt(iOException);
        }
    }
}
