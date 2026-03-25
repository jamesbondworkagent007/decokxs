package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$observeData$14 extends SuspendLambda implements yHO<Boolean, DexMultiTokenInfoBean, Continuation<? super Pair<? extends Boolean, ? extends DexMultiTokenInfoBean>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedPlaceOrderFragment$observeData$14(Continuation<? super AdvancedPlaceOrderFragment$observeData$14> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(Boolean bool, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Pair<? extends Boolean, ? extends DexMultiTokenInfoBean>> continuation) {
        return invoke(bool.booleanValue(), dexMultiTokenInfoBean, (Continuation<? super Pair<Boolean, DexMultiTokenInfoBean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Pair<Boolean, DexMultiTokenInfoBean>> continuation) {
        AdvancedPlaceOrderFragment$observeData$14 advancedPlaceOrderFragment$observeData$14 = new AdvancedPlaceOrderFragment$observeData$14(continuation);
        advancedPlaceOrderFragment$observeData$14.Z$0 = z;
        advancedPlaceOrderFragment$observeData$14.L$0 = dexMultiTokenInfoBean;
        return advancedPlaceOrderFragment$observeData$14.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        boolean z = this.Z$0;
        return C56390yDp.OLrzqt(C56443yFo.KWHzl(z), (DexMultiTokenInfoBean) this.L$0);
    }
}
