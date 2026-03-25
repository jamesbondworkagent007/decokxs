package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.bean.SearchResultData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC37420otW;
import o.sQU;
import o.sQY;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class GlobalSearchViewModel$observeFlows$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GlobalSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchViewModel$observeFlows$2(GlobalSearchViewModel globalSearchViewModel, Continuation<? super GlobalSearchViewModel$observeFlows$2> continuation) {
        super(2, continuation);
        this.this$0 = globalSearchViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlobalSearchViewModel$observeFlows$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalSearchViewModel$observeFlows$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(this.this$0.AEQbTJ, this.this$0.AhwBna, new AnonymousClass1(this.this$0, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.GlobalSearchViewModel$observeFlows$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<List<? extends sQU>, List<? extends sQY>, Continuation<? super List<? extends SearchResultData>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ GlobalSearchViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GlobalSearchViewModel globalSearchViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = globalSearchViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* bridge */ /* synthetic */ Object invoke(List<? extends sQU> list, List<? extends sQY> list2, Continuation<? super List<? extends SearchResultData>> continuation) {
            return invoke2((List<sQU>) list, (List<sQY>) list2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<sQU> list, List<sQY> list2, Continuation<? super List<? extends SearchResultData>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                return this.this$0.KWHzl((List<sQU>) this.L$0, (List<sQY>) this.L$1);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.GlobalSearchViewModel$observeFlows$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends SearchResultData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ GlobalSearchViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GlobalSearchViewModel globalSearchViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = globalSearchViewModel;
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
        public final Object invoke(List<? extends SearchResultData> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                if (!this.this$0.fetchVPNInfo.keys().containsAll(yDY.gEmmrt("SAVED_STATE_KEY_CHATS_AND_CONTACTS_LOAD_MORE", "SAVED_STATE_KEY_MESSAGES_LOAD_MORE"))) {
                    MutableStateFlow mutableStateFlow = this.this$0.AYXKKw;
                    InterfaceC37420otW.Application application = InterfaceC37420otW.Application.AEQbTJ;
                    this.label = 1;
                    if (mutableStateFlow.emit(application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (list.isEmpty()) {
                    MutableStateFlow mutableStateFlow2 = this.this$0.AYXKKw;
                    InterfaceC37420otW.ActionBar actionBar = InterfaceC37420otW.ActionBar.copydefault;
                    this.label = 2;
                    if (mutableStateFlow2.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    MutableStateFlow mutableStateFlow3 = this.this$0.AYXKKw;
                    InterfaceC37420otW.StateListAnimator stateListAnimator = new InterfaceC37420otW.StateListAnimator(list);
                    this.label = 3;
                    if (mutableStateFlow3.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
