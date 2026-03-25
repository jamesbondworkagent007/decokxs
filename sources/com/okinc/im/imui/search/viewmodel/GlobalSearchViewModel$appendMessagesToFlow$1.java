package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.imui.search.viewmodel.GlobalSearchViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GlobalSearchViewModel$appendMessagesToFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlobalSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchViewModel$appendMessagesToFlow$1(GlobalSearchViewModel globalSearchViewModel, Continuation<? super GlobalSearchViewModel$appendMessagesToFlow$1> continuation) {
        super(continuation);
        this.this$0 = globalSearchViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((GlobalSearchViewModel.Application) null, (Continuation<? super Unit>) this);
    }
}
