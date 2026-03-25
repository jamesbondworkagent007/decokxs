package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class OverviewData {
    public final BasicInfoData basicInfo;
    public final String bundleHoldingRatio;
    public final String devHoldingRatio;
    public final LearnMoreData learnMore;
    public final String localErrorCode;
    public final MarketInfoData marketInfo;
    public final MemeInfoData memeInfo;
    public final RwaTradingInfoData rwaTradingInfo;
    public final SocialMediaData socialMedia;
    public final String suspiciousHoldingRatio;
    public final List<CompactTagData> tokenType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OverviewData() {
        this((MarketInfoData) null, (LearnMoreData) null, (SocialMediaData) null, (BasicInfoData) null, (String) null, (MemeInfoData) null, (String) null, (String) null, (String) null, (List) null, (RwaTradingInfoData) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SocialMediaData AYXKKw() {
        return this.socialMedia;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeInfoData AhwBna() {
        return this.memeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> DbNXlk() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.bundleHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfoData OLrzqt() {
        return this.basicInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OverviewData OLrzqt(MarketInfoData marketInfoData, LearnMoreData learnMoreData, SocialMediaData socialMediaData, BasicInfoData basicInfoData, @NotNull String str, MemeInfoData memeInfoData, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<CompactTagData> list, RwaTradingInfoData rwaTradingInfoData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new OverviewData(marketInfoData, learnMoreData, socialMediaData, basicInfoData, str, memeInfoData, str2, str3, str4, list, rwaTradingInfoData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LearnMoreData copydefault() {
        return this.learnMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.suspiciousHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverviewData)) {
            return false;
        }
        OverviewData overviewData = (OverviewData) obj;
        return Intrinsics.EZpvd(this.marketInfo, overviewData.marketInfo) && Intrinsics.EZpvd(this.learnMore, overviewData.learnMore) && Intrinsics.EZpvd(this.socialMedia, overviewData.socialMedia) && Intrinsics.EZpvd(this.basicInfo, overviewData.basicInfo) && Intrinsics.EZpvd((Object) this.localErrorCode, (Object) overviewData.localErrorCode) && Intrinsics.EZpvd(this.memeInfo, overviewData.memeInfo) && Intrinsics.EZpvd((Object) this.bundleHoldingRatio, (Object) overviewData.bundleHoldingRatio) && Intrinsics.EZpvd((Object) this.devHoldingRatio, (Object) overviewData.devHoldingRatio) && Intrinsics.EZpvd((Object) this.suspiciousHoldingRatio, (Object) overviewData.suspiciousHoldingRatio) && Intrinsics.EZpvd(this.tokenType, overviewData.tokenType) && Intrinsics.EZpvd(this.rwaTradingInfo, overviewData.rwaTradingInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInfoData gEmmrt() {
        return this.marketInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MarketInfoData marketInfoData = this.marketInfo;
        int iHashCode = marketInfoData == null ? 0 : marketInfoData.hashCode();
        LearnMoreData learnMoreData = this.learnMore;
        int iHashCode2 = learnMoreData == null ? 0 : learnMoreData.hashCode();
        SocialMediaData socialMediaData = this.socialMedia;
        int iHashCode3 = socialMediaData == null ? 0 : socialMediaData.hashCode();
        BasicInfoData basicInfoData = this.basicInfo;
        int iHashCode4 = basicInfoData == null ? 0 : basicInfoData.hashCode();
        int iHashCode5 = this.localErrorCode.hashCode();
        MemeInfoData memeInfoData = this.memeInfo;
        int iHashCode6 = memeInfoData == null ? 0 : memeInfoData.hashCode();
        int iHashCode7 = this.bundleHoldingRatio.hashCode();
        int iHashCode8 = this.devHoldingRatio.hashCode();
        int iHashCode9 = this.suspiciousHoldingRatio.hashCode();
        int iHashCode10 = this.tokenType.hashCode();
        RwaTradingInfoData rwaTradingInfoData = this.rwaTradingInfo;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (rwaTradingInfoData != null ? rwaTradingInfoData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OverviewData(marketInfo=" + this.marketInfo + ", learnMore=" + this.learnMore + ", socialMedia=" + this.socialMedia + ", basicInfo=" + this.basicInfo + ", localErrorCode=" + this.localErrorCode + ", memeInfo=" + this.memeInfo + ", bundleHoldingRatio=" + this.bundleHoldingRatio + ", devHoldingRatio=" + this.devHoldingRatio + ", suspiciousHoldingRatio=" + this.suspiciousHoldingRatio + ", tokenType=" + this.tokenType + ", rwaTradingInfo=" + this.rwaTradingInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RwaTradingInfoData valueOf() {
        return this.rwaTradingInfo;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.OverviewData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OverviewData> serializer() {
            return OverviewData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OverviewData(int i, MarketInfoData marketInfoData, LearnMoreData learnMoreData, SocialMediaData socialMediaData, BasicInfoData basicInfoData, String str, MemeInfoData memeInfoData, String str2, String str3, String str4, List list, RwaTradingInfoData rwaTradingInfoData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.marketInfo = null;
        } else {
            this.marketInfo = marketInfoData;
        }
        if ((i & 2) == 0) {
            this.learnMore = null;
        } else {
            this.learnMore = learnMoreData;
        }
        if ((i & 4) == 0) {
            this.socialMedia = null;
        } else {
            this.socialMedia = socialMediaData;
        }
        if ((i & 8) == 0) {
            this.basicInfo = null;
        } else {
            this.basicInfo = basicInfoData;
        }
        if ((i & 16) == 0) {
            this.localErrorCode = "";
        } else {
            this.localErrorCode = str;
        }
        if ((i & 32) == 0) {
            this.memeInfo = null;
        } else {
            this.memeInfo = memeInfoData;
        }
        if ((i & 64) == 0) {
            this.bundleHoldingRatio = "";
        } else {
            this.bundleHoldingRatio = str2;
        }
        if ((i & 128) == 0) {
            this.devHoldingRatio = "";
        } else {
            this.devHoldingRatio = str3;
        }
        if ((i & 256) == 0) {
            this.suspiciousHoldingRatio = "";
        } else {
            this.suspiciousHoldingRatio = str4;
        }
        if ((i & 512) == 0) {
            this.tokenType = yDY.AhwBna();
        } else {
            this.tokenType = list;
        }
        if ((i & 1024) == 0) {
            this.rwaTradingInfo = null;
        } else {
            this.rwaTradingInfo = rwaTradingInfoData;
        }
    }

    public static final /* synthetic */ void AEQbTJ(OverviewData overviewData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || overviewData.marketInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, MarketInfoData$$serializer.INSTANCE, overviewData.marketInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || overviewData.learnMore != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LearnMoreData$$serializer.INSTANCE, overviewData.learnMore);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || overviewData.socialMedia != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SocialMediaData$$serializer.INSTANCE, overviewData.socialMedia);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || overviewData.basicInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BasicInfoData$$serializer.INSTANCE, overviewData.basicInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) overviewData.localErrorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, overviewData.localErrorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || overviewData.memeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, MemeInfoData$$serializer.INSTANCE, overviewData.memeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) overviewData.bundleHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, overviewData.bundleHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) overviewData.devHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, overviewData.devHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) overviewData.suspiciousHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, overviewData.suspiciousHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(overviewData.tokenType, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], overviewData.tokenType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && overviewData.rwaTradingInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, RwaTradingInfoData$$serializer.INSTANCE, overviewData.rwaTradingInfo);
    }

    public OverviewData(MarketInfoData marketInfoData, LearnMoreData learnMoreData, SocialMediaData socialMediaData, BasicInfoData basicInfoData, @NotNull String str, MemeInfoData memeInfoData, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<CompactTagData> list, RwaTradingInfoData rwaTradingInfoData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.marketInfo = marketInfoData;
        this.learnMore = learnMoreData;
        this.socialMedia = socialMediaData;
        this.basicInfo = basicInfoData;
        this.localErrorCode = str;
        this.memeInfo = memeInfoData;
        this.bundleHoldingRatio = str2;
        this.devHoldingRatio = str3;
        this.suspiciousHoldingRatio = str4;
        this.tokenType = list;
        this.rwaTradingInfo = rwaTradingInfoData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:com.okinc.business.market.data.model.MarketInfoData:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.MarketInfoData) : (r13v0 com.okinc.business.market.data.model.MarketInfoData))
  (wrap:com.okinc.business.market.data.model.LearnMoreData:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.LearnMoreData) : (r14v0 com.okinc.business.market.data.model.LearnMoreData))
  (wrap:com.okinc.business.market.data.model.SocialMediaData:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.SocialMediaData) : (r15v0 com.okinc.business.market.data.model.SocialMediaData))
  (wrap:com.okinc.business.market.data.model.BasicInfoData:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.BasicInfoData) : (r16v0 com.okinc.business.market.data.model.BasicInfoData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:com.okinc.business.market.data.model.MemeInfoData:?: TERNARY null = ((wrap:int:0x002a: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.MemeInfoData) : (r18v0 com.okinc.business.market.data.model.MemeInfoData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r24v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r22v0 java.util.List))
  (wrap:com.okinc.business.market.data.model.RwaTradingInfoData:?: TERNARY null = ((wrap:int:0x0054: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 com.okinc.business.market.data.model.RwaTradingInfoData) : (null com.okinc.business.market.data.model.RwaTradingInfoData))
 A[MD:(com.okinc.business.market.data.model.MarketInfoData, com.okinc.business.market.data.model.LearnMoreData, com.okinc.business.market.data.model.SocialMediaData, com.okinc.business.market.data.model.BasicInfoData, java.lang.String, com.okinc.business.market.data.model.MemeInfoData, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, com.okinc.business.market.data.model.RwaTradingInfoData):void (m)] (LINE:7) call: com.okinc.business.market.data.model.OverviewData.<init>(com.okinc.business.market.data.model.MarketInfoData, com.okinc.business.market.data.model.LearnMoreData, com.okinc.business.market.data.model.SocialMediaData, com.okinc.business.market.data.model.BasicInfoData, java.lang.String, com.okinc.business.market.data.model.MemeInfoData, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.market.data.model.RwaTradingInfoData):void type: THIS */
    public /* synthetic */ OverviewData(MarketInfoData marketInfoData, LearnMoreData learnMoreData, SocialMediaData socialMediaData, BasicInfoData basicInfoData, String str, MemeInfoData memeInfoData, String str2, String str3, String str4, List list, RwaTradingInfoData rwaTradingInfoData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marketInfoData, (i & 2) != 0 ? null : learnMoreData, (i & 4) != 0 ? null : socialMediaData, (i & 8) != 0 ? null : basicInfoData, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : memeInfoData, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? yDY.AhwBna() : list, (i & 1024) == 0 ? rwaTradingInfoData : null);
    }
}
