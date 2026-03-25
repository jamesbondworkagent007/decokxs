package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19946gVe;
import o.gLQ;
import o.gWN;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingHomeVM$checkWalletState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CopyTradingHomeVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingHomeVM$checkWalletState$1(CopyTradingHomeVM copyTradingHomeVM, Continuation<? super CopyTradingHomeVM$checkWalletState$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingHomeVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingHomeVM$checkWalletState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingHomeVM$checkWalletState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC19946gVe activity;
        MutableStateFlow mutableStateFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gWN gwn = this.this$0.djBIcL;
            Long l = this.this$0.AhwBna;
            this.label = 1;
            obj = gwn.KWHzl(l, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow.setValue(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        gLQ glq = (gLQ) obj;
        MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
        if (glq != null && !Intrinsics.EZpvd(glq, gLQ.TaskDescription.copydefault)) {
            activity = new InterfaceC19946gVe.Activity(glq);
        } else {
            activity = InterfaceC19946gVe.ActionBar.OLrzqt;
        }
        mutableStateFlow2.setValue(activity);
        MutableStateFlow mutableStateFlow3 = this.this$0.copydefault;
        gWN gwn2 = this.this$0.djBIcL;
        this.L$0 = mutableStateFlow3;
        this.label = 2;
        Object objOLrzqt = gwn2.OLrzqt(this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        mutableStateFlow = mutableStateFlow3;
        obj = objOLrzqt;
        mutableStateFlow.setValue(obj);
        return Unit.INSTANCE;
    }
}
