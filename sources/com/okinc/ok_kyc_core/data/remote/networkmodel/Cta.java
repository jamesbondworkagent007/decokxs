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
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import o.C43747rvC;
import o.C43776rvf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("cta")
@Serializable
public final class Cta extends UIComponent {
    private Float bottomMargin;
    private final String id;
    private Boolean isHidden;
    private final JsonElement items;
    private final Float leftMargin;
    private final String position;
    private final Boolean required;
    private String value;
    private final String version;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component7() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component8() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta copy(@NotNull JsonElement jsonElement, String str, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new Cta(jsonElement, str, str2, bool, str3, str4, f, f2, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cta)) {
            return false;
        }
        Cta cta = (Cta) obj;
        return Intrinsics.EZpvd(this.items, cta.items) && Intrinsics.EZpvd((Object) this.position, (Object) cta.position) && Intrinsics.EZpvd((Object) this.id, (Object) cta.id) && Intrinsics.EZpvd(this.required, cta.required) && Intrinsics.EZpvd((Object) this.version, (Object) cta.version) && Intrinsics.EZpvd((Object) this.value, (Object) cta.value) && Intrinsics.EZpvd(this.bottomMargin, cta.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, cta.leftMargin) && Intrinsics.EZpvd(this.isHidden, cta.isHidden);
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
    public final JsonElement getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
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
        int iHashCode = this.items.hashCode();
        String str = this.position;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.id;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.required;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str3 = this.version;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Float f = this.bottomMargin;
        int iHashCode7 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode8 = f2 == null ? 0 : f2.hashCode();
        Boolean bool2 = this.isHidden;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool2 != null ? bool2.hashCode() : 0);
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
        return "Cta(items=" + this.items + ", position=" + this.position + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cta(int i, JsonElement jsonElement, String str, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (247 != (i & 247)) {
            PluginExceptionsKt.throwMissingFieldException(i, 247, Cta$$serializer.INSTANCE.getDescriptor());
        }
        this.items = jsonElement;
        this.position = str;
        this.id = str2;
        if ((i & 8) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
        if ((i & 256) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Cta cta, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(cta, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, JsonElementSerializer.INSTANCE, cta.items);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, cta.position);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, cta.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(cta.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, cta.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, cta.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, cta.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, floatSerializer, cta.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, cta.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(cta.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, cta.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r13v0 kotlinx.serialization.json.JsonElement)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.Float)
  (r20v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
 A[MD:(kotlinx.serialization.json.JsonElement, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:1067) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Cta.<init>(kotlinx.serialization.json.JsonElement, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ Cta(JsonElement jsonElement, String str, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonElement, str, str2, (i & 8) != 0 ? Boolean.FALSE : bool, str3, str4, f, f2, (i & 256) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cta(@NotNull JsonElement jsonElement, String str, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2) {
        super(null);
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.items = jsonElement;
        this.position = str;
        this.id = str2;
        this.required = bool;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Cta(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Json jsonCopydefault = C43776rvf.EZpvd.copydefault();
        String string = parcel.readString();
        string = string == null ? "" : string;
        jsonCopydefault.getSerializersModule();
        JsonElement jsonElementEncodeToJsonElement = jsonCopydefault.encodeToJsonElement(StringSerializer.INSTANCE, string);
        String string2 = parcel.readString();
        String str = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str2 = string3 == null ? "" : string3;
        Object value = parcel.readValue(Boolean.TYPE.getClassLoader());
        this(jsonElementEncodeToJsonElement, str, str2, value instanceof Boolean ? (Boolean) value : null, parcel.readString(), parcel.readString(), Float.valueOf(parcel.readFloat()), Float.valueOf(parcel.readFloat()), (Boolean) null, 256, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.items.toString());
        parcel.writeString(getId());
        parcel.writeValue(getRequired());
        parcel.writeString(getVersion());
        parcel.writeString(getValue());
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<Cta> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Cta.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<Cta> serializer() {
            return Cta$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Cta createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Cta(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Cta[] newArray(int i) {
            return new Cta[i];
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public CtaAppModel toAppModel() {
        List<UIComponentAppModel> listCopydefault = C43747rvC.copydefault(this.items);
        String str = this.position;
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new CtaAppModel(listCopydefault, str, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin(), isHidden());
    }
}
