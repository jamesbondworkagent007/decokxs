package com.okinc.business.market.market.fragment.watchlist;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27947kJf;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListViewModel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C27947kJf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListViewModel$2(C27947kJf c27947kJf, Continuation<? super WatchListViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = c27947kJf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListViewModel$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListViewModel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$2$5, reason: invalid class name */
    public static final class AnonymousClass5<T> implements FlowCollector {
        public final /* synthetic */ C27947kJf AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(C27947kJf c27947kJf) {
            this.AEQbTJ = c27947kJf;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(C27947kJf.ActionBar actionBar, Continuation<? super Unit> continuation) throws Throwable {
            WatchListViewModel$2$1$emit$1 watchListViewModel$2$1$emit$1;
            AnonymousClass5<T> anonymousClass5;
            if (continuation instanceof WatchListViewModel$2$1$emit$1) {
                watchListViewModel$2$1$emit$1 = (WatchListViewModel$2$1$emit$1) continuation;
                int i = watchListViewModel$2$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    watchListViewModel$2$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    watchListViewModel$2$1$emit$1 = new WatchListViewModel$2$1$emit$1(this, continuation);
                }
            }
            Object obj = watchListViewModel$2$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = watchListViewModel$2$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow<C27947kJf.ActionBar> mutableStateFlowCopydefault = this.AEQbTJ.copydefault();
                watchListViewModel$2$1$emit$1.L$0 = this;
                watchListViewModel$2$1$emit$1.L$1 = actionBar;
                watchListViewModel$2$1$emit$1.label = 1;
                if (mutableStateFlowCopydefault.emit(actionBar, watchListViewModel$2$1$emit$1) == objCopydefault) {
                    return objCopydefault;
                }
                anonymousClass5 = this;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                actionBar = (C27947kJf.ActionBar) watchListViewModel$2$1$emit$1.L$1;
                anonymousClass5 = (AnonymousClass5) watchListViewModel$2$1$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            if (anonymousClass5.AEQbTJ.OLrzqt()) {
                C27947kJf c27947kJf = anonymousClass5.AEQbTJ;
                WatchListViewModel$2$1$1 watchListViewModel$2$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$2$1$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((C27947kJf.Activity) obj2).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((C27947kJf.Activity) obj2).EZpvd((InterfaceC49371unL) obj3);
                    }
                };
                InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(actionBar);
                watchListViewModel$2$1$emit$1.L$0 = null;
                watchListViewModel$2$1$emit$1.L$1 = null;
                watchListViewModel$2$1$emit$1.label = 2;
                if (c27947kJf.KWHzl(watchListViewModel$2$1$1, activity, watchListViewModel$2$1$emit$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C27947kJf c27947kJf2 = anonymousClass5.AEQbTJ;
            WatchListViewModel$2$1$2 watchListViewModel$2$1$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$2$1$2
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C27947kJf.Activity) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C27947kJf.Activity) obj2).EZpvd((InterfaceC49371unL) obj3);
                }
            };
            InterfaceC49371unL.ActionBar actionBar2 = new InterfaceC49371unL.ActionBar(null, 1, null);
            watchListViewModel$2$1$emit$1.L$0 = null;
            watchListViewModel$2$1$emit$1.L$1 = null;
            watchListViewModel$2$1$emit$1.label = 3;
            if (c27947kJf2.KWHzl(watchListViewModel$2$1$2, actionBar2, watchListViewModel$2$1$emit$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flow = this.this$0.AEQbTJ;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0);
            this.label = 1;
            if (flow.collect(anonymousClass5, this) == objCopydefault) {
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
