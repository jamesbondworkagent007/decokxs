package com.okinc.dexkline.market.data.model;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class OverviewData {
    public final BasicInfoData basicInfo;
    public final String bundleHoldingRatio;
    public final String devHoldingRatio;
    public final LearnMoreData learnMore;
    public final String localErrorCode;
    public final MarketInfoData marketInfo;
    public final MemeInfoData memeInfo;
    public final SocialMediaData socialMedia;
    public final String suspiciousHoldingRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OverviewData() {
        this((MarketInfoData) null, (LearnMoreData) null, (SocialMediaData) null, (BasicInfoData) null, (String) null, (MemeInfoData) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OverviewData AEQbTJ(MarketInfoData marketInfoData, LearnMoreData learnMoreData, SocialMediaData socialMediaData, BasicInfoData basicInfoData, @NotNull String str, MemeInfoData memeInfoData, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new OverviewData(marketInfoData, learnMoreData, socialMediaData, basicInfoData, str, memeInfoData, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.suspiciousHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.bundleHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfoData KWHzl() {
        return this.basicInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LearnMoreData OLrzqt() {
        return this.learnMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInfoData copydefault() {
        return this.marketInfo;
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
        return Intrinsics.EZpvd(this.marketInfo, overviewData.marketInfo) && Intrinsics.EZpvd(this.learnMore, overviewData.learnMore) && Intrinsics.EZpvd(this.socialMedia, overviewData.socialMedia) && Intrinsics.EZpvd(this.basicInfo, overviewData.basicInfo) && Intrinsics.EZpvd((Object) this.localErrorCode, (Object) overviewData.localErrorCode) && Intrinsics.EZpvd(this.memeInfo, overviewData.memeInfo) && Intrinsics.EZpvd((Object) this.bundleHoldingRatio, (Object) overviewData.bundleHoldingRatio) && Intrinsics.EZpvd((Object) this.devHoldingRatio, (Object) overviewData.devHoldingRatio) && Intrinsics.EZpvd((Object) this.suspiciousHoldingRatio, (Object) overviewData.suspiciousHoldingRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeInfoData gEmmrt() {
        return this.memeInfo;
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
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (memeInfoData != null ? memeInfoData.hashCode() : 0)) * 31) + this.bundleHoldingRatio.hashCode()) * 31) + this.devHoldingRatio.hashCode()) * 31) + this.suspiciousHoldingRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OverviewData(marketInfo=" + this.marketInfo + ", learnMore=" + this.learnMore + ", socialMedia=" + this.socialMedia + ", basicInfo=" + this.basicInfo + ", localErrorCode=" + this.localErrorCode + ", memeInfo=" + this.memeInfo + ", bundleHoldingRatio=" + this.bundleHoldingRatio + ", devHoldingRatio=" + this.devHoldingRatio + ", suspiciousHoldingRatio=" + this.suspiciousHoldingRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SocialMediaData valueOf() {
        return this.socialMedia;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.OverviewData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OverviewData> serializer() {
            return OverviewData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OverviewData(int i, MarketInfoData marketInfoData, LearnMoreData learnMoreData, SocialMediaData socialMediaData, BasicInfoData basicInfoData, String str, MemeInfoData memeInfoData, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
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
    }

    public static final /* synthetic */ void AEQbTJ(OverviewData overviewData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
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
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) overviewData.suspiciousHoldingRatio, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, overviewData.suspiciousHoldingRatio);
    }

    public OverviewData(MarketInfoData marketInfoData, LearnMoreData learnMoreData, SocialMediaData socialMediaData, BasicInfoData basicInfoData, @NotNull String str, MemeInfoData memeInfoData, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.marketInfo = marketInfoData;
        this.learnMore = learnMoreData;
        this.socialMedia = socialMediaData;
        this.basicInfo = basicInfoData;
        this.localErrorCode = str;
        this.memeInfo = memeInfoData;
        this.bundleHoldingRatio = str2;
        this.devHoldingRatio = str3;
        this.suspiciousHoldingRatio = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:com.okinc.dexkline.market.data.model.MarketInfoData:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.data.model.MarketInfoData) : (r11v0 com.okinc.dexkline.market.data.model.MarketInfoData))
  (wrap:com.okinc.dexkline.market.data.model.LearnMoreData:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.data.model.LearnMoreData) : (r12v0 com.okinc.dexkline.market.data.model.LearnMoreData))
  (wrap:com.okinc.dexkline.market.data.model.SocialMediaData:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.data.model.SocialMediaData) : (r13v0 com.okinc.dexkline.market.data.model.SocialMediaData))
  (wrap:com.okinc.dexkline.market.data.model.BasicInfoData:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.data.model.BasicInfoData) : (r14v0 com.okinc.dexkline.market.data.model.BasicInfoData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:com.okinc.dexkline.market.data.model.MemeInfoData:?: TERNARY null = ((wrap:int:0x0028: ARITH (r20v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r16v0 com.okinc.dexkline.market.data.model.MemeInfoData) : (null com.okinc.dexkline.market.data.model.MemeInfoData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(com.okinc.dexkline.market.data.model.MarketInfoData, com.okinc.dexkline.market.data.model.LearnMoreData, com.okinc.dexkline.market.data.model.SocialMediaData, com.okinc.dexkline.market.data.model.BasicInfoData, java.lang.String, com.okinc.dexkline.market.data.model.MemeInfoData, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.dexkline.market.data.model.OverviewData.<init>(com.okinc.dexkline.market.data.model.MarketInfoData, com.okinc.dexkline.market.data.model.LearnMoreData, com.okinc.dexkline.market.data.model.SocialMediaData, com.okinc.dexkline.market.data.model.BasicInfoData, java.lang.String, com.okinc.dexkline.market.data.model.MemeInfoData, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OverviewData(MarketInfoData marketInfoData, LearnMoreData learnMoreData, SocialMediaData socialMediaData, BasicInfoData basicInfoData, String str, MemeInfoData memeInfoData, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marketInfoData, (i & 2) != 0 ? null : learnMoreData, (i & 4) != 0 ? null : socialMediaData, (i & 8) != 0 ? null : basicInfoData, (i & 16) != 0 ? "" : str, (i & 32) == 0 ? memeInfoData : null, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) == 0 ? str4 : "");
    }
}
