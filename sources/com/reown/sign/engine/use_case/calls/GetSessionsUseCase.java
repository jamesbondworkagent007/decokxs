package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import com.reown.utils.UtilFunctionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetSessionsUseCase implements GetSessionsUseCaseInterface {
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final AppMetaData selfAppMetaData;
    public final SessionStorageRepository sessionStorageRepository;

    public GetSessionsUseCase(@NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull AppMetaData appMetaData) {
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.selfAppMetaData = appMetaData;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.GetSessionsUseCase$getListOfSettledSessions$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends EngineDO.Session>>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return GetSessionsUseCase.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends EngineDO.Session>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<EngineDO.Session>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<EngineDO.Session>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List listOfSessionVOsWithoutMetadata = GetSessionsUseCase.this.sessionStorageRepository.getListOfSessionVOsWithoutMetadata();
                ArrayList<SessionVO> arrayList = new ArrayList();
                for (Object obj2 : listOfSessionVOsWithoutMetadata) {
                    SessionVO sessionVO = (SessionVO) obj2;
                    if (sessionVO.isAcknowledged() && UtilFunctionsKt.isSequenceValid(sessionVO.getExpiry())) {
                        arrayList.add(obj2);
                    }
                }
                GetSessionsUseCase getSessionsUseCase = GetSessionsUseCase.this;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (SessionVO sessionVO2 : arrayList) {
                    arrayList2.add(sessionVO2.m7336copyBsNgfLQ((65215 & 1) != 0 ? sessionVO2.topic : null, (65215 & 2) != 0 ? sessionVO2.expiry : null, (65215 & 4) != 0 ? sessionVO2.relayProtocol : null, (65215 & 8) != 0 ? sessionVO2.relayData : null, (65215 & 16) != 0 ? sessionVO2.controllerKey : null, (65215 & 32) != 0 ? sessionVO2.selfPublicKey : null, (65215 & 64) != 0 ? sessionVO2.selfAppMetaData : getSessionsUseCase.selfAppMetaData, (65215 & 128) != 0 ? sessionVO2.peerPublicKey : null, (65215 & 256) != 0 ? sessionVO2.peerAppMetaData : getSessionsUseCase.metadataStorageRepository.getByTopicAndType(sessionVO2.getTopic(), AppMetaDataType.PEER), (65215 & 512) != 0 ? sessionVO2.sessionNamespaces : null, (65215 & 1024) != 0 ? sessionVO2.requiredNamespaces : null, (65215 & 2048) != 0 ? sessionVO2.optionalNamespaces : null, (65215 & 4096) != 0 ? sessionVO2.properties : null, (65215 & 8192) != 0 ? sessionVO2.isAcknowledged : false, (65215 & 16384) != 0 ? sessionVO2.pairingTopic : null, (65215 & 32768) != 0 ? sessionVO2.transportType : null));
                }
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(EngineMapperKt.toEngineDO((SessionVO) it.next()));
                }
                return arrayList3;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.GetSessionsUseCaseInterface
    public Object getListOfSettledSessions(@NotNull Continuation<? super List<EngineDO.Session>> continuation) {
        return SupervisorKt.supervisorScope(new AnonymousClass2(null), continuation);
    }
}
