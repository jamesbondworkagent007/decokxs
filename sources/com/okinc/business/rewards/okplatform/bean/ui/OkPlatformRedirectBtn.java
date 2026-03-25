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
public final class OkPlatformRedirectBtn extends OkPlatformEntry implements Parcelable {
    private final OkPlatformRedirectBtnField fields;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformRedirectBtn> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformRedirectBtn> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRedirectBtn createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OkPlatformRedirectBtn(parcel.readInt() == 0 ? null : OkPlatformRedirectBtnField.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRedirectBtn[] newArray(int i) {
            return new OkPlatformRedirectBtn[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformRedirectBtnField getFields() {
        return this.fields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.ui.OkPlatformEntry, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        OkPlatformRedirectBtnField okPlatformRedirectBtnField = this.fields;
        if (okPlatformRedirectBtnField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            okPlatformRedirectBtnField.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRedirectBtn.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformRedirectBtn> serializer() {
            return OkPlatformRedirectBtn$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OkPlatformRedirectBtn(int i, String str, String str2, OkPlatformRedirectBtnField okPlatformRedirectBtnField, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, OkPlatformRedirectBtn$$serializer.INSTANCE.getDescriptor());
        }
        this.fields = okPlatformRedirectBtnField;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformRedirectBtn okPlatformRedirectBtn, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OkPlatformEntry.write$Self(okPlatformRedirectBtn, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, OkPlatformRedirectBtnField$$serializer.INSTANCE, okPlatformRedirectBtn.fields);
    }

    public OkPlatformRedirectBtn(OkPlatformRedirectBtnField okPlatformRedirectBtnField) {
        this.fields = okPlatformRedirectBtnField;
    }
}
