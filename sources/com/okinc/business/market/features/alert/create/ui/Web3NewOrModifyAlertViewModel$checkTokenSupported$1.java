package com.okinc.business.market.features.alert.create.ui;

import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25802jGx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25800jGv;
import o.jGX;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3NewOrModifyAlertViewModel$checkTokenSupported$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenInfoForAlert $tokenInfoForAlert;
    int label;
    final /* synthetic */ jGX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3NewOrModifyAlertViewModel$checkTokenSupported$1(jGX jgx, TokenInfoForAlert tokenInfoForAlert, Continuation<? super Web3NewOrModifyAlertViewModel$checkTokenSupported$1> continuation) {
        super(2, continuation);
        this.this$0 = jgx;
        this.$tokenInfoForAlert = tokenInfoForAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3NewOrModifyAlertViewModel$checkTokenSupported$1(this.this$0, this.$tokenInfoForAlert, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3NewOrModifyAlertViewModel$checkTokenSupported$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objKWHzl;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, InterfaceC25800jGv.Activity.KWHzl));
            C25802jGx c25802jGx = this.this$0.gEmmrt;
            String strValueOf = this.$tokenInfoForAlert.valueOf();
            String strCopydefault = this.$tokenInfoForAlert.copydefault();
            this.label = 1;
            objKWHzl = c25802jGx.KWHzl(strValueOf, strCopydefault, this);
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
        jGX jgx = this.this$0;
        TokenInfoForAlert tokenInfoForAlert = this.$tokenInfoForAlert;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            boolean zBooleanValue = ((Boolean) objKWHzl).booleanValue();
            MutableStateFlow mutableStateFlow2 = jgx.OLrzqt;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, new InterfaceC25800jGv.StateListAnimator(tokenInfoForAlert, zBooleanValue)));
        }
        jGX jgx2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            MutableStateFlow mutableStateFlow3 = jgx2.OLrzqt;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, InterfaceC25800jGv.Application.AEQbTJ));
        }
        return Unit.INSTANCE;
    }
}
