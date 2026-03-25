package com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders;

import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C21951hSj;
import o.C21961hSt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class HolderInfoBottomSheet$loadExplanationList$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C21951hSj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderInfoBottomSheet$loadExplanationList$1(C21951hSj c21951hSj, Continuation<? super HolderInfoBottomSheet$loadExplanationList$1> continuation) {
        super(continuation);
        this.this$0 = c21951hSj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((List<TagWrapper>) null, (Continuation<? super List<C21961hSt>>) this);
    }
}
