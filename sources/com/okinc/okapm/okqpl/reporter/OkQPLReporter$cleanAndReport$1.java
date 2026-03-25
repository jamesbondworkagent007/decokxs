package com.okinc.okapm.okqpl.reporter;

import com.okinc.okapm.okqpl.QPLEvent;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.reporter.OkQPLReporter$cleanAndReport$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C32935mmv;
import o.C32979mnm;
import o.C34703nhO;
import o.C42530rWg;
import o.C42540rWq;
import o.C42549rWz;
import o.C43396roW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yHT;

/* JADX INFO: loaded from: classes10.dex */
public final class OkQPLReporter$cleanAndReport$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C42530rWg $lifecycleCost;
    final /* synthetic */ List<QPLEvent> $qplEvents;
    int label;
    final /* synthetic */ OkQPLReporter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkQPLReporter$cleanAndReport$1(List<QPLEvent> list, C42530rWg c42530rWg, OkQPLReporter okQPLReporter, Continuation<? super OkQPLReporter$cleanAndReport$1> continuation) {
        super(2, continuation);
        this.$qplEvents = list;
        this.$lifecycleCost = c42530rWg;
        this.this$0 = okQPLReporter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkQPLReporter$cleanAndReport$1(this.$qplEvents, this.$lifecycleCost, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OkQPLReporter$cleanAndReport$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24, types: [T, com.okinc.okapm.okqpl.QPLEvent, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StringBuilder sb = new StringBuilder();
            List<QPLEvent> list = this.$qplEvents;
            final Function2 function2 = new Function2() { // from class: o.rWl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return java.lang.Integer.valueOf(OkQPLReporter$cleanAndReport$1.invokeSuspend$lambda$0((QPLEvent) obj2, (QPLEvent) obj3));
                }
            };
            List<QPLEvent> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new Comparator() { // from class: o.rWk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                    return OkQPLReporter$cleanAndReport$1.invokeSuspend$lambda$1(function2, obj2, obj3);
                }
            });
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            int i2 = 0;
            while (i2 < listEZpvd.size()) {
                ?? r10 = (QPLEvent) listEZpvd.get(i2);
                if (Intrinsics.EZpvd((Object) r10.getQplMarker(), (Object) QPLMarker.PAUSE.getValue()) || Intrinsics.EZpvd((Object) r10.getQplMarker(), (Object) QPLMarker.DESTROYED.getValue())) {
                    break;
                }
                map.put(r10.getQplMarker(), r10);
                String qplMarker = r10.getQplMarker();
                QPLMarker qPLMarker = QPLMarker.RESUME;
                if (Intrinsics.EZpvd((Object) qplMarker, (Object) qPLMarker.getValue()) || Intrinsics.EZpvd((Object) r10.getQplMarker(), (Object) QPLMarker.PAGE_LOADED.getValue()) || Intrinsics.EZpvd((Object) r10.getQplMarker(), (Object) QPLMarker.LOADING_DISAPPEAR.getValue()) || Intrinsics.EZpvd((Object) r10.getQplMarker(), (Object) QPLMarker.PAGE_NOT_LOADED.getValue())) {
                    objectRef.element = r10;
                }
                if (Intrinsics.EZpvd((Object) r10.getQplMarker(), (Object) QPLMarker.START.getValue()) || Intrinsics.EZpvd((Object) r10.getQplMarker(), (Object) qPLMarker.getValue()) || Intrinsics.EZpvd((Object) r10.getQplMarker(), (Object) QPLMarker.LOADING_APPEAR.getValue())) {
                    map2.put(r10.getQplMarker(), C56443yFo.AEQbTJ(((Number) map2.getOrDefault(r10.getQplMarker(), C56443yFo.AEQbTJ(0))).intValue() + 1));
                }
                i2++;
            }
            if (objectRef.element == 0) {
                sb.append("qpl events does not have a valid expected end event \n");
                sb.append("******************************************************************* \n");
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                pUU.EZpvd("Monitor.OkQPL", string);
                return Unit.INSTANCE;
            }
            for (QPLEvent qPLEvent : listEZpvd) {
                if ((Intrinsics.EZpvd((Object) qPLEvent.getQplMarker(), (Object) QPLMarker.PAUSE.getValue()) || Intrinsics.EZpvd((Object) qPLEvent.getQplMarker(), (Object) QPLMarker.DESTROYED.getValue())) && qPLEvent.getTimestamp() < ((QPLEvent) objectRef.element).getTimestamp()) {
                    sb.append("qpl events has a lifecycle end event before valid expected end event \n");
                    sb.append("******************************************************************* \n");
                    String string2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    pUU.EZpvd("Monitor.OkQPL", string2);
                    return Unit.INSTANCE;
                }
            }
            QPLMarker qPLMarker2 = QPLMarker.START;
            if (map.get(qPLMarker2.getValue()) == null && map.get(QPLMarker.CREATE.getValue()) == null) {
                sb.append("qpl events has no lifecyle start/create event, dropping the qpl events \n");
                sb.append("******************************************************************* \n");
                String string3 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                pUU.EZpvd("Monitor.OkQPL", string3);
                return Unit.INSTANCE;
            }
            if (((Number) map2.getOrDefault(qPLMarker2.getValue(), C56443yFo.AEQbTJ(0))).intValue() <= 1) {
                QPLMarker qPLMarker3 = QPLMarker.RESUME;
                if (((Number) map2.getOrDefault(qPLMarker3.getValue(), C56443yFo.AEQbTJ(0))).intValue() <= 1) {
                    QPLMarker qPLMarker4 = QPLMarker.CREATE;
                    QPLEvent qPLEvent2 = (QPLEvent) map.get(qPLMarker4.getValue());
                    long timestamp = qPLEvent2 != null ? qPLEvent2.getTimestamp() : 0L;
                    QPLEvent qPLEvent3 = (QPLEvent) map.get(qPLMarker2.getValue());
                    long timestamp2 = qPLEvent3 != null ? qPLEvent3.getTimestamp() : 0L;
                    QPLEvent qPLEvent4 = (QPLEvent) map.get(qPLMarker3.getValue());
                    long timestamp3 = qPLEvent4 != null ? qPLEvent4.getTimestamp() : 0L;
                    QPLEvent qPLEvent5 = (QPLEvent) map.get(QPLMarker.LOADING_APPEAR.getValue());
                    boolean z = Math.abs(timestamp - timestamp2) > 3000;
                    boolean z2 = timestamp3 > 0 && Math.abs(timestamp2 - timestamp3) > 3000;
                    if (z) {
                        sb.append("qpl events has invalid create/start timestamps, data is not useful hence being dropped \n");
                        sb.append("******************************************************************* \n");
                        String string4 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string4, "");
                        pUU.EZpvd("Monitor.OkQPL", string4);
                        return Unit.INSTANCE;
                    }
                    if (z2) {
                        if (qPLEvent5 != null) {
                            if (qPLEvent5.getTimestamp() > timestamp2 && Math.abs(qPLEvent5.getTimestamp() - timestamp3) < 500 && this.this$0.OLrzqt(this.$lifecycleCost)) {
                                sb.append("----------- \n");
                                sb.append("detected invalid start time, adjusting as per actuals");
                                QPLEvent qPLEvent6 = (QPLEvent) map.get(qPLMarker4.getValue());
                                if (qPLEvent6 != null) {
                                    C42530rWg c42530rWg = this.$lifecycleCost;
                                    String value = qPLMarker4.getValue();
                                    String traceId = qPLEvent6.getTraceId();
                                    String qplType = qPLEvent6.getQplType();
                                    String qplMarker2 = qPLEvent6.getQplMarker();
                                    String source = qPLEvent6.getSource();
                                    long timestamp4 = qPLEvent5.getTimestamp();
                                    Intrinsics.copydefault(c42530rWg);
                                    map.put(value, new QPLEvent(traceId, qplType, qplMarker2, source, timestamp4 - ((c42530rWg.OLrzqt() + c42530rWg.EZpvd()) + c42530rWg.AEQbTJ()), null, 32, null));
                                }
                                QPLEvent qPLEvent7 = (QPLEvent) map.get(qPLMarker2.getValue());
                                if (qPLEvent7 != null) {
                                    C42530rWg c42530rWg2 = this.$lifecycleCost;
                                    String value2 = qPLMarker2.getValue();
                                    String traceId2 = qPLEvent7.getTraceId();
                                    String qplType2 = qPLEvent7.getQplType();
                                    String qplMarker3 = qPLEvent7.getQplMarker();
                                    String source2 = qPLEvent7.getSource();
                                    long timestamp5 = qPLEvent5.getTimestamp();
                                    Intrinsics.copydefault(c42530rWg2);
                                    map.put(value2, new QPLEvent(traceId2, qplType2, qplMarker3, source2, timestamp5 - c42530rWg2.OLrzqt(), null, 32, null));
                                }
                            } else {
                                sb.append("qpl events has invalid start/resume timestamps, data is not useful hence being dropped \n");
                                sb.append("******************************************************************* \n");
                                String string5 = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "");
                                pUU.EZpvd("Monitor.OkQPL", string5);
                                return Unit.INSTANCE;
                            }
                        } else {
                            sb.append("qpl events has invalid start/resume timestamps, data is not useful hence being dropped \n");
                            sb.append("******************************************************************* \n");
                            String string6 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(string6, "");
                            pUU.EZpvd("Monitor.OkQPL", string6);
                            return Unit.INSTANCE;
                        }
                    }
                    Collection collectionValues = map.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                    final Function2 function22 = new Function2() { // from class: o.rWp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return java.lang.Integer.valueOf(OkQPLReporter$cleanAndReport$1.invokeSuspend$lambda$6((QPLEvent) obj2, (QPLEvent) obj3));
                        }
                    };
                    List<QPLEvent> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) CollectionsKt___CollectionsKt.EZpvd(collectionValues, new Comparator() { // from class: o.rWo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.util.Comparator
                        public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                            return OkQPLReporter$cleanAndReport$1.invokeSuspend$lambda$7(function22, obj2, obj3);
                        }
                    }));
                    while (i2 < listEZpvd.size()) {
                        listFJNWhG.add(listEZpvd.get(i2));
                        i2++;
                    }
                    sb.append("******************************************************************* \n");
                    String string7 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    pUU.EZpvd("Monitor.OkQPL", string7);
                    ArrayList arrayList = new ArrayList();
                    for (QPLEvent qPLEvent8 : listFJNWhG) {
                        String traceId3 = qPLEvent8.getTraceId();
                        String qplType3 = qPLEvent8.getQplType();
                        String qplMarker4 = qPLEvent8.getQplMarker();
                        String source3 = qPLEvent8.getSource();
                        long timestamp6 = qPLEvent8.getTimestamp();
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
                        Map<String, String> attributes = qPLEvent8.getAttributes();
                        if (attributes != null) {
                            mapDjBIcL.putAll(attributes);
                        }
                        Unit unit = Unit.INSTANCE;
                        arrayList.add(new C42540rWq(0, new QPLData(traceId3, qplType3, qplMarker4, source3, timestamp6, mapDjBIcL)));
                    }
                    Flow flowRetryWhen = FlowKt.retryWhen(this.this$0.gEmmrt.OLrzqt(arrayList), new AnonymousClass6(arrayList, null));
                    AnonymousClass7 anonymousClass7 = new AnonymousClass7(arrayList, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowRetryWhen, anonymousClass7, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            sb.append("qpl events has a more then one start, resume dropping the qpl events \n");
            sb.append("******************************************************************* \n");
            String string8 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string8, "");
            pUU.EZpvd("Monitor.OkQPL", string8);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$1(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(QPLEvent qPLEvent, QPLEvent qPLEvent2) {
        if (qPLEvent.getTimestamp() > qPLEvent2.getTimestamp()) {
            return 1;
        }
        return qPLEvent.getTimestamp() < qPLEvent2.getTimestamp() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$7(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$6(QPLEvent qPLEvent, QPLEvent qPLEvent2) {
        if (qPLEvent.getTimestamp() > qPLEvent2.getTimestamp()) {
            return 1;
        }
        return qPLEvent.getTimestamp() < qPLEvent2.getTimestamp() ? -1 : 0;
    }

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$cleanAndReport$1$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements yHT<FlowCollector<? super List<? extends Long>>, Throwable, Long, Continuation<? super Boolean>, Object> {
        final /* synthetic */ ArrayList<C42540rWq> $entities;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ArrayList<C42540rWq> arrayList, Continuation<? super AnonymousClass6> continuation) {
            super(4, continuation);
            this.$entities = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHT
        public /* synthetic */ Object invoke(FlowCollector<? super List<? extends Long>> flowCollector, Throwable th, Long l, Continuation<? super Boolean> continuation) {
            return invoke((FlowCollector<? super List<Long>>) flowCollector, th, l.longValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(FlowCollector<? super List<Long>> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$entities, continuation);
            anonymousClass6.L$0 = flowCollector;
            anonymousClass6.L$1 = th;
            anonymousClass6.J$0 = j;
            return anonymousClass6.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
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
                pUU.AEQbTJ("Monitor.OkQPL", "error while inserting " + this.$entities.size() + " records, retrying to insert records = " + this.$entities, th);
                List listEZpvd = C56402yEa.EZpvd(C56443yFo.KWHzl(0L));
                this.L$0 = null;
                this.J$0 = j;
                this.label = 1;
                if (flowCollector.emit(listEZpvd, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.okapm.okqpl.reporter.OkQPLReporter$cleanAndReport$1$7, reason: invalid class name */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<List<? extends Long>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<C42540rWq> $entities;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ArrayList<C42540rWq> arrayList, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$entities = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$entities, continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends Long> list, Continuation<? super Unit> continuation) {
            return invoke2((List<Long>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<Long> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!((List) this.L$0).isEmpty()) {
                    pUU.KWHzl("Monitor.OkQPL", "Inserted " + this.$entities.size() + " records =  " + this.$entities);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
