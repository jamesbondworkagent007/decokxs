package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.exception.CannotFindSequenceForTopic;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.common.exceptions.NotSettledSessionException;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.storage.sequence.SessionStorageRepository;
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
public final class ExtendSessionUseCase implements ExtendSessionUseCaseInterface {
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    public ExtendSessionUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ExtendSessionUseCase$extend$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ String $topic;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$topic = str;
            this.$onFailure = function1;
            this.$onSuccess = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return ExtendSessionUseCase.this.new AnonymousClass2(this.$topic, this.$onFailure, this.$onSuccess, continuation);
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
                if (ExtendSessionUseCase.this.sessionStorageRepository.isSessionValid(new Topic(this.$topic))) {
                    SessionVO sessionWithoutMetadataByTopic = ExtendSessionUseCase.this.sessionStorageRepository.getSessionWithoutMetadataByTopic(new Topic(this.$topic));
                    if (!sessionWithoutMetadataByTopic.isAcknowledged()) {
                        ExtendSessionUseCase.this.logger.error("Sending session extend error: not acknowledged session on topic: " + this.$topic);
                        this.$onFailure.invoke(new NotSettledSessionException(MessagesKt.SESSION_IS_NOT_ACKNOWLEDGED_MESSAGE + this.$topic));
                        return Unit.INSTANCE;
                    }
                    long seconds = sessionWithoutMetadataByTopic.getExpiry().getSeconds() + Time.getWeekInSeconds();
                    ExtendSessionUseCase.this.sessionStorageRepository.extendSession(new Topic(this.$topic), seconds);
                    SignRpc.SessionExtend sessionExtend = new SignRpc.SessionExtend(0L, null, null, new SignParams.ExtendParams(seconds), 7, null);
                    IrnParams irnParams = new IrnParams(Tags.SESSION_EXTEND, new Ttl(Time.getDayInSeconds()), false, 4, null);
                    ExtendSessionUseCase.this.logger.log("Sending session extend on topic: " + this.$topic);
                    RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = ExtendSessionUseCase.this.jsonRpcInteractor;
                    Topic topic = new Topic(this.$topic);
                    final ExtendSessionUseCase extendSessionUseCase = ExtendSessionUseCase.this;
                    final String str = this.$topic;
                    final Function0<Unit> function0 = this.$onSuccess;
                    Function0<Unit> function02 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.ExtendSessionUseCase.extend.2.1
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
                            extendSessionUseCase.logger.log("Session extend sent successfully on topic: " + str);
                            function0.invoke();
                        }
                    };
                    final ExtendSessionUseCase extendSessionUseCase2 = ExtendSessionUseCase.this;
                    final String str2 = this.$topic;
                    final Function1<Throwable, Unit> function1 = this.$onFailure;
                    RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(relayJsonRpcInteractorInterface, topic, irnParams, sessionExtend, null, null, function02, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ExtendSessionUseCase.extend.2.2
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
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable th) {
                            Intrinsics.checkNotNullParameter(th, "");
                            extendSessionUseCase2.logger.error("Sending session extend error: " + th + " on topic: " + str2);
                            function1.invoke(th);
                        }
                    }, 24, null);
                    return Unit.INSTANCE;
                }
                this.$onFailure.invoke(new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + this.$topic));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.ExtendSessionUseCaseInterface
    public Object extend(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(str, function1, function0, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
