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
public final class SecondaryButton implements Parcelable {
    public static final int $stable = 0;
    private final Boolean enabled;
    private final ButtonStyle style;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SecondaryButton> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, ButtonStyle.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<SecondaryButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecondaryButton createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SecondaryButton(boolValueOf, parcel.readString(), parcel.readInt() != 0 ? ButtonStyle.valueOf(parcel.readString()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecondaryButton[] newArray(int i) {
            return new SecondaryButton[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecondaryButton() {
        this((Boolean) null, (String) null, (ButtonStyle) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SecondaryButton copy$default(SecondaryButton secondaryButton, Boolean bool, String str, ButtonStyle buttonStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = secondaryButton.enabled;
        }
        if ((i & 2) != 0) {
            str = secondaryButton.text;
        }
        if ((i & 4) != 0) {
            buttonStyle = secondaryButton.style;
        }
        return secondaryButton.copy(bool, str, buttonStyle);
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
    public final SecondaryButton copy(Boolean bool, String str, ButtonStyle buttonStyle) {
        return new SecondaryButton(bool, str, buttonStyle);
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
        if (!(obj instanceof SecondaryButton)) {
            return false;
        }
        SecondaryButton secondaryButton = (SecondaryButton) obj;
        return Intrinsics.EZpvd(this.enabled, secondaryButton.enabled) && Intrinsics.EZpvd((Object) this.text, (Object) secondaryButton.text) && this.style == secondaryButton.style;
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
        return "SecondaryButton(enabled=" + this.enabled + ", text=" + this.text + ", style=" + this.style + ")";
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.SecondaryButton.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SecondaryButton> serializer() {
            return SecondaryButton$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SecondaryButton(int i, Boolean bool, String str, ButtonStyle buttonStyle, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SecondaryButton secondaryButton, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(secondaryButton.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, secondaryButton.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) secondaryButton.text, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, secondaryButton.text);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && secondaryButton.style == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], secondaryButton.style);
    }

    public SecondaryButton(Boolean bool, String str, ButtonStyle buttonStyle) {
        this.enabled = bool;
        this.text = str;
        this.style = buttonStyle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r1v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle))
 A[MD:(java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle):void (m)] (LINE:63) call: com.okinc.ok_kyc_core.data.remote.networkmodel.SecondaryButton.<init>(java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle):void type: THIS */
    public /* synthetic */ SecondaryButton(Boolean bool, String str, ButtonStyle buttonStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : buttonStyle);
    }
}
