package com.okinc.business.invest_biz.data.logic;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class InvestTradeManager$submitTransaction$2$1$isGasFeeOk$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ JsonObject $callData;
    final /* synthetic */ yHO<String, String, Continuation<? super Boolean>, Object> $gasFeeCheck;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super java.lang.String, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestTradeManager$submitTransaction$2$1$isGasFeeOk$1(yHO<? super String, ? super String, ? super Continuation<? super Boolean>, ? extends Object> yho, JsonObject jsonObject, Continuation<? super InvestTradeManager$submitTransaction$2$1$isGasFeeOk$1> continuation) {
        super(2, continuation);
        this.$gasFeeCheck = yho;
        this.$callData = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestTradeManager$submitTransaction$2$1$isGasFeeOk$1(this.$gasFeeCheck, this.$callData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((InvestTradeManager$submitTransaction$2$1$isGasFeeOk$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            yHO<String, String, Continuation<? super Boolean>, Object> yho = this.$gasFeeCheck;
            if (yho != null) {
                JsonObject jsonObject = this.$callData;
                String contentOrNull = null;
                String contentOrNull2 = (jsonObject == null || (jsonElement2 = (JsonElement) jsonObject.get((Object) "to")) == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive2);
                if (contentOrNull2 == null) {
                    contentOrNull2 = "";
                }
                JsonObject jsonObject2 = this.$callData;
                if (jsonObject2 != null && (jsonElement = (JsonElement) jsonObject2.get((Object) "data")) != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                    contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive);
                }
                String str = contentOrNull != null ? contentOrNull : "";
                this.label = 1;
                obj = yho.invoke(contentOrNull2, str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(z);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        if (!((Boolean) obj).booleanValue()) {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }
}
