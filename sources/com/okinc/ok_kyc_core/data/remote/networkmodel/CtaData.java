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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CtaData implements Parcelable {
    private final DialogCtaButton primaryButton;
    private final DialogCtaButton secondaryButton;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CtaData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CtaData(parcel.readInt() == 0 ? null : DialogCtaButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DialogCtaButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaData[] newArray(int i) {
            return new CtaData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CtaData() {
        this((DialogCtaButton) null, (DialogCtaButton) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaData copy$default(CtaData ctaData, DialogCtaButton dialogCtaButton, DialogCtaButton dialogCtaButton2, int i, Object obj) {
        if ((i & 1) != 0) {
            dialogCtaButton = ctaData.primaryButton;
        }
        if ((i & 2) != 0) {
            dialogCtaButton2 = ctaData.secondaryButton;
        }
        return ctaData.copy(dialogCtaButton, dialogCtaButton2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCtaButton component1() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCtaButton component2() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaData copy(DialogCtaButton dialogCtaButton, DialogCtaButton dialogCtaButton2) {
        return new CtaData(dialogCtaButton, dialogCtaButton2);
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
        if (!(obj instanceof CtaData)) {
            return false;
        }
        CtaData ctaData = (CtaData) obj;
        return Intrinsics.EZpvd(this.primaryButton, ctaData.primaryButton) && Intrinsics.EZpvd(this.secondaryButton, ctaData.secondaryButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCtaButton getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCtaButton getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DialogCtaButton dialogCtaButton = this.primaryButton;
        int iHashCode = dialogCtaButton == null ? 0 : dialogCtaButton.hashCode();
        DialogCtaButton dialogCtaButton2 = this.secondaryButton;
        return (iHashCode * 31) + (dialogCtaButton2 != null ? dialogCtaButton2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaData(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DialogCtaButton dialogCtaButton = this.primaryButton;
        if (dialogCtaButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dialogCtaButton.writeToParcel(parcel, i);
        }
        DialogCtaButton dialogCtaButton2 = this.secondaryButton;
        if (dialogCtaButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dialogCtaButton2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaData> serializer() {
            return CtaData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaData(int i, DialogCtaButton dialogCtaButton, DialogCtaButton dialogCtaButton2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.primaryButton = null;
        } else {
            this.primaryButton = dialogCtaButton;
        }
        if ((i & 2) == 0) {
            this.secondaryButton = null;
        } else {
            this.secondaryButton = dialogCtaButton2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaData ctaData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaData.primaryButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DialogCtaButton$$serializer.INSTANCE, ctaData.primaryButton);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && ctaData.secondaryButton == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DialogCtaButton$$serializer.INSTANCE, ctaData.secondaryButton);
    }

    public CtaData(DialogCtaButton dialogCtaButton, DialogCtaButton dialogCtaButton2) {
        this.primaryButton = dialogCtaButton;
        this.secondaryButton = dialogCtaButton2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton) : (r2v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton, com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton):void (m)] (LINE:34) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton, com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton):void type: THIS */
    public /* synthetic */ CtaData(DialogCtaButton dialogCtaButton, DialogCtaButton dialogCtaButton2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dialogCtaButton, (i & 2) != 0 ? null : dialogCtaButton2);
    }
}
