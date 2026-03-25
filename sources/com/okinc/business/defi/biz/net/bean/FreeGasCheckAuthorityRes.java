package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class FreeGasCheckAuthorityRes implements Parcelable {
    private Integer availableTimes;
    private Integer errorCode;
    private String errorMsg;
    private Integer totalTimes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FreeGasCheckAuthorityRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FreeGasCheckAuthorityRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeGasCheckAuthorityRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FreeGasCheckAuthorityRes(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeGasCheckAuthorityRes[] newArray(int i) {
            return new FreeGasCheckAuthorityRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FreeGasCheckAuthorityRes() {
        this((Integer) null, (Integer) null, (Integer) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FreeGasCheckAuthorityRes copy$default(FreeGasCheckAuthorityRes freeGasCheckAuthorityRes, Integer num, Integer num2, Integer num3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = freeGasCheckAuthorityRes.totalTimes;
        }
        if ((i & 2) != 0) {
            num2 = freeGasCheckAuthorityRes.availableTimes;
        }
        if ((i & 4) != 0) {
            num3 = freeGasCheckAuthorityRes.errorCode;
        }
        if ((i & 8) != 0) {
            str = freeGasCheckAuthorityRes.errorMsg;
        }
        return freeGasCheckAuthorityRes.copy(num, num2, num3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.totalTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.availableTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeGasCheckAuthorityRes copy(Integer num, Integer num2, Integer num3, String str) {
        return new FreeGasCheckAuthorityRes(num, num2, num3, str);
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
        if (!(obj instanceof FreeGasCheckAuthorityRes)) {
            return false;
        }
        FreeGasCheckAuthorityRes freeGasCheckAuthorityRes = (FreeGasCheckAuthorityRes) obj;
        return Intrinsics.EZpvd(this.totalTimes, freeGasCheckAuthorityRes.totalTimes) && Intrinsics.EZpvd(this.availableTimes, freeGasCheckAuthorityRes.availableTimes) && Intrinsics.EZpvd(this.errorCode, freeGasCheckAuthorityRes.errorCode) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) freeGasCheckAuthorityRes.errorMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAvailableTimes() {
        return this.availableTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotalTimes() {
        return this.totalTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.totalTimes;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.availableTimes;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.errorCode;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        String str = this.errorMsg;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableTimes(Integer num) {
        this.availableTimes = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalTimes(Integer num) {
        this.totalTimes = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FreeGasCheckAuthorityRes(totalTimes=" + this.totalTimes + ", availableTimes=" + this.availableTimes + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.totalTimes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.availableTimes;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.errorCode;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.errorMsg);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.FreeGasCheckAuthorityRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FreeGasCheckAuthorityRes> serializer() {
            return FreeGasCheckAuthorityRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FreeGasCheckAuthorityRes(int i, Integer num, Integer num2, Integer num3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalTimes = null;
        } else {
            this.totalTimes = num;
        }
        if ((i & 2) == 0) {
            this.availableTimes = null;
        } else {
            this.availableTimes = num2;
        }
        if ((i & 4) == 0) {
            this.errorCode = -1;
        } else {
            this.errorCode = num3;
        }
        if ((i & 8) == 0) {
            this.errorMsg = "";
        } else {
            this.errorMsg = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(FreeGasCheckAuthorityRes freeGasCheckAuthorityRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || freeGasCheckAuthorityRes.totalTimes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, freeGasCheckAuthorityRes.totalTimes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || freeGasCheckAuthorityRes.availableTimes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, freeGasCheckAuthorityRes.availableTimes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num = freeGasCheckAuthorityRes.errorCode) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, freeGasCheckAuthorityRes.errorCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) freeGasCheckAuthorityRes.errorMsg, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, freeGasCheckAuthorityRes.errorMsg);
    }

    public FreeGasCheckAuthorityRes(Integer num, Integer num2, Integer num3, String str) {
        this.totalTimes = num;
        this.availableTimes = num2;
        this.errorCode = num3;
        this.errorMsg = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:419) call: com.okinc.business.defi.biz.net.bean.FreeGasCheckAuthorityRes.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ FreeGasCheckAuthorityRes(Integer num, Integer num2, Integer num3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? -1 : num3, (i & 8) != 0 ? "" : str);
    }
}
