package com.reown.sign.engine.use_case.responses;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.model.Direction;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.json_rpc.domain.GetSessionRequestByIdUseCase;
import kotlin.NoWhenBranchMatchedException;
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
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnSessionRequestResponseUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final String clientId;
    public final SharedFlow<EngineEvent> events;
    public final GetSessionRequestByIdUseCase getSessionRequestByIdUseCase;
    public final InsertEventUseCase insertEventUseCase;
    public final Logger logger;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionRequestResponseUseCase(@NotNull Logger logger, @NotNull InsertEventUseCase insertEventUseCase, @NotNull GetSessionRequestByIdUseCase getSessionRequestByIdUseCase, @NotNull String str) {
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(getSessionRequestByIdUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.logger = logger;
        this.insertEventUseCase = insertEventUseCase;
        this.getSessionRequestByIdUseCase = getSessionRequestByIdUseCase;
        this.clientId = str;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionRequestResponseUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.SessionRequestParams $params;
        public final /* synthetic */ WCResponse $wcResponse;
        public Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCResponse wCResponse, SignParams.SessionRequestParams sessionRequestParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$wcResponse = wCResponse;
            this.$params = sessionRequestParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionRequestResponseUseCase.this.new AnonymousClass2(this.$wcResponse, this.$params, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            EngineDO.JsonRpcResponse engineDO;
            EngineDO.JsonRpcResponse jsonRpcResponse;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                OnSessionRequestResponseUseCase.this.logger.error("Session request response received failure: " + e);
                MutableSharedFlow mutableSharedFlow = OnSessionRequestResponseUseCase.this._events;
                SDKError sDKError = new SDKError(e);
                this.L$0 = null;
                this.label = 3;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Request<SignParams.SessionRequestParams> requestInvoke = OnSessionRequestResponseUseCase.this.getSessionRequestByIdUseCase.invoke(this.$wcResponse.getResponse().getId());
                OnSessionRequestResponseUseCase.this.logger.log("Session request response received on topic: " + this.$wcResponse.getTopic());
                JsonRpcResponse response = this.$wcResponse.getResponse();
                if (response instanceof JsonRpcResponse.JsonRpcResult) {
                    JsonRpcResponse response2 = this.$wcResponse.getResponse();
                    Intrinsics.copydefault(response2, "");
                    engineDO = EngineMapperKt.toEngineDO((JsonRpcResponse.JsonRpcResult) response2);
                } else {
                    if (!(response instanceof JsonRpcResponse.JsonRpcError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    JsonRpcResponse response3 = this.$wcResponse.getResponse();
                    Intrinsics.copydefault(response3, "");
                    engineDO = EngineMapperKt.toEngineDO((JsonRpcResponse.JsonRpcError) response3);
                }
                if ((requestInvoke != null ? requestInvoke.getTransportType() : null) == TransportType.LINK_MODE) {
                    InsertEventUseCase insertEventUseCase = OnSessionRequestResponseUseCase.this.insertEventUseCase;
                    Props props = new Props("SUCCESS", String.valueOf(Tags.SESSION_REQUEST_LINK_MODE_RESPONSE.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(this.$wcResponse.getResponse().getId()), OnSessionRequestResponseUseCase.this.clientId, Direction.RECEIVED.getState(), null, 2303, null));
                    this.L$0 = engineDO;
                    this.label = 1;
                    if (insertEventUseCase.invoke(props, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                jsonRpcResponse = engineDO;
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                jsonRpcResponse = (EngineDO.JsonRpcResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            String method = this.$params.getRequest().getMethod();
            OnSessionRequestResponseUseCase.this.logger.log("Session request response received on topic: " + this.$wcResponse.getTopic() + " - emitting: " + jsonRpcResponse);
            MutableSharedFlow mutableSharedFlow2 = OnSessionRequestResponseUseCase.this._events;
            EngineDO.SessionPayloadResponse sessionPayloadResponse = new EngineDO.SessionPayloadResponse(this.$wcResponse.getTopic().getValue(), this.$params.getChainId(), method, jsonRpcResponse);
            this.L$0 = null;
            this.label = 2;
            if (mutableSharedFlow2.emit(sessionPayloadResponse, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invoke(@NotNull WCResponse wCResponse, @NotNull SignParams.SessionRequestParams sessionRequestParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCResponse, sessionRequestParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
