package com.reown.android.internal.common.model.sync;

import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class ClientJsonRpc {
    public final long id;
    public final String jsonrpc;
    public final String method;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ClientJsonRpc copy$default(ClientJsonRpc clientJsonRpc, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = clientJsonRpc.id;
        }
        if ((i & 2) != 0) {
            str = clientJsonRpc.jsonrpc;
        }
        if ((i & 4) != 0) {
            str2 = clientJsonRpc.method;
        }
        return clientJsonRpc.copy(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.jsonrpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientJsonRpc copy(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ClientJsonRpc(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientJsonRpc)) {
            return false;
        }
        ClientJsonRpc clientJsonRpc = (ClientJsonRpc) obj;
        return this.id == clientJsonRpc.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) clientJsonRpc.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) clientJsonRpc.method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClientJsonRpc(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ")";
    }

    public ClientJsonRpc(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = j;
        this.jsonrpc = str;
        this.method = str2;
    }
}
