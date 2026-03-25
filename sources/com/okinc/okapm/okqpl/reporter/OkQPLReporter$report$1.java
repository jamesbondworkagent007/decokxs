package com.okinc.okapm.okqpl.reporter;

import com.okinc.okapm.okqpl.QPLEvent;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C32935mmv;
import o.C32979mnm;
import o.C34703nhO;
import o.C42540rWq;
import o.C42549rWz;
import o.C43396roW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OkQPLReporter$report$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QPLEvent $qplEvent;
    int label;
    final /* synthetic */ OkQPLReporter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkQPLReporter$report$1(QPLEvent qPLEvent, OkQPLReporter okQPLReporter, Continuation<? super OkQPLReporter$report$1> continuation) {
        super(2, continuation);
        this.$qplEvent = qPLEvent;
        this.this$0 = okQPLReporter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkQPLReporter$report$1(this.$qplEvent, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OkQPLReporter$report$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements Flow<Boolean> {
        public final /* synthetic */ OkQPLReporter OLrzqt;
        public final /* synthetic */ Flow copydefault;

        public ActionBar(Flow flow, OkQPLReporter okQPLReporter) {
            this.copydefault = flow;
            this.OLrzqt = okQPLReporter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$report$1$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ OkQPLReporter OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, OkQPLReporter okQPLReporter) {
                this.EZpvd = flowCollector;
                this.OLrzqt = okQPLReporter;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                OkQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1 okQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1;
                if (continuation instanceof OkQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1) {
                    okQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1 = (OkQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = okQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        okQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        okQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1 = new OkQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = okQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = okQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    if (((Boolean) obj).booleanValue() && this.OLrzqt.valueOf) {
                        okQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, okQPLReporter$report$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String traceId = this.$qplEvent.getTraceId();
            String qplType = this.$qplEvent.getQplType();
            String qplMarker = this.$qplEvent.getQplMarker();
            String source = this.$qplEvent.getSource();
            long timestamp = this.$qplEvent.getTimestamp();
            Pair[] pairArr = new Pair[5];
            C32979mnm c32979mnm = C32979mnm.EZpvd;
            pairArr[0] = C56390yDp.OLrzqt("version", c32979mnm.EZpvd());
            pairArr[1] = C56390yDp.OLrzqt("versionCode", String.valueOf(C34703nhO.copydefault(c32979mnm.OLrzqt())));
            String strKWHzl = C42549rWz.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            pairArr[2] = C56390yDp.OLrzqt("flavor", strKWHzl);
            pairArr[3] = C56390yDp.OLrzqt("network", C43396roW.EZpvd().copydefault());
            String str = (String) C32935mmv.KWHzl.get("app_mode_realtime_okx");
            if (str == null) {
                str = "unknown";
            }
            pairArr[4] = C56390yDp.OLrzqt("app_mode", str);
            Map mapDjBIcL = C56424yEw.djBIcL(pairArr);
            Map<String, String> attributes = this.$qplEvent.getAttributes();
            if (attributes != null) {
                mapDjBIcL.putAll(attributes);
            }
            Unit unit = Unit.INSTANCE;
            C42540rWq c42540rWq = new C42540rWq(0, new QPLData(traceId, qplType, qplMarker, source, timestamp, mapDjBIcL));
            Flow flowRetryWhen = FlowKt.retryWhen(FlowKt.transformLatest(new ActionBar(this.this$0.OLrzqt(this.$qplEvent), this.this$0), new OkQPLReporter$report$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0, c42540rWq)), new AnonymousClass3(c42540rWq, null));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(c42540rWq, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowRetryWhen, anonymousClass4, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$report$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements yHT<FlowCollector<? super Long>, Throwable, Long, Continuation<? super Boolean>, Object> {
        final /* synthetic */ C42540rWq $entity;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C42540rWq c42540rWq, Continuation<? super AnonymousClass3> continuation) {
            super(4, continuation);
            this.$entity = c42540rWq;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHT
        public /* synthetic */ Object invoke(FlowCollector<? super Long> flowCollector, Throwable th, Long l, Continuation<? super Boolean> continuation) {
            return invoke(flowCollector, th, l.longValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(FlowCollector<? super Long> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$entity, continuation);
            anonymousClass3.L$0 = flowCollector;
            anonymousClass3.L$1 = th;
            anonymousClass3.J$0 = j;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j;
            long j2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                j = this.J$0;
                pUU.AEQbTJ("Monitor.OkQPL", "error while inserting record " + this.$entity + ", retrying to insert record", th);
                Long lKWHzl = C56443yFo.KWHzl(0L);
                this.L$0 = null;
                this.J$0 = j;
                this.label = 1;
                if (flowCollector.emit(lKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = this.J$0;
                    C56391yDq.AEQbTJ(obj);
                    return C56443yFo.KWHzl(j2 < 2);
                }
                j = this.J$0;
                C56391yDq.AEQbTJ(obj);
            }
            this.J$0 = j;
            this.label = 2;
            if (DelayKt.delay(10L, this) == objCopydefault) {
                return objCopydefault;
            }
            j2 = j;
            return C56443yFo.KWHzl(j2 < 2);
        }
    }

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$report$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        final /* synthetic */ C42540rWq $entity;
        /* synthetic */ long J$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C42540rWq c42540rWq, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$entity = c42540rWq;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$entity, continuation);
            anonymousClass4.J$0 = ((Number) obj).longValue();
            return anonymousClass4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(long j, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
            return invoke(l.longValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.J$0 > 0) {
                    pUU.KWHzl("Monitor.OkQPL", "Inserted record " + this.$entity);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
