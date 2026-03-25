package com.okinc.business.dex.trade.copytrading.edit.ui.fragment;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.gTC;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class CopyTradingBuySettingFragment$setListener$1$10 extends SuspendLambda implements yHO<DexMultiTokenInfoBean, Result<? extends gTC>, Continuation<? super Pair<? extends DexMultiTokenInfoBean, ? extends gTC>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingBuySettingFragment$setListener$1$10(Continuation<? super CopyTradingBuySettingFragment$setListener$1$10> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(DexMultiTokenInfoBean dexMultiTokenInfoBean, Result<gTC> result, Continuation<? super Pair<DexMultiTokenInfoBean, gTC>> continuation) {
        CopyTradingBuySettingFragment$setListener$1$10 copyTradingBuySettingFragment$setListener$1$10 = new CopyTradingBuySettingFragment$setListener$1$10(continuation);
        copyTradingBuySettingFragment$setListener$1$10.L$0 = dexMultiTokenInfoBean;
        copyTradingBuySettingFragment$setListener$1$10.L$1 = result;
        return copyTradingBuySettingFragment$setListener$1$10.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(DexMultiTokenInfoBean dexMultiTokenInfoBean, Result<? extends gTC> result, Continuation<? super Pair<? extends DexMultiTokenInfoBean, ? extends gTC>> continuation) {
        return invoke2(dexMultiTokenInfoBean, (Result<gTC>) result, (Continuation<? super Pair<DexMultiTokenInfoBean, gTC>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) this.L$0;
        Result result = (Result) this.L$1;
        if (result != null) {
            Object objM7386unboximpl = result.m7386unboximpl();
            obj = (gTC) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
        }
        return C56390yDp.OLrzqt(dexMultiTokenInfoBean, obj);
    }
}
