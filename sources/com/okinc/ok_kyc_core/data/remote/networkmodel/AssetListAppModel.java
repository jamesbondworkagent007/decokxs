package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AssetListAppModel extends UIComponentAppModel {
    private Float bottomMargin;
    private final String buttonText;
    private final Choices choices;
    private final CTAButtonAppModel createCta;
    private String current;
    private ArrayList<AssetDetail> fieldValue;
    private String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final int maxSize;
    private final String maxSizeWarning;
    private final Boolean required;
    private final String total;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetListAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(AssetDetail$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AssetListAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetListAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            CTAButtonAppModel cTAButtonAppModelCreateFromParcel = parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(AssetDetail.CREATOR.createFromParcel(parcel));
            }
            return new AssetListAppModel(string, string2, string3, i, string4, cTAButtonAppModelCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Choices.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetListAppModel[] newArray(int i) {
            return new AssetListAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetListAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetListAppModel copy$default(AssetListAppModel assetListAppModel, String str, String str2, String str3, int i, String str4, CTAButtonAppModel cTAButtonAppModel, ArrayList arrayList, Choices choices, String str5, Boolean bool, String str6, String str7, Boolean bool2, Float f, Float f2, int i2, Object obj) {
        return assetListAppModel.copy((i2 & 1) != 0 ? assetListAppModel.buttonText : str, (i2 & 2) != 0 ? assetListAppModel.total : str2, (i2 & 4) != 0 ? assetListAppModel.current : str3, (i2 & 8) != 0 ? assetListAppModel.maxSize : i, (i2 & 16) != 0 ? assetListAppModel.maxSizeWarning : str4, (i2 & 32) != 0 ? assetListAppModel.createCta : cTAButtonAppModel, (i2 & 64) != 0 ? assetListAppModel.fieldValue : arrayList, (i2 & 128) != 0 ? assetListAppModel.choices : choices, (i2 & 256) != 0 ? assetListAppModel.id : str5, (i2 & 512) != 0 ? assetListAppModel.required : bool, (i2 & 1024) != 0 ? assetListAppModel.version : str6, (i2 & 2048) != 0 ? assetListAppModel.value : str7, (i2 & 4096) != 0 ? assetListAppModel.isHidden : bool2, (i2 & 8192) != 0 ? assetListAppModel.bottomMargin : f, (i2 & 16384) != 0 ? assetListAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.buttonText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component14() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component15() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.current;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.maxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxSizeWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component6() {
        return this.createCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AssetDetail> component7() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Choices component8() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetListAppModel copy(String str, String str2, String str3, int i, String str4, CTAButtonAppModel cTAButtonAppModel, @NotNull ArrayList<AssetDetail> arrayList, Choices choices, @NotNull String str5, Boolean bool, String str6, String str7, Boolean bool2, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new AssetListAppModel(str, str2, str3, i, str4, cTAButtonAppModel, arrayList, choices, str5, bool, str6, str7, bool2, f, f2);
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
        if (!(obj instanceof AssetListAppModel)) {
            return false;
        }
        AssetListAppModel assetListAppModel = (AssetListAppModel) obj;
        return Intrinsics.EZpvd((Object) this.buttonText, (Object) assetListAppModel.buttonText) && Intrinsics.EZpvd((Object) this.total, (Object) assetListAppModel.total) && Intrinsics.EZpvd((Object) this.current, (Object) assetListAppModel.current) && this.maxSize == assetListAppModel.maxSize && Intrinsics.EZpvd((Object) this.maxSizeWarning, (Object) assetListAppModel.maxSizeWarning) && Intrinsics.EZpvd(this.createCta, assetListAppModel.createCta) && Intrinsics.EZpvd(this.fieldValue, assetListAppModel.fieldValue) && Intrinsics.EZpvd(this.choices, assetListAppModel.choices) && Intrinsics.EZpvd((Object) this.id, (Object) assetListAppModel.id) && Intrinsics.EZpvd(this.required, assetListAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) assetListAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) assetListAppModel.value) && Intrinsics.EZpvd(this.isHidden, assetListAppModel.isHidden) && Intrinsics.EZpvd(this.bottomMargin, assetListAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, assetListAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Choices getChoices() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCreateCta() {
        return this.createCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrent() {
        return this.current;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AssetDetail> getFieldValue() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxSize() {
        return this.maxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSizeWarning() {
        return this.maxSizeWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.buttonText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.total;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.current;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Integer.hashCode(this.maxSize);
        String str4 = this.maxSizeWarning;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        CTAButtonAppModel cTAButtonAppModel = this.createCta;
        int iHashCode6 = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
        int iHashCode7 = this.fieldValue.hashCode();
        Choices choices = this.choices;
        int iHashCode8 = choices == null ? 0 : choices.hashCode();
        int iHashCode9 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        String str5 = this.version;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.value;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode13 = bool2 == null ? 0 : bool2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode14 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (f2 == null ? 0 : f2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrent(String str) {
        this.current = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFieldValue(@NotNull ArrayList<AssetDetail> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.fieldValue = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetListAppModel(buttonText=" + this.buttonText + ", total=" + this.total + ", current=" + this.current + ", maxSize=" + this.maxSize + ", maxSizeWarning=" + this.maxSizeWarning + ", createCta=" + this.createCta + ", fieldValue=" + this.fieldValue + ", choices=" + this.choices + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", isHidden=" + this.isHidden + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.buttonText);
        parcel.writeString(this.total);
        parcel.writeString(this.current);
        parcel.writeInt(this.maxSize);
        parcel.writeString(this.maxSizeWarning);
        CTAButtonAppModel cTAButtonAppModel = this.createCta;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
        ArrayList<AssetDetail> arrayList = this.fieldValue;
        parcel.writeInt(arrayList.size());
        Iterator<AssetDetail> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Choices choices = this.choices;
        if (choices == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            choices.writeToParcel(parcel, i);
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
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetListAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetListAppModel> serializer() {
            return AssetListAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AssetListAppModel(int i, String str, String str2, String str3, int i2, String str4, CTAButtonAppModel cTAButtonAppModel, ArrayList arrayList, Choices choices, String str5, Boolean bool, String str6, String str7, Boolean bool2, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (27976 != (i & 27976)) {
            PluginExceptionsKt.throwMissingFieldException(i, 27976, AssetListAppModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.buttonText = "";
        } else {
            this.buttonText = str;
        }
        if ((i & 2) == 0) {
            this.total = "";
        } else {
            this.total = str2;
        }
        if ((i & 4) == 0) {
            this.current = "";
        } else {
            this.current = str3;
        }
        this.maxSize = i2;
        if ((i & 16) == 0) {
            this.maxSizeWarning = "";
        } else {
            this.maxSizeWarning = str4;
        }
        if ((i & 32) == 0) {
            this.createCta = null;
        } else {
            this.createCta = cTAButtonAppModel;
        }
        this.fieldValue = arrayList;
        if ((i & 128) == 0) {
            this.choices = null;
        } else {
            this.choices = choices;
        }
        this.id = str5;
        this.required = (i & 512) == 0 ? Boolean.FALSE : bool;
        this.version = str6;
        this.value = str7;
        this.isHidden = (i & 4096) == 0 ? Boolean.FALSE : bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AssetListAppModel assetListAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(assetListAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetListAppModel.buttonText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, assetListAppModel.buttonText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetListAppModel.total, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, assetListAppModel.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetListAppModel.current, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetListAppModel.current);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, assetListAppModel.maxSize);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) assetListAppModel.maxSizeWarning, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, assetListAppModel.maxSizeWarning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || assetListAppModel.createCta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, CTAButtonAppModel$$serializer.INSTANCE, assetListAppModel.createCta);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], assetListAppModel.fieldValue);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || assetListAppModel.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, Choices$$serializer.INSTANCE, assetListAppModel.choices);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, assetListAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(assetListAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, assetListAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, assetListAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, assetListAppModel.getValue());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(assetListAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, assetListAppModel.isHidden());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, assetListAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, assetListAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (r23v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x0024: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (r26v0 java.util.ArrayList)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Choices:?: TERNARY null = ((wrap:int:0x002d: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Choices) : (r27v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Choices))
  (r28v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (r33v0 java.lang.Float)
  (r34v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.util.ArrayList<com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetail>, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void (m)] (LINE:2684) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetListAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.util.ArrayList, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ AssetListAppModel(String str, String str2, String str3, int i, String str4, CTAButtonAppModel cTAButtonAppModel, ArrayList arrayList, Choices choices, String str5, Boolean bool, String str6, String str7, Boolean bool2, Float f, Float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : cTAButtonAppModel, arrayList, (i2 & 128) != 0 ? null : choices, str5, (i2 & 512) != 0 ? Boolean.FALSE : bool, str6, str7, (i2 & 4096) != 0 ? Boolean.FALSE : bool2, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetListAppModel(String str, String str2, String str3, int i, String str4, CTAButtonAppModel cTAButtonAppModel, @NotNull ArrayList<AssetDetail> arrayList, Choices choices, @NotNull String str5, Boolean bool, String str6, String str7, Boolean bool2, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.buttonText = str;
        this.total = str2;
        this.current = str3;
        this.maxSize = i;
        this.maxSizeWarning = str4;
        this.createCta = cTAButtonAppModel;
        this.fieldValue = arrayList;
        this.choices = choices;
        this.id = str5;
        this.required = bool;
        this.version = str6;
        this.value = str7;
        this.isHidden = bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public AssetListAppModel clone() {
        return copy$default(this, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
