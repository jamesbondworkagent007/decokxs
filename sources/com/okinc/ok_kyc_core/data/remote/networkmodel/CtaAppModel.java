package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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
public final class CtaAppModel extends UIComponentAppModel {
    private Float bottomMargin;
    private String id;
    private Boolean isHidden;
    private List<? extends UIComponentAppModel> items;
    private final Float leftMargin;
    private final String position;
    private final Boolean required;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CtaAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<CtaAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(CtaAppModel.class.getClassLoader()));
            }
            return new CtaAppModel(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaAppModel[] newArray(int i) {
            return new CtaAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CtaAppModel copy$default(CtaAppModel ctaAppModel, List list, String str, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2, int i, Object obj) {
        return ctaAppModel.copy((i & 1) != 0 ? ctaAppModel.items : list, (i & 2) != 0 ? ctaAppModel.position : str, (i & 4) != 0 ? ctaAppModel.id : str2, (i & 8) != 0 ? ctaAppModel.required : bool, (i & 16) != 0 ? ctaAppModel.version : str3, (i & 32) != 0 ? ctaAppModel.value : str4, (i & 64) != 0 ? ctaAppModel.bottomMargin : f, (i & 128) != 0 ? ctaAppModel.leftMargin : f2, (i & 256) != 0 ? ctaAppModel.isHidden : bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> component1() {
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
    public final CtaAppModel copy(@NotNull List<? extends UIComponentAppModel> list, String str, @NotNull String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CtaAppModel(list, str, str2, bool, str3, str4, f, f2, bool2);
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
        if (!(obj instanceof CtaAppModel)) {
            return false;
        }
        CtaAppModel ctaAppModel = (CtaAppModel) obj;
        return Intrinsics.EZpvd(this.items, ctaAppModel.items) && Intrinsics.EZpvd((Object) this.position, (Object) ctaAppModel.position) && Intrinsics.EZpvd((Object) this.id, (Object) ctaAppModel.id) && Intrinsics.EZpvd(this.required, ctaAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) ctaAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) ctaAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, ctaAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, ctaAppModel.leftMargin) && Intrinsics.EZpvd(this.isHidden, ctaAppModel.isHidden);
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
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
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
        int iHashCode = this.items.hashCode();
        String str = this.position;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.id.hashCode();
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
    public final void setItems(@NotNull List<? extends UIComponentAppModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaAppModel(items=" + this.items + ", position=" + this.position + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<? extends UIComponentAppModel> list = this.items;
        parcel.writeInt(list.size());
        Iterator<? extends UIComponentAppModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.position);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaAppModel> serializer() {
            return CtaAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CtaAppModel(int i, List list, String str, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, CtaAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.position = null;
        } else {
            this.position = str;
        }
        this.id = str2;
        if ((i & 8) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        if ((i & 16) == 0) {
            this.version = "";
        } else {
            this.version = str3;
        }
        if ((i & 32) == 0) {
            this.value = "";
        } else {
            this.value = str4;
        }
        if ((i & 64) == 0) {
            this.bottomMargin = null;
        } else {
            this.bottomMargin = f;
        }
        if ((i & 128) == 0) {
            this.leftMargin = null;
        } else {
            this.leftMargin = f2;
        }
        if ((i & 256) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaAppModel ctaAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(ctaAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], ctaAppModel.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ctaAppModel.position != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ctaAppModel.position);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, ctaAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(ctaAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, ctaAppModel.getRequired());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) ctaAppModel.getVersion(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, ctaAppModel.getVersion());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) ctaAppModel.getValue(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, ctaAppModel.getValue());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || ctaAppModel.getBottomMargin() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, FloatSerializer.INSTANCE, ctaAppModel.getBottomMargin());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || ctaAppModel.getLeftMargin() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, FloatSerializer.INSTANCE, ctaAppModel.getLeftMargin());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(ctaAppModel.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, ctaAppModel.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (r14v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (r16v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0026: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r20v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x002e: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r21v0 java.lang.Float))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
 A[MD:(java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:1133) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ CtaAppModel(List list, String str, String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : f2, (i & 256) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CtaAppModel(@NotNull List<? extends UIComponentAppModel> list, String str, @NotNull String str2, Boolean bool, String str3, String str4, Float f, Float f2, Boolean bool2) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.items = list;
        this.position = str;
        this.id = str2;
        this.required = bool;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public CtaAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }
}
