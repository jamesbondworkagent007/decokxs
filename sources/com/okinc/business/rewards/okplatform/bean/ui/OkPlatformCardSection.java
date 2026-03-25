package com.okinc.business.rewards.okplatform.bean.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OkPlatformCardSection extends OkPlatformEntry implements Parcelable {
    private final OkPlatformCardSectionField fields;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformCardSection> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformCardSection> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformCardSection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OkPlatformCardSection(parcel.readInt() == 0 ? null : OkPlatformCardSectionField.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformCardSection[] newArray(int i) {
            return new OkPlatformCardSection[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformCardSectionField getFields() {
        return this.fields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.ui.OkPlatformEntry, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        OkPlatformCardSectionField okPlatformCardSectionField = this.fields;
        if (okPlatformCardSectionField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            okPlatformCardSectionField.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformCardSection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformCardSection> serializer() {
            return OkPlatformCardSection$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OkPlatformCardSection(int i, String str, String str2, OkPlatformCardSectionField okPlatformCardSectionField, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, OkPlatformCardSection$$serializer.INSTANCE.getDescriptor());
        }
        this.fields = okPlatformCardSectionField;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformCardSection okPlatformCardSection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OkPlatformEntry.write$Self(okPlatformCardSection, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, OkPlatformCardSectionField$$serializer.INSTANCE, okPlatformCardSection.fields);
    }

    public OkPlatformCardSection(OkPlatformCardSectionField okPlatformCardSectionField) {
        this.fields = okPlatformCardSectionField;
    }
}
