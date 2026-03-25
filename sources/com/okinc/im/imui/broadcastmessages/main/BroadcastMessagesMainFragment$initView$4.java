package com.okinc.im.imui.broadcastmessages.main;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C35467nvs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessagesMainFragment$initView$4 extends SuspendLambda implements Function2<Pair<? extends List<? extends OKMessage>, ? extends Boolean>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35467nvs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesMainFragment$initView$4(C35467nvs c35467nvs, Continuation<? super BroadcastMessagesMainFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c35467nvs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessagesMainFragment$initView$4 broadcastMessagesMainFragment$initView$4 = new BroadcastMessagesMainFragment$initView$4(this.this$0, continuation);
        broadcastMessagesMainFragment$initView$4.L$0 = obj;
        return broadcastMessagesMainFragment$initView$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends List<? extends OKMessage>, ? extends Boolean> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<? extends List<OKMessage>, Boolean>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<? extends List<OKMessage>, Boolean> pair, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagesMainFragment$initView$4) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            List<OKMessage> list = (List) pair.component1();
            boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
            this.this$0.EZpvd().copydefault();
            this.this$0.AEQbTJ().KWHzl(list, zBooleanValue);
            this.this$0.AYXKKw().copydefault(list);
            this.this$0.KWHzl().EZpvd(list);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
