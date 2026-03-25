package com.okinc.liveness.lca.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSAuthRequestMsgOriginal {
    public static final int $stable = 0;
    private final WSAuthRequestMsgData data;
    private final String signature;
    private final String websocketCommand;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSAuthRequestMsgOriginal copy$default(WSAuthRequestMsgOriginal wSAuthRequestMsgOriginal, String str, WSAuthRequestMsgData wSAuthRequestMsgData, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSAuthRequestMsgOriginal.websocketCommand;
        }
        if ((i & 2) != 0) {
            wSAuthRequestMsgData = wSAuthRequestMsgOriginal.data;
        }
        if ((i & 4) != 0) {
            str2 = wSAuthRequestMsgOriginal.signature;
        }
        return wSAuthRequestMsgOriginal.copy(str, wSAuthRequestMsgData, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.websocketCommand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSAuthRequestMsgData component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSAuthRequestMsgOriginal copy(@NotNull String str, WSAuthRequestMsgData wSAuthRequestMsgData, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WSAuthRequestMsgOriginal(str, wSAuthRequestMsgData, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSAuthRequestMsgOriginal)) {
            return false;
        }
        WSAuthRequestMsgOriginal wSAuthRequestMsgOriginal = (WSAuthRequestMsgOriginal) obj;
        return Intrinsics.EZpvd((Object) this.websocketCommand, (Object) wSAuthRequestMsgOriginal.websocketCommand) && Intrinsics.EZpvd(this.data, wSAuthRequestMsgOriginal.data) && Intrinsics.EZpvd((Object) this.signature, (Object) wSAuthRequestMsgOriginal.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSAuthRequestMsgData getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebsocketCommand() {
        return this.websocketCommand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.websocketCommand.hashCode();
        WSAuthRequestMsgData wSAuthRequestMsgData = this.data;
        return (((iHashCode * 31) + (wSAuthRequestMsgData == null ? 0 : wSAuthRequestMsgData.hashCode())) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSAuthRequestMsgOriginal(websocketCommand=" + this.websocketCommand + ", data=" + this.data + ", signature=" + this.signature + ")";
    }

    public WSAuthRequestMsgOriginal(@NotNull String str, WSAuthRequestMsgData wSAuthRequestMsgData, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.websocketCommand = str;
        this.data = wSAuthRequestMsgData;
        this.signature = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("WSAuthRequestCommand") : (r1v0 java.lang.String))
  (r2v0 com.okinc.liveness.lca.data.WSAuthRequestMsgData)
  (r3v0 java.lang.String)
 A[MD:(java.lang.String, com.okinc.liveness.lca.data.WSAuthRequestMsgData, java.lang.String):void (m)] (LINE:17) call: com.okinc.liveness.lca.data.WSAuthRequestMsgOriginal.<init>(java.lang.String, com.okinc.liveness.lca.data.WSAuthRequestMsgData, java.lang.String):void type: THIS */
    public /* synthetic */ WSAuthRequestMsgOriginal(String str, WSAuthRequestMsgData wSAuthRequestMsgData, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "WSAuthRequestCommand" : str, wSAuthRequestMsgData, str2);
    }
}
