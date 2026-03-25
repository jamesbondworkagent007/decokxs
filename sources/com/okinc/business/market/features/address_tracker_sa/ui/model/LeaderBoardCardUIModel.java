package com.okinc.business.market.features.address_tracker_sa.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardCardUIModel implements Parcelable {
    public static final String COPY_TRADE_TYPE = "COPY_TRADE_TYPE";
    public static final String NORMAL_TYPE = "NORMAL_TYPE";
    public static final String RECOMMENDATION_TYPE = "RECOMMENDATION_TYPE";
    private final String accountName;
    private String addressAlias;
    private final String addressDisplayColorHex;
    private final String chainId;
    private final String chainLogoUrl;
    private final List<ChartDataUIItem> chartItems;
    private final String emoji;
    private final String id;
    private boolean isBookmarked;
    private final boolean isSelected;
    private final String kolTwitterLink;
    private final String lastTime;
    private final String periodType;
    private final String pnlAmount;
    private final String roiPercentage;
    private final String tokenBalance;
    private final String tokenPrice;
    private final int transactions;
    private final String type;
    private final String walletAddress;
    private final String walletLogoUrl;
    private final List<Integer> winLossToken;
    private final String winRatePercentage;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LeaderBoardCardUIModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LeaderBoardCardUIModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeaderBoardCardUIModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            String string7 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(ChartDataUIItem.CREATOR.createFromParcel(parcel));
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            while (i != i4) {
                arrayList2.add(Integer.valueOf(parcel.readInt()));
                i++;
                i4 = i4;
            }
            return new LeaderBoardCardUIModel(string, string2, string3, string4, string5, string6, z, string7, z2, arrayList, string8, string9, string10, string11, string12, string13, string14, arrayList2, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeaderBoardCardUIModel[] newArray(int i) {
            return new LeaderBoardCardUIModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LeaderBoardCardUIModel() {
        this(null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 8388607, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChartDataUIItem> component10() {
        return this.chartItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.pnlAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.roiPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.winRatePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component18() {
        return this.winLossToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.transactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.lastTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.periodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.addressDisplayColorHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.kolTwitterLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isBookmarked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardCardUIModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, boolean z2, @NotNull List<ChartDataUIItem> list, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull List<Integer> list2, int i, @NotNull String str15, @NotNull String str16, @NotNull String str17, String str18) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new LeaderBoardCardUIModel(str, str2, str3, str4, str5, str6, z, str7, z2, list, str8, str9, str10, str11, str12, str13, str14, list2, i, str15, str16, str17, str18);
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
        if (!(obj instanceof LeaderBoardCardUIModel)) {
            return false;
        }
        LeaderBoardCardUIModel leaderBoardCardUIModel = (LeaderBoardCardUIModel) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) leaderBoardCardUIModel.id) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) leaderBoardCardUIModel.walletAddress) && Intrinsics.EZpvd((Object) this.walletLogoUrl, (Object) leaderBoardCardUIModel.walletLogoUrl) && Intrinsics.EZpvd((Object) this.kolTwitterLink, (Object) leaderBoardCardUIModel.kolTwitterLink) && Intrinsics.EZpvd((Object) this.addressAlias, (Object) leaderBoardCardUIModel.addressAlias) && Intrinsics.EZpvd((Object) this.accountName, (Object) leaderBoardCardUIModel.accountName) && this.isBookmarked == leaderBoardCardUIModel.isBookmarked && Intrinsics.EZpvd((Object) this.type, (Object) leaderBoardCardUIModel.type) && this.isSelected == leaderBoardCardUIModel.isSelected && Intrinsics.EZpvd(this.chartItems, leaderBoardCardUIModel.chartItems) && Intrinsics.EZpvd((Object) this.chainId, (Object) leaderBoardCardUIModel.chainId) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) leaderBoardCardUIModel.chainLogoUrl) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) leaderBoardCardUIModel.tokenPrice) && Intrinsics.EZpvd((Object) this.tokenBalance, (Object) leaderBoardCardUIModel.tokenBalance) && Intrinsics.EZpvd((Object) this.pnlAmount, (Object) leaderBoardCardUIModel.pnlAmount) && Intrinsics.EZpvd((Object) this.roiPercentage, (Object) leaderBoardCardUIModel.roiPercentage) && Intrinsics.EZpvd((Object) this.winRatePercentage, (Object) leaderBoardCardUIModel.winRatePercentage) && Intrinsics.EZpvd(this.winLossToken, leaderBoardCardUIModel.winLossToken) && this.transactions == leaderBoardCardUIModel.transactions && Intrinsics.EZpvd((Object) this.lastTime, (Object) leaderBoardCardUIModel.lastTime) && Intrinsics.EZpvd((Object) this.periodType, (Object) leaderBoardCardUIModel.periodType) && Intrinsics.EZpvd((Object) this.emoji, (Object) leaderBoardCardUIModel.emoji) && Intrinsics.EZpvd((Object) this.addressDisplayColorHex, (Object) leaderBoardCardUIModel.addressDisplayColorHex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressAlias() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressDisplayColorHex() {
        return this.addressDisplayColorHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChartDataUIItem> getChartItems() {
        return this.chartItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmoji() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKolTwitterLink() {
        return this.kolTwitterLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastTime() {
        return this.lastTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriodType() {
        return this.periodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlAmount() {
        return this.pnlAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRoiPercentage() {
        return this.roiPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenBalance() {
        return this.tokenBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrice() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransactions() {
        return this.transactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletLogoUrl() {
        return this.walletLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getWinLossToken() {
        return this.winLossToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWinRatePercentage() {
        return this.winRatePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.walletAddress.hashCode();
        int iHashCode3 = this.walletLogoUrl.hashCode();
        int iHashCode4 = this.kolTwitterLink.hashCode();
        int iHashCode5 = this.addressAlias.hashCode();
        int iHashCode6 = this.accountName.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isBookmarked);
        int iHashCode8 = this.type.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isSelected);
        int iHashCode10 = this.chartItems.hashCode();
        int iHashCode11 = this.chainId.hashCode();
        int iHashCode12 = this.chainLogoUrl.hashCode();
        int iHashCode13 = this.tokenPrice.hashCode();
        int iHashCode14 = this.tokenBalance.hashCode();
        int iHashCode15 = this.pnlAmount.hashCode();
        int iHashCode16 = this.roiPercentage.hashCode();
        int iHashCode17 = this.winRatePercentage.hashCode();
        int iHashCode18 = this.winLossToken.hashCode();
        int iHashCode19 = Integer.hashCode(this.transactions);
        int iHashCode20 = this.lastTime.hashCode();
        int iHashCode21 = this.periodType.hashCode();
        int iHashCode22 = this.emoji.hashCode();
        String str = this.addressDisplayColorHex;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBookmarked() {
        return this.isBookmarked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressAlias(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.addressAlias = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBookmarked(boolean z) {
        this.isBookmarked = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LeaderBoardCardUIModel(id=" + this.id + ", walletAddress=" + this.walletAddress + ", walletLogoUrl=" + this.walletLogoUrl + ", kolTwitterLink=" + this.kolTwitterLink + ", addressAlias=" + this.addressAlias + ", accountName=" + this.accountName + ", isBookmarked=" + this.isBookmarked + ", type=" + this.type + ", isSelected=" + this.isSelected + ", chartItems=" + this.chartItems + ", chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", tokenPrice=" + this.tokenPrice + ", tokenBalance=" + this.tokenBalance + ", pnlAmount=" + this.pnlAmount + ", roiPercentage=" + this.roiPercentage + ", winRatePercentage=" + this.winRatePercentage + ", winLossToken=" + this.winLossToken + ", transactions=" + this.transactions + ", lastTime=" + this.lastTime + ", periodType=" + this.periodType + ", emoji=" + this.emoji + ", addressDisplayColorHex=" + this.addressDisplayColorHex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.walletAddress);
        parcel.writeString(this.walletLogoUrl);
        parcel.writeString(this.kolTwitterLink);
        parcel.writeString(this.addressAlias);
        parcel.writeString(this.accountName);
        parcel.writeInt(this.isBookmarked ? 1 : 0);
        parcel.writeString(this.type);
        parcel.writeInt(this.isSelected ? 1 : 0);
        List<ChartDataUIItem> list = this.chartItems;
        parcel.writeInt(list.size());
        Iterator<ChartDataUIItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainLogoUrl);
        parcel.writeString(this.tokenPrice);
        parcel.writeString(this.tokenBalance);
        parcel.writeString(this.pnlAmount);
        parcel.writeString(this.roiPercentage);
        parcel.writeString(this.winRatePercentage);
        List<Integer> list2 = this.winLossToken;
        parcel.writeInt(list2.size());
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeInt(this.transactions);
        parcel.writeString(this.lastTime);
        parcel.writeString(this.periodType);
        parcel.writeString(this.emoji);
        parcel.writeString(this.addressDisplayColorHex);
    }

    public LeaderBoardCardUIModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, boolean z2, @NotNull List<ChartDataUIItem> list, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull List<Integer> list2, int i, @NotNull String str15, @NotNull String str16, @NotNull String str17, String str18) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.id = str;
        this.walletAddress = str2;
        this.walletLogoUrl = str3;
        this.kolTwitterLink = str4;
        this.addressAlias = str5;
        this.accountName = str6;
        this.isBookmarked = z;
        this.type = str7;
        this.isSelected = z2;
        this.chartItems = list;
        this.chainId = str8;
        this.chainLogoUrl = str9;
        this.tokenPrice = str10;
        this.tokenBalance = str11;
        this.pnlAmount = str12;
        this.roiPercentage = str13;
        this.winRatePercentage = str14;
        this.winLossToken = list2;
        this.transactions = i;
        this.lastTime = str15;
        this.periodType = str16;
        this.emoji = str17;
        this.addressDisplayColorHex = str18;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x010d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: SGET  A[WRAPPED] com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel.COPY_TRADE_TYPE java.lang.String) : (r32v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r33v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004d: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:29)) : (r34v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x009c: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a0: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:37)) : (r42v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r43v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r48v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r48v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.util.List<com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LeaderBoardCardUIModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, List list, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list2, int i, String str15, String str16, String str17, String str18, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? COPY_TRADE_TYPE : str7, (i2 & 256) != 0 ? true : z2, (i2 & 512) != 0 ? yDY.AhwBna() : list, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? "" : str11, (i2 & 16384) != 0 ? "" : str12, (i2 & 32768) != 0 ? "" : str13, (i2 & 65536) != 0 ? "" : str14, (i2 & 131072) != 0 ? yDY.AhwBna() : list2, (i2 & 262144) != 0 ? 0 : i, (i2 & 524288) != 0 ? "" : str15, (i2 & 1048576) != 0 ? "" : str16, (i2 & 2097152) != 0 ? "" : str17, (i2 & 4194304) != 0 ? null : str18);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
