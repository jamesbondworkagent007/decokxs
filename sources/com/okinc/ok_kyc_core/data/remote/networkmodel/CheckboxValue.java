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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CheckboxValue implements Parcelable {
    private final Boolean disabled;
    private final Boolean isCheckboxVisible;
    private Boolean isSelected;
    private final String rightText;
    private final String subtitle;
    private final HelperLabelTag tag;
    private final String thumbnail;
    private final String title;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CheckboxValue> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CheckboxValue> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckboxValue createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CheckboxValue(boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? HelperLabelTag.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckboxValue[] newArray(int i) {
            return new CheckboxValue[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isCheckboxVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.disabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.rightText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelTag component9() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckboxValue copy(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, @NotNull String str4, String str5, HelperLabelTag helperLabelTag) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new CheckboxValue(bool, bool2, bool3, str, str2, str3, str4, str5, helperLabelTag);
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
        if (!(obj instanceof CheckboxValue)) {
            return false;
        }
        CheckboxValue checkboxValue = (CheckboxValue) obj;
        return Intrinsics.EZpvd(this.isCheckboxVisible, checkboxValue.isCheckboxVisible) && Intrinsics.EZpvd(this.disabled, checkboxValue.disabled) && Intrinsics.EZpvd(this.isSelected, checkboxValue.isSelected) && Intrinsics.EZpvd((Object) this.thumbnail, (Object) checkboxValue.thumbnail) && Intrinsics.EZpvd((Object) this.title, (Object) checkboxValue.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) checkboxValue.subtitle) && Intrinsics.EZpvd((Object) this.value, (Object) checkboxValue.value) && Intrinsics.EZpvd((Object) this.rightText, (Object) checkboxValue.rightText) && Intrinsics.EZpvd(this.tag, checkboxValue.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightText() {
        return this.rightText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelTag getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isCheckboxVisible;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.disabled;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isSelected;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        String str = this.thumbnail;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.subtitle;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        int iHashCode7 = this.value.hashCode();
        String str4 = this.rightText;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        HelperLabelTag helperLabelTag = this.tag;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (helperLabelTag != null ? helperLabelTag.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isCheckboxVisible() {
        return this.isCheckboxVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(Boolean bool) {
        this.isSelected = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckboxValue(isCheckboxVisible=" + this.isCheckboxVisible + ", disabled=" + this.disabled + ", isSelected=" + this.isSelected + ", thumbnail=" + this.thumbnail + ", title=" + this.title + ", subtitle=" + this.subtitle + ", value=" + this.value + ", rightText=" + this.rightText + ", tag=" + this.tag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.isCheckboxVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.disabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isSelected;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.value);
        parcel.writeString(this.rightText);
        HelperLabelTag helperLabelTag = this.tag;
        if (helperLabelTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            helperLabelTag.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxValue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckboxValue> serializer() {
            return CheckboxValue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckboxValue(int i, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, HelperLabelTag helperLabelTag, SerializationConstructorMarker serializationConstructorMarker) {
        if (64 != (i & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i, 64, CheckboxValue$$serializer.INSTANCE.getDescriptor());
        }
        this.isCheckboxVisible = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.disabled = Boolean.FALSE;
        } else {
            this.disabled = bool2;
        }
        if ((i & 4) == 0) {
            this.isSelected = Boolean.FALSE;
        } else {
            this.isSelected = bool3;
        }
        if ((i & 8) == 0) {
            this.thumbnail = null;
        } else {
            this.thumbnail = str;
        }
        if ((i & 16) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 32) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str3;
        }
        this.value = str4;
        if ((i & 128) == 0) {
            this.rightText = "";
        } else {
            this.rightText = str5;
        }
        if ((i & 256) == 0) {
            this.tag = null;
        } else {
            this.tag = helperLabelTag;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CheckboxValue checkboxValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(checkboxValue.isCheckboxVisible, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, checkboxValue.isCheckboxVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(checkboxValue.disabled, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, checkboxValue.disabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(checkboxValue.isSelected, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, checkboxValue.isSelected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || checkboxValue.thumbnail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, checkboxValue.thumbnail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) checkboxValue.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, checkboxValue.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) checkboxValue.subtitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, checkboxValue.subtitle);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, checkboxValue.value);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) checkboxValue.rightText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, checkboxValue.rightText);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && checkboxValue.tag == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, HelperLabelTag$$serializer.INSTANCE, checkboxValue.tag);
    }

    public CheckboxValue(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, @NotNull String str4, String str5, HelperLabelTag helperLabelTag) {
        Intrinsics.checkNotNullParameter(str4, "");
        this.isCheckboxVisible = bool;
        this.disabled = bool2;
        this.isSelected = bool3;
        this.thumbnail = str;
        this.title = str2;
        this.subtitle = str3;
        this.value = str4;
        this.rightText = str5;
        this.tag = helperLabelTag;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r13v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag):void (m)] (LINE:5253) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxValue.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag):void type: THIS */
    public /* synthetic */ CheckboxValue(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, HelperLabelTag helperLabelTag, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? Boolean.FALSE : bool3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? null : helperLabelTag);
    }
}
