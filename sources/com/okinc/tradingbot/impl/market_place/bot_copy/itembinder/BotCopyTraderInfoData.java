package com.okinc.tradingbot.impl.market_place.bot_copy.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class BotCopyTraderInfoData implements Parcelable {
    public static final Parcelable.Creator<BotCopyTraderInfoData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final BotWinLossRateData AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String gEmmrt;
    public final String valueOf;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotCopyTraderInfoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCopyTraderInfoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotCopyTraderInfoData(parcel.readString(), parcel.readString(), BotWinLossRateData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCopyTraderInfoData[] newArray(int i) {
            return new BotCopyTraderInfoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotCopyTraderInfoData KWHzl(@NotNull String str, @NotNull String str2, @NotNull BotWinLossRateData botWinLossRateData, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(botWinLossRateData, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BotCopyTraderInfoData(str, str2, botWinLossRateData, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof BotCopyTraderInfoData)) {
            return false;
        }
        BotCopyTraderInfoData botCopyTraderInfoData = (BotCopyTraderInfoData) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) botCopyTraderInfoData.AEQbTJ) && Intrinsics.EZpvd((Object) this.valueOf, (Object) botCopyTraderInfoData.valueOf) && Intrinsics.EZpvd(this.AhwBna, botCopyTraderInfoData.AhwBna) && Intrinsics.EZpvd((Object) this.copydefault, (Object) botCopyTraderInfoData.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) botCopyTraderInfoData.OLrzqt) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) botCopyTraderInfoData.gEmmrt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) botCopyTraderInfoData.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) botCopyTraderInfoData.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = this.AhwBna.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        String str = this.KWHzl;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.EZpvd;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotCopyTraderInfoData(avatar=" + this.AEQbTJ + ", userName=" + this.valueOf + ", winLossRateData=" + this.AhwBna + ", followCount=" + this.copydefault + ", shareRatio=" + this.OLrzqt + ", traderUniqueName=" + this.gEmmrt + ", botType=" + this.KWHzl + ", trackingMode=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotWinLossRateData valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.valueOf);
        this.AhwBna.writeToParcel(parcel, i);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
    }

    public BotCopyTraderInfoData(@NotNull String str, @NotNull String str2, @NotNull BotWinLossRateData botWinLossRateData, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(botWinLossRateData, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = str;
        this.valueOf = str2;
        this.AhwBna = botWinLossRateData;
        this.copydefault = str3;
        this.OLrzqt = str4;
        this.gEmmrt = str5;
        this.KWHzl = str6;
        this.EZpvd = str7;
    }
}
