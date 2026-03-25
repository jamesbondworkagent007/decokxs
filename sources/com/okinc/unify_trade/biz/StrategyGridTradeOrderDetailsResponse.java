package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyGridTradeOrderDetailsResponse {
    private String groupId;
    private final String status;
    private String totalPnl;
    private String tradeTime;
    private String tradeUTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyGridTradeOrderDetailsResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyGridTradeOrderDetailsResponse copy$default(StrategyGridTradeOrderDetailsResponse strategyGridTradeOrderDetailsResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyGridTradeOrderDetailsResponse.groupId;
        }
        if ((i & 2) != 0) {
            str2 = strategyGridTradeOrderDetailsResponse.status;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = strategyGridTradeOrderDetailsResponse.tradeTime;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = strategyGridTradeOrderDetailsResponse.totalPnl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = strategyGridTradeOrderDetailsResponse.tradeUTime;
        }
        return strategyGridTradeOrderDetailsResponse.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tradeUTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyGridTradeOrderDetailsResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new StrategyGridTradeOrderDetailsResponse(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyGridTradeOrderDetailsResponse)) {
            return false;
        }
        StrategyGridTradeOrderDetailsResponse strategyGridTradeOrderDetailsResponse = (StrategyGridTradeOrderDetailsResponse) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) strategyGridTradeOrderDetailsResponse.groupId) && Intrinsics.EZpvd((Object) this.status, (Object) strategyGridTradeOrderDetailsResponse.status) && Intrinsics.EZpvd((Object) this.tradeTime, (Object) strategyGridTradeOrderDetailsResponse.tradeTime) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) strategyGridTradeOrderDetailsResponse.totalPnl) && Intrinsics.EZpvd((Object) this.tradeUTime, (Object) strategyGridTradeOrderDetailsResponse.tradeUTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeTime() {
        return this.tradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeUTime() {
        return this.tradeUTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.groupId.hashCode() * 31) + this.status.hashCode()) * 31) + this.tradeTime.hashCode()) * 31) + this.totalPnl.hashCode()) * 31) + this.tradeUTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeUTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeUTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyGridTradeOrderDetailsResponse(groupId=" + this.groupId + ", status=" + this.status + ", tradeTime=" + this.tradeTime + ", totalPnl=" + this.totalPnl + ", tradeUTime=" + this.tradeUTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyGridTradeOrderDetailsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyGridTradeOrderDetailsResponse> serializer() {
            return StrategyGridTradeOrderDetailsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyGridTradeOrderDetailsResponse(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = "";
        } else {
            this.groupId = str;
        }
        if ((i & 2) == 0) {
            this.status = "";
        } else {
            this.status = str2;
        }
        if ((i & 4) == 0) {
            this.tradeTime = "";
        } else {
            this.tradeTime = str3;
        }
        if ((i & 8) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str4;
        }
        if ((i & 16) == 0) {
            this.tradeUTime = "";
        } else {
            this.tradeUTime = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyGridTradeOrderDetailsResponse strategyGridTradeOrderDetailsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyGridTradeOrderDetailsResponse.groupId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyGridTradeOrderDetailsResponse.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyGridTradeOrderDetailsResponse.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyGridTradeOrderDetailsResponse.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyGridTradeOrderDetailsResponse.tradeTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyGridTradeOrderDetailsResponse.tradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyGridTradeOrderDetailsResponse.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyGridTradeOrderDetailsResponse.totalPnl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) strategyGridTradeOrderDetailsResponse.tradeUTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyGridTradeOrderDetailsResponse.tradeUTime);
    }

    public StrategyGridTradeOrderDetailsResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.groupId = str;
        this.status = str2;
        this.tradeTime = str3;
        this.totalPnl = str4;
        this.tradeUTime = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1744) call: com.okinc.unify_trade.biz.StrategyGridTradeOrderDetailsResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyGridTradeOrderDetailsResponse(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
