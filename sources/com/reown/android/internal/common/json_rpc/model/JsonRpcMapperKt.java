package com.reown.android.internal.common.json_rpc.model;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.json_rpc.domain.relay.Subscription;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.sync.ClientJsonRpc;
import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.network.model.Relay;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class JsonRpcMapperKt {
    public static final /* synthetic */ WCResponse toWCResponse(JsonRpcHistoryRecord jsonRpcHistoryRecord, JsonRpcResponse jsonRpcResponse, ClientParams clientParams) {
        Intrinsics.checkNotNullParameter(jsonRpcHistoryRecord, "");
        Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
        Intrinsics.checkNotNullParameter(clientParams, "");
        return new WCResponse(new Topic(jsonRpcHistoryRecord.getTopic()), jsonRpcHistoryRecord.getMethod(), jsonRpcResponse, clientParams);
    }

    public static final /* synthetic */ Relay.Model.IrnParams toRelay(IrnParams irnParams) {
        Intrinsics.checkNotNullParameter(irnParams, "");
        return new Relay.Model.IrnParams(irnParams.getTag().getId(), irnParams.getTtl().getSeconds(), irnParams.getPrompt());
    }

    public static final WCRequest toWCRequest(@NotNull Subscription subscription, @NotNull ClientJsonRpc clientJsonRpc, @NotNull ClientParams clientParams, @NotNull TransportType transportType) {
        Intrinsics.checkNotNullParameter(subscription, "");
        Intrinsics.checkNotNullParameter(clientJsonRpc, "");
        Intrinsics.checkNotNullParameter(clientParams, "");
        Intrinsics.checkNotNullParameter(transportType, "");
        return new WCRequest(subscription.getTopic(), clientJsonRpc.getId(), clientJsonRpc.getMethod(), clientParams, subscription.getDecryptedMessage(), subscription.getPublishedAt(), subscription.getEncryptedMessage(), subscription.getAttestation(), transportType);
    }
}
