package com.okinc.business.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import o.C28179kRv;
import o.C28230kTs;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28226kTo;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketInfoVM$observeWS$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AdvancedMarketInfoVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketInfoVM$observeWS$2(AdvancedMarketInfoVM advancedMarketInfoVM, Continuation<? super AdvancedMarketInfoVM$observeWS$2> continuation) {
        super(2, continuation);
        this.this$0 = advancedMarketInfoVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketInfoVM$observeWS$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMarketInfoVM$observeWS$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class StateListAnimator implements Flow<Object> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ AdvancedMarketInfoVM OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMarketInfoVM$observeWS$2$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ AdvancedMarketInfoVM EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, AdvancedMarketInfoVM advancedMarketInfoVM) {
                this.AEQbTJ = flowCollector;
                this.EZpvd = advancedMarketInfoVM;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                AdvancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1 advancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1;
                if (continuation instanceof AdvancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1) {
                    advancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1 = (AdvancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = advancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        advancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        advancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1 = new AdvancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = advancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = advancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    if (this.EZpvd.KWHzl(obj)) {
                        advancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, advancedMarketInfoVM$observeWS$2$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, AdvancedMarketInfoVM advancedMarketInfoVM) {
            this.EZpvd = flow;
            this.OLrzqt = advancedMarketInfoVM;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28179kRv c28179kRv = this.this$0.AuCTel;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.this$0.copydefault();
            this.label = 1;
            obj = c28179kRv.KWHzl(dexMultiTokenInfoBeanCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        StateListAnimator stateListAnimator = new StateListAnimator(FlowKt.stateIn((Flow) obj, ViewModelKt.getViewModelScope(this.this$0), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), new Object()), this.this$0);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
        this.label = 2;
        if (FlowKt.collectLatest(stateListAnimator, anonymousClass2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMarketInfoVM$observeWS$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AdvancedMarketInfoVM this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdvancedMarketInfoVM advancedMarketInfoVM, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = advancedMarketInfoVM;
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
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Object obj2 = this.L$0;
                if (obj2 instanceof ArrayList) {
                    Iterable iterable = (Iterable) obj2;
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (!(next instanceof C28230kTs)) {
                            break;
                        }
                    }
                    if (next == null) {
                        MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                        for (Object obj3 : iterable) {
                            Intrinsics.copydefault(obj3, "");
                            arrayList.add((C28230kTs) obj3);
                        }
                        mutableStateFlow.setValue(new InterfaceC28226kTo.ActionBar(arrayList));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
