package com.reown.sign.json_rpc.domain;

import com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer;
import com.reown.android.internal.common.json_rpc.model.JsonRpcHistoryRecord;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.foundation.common.model.Topic;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.json_rpc.model.JsonRpcMapperKt;
import com.reown.sign.json_rpc.model.JsonRpcMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetPendingSessionRequestByTopicUseCase implements GetPendingSessionRequestByTopicUseCaseInterface {
    public final JsonRpcHistory jsonRpcHistory;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final JsonRpcSerializer serializer;

    public GetPendingSessionRequestByTopicUseCase(@NotNull JsonRpcHistory jsonRpcHistory, @NotNull JsonRpcSerializer jsonRpcSerializer, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface) {
        Intrinsics.checkNotNullParameter(jsonRpcHistory, "");
        Intrinsics.checkNotNullParameter(jsonRpcSerializer, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        this.jsonRpcHistory = jsonRpcHistory;
        this.serializer = jsonRpcSerializer;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
    }

    /* JADX INFO: renamed from: com.reown.sign.json_rpc.domain.GetPendingSessionRequestByTopicUseCase$getPendingSessionRequests$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends EngineDO.SessionRequest>>, Object> {
        public final /* synthetic */ Topic $topic;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Topic topic, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$topic = topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return GetPendingSessionRequestByTopicUseCase.this.new AnonymousClass2(this.$topic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends EngineDO.SessionRequest>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<EngineDO.SessionRequest>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<EngineDO.SessionRequest>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Request request;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<JsonRpcHistoryRecord> listOfPendingRecordsByTopic = GetPendingSessionRequestByTopicUseCase.this.jsonRpcHistory.getListOfPendingRecordsByTopic(this.$topic);
                ArrayList<JsonRpcHistoryRecord> arrayList = new ArrayList();
                for (Object obj2 : listOfPendingRecordsByTopic) {
                    if (Intrinsics.EZpvd((Object) ((JsonRpcHistoryRecord) obj2).getMethod(), (Object) JsonRpcMethod.WC_SESSION_REQUEST)) {
                        arrayList.add(obj2);
                    }
                }
                GetPendingSessionRequestByTopicUseCase getPendingSessionRequestByTopicUseCase = GetPendingSessionRequestByTopicUseCase.this;
                ArrayList arrayList2 = new ArrayList();
                for (JsonRpcHistoryRecord jsonRpcHistoryRecord : arrayList) {
                    JsonRpcSerializer jsonRpcSerializer = getPendingSessionRequestByTopicUseCase.serializer;
                    String body = jsonRpcHistoryRecord.getBody();
                    try {
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(jsonRpcSerializer.getMoshi().adapter(SignRpc.SessionRequest.class).fromJson(body));
                    } catch (Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    EngineDO.SessionRequest sessionRequest = null;
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    SignRpc.SessionRequest sessionRequest2 = (SignRpc.SessionRequest) objM7377constructorimpl;
                    if (sessionRequest2 != null && (request = JsonRpcMapperKt.toRequest(sessionRequest2, jsonRpcHistoryRecord)) != null) {
                        sessionRequest = EngineMapperKt.toSessionRequest(request, getPendingSessionRequestByTopicUseCase.metadataStorageRepository.getByTopicAndType(new Topic(jsonRpcHistoryRecord.getTopic()), AppMetaDataType.PEER));
                    }
                    if (sessionRequest != null) {
                        arrayList2.add(sessionRequest);
                    }
                }
                return arrayList2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.json_rpc.domain.GetPendingSessionRequestByTopicUseCaseInterface
    public Object getPendingSessionRequests(@NotNull Topic topic, @NotNull Continuation<? super List<EngineDO.SessionRequest>> continuation) {
        return SupervisorKt.supervisorScope(new AnonymousClass2(topic, null), continuation);
    }
}
