package com.reown.sign.engine.use_case.calls;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.pulse.model.EventType;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.common.model.Topic;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ApproveSessionUseCase$approve$2$sessionSettle$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Topic $pairingTopic;
    public final /* synthetic */ List<String> $trace;
    public int label;
    public final /* synthetic */ ApproveSessionUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApproveSessionUseCase$approve$2$sessionSettle$4(ApproveSessionUseCase approveSessionUseCase, List<String> list, Topic topic, Continuation<? super ApproveSessionUseCase$approve$2$sessionSettle$4> continuation) {
        super(2, continuation);
        this.this$0 = approveSessionUseCase;
        this.$trace = list;
        this.$pairingTopic = topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new ApproveSessionUseCase$approve$2$sessionSettle$4(this.this$0, this.$trace, this.$pairingTopic, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ApproveSessionUseCase$approve$2$sessionSettle$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$sessionSettle$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Topic $pairingTopic;
        public final /* synthetic */ List<String> $trace;
        public int label;
        public final /* synthetic */ ApproveSessionUseCase this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ApproveSessionUseCase approveSessionUseCase, List<String> list, Topic topic, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = approveSessionUseCase;
            this.$trace = list;
            this.$pairingTopic = topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$trace, this.$pairingTopic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertEventUseCase;
                Props props = new Props(null, EventType.Error.NO_WSS_CONNECTION, new Properties(null, null, null, null, null, null, this.$trace, this.$pairingTopic.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                this.label = 1;
                if (insertTelemetryEventUseCase.invoke(props, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$trace, this.$pairingTopic, null);
            this.label = 1;
            if (SupervisorKt.supervisorScope(anonymousClass1, this) == objCopydefault) {
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
