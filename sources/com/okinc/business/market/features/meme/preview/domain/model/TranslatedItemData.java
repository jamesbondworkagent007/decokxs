package com.okinc.business.market.features.meme.preview.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TranslatedItemData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long id;
    private final String translatedLanguage;
    private final String translatedText;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TranslatedItemData() {
        this(0L, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TranslatedItemData copy$default(TranslatedItemData translatedItemData, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = translatedItemData.id;
        }
        if ((i & 2) != 0) {
            str = translatedItemData.translatedText;
        }
        if ((i & 4) != 0) {
            str2 = translatedItemData.translatedLanguage;
        }
        return translatedItemData.copy(j, str, str2);
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("translatedLanguage")
    public static /* synthetic */ void getTranslatedLanguage$annotations() {
    }

    @SerialName("translatedText")
    public static /* synthetic */ void getTranslatedText$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.translatedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.translatedLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TranslatedItemData copy(long j, String str, String str2) {
        return new TranslatedItemData(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslatedItemData)) {
            return false;
        }
        TranslatedItemData translatedItemData = (TranslatedItemData) obj;
        return this.id == translatedItemData.id && Intrinsics.EZpvd((Object) this.translatedText, (Object) translatedItemData.translatedText) && Intrinsics.EZpvd((Object) this.translatedLanguage, (Object) translatedItemData.translatedLanguage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedLanguage() {
        return this.translatedLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedText() {
        return this.translatedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.translatedText;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.translatedLanguage;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TranslatedItemData(id=" + this.id + ", translatedText=" + this.translatedText + ", translatedLanguage=" + this.translatedLanguage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TranslatedItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TranslatedItemData> serializer() {
            return TranslatedItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TranslatedItemData(int i, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.translatedText = null;
        } else {
            this.translatedText = str;
        }
        if ((i & 4) == 0) {
            this.translatedLanguage = null;
        } else {
            this.translatedLanguage = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TranslatedItemData translatedItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || translatedItemData.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, translatedItemData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || translatedItemData.translatedText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, translatedItemData.translatedText);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && translatedItemData.translatedLanguage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, translatedItemData.translatedLanguage);
    }

    public TranslatedItemData(long j, String str, String str2) {
        this.id = j;
        this.translatedText = str;
        this.translatedLanguage = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.market.features.meme.preview.domain.model.TranslatedItemData.<init>(long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TranslatedItemData(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
