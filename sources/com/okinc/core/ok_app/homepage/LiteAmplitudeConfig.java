package com.okinc.core.ok_app.homepage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class LiteAmplitudeConfig {
    public static final int $stable = 8;
    private String serverUrl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiteAmplitudeConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiteAmplitudeConfig copy$default(LiteAmplitudeConfig liteAmplitudeConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liteAmplitudeConfig.serverUrl;
        }
        return liteAmplitudeConfig.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.serverUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiteAmplitudeConfig copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LiteAmplitudeConfig(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiteAmplitudeConfig) && Intrinsics.EZpvd((Object) this.serverUrl, (Object) ((LiteAmplitudeConfig) obj).serverUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.serverUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServerUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serverUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiteAmplitudeConfig(serverUrl=" + this.serverUrl + ")";
    }

    public LiteAmplitudeConfig(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serverUrl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:11) call: com.okinc.core.ok_app.homepage.LiteAmplitudeConfig.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ LiteAmplitudeConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
