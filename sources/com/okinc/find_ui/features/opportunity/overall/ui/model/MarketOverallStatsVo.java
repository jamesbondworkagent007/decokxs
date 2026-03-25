package com.okinc.find_ui.features.opportunity.overall.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.market.ext.CryptoCellTagColor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketOverallStatsVo implements Parcelable {
    public final CryptoCellTagColor AEQbTJ;
    public final CryptoCellTagColor AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String gEmmrt;
    public final String valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<MarketOverallStatsVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MarketOverallStatsVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketOverallStatsVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarketOverallStatsVo(parcel.readString(), parcel.readString(), CryptoCellTagColor.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), CryptoCellTagColor.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketOverallStatsVo[] newArray(int i) {
            return new MarketOverallStatsVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketOverallStatsVo OLrzqt(@NotNull String str, @NotNull String str2, @NotNull CryptoCellTagColor cryptoCellTagColor, @NotNull String str3, @NotNull String str4, @NotNull CryptoCellTagColor cryptoCellTagColor2, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(cryptoCellTagColor, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(cryptoCellTagColor2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new MarketOverallStatsVo(str, str2, cryptoCellTagColor, str3, str4, cryptoCellTagColor2, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CryptoCellTagColor copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CryptoCellTagColor djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOverallStatsVo)) {
            return false;
        }
        MarketOverallStatsVo marketOverallStatsVo = (MarketOverallStatsVo) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) marketOverallStatsVo.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) marketOverallStatsVo.EZpvd) && this.AEQbTJ == marketOverallStatsVo.AEQbTJ && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) marketOverallStatsVo.gEmmrt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) marketOverallStatsVo.valueOf) && this.AYXKKw == marketOverallStatsVo.AYXKKw && Intrinsics.EZpvd((Object) this.KWHzl, (Object) marketOverallStatsVo.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) marketOverallStatsVo.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) marketOverallStatsVo.AhwBna) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) marketOverallStatsVo.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketOverallStatsVo(capValue=" + this.copydefault + ", capRatio=" + this.EZpvd + ", capColor=" + this.AEQbTJ + ", volumeValue=" + this.gEmmrt + ", volumeRatio=" + this.valueOf + ", volumeColor=" + this.AYXKKw + ", dominanceCoin=" + this.KWHzl + ", dominanceCoinRatio=" + this.djBIcL + ", dominanceCoinIcon=" + this.AhwBna + ", dominanceCoinFUllName=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ.name());
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AYXKKw.name());
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.OLrzqt);
    }

    public MarketOverallStatsVo(@NotNull String str, @NotNull String str2, @NotNull CryptoCellTagColor cryptoCellTagColor, @NotNull String str3, @NotNull String str4, @NotNull CryptoCellTagColor cryptoCellTagColor2, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(cryptoCellTagColor, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(cryptoCellTagColor2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = cryptoCellTagColor;
        this.gEmmrt = str3;
        this.valueOf = str4;
        this.AYXKKw = cryptoCellTagColor2;
        this.KWHzl = str5;
        this.djBIcL = str6;
        this.AhwBna = str7;
        this.OLrzqt = str8;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final MarketOverallStatsVo AEQbTJ() {
            CryptoCellTagColor cryptoCellTagColor = CryptoCellTagColor.NATURAL;
            return new MarketOverallStatsVo("--", "--", cryptoCellTagColor, "--", "--", cryptoCellTagColor, "BTC", "--", "--", "--");
        }
    }
}
