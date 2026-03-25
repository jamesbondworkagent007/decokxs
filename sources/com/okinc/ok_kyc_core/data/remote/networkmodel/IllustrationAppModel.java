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
public final class IllustrationAppModel extends UIComponentAppModel implements Parcelable {
    private final UIAlignment align;
    private final String androidAppIconId;
    private final String blackImageUrl;
    private Float bottomMargin;
    private final String height;
    private String id;
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
    public static final Parcelable.Creator<IllustrationAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<IllustrationAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IllustrationAppModel createFromParcel(Parcel parcel) {
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
            return new IllustrationAppModel(string, string2, string3, string4, string5, string6, uIAlignmentValueOf, string7, boolValueOf, string8, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IllustrationAppModel[] newArray(int i) {
            return new IllustrationAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IllustrationAppModel copy$default(IllustrationAppModel illustrationAppModel, String str, String str2, String str3, String str4, String str5, String str6, UIAlignment uIAlignment, String str7, Boolean bool, String str8, Boolean bool2, String str9, String str10, Float f, Float f2, int i, Object obj) {
        return illustrationAppModel.copy((i & 1) != 0 ? illustrationAppModel.type : str, (i & 2) != 0 ? illustrationAppModel.name : str2, (i & 4) != 0 ? illustrationAppModel.imageUrl : str3, (i & 8) != 0 ? illustrationAppModel.blackImageUrl : str4, (i & 16) != 0 ? illustrationAppModel.height : str5, (i & 32) != 0 ? illustrationAppModel.width : str6, (i & 64) != 0 ? illustrationAppModel.align : uIAlignment, (i & 128) != 0 ? illustrationAppModel.androidAppIconId : str7, (i & 256) != 0 ? illustrationAppModel.isHidden : bool, (i & 512) != 0 ? illustrationAppModel.id : str8, (i & 1024) != 0 ? illustrationAppModel.required : bool2, (i & 2048) != 0 ? illustrationAppModel.version : str9, (i & 4096) != 0 ? illustrationAppModel.value : str10, (i & 8192) != 0 ? illustrationAppModel.bottomMargin : f, (i & 16384) != 0 ? illustrationAppModel.leftMargin : f2);
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
    public final IllustrationAppModel copy(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, UIAlignment uIAlignment, String str7, Boolean bool, @NotNull String str8, Boolean bool2, String str9, String str10, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new IllustrationAppModel(str, str2, str3, str4, str5, str6, uIAlignment, str7, bool, str8, bool2, str9, str10, f, f2);
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
        if (!(obj instanceof IllustrationAppModel)) {
            return false;
        }
        IllustrationAppModel illustrationAppModel = (IllustrationAppModel) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) illustrationAppModel.type) && Intrinsics.EZpvd((Object) this.name, (Object) illustrationAppModel.name) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) illustrationAppModel.imageUrl) && Intrinsics.EZpvd((Object) this.blackImageUrl, (Object) illustrationAppModel.blackImageUrl) && Intrinsics.EZpvd((Object) this.height, (Object) illustrationAppModel.height) && Intrinsics.EZpvd((Object) this.width, (Object) illustrationAppModel.width) && this.align == illustrationAppModel.align && Intrinsics.EZpvd((Object) this.androidAppIconId, (Object) illustrationAppModel.androidAppIconId) && Intrinsics.EZpvd(this.isHidden, illustrationAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) illustrationAppModel.id) && Intrinsics.EZpvd(this.required, illustrationAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) illustrationAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) illustrationAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, illustrationAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, illustrationAppModel.leftMargin);
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
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
        int iHashCode10 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        String str6 = this.version;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.value;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        Float f = this.bottomMargin;
        int iHashCode14 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (f2 == null ? 0 : f2.hashCode());
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
        return "IllustrationAppModel(type=" + this.type + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ", blackImageUrl=" + this.blackImageUrl + ", height=" + this.height + ", width=" + this.width + ", align=" + this.align + ", androidAppIconId=" + this.androidAppIconId + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.IllustrationAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IllustrationAppModel> serializer() {
            return IllustrationAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IllustrationAppModel(int i, String str, String str2, String str3, String str4, String str5, String str6, UIAlignment uIAlignment, String str7, Boolean bool, String str8, Boolean bool2, String str9, String str10, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (515 != (i & 515)) {
            PluginExceptionsKt.throwMissingFieldException(i, 515, IllustrationAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str3;
        }
        if ((i & 8) == 0) {
            this.blackImageUrl = "";
        } else {
            this.blackImageUrl = str4;
        }
        if ((i & 16) == 0) {
            this.height = "";
        } else {
            this.height = str5;
        }
        if ((i & 32) == 0) {
            this.width = "";
        } else {
            this.width = str6;
        }
        this.align = (i & 64) == 0 ? UIAlignment.Center : uIAlignment;
        if ((i & 128) == 0) {
            this.androidAppIconId = null;
        } else {
            this.androidAppIconId = str7;
        }
        this.isHidden = (i & 256) == 0 ? Boolean.FALSE : bool;
        this.id = str8;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool2;
        if ((i & 2048) == 0) {
            this.version = "";
        } else {
            this.version = str9;
        }
        if ((i & 4096) == 0) {
            this.value = "";
        } else {
            this.value = str10;
        }
        if ((i & 8192) == 0) {
            this.bottomMargin = null;
        } else {
            this.bottomMargin = f;
        }
        if ((i & 16384) == 0) {
            this.leftMargin = null;
        } else {
            this.leftMargin = f2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(IllustrationAppModel illustrationAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(illustrationAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, illustrationAppModel.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, illustrationAppModel.name);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) illustrationAppModel.imageUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, illustrationAppModel.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) illustrationAppModel.blackImageUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, illustrationAppModel.blackImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) illustrationAppModel.height, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, illustrationAppModel.height);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) illustrationAppModel.width, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, illustrationAppModel.width);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || illustrationAppModel.align != UIAlignment.Center) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, C43788rvr.KWHzl, illustrationAppModel.align);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || illustrationAppModel.androidAppIconId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, illustrationAppModel.androidAppIconId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(illustrationAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, illustrationAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, illustrationAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(illustrationAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, illustrationAppModel.getRequired());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) illustrationAppModel.getVersion(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, illustrationAppModel.getVersion());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) illustrationAppModel.getValue(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, illustrationAppModel.getValue());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || illustrationAppModel.getBottomMargin() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, illustrationAppModel.getBottomMargin());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && illustrationAppModel.getLeftMargin() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, FloatSerializer.INSTANCE, illustrationAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0076: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:?: TERNARY null = ((wrap:int:0x0024: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: SGET  A[WRAPPED] (LINE:4320) com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment.Center com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (r29v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0047: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x005c: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r33v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0065: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r34v0 java.lang.Float))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:4313) call: com.okinc.ok_kyc_core.data.remote.networkmodel.IllustrationAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ IllustrationAppModel(String str, String str2, String str3, String str4, String str5, String str6, UIAlignment uIAlignment, String str7, Boolean bool, String str8, Boolean bool2, String str9, String str10, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? UIAlignment.Center : uIAlignment, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? Boolean.FALSE : bool, str8, (i & 1024) != 0 ? Boolean.FALSE : bool2, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? null : f, (i & 16384) != 0 ? null : f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllustrationAppModel(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, UIAlignment uIAlignment, String str7, Boolean bool, @NotNull String str8, Boolean bool2, String str9, String str10, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str8, "");
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

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public IllustrationAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
