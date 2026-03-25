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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CustomField implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("type")
    private final CustomFieldType type;

    @SerializedName("value")
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CustomField> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {CustomFieldType.Companion.serializer(), null};

    public static final class Creator implements Parcelable.Creator<CustomField> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomField createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CustomField(parcel.readInt() == 0 ? null : CustomFieldType.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomField[] newArray(int i) {
            return new CustomField[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomField() {
        this((CustomFieldType) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CustomField copy$default(CustomField customField, CustomFieldType customFieldType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            customFieldType = customField.type;
        }
        if ((i & 2) != 0) {
            str = customField.value;
        }
        return customField.copy(customFieldType, str);
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomFieldType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomField copy(CustomFieldType customFieldType, String str) {
        return new CustomField(customFieldType, str);
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
        if (!(obj instanceof CustomField)) {
            return false;
        }
        CustomField customField = (CustomField) obj;
        return this.type == customField.type && Intrinsics.EZpvd((Object) this.value, (Object) customField.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomFieldType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CustomFieldType customFieldType = this.type;
        int iHashCode = customFieldType == null ? 0 : customFieldType.hashCode();
        String str = this.value;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomField(type=" + this.type + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CustomFieldType customFieldType = this.type;
        if (customFieldType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customFieldType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CustomField> serializer() {
            return CustomField$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomField(int i, CustomFieldType customFieldType, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i & 1) == 0 ? CustomFieldType.TIMESTAMP : customFieldType;
        if ((i & 2) == 0) {
            this.value = "";
        } else {
            this.value = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssetsLite_assets_lite_api(CustomField customField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || customField.type != CustomFieldType.TIMESTAMP) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], customField.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) customField.value, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, customField.value);
    }

    public CustomField(CustomFieldType customFieldType, String str) {
        this.type = customFieldType;
        this.value = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType:0x0004: SGET  A[WRAPPED] (LINE:177) com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType.TIMESTAMP com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType) : (r1v0 com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType, java.lang.String):void (m)] (LINE:174) call: com.okinc.okassetslite.api.assets_lite_api.common.model.CustomField.<init>(com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType, java.lang.String):void type: THIS */
    public /* synthetic */ CustomField(CustomFieldType customFieldType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CustomFieldType.TIMESTAMP : customFieldType, (i & 2) != 0 ? "" : str);
    }
}
