package com.reown.android.pulse.domain;

import com.reown.android.internal.common.storage.events.EventsRepository;
import com.reown.android.pulse.data.PulseService;
import com.reown.android.pulse.model.Event;
import com.reown.android.pulse.model.SDKType;
import com.reown.foundation.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class SendBatchEventUseCase {
    public static final Companion Companion = new Companion(null);
    public static final int LIMIT = 500;
    public final EventsRepository eventsRepository;
    public final Logger logger;
    public final PulseService pulseService;
    public final boolean telemetryEnabled;

    /* JADX INFO: renamed from: com.reown.android.pulse.domain.SendBatchEventUseCase$sendEventsInBatches$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
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
            return SendBatchEventUseCase.this.sendEventsInBatches(null, this);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.reown.android.pulse.data.PulseService)
  (r2v0 com.reown.android.internal.common.storage.events.EventsRepository)
  (r3v0 boolean)
  (r4v0 com.reown.foundation.util.Logger)
 A[MD:(com.reown.android.pulse.data.PulseService, com.reown.android.internal.common.storage.events.EventsRepository, boolean, com.reown.foundation.util.Logger):void (m)] call: com.reown.android.pulse.domain.SendBatchEventUseCase.<init>(com.reown.android.pulse.data.PulseService, com.reown.android.internal.common.storage.events.EventsRepository, boolean, com.reown.foundation.util.Logger):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SendBatchEventUseCase(PulseService pulseService, EventsRepository eventsRepository, boolean z, Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(pulseService, eventsRepository, z, logger);
    }

    public SendBatchEventUseCase(PulseService pulseService, EventsRepository eventsRepository, boolean z, Logger logger) {
        Intrinsics.checkNotNullParameter(pulseService, "");
        Intrinsics.checkNotNullParameter(eventsRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.pulseService = pulseService;
        this.eventsRepository = eventsRepository;
        this.telemetryEnabled = z;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.android.pulse.domain.SendBatchEventUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SendBatchEventUseCase.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                SendBatchEventUseCase.this.logger.error("Failed to delete events, error: " + e);
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!SendBatchEventUseCase.this.telemetryEnabled) {
                    EventsRepository eventsRepository = SendBatchEventUseCase.this.eventsRepository;
                    this.label = 2;
                    if (eventsRepository.deleteAllTelemetry(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    SendBatchEventUseCase sendBatchEventUseCase = SendBatchEventUseCase.this;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(sendBatchEventUseCase, null);
                    this.label = 1;
                    if (sendBatchEventUseCase.sendEventsInBatches(anonymousClass1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        C56391yDq.AEQbTJ(obj);
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            SendBatchEventUseCase sendBatchEventUseCase2 = SendBatchEventUseCase.this;
            C07112 c07112 = new C07112(sendBatchEventUseCase2, null);
            this.label = 3;
            if (sendBatchEventUseCase2.sendEventsInBatches(c07112, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.android.pulse.domain.SendBatchEventUseCase$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super List<? extends Event>>, Object> {
            public int label;
            public final /* synthetic */ SendBatchEventUseCase this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SendBatchEventUseCase sendBatchEventUseCase, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = sendBatchEventUseCase;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends Event>> continuation) {
                return invoke2((Continuation<? super List<Event>>) continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super List<Event>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    EventsRepository eventsRepository = this.this$0.eventsRepository;
                    this.label = 1;
                    obj = eventsRepository.getAllEventsWithLimitAndOffset(500, 0, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return obj;
            }
        }

        /* JADX INFO: renamed from: com.reown.android.pulse.domain.SendBatchEventUseCase$invoke$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C07112 extends SuspendLambda implements Function1<Continuation<? super List<? extends Event>>, Object> {
            public int label;
            public final /* synthetic */ SendBatchEventUseCase this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07112(SendBatchEventUseCase sendBatchEventUseCase, Continuation<? super C07112> continuation) {
                super(1, continuation);
                this.this$0 = sendBatchEventUseCase;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new C07112(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends Event>> continuation) {
                return invoke2((Continuation<? super List<Event>>) continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super List<Event>> continuation) {
                return ((C07112) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    EventsRepository eventsRepository = this.this$0.eventsRepository;
                    this.label = 1;
                    obj = eventsRepository.getAllNonTelemetryEventsWithLimitAndOffset(500, 0, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return obj;
            }
        }
    }

    public final Object invoke(@NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX DEBUG: Duplicate block (B:54:0x014a) to fix multi-entry loop: BACK_EDGE: B:54:0x014a -> B:55:0x014b */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014b, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[Catch: Exception -> 0x012b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x012b, blocks: (B:14:0x0036, B:32:0x0090), top: B:58:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf A[Catch: Exception -> 0x0128, TryCatch #2 {Exception -> 0x0128, blocks: (B:36:0x00c7, B:38:0x00cf, B:39:0x00e0, B:41:0x00e6, B:42:0x00f8, B:46:0x010d), top: B:62:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d A[Catch: Exception -> 0x0128, TRY_LEAVE, TryCatch #2 {Exception -> 0x0128, blocks: (B:36:0x00c7, B:38:0x00cf, B:39:0x00e0, B:41:0x00e6, B:42:0x00f8, B:46:0x010d), top: B:62:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0109 -> B:25:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendEventsInBatches(Function1<? super Continuation<? super List<Event>>, ? extends Object> function1, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SendBatchEventUseCase sendBatchEventUseCase;
        Function1<? super Continuation<? super List<Event>>, ? extends Object> function12;
        int i;
        SendBatchEventUseCase sendBatchEventUseCase2;
        Function1<? super Continuation<? super List<Event>>, ? extends Object> function13;
        SendBatchEventUseCase sendBatchEventUseCase3;
        Function1<? super Continuation<? super List<Event>>, ? extends Object> function14;
        List<Event> list;
        List<Event> list2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            sendBatchEventUseCase = this;
            function12 = function1;
            i = 1;
            if (i != 0) {
            }
        } else if (i3 == 1) {
            i = anonymousClass1.I$0;
            function13 = (Function1) anonymousClass1.L$1;
            sendBatchEventUseCase2 = (SendBatchEventUseCase) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(obj);
            list2 = (List) obj;
            if (!list2.isEmpty()) {
            }
            i = 0;
            function12 = function13;
            sendBatchEventUseCase = sendBatchEventUseCase2;
            if (i != 0) {
            }
        } else if (i3 == 2) {
            i = anonymousClass1.I$0;
            List<Event> list3 = (List) anonymousClass1.L$2;
            function14 = (Function1) anonymousClass1.L$1;
            sendBatchEventUseCase3 = (SendBatchEventUseCase) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                list = list3;
                function13 = function14;
            } catch (Exception e) {
                e = e;
                sendBatchEventUseCase3.logger.error("Error sending batch events: " + e.getMessage());
                function13 = function14;
                sendBatchEventUseCase2 = sendBatchEventUseCase3;
                i = 0;
                function12 = function13;
                sendBatchEventUseCase = sendBatchEventUseCase2;
                if (i != 0) {
                }
            }
            if (!((Response) obj).isSuccessful()) {
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = anonymousClass1.I$0;
            function13 = (Function1) anonymousClass1.L$1;
            sendBatchEventUseCase2 = (SendBatchEventUseCase) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Exception e2) {
                e = e2;
                sendBatchEventUseCase3 = sendBatchEventUseCase2;
                function14 = function13;
                sendBatchEventUseCase3.logger.error("Error sending batch events: " + e.getMessage());
                function13 = function14;
                sendBatchEventUseCase2 = sendBatchEventUseCase3;
                i = 0;
            }
            function12 = function13;
            sendBatchEventUseCase = sendBatchEventUseCase2;
            if (i != 0) {
                anonymousClass1.L$0 = sendBatchEventUseCase;
                anonymousClass1.L$1 = function12;
                anonymousClass1.L$2 = null;
                anonymousClass1.I$0 = i;
                anonymousClass1.label = 1;
                Object objInvoke = function12.invoke(anonymousClass1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                SendBatchEventUseCase sendBatchEventUseCase4 = sendBatchEventUseCase;
                function13 = function12;
                obj = objInvoke;
                sendBatchEventUseCase2 = sendBatchEventUseCase4;
                list2 = (List) obj;
                if (!list2.isEmpty()) {
                    sendBatchEventUseCase2.logger.log("Sending batch events: " + list2.size());
                    PulseService pulseService = sendBatchEventUseCase2.pulseService;
                    String type = SDKType.EVENTS.getType();
                    anonymousClass1.L$0 = sendBatchEventUseCase2;
                    anonymousClass1.L$1 = function13;
                    anonymousClass1.L$2 = list2;
                    anonymousClass1.I$0 = i;
                    anonymousClass1.label = 2;
                    Object objSendEventBatch = pulseService.sendEventBatch(type, list2, anonymousClass1);
                    if (objSendEventBatch == objCopydefault) {
                        return objCopydefault;
                    }
                    SendBatchEventUseCase sendBatchEventUseCase5 = sendBatchEventUseCase2;
                    list = list2;
                    obj = objSendEventBatch;
                    sendBatchEventUseCase3 = sendBatchEventUseCase5;
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        sendBatchEventUseCase2 = sendBatchEventUseCase3;
                        sendBatchEventUseCase3 = sendBatchEventUseCase2;
                        function14 = function13;
                        sendBatchEventUseCase3.logger.error("Error sending batch events: " + e.getMessage());
                        function13 = function14;
                        sendBatchEventUseCase2 = sendBatchEventUseCase3;
                        i = 0;
                        function12 = function13;
                        sendBatchEventUseCase = sendBatchEventUseCase2;
                        if (i != 0) {
                        }
                    }
                    if (!((Response) obj).isSuccessful()) {
                        EventsRepository eventsRepository = sendBatchEventUseCase3.eventsRepository;
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C56443yFo.KWHzl(((Event) it.next()).getEventId()));
                        }
                        anonymousClass1.L$0 = sendBatchEventUseCase3;
                        anonymousClass1.L$1 = function13;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.I$0 = i;
                        anonymousClass1.label = 3;
                        if (eventsRepository.deleteByIds(arrayList, anonymousClass1) == objCopydefault) {
                            return objCopydefault;
                        }
                        function12 = function13;
                        sendBatchEventUseCase = sendBatchEventUseCase3;
                        if (i != 0) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        sendBatchEventUseCase3.logger.log("Failed to send events: " + list.size());
                        sendBatchEventUseCase2 = sendBatchEventUseCase3;
                    }
                }
                i = 0;
                function12 = function13;
                sendBatchEventUseCase = sendBatchEventUseCase2;
                if (i != 0) {
                }
            }
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.pulse.domain.SendBatchEventUseCase.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }
}
