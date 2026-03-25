package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43780rvj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("asset-list")
@Serializable
public final class AssetList extends UIComponent {
    private Float bottomMargin;
    private final String buttonText;
    private final Choices choices;
    private final CTAButton createCta;
    private final String current;
    private ArrayList<AssetDetailData> fieldValue;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Integer maxSize;
    private final String maxSizeWarning;
    private final Boolean required;
    private final String total;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(AssetDetailData$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AssetList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            CTAButton cTAButtonCreateFromParcel = parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AssetDetailData.CREATOR.createFromParcel(parcel));
                }
            }
            return new AssetList(string, string2, string3, numValueOf, string4, cTAButtonCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Choices.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetList[] newArray(int i) {
            return new AssetList[i];
        }
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
    public final Integer component4() {
        return this.maxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxSizeWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component6() {
        return this.createCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AssetDetailData> component7() {
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
    public final AssetList copy(String str, String str2, String str3, Integer num, String str4, CTAButton cTAButton, ArrayList<AssetDetailData> arrayList, Choices choices, @NotNull String str5, Boolean bool, String str6, String str7, Boolean bool2, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str5, "");
        return new AssetList(str, str2, str3, num, str4, cTAButton, arrayList, choices, str5, bool, str6, str7, bool2, f, f2);
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
        if (!(obj instanceof AssetList)) {
            return false;
        }
        AssetList assetList = (AssetList) obj;
        return Intrinsics.EZpvd((Object) this.buttonText, (Object) assetList.buttonText) && Intrinsics.EZpvd((Object) this.total, (Object) assetList.total) && Intrinsics.EZpvd((Object) this.current, (Object) assetList.current) && Intrinsics.EZpvd(this.maxSize, assetList.maxSize) && Intrinsics.EZpvd((Object) this.maxSizeWarning, (Object) assetList.maxSizeWarning) && Intrinsics.EZpvd(this.createCta, assetList.createCta) && Intrinsics.EZpvd(this.fieldValue, assetList.fieldValue) && Intrinsics.EZpvd(this.choices, assetList.choices) && Intrinsics.EZpvd((Object) this.id, (Object) assetList.id) && Intrinsics.EZpvd(this.required, assetList.required) && Intrinsics.EZpvd((Object) this.version, (Object) assetList.version) && Intrinsics.EZpvd((Object) this.value, (Object) assetList.value) && Intrinsics.EZpvd(this.isHidden, assetList.isHidden) && Intrinsics.EZpvd(this.bottomMargin, assetList.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, assetList.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
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
    public final CTAButton getCreateCta() {
        return this.createCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrent() {
        return this.current;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AssetDetailData> getFieldValue() {
        return this.fieldValue;
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
    public final Integer getMaxSize() {
        return this.maxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSizeWarning() {
        return this.maxSizeWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
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
        String str = this.buttonText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.total;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.current;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.maxSize;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.maxSizeWarning;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        CTAButton cTAButton = this.createCta;
        int iHashCode6 = cTAButton == null ? 0 : cTAButton.hashCode();
        ArrayList<AssetDetailData> arrayList = this.fieldValue;
        int iHashCode7 = arrayList == null ? 0 : arrayList.hashCode();
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFieldValue(ArrayList<AssetDetailData> arrayList) {
        this.fieldValue = arrayList;
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
        return "AssetList(buttonText=" + this.buttonText + ", total=" + this.total + ", current=" + this.current + ", maxSize=" + this.maxSize + ", maxSizeWarning=" + this.maxSizeWarning + ", createCta=" + this.createCta + ", fieldValue=" + this.fieldValue + ", choices=" + this.choices + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", isHidden=" + this.isHidden + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.buttonText);
        parcel.writeString(this.total);
        parcel.writeString(this.current);
        Integer num = this.maxSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.maxSizeWarning);
        CTAButton cTAButton = this.createCta;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
        ArrayList<AssetDetailData> arrayList = this.fieldValue;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<AssetDetailData> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetList> serializer() {
            return AssetList$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AssetList(int i, String str, String str2, String str3, Integer num, String str4, CTAButton cTAButton, ArrayList arrayList, Choices choices, String str5, Boolean bool, String str6, String str7, Boolean bool2, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (27904 != (i & 27904)) {
            PluginExceptionsKt.throwMissingFieldException(i, 27904, AssetList$$serializer.INSTANCE.getDescriptor());
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
        this.maxSize = (i & 8) == 0 ? 10000 : num;
        if ((i & 16) == 0) {
            this.maxSizeWarning = "";
        } else {
            this.maxSizeWarning = str4;
        }
        if ((i & 32) == 0) {
            this.createCta = null;
        } else {
            this.createCta = cTAButton;
        }
        if ((i & 64) == 0) {
            this.fieldValue = null;
        } else {
            this.fieldValue = arrayList;
        }
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

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AssetList assetList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        UIComponent.write$Self(assetList, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetList.buttonText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, assetList.buttonText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetList.total, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, assetList.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetList.current, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetList.current);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (num = assetList.maxSize) == null || num.intValue() != 10000) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, assetList.maxSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) assetList.maxSizeWarning, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, assetList.maxSizeWarning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || assetList.createCta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, CTAButton$$serializer.INSTANCE, assetList.createCta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || assetList.fieldValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], assetList.fieldValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || assetList.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, Choices$$serializer.INSTANCE, assetList.choices);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, assetList.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(assetList.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, assetList.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, assetList.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, assetList.getValue());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(assetList.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, assetList.isHidden());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, assetList.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, assetList.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001c: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (10000 int) : (r23v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x0032: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x003b: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r26v0 java.util.ArrayList))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Choices:?: TERNARY null = ((wrap:int:0x0043: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Choices) : (r27v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Choices))
  (r28v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (r33v0 java.lang.Float)
  (r34v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.util.ArrayList<com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetailData>, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void (m)] (LINE:2610) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetList.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.util.ArrayList, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ AssetList(String str, String str2, String str3, Integer num, String str4, CTAButton cTAButton, ArrayList arrayList, Choices choices, String str5, Boolean bool, String str6, String str7, Boolean bool2, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 10000 : num, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : cTAButton, (i & 64) != 0 ? null : arrayList, (i & 128) != 0 ? null : choices, str5, (i & 512) != 0 ? Boolean.FALSE : bool, str6, str7, (i & 4096) != 0 ? Boolean.FALSE : bool2, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetList(String str, String str2, String str3, Integer num, String str4, CTAButton cTAButton, ArrayList<AssetDetailData> arrayList, Choices choices, @NotNull String str5, Boolean bool, String str6, String str7, Boolean bool2, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str5, "");
        this.buttonText = str;
        this.total = str2;
        this.current = str3;
        this.maxSize = num;
        this.maxSizeWarning = str4;
        this.createCta = cTAButton;
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

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public AssetListAppModel toAppModel() {
        ArrayList arrayList = new ArrayList();
        ArrayList<AssetDetailData> arrayList2 = this.fieldValue;
        if (arrayList2 != null) {
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(C43780rvj.KWHzl((AssetDetailData) it.next()));
            }
        }
        String str = this.buttonText;
        String str2 = this.total;
        String str3 = this.current;
        Integer num = this.maxSize;
        int iIntValue = num != null ? num.intValue() : 10000;
        String str4 = this.maxSizeWarning;
        CTAButton cTAButton = this.createCta;
        return new AssetListAppModel(str, str2, str3, iIntValue, str4, cTAButton != null ? cTAButton.toAppModel() : null, arrayList, this.choices, getId(), getRequired(), getVersion(), getValue(), isHidden(), getBottomMargin(), getLeftMargin());
    }
}
