package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer;
import com.reown.android.internal.common.json_rpc.model.JsonRpcHistoryRecord;
import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.json_rpc.model.JsonRpcMapperKt;
import com.reown.sign.json_rpc.model.JsonRpcMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetPendingAuthenticateRequestUseCase implements GetPendingAuthenticateRequestUseCaseInterface {
    public final JsonRpcHistory jsonRpcHistory;
    public final JsonRpcSerializer serializer;

    public GetPendingAuthenticateRequestUseCase(@NotNull JsonRpcHistory jsonRpcHistory, @NotNull JsonRpcSerializer jsonRpcSerializer) {
        Intrinsics.checkNotNullParameter(jsonRpcHistory, "");
        Intrinsics.checkNotNullParameter(jsonRpcSerializer, "");
        this.jsonRpcHistory = jsonRpcHistory;
        this.serializer = jsonRpcSerializer;
    }

    @Override // com.reown.sign.engine.use_case.calls.GetPendingAuthenticateRequestUseCaseInterface
    public Object getPendingAuthenticateRequests(@NotNull Continuation<? super List<Request<SignParams.SessionAuthenticateParams>>> continuation) {
        Object objM7377constructorimpl;
        List<JsonRpcHistoryRecord> listOfPendingRecords = this.jsonRpcHistory.getListOfPendingRecords();
        ArrayList<JsonRpcHistoryRecord> arrayList = new ArrayList();
        for (Object obj : listOfPendingRecords) {
            if (Intrinsics.EZpvd((Object) ((JsonRpcHistoryRecord) obj).getMethod(), (Object) JsonRpcMethod.WC_SESSION_AUTHENTICATE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (JsonRpcHistoryRecord jsonRpcHistoryRecord : arrayList) {
            JsonRpcSerializer jsonRpcSerializer = this.serializer;
            String body = jsonRpcHistoryRecord.getBody();
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(jsonRpcSerializer.getMoshi().adapter(SignRpc.SessionAuthenticate.class).fromJson(body));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            SignRpc.SessionAuthenticate sessionAuthenticate = (SignRpc.SessionAuthenticate) objM7377constructorimpl;
            Request request = sessionAuthenticate != null ? JsonRpcMapperKt.toRequest(sessionAuthenticate, jsonRpcHistoryRecord) : null;
            if (request != null) {
                arrayList2.add(request);
            }
        }
        return arrayList2;
    }
}
