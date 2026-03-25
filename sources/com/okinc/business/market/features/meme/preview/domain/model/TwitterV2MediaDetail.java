package com.okinc.business.market.features.meme.preview.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterV2MediaDetail {
    private final String mediaUrlHttps;
    private final TwitterV2MediaOriginalInfo originalInfo;
    private final String type;
    private final TwitterV2VideoInfo videoInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2MediaDetail() {
        this((String) null, (TwitterV2MediaOriginalInfo) null, (String) null, (TwitterV2VideoInfo) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TwitterV2MediaDetail copy$default(TwitterV2MediaDetail twitterV2MediaDetail, String str, TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo, String str2, TwitterV2VideoInfo twitterV2VideoInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twitterV2MediaDetail.mediaUrlHttps;
        }
        if ((i & 2) != 0) {
            twitterV2MediaOriginalInfo = twitterV2MediaDetail.originalInfo;
        }
        if ((i & 4) != 0) {
            str2 = twitterV2MediaDetail.type;
        }
        if ((i & 8) != 0) {
            twitterV2VideoInfo = twitterV2MediaDetail.videoInfo;
        }
        return twitterV2MediaDetail.copy(str, twitterV2MediaOriginalInfo, str2, twitterV2VideoInfo);
    }

    @SerialName("mediaUrlHttps")
    public static /* synthetic */ void getMediaUrlHttps$annotations() {
    }

    @SerialName("originalInfo")
    public static /* synthetic */ void getOriginalInfo$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("videoInfo")
    public static /* synthetic */ void getVideoInfo$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mediaUrlHttps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2MediaOriginalInfo component2() {
        return this.originalInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2VideoInfo component4() {
        return this.videoInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2MediaDetail copy(String str, TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo, String str2, TwitterV2VideoInfo twitterV2VideoInfo) {
        return new TwitterV2MediaDetail(str, twitterV2MediaOriginalInfo, str2, twitterV2VideoInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2MediaDetail)) {
            return false;
        }
        TwitterV2MediaDetail twitterV2MediaDetail = (TwitterV2MediaDetail) obj;
        return Intrinsics.EZpvd((Object) this.mediaUrlHttps, (Object) twitterV2MediaDetail.mediaUrlHttps) && Intrinsics.EZpvd(this.originalInfo, twitterV2MediaDetail.originalInfo) && Intrinsics.EZpvd((Object) this.type, (Object) twitterV2MediaDetail.type) && Intrinsics.EZpvd(this.videoInfo, twitterV2MediaDetail.videoInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMediaUrlHttps() {
        return this.mediaUrlHttps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2MediaOriginalInfo getOriginalInfo() {
        return this.originalInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.mediaUrlHttps;
        int iHashCode = str == null ? 0 : str.hashCode();
        TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo = this.originalInfo;
        int iHashCode2 = twitterV2MediaOriginalInfo == null ? 0 : twitterV2MediaOriginalInfo.hashCode();
        String str2 = this.type;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        TwitterV2VideoInfo twitterV2VideoInfo = this.videoInfo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (twitterV2VideoInfo != null ? twitterV2VideoInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2MediaDetail(mediaUrlHttps=" + this.mediaUrlHttps + ", originalInfo=" + this.originalInfo + ", type=" + this.type + ", videoInfo=" + this.videoInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2MediaDetail> serializer() {
            return TwitterV2MediaDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2MediaDetail(int i, String str, TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo, String str2, TwitterV2VideoInfo twitterV2VideoInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.mediaUrlHttps = null;
        } else {
            this.mediaUrlHttps = str;
        }
        if ((i & 2) == 0) {
            this.originalInfo = null;
        } else {
            this.originalInfo = twitterV2MediaOriginalInfo;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 8) == 0) {
            this.videoInfo = null;
        } else {
            this.videoInfo = twitterV2VideoInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2MediaDetail twitterV2MediaDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterV2MediaDetail.mediaUrlHttps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, twitterV2MediaDetail.mediaUrlHttps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || twitterV2MediaDetail.originalInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TwitterV2MediaOriginalInfo$$serializer.INSTANCE, twitterV2MediaDetail.originalInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || twitterV2MediaDetail.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, twitterV2MediaDetail.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && twitterV2MediaDetail.videoInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, TwitterV2VideoInfo$$serializer.INSTANCE, twitterV2MediaDetail.videoInfo);
    }

    public TwitterV2MediaDetail(String str, TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo, String str2, TwitterV2VideoInfo twitterV2VideoInfo) {
        this.mediaUrlHttps = str;
        this.originalInfo = twitterV2MediaOriginalInfo;
        this.type = str2;
        this.videoInfo = twitterV2VideoInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaOriginalInfo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaOriginalInfo) : (r3v0 com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaOriginalInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoInfo:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoInfo) : (r5v0 com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoInfo))
 A[MD:(java.lang.String, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaOriginalInfo, java.lang.String, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoInfo):void (m)] (LINE:143) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaDetail.<init>(java.lang.String, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaOriginalInfo, java.lang.String, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoInfo):void type: THIS */
    public /* synthetic */ TwitterV2MediaDetail(String str, TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo, String str2, TwitterV2VideoInfo twitterV2VideoInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : twitterV2MediaOriginalInfo, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : twitterV2VideoInfo);
    }
}
