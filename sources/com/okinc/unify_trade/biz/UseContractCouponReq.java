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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class UseContractCouponReq {
    private String bizRefId;
    private String bizRefType;
    private String brokerId;
    private String instId;
    private String lever;
    private String ordType;
    private String posSide;
    private String px;
    private String side;
    private String sz;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UseContractCouponReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.bizRefId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UseContractCouponReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, @NotNull String str7, @NotNull String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new UseContractCouponReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UseContractCouponReq)) {
            return false;
        }
        UseContractCouponReq useContractCouponReq = (UseContractCouponReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) useContractCouponReq.instId) && Intrinsics.EZpvd((Object) this.side, (Object) useContractCouponReq.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) useContractCouponReq.posSide) && Intrinsics.EZpvd((Object) this.ordType, (Object) useContractCouponReq.ordType) && Intrinsics.EZpvd((Object) this.px, (Object) useContractCouponReq.px) && Intrinsics.EZpvd((Object) this.sz, (Object) useContractCouponReq.sz) && Intrinsics.EZpvd((Object) this.lever, (Object) useContractCouponReq.lever) && Intrinsics.EZpvd((Object) this.brokerId, (Object) useContractCouponReq.brokerId) && Intrinsics.EZpvd((Object) this.bizRefId, (Object) useContractCouponReq.bizRefId) && Intrinsics.EZpvd((Object) this.bizRefType, (Object) useContractCouponReq.bizRefType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizRefId() {
        return this.bizRefId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizRefType() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrokerId() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.side.hashCode();
        int iHashCode3 = this.posSide.hashCode();
        int iHashCode4 = this.ordType.hashCode();
        String str = this.px;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.sz;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        int iHashCode7 = this.lever.hashCode();
        int iHashCode8 = this.brokerId.hashCode();
        String str3 = this.bizRefId;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bizRefType;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizRefId(String str) {
        this.bizRefId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizRefType(String str) {
        this.bizRefType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrokerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.brokerId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(String str) {
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UseContractCouponReq(instId=" + this.instId + ", side=" + this.side + ", posSide=" + this.posSide + ", ordType=" + this.ordType + ", px=" + this.px + ", sz=" + this.sz + ", lever=" + this.lever + ", brokerId=" + this.brokerId + ", bizRefId=" + this.bizRefId + ", bizRefType=" + this.bizRefType + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UseContractCouponReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UseContractCouponReq> serializer() {
            return UseContractCouponReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UseContractCouponReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.side = "";
        } else {
            this.side = str2;
        }
        if ((i & 4) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str3;
        }
        if ((i & 8) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str4;
        }
        if ((i & 16) == 0) {
            this.px = null;
        } else {
            this.px = str5;
        }
        if ((i & 32) == 0) {
            this.sz = null;
        } else {
            this.sz = str6;
        }
        if ((i & 64) == 0) {
            this.lever = "";
        } else {
            this.lever = str7;
        }
        if ((i & 128) == 0) {
            this.brokerId = "";
        } else {
            this.brokerId = str8;
        }
        if ((i & 256) == 0) {
            this.bizRefId = null;
        } else {
            this.bizRefId = str9;
        }
        if ((i & 512) == 0) {
            this.bizRefType = null;
        } else {
            this.bizRefType = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UseContractCouponReq useContractCouponReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) useContractCouponReq.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, useContractCouponReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) useContractCouponReq.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, useContractCouponReq.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) useContractCouponReq.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, useContractCouponReq.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) useContractCouponReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, useContractCouponReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || useContractCouponReq.px != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, useContractCouponReq.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || useContractCouponReq.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, useContractCouponReq.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) useContractCouponReq.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, useContractCouponReq.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) useContractCouponReq.brokerId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, useContractCouponReq.brokerId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || useContractCouponReq.bizRefId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, useContractCouponReq.bizRefId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && useContractCouponReq.bizRefType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, useContractCouponReq.bizRefType);
    }

    public UseContractCouponReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, @NotNull String str7, @NotNull String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.instId = str;
        this.side = str2;
        this.posSide = str3;
        this.ordType = str4;
        this.px = str5;
        this.sz = str6;
        this.lever = str7;
        this.brokerId = str8;
        this.bizRefId = str9;
        this.bizRefType = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1209) call: com.okinc.unify_trade.biz.UseContractCouponReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UseContractCouponReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
