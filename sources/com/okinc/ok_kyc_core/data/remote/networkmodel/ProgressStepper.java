package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("progress-stepper")
@Serializable
public final class ProgressStepper extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final int currentStep;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final List<String> titles;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProgressStepper> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<ProgressStepper> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProgressStepper createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
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
            return new ProgressStepper(i, arrayListCreateStringArrayList, boolValueOf, string, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProgressStepper[] newArray(int i) {
            return new ProgressStepper[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currentStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.titles;
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
    public final ProgressStepper copy(int i, @NotNull List<String> list, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ProgressStepper(i, list, bool, str, bool2, str2, str3, f, f2);
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
        if (!(obj instanceof ProgressStepper)) {
            return false;
        }
        ProgressStepper progressStepper = (ProgressStepper) obj;
        return this.currentStep == progressStepper.currentStep && Intrinsics.EZpvd(this.titles, progressStepper.titles) && Intrinsics.EZpvd(this.isHidden, progressStepper.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) progressStepper.id) && Intrinsics.EZpvd(this.required, progressStepper.required) && Intrinsics.EZpvd((Object) this.version, (Object) progressStepper.version) && Intrinsics.EZpvd((Object) this.value, (Object) progressStepper.value) && Intrinsics.EZpvd(this.bottomMargin, progressStepper.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, progressStepper.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentStep() {
        return this.currentStep;
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
    public final List<String> getTitles() {
        return this.titles;
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
        int iHashCode = Integer.hashCode(this.currentStep);
        int iHashCode2 = this.titles.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str = this.id;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Boolean bool2 = this.required;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.version;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode8 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "ProgressStepper(currentStep=" + this.currentStep + ", titles=" + this.titles + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.currentStep);
        parcel.writeStringList(this.titles);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ProgressStepper.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProgressStepper> serializer() {
            return ProgressStepper$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProgressStepper(int i, int i2, List list, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (480 != (i & LivenessCoordinator.TARGET_WIDTH)) {
            PluginExceptionsKt.throwMissingFieldException(i, LivenessCoordinator.TARGET_WIDTH, ProgressStepper$$serializer.INSTANCE.getDescriptor());
        }
        this.currentStep = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.titles = yDY.AhwBna();
        } else {
            this.titles = list;
        }
        if ((i & 4) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool;
        }
        if ((i & 8) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
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

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ProgressStepper progressStepper, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(progressStepper, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || progressStepper.currentStep != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, progressStepper.currentStep);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(progressStepper.titles, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], progressStepper.titles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(progressStepper.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, progressStepper.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) progressStepper.getId(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, progressStepper.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(progressStepper.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, progressStepper.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, progressStepper.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, progressStepper.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, progressStepper.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, progressStepper.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r12v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1325)) : (r13v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.Float)
  (r20v0 java.lang.Float)
 A[MD:(int, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:1323) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ProgressStepper.<init>(int, java.util.List, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ ProgressStepper(int i, List list, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? Boolean.FALSE : bool, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? Boolean.FALSE : bool2, str2, str3, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressStepper(int i, @NotNull List<String> list, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        this.currentStep = i;
        this.titles = list;
        this.isHidden = bool;
        this.id = str;
        this.required = bool2;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public ProgressStepperAppModel toAppModel() {
        int i = this.currentStep;
        List<String> list = this.titles;
        Boolean boolIsHidden = isHidden();
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new ProgressStepperAppModel(i, list, boolIsHidden, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
