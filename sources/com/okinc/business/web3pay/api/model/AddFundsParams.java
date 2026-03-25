package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AddFundsParams implements Parcelable {
    public static final Parcelable.Creator<AddFundsParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final boolean AhwBna;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final boolean djBIcL;
    public final Boolean gEmmrt;
    public final Web3PayProjectId valueOf;

    public static final class Creator implements Parcelable.Creator<AddFundsParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddFundsParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddFundsParams(string, string2, boolValueOf, parcel.readString(), parcel.readString(), Web3PayProjectId.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddFundsParams[] newArray(int i) {
            return new AddFundsParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddFundsParams OLrzqt(String str, String str2, Boolean bool, String str3, String str4, @NotNull Web3PayProjectId web3PayProjectId, boolean z, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2) {
        Intrinsics.checkNotNullParameter(web3PayProjectId, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new AddFundsParams(str, str2, bool, str3, str4, web3PayProjectId, z, str5, str6, str7, z2);
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
        if (!(obj instanceof AddFundsParams)) {
            return false;
        }
        AddFundsParams addFundsParams = (AddFundsParams) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) addFundsParams.KWHzl) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) addFundsParams.DbNXlk) && Intrinsics.EZpvd(this.gEmmrt, addFundsParams.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) addFundsParams.AYXKKw) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) addFundsParams.OLrzqt) && this.valueOf == addFundsParams.valueOf && this.AhwBna == addFundsParams.AhwBna && Intrinsics.EZpvd((Object) this.EZpvd, (Object) addFundsParams.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) addFundsParams.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) addFundsParams.AEQbTJ) && this.djBIcL == addFundsParams.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.DbNXlk;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.gEmmrt;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.AYXKKw;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.OLrzqt;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.valueOf.hashCode()) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddFundsParams(chainIndex=" + this.KWHzl + ", tokenSymbol=" + this.DbNXlk + ", showConvert=" + this.gEmmrt + ", tokenCoinTypeNo=" + this.AYXKKw + ", convertFromTokenCoinTypeNo=" + this.OLrzqt + ", projectId=" + this.valueOf + ", supportToExchange=" + this.AhwBna + ", onChainReceiveSubtitle=" + this.EZpvd + ", exchangeReceiveSubtitle=" + this.copydefault + ", convertSubtitle=" + this.AEQbTJ + ", showReceive=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.DbNXlk);
        Boolean bool = this.gEmmrt;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.valueOf.name());
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.djBIcL ? 1 : 0);
    }

    public AddFundsParams(String str, String str2, Boolean bool, String str3, String str4, @NotNull Web3PayProjectId web3PayProjectId, boolean z, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2) {
        Intrinsics.checkNotNullParameter(web3PayProjectId, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.KWHzl = str;
        this.DbNXlk = str2;
        this.gEmmrt = bool;
        this.AYXKKw = str3;
        this.OLrzqt = str4;
        this.valueOf = web3PayProjectId;
        this.AhwBna = z;
        this.EZpvd = str5;
        this.copydefault = str6;
        this.AEQbTJ = str7;
        this.djBIcL = z2;
    }
}
