package com.okinc.im.imui.messageV2.view;

import androidx.core.os.BundleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C36609oeG;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListMainFragment$observeViewModelData$27 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C36609oeG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainFragment$observeViewModelData$27(C36609oeG c36609oeG, Continuation<? super MessageListMainFragment$observeViewModelData$27> continuation) {
        super(3, continuation);
        this.this$0 = c36609oeG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(CoroutineScope coroutineScope, boolean z, Continuation<? super Unit> continuation) {
        MessageListMainFragment$observeViewModelData$27 messageListMainFragment$observeViewModelData$27 = new MessageListMainFragment$observeViewModelData$27(this.this$0, continuation);
        messageListMainFragment$observeViewModelData$27.Z$0 = z;
        return messageListMainFragment$observeViewModelData$27.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.getChildFragmentManager().setFragmentResult("KEY_STICKER_BOARD_STATUS_CHANGED", BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_IS_ENABLE_STICKER_BUTTON", C56443yFo.KWHzl(this.Z$0))));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
