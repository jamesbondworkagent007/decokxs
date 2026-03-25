package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.bean.SupportLandingResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportCenterHomeViewModel$parseLandingCards$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SupportCenterHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCenterHomeViewModel$parseLandingCards$1(SupportCenterHomeViewModel supportCenterHomeViewModel, Continuation<? super SupportCenterHomeViewModel$parseLandingCards$1> continuation) {
        super(continuation);
        this.this$0 = supportCenterHomeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((SupportLandingResponse) null, (Continuation<? super Unit>) this);
    }
}
