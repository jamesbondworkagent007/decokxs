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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UpgradePopUpAppModel extends PopUpComponentAppModel implements Parcelable {
    private final UpgradeActionParams actionParams;
    private final String id;
    private final Boolean required;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UpgradePopUpAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UpgradePopUpAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpgradePopUpAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = null;
            UpgradeActionParams upgradeActionParamsCreateFromParcel = parcel.readInt() == 0 ? null : UpgradeActionParams.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UpgradePopUpAppModel(upgradeActionParamsCreateFromParcel, string, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpgradePopUpAppModel[] newArray(int i) {
            return new UpgradePopUpAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpgradePopUpAppModel copy$default(UpgradePopUpAppModel upgradePopUpAppModel, UpgradeActionParams upgradeActionParams, String str, Boolean bool, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            upgradeActionParams = upgradePopUpAppModel.actionParams;
        }
        if ((i & 2) != 0) {
            str = upgradePopUpAppModel.id;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            bool = upgradePopUpAppModel.required;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str2 = upgradePopUpAppModel.version;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = upgradePopUpAppModel.value;
        }
        return upgradePopUpAppModel.copy(upgradeActionParams, str4, bool2, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpgradeActionParams component1() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpgradePopUpAppModel copy(UpgradeActionParams upgradeActionParams, @NotNull String str, Boolean bool, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UpgradePopUpAppModel(upgradeActionParams, str, bool, str2, str3);
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
        if (!(obj instanceof UpgradePopUpAppModel)) {
            return false;
        }
        UpgradePopUpAppModel upgradePopUpAppModel = (UpgradePopUpAppModel) obj;
        return Intrinsics.EZpvd(this.actionParams, upgradePopUpAppModel.actionParams) && Intrinsics.EZpvd((Object) this.id, (Object) upgradePopUpAppModel.id) && Intrinsics.EZpvd(this.required, upgradePopUpAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) upgradePopUpAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) upgradePopUpAppModel.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpgradeActionParams getActionParams() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        UpgradeActionParams upgradeActionParams = this.actionParams;
        int iHashCode = upgradeActionParams == null ? 0 : upgradeActionParams.hashCode();
        int iHashCode2 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str = this.version;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpgradePopUpAppModel(actionParams=" + this.actionParams + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        UpgradeActionParams upgradeActionParams = this.actionParams;
        if (upgradeActionParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            upgradeActionParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
        Boolean bool = this.required;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradePopUpAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpgradePopUpAppModel> serializer() {
            return UpgradePopUpAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpgradePopUpAppModel(int i, UpgradeActionParams upgradeActionParams, String str, Boolean bool, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (27 != (i & 27)) {
            PluginExceptionsKt.throwMissingFieldException(i, 27, UpgradePopUpAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.actionParams = upgradeActionParams;
        this.id = str;
        if ((i & 4) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        this.version = str2;
        this.value = str3;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(UpgradePopUpAppModel upgradePopUpAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PopUpComponentAppModel.write$Self(upgradePopUpAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, UpgradeActionParams$$serializer.INSTANCE, upgradePopUpAppModel.actionParams);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, upgradePopUpAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(upgradePopUpAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, upgradePopUpAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, upgradePopUpAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, upgradePopUpAppModel.getValue());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradeActionParams)
  (r8v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r9v0 java.lang.Boolean))
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradeActionParams, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:5034) call: com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradePopUpAppModel.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradeActionParams, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UpgradePopUpAppModel(UpgradeActionParams upgradeActionParams, String str, Boolean bool, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(upgradeActionParams, str, (i & 4) != 0 ? Boolean.FALSE : bool, str2, str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradePopUpAppModel(UpgradeActionParams upgradeActionParams, @NotNull String str, Boolean bool, String str2, String str3) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.actionParams = upgradeActionParams;
        this.id = str;
        this.required = bool;
        this.version = str2;
        this.value = str3;
    }
}
