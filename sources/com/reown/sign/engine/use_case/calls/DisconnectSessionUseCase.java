package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.exception.CannotFindSequenceForTopic;
import com.reown.android.internal.common.exception.Reason;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
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
public final class DisconnectSessionUseCase implements DisconnectSessionUseCaseInterface {
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    public DisconnectSessionUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.DisconnectSessionUseCase$disconnect$2, reason: invalid class name */
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
            return DisconnectSessionUseCase.this.new AnonymousClass2(this.$topic, this.$onFailure, this.$onSuccess, continuation);
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
                if (!DisconnectSessionUseCase.this.sessionStorageRepository.isSessionValid(new Topic(this.$topic))) {
                    DisconnectSessionUseCase.this.logger.error("Sending session disconnect error: invalid session " + this.$topic);
                    this.$onFailure.invoke(new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + this.$topic));
                    return Unit.INSTANCE;
                }
                Reason.UserDisconnected userDisconnected = Reason.UserDisconnected.INSTANCE;
                SignRpc.SessionDelete sessionDelete = new SignRpc.SessionDelete(0L, null, null, new SignParams.DeleteParams(userDisconnected.getCode(), userDisconnected.getMessage()), 7, null);
                IrnParams irnParams = new IrnParams(Tags.SESSION_DELETE, new Ttl(Time.getDayInSeconds()), false, 4, null);
                DisconnectSessionUseCase.this.logger.log("Sending session disconnect on topic: " + this.$topic);
                RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = DisconnectSessionUseCase.this.jsonRpcInteractor;
                Topic topic = new Topic(this.$topic);
                final DisconnectSessionUseCase disconnectSessionUseCase = DisconnectSessionUseCase.this;
                final String str = this.$topic;
                final Function0<Unit> function0 = this.$onSuccess;
                Function0<Unit> function02 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.DisconnectSessionUseCase.disconnect.2.1
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
                        disconnectSessionUseCase.logger.log("Disconnect sent successfully on topic: " + str);
                        disconnectSessionUseCase.sessionStorageRepository.deleteSession(new Topic(str));
                        RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(disconnectSessionUseCase.jsonRpcInteractor, new Topic(str), null, null, 6, null);
                        function0.invoke();
                    }
                };
                final DisconnectSessionUseCase disconnectSessionUseCase2 = DisconnectSessionUseCase.this;
                final String str2 = this.$topic;
                final Function1<Throwable, Unit> function1 = this.$onFailure;
                RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(relayJsonRpcInteractorInterface, topic, irnParams, sessionDelete, null, null, function02, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.DisconnectSessionUseCase.disconnect.2.2
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
                        disconnectSessionUseCase2.logger.error("Sending session disconnect error: " + th + " on topic: " + str2);
                        function1.invoke(th);
                    }
                }, 24, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.DisconnectSessionUseCaseInterface
    public Object disconnect(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(str, function1, function0, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
