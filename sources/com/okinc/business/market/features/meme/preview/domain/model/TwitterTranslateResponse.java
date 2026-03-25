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
public final class TwitterTranslateResponse {
    private final TranslatedItemData originalTranslatedData;
    private final List<TranslatedItemData> referencedTranslatedData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TranslatedItemData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterTranslateResponse() {
        this((TranslatedItemData) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.preview.domain.model.TwitterTranslateResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwitterTranslateResponse copy$default(TwitterTranslateResponse twitterTranslateResponse, TranslatedItemData translatedItemData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            translatedItemData = twitterTranslateResponse.originalTranslatedData;
        }
        if ((i & 2) != 0) {
            list = twitterTranslateResponse.referencedTranslatedData;
        }
        return twitterTranslateResponse.copy(translatedItemData, list);
    }

    @SerialName("originalTranslatedData")
    public static /* synthetic */ void getOriginalTranslatedData$annotations() {
    }

    @SerialName("referencedTranslatedData")
    public static /* synthetic */ void getReferencedTranslatedData$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TranslatedItemData component1() {
        return this.originalTranslatedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TranslatedItemData> component2() {
        return this.referencedTranslatedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterTranslateResponse copy(TranslatedItemData translatedItemData, @NotNull List<TranslatedItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TwitterTranslateResponse(translatedItemData, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterTranslateResponse)) {
            return false;
        }
        TwitterTranslateResponse twitterTranslateResponse = (TwitterTranslateResponse) obj;
        return Intrinsics.EZpvd(this.originalTranslatedData, twitterTranslateResponse.originalTranslatedData) && Intrinsics.EZpvd(this.referencedTranslatedData, twitterTranslateResponse.referencedTranslatedData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TranslatedItemData getOriginalTranslatedData() {
        return this.originalTranslatedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TranslatedItemData> getReferencedTranslatedData() {
        return this.referencedTranslatedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TranslatedItemData translatedItemData = this.originalTranslatedData;
        return ((translatedItemData == null ? 0 : translatedItemData.hashCode()) * 31) + this.referencedTranslatedData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterTranslateResponse(originalTranslatedData=" + this.originalTranslatedData + ", referencedTranslatedData=" + this.referencedTranslatedData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterTranslateResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterTranslateResponse> serializer() {
            return TwitterTranslateResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterTranslateResponse(int i, TranslatedItemData translatedItemData, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.originalTranslatedData = (i & 1) == 0 ? null : translatedItemData;
        if ((i & 2) == 0) {
            this.referencedTranslatedData = yDY.AhwBna();
        } else {
            this.referencedTranslatedData = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterTranslateResponse twitterTranslateResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterTranslateResponse.originalTranslatedData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TranslatedItemData$$serializer.INSTANCE, twitterTranslateResponse.originalTranslatedData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(twitterTranslateResponse.referencedTranslatedData, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], twitterTranslateResponse.referencedTranslatedData);
    }

    public TwitterTranslateResponse(TranslatedItemData translatedItemData, @NotNull List<TranslatedItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.originalTranslatedData = translatedItemData;
        this.referencedTranslatedData = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.TranslatedItemData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.TranslatedItemData) : (r1v0 com.okinc.business.market.features.meme.preview.domain.model.TranslatedItemData))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r2v0 java.util.List))
 A[MD:(com.okinc.business.market.features.meme.preview.domain.model.TranslatedItemData, java.util.List<com.okinc.business.market.features.meme.preview.domain.model.TranslatedItemData>):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterTranslateResponse.<init>(com.okinc.business.market.features.meme.preview.domain.model.TranslatedItemData, java.util.List):void type: THIS */
    public /* synthetic */ TwitterTranslateResponse(TranslatedItemData translatedItemData, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : translatedItemData, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
