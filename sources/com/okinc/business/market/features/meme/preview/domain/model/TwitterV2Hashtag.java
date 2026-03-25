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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterV2Hashtag {
    private final List<Integer> indices;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2Hashtag() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Hashtag */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwitterV2Hashtag copy$default(TwitterV2Hashtag twitterV2Hashtag, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twitterV2Hashtag.text;
        }
        if ((i & 2) != 0) {
            list = twitterV2Hashtag.indices;
        }
        return twitterV2Hashtag.copy(str, list);
    }

    @SerialName("indices")
    public static /* synthetic */ void getIndices$annotations() {
    }

    @SerialName("text")
    public static /* synthetic */ void getText$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component2() {
        return this.indices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2Hashtag copy(String str, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TwitterV2Hashtag(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2Hashtag)) {
            return false;
        }
        TwitterV2Hashtag twitterV2Hashtag = (TwitterV2Hashtag) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) twitterV2Hashtag.text) && Intrinsics.EZpvd(this.indices, twitterV2Hashtag.indices);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getIndices() {
        return this.indices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.text;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.indices.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2Hashtag(text=" + this.text + ", indices=" + this.indices + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Hashtag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2Hashtag> serializer() {
            return TwitterV2Hashtag$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2Hashtag(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.text = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.indices = yDY.AhwBna();
        } else {
            this.indices = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2Hashtag twitterV2Hashtag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterV2Hashtag.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, twitterV2Hashtag.text);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(twitterV2Hashtag.indices, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], twitterV2Hashtag.indices);
    }

    public TwitterV2Hashtag(String str, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.text = str;
        this.indices = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:112)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.Integer>):void (m)] (LINE:108) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Hashtag.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TwitterV2Hashtag(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
