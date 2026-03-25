package com.okinc.okassetslite.api.assets_lite_api.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CustomCell implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("customField1")
    private final CustomField customField1;

    @SerializedName("customField2")
    private final CustomField customField2;

    @SerializedName("customField3")
    private final CustomField customField3;

    @SerializedName("customField4")
    private final CustomField customField4;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CustomCell> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CustomCell> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomCell createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CustomCell(parcel.readInt() == 0 ? null : CustomField.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CustomField.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CustomField.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CustomField.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomCell[] newArray(int i) {
            return new CustomCell[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomCell() {
        this((CustomField) null, (CustomField) null, (CustomField) null, (CustomField) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CustomCell copy$default(CustomCell customCell, CustomField customField, CustomField customField2, CustomField customField3, CustomField customField4, int i, Object obj) {
        if ((i & 1) != 0) {
            customField = customCell.customField1;
        }
        if ((i & 2) != 0) {
            customField2 = customCell.customField2;
        }
        if ((i & 4) != 0) {
            customField3 = customCell.customField3;
        }
        if ((i & 8) != 0) {
            customField4 = customCell.customField4;
        }
        return customCell.copy(customField, customField2, customField3, customField4);
    }

    @SerialName("customField1")
    public static /* synthetic */ void getCustomField1$annotations() {
    }

    @SerialName("customField2")
    public static /* synthetic */ void getCustomField2$annotations() {
    }

    @SerialName("customField3")
    public static /* synthetic */ void getCustomField3$annotations() {
    }

    @SerialName("customField4")
    public static /* synthetic */ void getCustomField4$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomField component1() {
        return this.customField1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomField component2() {
        return this.customField2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomField component3() {
        return this.customField3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomField component4() {
        return this.customField4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomCell copy(CustomField customField, CustomField customField2, CustomField customField3, CustomField customField4) {
        return new CustomCell(customField, customField2, customField3, customField4);
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
        if (!(obj instanceof CustomCell)) {
            return false;
        }
        CustomCell customCell = (CustomCell) obj;
        return Intrinsics.EZpvd(this.customField1, customCell.customField1) && Intrinsics.EZpvd(this.customField2, customCell.customField2) && Intrinsics.EZpvd(this.customField3, customCell.customField3) && Intrinsics.EZpvd(this.customField4, customCell.customField4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomField getCustomField1() {
        return this.customField1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomField getCustomField2() {
        return this.customField2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomField getCustomField3() {
        return this.customField3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomField getCustomField4() {
        return this.customField4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CustomField customField = this.customField1;
        int iHashCode = customField == null ? 0 : customField.hashCode();
        CustomField customField2 = this.customField2;
        int iHashCode2 = customField2 == null ? 0 : customField2.hashCode();
        CustomField customField3 = this.customField3;
        int iHashCode3 = customField3 == null ? 0 : customField3.hashCode();
        CustomField customField4 = this.customField4;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (customField4 != null ? customField4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomCell(customField1=" + this.customField1 + ", customField2=" + this.customField2 + ", customField3=" + this.customField3 + ", customField4=" + this.customField4 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CustomField customField = this.customField1;
        if (customField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customField.writeToParcel(parcel, i);
        }
        CustomField customField2 = this.customField2;
        if (customField2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customField2.writeToParcel(parcel, i);
        }
        CustomField customField3 = this.customField3;
        if (customField3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customField3.writeToParcel(parcel, i);
        }
        CustomField customField4 = this.customField4;
        if (customField4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customField4.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.common.model.CustomCell.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CustomCell> serializer() {
            return CustomCell$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomCell(int i, CustomField customField, CustomField customField2, CustomField customField3, CustomField customField4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.customField1 = null;
        } else {
            this.customField1 = customField;
        }
        if ((i & 2) == 0) {
            this.customField2 = null;
        } else {
            this.customField2 = customField2;
        }
        if ((i & 4) == 0) {
            this.customField3 = null;
        } else {
            this.customField3 = customField3;
        }
        if ((i & 8) == 0) {
            this.customField4 = null;
        } else {
            this.customField4 = customField4;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssetsLite_assets_lite_api(CustomCell customCell, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || customCell.customField1 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CustomField$$serializer.INSTANCE, customCell.customField1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || customCell.customField2 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CustomField$$serializer.INSTANCE, customCell.customField2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || customCell.customField3 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, CustomField$$serializer.INSTANCE, customCell.customField3);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && customCell.customField4 == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CustomField$$serializer.INSTANCE, customCell.customField4);
    }

    public CustomCell(CustomField customField, CustomField customField2, CustomField customField3, CustomField customField4) {
        this.customField1 = customField;
        this.customField2 = customField2;
        this.customField3 = customField3;
        this.customField4 = customField4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField) : (r2v0 com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField) : (r3v0 com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField) : (r4v0 com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField) : (r5v0 com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField))
 A[MD:(com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField, com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField, com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField, com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField):void (m)] (LINE:156) call: com.okinc.okassetslite.api.assets_lite_api.common.model.CustomCell.<init>(com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField, com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField, com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField, com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField):void type: THIS */
    public /* synthetic */ CustomCell(CustomField customField, CustomField customField2, CustomField customField3, CustomField customField4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customField, (i & 2) != 0 ? null : customField2, (i & 4) != 0 ? null : customField3, (i & 8) != 0 ? null : customField4);
    }
}
