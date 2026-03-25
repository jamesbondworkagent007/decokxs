package com.okinc.liveness.lca.data;

import com.okinc.ok_kyc_core.data.lca.LcaObfuscateData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSAuthResponseMsg {
    public static final int $stable = LcaObfuscateData.$stable;
    private final LcaObfuscateData data;
    private final String websocketCommand;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSAuthResponseMsg copy$default(WSAuthResponseMsg wSAuthResponseMsg, String str, LcaObfuscateData lcaObfuscateData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSAuthResponseMsg.websocketCommand;
        }
        if ((i & 2) != 0) {
            lcaObfuscateData = wSAuthResponseMsg.data;
        }
        return wSAuthResponseMsg.copy(str, lcaObfuscateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.websocketCommand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaObfuscateData component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSAuthResponseMsg copy(@NotNull String str, @NotNull LcaObfuscateData lcaObfuscateData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lcaObfuscateData, "");
        return new WSAuthResponseMsg(str, lcaObfuscateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSAuthResponseMsg)) {
            return false;
        }
        WSAuthResponseMsg wSAuthResponseMsg = (WSAuthResponseMsg) obj;
        return Intrinsics.EZpvd((Object) this.websocketCommand, (Object) wSAuthResponseMsg.websocketCommand) && Intrinsics.EZpvd(this.data, wSAuthResponseMsg.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaObfuscateData getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebsocketCommand() {
        return this.websocketCommand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.websocketCommand.hashCode() * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSAuthResponseMsg(websocketCommand=" + this.websocketCommand + ", data=" + this.data + ")";
    }

    public WSAuthResponseMsg(@NotNull String str, @NotNull LcaObfuscateData lcaObfuscateData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lcaObfuscateData, "");
        this.websocketCommand = str;
        this.data = lcaObfuscateData;
    }
}
