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
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class HyperlinkAppModel extends UIComponentAppModel implements Parcelable {
    private final UIAlignment align;
    private Float bottomMargin;
    private final String deeplink;
    private String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final String relativeUriType;
    private final Boolean required;
    private final String text;
    private final String uri;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HyperlinkAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HyperlinkAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HyperlinkAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            UIAlignment uIAlignmentValueOf = parcel.readInt() == 0 ? null : UIAlignment.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HyperlinkAppModel(string, string2, string3, string4, uIAlignmentValueOf, boolValueOf, string5, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HyperlinkAppModel[] newArray(int i) {
            return new HyperlinkAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HyperlinkAppModel copy$default(HyperlinkAppModel hyperlinkAppModel, String str, String str2, String str3, String str4, UIAlignment uIAlignment, Boolean bool, String str5, Boolean bool2, String str6, String str7, Float f, Float f2, int i, Object obj) {
        return hyperlinkAppModel.copy((i & 1) != 0 ? hyperlinkAppModel.text : str, (i & 2) != 0 ? hyperlinkAppModel.uri : str2, (i & 4) != 0 ? hyperlinkAppModel.deeplink : str3, (i & 8) != 0 ? hyperlinkAppModel.relativeUriType : str4, (i & 16) != 0 ? hyperlinkAppModel.align : uIAlignment, (i & 32) != 0 ? hyperlinkAppModel.isHidden : bool, (i & 64) != 0 ? hyperlinkAppModel.id : str5, (i & 128) != 0 ? hyperlinkAppModel.required : bool2, (i & 256) != 0 ? hyperlinkAppModel.version : str6, (i & 512) != 0 ? hyperlinkAppModel.value : str7, (i & 1024) != 0 ? hyperlinkAppModel.bottomMargin : f, (i & 2048) != 0 ? hyperlinkAppModel.leftMargin : f2);
    }

    @Serializable(with = C43788rvr.class)
    public static /* synthetic */ void getAlign$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component11() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.relativeUriType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment component5() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HyperlinkAppModel copy(@NotNull String str, String str2, String str3, String str4, UIAlignment uIAlignment, Boolean bool, @NotNull String str5, Boolean bool2, String str6, String str7, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new HyperlinkAppModel(str, str2, str3, str4, uIAlignment, bool, str5, bool2, str6, str7, f, f2);
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
        if (!(obj instanceof HyperlinkAppModel)) {
            return false;
        }
        HyperlinkAppModel hyperlinkAppModel = (HyperlinkAppModel) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) hyperlinkAppModel.text) && Intrinsics.EZpvd((Object) this.uri, (Object) hyperlinkAppModel.uri) && Intrinsics.EZpvd((Object) this.deeplink, (Object) hyperlinkAppModel.deeplink) && Intrinsics.EZpvd((Object) this.relativeUriType, (Object) hyperlinkAppModel.relativeUriType) && this.align == hyperlinkAppModel.align && Intrinsics.EZpvd(this.isHidden, hyperlinkAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) hyperlinkAppModel.id) && Intrinsics.EZpvd(this.required, hyperlinkAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) hyperlinkAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) hyperlinkAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, hyperlinkAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, hyperlinkAppModel.leftMargin);
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
    public final String getDeeplink() {
        return this.deeplink;
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
    public final String getRelativeUriType() {
        return this.relativeUriType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUri() {
        return this.uri;
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
        String str = this.uri;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.deeplink;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.relativeUriType;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        UIAlignment uIAlignment = this.align;
        int iHashCode5 = uIAlignment == null ? 0 : uIAlignment.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        int iHashCode7 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        String str4 = this.version;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        Float f = this.bottomMargin;
        int iHashCode11 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "HyperlinkAppModel(text=" + this.text + ", uri=" + this.uri + ", deeplink=" + this.deeplink + ", relativeUriType=" + this.relativeUriType + ", align=" + this.align + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        parcel.writeString(this.uri);
        parcel.writeString(this.deeplink);
        parcel.writeString(this.relativeUriType);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.HyperlinkAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HyperlinkAppModel> serializer() {
            return HyperlinkAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HyperlinkAppModel(int i, String str, String str2, String str3, String str4, UIAlignment uIAlignment, Boolean bool, String str5, Boolean bool2, String str6, String str7, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3921 != (i & 3921)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3921, HyperlinkAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.uri = null;
        } else {
            this.uri = str2;
        }
        if ((i & 4) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str3;
        }
        if ((i & 8) == 0) {
            this.relativeUriType = null;
        } else {
            this.relativeUriType = str4;
        }
        this.align = uIAlignment;
        this.isHidden = (i & 32) == 0 ? Boolean.FALSE : bool;
        this.id = str5;
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool2;
        this.version = str6;
        this.value = str7;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(HyperlinkAppModel hyperlinkAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(hyperlinkAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, hyperlinkAppModel.text);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || hyperlinkAppModel.uri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, hyperlinkAppModel.uri);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || hyperlinkAppModel.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, hyperlinkAppModel.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || hyperlinkAppModel.relativeUriType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, hyperlinkAppModel.relativeUriType);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, C43788rvr.KWHzl, hyperlinkAppModel.align);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(hyperlinkAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, hyperlinkAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, hyperlinkAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(hyperlinkAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, hyperlinkAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, hyperlinkAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, hyperlinkAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, hyperlinkAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, hyperlinkAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003f: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (r23v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.Float)
  (r28v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:1810) call: com.okinc.ok_kyc_core.data.remote.networkmodel.HyperlinkAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ HyperlinkAppModel(String str, String str2, String str3, String str4, UIAlignment uIAlignment, Boolean bool, String str5, Boolean bool2, String str6, String str7, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, uIAlignment, (i & 32) != 0 ? Boolean.FALSE : bool, str5, (i & 128) != 0 ? Boolean.FALSE : bool2, str6, str7, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperlinkAppModel(@NotNull String str, String str2, String str3, String str4, UIAlignment uIAlignment, Boolean bool, @NotNull String str5, Boolean bool2, String str6, String str7, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.text = str;
        this.uri = str2;
        this.deeplink = str3;
        this.relativeUriType = str4;
        this.align = uIAlignment;
        this.isHidden = bool;
        this.id = str5;
        this.required = bool2;
        this.version = str6;
        this.value = str7;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public HyperlinkAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
