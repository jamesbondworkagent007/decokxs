package com.okinc.liveness.lca.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSVideoVerifyResultResponseMsg {
    public static final int $stable = 0;
    private final WSVideoVerifyResultResponseMsgData data;
    private final String websocketCommand;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSVideoVerifyResultResponseMsg copy$default(WSVideoVerifyResultResponseMsg wSVideoVerifyResultResponseMsg, String str, WSVideoVerifyResultResponseMsgData wSVideoVerifyResultResponseMsgData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSVideoVerifyResultResponseMsg.websocketCommand;
        }
        if ((i & 2) != 0) {
            wSVideoVerifyResultResponseMsgData = wSVideoVerifyResultResponseMsg.data;
        }
        return wSVideoVerifyResultResponseMsg.copy(str, wSVideoVerifyResultResponseMsgData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.websocketCommand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSVideoVerifyResultResponseMsgData component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSVideoVerifyResultResponseMsg copy(@NotNull String str, @NotNull WSVideoVerifyResultResponseMsgData wSVideoVerifyResultResponseMsgData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wSVideoVerifyResultResponseMsgData, "");
        return new WSVideoVerifyResultResponseMsg(str, wSVideoVerifyResultResponseMsgData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSVideoVerifyResultResponseMsg)) {
            return false;
        }
        WSVideoVerifyResultResponseMsg wSVideoVerifyResultResponseMsg = (WSVideoVerifyResultResponseMsg) obj;
        return Intrinsics.EZpvd((Object) this.websocketCommand, (Object) wSVideoVerifyResultResponseMsg.websocketCommand) && Intrinsics.EZpvd(this.data, wSVideoVerifyResultResponseMsg.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSVideoVerifyResultResponseMsgData getData() {
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
        return "WSVideoVerifyResultResponseMsg(websocketCommand=" + this.websocketCommand + ", data=" + this.data + ")";
    }

    public WSVideoVerifyResultResponseMsg(@NotNull String str, @NotNull WSVideoVerifyResultResponseMsgData wSVideoVerifyResultResponseMsgData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wSVideoVerifyResultResponseMsgData, "");
        this.websocketCommand = str;
        this.data = wSVideoVerifyResultResponseMsgData;
    }
}
