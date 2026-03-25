package com.okinc.buysell.ui.bsc.convert;

import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.mHA;
import o.pWO;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertViewModel$setupConvertDefaultCurrency$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BuySellConvertParameters $params;
    int label;
    final /* synthetic */ ConvertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertViewModel$setupConvertDefaultCurrency$1(ConvertViewModel convertViewModel, BuySellConvertParameters buySellConvertParameters, Continuation<? super ConvertViewModel$setupConvertDefaultCurrency$1> continuation) {
        super(2, continuation);
        this.this$0 = convertViewModel;
        this.$params = buySellConvertParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertViewModel$setupConvertDefaultCurrency$1(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertViewModel$setupConvertDefaultCurrency$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            this.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, this, 3, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        this.this$0.copydefault(this.$params);
        mHA.OLrzqt.KWHzl(this.this$0.hDKMBd);
        return Unit.INSTANCE;
    }
}
