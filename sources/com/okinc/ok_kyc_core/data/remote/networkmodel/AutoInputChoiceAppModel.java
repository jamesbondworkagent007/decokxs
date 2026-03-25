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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AutoInputChoiceAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private final CardChoices choices;
    private final CTAButtonAppModel ctaOnClick;
    private String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private String searchText;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AutoInputChoiceAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AutoInputChoiceAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoInputChoiceAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            CTAButtonAppModel cTAButtonAppModelCreateFromParcel = parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel);
            CardChoices cardChoicesCreateFromParcel = parcel.readInt() == 0 ? null : CardChoices.CREATOR.createFromParcel(parcel);
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
            return new AutoInputChoiceAppModel(string, cTAButtonAppModelCreateFromParcel, cardChoicesCreateFromParcel, boolValueOf, string2, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoInputChoiceAppModel[] newArray(int i) {
            return new AutoInputChoiceAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AutoInputChoiceAppModel copy$default(AutoInputChoiceAppModel autoInputChoiceAppModel, String str, CTAButtonAppModel cTAButtonAppModel, CardChoices cardChoices, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2, String str5, int i, Object obj) {
        return autoInputChoiceAppModel.copy((i & 1) != 0 ? autoInputChoiceAppModel.type : str, (i & 2) != 0 ? autoInputChoiceAppModel.ctaOnClick : cTAButtonAppModel, (i & 4) != 0 ? autoInputChoiceAppModel.choices : cardChoices, (i & 8) != 0 ? autoInputChoiceAppModel.isHidden : bool, (i & 16) != 0 ? autoInputChoiceAppModel.id : str2, (i & 32) != 0 ? autoInputChoiceAppModel.required : bool2, (i & 64) != 0 ? autoInputChoiceAppModel.version : str3, (i & 128) != 0 ? autoInputChoiceAppModel.value : str4, (i & 256) != 0 ? autoInputChoiceAppModel.bottomMargin : f, (i & 512) != 0 ? autoInputChoiceAppModel.leftMargin : f2, (i & 1024) != 0 ? autoInputChoiceAppModel.searchText : str5);
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
    public final String component11() {
        return this.searchText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component2() {
        return this.ctaOnClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoices component3() {
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
    public final AutoInputChoiceAppModel copy(@NotNull String str, CTAButtonAppModel cTAButtonAppModel, CardChoices cardChoices, Boolean bool, @NotNull String str2, Boolean bool2, String str3, String str4, Float f, Float f2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new AutoInputChoiceAppModel(str, cTAButtonAppModel, cardChoices, bool, str2, bool2, str3, str4, f, f2, str5);
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
        if (!(obj instanceof AutoInputChoiceAppModel)) {
            return false;
        }
        AutoInputChoiceAppModel autoInputChoiceAppModel = (AutoInputChoiceAppModel) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) autoInputChoiceAppModel.type) && Intrinsics.EZpvd(this.ctaOnClick, autoInputChoiceAppModel.ctaOnClick) && Intrinsics.EZpvd(this.choices, autoInputChoiceAppModel.choices) && Intrinsics.EZpvd(this.isHidden, autoInputChoiceAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) autoInputChoiceAppModel.id) && Intrinsics.EZpvd(this.required, autoInputChoiceAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) autoInputChoiceAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) autoInputChoiceAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, autoInputChoiceAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, autoInputChoiceAppModel.leftMargin) && Intrinsics.EZpvd((Object) this.searchText, (Object) autoInputChoiceAppModel.searchText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoices getChoices() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCtaOnClick() {
        return this.ctaOnClick;
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
    public final String getSearchText() {
        return this.searchText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
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
        int iHashCode = this.type.hashCode();
        CTAButtonAppModel cTAButtonAppModel = this.ctaOnClick;
        int iHashCode2 = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
        CardChoices cardChoices = this.choices;
        int iHashCode3 = cardChoices == null ? 0 : cardChoices.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        int iHashCode5 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.version;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode9 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (f2 != null ? f2.hashCode() : 0)) * 31) + this.searchText.hashCode();
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
    public final void setSearchText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.searchText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoInputChoiceAppModel(type=" + this.type + ", ctaOnClick=" + this.ctaOnClick + ", choices=" + this.choices + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", searchText=" + this.searchText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        CTAButtonAppModel cTAButtonAppModel = this.ctaOnClick;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
        CardChoices cardChoices = this.choices;
        if (cardChoices == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardChoices.writeToParcel(parcel, i);
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
        parcel.writeString(this.searchText);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AutoInputChoiceAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoInputChoiceAppModel> serializer() {
            return AutoInputChoiceAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoInputChoiceAppModel(int i, String str, CTAButtonAppModel cTAButtonAppModel, CardChoices cardChoices, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (977 != (i & 977)) {
            PluginExceptionsKt.throwMissingFieldException(i, 977, AutoInputChoiceAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.ctaOnClick = null;
        } else {
            this.ctaOnClick = cTAButtonAppModel;
        }
        if ((i & 4) == 0) {
            this.choices = null;
        } else {
            this.choices = cardChoices;
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
        if ((i & 1024) == 0) {
            this.searchText = "";
        } else {
            this.searchText = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AutoInputChoiceAppModel autoInputChoiceAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(autoInputChoiceAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, autoInputChoiceAppModel.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || autoInputChoiceAppModel.ctaOnClick != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CTAButtonAppModel$$serializer.INSTANCE, autoInputChoiceAppModel.ctaOnClick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || autoInputChoiceAppModel.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, CardChoices$$serializer.INSTANCE, autoInputChoiceAppModel.choices);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(autoInputChoiceAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, autoInputChoiceAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, autoInputChoiceAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(autoInputChoiceAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, autoInputChoiceAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, autoInputChoiceAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, autoInputChoiceAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, autoInputChoiceAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, autoInputChoiceAppModel.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) autoInputChoiceAppModel.searchText, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, autoInputChoiceAppModel.searchText);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r17v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoices:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoices) : (r18v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoices))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (r20v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.Float)
  (r25v0 java.lang.Float)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoices, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.String):void (m)] (LINE:2935) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AutoInputChoiceAppModel.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoices, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.String):void type: THIS */
    public /* synthetic */ AutoInputChoiceAppModel(String str, CTAButtonAppModel cTAButtonAppModel, CardChoices cardChoices, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : cTAButtonAppModel, (i & 4) != 0 ? null : cardChoices, (i & 8) != 0 ? Boolean.FALSE : bool, str2, (i & 32) != 0 ? Boolean.FALSE : bool2, str3, str4, f, f2, (i & 1024) != 0 ? "" : str5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoInputChoiceAppModel(@NotNull String str, CTAButtonAppModel cTAButtonAppModel, CardChoices cardChoices, Boolean bool, @NotNull String str2, Boolean bool2, String str3, String str4, Float f, Float f2, @NotNull String str5) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.type = str;
        this.ctaOnClick = cTAButtonAppModel;
        this.choices = cardChoices;
        this.isHidden = bool;
        this.id = str2;
        this.required = bool2;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.searchText = str5;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public AutoInputChoiceAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
