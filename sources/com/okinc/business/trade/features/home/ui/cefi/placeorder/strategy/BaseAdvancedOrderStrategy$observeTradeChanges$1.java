package com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C30626leh;
import o.C30805liA;
import o.C56391yDq;
import o.C56442yFn;
import o.yHQ;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseAdvancedOrderStrategy$observeTradeChanges$1 extends SuspendLambda implements yHQ<DexMultiTokenInfoBean, DexMultiTokenInfoBean, String, String, C30805liA, Continuation<? super C30626leh>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseAdvancedOrderStrategy$observeTradeChanges$1(Continuation<? super BaseAdvancedOrderStrategy$observeTradeChanges$1> continuation) {
        super(6, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHQ
    public final Object invoke(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str, String str2, C30805liA c30805liA, Continuation<? super C30626leh> continuation) {
        BaseAdvancedOrderStrategy$observeTradeChanges$1 baseAdvancedOrderStrategy$observeTradeChanges$1 = new BaseAdvancedOrderStrategy$observeTradeChanges$1(continuation);
        baseAdvancedOrderStrategy$observeTradeChanges$1.L$0 = dexMultiTokenInfoBean;
        baseAdvancedOrderStrategy$observeTradeChanges$1.L$1 = dexMultiTokenInfoBean2;
        baseAdvancedOrderStrategy$observeTradeChanges$1.L$2 = str;
        baseAdvancedOrderStrategy$observeTradeChanges$1.L$3 = str2;
        baseAdvancedOrderStrategy$observeTradeChanges$1.L$4 = c30805liA;
        return baseAdvancedOrderStrategy$observeTradeChanges$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return new C30626leh((DexMultiTokenInfoBean) this.L$0, (DexMultiTokenInfoBean) this.L$1, (String) this.L$2, (String) this.L$3, (C30805liA) this.L$4, null, false, null, null, null, 992, null);
    }
}
