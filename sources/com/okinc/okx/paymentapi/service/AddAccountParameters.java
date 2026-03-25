package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AddAccountParameters implements Parcelable {
    public static final Parcelable.Creator<AddAccountParameters> CREATOR = new Creator();
    public String AEQbTJ;
    public final String EZpvd;
    public CreateAccountType KWHzl;
    public String OLrzqt;
    public String copydefault;
    public String djBIcL;
    public final String gEmmrt;
    public ThirdPartyTarget valueOf;

    public static final class Creator implements Parcelable.Creator<AddAccountParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddAccountParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddAccountParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), ThirdPartyTarget.valueOf(parcel.readString()), CreateAccountType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddAccountParameters[] newArray(int i) {
            return new AddAccountParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddAccountParameters AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ThirdPartyTarget thirdPartyTarget, @NotNull CreateAccountType createAccountType, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(thirdPartyTarget, "");
        Intrinsics.checkNotNullParameter(createAccountType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new AddAccountParameters(str, str2, str3, str4, thirdPartyTarget, createAccountType, str5, str6);
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
        if (!(obj instanceof AddAccountParameters)) {
            return false;
        }
        AddAccountParameters addAccountParameters = (AddAccountParameters) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) addAccountParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) addAccountParameters.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) addAccountParameters.copydefault) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) addAccountParameters.djBIcL) && this.valueOf == addAccountParameters.valueOf && this.KWHzl == addAccountParameters.KWHzl && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) addAccountParameters.gEmmrt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) addAccountParameters.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddAccountParameters(accountId=" + this.AEQbTJ + ", accountToken=" + this.OLrzqt + ", depositPlatformCode=" + this.copydefault + ", paymentIntentId=" + this.djBIcL + ", target=" + this.valueOf + ", createAccountType=" + this.KWHzl + ", orderNo=" + this.gEmmrt + ", depositName=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.valueOf.name());
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.EZpvd);
    }

    public AddAccountParameters(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ThirdPartyTarget thirdPartyTarget, @NotNull CreateAccountType createAccountType, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(thirdPartyTarget, "");
        Intrinsics.checkNotNullParameter(createAccountType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.djBIcL = str4;
        this.valueOf = thirdPartyTarget;
        this.KWHzl = createAccountType;
        this.gEmmrt = str5;
        this.EZpvd = str6;
    }
}
