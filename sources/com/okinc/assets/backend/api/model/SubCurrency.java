package com.okinc.assets.backend.api.model;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class SubCurrency implements Parcelable {
    private String desc;
    private boolean needTag;
    private final String networkIcon;
    private final String networkName;
    private SpecialField specialField;
    private String subCurrency;
    private int subCurrencyId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SubCurrency> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SubCurrency> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubCurrency createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SubCurrency(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SpecialField.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubCurrency[] newArray(int i) {
            return new SubCurrency[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubCurrency() {
        this((String) null, (String) null, 0, false, (SpecialField) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SubCurrency copy$default(SubCurrency subCurrency, String str, String str2, int i, boolean z, SpecialField specialField, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subCurrency.desc;
        }
        if ((i2 & 2) != 0) {
            str2 = subCurrency.subCurrency;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = subCurrency.subCurrencyId;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = subCurrency.needTag;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            specialField = subCurrency.specialField;
        }
        SpecialField specialField2 = specialField;
        if ((i2 & 32) != 0) {
            str3 = subCurrency.networkName;
        }
        String str6 = str3;
        if ((i2 & 64) != 0) {
            str4 = subCurrency.networkIcon;
        }
        return subCurrency.copy(str, str5, i3, z2, specialField2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField component5() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubCurrency copy(String str, String str2, int i, boolean z, SpecialField specialField, String str3, String str4) {
        return new SubCurrency(str, str2, i, z, specialField, str3, str4);
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
        if (!(obj instanceof SubCurrency)) {
            return false;
        }
        SubCurrency subCurrency = (SubCurrency) obj;
        return Intrinsics.EZpvd((Object) this.desc, (Object) subCurrency.desc) && Intrinsics.EZpvd((Object) this.subCurrency, (Object) subCurrency.subCurrency) && this.subCurrencyId == subCurrency.subCurrencyId && this.needTag == subCurrency.needTag && Intrinsics.EZpvd(this.specialField, subCurrency.specialField) && Intrinsics.EZpvd((Object) this.networkName, (Object) subCurrency.networkName) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) subCurrency.networkIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTag() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkIcon() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField getSpecialField() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubCurrency() {
        return this.subCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.desc;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.subCurrency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Integer.hashCode(this.subCurrencyId);
        int iHashCode4 = Boolean.hashCode(this.needTag);
        SpecialField specialField = this.specialField;
        int iHashCode5 = specialField == null ? 0 : specialField.hashCode();
        String str3 = this.networkName;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.networkIcon;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDesc(String str) {
        this.desc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedTag(boolean z) {
        this.needTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpecialField(SpecialField specialField) {
        this.specialField = specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrency(String str) {
        this.subCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(int i) {
        this.subCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubCurrency(desc=" + this.desc + ", subCurrency=" + this.subCurrency + ", subCurrencyId=" + this.subCurrencyId + ", needTag=" + this.needTag + ", specialField=" + this.specialField + ", networkName=" + this.networkName + ", networkIcon=" + this.networkIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.desc);
        parcel.writeString(this.subCurrency);
        parcel.writeInt(this.subCurrencyId);
        parcel.writeInt(this.needTag ? 1 : 0);
        SpecialField specialField = this.specialField;
        if (specialField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialField.writeToParcel(parcel, i);
        }
        parcel.writeString(this.networkName);
        parcel.writeString(this.networkIcon);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.SubCurrency.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubCurrency> serializer() {
            return SubCurrency$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubCurrency(int i, String str, String str2, int i2, boolean z, SpecialField specialField, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.desc = "";
        } else {
            this.desc = str;
        }
        if ((i & 2) == 0) {
            this.subCurrency = "";
        } else {
            this.subCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.subCurrencyId = -1;
        } else {
            this.subCurrencyId = i2;
        }
        if ((i & 8) == 0) {
            this.needTag = false;
        } else {
            this.needTag = z;
        }
        if ((i & 16) == 0) {
            this.specialField = null;
        } else {
            this.specialField = specialField;
        }
        if ((i & 32) == 0) {
            this.networkName = null;
        } else {
            this.networkName = str3;
        }
        if ((i & 64) == 0) {
            this.networkIcon = null;
        } else {
            this.networkIcon = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(SubCurrency subCurrency, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) subCurrency.desc, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subCurrency.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) subCurrency.subCurrency, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subCurrency.subCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subCurrency.subCurrencyId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, subCurrency.subCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subCurrency.needTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, subCurrency.needTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subCurrency.specialField != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, SubCurrency$SpecialField$$serializer.INSTANCE, subCurrency.specialField);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subCurrency.networkName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, subCurrency.networkName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && subCurrency.networkIcon == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, subCurrency.networkIcon);
    }

    public SubCurrency(String str, String str2, int i, boolean z, SpecialField specialField, String str3, String str4) {
        this.desc = str;
        this.subCurrency = str2;
        this.subCurrencyId = i;
        this.needTag = z;
        this.specialField = specialField;
        this.networkName = str3;
        this.networkIcon = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:int:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r8v0 int))
  (wrap:boolean:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:com.okinc.assets.backend.api.model.SubCurrency$SpecialField:?: TERNARY null = ((wrap:int:0x001b: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.SubCurrency$SpecialField) : (r10v0 com.okinc.assets.backend.api.model.SubCurrency$SpecialField))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, boolean, com.okinc.assets.backend.api.model.SubCurrency$SpecialField, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.assets.backend.api.model.SubCurrency.<init>(java.lang.String, java.lang.String, int, boolean, com.okinc.assets.backend.api.model.SubCurrency$SpecialField, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SubCurrency(String str, String str2, int i, boolean z, SpecialField specialField, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : specialField, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4);
    }

    @Serializable
    public static final class SpecialField implements Parcelable {
        private String field;
        private String fieldStr;
        private boolean required;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SpecialField> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SpecialField> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpecialField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SpecialField(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpecialField[] newArray(int i) {
                return new SpecialField[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SpecialField() {
            this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SpecialField copy$default(SpecialField specialField, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = specialField.field;
            }
            if ((i & 2) != 0) {
                str2 = specialField.fieldStr;
            }
            if ((i & 4) != 0) {
                z = specialField.required;
            }
            return specialField.copy(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.field;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.fieldStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.required;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SpecialField copy(String str, String str2, boolean z) {
            return new SpecialField(str, str2, z);
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
            if (!(obj instanceof SpecialField)) {
                return false;
            }
            SpecialField specialField = (SpecialField) obj;
            return Intrinsics.EZpvd((Object) this.field, (Object) specialField.field) && Intrinsics.EZpvd((Object) this.fieldStr, (Object) specialField.fieldStr) && this.required == specialField.required;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getField() {
            return this.field;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFieldStr() {
            return this.fieldStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getRequired() {
            return this.required;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.field;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.fieldStr;
            return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.required);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setField(String str) {
            this.field = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFieldStr(String str) {
            this.fieldStr = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRequired(boolean z) {
            this.required = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SpecialField(field=" + this.field + ", fieldStr=" + this.fieldStr + ", required=" + this.required + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.field);
            parcel.writeString(this.fieldStr);
            parcel.writeInt(this.required ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.SubCurrency.SpecialField.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SpecialField> serializer() {
                return SubCurrency$SpecialField$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SpecialField(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.field = null;
            } else {
                this.field = str;
            }
            if ((i & 2) == 0) {
                this.fieldStr = null;
            } else {
                this.fieldStr = str2;
            }
            if ((i & 4) == 0) {
                this.required = false;
            } else {
                this.required = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(SpecialField specialField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || specialField.field != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, specialField.field);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || specialField.fieldStr != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, specialField.fieldStr);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || specialField.required) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 2, specialField.required);
            }
        }

        public SpecialField(String str, String str2, boolean z) {
            this.field = str;
            this.fieldStr = str2;
            this.required = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:24) call: com.okinc.assets.backend.api.model.SubCurrency.SpecialField.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ SpecialField(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
        }
    }
}
