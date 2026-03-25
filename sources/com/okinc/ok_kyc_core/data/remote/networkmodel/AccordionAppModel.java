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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AccordionAppModel extends UIComponentAppModel {
    private final String backgroundStyle;
    private Float bottomMargin;
    private final List<String> contentList;
    private final TextStyle contentListStyle;
    private final String contentListType;
    private String id;
    private final Boolean isCollapsed;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final String sectionTitle;
    private final TextStyle sectionTitleStyle;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccordionAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AccordionAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccordionAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            TextStyle textStyleCreateFromParcel = parcel.readInt() == 0 ? null : TextStyle.CREATOR.createFromParcel(parcel);
            TextStyle textStyleCreateFromParcel2 = parcel.readInt() == 0 ? null : TextStyle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccordionAppModel(string, arrayListCreateStringArrayList, textStyleCreateFromParcel, textStyleCreateFromParcel2, boolValueOf, string2, string3, string4, boolValueOf2, string5, string6, boolValueOf3, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccordionAppModel[] newArray(int i) {
            return new AccordionAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.AccordionAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccordionAppModel copy$default(AccordionAppModel accordionAppModel, String str, List list, TextStyle textStyle, TextStyle textStyle2, Boolean bool, String str2, String str3, String str4, Boolean bool2, String str5, String str6, Boolean bool3, Float f, Float f2, int i, Object obj) {
        return accordionAppModel.copy((i & 1) != 0 ? accordionAppModel.sectionTitle : str, (i & 2) != 0 ? accordionAppModel.contentList : list, (i & 4) != 0 ? accordionAppModel.sectionTitleStyle : textStyle, (i & 8) != 0 ? accordionAppModel.contentListStyle : textStyle2, (i & 16) != 0 ? accordionAppModel.isCollapsed : bool, (i & 32) != 0 ? accordionAppModel.backgroundStyle : str2, (i & 64) != 0 ? accordionAppModel.contentListType : str3, (i & 128) != 0 ? accordionAppModel.id : str4, (i & 256) != 0 ? accordionAppModel.required : bool2, (i & 512) != 0 ? accordionAppModel.version : str5, (i & 1024) != 0 ? accordionAppModel.value : str6, (i & 2048) != 0 ? accordionAppModel.isHidden : bool3, (i & 4096) != 0 ? accordionAppModel.bottomMargin : f, (i & 8192) != 0 ? accordionAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sectionTitle;
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
    public final Boolean component12() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component13() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component14() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextStyle component3() {
        return this.sectionTitleStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextStyle component4() {
        return this.contentListStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isCollapsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.backgroundStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.contentListType;
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
    public final AccordionAppModel copy(String str, @NotNull List<String> list, TextStyle textStyle, TextStyle textStyle2, Boolean bool, String str2, String str3, @NotNull String str4, Boolean bool2, String str5, String str6, Boolean bool3, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AccordionAppModel(str, list, textStyle, textStyle2, bool, str2, str3, str4, bool2, str5, str6, bool3, f, f2);
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
        if (!(obj instanceof AccordionAppModel)) {
            return false;
        }
        AccordionAppModel accordionAppModel = (AccordionAppModel) obj;
        return Intrinsics.EZpvd((Object) this.sectionTitle, (Object) accordionAppModel.sectionTitle) && Intrinsics.EZpvd(this.contentList, accordionAppModel.contentList) && Intrinsics.EZpvd(this.sectionTitleStyle, accordionAppModel.sectionTitleStyle) && Intrinsics.EZpvd(this.contentListStyle, accordionAppModel.contentListStyle) && Intrinsics.EZpvd(this.isCollapsed, accordionAppModel.isCollapsed) && Intrinsics.EZpvd((Object) this.backgroundStyle, (Object) accordionAppModel.backgroundStyle) && Intrinsics.EZpvd((Object) this.contentListType, (Object) accordionAppModel.contentListType) && Intrinsics.EZpvd((Object) this.id, (Object) accordionAppModel.id) && Intrinsics.EZpvd(this.required, accordionAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) accordionAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) accordionAppModel.value) && Intrinsics.EZpvd(this.isHidden, accordionAppModel.isHidden) && Intrinsics.EZpvd(this.bottomMargin, accordionAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, accordionAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getContentList() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextStyle getContentListStyle() {
        return this.contentListStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentListType() {
        return this.contentListType;
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
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextStyle getSectionTitleStyle() {
        return this.sectionTitleStyle;
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
        String str = this.sectionTitle;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.contentList.hashCode();
        TextStyle textStyle = this.sectionTitleStyle;
        int iHashCode3 = textStyle == null ? 0 : textStyle.hashCode();
        TextStyle textStyle2 = this.contentListStyle;
        int iHashCode4 = textStyle2 == null ? 0 : textStyle2.hashCode();
        Boolean bool = this.isCollapsed;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str2 = this.backgroundStyle;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.contentListType;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        int iHashCode8 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        String str4 = this.version;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        Boolean bool3 = this.isHidden;
        int iHashCode12 = bool3 == null ? 0 : bool3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode13 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (f2 != null ? f2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isCollapsed() {
        return this.isCollapsed;
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
        return "AccordionAppModel(sectionTitle=" + this.sectionTitle + ", contentList=" + this.contentList + ", sectionTitleStyle=" + this.sectionTitleStyle + ", contentListStyle=" + this.contentListStyle + ", isCollapsed=" + this.isCollapsed + ", backgroundStyle=" + this.backgroundStyle + ", contentListType=" + this.contentListType + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", isHidden=" + this.isHidden + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sectionTitle);
        parcel.writeStringList(this.contentList);
        TextStyle textStyle = this.sectionTitleStyle;
        if (textStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyle.writeToParcel(parcel, i);
        }
        TextStyle textStyle2 = this.contentListStyle;
        if (textStyle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyle2.writeToParcel(parcel, i);
        }
        Boolean bool = this.isCollapsed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.backgroundStyle);
        parcel.writeString(this.contentListType);
        parcel.writeString(this.id);
        Boolean bool2 = this.required;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        Boolean bool3 = this.isHidden;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AccordionAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccordionAppModel> serializer() {
            return AccordionAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccordionAppModel(int i, String str, List list, TextStyle textStyle, TextStyle textStyle2, Boolean bool, String str2, String str3, String str4, Boolean bool2, String str5, String str6, Boolean bool3, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (14029 != (i & 14029)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14029, AccordionAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.sectionTitle = str;
        this.contentList = (i & 2) == 0 ? yDY.AhwBna() : list;
        this.sectionTitleStyle = textStyle;
        this.contentListStyle = textStyle2;
        this.isCollapsed = (i & 16) == 0 ? Boolean.FALSE : bool;
        this.backgroundStyle = (i & 32) == 0 ? "default" : str2;
        this.contentListType = str3;
        this.id = str4;
        this.required = (i & 256) == 0 ? Boolean.FALSE : bool2;
        this.version = str5;
        this.value = str6;
        this.isHidden = (i & 2048) == 0 ? Boolean.FALSE : bool3;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AccordionAppModel accordionAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(accordionAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, accordionAppModel.sectionTitle);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(accordionAppModel.contentList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], accordionAppModel.contentList);
        }
        TextStyle$$serializer textStyle$$serializer = TextStyle$$serializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, textStyle$$serializer, accordionAppModel.sectionTitleStyle);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, textStyle$$serializer, accordionAppModel.contentListStyle);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(accordionAppModel.isCollapsed, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, accordionAppModel.isCollapsed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accordionAppModel.backgroundStyle, (Object) "default")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, accordionAppModel.backgroundStyle);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, accordionAppModel.contentListType);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, accordionAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(accordionAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, accordionAppModel.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, accordionAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, accordionAppModel.getValue());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(accordionAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, accordionAppModel.isHidden());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, accordionAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, accordionAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:5146)) : (r19v0 java.util.List))
  (r20v0 com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle)
  (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("default") : (r23v0 java.lang.String))
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (r30v0 java.lang.Float)
  (r31v0 java.lang.Float)
 A[MD:(java.lang.String, java.util.List<java.lang.String>, com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void (m)] (LINE:5144) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AccordionAppModel.<init>(java.lang.String, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ AccordionAppModel(String str, List list, TextStyle textStyle, TextStyle textStyle2, Boolean bool, String str2, String str3, String str4, Boolean bool2, String str5, String str6, Boolean bool3, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? yDY.AhwBna() : list, textStyle, textStyle2, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? "default" : str2, str3, str4, (i & 256) != 0 ? Boolean.FALSE : bool2, str5, str6, (i & 2048) != 0 ? Boolean.FALSE : bool3, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccordionAppModel(String str, @NotNull List<String> list, TextStyle textStyle, TextStyle textStyle2, Boolean bool, String str2, String str3, @NotNull String str4, Boolean bool2, String str5, String str6, Boolean bool3, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.sectionTitle = str;
        this.contentList = list;
        this.sectionTitleStyle = textStyle;
        this.contentListStyle = textStyle2;
        this.isCollapsed = bool;
        this.backgroundStyle = str2;
        this.contentListType = str3;
        this.id = str4;
        this.required = bool2;
        this.version = str5;
        this.value = str6;
        this.isHidden = bool3;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public AccordionAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
