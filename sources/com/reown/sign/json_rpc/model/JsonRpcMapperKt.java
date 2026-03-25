package com.reown.sign.json_rpc.model;

import com.reown.android.internal.common.json_rpc.model.JsonRpcHistoryRecord;
import com.reown.android.internal.common.model.Expiry;
import com.reown.foundation.common.model.Topic;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class JsonRpcMapperKt {
    public static final /* synthetic */ Request toRequest(SignRpc.SessionRequest sessionRequest, JsonRpcHistoryRecord jsonRpcHistoryRecord) {
        Intrinsics.checkNotNullParameter(sessionRequest, "");
        Intrinsics.checkNotNullParameter(jsonRpcHistoryRecord, "");
        return new Request(jsonRpcHistoryRecord.getId(), new Topic(jsonRpcHistoryRecord.getTopic()), sessionRequest.getParams().getRequest().getMethod(), sessionRequest.getParams().getChainId(), sessionRequest.getParams().getRequest().getParams(), sessionRequest.getParams().getRequest().getExpiryTimestamp() != null ? new Expiry(sessionRequest.getParams().getRequest().getExpiryTimestamp().longValue()) : null, jsonRpcHistoryRecord.getTransportType());
    }

    public static final /* synthetic */ Request toRequest(JsonRpcHistoryRecord jsonRpcHistoryRecord, SignParams.SessionRequestParams sessionRequestParams) {
        Intrinsics.checkNotNullParameter(jsonRpcHistoryRecord, "");
        Intrinsics.checkNotNullParameter(sessionRequestParams, "");
        return new Request(jsonRpcHistoryRecord.getId(), new Topic(jsonRpcHistoryRecord.getTopic()), jsonRpcHistoryRecord.getMethod(), sessionRequestParams.getChainId(), sessionRequestParams, null, jsonRpcHistoryRecord.getTransportType(), 32, null);
    }

    public static final /* synthetic */ Request toRequest(JsonRpcHistoryRecord jsonRpcHistoryRecord, SignParams.SessionAuthenticateParams sessionAuthenticateParams) {
        Intrinsics.checkNotNullParameter(jsonRpcHistoryRecord, "");
        Intrinsics.checkNotNullParameter(sessionAuthenticateParams, "");
        return new Request(jsonRpcHistoryRecord.getId(), new Topic(jsonRpcHistoryRecord.getTopic()), jsonRpcHistoryRecord.getMethod(), null, sessionAuthenticateParams, new Expiry(sessionAuthenticateParams.getExpiryTimestamp()), jsonRpcHistoryRecord.getTransportType());
    }

    public static final /* synthetic */ Request toRequest(SignRpc.SessionAuthenticate sessionAuthenticate, JsonRpcHistoryRecord jsonRpcHistoryRecord) {
        Intrinsics.checkNotNullParameter(sessionAuthenticate, "");
        Intrinsics.checkNotNullParameter(jsonRpcHistoryRecord, "");
        return new Request(jsonRpcHistoryRecord.getId(), new Topic(jsonRpcHistoryRecord.getTopic()), jsonRpcHistoryRecord.getMethod(), null, sessionAuthenticate.getParams(), new Expiry(sessionAuthenticate.getParams().getExpiryTimestamp()), jsonRpcHistoryRecord.getTransportType());
    }
}
