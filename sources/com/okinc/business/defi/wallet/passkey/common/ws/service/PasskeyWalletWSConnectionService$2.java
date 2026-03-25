package com.okinc.business.defi.wallet.passkey.common.ws.service;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC47263tmj;
import o.C17660fNo;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class PasskeyWalletWSConnectionService$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C17660fNo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyWalletWSConnectionService$2(C17660fNo c17660fNo, Continuation<? super PasskeyWalletWSConnectionService$2> continuation) {
        super(2, continuation);
        this.this$0 = c17660fNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyWalletWSConnectionService$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyWalletWSConnectionService$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<AbstractC47263tmj> flowFIwbmz = this.this$0.valueOf.fIwbmz();
            final C17660fNo c17660fNo = this.this$0;
            FlowCollector<? super AbstractC47263tmj> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.passkey.common.ws.service.PasskeyWalletWSConnectionService$2.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
                    String name = Thread.currentThread().getName();
                    if ((abstractC47263tmj instanceof AbstractC47263tmj.ActionBar) || (abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator)) {
                        pUU.KWHzl("PasskeyWalletWSConnectionService", "[" + name + "] Login/Switched: reLogin()");
                        c17660fNo.KWHzl.uzCIH();
                    } else {
                        if (!Intrinsics.EZpvd(abstractC47263tmj, AbstractC47263tmj.Activity.OLrzqt)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pUU.KWHzl("PasskeyWalletWSConnectionService", "[" + name + "] Logout: no reLogin()");
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowFIwbmz.collect(flowCollector, this) == objCopydefault) {
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
