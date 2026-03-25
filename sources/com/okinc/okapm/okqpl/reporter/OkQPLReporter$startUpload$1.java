package com.okinc.okapm.okqpl.reporter;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C42540rWq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yHO;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OkQPLReporter$startUpload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OkQPLReporter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkQPLReporter$startUpload$1(OkQPLReporter okQPLReporter, Continuation<? super OkQPLReporter$startUpload$1> continuation) {
        super(2, continuation);
        this.this$0 = okQPLReporter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkQPLReporter$startUpload$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OkQPLReporter$startUpload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$startUpload$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OkQPLReporter this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OkQPLReporter okQPLReporter, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = okQPLReporter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:11:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            FlowCollector flowCollector;
            int i;
            Integer numAEQbTJ;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = this.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                flowCollector = (FlowCollector) this.L$0;
                i = 0;
            } else if (i2 == 1) {
                i = this.I$0;
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                int i3 = i + 1;
                numAEQbTJ = C56443yFo.AEQbTJ(i);
                this.L$0 = flowCollector;
                this.I$0 = i3;
                this.label = 2;
                if (flowCollector.emit(numAEQbTJ, this) != objCopydefault) {
                    return objCopydefault;
                }
                i = i3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            long j = this.this$0.KWHzl;
            this.L$0 = flowCollector;
            this.I$0 = i;
            this.label = 1;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
            int i32 = i + 1;
            numAEQbTJ = C56443yFo.AEQbTJ(i);
            this.L$0 = flowCollector;
            this.I$0 = i32;
            this.label = 2;
            if (flowCollector.emit(numAEQbTJ, this) != objCopydefault) {
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFlowOn = FlowKt.flowOn(FlowKt.onCompletion(FlowKt.onStart(FlowKt.retryWhen(FlowKt.transformLatest(FlowKt.transformLatest(new ActionBar(new StateListAnimator(FlowKt.onEach(new Application(FlowKt.flow(new AnonymousClass1(this.this$0, null)), this.this$0), new AnonymousClass3(null)), this.this$0)), new OkQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), new OkQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$2(null, this.this$0)), new AnonymousClass8(null)), new AnonymousClass9(null)), new AnonymousClass10(null)), this.this$0.copydefault);
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFlowOn, anonymousClass11, this) == objCopydefault) {
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

    public static final class ActionBar implements Flow<List<? extends C42540rWq>> {
        public final /* synthetic */ Flow OLrzqt;

        public ActionBar(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(@NotNull FlowCollector<? super List<? extends C42540rWq>> flowCollector, @NotNull Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$startUpload$1$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                OkQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1 okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1;
                if (continuation instanceof OkQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1) {
                    okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1 = (OkQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1) continuation;
                    int i = okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1 = new OkQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1(this, continuation);
                    }
                }
                Object obj2 = okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    pUU.EZpvd("Monitor.OkQPL", "OkQPL reporting service has fetched " + ((List) obj).size() + " events to report");
                    if (!r2.isEmpty()) {
                        okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1.label = 1;
                        if (flowCollector.emit(obj, okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$2$2$1) == objCopydefault) {
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
    }

    public static final class Application implements Flow<Integer> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ OkQPLReporter KWHzl;

        public Application(Flow flow, OkQPLReporter okQPLReporter) {
            this.AEQbTJ = flow;
            this.KWHzl = okQPLReporter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(@NotNull FlowCollector<? super Integer> flowCollector, @NotNull Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$startUpload$1$Application$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ OkQPLReporter EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, OkQPLReporter okQPLReporter) {
                this.KWHzl = flowCollector;
                this.EZpvd = okQPLReporter;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                OkQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1 okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1;
                if (continuation instanceof OkQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1) {
                    okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1 = (OkQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1 = new OkQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    ((Number) obj).intValue();
                    if (this.EZpvd.KWHzl()) {
                        okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, okQPLReporter$startUpload$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
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
    }

    public static final class StateListAnimator implements Flow<List<? extends C42540rWq>> {
        public final /* synthetic */ OkQPLReporter EZpvd;
        public final /* synthetic */ Flow KWHzl;

        public StateListAnimator(Flow flow, OkQPLReporter okQPLReporter) {
            this.KWHzl = flow;
            this.EZpvd = okQPLReporter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(@NotNull FlowCollector<? super List<? extends C42540rWq>> flowCollector, @NotNull Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$startUpload$1$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ OkQPLReporter copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, OkQPLReporter okQPLReporter) {
                this.EZpvd = flowCollector;
                this.copydefault = okQPLReporter;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                OkQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1 okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof OkQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1) {
                    okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1 = (OkQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1 = new OkQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.EZpvd;
                    ((Number) obj).intValue();
                    Flow<List<C42540rWq>> flowAEQbTJ = this.copydefault.gEmmrt.AEQbTJ();
                    okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1.L$0 = flowCollector2;
                    okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    Object objFirst = FlowKt.first(flowAEQbTJ, okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1);
                    if (objFirst == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objFirst;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, okQPLReporter$startUpload$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$startUpload$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("Monitor.OkQPL", "OkQPL reporting service is fetching events to report");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$startUpload$1$8, reason: invalid class name */
    public static final class AnonymousClass8 extends SuspendLambda implements yHT<FlowCollector<? super Integer>, Throwable, Long, Continuation<? super Boolean>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass8(Continuation<? super AnonymousClass8> continuation) {
            super(4, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHT
        public /* synthetic */ Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, Long l, Continuation<? super Boolean> continuation) {
            return invoke(flowCollector, th, l.longValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(continuation);
            anonymousClass8.L$0 = flowCollector;
            anonymousClass8.J$0 = j;
            return anonymousClass8.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                long j2 = this.J$0;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
                this.J$0 = j2;
                this.label = 1;
                if (flowCollector.emit(numAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
                j = j2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                C56391yDq.AEQbTJ(obj);
            }
            return C56443yFo.KWHzl(j < 3);
        }
    }

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$startUpload$1$9, reason: invalid class name */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass9(Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass9) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("Monitor.OkQPL", "OkQPL reporting service has been started");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$startUpload$1$10, reason: invalid class name */
    public static final class AnonymousClass10 extends SuspendLambda implements yHO<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass10(Continuation<? super AnonymousClass10> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new AnonymousClass10(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("Monitor.OkQPL", "OkQPL reporting service has been completed");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$startUpload$1$11, reason: invalid class name */
    public static final class AnonymousClass11 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass11(Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(continuation);
            anonymousClass11.I$0 = ((Number) obj).intValue();
            return anonymousClass11;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((AnonymousClass11) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("Monitor.OkQPL", "OkQPL reporing service has reported " + this.I$0 + " qpl events");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
