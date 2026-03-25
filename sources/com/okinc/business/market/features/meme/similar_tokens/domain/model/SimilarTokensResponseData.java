package com.okinc.business.market.features.meme.similar_tokens.domain.model;

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
public final class SimilarTokensResponseData {
    private final List<SimilarTokenData> similarTokens;
    private final String tokenLargeLogoUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SimilarTokenData$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimilarTokensResponseData() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.similar_tokens.domain.model.SimilarTokensResponseData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimilarTokensResponseData copy$default(SimilarTokensResponseData similarTokensResponseData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = similarTokensResponseData.similarTokens;
        }
        if ((i & 2) != 0) {
            str = similarTokensResponseData.tokenLargeLogoUrl;
        }
        return similarTokensResponseData.copy(list, str);
    }

    @SerialName("similarTokens")
    public static /* synthetic */ void getSimilarTokens$annotations() {
    }

    @SerialName("tokenLargeLogoUrl")
    public static /* synthetic */ void getTokenLargeLogoUrl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimilarTokenData> component1() {
        return this.similarTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenLargeLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimilarTokensResponseData copy(@NotNull List<SimilarTokenData> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SimilarTokensResponseData(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimilarTokensResponseData)) {
            return false;
        }
        SimilarTokensResponseData similarTokensResponseData = (SimilarTokensResponseData) obj;
        return Intrinsics.EZpvd(this.similarTokens, similarTokensResponseData.similarTokens) && Intrinsics.EZpvd((Object) this.tokenLargeLogoUrl, (Object) similarTokensResponseData.tokenLargeLogoUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimilarTokenData> getSimilarTokens() {
        return this.similarTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLargeLogoUrl() {
        return this.tokenLargeLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.similarTokens.hashCode() * 31) + this.tokenLargeLogoUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimilarTokensResponseData(similarTokens=" + this.similarTokens + ", tokenLargeLogoUrl=" + this.tokenLargeLogoUrl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.similar_tokens.domain.model.SimilarTokensResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimilarTokensResponseData> serializer() {
            return SimilarTokensResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimilarTokensResponseData(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.similarTokens = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.tokenLargeLogoUrl = "";
        } else {
            this.tokenLargeLogoUrl = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SimilarTokensResponseData similarTokensResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(similarTokensResponseData.similarTokens, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], similarTokensResponseData.similarTokens);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) similarTokensResponseData.tokenLargeLogoUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, similarTokensResponseData.tokenLargeLogoUrl);
    }

    public SimilarTokensResponseData(@NotNull List<SimilarTokenData> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.similarTokens = list;
        this.tokenLargeLogoUrl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.market.features.meme.similar_tokens.domain.model.SimilarTokenData>, java.lang.String):void (m)] (LINE:32) call: com.okinc.business.market.features.meme.similar_tokens.domain.model.SimilarTokensResponseData.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SimilarTokensResponseData(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str);
    }
}
