package com.okinc.business.market.features.smart_money.signal.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagUiModel;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalGemsCardsUiModel implements Parcelable, kMU {
    public static final Parcelable.Creator<SignalGemsCardsUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final long AhwBna;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final long djBIcL;
    public final String fetchVPNInfo;
    public final SignalMultiplierTagUiModel gEmmrt;
    public final String isConnected;
    public final boolean valueOf;

    public static final class Creator implements Parcelable.Creator<SignalGemsCardsUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalGemsCardsUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalGemsCardsUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), SignalMultiplierTagUiModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalGemsCardsUiModel[] newArray(int i) {
            return new SignalGemsCardsUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalGemsCardsUiModel AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull SignalMultiplierTagUiModel signalMultiplierTagUiModel, @NotNull String str6, @NotNull String str7, long j, boolean z, @NotNull String str8, @NotNull String str9, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(signalMultiplierTagUiModel, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new SignalGemsCardsUiModel(str, str2, str3, str4, str5, signalMultiplierTagUiModel, str6, str7, j, z, str8, str9, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AhwBna;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalGemsCardsUiModel)) {
            return false;
        }
        SignalGemsCardsUiModel signalGemsCardsUiModel = (SignalGemsCardsUiModel) obj;
        return Intrinsics.EZpvd((Object) this.isConnected, (Object) signalGemsCardsUiModel.isConnected) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signalGemsCardsUiModel.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) signalGemsCardsUiModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) signalGemsCardsUiModel.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) signalGemsCardsUiModel.DbNXlk) && Intrinsics.EZpvd(this.gEmmrt, signalGemsCardsUiModel.gEmmrt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) signalGemsCardsUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) signalGemsCardsUiModel.copydefault) && this.AhwBna == signalGemsCardsUiModel.AhwBna && this.valueOf == signalGemsCardsUiModel.valueOf && Intrinsics.EZpvd((Object) this.EZpvd, (Object) signalGemsCardsUiModel.EZpvd) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) signalGemsCardsUiModel.AYXKKw) && this.djBIcL == signalGemsCardsUiModel.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.isConnected.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + Long.hashCode(this.AhwBna)) * 31) + Boolean.hashCode(this.valueOf)) * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + Long.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalGemsCardsUiModel(tokenLogoUrl=" + this.isConnected + ", chainBwLogoUrl=" + this.OLrzqt + ", chainLogoUrl=" + this.AEQbTJ + ", tokenSymbol=" + this.fetchVPNInfo + ", tokenName=" + this.DbNXlk + ", multiplierTag=" + this.gEmmrt + ", currentMarketCap=" + this.KWHzl + ", firstSignalMarketCap=" + this.copydefault + ", firstSignalTime=" + this.AhwBna + ", marketCapIncreasedSinceSignal=" + this.valueOf + ", chainId=" + this.EZpvd + ", tokenContractAddress=" + this.AYXKKw + ", tokenCreateTime=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMultiplierTagUiModel valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.isConnected);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.DbNXlk);
        this.gEmmrt.writeToParcel(parcel, i);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeLong(this.AhwBna);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AYXKKw);
        parcel.writeLong(this.djBIcL);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public SignalGemsCardsUiModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull SignalMultiplierTagUiModel signalMultiplierTagUiModel, @NotNull String str6, @NotNull String str7, long j, boolean z, @NotNull String str8, @NotNull String str9, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(signalMultiplierTagUiModel, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.isConnected = str;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
        this.fetchVPNInfo = str4;
        this.DbNXlk = str5;
        this.gEmmrt = signalMultiplierTagUiModel;
        this.KWHzl = str6;
        this.copydefault = str7;
        this.AhwBna = j;
        this.valueOf = z;
        this.EZpvd = str8;
        this.AYXKKw = str9;
        this.djBIcL = j2;
    }
}
