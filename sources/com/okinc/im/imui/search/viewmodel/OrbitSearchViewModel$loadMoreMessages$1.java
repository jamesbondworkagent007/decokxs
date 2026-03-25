package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.bean.SearchResultData;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class OrbitSearchViewModel$loadMoreMessages$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrbitSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitSearchViewModel$loadMoreMessages$1(OrbitSearchViewModel orbitSearchViewModel, Continuation<? super OrbitSearchViewModel$loadMoreMessages$1> continuation) {
        super(continuation);
        this.this$0 = orbitSearchViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((Continuation<? super List<? extends SearchResultData>>) this);
    }
}
