package com.reown.sign.engine.use_case.requests;

import com.reown.android.internal.common.exception.Uncategorized;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnSessionExtendUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final SharedFlow<EngineEvent> events;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionExtendUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionExtendUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ WCRequest $request;
        public final /* synthetic */ SignParams.ExtendParams $requestParams;
        public Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCRequest wCRequest, SignParams.ExtendParams extendParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = wCRequest;
            this.$requestParams = extendParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionExtendUseCase.this.new AnonymousClass2(this.$request, this.$requestParams, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0029 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x015b */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x019b */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0217 A[RETURN] */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3, types: [com.reown.android.internal.common.model.IrnParams, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.reown.android.internal.common.model.IrnParams] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v4 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ?? r9;
            MutableSharedFlow mutableSharedFlow;
            SDKError sDKError;
            ?? r3;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            ?? r4 = 1;
            try {
            } catch (Exception e) {
                e = e;
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ?? irnParams = new IrnParams(Tags.SESSION_EXTEND_RESPONSE, new Ttl(Time.getDayInSeconds()), false, 4, null);
                OnSessionExtendUseCase.this.logger.log("Session extend received on topic: " + this.$request.getTopic());
                try {
                    if (!OnSessionExtendUseCase.this.sessionStorageRepository.isSessionValid(this.$request.getTopic())) {
                        try {
                            OnSessionExtendUseCase.this.logger.error("Session extend received failure on topic: " + this.$request.getTopic());
                            RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = OnSessionExtendUseCase.this.jsonRpcInteractor;
                            WCRequest wCRequest = this.$request;
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface, wCRequest, new Uncategorized.NoMatchingTopic("SESSION", wCRequest.getTopic().getValue()), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        } catch (Exception e2) {
                            e = e2;
                            r4 = irnParams;
                            irnParams = r4;
                            r9 = irnParams;
                            OnSessionExtendUseCase.this.logger.error("Session extend received failure on topic: " + this.$request.getTopic() + ": " + e);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionExtendUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot update a session: " + e.getMessage() + ", topic: " + this.$request.getTopic()), r9, null, null, null, null, 120, null);
                            mutableSharedFlow = OnSessionExtendUseCase.this._events;
                            sDKError = new SDKError(e);
                            this.L$0 = null;
                            this.label = 2;
                            if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    SessionVO sessionWithoutMetadataByTopic = OnSessionExtendUseCase.this.sessionStorageRepository.getSessionWithoutMetadataByTopic(this.$request.getTopic());
                    long expiry = this.$requestParams.getExpiry();
                    SignValidator signValidator = SignValidator.INSTANCE;
                    long seconds = sessionWithoutMetadataByTopic.getExpiry().getSeconds();
                    OnSessionExtendUseCase onSessionExtendUseCase = OnSessionExtendUseCase.this;
                    WCRequest wCRequest2 = this.$request;
                    long weekInSeconds = Time.getWeekInSeconds();
                    if (expiry > seconds && expiry - seconds <= weekInSeconds) {
                        try {
                            OnSessionExtendUseCase.this.sessionStorageRepository.extendSession(this.$request.getTopic(), expiry);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithSuccess$default(OnSessionExtendUseCase.this.jsonRpcInteractor, this.$request, irnParams, null, null, 12, null);
                            OnSessionExtendUseCase.this.logger.log("Session extend received on topic: " + this.$request.getTopic() + " - emitting");
                            MutableSharedFlow mutableSharedFlow2 = OnSessionExtendUseCase.this._events;
                            EngineDO.SessionExtend engineDOSessionExtend = EngineMapperKt.toEngineDOSessionExtend(sessionWithoutMetadataByTopic, new Expiry(expiry));
                            this.L$0 = irnParams;
                            this.label = 1;
                            if (mutableSharedFlow2.emit(engineDOSessionExtend, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            r9 = irnParams;
                            OnSessionExtendUseCase.this.logger.error("Session extend received failure on topic: " + this.$request.getTopic() + ": " + e);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionExtendUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot update a session: " + e.getMessage() + ", topic: " + this.$request.getTopic()), r9, null, null, null, null, 120, null);
                            mutableSharedFlow = OnSessionExtendUseCase.this._events;
                            sDKError = new SDKError(e);
                            this.L$0 = null;
                            this.label = 2;
                            if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        ValidationError.InvalidExtendRequest invalidExtendRequest = ValidationError.InvalidExtendRequest.INSTANCE;
                        onSessionExtendUseCase.logger.error("Session extend received failure on topic: " + wCRequest2.getTopic() + " - invalid request: " + invalidExtendRequest);
                        r3 = irnParams;
                        try {
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionExtendUseCase.jsonRpcInteractor, wCRequest2, EngineMapperKt.toPeerError(invalidExtendRequest), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        } catch (Exception e4) {
                            e = e4;
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    r3 = irnParams;
                }
                r9 = r3;
                OnSessionExtendUseCase.this.logger.error("Session extend received failure on topic: " + this.$request.getTopic() + ": " + e);
                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionExtendUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot update a session: " + e.getMessage() + ", topic: " + this.$request.getTopic()), r9, null, null, null, null, 120, null);
                mutableSharedFlow = OnSessionExtendUseCase.this._events;
                sDKError = new SDKError(e);
                this.L$0 = null;
                this.label = 2;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
    }

    public final Object invoke(@NotNull WCRequest wCRequest, @NotNull SignParams.ExtendParams extendParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCRequest, extendParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
