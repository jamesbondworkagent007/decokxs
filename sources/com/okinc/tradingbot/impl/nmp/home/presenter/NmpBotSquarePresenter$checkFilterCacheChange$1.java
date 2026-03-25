package com.okinc.tradingbot.impl.nmp.home.presenter;

import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class NmpBotSquarePresenter$checkFilterCacheChange$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NmpBotSquarePresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NmpBotSquarePresenter$checkFilterCacheChange$1(NmpBotSquarePresenter nmpBotSquarePresenter, Continuation<? super NmpBotSquarePresenter$checkFilterCacheChange$1> continuation) {
        super(continuation);
        this.this$0 = nmpBotSquarePresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((HomeStrategyDropDownInfo) null, (Continuation<? super Boolean>) this);
    }
}
