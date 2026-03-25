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
import o.C43780rvj;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("cta-card")
@Serializable
public final class CtaCard extends UIComponent {
    private final String backgroundColor;
    private final String backgroundType;
    private Float bottomMargin;
    private final JsonArray contentList;
    private final Float cornerRadius;
    private final CtaPopUpData cta;
    private final GroupDynamic dynamic;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Float paddingBottom;
    private final Float paddingLeft;
    private final Float paddingRight;
    private final Float paddingTop;
    private final Boolean required;
    private final String tag;
    private final String title;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CtaCard> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaCard createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            JsonArray jsonArray = (JsonArray) parcel.readValue(CtaCard.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            CtaPopUpData ctaPopUpDataCreateFromParcel = parcel.readInt() == 0 ? null : CtaPopUpData.CREATOR.createFromParcel(parcel);
            GroupDynamic groupDynamicCreateFromParcel = parcel.readInt() == 0 ? null : GroupDynamic.CREATOR.createFromParcel(parcel);
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CtaCard(string, string2, boolValueOf, jsonArray, string3, string4, ctaPopUpDataCreateFromParcel, groupDynamicCreateFromParcel, fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, string5, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaCard[] newArray(int i) {
            return new CtaCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.paddingLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component11() {
        return this.paddingTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.paddingRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component13() {
        return this.paddingBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component18() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component19() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component4() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.backgroundType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUpData component7() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupDynamic component8() {
        return this.dynamic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component9() {
        return this.cornerRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaCard copy(String str, String str2, Boolean bool, JsonArray jsonArray, String str3, String str4, CtaPopUpData ctaPopUpData, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str5, Boolean bool2, String str6, String str7, Float f6, Float f7) {
        return new CtaCard(str, str2, bool, jsonArray, str3, str4, ctaPopUpData, groupDynamic, f, f2, f3, f4, f5, str5, bool2, str6, str7, f6, f7);
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
        if (!(obj instanceof CtaCard)) {
            return false;
        }
        CtaCard ctaCard = (CtaCard) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) ctaCard.title) && Intrinsics.EZpvd((Object) this.tag, (Object) ctaCard.tag) && Intrinsics.EZpvd(this.isHidden, ctaCard.isHidden) && Intrinsics.EZpvd(this.contentList, ctaCard.contentList) && Intrinsics.EZpvd((Object) this.backgroundType, (Object) ctaCard.backgroundType) && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) ctaCard.backgroundColor) && Intrinsics.EZpvd(this.cta, ctaCard.cta) && Intrinsics.EZpvd(this.dynamic, ctaCard.dynamic) && Intrinsics.EZpvd(this.cornerRadius, ctaCard.cornerRadius) && Intrinsics.EZpvd(this.paddingLeft, ctaCard.paddingLeft) && Intrinsics.EZpvd(this.paddingTop, ctaCard.paddingTop) && Intrinsics.EZpvd(this.paddingRight, ctaCard.paddingRight) && Intrinsics.EZpvd(this.paddingBottom, ctaCard.paddingBottom) && Intrinsics.EZpvd((Object) this.id, (Object) ctaCard.id) && Intrinsics.EZpvd(this.required, ctaCard.required) && Intrinsics.EZpvd((Object) this.version, (Object) ctaCard.version) && Intrinsics.EZpvd((Object) this.value, (Object) ctaCard.value) && Intrinsics.EZpvd(this.bottomMargin, ctaCard.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, ctaCard.leftMargin);
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
    public final CtaPopUpData getCta() {
        return this.cta;
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
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
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
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tag;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        JsonArray jsonArray = this.contentList;
        int iHashCode4 = jsonArray == null ? 0 : jsonArray.hashCode();
        String str3 = this.backgroundType;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.backgroundColor;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        CtaPopUpData ctaPopUpData = this.cta;
        int iHashCode7 = ctaPopUpData == null ? 0 : ctaPopUpData.hashCode();
        GroupDynamic groupDynamic = this.dynamic;
        int iHashCode8 = groupDynamic == null ? 0 : groupDynamic.hashCode();
        Float f = this.cornerRadius;
        int iHashCode9 = f == null ? 0 : f.hashCode();
        Float f2 = this.paddingLeft;
        int iHashCode10 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.paddingTop;
        int iHashCode11 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.paddingRight;
        int iHashCode12 = f4 == null ? 0 : f4.hashCode();
        Float f5 = this.paddingBottom;
        int iHashCode13 = f5 == null ? 0 : f5.hashCode();
        String str5 = this.id;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        Boolean bool2 = this.required;
        int iHashCode15 = bool2 == null ? 0 : bool2.hashCode();
        String str6 = this.version;
        int iHashCode16 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.value;
        int iHashCode17 = str7 == null ? 0 : str7.hashCode();
        Float f6 = this.bottomMargin;
        int iHashCode18 = f6 == null ? 0 : f6.hashCode();
        Float f7 = this.leftMargin;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (f7 == null ? 0 : f7.hashCode());
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
        return "CtaCard(title=" + this.title + ", tag=" + this.tag + ", isHidden=" + this.isHidden + ", contentList=" + this.contentList + ", backgroundType=" + this.backgroundType + ", backgroundColor=" + this.backgroundColor + ", cta=" + this.cta + ", dynamic=" + this.dynamic + ", cornerRadius=" + this.cornerRadius + ", paddingLeft=" + this.paddingLeft + ", paddingTop=" + this.paddingTop + ", paddingRight=" + this.paddingRight + ", paddingBottom=" + this.paddingBottom + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.tag);
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
        CtaPopUpData ctaPopUpData = this.cta;
        if (ctaPopUpData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUpData.writeToParcel(parcel, i);
        }
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCard.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaCard> serializer() {
            return CtaCard$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CtaCard(int i, String str, String str2, Boolean bool, JsonArray jsonArray, String str3, String str4, CtaPopUpData ctaPopUpData, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str5, Boolean bool2, String str6, String str7, Float f6, Float f7, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (491520 != (i & 491520)) {
            PluginExceptionsKt.throwMissingFieldException(i, 491520, CtaCard$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.tag = null;
        } else {
            this.tag = str2;
        }
        this.isHidden = (i & 4) == 0 ? Boolean.FALSE : bool;
        if ((i & 8) == 0) {
            this.contentList = null;
        } else {
            this.contentList = jsonArray;
        }
        if ((i & 16) == 0) {
            this.backgroundType = null;
        } else {
            this.backgroundType = str3;
        }
        if ((i & 32) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str4;
        }
        if ((i & 64) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaPopUpData;
        }
        if ((i & 128) == 0) {
            this.dynamic = null;
        } else {
            this.dynamic = groupDynamic;
        }
        if ((i & 256) == 0) {
            this.cornerRadius = null;
        } else {
            this.cornerRadius = f;
        }
        if ((i & 512) == 0) {
            this.paddingLeft = null;
        } else {
            this.paddingLeft = f2;
        }
        if ((i & 1024) == 0) {
            this.paddingTop = null;
        } else {
            this.paddingTop = f3;
        }
        if ((i & 2048) == 0) {
            this.paddingRight = null;
        } else {
            this.paddingRight = f4;
        }
        if ((i & 4096) == 0) {
            this.paddingBottom = null;
        } else {
            this.paddingBottom = f5;
        }
        this.id = (i & 8192) == 0 ? "" : str5;
        this.required = (i & 16384) == 0 ? Boolean.FALSE : bool2;
        this.version = str6;
        this.value = str7;
        this.bottomMargin = f6;
        this.leftMargin = f7;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaCard ctaCard, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(ctaCard, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaCard.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, ctaCard.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ctaCard.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ctaCard.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(ctaCard.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, ctaCard.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || ctaCard.contentList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, JsonArraySerializer.INSTANCE, ctaCard.contentList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || ctaCard.backgroundType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, ctaCard.backgroundType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || ctaCard.backgroundColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, ctaCard.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || ctaCard.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, CtaPopUpData$$serializer.INSTANCE, ctaCard.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || ctaCard.dynamic != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, GroupDynamic$$serializer.INSTANCE, ctaCard.dynamic);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || ctaCard.cornerRadius != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, FloatSerializer.INSTANCE, ctaCard.cornerRadius);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || ctaCard.paddingLeft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, FloatSerializer.INSTANCE, ctaCard.paddingLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || ctaCard.paddingTop != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, FloatSerializer.INSTANCE, ctaCard.paddingTop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || ctaCard.paddingRight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, ctaCard.paddingRight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || ctaCard.paddingBottom != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, ctaCard.paddingBottom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) ctaCard.getId(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, ctaCard.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(ctaCard.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, ctaCard.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, ctaCard.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, ctaCard.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, ctaCard.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, floatSerializer, ctaCard.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r43v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r43v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (wrap:kotlinx.serialization.json.JsonArray:?: TERNARY null = ((wrap:int:0x001d: ARITH (r43v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonArray) : (r27v0 kotlinx.serialization.json.JsonArray))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r43v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData:?: TERNARY null = ((wrap:int:0x0035: ARITH (r43v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData) : (r30v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic:?: TERNARY null = ((wrap:int:0x003d: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic) : (r31v0 com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0045: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r32v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x004d: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r33v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0055: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r34v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x005d: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r35v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0065: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r36v0 java.lang.Float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0079: ARITH (r43v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.Float)
  (r42v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, kotlinx.serialization.json.JsonArray, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:4339) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCard.<init>(java.lang.String, java.lang.String, java.lang.Boolean, kotlinx.serialization.json.JsonArray, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ CtaCard(String str, String str2, Boolean bool, JsonArray jsonArray, String str3, String str4, CtaPopUpData ctaPopUpData, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str5, Boolean bool2, String str6, String str7, Float f6, Float f7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : jsonArray, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : ctaPopUpData, (i & 128) != 0 ? null : groupDynamic, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : f2, (i & 1024) != 0 ? null : f3, (i & 2048) != 0 ? null : f4, (i & 4096) != 0 ? null : f5, (i & 8192) != 0 ? "" : str5, (i & 16384) != 0 ? Boolean.FALSE : bool2, str6, str7, f6, f7);
    }

    public CtaCard(String str, String str2, Boolean bool, JsonArray jsonArray, String str3, String str4, CtaPopUpData ctaPopUpData, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str5, Boolean bool2, String str6, String str7, Float f6, Float f7) {
        super(null);
        this.title = str;
        this.tag = str2;
        this.isHidden = bool;
        this.contentList = jsonArray;
        this.backgroundType = str3;
        this.backgroundColor = str4;
        this.cta = ctaPopUpData;
        this.dynamic = groupDynamic;
        this.cornerRadius = f;
        this.paddingLeft = f2;
        this.paddingTop = f3;
        this.paddingRight = f4;
        this.paddingBottom = f5;
        this.id = str5;
        this.required = bool2;
        this.version = str6;
        this.value = str7;
        this.bottomMargin = f6;
        this.leftMargin = f7;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public CtaCardAppModel toAppModel() {
        List<UIComponentAppModel> listAhwBna;
        String str = this.title;
        String str2 = this.tag;
        Boolean boolIsHidden = isHidden();
        JsonArray jsonArray = this.contentList;
        if (jsonArray == null || (listAhwBna = C43747rvC.copydefault(jsonArray)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        List<UIComponentAppModel> list = listAhwBna;
        String str3 = this.backgroundType;
        String str4 = this.backgroundColor;
        CtaPopUpData ctaPopUpData = this.cta;
        CtaPopUp ctaPopUpKWHzl = ctaPopUpData != null ? C43780rvj.KWHzl(ctaPopUpData) : null;
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
        return new CtaCardAppModel(str, str2, boolIsHidden, list, str3, str4, ctaPopUpKWHzl, groupDynamic, f, f2, f3, f4, f5, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
