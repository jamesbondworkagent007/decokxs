package com.reown.android.internal.common.model;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.foundation.common.model.Topic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WCResponse {
    public final String method;
    public final ClientParams params;
    public final JsonRpcResponse response;
    public final Topic topic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WCResponse copy$default(WCResponse wCResponse, Topic topic, String str, JsonRpcResponse jsonRpcResponse, ClientParams clientParams, int i, Object obj) {
        if ((i & 1) != 0) {
            topic = wCResponse.topic;
        }
        if ((i & 2) != 0) {
            str = wCResponse.method;
        }
        if ((i & 4) != 0) {
            jsonRpcResponse = wCResponse.response;
        }
        if ((i & 8) != 0) {
            clientParams = wCResponse.params;
        }
        return wCResponse.copy(topic, str, jsonRpcResponse, clientParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic component1() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonRpcResponse component3() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientParams component4() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WCResponse copy(@NotNull Topic topic, @NotNull String str, @NotNull JsonRpcResponse jsonRpcResponse, @NotNull ClientParams clientParams) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
        Intrinsics.checkNotNullParameter(clientParams, "");
        return new WCResponse(topic, str, jsonRpcResponse, clientParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCResponse)) {
            return false;
        }
        WCResponse wCResponse = (WCResponse) obj;
        return Intrinsics.EZpvd(this.topic, wCResponse.topic) && Intrinsics.EZpvd((Object) this.method, (Object) wCResponse.method) && Intrinsics.EZpvd(this.response, wCResponse.response) && Intrinsics.EZpvd(this.params, wCResponse.params);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientParams getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonRpcResponse getResponse() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.topic.hashCode() * 31) + this.method.hashCode()) * 31) + this.response.hashCode()) * 31) + this.params.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WCResponse(topic=" + this.topic + ", method=" + this.method + ", response=" + this.response + ", params=" + this.params + ")";
    }

    public WCResponse(@NotNull Topic topic, @NotNull String str, @NotNull JsonRpcResponse jsonRpcResponse, @NotNull ClientParams clientParams) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
        Intrinsics.checkNotNullParameter(clientParams, "");
        this.topic = topic;
        this.method = str;
        this.response = jsonRpcResponse;
        this.params = clientParams;
    }
}
