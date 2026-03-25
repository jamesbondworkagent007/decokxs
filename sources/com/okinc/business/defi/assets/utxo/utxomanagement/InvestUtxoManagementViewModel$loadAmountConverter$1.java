package com.okinc.business.defi.assets.utxo.utxomanagement;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.xWL;
import o.xWM;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoManagementViewModel$loadAmountConverter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    Object L$0;
    int label;
    final /* synthetic */ InvestUtxoManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUtxoManagementViewModel$loadAmountConverter$1(InvestUtxoManagementViewModel investUtxoManagementViewModel, long j, Continuation<? super InvestUtxoManagementViewModel$loadAmountConverter$1> continuation) {
        super(2, continuation);
        this.this$0 = investUtxoManagementViewModel;
        this.$chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUtxoManagementViewModel$loadAmountConverter$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUtxoManagementViewModel$loadAmountConverter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestUtxoManagementViewModel investUtxoManagementViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestUtxoManagementViewModel investUtxoManagementViewModel2 = this.this$0;
            xWL xwl = (xWL) C43251rlk.copydefault(xWL.class);
            long j = this.$chainId;
            this.L$0 = investUtxoManagementViewModel2;
            this.label = 1;
            Object objAEQbTJ = xwl.AEQbTJ(j, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            investUtxoManagementViewModel = investUtxoManagementViewModel2;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            investUtxoManagementViewModel = (InvestUtxoManagementViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        investUtxoManagementViewModel.AhwBna = (xWM) obj;
        return Unit.INSTANCE;
    }
}
