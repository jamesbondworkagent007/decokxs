package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class PrimaryButton implements Parcelable {
    public static final int $stable = 0;
    private final Boolean enabled;
    private final ButtonStyle style;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PrimaryButton> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, ButtonStyle.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<PrimaryButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrimaryButton createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PrimaryButton(boolValueOf, parcel.readString(), parcel.readInt() != 0 ? ButtonStyle.valueOf(parcel.readString()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrimaryButton[] newArray(int i) {
            return new PrimaryButton[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PrimaryButton() {
        this((Boolean) null, (String) null, (ButtonStyle) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PrimaryButton copy$default(PrimaryButton primaryButton, Boolean bool, String str, ButtonStyle buttonStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = primaryButton.enabled;
        }
        if ((i & 2) != 0) {
            str = primaryButton.text;
        }
        if ((i & 4) != 0) {
            buttonStyle = primaryButton.style;
        }
        return primaryButton.copy(bool, str, buttonStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonStyle component3() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrimaryButton copy(Boolean bool, String str, ButtonStyle buttonStyle) {
        return new PrimaryButton(bool, str, buttonStyle);
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
        if (!(obj instanceof PrimaryButton)) {
            return false;
        }
        PrimaryButton primaryButton = (PrimaryButton) obj;
        return Intrinsics.EZpvd(this.enabled, primaryButton.enabled) && Intrinsics.EZpvd((Object) this.text, (Object) primaryButton.text) && this.style == primaryButton.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonStyle getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.text;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        ButtonStyle buttonStyle = this.style;
        return (((iHashCode * 31) + iHashCode2) * 31) + (buttonStyle != null ? buttonStyle.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PrimaryButton(enabled=" + this.enabled + ", text=" + this.text + ", style=" + this.style + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.text);
        ButtonStyle buttonStyle = this.style;
        if (buttonStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonStyle.name());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PrimaryButton.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrimaryButton> serializer() {
            return PrimaryButton$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PrimaryButton(int i, Boolean bool, String str, ButtonStyle buttonStyle, SerializationConstructorMarker serializationConstructorMarker) {
        this.enabled = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
        if ((i & 4) == 0) {
            this.style = null;
        } else {
            this.style = buttonStyle;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(PrimaryButton primaryButton, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(primaryButton.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, primaryButton.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) primaryButton.text, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, primaryButton.text);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && primaryButton.style == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], primaryButton.style);
    }

    public PrimaryButton(Boolean bool, String str, ButtonStyle buttonStyle) {
        this.enabled = bool;
        this.text = str;
        this.style = buttonStyle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r1v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle))
 A[MD:(java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle):void (m)] (LINE:54) call: com.okinc.ok_kyc_core.data.remote.networkmodel.PrimaryButton.<init>(java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle):void type: THIS */
    public /* synthetic */ PrimaryButton(Boolean bool, String str, ButtonStyle buttonStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : buttonStyle);
    }
}
