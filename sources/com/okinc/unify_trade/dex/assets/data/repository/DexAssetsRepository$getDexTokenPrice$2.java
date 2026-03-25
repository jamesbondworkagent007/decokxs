package com.okinc.unify_trade.dex.assets.data.repository;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.dex.assets.data.model.DexTokenPriceRequest;
import com.okinc.unify_trade.dex.assets.data.model.DexTokenPriceResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C54426xHz;
import o.C56391yDq;
import o.C56442yFn;
import o.xHD;

/* JADX INFO: loaded from: classes12.dex */
public final class DexAssetsRepository$getDexTokenPrice$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends DexTokenPriceResponse>>>, Object> {
    final /* synthetic */ DexTokenPriceRequest $dexTokenPriceRequest;
    int label;
    final /* synthetic */ C54426xHz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexAssetsRepository$getDexTokenPrice$2(C54426xHz c54426xHz, DexTokenPriceRequest dexTokenPriceRequest, Continuation<? super DexAssetsRepository$getDexTokenPrice$2> continuation) {
        super(2, continuation);
        this.this$0 = c54426xHz;
        this.$dexTokenPriceRequest = dexTokenPriceRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexAssetsRepository$getDexTokenPrice$2(this.this$0, this.$dexTokenPriceRequest, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends DexTokenPriceResponse>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<DexTokenPriceResponse>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<DexTokenPriceResponse>>> continuation) {
        return ((DexAssetsRepository$getDexTokenPrice$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xHD xhd = this.this$0.AEQbTJ;
            DexTokenPriceRequest dexTokenPriceRequest = this.$dexTokenPriceRequest;
            this.label = 1;
            obj = xhd.copydefault(dexTokenPriceRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
