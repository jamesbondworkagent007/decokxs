package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43747rvC;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("group")
@Serializable
public final class Group extends UIComponent {
    private final String backgroundColor;
    private final String backgroundType;
    private Float bottomMargin;
    private final JsonArray contentList;
    private final Float cornerRadius;
    private final GroupDynamic dynamic;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Float paddingBottom;
    private final Float paddingLeft;
    private final Float paddingRight;
    private final Float paddingTop;
    private final Boolean required;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Group> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Group> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Group createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            JsonArray jsonArray = (JsonArray) parcel.readValue(Group.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            GroupDynamic groupDynamicCreateFromParcel = parcel.readInt() == 0 ? null : GroupDynamic.CREATOR.createFromParcel(parcel);
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Group(boolValueOf, jsonArray, string, string2, groupDynamicCreateFromParcel, fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, string3, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Group[] newArray(int i) {
            return new Group[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.paddingBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component15() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component16() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component2() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.backgroundType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupDynamic component5() {
        return this.dynamic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component6() {
        return this.cornerRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component7() {
        return this.paddingLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component8() {
        return this.paddingTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component9() {
        return this.paddingRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Group copy(Boolean bool, JsonArray jsonArray, String str, String str2, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str3, Boolean bool2, String str4, String str5, Float f6, Float f7) {
        return new Group(bool, jsonArray, str, str2, groupDynamic, f, f2, f3, f4, f5, str3, bool2, str4, str5, f6, f7);
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
        if (!(obj instanceof Group)) {
            return false;
        }
        Group group = (Group) obj;
        return Intrinsics.EZpvd(this.isHidden, group.isHidden) && Intrinsics.EZpvd(this.contentList, group.contentList) && Intrinsics.EZpvd((Object) this.backgroundType, (Object) group.backgroundType) && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) group.backgroundColor) && Intrinsics.EZpvd(this.dynamic, group.dynamic) && Intrinsics.EZpvd(this.cornerRadius, group.cornerRadius) && Intrinsics.EZpvd(this.paddingLeft, group.paddingLeft) && Intrinsics.EZpvd(this.paddingTop, group.paddingTop) && Intrinsics.EZpvd(this.paddingRight, group.paddingRight) && Intrinsics.EZpvd(this.paddingBottom, group.paddingBottom) && Intrinsics.EZpvd((Object) this.id, (Object) group.id) && Intrinsics.EZpvd(this.required, group.required) && Intrinsics.EZpvd((Object) this.version, (Object) group.version) && Intrinsics.EZpvd((Object) this.value, (Object) group.value) && Intrinsics.EZpvd(this.bottomMargin, group.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, group.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundType() {
        return this.backgroundType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getContentList() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupDynamic getDynamic() {
        return this.dynamic;
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
    public final Float getPaddingBottom() {
        return this.paddingBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getPaddingLeft() {
        return this.paddingLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getPaddingRight() {
        return this.paddingRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getPaddingTop() {
        return this.paddingTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
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
        Boolean bool = this.isHidden;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        JsonArray jsonArray = this.contentList;
        int iHashCode2 = jsonArray == null ? 0 : jsonArray.hashCode();
        String str = this.backgroundType;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.backgroundColor;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        GroupDynamic groupDynamic = this.dynamic;
        int iHashCode5 = groupDynamic == null ? 0 : groupDynamic.hashCode();
        Float f = this.cornerRadius;
        int iHashCode6 = f == null ? 0 : f.hashCode();
        Float f2 = this.paddingLeft;
        int iHashCode7 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.paddingTop;
        int iHashCode8 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.paddingRight;
        int iHashCode9 = f4 == null ? 0 : f4.hashCode();
        Float f5 = this.paddingBottom;
        int iHashCode10 = f5 == null ? 0 : f5.hashCode();
        String str3 = this.id;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        Boolean bool2 = this.required;
        int iHashCode12 = bool2 == null ? 0 : bool2.hashCode();
        String str4 = this.version;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        Float f6 = this.bottomMargin;
        int iHashCode15 = f6 == null ? 0 : f6.hashCode();
        Float f7 = this.leftMargin;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (f7 == null ? 0 : f7.hashCode());
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
        return "Group(isHidden=" + this.isHidden + ", contentList=" + this.contentList + ", backgroundType=" + this.backgroundType + ", backgroundColor=" + this.backgroundColor + ", dynamic=" + this.dynamic + ", cornerRadius=" + this.cornerRadius + ", paddingLeft=" + this.paddingLeft + ", paddingTop=" + this.paddingTop + ", paddingRight=" + this.paddingRight + ", paddingBottom=" + this.paddingBottom + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeValue(this.contentList);
        parcel.writeString(this.backgroundType);
        parcel.writeString(this.backgroundColor);
        GroupDynamic groupDynamic = this.dynamic;
        if (groupDynamic == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupDynamic.writeToParcel(parcel, i);
        }
        Float f = this.cornerRadius;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.paddingLeft;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.paddingTop;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        Float f4 = this.paddingRight;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f4.floatValue());
        }
        Float f5 = this.paddingBottom;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f5.floatValue());
        }
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
        Float f6 = this.bottomMargin;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f6.floatValue());
        }
        Float f7 = this.leftMargin;
        if (f7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f7.floatValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Group.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Group> serializer() {
            return Group$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Group(int i, Boolean bool, JsonArray jsonArray, String str, String str2, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str3, Boolean bool2, String str4, String str5, Float f6, Float f7, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (61440 != (i & 61440)) {
            PluginExceptionsKt.throwMissingFieldException(i, 61440, Group$$serializer.INSTANCE.getDescriptor());
        }
        this.isHidden = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.contentList = null;
        } else {
            this.contentList = jsonArray;
        }
        if ((i & 4) == 0) {
            this.backgroundType = null;
        } else {
            this.backgroundType = str;
        }
        if ((i & 8) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str2;
        }
        if ((i & 16) == 0) {
            this.dynamic = null;
        } else {
            this.dynamic = groupDynamic;
        }
        if ((i & 32) == 0) {
            this.cornerRadius = null;
        } else {
            this.cornerRadius = f;
        }
        if ((i & 64) == 0) {
            this.paddingLeft = null;
        } else {
            this.paddingLeft = f2;
        }
        if ((i & 128) == 0) {
            this.paddingTop = null;
        } else {
            this.paddingTop = f3;
        }
        if ((i & 256) == 0) {
            this.paddingRight = null;
        } else {
            this.paddingRight = f4;
        }
        if ((i & 512) == 0) {
            this.paddingBottom = null;
        } else {
            this.paddingBottom = f5;
        }
        this.id = (i & 1024) == 0 ? "" : str3;
        this.required = (i & 2048) == 0 ? Boolean.FALSE : bool2;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f6;
        this.leftMargin = f7;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Group group, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(group, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(group.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, group.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || group.contentList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, JsonArraySerializer.INSTANCE, group.contentList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || group.backgroundType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, group.backgroundType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || group.backgroundColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, group.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || group.dynamic != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, GroupDynamic$$serializer.INSTANCE, group.dynamic);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || group.cornerRadius != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, FloatSerializer.INSTANCE, group.cornerRadius);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || group.paddingLeft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, FloatSerializer.INSTANCE, group.paddingLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || group.paddingTop != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, FloatSerializer.INSTANCE, group.paddingTop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || group.paddingRight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, FloatSerializer.INSTANCE, group.paddingRight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || group.paddingBottom != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, FloatSerializer.INSTANCE, group.paddingBottom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) group.getId(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, group.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(group.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, group.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, group.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, group.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, group.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, group.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0073: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:kotlinx.serialization.json.JsonArray:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonArray) : (r21v0 kotlinx.serialization.json.JsonArray))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic:?: TERNARY null = ((wrap:int:0x0025: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic) : (r24v0 com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x002d: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r25v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0035: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r26v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x003d: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r27v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0045: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r28v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x004d: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r29v0 java.lang.Float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0065: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (r34v0 java.lang.Float)
  (r35v0 java.lang.Float)
 A[MD:(java.lang.Boolean, kotlinx.serialization.json.JsonArray, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:4504) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Group.<init>(java.lang.Boolean, kotlinx.serialization.json.JsonArray, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ Group(Boolean bool, JsonArray jsonArray, String str, String str2, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str3, Boolean bool2, String str4, String str5, Float f6, Float f7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : jsonArray, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : groupDynamic, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : f2, (i & 128) != 0 ? null : f3, (i & 256) != 0 ? null : f4, (i & 512) != 0 ? null : f5, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? Boolean.FALSE : bool2, str4, str5, f6, f7);
    }

    public Group(Boolean bool, JsonArray jsonArray, String str, String str2, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str3, Boolean bool2, String str4, String str5, Float f6, Float f7) {
        super(null);
        this.isHidden = bool;
        this.contentList = jsonArray;
        this.backgroundType = str;
        this.backgroundColor = str2;
        this.dynamic = groupDynamic;
        this.cornerRadius = f;
        this.paddingLeft = f2;
        this.paddingTop = f3;
        this.paddingRight = f4;
        this.paddingBottom = f5;
        this.id = str3;
        this.required = bool2;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f6;
        this.leftMargin = f7;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public CtaCardAppModel toAppModel() {
        List<UIComponentAppModel> listAhwBna;
        Boolean boolIsHidden = isHidden();
        JsonArray jsonArray = this.contentList;
        if (jsonArray == null || (listAhwBna = C43747rvC.copydefault(jsonArray)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        List<UIComponentAppModel> list = listAhwBna;
        String str = this.backgroundType;
        String str2 = this.backgroundColor;
        GroupDynamic groupDynamic = this.dynamic;
        Float f = this.cornerRadius;
        Float f2 = this.paddingLeft;
        Float f3 = this.paddingTop;
        Float f4 = this.paddingRight;
        Float f5 = this.paddingBottom;
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new CtaCardAppModel(null, null, boolIsHidden, list, str, str2, null, groupDynamic, f, f2, f3, f4, f5, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
