package com.okinc.auth.impl.facerecognition.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class FaceRecognitionResultResponse implements Parcelable {
    public static final int $stable = 0;
    public final Integer existingTicketCreatedTime;
    public final String nextStep;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FaceRecognitionResultResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<FaceRecognitionResultResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaceRecognitionResultResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FaceRecognitionResultResponse(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaceRecognitionResultResponse[] newArray(int i) {
            return new FaceRecognitionResultResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FaceRecognitionResultResponse() {
        this((String) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceRecognitionResultResponse copy$default(FaceRecognitionResultResponse faceRecognitionResultResponse, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceRecognitionResultResponse.nextStep;
        }
        if ((i & 2) != 0) {
            num = faceRecognitionResultResponse.existingTicketCreatedTime;
        }
        return faceRecognitionResultResponse.copydefault(str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceRecognitionResultResponse copydefault(@NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FaceRecognitionResultResponse(str, num);
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
        if (!(obj instanceof FaceRecognitionResultResponse)) {
            return false;
        }
        FaceRecognitionResultResponse faceRecognitionResultResponse = (FaceRecognitionResultResponse) obj;
        return Intrinsics.EZpvd((Object) this.nextStep, (Object) faceRecognitionResultResponse.nextStep) && Intrinsics.EZpvd(this.existingTicketCreatedTime, faceRecognitionResultResponse.existingTicketCreatedTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.nextStep.hashCode();
        Integer num = this.existingTicketCreatedTime;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceRecognitionResultResponse(nextStep=" + this.nextStep + ", existingTicketCreatedTime=" + this.existingTicketCreatedTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nextStep);
        Integer num = this.existingTicketCreatedTime;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.facerecognition.model.FaceRecognitionResultResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FaceRecognitionResultResponse> serializer() {
            return FaceRecognitionResultResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FaceRecognitionResultResponse(int i, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.nextStep = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.existingTicketCreatedTime = null;
        } else {
            this.existingTicketCreatedTime = num;
        }
    }

    public static final /* synthetic */ void KWHzl(FaceRecognitionResultResponse faceRecognitionResultResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) faceRecognitionResultResponse.nextStep, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, faceRecognitionResultResponse.nextStep);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && faceRecognitionResultResponse.existingTicketCreatedTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, faceRecognitionResultResponse.existingTicketCreatedTime);
    }

    public FaceRecognitionResultResponse(@NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nextStep = str;
        this.existingTicketCreatedTime = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer):void (m)] (LINE:48) call: com.okinc.auth.impl.facerecognition.model.FaceRecognitionResultResponse.<init>(java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ FaceRecognitionResultResponse(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num);
    }
}
