package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyStopReq {
    private String algoId;
    private PlaceOrderCondition closeCondition;
    private String closePosSlippage;
    private String instId;
    private String ordType;
    private String stopType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyStopReq copy$default(StrategyStopReq strategyStopReq, String str, String str2, String str3, String str4, PlaceOrderCondition placeOrderCondition, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyStopReq.algoId;
        }
        if ((i & 2) != 0) {
            str2 = strategyStopReq.instId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = strategyStopReq.ordType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = strategyStopReq.stopType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            placeOrderCondition = strategyStopReq.closeCondition;
        }
        PlaceOrderCondition placeOrderCondition2 = placeOrderCondition;
        if ((i & 32) != 0) {
            str5 = strategyStopReq.closePosSlippage;
        }
        return strategyStopReq.copy(str, str6, str7, str8, placeOrderCondition2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition component5() {
        return this.closeCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.closePosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyStopReq copy(@NotNull String str, String str2, String str3, String str4, PlaceOrderCondition placeOrderCondition, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new StrategyStopReq(str, str2, str3, str4, placeOrderCondition, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyStopReq)) {
            return false;
        }
        StrategyStopReq strategyStopReq = (StrategyStopReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) strategyStopReq.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) strategyStopReq.instId) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyStopReq.ordType) && Intrinsics.EZpvd((Object) this.stopType, (Object) strategyStopReq.stopType) && Intrinsics.EZpvd(this.closeCondition, strategyStopReq.closeCondition) && Intrinsics.EZpvd((Object) this.closePosSlippage, (Object) strategyStopReq.closePosSlippage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition getCloseCondition() {
        return this.closeCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClosePosSlippage() {
        return this.closePosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopType() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        String str = this.instId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.ordType;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.stopType;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        PlaceOrderCondition placeOrderCondition = this.closeCondition;
        int iHashCode5 = placeOrderCondition == null ? 0 : placeOrderCondition.hashCode();
        String str4 = this.closePosSlippage;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseCondition(PlaceOrderCondition placeOrderCondition) {
        this.closeCondition = placeOrderCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClosePosSlippage(String str) {
        this.closePosSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(String str) {
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopType(String str) {
        this.stopType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyStopReq(algoId=" + this.algoId + ", instId=" + this.instId + ", ordType=" + this.ordType + ", stopType=" + this.stopType + ", closeCondition=" + this.closeCondition + ", closePosSlippage=" + this.closePosSlippage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyStopReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyStopReq> serializer() {
            return StrategyStopReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyStopReq(int i, String str, String str2, String str3, String str4, PlaceOrderCondition placeOrderCondition, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, StrategyStopReq$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        if ((i & 2) == 0) {
            this.instId = null;
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.ordType = null;
        } else {
            this.ordType = str3;
        }
        if ((i & 8) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str4;
        }
        if ((i & 16) == 0) {
            this.closeCondition = null;
        } else {
            this.closeCondition = placeOrderCondition;
        }
        if ((i & 32) == 0) {
            this.closePosSlippage = null;
        } else {
            this.closePosSlippage = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyStopReq strategyStopReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyStopReq.algoId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || strategyStopReq.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, strategyStopReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || strategyStopReq.ordType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, strategyStopReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || strategyStopReq.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, strategyStopReq.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || strategyStopReq.closeCondition != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, PlaceOrderCondition$$serializer.INSTANCE, strategyStopReq.closeCondition);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && strategyStopReq.closePosSlippage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, strategyStopReq.closePosSlippage);
    }

    public StrategyStopReq(@NotNull String str, String str2, String str3, String str4, PlaceOrderCondition placeOrderCondition, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
        this.instId = str2;
        this.ordType = str3;
        this.stopType = str4;
        this.closeCondition = placeOrderCondition;
        this.closePosSlippage = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.PlaceOrderCondition:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.PlaceOrderCondition) : (r11v0 com.okinc.unify_trade.biz.PlaceOrderCondition))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.PlaceOrderCondition, java.lang.String):void (m)] (LINE:1519) call: com.okinc.unify_trade.biz.StrategyStopReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.PlaceOrderCondition, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyStopReq(String str, String str2, String str3, String str4, PlaceOrderCondition placeOrderCondition, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : placeOrderCondition, (i & 32) == 0 ? str5 : null);
    }
}
