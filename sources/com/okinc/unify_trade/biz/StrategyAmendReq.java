package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class StrategyAmendReq {
    private String algoClOrdId;
    private String algoId;
    private List<BizModifyTriggerOrderReq> attachAlgoOrds;
    private String newOrdPx;
    private String newSz;
    private String newTriggerPx;
    private String newTriggerPxType;
    private String ordType;
    private String proposedPx;
    private String reqId;
    private String sourceEnum;
    private String stgyName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(BizModifyTriggerOrderReq$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyAmendReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BizModifyTriggerOrderReq> component10() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.sourceEnum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.newOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.proposedPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.newSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.newTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.newTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyAmendReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, List<BizModifyTriggerOrderReq> list, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new StrategyAmendReq(str, str2, str3, str4, str5, str6, str7, str8, str9, list, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyAmendReq)) {
            return false;
        }
        StrategyAmendReq strategyAmendReq = (StrategyAmendReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) strategyAmendReq.algoId) && Intrinsics.EZpvd((Object) this.stgyName, (Object) strategyAmendReq.stgyName) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyAmendReq.ordType) && Intrinsics.EZpvd((Object) this.algoClOrdId, (Object) strategyAmendReq.algoClOrdId) && Intrinsics.EZpvd((Object) this.newOrdPx, (Object) strategyAmendReq.newOrdPx) && Intrinsics.EZpvd((Object) this.proposedPx, (Object) strategyAmendReq.proposedPx) && Intrinsics.EZpvd((Object) this.newSz, (Object) strategyAmendReq.newSz) && Intrinsics.EZpvd((Object) this.newTriggerPx, (Object) strategyAmendReq.newTriggerPx) && Intrinsics.EZpvd((Object) this.newTriggerPxType, (Object) strategyAmendReq.newTriggerPxType) && Intrinsics.EZpvd(this.attachAlgoOrds, strategyAmendReq.attachAlgoOrds) && Intrinsics.EZpvd((Object) this.reqId, (Object) strategyAmendReq.reqId) && Intrinsics.EZpvd((Object) this.sourceEnum, (Object) strategyAmendReq.sourceEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoClOrdId() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BizModifyTriggerOrderReq> getAttachAlgoOrds() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewOrdPx() {
        return this.newOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewSz() {
        return this.newSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewTriggerPx() {
        return this.newTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewTriggerPxType() {
        return this.newTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposedPx() {
        return this.proposedPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceEnum() {
        return this.sourceEnum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.stgyName.hashCode();
        int iHashCode3 = this.ordType.hashCode();
        int iHashCode4 = this.algoClOrdId.hashCode();
        int iHashCode5 = this.newOrdPx.hashCode();
        int iHashCode6 = this.proposedPx.hashCode();
        int iHashCode7 = this.newSz.hashCode();
        int iHashCode8 = this.newTriggerPx.hashCode();
        int iHashCode9 = this.newTriggerPxType.hashCode();
        List<BizModifyTriggerOrderReq> list = this.attachAlgoOrds;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.reqId.hashCode()) * 31) + this.sourceEnum.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoClOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoClOrdId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrds(List<BizModifyTriggerOrderReq> list) {
        this.attachAlgoOrds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.newOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.newSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.newTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewTriggerPxType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.newTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProposedPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.proposedPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReqId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceEnum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceEnum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyAmendReq(algoId=" + this.algoId + ", stgyName=" + this.stgyName + ", ordType=" + this.ordType + ", algoClOrdId=" + this.algoClOrdId + ", newOrdPx=" + this.newOrdPx + ", proposedPx=" + this.proposedPx + ", newSz=" + this.newSz + ", newTriggerPx=" + this.newTriggerPx + ", newTriggerPxType=" + this.newTriggerPxType + ", attachAlgoOrds=" + this.attachAlgoOrds + ", reqId=" + this.reqId + ", sourceEnum=" + this.sourceEnum + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyAmendReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyAmendReq> serializer() {
            return StrategyAmendReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyAmendReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.stgyName = "";
        } else {
            this.stgyName = str2;
        }
        if ((i & 4) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str3;
        }
        if ((i & 8) == 0) {
            this.algoClOrdId = "";
        } else {
            this.algoClOrdId = str4;
        }
        if ((i & 16) == 0) {
            this.newOrdPx = "";
        } else {
            this.newOrdPx = str5;
        }
        if ((i & 32) == 0) {
            this.proposedPx = "";
        } else {
            this.proposedPx = str6;
        }
        if ((i & 64) == 0) {
            this.newSz = "";
        } else {
            this.newSz = str7;
        }
        if ((i & 128) == 0) {
            this.newTriggerPx = "";
        } else {
            this.newTriggerPx = str8;
        }
        if ((i & 256) == 0) {
            this.newTriggerPxType = "";
        } else {
            this.newTriggerPxType = str9;
        }
        if ((i & 512) == 0) {
            this.attachAlgoOrds = null;
        } else {
            this.attachAlgoOrds = list;
        }
        if ((i & 1024) == 0) {
            this.reqId = "";
        } else {
            this.reqId = str10;
        }
        if ((i & 2048) == 0) {
            this.sourceEnum = "";
        } else {
            this.sourceEnum = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyAmendReq strategyAmendReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyAmendReq.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyAmendReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyAmendReq.stgyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyAmendReq.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyAmendReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyAmendReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyAmendReq.algoClOrdId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyAmendReq.algoClOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyAmendReq.newOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyAmendReq.newOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyAmendReq.proposedPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyAmendReq.proposedPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyAmendReq.newSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyAmendReq.newSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyAmendReq.newTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyAmendReq.newTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyAmendReq.newTriggerPxType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyAmendReq.newTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || strategyAmendReq.attachAlgoOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], strategyAmendReq.attachAlgoOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) strategyAmendReq.reqId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, strategyAmendReq.reqId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) strategyAmendReq.sourceEnum, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, strategyAmendReq.sourceEnum);
    }

    public StrategyAmendReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, List<BizModifyTriggerOrderReq> list, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.algoId = str;
        this.stgyName = str2;
        this.ordType = str3;
        this.algoClOrdId = str4;
        this.newOrdPx = str5;
        this.proposedPx = str6;
        this.newSz = str7;
        this.newTriggerPx = str8;
        this.newTriggerPxType = str9;
        this.attachAlgoOrds = list;
        this.reqId = str10;
        this.sourceEnum = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.BizModifyTriggerOrderReq>, java.lang.String, java.lang.String):void (m)] (LINE:1302) call: com.okinc.unify_trade.biz.StrategyAmendReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyAmendReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? "" : str10, (i & 2048) == 0 ? str11 : "");
    }
}
