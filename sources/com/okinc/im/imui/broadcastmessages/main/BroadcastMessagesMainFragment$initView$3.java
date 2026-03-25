package com.okinc.im.imui.broadcastmessages.main;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C35467nvs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessagesMainFragment$initView$3 extends SuspendLambda implements Function2<OKMessage, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35467nvs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesMainFragment$initView$3(C35467nvs c35467nvs, Continuation<? super BroadcastMessagesMainFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c35467nvs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessagesMainFragment$initView$3 broadcastMessagesMainFragment$initView$3 = new BroadcastMessagesMainFragment$initView$3(this.this$0, continuation);
        broadcastMessagesMainFragment$initView$3.L$0 = obj;
        return broadcastMessagesMainFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OKMessage oKMessage, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagesMainFragment$initView$3) create(oKMessage, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.gEmmrt().KWHzl(this.this$0.DbNXlk().AEQbTJ().AEQbTJ(), (OKMessage) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
