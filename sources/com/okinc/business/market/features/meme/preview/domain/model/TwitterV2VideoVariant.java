package com.okinc.business.market.features.meme.preview.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterV2VideoVariant {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Long bitrate;
    private final String contentType;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2VideoVariant() {
        this((Long) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TwitterV2VideoVariant copy$default(TwitterV2VideoVariant twitterV2VideoVariant, Long l, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = twitterV2VideoVariant.bitrate;
        }
        if ((i & 2) != 0) {
            str = twitterV2VideoVariant.contentType;
        }
        if ((i & 4) != 0) {
            str2 = twitterV2VideoVariant.url;
        }
        return twitterV2VideoVariant.copy(l, str, str2);
    }

    @SerialName("bitrate")
    public static /* synthetic */ void getBitrate$annotations() {
    }

    @SerialName("contentType")
    public static /* synthetic */ void getContentType$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.bitrate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2VideoVariant copy(Long l, String str, String str2) {
        return new TwitterV2VideoVariant(l, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2VideoVariant)) {
            return false;
        }
        TwitterV2VideoVariant twitterV2VideoVariant = (TwitterV2VideoVariant) obj;
        return Intrinsics.EZpvd(this.bitrate, twitterV2VideoVariant.bitrate) && Intrinsics.EZpvd((Object) this.contentType, (Object) twitterV2VideoVariant.contentType) && Intrinsics.EZpvd((Object) this.url, (Object) twitterV2VideoVariant.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBitrate() {
        return this.bitrate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.bitrate;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.contentType;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.url;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2VideoVariant(bitrate=" + this.bitrate + ", contentType=" + this.contentType + ", url=" + this.url + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoVariant.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2VideoVariant> serializer() {
            return TwitterV2VideoVariant$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2VideoVariant(int i, Long l, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bitrate = null;
        } else {
            this.bitrate = l;
        }
        if ((i & 2) == 0) {
            this.contentType = null;
        } else {
            this.contentType = str;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2VideoVariant twitterV2VideoVariant, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterV2VideoVariant.bitrate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, twitterV2VideoVariant.bitrate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || twitterV2VideoVariant.contentType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, twitterV2VideoVariant.contentType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && twitterV2VideoVariant.url == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, twitterV2VideoVariant.url);
    }

    public TwitterV2VideoVariant(Long l, String str, String str2) {
        this.bitrate = l;
        this.contentType = str;
        this.url = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:176) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoVariant.<init>(java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TwitterV2VideoVariant(Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
