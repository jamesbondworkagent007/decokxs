package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TradeShareBackgroundData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String alternativeImageUrl;
    private final String alternativeLandscapeUrl;
    private final String disclaimerText;
    private final String imageId;
    private final String imageUrl;
    private final String landscapeImageUrl;
    private final String logoUrl;
    private final String profitType;
    private final String thumbnailUrl;
    private final String trendType;
    private final String vipType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeShareBackgroundData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.alternativeLandscapeUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.disclaimerText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.vipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.profitType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.trendType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.landscapeImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.thumbnailUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.alternativeImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeShareBackgroundData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new TradeShareBackgroundData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeShareBackgroundData)) {
            return false;
        }
        TradeShareBackgroundData tradeShareBackgroundData = (TradeShareBackgroundData) obj;
        return Intrinsics.EZpvd((Object) this.imageId, (Object) tradeShareBackgroundData.imageId) && Intrinsics.EZpvd((Object) this.vipType, (Object) tradeShareBackgroundData.vipType) && Intrinsics.EZpvd((Object) this.profitType, (Object) tradeShareBackgroundData.profitType) && Intrinsics.EZpvd((Object) this.trendType, (Object) tradeShareBackgroundData.trendType) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) tradeShareBackgroundData.imageUrl) && Intrinsics.EZpvd((Object) this.landscapeImageUrl, (Object) tradeShareBackgroundData.landscapeImageUrl) && Intrinsics.EZpvd((Object) this.thumbnailUrl, (Object) tradeShareBackgroundData.thumbnailUrl) && Intrinsics.EZpvd((Object) this.logoUrl, (Object) tradeShareBackgroundData.logoUrl) && Intrinsics.EZpvd((Object) this.alternativeImageUrl, (Object) tradeShareBackgroundData.alternativeImageUrl) && Intrinsics.EZpvd((Object) this.alternativeLandscapeUrl, (Object) tradeShareBackgroundData.alternativeLandscapeUrl) && Intrinsics.EZpvd((Object) this.disclaimerText, (Object) tradeShareBackgroundData.disclaimerText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeImageUrl() {
        return this.alternativeImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeLandscapeUrl() {
        return this.alternativeLandscapeUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageId() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLandscapeImageUrl() {
        return this.landscapeImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitType() {
        return this.profitType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrendType() {
        return this.trendType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVipType() {
        return this.vipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.imageId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.vipType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.profitType;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.trendType;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.imageUrl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.landscapeImageUrl;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.thumbnailUrl;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.logoUrl;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.alternativeImageUrl;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.alternativeLandscapeUrl;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.disclaimerText;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeShareBackgroundData(imageId=" + this.imageId + ", vipType=" + this.vipType + ", profitType=" + this.profitType + ", trendType=" + this.trendType + ", imageUrl=" + this.imageUrl + ", landscapeImageUrl=" + this.landscapeImageUrl + ", thumbnailUrl=" + this.thumbnailUrl + ", logoUrl=" + this.logoUrl + ", alternativeImageUrl=" + this.alternativeImageUrl + ", alternativeLandscapeUrl=" + this.alternativeLandscapeUrl + ", disclaimerText=" + this.disclaimerText + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeShareBackgroundData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeShareBackgroundData> serializer() {
            return TradeShareBackgroundData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeShareBackgroundData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.imageId = null;
        } else {
            this.imageId = str;
        }
        if ((i & 2) == 0) {
            this.vipType = null;
        } else {
            this.vipType = str2;
        }
        if ((i & 4) == 0) {
            this.profitType = null;
        } else {
            this.profitType = str3;
        }
        if ((i & 8) == 0) {
            this.trendType = null;
        } else {
            this.trendType = str4;
        }
        if ((i & 16) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str5;
        }
        if ((i & 32) == 0) {
            this.landscapeImageUrl = null;
        } else {
            this.landscapeImageUrl = str6;
        }
        if ((i & 64) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str7;
        }
        if ((i & 128) == 0) {
            this.logoUrl = null;
        } else {
            this.logoUrl = str8;
        }
        if ((i & 256) == 0) {
            this.alternativeImageUrl = null;
        } else {
            this.alternativeImageUrl = str9;
        }
        if ((i & 512) == 0) {
            this.alternativeLandscapeUrl = null;
        } else {
            this.alternativeLandscapeUrl = str10;
        }
        if ((i & 1024) == 0) {
            this.disclaimerText = null;
        } else {
            this.disclaimerText = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeShareBackgroundData tradeShareBackgroundData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeShareBackgroundData.imageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeShareBackgroundData.imageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeShareBackgroundData.vipType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradeShareBackgroundData.vipType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradeShareBackgroundData.profitType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradeShareBackgroundData.profitType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tradeShareBackgroundData.trendType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tradeShareBackgroundData.trendType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tradeShareBackgroundData.imageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tradeShareBackgroundData.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeShareBackgroundData.landscapeImageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradeShareBackgroundData.landscapeImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradeShareBackgroundData.thumbnailUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tradeShareBackgroundData.thumbnailUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tradeShareBackgroundData.logoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tradeShareBackgroundData.logoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tradeShareBackgroundData.alternativeImageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tradeShareBackgroundData.alternativeImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tradeShareBackgroundData.alternativeLandscapeUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tradeShareBackgroundData.alternativeLandscapeUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && tradeShareBackgroundData.disclaimerText == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, tradeShareBackgroundData.disclaimerText);
    }

    public TradeShareBackgroundData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.imageId = str;
        this.vipType = str2;
        this.profitType = str3;
        this.trendType = str4;
        this.imageUrl = str5;
        this.landscapeImageUrl = str6;
        this.thumbnailUrl = str7;
        this.logoUrl = str8;
        this.alternativeImageUrl = str9;
        this.alternativeLandscapeUrl = str10;
        this.disclaimerText = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5658) call: com.okinc.unify_trade.biz.TradeShareBackgroundData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeShareBackgroundData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null);
    }
}
