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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterV2Entities {
    private final List<TwitterV2Cashtag> cashtags;
    private final List<TwitterV2Hashtag> hashtags;
    private final List<TwitterV2Url> urls;
    private final List<TwitterV2UserMention> userMentions;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TwitterV2Cashtag$$serializer.INSTANCE), new ArrayListSerializer(TwitterV2Hashtag$$serializer.INSTANCE), new ArrayListSerializer(TwitterV2Url$$serializer.INSTANCE), new ArrayListSerializer(TwitterV2UserMention$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2Entities() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Entities */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwitterV2Entities copy$default(TwitterV2Entities twitterV2Entities, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = twitterV2Entities.cashtags;
        }
        if ((i & 2) != 0) {
            list2 = twitterV2Entities.hashtags;
        }
        if ((i & 4) != 0) {
            list3 = twitterV2Entities.urls;
        }
        if ((i & 8) != 0) {
            list4 = twitterV2Entities.userMentions;
        }
        return twitterV2Entities.copy(list, list2, list3, list4);
    }

    @SerialName("cashtags")
    public static /* synthetic */ void getCashtags$annotations() {
    }

    @SerialName("hashtags")
    public static /* synthetic */ void getHashtags$annotations() {
    }

    @SerialName("urls")
    public static /* synthetic */ void getUrls$annotations() {
    }

    @SerialName("userMentions")
    public static /* synthetic */ void getUserMentions$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2Cashtag> component1() {
        return this.cashtags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2Hashtag> component2() {
        return this.hashtags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2Url> component3() {
        return this.urls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2UserMention> component4() {
        return this.userMentions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2Entities copy(@NotNull List<TwitterV2Cashtag> list, @NotNull List<TwitterV2Hashtag> list2, @NotNull List<TwitterV2Url> list3, @NotNull List<TwitterV2UserMention> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new TwitterV2Entities(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2Entities)) {
            return false;
        }
        TwitterV2Entities twitterV2Entities = (TwitterV2Entities) obj;
        return Intrinsics.EZpvd(this.cashtags, twitterV2Entities.cashtags) && Intrinsics.EZpvd(this.hashtags, twitterV2Entities.hashtags) && Intrinsics.EZpvd(this.urls, twitterV2Entities.urls) && Intrinsics.EZpvd(this.userMentions, twitterV2Entities.userMentions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2Cashtag> getCashtags() {
        return this.cashtags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2Hashtag> getHashtags() {
        return this.hashtags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2Url> getUrls() {
        return this.urls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2UserMention> getUserMentions() {
        return this.userMentions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.cashtags.hashCode() * 31) + this.hashtags.hashCode()) * 31) + this.urls.hashCode()) * 31) + this.userMentions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2Entities(cashtags=" + this.cashtags + ", hashtags=" + this.hashtags + ", urls=" + this.urls + ", userMentions=" + this.userMentions + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Entities.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2Entities> serializer() {
            return TwitterV2Entities$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2Entities(int i, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        this.cashtags = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.hashtags = yDY.AhwBna();
        } else {
            this.hashtags = list2;
        }
        if ((i & 4) == 0) {
            this.urls = yDY.AhwBna();
        } else {
            this.urls = list3;
        }
        if ((i & 8) == 0) {
            this.userMentions = yDY.AhwBna();
        } else {
            this.userMentions = list4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [84=5] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2Entities twitterV2Entities, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(twitterV2Entities.cashtags, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], twitterV2Entities.cashtags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(twitterV2Entities.hashtags, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], twitterV2Entities.hashtags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(twitterV2Entities.urls, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], twitterV2Entities.urls);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(twitterV2Entities.userMentions, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], twitterV2Entities.userMentions);
    }

    public TwitterV2Entities(@NotNull List<TwitterV2Cashtag> list, @NotNull List<TwitterV2Hashtag> list2, @NotNull List<TwitterV2Url> list3, @NotNull List<TwitterV2UserMention> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.cashtags = list;
        this.hashtags = list2;
        this.urls = list3;
        this.userMentions = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:88)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:90)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:92)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:94)) : (r4v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Cashtag>, java.util.List<com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Hashtag>, java.util.List<com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Url>, java.util.List<com.okinc.business.market.features.meme.preview.domain.model.TwitterV2UserMention>):void (m)] (LINE:86) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Entities.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TwitterV2Entities(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? yDY.AhwBna() : list4);
    }
}
