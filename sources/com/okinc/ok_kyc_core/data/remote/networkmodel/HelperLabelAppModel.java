package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
@Serializable
public final class HelperLabelAppModel extends UIComponentAppModel implements Parcelable {
    private final UIAlignment align;
    private Float bottomMargin;
    private String id;
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
    public static final Parcelable.Creator<HelperLabelAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HelperLabelAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelperLabelAppModel createFromParcel(Parcel parcel) {
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
            return new HelperLabelAppModel(numValueOf, helperLabelTextCreateFromParcel, helperLabelTagCreateFromParcel, uIAlignmentValueOf, boolValueOf, string, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelperLabelAppModel[] newArray(int i) {
            return new HelperLabelAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HelperLabelAppModel copy$default(HelperLabelAppModel helperLabelAppModel, Integer num, HelperLabelText helperLabelText, HelperLabelTag helperLabelTag, UIAlignment uIAlignment, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, int i, Object obj) {
        return helperLabelAppModel.copy((i & 1) != 0 ? helperLabelAppModel.textTagGap : num, (i & 2) != 0 ? helperLabelAppModel.text : helperLabelText, (i & 4) != 0 ? helperLabelAppModel.tag : helperLabelTag, (i & 8) != 0 ? helperLabelAppModel.align : uIAlignment, (i & 16) != 0 ? helperLabelAppModel.isHidden : bool, (i & 32) != 0 ? helperLabelAppModel.id : str, (i & 64) != 0 ? helperLabelAppModel.required : bool2, (i & 128) != 0 ? helperLabelAppModel.version : str2, (i & 256) != 0 ? helperLabelAppModel.value : str3, (i & 512) != 0 ? helperLabelAppModel.bottomMargin : f, (i & 1024) != 0 ? helperLabelAppModel.leftMargin : f2);
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
    public final HelperLabelAppModel copy(Integer num, HelperLabelText helperLabelText, HelperLabelTag helperLabelTag, UIAlignment uIAlignment, Boolean bool, @NotNull String str, Boolean bool2, String str2, String str3, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HelperLabelAppModel(num, helperLabelText, helperLabelTag, uIAlignment, bool, str, bool2, str2, str3, f, f2);
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
        if (!(obj instanceof HelperLabelAppModel)) {
            return false;
        }
        HelperLabelAppModel helperLabelAppModel = (HelperLabelAppModel) obj;
        return Intrinsics.EZpvd(this.textTagGap, helperLabelAppModel.textTagGap) && Intrinsics.EZpvd(this.text, helperLabelAppModel.text) && Intrinsics.EZpvd(this.tag, helperLabelAppModel.tag) && this.align == helperLabelAppModel.align && Intrinsics.EZpvd(this.isHidden, helperLabelAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) helperLabelAppModel.id) && Intrinsics.EZpvd(this.required, helperLabelAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) helperLabelAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) helperLabelAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, helperLabelAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, helperLabelAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment getAlign() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
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
        int iHashCode6 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.version;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode10 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "HelperLabelAppModel(textTagGap=" + this.textTagGap + ", text=" + this.text + ", tag=" + this.tag + ", align=" + this.align + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HelperLabelAppModel> serializer() {
            return HelperLabelAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelperLabelAppModel(int i, Integer num, HelperLabelText helperLabelText, HelperLabelTag helperLabelTag, UIAlignment uIAlignment, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1952 != (i & 1952)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1952, HelperLabelAppModel$$serializer.INSTANCE.getDescriptor());
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

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(HelperLabelAppModel helperLabelAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        UIComponentAppModel.write$Self(helperLabelAppModel, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = helperLabelAppModel.textTagGap) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, helperLabelAppModel.textTagGap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || helperLabelAppModel.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, HelperLabelText$$serializer.INSTANCE, helperLabelAppModel.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || helperLabelAppModel.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, HelperLabelTag$$serializer.INSTANCE, helperLabelAppModel.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || helperLabelAppModel.align != UIAlignment.Center) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, C43788rvr.KWHzl, helperLabelAppModel.align);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(helperLabelAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, helperLabelAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, helperLabelAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(helperLabelAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, helperLabelAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, helperLabelAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, helperLabelAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, helperLabelAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, helperLabelAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0045: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 java.lang.Integer))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText:?: TERNARY null = ((wrap:int:0x000c: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText) : (r15v0 com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag:?: TERNARY null = ((wrap:int:0x0014: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag) : (r16v0 com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:?: TERNARY null = ((wrap:int:0x001c: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: SGET  A[WRAPPED] (LINE:2213) com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment.Center com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment) : (r17v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (r19v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0036: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.Float)
  (r24v0 java.lang.Float)
 A[MD:(java.lang.Integer, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2209) call: com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelAppModel.<init>(java.lang.Integer, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ HelperLabelAppModel(Integer num, HelperLabelText helperLabelText, HelperLabelTag helperLabelTag, UIAlignment uIAlignment, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : helperLabelText, (i & 4) != 0 ? null : helperLabelTag, (i & 8) != 0 ? UIAlignment.Center : uIAlignment, (i & 16) != 0 ? Boolean.FALSE : bool, str, (i & 64) != 0 ? Boolean.FALSE : bool2, str2, str3, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelperLabelAppModel(Integer num, HelperLabelText helperLabelText, HelperLabelTag helperLabelTag, UIAlignment uIAlignment, Boolean bool, @NotNull String str, Boolean bool2, String str2, String str3, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
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

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public HelperLabelAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
