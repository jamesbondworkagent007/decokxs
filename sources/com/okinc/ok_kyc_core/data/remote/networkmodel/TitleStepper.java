package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TitleStepper implements Parcelable {
    public static final int $stable = 0;
    private final Integer currentStep;
    private final String instructionText;
    private final String title;
    private final Integer totalSteps;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TitleStepper> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TitleStepper> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TitleStepper createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TitleStepper(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TitleStepper[] newArray(int i) {
            return new TitleStepper[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TitleStepper copy$default(TitleStepper titleStepper, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = titleStepper.title;
        }
        if ((i & 2) != 0) {
            str2 = titleStepper.instructionText;
        }
        if ((i & 4) != 0) {
            num = titleStepper.currentStep;
        }
        if ((i & 8) != 0) {
            num2 = titleStepper.totalSteps;
        }
        return titleStepper.copy(str, str2, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instructionText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.currentStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.totalSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TitleStepper copy(String str, String str2, Integer num, Integer num2) {
        return new TitleStepper(str, str2, num, num2);
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
        if (!(obj instanceof TitleStepper)) {
            return false;
        }
        TitleStepper titleStepper = (TitleStepper) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) titleStepper.title) && Intrinsics.EZpvd((Object) this.instructionText, (Object) titleStepper.instructionText) && Intrinsics.EZpvd(this.currentStep, titleStepper.currentStep) && Intrinsics.EZpvd(this.totalSteps, titleStepper.totalSteps);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrentStep() {
        return this.currentStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstructionText() {
        return this.instructionText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotalSteps() {
        return this.totalSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instructionText;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.currentStep;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.totalSteps;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TitleStepper(title=" + this.title + ", instructionText=" + this.instructionText + ", currentStep=" + this.currentStep + ", totalSteps=" + this.totalSteps + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.instructionText);
        Integer num = this.currentStep;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.totalSteps;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TitleStepper> serializer() {
            return TitleStepper$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TitleStepper(int i, String str, String str2, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i, 12, TitleStepper$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.instructionText = "";
        } else {
            this.instructionText = str2;
        }
        this.currentStep = num;
        this.totalSteps = num2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(TitleStepper titleStepper, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) titleStepper.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, titleStepper.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) titleStepper.instructionText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, titleStepper.instructionText);
        }
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, intSerializer, titleStepper.currentStep);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, intSerializer, titleStepper.totalSteps);
    }

    public TitleStepper(String str, String str2, Integer num, Integer num2) {
        this.title = str;
        this.instructionText = str2;
        this.currentStep = num;
        this.totalSteps = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 java.lang.Integer)
  (r5v0 java.lang.Integer)
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:945) call: com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ TitleStepper(String str, String str2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, num, num2);
    }
}
