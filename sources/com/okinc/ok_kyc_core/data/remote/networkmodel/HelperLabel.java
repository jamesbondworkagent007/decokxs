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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("hyper-label")
@Serializable
public final class HelperLabel extends UIComponent implements Parcelable {
    private final UIAlignment align;
    private Float bottomMargin;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final HelperLabelTag tag;
    private final HelperLabelText text;
    private final Integer textTagGap;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HelperLabel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HelperLabel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelperLabel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            HelperLabelText helperLabelTextCreateFromParcel = parcel.readInt() == 0 ? null : HelperLabelText.CREATOR.createFromParcel(parcel);
            HelperLabelTag helperLabelTagCreateFromParcel = parcel.readInt() == 0 ? null : HelperLabelTag.CREATOR.createFromParcel(parcel);
            UIAlignment uIAlignmentValueOf = parcel.readInt() == 0 ? null : UIAlignment.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HelperLabel(numValueOf, helperLabelTextCreateFromParcel, helperLabelTagCreateFromParcel, uIAlignmentValueOf, boolValueOf, string, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelperLabel[] newArray(int i) {
            return new HelperLabel[i];
        }
    }

    @Serializable(with = C43788rvr.class)
    public static /* synthetic */ void getAlign$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.textTagGap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component11() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelText component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelTag component3() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment component4() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabel copy(Integer num, HelperLabelText helperLabelText, HelperLabelTag helperLabelTag, UIAlignment uIAlignment, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2) {
        return new HelperLabel(num, helperLabelText, helperLabelTag, uIAlignment, bool, str, bool2, str2, str3, f, f2);
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
        if (!(obj instanceof HelperLabel)) {
            return false;
        }
        HelperLabel helperLabel = (HelperLabel) obj;
        return Intrinsics.EZpvd(this.textTagGap, helperLabel.textTagGap) && Intrinsics.EZpvd(this.text, helperLabel.text) && Intrinsics.EZpvd(this.tag, helperLabel.tag) && this.align == helperLabel.align && Intrinsics.EZpvd(this.isHidden, helperLabel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) helperLabel.id) && Intrinsics.EZpvd(this.required, helperLabel.required) && Intrinsics.EZpvd((Object) this.version, (Object) helperLabel.version) && Intrinsics.EZpvd((Object) this.value, (Object) helperLabel.value) && Intrinsics.EZpvd(this.bottomMargin, helperLabel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, helperLabel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment getAlign() {
        return this.align;
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
    public final HelperLabelTag getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelText getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTextTagGap() {
        return this.textTagGap;
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
        Integer num = this.textTagGap;
        int iHashCode = num == null ? 0 : num.hashCode();
        HelperLabelText helperLabelText = this.text;
        int iHashCode2 = helperLabelText == null ? 0 : helperLabelText.hashCode();
        HelperLabelTag helperLabelTag = this.tag;
        int iHashCode3 = helperLabelTag == null ? 0 : helperLabelTag.hashCode();
        UIAlignment uIAlignment = this.align;
        int iHashCode4 = uIAlignment == null ? 0 : uIAlignment.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str = this.id;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Boolean bool2 = this.required;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.version;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode10 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "HelperLabel(textTagGap=" + this.textTagGap + ", text=" + this.text + ", tag=" + this.tag + ", align=" + this.align + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.textTagGap;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        HelperLabelText helperLabelText = this.text;
        if (helperLabelText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            helperLabelText.writeToParcel(parcel, i);
        }
        HelperLabelTag helperLabelTag = this.tag;
        if (helperLabelTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            helperLabelTag.writeToParcel(parcel, i);
        }
        UIAlignment uIAlignment = this.align;
        if (uIAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uIAlignment.name());
        }
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HelperLabel> serializer() {
            return HelperLabel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelperLabel(int i, Integer num, HelperLabelText helperLabelText, HelperLabelTag helperLabelTag, UIAlignment uIAlignment, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1952 != (i & 1952)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1952, HelperLabel$$serializer.INSTANCE.getDescriptor());
        }
        this.textTagGap = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = helperLabelText;
        }
        if ((i & 4) == 0) {
            this.tag = null;
        } else {
            this.tag = helperLabelTag;
        }
        if ((i & 8) == 0) {
            this.align = UIAlignment.Center;
        } else {
            this.align = uIAlignment;
        }
        if ((i & 16) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool;
        }
        this.id = str;
        if ((i & 64) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool2;
        }
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(HelperLabel helperLabel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        UIComponent.write$Self(helperLabel, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = helperLabel.textTagGap) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, helperLabel.textTagGap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || helperLabel.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, HelperLabelText$$serializer.INSTANCE, helperLabel.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || helperLabel.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, HelperLabelTag$$serializer.INSTANCE, helperLabel.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || helperLabel.align != UIAlignment.Center) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, C43788rvr.KWHzl, helperLabel.align);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(helperLabel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, helperLabel.isHidden());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, helperLabel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(helperLabel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, helperLabel.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, helperLabel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, helperLabel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, helperLabel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, helperLabel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0045: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 java.lang.Integer))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText:?: TERNARY null = ((wrap:int:0x000c: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText) : (r15v0 com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag:?: TERNARY null = ((wrap:int:0x0014: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag) : (r16v0 com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:?: TERNARY null = ((wrap:int:0x001c: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: SGET  A[WRAPPED] (LINE:2161) com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment.Center com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment) : (r17v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (r19v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0036: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.Float)
  (r24v0 java.lang.Float)
 A[MD:(java.lang.Integer, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2157) call: com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabel.<init>(java.lang.Integer, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ HelperLabel(Integer num, HelperLabelText helperLabelText, HelperLabelTag helperLabelTag, UIAlignment uIAlignment, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : helperLabelText, (i & 4) != 0 ? null : helperLabelTag, (i & 8) != 0 ? UIAlignment.Center : uIAlignment, (i & 16) != 0 ? Boolean.FALSE : bool, str, (i & 64) != 0 ? Boolean.FALSE : bool2, str2, str3, f, f2);
    }

    public HelperLabel(Integer num, HelperLabelText helperLabelText, HelperLabelTag helperLabelTag, UIAlignment uIAlignment, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2) {
        super(null);
        this.textTagGap = num;
        this.text = helperLabelText;
        this.tag = helperLabelTag;
        this.align = uIAlignment;
        this.isHidden = bool;
        this.id = str;
        this.required = bool2;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public HelperLabelAppModel toAppModel() {
        Integer num = this.textTagGap;
        HelperLabelText helperLabelText = this.text;
        HelperLabelTag helperLabelTag = this.tag;
        UIAlignment uIAlignment = this.align;
        Boolean boolIsHidden = isHidden();
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new HelperLabelAppModel(num, helperLabelText, helperLabelTag, uIAlignment, boolIsHidden, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
