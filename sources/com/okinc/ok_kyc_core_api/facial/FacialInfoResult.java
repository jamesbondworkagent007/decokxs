package com.okinc.ok_kyc_core_api.facial;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class FacialInfoResult implements Parcelable {
    private int code;
    private boolean isSuccess;
    private String msg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FacialInfoResult> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<FacialInfoResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FacialInfoResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FacialInfoResult(parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FacialInfoResult[] newArray(int i) {
            return new FacialInfoResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FacialInfoResult() {
        this(false, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FacialInfoResult copy$default(FacialInfoResult facialInfoResult, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = facialInfoResult.isSuccess;
        }
        if ((i2 & 2) != 0) {
            i = facialInfoResult.code;
        }
        if ((i2 & 4) != 0) {
            str = facialInfoResult.msg;
        }
        return facialInfoResult.copy(z, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacialInfoResult copy(boolean z, int i, String str) {
        return new FacialInfoResult(z, i, str);
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
        if (!(obj instanceof FacialInfoResult)) {
            return false;
        }
        FacialInfoResult facialInfoResult = (FacialInfoResult) obj;
        return this.isSuccess == facialInfoResult.isSuccess && this.code == facialInfoResult.code && Intrinsics.EZpvd((Object) this.msg, (Object) facialInfoResult.msg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSuccess);
        int iHashCode2 = Integer.hashCode(this.code);
        String str = this.msg;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(int i) {
        this.code = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(String str) {
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FacialInfoResult(isSuccess=" + this.isSuccess + ", code=" + this.code + ", msg=" + this.msg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isSuccess ? 1 : 0);
        parcel.writeInt(this.code);
        parcel.writeString(this.msg);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core_api.facial.FacialInfoResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FacialInfoResult> serializer() {
            return FacialInfoResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FacialInfoResult(int i, boolean z, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.isSuccess = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.code = -1;
        } else {
            this.code = i2;
        }
        if ((i & 4) == 0) {
            this.msg = "";
        } else {
            this.msg = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(FacialInfoResult facialInfoResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || facialInfoResult.isSuccess) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, facialInfoResult.isSuccess);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || facialInfoResult.code != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, facialInfoResult.code);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) facialInfoResult.msg, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, facialInfoResult.msg);
    }

    public FacialInfoResult(boolean z, int i, String str) {
        this.isSuccess = z;
        this.code = i;
        this.msg = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(boolean, int, java.lang.String):void (m)] (LINE:12) call: com.okinc.ok_kyc_core_api.facial.FacialInfoResult.<init>(boolean, int, java.lang.String):void type: THIS */
    public /* synthetic */ FacialInfoResult(boolean z, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str);
    }
}
