package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23313hvq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.kQF;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$updateTradeAmount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$updateTradeAmount$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, String str, Continuation<? super AdvancedPlaceOrderVM$updateTradeAmount$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$updateTradeAmount$1(this.this$0, this.$amount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$updateTradeAmount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.ejfBZ.setValue(this.$amount);
            this.this$0.DTwDnp.copydefault();
            if (C23313hvq.OLrzqt(this.$amount, C56443yFo.AEQbTJ(0))) {
                kQF kqf = this.this$0.hDKMBd;
                String str = this.$amount;
                DexMultiTokenInfoBean value = this.this$0.ejfBZ().getValue();
                String strEZpvd = this.this$0.DTwDnp.EZpvd();
                if (strEZpvd.length() == 0) {
                    strEZpvd = "11";
                }
                this.label = 1;
                if (kqf.copydefault(str, value, strEZpvd, this) == objCopydefault) {
                    return objCopydefault;
                }
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
