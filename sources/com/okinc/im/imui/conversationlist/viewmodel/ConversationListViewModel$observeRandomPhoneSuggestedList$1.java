package com.okinc.im.imui.conversationlist.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C35182nqW;
import o.C35870oGt;
import o.C37246oqH;
import o.C37248oqJ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56548yJl;
import o.sEI;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ConversationListViewModel$observeRandomPhoneSuggestedList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$observeRandomPhoneSuggestedList$1(ConversationListViewModel conversationListViewModel, Continuation<? super ConversationListViewModel$observeRandomPhoneSuggestedList$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationListViewModel$observeRandomPhoneSuggestedList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$observeRandomPhoneSuggestedList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.gHZMYf);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.viewmodel.ConversationListViewModel$observeRandomPhoneSuggestedList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends C37248oqJ>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConversationListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationListViewModel conversationListViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = conversationListViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends C37248oqJ> list, Continuation<? super Unit> continuation) {
            return invoke2((List<C37248oqJ>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<C37248oqJ> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                int iCopydefault = C56548yJl.copydefault(sEI.KWHzl.copydefault() - ((List) this.L$0).size(), 0);
                if (iCopydefault > 0) {
                    C35870oGt c35870oGt = this.this$0.AxsJAYsNCnLh;
                    String strHDKMBd = this.this$0.hDKMBd();
                    Flow flowM7441catch = FlowKt.m7441catch(c35870oGt.KWHzl(strHDKMBd != null ? C35182nqW.KWHzl(strHDKMBd) : null, iCopydefault), new C04091(this.this$0, null));
                    final ConversationListViewModel conversationListViewModel = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.conversationlist.viewmodel.ConversationListViewModel.observeRandomPhoneSuggestedList.1.1.2
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                        public final Object emit(List<C37246oqH> list, Continuation<? super Unit> continuation) {
                            conversationListViewModel.zuBGHE.setValue(list);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowM7441catch.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    this.this$0.zuBGHE.setValue(yDY.AhwBna());
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.viewmodel.ConversationListViewModel$observeRandomPhoneSuggestedList$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04091 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends C37246oqH>>, Throwable, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConversationListViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04091(ConversationListViewModel conversationListViewModel, Continuation<? super C04091> continuation) {
                super(3, continuation);
                this.this$0 = conversationListViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHO
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends C37246oqH>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super List<C37246oqH>>) flowCollector, th, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super List<C37246oqH>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new C04091(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.zuBGHE.setValue(null);
                return Unit.INSTANCE;
            }
        }
    }
}
