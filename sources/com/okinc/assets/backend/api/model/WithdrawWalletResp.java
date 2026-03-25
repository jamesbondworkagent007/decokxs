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
public final class WithdrawWalletResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawWalletResp> CREATOR = new Creator();
    private final List<WithdrawWalletAccount> addresses;
    private final boolean allowlistEnabled;
    private final boolean hasMultiAddressTypes;
    private final boolean newAddressWithdrawalLock;
    private List<SupportedEVM> supportedEvms;

    public static final class Creator implements Parcelable.Creator<WithdrawWalletResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawWalletResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(WithdrawWalletAccount.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(SupportedEVM.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            return new WithdrawWalletResp(z, z2, z3, arrayList2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawWalletResp[] newArray(int i) {
            return new WithdrawWalletResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.assets.backend.api.model.WithdrawWalletResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawWalletResp copy$default(WithdrawWalletResp withdrawWalletResp, boolean z, boolean z2, boolean z3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = withdrawWalletResp.allowlistEnabled;
        }
        if ((i & 2) != 0) {
            z2 = withdrawWalletResp.newAddressWithdrawalLock;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            z3 = withdrawWalletResp.hasMultiAddressTypes;
        }
        boolean z5 = z3;
        if ((i & 8) != 0) {
            list = withdrawWalletResp.addresses;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = withdrawWalletResp.supportedEvms;
        }
        return withdrawWalletResp.copy(z, z4, z5, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.allowlistEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.hasMultiAddressTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawWalletAccount> component4() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedEVM> component5() {
        return this.supportedEvms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawWalletResp copy(boolean z, boolean z2, boolean z3, @NotNull List<WithdrawWalletAccount> list, List<SupportedEVM> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WithdrawWalletResp(z, z2, z3, list, list2);
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
        if (!(obj instanceof WithdrawWalletResp)) {
            return false;
        }
        WithdrawWalletResp withdrawWalletResp = (WithdrawWalletResp) obj;
        return this.allowlistEnabled == withdrawWalletResp.allowlistEnabled && this.newAddressWithdrawalLock == withdrawWalletResp.newAddressWithdrawalLock && this.hasMultiAddressTypes == withdrawWalletResp.hasMultiAddressTypes && Intrinsics.EZpvd(this.addresses, withdrawWalletResp.addresses) && Intrinsics.EZpvd(this.supportedEvms, withdrawWalletResp.supportedEvms);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawWalletAccount> getAddresses() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowlistEnabled() {
        return this.allowlistEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasMultiAddressTypes() {
        return this.hasMultiAddressTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewAddressWithdrawalLock() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedEVM> getSupportedEvms() {
        return this.supportedEvms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.allowlistEnabled);
        int iHashCode2 = Boolean.hashCode(this.newAddressWithdrawalLock);
        int iHashCode3 = Boolean.hashCode(this.hasMultiAddressTypes);
        int iHashCode4 = this.addresses.hashCode();
        List<SupportedEVM> list = this.supportedEvms;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportedEvms(List<SupportedEVM> list) {
        this.supportedEvms = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawWalletResp(allowlistEnabled=" + this.allowlistEnabled + ", newAddressWithdrawalLock=" + this.newAddressWithdrawalLock + ", hasMultiAddressTypes=" + this.hasMultiAddressTypes + ", addresses=" + this.addresses + ", supportedEvms=" + this.supportedEvms + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.allowlistEnabled ? 1 : 0);
        parcel.writeInt(this.newAddressWithdrawalLock ? 1 : 0);
        parcel.writeInt(this.hasMultiAddressTypes ? 1 : 0);
        List<WithdrawWalletAccount> list = this.addresses;
        parcel.writeInt(list.size());
        Iterator<WithdrawWalletAccount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<SupportedEVM> list2 = this.supportedEvms;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<SupportedEVM> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public WithdrawWalletResp(boolean z, boolean z2, boolean z3, @NotNull List<WithdrawWalletAccount> list, List<SupportedEVM> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.allowlistEnabled = z;
        this.newAddressWithdrawalLock = z2;
        this.hasMultiAddressTypes = z3;
        this.addresses = list;
        this.supportedEvms = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 boolean)
  (r8v0 boolean)
  (r9v0 boolean)
  (r10v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
 A[MD:(boolean, boolean, boolean, java.util.List<com.okinc.assets.backend.api.model.WithdrawWalletAccount>, java.util.List<com.okinc.assets.backend.api.model.SupportedEVM>):void (m)] (LINE:11) call: com.okinc.assets.backend.api.model.WithdrawWalletResp.<init>(boolean, boolean, boolean, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ WithdrawWalletResp(boolean z, boolean z2, boolean z3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, list, (i & 16) != 0 ? null : list2);
    }
}
