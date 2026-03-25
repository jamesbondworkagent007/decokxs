package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleTeeStatus implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SingleTeeStatus> CREATOR = new Creator();
    private final String accountId;
    private final AddressVerifyStatus addressVerifyStatus;
    private final Boolean canUseSa2;
    private final ArrayList<Long> chainIndexList;
    private final SingleEip7702Status eip7702Status;
    private String teeId;
    private final TeeStatus teeStatus;

    public static final class Creator implements Parcelable.Creator<SingleTeeStatus> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleTeeStatus createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            TeeStatus teeStatusCreateFromParcel = TeeStatus.CREATOR.createFromParcel(parcel);
            AddressVerifyStatus addressVerifyStatusCreateFromParcel = parcel.readInt() == 0 ? null : AddressVerifyStatus.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            return new SingleTeeStatus(string, string2, teeStatusCreateFromParcel, addressVerifyStatusCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : SingleEip7702Status.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleTeeStatus[] newArray(int i) {
            return new SingleTeeStatus[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.biz.net.bean.SingleTeeStatus */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleTeeStatus copy$default(SingleTeeStatus singleTeeStatus, String str, String str2, TeeStatus teeStatus, AddressVerifyStatus addressVerifyStatus, ArrayList arrayList, SingleEip7702Status singleEip7702Status, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleTeeStatus.accountId;
        }
        if ((i & 2) != 0) {
            str2 = singleTeeStatus.teeId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            teeStatus = singleTeeStatus.teeStatus;
        }
        TeeStatus teeStatus2 = teeStatus;
        if ((i & 8) != 0) {
            addressVerifyStatus = singleTeeStatus.addressVerifyStatus;
        }
        AddressVerifyStatus addressVerifyStatus2 = addressVerifyStatus;
        if ((i & 16) != 0) {
            arrayList = singleTeeStatus.chainIndexList;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 32) != 0) {
            singleEip7702Status = singleTeeStatus.eip7702Status;
        }
        SingleEip7702Status singleEip7702Status2 = singleEip7702Status;
        if ((i & 64) != 0) {
            bool = singleTeeStatus.canUseSa2;
        }
        return singleTeeStatus.copy(str, str3, teeStatus2, addressVerifyStatus2, arrayList2, singleEip7702Status2, bool);
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
    public final ArrayList<Long> component5() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleEip7702Status component6() {
        return this.eip7702Status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleTeeStatus copy(@NotNull String str, @NotNull String str2, @NotNull TeeStatus teeStatus, AddressVerifyStatus addressVerifyStatus, ArrayList<Long> arrayList, SingleEip7702Status singleEip7702Status, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(teeStatus, "");
        return new SingleTeeStatus(str, str2, teeStatus, addressVerifyStatus, arrayList, singleEip7702Status, bool);
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
        if (!(obj instanceof SingleTeeStatus)) {
            return false;
        }
        SingleTeeStatus singleTeeStatus = (SingleTeeStatus) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) singleTeeStatus.accountId) && Intrinsics.EZpvd((Object) this.teeId, (Object) singleTeeStatus.teeId) && Intrinsics.EZpvd(this.teeStatus, singleTeeStatus.teeStatus) && Intrinsics.EZpvd(this.addressVerifyStatus, singleTeeStatus.addressVerifyStatus) && Intrinsics.EZpvd(this.chainIndexList, singleTeeStatus.chainIndexList) && Intrinsics.EZpvd(this.eip7702Status, singleTeeStatus.eip7702Status) && Intrinsics.EZpvd(this.canUseSa2, singleTeeStatus.canUseSa2);
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
    public final Boolean getCanUseSa2() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> getChainIndexList() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleEip7702Status getEip7702Status() {
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
        int iHashCode2 = this.teeId.hashCode();
        int iHashCode3 = this.teeStatus.hashCode();
        AddressVerifyStatus addressVerifyStatus = this.addressVerifyStatus;
        int iHashCode4 = addressVerifyStatus == null ? 0 : addressVerifyStatus.hashCode();
        ArrayList<Long> arrayList = this.chainIndexList;
        int iHashCode5 = arrayList == null ? 0 : arrayList.hashCode();
        SingleEip7702Status singleEip7702Status = this.eip7702Status;
        int iHashCode6 = singleEip7702Status == null ? 0 : singleEip7702Status.hashCode();
        Boolean bool = this.canUseSa2;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTeeId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.teeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleTeeStatus(accountId=" + this.accountId + ", teeId=" + this.teeId + ", teeStatus=" + this.teeStatus + ", addressVerifyStatus=" + this.addressVerifyStatus + ", chainIndexList=" + this.chainIndexList + ", eip7702Status=" + this.eip7702Status + ", canUseSa2=" + this.canUseSa2 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.teeId);
        this.teeStatus.writeToParcel(parcel, i);
        AddressVerifyStatus addressVerifyStatus = this.addressVerifyStatus;
        if (addressVerifyStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressVerifyStatus.writeToParcel(parcel, i);
        }
        ArrayList<Long> arrayList = this.chainIndexList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Long> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
        }
        SingleEip7702Status singleEip7702Status = this.eip7702Status;
        if (singleEip7702Status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            singleEip7702Status.writeToParcel(parcel, i);
        }
        Boolean bool = this.canUseSa2;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public SingleTeeStatus(@NotNull String str, @NotNull String str2, @NotNull TeeStatus teeStatus, AddressVerifyStatus addressVerifyStatus, ArrayList<Long> arrayList, SingleEip7702Status singleEip7702Status, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(teeStatus, "");
        this.accountId = str;
        this.teeId = str2;
        this.teeStatus = teeStatus;
        this.addressVerifyStatus = addressVerifyStatus;
        this.chainIndexList = arrayList;
        this.eip7702Status = singleEip7702Status;
        this.canUseSa2 = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 com.okinc.business.defi.biz.net.bean.TeeStatus)
  (r13v0 com.okinc.business.defi.biz.net.bean.AddressVerifyStatus)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0009: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:94) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r14v0 java.util.ArrayList))
  (wrap:com.okinc.business.defi.biz.net.bean.SingleEip7702Status:?: TERNARY null = ((wrap:int:0x000c: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.SingleEip7702Status) : (r15v0 com.okinc.business.defi.biz.net.bean.SingleEip7702Status))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.TeeStatus, com.okinc.business.defi.biz.net.bean.AddressVerifyStatus, java.util.ArrayList<java.lang.Long>, com.okinc.business.defi.biz.net.bean.SingleEip7702Status, java.lang.Boolean):void (m)] (LINE:89) call: com.okinc.business.defi.biz.net.bean.SingleTeeStatus.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.TeeStatus, com.okinc.business.defi.biz.net.bean.AddressVerifyStatus, java.util.ArrayList, com.okinc.business.defi.biz.net.bean.SingleEip7702Status, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SingleTeeStatus(String str, String str2, TeeStatus teeStatus, AddressVerifyStatus addressVerifyStatus, ArrayList arrayList, SingleEip7702Status singleEip7702Status, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, teeStatus, addressVerifyStatus, (i & 16) != 0 ? new ArrayList() : arrayList, (i & 32) != 0 ? null : singleEip7702Status, (i & 64) != 0 ? null : bool);
    }
}
