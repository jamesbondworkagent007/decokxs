package com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C21951hSj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class HolderInfoBottomSheet$generateTagsFromMetadata$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C21951hSj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderInfoBottomSheet$generateTagsFromMetadata$1(C21951hSj c21951hSj, Continuation<? super HolderInfoBottomSheet$generateTagsFromMetadata$1> continuation) {
        super(continuation);
        this.this$0 = c21951hSj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, false, this);
    }
}
