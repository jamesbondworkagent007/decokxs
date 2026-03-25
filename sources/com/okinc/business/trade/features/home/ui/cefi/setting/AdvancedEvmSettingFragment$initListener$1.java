package com.okinc.business.trade.features.home.ui.cefi.setting;

import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C30563ldX;
import o.C56391yDq;
import o.C56442yFn;
import o.yHT;

/* JADX INFO: loaded from: classes15.dex */
public final class AdvancedEvmSettingFragment$initListener$1 extends SuspendLambda implements yHT<String, C30563ldX, SlippageMode, Continuation<? super Triple<? extends String, ? extends C30563ldX, ? extends SlippageMode>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedEvmSettingFragment$initListener$1(Continuation<? super AdvancedEvmSettingFragment$initListener$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* bridge */ /* synthetic */ Object invoke(String str, C30563ldX c30563ldX, SlippageMode slippageMode, Continuation<? super Triple<? extends String, ? extends C30563ldX, ? extends SlippageMode>> continuation) {
        return invoke2(str, c30563ldX, slippageMode, (Continuation<? super Triple<String, C30563ldX, ? extends SlippageMode>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, C30563ldX c30563ldX, SlippageMode slippageMode, Continuation<? super Triple<String, C30563ldX, ? extends SlippageMode>> continuation) {
        AdvancedEvmSettingFragment$initListener$1 advancedEvmSettingFragment$initListener$1 = new AdvancedEvmSettingFragment$initListener$1(continuation);
        advancedEvmSettingFragment$initListener$1.L$0 = str;
        advancedEvmSettingFragment$initListener$1.L$1 = c30563ldX;
        advancedEvmSettingFragment$initListener$1.L$2 = slippageMode;
        return advancedEvmSettingFragment$initListener$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return new Triple((String) this.L$0, (C30563ldX) this.L$1, (SlippageMode) this.L$2);
    }
}
