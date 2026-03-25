package com.okinc.business.trade.features.home.ui.cefi.setting;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C30563ldX;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class AdvancedOtherChainSettingFragment$initListener$1 extends SuspendLambda implements yHO<String, C30563ldX, Continuation<? super Pair<? extends String, ? extends C30563ldX>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedOtherChainSettingFragment$initListener$1(Continuation<? super AdvancedOtherChainSettingFragment$initListener$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(String str, C30563ldX c30563ldX, Continuation<? super Pair<? extends String, ? extends C30563ldX>> continuation) {
        return invoke2(str, c30563ldX, (Continuation<? super Pair<String, C30563ldX>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, C30563ldX c30563ldX, Continuation<? super Pair<String, C30563ldX>> continuation) {
        AdvancedOtherChainSettingFragment$initListener$1 advancedOtherChainSettingFragment$initListener$1 = new AdvancedOtherChainSettingFragment$initListener$1(continuation);
        advancedOtherChainSettingFragment$initListener$1.L$0 = str;
        advancedOtherChainSettingFragment$initListener$1.L$1 = c30563ldX;
        return advancedOtherChainSettingFragment$initListener$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return new Pair((String) this.L$0, (C30563ldX) this.L$1);
    }
}
