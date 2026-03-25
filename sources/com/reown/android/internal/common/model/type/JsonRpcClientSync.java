package com.reown.android.internal.common.model.type;

import com.reown.android.internal.common.model.type.ClientParams;

/* JADX INFO: loaded from: classes12.dex */
public interface JsonRpcClientSync<T extends ClientParams> extends SerializableJsonRpc {
    long getId();

    String getJsonrpc();

    String getMethod();

    T getParams();
}
