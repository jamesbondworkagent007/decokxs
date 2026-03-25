package com.okinc.business.market.features.smart_money.ui;

import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29512kuz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SmartMoneySharedViewModel$loadSignalConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SmartMoneySharedViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartMoneySharedViewModel$loadSignalConfig$1(SmartMoneySharedViewModel smartMoneySharedViewModel, Continuation<? super SmartMoneySharedViewModel$loadSignalConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = smartMoneySharedViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartMoneySharedViewModel$loadSignalConfig$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartMoneySharedViewModel$loadSignalConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29512kuz c29512kuz = this.this$0.EZpvd;
            this.label = 1;
            objKWHzl = c29512kuz.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        SmartMoneySharedViewModel smartMoneySharedViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            smartMoneySharedViewModel.AEQbTJ.setValue((SmartMoneyConfig) objKWHzl);
        }
        return Unit.INSTANCE;
    }
}
