package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawAddressSubmitRes implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawAddressSubmitRes> CREATOR = new Creator();
    private String displayMessage;
    private Boolean evmCompatible;
    private long id;
    private Boolean isRBACApproval;
    private boolean newAddress;
    private int status;
    private List<SupportedEVM> supportedEvms;

    public static final class Creator implements Parcelable.Creator<WithdrawAddressSubmitRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddressSubmitRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(SupportedEVM.CREATOR.createFromParcel(parcel));
                }
            }
            return new WithdrawAddressSubmitRes(j, z, i, boolValueOf, boolValueOf2, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddressSubmitRes[] newArray(int i) {
            return new WithdrawAddressSubmitRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawAddressSubmitRes() {
        this(0L, false, 0, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.newAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isRBACApproval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.evmCompatible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedEVM> component6() {
        return this.supportedEvms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.displayMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawAddressSubmitRes copy(long j, boolean z, int i, Boolean bool, Boolean bool2, List<SupportedEVM> list, String str) {
        return new WithdrawAddressSubmitRes(j, z, i, bool, bool2, list, str);
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
        if (!(obj instanceof WithdrawAddressSubmitRes)) {
            return false;
        }
        WithdrawAddressSubmitRes withdrawAddressSubmitRes = (WithdrawAddressSubmitRes) obj;
        return this.id == withdrawAddressSubmitRes.id && this.newAddress == withdrawAddressSubmitRes.newAddress && this.status == withdrawAddressSubmitRes.status && Intrinsics.EZpvd(this.isRBACApproval, withdrawAddressSubmitRes.isRBACApproval) && Intrinsics.EZpvd(this.evmCompatible, withdrawAddressSubmitRes.evmCompatible) && Intrinsics.EZpvd(this.supportedEvms, withdrawAddressSubmitRes.supportedEvms) && Intrinsics.EZpvd((Object) this.displayMessage, (Object) withdrawAddressSubmitRes.displayMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEvmCompatible() {
        return this.evmCompatible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewAddress() {
        return this.newAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedEVM> getSupportedEvms() {
        return this.supportedEvms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = Boolean.hashCode(this.newAddress);
        int iHashCode3 = Integer.hashCode(this.status);
        Boolean bool = this.isRBACApproval;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.evmCompatible;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        List<SupportedEVM> list = this.supportedEvms;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str = this.displayMessage;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isRBACApproval() {
        return this.isRBACApproval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayMessage(String str) {
        this.displayMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEvmCompatible(Boolean bool) {
        this.evmCompatible = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewAddress(boolean z) {
        this.newAddress = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRBACApproval(Boolean bool) {
        this.isRBACApproval = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportedEvms(List<SupportedEVM> list) {
        this.supportedEvms = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawAddressSubmitRes(id=" + this.id + ", newAddress=" + this.newAddress + ", status=" + this.status + ", isRBACApproval=" + this.isRBACApproval + ", evmCompatible=" + this.evmCompatible + ", supportedEvms=" + this.supportedEvms + ", displayMessage=" + this.displayMessage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeInt(this.newAddress ? 1 : 0);
        parcel.writeInt(this.status);
        Boolean bool = this.isRBACApproval;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.evmCompatible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<SupportedEVM> list = this.supportedEvms;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SupportedEVM> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.displayMessage);
    }

    public WithdrawAddressSubmitRes(long j, boolean z, int i, Boolean bool, Boolean bool2, List<SupportedEVM> list, String str) {
        this.id = j;
        this.newAddress = z;
        this.status = i;
        this.isRBACApproval = bool;
        this.evmCompatible = bool2;
        this.supportedEvms = list;
        this.displayMessage = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003f: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r13v0 int) : (0 int))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0025: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(long, boolean, int, java.lang.Boolean, java.lang.Boolean, java.util.List<com.okinc.assets.backend.api.model.SupportedEVM>, java.lang.String):void (m)] (LINE:161) call: com.okinc.assets.backend.api.model.WithdrawAddressSubmitRes.<init>(long, boolean, int, java.lang.Boolean, java.lang.Boolean, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawAddressSubmitRes(long j, boolean z, int i, Boolean bool, Boolean bool2, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? false : z, (i2 & 4) == 0 ? i : 0, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : list, (i2 & 64) == 0 ? str : null);
    }
}
