package com.okinc.im.imui.messageV2.view;

import com.okinc.im.config.page.IMPageType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$buildPageToolbarTitleFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super String>, Pair<? extends String, ? extends IMPageType>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChatActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivityViewModel$buildPageToolbarTitleFlow$$inlined$flatMapLatest$1(Continuation continuation, ChatActivityViewModel chatActivityViewModel) {
        super(3, continuation);
        this.this$0 = chatActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super String> flowCollector, Pair<? extends String, ? extends IMPageType> pair, Continuation<? super Unit> continuation) {
        ChatActivityViewModel$buildPageToolbarTitleFlow$$inlined$flatMapLatest$1 chatActivityViewModel$buildPageToolbarTitleFlow$$inlined$flatMapLatest$1 = new ChatActivityViewModel$buildPageToolbarTitleFlow$$inlined$flatMapLatest$1(continuation, this.this$0);
        chatActivityViewModel$buildPageToolbarTitleFlow$$inlined$flatMapLatest$1.L$0 = flowCollector;
        chatActivityViewModel$buildPageToolbarTitleFlow$$inlined$flatMapLatest$1.L$1 = pair;
        return chatActivityViewModel$buildPageToolbarTitleFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Pair pair = (Pair) this.L$1;
            String str = (String) pair.component1();
            IMPageType iMPageType = (IMPageType) pair.component2();
            pUU.KWHzl("ChatActivityViewModel", "buildPageToolbarTitleFlow - channelId: " + str + ", pageType: " + iMPageType);
            Flow<String> flowAEQbTJ = this.this$0.zuBGHE.AEQbTJ(str, iMPageType);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowAEQbTJ, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
