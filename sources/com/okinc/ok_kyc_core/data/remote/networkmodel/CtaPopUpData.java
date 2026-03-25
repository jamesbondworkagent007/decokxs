package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CtaPopUpData implements Parcelable {
    private final CTAButton primaryButton;
    private final CTAButton secondaryButton;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CtaPopUpData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaPopUpData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaPopUpData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CtaPopUpData(parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CTAButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaPopUpData[] newArray(int i) {
            return new CtaPopUpData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CtaPopUpData() {
        this((CTAButton) null, (CTAButton) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaPopUpData copy$default(CtaPopUpData ctaPopUpData, CTAButton cTAButton, CTAButton cTAButton2, int i, Object obj) {
        if ((i & 1) != 0) {
            cTAButton = ctaPopUpData.primaryButton;
        }
        if ((i & 2) != 0) {
            cTAButton2 = ctaPopUpData.secondaryButton;
        }
        return ctaPopUpData.copy(cTAButton, cTAButton2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component1() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component2() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUpData copy(CTAButton cTAButton, CTAButton cTAButton2) {
        return new CtaPopUpData(cTAButton, cTAButton2);
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
        if (!(obj instanceof CtaPopUpData)) {
            return false;
        }
        CtaPopUpData ctaPopUpData = (CtaPopUpData) obj;
        return Intrinsics.EZpvd(this.primaryButton, ctaPopUpData.primaryButton) && Intrinsics.EZpvd(this.secondaryButton, ctaPopUpData.secondaryButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CTAButton cTAButton = this.primaryButton;
        int iHashCode = cTAButton == null ? 0 : cTAButton.hashCode();
        CTAButton cTAButton2 = this.secondaryButton;
        return (iHashCode * 31) + (cTAButton2 != null ? cTAButton2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaPopUpData(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CTAButton cTAButton = this.primaryButton;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
        CTAButton cTAButton2 = this.secondaryButton;
        if (cTAButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaPopUpData> serializer() {
            return CtaPopUpData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaPopUpData(int i, CTAButton cTAButton, CTAButton cTAButton2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.primaryButton = null;
        } else {
            this.primaryButton = cTAButton;
        }
        if ((i & 2) == 0) {
            this.secondaryButton = null;
        } else {
            this.secondaryButton = cTAButton2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaPopUpData ctaPopUpData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaPopUpData.primaryButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CTAButton$$serializer.INSTANCE, ctaPopUpData.primaryButton);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && ctaPopUpData.secondaryButton == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CTAButton$$serializer.INSTANCE, ctaPopUpData.secondaryButton);
    }

    public CtaPopUpData(CTAButton cTAButton, CTAButton cTAButton2) {
        this.primaryButton = cTAButton;
        this.secondaryButton = cTAButton2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r2v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void (m)] (LINE:4982) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void type: THIS */
    public /* synthetic */ CtaPopUpData(CTAButton cTAButton, CTAButton cTAButton2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cTAButton, (i & 2) != 0 ? null : cTAButton2);
    }
}
