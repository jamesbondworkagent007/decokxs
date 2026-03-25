package com.okinc.business.defi.biz.impl;

import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13426dKx;
import o.fVN;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TeeMetadata>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6$1$1(Continuation<? super OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6$1$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6$1$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TeeMetadata> continuation) {
        return ((OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fVN fvnValues = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).values();
            this.label = 1;
            obj = fvnValues.EZpvd(this);
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
