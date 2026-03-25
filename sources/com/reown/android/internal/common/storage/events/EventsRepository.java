package com.reown.android.internal.common.storage.events;

import android.database.sqlite.SQLiteException;
import com.reown.android.pulse.model.Event;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.android.sdk.storage.data.dao.EventDao;
import com.reown.android.sdk.storage.data.dao.EventQueries;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AssistContent;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.Intent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class EventsRepository {
    public final String bundleId;
    public final CoroutineDispatcher dispatcher;
    public final EventQueries eventQueries;
    public final boolean telemetryEnabled;

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.events.EventsRepository$getAllEventsWithLimitAndOffset$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventsRepository.this.getAllEventsWithLimitAndOffset(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.events.EventsRepository$getAllNonTelemetryEventsWithLimitAndOffset$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17991 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17991(Continuation<? super C17991> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventsRepository.this.getAllNonTelemetryEventsWithLimitAndOffset(0, 0, this);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.reown.android.sdk.storage.data.dao.EventQueries)
  (r2v0 java.lang.String)
  (r3v0 boolean)
  (r4v0 kotlinx.coroutines.CoroutineDispatcher)
 A[MD:(com.reown.android.sdk.storage.data.dao.EventQueries, java.lang.String, boolean, kotlinx.coroutines.CoroutineDispatcher):void (m)] call: com.reown.android.internal.common.storage.events.EventsRepository.<init>(com.reown.android.sdk.storage.data.dao.EventQueries, java.lang.String, boolean, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EventsRepository(EventQueries eventQueries, String str, boolean z, CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventQueries, str, z, coroutineDispatcher);
    }

    public EventsRepository(EventQueries eventQueries, String str, boolean z, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(eventQueries, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.eventQueries = eventQueries;
        this.bundleId = str;
        this.telemetryEnabled = z;
        this.dispatcher = coroutineDispatcher;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r7v0 com.reown.android.sdk.storage.data.dao.EventQueries)
  (r8v0 java.lang.String)
  (r9v0 boolean)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:19)) : (r10v0 kotlinx.coroutines.CoroutineDispatcher))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.reown.android.sdk.storage.data.dao.EventQueries, java.lang.String, boolean, kotlinx.coroutines.CoroutineDispatcher, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:15) call: com.reown.android.internal.common.storage.events.EventsRepository.<init>(com.reown.android.sdk.storage.data.dao.EventQueries, java.lang.String, boolean, kotlinx.coroutines.CoroutineDispatcher, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ EventsRepository(EventQueries eventQueries, String str, boolean z, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventQueries, str, z, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher, null);
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.events.EventsRepository$insertOrAbortTelemetry$2, reason: invalid class name and case insensitive filesystem */
    public static final class C18012 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Props $props;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18012(Props props, Continuation<? super C18012> continuation) {
            super(2, continuation);
            this.$props = props;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return EventsRepository.this.new C18012(this.$props, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (EventsRepository.this.telemetryEnabled) {
                    EventsRepository eventsRepository = EventsRepository.this;
                    Props props = this.$props;
                    this.label = 1;
                    if (eventsRepository.insertOrAbort(props, this) == objCopydefault) {
                        return objCopydefault;
                    }
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

    public final Object insertOrAbortTelemetry(@NotNull Props props, @NotNull Continuation<? super Unit> continuation) throws SQLiteException {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new C18012(props, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.events.EventsRepository$insertOrAbort$2, reason: invalid class name and case insensitive filesystem */
    public static final class C18002 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Props $props;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18002(Props props, Continuation<? super C18002> continuation) {
            super(2, continuation);
            this.$props = props;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return EventsRepository.this.new C18002(this.$props, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18002) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Event event = new Event(0L, EventsRepository.this.bundleId, 0L, this.$props, 5, null);
                EventQueries eventQueries = EventsRepository.this.eventQueries;
                Long lKWHzl = C56443yFo.KWHzl(event.getEventId());
                String bundleId = event.getBundleId();
                long timestamp = event.getTimestamp();
                String event2 = event.getProps().getEvent();
                String type = event.getProps().getType();
                Properties properties = event.getProps().getProperties();
                String topic = properties != null ? properties.getTopic() : null;
                Properties properties2 = event.getProps().getProperties();
                List<String> trace = properties2 != null ? properties2.getTrace() : null;
                Properties properties3 = event.getProps().getProperties();
                Long correlationId = properties3 != null ? properties3.getCorrelationId() : null;
                Properties properties4 = event.getProps().getProperties();
                String clientId = properties4 != null ? properties4.getClientId() : null;
                Properties properties5 = event.getProps().getProperties();
                String direction = properties5 != null ? properties5.getDirection() : null;
                Properties properties6 = event.getProps().getProperties();
                eventQueries.insertOrAbort(lKWHzl, bundleId, timestamp, event2, type, topic, trace, correlationId, clientId, direction, properties6 != null ? properties6.getUserAgent() : null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object insertOrAbort(@NotNull Props props, @NotNull Continuation<? super Unit> continuation) throws SQLiteException {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new C18002(props, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAllEventsWithLimitAndOffset(int i, int i2, @NotNull Continuation<? super List<Event>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        EventsRepository eventsRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objEZpvd = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = anonymousClass1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            AssistContent<EventDao> allEventsWithLimitAndOffset = this.eventQueries.getAllEventsWithLimitAndOffset(i, i2);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objEZpvd = Intent.EZpvd(allEventsWithLimitAndOffset, anonymousClass1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            eventsRepository = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eventsRepository = (EventsRepository) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        Iterable iterable = (Iterable) objEZpvd;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(eventsRepository.toEvent((EventDao) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAllNonTelemetryEventsWithLimitAndOffset(int i, int i2, @NotNull Continuation<? super List<Event>> continuation) throws Throwable {
        C17991 c17991;
        EventsRepository eventsRepository;
        if (continuation instanceof C17991) {
            c17991 = (C17991) continuation;
            int i3 = c17991.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c17991.label = i3 - Integer.MIN_VALUE;
            } else {
                c17991 = new C17991(continuation);
            }
        }
        Object objEZpvd = c17991.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = c17991.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            AssistContent<EventDao> allEventsWithLimitAndOffset = this.eventQueries.getAllEventsWithLimitAndOffset(i, i2);
            c17991.L$0 = this;
            c17991.label = 1;
            objEZpvd = Intent.EZpvd(allEventsWithLimitAndOffset, c17991);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            eventsRepository = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eventsRepository = (EventsRepository) c17991.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objEZpvd) {
            if (((EventDao) obj).getCorrelation_id() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(eventsRepository.toEvent((EventDao) it.next()));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.events.EventsRepository$deleteAllTelemetry$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return EventsRepository.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                EventsRepository.this.eventQueries.deleteAllTelemetry();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object deleteAllTelemetry(@NotNull Continuation<? super Unit> continuation) throws SQLiteException {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new AnonymousClass2(null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.events.EventsRepository$deleteByIds$2, reason: invalid class name and case insensitive filesystem */
    public static final class C17982 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<Long> $eventIds;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17982(List<Long> list, Continuation<? super C17982> continuation) {
            super(2, continuation);
            this.$eventIds = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return EventsRepository.this.new C17982(this.$eventIds, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                EventsRepository.this.eventQueries.deleteByIds(this.$eventIds);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object deleteByIds(@NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation) throws SQLiteException {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new C17982(list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final Event toEvent(EventDao eventDao) {
        long event_id = eventDao.getEvent_id();
        String bundle_id = eventDao.getBundle_id();
        long timestamp = eventDao.getTimestamp();
        String event_name = eventDao.getEvent_name();
        String type = eventDao.getType();
        String topic = eventDao.getTopic();
        return new Event(event_id, bundle_id, timestamp, new Props(event_name, type, new Properties(null, null, null, null, null, null, eventDao.getTrace(), topic, eventDao.getCorrelation_id(), eventDao.getClient_id(), eventDao.getDirection(), eventDao.getUser_agent(), 63, null)));
    }
}
