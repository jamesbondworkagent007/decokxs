package com.okinc.wallet.widget.input.address;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface WalletAddressInput extends Parcelable {

    public static final class OnlyOneAddress implements WalletAddressInput {
        public static final Parcelable.Creator<OnlyOneAddress> CREATOR = new Creator();
        public boolean AEQbTJ;
        public final boolean EZpvd;
        public final String KWHzl;
        public final int OLrzqt;
        public final String copydefault;
        public final long djBIcL;

        public static final class Creator implements Parcelable.Creator<OnlyOneAddress> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnlyOneAddress createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OnlyOneAddress(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnlyOneAddress[] newArray(int i) {
                return new OnlyOneAddress[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OnlyOneAddress copy$default(OnlyOneAddress onlyOneAddress, String str, int i, long j, boolean z, String str2, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = onlyOneAddress.copydefault;
            }
            if ((i2 & 2) != 0) {
                i = onlyOneAddress.OLrzqt;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                j = onlyOneAddress.djBIcL;
            }
            long j2 = j;
            if ((i2 & 8) != 0) {
                z = onlyOneAddress.EZpvd;
            }
            boolean z3 = z;
            if ((i2 & 16) != 0) {
                str2 = onlyOneAddress.KWHzl;
            }
            String str3 = str2;
            if ((i2 & 32) != 0) {
                z2 = onlyOneAddress.AEQbTJ;
            }
            return onlyOneAddress.OLrzqt(str, i3, j2, z3, str3, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnlyOneAddress OLrzqt(@NotNull String str, int i, long j, boolean z, @NotNull String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new OnlyOneAddress(str, i, j, z, str2, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.AEQbTJ = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnlyOneAddress)) {
                return false;
            }
            OnlyOneAddress onlyOneAddress = (OnlyOneAddress) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) onlyOneAddress.copydefault) && this.OLrzqt == onlyOneAddress.OLrzqt && this.djBIcL == onlyOneAddress.djBIcL && this.EZpvd == onlyOneAddress.EZpvd && Intrinsics.EZpvd((Object) this.KWHzl, (Object) onlyOneAddress.KWHzl) && this.AEQbTJ == onlyOneAddress.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.copydefault.hashCode() * 31) + Integer.hashCode(this.OLrzqt)) * 31) + Long.hashCode(this.djBIcL)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OnlyOneAddress(text=" + this.copydefault + ", selection=" + this.OLrzqt + ", version=" + this.djBIcL + ", isAddressValid=" + this.EZpvd + ", memo=" + this.KWHzl + ", isExchangeAddress=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeInt(this.OLrzqt);
            parcel.writeLong(this.djBIcL);
            parcel.writeInt(this.EZpvd ? 1 : 0);
            parcel.writeString(this.KWHzl);
            parcel.writeInt(this.AEQbTJ ? 1 : 0);
        }

        public OnlyOneAddress(@NotNull String str, int i, long j, boolean z, @NotNull String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.OLrzqt = i;
            this.djBIcL = j;
            this.EZpvd = z;
            this.KWHzl = str2;
            this.AEQbTJ = z2;
        }
    }

    public static final class MultiAddress implements WalletAddressInput {
        public final long AEQbTJ;
        public final int EZpvd;
        public final List<Address> KWHzl;
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public static final int copydefault = 8;
        public static final Parcelable.Creator<MultiAddress> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<MultiAddress> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiAddress createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Address.CREATOR.createFromParcel(parcel));
                }
                return new MultiAddress(arrayList, parcel.readInt(), parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiAddress[] newArray(int i) {
                return new MultiAddress[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.widget.input.address.WalletAddressInput$MultiAddress */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiAddress copy$default(MultiAddress multiAddress, List list, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = multiAddress.KWHzl;
            }
            if ((i2 & 2) != 0) {
                i = multiAddress.EZpvd;
            }
            if ((i2 & 4) != 0) {
                j = multiAddress.AEQbTJ;
            }
            return multiAddress.OLrzqt(list, i, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Address> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MultiAddress OLrzqt(@NotNull List<Address> list, int i, long j) {
            Intrinsics.checkNotNullParameter(list, "");
            return new MultiAddress(list, i, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.AEQbTJ;
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
            if (!(obj instanceof MultiAddress)) {
                return false;
            }
            MultiAddress multiAddress = (MultiAddress) obj;
            return Intrinsics.EZpvd(this.KWHzl, multiAddress.KWHzl) && this.EZpvd == multiAddress.EZpvd && this.AEQbTJ == multiAddress.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + Integer.hashCode(this.EZpvd)) * 31) + Long.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MultiAddress(addresses=" + this.KWHzl + ", selectedIndex=" + this.EZpvd + ", version=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<Address> list = this.KWHzl;
            parcel.writeInt(list.size());
            Iterator<Address> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeInt(this.EZpvd);
            parcel.writeLong(this.AEQbTJ);
        }

        public MultiAddress(@NotNull List<Address> list, int i, long j) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            this.EZpvd = i;
            this.AEQbTJ = j;
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.widget.input.address.WalletAddressInput.MultiAddress.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }
        }
    }

    public static final class Address implements Parcelable {
        public final int AEQbTJ;
        public final int AYXKKw;
        public boolean EZpvd;
        public String KWHzl;
        public final boolean copydefault;
        public final String valueOf;
        public static final ActionBar Companion = new ActionBar(null);
        public static final int OLrzqt = 8;
        public static final Parcelable.Creator<Address> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Address> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Address(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i) {
                return new Address[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Address copy$default(Address address, int i, String str, int i2, boolean z, String str2, boolean z2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = address.AEQbTJ;
            }
            if ((i3 & 2) != 0) {
                str = address.valueOf;
            }
            String str3 = str;
            if ((i3 & 4) != 0) {
                i2 = address.AYXKKw;
            }
            int i4 = i2;
            if ((i3 & 8) != 0) {
                z = address.copydefault;
            }
            boolean z3 = z;
            if ((i3 & 16) != 0) {
                str2 = address.KWHzl;
            }
            String str4 = str2;
            if ((i3 & 32) != 0) {
                z2 = address.EZpvd;
            }
            return address.KWHzl(i, str3, i4, z3, str4, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Address KWHzl(int i, @NotNull String str, int i2, boolean z, @NotNull String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Address(i, str, i2, z, str2, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            return this.AEQbTJ == address.AEQbTJ && Intrinsics.EZpvd((Object) this.valueOf, (Object) address.valueOf) && this.AYXKKw == address.AYXKKw && this.copydefault == address.copydefault && Intrinsics.EZpvd((Object) this.KWHzl, (Object) address.KWHzl) && this.EZpvd == address.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((Integer.hashCode(this.AEQbTJ) * 31) + this.valueOf.hashCode()) * 31) + Integer.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Address(id=" + this.AEQbTJ + ", text=" + this.valueOf + ", selection=" + this.AYXKKw + ", isAddressValid=" + this.copydefault + ", memo=" + this.KWHzl + ", isExchangeAddress=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.AEQbTJ);
            parcel.writeString(this.valueOf);
            parcel.writeInt(this.AYXKKw);
            parcel.writeInt(this.copydefault ? 1 : 0);
            parcel.writeString(this.KWHzl);
            parcel.writeInt(this.EZpvd ? 1 : 0);
        }

        public Address(int i, @NotNull String str, int i2, boolean z, @NotNull String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = i;
            this.valueOf = str;
            this.AYXKKw = i2;
            this.copydefault = z;
            this.KWHzl = str2;
            this.EZpvd = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r8v0 int)
  (r9v0 java.lang.String)
  (r10v0 int)
  (r11v0 boolean)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(int, java.lang.String, int, boolean, java.lang.String, boolean):void (m)] (LINE:36) call: com.okinc.wallet.widget.input.address.WalletAddressInput.Address.<init>(int, java.lang.String, int, boolean, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Address(int i, String str, int i2, boolean z, String str2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, i2, z, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? false : z2);
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.widget.input.address.WalletAddressInput.Address.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }
    }
}
