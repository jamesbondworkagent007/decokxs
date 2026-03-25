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
public final class TwitterV2Url {
    private final String displayUrl;
    private final String expandedUrl;
    private final List<Integer> indices;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2Url() {
        this((String) null, (String) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Url */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwitterV2Url copy$default(TwitterV2Url twitterV2Url, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twitterV2Url.displayUrl;
        }
        if ((i & 2) != 0) {
            str2 = twitterV2Url.expandedUrl;
        }
        if ((i & 4) != 0) {
            list = twitterV2Url.indices;
        }
        if ((i & 8) != 0) {
            str3 = twitterV2Url.url;
        }
        return twitterV2Url.copy(str, str2, list, str3);
    }

    @SerialName("displayUrl")
    public static /* synthetic */ void getDisplayUrl$annotations() {
    }

    @SerialName("expandedUrl")
    public static /* synthetic */ void getExpandedUrl$annotations() {
    }

    @SerialName("indices")
    public static /* synthetic */ void getIndices$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.displayUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.expandedUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component3() {
        return this.indices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2Url copy(String str, String str2, @NotNull List<Integer> list, String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TwitterV2Url(str, str2, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2Url)) {
            return false;
        }
        TwitterV2Url twitterV2Url = (TwitterV2Url) obj;
        return Intrinsics.EZpvd((Object) this.displayUrl, (Object) twitterV2Url.displayUrl) && Intrinsics.EZpvd((Object) this.expandedUrl, (Object) twitterV2Url.expandedUrl) && Intrinsics.EZpvd(this.indices, twitterV2Url.indices) && Intrinsics.EZpvd((Object) this.url, (Object) twitterV2Url.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayUrl() {
        return this.displayUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpandedUrl() {
        return this.expandedUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getIndices() {
        return this.indices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.displayUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.expandedUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.indices.hashCode();
        String str3 = this.url;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2Url(displayUrl=" + this.displayUrl + ", expandedUrl=" + this.expandedUrl + ", indices=" + this.indices + ", url=" + this.url + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Url.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2Url> serializer() {
            return TwitterV2Url$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2Url(int i, String str, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.displayUrl = null;
        } else {
            this.displayUrl = str;
        }
        if ((i & 2) == 0) {
            this.expandedUrl = null;
        } else {
            this.expandedUrl = str2;
        }
        if ((i & 4) == 0) {
            this.indices = yDY.AhwBna();
        } else {
            this.indices = list;
        }
        if ((i & 8) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2Url twitterV2Url, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterV2Url.displayUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, twitterV2Url.displayUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || twitterV2Url.expandedUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, twitterV2Url.expandedUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(twitterV2Url.indices, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], twitterV2Url.indices);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && twitterV2Url.url == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, twitterV2Url.url);
    }

    public TwitterV2Url(String str, String str2, @NotNull List<Integer> list, String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.displayUrl = str;
        this.expandedUrl = str2;
        this.indices = list;
        this.url = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:123)) : (r4v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.String):void (m)] (LINE:117) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Url.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ TwitterV2Url(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? null : str3);
    }
}
