package com.okinc.core.ok_app.modeswitch.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC33244msm;
import o.AbstractC33469mwz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ModeSwitchBottomSheet$trySwitchMode$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ AbstractC33469mwz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeSwitchBottomSheet$trySwitchMode$1(AbstractC33469mwz abstractC33469mwz, Continuation<? super ModeSwitchBottomSheet$trySwitchMode$1> continuation) {
        super(continuation);
        this.this$0 = abstractC33469mwz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((AbstractC33244msm) null, (Continuation<? super Unit>) this);
    }
}
