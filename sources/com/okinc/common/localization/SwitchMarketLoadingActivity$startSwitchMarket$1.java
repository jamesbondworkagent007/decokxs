package com.okinc.common.localization;

import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityC32554mfl;
import o.pTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SwitchMarketLoadingActivity$startSwitchMarket$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ ActivityC32554mfl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchMarketLoadingActivity$startSwitchMarket$1(ActivityC32554mfl activityC32554mfl, Continuation<? super SwitchMarketLoadingActivity$startSwitchMarket$1> continuation) {
        super(continuation);
        this.this$0 = activityC32554mfl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((pTU) null, (LanguageUnit) null, 0, (String) null, (Continuation<? super Unit>) this);
    }
}
