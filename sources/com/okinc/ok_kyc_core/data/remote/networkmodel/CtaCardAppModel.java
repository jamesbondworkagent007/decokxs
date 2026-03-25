package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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
public final class CtaCardAppModel extends UIComponentAppModel {
    private final String backgroundColor;
    private final String backgroundType;
    private Float bottomMargin;
    private List<? extends UIComponentAppModel> contentList;
    private final Float cornerRadius;
    private final CtaPopUp cta;
    private final GroupDynamic dynamic;
    private String id;
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
    public static final Parcelable.Creator<CtaCardAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<CtaCardAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaCardAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(CtaCardAppModel.class.getClassLoader()));
            }
            return new CtaCardAppModel(string, string2, boolValueOf, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CtaPopUp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupDynamic.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaCardAppModel[] newArray(int i) {
            return new CtaCardAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CtaCardAppModel copy$default(CtaCardAppModel ctaCardAppModel, String str, String str2, Boolean bool, List list, String str3, String str4, CtaPopUp ctaPopUp, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str5, Boolean bool2, String str6, String str7, Float f6, Float f7, int i, Object obj) {
        return ctaCardAppModel.copy((i & 1) != 0 ? ctaCardAppModel.title : str, (i & 2) != 0 ? ctaCardAppModel.tag : str2, (i & 4) != 0 ? ctaCardAppModel.isHidden : bool, (i & 8) != 0 ? ctaCardAppModel.contentList : list, (i & 16) != 0 ? ctaCardAppModel.backgroundType : str3, (i & 32) != 0 ? ctaCardAppModel.backgroundColor : str4, (i & 64) != 0 ? ctaCardAppModel.cta : ctaPopUp, (i & 128) != 0 ? ctaCardAppModel.dynamic : groupDynamic, (i & 256) != 0 ? ctaCardAppModel.cornerRadius : f, (i & 512) != 0 ? ctaCardAppModel.paddingLeft : f2, (i & 1024) != 0 ? ctaCardAppModel.paddingTop : f3, (i & 2048) != 0 ? ctaCardAppModel.paddingRight : f4, (i & 4096) != 0 ? ctaCardAppModel.paddingBottom : f5, (i & 8192) != 0 ? ctaCardAppModel.id : str5, (i & 16384) != 0 ? ctaCardAppModel.required : bool2, (i & 32768) != 0 ? ctaCardAppModel.version : str6, (i & 65536) != 0 ? ctaCardAppModel.value : str7, (i & 131072) != 0 ? ctaCardAppModel.bottomMargin : f6, (i & 262144) != 0 ? ctaCardAppModel.leftMargin : f7);
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
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> component4() {
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
    public final CtaPopUp component7() {
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
    public final CtaCardAppModel copy(String str, String str2, Boolean bool, @NotNull List<? extends UIComponentAppModel> list, String str3, String str4, CtaPopUp ctaPopUp, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, @NotNull String str5, Boolean bool2, String str6, String str7, Float f6, Float f7) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CtaCardAppModel(str, str2, bool, list, str3, str4, ctaPopUp, groupDynamic, f, f2, f3, f4, f5, str5, bool2, str6, str7, f6, f7);
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
        if (!(obj instanceof CtaCardAppModel)) {
            return false;
        }
        CtaCardAppModel ctaCardAppModel = (CtaCardAppModel) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) ctaCardAppModel.title) && Intrinsics.EZpvd((Object) this.tag, (Object) ctaCardAppModel.tag) && Intrinsics.EZpvd(this.isHidden, ctaCardAppModel.isHidden) && Intrinsics.EZpvd(this.contentList, ctaCardAppModel.contentList) && Intrinsics.EZpvd((Object) this.backgroundType, (Object) ctaCardAppModel.backgroundType) && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) ctaCardAppModel.backgroundColor) && Intrinsics.EZpvd(this.cta, ctaCardAppModel.cta) && Intrinsics.EZpvd(this.dynamic, ctaCardAppModel.dynamic) && Intrinsics.EZpvd(this.cornerRadius, ctaCardAppModel.cornerRadius) && Intrinsics.EZpvd(this.paddingLeft, ctaCardAppModel.paddingLeft) && Intrinsics.EZpvd(this.paddingTop, ctaCardAppModel.paddingTop) && Intrinsics.EZpvd(this.paddingRight, ctaCardAppModel.paddingRight) && Intrinsics.EZpvd(this.paddingBottom, ctaCardAppModel.paddingBottom) && Intrinsics.EZpvd((Object) this.id, (Object) ctaCardAppModel.id) && Intrinsics.EZpvd(this.required, ctaCardAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) ctaCardAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) ctaCardAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, ctaCardAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, ctaCardAppModel.leftMargin);
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> getContentList() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUp getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupDynamic getDynamic() {
        return this.dynamic;
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
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
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tag;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        int iHashCode4 = this.contentList.hashCode();
        String str3 = this.backgroundType;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.backgroundColor;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        CtaPopUp ctaPopUp = this.cta;
        int iHashCode7 = ctaPopUp == null ? 0 : ctaPopUp.hashCode();
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
        int iHashCode14 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode15 = bool2 == null ? 0 : bool2.hashCode();
        String str5 = this.version;
        int iHashCode16 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.value;
        int iHashCode17 = str6 == null ? 0 : str6.hashCode();
        Float f6 = this.bottomMargin;
        int iHashCode18 = f6 == null ? 0 : f6.hashCode();
        Float f7 = this.leftMargin;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (f7 == null ? 0 : f7.hashCode());
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
    public final void setContentList(@NotNull List<? extends UIComponentAppModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.contentList = list;
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
        return "CtaCardAppModel(title=" + this.title + ", tag=" + this.tag + ", isHidden=" + this.isHidden + ", contentList=" + this.contentList + ", backgroundType=" + this.backgroundType + ", backgroundColor=" + this.backgroundColor + ", cta=" + this.cta + ", dynamic=" + this.dynamic + ", cornerRadius=" + this.cornerRadius + ", paddingLeft=" + this.paddingLeft + ", paddingTop=" + this.paddingTop + ", paddingRight=" + this.paddingRight + ", paddingBottom=" + this.paddingBottom + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
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
        List<? extends UIComponentAppModel> list = this.contentList;
        parcel.writeInt(list.size());
        Iterator<? extends UIComponentAppModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.backgroundType);
        parcel.writeString(this.backgroundColor);
        CtaPopUp ctaPopUp = this.cta;
        if (ctaPopUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUp.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaCardAppModel> serializer() {
            return CtaCardAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CtaCardAppModel(int i, String str, String str2, Boolean bool, List list, String str3, String str4, CtaPopUp ctaPopUp, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str5, Boolean bool2, String str6, String str7, Float f6, Float f7, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (499720 != (i & 499720)) {
            PluginExceptionsKt.throwMissingFieldException(i, 499720, CtaCardAppModel$$serializer.INSTANCE.getDescriptor());
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
        this.contentList = list;
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
            this.cta = ctaPopUp;
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
        this.id = str5;
        this.required = (i & 16384) == 0 ? Boolean.FALSE : bool2;
        this.version = str6;
        this.value = str7;
        this.bottomMargin = f6;
        this.leftMargin = f7;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaCardAppModel ctaCardAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(ctaCardAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaCardAppModel.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, ctaCardAppModel.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ctaCardAppModel.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ctaCardAppModel.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(ctaCardAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, ctaCardAppModel.isHidden());
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], ctaCardAppModel.contentList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || ctaCardAppModel.backgroundType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, ctaCardAppModel.backgroundType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || ctaCardAppModel.backgroundColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, ctaCardAppModel.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || ctaCardAppModel.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, CtaPopUp$$serializer.INSTANCE, ctaCardAppModel.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || ctaCardAppModel.dynamic != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, GroupDynamic$$serializer.INSTANCE, ctaCardAppModel.dynamic);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || ctaCardAppModel.cornerRadius != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, FloatSerializer.INSTANCE, ctaCardAppModel.cornerRadius);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || ctaCardAppModel.paddingLeft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, FloatSerializer.INSTANCE, ctaCardAppModel.paddingLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || ctaCardAppModel.paddingTop != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, FloatSerializer.INSTANCE, ctaCardAppModel.paddingTop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || ctaCardAppModel.paddingRight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, ctaCardAppModel.paddingRight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || ctaCardAppModel.paddingBottom != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, ctaCardAppModel.paddingBottom);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, ctaCardAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(ctaCardAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, ctaCardAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, ctaCardAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, ctaCardAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, ctaCardAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, floatSerializer, ctaCardAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r43v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r43v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (r27v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r43v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp:?: TERNARY null = ((wrap:int:0x002d: ARITH (r43v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp) : (r30v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic:?: TERNARY null = ((wrap:int:0x0035: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic) : (r31v0 com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x003d: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r32v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0045: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r33v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x004d: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r34v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0055: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r35v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x005d: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r36v0 java.lang.Float))
  (r37v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0066: ARITH (r43v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.Float)
  (r42v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:4390) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ CtaCardAppModel(String str, String str2, Boolean bool, List list, String str3, String str4, CtaPopUp ctaPopUp, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, String str5, Boolean bool2, String str6, String str7, Float f6, Float f7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.FALSE : bool, list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : ctaPopUp, (i & 128) != 0 ? null : groupDynamic, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : f2, (i & 1024) != 0 ? null : f3, (i & 2048) != 0 ? null : f4, (i & 4096) != 0 ? null : f5, str5, (i & 16384) != 0 ? Boolean.FALSE : bool2, str6, str7, f6, f7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CtaCardAppModel(String str, String str2, Boolean bool, @NotNull List<? extends UIComponentAppModel> list, String str3, String str4, CtaPopUp ctaPopUp, GroupDynamic groupDynamic, Float f, Float f2, Float f3, Float f4, Float f5, @NotNull String str5, Boolean bool2, String str6, String str7, Float f6, Float f7) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.title = str;
        this.tag = str2;
        this.isHidden = bool;
        this.contentList = list;
        this.backgroundType = str3;
        this.backgroundColor = str4;
        this.cta = ctaPopUp;
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

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public CtaCardAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }
}
