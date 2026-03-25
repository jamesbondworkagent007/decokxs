package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
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
public final class CheckboxAppModel extends UIComponentAppModel {
    private static final KSerializer<Object>[] $childSerializers;
    private Float bottomMargin;
    private List<String> checkHiddenItemIds;
    private String id;
    private final Boolean isBold;
    private final boolean isCard;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final RichTextContent richContent;
    private final String text;
    private List<String> uncheckHiddenItemIds;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CheckboxAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CheckboxAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckboxAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z = parcel.readInt() != 0;
            RichTextContent richTextContentCreateFromParcel = parcel.readInt() == 0 ? null : RichTextContent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CheckboxAppModel(string, boolValueOf, z, richTextContentCreateFromParcel, boolValueOf2, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, string2, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckboxAppModel[] newArray(int i) {
            return new CheckboxAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckboxAppModel copy$default(CheckboxAppModel checkboxAppModel, String str, Boolean bool, boolean z, RichTextContent richTextContent, Boolean bool2, List list, List list2, String str2, Boolean bool3, String str3, String str4, Float f, Float f2, int i, Object obj) {
        return checkboxAppModel.copy((i & 1) != 0 ? checkboxAppModel.text : str, (i & 2) != 0 ? checkboxAppModel.isBold : bool, (i & 4) != 0 ? checkboxAppModel.isCard : z, (i & 8) != 0 ? checkboxAppModel.richContent : richTextContent, (i & 16) != 0 ? checkboxAppModel.isHidden : bool2, (i & 32) != 0 ? checkboxAppModel.checkHiddenItemIds : list, (i & 64) != 0 ? checkboxAppModel.uncheckHiddenItemIds : list2, (i & 128) != 0 ? checkboxAppModel.id : str2, (i & 256) != 0 ? checkboxAppModel.required : bool3, (i & 512) != 0 ? checkboxAppModel.version : str3, (i & 1024) != 0 ? checkboxAppModel.value : str4, (i & 2048) != 0 ? checkboxAppModel.bottomMargin : f, (i & 4096) != 0 ? checkboxAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component13() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextContent component4() {
        return this.richContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.checkHiddenItemIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.uncheckHiddenItemIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckboxAppModel copy(@NotNull String str, Boolean bool, boolean z, RichTextContent richTextContent, Boolean bool2, List<String> list, List<String> list2, @NotNull String str2, Boolean bool3, String str3, String str4, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CheckboxAppModel(str, bool, z, richTextContent, bool2, list, list2, str2, bool3, str3, str4, f, f2);
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
        if (!(obj instanceof CheckboxAppModel)) {
            return false;
        }
        CheckboxAppModel checkboxAppModel = (CheckboxAppModel) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) checkboxAppModel.text) && Intrinsics.EZpvd(this.isBold, checkboxAppModel.isBold) && this.isCard == checkboxAppModel.isCard && Intrinsics.EZpvd(this.richContent, checkboxAppModel.richContent) && Intrinsics.EZpvd(this.isHidden, checkboxAppModel.isHidden) && Intrinsics.EZpvd(this.checkHiddenItemIds, checkboxAppModel.checkHiddenItemIds) && Intrinsics.EZpvd(this.uncheckHiddenItemIds, checkboxAppModel.uncheckHiddenItemIds) && Intrinsics.EZpvd((Object) this.id, (Object) checkboxAppModel.id) && Intrinsics.EZpvd(this.required, checkboxAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) checkboxAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) checkboxAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, checkboxAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, checkboxAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCheckHiddenItemIds() {
        return this.checkHiddenItemIds;
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextContent getRichContent() {
        return this.richContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getUncheckHiddenItemIds() {
        return this.uncheckHiddenItemIds;
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
        int iHashCode = this.text.hashCode();
        Boolean bool = this.isBold;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isCard);
        RichTextContent richTextContent = this.richContent;
        int iHashCode4 = richTextContent == null ? 0 : richTextContent.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        List<String> list = this.checkHiddenItemIds;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.uncheckHiddenItemIds;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        int iHashCode8 = this.id.hashCode();
        Boolean bool3 = this.required;
        int iHashCode9 = bool3 == null ? 0 : bool3.hashCode();
        String str = this.version;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode12 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (f2 != null ? f2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBold() {
        return this.isBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCard() {
        return this.isCard;
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
    public final void setCheckHiddenItemIds(List<String> list) {
        this.checkHiddenItemIds = list;
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
    public final void setUncheckHiddenItemIds(List<String> list) {
        this.uncheckHiddenItemIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckboxAppModel(text=" + this.text + ", isBold=" + this.isBold + ", isCard=" + this.isCard + ", richContent=" + this.richContent + ", isHidden=" + this.isHidden + ", checkHiddenItemIds=" + this.checkHiddenItemIds + ", uncheckHiddenItemIds=" + this.uncheckHiddenItemIds + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        Boolean bool = this.isBold;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isCard ? 1 : 0);
        RichTextContent richTextContent = this.richContent;
        if (richTextContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            richTextContent.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.checkHiddenItemIds);
        parcel.writeStringList(this.uncheckHiddenItemIds);
        parcel.writeString(this.id);
        Boolean bool3 = this.required;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckboxAppModel> serializer() {
            return CheckboxAppModel$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckboxAppModel(int i, String str, Boolean bool, boolean z, RichTextContent richTextContent, Boolean bool2, List list, List list2, String str2, Boolean bool3, String str3, String str4, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (7813 != (i & 7813)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7813, CheckboxAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.isBold = (i & 2) == 0 ? Boolean.FALSE : bool;
        this.isCard = z;
        if ((i & 8) == 0) {
            this.richContent = null;
        } else {
            this.richContent = richTextContent;
        }
        this.isHidden = (i & 16) == 0 ? Boolean.FALSE : bool2;
        if ((i & 32) == 0) {
            this.checkHiddenItemIds = null;
        } else {
            this.checkHiddenItemIds = list;
        }
        if ((i & 64) == 0) {
            this.uncheckHiddenItemIds = null;
        } else {
            this.uncheckHiddenItemIds = list2;
        }
        this.id = str2;
        this.required = (i & 256) == 0 ? Boolean.FALSE : bool3;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CheckboxAppModel checkboxAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(checkboxAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, checkboxAppModel.text);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(checkboxAppModel.isBold, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, checkboxAppModel.isBold);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, checkboxAppModel.isCard);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || checkboxAppModel.richContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, RichTextContent$$serializer.INSTANCE, checkboxAppModel.richContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(checkboxAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, checkboxAppModel.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || checkboxAppModel.checkHiddenItemIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], checkboxAppModel.checkHiddenItemIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || checkboxAppModel.uncheckHiddenItemIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], checkboxAppModel.uncheckHiddenItemIds);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, checkboxAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(checkboxAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, checkboxAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, checkboxAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, checkboxAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, checkboxAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, checkboxAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (r19v0 boolean)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent) : (r20v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (r24v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.Float)
  (r29v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.Boolean, boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent, java.lang.Boolean, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:1750) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxAppModel.<init>(java.lang.String, java.lang.Boolean, boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent, java.lang.Boolean, java.util.List, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ CheckboxAppModel(String str, Boolean bool, boolean z, RichTextContent richTextContent, Boolean bool2, List list, List list2, String str2, Boolean bool3, String str3, String str4, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Boolean.FALSE : bool, z, (i & 8) != 0 ? null : richTextContent, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, str2, (i & 256) != 0 ? Boolean.FALSE : bool3, str3, str4, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxAppModel(@NotNull String str, Boolean bool, boolean z, RichTextContent richTextContent, Boolean bool2, List<String> list, List<String> list2, @NotNull String str2, Boolean bool3, String str3, String str4, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.text = str;
        this.isBold = bool;
        this.isCard = z;
        this.richContent = richTextContent;
        this.isHidden = bool2;
        this.checkHiddenItemIds = list;
        this.uncheckHiddenItemIds = list2;
        this.id = str2;
        this.required = bool3;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public CheckboxAppModel clone() {
        return copy$default(this, null, null, false, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
