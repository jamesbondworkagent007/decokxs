package com.okinc.im.imui.messageV2.view;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C35399nuc;
import o.C36609oeG;
import o.C36913ojt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListMainFragment$observeViewModelData$20 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C36609oeG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainFragment$observeViewModelData$20(C36609oeG c36609oeG, Continuation<? super MessageListMainFragment$observeViewModelData$20> continuation) {
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
        MessageListMainFragment$observeViewModelData$20 messageListMainFragment$observeViewModelData$20 = new MessageListMainFragment$observeViewModelData$20(this.this$0, continuation);
        messageListMainFragment$observeViewModelData$20.Z$0 = z;
        return messageListMainFragment$observeViewModelData$20.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            Fragment fragmentFindFragmentById = this.this$0.getChildFragmentManager().findFragmentById(C35399nuc.StateListAnimator.HJWChPRGtXKC);
            C36913ojt c36913ojt = fragmentFindFragmentById instanceof C36913ojt ? (C36913ojt) fragmentFindFragmentById : null;
            if (c36913ojt != null) {
                c36913ojt.AEQbTJ(z);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
