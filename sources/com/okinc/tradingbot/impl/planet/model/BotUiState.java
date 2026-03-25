package com.okinc.tradingbot.impl.planet.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.common.model.TextColor;
import com.okinc.tradingbot.impl.planet.domain.BotDisplayName;
import com.okinc.tradingbot.impl.planet.model.BotUiExtras;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotUiState implements Parcelable {
    public static final Parcelable.Creator<BotUiState> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final String DbNXlk;
    public final BotDisplayName EZpvd;
    public final BotUiExtras KWHzl;
    public final BotDisplayType OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final List<BotTag> ejfBZ;
    public final boolean fJNWhG;
    public final String fetchVPNInfo;
    public final List<String> gEmmrt;
    public final TextColor isConnected;
    public final String valueOf;
    public final PlanetBotMetadata values;

    public static final class Creator implements Parcelable.Creator<BotUiState> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotUiState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            BotDisplayName botDisplayName = (BotDisplayName) parcel.readParcelable(BotUiState.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            TextColor textColor = (TextColor) parcel.readParcelable(BotUiState.class.getClassLoader());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(BotTag.CREATOR.createFromParcel(parcel));
            }
            return new BotUiState(string, string2, string3, botDisplayName, string4, string5, textColor, string6, string7, string8, z, arrayListCreateStringArrayList, arrayList, parcel.readString(), BotDisplayType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (BotUiExtras) parcel.readParcelable(BotUiState.class.getClassLoader()), PlanetBotMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotUiState[] newArray(int i) {
            return new BotUiState[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotUiState() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, 262143, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotDisplayName AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextColor AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetBotMetadata AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotTag> DbNXlk() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotUiExtras EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotUiState KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull BotDisplayName botDisplayName, @NotNull String str4, @NotNull String str5, @NotNull TextColor textColor, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull List<String> list, @NotNull List<BotTag> list2, @NotNull String str9, @NotNull BotDisplayType botDisplayType, boolean z2, @NotNull BotUiExtras botUiExtras, @NotNull PlanetBotMetadata planetBotMetadata) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(botDisplayName, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(textColor, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(botDisplayType, "");
        Intrinsics.checkNotNullParameter(botUiExtras, "");
        Intrinsics.checkNotNullParameter(planetBotMetadata, "");
        return new BotUiState(str, str2, str3, botDisplayName, str4, str5, textColor, str6, str7, str8, z, list, list2, str9, botDisplayType, z2, botUiExtras, planetBotMetadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotDisplayType OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> copydefault() {
        return this.gEmmrt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotUiState)) {
            return false;
        }
        BotUiState botUiState = (BotUiState) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) botUiState.AEQbTJ) && Intrinsics.EZpvd((Object) this.valueOf, (Object) botUiState.valueOf) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) botUiState.djBIcL) && Intrinsics.EZpvd(this.EZpvd, botUiState.EZpvd) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) botUiState.AkhnZx) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) botUiState.fetchVPNInfo) && Intrinsics.EZpvd(this.isConnected, botUiState.isConnected) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) botUiState.AuCTel) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) botUiState.DbNXlk) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) botUiState.AhwBna) && this.AYXKKw == botUiState.AYXKKw && Intrinsics.EZpvd(this.gEmmrt, botUiState.gEmmrt) && Intrinsics.EZpvd(this.ejfBZ, botUiState.ejfBZ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) botUiState.copydefault) && this.OLrzqt == botUiState.OLrzqt && this.fJNWhG == botUiState.fJNWhG && Intrinsics.EZpvd(this.KWHzl, botUiState.KWHzl) && Intrinsics.EZpvd(this.values, botUiState.values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + this.gEmmrt.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + Boolean.hashCode(this.fJNWhG)) * 31) + this.KWHzl.hashCode()) * 31) + this.values.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotUiState(algoId=" + this.AEQbTJ + ", instId=" + this.valueOf + ", instType=" + this.djBIcL + ", displayName=" + this.EZpvd + ", pnl=" + this.AkhnZx + ", pnlPercent=" + this.fetchVPNInfo + ", pnlColor=" + this.isConnected + ", runtime=" + this.AuCTel + ", pTime=" + this.DbNXlk + ", lastPrice=" + this.AhwBna + ", isSelected=" + this.AYXKKw + ", instrumentIcons=" + this.gEmmrt + ", tags=" + this.ejfBZ + ", botType=" + this.copydefault + ", displayType=" + this.OLrzqt + ", showTradeCTA=" + this.fJNWhG + ", botUiExtras=" + this.KWHzl + ", planetMetadata=" + this.values + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.djBIcL);
        parcel.writeParcelable(this.EZpvd, i);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeParcelable(this.isConnected, i);
        parcel.writeString(this.AuCTel);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeStringList(this.gEmmrt);
        List<BotTag> list = this.ejfBZ;
        parcel.writeInt(list.size());
        Iterator<BotTag> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.copydefault);
        this.OLrzqt.writeToParcel(parcel, i);
        parcel.writeInt(this.fJNWhG ? 1 : 0);
        parcel.writeParcelable(this.KWHzl, i);
        this.values.writeToParcel(parcel, i);
    }

    public BotUiState(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull BotDisplayName botDisplayName, @NotNull String str4, @NotNull String str5, @NotNull TextColor textColor, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull List<String> list, @NotNull List<BotTag> list2, @NotNull String str9, @NotNull BotDisplayType botDisplayType, boolean z2, @NotNull BotUiExtras botUiExtras, @NotNull PlanetBotMetadata planetBotMetadata) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(botDisplayName, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(textColor, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(botDisplayType, "");
        Intrinsics.checkNotNullParameter(botUiExtras, "");
        Intrinsics.checkNotNullParameter(planetBotMetadata, "");
        this.AEQbTJ = str;
        this.valueOf = str2;
        this.djBIcL = str3;
        this.EZpvd = botDisplayName;
        this.AkhnZx = str4;
        this.fetchVPNInfo = str5;
        this.isConnected = textColor;
        this.AuCTel = str6;
        this.DbNXlk = str7;
        this.AhwBna = str8;
        this.AYXKKw = z;
        this.gEmmrt = list;
        this.ejfBZ = list2;
        this.copydefault = str9;
        this.OLrzqt = botDisplayType;
        this.fJNWhG = z2;
        this.KWHzl = botUiExtras;
        this.values = planetBotMetadata;
    }

    public /* synthetic */ BotUiState(String str, String str2, String str3, BotDisplayName botDisplayName, String str4, String str5, TextColor textColor, String str6, String str7, String str8, boolean z, List list, List list2, String str9, BotDisplayType botDisplayType, boolean z2, BotUiExtras botUiExtras, PlanetBotMetadata planetBotMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PlanetBotMetadata planetBotMetadata2;
        String str10 = (i & 1) != 0 ? "" : str;
        String str11 = (i & 2) != 0 ? "" : str2;
        String str12 = (i & 4) != 0 ? "" : str3;
        BotDisplayName plain = (i & 8) != 0 ? new BotDisplayName.Plain("") : botDisplayName;
        String str13 = (i & 16) != 0 ? "" : str4;
        String str14 = (i & 32) != 0 ? "" : str5;
        TextColor textColor2 = (i & 64) != 0 ? TextColor.Zero.OLrzqt : textColor;
        String str15 = (i & 128) != 0 ? "" : str6;
        String str16 = (i & 256) != 0 ? "" : str7;
        String str17 = (i & 512) != 0 ? "" : str8;
        boolean z3 = (i & 1024) != 0 ? false : z;
        List listAhwBna = (i & 2048) != 0 ? yDY.AhwBna() : list;
        List listAhwBna2 = (i & 4096) != 0 ? yDY.AhwBna() : list2;
        String str18 = (i & 8192) == 0 ? str9 : "";
        BotDisplayType botDisplayType2 = (i & 16384) != 0 ? BotDisplayType.YieldRatioOnly : botDisplayType;
        boolean z4 = (i & 32768) != 0 ? false : z2;
        BotUiExtras botUiExtras2 = (i & 65536) != 0 ? BotUiExtras.Nothing.EZpvd : botUiExtras;
        if ((i & 131072) != 0) {
            planetBotMetadata2 = new PlanetBotMetadata((String) null, (List) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 32767, (DefaultConstructorMarker) null);
        } else {
            planetBotMetadata2 = planetBotMetadata;
        }
        this(str10, str11, str12, plain, str13, str14, textColor2, str15, str16, str17, z3, listAhwBna, listAhwBna2, str18, botDisplayType2, z4, botUiExtras2, planetBotMetadata2);
    }
}
