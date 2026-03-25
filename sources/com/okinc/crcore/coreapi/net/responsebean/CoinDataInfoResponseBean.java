package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CoinDataInfoResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String code;
    private final String flowTotal;
    private final String fullyDilutedValuation;
    private final String high_price;
    private final String holdTime;
    private final String issuePrice;
    private final Long issueTime;
    private final String marketCap;
    private final String marketCapRank;
    private final String vol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinDataInfoResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fullyDilutedValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.vol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.high_price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.flowTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.issueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.issuePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.holdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.marketCapRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDataInfoResponseBean copy(String str, String str2, @NotNull String str3, String str4, Long l, String str5, String str6, String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new CoinDataInfoResponseBean(str, str2, str3, str4, l, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinDataInfoResponseBean)) {
            return false;
        }
        CoinDataInfoResponseBean coinDataInfoResponseBean = (CoinDataInfoResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) coinDataInfoResponseBean.code) && Intrinsics.EZpvd((Object) this.vol, (Object) coinDataInfoResponseBean.vol) && Intrinsics.EZpvd((Object) this.high_price, (Object) coinDataInfoResponseBean.high_price) && Intrinsics.EZpvd((Object) this.flowTotal, (Object) coinDataInfoResponseBean.flowTotal) && Intrinsics.EZpvd(this.issueTime, coinDataInfoResponseBean.issueTime) && Intrinsics.EZpvd((Object) this.issuePrice, (Object) coinDataInfoResponseBean.issuePrice) && Intrinsics.EZpvd((Object) this.marketCap, (Object) coinDataInfoResponseBean.marketCap) && Intrinsics.EZpvd((Object) this.holdTime, (Object) coinDataInfoResponseBean.holdTime) && Intrinsics.EZpvd((Object) this.marketCapRank, (Object) coinDataInfoResponseBean.marketCapRank) && Intrinsics.EZpvd((Object) this.fullyDilutedValuation, (Object) coinDataInfoResponseBean.fullyDilutedValuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlowTotal() {
        return this.flowTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullyDilutedValuation() {
        return this.fullyDilutedValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHigh_price() {
        return this.high_price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldTime() {
        return this.holdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIssuePrice() {
        return this.issuePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getIssueTime() {
        return this.issueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCapRank() {
        return this.marketCapRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVol() {
        return this.vol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.code;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.vol;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.high_price.hashCode();
        String str3 = this.flowTotal;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Long l = this.issueTime;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str4 = this.issuePrice;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.marketCap;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.holdTime;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.marketCapRank.hashCode()) * 31) + this.fullyDilutedValuation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinDataInfoResponseBean(code=" + this.code + ", vol=" + this.vol + ", high_price=" + this.high_price + ", flowTotal=" + this.flowTotal + ", issueTime=" + this.issueTime + ", issuePrice=" + this.issuePrice + ", marketCap=" + this.marketCap + ", holdTime=" + this.holdTime + ", marketCapRank=" + this.marketCapRank + ", fullyDilutedValuation=" + this.fullyDilutedValuation + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.CoinDataInfoResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinDataInfoResponseBean> serializer() {
            return CoinDataInfoResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinDataInfoResponseBean(int i, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.vol = "";
        } else {
            this.vol = str2;
        }
        if ((i & 4) == 0) {
            this.high_price = "";
        } else {
            this.high_price = str3;
        }
        if ((i & 8) == 0) {
            this.flowTotal = "";
        } else {
            this.flowTotal = str4;
        }
        if ((i & 16) == 0) {
            this.issueTime = 0L;
        } else {
            this.issueTime = l;
        }
        if ((i & 32) == 0) {
            this.issuePrice = "";
        } else {
            this.issuePrice = str5;
        }
        if ((i & 64) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str6;
        }
        if ((i & 128) == 0) {
            this.holdTime = "";
        } else {
            this.holdTime = str7;
        }
        if ((i & 256) == 0) {
            this.marketCapRank = "";
        } else {
            this.marketCapRank = str8;
        }
        if ((i & 512) == 0) {
            this.fullyDilutedValuation = "";
        } else {
            this.fullyDilutedValuation = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CoinDataInfoResponseBean coinDataInfoResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinDataInfoResponseBean.code, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, coinDataInfoResponseBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) coinDataInfoResponseBean.vol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, coinDataInfoResponseBean.vol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) coinDataInfoResponseBean.high_price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, coinDataInfoResponseBean.high_price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) coinDataInfoResponseBean.flowTotal, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, coinDataInfoResponseBean.flowTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (l = coinDataInfoResponseBean.issueTime) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, coinDataInfoResponseBean.issueTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) coinDataInfoResponseBean.issuePrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, coinDataInfoResponseBean.issuePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) coinDataInfoResponseBean.marketCap, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, coinDataInfoResponseBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) coinDataInfoResponseBean.holdTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, coinDataInfoResponseBean.holdTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) coinDataInfoResponseBean.marketCapRank, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, coinDataInfoResponseBean.marketCapRank);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) coinDataInfoResponseBean.fullyDilutedValuation, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, coinDataInfoResponseBean.fullyDilutedValuation);
    }

    public CoinDataInfoResponseBean(String str, String str2, @NotNull String str3, String str4, Long l, String str5, String str6, String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.code = str;
        this.vol = str2;
        this.high_price = str3;
        this.flowTotal = str4;
        this.issueTime = l;
        this.issuePrice = str5;
        this.marketCap = str6;
        this.holdTime = str7;
        this.marketCapRank = str8;
        this.fullyDilutedValuation = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.CoinDataInfoResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinDataInfoResponseBean(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : l, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) == 0 ? str9 : "");
    }
}
