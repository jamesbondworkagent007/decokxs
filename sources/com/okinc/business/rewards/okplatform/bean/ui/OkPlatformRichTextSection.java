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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OkPlatformRichTextSection extends OkPlatformEntry implements Parcelable {
    private final OkPlatformRichTextSectionField fields;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformRichTextSection> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformRichTextSection> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRichTextSection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OkPlatformRichTextSection(parcel.readInt() == 0 ? null : OkPlatformRichTextSectionField.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRichTextSection[] newArray(int i) {
            return new OkPlatformRichTextSection[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OkPlatformRichTextSection() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformRichTextSectionField getFields() {
        return this.fields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.ui.OkPlatformEntry, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        OkPlatformRichTextSectionField okPlatformRichTextSectionField = this.fields;
        if (okPlatformRichTextSectionField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            okPlatformRichTextSectionField.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformRichTextSection> serializer() {
            return OkPlatformRichTextSection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkPlatformRichTextSection(int i, String str, String str2, OkPlatformRichTextSectionField okPlatformRichTextSectionField, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if ((i & 4) == 0) {
            this.fields = null;
        } else {
            this.fields = okPlatformRichTextSectionField;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformRichTextSection okPlatformRichTextSection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OkPlatformEntry.write$Self(okPlatformRichTextSection, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && okPlatformRichTextSection.fields == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, OkPlatformRichTextSectionField$$serializer.INSTANCE, okPlatformRichTextSection.fields);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSectionField:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSectionField) : (r1v0 com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSectionField))
 A[MD:(com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSectionField):void (m)] (LINE:10) call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSection.<init>(com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSectionField):void type: THIS */
    public /* synthetic */ OkPlatformRichTextSection(OkPlatformRichTextSectionField okPlatformRichTextSectionField, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : okPlatformRichTextSectionField);
    }

    public OkPlatformRichTextSection(OkPlatformRichTextSectionField okPlatformRichTextSectionField) {
        this.fields = okPlatformRichTextSectionField;
    }
}
