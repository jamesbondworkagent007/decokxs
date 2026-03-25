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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43747rvC;
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("columns")
@Serializable
public final class Columns extends UIComponent {
    private final UIAlignment align;
    private Float bottomMargin;
    private final String id;
    private Boolean isHidden;
    private final JsonArray items;
    private final Float leftMargin;
    private final Boolean required;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Columns> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Columns> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Columns createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            JsonArray jsonArray = (JsonArray) parcel.readValue(Columns.class.getClassLoader());
            UIAlignment uIAlignmentValueOf = parcel.readInt() == 0 ? null : UIAlignment.valueOf(parcel.readString());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Columns(jsonArray, uIAlignmentValueOf, string, boolValueOf, string2, string3, fValueOf, fValueOf2, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Columns[] newArray(int i) {
            return new Columns[i];
        }
    }

    @Serializable(with = C43788rvr.class)
    public static /* synthetic */ void getAlign$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment component2() {
        return this.align;
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
    public final Columns copy(@NotNull JsonArray jsonArray, UIAlignment uIAlignment, String str, Boolean bool, String str2, String str3, Float f, Float f2, Boolean bool2) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        return new Columns(jsonArray, uIAlignment, str, bool, str2, str3, f, f2, bool2);
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
        if (!(obj instanceof Columns)) {
            return false;
        }
        Columns columns = (Columns) obj;
        return Intrinsics.EZpvd(this.items, columns.items) && this.align == columns.align && Intrinsics.EZpvd((Object) this.id, (Object) columns.id) && Intrinsics.EZpvd(this.required, columns.required) && Intrinsics.EZpvd((Object) this.version, (Object) columns.version) && Intrinsics.EZpvd((Object) this.value, (Object) columns.value) && Intrinsics.EZpvd(this.bottomMargin, columns.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, columns.leftMargin) && Intrinsics.EZpvd(this.isHidden, columns.isHidden);
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
    public final JsonArray getItems() {
        return this.items;
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
        UIAlignment uIAlignment = this.align;
        int iHashCode2 = uIAlignment == null ? 0 : uIAlignment.hashCode();
        String str = this.id;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Boolean bool = this.required;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str2 = this.version;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
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
        return "Columns(items=" + this.items + ", align=" + this.align + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeValue(this.items);
        UIAlignment uIAlignment = this.align;
        if (uIAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uIAlignment.name());
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
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Columns.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Columns> serializer() {
            return Columns$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Columns(int i, JsonArray jsonArray, UIAlignment uIAlignment, String str, Boolean bool, String str2, String str3, Float f, Float f2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (241 != (i & 241)) {
            PluginExceptionsKt.throwMissingFieldException(i, 241, Columns$$serializer.INSTANCE.getDescriptor());
        }
        this.items = jsonArray;
        if ((i & 2) == 0) {
            this.align = UIAlignment.SpaceBetween;
        } else {
            this.align = uIAlignment;
        }
        if ((i & 4) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 8) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
        if ((i & 256) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Columns columns, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(columns, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, columns.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || columns.align != UIAlignment.SpaceBetween) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, C43788rvr.KWHzl, columns.align);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) columns.getId(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, columns.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(columns.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, columns.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, columns.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, columns.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, floatSerializer, columns.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, columns.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(columns.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, columns.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r13v0 kotlinx.serialization.json.JsonArray)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:4620) com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment.SpaceBetween com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment) : (r14v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.Float)
  (r20v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
 A[MD:(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:4618) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Columns.<init>(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ Columns(JsonArray jsonArray, UIAlignment uIAlignment, String str, Boolean bool, String str2, String str3, Float f, Float f2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonArray, (i & 2) != 0 ? UIAlignment.SpaceBetween : uIAlignment, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? Boolean.FALSE : bool, str2, str3, f, f2, (i & 256) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Columns(@NotNull JsonArray jsonArray, UIAlignment uIAlignment, String str, Boolean bool, String str2, String str3, Float f, Float f2, Boolean bool2) {
        super(null);
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.items = jsonArray;
        this.align = uIAlignment;
        this.id = str;
        this.required = bool;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public ColumnsAppModel toAppModel() {
        List<UIComponentAppModel> listCopydefault = C43747rvC.copydefault(this.items);
        UIAlignment uIAlignment = this.align;
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new ColumnsAppModel(listCopydefault, uIAlignment, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin(), isHidden());
    }
}
