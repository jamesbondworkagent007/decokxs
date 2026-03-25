package com.okinc.business.dexui.main.swap.trade.savings;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class SavingsOrderParams implements Parcelable {
    public static final Parcelable.Creator<SavingsOrderParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final long copydefault;
    public final String djBIcL;
    public final List<String> valueOf;

    public static final class Creator implements Parcelable.Creator<SavingsOrderParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsOrderParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SavingsOrderParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsOrderParams[] newArray(int i) {
            return new SavingsOrderParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SavingsOrderParams KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new SavingsOrderParams(str, str2, str3, list, str4, str5, str6, str7, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsOrderParams)) {
            return false;
        }
        SavingsOrderParams savingsOrderParams = (SavingsOrderParams) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) savingsOrderParams.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) savingsOrderParams.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) savingsOrderParams.AhwBna) && Intrinsics.EZpvd(this.valueOf, savingsOrderParams.valueOf) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) savingsOrderParams.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) savingsOrderParams.OLrzqt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) savingsOrderParams.AYXKKw) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) savingsOrderParams.AEQbTJ) && this.copydefault == savingsOrderParams.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.KWHzl.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SavingsOrderParams(surplusAmount=" + this.KWHzl + ", surplusValueUSD=" + this.djBIcL + ", tokenSymbol=" + this.AhwBna + ", tokensUrl=" + this.valueOf + ", estReceiveAmount=" + this.EZpvd + ", actualReceiveAmount=" + this.OLrzqt + ", tokenAddress=" + this.AYXKKw + ", chainId=" + this.AEQbTJ + ", executedTime=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeStringList(this.valueOf);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AEQbTJ);
        parcel.writeLong(this.copydefault);
    }

    public SavingsOrderParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.KWHzl = str;
        this.djBIcL = str2;
        this.AhwBna = str3;
        this.valueOf = list;
        this.EZpvd = str4;
        this.OLrzqt = str5;
        this.AYXKKw = str6;
        this.AEQbTJ = str7;
        this.copydefault = j;
    }
}
