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
public final class LinkTextStyle implements Parcelable {
    public static final int $stable = 0;
    private final Boolean isBold;
    private final Boolean isUnderLineBold;
    private final String linkColor;
    private final String underLineColor;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LinkTextStyle> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LinkTextStyle> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTextStyle createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LinkTextStyle(boolValueOf, boolValueOf2, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTextStyle[] newArray(int i) {
            return new LinkTextStyle[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LinkTextStyle() {
        this((Boolean) null, (Boolean) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LinkTextStyle copy$default(LinkTextStyle linkTextStyle, Boolean bool, Boolean bool2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = linkTextStyle.isBold;
        }
        if ((i & 2) != 0) {
            bool2 = linkTextStyle.isUnderLineBold;
        }
        if ((i & 4) != 0) {
            str = linkTextStyle.underLineColor;
        }
        if ((i & 8) != 0) {
            str2 = linkTextStyle.linkColor;
        }
        return linkTextStyle.copy(bool, bool2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isUnderLineBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.underLineColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.linkColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyle copy(Boolean bool, Boolean bool2, String str, String str2) {
        return new LinkTextStyle(bool, bool2, str, str2);
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
        if (!(obj instanceof LinkTextStyle)) {
            return false;
        }
        LinkTextStyle linkTextStyle = (LinkTextStyle) obj;
        return Intrinsics.EZpvd(this.isBold, linkTextStyle.isBold) && Intrinsics.EZpvd(this.isUnderLineBold, linkTextStyle.isUnderLineBold) && Intrinsics.EZpvd((Object) this.underLineColor, (Object) linkTextStyle.underLineColor) && Intrinsics.EZpvd((Object) this.linkColor, (Object) linkTextStyle.linkColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinkColor() {
        return this.linkColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnderLineColor() {
        return this.underLineColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isBold;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isUnderLineBold;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.underLineColor;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.linkColor;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBold() {
        return this.isBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isUnderLineBold() {
        return this.isUnderLineBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LinkTextStyle(isBold=" + this.isBold + ", isUnderLineBold=" + this.isUnderLineBold + ", underLineColor=" + this.underLineColor + ", linkColor=" + this.linkColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.isBold;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isUnderLineBold;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.underLineColor);
        parcel.writeString(this.linkColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkTextStyle> serializer() {
            return LinkTextStyle$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LinkTextStyle(int i, Boolean bool, Boolean bool2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.isBold = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.isUnderLineBold = Boolean.FALSE;
        } else {
            this.isUnderLineBold = bool2;
        }
        if ((i & 4) == 0) {
            this.underLineColor = null;
        } else {
            this.underLineColor = str;
        }
        if ((i & 8) == 0) {
            this.linkColor = null;
        } else {
            this.linkColor = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(LinkTextStyle linkTextStyle, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(linkTextStyle.isBold, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, linkTextStyle.isBold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(linkTextStyle.isUnderLineBold, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, linkTextStyle.isUnderLineBold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || linkTextStyle.underLineColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, linkTextStyle.underLineColor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && linkTextStyle.linkColor == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, linkTextStyle.linkColor);
    }

    public LinkTextStyle(Boolean bool, Boolean bool2, String str, String str2) {
        this.isBold = bool;
        this.isUnderLineBold = bool2;
        this.underLineColor = str;
        this.linkColor = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:1986) call: com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LinkTextStyle(Boolean bool, Boolean bool2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
