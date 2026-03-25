package com.okinc.business.market.features.jwt.domain;

import android.os.Bundle;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C28605kdt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.jwt.domain.ParseSigningResultUseCase$parse-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class ParseSigningResultUseCase$parsegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ Bundle $bundle$inlined;
    int label;
    final /* synthetic */ C28605kdt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParseSigningResultUseCase$parsegIAlus$$inlined$dexRunCatching$1(Continuation continuation, Bundle bundle, C28605kdt c28605kdt) {
        super(2, continuation);
        this.$bundle$inlined = bundle;
        this.this$0 = c28605kdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ParseSigningResultUseCase$parsegIAlus$$inlined$dexRunCatching$1(continuation, this.$bundle$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((ParseSigningResultUseCase$parsegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r8 = r7.$bundle$inlined.getString("data");
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String string;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            try {
                Result.Application application = Result.Companion;
                Bundle bundle = this.$bundle$inlined;
                String str = "";
                if (bundle != null && bundle.getInt("result") != 0 && string != null && string.length() != 0) {
                    if (this.$bundle$inlined.getBoolean("tx_isbatch")) {
                        String string2 = this.$bundle$inlined.getString("tx_id");
                        if (string2 == null) {
                            string2 = "";
                        }
                        try {
                            Json json = this.this$0.OLrzqt;
                            json.getSerializersModule();
                            JsonObject.Companion companion = JsonObject.Companion;
                            JsonObject jsonObject = (JsonObject) json.decodeFromString(companion.serializer(), string2);
                            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                            jsonObjectBuilder.put("txHash", JsonElementKt.JsonPrimitive(string));
                            jsonObjectBuilder.put("orderIds", JsonElementKt.JsonPrimitive(""));
                            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) "batchId");
                            if (jsonElement != null) {
                                jsonObjectBuilder.put("batchId", jsonElement);
                            }
                            JsonObject jsonObjectBuild = jsonObjectBuilder.build();
                            Json json2 = this.this$0.OLrzqt;
                            json2.getSerializersModule();
                            string = json2.encodeToString(companion.serializer(), jsonObjectBuild);
                        } catch (Exception unused) {
                        }
                    }
                    str = string;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(str);
            } catch (Throwable th) {
                pUU.AEQbTJ("DEX", "dexRunCatching", th);
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Result.m7376boximpl(objM7377constructorimpl);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
