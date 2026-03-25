package com.okinc.business.defi.assets.utxo.utxomanagement;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C10231bkZ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoManagementViewModel$markExplanationDialogViewed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    int label;
    final /* synthetic */ InvestUtxoManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUtxoManagementViewModel$markExplanationDialogViewed$1(InvestUtxoManagementViewModel investUtxoManagementViewModel, long j, Continuation<? super InvestUtxoManagementViewModel$markExplanationDialogViewed$1> continuation) {
        super(2, continuation);
        this.this$0 = investUtxoManagementViewModel;
        this.$chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUtxoManagementViewModel$markExplanationDialogViewed$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUtxoManagementViewModel$markExplanationDialogViewed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C10231bkZ c10231bkZ = this.this$0.values;
            long j = this.$chainId;
            this.label = 1;
            if (c10231bkZ.OLrzqt(j, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }
}
