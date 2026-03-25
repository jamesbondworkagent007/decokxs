package com.okinc.liveness.lca.data;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSLightCaptchaVideoParamsRequestMsgDescriptionData {
    public static final int $stable = 8;
    private final List<Object> description;
    private final String deviceToken;
    private final Map<String, Object> extras;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.data.WSLightCaptchaVideoParamsRequestMsgDescriptionData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSLightCaptchaVideoParamsRequestMsgDescriptionData copy$default(WSLightCaptchaVideoParamsRequestMsgDescriptionData wSLightCaptchaVideoParamsRequestMsgDescriptionData, List list, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wSLightCaptchaVideoParamsRequestMsgDescriptionData.description;
        }
        if ((i & 2) != 0) {
            str = wSLightCaptchaVideoParamsRequestMsgDescriptionData.deviceToken;
        }
        if ((i & 4) != 0) {
            map = wSLightCaptchaVideoParamsRequestMsgDescriptionData.extras;
        }
        return wSLightCaptchaVideoParamsRequestMsgDescriptionData.copy(list, str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component1() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.deviceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> component3() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSLightCaptchaVideoParamsRequestMsgDescriptionData copy(@NotNull List<? extends Object> list, @NotNull String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new WSLightCaptchaVideoParamsRequestMsgDescriptionData(list, str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSLightCaptchaVideoParamsRequestMsgDescriptionData)) {
            return false;
        }
        WSLightCaptchaVideoParamsRequestMsgDescriptionData wSLightCaptchaVideoParamsRequestMsgDescriptionData = (WSLightCaptchaVideoParamsRequestMsgDescriptionData) obj;
        return Intrinsics.EZpvd(this.description, wSLightCaptchaVideoParamsRequestMsgDescriptionData.description) && Intrinsics.EZpvd((Object) this.deviceToken, (Object) wSLightCaptchaVideoParamsRequestMsgDescriptionData.deviceToken) && Intrinsics.EZpvd(this.extras, wSLightCaptchaVideoParamsRequestMsgDescriptionData.extras);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceToken() {
        return this.deviceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> getExtras() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.description.hashCode();
        int iHashCode2 = this.deviceToken.hashCode();
        Map<String, Object> map = this.extras;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSLightCaptchaVideoParamsRequestMsgDescriptionData(description=" + this.description + ", deviceToken=" + this.deviceToken + ", extras=" + this.extras + ")";
    }

    public WSLightCaptchaVideoParamsRequestMsgDescriptionData(@NotNull List<? extends Object> list, @NotNull String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.description = list;
        this.deviceToken = str;
        this.extras = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
 A[MD:(java.util.List<? extends java.lang.Object>, java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>):void (m)] (LINE:61) call: com.okinc.liveness.lca.data.WSLightCaptchaVideoParamsRequestMsgDescriptionData.<init>(java.util.List, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ WSLightCaptchaVideoParamsRequestMsgDescriptionData(List list, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : map);
    }
}
