package com.reown.sign.engine.use_case.calls;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.exception.NoInternetConnectionException;
import com.reown.android.internal.common.exception.NoRelayConnectionException;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.params.CoreSignParams;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Expiration;
import com.reown.android.internal.utils.Time;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.pulse.model.EventType;
import com.reown.android.pulse.model.Trace;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.InvalidNamespaceException;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.common.exceptions.SessionProposalExpiredException;
import com.reown.sign.common.model.vo.clientsync.common.SessionParticipant;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.proposal.ProposalVO;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ApproveSessionUseCase implements ApproveSessionUseCaseInterface {
    public final KeyManagementRepository crypto;
    public final InsertTelemetryEventUseCase insertEventUseCase;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final ProposalStorageRepository proposalStorageRepository;
    public final AppMetaData selfAppMetaData;
    public final SessionStorageRepository sessionStorageRepository;
    public final VerifyContextStorageRepository verifyContextStorageRepository;

    public ApproveSessionUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull KeyManagementRepository keyManagementRepository, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull ProposalStorageRepository proposalStorageRepository, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull VerifyContextStorageRepository verifyContextStorageRepository, @NotNull AppMetaData appMetaData, @NotNull InsertTelemetryEventUseCase insertTelemetryEventUseCase, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(proposalStorageRepository, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(insertTelemetryEventUseCase, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.crypto = keyManagementRepository;
        this.sessionStorageRepository = sessionStorageRepository;
        this.proposalStorageRepository = proposalStorageRepository;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.verifyContextStorageRepository = verifyContextStorageRepository;
        this.selfAppMetaData = appMetaData;
        this.insertEventUseCase = insertTelemetryEventUseCase;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ String $proposerPublicKey;
        public final /* synthetic */ Map<String, EngineDO.Namespace.Session> $sessionNamespaces;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, Map<String, EngineDO.Namespace.Session> map, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$proposerPublicKey = str;
            this.$sessionNamespaces = map;
            this.$onFailure = function1;
            this.$onSuccess = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return ApproveSessionUseCase.this.new AnonymousClass2(this.$proposerPublicKey, this.$sessionNamespaces, this.$onFailure, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [132=10, 133=10, 134=10] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:192:0x0777 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:214:? */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x01da */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0699: MOVE (r15 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:187:0x0699 */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x069a: MOVE (r14 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:187:0x0699 */
        /* JADX WARN: Removed duplicated region for block: B:200:0x0783  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x07e6  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x07ed  */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v1 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v23 */
        /* JADX WARN: Type inference failed for: r15v24 */
        /* JADX WARN: Type inference failed for: r15v25 */
        /* JADX WARN: Type inference failed for: r15v26 */
        /* JADX WARN: Type inference failed for: r15v27 */
        /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r19v3 */
        /* JADX WARN: Type inference failed for: r19v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r35v0 */
        /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v29 */
        /* JADX WARN: Type inference failed for: r4v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object obj2;
            ?? r15;
            List list;
            List list2;
            List list3;
            ?? r152;
            List list4;
            ?? r11;
            final List arrayList;
            final ?? value;
            final ?? r19;
            ProposalVO proposalVO;
            ApproveSessionUseCase approveSessionUseCase;
            ?? r4;
            SignValidator signValidator;
            Map mapOfNamespacesVOSession;
            Map<String, Namespace.Proposal> requiredNamespaces;
            ApproveSessionUseCase approveSessionUseCase2;
            ValidationError validationError;
            ApproveSessionUseCase approveSessionUseCase3;
            ValidationError validationError2;
            ApproveSessionUseCase approveSessionUseCase4;
            ValidationError validationError3;
            ApproveSessionUseCase approveSessionUseCase5;
            ValidationError userRejectedChains;
            ApproveSessionUseCase approveSessionUseCase6;
            ValidationError userRejectedChains2;
            ApproveSessionUseCase approveSessionUseCase7;
            ValidationError unsupportedChains;
            ApproveSessionUseCase approveSessionUseCase8;
            ValidationError unsupportedChains2;
            ApproveSessionUseCase approveSessionUseCase9;
            ValidationError unsupportedChains3;
            ApproveSessionUseCase approveSessionUseCase10;
            ValidationError validationError4;
            ApproveSessionUseCase approveSessionUseCase11;
            ValidationError validationError5;
            ApproveSessionUseCase approveSessionUseCase12;
            Object objCopydefault = C56442yFn.copydefault();
            try {
            } catch (Exception e) {
                e = e;
                r15 = obj2;
                list2 = list;
            }
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    arrayList = new ArrayList();
                    arrayList.add(Trace.Session.SESSION_APPROVE_STARTED);
                    ApproveSessionUseCase.this.logger.log(Trace.Session.SESSION_APPROVE_STARTED);
                    ProposalVO proposalByKey$sign_release = ApproveSessionUseCase.this.proposalStorageRepository.getProposalByKey$sign_release(this.$proposerPublicKey);
                    WCRequest sessionProposeRequest = EngineMapperKt.toSessionProposeRequest(proposalByKey$sign_release);
                    value = proposalByKey$sign_release.getPairingTopic().getValue();
                    try {
                        Expiry expiry = proposalByKey$sign_release.getExpiry();
                        try {
                            if (expiry != null) {
                                try {
                                    ApproveSessionUseCase approveSessionUseCase13 = ApproveSessionUseCase.this;
                                    if (CoreValidator.INSTANCE.isExpired(expiry)) {
                                        InsertTelemetryEventUseCase insertTelemetryEventUseCase = approveSessionUseCase13.insertEventUseCase;
                                        Props props = new Props(null, EventType.Error.PROPOSAL_EXPIRED, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                                        this.L$0 = arrayList;
                                        this.L$1 = proposalByKey$sign_release;
                                        this.L$2 = value;
                                        this.L$3 = approveSessionUseCase13;
                                        this.label = 1;
                                        if (insertTelemetryEventUseCase.invoke(props, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        proposalVO = proposalByKey$sign_release;
                                        approveSessionUseCase = approveSessionUseCase13;
                                        r4 = value;
                                        Unit unit = Unit.INSTANCE;
                                        approveSessionUseCase.logger.error("Proposal expired on approve, topic: " + r4 + ", id: " + proposalVO.getRequestId());
                                        throw new SessionProposalExpiredException("Session proposal expired");
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                } catch (Exception e2) {
                                    e = e2;
                                    list2 = arrayList;
                                    r15 = value;
                                    if (e instanceof NoRelayConnectionException) {
                                    }
                                    list4 = list3;
                                    r11 = r152;
                                    if (e instanceof NoInternetConnectionException) {
                                    }
                                    this.$onFailure.invoke(e);
                                }
                            }
                            arrayList.add(Trace.Session.PROPOSAL_NOT_EXPIRED);
                            signValidator = SignValidator.INSTANCE;
                            mapOfNamespacesVOSession = EngineMapperKt.toMapOfNamespacesVOSession(this.$sessionNamespaces);
                            requiredNamespaces = proposalByKey$sign_release.getRequiredNamespaces();
                            approveSessionUseCase2 = ApproveSessionUseCase.this;
                        } catch (Exception e3) {
                            e = e3;
                            value = obj;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        r19 = value;
                    }
                    if (mapOfNamespacesVOSession.isEmpty()) {
                        validationError5 = ValidationError.EmptyNamespaces.INSTANCE;
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase2 = approveSessionUseCase2.insertEventUseCase;
                        Props props2 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = validationError5;
                        this.label = 2;
                        if (insertTelemetryEventUseCase2.invoke(props2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase12 = approveSessionUseCase2;
                        Unit unit3 = Unit.INSTANCE;
                        approveSessionUseCase12.logger.log("Session approve failure - invalid namespaces, error: " + validationError5);
                        throw new InvalidNamespaceException(validationError5.getMessage());
                    }
                    if (!signValidator.areNamespacesKeysProperlyFormatted(mapOfNamespacesVOSession)) {
                        validationError4 = ValidationError.UnsupportedNamespaceKey.INSTANCE;
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase3 = approveSessionUseCase2.insertEventUseCase;
                        Props props3 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = validationError4;
                        this.label = 3;
                        if (insertTelemetryEventUseCase3.invoke(props3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase11 = approveSessionUseCase2;
                        Unit unit4 = Unit.INSTANCE;
                        approveSessionUseCase11.logger.log("Session approve failure - invalid namespaces, error: " + validationError4);
                        throw new InvalidNamespaceException(validationError4.getMessage());
                    }
                    if (!signValidator.areChainsNotEmpty(mapOfNamespacesVOSession)) {
                        unsupportedChains3 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE);
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase4 = approveSessionUseCase2.insertEventUseCase;
                        Props props4 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = unsupportedChains3;
                        this.label = 4;
                        if (insertTelemetryEventUseCase4.invoke(props4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase10 = approveSessionUseCase2;
                        Unit unit5 = Unit.INSTANCE;
                        approveSessionUseCase10.logger.log("Session approve failure - invalid namespaces, error: " + unsupportedChains3);
                        throw new InvalidNamespaceException(unsupportedChains3.getMessage());
                    }
                    if (!signValidator.areChainIdsValid(mapOfNamespacesVOSession)) {
                        unsupportedChains2 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase5 = approveSessionUseCase2.insertEventUseCase;
                        Props props5 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = unsupportedChains2;
                        this.label = 5;
                        if (insertTelemetryEventUseCase5.invoke(props5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase9 = approveSessionUseCase2;
                        Unit unit6 = Unit.INSTANCE;
                        approveSessionUseCase9.logger.log("Session approve failure - invalid namespaces, error: " + unsupportedChains2);
                        throw new InvalidNamespaceException(unsupportedChains2.getMessage());
                    }
                    if (!signValidator.areChainsInMatchingNamespace(mapOfNamespacesVOSession)) {
                        unsupportedChains = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE);
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase6 = approveSessionUseCase2.insertEventUseCase;
                        Props props6 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = unsupportedChains;
                        this.label = 6;
                        if (insertTelemetryEventUseCase6.invoke(props6, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase8 = approveSessionUseCase2;
                        Unit unit7 = Unit.INSTANCE;
                        approveSessionUseCase8.logger.log("Session approve failure - invalid namespaces, error: " + unsupportedChains);
                        throw new InvalidNamespaceException(unsupportedChains.getMessage());
                    }
                    if (!signValidator.areAccountIdsValid(mapOfNamespacesVOSession)) {
                        userRejectedChains2 = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_CAIP_10_MESSAGE);
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase7 = approveSessionUseCase2.insertEventUseCase;
                        Props props7 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = userRejectedChains2;
                        this.label = 7;
                        if (insertTelemetryEventUseCase7.invoke(props7, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase7 = approveSessionUseCase2;
                        Unit unit8 = Unit.INSTANCE;
                        approveSessionUseCase7.logger.log("Session approve failure - invalid namespaces, error: " + userRejectedChains2);
                        throw new InvalidNamespaceException(userRejectedChains2.getMessage());
                    }
                    if (!signValidator.areAccountsInMatchingNamespaceAndChains(mapOfNamespacesVOSession)) {
                        userRejectedChains = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE);
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase8 = approveSessionUseCase2.insertEventUseCase;
                        Props props8 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = userRejectedChains;
                        this.label = 8;
                        if (insertTelemetryEventUseCase8.invoke(props8, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase6 = approveSessionUseCase2;
                        Unit unit9 = Unit.INSTANCE;
                        approveSessionUseCase6.logger.log("Session approve failure - invalid namespaces, error: " + userRejectedChains);
                        throw new InvalidNamespaceException(userRejectedChains.getMessage());
                    }
                    if (!signValidator.areAllNamespacesApproved(mapOfNamespacesVOSession.keySet(), requiredNamespaces.keySet())) {
                        validationError3 = ValidationError.UserRejected.INSTANCE;
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase9 = approveSessionUseCase2.insertEventUseCase;
                        Props props9 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = validationError3;
                        this.label = 9;
                        if (insertTelemetryEventUseCase9.invoke(props9, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase5 = approveSessionUseCase2;
                        Unit unit10 = Unit.INSTANCE;
                        approveSessionUseCase5.logger.log("Session approve failure - invalid namespaces, error: " + validationError3);
                        throw new InvalidNamespaceException(validationError3.getMessage());
                    }
                    if (!signValidator.areAllMethodsApproved(signValidator.allMethodsWithChains(mapOfNamespacesVOSession), signValidator.allMethodsWithChains(requiredNamespaces))) {
                        validationError2 = ValidationError.UserRejectedMethods.INSTANCE;
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase10 = approveSessionUseCase2.insertEventUseCase;
                        Props props10 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = validationError2;
                        this.label = 10;
                        if (insertTelemetryEventUseCase10.invoke(props10, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase4 = approveSessionUseCase2;
                        Unit unit11 = Unit.INSTANCE;
                        approveSessionUseCase4.logger.log("Session approve failure - invalid namespaces, error: " + validationError2);
                        throw new InvalidNamespaceException(validationError2.getMessage());
                    }
                    if (!signValidator.areAllEventsApproved(signValidator.allEventsWithChains(mapOfNamespacesVOSession), signValidator.allEventsWithChains(requiredNamespaces))) {
                        validationError = ValidationError.UserRejectedEvents.INSTANCE;
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase11 = approveSessionUseCase2.insertEventUseCase;
                        Props props11 = new Props(null, EventType.Error.SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, arrayList, value, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.L$1 = value;
                        this.L$2 = approveSessionUseCase2;
                        this.L$3 = validationError;
                        this.label = 11;
                        if (insertTelemetryEventUseCase11.invoke(props11, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        approveSessionUseCase3 = approveSessionUseCase2;
                        Unit unit12 = Unit.INSTANCE;
                        approveSessionUseCase3.logger.log("Session approve failure - invalid namespaces, error: " + validationError);
                        throw new InvalidNamespaceException(validationError.getMessage());
                    }
                    arrayList.add(Trace.Session.SESSION_NAMESPACE_VALIDATION_SUCCESS);
                    String strMo7181generateAndStoreX25519KeyPairuN_RPug = ApproveSessionUseCase.this.crypto.mo7181generateAndStoreX25519KeyPairuN_RPug();
                    final Topic topicMo7183generateTopicFromKeyAgreementV_lFtQw = ApproveSessionUseCase.this.crypto.mo7183generateTopicFromKeyAgreementV_lFtQw(strMo7181generateAndStoreX25519KeyPairuN_RPug, PublicKey.m7317constructorimpl(this.$proposerPublicKey));
                    arrayList.add(Trace.Session.CREATE_SESSION_TOPIC);
                    CoreSignParams.ApprovalParams approvalParamsM7344toSessionApproveParamszo5FKG8 = EngineMapperKt.m7344toSessionApproveParamszo5FKG8(proposalByKey$sign_release, strMo7181generateAndStoreX25519KeyPairuN_RPug);
                    IrnParams irnParams = new IrnParams(Tags.SESSION_PROPOSE_RESPONSE_APPROVE, new Ttl(Time.getFiveMinutesInSeconds()), false, 4, null);
                    arrayList.add(Trace.Session.SUBSCRIBING_SESSION_TOPIC);
                    ApproveSessionUseCase.this.logger.log("Subscribing to session topic: " + topicMo7183generateTopicFromKeyAgreementV_lFtQw);
                    RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = ApproveSessionUseCase.this.jsonRpcInteractor;
                    final ApproveSessionUseCase approveSessionUseCase14 = ApproveSessionUseCase.this;
                    Function1<Topic, Unit> function1 = new Function1<Topic, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase.approve.2.5
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
                            arrayList.add(Trace.Session.SUBSCRIBE_SESSION_TOPIC_SUCCESS);
                            ApproveSessionUseCase approveSessionUseCase15 = approveSessionUseCase14;
                            Topic topic2 = topicMo7183generateTopicFromKeyAgreementV_lFtQw;
                            approveSessionUseCase15.logger.log("Successfully subscribed to session topic: " + topic2);
                        }
                    };
                    final Function1<Throwable, Unit> function12 = this.$onFailure;
                    final ApproveSessionUseCase approveSessionUseCase15 = ApproveSessionUseCase.this;
                    relayJsonRpcInteractorInterface.subscribe(topicMo7183generateTopicFromKeyAgreementV_lFtQw, function1, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase.approve.2.6
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

                        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$6$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ String $pairingTopic;
                            public final /* synthetic */ List<String> $trace;
                            public int label;
                            public final /* synthetic */ ApproveSessionUseCase this$0;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ApproveSessionUseCase approveSessionUseCase, List<String> list, String str, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.this$0 = approveSessionUseCase;
                                this.$trace = list;
                                this.$pairingTopic = str;
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

                            /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$6$1$1, reason: invalid class name and collision with other inner class name */
                            public static final class C07691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ String $pairingTopic;
                                public final /* synthetic */ List<String> $trace;
                                public int label;
                                public final /* synthetic */ ApproveSessionUseCase this$0;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C07691(ApproveSessionUseCase approveSessionUseCase, List<String> list, String str, Continuation<? super C07691> continuation) {
                                    super(2, continuation);
                                    this.this$0 = approveSessionUseCase;
                                    this.$trace = list;
                                    this.$pairingTopic = str;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                    return new C07691(this.this$0, this.$trace, this.$pairingTopic, continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C07691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                    Object objCopydefault = C56442yFn.copydefault();
                                    int i = this.label;
                                    if (i == 0) {
                                        C56391yDq.AEQbTJ(obj);
                                        InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertEventUseCase;
                                        Props props = new Props(null, EventType.Error.SESSION_SUBSCRIPTION_FAILURE, new Properties(null, null, null, null, null, null, this.$trace, this.$pairingTopic, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
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
                                    C07691 c07691 = new C07691(this.this$0, this.$trace, this.$pairingTopic, null);
                                    this.label = 1;
                                    if (SupervisorKt.supervisorScope(c07691, this) == objCopydefault) {
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
                            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(approveSessionUseCase15, arrayList, value, null), 3, null);
                            approveSessionUseCase15.logger.error("Subscribe to session topic failure: " + th);
                            function12.invoke(th);
                        }
                    });
                    r19 = value;
                    try {
                        invokeSuspend$sessionSettle(ApproveSessionUseCase.this, this.$sessionNamespaces, arrayList, this.$onFailure, this.$onSuccess, this.$proposerPublicKey, sessionProposeRequest.getId(), proposalByKey$sign_release, topicMo7183generateTopicFromKeyAgreementV_lFtQw, sessionProposeRequest.getTopic());
                        arrayList.add(Trace.Session.PUBLISHING_SESSION_APPROVE);
                        ApproveSessionUseCase.this.logger.log("Publishing session approve on topic: " + topicMo7183generateTopicFromKeyAgreementV_lFtQw);
                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface2 = ApproveSessionUseCase.this.jsonRpcInteractor;
                        final Function1<Throwable, Unit> function13 = this.$onFailure;
                        final ApproveSessionUseCase approveSessionUseCase16 = ApproveSessionUseCase.this;
                        Function1<Throwable, Unit> function14 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase.approve.2.8
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

                            /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$8$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ String $pairingTopic;
                                public final /* synthetic */ List<String> $trace;
                                public int label;
                                public final /* synthetic */ ApproveSessionUseCase this$0;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(ApproveSessionUseCase approveSessionUseCase, List<String> list, String str, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = approveSessionUseCase;
                                    this.$trace = list;
                                    this.$pairingTopic = str;
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

                                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$8$1$1, reason: invalid class name and collision with other inner class name */
                                public static final class C07701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ String $pairingTopic;
                                    public final /* synthetic */ List<String> $trace;
                                    public int label;
                                    public final /* synthetic */ ApproveSessionUseCase this$0;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C07701(ApproveSessionUseCase approveSessionUseCase, List<String> list, String str, Continuation<? super C07701> continuation) {
                                        super(2, continuation);
                                        this.this$0 = approveSessionUseCase;
                                        this.$trace = list;
                                        this.$pairingTopic = str;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                        return new C07701(this.this$0, this.$trace, this.$pairingTopic, continuation);
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C07701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Object objCopydefault = C56442yFn.copydefault();
                                        int i = this.label;
                                        if (i == 0) {
                                            C56391yDq.AEQbTJ(obj);
                                            InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertEventUseCase;
                                            Props props = new Props(null, EventType.Error.SESSION_APPROVE_PUBLISH_FAILURE, new Properties(null, null, null, null, null, null, this.$trace, this.$pairingTopic, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
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
                                        C07701 c07701 = new C07701(this.this$0, this.$trace, this.$pairingTopic, null);
                                        this.label = 1;
                                        if (SupervisorKt.supervisorScope(c07701, this) == objCopydefault) {
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
                                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(approveSessionUseCase16, arrayList, r19, null), 3, null);
                                ApproveSessionUseCase approveSessionUseCase17 = approveSessionUseCase16;
                                Topic topic = topicMo7183generateTopicFromKeyAgreementV_lFtQw;
                                approveSessionUseCase17.logger.error("Session approve failure, topic: " + topic + ": " + th);
                                function13.invoke(th);
                            }
                        };
                        final ApproveSessionUseCase approveSessionUseCase17 = ApproveSessionUseCase.this;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithParams$default(relayJsonRpcInteractorInterface2, sessionProposeRequest, approvalParamsM7344toSessionApproveParamszo5FKG8, irnParams, null, null, function14, new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase.approve.2.9
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
                                arrayList.add(Trace.Session.SESSION_APPROVE_PUBLISH_SUCCESS);
                                ApproveSessionUseCase approveSessionUseCase18 = approveSessionUseCase17;
                                Topic topic = topicMo7183generateTopicFromKeyAgreementV_lFtQw;
                                approveSessionUseCase18.logger.log("Session approve sent successfully, topic: " + topic);
                            }
                        }, 24, null);
                        break;
                    } catch (Exception e5) {
                        e = e5;
                        value = r19;
                        list2 = arrayList;
                        r15 = value;
                        if (e instanceof NoRelayConnectionException) {
                        }
                        list4 = list3;
                        r11 = r152;
                        if (e instanceof NoInternetConnectionException) {
                        }
                        this.$onFailure.invoke(e);
                    }
                    return Unit.INSTANCE;
                    value = r19;
                    list2 = arrayList;
                    r15 = value;
                    if (e instanceof NoRelayConnectionException) {
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase12 = ApproveSessionUseCase.this.insertEventUseCase;
                        Props props12 = new Props(null, EventType.Error.NO_WSS_CONNECTION, new Properties(null, null, null, null, null, null, list2, r15, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        list3 = list2;
                        this.L$0 = list3;
                        ?? r153 = r15;
                        this.L$1 = r153;
                        this.L$2 = e;
                        this.L$3 = null;
                        this.label = 12;
                        r152 = r153;
                        if (insertTelemetryEventUseCase12.invoke(props12, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        list3 = list2;
                        r152 = r15;
                    }
                    list4 = list3;
                    r11 = r152;
                    if (e instanceof NoInternetConnectionException) {
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase13 = ApproveSessionUseCase.this.insertEventUseCase;
                        Props props13 = new Props(null, EventType.Error.NO_INTERNET_CONNECTION, new Properties(null, null, null, null, null, null, list4, r11, null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = e;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 13;
                        if (insertTelemetryEventUseCase13.invoke(props13, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    this.$onFailure.invoke(e);
                    return Unit.INSTANCE;
                case 1:
                    approveSessionUseCase = (ApproveSessionUseCase) this.L$3;
                    r4 = (String) this.L$2;
                    proposalVO = (ProposalVO) this.L$1;
                    arrayList = (List) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        r4 = r4;
                        Unit unit13 = Unit.INSTANCE;
                        approveSessionUseCase.logger.error("Proposal expired on approve, topic: " + r4 + ", id: " + proposalVO.getRequestId());
                        throw new SessionProposalExpiredException("Session proposal expired");
                    } catch (Exception e6) {
                        e = e6;
                        value = r4;
                    }
                    break;
                case 2:
                    validationError5 = (ValidationError) this.L$3;
                    approveSessionUseCase12 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit32 = Unit.INSTANCE;
                    approveSessionUseCase12.logger.log("Session approve failure - invalid namespaces, error: " + validationError5);
                    throw new InvalidNamespaceException(validationError5.getMessage());
                case 3:
                    validationError4 = (ValidationError) this.L$3;
                    approveSessionUseCase11 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit42 = Unit.INSTANCE;
                    approveSessionUseCase11.logger.log("Session approve failure - invalid namespaces, error: " + validationError4);
                    throw new InvalidNamespaceException(validationError4.getMessage());
                case 4:
                    unsupportedChains3 = (ValidationError) this.L$3;
                    approveSessionUseCase10 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit52 = Unit.INSTANCE;
                    approveSessionUseCase10.logger.log("Session approve failure - invalid namespaces, error: " + unsupportedChains3);
                    throw new InvalidNamespaceException(unsupportedChains3.getMessage());
                case 5:
                    unsupportedChains2 = (ValidationError) this.L$3;
                    approveSessionUseCase9 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit62 = Unit.INSTANCE;
                    approveSessionUseCase9.logger.log("Session approve failure - invalid namespaces, error: " + unsupportedChains2);
                    throw new InvalidNamespaceException(unsupportedChains2.getMessage());
                case 6:
                    unsupportedChains = (ValidationError) this.L$3;
                    approveSessionUseCase8 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit72 = Unit.INSTANCE;
                    approveSessionUseCase8.logger.log("Session approve failure - invalid namespaces, error: " + unsupportedChains);
                    throw new InvalidNamespaceException(unsupportedChains.getMessage());
                case 7:
                    userRejectedChains2 = (ValidationError) this.L$3;
                    approveSessionUseCase7 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit82 = Unit.INSTANCE;
                    approveSessionUseCase7.logger.log("Session approve failure - invalid namespaces, error: " + userRejectedChains2);
                    throw new InvalidNamespaceException(userRejectedChains2.getMessage());
                case 8:
                    userRejectedChains = (ValidationError) this.L$3;
                    approveSessionUseCase6 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit92 = Unit.INSTANCE;
                    approveSessionUseCase6.logger.log("Session approve failure - invalid namespaces, error: " + userRejectedChains);
                    throw new InvalidNamespaceException(userRejectedChains.getMessage());
                case 9:
                    validationError3 = (ValidationError) this.L$3;
                    approveSessionUseCase5 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit102 = Unit.INSTANCE;
                    approveSessionUseCase5.logger.log("Session approve failure - invalid namespaces, error: " + validationError3);
                    throw new InvalidNamespaceException(validationError3.getMessage());
                case 10:
                    validationError2 = (ValidationError) this.L$3;
                    approveSessionUseCase4 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit112 = Unit.INSTANCE;
                    approveSessionUseCase4.logger.log("Session approve failure - invalid namespaces, error: " + validationError2);
                    throw new InvalidNamespaceException(validationError2.getMessage());
                case 11:
                    validationError = (ValidationError) this.L$3;
                    approveSessionUseCase3 = (ApproveSessionUseCase) this.L$2;
                    C56391yDq.AEQbTJ(obj);
                    Unit unit122 = Unit.INSTANCE;
                    approveSessionUseCase3.logger.log("Session approve failure - invalid namespaces, error: " + validationError);
                    throw new InvalidNamespaceException(validationError.getMessage());
                case 12:
                    e = (Exception) this.L$2;
                    String str = (String) this.L$1;
                    List list5 = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    r11 = str;
                    list4 = list5;
                    if (e instanceof NoInternetConnectionException) {
                    }
                    this.$onFailure.invoke(e);
                    return Unit.INSTANCE;
                case 13:
                    e = (Exception) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    this.$onFailure.invoke(e);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public static final void invokeSuspend$sessionSettle(final ApproveSessionUseCase approveSessionUseCase, Map<String, EngineDO.Namespace.Session> map, final List<String> list, final Function1<? super Throwable, Unit> function1, final Function0<Unit> function0, final String str, long j, final ProposalVO proposalVO, final Topic topic, final Topic topic2) {
            Topic topic3;
            Topic topic4;
            SignRpc.SessionSettle sessionSettle;
            IrnParams irnParams;
            SessionParticipant sessionParticipant = new SessionParticipant(approveSessionUseCase.crypto.mo7186getSelfPublicFromKeyAgreementp9DwDrs(topic), approveSessionUseCase.selfAppMetaData);
            long active_session = Expiration.getACTIVE_SESSION();
            try {
                approveSessionUseCase.sessionStorageRepository.insertSession(SessionVO.Companion.createUnacknowledgedSession$sign_release(topic, proposalVO, sessionParticipant, active_session, map, topic2.getValue()), j);
                approveSessionUseCase.metadataStorageRepository.insertOrAbortMetadata(topic, approveSessionUseCase.selfAppMetaData, AppMetaDataType.SELF);
                approveSessionUseCase.metadataStorageRepository.insertOrAbortMetadata(topic, proposalVO.getAppMetaData(), AppMetaDataType.PEER);
                list.add(Trace.Session.STORE_SESSION);
                sessionSettle = new SignRpc.SessionSettle(0L, null, null, EngineMapperKt.toSessionSettleParams(proposalVO, sessionParticipant, active_session, map), 7, null);
                irnParams = new IrnParams(Tags.SESSION_SETTLE, new Ttl(Time.getFiveMinutesInSeconds()), false, 4, null);
                list.add(Trace.Session.PUBLISHING_SESSION_SETTLE);
                approveSessionUseCase.logger.log("Publishing session settle on topic: " + topic);
                try {
                    topic4 = topic;
                    topic3 = topic2;
                } catch (Exception e) {
                    e = e;
                    topic4 = topic;
                    topic3 = topic2;
                }
            } catch (Exception e2) {
                e = e2;
                topic3 = topic2;
                topic4 = topic;
            }
            try {
                RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(approveSessionUseCase.jsonRpcInteractor, topic, irnParams, sessionSettle, null, null, new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$sessionSettle$2
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

                    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$sessionSettle$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ ProposalVO $proposal;
                        public final /* synthetic */ String $proposerPublicKey;
                        public final /* synthetic */ Topic $sessionTopic;
                        public final /* synthetic */ List<String> $trace;
                        public int label;
                        public final /* synthetic */ ApproveSessionUseCase this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ApproveSessionUseCase approveSessionUseCase, String str, ProposalVO proposalVO, List<String> list, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.this$0 = approveSessionUseCase;
                            this.$proposerPublicKey = str;
                            this.$proposal = proposalVO;
                            this.$trace = list;
                            this.$sessionTopic = topic;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.this$0, this.$proposerPublicKey, this.$proposal, this.$trace, this.$sessionTopic, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$sessionSettle$2$1$1, reason: invalid class name and collision with other inner class name */
                        public static final class C07711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ ProposalVO $proposal;
                            public final /* synthetic */ String $proposerPublicKey;
                            public final /* synthetic */ Topic $sessionTopic;
                            public final /* synthetic */ List<String> $trace;
                            public int label;
                            public final /* synthetic */ ApproveSessionUseCase this$0;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C07711(ApproveSessionUseCase approveSessionUseCase, String str, ProposalVO proposalVO, List<String> list, Topic topic, Continuation<? super C07711> continuation) {
                                super(2, continuation);
                                this.this$0 = approveSessionUseCase;
                                this.$proposerPublicKey = str;
                                this.$proposal = proposalVO;
                                this.$trace = list;
                                this.$sessionTopic = topic;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                return new C07711(this.this$0, this.$proposerPublicKey, this.$proposal, this.$trace, this.$sessionTopic, continuation);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C07711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                Object objCopydefault = C56442yFn.copydefault();
                                int i = this.label;
                                if (i == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    this.this$0.proposalStorageRepository.deleteProposal$sign_release(this.$proposerPublicKey);
                                    VerifyContextStorageRepository verifyContextStorageRepository = this.this$0.verifyContextStorageRepository;
                                    long requestId = this.$proposal.getRequestId();
                                    this.label = 1;
                                    if (verifyContextStorageRepository.delete(requestId, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj);
                                }
                                this.$trace.add(Trace.Session.SESSION_SETTLE_PUBLISH_SUCCESS);
                                ApproveSessionUseCase approveSessionUseCase = this.this$0;
                                Topic topic = this.$sessionTopic;
                                approveSessionUseCase.logger.log("Session settle sent successfully on topic: " + topic);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            if (i == 0) {
                                C56391yDq.AEQbTJ(obj);
                                C07711 c07711 = new C07711(this.this$0, this.$proposerPublicKey, this.$proposal, this.$trace, this.$sessionTopic, null);
                                this.label = 1;
                                if (SupervisorKt.supervisorScope(c07711, this) == objCopydefault) {
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
                        function0.invoke();
                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(approveSessionUseCase, str, proposalVO, list, topic, null), 3, null);
                    }
                }, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$sessionSettle$3
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

                    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$sessionSettle$3$1, reason: invalid class name */
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

                        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionUseCase$approve$2$sessionSettle$3$1$1, reason: invalid class name and collision with other inner class name */
                        public static final class C07721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ Topic $pairingTopic;
                            public final /* synthetic */ List<String> $trace;
                            public int label;
                            public final /* synthetic */ ApproveSessionUseCase this$0;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C07721(ApproveSessionUseCase approveSessionUseCase, List<String> list, Topic topic, Continuation<? super C07721> continuation) {
                                super(2, continuation);
                                this.this$0 = approveSessionUseCase;
                                this.$trace = list;
                                this.$pairingTopic = topic;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                return new C07721(this.this$0, this.$trace, this.$pairingTopic, continuation);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C07721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                Object objCopydefault = C56442yFn.copydefault();
                                int i = this.label;
                                if (i == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertEventUseCase;
                                    Props props = new Props(null, EventType.Error.SESSION_SETTLE_PUBLISH_FAILURE, new Properties(null, null, null, null, null, null, this.$trace, this.$pairingTopic.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
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
                                C07721 c07721 = new C07721(this.this$0, this.$trace, this.$pairingTopic, null);
                                this.label = 1;
                                if (SupervisorKt.supervisorScope(c07721, this) == objCopydefault) {
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
                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(approveSessionUseCase, list, topic2, null), 3, null);
                        ApproveSessionUseCase approveSessionUseCase2 = approveSessionUseCase;
                        Topic topic5 = topic;
                        approveSessionUseCase2.logger.error("Session settle failure on topic: " + topic5 + ", error: " + th);
                        function1.invoke(th);
                    }
                }, 24, null);
            } catch (Exception e3) {
                e = e3;
                if (e instanceof NoRelayConnectionException) {
                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new ApproveSessionUseCase$approve$2$sessionSettle$4(approveSessionUseCase, list, topic3, null), 3, null);
                }
                if (e instanceof NoInternetConnectionException) {
                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new ApproveSessionUseCase$approve$2$sessionSettle$5(approveSessionUseCase, list, topic3, null), 3, null);
                }
                approveSessionUseCase.sessionStorageRepository.deleteSession(topic4);
                approveSessionUseCase.logger.error("Session settle failure, error: " + e);
                function1.invoke(e);
            }
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.ApproveSessionUseCaseInterface
    public Object approve(@NotNull String str, @NotNull Map<String, EngineDO.Namespace.Session> map, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(str, map, function1, function0, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
