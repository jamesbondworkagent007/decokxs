package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.exception.CannotFindSequenceForTopic;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.InvalidEventException;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.common.exceptions.UnauthorizedEventException;
import com.reown.sign.common.exceptions.UnauthorizedPeerException;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionEventVO;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import com.reown.util.UtilFunctionsKt;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class EmitEventUseCase implements EmitEventUseCaseInterface {
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    public EmitEventUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.EmitEventUseCase$emit$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ EngineDO.Event $event;
        public final /* synthetic */ Long $id;
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ String $topic;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, EngineDO.Event event, Long l, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$topic = str;
            this.$event = event;
            this.$id = l;
            this.$onSuccess = function0;
            this.$onFailure = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = EmitEventUseCase.this.new AnonymousClass2(this.$topic, this.$event, this.$id, this.$onSuccess, this.$onFailure, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM7377constructorimpl;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                EmitEventUseCase emitEventUseCase = EmitEventUseCase.this;
                String str = this.$topic;
                EngineDO.Event event = this.$event;
                try {
                    Result.Application application = Result.Companion;
                    emitEventUseCase.validate(str, event);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                EngineDO.Event event2 = this.$event;
                Long l = this.$id;
                final EmitEventUseCase emitEventUseCase2 = EmitEventUseCase.this;
                final String str2 = this.$topic;
                final Function0<Unit> function0 = this.$onSuccess;
                final Function1<Throwable, Unit> function1 = this.$onFailure;
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    emitEventUseCase2.logger.error("Sending event error: " + thM7380exceptionOrNullimpl + ", on topic: " + str2);
                    function1.invoke(thM7380exceptionOrNullimpl);
                } else {
                    SignRpc.SessionEvent sessionEvent = new SignRpc.SessionEvent(l != null ? l.longValue() : UtilFunctionsKt.generateId(), null, null, new SignParams.EventParams(new SessionEventVO(event2.getName(), event2.getData()), event2.getChainId()), 6, null);
                    IrnParams irnParams = new IrnParams(Tags.SESSION_EVENT, new Ttl(Time.getFiveMinutesInSeconds()), true);
                    emitEventUseCase2.logger.log("Emitting event on topic: " + str2);
                    RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(emitEventUseCase2.jsonRpcInteractor, new Topic(str2), irnParams, sessionEvent, null, null, new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.EmitEventUseCase$emit$2$2$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            emitEventUseCase2.logger.log("Event sent successfully, on topic: " + str2);
                            function0.invoke();
                        }
                    }, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.EmitEventUseCase$emit$2$2$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                            invoke2(th2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable th2) {
                            Intrinsics.checkNotNullParameter(th2, "");
                            emitEventUseCase2.logger.error("Sending event error: " + th2 + ", on topic: " + str2);
                            function1.invoke(th2);
                        }
                    }, 24, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.EmitEventUseCaseInterface
    public Object emit(@NotNull String str, @NotNull EngineDO.Event event, Long l, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(str, event, l, function0, function1, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    public final void validate(String str, EngineDO.Event event) throws UnauthorizedPeerException, CannotFindSequenceForTopic, UnauthorizedEventException, InvalidEventException {
        if (!this.sessionStorageRepository.isSessionValid(new Topic(str))) {
            this.logger.error("Emit - cannot find sequence for topic: " + str);
            throw new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + str);
        }
        SessionVO sessionWithoutMetadataByTopic = this.sessionStorageRepository.getSessionWithoutMetadataByTopic(new Topic(str));
        if (!sessionWithoutMetadataByTopic.isSelfController()) {
            this.logger.error("Emit - unauthorized peer: " + str);
            throw new UnauthorizedPeerException(MessagesKt.UNAUTHORIZED_EMIT_MESSAGE);
        }
        SignValidator signValidator = SignValidator.INSTANCE;
        if (event.getData().length() != 0 && event.getName().length() != 0 && event.getChainId().length() != 0 && CoreValidator.INSTANCE.isChainIdCAIP2Compliant(event.getChainId())) {
            Map<String, Namespace.Session> sessionNamespaces = sessionWithoutMetadataByTopic.getSessionNamespaces();
            String chainId = event.getChainId();
            String name = event.getName();
            Map mapAllEventsWithChains = signValidator.allEventsWithChains(sessionNamespaces);
            if (mapAllEventsWithChains.get(name) != null) {
                Object obj = mapAllEventsWithChains.get(name);
                Intrinsics.copydefault(obj);
                if (((List) obj).contains(chainId)) {
                    return;
                }
            }
            ValidationError.UnauthorizedEvent unauthorizedEvent = ValidationError.UnauthorizedEvent.INSTANCE;
            this.logger.error("Emit - unauthorized event: " + str);
            throw new UnauthorizedEventException(unauthorizedEvent.getMessage());
        }
        ValidationError.InvalidEvent invalidEvent = ValidationError.InvalidEvent.INSTANCE;
        this.logger.error("Emit - invalid event: " + str);
        throw new InvalidEventException(invalidEvent.getMessage());
    }
}
