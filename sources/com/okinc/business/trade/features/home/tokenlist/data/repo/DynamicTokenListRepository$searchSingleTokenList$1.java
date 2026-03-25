package com.okinc.business.trade.features.home.tokenlist.data.repo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C28382kZi;
import o.kYA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class DynamicTokenListRepository$searchSingleTokenList$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kYA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicTokenListRepository$searchSingleTokenList$1(kYA kya, Continuation<? super DynamicTokenListRepository$searchSingleTokenList$1> continuation) {
        super(continuation);
        this.this$0 = kya;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((C28382kZi) null, this);
    }
}
