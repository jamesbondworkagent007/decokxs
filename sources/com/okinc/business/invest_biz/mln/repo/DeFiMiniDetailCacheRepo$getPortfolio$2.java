package com.okinc.business.invest_biz.mln.repo;

import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import o.C23924iOj;
import o.C27581jxr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniDetailCacheRepo$getPortfolio$2 extends SuspendLambda implements Function1<Continuation<? super InvestUserAssetDetailByInvestment>, Object> {
    final /* synthetic */ long $investmentId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniDetailCacheRepo$getPortfolio$2(long j, Continuation<? super DeFiMiniDetailCacheRepo$getPortfolio$2> continuation) {
        super(1, continuation);
        this.$investmentId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DeFiMiniDetailCacheRepo$getPortfolio$2(this.$investmentId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestUserAssetDetailByInvestment> continuation) {
        return ((DeFiMiniDetailCacheRepo$getPortfolio$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C23924iOj c23924iOj = C23924iOj.AEQbTJ;
            String strEZpvd = c23924iOj.EZpvd(c23924iOj.copydefault(), this.$investmentId);
            Object objDecodeFromString = null;
            if (strEZpvd == null) {
                return null;
            }
            Json jsonJson$default = JsonKt.Json$default(null, C27581jxr.StateListAnimator.copydefault, 1, null);
            if (strEZpvd.length() != 0) {
                try {
                    String strEncodeToString = jsonJson$default.encodeToString(JsonElement.Companion.serializer(), C27581jxr.copydefault(jsonJson$default.parseToJsonElement(strEZpvd)));
                    jsonJson$default.getSerializersModule();
                    objDecodeFromString = jsonJson$default.decodeFromString(InvestUserAssetDetailByInvestment.Companion.serializer(), strEncodeToString);
                } catch (Exception e) {
                    pUU.copydefault("parseFromMiniJson " + e.getMessage());
                    e.printStackTrace();
                }
            }
            return (InvestUserAssetDetailByInvestment) objDecodeFromString;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
