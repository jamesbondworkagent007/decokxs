package com.okinc.business.market.features.meme.preview.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterV2MediaOriginalInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int height;
    private final int width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public TwitterV2MediaOriginalInfo() {
        int i = 0;
        this(i, i, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TwitterV2MediaOriginalInfo copy$default(TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = twitterV2MediaOriginalInfo.height;
        }
        if ((i3 & 2) != 0) {
            i2 = twitterV2MediaOriginalInfo.width;
        }
        return twitterV2MediaOriginalInfo.copy(i, i2);
    }

    @SerialName("height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName("width")
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2MediaOriginalInfo copy(int i, int i2) {
        return new TwitterV2MediaOriginalInfo(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2MediaOriginalInfo)) {
            return false;
        }
        TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo = (TwitterV2MediaOriginalInfo) obj;
        return this.height == twitterV2MediaOriginalInfo.height && this.width == twitterV2MediaOriginalInfo.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.height) * 31) + Integer.hashCode(this.width);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2MediaOriginalInfo(height=" + this.height + ", width=" + this.width + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaOriginalInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2MediaOriginalInfo> serializer() {
            return TwitterV2MediaOriginalInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2MediaOriginalInfo(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.height = 0;
        } else {
            this.height = i2;
        }
        if ((i & 2) == 0) {
            this.width = 0;
        } else {
            this.width = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterV2MediaOriginalInfo.height != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, twitterV2MediaOriginalInfo.height);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && twitterV2MediaOriginalInfo.width == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, twitterV2MediaOriginalInfo.width);
    }

    public TwitterV2MediaOriginalInfo(int i, int i2) {
        this.height = i;
        this.width = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(int, int):void (m)] (LINE:156) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaOriginalInfo.<init>(int, int):void type: THIS */
    public /* synthetic */ TwitterV2MediaOriginalInfo(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
