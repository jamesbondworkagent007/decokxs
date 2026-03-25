package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("identify-already-identify-bottom-pop-up")
@Serializable
public final class MergeAccountBottomPopUp extends UIComponent implements Parcelable {
    private final AccountMergeActionParams actionParams;
    private Float bottomMargin;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MergeAccountBottomPopUp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MergeAccountBottomPopUp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MergeAccountBottomPopUp createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            AccountMergeActionParams accountMergeActionParamsCreateFromParcel = parcel.readInt() == 0 ? null : AccountMergeActionParams.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MergeAccountBottomPopUp(string, accountMergeActionParamsCreateFromParcel, string2, boolValueOf, string3, string4, fValueOf, fValueOf2, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MergeAccountBottomPopUp[] newArray(int i) {
            return new MergeAccountBottomPopUp[i];
        }
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
    public final Float component7() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component8() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MergeAccountBottomPopUp copy(@NotNull String str, AccountMergeActionParams accountMergeActionParams, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MergeAccountBottomPopUp(str, accountMergeActionParams, str2, bool, str3, str4, f, f2, bool2);
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
        if (!(obj instanceof MergeAccountBottomPopUp)) {
            return false;
        }
        MergeAccountBottomPopUp mergeAccountBottomPopUp = (MergeAccountBottomPopUp) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) mergeAccountBottomPopUp.type) && Intrinsics.EZpvd(this.actionParams, mergeAccountBottomPopUp.actionParams) && Intrinsics.EZpvd((Object) this.id, (Object) mergeAccountBottomPopUp.id) && Intrinsics.EZpvd(this.required, mergeAccountBottomPopUp.required) && Intrinsics.EZpvd((Object) this.version, (Object) mergeAccountBottomPopUp.version) && Intrinsics.EZpvd((Object) this.value, (Object) mergeAccountBottomPopUp.value) && Intrinsics.EZpvd(this.bottomMargin, mergeAccountBottomPopUp.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, mergeAccountBottomPopUp.leftMargin) && Intrinsics.EZpvd(this.isHidden, mergeAccountBottomPopUp.isHidden);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountMergeActionParams getActionParams() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        AccountMergeActionParams accountMergeActionParams = this.actionParams;
        int iHashCode2 = accountMergeActionParams == null ? 0 : accountMergeActionParams.hashCode();
        String str = this.id;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Boolean bool = this.required;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str2 = this.version;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode7 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode8 = f2 == null ? 0 : f2.hashCode();
        Boolean bool2 = this.isHidden;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MergeAccountBottomPopUp(type=" + this.type + ", actionParams=" + this.actionParams + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
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
        Float f = this.bottomMargin;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.leftMargin;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountBottomPopUp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MergeAccountBottomPopUp> serializer() {
            return MergeAccountBottomPopUp$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MergeAccountBottomPopUp(int i, String str, AccountMergeActionParams accountMergeActionParams, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (247 != (i & 247)) {
            PluginExceptionsKt.throwMissingFieldException(i, 247, MergeAccountBottomPopUp$$serializer.INSTANCE.getDescriptor());
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
        this.bottomMargin = f;
        this.leftMargin = f2;
        if ((i & 256) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(MergeAccountBottomPopUp mergeAccountBottomPopUp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(mergeAccountBottomPopUp, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, mergeAccountBottomPopUp.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, AccountMergeActionParams$$serializer.INSTANCE, mergeAccountBottomPopUp.actionParams);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, mergeAccountBottomPopUp.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(mergeAccountBottomPopUp.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, mergeAccountBottomPopUp.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, mergeAccountBottomPopUp.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, mergeAccountBottomPopUp.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, floatSerializer, mergeAccountBottomPopUp.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, mergeAccountBottomPopUp.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(mergeAccountBottomPopUp.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, mergeAccountBottomPopUp.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams)
  (r15v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.Float)
  (r20v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:5046) call: com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountBottomPopUp.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ MergeAccountBottomPopUp(String str, AccountMergeActionParams accountMergeActionParams, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, accountMergeActionParams, str2, (i & 8) != 0 ? Boolean.FALSE : bool, str3, str4, f, f2, (i & 256) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MergeAccountBottomPopUp(@NotNull String str, AccountMergeActionParams accountMergeActionParams, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.actionParams = accountMergeActionParams;
        this.id = str2;
        this.required = bool;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public MergeAccountBottomPopUpAppModel toAppModel() {
        return new MergeAccountBottomPopUpAppModel(this.type, this.actionParams, "", getRequired(), getVersion(), getValue());
    }
}
