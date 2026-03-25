package com.reown.android.internal.common.model.type;

import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.WCResponse;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes12.dex */
public interface JsonRpcInteractorInterface {
    SharedFlow<WCRequest> getClientSyncJsonRpc();

    SharedFlow<SDKError> getInternalErrors();

    SharedFlow<WCResponse> getPeerResponse();
}
