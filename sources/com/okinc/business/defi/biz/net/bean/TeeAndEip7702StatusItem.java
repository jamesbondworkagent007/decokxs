package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class TeeAndEip7702StatusItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TeeAndEip7702StatusItem> CREATOR = new Creator();
    private final String accountId;
    private final AddressVerifyStatus addressVerifyStatus;
    private final boolean canUseSa2;
    private final Eip7702Status eip7702Status;
    private final String teeId;
    private final TeeStatus teeStatus;

    public static final class Creator implements Parcelable.Creator<TeeAndEip7702StatusItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAndEip7702StatusItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TeeAndEip7702StatusItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TeeStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AddressVerifyStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Eip7702Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAndEip7702StatusItem[] newArray(int i) {
            return new TeeAndEip7702StatusItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeAndEip7702StatusItem copy$default(TeeAndEip7702StatusItem teeAndEip7702StatusItem, String str, String str2, TeeStatus teeStatus, AddressVerifyStatus addressVerifyStatus, Eip7702Status eip7702Status, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teeAndEip7702StatusItem.accountId;
        }
        if ((i & 2) != 0) {
            str2 = teeAndEip7702StatusItem.teeId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            teeStatus = teeAndEip7702StatusItem.teeStatus;
        }
        TeeStatus teeStatus2 = teeStatus;
        if ((i & 8) != 0) {
            addressVerifyStatus = teeAndEip7702StatusItem.addressVerifyStatus;
        }
        AddressVerifyStatus addressVerifyStatus2 = addressVerifyStatus;
        if ((i & 16) != 0) {
            eip7702Status = teeAndEip7702StatusItem.eip7702Status;
        }
        Eip7702Status eip7702Status2 = eip7702Status;
        if ((i & 32) != 0) {
            z = teeAndEip7702StatusItem.canUseSa2;
        }
        return teeAndEip7702StatusItem.copy(str, str3, teeStatus2, addressVerifyStatus2, eip7702Status2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeStatus component3() {
        return this.teeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressVerifyStatus component4() {
        return this.addressVerifyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Eip7702Status component5() {
        return this.eip7702Status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeAndEip7702StatusItem copy(@NotNull String str, String str2, TeeStatus teeStatus, AddressVerifyStatus addressVerifyStatus, Eip7702Status eip7702Status, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TeeAndEip7702StatusItem(str, str2, teeStatus, addressVerifyStatus, eip7702Status, z);
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
        if (!(obj instanceof TeeAndEip7702StatusItem)) {
            return false;
        }
        TeeAndEip7702StatusItem teeAndEip7702StatusItem = (TeeAndEip7702StatusItem) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) teeAndEip7702StatusItem.accountId) && Intrinsics.EZpvd((Object) this.teeId, (Object) teeAndEip7702StatusItem.teeId) && Intrinsics.EZpvd(this.teeStatus, teeAndEip7702StatusItem.teeStatus) && Intrinsics.EZpvd(this.addressVerifyStatus, teeAndEip7702StatusItem.addressVerifyStatus) && Intrinsics.EZpvd(this.eip7702Status, teeAndEip7702StatusItem.eip7702Status) && this.canUseSa2 == teeAndEip7702StatusItem.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressVerifyStatus getAddressVerifyStatus() {
        return this.addressVerifyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanUseSa2() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Eip7702Status getEip7702Status() {
        return this.eip7702Status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeStatus getTeeStatus() {
        return this.teeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        String str = this.teeId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        TeeStatus teeStatus = this.teeStatus;
        int iHashCode3 = teeStatus == null ? 0 : teeStatus.hashCode();
        AddressVerifyStatus addressVerifyStatus = this.addressVerifyStatus;
        int iHashCode4 = addressVerifyStatus == null ? 0 : addressVerifyStatus.hashCode();
        Eip7702Status eip7702Status = this.eip7702Status;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (eip7702Status != null ? eip7702Status.hashCode() : 0)) * 31) + Boolean.hashCode(this.canUseSa2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeAndEip7702StatusItem(accountId=" + this.accountId + ", teeId=" + this.teeId + ", teeStatus=" + this.teeStatus + ", addressVerifyStatus=" + this.addressVerifyStatus + ", eip7702Status=" + this.eip7702Status + ", canUseSa2=" + this.canUseSa2 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.teeId);
        TeeStatus teeStatus = this.teeStatus;
        if (teeStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            teeStatus.writeToParcel(parcel, i);
        }
        AddressVerifyStatus addressVerifyStatus = this.addressVerifyStatus;
        if (addressVerifyStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressVerifyStatus.writeToParcel(parcel, i);
        }
        Eip7702Status eip7702Status = this.eip7702Status;
        if (eip7702Status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eip7702Status.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canUseSa2 ? 1 : 0);
    }

    public TeeAndEip7702StatusItem(@NotNull String str, String str2, TeeStatus teeStatus, AddressVerifyStatus addressVerifyStatus, Eip7702Status eip7702Status, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.teeId = str2;
        this.teeStatus = teeStatus;
        this.addressVerifyStatus = addressVerifyStatus;
        this.eip7702Status = eip7702Status;
        this.canUseSa2 = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.net.bean.TeeStatus:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.TeeStatus) : (r10v0 com.okinc.business.defi.biz.net.bean.TeeStatus))
  (wrap:com.okinc.business.defi.biz.net.bean.AddressVerifyStatus:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.AddressVerifyStatus) : (r11v0 com.okinc.business.defi.biz.net.bean.AddressVerifyStatus))
  (wrap:com.okinc.business.defi.biz.net.bean.Eip7702Status:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.Eip7702Status) : (r12v0 com.okinc.business.defi.biz.net.bean.Eip7702Status))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.TeeStatus, com.okinc.business.defi.biz.net.bean.AddressVerifyStatus, com.okinc.business.defi.biz.net.bean.Eip7702Status, boolean):void (m)] (LINE:30) call: com.okinc.business.defi.biz.net.bean.TeeAndEip7702StatusItem.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.TeeStatus, com.okinc.business.defi.biz.net.bean.AddressVerifyStatus, com.okinc.business.defi.biz.net.bean.Eip7702Status, boolean):void type: THIS */
    public /* synthetic */ TeeAndEip7702StatusItem(String str, String str2, TeeStatus teeStatus, AddressVerifyStatus addressVerifyStatus, Eip7702Status eip7702Status, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : teeStatus, (i & 8) != 0 ? null : addressVerifyStatus, (i & 16) != 0 ? null : eip7702Status, (i & 32) != 0 ? false : z);
    }
}
