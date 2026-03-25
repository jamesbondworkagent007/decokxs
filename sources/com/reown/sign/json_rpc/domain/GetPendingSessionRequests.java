package com.reown.sign.json_rpc.domain;

import com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer;
import com.reown.android.internal.common.json_rpc.model.JsonRpcHistoryRecord;
import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
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
public final class GetPendingSessionRequests {
    public final JsonRpcHistory jsonRpcHistory;
    public final JsonRpcSerializer serializer;

    public GetPendingSessionRequests(@NotNull JsonRpcHistory jsonRpcHistory, @NotNull JsonRpcSerializer jsonRpcSerializer) {
        Intrinsics.checkNotNullParameter(jsonRpcHistory, "");
        Intrinsics.checkNotNullParameter(jsonRpcSerializer, "");
        this.jsonRpcHistory = jsonRpcHistory;
        this.serializer = jsonRpcSerializer;
    }

    /* JADX INFO: renamed from: com.reown.sign.json_rpc.domain.GetPendingSessionRequests$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Request<String>>>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return GetPendingSessionRequests.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Request<String>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Request<String>>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<Request<String>>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM7377constructorimpl;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<JsonRpcHistoryRecord> listOfPendingRecords = GetPendingSessionRequests.this.jsonRpcHistory.getListOfPendingRecords();
                ArrayList<JsonRpcHistoryRecord> arrayList = new ArrayList();
                for (Object obj2 : listOfPendingRecords) {
                    if (Intrinsics.EZpvd((Object) ((JsonRpcHistoryRecord) obj2).getMethod(), (Object) JsonRpcMethod.WC_SESSION_REQUEST)) {
                        arrayList.add(obj2);
                    }
                }
                GetPendingSessionRequests getPendingSessionRequests = GetPendingSessionRequests.this;
                ArrayList arrayList2 = new ArrayList();
                for (JsonRpcHistoryRecord jsonRpcHistoryRecord : arrayList) {
                    JsonRpcSerializer jsonRpcSerializer = getPendingSessionRequests.serializer;
                    String body = jsonRpcHistoryRecord.getBody();
                    try {
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(jsonRpcSerializer.getMoshi().adapter(SignRpc.SessionRequest.class).fromJson(body));
                    } catch (Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    SignRpc.SessionRequest sessionRequest = (SignRpc.SessionRequest) objM7377constructorimpl;
                    Request request = sessionRequest != null ? JsonRpcMapperKt.toRequest(sessionRequest, jsonRpcHistoryRecord) : null;
                    if (request != null) {
                        arrayList2.add(request);
                    }
                }
                return arrayList2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object invoke(@NotNull Continuation<? super List<Request<String>>> continuation) {
        return SupervisorKt.supervisorScope(new AnonymousClass2(null), continuation);
    }
}
