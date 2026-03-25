package com.okinc.core.livelistener;

import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIncomingData {
    public static final int $stable = 8;
    private String action;
    private boolean isInitialData;
    private String originMsg;
    private Object payload;
    private HashMap<String, String> source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.core.livelistener.OKIncomingData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OKIncomingData copy$default(OKIncomingData oKIncomingData, HashMap map, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            map = oKIncomingData.source;
        }
        if ((i & 2) != 0) {
            obj = oKIncomingData.payload;
        }
        return oKIncomingData.copy(map, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component1() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component2() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKIncomingData copy(HashMap<String, String> map, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return new OKIncomingData(map, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKIncomingData)) {
            return false;
        }
        OKIncomingData oKIncomingData = (OKIncomingData) obj;
        return Intrinsics.EZpvd(this.source, oKIncomingData.source) && Intrinsics.EZpvd(this.payload, oKIncomingData.payload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginMsg() {
        return this.originMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        HashMap<String, String> map = this.source;
        return ((map == null ? 0 : map.hashCode()) * 31) + this.payload.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInitialData() {
        return this.isInitialData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(String str) {
        this.action = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitialData(boolean z) {
        this.isInitialData = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginMsg(String str) {
        this.originMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayload(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.payload = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(HashMap<String, String> map) {
        this.source = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKIncomingData(source=" + this.source + ", payload=" + this.payload + ")";
    }

    public OKIncomingData(HashMap<String, String> map, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.source = map;
        this.payload = obj;
        this.isInitialData = true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r1v0 java.util.HashMap))
  (r2v0 java.lang.Object)
 A[MD:(java.util.HashMap<java.lang.String, java.lang.String>, java.lang.Object):void (m)] (LINE:13) call: com.okinc.core.livelistener.OKIncomingData.<init>(java.util.HashMap, java.lang.Object):void type: THIS */
    public /* synthetic */ OKIncomingData(HashMap map, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, obj);
    }
}
