package com.okinc.find_ui.ranking.stock.sub;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C35074noU;
import o.C41298qoF;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC40516qYt;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockRankingFragment$setListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35074noU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeStockRankingFragment$setListener$1(C35074noU c35074noU, Continuation<? super MarketHomeStockRankingFragment$setListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c35074noU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeStockRankingFragment$setListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeStockRankingFragment$setListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$setListener$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C35074noU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C35074noU c35074noU, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c35074noU;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$setListener$1$1$ActionBar */
        public static final class ActionBar implements Flow<InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>>> {
            public final /* synthetic */ Flow EZpvd;

            /* JADX INFO: renamed from: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$setListener$1$1$ActionBar$3, reason: invalid class name */
            public static final class AnonymousClass3<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass3(FlowCollector flowCollector) {
                    this.KWHzl = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1 marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1;
                    if (continuation instanceof MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1) {
                        marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1 = (MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1) continuation;
                        int i = marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1 = new MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                        }
                    }
                    Object obj2 = marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.KWHzl;
                        InterfaceC49371unL<List<InterfaceC40516qYt>> interfaceC49371unLOLrzqt = ((MarketHomeStockContainerViewModel.StateListAnimator) obj).OLrzqt();
                        marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                        if (flowCollector.emit(interfaceC49371unLOLrzqt, marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1) == objCopydefault) {
                            return objCopydefault;
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

            public ActionBar(Flow flow) {
                this.EZpvd = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>>> flowCollector, Continuation continuation) {
                Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$setListener$1$1$Activity */
        public static final class Activity implements Flow<InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>>> {
            public final /* synthetic */ Flow EZpvd;

            /* JADX INFO: renamed from: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$setListener$1$1$Activity$4, reason: invalid class name */
            public static final class AnonymousClass4<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass4(FlowCollector flowCollector) {
                    this.copydefault = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1 marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1;
                    if (continuation instanceof MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1) {
                        marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1 = (MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i = marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1 = new MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.copydefault;
                        InterfaceC49371unL<List<InterfaceC40516qYt>> interfaceC49371unLValueOf = ((MarketHomeStockContainerViewModel.StateListAnimator) obj).valueOf();
                        marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(interfaceC49371unLValueOf, marketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
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

            public Activity(Flow flow) {
                this.EZpvd = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>>> flowCollector, Continuation continuation) {
                Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String strGEmmrt = this.this$0.gEmmrt();
                if (!Intrinsics.EZpvd((Object) strGEmmrt, (Object) "SPOT")) {
                    if (!Intrinsics.EZpvd((Object) strGEmmrt, (Object) "SWAP")) {
                        C41298qoF.e$default(C41298qoF.AEQbTJ, this.this$0.getTAG(), "Unknown bizType: " + this.this$0.gEmmrt(), null, 4, null);
                    } else {
                        ActionBar actionBar = new ActionBar(this.this$0.DbNXlk().AEQbTJ());
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                        this.label = 2;
                        if (FlowKt.collectLatest(actionBar, anonymousClass4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    Activity activity = new Activity(this.this$0.DbNXlk().AEQbTJ());
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(activity, anonymousClass2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$setListener$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C35074noU this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C35074noU c35074noU, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = c35074noU;
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
            public final Object invoke(InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>> interfaceC49371unL, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.EZpvd((InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>>) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$setListener$1$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C35074noU this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(C35074noU c35074noU, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = c35074noU;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>> interfaceC49371unL, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.EZpvd((InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>>) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
