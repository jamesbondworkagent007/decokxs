package com.okinc.im.imui.broadcastmessages.main;

import androidx.fragment.app.FragmentContainerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33895nJv;
import o.C35467nvs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessagesMainFragment$initView$8 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C35467nvs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesMainFragment$initView$8(C35467nvs c35467nvs, Continuation<? super BroadcastMessagesMainFragment$initView$8> continuation) {
        super(2, continuation);
        this.this$0 = c35467nvs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessagesMainFragment$initView$8 broadcastMessagesMainFragment$initView$8 = new BroadcastMessagesMainFragment$initView$8(this.this$0, continuation);
        broadcastMessagesMainFragment$initView$8.Z$0 = ((Boolean) obj).booleanValue();
        return broadcastMessagesMainFragment$initView$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagesMainFragment$initView$8) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentContainerView fragmentContainerView;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            C33895nJv c33895nJv = this.this$0.djBIcL;
            if (c33895nJv != null && (fragmentContainerView = c33895nJv.EZpvd) != null) {
                fragmentContainerView.setVisibility(z ? 0 : 8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
