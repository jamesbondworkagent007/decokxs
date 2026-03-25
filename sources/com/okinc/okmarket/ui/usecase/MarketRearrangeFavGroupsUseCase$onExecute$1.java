package com.okinc.okmarket.ui.usecase;

import com.okinc.okmarket.ui.market.data.UserGroupVo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C46863tfG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketRearrangeFavGroupsUseCase$onExecute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C46863tfG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketRearrangeFavGroupsUseCase$onExecute$1(C46863tfG c46863tfG, Continuation<? super MarketRearrangeFavGroupsUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c46863tfG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((List<UserGroupVo>) null, (Continuation<? super Unit>) this);
    }
}
