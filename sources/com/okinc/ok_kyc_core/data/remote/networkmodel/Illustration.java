package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName(TtmlNode.TAG_IMAGE)
@Serializable
public final class Illustration extends UIComponent implements Parcelable {
    private final UIAlignment align;
    private final String androidAppIconId;
    private final String blackImageUrl;
    private Float bottomMargin;
    private final String height;
    private final String id;
    private final String imageUrl;
    private Boolean isHidden;
    private final Float leftMargin;
    private final String name;
    private final Boolean required;
    private final String type;
    private String value;
    private final String version;
    private final String width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Illustration> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Illustration> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Illustration createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            UIAlignment uIAlignmentValueOf = parcel.readInt() == 0 ? null : UIAlignment.valueOf(parcel.readString());
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Illustration(string, string2, string3, string4, string5, string6, uIAlignmentValueOf, string7, boolValueOf, string8, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Illustration[] newArray(int i) {
            return new Illustration[i];
        }
    }

    @Serializable(with = C43788rvr.class)
    public static /* synthetic */ void getAlign$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
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
    public final Float component14() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component15() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.blackImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment component7() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.androidAppIconId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Illustration copy(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, UIAlignment uIAlignment, String str7, Boolean bool, String str8, Boolean bool2, String str9, String str10, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Illustration(str, str2, str3, str4, str5, str6, uIAlignment, str7, bool, str8, bool2, str9, str10, f, f2);
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
        if (!(obj instanceof Illustration)) {
            return false;
        }
        Illustration illustration = (Illustration) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) illustration.type) && Intrinsics.EZpvd((Object) this.name, (Object) illustration.name) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) illustration.imageUrl) && Intrinsics.EZpvd((Object) this.blackImageUrl, (Object) illustration.blackImageUrl) && Intrinsics.EZpvd((Object) this.height, (Object) illustration.height) && Intrinsics.EZpvd((Object) this.width, (Object) illustration.width) && this.align == illustration.align && Intrinsics.EZpvd((Object) this.androidAppIconId, (Object) illustration.androidAppIconId) && Intrinsics.EZpvd(this.isHidden, illustration.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) illustration.id) && Intrinsics.EZpvd(this.required, illustration.required) && Intrinsics.EZpvd((Object) this.version, (Object) illustration.version) && Intrinsics.EZpvd((Object) this.value, (Object) illustration.value) && Intrinsics.EZpvd(this.bottomMargin, illustration.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, illustration.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment getAlign() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAndroidAppIconId() {
        return this.androidAppIconId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlackImageUrl() {
        return this.blackImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
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
    public final String getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.name.hashCode();
        String str = this.imageUrl;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.blackImageUrl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.height;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.width;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        UIAlignment uIAlignment = this.align;
        int iHashCode7 = uIAlignment == null ? 0 : uIAlignment.hashCode();
        String str5 = this.androidAppIconId;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str6 = this.id;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        Boolean bool2 = this.required;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        String str7 = this.version;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.value;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        Float f = this.bottomMargin;
        int iHashCode14 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (f2 == null ? 0 : f2.hashCode());
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
        return "Illustration(type=" + this.type + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ", blackImageUrl=" + this.blackImageUrl + ", height=" + this.height + ", width=" + this.width + ", align=" + this.align + ", androidAppIconId=" + this.androidAppIconId + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.blackImageUrl);
        parcel.writeString(this.height);
        parcel.writeString(this.width);
        UIAlignment uIAlignment = this.align;
        if (uIAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uIAlignment.name());
        }
        parcel.writeString(this.androidAppIconId);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Illustration.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Illustration> serializer() {
            return Illustration$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Illustration(int i, String str, String str2, String str3, String str4, String str5, String str6, UIAlignment uIAlignment, String str7, Boolean bool, String str8, Boolean bool2, String str9, String str10, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (31295 != (i & 31295)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31295, Illustration$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.name = str2;
        this.imageUrl = str3;
        this.blackImageUrl = str4;
        this.height = str5;
        this.width = str6;
        this.align = (i & 64) == 0 ? UIAlignment.Center : uIAlignment;
        this.androidAppIconId = (i & 128) == 0 ? null : str7;
        this.isHidden = (i & 256) == 0 ? Boolean.FALSE : bool;
        this.id = str8;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool2;
        this.version = str9;
        this.value = str10;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Illustration illustration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(illustration, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, illustration.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, illustration.name);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, illustration.imageUrl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, illustration.blackImageUrl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, illustration.height);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, illustration.width);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || illustration.align != UIAlignment.Center) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, C43788rvr.KWHzl, illustration.align);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || illustration.androidAppIconId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, illustration.androidAppIconId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(illustration.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, illustration.isHidden());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, illustration.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(illustration.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, illustration.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, illustration.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, illustration.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, illustration.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, illustration.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0041: CONSTRUCTOR 
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:4281) com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment.Center com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (r28v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.Float)
  (r33v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:4274) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Illustration.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ Illustration(String str, String str2, String str3, String str4, String str5, String str6, UIAlignment uIAlignment, String str7, Boolean bool, String str8, Boolean bool2, String str9, String str10, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? UIAlignment.Center : uIAlignment, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? Boolean.FALSE : bool, str8, (i & 1024) != 0 ? Boolean.FALSE : bool2, str9, str10, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Illustration(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, UIAlignment uIAlignment, String str7, Boolean bool, String str8, Boolean bool2, String str9, String str10, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.name = str2;
        this.imageUrl = str3;
        this.blackImageUrl = str4;
        this.height = str5;
        this.width = str6;
        this.align = uIAlignment;
        this.androidAppIconId = str7;
        this.isHidden = bool;
        this.id = str8;
        this.required = bool2;
        this.version = str9;
        this.value = str10;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public IllustrationAppModel toAppModel() {
        String str = this.type;
        String str2 = this.name;
        String str3 = this.imageUrl;
        String str4 = this.blackImageUrl;
        String str5 = this.height;
        String str6 = this.width;
        UIAlignment uIAlignment = this.align;
        String str7 = this.androidAppIconId;
        Boolean boolIsHidden = isHidden();
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new IllustrationAppModel(str, str2, str3, str4, str5, str6, uIAlignment, str7, boolIsHidden, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
