package com.okinc.business.invest_biz.mln.ui.kline;

import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import o.C23673iFb;
import o.C23682iFk;
import o.C23924iOj;
import o.C27581jxr;
import o.C56391yDq;
import o.C56442yFn;
import o.iOE;
import o.pUU;

/* JADX INFO: loaded from: classes15.dex */
public final class DeFiMiniDetailChartRepository$getProductDetails$2 extends SuspendLambda implements Function1<Continuation<? super C23673iFb>, Object> {
    final /* synthetic */ C23682iFk $params;
    int label;
    final /* synthetic */ iOE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniDetailChartRepository$getProductDetails$2(C23682iFk c23682iFk, iOE ioe, Continuation<? super DeFiMiniDetailChartRepository$getProductDetails$2> continuation) {
        super(1, continuation);
        this.$params = c23682iFk;
        this.this$0 = ioe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DeFiMiniDetailChartRepository$getProductDetails$2(this.$params, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super C23673iFb> continuation) {
        return ((DeFiMiniDetailChartRepository$getProductDetails$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C23924iOj c23924iOj = C23924iOj.AEQbTJ;
            String strEZpvd = c23924iOj.EZpvd(c23924iOj.KWHzl(), this.$params.KWHzl());
            if (strEZpvd != null) {
                Object objDecodeFromString = null;
                Json jsonJson$default = JsonKt.Json$default(null, C27581jxr.StateListAnimator.copydefault, 1, null);
                if (strEZpvd.length() != 0) {
                    try {
                        String strEncodeToString = jsonJson$default.encodeToString(JsonElement.Companion.serializer(), C27581jxr.copydefault(jsonJson$default.parseToJsonElement(strEZpvd)));
                        jsonJson$default.getSerializersModule();
                        objDecodeFromString = jsonJson$default.decodeFromString(ProductDetailsResponse.Companion.serializer(), strEncodeToString);
                    } catch (Exception e) {
                        pUU.copydefault("parseFromMiniJson " + e.getMessage());
                        e.printStackTrace();
                    }
                }
                ProductDetailsResponse productDetailsResponse = (ProductDetailsResponse) objDecodeFromString;
                if (productDetailsResponse != null) {
                    return this.this$0.OLrzqt.OLrzqt(productDetailsResponse);
                }
            }
            return new C23673iFb(null, false, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
