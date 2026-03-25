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
import kotlinx.serialization.internal.StringSerializer;
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CtaIcon implements Parcelable {
    public static final int $stable = 0;
    private final String height;
    private final String name;
    private final UIAlignment position;
    private final String renderColor;
    private final String width;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CtaIcon> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaIcon> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaIcon createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CtaIcon(parcel.readInt() == 0 ? null : UIAlignment.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaIcon[] newArray(int i) {
            return new CtaIcon[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CtaIcon() {
        this((UIAlignment) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaIcon copy$default(CtaIcon ctaIcon, UIAlignment uIAlignment, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            uIAlignment = ctaIcon.position;
        }
        if ((i & 2) != 0) {
            str = ctaIcon.name;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = ctaIcon.width;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = ctaIcon.height;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = ctaIcon.renderColor;
        }
        return ctaIcon.copy(uIAlignment, str5, str6, str7, str4);
    }

    @Serializable(with = C43788rvr.class)
    public static /* synthetic */ void getPosition$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment component1() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.renderColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaIcon copy(UIAlignment uIAlignment, String str, String str2, String str3, String str4) {
        return new CtaIcon(uIAlignment, str, str2, str3, str4);
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
        if (!(obj instanceof CtaIcon)) {
            return false;
        }
        CtaIcon ctaIcon = (CtaIcon) obj;
        return this.position == ctaIcon.position && Intrinsics.EZpvd((Object) this.name, (Object) ctaIcon.name) && Intrinsics.EZpvd((Object) this.width, (Object) ctaIcon.width) && Intrinsics.EZpvd((Object) this.height, (Object) ctaIcon.height) && Intrinsics.EZpvd((Object) this.renderColor, (Object) ctaIcon.renderColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRenderColor() {
        return this.renderColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        UIAlignment uIAlignment = this.position;
        int iHashCode = uIAlignment == null ? 0 : uIAlignment.hashCode();
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.width;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.height;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.renderColor;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaIcon(position=" + this.position + ", name=" + this.name + ", width=" + this.width + ", height=" + this.height + ", renderColor=" + this.renderColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        UIAlignment uIAlignment = this.position;
        if (uIAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uIAlignment.name());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.width);
        parcel.writeString(this.height);
        parcel.writeString(this.renderColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaIcon> serializer() {
            return CtaIcon$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaIcon(int i, UIAlignment uIAlignment, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.position = (i & 1) == 0 ? UIAlignment.Leading : uIAlignment;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.width = null;
        } else {
            this.width = str2;
        }
        if ((i & 8) == 0) {
            this.height = null;
        } else {
            this.height = str3;
        }
        if ((i & 16) == 0) {
            this.renderColor = null;
        } else {
            this.renderColor = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaIcon ctaIcon, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaIcon.position != UIAlignment.Leading) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, C43788rvr.KWHzl, ctaIcon.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ctaIcon.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ctaIcon.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || ctaIcon.width != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, ctaIcon.width);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || ctaIcon.height != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, ctaIcon.height);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && ctaIcon.renderColor == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, ctaIcon.renderColor);
    }

    public CtaIcon(UIAlignment uIAlignment, String str, String str2, String str3, String str4) {
        this.position = uIAlignment;
        this.name = str;
        this.width = str2;
        this.height = str3;
        this.renderColor = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:0x0004: SGET  A[WRAPPED] (LINE:1465) com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment.Leading com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment) : (r4v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1464) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CtaIcon(UIAlignment uIAlignment, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UIAlignment.Leading : uIAlignment, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null);
    }
}
