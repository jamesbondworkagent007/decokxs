package com.okinc.lifecycle.impl.business.recommend.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C38072pLe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenRecommendViewModel$observePriceUpdated$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C38072pLe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenRecommendViewModel$observePriceUpdated$1(C38072pLe c38072pLe, Continuation<? super TokenRecommendViewModel$observePriceUpdated$1> continuation) {
        super(continuation);
        this.this$0 = c38072pLe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((LifecycleOwner) null, (List<String>) null, (Continuation<? super Unit>) this);
    }
}
