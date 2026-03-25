package com.reown.sign.json_rpc.domain;

import com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer;
import com.reown.android.internal.common.json_rpc.model.JsonRpcHistoryRecord;
import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.json_rpc.model.JsonRpcMapperKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetSessionRequestByIdUseCase {
    public final JsonRpcHistory jsonRpcHistory;
    public final JsonRpcSerializer serializer;

    public GetSessionRequestByIdUseCase(@NotNull JsonRpcHistory jsonRpcHistory, @NotNull JsonRpcSerializer jsonRpcSerializer) {
        Intrinsics.checkNotNullParameter(jsonRpcHistory, "");
        Intrinsics.checkNotNullParameter(jsonRpcSerializer, "");
        this.jsonRpcHistory = jsonRpcHistory;
        this.serializer = jsonRpcSerializer;
    }

    public final Request<SignParams.SessionRequestParams> invoke(long j) {
        Object objM7377constructorimpl;
        JsonRpcHistoryRecord recordById = this.jsonRpcHistory.getRecordById(j);
        if (recordById == null) {
            return null;
        }
        JsonRpcSerializer jsonRpcSerializer = this.serializer;
        String body = recordById.getBody();
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
        if (sessionRequest != null) {
            return JsonRpcMapperKt.toRequest(recordById, sessionRequest.getParams());
        }
        return null;
    }
}
