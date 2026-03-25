package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.im.group.VipGroupDismissState;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33796nGd;
import o.C36609oeG;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageListMainFragment$observeVipGroupEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C36609oeG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainFragment$observeVipGroupEvent$1(C36609oeG c36609oeG, Continuation<? super MessageListMainFragment$observeVipGroupEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c36609oeG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListMainFragment$observeVipGroupEvent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainFragment$observeVipGroupEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<VipGroupDismissState> sharedFlowKWHzl = this.this$0.DbNXlk().KWHzl();
            final C36609oeG c36609oeG = this.this$0;
            FlowCollector<? super VipGroupDismissState> flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$observeVipGroupEvent$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(VipGroupDismissState vipGroupDismissState, Continuation<? super Unit> continuation) {
                    C33796nGd.StateListAnimator.newInstance$default(C33796nGd.Companion, vipGroupDismissState, false, 2, null).show(c36609oeG.getChildFragmentManager(), "VipGroupFrozenNotice");
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
