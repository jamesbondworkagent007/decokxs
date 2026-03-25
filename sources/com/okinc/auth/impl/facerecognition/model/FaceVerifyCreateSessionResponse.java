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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class FaceVerifyCreateSessionResponse implements Parcelable {
    public static final int $stable = 0;
    public final Integer limitedTime;
    public final Integer remainChances;
    public final String sessionId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FaceVerifyCreateSessionResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<FaceVerifyCreateSessionResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaceVerifyCreateSessionResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FaceVerifyCreateSessionResponse(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaceVerifyCreateSessionResponse[] newArray(int i) {
            return new FaceVerifyCreateSessionResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FaceVerifyCreateSessionResponse() {
        this((String) null, (Integer) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceVerifyCreateSessionResponse copy$default(FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceVerifyCreateSessionResponse.sessionId;
        }
        if ((i & 2) != 0) {
            num = faceVerifyCreateSessionResponse.remainChances;
        }
        if ((i & 4) != 0) {
            num2 = faceVerifyCreateSessionResponse.limitedTime;
        }
        return faceVerifyCreateSessionResponse.AEQbTJ(str, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceVerifyCreateSessionResponse AEQbTJ(String str, Integer num, Integer num2) {
        return new FaceVerifyCreateSessionResponse(str, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.limitedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer EZpvd() {
        return this.remainChances;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.sessionId;
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
        if (!(obj instanceof FaceVerifyCreateSessionResponse)) {
            return false;
        }
        FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse = (FaceVerifyCreateSessionResponse) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) faceVerifyCreateSessionResponse.sessionId) && Intrinsics.EZpvd(this.remainChances, faceVerifyCreateSessionResponse.remainChances) && Intrinsics.EZpvd(this.limitedTime, faceVerifyCreateSessionResponse.limitedTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sessionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.remainChances;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.limitedTime;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceVerifyCreateSessionResponse(sessionId=" + this.sessionId + ", remainChances=" + this.remainChances + ", limitedTime=" + this.limitedTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sessionId);
        Integer num = this.remainChances;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.limitedTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FaceVerifyCreateSessionResponse> serializer() {
            return FaceVerifyCreateSessionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FaceVerifyCreateSessionResponse(int i, String str, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str;
        }
        if ((i & 2) == 0) {
            this.remainChances = null;
        } else {
            this.remainChances = num;
        }
        if ((i & 4) == 0) {
            this.limitedTime = null;
        } else {
            this.limitedTime = num2;
        }
    }

    public static final /* synthetic */ void OLrzqt(FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || faceVerifyCreateSessionResponse.sessionId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, faceVerifyCreateSessionResponse.sessionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || faceVerifyCreateSessionResponse.remainChances != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, faceVerifyCreateSessionResponse.remainChances);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && faceVerifyCreateSessionResponse.limitedTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, faceVerifyCreateSessionResponse.limitedTime);
    }

    public FaceVerifyCreateSessionResponse(String str, Integer num, Integer num2) {
        this.sessionId = str;
        this.remainChances = num;
        this.limitedTime = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:10) call: com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse.<init>(java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ FaceVerifyCreateSessionResponse(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
