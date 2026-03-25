package com.okinc.tradingbot.impl.aiBot.ui.signal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C48298uMh;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.uGU;
import o.uLU;

/* JADX INFO: loaded from: classes16.dex */
public final class EditMarketSignalActivity$observeViewModel$1 extends SuspendLambda implements Function2<uLU<? extends uGU>, Continuation<? super Unit>, Object> {
    final /* synthetic */ C48298uMh $binding;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditMarketSignalActivity$observeViewModel$1(C48298uMh c48298uMh, Continuation<? super EditMarketSignalActivity$observeViewModel$1> continuation) {
        super(2, continuation);
        this.$binding = c48298uMh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EditMarketSignalActivity$observeViewModel$1 editMarketSignalActivity$observeViewModel$1 = new EditMarketSignalActivity$observeViewModel$1(this.$binding, continuation);
        editMarketSignalActivity$observeViewModel$1.L$0 = obj;
        return editMarketSignalActivity$observeViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(uLU<? extends uGU> ulu, Continuation<? super Unit> continuation) {
        return invoke2((uLU<uGU>) ulu, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(uLU<uGU> ulu, Continuation<? super Unit> continuation) {
        return ((EditMarketSignalActivity$observeViewModel$1) create(ulu, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            uLU ulu = (uLU) this.L$0;
            if (ulu instanceof uLU.ActionBar) {
                C52794wYp c52794wYpCopydefault = this.$binding.KWHzl.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setEnabled(((uGU) ((uLU.ActionBar) ulu).KWHzl()).KWHzl());
                }
                C52794wYp c52794wYpAEQbTJ = this.$binding.KWHzl.AEQbTJ();
                if (c52794wYpAEQbTJ != null) {
                    c52794wYpAEQbTJ.setEnabled(true);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
