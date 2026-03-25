package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawInfoResp {
    public static final int $stable = 8;
    private int amountMaxPrecision;
    private ArrayList<Amount> amounts;
    private ArrayList<Amount> amountsUSDT;
    private final Boolean autoEarnEnabled;
    private final Boolean autoEarnSupported;
    private final String borrowLimitReason;
    private String dailyFree;
    private String dailyLimitTotal;
    private final CharSequence displayNumberText;
    private String displaySingleMin;
    private final String feeCcy;
    private final Integer feeCcyId;
    private String feeDefault;
    private String feeMin;
    private String invoiceDailyMax;
    private String invoiceSingleMax;
    private String invoiceSingleMin;
    private boolean isBorrow;
    private Boolean isContractAddress;
    private String maxWdEx;
    private boolean needTag;
    private final Boolean passkeyForWithdraw;
    private final Boolean passkeyIntroShown;
    private final String plainNumericText;
    private String price;
    private String singleMin;
    private SpecialField specialField;
    private final List<TipModel> tipModels;
    private String totalUSDT;
    private final List<WithdrawWalletAccount> web3WalletAddresses;
    private String withdrawTotalAsset;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawInfoResp() {
        this(null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.singleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maxWdEx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.invoiceDailyMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.invoiceSingleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.invoiceSingleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Amount> component14() {
        return this.amounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.withdrawTotalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.amountMaxPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Amount> component17() {
        return this.amountsUSDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.totalUSDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.isContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displaySingleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component21() {
        return this.passkeyIntroShown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component22() {
        return this.passkeyForWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawWalletAccount> component23() {
        return this.web3WalletAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TipModel> component24() {
        return this.tipModels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component26() {
        return this.feeCcyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component27() {
        return this.autoEarnEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component28() {
        return this.autoEarnSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component29() {
        return this.displayNumberText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.feeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.plainNumericText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.borrowLimitReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.feeDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.dailyLimitTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dailyFree;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField component8() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawInfoResp copy(String str, String str2, String str3, String str4, boolean z, String str5, String str6, SpecialField specialField, boolean z2, String str7, String str8, String str9, String str10, ArrayList<Amount> arrayList, String str11, int i, ArrayList<Amount> arrayList2, String str12, Boolean bool, String str13, Boolean bool2, Boolean bool3, List<WithdrawWalletAccount> list, List<TipModel> list2, String str14, Integer num, Boolean bool4, Boolean bool5, CharSequence charSequence, String str15, String str16) {
        return new WithdrawInfoResp(str, str2, str3, str4, z, str5, str6, specialField, z2, str7, str8, str9, str10, arrayList, str11, i, arrayList2, str12, bool, str13, bool2, bool3, list, list2, str14, num, bool4, bool5, charSequence, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawInfoResp)) {
            return false;
        }
        WithdrawInfoResp withdrawInfoResp = (WithdrawInfoResp) obj;
        return Intrinsics.EZpvd((Object) this.singleMin, (Object) withdrawInfoResp.singleMin) && Intrinsics.EZpvd((Object) this.displaySingleMin, (Object) withdrawInfoResp.displaySingleMin) && Intrinsics.EZpvd((Object) this.feeMin, (Object) withdrawInfoResp.feeMin) && Intrinsics.EZpvd((Object) this.feeDefault, (Object) withdrawInfoResp.feeDefault) && this.needTag == withdrawInfoResp.needTag && Intrinsics.EZpvd((Object) this.dailyLimitTotal, (Object) withdrawInfoResp.dailyLimitTotal) && Intrinsics.EZpvd((Object) this.dailyFree, (Object) withdrawInfoResp.dailyFree) && Intrinsics.EZpvd(this.specialField, withdrawInfoResp.specialField) && this.isBorrow == withdrawInfoResp.isBorrow && Intrinsics.EZpvd((Object) this.maxWdEx, (Object) withdrawInfoResp.maxWdEx) && Intrinsics.EZpvd((Object) this.invoiceDailyMax, (Object) withdrawInfoResp.invoiceDailyMax) && Intrinsics.EZpvd((Object) this.invoiceSingleMax, (Object) withdrawInfoResp.invoiceSingleMax) && Intrinsics.EZpvd((Object) this.invoiceSingleMin, (Object) withdrawInfoResp.invoiceSingleMin) && Intrinsics.EZpvd(this.amounts, withdrawInfoResp.amounts) && Intrinsics.EZpvd((Object) this.withdrawTotalAsset, (Object) withdrawInfoResp.withdrawTotalAsset) && this.amountMaxPrecision == withdrawInfoResp.amountMaxPrecision && Intrinsics.EZpvd(this.amountsUSDT, withdrawInfoResp.amountsUSDT) && Intrinsics.EZpvd((Object) this.totalUSDT, (Object) withdrawInfoResp.totalUSDT) && Intrinsics.EZpvd(this.isContractAddress, withdrawInfoResp.isContractAddress) && Intrinsics.EZpvd((Object) this.price, (Object) withdrawInfoResp.price) && Intrinsics.EZpvd(this.passkeyIntroShown, withdrawInfoResp.passkeyIntroShown) && Intrinsics.EZpvd(this.passkeyForWithdraw, withdrawInfoResp.passkeyForWithdraw) && Intrinsics.EZpvd(this.web3WalletAddresses, withdrawInfoResp.web3WalletAddresses) && Intrinsics.EZpvd(this.tipModels, withdrawInfoResp.tipModels) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) withdrawInfoResp.feeCcy) && Intrinsics.EZpvd(this.feeCcyId, withdrawInfoResp.feeCcyId) && Intrinsics.EZpvd(this.autoEarnEnabled, withdrawInfoResp.autoEarnEnabled) && Intrinsics.EZpvd(this.autoEarnSupported, withdrawInfoResp.autoEarnSupported) && Intrinsics.EZpvd(this.displayNumberText, withdrawInfoResp.displayNumberText) && Intrinsics.EZpvd((Object) this.plainNumericText, (Object) withdrawInfoResp.plainNumericText) && Intrinsics.EZpvd((Object) this.borrowLimitReason, (Object) withdrawInfoResp.borrowLimitReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAmountMaxPrecision() {
        return this.amountMaxPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Amount> getAmounts() {
        return this.amounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Amount> getAmountsUSDT() {
        return this.amountsUSDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoEarnEnabled() {
        return this.autoEarnEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoEarnSupported() {
        return this.autoEarnSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowLimitReason() {
        return this.borrowLimitReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyFree() {
        return this.dailyFree;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyLimitTotal() {
        return this.dailyLimitTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getDisplayNumberText() {
        return this.displayNumberText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplaySingleMin() {
        return this.displaySingleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeCcy() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFeeCcyId() {
        return this.feeCcyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeDefault() {
        return this.feeDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeMin() {
        return this.feeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvoiceDailyMax() {
        return this.invoiceDailyMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvoiceSingleMax() {
        return this.invoiceSingleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvoiceSingleMin() {
        return this.invoiceSingleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxWdEx() {
        return this.maxWdEx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTag() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPasskeyForWithdraw() {
        return this.passkeyForWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPasskeyIntroShown() {
        return this.passkeyIntroShown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlainNumericText() {
        return this.plainNumericText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleMin() {
        return this.singleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField getSpecialField() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TipModel> getTipModels() {
        return this.tipModels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalUSDT() {
        return this.totalUSDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawWalletAccount> getWeb3WalletAddresses() {
        return this.web3WalletAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawTotalAsset() {
        return this.withdrawTotalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.singleMin;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.displaySingleMin;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.feeMin;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.feeDefault;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        int iHashCode5 = Boolean.hashCode(this.needTag);
        String str5 = this.dailyLimitTotal;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.dailyFree;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        SpecialField specialField = this.specialField;
        int iHashCode8 = specialField == null ? 0 : specialField.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isBorrow);
        String str7 = this.maxWdEx;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.invoiceDailyMax;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.invoiceSingleMax;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.invoiceSingleMin;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        ArrayList<Amount> arrayList = this.amounts;
        int iHashCode14 = arrayList == null ? 0 : arrayList.hashCode();
        String str11 = this.withdrawTotalAsset;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        int iHashCode16 = Integer.hashCode(this.amountMaxPrecision);
        ArrayList<Amount> arrayList2 = this.amountsUSDT;
        int iHashCode17 = arrayList2 == null ? 0 : arrayList2.hashCode();
        String str12 = this.totalUSDT;
        int iHashCode18 = str12 == null ? 0 : str12.hashCode();
        Boolean bool = this.isContractAddress;
        int iHashCode19 = bool == null ? 0 : bool.hashCode();
        String str13 = this.price;
        int iHashCode20 = str13 == null ? 0 : str13.hashCode();
        Boolean bool2 = this.passkeyIntroShown;
        int iHashCode21 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.passkeyForWithdraw;
        int iHashCode22 = bool3 == null ? 0 : bool3.hashCode();
        List<WithdrawWalletAccount> list = this.web3WalletAddresses;
        int iHashCode23 = list == null ? 0 : list.hashCode();
        List<TipModel> list2 = this.tipModels;
        int iHashCode24 = list2 == null ? 0 : list2.hashCode();
        String str14 = this.feeCcy;
        int iHashCode25 = str14 == null ? 0 : str14.hashCode();
        Integer num = this.feeCcyId;
        int iHashCode26 = num == null ? 0 : num.hashCode();
        Boolean bool4 = this.autoEarnEnabled;
        int iHashCode27 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.autoEarnSupported;
        int iHashCode28 = bool5 == null ? 0 : bool5.hashCode();
        CharSequence charSequence = this.displayNumberText;
        int iHashCode29 = charSequence == null ? 0 : charSequence.hashCode();
        String str15 = this.plainNumericText;
        int iHashCode30 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.borrowLimitReason;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (str16 == null ? 0 : str16.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBorrow() {
        return this.isBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isContractAddress() {
        return this.isContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountMaxPrecision(int i) {
        this.amountMaxPrecision = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmounts(ArrayList<Amount> arrayList) {
        this.amounts = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountsUSDT(ArrayList<Amount> arrayList) {
        this.amountsUSDT = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBorrow(boolean z) {
        this.isBorrow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(Boolean bool) {
        this.isContractAddress = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDailyFree(String str) {
        this.dailyFree = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDailyLimitTotal(String str) {
        this.dailyLimitTotal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplaySingleMin(String str) {
        this.displaySingleMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeDefault(String str) {
        this.feeDefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeMin(String str) {
        this.feeMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoiceDailyMax(String str) {
        this.invoiceDailyMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoiceSingleMax(String str) {
        this.invoiceSingleMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoiceSingleMin(String str) {
        this.invoiceSingleMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxWdEx(String str) {
        this.maxWdEx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedTag(boolean z) {
        this.needTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleMin(String str) {
        this.singleMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpecialField(SpecialField specialField) {
        this.specialField = specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalUSDT(String str) {
        this.totalUSDT = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdrawTotalAsset(String str) {
        this.withdrawTotalAsset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String str = this.singleMin;
        String str2 = this.displaySingleMin;
        String str3 = this.feeMin;
        String str4 = this.feeDefault;
        boolean z = this.needTag;
        String str5 = this.dailyLimitTotal;
        String str6 = this.dailyFree;
        SpecialField specialField = this.specialField;
        boolean z2 = this.isBorrow;
        String str7 = this.maxWdEx;
        String str8 = this.invoiceDailyMax;
        String str9 = this.invoiceSingleMax;
        String str10 = this.invoiceSingleMin;
        ArrayList<Amount> arrayList = this.amounts;
        String str11 = this.withdrawTotalAsset;
        int i = this.amountMaxPrecision;
        ArrayList<Amount> arrayList2 = this.amountsUSDT;
        String str12 = this.totalUSDT;
        Boolean bool = this.isContractAddress;
        String str13 = this.price;
        Boolean bool2 = this.passkeyIntroShown;
        Boolean bool3 = this.passkeyForWithdraw;
        List<WithdrawWalletAccount> list = this.web3WalletAddresses;
        List<TipModel> list2 = this.tipModels;
        String str14 = this.feeCcy;
        Integer num = this.feeCcyId;
        Boolean bool4 = this.autoEarnEnabled;
        Boolean bool5 = this.autoEarnSupported;
        CharSequence charSequence = this.displayNumberText;
        return "WithdrawInfoResp(singleMin=" + str + ", displaySingleMin=" + str2 + ", feeMin=" + str3 + ", feeDefault=" + str4 + ", needTag=" + z + ", dailyLimitTotal=" + str5 + ", dailyFree=" + str6 + ", specialField=" + specialField + ", isBorrow=" + z2 + ", maxWdEx=" + str7 + ", invoiceDailyMax=" + str8 + ", invoiceSingleMax=" + str9 + ", invoiceSingleMin=" + str10 + ", amounts=" + arrayList + ", withdrawTotalAsset=" + str11 + ", amountMaxPrecision=" + i + ", amountsUSDT=" + arrayList2 + ", totalUSDT=" + str12 + ", isContractAddress=" + bool + ", price=" + str13 + ", passkeyIntroShown=" + bool2 + ", passkeyForWithdraw=" + bool3 + ", web3WalletAddresses=" + list + ", tipModels=" + list2 + ", feeCcy=" + str14 + ", feeCcyId=" + num + ", autoEarnEnabled=" + bool4 + ", autoEarnSupported=" + bool5 + ", displayNumberText=" + ((Object) charSequence) + ", plainNumericText=" + this.plainNumericText + ", borrowLimitReason=" + this.borrowLimitReason + ")";
    }

    public WithdrawInfoResp(String str, String str2, String str3, String str4, boolean z, String str5, String str6, SpecialField specialField, boolean z2, String str7, String str8, String str9, String str10, ArrayList<Amount> arrayList, String str11, int i, ArrayList<Amount> arrayList2, String str12, Boolean bool, String str13, Boolean bool2, Boolean bool3, List<WithdrawWalletAccount> list, List<TipModel> list2, String str14, Integer num, Boolean bool4, Boolean bool5, CharSequence charSequence, String str15, String str16) {
        this.singleMin = str;
        this.displaySingleMin = str2;
        this.feeMin = str3;
        this.feeDefault = str4;
        this.needTag = z;
        this.dailyLimitTotal = str5;
        this.dailyFree = str6;
        this.specialField = specialField;
        this.isBorrow = z2;
        this.maxWdEx = str7;
        this.invoiceDailyMax = str8;
        this.invoiceSingleMax = str9;
        this.invoiceSingleMin = str10;
        this.amounts = arrayList;
        this.withdrawTotalAsset = str11;
        this.amountMaxPrecision = i;
        this.amountsUSDT = arrayList2;
        this.totalUSDT = str12;
        this.isContractAddress = bool;
        this.price = str13;
        this.passkeyIntroShown = bool2;
        this.passkeyForWithdraw = bool3;
        this.web3WalletAddresses = list;
        this.tipModels = list2;
        this.feeCcy = str14;
        this.feeCcyId = num;
        this.autoEarnEnabled = bool4;
        this.autoEarnSupported = bool5;
        this.displayNumberText = charSequence;
        this.plainNumericText = str15;
        this.borrowLimitReason = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0176: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:com.okinc.assets.backend.api.model.SpecialField:?: TERNARY null = ((wrap:int:0x003b: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.SpecialField) : (r40v0 com.okinc.assets.backend.api.model.SpecialField))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r64v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r41v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x006a: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0070: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:39) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r46v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("-1.0") : (r47v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0082: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r48v0 int))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x008d: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0093: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:51) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r49v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r51v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00be: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r53v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r54v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r55v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00df: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r56v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) == (0 int)) ? (r57v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r58v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0102: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r59v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x010d: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r60v0 java.lang.Boolean))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0118: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("0") : (r61v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0125: ARITH (r64v0 int) & (536870912 int) A[WRAPPED]) == (0 int)) ? (r62v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012e: ARITH (r64v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.SpecialField, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.assets.backend.api.model.WithdrawInfoResp$Amount>, java.lang.String, int, java.util.ArrayList<com.okinc.assets.backend.api.model.WithdrawInfoResp$Amount>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List<com.okinc.assets.backend.api.model.WithdrawWalletAccount>, java.util.List<com.okinc.assets.backend.api.model.WithdrawInfoResp$TipModel>, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.CharSequence, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.assets.backend.api.model.WithdrawInfoResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.SpecialField, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, int, java.util.ArrayList, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.CharSequence, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawInfoResp(String str, String str2, String str3, String str4, boolean z, String str5, String str6, SpecialField specialField, boolean z2, String str7, String str8, String str9, String str10, ArrayList arrayList, String str11, int i, ArrayList arrayList2, String str12, Boolean bool, String str13, Boolean bool2, Boolean bool3, List list, List list2, String str14, Integer num, Boolean bool4, Boolean bool5, CharSequence charSequence, String str15, String str16, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : specialField, (i2 & 256) == 0 ? z2 : false, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : str10, (i2 & 8192) != 0 ? new ArrayList() : arrayList, (i2 & 16384) != 0 ? "-1.0" : str11, (i2 & 32768) != 0 ? 8 : i, (i2 & 65536) != 0 ? new ArrayList() : arrayList2, (i2 & 131072) != 0 ? "" : str12, (i2 & 262144) != 0 ? null : bool, (i2 & 524288) != 0 ? null : str13, (i2 & 1048576) != 0 ? null : bool2, (i2 & 2097152) != 0 ? null : bool3, (i2 & 4194304) != 0 ? null : list, (i2 & 8388608) != 0 ? null : list2, (i2 & 16777216) == 0 ? str14 : "", (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? -1 : num, (i2 & 67108864) != 0 ? null : bool4, (i2 & 134217728) != 0 ? null : bool5, (i2 & 268435456) != 0 ? "0" : charSequence, (i2 & 536870912) == 0 ? str15 : "0", (i2 & 1073741824) != 0 ? null : str16);
    }

    public static final class Amount implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Amount> CREATOR = new Creator();
        private String available;
        private int target;

        public static final class Creator implements Parcelable.Creator<Amount> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Amount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Amount(parcel.readString(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Amount[] newArray(int i) {
                return new Amount[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Amount() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Amount copy$default(Amount amount, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = amount.available;
            }
            if ((i2 & 2) != 0) {
                i = amount.target;
            }
            return amount.copy(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.available;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Amount copy(String str, int i) {
            return new Amount(str, i);
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
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return Intrinsics.EZpvd((Object) this.available, (Object) amount.available) && this.target == amount.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAvailable() {
            return this.available;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTarget() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.available;
            return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.target);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAvailable(String str) {
            this.available = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTarget(int i) {
            this.target = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Amount(available=" + this.available + ", target=" + this.target + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.available);
            parcel.writeInt(this.target);
        }

        public Amount(String str, int i) {
            this.available = str;
            this.target = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:79) call: com.okinc.assets.backend.api.model.WithdrawInfoResp.Amount.<init>(java.lang.String, int):void type: THIS */
        public /* synthetic */ Amount(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
        }
    }

    public static final class TipModel {
        public static final int $stable = 0;
        private final String link;
        private final Integer showPosition;
        private final Integer style;
        private final String tip;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TipModel() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TipModel copy$default(TipModel tipModel, String str, String str2, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tipModel.tip;
            }
            if ((i & 2) != 0) {
                str2 = tipModel.link;
            }
            if ((i & 4) != 0) {
                num = tipModel.showPosition;
            }
            if ((i & 8) != 0) {
                num2 = tipModel.style;
            }
            return tipModel.copy(str, str2, num, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.link;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component3() {
            return this.showPosition;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component4() {
            return this.style;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TipModel copy(String str, String str2, Integer num, Integer num2) {
            return new TipModel(str, str2, num, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TipModel)) {
                return false;
            }
            TipModel tipModel = (TipModel) obj;
            return Intrinsics.EZpvd((Object) this.tip, (Object) tipModel.tip) && Intrinsics.EZpvd((Object) this.link, (Object) tipModel.link) && Intrinsics.EZpvd(this.showPosition, tipModel.showPosition) && Intrinsics.EZpvd(this.style, tipModel.style);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLink() {
            return this.link;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getShowPosition() {
            return this.showPosition;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getStyle() {
            return this.style;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTip() {
            return this.tip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.tip;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.link;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.showPosition;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            Integer num2 = this.style;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TipModel(tip=" + this.tip + ", link=" + this.link + ", showPosition=" + this.showPosition + ", style=" + this.style + ")";
        }

        public TipModel(String str, String str2, Integer num, Integer num2) {
            this.tip = str;
            this.link = str2;
            this.showPosition = num;
            this.style = num2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:85) call: com.okinc.assets.backend.api.model.WithdrawInfoResp.TipModel.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
        public /* synthetic */ TipModel(String str, String str2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
        }
    }
}
