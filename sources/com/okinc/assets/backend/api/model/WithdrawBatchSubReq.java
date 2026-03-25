package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawBatchSubReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawBatchSubReq> CREATOR = new Creator();
    private String address;
    private Integer areaCode;
    private Integer internalAddressType;
    private String tag;
    private String title;

    public static final class Creator implements Parcelable.Creator<WithdrawBatchSubReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawBatchSubReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WithdrawBatchSubReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawBatchSubReq[] newArray(int i) {
            return new WithdrawBatchSubReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawBatchSubReq() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawBatchSubReq copy$default(WithdrawBatchSubReq withdrawBatchSubReq, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawBatchSubReq.address;
        }
        if ((i & 2) != 0) {
            str2 = withdrawBatchSubReq.tag;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = withdrawBatchSubReq.title;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            num = withdrawBatchSubReq.areaCode;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = withdrawBatchSubReq.internalAddressType;
        }
        return withdrawBatchSubReq.copy(str, str4, str5, num3, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawBatchSubReq copy(String str, String str2, String str3, Integer num, Integer num2) {
        return new WithdrawBatchSubReq(str, str2, str3, num, num2);
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
        if (!(obj instanceof WithdrawBatchSubReq)) {
            return false;
        }
        WithdrawBatchSubReq withdrawBatchSubReq = (WithdrawBatchSubReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) withdrawBatchSubReq.address) && Intrinsics.EZpvd((Object) this.tag, (Object) withdrawBatchSubReq.tag) && Intrinsics.EZpvd((Object) this.title, (Object) withdrawBatchSubReq.title) && Intrinsics.EZpvd(this.areaCode, withdrawBatchSubReq.areaCode) && Intrinsics.EZpvd(this.internalAddressType, withdrawBatchSubReq.internalAddressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInternalAddressType() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tag;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.areaCode;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.internalAddressType;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAreaCode(Integer num) {
        this.areaCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInternalAddressType(Integer num) {
        this.internalAddressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawBatchSubReq(address=" + this.address + ", tag=" + this.tag + ", title=" + this.title + ", areaCode=" + this.areaCode + ", internalAddressType=" + this.internalAddressType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.tag);
        parcel.writeString(this.title);
        Integer num = this.areaCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.internalAddressType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public WithdrawBatchSubReq(String str, String str2, String str3, Integer num, Integer num2) {
        this.address = str;
        this.tag = str2;
        this.title = str3;
        this.areaCode = num;
        this.internalAddressType = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.WithdrawBatchSubReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ WithdrawBatchSubReq(String str, String str2, String str3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
