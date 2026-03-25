package com.okinc.unify_trade.biz;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class CallAuctionInfoData {
    private final String auctionEndTime;
    private final String eqPx;
    private final String instId;
    private final String matchedSz;
    private String state;
    private final String ts;
    private final String unmatchedSz;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CallAuctionInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CallAuctionInfoData copy$default(CallAuctionInfoData callAuctionInfoData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callAuctionInfoData.ts;
        }
        if ((i & 2) != 0) {
            str2 = callAuctionInfoData.unmatchedSz;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = callAuctionInfoData.instId;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = callAuctionInfoData.matchedSz;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = callAuctionInfoData.auctionEndTime;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = callAuctionInfoData.eqPx;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = callAuctionInfoData.state;
        }
        return callAuctionInfoData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.unmatchedSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.matchedSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.auctionEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.eqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallAuctionInfoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new CallAuctionInfoData(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallAuctionInfoData)) {
            return false;
        }
        CallAuctionInfoData callAuctionInfoData = (CallAuctionInfoData) obj;
        return Intrinsics.EZpvd((Object) this.ts, (Object) callAuctionInfoData.ts) && Intrinsics.EZpvd((Object) this.unmatchedSz, (Object) callAuctionInfoData.unmatchedSz) && Intrinsics.EZpvd((Object) this.instId, (Object) callAuctionInfoData.instId) && Intrinsics.EZpvd((Object) this.matchedSz, (Object) callAuctionInfoData.matchedSz) && Intrinsics.EZpvd((Object) this.auctionEndTime, (Object) callAuctionInfoData.auctionEndTime) && Intrinsics.EZpvd((Object) this.eqPx, (Object) callAuctionInfoData.eqPx) && Intrinsics.EZpvd((Object) this.state, (Object) callAuctionInfoData.state);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuctionEndTime() {
        return this.auctionEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEqPx() {
        return this.eqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMatchedSz() {
        return this.matchedSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnmatchedSz() {
        return this.unmatchedSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.ts.hashCode() * 31) + this.unmatchedSz.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.matchedSz.hashCode()) * 31) + this.auctionEndTime.hashCode()) * 31) + this.eqPx.hashCode()) * 31) + this.state.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CallAuctionInfoData(ts=" + this.ts + ", unmatchedSz=" + this.unmatchedSz + ", instId=" + this.instId + ", matchedSz=" + this.matchedSz + ", auctionEndTime=" + this.auctionEndTime + ", eqPx=" + this.eqPx + ", state=" + this.state + ")";
    }

    public /* synthetic */ CallAuctionInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ts = "";
        } else {
            this.ts = str;
        }
        if ((i & 2) == 0) {
            this.unmatchedSz = "";
        } else {
            this.unmatchedSz = str2;
        }
        if ((i & 4) == 0) {
            this.instId = "";
        } else {
            this.instId = str3;
        }
        if ((i & 8) == 0) {
            this.matchedSz = "";
        } else {
            this.matchedSz = str4;
        }
        if ((i & 16) == 0) {
            this.auctionEndTime = "";
        } else {
            this.auctionEndTime = str5;
        }
        if ((i & 32) == 0) {
            this.eqPx = "";
        } else {
            this.eqPx = str6;
        }
        if ((i & 64) == 0) {
            this.state = "";
        } else {
            this.state = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CallAuctionInfoData callAuctionInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) callAuctionInfoData.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, callAuctionInfoData.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) callAuctionInfoData.unmatchedSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, callAuctionInfoData.unmatchedSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) callAuctionInfoData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, callAuctionInfoData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) callAuctionInfoData.matchedSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, callAuctionInfoData.matchedSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) callAuctionInfoData.auctionEndTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, callAuctionInfoData.auctionEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) callAuctionInfoData.eqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, callAuctionInfoData.eqPx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) callAuctionInfoData.state, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, callAuctionInfoData.state);
    }

    public CallAuctionInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.ts = str;
        this.unmatchedSz = str2;
        this.instId = str3;
        this.matchedSz = str4;
        this.auctionEndTime = str5;
        this.eqPx = str6;
        this.state = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:440) call: com.okinc.unify_trade.biz.CallAuctionInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CallAuctionInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public static final class Companion {

        public static final class Application extends TypeToken<List<? extends CallAuctionInfoData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CallAuctionInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CallAuctionInfoData> serializer() {
            return CallAuctionInfoData$$serializer.INSTANCE;
        }

        public final CallAuctionInfoData AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new Application().getType());
                if (list != null && !list.isEmpty()) {
                    return (CallAuctionInfoData) list.get(0);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "CallAuctionInfoData-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }
}
