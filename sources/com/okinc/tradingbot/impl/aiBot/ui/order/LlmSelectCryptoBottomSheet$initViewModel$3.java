package com.okinc.tradingbot.impl.aiBot.ui.order;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C48471uSq;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.uFI;

/* JADX INFO: loaded from: classes16.dex */
public final class LlmSelectCryptoBottomSheet$initViewModel$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ uFI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmSelectCryptoBottomSheet$initViewModel$3(uFI ufi, Continuation<? super LlmSelectCryptoBottomSheet$initViewModel$3> continuation) {
        super(2, continuation);
        this.this$0 = ufi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmSelectCryptoBottomSheet$initViewModel$3 llmSelectCryptoBottomSheet$initViewModel$3 = new LlmSelectCryptoBottomSheet$initViewModel$3(this.this$0, continuation);
        llmSelectCryptoBottomSheet$initViewModel$3.Z$0 = ((Boolean) obj).booleanValue();
        return llmSelectCryptoBottomSheet$initViewModel$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((LlmSelectCryptoBottomSheet$initViewModel$3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TextView textView;
        int iCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            C48471uSq c48471uSq = this.this$0.DbNXlk;
            if (c48471uSq != null && (textView = c48471uSq.copydefault) != null) {
                if (z) {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
                } else {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DQzvGN);
                }
                textView.setTextColor(iCopydefault);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
