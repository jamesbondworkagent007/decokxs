package com.okinc.business.defi.wallet.mine.search.domain.usecase;

import com.okinc.dapp.bean.DappSearchResultBean;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54828xWv;

/* JADX INFO: loaded from: classes5.dex */
public final class GetDAppSearchHistoryUseCase$invoke$1$1$dappHistoryBeans$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends DappSearchResultBean>>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetDAppSearchHistoryUseCase$invoke$1$1$dappHistoryBeans$1(Continuation<? super GetDAppSearchHistoryUseCase$invoke$1$1$dappHistoryBeans$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetDAppSearchHistoryUseCase$invoke$1$1$dappHistoryBeans$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DappSearchResultBean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<DappSearchResultBean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<DappSearchResultBean>> continuation) {
        return ((GetDAppSearchHistoryUseCase$invoke$1$1$dappHistoryBeans$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<List<DappSearchResultBean>> abstractC58260yxtAP_ = ((InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class)).aP_();
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtAP_, this);
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
