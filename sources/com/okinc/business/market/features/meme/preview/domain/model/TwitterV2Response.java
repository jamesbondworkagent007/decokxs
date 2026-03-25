package com.okinc.business.market.features.meme.preview.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterV2Response {
    private final TwitterV2Tweet tweetVO;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2Response() {
        this((TwitterV2Tweet) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TwitterV2Response copy$default(TwitterV2Response twitterV2Response, TwitterV2Tweet twitterV2Tweet, int i, Object obj) {
        if ((i & 1) != 0) {
            twitterV2Tweet = twitterV2Response.tweetVO;
        }
        return twitterV2Response.copy(twitterV2Tweet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2Tweet component1() {
        return this.tweetVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2Response copy(TwitterV2Tweet twitterV2Tweet) {
        return new TwitterV2Response(twitterV2Tweet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TwitterV2Response) && Intrinsics.EZpvd(this.tweetVO, ((TwitterV2Response) obj).tweetVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2Tweet getTweetVO() {
        return this.tweetVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TwitterV2Tweet twitterV2Tweet = this.tweetVO;
        if (twitterV2Tweet == null) {
            return 0;
        }
        return twitterV2Tweet.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2Response(tweetVO=" + this.tweetVO + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Response.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2Response> serializer() {
            return TwitterV2Response$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2Response(int i, TwitterV2Tweet twitterV2Tweet, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tweetVO = null;
        } else {
            this.tweetVO = twitterV2Tweet;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2Response twitterV2Response, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && twitterV2Response.tweetVO == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TwitterV2Tweet$$serializer.INSTANCE, twitterV2Response.tweetVO);
    }

    public TwitterV2Response(TwitterV2Tweet twitterV2Tweet) {
        this.tweetVO = twitterV2Tweet;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Tweet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Tweet) : (r1v0 com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Tweet))
 A[MD:(com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Tweet):void (m)] (LINE:16) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Response.<init>(com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Tweet):void type: THIS */
    public /* synthetic */ TwitterV2Response(TwitterV2Tweet twitterV2Tweet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : twitterV2Tweet);
    }
}
