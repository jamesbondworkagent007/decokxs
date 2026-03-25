package com.okinc.crcore.coreapi.net.responsebean.dex;

import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TokenOverviewResponseBean {
    private final BasicInfo basicInfo;
    private final String bundleHoldingRatio;
    private final String devHoldingRatio;
    private final List<String> ivt;
    private final LearnMore learnMore;
    private final MarketInfo marketInfo;
    private final String snipersClear;
    private final String snipersTotal;
    private final SocialMedia socialMedia;
    private final String suspiciousHoldingRatio;
    private final List<TagItem> t;
    private final TokenTagVO tokenTagVO;
    private final TokenThirdPartInfo tokenThirdPartInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(TagItem$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenOverviewResponseBean() {
        this((BasicInfo) null, (String) null, (String) null, (List) null, (LearnMore) null, (MarketInfo) null, (String) null, (String) null, (SocialMedia) null, (String) null, (List) null, (TokenTagVO) null, (TokenThirdPartInfo) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfo component1() {
        return this.basicInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.suspiciousHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TagItem> component11() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenTagVO component12() {
        return this.tokenTagVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenThirdPartInfo component13() {
        return this.tokenThirdPartInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bundleHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.ivt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LearnMore component5() {
        return this.learnMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInfo component6() {
        return this.marketInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.snipersClear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.snipersTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SocialMedia component9() {
        return this.socialMedia;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenOverviewResponseBean copy(@NotNull BasicInfo basicInfo, @NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull LearnMore learnMore, @NotNull MarketInfo marketInfo, @NotNull String str3, @NotNull String str4, @NotNull SocialMedia socialMedia, @NotNull String str5, @NotNull List<TagItem> list2, @NotNull TokenTagVO tokenTagVO, @NotNull TokenThirdPartInfo tokenThirdPartInfo) {
        Intrinsics.checkNotNullParameter(basicInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(learnMore, "");
        Intrinsics.checkNotNullParameter(marketInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(socialMedia, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(tokenTagVO, "");
        Intrinsics.checkNotNullParameter(tokenThirdPartInfo, "");
        return new TokenOverviewResponseBean(basicInfo, str, str2, list, learnMore, marketInfo, str3, str4, socialMedia, str5, list2, tokenTagVO, tokenThirdPartInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenOverviewResponseBean)) {
            return false;
        }
        TokenOverviewResponseBean tokenOverviewResponseBean = (TokenOverviewResponseBean) obj;
        return Intrinsics.EZpvd(this.basicInfo, tokenOverviewResponseBean.basicInfo) && Intrinsics.EZpvd((Object) this.bundleHoldingRatio, (Object) tokenOverviewResponseBean.bundleHoldingRatio) && Intrinsics.EZpvd((Object) this.devHoldingRatio, (Object) tokenOverviewResponseBean.devHoldingRatio) && Intrinsics.EZpvd(this.ivt, tokenOverviewResponseBean.ivt) && Intrinsics.EZpvd(this.learnMore, tokenOverviewResponseBean.learnMore) && Intrinsics.EZpvd(this.marketInfo, tokenOverviewResponseBean.marketInfo) && Intrinsics.EZpvd((Object) this.snipersClear, (Object) tokenOverviewResponseBean.snipersClear) && Intrinsics.EZpvd((Object) this.snipersTotal, (Object) tokenOverviewResponseBean.snipersTotal) && Intrinsics.EZpvd(this.socialMedia, tokenOverviewResponseBean.socialMedia) && Intrinsics.EZpvd((Object) this.suspiciousHoldingRatio, (Object) tokenOverviewResponseBean.suspiciousHoldingRatio) && Intrinsics.EZpvd(this.t, tokenOverviewResponseBean.t) && Intrinsics.EZpvd(this.tokenTagVO, tokenOverviewResponseBean.tokenTagVO) && Intrinsics.EZpvd(this.tokenThirdPartInfo, tokenOverviewResponseBean.tokenThirdPartInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundleHoldingRatio() {
        return this.bundleHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevHoldingRatio() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIvt() {
        return this.ivt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LearnMore getLearnMore() {
        return this.learnMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInfo getMarketInfo() {
        return this.marketInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSnipersClear() {
        return this.snipersClear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSnipersTotal() {
        return this.snipersTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SocialMedia getSocialMedia() {
        return this.socialMedia;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspiciousHoldingRatio() {
        return this.suspiciousHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TagItem> getT() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenTagVO getTokenTagVO() {
        return this.tokenTagVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenThirdPartInfo getTokenThirdPartInfo() {
        return this.tokenThirdPartInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.basicInfo.hashCode() * 31) + this.bundleHoldingRatio.hashCode()) * 31) + this.devHoldingRatio.hashCode()) * 31) + this.ivt.hashCode()) * 31) + this.learnMore.hashCode()) * 31) + this.marketInfo.hashCode()) * 31) + this.snipersClear.hashCode()) * 31) + this.snipersTotal.hashCode()) * 31) + this.socialMedia.hashCode()) * 31) + this.suspiciousHoldingRatio.hashCode()) * 31) + this.t.hashCode()) * 31) + this.tokenTagVO.hashCode()) * 31) + this.tokenThirdPartInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenOverviewResponseBean(basicInfo=" + this.basicInfo + ", bundleHoldingRatio=" + this.bundleHoldingRatio + ", devHoldingRatio=" + this.devHoldingRatio + ", ivt=" + this.ivt + ", learnMore=" + this.learnMore + ", marketInfo=" + this.marketInfo + ", snipersClear=" + this.snipersClear + ", snipersTotal=" + this.snipersTotal + ", socialMedia=" + this.socialMedia + ", suspiciousHoldingRatio=" + this.suspiciousHoldingRatio + ", t=" + this.t + ", tokenTagVO=" + this.tokenTagVO + ", tokenThirdPartInfo=" + this.tokenThirdPartInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.TokenOverviewResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenOverviewResponseBean> serializer() {
            return TokenOverviewResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenOverviewResponseBean(int i, BasicInfo basicInfo, String str, String str2, List list, LearnMore learnMore, MarketInfo marketInfo, String str3, String str4, SocialMedia socialMedia, String str5, List list2, TokenTagVO tokenTagVO, TokenThirdPartInfo tokenThirdPartInfo, SerializationConstructorMarker serializationConstructorMarker) {
        this.basicInfo = (i & 1) == 0 ? new BasicInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null) : basicInfo;
        if ((i & 2) == 0) {
            this.bundleHoldingRatio = "";
        } else {
            this.bundleHoldingRatio = str;
        }
        if ((i & 4) == 0) {
            this.devHoldingRatio = "";
        } else {
            this.devHoldingRatio = str2;
        }
        this.ivt = (i & 8) == 0 ? yDY.AhwBna() : list;
        this.learnMore = (i & 16) == 0 ? new LearnMore((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : learnMore;
        this.marketInfo = (i & 32) == 0 ? new MarketInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null) : marketInfo;
        if ((i & 64) == 0) {
            this.snipersClear = "";
        } else {
            this.snipersClear = str3;
        }
        if ((i & 128) == 0) {
            this.snipersTotal = "";
        } else {
            this.snipersTotal = str4;
        }
        this.socialMedia = (i & 256) == 0 ? new SocialMedia((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TwitterDetailInfo) null, (String) null, 4095, (DefaultConstructorMarker) null) : socialMedia;
        if ((i & 512) == 0) {
            this.suspiciousHoldingRatio = "";
        } else {
            this.suspiciousHoldingRatio = str5;
        }
        this.t = (i & 1024) == 0 ? yDY.AhwBna() : list2;
        this.tokenTagVO = (i & 2048) == 0 ? new TokenTagVO((TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : tokenTagVO;
        this.tokenThirdPartInfo = (i & 4096) == 0 ? new TokenThirdPartInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : tokenThirdPartInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [6=9] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TokenOverviewResponseBean tokenOverviewResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(tokenOverviewResponseBean.basicInfo, new BasicInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BasicInfo$$serializer.INSTANCE, tokenOverviewResponseBean.basicInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenOverviewResponseBean.bundleHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenOverviewResponseBean.bundleHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenOverviewResponseBean.devHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenOverviewResponseBean.devHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(tokenOverviewResponseBean.ivt, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], tokenOverviewResponseBean.ivt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(tokenOverviewResponseBean.learnMore, new LearnMore((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, LearnMore$$serializer.INSTANCE, tokenOverviewResponseBean.learnMore);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, MarketInfo$$serializer.INSTANCE, tokenOverviewResponseBean.marketInfo);
        } else {
            String str = null;
            if (!Intrinsics.EZpvd(tokenOverviewResponseBean.marketInfo, new MarketInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tokenOverviewResponseBean.snipersClear, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenOverviewResponseBean.snipersClear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tokenOverviewResponseBean.snipersTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tokenOverviewResponseBean.snipersTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(tokenOverviewResponseBean.socialMedia, new SocialMedia((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TwitterDetailInfo) null, (String) null, 4095, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, SocialMedia$$serializer.INSTANCE, tokenOverviewResponseBean.socialMedia);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tokenOverviewResponseBean.suspiciousHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tokenOverviewResponseBean.suspiciousHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(tokenOverviewResponseBean.t, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], tokenOverviewResponseBean.t);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(tokenOverviewResponseBean.tokenTagVO, new TokenTagVO((TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, TokenTagVO$$serializer.INSTANCE, tokenOverviewResponseBean.tokenTagVO);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd(tokenOverviewResponseBean.tokenThirdPartInfo, new TokenThirdPartInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 12, TokenThirdPartInfo$$serializer.INSTANCE, tokenOverviewResponseBean.tokenThirdPartInfo);
    }

    public TokenOverviewResponseBean(@NotNull BasicInfo basicInfo, @NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull LearnMore learnMore, @NotNull MarketInfo marketInfo, @NotNull String str3, @NotNull String str4, @NotNull SocialMedia socialMedia, @NotNull String str5, @NotNull List<TagItem> list2, @NotNull TokenTagVO tokenTagVO, @NotNull TokenThirdPartInfo tokenThirdPartInfo) {
        Intrinsics.checkNotNullParameter(basicInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(learnMore, "");
        Intrinsics.checkNotNullParameter(marketInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(socialMedia, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(tokenTagVO, "");
        Intrinsics.checkNotNullParameter(tokenThirdPartInfo, "");
        this.basicInfo = basicInfo;
        this.bundleHoldingRatio = str;
        this.devHoldingRatio = str2;
        this.ivt = list;
        this.learnMore = learnMore;
        this.marketInfo = marketInfo;
        this.snipersClear = str3;
        this.snipersTotal = str4;
        this.socialMedia = socialMedia;
        this.suspiciousHoldingRatio = str5;
        this.t = list2;
        this.tokenTagVO = tokenTagVO;
        this.tokenThirdPartInfo = tokenThirdPartInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0140: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.BasicInfo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (4095 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:9) call: com.okinc.crcore.coreapi.net.responsebean.dex.BasicInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r31v0 com.okinc.crcore.coreapi.net.responsebean.dex.BasicInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0031: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r34v0 java.util.List))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.LearnMore:?: TERNARY null = ((wrap:int:0x003c: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.crcore.coreapi.net.responsebean.dex.LearnMore.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r35v0 com.okinc.crcore.coreapi.net.responsebean.dex.LearnMore))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.MarketInfo:?: TERNARY null = ((wrap:int:0x004e: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (524287 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:14) call: com.okinc.crcore.coreapi.net.responsebean.dex.MarketInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r36v0 com.okinc.crcore.coreapi.net.responsebean.dex.MarketInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007f: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.SocialMedia:?: TERNARY null = ((wrap:int:0x008f: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ae: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo) (null com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (4095 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:17) call: com.okinc.crcore.coreapi.net.responsebean.dex.SocialMedia.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r39v0 com.okinc.crcore.coreapi.net.responsebean.dex.SocialMedia))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r44v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r40v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00bf: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r41v0 java.util.List))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TokenTagVO:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00f7: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail) (null com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail) (null com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail) (null com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail) (null com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail) (null com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail) (null com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail) (null com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail) (null com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: CAST (com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail) (null com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:int:0x00db: SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:20) call: com.okinc.crcore.coreapi.net.responsebean.dex.TokenTagVO.<init>(com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r42v0 com.okinc.crcore.coreapi.net.responsebean.dex.TokenTagVO))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TokenThirdPartInfo:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x011e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:21) call: com.okinc.crcore.coreapi.net.responsebean.dex.TokenThirdPartInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r43v0 com.okinc.crcore.coreapi.net.responsebean.dex.TokenThirdPartInfo))
 A[MD:(com.okinc.crcore.coreapi.net.responsebean.dex.BasicInfo, java.lang.String, java.lang.String, java.util.List<java.lang.String>, com.okinc.crcore.coreapi.net.responsebean.dex.LearnMore, com.okinc.crcore.coreapi.net.responsebean.dex.MarketInfo, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.dex.SocialMedia, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.dex.TagItem>, com.okinc.crcore.coreapi.net.responsebean.dex.TokenTagVO, com.okinc.crcore.coreapi.net.responsebean.dex.TokenThirdPartInfo):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.dex.TokenOverviewResponseBean.<init>(com.okinc.crcore.coreapi.net.responsebean.dex.BasicInfo, java.lang.String, java.lang.String, java.util.List, com.okinc.crcore.coreapi.net.responsebean.dex.LearnMore, com.okinc.crcore.coreapi.net.responsebean.dex.MarketInfo, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.dex.SocialMedia, java.lang.String, java.util.List, com.okinc.crcore.coreapi.net.responsebean.dex.TokenTagVO, com.okinc.crcore.coreapi.net.responsebean.dex.TokenThirdPartInfo):void type: THIS */
    public /* synthetic */ TokenOverviewResponseBean(BasicInfo basicInfo, String str, String str2, List list, LearnMore learnMore, MarketInfo marketInfo, String str3, String str4, SocialMedia socialMedia, String str5, List list2, TokenTagVO tokenTagVO, TokenThirdPartInfo tokenThirdPartInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BasicInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null) : basicInfo, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? new LearnMore((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : learnMore, (i & 32) != 0 ? new MarketInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null) : marketInfo, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? new SocialMedia((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TwitterDetailInfo) null, (String) null, 4095, (DefaultConstructorMarker) null) : socialMedia, (i & 512) == 0 ? str5 : "", (i & 1024) != 0 ? yDY.AhwBna() : list2, (i & 2048) != 0 ? new TokenTagVO((TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : tokenTagVO, (i & 4096) != 0 ? new TokenThirdPartInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : tokenThirdPartInfo);
    }
}
