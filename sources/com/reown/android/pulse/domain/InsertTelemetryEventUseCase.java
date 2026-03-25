package com.reown.android.pulse.domain;

import com.reown.android.internal.common.storage.events.EventsRepository;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.util.Logger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class InsertTelemetryEventUseCase implements InsertEventUseCaseInterface {
    public final EventsRepository eventsRepository;
    public final Logger logger;

    public InsertTelemetryEventUseCase(@NotNull EventsRepository eventsRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(eventsRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.eventsRepository = eventsRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.android.pulse.domain.InsertTelemetryEventUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Props $props;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Props props, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$props = props;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return InsertTelemetryEventUseCase.this.new AnonymousClass2(this.$props, continuation);
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
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    EventsRepository eventsRepository = InsertTelemetryEventUseCase.this.eventsRepository;
                    Props props = this.$props;
                    this.label = 1;
                    if (eventsRepository.insertOrAbortTelemetry(props, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                InsertTelemetryEventUseCase.this.logger.error("Inserting event " + this.$props.getType() + " error: " + e);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.android.pulse.domain.InsertEventUseCaseInterface
    public Object invoke(@NotNull Props props, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(props, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
