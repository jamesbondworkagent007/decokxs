package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyOrderBillDetailsReq {
    private String after;
    private String algoId;
    private String before;
    private String cycleId;
    private String groupId;
    private String limit;
    private String ordId;
    private String ordType;
    private String side;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyOrderBillDetailsReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.after;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.before;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyOrderBillDetailsReq copy(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8, @NotNull String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new StrategyOrderBillDetailsReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyOrderBillDetailsReq)) {
            return false;
        }
        StrategyOrderBillDetailsReq strategyOrderBillDetailsReq = (StrategyOrderBillDetailsReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) strategyOrderBillDetailsReq.algoId) && Intrinsics.EZpvd((Object) this.type, (Object) strategyOrderBillDetailsReq.type) && Intrinsics.EZpvd((Object) this.side, (Object) strategyOrderBillDetailsReq.side) && Intrinsics.EZpvd((Object) this.groupId, (Object) strategyOrderBillDetailsReq.groupId) && Intrinsics.EZpvd((Object) this.ordId, (Object) strategyOrderBillDetailsReq.ordId) && Intrinsics.EZpvd((Object) this.after, (Object) strategyOrderBillDetailsReq.after) && Intrinsics.EZpvd((Object) this.before, (Object) strategyOrderBillDetailsReq.before) && Intrinsics.EZpvd((Object) this.limit, (Object) strategyOrderBillDetailsReq.limit) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyOrderBillDetailsReq.ordType) && Intrinsics.EZpvd((Object) this.cycleId, (Object) strategyOrderBillDetailsReq.cycleId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAfter() {
        return this.after;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBefore() {
        return this.before;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycleId() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.type.hashCode();
        String str = this.side;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.groupId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ordId;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.after;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.before;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.limit;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        int iHashCode9 = this.ordType.hashCode();
        String str7 = this.cycleId;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAfter(String str) {
        this.after = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBefore(String str) {
        this.before = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCycleId(String str) {
        this.cycleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupId(String str) {
        this.groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimit(String str) {
        this.limit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(String str) {
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyOrderBillDetailsReq(algoId=" + this.algoId + ", type=" + this.type + ", side=" + this.side + ", groupId=" + this.groupId + ", ordId=" + this.ordId + ", after=" + this.after + ", before=" + this.before + ", limit=" + this.limit + ", ordType=" + this.ordType + ", cycleId=" + this.cycleId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyOrderBillDetailsReq> serializer() {
            return StrategyOrderBillDetailsReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyOrderBillDetailsReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.side = null;
        } else {
            this.side = str3;
        }
        if ((i & 8) == 0) {
            this.groupId = null;
        } else {
            this.groupId = str4;
        }
        if ((i & 16) == 0) {
            this.ordId = null;
        } else {
            this.ordId = str5;
        }
        if ((i & 32) == 0) {
            this.after = null;
        } else {
            this.after = str6;
        }
        if ((i & 64) == 0) {
            this.before = null;
        } else {
            this.before = str7;
        }
        if ((i & 128) == 0) {
            this.limit = null;
        } else {
            this.limit = str8;
        }
        if ((i & 256) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str9;
        }
        if ((i & 512) == 0) {
            this.cycleId = null;
        } else {
            this.cycleId = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyOrderBillDetailsReq strategyOrderBillDetailsReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsReq.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyOrderBillDetailsReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsReq.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyOrderBillDetailsReq.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || strategyOrderBillDetailsReq.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, strategyOrderBillDetailsReq.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || strategyOrderBillDetailsReq.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, strategyOrderBillDetailsReq.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || strategyOrderBillDetailsReq.ordId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, strategyOrderBillDetailsReq.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || strategyOrderBillDetailsReq.after != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, strategyOrderBillDetailsReq.after);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || strategyOrderBillDetailsReq.before != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, strategyOrderBillDetailsReq.before);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || strategyOrderBillDetailsReq.limit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, strategyOrderBillDetailsReq.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyOrderBillDetailsReq.ordType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && strategyOrderBillDetailsReq.cycleId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, strategyOrderBillDetailsReq.cycleId);
    }

    public StrategyOrderBillDetailsReq(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8, @NotNull String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.algoId = str;
        this.type = str2;
        this.side = str3;
        this.groupId = str4;
        this.ordId = str5;
        this.after = str6;
        this.before = str7;
        this.limit = str8;
        this.ordType = str9;
        this.cycleId = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0063: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1829) call: com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyOrderBillDetailsReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : "", (i & 512) == 0 ? str10 : null);
    }
}
