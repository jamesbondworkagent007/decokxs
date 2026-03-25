package com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC12782ctV;
import o.C15935eaT;
import o.C16026ecE;
import o.C16029ecH;
import o.C16058eck;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectionViewModel$onConnect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C16029ecH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectionViewModel$onConnect$2(C16029ecH c16029ecH, AbstractC12782ctV abstractC12782ctV, Continuation<? super DAppConnectionViewModel$onConnect$2> continuation) {
        super(2, continuation);
        this.this$0 = c16029ecH;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectionViewModel$onConnect$2(this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DAppConnectionViewModel$onConnect$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objAEQbTJ2;
        boolean zBooleanValue;
        Object value;
        C16026ecE c16026ecE;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.OLrzqt() == 3) {
                C15935eaT c15935eaT = this.this$0.AEQbTJ;
                AbstractC12782ctV abstractC12782ctV = this.$wallet;
                this.label = 1;
                objAEQbTJ2 = c15935eaT.AEQbTJ(abstractC12782ctV, this);
                if (objAEQbTJ2 == objCopydefault) {
                    return objCopydefault;
                }
                zBooleanValue = ((Boolean) objAEQbTJ2).booleanValue();
            } else {
                C16058eck c16058eck = this.this$0.OLrzqt;
                AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
                this.label = 2;
                objAEQbTJ = c16058eck.AEQbTJ(abstractC12782ctV2, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ2 = obj;
            zBooleanValue = ((Boolean) objAEQbTJ2).booleanValue();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
            zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
        }
        MutableStateFlow mutableStateFlow = this.this$0.copydefault;
        do {
            value = mutableStateFlow.getValue();
            c16026ecE = (C16026ecE) value;
        } while (!mutableStateFlow.compareAndSet(value, c16026ecE.copydefault((1022 & 1) != 0 ? c16026ecE.KWHzl : C56443yFo.AEQbTJ(zBooleanValue ? 2 : 5), (1022 & 2) != 0 ? c16026ecE.gEmmrt : null, (1022 & 4) != 0 ? c16026ecE.djBIcL : null, (1022 & 8) != 0 ? c16026ecE.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE.AhwBna : null, (1022 & 32) != 0 ? c16026ecE.EZpvd : false, (1022 & 64) != 0 ? c16026ecE.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE.valueOf : null, (1022 & 256) != 0 ? c16026ecE.OLrzqt : false, (1022 & 512) != 0 ? c16026ecE.copydefault : null)));
        return Unit.INSTANCE;
    }
}
