package com.okinc.okmarket.app.callauction.ws.data.model;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xVJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class CallAuctionData {
    public static final int $stable = 0;
    public static final Application Companion = new Application(null);
    private final String instId;
    private final String instType;
    private final String state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CallAuctionData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CallAuctionData copy$default(CallAuctionData callAuctionData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callAuctionData.instId;
        }
        if ((i & 2) != 0) {
            str2 = callAuctionData.state;
        }
        if ((i & 4) != 0) {
            str3 = callAuctionData.instType;
        }
        return callAuctionData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallAuctionData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CallAuctionData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallAuctionData)) {
            return false;
        }
        CallAuctionData callAuctionData = (CallAuctionData) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) callAuctionData.instId) && Intrinsics.EZpvd((Object) this.state, (Object) callAuctionData.state) && Intrinsics.EZpvd((Object) this.instType, (Object) callAuctionData.instType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.instId.hashCode() * 31) + this.state.hashCode()) * 31) + this.instType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CallAuctionData(instId=" + this.instId + ", state=" + this.state + ", instType=" + this.instType + ")";
    }

    public CallAuctionData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.instId = str;
        this.state = str2;
        this.instType = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CallAuctionData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public static final class Application {

        public static final class StateListAnimator extends TypeToken<List<? extends CallAuctionResponse>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionData.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final List<CallAuctionData> EZpvd(@NotNull String str) {
            CallAuctionResponse callAuctionResponse;
            Intrinsics.checkNotNullParameter(str, "");
            xVJ xvj = xVJ.KWHzl;
            Type type = new StateListAnimator().getType();
            Intrinsics.copydefault(type);
            List list = (List) xvj.OLrzqt(str, type, true);
            if (list == null || (callAuctionResponse = (CallAuctionResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
                return null;
            }
            return callAuctionResponse.getCallAuctionInstList();
        }
    }
}
