package com.reown.android.pairing.engine.domain;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.reown.android.Core;
import com.reown.android.internal.MessagesKt;
import com.reown.android.internal.Validator;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.exception.CannotFindSequenceForTopic;
import com.reown.android.internal.common.exception.ExpiredPairingException;
import com.reown.android.internal.common.exception.ExpiredPairingURIException;
import com.reown.android.internal.common.exception.Invalid;
import com.reown.android.internal.common.exception.MalformedWalletConnectUri;
import com.reown.android.internal.common.exception.NoInternetConnectionException;
import com.reown.android.internal.common.exception.NoRelayConnectionException;
import com.reown.android.internal.common.exception.Uncategorized;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.SymmetricKey;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.WalletConnectUri;
import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.android.pairing.engine.model.EngineDO;
import com.reown.android.pairing.model.Expiration;
import com.reown.android.pairing.model.PairingJsonRpcMethod;
import com.reown.android.pairing.model.PairingParams;
import com.reown.android.pairing.model.PairingRpc;
import com.reown.android.pairing.model.mapper.PairingMapperKt;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.pulse.domain.SendBatchEventUseCase;
import com.reown.android.pulse.model.EventType;
import com.reown.android.pulse.model.Trace;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.util.UtilFunctionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56406yEe;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC56387yDm;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PairingEngine {
    public static final Companion Companion = new Companion(null);
    public static final long WATCHER_INTERVAL = 30000;
    public final MutableSharedFlow<Unit> _checkVerifyKeyFlow;
    public final MutableSharedFlow<EngineDO> _engineEvent;
    public final MutableStateFlow<Boolean> _isPairingStateFlow;
    public final MutableSharedFlow<Pair<Topic, List<String>>> _storedPairingTopicFlow;
    public final SharedFlow<Unit> checkVerifyKeyFlow;
    public final String clientId;
    public final KeyManagementRepository crypto;
    public final SharedFlow<EngineDO> engineEvent;
    public final InsertEventUseCase insertEventUseCase;
    public final InsertTelemetryEventUseCase insertTelemetryEventUseCase;
    public final MutableSharedFlow<SDKError> internalErrorFlow;
    public final InterfaceC56387yDm jsonRpcErrorFlow$delegate;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public Job jsonRpcRequestsJob;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataRepository;
    public final PairingStorageRepositoryInterface pairingRepository;
    public final AppMetaData selfMetaData;
    public final SendBatchEventUseCase sendBatchEventUseCase;
    public final Set<String> setOfRegisteredMethods;
    public final SharedFlow<Pair<Topic, List<String>>> storedPairingTopicFlow;
    public final String userAgent;

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$onPairingDelete$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18221 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18221(Continuation<? super C18221> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairingEngine.this.onPairingDelete(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$sendBatchSubscribeForPairings$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18301 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18301(Continuation<? super C18301> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairingEngine.this.sendBatchSubscribeForPairings(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> getCheckVerifyKeyFlow() {
        return this.checkVerifyKeyFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineDO> getEngineEvent() {
        return this.engineEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<SDKError> getInternalErrorFlow() {
        return this.internalErrorFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<Topic, List<String>>> getStoredPairingTopicFlow() {
        return this.storedPairingTopicFlow;
    }

    public PairingEngine(@NotNull Logger logger, @NotNull AppMetaData appMetaData, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull KeyManagementRepository keyManagementRepository, @NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull PairingStorageRepositoryInterface pairingStorageRepositoryInterface, @NotNull InsertTelemetryEventUseCase insertTelemetryEventUseCase, @NotNull InsertEventUseCase insertEventUseCase, @NotNull SendBatchEventUseCase sendBatchEventUseCase, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(pairingStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(insertTelemetryEventUseCase, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(sendBatchEventUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.logger = logger;
        this.selfMetaData = appMetaData;
        this.metadataRepository = metadataStorageRepositoryInterface;
        this.crypto = keyManagementRepository;
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.pairingRepository = pairingStorageRepositoryInterface;
        this.insertTelemetryEventUseCase = insertTelemetryEventUseCase;
        this.insertEventUseCase = insertEventUseCase;
        this.sendBatchEventUseCase = sendBatchEventUseCase;
        this.clientId = str;
        this.userAgent = str2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.setOfRegisteredMethods = linkedHashSet;
        final MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._isPairingStateFlow = MutableStateFlow;
        MutableSharedFlow<Pair<Topic, List<String>>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._storedPairingTopicFlow = mutableSharedFlowMutableSharedFlow$default;
        this.storedPairingTopicFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.internalErrorFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._checkVerifyKeyFlow = mutableSharedFlowMutableSharedFlow$default2;
        CoroutineScope scope = WalletConnectScopeKt.getScope();
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.checkVerifyKeyFlow = FlowKt.shareIn(mutableSharedFlowMutableSharedFlow$default2, scope, companion.getLazily(), 1);
        MutableSharedFlow<EngineDO> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._engineEvent = mutableSharedFlowMutableSharedFlow$default3;
        this.engineEvent = FlowKt.shareIn(FlowKt.merge(mutableSharedFlowMutableSharedFlow$default3, new Flow<EngineDO.PairingState>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine$special$$inlined$map$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super EngineDO.PairingState> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = MutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        EngineDO.PairingState pairingState = new EngineDO.PairingState(((Boolean) obj).booleanValue());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(pairingState, anonymousClass1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }), WalletConnectScopeKt.getScope(), companion.getLazily(), 0);
        linkedHashSet.addAll(yDY.gEmmrt(PairingJsonRpcMethod.WC_PAIRING_DELETE, PairingJsonRpcMethod.WC_PAIRING_PING));
        resubscribeToPairingTopics();
        pairingsExpiryWatcher();
        isPairingStateWatcher();
        sendEvents();
        this.jsonRpcErrorFlow$delegate = C56392yDr.copydefault(new Function0<Flow<? extends SDKError>>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX DEBUG: Return type fixed from 'kotlinx.coroutines.flow.Flow<com.reown.android.internal.common.model.SDKError>' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final Flow<? extends SDKError> invoke() {
                final SharedFlow<WCRequest> clientSyncJsonRpc = this.this$0.jsonRpcInteractor.getClientSyncJsonRpc();
                final PairingEngine pairingEngine = this.this$0;
                final Flow flowOnEach = FlowKt.onEach(new Flow<WCRequest>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(@NotNull FlowCollector<? super WCRequest> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = clientSyncJsonRpc.collect(new AnonymousClass2(flowCollector, pairingEngine), continuation);
                        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector $this_unsafeFlow;
                        public final /* synthetic */ PairingEngine this$0;

                        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            public Object L$0;
                            public Object L$1;
                            public int label;
                            public /* synthetic */ Object result;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public AnonymousClass2(FlowCollector flowCollector, PairingEngine pairingEngine) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = pairingEngine;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objCopydefault = C56442yFn.copydefault();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                C56391yDq.AEQbTJ(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (!this.this$0.setOfRegisteredMethods.contains(((WCRequest) obj).getMethod())) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C56391yDq.AEQbTJ(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, new AnonymousClass2(this.this$0, null));
                return new Flow<SDKError>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(@NotNull FlowCollector<? super SDKError> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowOnEach.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            public Object L$0;
                            public int label;
                            public /* synthetic */ Object result;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objCopydefault = C56442yFn.copydefault();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                C56391yDq.AEQbTJ(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                SDKError sDKError = new SDKError(new Exception(new Invalid.MethodUnsupported(((WCRequest) obj).getMethod()).getMessage()));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(sDKError, anonymousClass1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C56391yDq.AEQbTJ(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }

            /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<WCRequest, Continuation<? super Unit>, Object> {
                public /* synthetic */ Object L$0;
                public int label;
                public final /* synthetic */ PairingEngine this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PairingEngine pairingEngine, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = pairingEngine;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull WCRequest wCRequest, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(wCRequest, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        WCRequest wCRequest = (WCRequest) this.L$0;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(this.this$0.jsonRpcInteractor, wCRequest, new Invalid.MethodUnsupported(wCRequest.getMethod()), new IrnParams(Tags.UNSUPPORTED_METHOD, new Ttl(Time.getDayInSeconds()), false, 4, null), null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        });
    }

    public final Flow<SDKError> getJsonRpcErrorFlow() {
        return (Flow) this.jsonRpcErrorFlow$delegate.getValue();
    }

    public static /* synthetic */ Core.Model.Pairing create$default(PairingEngine pairingEngine, Function1 function1, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return pairingEngine.create(function1, str);
    }

    public final Core.Model.Pairing create(@NotNull Function1<? super Throwable, Unit> function1, String str) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(function1, "");
        final Topic topicGenerateTopic = generateTopic();
        Pairing pairing = new Pairing(topicGenerateTopic, new RelayProtocolOptions(null, null, 3, null), this.crypto.mo7180generateAndStoreSymmetricKeyp84wnz8(topicGenerateTopic), new Expiry(Expiration.getPairingExpiry()), str, null);
        try {
            Result.Application application = Result.Companion;
            this.logger.log("Creating Pairing");
            this.pairingRepository.insertPairing(pairing);
            this.metadataRepository.upsertPeerMetadata(pairing.getTopic(), this.selfMetaData, AppMetaDataType.SELF);
            this.jsonRpcInteractor.subscribe(pairing.getTopic(), new Function1<Topic, Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine$create$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Topic topic) {
                    invoke2(topic);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Topic topic) {
                    Intrinsics.checkNotNullParameter(topic, "");
                    this.this$0.logger.log("Pairing - subscribed on pairing topic: " + topicGenerateTopic);
                }
            }, new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine$create$1$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    this.this$0.logger.error("Pairing - subscribed failure on pairing topic: " + topicGenerateTopic + ", error: " + th);
                }
            });
            objM7377constructorimpl = Result.m7377constructorimpl(PairingMapperKt.toCore(pairing));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            try {
                this.crypto.removeKeys(topicGenerateTopic.getValue());
                this.pairingRepository.deletePairing(topicGenerateTopic);
                this.metadataRepository.deleteMetaData(topicGenerateTopic);
                RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(this.jsonRpcInteractor, topicGenerateTopic, null, null, 6, null);
                this.logger.error("Pairing - subscribed failure on pairing topic: " + topicGenerateTopic + ", error: " + thM7380exceptionOrNullimpl);
                function1.invoke(thM7380exceptionOrNullimpl);
            } catch (Exception e) {
                this.logger.error("Pairing - subscribed failure on pairing topic: " + topicGenerateTopic + ", error: " + e);
                function1.invoke(e);
            }
        }
        return (Core.Model.Pairing) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18241(Continuation<? super C18241> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new C18241(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow = PairingEngine.this._checkVerifyKeyFlow;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
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

    public final void pair(@NotNull String str, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Throwable, Unit> function1) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C18241(null), 3, null);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(Trace.Pairing.PAIRING_STARTED);
        this.logger.log("Pairing started");
        WalletConnectUri walletConnectUriValidateWCUri$android_release = Validator.INSTANCE.validateWCUri$android_release(str);
        if (walletConnectUriValidateWCUri$android_release == null) {
            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new PairingEngine$pair$walletConnectUri$1$1(this, arrayList, null), 3, null);
            function1.invoke(new MalformedWalletConnectUri(MessagesKt.MALFORMED_PAIRING_URI_MESSAGE));
            return;
        }
        arrayList.add(Trace.Pairing.PAIRING_URI_VALIDATION_SUCCESS);
        Pairing pairing = new Pairing(walletConnectUriValidateWCUri$android_release);
        final Topic topic = pairing.getTopic();
        String strM7256getSymKeyC2wS6ak = walletConnectUriValidateWCUri$android_release.m7256getSymKeyC2wS6ak();
        try {
            Expiry expiry = walletConnectUriValidateWCUri$android_release.getExpiry();
            if (expiry != null && CoreValidator.INSTANCE.isExpired(expiry)) {
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass3(arrayList, topic, null), 3, null);
                this.logger.error("Pairing URI expired: " + topic);
                function1.invoke(new ExpiredPairingURIException("Pairing URI expired: " + topic));
                return;
            }
            arrayList.add(Trace.Pairing.PAIRING_URI_NOT_EXPIRED);
            if (this.pairingRepository.getPairingOrNullByTopic(topic) != null) {
                Pairing pairingOrNullByTopic = this.pairingRepository.getPairingOrNullByTopic(topic);
                arrayList.add(Trace.Pairing.EXISTING_PAIRING);
                Intrinsics.copydefault(pairingOrNullByTopic);
                if (!isNotExpired(pairingOrNullByTopic)) {
                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass5(arrayList, topic, null), 3, null);
                    this.logger.error("Pairing expired: " + topic);
                    function1.invoke(new ExpiredPairingException("Pairing expired: " + topic.getValue()));
                    return;
                }
                arrayList.add(Trace.Pairing.PAIRING_NOT_EXPIRED);
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass7(arrayList, this, topic, null), 3, null);
            } else {
                this.crypto.setKey(SymmetricKey.m7238boximpl(strM7256getSymKeyC2wS6ak), topic.getValue());
                this.pairingRepository.insertPairing(pairing);
                arrayList.add(Trace.Pairing.STORE_NEW_PAIRING);
                this.logger.log("Storing a new pairing: " + topic);
            }
            arrayList.add(Trace.Pairing.SUBSCRIBING_PAIRING_TOPIC);
            this.logger.log("Subscribing pairing topic: " + topic);
            this.jsonRpcInteractor.subscribe(topic, new Function1<Topic, Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine.pair.10
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Topic topic2) {
                    invoke2(topic2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Topic topic2) {
                    Intrinsics.checkNotNullParameter(topic2, "");
                    arrayList.add(Trace.Pairing.SUBSCRIBE_PAIRING_TOPIC_SUCCESS);
                    PairingEngine pairingEngine = this;
                    Topic topic3 = topic;
                    pairingEngine.logger.log("Subscribe pairing topic success: " + topic3);
                    function0.invoke();
                }
            }, new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine.pair.11
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
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

                /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$11$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ Topic $pairingTopic;
                    public final /* synthetic */ List<String> $trace;
                    public int label;
                    public final /* synthetic */ PairingEngine this$0;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(PairingEngine pairingEngine, List<String> list, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = pairingEngine;
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

                    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$11$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C07071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ Topic $pairingTopic;
                        public final /* synthetic */ List<String> $trace;
                        public int label;
                        public final /* synthetic */ PairingEngine this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C07071(PairingEngine pairingEngine, List<String> list, Topic topic, Continuation<? super C07071> continuation) {
                            super(2, continuation);
                            this.this$0 = pairingEngine;
                            this.$trace = list;
                            this.$pairingTopic = topic;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new C07071(this.this$0, this.$trace, this.$pairingTopic, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C07071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            if (i == 0) {
                                C56391yDq.AEQbTJ(obj);
                                InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertTelemetryEventUseCase;
                                Props props = new Props(null, EventType.Error.PAIRING_SUBSCRIPTION_FAILURE, new Properties(null, null, null, null, null, null, this.$trace, this.$pairingTopic.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
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
                            C07071 c07071 = new C07071(this.this$0, this.$trace, this.$pairingTopic, null);
                            this.label = 1;
                            if (SupervisorKt.supervisorScope(c07071, this) == objCopydefault) {
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

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(this, arrayList, topic, null), 3, null);
                    PairingEngine pairingEngine = this;
                    Topic topic2 = topic;
                    pairingEngine.logger.error("Subscribe pairing topic error: " + topic2 + ", error: " + th);
                    function1.invoke(th);
                }
            });
        } catch (Exception e) {
            this.logger.error("Subscribe pairing topic error: " + topic + ", error: " + e);
            if (e instanceof NoRelayConnectionException) {
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass12(arrayList, topic, null), 3, null);
            }
            if (e instanceof NoInternetConnectionException) {
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass13(arrayList, topic, null), 3, null);
            }
            try {
                Result.Application application = Result.Companion;
                this.crypto.removeKeys(topic.getValue());
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                this.logger.error("Remove keys error: " + topic + ", error: " + thM7380exceptionOrNullimpl);
            }
            RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(this.jsonRpcInteractor, topic, null, null, 6, null);
            function1.invoke(e);
        }
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Topic $pairingTopic;
        public final /* synthetic */ List<String> $trace;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<String> list, Topic topic, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$trace = list;
            this.$pairingTopic = topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new AnonymousClass3(this.$trace, this.$pairingTopic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Topic $pairingTopic;
            public final /* synthetic */ List<String> $trace;
            public int label;
            public final /* synthetic */ PairingEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PairingEngine pairingEngine, List<String> list, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pairingEngine;
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
                    InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertTelemetryEventUseCase;
                    Props props = new Props(null, EventType.Error.PAIRING_URI_EXPIRED, new Properties(null, null, null, null, null, null, this.$trace, this.$pairingTopic.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PairingEngine.this, this.$trace, this.$pairingTopic, null);
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

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Topic $pairingTopic;
        public final /* synthetic */ List<String> $trace;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(List<String> list, Topic topic, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$trace = list;
            this.$pairingTopic = topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new AnonymousClass5(this.$trace, this.$pairingTopic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Topic $pairingTopic;
            public final /* synthetic */ List<String> $trace;
            public int label;
            public final /* synthetic */ PairingEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PairingEngine pairingEngine, List<String> list, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pairingEngine;
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
                    InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertTelemetryEventUseCase;
                    Props props = new Props(null, EventType.Error.PAIRING_EXPIRED, new Properties(null, null, null, null, null, null, this.$trace, this.$pairingTopic.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PairingEngine.this, this.$trace, this.$pairingTopic, null);
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

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$7, reason: invalid class name */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Topic $pairingTopic;
        public final /* synthetic */ List<String> $trace;
        public int label;
        public final /* synthetic */ PairingEngine this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(List<String> list, PairingEngine pairingEngine, Topic topic, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$trace = list;
            this.this$0 = pairingEngine;
            this.$pairingTopic = topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass7(this.$trace, this.this$0, this.$pairingTopic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$7$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Topic $pairingTopic;
            public final /* synthetic */ List<String> $trace;
            public int label;
            public final /* synthetic */ PairingEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<String> list, PairingEngine pairingEngine, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$trace = list;
                this.this$0 = pairingEngine;
                this.$pairingTopic = topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$trace, this.this$0, this.$pairingTopic, continuation);
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
                    this.$trace.add(Trace.Pairing.EMIT_STORED_PAIRING);
                    PairingEngine pairingEngine = this.this$0;
                    Topic topic = this.$pairingTopic;
                    pairingEngine.logger.log("Emitting stored pairing: " + topic);
                    MutableSharedFlow mutableSharedFlow = this.this$0._storedPairingTopicFlow;
                    Pair pair = new Pair(this.$pairingTopic, this.$trace);
                    this.label = 1;
                    if (mutableSharedFlow.emit(pair, this) == objCopydefault) {
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$trace, this.this$0, this.$pairingTopic, null);
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

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$12, reason: invalid class name */
    public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Topic $pairingTopic;
        public final /* synthetic */ List<String> $trace;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(List<String> list, Topic topic, Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
            this.$trace = list;
            this.$pairingTopic = topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new AnonymousClass12(this.$trace, this.$pairingTopic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$12$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Topic $pairingTopic;
            public final /* synthetic */ List<String> $trace;
            public int label;
            public final /* synthetic */ PairingEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PairingEngine pairingEngine, List<String> list, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pairingEngine;
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
                    InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertTelemetryEventUseCase;
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PairingEngine.this, this.$trace, this.$pairingTopic, null);
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

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$13, reason: invalid class name */
    public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Topic $pairingTopic;
        public final /* synthetic */ List<String> $trace;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(List<String> list, Topic topic, Continuation<? super AnonymousClass13> continuation) {
            super(2, continuation);
            this.$trace = list;
            this.$pairingTopic = topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new AnonymousClass13(this.$trace, this.$pairingTopic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pair$13$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Topic $pairingTopic;
            public final /* synthetic */ List<String> $trace;
            public int label;
            public final /* synthetic */ PairingEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PairingEngine pairingEngine, List<String> list, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pairingEngine;
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
                    InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertTelemetryEventUseCase;
                    Props props = new Props(null, EventType.Error.NO_INTERNET_CONNECTION, new Properties(null, null, null, null, null, null, this.$trace, this.$pairingTopic.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PairingEngine.this, this.$trace, this.$pairingTopic, null);
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

    public final void disconnect(@NotNull final String str, @NotNull final Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!isPairingValid(str)) {
            function1.invoke(new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + str));
            return;
        }
        this.pairingRepository.getPairingOrNullByTopic(new Topic(str));
        PairingRpc.PairingDelete pairingDelete = new PairingRpc.PairingDelete(0L, null, null, new PairingParams.DeleteParams(6000, com.reown.android.internal.common.exception.MessagesKt.DISCONNECT_MESSAGE), 7, null);
        IrnParams irnParams = new IrnParams(Tags.PAIRING_DELETE, new Ttl(Time.getDayInSeconds()), false, 4, null);
        this.logger.log("Sending Pairing disconnect");
        RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(this.jsonRpcInteractor, new Topic(str), irnParams, pairingDelete, null, null, new Function0<Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine.disconnect.1
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

            /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$disconnect$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C07041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ String $topic;
                public int label;
                public final /* synthetic */ PairingEngine this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07041(PairingEngine pairingEngine, String str, Continuation<? super C07041> continuation) {
                    super(2, continuation);
                    this.this$0 = pairingEngine;
                    this.$topic = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C07041(this.this$0, this.$topic, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C07041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$disconnect$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C07051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ String $topic;
                    public int label;
                    public final /* synthetic */ PairingEngine this$0;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C07051(PairingEngine pairingEngine, String str, Continuation<? super C07051> continuation) {
                        super(2, continuation);
                        this.this$0 = pairingEngine;
                        this.$topic = str;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                        return new C07051(this.this$0, this.$topic, continuation);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C07051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        C56442yFn.copydefault();
                        if (this.label == 0) {
                            C56391yDq.AEQbTJ(obj);
                            this.this$0.logger.log("Pairing disconnect sent successfully");
                            this.this$0.pairingRepository.deletePairing(new Topic(this.$topic));
                            this.this$0.metadataRepository.deleteMetaData(new Topic(this.$topic));
                            RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(this.this$0.jsonRpcInteractor, new Topic(this.$topic), null, null, 6, null);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        C07051 c07051 = new C07051(this.this$0, this.$topic, null);
                        this.label = 1;
                        if (SupervisorKt.supervisorScope(c07051, this) == objCopydefault) {
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

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C07041(PairingEngine.this, str, null), 3, null);
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine.disconnect.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
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
                PairingEngine.this.logger.error("Sending session disconnect error: " + th);
                function1.invoke(th);
            }
        }, 24, null);
    }

    public final void ping(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (isPairingValid(str)) {
            final PairingRpc.PairingPing pairingPing = new PairingRpc.PairingPing(0L, null, null, new PairingParams.PingParams(), 7, null);
            RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(this.jsonRpcInteractor, new Topic(str), new IrnParams(Tags.PAIRING_PING, new Ttl(Time.getThirtySeconds()), false, 4, null), pairingPing, null, null, new Function0<Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine.ping.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
                /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    PairingEngine.this.onPingSuccess(pairingPing, function1, str, function12);
                }
            }, new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine.ping.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
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
                    function12.invoke(th);
                }
            }, 24, null);
        } else {
            function12.invoke(new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + str));
        }
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$getPairings$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Pairing>>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18201(Continuation<? super C18201> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new C18201(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Pairing>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Pairing>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<Pairing>> continuation) {
            return ((C18201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PairingStorageRepositoryInterface pairingStorageRepositoryInterface = PairingEngine.this.pairingRepository;
                this.label = 1;
                obj = pairingStorageRepositoryInterface.getListOfPairings(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            PairingEngine pairingEngine = PairingEngine.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (pairingEngine.isNotExpired((Pairing) obj2)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    public final List<Pairing> getPairings() {
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new C18201(null), 1, null);
    }

    public final void register(@NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        C56406yEe.KWHzl(this.setOfRegisteredMethods, strArr);
    }

    public final Pairing getPairingByTopic(@NotNull Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        Pairing pairingOrNullByTopic = this.pairingRepository.getPairingOrNullByTopic(topic);
        if (pairingOrNullByTopic == null || !isNotExpired(pairingOrNullByTopic)) {
            return null;
        }
        return pairingOrNullByTopic;
    }

    public final void setRequestReceived(@NotNull String str, @NotNull Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        getPairing(str, function1, new Function1<Pairing, Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine.setRequestReceived.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pairing pairing) {
                invoke2(pairing);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Pairing pairing) {
                Intrinsics.checkNotNullParameter(pairing, "");
                PairingEngine.this.pairingRepository.setRequestReceived(pairing.getTopic());
            }
        });
    }

    public final void updateMetadata(@NotNull String str, @NotNull AppMetaData appMetaData, @NotNull AppMetaDataType appMetaDataType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        this.metadataRepository.upsertPeerMetadata(new Topic(str), appMetaData, appMetaDataType);
    }

    public final void deleteAndUnsubscribePairing(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(this.jsonRpcInteractor, new Topic(str), null, null, 6, null);
        this.pairingRepository.deletePairing(new Topic(str));
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$sendEvents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18331(Continuation<? super C18331> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new C18331(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$sendEvents$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ PairingEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07101(PairingEngine pairingEngine, Continuation<? super C07101> continuation) {
                super(2, continuation);
                this.this$0 = pairingEngine;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07101(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                } catch (Exception e) {
                    this.this$0.logger.error("Error when sending events: " + e);
                }
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InsertEventUseCase insertEventUseCase = this.this$0.insertEventUseCase;
                    Props props = new Props(EventType.INIT, null, new Properties(null, null, null, null, null, null, null, null, null, this.this$0.clientId, null, this.this$0.userAgent, 1535, null), 2, null);
                    this.label = 1;
                    if (insertEventUseCase.invoke(props, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                SendBatchEventUseCase sendBatchEventUseCase = this.this$0.sendBatchEventUseCase;
                this.label = 2;
                if (sendBatchEventUseCase.invoke(this) == objCopydefault) {
                    return objCopydefault;
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
                C07101 c07101 = new C07101(PairingEngine.this, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07101, this) == objCopydefault) {
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

    public final void sendEvents() {
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C18331(null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$resubscribeToPairingTopics$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18291 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18291(Continuation<? super C18291> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new C18291(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C18291) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$resubscribeToPairingTopics$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ PairingEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07081(PairingEngine pairingEngine, Continuation<? super C07081> continuation) {
                super(2, continuation);
                this.this$0 = pairingEngine;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                C07081 c07081 = new C07081(this.this$0, continuation);
                c07081.L$0 = obj;
                return c07081;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
                return ((C07081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$resubscribeToPairingTopics$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C07091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int label;
                public final /* synthetic */ PairingEngine this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07091(PairingEngine pairingEngine, Continuation<? super C07091> continuation) {
                    super(2, continuation);
                    this.this$0 = pairingEngine;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C07091(this.this$0, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C07091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        PairingEngine pairingEngine = this.this$0;
                        this.label = 1;
                        if (pairingEngine.sendBatchSubscribeForPairings(this) == objCopydefault) {
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
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new C07091(this.this$0, null), 2, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C07081 c07081 = new C07081(PairingEngine.this, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07081, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            if (PairingEngine.this.jsonRpcRequestsJob == null) {
                PairingEngine pairingEngine = PairingEngine.this;
                pairingEngine.jsonRpcRequestsJob = pairingEngine.collectJsonRpcRequestsFlow();
            }
            return Unit.INSTANCE;
        }
    }

    public final void resubscribeToPairingTopics() {
        FlowKt.launchIn(FlowKt.onEach(this.jsonRpcInteractor.getOnResubscribe(), new C18291(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendBatchSubscribeForPairings(Continuation<? super Unit> continuation) throws Throwable {
        C18301 c18301;
        PairingEngine pairingEngine;
        if (continuation instanceof C18301) {
            c18301 = (C18301) continuation;
            int i = c18301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18301.label = i - Integer.MIN_VALUE;
            } else {
                c18301 = new C18301(continuation);
            }
        }
        Object listOfPairings = c18301.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c18301.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pairingEngine = (PairingEngine) c18301.L$0;
            try {
                C56391yDq.AEQbTJ(listOfPairings);
            } catch (Exception e) {
                e = e;
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, pairingEngine.new C18323(e, null), 3, null);
            }
        } else {
            C56391yDq.AEQbTJ(listOfPairings);
            try {
                PairingStorageRepositoryInterface pairingStorageRepositoryInterface = this.pairingRepository;
                c18301.L$0 = this;
                c18301.label = 1;
                listOfPairings = pairingStorageRepositoryInterface.getListOfPairings(c18301);
                if (listOfPairings == objCopydefault) {
                    return objCopydefault;
                }
                pairingEngine = this;
            } catch (Exception e2) {
                e = e2;
                pairingEngine = this;
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, pairingEngine.new C18323(e, null), 3, null);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) listOfPairings) {
            if (pairingEngine.isNotExpired((Pairing) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Pairing) it.next()).getTopic().getValue());
        }
        RelayJsonRpcInteractorInterface.DefaultImpls.batchSubscribe$default(pairingEngine.jsonRpcInteractor, arrayList2, null, new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine.sendBatchSubscribeForPairings.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$sendBatchSubscribeForPairings$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Throwable $error;
                public int label;
                public final /* synthetic */ PairingEngine this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PairingEngine pairingEngine, Throwable th, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = pairingEngine;
                    this.$error = th;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$error, continuation);
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
                        MutableSharedFlow<SDKError> internalErrorFlow = this.this$0.getInternalErrorFlow();
                        SDKError sDKError = new SDKError(this.$error);
                        this.label = 1;
                        if (internalErrorFlow.emit(sDKError, this) == objCopydefault) {
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
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(PairingEngine.this, th, null), 3, null);
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$sendBatchSubscribeForPairings$3, reason: invalid class name and case insensitive filesystem */
    public static final class C18323 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Exception $e;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18323(Exception exc, Continuation<? super C18323> continuation) {
            super(2, continuation);
            this.$e = exc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new C18323(this.$e, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18323) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow<SDKError> internalErrorFlow = PairingEngine.this.getInternalErrorFlow();
                SDKError sDKError = new SDKError(this.$e);
                this.label = 1;
                if (internalErrorFlow.emit(sDKError, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$pairingsExpiryWatcher$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18251 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18251(Continuation<? super C18251> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new C18251(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull Unit unit, Continuation<? super Unit> continuation) {
            return ((C18251) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    PairingStorageRepositoryInterface pairingStorageRepositoryInterface = PairingEngine.this.pairingRepository;
                    this.label = 1;
                    obj = pairingStorageRepositoryInterface.getListOfPairings(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                PairingEngine pairingEngine = PairingEngine.this;
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    pairingEngine.isNotExpired((Pairing) it.next());
                }
            } catch (Exception e) {
                PairingEngine.this.logger.error(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void pairingsExpiryWatcher() {
        FlowKt.launchIn(FlowKt.onEach(repeatableFlow(30000L), new C18251(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$isPairingStateWatcher$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18211 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18211(Continuation<? super C18211> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PairingEngine.this.new C18211(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull Unit unit, Continuation<? super Unit> continuation) {
            return ((C18211) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    PairingStorageRepositoryInterface pairingStorageRepositoryInterface = PairingEngine.this.pairingRepository;
                    this.label = 1;
                    obj = pairingStorageRepositoryInterface.getListOfPairingsWithoutRequestReceived(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                if (!((List) obj).isEmpty()) {
                    PairingEngine.this._isPairingStateFlow.compareAndSet(C56443yFo.KWHzl(false), C56443yFo.KWHzl(true));
                } else {
                    PairingEngine.this._isPairingStateFlow.compareAndSet(C56443yFo.KWHzl(true), C56443yFo.KWHzl(false));
                }
            } catch (Exception e) {
                PairingEngine.this.logger.error(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void isPairingStateWatcher() {
        FlowKt.launchIn(FlowKt.onEach(repeatableFlow(30000L), new C18211(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$repeatableFlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18281 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ long $interval;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18281(long j, Continuation<? super C18281> continuation) {
            super(2, continuation);
            this.$interval = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C18281 c18281 = new C18281(this.$interval, continuation);
            c18281.L$0 = obj;
            return c18281;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
            return ((C18281) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = o.C56437yFi.OLrzqt()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                o.C56391yDq.AEQbTJ(r7)
                goto L2e
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                o.C56391yDq.AEQbTJ(r7)
                goto L3b
            L26:
                o.C56391yDq.AEQbTJ(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            L2e:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L3b
                return r0
            L3b:
                long r4 = r6.$interval
                r6.L$0 = r1
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L2e
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reown.android.pairing.engine.domain.PairingEngine.C18281.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Flow<Unit> repeatableFlow(long j) {
        return FlowKt.flow(new C18281(j, null));
    }

    public final Job collectJsonRpcRequestsFlow() {
        final SharedFlow<WCRequest> clientSyncJsonRpc = this.jsonRpcInteractor.getClientSyncJsonRpc();
        return FlowKt.launchIn(FlowKt.onEach(new Flow<WCRequest>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine$collectJsonRpcRequestsFlow$$inlined$filter$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super WCRequest> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = clientSyncJsonRpc.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$collectJsonRpcRequestsFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$collectJsonRpcRequestsFlow$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((WCRequest) obj).getParams() instanceof PairingParams) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new AnonymousClass2(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$collectJsonRpcRequestsFlow$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<WCRequest, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = PairingEngine.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull WCRequest wCRequest, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(wCRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WCRequest wCRequest = (WCRequest) this.L$0;
                ClientParams params = wCRequest.getParams();
                if (params instanceof PairingParams.DeleteParams) {
                    this.label = 1;
                    if (PairingEngine.this.onPairingDelete(wCRequest, (PairingParams.DeleteParams) params, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (params instanceof PairingParams.PingParams) {
                    PairingEngine.this.onPing(wCRequest);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onPairingDelete(WCRequest wCRequest, PairingParams.DeleteParams deleteParams, Continuation<? super Unit> continuation) throws Throwable {
        C18221 c18221;
        PairingEngine pairingEngine;
        WCRequest wCRequest2;
        IrnParams irnParams;
        Exception e;
        if (continuation instanceof C18221) {
            c18221 = (C18221) continuation;
            int i = c18221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18221.label = i - Integer.MIN_VALUE;
            } else {
                c18221 = new C18221(continuation);
            }
        }
        Object obj = c18221.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c18221.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            IrnParams irnParams2 = (IrnParams) c18221.L$2;
            WCRequest wCRequest3 = (WCRequest) c18221.L$1;
            pairingEngine = (PairingEngine) c18221.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            } catch (Exception e2) {
                e = e2;
                irnParams = irnParams2;
                wCRequest2 = wCRequest3;
                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(pairingEngine.jsonRpcInteractor, wCRequest2, new Uncategorized.GenericError("Cannot delete pairing: " + e.getMessage()), irnParams, null, null, null, null, 120, null);
                return Unit.INSTANCE;
            }
        }
        C56391yDq.AEQbTJ(obj);
        IrnParams irnParams3 = new IrnParams(Tags.PAIRING_DELETE_RESPONSE, new Ttl(Time.getDayInSeconds()), false, 4, null);
        try {
            this.pairingRepository.getPairingOrNullByTopic(wCRequest.getTopic());
            if (!isPairingValid(wCRequest.getTopic().getValue())) {
                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(this.jsonRpcInteractor, wCRequest, new Uncategorized.NoMatchingTopic("Pairing", wCRequest.getTopic().getValue()), irnParams3, null, null, null, null, 120, null);
                return Unit.INSTANCE;
            }
            this.crypto.removeKeys(wCRequest.getTopic().getValue());
            RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(this.jsonRpcInteractor, wCRequest.getTopic(), null, null, 6, null);
            this.pairingRepository.deletePairing(wCRequest.getTopic());
            this.metadataRepository.deleteMetaData(wCRequest.getTopic());
            MutableSharedFlow<EngineDO> mutableSharedFlow = this._engineEvent;
            EngineDO.PairingDelete pairingDelete = new EngineDO.PairingDelete(wCRequest.getTopic().getValue(), deleteParams.getMessage());
            c18221.L$0 = this;
            c18221.L$1 = wCRequest;
            c18221.L$2 = irnParams3;
            c18221.label = 1;
            if (mutableSharedFlow.emit(pairingDelete, c18221) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        } catch (Exception e3) {
            pairingEngine = this;
            wCRequest2 = wCRequest;
            irnParams = irnParams3;
            e = e3;
            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(pairingEngine.jsonRpcInteractor, wCRequest2, new Uncategorized.GenericError("Cannot delete pairing: " + e.getMessage()), irnParams, null, null, null, null, 120, null);
            return Unit.INSTANCE;
        }
    }

    public final void onPing(WCRequest wCRequest) {
        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithSuccess$default(this.jsonRpcInteractor, wCRequest, new IrnParams(Tags.PAIRING_PING, new Ttl(Time.getThirtySeconds()), false, 4, null), null, null, 12, null);
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$onPingSuccess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C18231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function1<String, Unit> $onSuccess;
        public final /* synthetic */ PairingRpc.PairingPing $pingPayload;
        public final /* synthetic */ String $topic;
        public int label;
        public final /* synthetic */ PairingEngine this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C18231(Function1<? super Throwable, Unit> function1, PairingEngine pairingEngine, PairingRpc.PairingPing pairingPing, Function1<? super String, Unit> function12, String str, Continuation<? super C18231> continuation) {
            super(2, continuation);
            this.$onFailure = function1;
            this.this$0 = pairingEngine;
            this.$pingPayload = pairingPing;
            this.$onSuccess = function12;
            this.$topic = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C18231(this.$onFailure, this.this$0, this.$pingPayload, this.$onSuccess, this.$topic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    long millis = TimeUnit.SECONDS.toMillis(Time.getThirtySeconds());
                    C07061 c07061 = new C07061(this.this$0, this.$pingPayload, this.$onSuccess, this.$topic, this.$onFailure, null);
                    this.label = 1;
                    if (TimeoutKt.withTimeout(millis, c07061, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (TimeoutCancellationException e) {
                this.$onFailure.invoke(e);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$onPingSuccess$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
            public final /* synthetic */ Function1<String, Unit> $onSuccess;
            public final /* synthetic */ PairingRpc.PairingPing $pingPayload;
            public final /* synthetic */ String $topic;
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ PairingEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07061(PairingEngine pairingEngine, PairingRpc.PairingPing pairingPing, Function1<? super String, Unit> function1, String str, Function1<? super Throwable, Unit> function12, Continuation<? super C07061> continuation) {
                super(2, continuation);
                this.this$0 = pairingEngine;
                this.$pingPayload = pairingPing;
                this.$onSuccess = function1;
                this.$topic = str;
                this.$onFailure = function12;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                C07061 c07061 = new C07061(this.this$0, this.$pingPayload, this.$onSuccess, this.$topic, this.$onFailure, continuation);
                c07061.L$0 = obj;
                return c07061;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    final SharedFlow<WCResponse> peerResponse = this.this$0.jsonRpcInteractor.getPeerResponse();
                    final PairingRpc.PairingPing pairingPing = this.$pingPayload;
                    Flow<WCResponse> flow = new Flow<WCResponse>() { // from class: com.reown.android.pairing.engine.domain.PairingEngine$onPingSuccess$1$1$invokeSuspend$$inlined$filter$1
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super WCResponse> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = peerResponse.collect(new AnonymousClass2(flowCollector, pairingPing), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$onPingSuccess$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            public final /* synthetic */ PairingRpc.PairingPing $pingPayload$inlined;
                            public final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* JADX INFO: renamed from: com.reown.android.pairing.engine.domain.PairingEngine$onPingSuccess$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public Object L$0;
                                public Object L$1;
                                public int label;
                                public /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public AnonymousClass2(FlowCollector flowCollector, PairingRpc.PairingPing pairingPing) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$pingPayload$inlined = pairingPing;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (((WCResponse) obj).getResponse().getId() == this.$pingPayload$inlined.getId()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    final Function1<String, Unit> function1 = this.$onSuccess;
                    final String str = this.$topic;
                    final Function1<Throwable, Unit> function12 = this.$onFailure;
                    FlowCollector<? super WCResponse> flowCollector = new FlowCollector() { // from class: com.reown.android.pairing.engine.domain.PairingEngine.onPingSuccess.1.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((WCResponse) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(@NotNull WCResponse wCResponse, @NotNull Continuation<? super Unit> continuation) {
                            JsonRpcResponse response = wCResponse.getResponse();
                            if (response instanceof JsonRpcResponse.JsonRpcResult) {
                                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                                function1.invoke(str);
                            } else if (response instanceof JsonRpcResponse.JsonRpcError) {
                                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                                function12.invoke(new Throwable(((JsonRpcResponse.JsonRpcError) response).getErrorMessage()));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == objCopydefault) {
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
    }

    public final void onPingSuccess(PairingRpc.PairingPing pairingPing, Function1<? super String, Unit> function1, String str, Function1<? super Throwable, Unit> function12) {
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C18231(function12, this, pairingPing, function1, str, null), 3, null);
    }

    public final Topic generateTopic() {
        return new Topic(UtilFunctionsKt.bytesToHex(UtilFunctionsKt.randomBytes(32)));
    }

    public final void getPairing(String str, Function1<? super Throwable, Unit> function1, Function1<? super Pairing, Unit> function12) {
        Unit unit;
        Pairing pairingOrNullByTopic = this.pairingRepository.getPairingOrNullByTopic(new Topic(str));
        if (pairingOrNullByTopic != null) {
            if (isNotExpired(pairingOrNullByTopic)) {
                function12.invoke(pairingOrNullByTopic);
            } else {
                function1.invoke(new IllegalStateException("Pairing for topic " + str + " is expired"));
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            function1.invoke(new IllegalStateException("Pairing for topic " + str + " does not exist"));
        }
    }

    public final boolean isNotExpired(Pairing pairing) {
        boolean z = pairing.getExpiry().getSeconds() > Time.getCurrentTimeInSeconds();
        if (!z) {
            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new PairingEngine$isNotExpired$1$1(this, pairing, null), 3, null);
        }
        return z;
    }

    public final boolean isPairingValid(String str) {
        Pairing pairingOrNullByTopic = this.pairingRepository.getPairingOrNullByTopic(new Topic(str));
        if (pairingOrNullByTopic != null) {
            return isNotExpired(pairingOrNullByTopic);
        }
        return false;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.pairing.engine.domain.PairingEngine.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }
}
