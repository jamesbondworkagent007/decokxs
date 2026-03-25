package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$observeData$27 extends SuspendLambda implements yHO<DexMultiTokenInfoBean, DexMultiTokenInfoBean, Continuation<? super Pair<? extends DexMultiTokenInfoBean, ? extends DexMultiTokenInfoBean>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedPlaceOrderFragment$observeData$27(Continuation<? super AdvancedPlaceOrderFragment$observeData$27> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Continuation<? super Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>> continuation) {
        AdvancedPlaceOrderFragment$observeData$27 advancedPlaceOrderFragment$observeData$27 = new AdvancedPlaceOrderFragment$observeData$27(continuation);
        advancedPlaceOrderFragment$observeData$27.L$0 = dexMultiTokenInfoBean;
        advancedPlaceOrderFragment$observeData$27.L$1 = dexMultiTokenInfoBean2;
        return advancedPlaceOrderFragment$observeData$27.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Continuation<? super Pair<? extends DexMultiTokenInfoBean, ? extends DexMultiTokenInfoBean>> continuation) {
        return invoke2(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, (Continuation<? super Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56390yDp.OLrzqt((DexMultiTokenInfoBean) this.L$0, (DexMultiTokenInfoBean) this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
