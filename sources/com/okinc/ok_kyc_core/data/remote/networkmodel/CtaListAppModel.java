package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.Iterator;
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
public final class CtaListAppModel extends UIComponentAppModel {
    private Float bottomMargin;
    private String id;
    private Boolean isHidden;
    private final boolean isValid;
    private final ArrayList<CtaListItem> items;
    private final Float leftMargin;
    private final Boolean required;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CtaListAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CtaListItem$$serializer.INSTANCE), null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<CtaListAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaListAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CtaListItem.CREATOR.createFromParcel(parcel));
            }
            return new CtaListAppModel(z, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaListAppModel[] newArray(int i) {
            return new CtaListAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CtaListAppModel copy$default(CtaListAppModel ctaListAppModel, boolean z, ArrayList arrayList, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, int i, Object obj) {
        return ctaListAppModel.copy((i & 1) != 0 ? ctaListAppModel.isValid : z, (i & 2) != 0 ? ctaListAppModel.items : arrayList, (i & 4) != 0 ? ctaListAppModel.isHidden : bool, (i & 8) != 0 ? ctaListAppModel.id : str, (i & 16) != 0 ? ctaListAppModel.required : bool2, (i & 32) != 0 ? ctaListAppModel.version : str2, (i & 64) != 0 ? ctaListAppModel.value : str3, (i & 128) != 0 ? ctaListAppModel.bottomMargin : f, (i & 256) != 0 ? ctaListAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CtaListItem> component2() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component8() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component9() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaListAppModel copy(boolean z, @NotNull ArrayList<CtaListItem> arrayList, Boolean bool, @NotNull String str, Boolean bool2, String str2, String str3, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CtaListAppModel(z, arrayList, bool, str, bool2, str2, str3, f, f2);
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
        if (!(obj instanceof CtaListAppModel)) {
            return false;
        }
        CtaListAppModel ctaListAppModel = (CtaListAppModel) obj;
        return this.isValid == ctaListAppModel.isValid && Intrinsics.EZpvd(this.items, ctaListAppModel.items) && Intrinsics.EZpvd(this.isHidden, ctaListAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) ctaListAppModel.id) && Intrinsics.EZpvd(this.required, ctaListAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) ctaListAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) ctaListAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, ctaListAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, ctaListAppModel.leftMargin);
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
    public final ArrayList<CtaListItem> getItems() {
        return this.items;
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
        int iHashCode = Boolean.hashCode(this.isValid);
        int iHashCode2 = this.items.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        int iHashCode4 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.version;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode8 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (f2 != null ? f2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isValid() {
        return this.isValid;
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
        return "CtaListAppModel(isValid=" + this.isValid + ", items=" + this.items + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isValid ? 1 : 0);
        ArrayList<CtaListItem> arrayList = this.items;
        parcel.writeInt(arrayList.size());
        Iterator<CtaListItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaListAppModel> serializer() {
            return CtaListAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CtaListAppModel(int i, boolean z, ArrayList arrayList, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (489 != (i & 489)) {
            PluginExceptionsKt.throwMissingFieldException(i, 489, CtaListAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.isValid = z;
        if ((i & 2) == 0) {
            this.items = new ArrayList<>();
        } else {
            this.items = arrayList;
        }
        if ((i & 4) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool;
        }
        this.id = str;
        if ((i & 16) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool2;
        }
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaListAppModel ctaListAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(ctaListAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, ctaListAppModel.isValid);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(ctaListAppModel.items, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], ctaListAppModel.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(ctaListAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, ctaListAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, ctaListAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(ctaListAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, ctaListAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, ctaListAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, ctaListAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, ctaListAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, ctaListAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r12v0 boolean)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0009: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:4453) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r13v0 java.util.ArrayList))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (r15v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.Float)
  (r20v0 java.lang.Float)
 A[MD:(boolean, java.util.ArrayList<com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListItem>, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:4451) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListAppModel.<init>(boolean, java.util.ArrayList, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ CtaListAppModel(boolean z, ArrayList arrayList, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? Boolean.FALSE : bool, str, (i & 16) != 0 ? Boolean.FALSE : bool2, str2, str3, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CtaListAppModel(boolean z, @NotNull ArrayList<CtaListItem> arrayList, Boolean bool, @NotNull String str, Boolean bool2, String str2, String str3, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.isValid = z;
        this.items = arrayList;
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
    public CtaListAppModel clone() {
        return copy$default(this, false, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }
}
