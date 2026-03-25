package com.okinc.business.defi.wallet.mine.search.domain.usecase;

import com.okinc.dapp.bean.DappSearchResultBean;
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
import o.xWH;

/* JADX INFO: loaded from: classes5.dex */
public final class DeleteSearchHistoryItemUseCase$deleteDAppHistory$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ DappSearchResultBean $dappBean;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteSearchHistoryItemUseCase$deleteDAppHistory$2(DappSearchResultBean dappSearchResultBean, Continuation<? super DeleteSearchHistoryItemUseCase$deleteDAppHistory$2> continuation) {
        super(2, continuation);
        this.$dappBean = dappSearchResultBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeleteSearchHistoryItemUseCase$deleteDAppHistory$2(this.$dappBean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((DeleteSearchHistoryItemUseCase$deleteDAppHistory$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<Integer> abstractC58260yxtCopydefault = ((xWH) C43251rlk.copydefault(xWH.class)).copydefault(this.$dappBean);
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
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
