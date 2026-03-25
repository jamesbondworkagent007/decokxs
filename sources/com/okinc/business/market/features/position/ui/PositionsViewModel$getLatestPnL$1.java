package com.okinc.business.market.features.position.ui;

import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29095knF;
import o.C29123knh;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsViewModel$getLatestPnL$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$getLatestPnL$1(PositionsViewModel positionsViewModel, Continuation<? super PositionsViewModel$getLatestPnL$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$getLatestPnL$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$getLatestPnL$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8669invokeBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(new C29095knF(true, this.this$0.djBIcL().getValue().AEQbTJ(), null, 4, null));
            C29123knh c29123knh = this.this$0.fIwbmz;
            String chainId = this.this$0.getNewProxyInstance.getChainId();
            String tokenAddress = this.this$0.getNewProxyInstance.getTokenAddress();
            this.label = 1;
            objM8669invokeBWLJW6A$default = C29123knh.m8669invokeBWLJW6A$default(c29123knh, chainId, tokenAddress, null, this, 4, null);
            if (objM8669invokeBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8669invokeBWLJW6A$default = ((Result) obj).m7386unboximpl();
        }
        PositionsViewModel positionsViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM8669invokeBWLJW6A$default)) {
            PnLDetailsUiModel pnLDetailsUiModel = (PnLDetailsUiModel) objM8669invokeBWLJW6A$default;
            positionsViewModel.OLrzqt.setValue(new C29095knF(false, pnLDetailsUiModel, null, 5, null));
            if (pnLDetailsUiModel.AYXKKw()) {
                positionsViewModel.fIwbmz.KWHzl(positionsViewModel.getNewProxyInstance.getChainId(), positionsViewModel.getNewProxyInstance.getTokenAddress());
            }
        }
        PositionsViewModel positionsViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8669invokeBWLJW6A$default);
        if (thM7380exceptionOrNullimpl != null) {
            positionsViewModel2.OLrzqt.setValue(new C29095knF(false, new PnLDetailsUiModel(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286, null), thM7380exceptionOrNullimpl, 1, null));
        }
        return Unit.INSTANCE;
    }
}
