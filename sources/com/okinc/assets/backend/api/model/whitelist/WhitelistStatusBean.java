package com.okinc.assets.backend.api.model.whitelist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WhitelistStatusBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WhitelistStatusBean> CREATOR = new Creator();
    private Boolean googleVerification;
    private Integer newAddressWithdrawalLock;
    private Boolean phoneVerification;
    private Integer whiteStatus;

    public static final class Creator implements Parcelable.Creator<WhitelistStatusBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhitelistStatusBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WhitelistStatusBean(numValueOf, boolValueOf, boolValueOf2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhitelistStatusBean[] newArray(int i) {
            return new WhitelistStatusBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WhitelistStatusBean() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WhitelistStatusBean copy$default(WhitelistStatusBean whitelistStatusBean, Integer num, Boolean bool, Boolean bool2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = whitelistStatusBean.whiteStatus;
        }
        if ((i & 2) != 0) {
            bool = whitelistStatusBean.phoneVerification;
        }
        if ((i & 4) != 0) {
            bool2 = whitelistStatusBean.googleVerification;
        }
        if ((i & 8) != 0) {
            num2 = whitelistStatusBean.newAddressWithdrawalLock;
        }
        return whitelistStatusBean.copy(num, bool, bool2, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.whiteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WhitelistStatusBean copy(Integer num, Boolean bool, Boolean bool2, Integer num2) {
        return new WhitelistStatusBean(num, bool, bool2, num2);
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
        if (!(obj instanceof WhitelistStatusBean)) {
            return false;
        }
        WhitelistStatusBean whitelistStatusBean = (WhitelistStatusBean) obj;
        return Intrinsics.EZpvd(this.whiteStatus, whitelistStatusBean.whiteStatus) && Intrinsics.EZpvd(this.phoneVerification, whitelistStatusBean.phoneVerification) && Intrinsics.EZpvd(this.googleVerification, whitelistStatusBean.googleVerification) && Intrinsics.EZpvd(this.newAddressWithdrawalLock, whitelistStatusBean.newAddressWithdrawalLock);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getGoogleVerification() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNewAddressWithdrawalLock() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPhoneVerification() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWhiteStatus() {
        return this.whiteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.whiteStatus;
        int iHashCode = num == null ? 0 : num.hashCode();
        Boolean bool = this.phoneVerification;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.googleVerification;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Integer num2 = this.newAddressWithdrawalLock;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGoogleVerification(Boolean bool) {
        this.googleVerification = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewAddressWithdrawalLock(Integer num) {
        this.newAddressWithdrawalLock = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhoneVerification(Boolean bool) {
        this.phoneVerification = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWhiteStatus(Integer num) {
        this.whiteStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WhitelistStatusBean(whiteStatus=" + this.whiteStatus + ", phoneVerification=" + this.phoneVerification + ", googleVerification=" + this.googleVerification + ", newAddressWithdrawalLock=" + this.newAddressWithdrawalLock + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.whiteStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.phoneVerification;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.googleVerification;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.newAddressWithdrawalLock;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public WhitelistStatusBean(Integer num, Boolean bool, Boolean bool2, Integer num2) {
        this.whiteStatus = num;
        this.phoneVerification = bool;
        this.googleVerification = bool2;
        this.newAddressWithdrawalLock = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.whitelist.WhitelistStatusBean.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ WhitelistStatusBean(Integer num, Boolean bool, Boolean bool2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num2);
    }
}
