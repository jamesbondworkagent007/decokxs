package com.okinc.business.rewards.okplatform.bean.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OkPlatformTextTranslationKeyData extends OkPlatformUIStructureTextData implements Parcelable {
    public static final int $stable = 0;
    private final String content;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OkPlatformTextTranslationKeyData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformTextTranslationKeyData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformTextTranslationKeyData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OkPlatformTextTranslationKeyData(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformTextTranslationKeyData[] newArray(int i) {
            return new OkPlatformTextTranslationKeyData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OkPlatformTextTranslationKeyData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OkPlatformTextTranslationKeyData copy$default(OkPlatformTextTranslationKeyData okPlatformTextTranslationKeyData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = okPlatformTextTranslationKeyData.content;
        }
        return okPlatformTextTranslationKeyData.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformTextTranslationKeyData copy(String str) {
        return new OkPlatformTextTranslationKeyData(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OkPlatformTextTranslationKeyData) && Intrinsics.EZpvd((Object) this.content, (Object) ((OkPlatformTextTranslationKeyData) obj).content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.content;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OkPlatformTextTranslationKeyData(content=" + this.content + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.content);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformTextTranslationKeyData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformTextTranslationKeyData> serializer() {
            return OkPlatformTextTranslationKeyData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkPlatformTextTranslationKeyData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, serializationConstructorMarker);
        if ((i & 2) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformTextTranslationKeyData okPlatformTextTranslationKeyData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OkPlatformUIStructureTextData.write$Self(okPlatformTextTranslationKeyData, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) okPlatformTextTranslationKeyData.content, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, okPlatformTextTranslationKeyData.content);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:11) call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformTextTranslationKeyData.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ OkPlatformTextTranslationKeyData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public OkPlatformTextTranslationKeyData(String str) {
        this.content = str;
    }
}
