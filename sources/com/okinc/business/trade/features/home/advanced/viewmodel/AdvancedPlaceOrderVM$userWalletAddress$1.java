package com.okinc.business.trade.features.home.advanced.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C28196kSl;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$userWalletAddress$1 extends SuspendLambda implements yHO<String, String, Continuation<? super String>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$userWalletAddress$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$userWalletAddress$1> continuation) {
        super(3, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(String str, String str2, Continuation<? super String> continuation) {
        AdvancedPlaceOrderVM$userWalletAddress$1 advancedPlaceOrderVM$userWalletAddress$1 = new AdvancedPlaceOrderVM$userWalletAddress$1(this.this$0, continuation);
        advancedPlaceOrderVM$userWalletAddress$1.L$0 = str;
        advancedPlaceOrderVM$userWalletAddress$1.L$1 = str2;
        return advancedPlaceOrderVM$userWalletAddress$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            String str2 = (String) this.L$1;
            if (str == null || str2 == null) {
                return null;
            }
            C28196kSl c28196kSl = this.this$0.DCUTEI;
            long jValueOf = C33129mqd.valueOf(str2);
            this.L$0 = null;
            this.label = 1;
            obj = c28196kSl.OLrzqt(jValueOf, this);
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
