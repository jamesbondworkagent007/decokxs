package com.okinc.kline.ui;

import androidx.lifecycle.FlowLiveDataConversions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C38516pas;
import o.C39519ptq;
import o.C48916ueh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHS;

/* JADX INFO: loaded from: classes18.dex */
public final class CoinMoreTradeFragmentV2$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C38516pas this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinMoreTradeFragmentV2$onCreate$2(C38516pas c38516pas, Continuation<? super CoinMoreTradeFragmentV2$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = c38516pas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinMoreTradeFragmentV2$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinMoreTradeFragmentV2$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements Flow<C48916ueh> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$2$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1 coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1;
                if (continuation instanceof CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1) {
                    coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1 = (CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1) continuation;
                    int i = coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1 = new CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1(this, continuation);
                    }
                }
                Object obj2 = coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    List list = (List) obj;
                    C48916ueh c48916ueh = list != null ? (C48916ueh) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
                    coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(c48916ueh, coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$3$2$1) == objCopydefault) {
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
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C48916ueh> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Activity implements Flow<C39519ptq> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$2$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1 coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1;
                if (continuation instanceof CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1) {
                    coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1 = (CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1) continuation;
                    int i = coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1 = new CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    List list = (List) obj;
                    C39519ptq c39519ptq = list != null ? (C39519ptq) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
                    coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(c39519ptq, coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$2$2$1) == objCopydefault) {
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
        public Object collect(FlowCollector<? super C39519ptq> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<C39519ptq> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$2$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1 coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1) {
                    coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1 = (CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1 = new CoinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    List list = (List) obj;
                    C39519ptq c39519ptq = list != null ? (C39519ptq) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
                    coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c39519ptq, coinMoreTradeFragmentV2$onCreate$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C39519ptq> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(new TaskDescription(FlowLiveDataConversions.asFlow(this.this$0.gEmmrt().AubY())), new Activity(FlowLiveDataConversions.asFlow(this.this$0.gEmmrt().uzCIH())), FlowLiveDataConversions.asFlow(this.this$0.gEmmrt().getFieldNames()), new ActionBar(FlowLiveDataConversions.asFlow(this.this$0.gEmmrt().hDKMBd())), new AnonymousClass1(null));
            final C38516pas c38516pas = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$2.2
                /* JADX DEBUG: Class process forced to load method for inline: o.pas.AEQbTJ(o.pas):o.zip */
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<? extends Object> list, Continuation<? super Unit> continuation) {
                    boolean z = list.size() < c38516pas.KWHzl.getItemCount();
                    c38516pas.KWHzl.setItems(list);
                    c38516pas.copydefault(z);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowCombine.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHS<C39519ptq, C39519ptq, List<? extends C39519ptq>, C48916ueh, Continuation<? super List<? extends Object>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(5, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHS
        public /* bridge */ /* synthetic */ Object invoke(C39519ptq c39519ptq, C39519ptq c39519ptq2, List<? extends C39519ptq> list, C48916ueh c48916ueh, Continuation<? super List<? extends Object>> continuation) {
            return invoke2(c39519ptq, c39519ptq2, (List<C39519ptq>) list, c48916ueh, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C39519ptq c39519ptq, C39519ptq c39519ptq2, List<C39519ptq> list, C48916ueh c48916ueh, Continuation<? super List<? extends Object>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = c39519ptq;
            anonymousClass1.L$1 = c39519ptq2;
            anonymousClass1.L$2 = list;
            anonymousClass1.L$3 = c48916ueh;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List listQfsBiF;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C39519ptq c39519ptq = (C39519ptq) this.L$0;
                C39519ptq c39519ptq2 = (C39519ptq) this.L$1;
                List list = (List) this.L$2;
                C48916ueh c48916ueh = (C48916ueh) this.L$3;
                ArrayList arrayList = new ArrayList();
                if (c39519ptq != null) {
                    C56443yFo.KWHzl(arrayList.add(c39519ptq));
                }
                if (c39519ptq2 != null) {
                    C56443yFo.KWHzl(arrayList.add(c39519ptq2));
                }
                if (list != null && (listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(list)) != null) {
                    Iterator it = listQfsBiF.iterator();
                    while (it.hasNext()) {
                        arrayList.add((C39519ptq) it.next());
                    }
                }
                if (c48916ueh != null) {
                    C56443yFo.KWHzl(arrayList.add(c48916ueh));
                }
                arrayList.add("");
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
