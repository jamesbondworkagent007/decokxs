package com.okinc.assets.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface GoToWithdrawFromWalletResultContractArgs extends Parcelable {

    public static final class Withdraw implements GoToWithdrawFromWalletResultContractArgs {
        public static final Parcelable.Creator<Withdraw> CREATOR = new Creator();
        public final int AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final int copydefault;
        public final String djBIcL;
        public final long gEmmrt;

        public static final class Creator implements Parcelable.Creator<Withdraw> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Withdraw createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Withdraw(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Withdraw[] newArray(int i) {
                return new Withdraw[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Withdraw OLrzqt(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Withdraw(i, i2, str, str2, str3, j, str4);
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
            if (!(obj instanceof Withdraw)) {
                return false;
            }
            Withdraw withdraw = (Withdraw) obj;
            return this.copydefault == withdraw.copydefault && this.AEQbTJ == withdraw.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) withdraw.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) withdraw.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) withdraw.djBIcL) && this.gEmmrt == withdraw.gEmmrt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) withdraw.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((Integer.hashCode(this.copydefault) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + Long.hashCode(this.gEmmrt)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Withdraw(currencyId=" + this.copydefault + ", subCurrencyId=" + this.AEQbTJ + ", address=" + this.OLrzqt + ", walletDisplayName=" + this.KWHzl + ", walletId=" + this.djBIcL + ", web3CoinId=" + this.gEmmrt + ", walletIcon=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.copydefault);
            parcel.writeInt(this.AEQbTJ);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.djBIcL);
            parcel.writeLong(this.gEmmrt);
            parcel.writeString(this.EZpvd);
        }

        public Withdraw(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.copydefault = i;
            this.AEQbTJ = i2;
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.djBIcL = str3;
            this.gEmmrt = j;
            this.EZpvd = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 int)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
 A[MD:(int, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String):void (m)] (LINE:13) call: com.okinc.assets.api.model.GoToWithdrawFromWalletResultContractArgs.Withdraw.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String):void type: THIS */
        public /* synthetic */ Withdraw(int i, int i2, String str, String str2, String str3, long j, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, str, str2, str3, j, (i3 & 64) != 0 ? "" : str4);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Tutorial implements GoToWithdrawFromWalletResultContractArgs {
        public static final Parcelable.Creator<Tutorial> CREATOR = new Creator();
        public final String EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final String copydefault;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<Tutorial> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tutorial createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Tutorial(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tutorial[] newArray(int i) {
                return new Tutorial[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Tutorial copy$default(Tutorial tutorial, int i, int i2, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = tutorial.OLrzqt;
            }
            if ((i3 & 2) != 0) {
                i2 = tutorial.KWHzl;
            }
            if ((i3 & 4) != 0) {
                str = tutorial.EZpvd;
            }
            if ((i3 & 8) != 0) {
                str2 = tutorial.copydefault;
            }
            return tutorial.KWHzl(i, i2, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Tutorial KWHzl(int i, int i2, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Tutorial(i, i2, str, str2);
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
            if (!(obj instanceof Tutorial)) {
                return false;
            }
            Tutorial tutorial = (Tutorial) obj;
            return this.OLrzqt == tutorial.OLrzqt && this.KWHzl == tutorial.KWHzl && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tutorial.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tutorial.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Integer.hashCode(this.OLrzqt) * 31) + Integer.hashCode(this.KWHzl)) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Tutorial(currencyId=" + this.OLrzqt + ", subCurrencyId=" + this.KWHzl + ", address=" + this.EZpvd + ", walletDisplayName=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt);
            parcel.writeInt(this.KWHzl);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.copydefault);
        }

        public Tutorial(int i, int i2, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = i;
            this.KWHzl = i2;
            this.EZpvd = str;
            this.copydefault = str2;
        }
    }
}
