package com.okinc.im.imui.conversationlist.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ConversationListViewModel$observeDisplayList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$observeDisplayList$1(ConversationListViewModel conversationListViewModel, Continuation<? super ConversationListViewModel$observeDisplayList$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationListViewModel$observeDisplayList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$observeDisplayList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class StateListAnimator implements Flow<List<Object>> {
        public final /* synthetic */ Flow[] AEQbTJ;
        public final /* synthetic */ ConversationListViewModel KWHzl;

        public StateListAnimator(Flow[] flowArr, ConversationListViewModel conversationListViewModel) {
            this.AEQbTJ = flowArr;
            this.KWHzl = conversationListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<Object>> flowCollector, Continuation continuation) {
            final Flow[] flowArr = this.AEQbTJ;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new Function0<Object[]>() { // from class: com.okinc.im.imui.conversationlist.viewmodel.ConversationListViewModel.observeDisplayList.1.StateListAnimator.5
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object[] invoke() {
                    return new Object[flowArr.length];
                }
            }, new ConversationListViewModel$observeDisplayList$1$invokeSuspend$$inlined$combine$1$3(null, this.KWHzl), continuation);
            return objCombineInternal == C56442yFn.copydefault() ? objCombineInternal : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flowOn(new StateListAnimator(new Flow[]{this.this$0.ejfBZ, this.this$0.iwGUEr, FlowKt.filterNotNull(FlowKt.onStart(FlowKt.flowCombine(this.this$0.gHZMYf, this.this$0.zuBGHE, new ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$1(null)), new ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2(null))), this.this$0.QKVWgx, this.this$0.AxsJAY, this.this$0.DTwDnp, this.this$0.fJNWhG, this.this$0.AuCTel}, this.this$0), Dispatchers.getDefault()));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.viewmodel.ConversationListViewModel$observeDisplayList$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<Object>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConversationListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConversationListViewModel conversationListViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = conversationListViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<Object> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<Object> list = (List) this.L$0;
                pUU.KWHzl("ConversationListViewModel", "set data to display list, count:" + list.size());
                this.this$0.AxsJAY().setValue(list);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
