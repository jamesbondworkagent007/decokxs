package com.okinc.crcore.coreapi.net.responsebean.dex;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TokenTagVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final TagDetail bundleHoldingRatio;
    private final TagDetail communityRecognized;
    private final TagDetail devBurnToken;
    private final TagDetail devHoldingRatio;
    private final TagDetail devHoldingStatus;
    private final TagDetail kolHoldingRatio;
    private final TagDetail smartMoneyBuy;
    private final TagDetail smartMoneyHoldingStatus;
    private final TagDetail smartMoneySell;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenTagVO() {
        this((TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, (TagDetail) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail component1() {
        return this.smartMoneySell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail component2() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail component3() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail component4() {
        return this.devBurnToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail component5() {
        return this.smartMoneyBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail component6() {
        return this.devHoldingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail component7() {
        return this.kolHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail component8() {
        return this.bundleHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail component9() {
        return this.smartMoneyHoldingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenTagVO copy(@NotNull TagDetail tagDetail, @NotNull TagDetail tagDetail2, @NotNull TagDetail tagDetail3, @NotNull TagDetail tagDetail4, @NotNull TagDetail tagDetail5, @NotNull TagDetail tagDetail6, @NotNull TagDetail tagDetail7, @NotNull TagDetail tagDetail8, @NotNull TagDetail tagDetail9) {
        Intrinsics.checkNotNullParameter(tagDetail, "");
        Intrinsics.checkNotNullParameter(tagDetail2, "");
        Intrinsics.checkNotNullParameter(tagDetail3, "");
        Intrinsics.checkNotNullParameter(tagDetail4, "");
        Intrinsics.checkNotNullParameter(tagDetail5, "");
        Intrinsics.checkNotNullParameter(tagDetail6, "");
        Intrinsics.checkNotNullParameter(tagDetail7, "");
        Intrinsics.checkNotNullParameter(tagDetail8, "");
        Intrinsics.checkNotNullParameter(tagDetail9, "");
        return new TokenTagVO(tagDetail, tagDetail2, tagDetail3, tagDetail4, tagDetail5, tagDetail6, tagDetail7, tagDetail8, tagDetail9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenTagVO)) {
            return false;
        }
        TokenTagVO tokenTagVO = (TokenTagVO) obj;
        return Intrinsics.EZpvd(this.smartMoneySell, tokenTagVO.smartMoneySell) && Intrinsics.EZpvd(this.communityRecognized, tokenTagVO.communityRecognized) && Intrinsics.EZpvd(this.devHoldingRatio, tokenTagVO.devHoldingRatio) && Intrinsics.EZpvd(this.devBurnToken, tokenTagVO.devBurnToken) && Intrinsics.EZpvd(this.smartMoneyBuy, tokenTagVO.smartMoneyBuy) && Intrinsics.EZpvd(this.devHoldingStatus, tokenTagVO.devHoldingStatus) && Intrinsics.EZpvd(this.kolHoldingRatio, tokenTagVO.kolHoldingRatio) && Intrinsics.EZpvd(this.bundleHoldingRatio, tokenTagVO.bundleHoldingRatio) && Intrinsics.EZpvd(this.smartMoneyHoldingStatus, tokenTagVO.smartMoneyHoldingStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail getBundleHoldingRatio() {
        return this.bundleHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail getCommunityRecognized() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail getDevBurnToken() {
        return this.devBurnToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail getDevHoldingRatio() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail getDevHoldingStatus() {
        return this.devHoldingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail getKolHoldingRatio() {
        return this.kolHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail getSmartMoneyBuy() {
        return this.smartMoneyBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail getSmartMoneyHoldingStatus() {
        return this.smartMoneyHoldingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail getSmartMoneySell() {
        return this.smartMoneySell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.smartMoneySell.hashCode() * 31) + this.communityRecognized.hashCode()) * 31) + this.devHoldingRatio.hashCode()) * 31) + this.devBurnToken.hashCode()) * 31) + this.smartMoneyBuy.hashCode()) * 31) + this.devHoldingStatus.hashCode()) * 31) + this.kolHoldingRatio.hashCode()) * 31) + this.bundleHoldingRatio.hashCode()) * 31) + this.smartMoneyHoldingStatus.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenTagVO(smartMoneySell=" + this.smartMoneySell + ", communityRecognized=" + this.communityRecognized + ", devHoldingRatio=" + this.devHoldingRatio + ", devBurnToken=" + this.devBurnToken + ", smartMoneyBuy=" + this.smartMoneyBuy + ", devHoldingStatus=" + this.devHoldingStatus + ", kolHoldingRatio=" + this.kolHoldingRatio + ", bundleHoldingRatio=" + this.bundleHoldingRatio + ", smartMoneyHoldingStatus=" + this.smartMoneyHoldingStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.TokenTagVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenTagVO> serializer() {
            return TokenTagVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenTagVO(int i, TagDetail tagDetail, TagDetail tagDetail2, TagDetail tagDetail3, TagDetail tagDetail4, TagDetail tagDetail5, TagDetail tagDetail6, TagDetail tagDetail7, TagDetail tagDetail8, TagDetail tagDetail9, SerializationConstructorMarker serializationConstructorMarker) {
        this.smartMoneySell = (i & 1) == 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail;
        this.communityRecognized = (i & 2) == 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail2;
        this.devHoldingRatio = (i & 4) == 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail3;
        this.devBurnToken = (i & 8) == 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail4;
        this.smartMoneyBuy = (i & 16) == 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail5;
        this.devHoldingStatus = (i & 32) == 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail6;
        this.kolHoldingRatio = (i & 64) == 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail7;
        this.bundleHoldingRatio = (i & 128) == 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail8;
        this.smartMoneyHoldingStatus = (i & 256) == 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [105=10] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TokenTagVO tokenTagVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(tokenTagVO.smartMoneySell, new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, TagDetail$$serializer.INSTANCE, tokenTagVO.smartMoneySell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(tokenTagVO.communityRecognized, new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, TagDetail$$serializer.INSTANCE, tokenTagVO.communityRecognized);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(tokenTagVO.devHoldingRatio, new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, TagDetail$$serializer.INSTANCE, tokenTagVO.devHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(tokenTagVO.devBurnToken, new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, TagDetail$$serializer.INSTANCE, tokenTagVO.devBurnToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(tokenTagVO.smartMoneyBuy, new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, TagDetail$$serializer.INSTANCE, tokenTagVO.smartMoneyBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(tokenTagVO.devHoldingStatus, new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, TagDetail$$serializer.INSTANCE, tokenTagVO.devHoldingStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(tokenTagVO.kolHoldingRatio, new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, TagDetail$$serializer.INSTANCE, tokenTagVO.kolHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(tokenTagVO.bundleHoldingRatio, new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, TagDetail$$serializer.INSTANCE, tokenTagVO.bundleHoldingRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(tokenTagVO.smartMoneyHoldingStatus, new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, TagDetail$$serializer.INSTANCE, tokenTagVO.smartMoneyHoldingStatus);
    }

    public TokenTagVO(@NotNull TagDetail tagDetail, @NotNull TagDetail tagDetail2, @NotNull TagDetail tagDetail3, @NotNull TagDetail tagDetail4, @NotNull TagDetail tagDetail5, @NotNull TagDetail tagDetail6, @NotNull TagDetail tagDetail7, @NotNull TagDetail tagDetail8, @NotNull TagDetail tagDetail9) {
        Intrinsics.checkNotNullParameter(tagDetail, "");
        Intrinsics.checkNotNullParameter(tagDetail2, "");
        Intrinsics.checkNotNullParameter(tagDetail3, "");
        Intrinsics.checkNotNullParameter(tagDetail4, "");
        Intrinsics.checkNotNullParameter(tagDetail5, "");
        Intrinsics.checkNotNullParameter(tagDetail6, "");
        Intrinsics.checkNotNullParameter(tagDetail7, "");
        Intrinsics.checkNotNullParameter(tagDetail8, "");
        Intrinsics.checkNotNullParameter(tagDetail9, "");
        this.smartMoneySell = tagDetail;
        this.communityRecognized = tagDetail2;
        this.devHoldingRatio = tagDetail3;
        this.devBurnToken = tagDetail4;
        this.smartMoneyBuy = tagDetail5;
        this.devHoldingStatus = tagDetail6;
        this.kolHoldingRatio = tagDetail7;
        this.bundleHoldingRatio = tagDetail8;
        this.smartMoneyHoldingStatus = tagDetail9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00de: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:108) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r15v0 com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: TERNARY null = ((wrap:int:0x0013: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:109) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: TERNARY null = ((wrap:int:0x0025: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:110) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: TERNARY null = ((wrap:int:0x0037: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:111) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:112) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: TERNARY null = ((wrap:int:0x005b: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0071: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:113) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: TERNARY null = ((wrap:int:0x0077: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008d: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:114) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: TERNARY null = ((wrap:int:0x0093: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a9: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:115) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail:?: TERNARY null = ((wrap:int:0x00af: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c5: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:116) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r23v0 com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail))
 A[MD:(com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail):void (m)] (LINE:107) call: com.okinc.crcore.coreapi.net.responsebean.dex.TokenTagVO.<init>(com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail, com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail):void type: THIS */
    public /* synthetic */ TokenTagVO(TagDetail tagDetail, TagDetail tagDetail2, TagDetail tagDetail3, TagDetail tagDetail4, TagDetail tagDetail5, TagDetail tagDetail6, TagDetail tagDetail7, TagDetail tagDetail8, TagDetail tagDetail9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail, (i & 2) != 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail2, (i & 4) != 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail3, (i & 8) != 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail4, (i & 16) != 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail5, (i & 32) != 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail6, (i & 64) != 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail7, (i & 128) != 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail8, (i & 256) != 0 ? new TagDetail((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tagDetail9);
    }
}
