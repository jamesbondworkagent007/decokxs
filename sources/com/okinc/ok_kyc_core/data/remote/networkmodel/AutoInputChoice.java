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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43780rvj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("auto-input-choice")
@Serializable
public final class AutoInputChoice extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final CardChoicesData choices;
    private final CTAButton ctaOnClick;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AutoInputChoice> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AutoInputChoice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoInputChoice createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            CTAButton cTAButtonCreateFromParcel = parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel);
            CardChoicesData cardChoicesDataCreateFromParcel = parcel.readInt() == 0 ? null : CardChoicesData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoInputChoice(string, cTAButtonCreateFromParcel, cardChoicesDataCreateFromParcel, boolValueOf, string2, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoInputChoice[] newArray(int i) {
            return new AutoInputChoice[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component2() {
        return this.ctaOnClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoicesData component3() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component9() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoInputChoice copy(@NotNull String str, CTAButton cTAButton, CardChoicesData cardChoicesData, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AutoInputChoice(str, cTAButton, cardChoicesData, bool, str2, bool2, str3, str4, f, f2);
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
        if (!(obj instanceof AutoInputChoice)) {
            return false;
        }
        AutoInputChoice autoInputChoice = (AutoInputChoice) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) autoInputChoice.type) && Intrinsics.EZpvd(this.ctaOnClick, autoInputChoice.ctaOnClick) && Intrinsics.EZpvd(this.choices, autoInputChoice.choices) && Intrinsics.EZpvd(this.isHidden, autoInputChoice.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) autoInputChoice.id) && Intrinsics.EZpvd(this.required, autoInputChoice.required) && Intrinsics.EZpvd((Object) this.version, (Object) autoInputChoice.version) && Intrinsics.EZpvd((Object) this.value, (Object) autoInputChoice.value) && Intrinsics.EZpvd(this.bottomMargin, autoInputChoice.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, autoInputChoice.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoicesData getChoices() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCtaOnClick() {
        return this.ctaOnClick;
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
    public final String getType() {
        return this.type;
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
        int iHashCode = this.type.hashCode();
        CTAButton cTAButton = this.ctaOnClick;
        int iHashCode2 = cTAButton == null ? 0 : cTAButton.hashCode();
        CardChoicesData cardChoicesData = this.choices;
        int iHashCode3 = cardChoicesData == null ? 0 : cardChoicesData.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str = this.id;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Boolean bool2 = this.required;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.version;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode9 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "AutoInputChoice(type=" + this.type + ", ctaOnClick=" + this.ctaOnClick + ", choices=" + this.choices + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        CTAButton cTAButton = this.ctaOnClick;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
        CardChoicesData cardChoicesData = this.choices;
        if (cardChoicesData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardChoicesData.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AutoInputChoice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoInputChoice> serializer() {
            return AutoInputChoice$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoInputChoice(int i, String str, CTAButton cTAButton, CardChoicesData cardChoicesData, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (977 != (i & 977)) {
            PluginExceptionsKt.throwMissingFieldException(i, 977, AutoInputChoice$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.ctaOnClick = null;
        } else {
            this.ctaOnClick = cTAButton;
        }
        if ((i & 4) == 0) {
            this.choices = null;
        } else {
            this.choices = cardChoicesData;
        }
        if ((i & 8) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool;
        }
        this.id = str2;
        if ((i & 32) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool2;
        }
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AutoInputChoice autoInputChoice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(autoInputChoice, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, autoInputChoice.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || autoInputChoice.ctaOnClick != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CTAButton$$serializer.INSTANCE, autoInputChoice.ctaOnClick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || autoInputChoice.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, CardChoicesData$$serializer.INSTANCE, autoInputChoice.choices);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(autoInputChoice.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, autoInputChoice.isHidden());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, autoInputChoice.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(autoInputChoice.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, autoInputChoice.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, autoInputChoice.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, autoInputChoice.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, autoInputChoice.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, autoInputChoice.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x0000: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r15v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesData:?: TERNARY null = ((wrap:int:0x0008: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesData) : (r16v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesData))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (r18v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.Float)
  (r23v0 java.lang.Float)
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesData, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2906) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AutoInputChoice.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesData, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ AutoInputChoice(String str, CTAButton cTAButton, CardChoicesData cardChoicesData, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : cTAButton, (i & 4) != 0 ? null : cardChoicesData, (i & 8) != 0 ? Boolean.FALSE : bool, str2, (i & 32) != 0 ? Boolean.FALSE : bool2, str3, str4, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoInputChoice(@NotNull String str, CTAButton cTAButton, CardChoicesData cardChoicesData, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.ctaOnClick = cTAButton;
        this.choices = cardChoicesData;
        this.isHidden = bool;
        this.id = str2;
        this.required = bool2;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public AutoInputChoiceAppModel toAppModel() {
        String str = this.type;
        CTAButton cTAButton = this.ctaOnClick;
        CTAButtonAppModel appModel = cTAButton != null ? cTAButton.toAppModel() : null;
        CardChoicesData cardChoicesData = this.choices;
        CardChoices cardChoicesKWHzl = cardChoicesData != null ? C43780rvj.KWHzl(cardChoicesData) : null;
        Boolean boolIsHidden = isHidden();
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new AutoInputChoiceAppModel(str, appModel, cardChoicesKWHzl, boolIsHidden, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin(), (String) null, 1024, (DefaultConstructorMarker) null);
    }
}
