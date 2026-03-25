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
public final class MergeAccountBottomPopUpAppModel extends PopUpComponentAppModel implements Parcelable {
    private final AccountMergeActionParams actionParams;
    private final String id;
    private final Boolean required;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MergeAccountBottomPopUpAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MergeAccountBottomPopUpAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MergeAccountBottomPopUpAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            AccountMergeActionParams accountMergeActionParamsCreateFromParcel = parcel.readInt() == 0 ? null : AccountMergeActionParams.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MergeAccountBottomPopUpAppModel(string, accountMergeActionParamsCreateFromParcel, string2, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MergeAccountBottomPopUpAppModel[] newArray(int i) {
            return new MergeAccountBottomPopUpAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MergeAccountBottomPopUpAppModel copy$default(MergeAccountBottomPopUpAppModel mergeAccountBottomPopUpAppModel, String str, AccountMergeActionParams accountMergeActionParams, String str2, Boolean bool, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mergeAccountBottomPopUpAppModel.type;
        }
        if ((i & 2) != 0) {
            accountMergeActionParams = mergeAccountBottomPopUpAppModel.actionParams;
        }
        AccountMergeActionParams accountMergeActionParams2 = accountMergeActionParams;
        if ((i & 4) != 0) {
            str2 = mergeAccountBottomPopUpAppModel.id;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            bool = mergeAccountBottomPopUpAppModel.required;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str3 = mergeAccountBottomPopUpAppModel.version;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = mergeAccountBottomPopUpAppModel.value;
        }
        return mergeAccountBottomPopUpAppModel.copy(str, accountMergeActionParams2, str5, bool2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountMergeActionParams component2() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MergeAccountBottomPopUpAppModel copy(@NotNull String str, AccountMergeActionParams accountMergeActionParams, @NotNull String str2, Boolean bool, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MergeAccountBottomPopUpAppModel(str, accountMergeActionParams, str2, bool, str3, str4);
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
        if (!(obj instanceof MergeAccountBottomPopUpAppModel)) {
            return false;
        }
        MergeAccountBottomPopUpAppModel mergeAccountBottomPopUpAppModel = (MergeAccountBottomPopUpAppModel) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) mergeAccountBottomPopUpAppModel.type) && Intrinsics.EZpvd(this.actionParams, mergeAccountBottomPopUpAppModel.actionParams) && Intrinsics.EZpvd((Object) this.id, (Object) mergeAccountBottomPopUpAppModel.id) && Intrinsics.EZpvd(this.required, mergeAccountBottomPopUpAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) mergeAccountBottomPopUpAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) mergeAccountBottomPopUpAppModel.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountMergeActionParams getActionParams() {
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
    public final String getType() {
        return this.type;
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
        int iHashCode = this.type.hashCode();
        AccountMergeActionParams accountMergeActionParams = this.actionParams;
        int iHashCode2 = accountMergeActionParams == null ? 0 : accountMergeActionParams.hashCode();
        int iHashCode3 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str = this.version;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MergeAccountBottomPopUpAppModel(type=" + this.type + ", actionParams=" + this.actionParams + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        AccountMergeActionParams accountMergeActionParams = this.actionParams;
        if (accountMergeActionParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountMergeActionParams.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountBottomPopUpAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MergeAccountBottomPopUpAppModel> serializer() {
            return MergeAccountBottomPopUpAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MergeAccountBottomPopUpAppModel(int i, String str, AccountMergeActionParams accountMergeActionParams, String str2, Boolean bool, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (55 != (i & 55)) {
            PluginExceptionsKt.throwMissingFieldException(i, 55, MergeAccountBottomPopUpAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.actionParams = accountMergeActionParams;
        this.id = str2;
        if ((i & 8) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        this.version = str3;
        this.value = str4;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(MergeAccountBottomPopUpAppModel mergeAccountBottomPopUpAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PopUpComponentAppModel.write$Self(mergeAccountBottomPopUpAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, mergeAccountBottomPopUpAppModel.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, AccountMergeActionParams$$serializer.INSTANCE, mergeAccountBottomPopUpAppModel.actionParams);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, mergeAccountBottomPopUpAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(mergeAccountBottomPopUpAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, mergeAccountBottomPopUpAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, mergeAccountBottomPopUpAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, mergeAccountBottomPopUpAppModel.getValue());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams)
  (r10v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:5070) call: com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountBottomPopUpAppModel.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MergeAccountBottomPopUpAppModel(String str, AccountMergeActionParams accountMergeActionParams, String str2, Boolean bool, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, accountMergeActionParams, str2, (i & 8) != 0 ? Boolean.FALSE : bool, str3, str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MergeAccountBottomPopUpAppModel(@NotNull String str, AccountMergeActionParams accountMergeActionParams, @NotNull String str2, Boolean bool, String str3, String str4) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.actionParams = accountMergeActionParams;
        this.id = str2;
        this.required = bool;
        this.version = str3;
        this.value = str4;
    }
}
