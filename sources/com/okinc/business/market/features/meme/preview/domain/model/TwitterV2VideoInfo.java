package com.okinc.business.market.features.meme.preview.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterV2VideoInfo {
    private final List<Integer> aspectRatio;
    private final long durationMillis;
    private final List<TwitterV2VideoVariant> variants;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), null, new ArrayListSerializer(TwitterV2VideoVariant$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2VideoInfo() {
        this((List) null, 0L, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwitterV2VideoInfo copy$default(TwitterV2VideoInfo twitterV2VideoInfo, List list, long j, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = twitterV2VideoInfo.aspectRatio;
        }
        if ((i & 2) != 0) {
            j = twitterV2VideoInfo.durationMillis;
        }
        if ((i & 4) != 0) {
            list2 = twitterV2VideoInfo.variants;
        }
        return twitterV2VideoInfo.copy(list, j, list2);
    }

    @SerialName("aspectRatio")
    public static /* synthetic */ void getAspectRatio$annotations() {
    }

    @SerialName("durationMillis")
    public static /* synthetic */ void getDurationMillis$annotations() {
    }

    @SerialName("variants")
    public static /* synthetic */ void getVariants$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.aspectRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.durationMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2VideoVariant> component3() {
        return this.variants;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2VideoInfo copy(@NotNull List<Integer> list, long j, @NotNull List<TwitterV2VideoVariant> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new TwitterV2VideoInfo(list, j, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2VideoInfo)) {
            return false;
        }
        TwitterV2VideoInfo twitterV2VideoInfo = (TwitterV2VideoInfo) obj;
        return Intrinsics.EZpvd(this.aspectRatio, twitterV2VideoInfo.aspectRatio) && this.durationMillis == twitterV2VideoInfo.durationMillis && Intrinsics.EZpvd(this.variants, twitterV2VideoInfo.variants);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getAspectRatio() {
        return this.aspectRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2VideoVariant> getVariants() {
        return this.variants;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.aspectRatio.hashCode() * 31) + Long.hashCode(this.durationMillis)) * 31) + this.variants.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2VideoInfo(aspectRatio=" + this.aspectRatio + ", durationMillis=" + this.durationMillis + ", variants=" + this.variants + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2VideoInfo> serializer() {
            return TwitterV2VideoInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2VideoInfo(int i, List list, long j, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.aspectRatio = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.durationMillis = 0L;
        } else {
            this.durationMillis = j;
        }
        if ((i & 4) == 0) {
            this.variants = yDY.AhwBna();
        } else {
            this.variants = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2VideoInfo twitterV2VideoInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(twitterV2VideoInfo.aspectRatio, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], twitterV2VideoInfo.aspectRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || twitterV2VideoInfo.durationMillis != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, twitterV2VideoInfo.durationMillis);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(twitterV2VideoInfo.variants, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], twitterV2VideoInfo.variants);
    }

    public TwitterV2VideoInfo(@NotNull List<Integer> list, long j, @NotNull List<TwitterV2VideoVariant> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.aspectRatio = list;
        this.durationMillis = j;
        this.variants = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:167)) : (r1v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:171)) : (r4v0 java.util.List))
 A[MD:(java.util.List<java.lang.Integer>, long, java.util.List<com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoVariant>):void (m)] (LINE:165) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoInfo.<init>(java.util.List, long, java.util.List):void type: THIS */
    public /* synthetic */ TwitterV2VideoInfo(List list, long j, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? yDY.AhwBna() : list2);
    }
}
