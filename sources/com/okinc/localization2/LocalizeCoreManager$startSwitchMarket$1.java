package com.okinc.localization2;

import com.okinc.localization2.bean.AppLanguagesChangeResult;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.pTJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalizeCoreManager$startSwitchMarket$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ pTJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizeCoreManager$startSwitchMarket$1(pTJ ptj, Continuation<? super LocalizeCoreManager$startSwitchMarket$1> continuation) {
        super(continuation);
        this.this$0 = ptj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((LanguageUnit) null, 0, (Continuation<? super AppLanguagesChangeResult>) this);
    }
}
