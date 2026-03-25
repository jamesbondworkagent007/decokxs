package com.okinc.liveness.lca.data;

import com.okinc.ok_kyc_core.data.lca.LcaObfuscateData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSLightCaptchaVideoParamsRequestMsg {
    public static final int $stable = LcaObfuscateData.$stable;
    private final LcaObfuscateData data;
    private final String websocketCommand;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSLightCaptchaVideoParamsRequestMsg copy$default(WSLightCaptchaVideoParamsRequestMsg wSLightCaptchaVideoParamsRequestMsg, String str, LcaObfuscateData lcaObfuscateData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSLightCaptchaVideoParamsRequestMsg.websocketCommand;
        }
        if ((i & 2) != 0) {
            lcaObfuscateData = wSLightCaptchaVideoParamsRequestMsg.data;
        }
        return wSLightCaptchaVideoParamsRequestMsg.copy(str, lcaObfuscateData);
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
    public final WSLightCaptchaVideoParamsRequestMsg copy(@NotNull String str, @NotNull LcaObfuscateData lcaObfuscateData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lcaObfuscateData, "");
        return new WSLightCaptchaVideoParamsRequestMsg(str, lcaObfuscateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSLightCaptchaVideoParamsRequestMsg)) {
            return false;
        }
        WSLightCaptchaVideoParamsRequestMsg wSLightCaptchaVideoParamsRequestMsg = (WSLightCaptchaVideoParamsRequestMsg) obj;
        return Intrinsics.EZpvd((Object) this.websocketCommand, (Object) wSLightCaptchaVideoParamsRequestMsg.websocketCommand) && Intrinsics.EZpvd(this.data, wSLightCaptchaVideoParamsRequestMsg.data);
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
        return "WSLightCaptchaVideoParamsRequestMsg(websocketCommand=" + this.websocketCommand + ", data=" + this.data + ")";
    }

    public WSLightCaptchaVideoParamsRequestMsg(@NotNull String str, @NotNull LcaObfuscateData lcaObfuscateData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lcaObfuscateData, "");
        this.websocketCommand = str;
        this.data = lcaObfuscateData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("WSLightCaptchaVideoParamsRequestCommand") : (r1v0 java.lang.String))
  (r2v0 com.okinc.ok_kyc_core.data.lca.LcaObfuscateData)
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.lca.LcaObfuscateData):void (m)] (LINE:54) call: com.okinc.liveness.lca.data.WSLightCaptchaVideoParamsRequestMsg.<init>(java.lang.String, com.okinc.ok_kyc_core.data.lca.LcaObfuscateData):void type: THIS */
    public /* synthetic */ WSLightCaptchaVideoParamsRequestMsg(String str, LcaObfuscateData lcaObfuscateData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "WSLightCaptchaVideoParamsRequestCommand" : str, lcaObfuscateData);
    }
}
