package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.PreCheckBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C19756gOd;
import o.C56391yDq;
import o.C56442yFn;
import o.yHT;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$preCheckResult$1 extends SuspendLambda implements yHT<String, String, Integer, Continuation<? super PreCheckBean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$preCheckResult$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$preCheckResult$1> continuation) {
        super(4, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(String str, String str2, Integer num, Continuation<? super PreCheckBean> continuation) {
        return invoke(str, str2, num.intValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(String str, String str2, int i, Continuation<? super PreCheckBean> continuation) {
        AdvancedPlaceOrderVM$preCheckResult$1 advancedPlaceOrderVM$preCheckResult$1 = new AdvancedPlaceOrderVM$preCheckResult$1(this.this$0, continuation);
        advancedPlaceOrderVM$preCheckResult$1.L$0 = str;
        advancedPlaceOrderVM$preCheckResult$1.L$1 = str2;
        return advancedPlaceOrderVM$preCheckResult$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            String str2 = (String) this.L$1;
            if (str == null || str2 == null) {
                return null;
            }
            C19756gOd c19756gOd = this.this$0.fvQaOB;
            this.L$0 = null;
            this.label = 1;
            objKWHzl = c19756gOd.KWHzl(str, str2, this);
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
        if (Result.m7383isFailureimpl(objKWHzl)) {
            return null;
        }
        return objKWHzl;
    }
}
