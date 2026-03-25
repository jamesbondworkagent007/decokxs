package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.AggregateData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23699iGa;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23635iDr;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestDexRecommendListUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AggregateData>>, Object> {
    final /* synthetic */ DexEntranceProductQuery $query;
    int label;
    final /* synthetic */ C23699iGa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestDexRecommendListUseCaseImpl$invoke$2(C23699iGa c23699iGa, DexEntranceProductQuery dexEntranceProductQuery, Continuation<? super InvestDexRecommendListUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c23699iGa;
        this.$query = dexEntranceProductQuery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestDexRecommendListUseCaseImpl$invoke$2(this.this$0, this.$query, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AggregateData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<AggregateData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<AggregateData>> continuation) {
        return ((InvestDexRecommendListUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23635iDr interfaceC23635iDr = this.this$0.EZpvd;
            int tabId = this.$query.getTabId();
            long chainId = this.$query.getChainId();
            String tokenAddress = this.$query.getTokenAddress();
            Integer pageNum = this.$query.getPageNum();
            String order = this.$query.getOrder();
            String property = this.$query.getProperty();
            this.label = 1;
            objCopydefault = interfaceC23635iDr.copydefault(tabId, chainId, tokenAddress, pageNum, order, property, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objCopydefault);
    }
}
