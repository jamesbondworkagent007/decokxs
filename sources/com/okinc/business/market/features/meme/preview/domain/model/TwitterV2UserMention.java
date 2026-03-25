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
public final class TwitterV2UserMention {
    private final String idStr;
    private final List<Integer> indices;
    private final String name;
    private final String screenName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2UserMention() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2UserMention */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwitterV2UserMention copy$default(TwitterV2UserMention twitterV2UserMention, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twitterV2UserMention.screenName;
        }
        if ((i & 2) != 0) {
            str2 = twitterV2UserMention.name;
        }
        if ((i & 4) != 0) {
            str3 = twitterV2UserMention.idStr;
        }
        if ((i & 8) != 0) {
            list = twitterV2UserMention.indices;
        }
        return twitterV2UserMention.copy(str, str2, str3, list);
    }

    @SerialName("idStr")
    public static /* synthetic */ void getIdStr$annotations() {
    }

    @SerialName("indices")
    public static /* synthetic */ void getIndices$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("screenName")
    public static /* synthetic */ void getScreenName$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.screenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.idStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component4() {
        return this.indices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2UserMention copy(String str, String str2, String str3, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TwitterV2UserMention(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2UserMention)) {
            return false;
        }
        TwitterV2UserMention twitterV2UserMention = (TwitterV2UserMention) obj;
        return Intrinsics.EZpvd((Object) this.screenName, (Object) twitterV2UserMention.screenName) && Intrinsics.EZpvd((Object) this.name, (Object) twitterV2UserMention.name) && Intrinsics.EZpvd((Object) this.idStr, (Object) twitterV2UserMention.idStr) && Intrinsics.EZpvd(this.indices, twitterV2UserMention.indices);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdStr() {
        return this.idStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getIndices() {
        return this.indices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScreenName() {
        return this.screenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.screenName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.idStr;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.indices.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2UserMention(screenName=" + this.screenName + ", name=" + this.name + ", idStr=" + this.idStr + ", indices=" + this.indices + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2UserMention.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2UserMention> serializer() {
            return TwitterV2UserMention$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2UserMention(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.screenName = null;
        } else {
            this.screenName = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.idStr = null;
        } else {
            this.idStr = str3;
        }
        if ((i & 8) == 0) {
            this.indices = yDY.AhwBna();
        } else {
            this.indices = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2UserMention twitterV2UserMention, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterV2UserMention.screenName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, twitterV2UserMention.screenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || twitterV2UserMention.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, twitterV2UserMention.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || twitterV2UserMention.idStr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, twitterV2UserMention.idStr);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(twitterV2UserMention.indices, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], twitterV2UserMention.indices);
    }

    public TwitterV2UserMention(String str, String str2, String str3, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.screenName = str;
        this.name = str2;
        this.idStr = str3;
        this.indices = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:138)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>):void (m)] (LINE:130) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2UserMention.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TwitterV2UserMention(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
