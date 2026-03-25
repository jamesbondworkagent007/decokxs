package com.okinc.liveness.lca.data;

import com.okinc.ok_kyc_core.data.lca.LcaObfuscateData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSAuthRequestMsgObfuscated {
    public static final int $stable = LcaObfuscateData.$stable;
    private final LcaObfuscateData data;
    private final String signature;
    private final String websocketCommand;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSAuthRequestMsgObfuscated copy$default(WSAuthRequestMsgObfuscated wSAuthRequestMsgObfuscated, String str, LcaObfuscateData lcaObfuscateData, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSAuthRequestMsgObfuscated.websocketCommand;
        }
        if ((i & 2) != 0) {
            lcaObfuscateData = wSAuthRequestMsgObfuscated.data;
        }
        if ((i & 4) != 0) {
            str2 = wSAuthRequestMsgObfuscated.signature;
        }
        return wSAuthRequestMsgObfuscated.copy(str, lcaObfuscateData, str2);
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
    public final String component3() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSAuthRequestMsgObfuscated copy(@NotNull String str, LcaObfuscateData lcaObfuscateData, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WSAuthRequestMsgObfuscated(str, lcaObfuscateData, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSAuthRequestMsgObfuscated)) {
            return false;
        }
        WSAuthRequestMsgObfuscated wSAuthRequestMsgObfuscated = (WSAuthRequestMsgObfuscated) obj;
        return Intrinsics.EZpvd((Object) this.websocketCommand, (Object) wSAuthRequestMsgObfuscated.websocketCommand) && Intrinsics.EZpvd(this.data, wSAuthRequestMsgObfuscated.data) && Intrinsics.EZpvd((Object) this.signature, (Object) wSAuthRequestMsgObfuscated.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaObfuscateData getData() {
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
        LcaObfuscateData lcaObfuscateData = this.data;
        return (((iHashCode * 31) + (lcaObfuscateData == null ? 0 : lcaObfuscateData.hashCode())) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSAuthRequestMsgObfuscated(websocketCommand=" + this.websocketCommand + ", data=" + this.data + ", signature=" + this.signature + ")";
    }

    public WSAuthRequestMsgObfuscated(@NotNull String str, LcaObfuscateData lcaObfuscateData, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.websocketCommand = str;
        this.data = lcaObfuscateData;
        this.signature = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("WSAuthRequestCommand") : (r1v0 java.lang.String))
  (r2v0 com.okinc.ok_kyc_core.data.lca.LcaObfuscateData)
  (r3v0 java.lang.String)
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.lca.LcaObfuscateData, java.lang.String):void (m)] (LINE:9) call: com.okinc.liveness.lca.data.WSAuthRequestMsgObfuscated.<init>(java.lang.String, com.okinc.ok_kyc_core.data.lca.LcaObfuscateData, java.lang.String):void type: THIS */
    public /* synthetic */ WSAuthRequestMsgObfuscated(String str, LcaObfuscateData lcaObfuscateData, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "WSAuthRequestCommand" : str, lcaObfuscateData, str2);
    }
}
