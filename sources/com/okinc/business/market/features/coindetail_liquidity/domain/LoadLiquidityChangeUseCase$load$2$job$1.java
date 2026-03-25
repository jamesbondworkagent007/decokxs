package com.okinc.business.market.features.coindetail_liquidity.domain;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jPS;
import o.jPU;

/* JADX INFO: loaded from: classes6.dex */
public final class LoadLiquidityChangeUseCase$load$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Pair<? extends List<? extends LiquidityChange>, ? extends Boolean>>>, Object> {
    final /* synthetic */ TokenFilter $filter;
    final /* synthetic */ boolean $isDescOrder;
    final /* synthetic */ String $lastItemId;
    int label;
    final /* synthetic */ jPS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadLiquidityChangeUseCase$load$2$job$1(jPS jps, String str, boolean z, TokenFilter tokenFilter, Continuation<? super LoadLiquidityChangeUseCase$load$2$job$1> continuation) {
        super(2, continuation);
        this.this$0 = jps;
        this.$lastItemId = str;
        this.$isDescOrder = z;
        this.$filter = tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoadLiquidityChangeUseCase$load$2$job$1(this.this$0, this.$lastItemId, this.$isDescOrder, this.$filter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Pair<? extends List<? extends LiquidityChange>, ? extends Boolean>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends Pair<? extends List<LiquidityChange>, Boolean>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends Pair<? extends List<LiquidityChange>, Boolean>>> continuation) {
        return ((LoadLiquidityChangeUseCase$load$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jPU jpu = this.this$0.AEQbTJ;
            String str = this.$lastItemId;
            boolean z = this.$isDescOrder;
            TokenFilter tokenFilter = this.$filter;
            this.label = 1;
            objAEQbTJ = jpu.AEQbTJ(str, z, tokenFilter, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objAEQbTJ);
    }
}
