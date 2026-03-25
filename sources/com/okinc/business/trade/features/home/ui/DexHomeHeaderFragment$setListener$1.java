package com.okinc.business.trade.features.home.ui;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class DexHomeHeaderFragment$setListener$1 extends SuspendLambda implements yHO<DexMultiTokenInfoBean, TradingType, Continuation<? super Pair<? extends DexMultiTokenInfoBean, ? extends TradingType>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexHomeHeaderFragment$setListener$1(Continuation<? super DexHomeHeaderFragment$setListener$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(DexMultiTokenInfoBean dexMultiTokenInfoBean, TradingType tradingType, Continuation<? super Pair<DexMultiTokenInfoBean, ? extends TradingType>> continuation) {
        DexHomeHeaderFragment$setListener$1 dexHomeHeaderFragment$setListener$1 = new DexHomeHeaderFragment$setListener$1(continuation);
        dexHomeHeaderFragment$setListener$1.L$0 = dexMultiTokenInfoBean;
        dexHomeHeaderFragment$setListener$1.L$1 = tradingType;
        return dexHomeHeaderFragment$setListener$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(DexMultiTokenInfoBean dexMultiTokenInfoBean, TradingType tradingType, Continuation<? super Pair<? extends DexMultiTokenInfoBean, ? extends TradingType>> continuation) {
        return invoke2(dexMultiTokenInfoBean, tradingType, (Continuation<? super Pair<DexMultiTokenInfoBean, ? extends TradingType>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return C56390yDp.OLrzqt((DexMultiTokenInfoBean) this.L$0, (TradingType) this.L$1);
    }
}
