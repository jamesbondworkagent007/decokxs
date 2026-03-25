package com.okinc.business.market.wallet.data.repository;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class DexWalletRepositoryImpl$isWalletExist$1 extends SuspendLambda implements yHO<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexWalletRepositoryImpl$isWalletExist$1(Continuation<? super DexWalletRepositoryImpl$isWalletExist$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        DexWalletRepositoryImpl$isWalletExist$1 dexWalletRepositoryImpl$isWalletExist$1 = new DexWalletRepositoryImpl$isWalletExist$1(continuation);
        dexWalletRepositoryImpl$isWalletExist$1.L$0 = flowCollector;
        return dexWalletRepositoryImpl$isWalletExist$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Boolean boolKWHzl = C56443yFo.KWHzl(false);
            this.label = 1;
            if (flowCollector.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
