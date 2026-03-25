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
public final class EditCardAppModel extends UIComponentAppModel {
    private Float bottomMargin;
    private final List<UIComponentAppModel> contentList;
    private final CtaAppModel cta;
    private final CTAButtonAppModel ctaArrow;
    private final String errorMsg;
    private final String icon;
    private final String iconHeight;
    private final String iconRenderColor;
    private final String iconWidth;
    private String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final FreetextStep step;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditCardAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<EditCardAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditCardAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            FreetextStep freetextStepCreateFromParcel = parcel.readInt() == 0 ? null : FreetextStep.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(EditCardAppModel.class.getClassLoader()));
            }
            return new EditCardAppModel(string, string2, string3, string4, string5, freetextStepCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : CtaAppModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditCardAppModel[] newArray(int i) {
            return new EditCardAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.EditCardAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditCardAppModel copy$default(EditCardAppModel editCardAppModel, String str, String str2, String str3, String str4, String str5, FreetextStep freetextStep, List list, CtaAppModel ctaAppModel, CTAButtonAppModel cTAButtonAppModel, String str6, Boolean bool, String str7, String str8, Boolean bool2, Float f, Float f2, int i, Object obj) {
        return editCardAppModel.copy((i & 1) != 0 ? editCardAppModel.icon : str, (i & 2) != 0 ? editCardAppModel.iconHeight : str2, (i & 4) != 0 ? editCardAppModel.iconWidth : str3, (i & 8) != 0 ? editCardAppModel.iconRenderColor : str4, (i & 16) != 0 ? editCardAppModel.errorMsg : str5, (i & 32) != 0 ? editCardAppModel.step : freetextStep, (i & 64) != 0 ? editCardAppModel.contentList : list, (i & 128) != 0 ? editCardAppModel.cta : ctaAppModel, (i & 256) != 0 ? editCardAppModel.ctaArrow : cTAButtonAppModel, (i & 512) != 0 ? editCardAppModel.id : str6, (i & 1024) != 0 ? editCardAppModel.required : bool, (i & 2048) != 0 ? editCardAppModel.version : str7, (i & 4096) != 0 ? editCardAppModel.value : str8, (i & 8192) != 0 ? editCardAppModel.isHidden : bool2, (i & 16384) != 0 ? editCardAppModel.bottomMargin : f, (i & 32768) != 0 ? editCardAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.isHidden;
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
    public final String component2() {
        return this.iconHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.iconWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconRenderColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreetextStep component6() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> component7() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaAppModel component8() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component9() {
        return this.ctaArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditCardAppModel copy(String str, String str2, String str3, String str4, String str5, FreetextStep freetextStep, @NotNull List<? extends UIComponentAppModel> list, CtaAppModel ctaAppModel, CTAButtonAppModel cTAButtonAppModel, @NotNull String str6, Boolean bool, String str7, String str8, Boolean bool2, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new EditCardAppModel(str, str2, str3, str4, str5, freetextStep, list, ctaAppModel, cTAButtonAppModel, str6, bool, str7, str8, bool2, f, f2);
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
        if (!(obj instanceof EditCardAppModel)) {
            return false;
        }
        EditCardAppModel editCardAppModel = (EditCardAppModel) obj;
        return Intrinsics.EZpvd((Object) this.icon, (Object) editCardAppModel.icon) && Intrinsics.EZpvd((Object) this.iconHeight, (Object) editCardAppModel.iconHeight) && Intrinsics.EZpvd((Object) this.iconWidth, (Object) editCardAppModel.iconWidth) && Intrinsics.EZpvd((Object) this.iconRenderColor, (Object) editCardAppModel.iconRenderColor) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) editCardAppModel.errorMsg) && Intrinsics.EZpvd(this.step, editCardAppModel.step) && Intrinsics.EZpvd(this.contentList, editCardAppModel.contentList) && Intrinsics.EZpvd(this.cta, editCardAppModel.cta) && Intrinsics.EZpvd(this.ctaArrow, editCardAppModel.ctaArrow) && Intrinsics.EZpvd((Object) this.id, (Object) editCardAppModel.id) && Intrinsics.EZpvd(this.required, editCardAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) editCardAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) editCardAppModel.value) && Intrinsics.EZpvd(this.isHidden, editCardAppModel.isHidden) && Intrinsics.EZpvd(this.bottomMargin, editCardAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, editCardAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> getContentList() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaAppModel getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCtaArrow() {
        return this.ctaArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconHeight() {
        return this.iconHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconRenderColor() {
        return this.iconRenderColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconWidth() {
        return this.iconWidth;
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
    public final FreetextStep getStep() {
        return this.step;
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
        String str = this.icon;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.iconHeight;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconWidth;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iconRenderColor;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.errorMsg;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        FreetextStep freetextStep = this.step;
        int iHashCode6 = freetextStep == null ? 0 : freetextStep.hashCode();
        int iHashCode7 = this.contentList.hashCode();
        CtaAppModel ctaAppModel = this.cta;
        int iHashCode8 = ctaAppModel == null ? 0 : ctaAppModel.hashCode();
        CTAButtonAppModel cTAButtonAppModel = this.ctaArrow;
        int iHashCode9 = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
        int iHashCode10 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        String str6 = this.version;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.value;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode14 = bool2 == null ? 0 : bool2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode15 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (f2 == null ? 0 : f2.hashCode());
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
        return "EditCardAppModel(icon=" + this.icon + ", iconHeight=" + this.iconHeight + ", iconWidth=" + this.iconWidth + ", iconRenderColor=" + this.iconRenderColor + ", errorMsg=" + this.errorMsg + ", step=" + this.step + ", contentList=" + this.contentList + ", cta=" + this.cta + ", ctaArrow=" + this.ctaArrow + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", isHidden=" + this.isHidden + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.icon);
        parcel.writeString(this.iconHeight);
        parcel.writeString(this.iconWidth);
        parcel.writeString(this.iconRenderColor);
        parcel.writeString(this.errorMsg);
        FreetextStep freetextStep = this.step;
        if (freetextStep == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freetextStep.writeToParcel(parcel, i);
        }
        List<UIComponentAppModel> list = this.contentList;
        parcel.writeInt(list.size());
        Iterator<UIComponentAppModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        CtaAppModel ctaAppModel = this.cta;
        if (ctaAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaAppModel.writeToParcel(parcel, i);
        }
        CTAButtonAppModel cTAButtonAppModel = this.ctaArrow;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.EditCardAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditCardAppModel> serializer() {
            return EditCardAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditCardAppModel(int i, String str, String str2, String str3, String str4, String str5, FreetextStep freetextStep, List list, CtaAppModel ctaAppModel, CTAButtonAppModel cTAButtonAppModel, String str6, Boolean bool, String str7, String str8, Boolean bool2, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (55872 != (i & 55872)) {
            PluginExceptionsKt.throwMissingFieldException(i, 55872, EditCardAppModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        if ((i & 2) == 0) {
            this.iconHeight = null;
        } else {
            this.iconHeight = str2;
        }
        if ((i & 4) == 0) {
            this.iconWidth = null;
        } else {
            this.iconWidth = str3;
        }
        if ((i & 8) == 0) {
            this.iconRenderColor = null;
        } else {
            this.iconRenderColor = str4;
        }
        if ((i & 16) == 0) {
            this.errorMsg = null;
        } else {
            this.errorMsg = str5;
        }
        if ((i & 32) == 0) {
            this.step = null;
        } else {
            this.step = freetextStep;
        }
        this.contentList = list;
        if ((i & 128) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaAppModel;
        }
        if ((i & 256) == 0) {
            this.ctaArrow = null;
        } else {
            this.ctaArrow = cTAButtonAppModel;
        }
        this.id = str6;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool;
        this.version = str7;
        this.value = str8;
        this.isHidden = (i & 8192) == 0 ? Boolean.FALSE : bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(EditCardAppModel editCardAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(editCardAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || editCardAppModel.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, editCardAppModel.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || editCardAppModel.iconHeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, editCardAppModel.iconHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || editCardAppModel.iconWidth != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, editCardAppModel.iconWidth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || editCardAppModel.iconRenderColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, editCardAppModel.iconRenderColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || editCardAppModel.errorMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, editCardAppModel.errorMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || editCardAppModel.step != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, FreetextStep$$serializer.INSTANCE, editCardAppModel.step);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], editCardAppModel.contentList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || editCardAppModel.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, CtaAppModel$$serializer.INSTANCE, editCardAppModel.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || editCardAppModel.ctaArrow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, CTAButtonAppModel$$serializer.INSTANCE, editCardAppModel.ctaArrow);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, editCardAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(editCardAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, editCardAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, editCardAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, editCardAppModel.getValue());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(editCardAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, editCardAppModel.isHidden());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, editCardAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, editCardAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep:?: TERNARY null = ((wrap:int:0x002b: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep))
  (r27v0 java.util.List)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel:?: TERNARY null = ((wrap:int:0x0033: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel) : (r28v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x003b: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r29v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (r30v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0049: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0053: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (r35v0 java.lang.Float)
  (r36v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void (m)] (LINE:4706) call: com.okinc.ok_kyc_core.data.remote.networkmodel.EditCardAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ EditCardAppModel(String str, String str2, String str3, String str4, String str5, FreetextStep freetextStep, List list, CtaAppModel ctaAppModel, CTAButtonAppModel cTAButtonAppModel, String str6, Boolean bool, String str7, String str8, Boolean bool2, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : freetextStep, list, (i & 128) != 0 ? null : ctaAppModel, (i & 256) != 0 ? null : cTAButtonAppModel, str6, (i & 1024) != 0 ? Boolean.FALSE : bool, str7, str8, (i & 8192) != 0 ? Boolean.FALSE : bool2, f, f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EditCardAppModel(String str, String str2, String str3, String str4, String str5, FreetextStep freetextStep, @NotNull List<? extends UIComponentAppModel> list, CtaAppModel ctaAppModel, CTAButtonAppModel cTAButtonAppModel, @NotNull String str6, Boolean bool, String str7, String str8, Boolean bool2, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.icon = str;
        this.iconHeight = str2;
        this.iconWidth = str3;
        this.iconRenderColor = str4;
        this.errorMsg = str5;
        this.step = freetextStep;
        this.contentList = list;
        this.cta = ctaAppModel;
        this.ctaArrow = cTAButtonAppModel;
        this.id = str6;
        this.required = bool;
        this.version = str7;
        this.value = str8;
        this.isHidden = bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public EditCardAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }
}
