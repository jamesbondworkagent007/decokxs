package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CtaPopUp implements Parcelable {
    private final CTAButtonAppModel primaryButton;
    private final CTAButtonAppModel secondaryButton;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CtaPopUp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaPopUp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaPopUp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CtaPopUp(parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CTAButtonAppModel.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaPopUp[] newArray(int i) {
            return new CtaPopUp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaPopUp copy$default(CtaPopUp ctaPopUp, CTAButtonAppModel cTAButtonAppModel, CTAButtonAppModel cTAButtonAppModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            cTAButtonAppModel = ctaPopUp.primaryButton;
        }
        if ((i & 2) != 0) {
            cTAButtonAppModel2 = ctaPopUp.secondaryButton;
        }
        return ctaPopUp.copy(cTAButtonAppModel, cTAButtonAppModel2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component1() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component2() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUp copy(CTAButtonAppModel cTAButtonAppModel, CTAButtonAppModel cTAButtonAppModel2) {
        return new CtaPopUp(cTAButtonAppModel, cTAButtonAppModel2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CtaPopUp)) {
            return false;
        }
        CtaPopUp ctaPopUp = (CtaPopUp) obj;
        return Intrinsics.EZpvd(this.primaryButton, ctaPopUp.primaryButton) && Intrinsics.EZpvd(this.secondaryButton, ctaPopUp.secondaryButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CTAButtonAppModel cTAButtonAppModel = this.primaryButton;
        int iHashCode = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
        CTAButtonAppModel cTAButtonAppModel2 = this.secondaryButton;
        return (iHashCode * 31) + (cTAButtonAppModel2 != null ? cTAButtonAppModel2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaPopUp(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CTAButtonAppModel cTAButtonAppModel = this.primaryButton;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
        CTAButtonAppModel cTAButtonAppModel2 = this.secondaryButton;
        if (cTAButtonAppModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaPopUp> serializer() {
            return CtaPopUp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaPopUp(int i, CTAButtonAppModel cTAButtonAppModel, CTAButtonAppModel cTAButtonAppModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CtaPopUp$$serializer.INSTANCE.getDescriptor());
        }
        this.primaryButton = cTAButtonAppModel;
        this.secondaryButton = cTAButtonAppModel2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaPopUp ctaPopUp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        CTAButtonAppModel$$serializer cTAButtonAppModel$$serializer = CTAButtonAppModel$$serializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, cTAButtonAppModel$$serializer, ctaPopUp.primaryButton);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, cTAButtonAppModel$$serializer, ctaPopUp.secondaryButton);
    }

    public CtaPopUp(CTAButtonAppModel cTAButtonAppModel, CTAButtonAppModel cTAButtonAppModel2) {
        this.primaryButton = cTAButtonAppModel;
        this.secondaryButton = cTAButtonAppModel2;
    }
}
