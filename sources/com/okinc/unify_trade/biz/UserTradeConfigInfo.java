package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class UserTradeConfigInfo {
    private static final KSerializer<Object>[] $childSerializers;
    private final String acctLv;
    private String acctStpMode;
    private final boolean autoLoan;
    private String bonus;
    private String bonusCcy;
    private final String ctIsoMode;
    private boolean enableSpotBorrow;
    private boolean enableTradeBorrowModeAutoRepay;
    private String equityPerpDisclosure;
    private final boolean exist;
    private String firstTradeTime;
    private String limitOrderNotice;
    private String liquidationGear;
    private String marketOrderNotice;
    private final String maxLevel;
    private final String mgnIsoMode;
    private final String opAuth;
    private final boolean opQuote;
    private String orderNotice;
    private final String posMode;
    private String rateType;
    private String reduceOnlyNotice;
    private final int roleType;
    private String spotFeeCoinType;
    private int spotRoleType;
    private List<String> spotTraderInsts;
    private String stgyType;
    private final List<String> traderInsts;
    private String usdLinearSettleCcy;
    private List<String> usdLinearSettleCcyList;
    private final boolean vipLoan;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserTradeConfigInfo() {
        this((String) null, (String) null, (String) null, false, false, false, (String) null, false, (String) null, (String) null, 0, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (List) null, (String) null, false, false, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.mgnIsoMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.roleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component12() {
        return this.traderInsts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.liquidationGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.firstTradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.orderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.limitOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.reduceOnlyNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.marketOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.spotFeeCoinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.spotRoleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component21() {
        return this.spotTraderInsts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.acctStpMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.enableSpotBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.enableTradeBorrowModeAutoRepay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.usdLinearSettleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component26() {
        return this.usdLinearSettleCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.stgyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.bonusCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.bonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.posMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.equityPerpDisclosure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.autoLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.exist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.opQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.opAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.vipLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ctIsoMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserTradeConfigInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, boolean z3, @NotNull String str4, boolean z4, @NotNull String str5, @NotNull String str6, int i, List<String> list, @NotNull String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, List<String> list2, String str14, boolean z5, boolean z6, String str15, List<String> list3, String str16, String str17, String str18, String str19, String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new UserTradeConfigInfo(str, str2, str3, z, z2, z3, str4, z4, str5, str6, i, list, str7, str8, str9, str10, str11, str12, str13, i2, list2, str14, z5, z6, str15, list3, str16, str17, str18, str19, str20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTradeConfigInfo)) {
            return false;
        }
        UserTradeConfigInfo userTradeConfigInfo = (UserTradeConfigInfo) obj;
        return Intrinsics.EZpvd((Object) this.acctLv, (Object) userTradeConfigInfo.acctLv) && Intrinsics.EZpvd((Object) this.maxLevel, (Object) userTradeConfigInfo.maxLevel) && Intrinsics.EZpvd((Object) this.posMode, (Object) userTradeConfigInfo.posMode) && this.autoLoan == userTradeConfigInfo.autoLoan && this.exist == userTradeConfigInfo.exist && this.opQuote == userTradeConfigInfo.opQuote && Intrinsics.EZpvd((Object) this.opAuth, (Object) userTradeConfigInfo.opAuth) && this.vipLoan == userTradeConfigInfo.vipLoan && Intrinsics.EZpvd((Object) this.ctIsoMode, (Object) userTradeConfigInfo.ctIsoMode) && Intrinsics.EZpvd((Object) this.mgnIsoMode, (Object) userTradeConfigInfo.mgnIsoMode) && this.roleType == userTradeConfigInfo.roleType && Intrinsics.EZpvd(this.traderInsts, userTradeConfigInfo.traderInsts) && Intrinsics.EZpvd((Object) this.liquidationGear, (Object) userTradeConfigInfo.liquidationGear) && Intrinsics.EZpvd((Object) this.firstTradeTime, (Object) userTradeConfigInfo.firstTradeTime) && Intrinsics.EZpvd((Object) this.orderNotice, (Object) userTradeConfigInfo.orderNotice) && Intrinsics.EZpvd((Object) this.limitOrderNotice, (Object) userTradeConfigInfo.limitOrderNotice) && Intrinsics.EZpvd((Object) this.reduceOnlyNotice, (Object) userTradeConfigInfo.reduceOnlyNotice) && Intrinsics.EZpvd((Object) this.marketOrderNotice, (Object) userTradeConfigInfo.marketOrderNotice) && Intrinsics.EZpvd((Object) this.spotFeeCoinType, (Object) userTradeConfigInfo.spotFeeCoinType) && this.spotRoleType == userTradeConfigInfo.spotRoleType && Intrinsics.EZpvd(this.spotTraderInsts, userTradeConfigInfo.spotTraderInsts) && Intrinsics.EZpvd((Object) this.acctStpMode, (Object) userTradeConfigInfo.acctStpMode) && this.enableSpotBorrow == userTradeConfigInfo.enableSpotBorrow && this.enableTradeBorrowModeAutoRepay == userTradeConfigInfo.enableTradeBorrowModeAutoRepay && Intrinsics.EZpvd((Object) this.usdLinearSettleCcy, (Object) userTradeConfigInfo.usdLinearSettleCcy) && Intrinsics.EZpvd(this.usdLinearSettleCcyList, userTradeConfigInfo.usdLinearSettleCcyList) && Intrinsics.EZpvd((Object) this.stgyType, (Object) userTradeConfigInfo.stgyType) && Intrinsics.EZpvd((Object) this.bonusCcy, (Object) userTradeConfigInfo.bonusCcy) && Intrinsics.EZpvd((Object) this.bonus, (Object) userTradeConfigInfo.bonus) && Intrinsics.EZpvd((Object) this.rateType, (Object) userTradeConfigInfo.rateType) && Intrinsics.EZpvd((Object) this.equityPerpDisclosure, (Object) userTradeConfigInfo.equityPerpDisclosure);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctLv() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctStpMode() {
        return this.acctStpMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoLoan() {
        return this.autoLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBonus() {
        return this.bonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBonusCcy() {
        return this.bonusCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtIsoMode() {
        return this.ctIsoMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableSpotBorrow() {
        return this.enableSpotBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableTradeBorrowModeAutoRepay() {
        return this.enableTradeBorrowModeAutoRepay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEquityPerpDisclosure() {
        return this.equityPerpDisclosure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExist() {
        return this.exist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstTradeTime() {
        return this.firstTradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderNotice() {
        return this.limitOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidationGear() {
        return this.liquidationGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketOrderNotice() {
        return this.marketOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLevel() {
        return this.maxLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnIsoMode() {
        return this.mgnIsoMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpAuth() {
        return this.opAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOpQuote() {
        return this.opQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderNotice() {
        return this.orderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosMode() {
        return this.posMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnlyNotice() {
        return this.reduceOnlyNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRoleType() {
        return this.roleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotFeeCoinType() {
        return this.spotFeeCoinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSpotRoleType() {
        return this.spotRoleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSpotTraderInsts() {
        return this.spotTraderInsts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyType() {
        return this.stgyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTraderInsts() {
        return this.traderInsts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdLinearSettleCcy() {
        return this.usdLinearSettleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getUsdLinearSettleCcyList() {
        return this.usdLinearSettleCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getVipLoan() {
        return this.vipLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.acctLv.hashCode();
        int iHashCode2 = this.maxLevel.hashCode();
        int iHashCode3 = this.posMode.hashCode();
        int iHashCode4 = Boolean.hashCode(this.autoLoan);
        int iHashCode5 = Boolean.hashCode(this.exist);
        int iHashCode6 = Boolean.hashCode(this.opQuote);
        int iHashCode7 = this.opAuth.hashCode();
        int iHashCode8 = Boolean.hashCode(this.vipLoan);
        int iHashCode9 = this.ctIsoMode.hashCode();
        int iHashCode10 = this.mgnIsoMode.hashCode();
        int iHashCode11 = Integer.hashCode(this.roleType);
        List<String> list = this.traderInsts;
        int iHashCode12 = list == null ? 0 : list.hashCode();
        int iHashCode13 = this.liquidationGear.hashCode();
        String str = this.firstTradeTime;
        int iHashCode14 = str == null ? 0 : str.hashCode();
        String str2 = this.orderNotice;
        int iHashCode15 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.limitOrderNotice;
        int iHashCode16 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.reduceOnlyNotice;
        int iHashCode17 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.marketOrderNotice;
        int iHashCode18 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.spotFeeCoinType;
        int iHashCode19 = str6 == null ? 0 : str6.hashCode();
        int iHashCode20 = Integer.hashCode(this.spotRoleType);
        List<String> list2 = this.spotTraderInsts;
        int iHashCode21 = list2 == null ? 0 : list2.hashCode();
        String str7 = this.acctStpMode;
        int iHashCode22 = str7 == null ? 0 : str7.hashCode();
        int iHashCode23 = Boolean.hashCode(this.enableSpotBorrow);
        int iHashCode24 = Boolean.hashCode(this.enableTradeBorrowModeAutoRepay);
        String str8 = this.usdLinearSettleCcy;
        int iHashCode25 = str8 == null ? 0 : str8.hashCode();
        List<String> list3 = this.usdLinearSettleCcyList;
        int iHashCode26 = list3 == null ? 0 : list3.hashCode();
        String str9 = this.stgyType;
        int iHashCode27 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.bonusCcy;
        int iHashCode28 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.bonus;
        int iHashCode29 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.rateType;
        int iHashCode30 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.equityPerpDisclosure;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (str13 == null ? 0 : str13.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcctStpMode(String str) {
        this.acctStpMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBonus(String str) {
        this.bonus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBonusCcy(String str) {
        this.bonusCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableSpotBorrow(boolean z) {
        this.enableSpotBorrow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableTradeBorrowModeAutoRepay(boolean z) {
        this.enableTradeBorrowModeAutoRepay = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEquityPerpDisclosure(String str) {
        this.equityPerpDisclosure = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstTradeTime(String str) {
        this.firstTradeTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimitOrderNotice(String str) {
        this.limitOrderNotice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiquidationGear(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liquidationGear = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketOrderNotice(String str) {
        this.marketOrderNotice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderNotice(String str) {
        this.orderNotice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateType(String str) {
        this.rateType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnlyNotice(String str) {
        this.reduceOnlyNotice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotFeeCoinType(String str) {
        this.spotFeeCoinType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotRoleType(int i) {
        this.spotRoleType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotTraderInsts(List<String> list) {
        this.spotTraderInsts = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyType(String str) {
        this.stgyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdLinearSettleCcy(String str) {
        this.usdLinearSettleCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdLinearSettleCcyList(List<String> list) {
        this.usdLinearSettleCcyList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserTradeConfigInfo(acctLv=" + this.acctLv + ", maxLevel=" + this.maxLevel + ", posMode=" + this.posMode + ", autoLoan=" + this.autoLoan + ", exist=" + this.exist + ", opQuote=" + this.opQuote + ", opAuth=" + this.opAuth + ", vipLoan=" + this.vipLoan + ", ctIsoMode=" + this.ctIsoMode + ", mgnIsoMode=" + this.mgnIsoMode + ", roleType=" + this.roleType + ", traderInsts=" + this.traderInsts + ", liquidationGear=" + this.liquidationGear + ", firstTradeTime=" + this.firstTradeTime + ", orderNotice=" + this.orderNotice + ", limitOrderNotice=" + this.limitOrderNotice + ", reduceOnlyNotice=" + this.reduceOnlyNotice + ", marketOrderNotice=" + this.marketOrderNotice + ", spotFeeCoinType=" + this.spotFeeCoinType + ", spotRoleType=" + this.spotRoleType + ", spotTraderInsts=" + this.spotTraderInsts + ", acctStpMode=" + this.acctStpMode + ", enableSpotBorrow=" + this.enableSpotBorrow + ", enableTradeBorrowModeAutoRepay=" + this.enableTradeBorrowModeAutoRepay + ", usdLinearSettleCcy=" + this.usdLinearSettleCcy + ", usdLinearSettleCcyList=" + this.usdLinearSettleCcyList + ", stgyType=" + this.stgyType + ", bonusCcy=" + this.bonusCcy + ", bonus=" + this.bonus + ", rateType=" + this.rateType + ", equityPerpDisclosure=" + this.equityPerpDisclosure + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UserTradeConfigInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserTradeConfigInfo> serializer() {
            return UserTradeConfigInfo$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null};
    }

    public /* synthetic */ UserTradeConfigInfo(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, String str5, String str6, int i2, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i3, List list2, String str14, boolean z5, boolean z6, String str15, List list3, String str16, String str17, String str18, String str19, String str20, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.acctLv = "";
        } else {
            this.acctLv = str;
        }
        if ((i & 2) == 0) {
            this.maxLevel = "";
        } else {
            this.maxLevel = str2;
        }
        if ((i & 4) == 0) {
            this.posMode = "";
        } else {
            this.posMode = str3;
        }
        if ((i & 8) == 0) {
            this.autoLoan = false;
        } else {
            this.autoLoan = z;
        }
        if ((i & 16) == 0) {
            this.exist = false;
        } else {
            this.exist = z2;
        }
        if ((i & 32) == 0) {
            this.opQuote = false;
        } else {
            this.opQuote = z3;
        }
        if ((i & 64) == 0) {
            this.opAuth = "";
        } else {
            this.opAuth = str4;
        }
        if ((i & 128) == 0) {
            this.vipLoan = false;
        } else {
            this.vipLoan = z4;
        }
        if ((i & 256) == 0) {
            this.ctIsoMode = "";
        } else {
            this.ctIsoMode = str5;
        }
        if ((i & 512) == 0) {
            this.mgnIsoMode = "";
        } else {
            this.mgnIsoMode = str6;
        }
        if ((i & 1024) == 0) {
            this.roleType = 0;
        } else {
            this.roleType = i2;
        }
        if ((i & 2048) == 0) {
            this.traderInsts = null;
        } else {
            this.traderInsts = list;
        }
        if ((i & 4096) == 0) {
            this.liquidationGear = "";
        } else {
            this.liquidationGear = str7;
        }
        if ((i & 8192) == 0) {
            this.firstTradeTime = "";
        } else {
            this.firstTradeTime = str8;
        }
        if ((i & 16384) == 0) {
            this.orderNotice = "";
        } else {
            this.orderNotice = str9;
        }
        if ((32768 & i) == 0) {
            this.limitOrderNotice = "";
        } else {
            this.limitOrderNotice = str10;
        }
        if ((65536 & i) == 0) {
            this.reduceOnlyNotice = "";
        } else {
            this.reduceOnlyNotice = str11;
        }
        if ((131072 & i) == 0) {
            this.marketOrderNotice = "";
        } else {
            this.marketOrderNotice = str12;
        }
        if ((262144 & i) == 0) {
            this.spotFeeCoinType = "";
        } else {
            this.spotFeeCoinType = str13;
        }
        if ((524288 & i) == 0) {
            this.spotRoleType = 0;
        } else {
            this.spotRoleType = i3;
        }
        if ((1048576 & i) == 0) {
            this.spotTraderInsts = null;
        } else {
            this.spotTraderInsts = list2;
        }
        if ((2097152 & i) == 0) {
            this.acctStpMode = "";
        } else {
            this.acctStpMode = str14;
        }
        if ((4194304 & i) == 0) {
            this.enableSpotBorrow = false;
        } else {
            this.enableSpotBorrow = z5;
        }
        if ((8388608 & i) == 0) {
            this.enableTradeBorrowModeAutoRepay = false;
        } else {
            this.enableTradeBorrowModeAutoRepay = z6;
        }
        if ((16777216 & i) == 0) {
            this.usdLinearSettleCcy = null;
        } else {
            this.usdLinearSettleCcy = str15;
        }
        if ((33554432 & i) == 0) {
            this.usdLinearSettleCcyList = null;
        } else {
            this.usdLinearSettleCcyList = list3;
        }
        if ((67108864 & i) == 0) {
            this.stgyType = null;
        } else {
            this.stgyType = str16;
        }
        if ((134217728 & i) == 0) {
            this.bonusCcy = null;
        } else {
            this.bonusCcy = str17;
        }
        if ((268435456 & i) == 0) {
            this.bonus = null;
        } else {
            this.bonus = str18;
        }
        if ((536870912 & i) == 0) {
            this.rateType = null;
        } else {
            this.rateType = str19;
        }
        if ((i & 1073741824) == 0) {
            this.equityPerpDisclosure = null;
        } else {
            this.equityPerpDisclosure = str20;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UserTradeConfigInfo userTradeConfigInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.acctLv, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, userTradeConfigInfo.acctLv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.maxLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, userTradeConfigInfo.maxLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.posMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, userTradeConfigInfo.posMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || userTradeConfigInfo.autoLoan) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, userTradeConfigInfo.autoLoan);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || userTradeConfigInfo.exist) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, userTradeConfigInfo.exist);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || userTradeConfigInfo.opQuote) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, userTradeConfigInfo.opQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.opAuth, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, userTradeConfigInfo.opAuth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || userTradeConfigInfo.vipLoan) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, userTradeConfigInfo.vipLoan);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.ctIsoMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, userTradeConfigInfo.ctIsoMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.mgnIsoMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, userTradeConfigInfo.mgnIsoMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || userTradeConfigInfo.roleType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, userTradeConfigInfo.roleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || userTradeConfigInfo.traderInsts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], userTradeConfigInfo.traderInsts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.liquidationGear, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, userTradeConfigInfo.liquidationGear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.firstTradeTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, userTradeConfigInfo.firstTradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.orderNotice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, userTradeConfigInfo.orderNotice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.limitOrderNotice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, userTradeConfigInfo.limitOrderNotice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.reduceOnlyNotice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, userTradeConfigInfo.reduceOnlyNotice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.marketOrderNotice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, userTradeConfigInfo.marketOrderNotice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.spotFeeCoinType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, userTradeConfigInfo.spotFeeCoinType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || userTradeConfigInfo.spotRoleType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 19, userTradeConfigInfo.spotRoleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || userTradeConfigInfo.spotTraderInsts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, kSerializerArr[20], userTradeConfigInfo.spotTraderInsts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) userTradeConfigInfo.acctStpMode, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, userTradeConfigInfo.acctStpMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || userTradeConfigInfo.enableSpotBorrow) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, userTradeConfigInfo.enableSpotBorrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || userTradeConfigInfo.enableTradeBorrowModeAutoRepay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, userTradeConfigInfo.enableTradeBorrowModeAutoRepay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || userTradeConfigInfo.usdLinearSettleCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, userTradeConfigInfo.usdLinearSettleCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || userTradeConfigInfo.usdLinearSettleCcyList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, kSerializerArr[25], userTradeConfigInfo.usdLinearSettleCcyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || userTradeConfigInfo.stgyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, userTradeConfigInfo.stgyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || userTradeConfigInfo.bonusCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, userTradeConfigInfo.bonusCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || userTradeConfigInfo.bonus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, userTradeConfigInfo.bonus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || userTradeConfigInfo.rateType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, userTradeConfigInfo.rateType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) && userTradeConfigInfo.equityPerpDisclosure == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, userTradeConfigInfo.equityPerpDisclosure);
    }

    public UserTradeConfigInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, boolean z3, @NotNull String str4, boolean z4, @NotNull String str5, @NotNull String str6, int i, List<String> list, @NotNull String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, List<String> list2, String str14, boolean z5, boolean z6, String str15, List<String> list3, String str16, String str17, String str18, String str19, String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.acctLv = str;
        this.maxLevel = str2;
        this.posMode = str3;
        this.autoLoan = z;
        this.exist = z2;
        this.opQuote = z3;
        this.opAuth = str4;
        this.vipLoan = z4;
        this.ctIsoMode = str5;
        this.mgnIsoMode = str6;
        this.roleType = i;
        this.traderInsts = list;
        this.liquidationGear = str7;
        this.firstTradeTime = str8;
        this.orderNotice = str9;
        this.limitOrderNotice = str10;
        this.reduceOnlyNotice = str11;
        this.marketOrderNotice = str12;
        this.spotFeeCoinType = str13;
        this.spotRoleType = i2;
        this.spotTraderInsts = list2;
        this.acctStpMode = str14;
        this.enableSpotBorrow = z5;
        this.enableTradeBorrowModeAutoRepay = z6;
        this.usdLinearSettleCcy = str15;
        this.usdLinearSettleCcyList = list3;
        this.stgyType = str16;
        this.bonusCcy = str17;
        this.bonus = str18;
        this.rateType = str19;
        this.equityPerpDisclosure = str20;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x016f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r38v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r40v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0054: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r43v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005c: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r44v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r52v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r53v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r55v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00da: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r56v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r58v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r64v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r64v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List<java.lang.String>, java.lang.String, boolean, boolean, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:137) call: com.okinc.unify_trade.biz.UserTradeConfigInfo.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, java.lang.String, boolean, boolean, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UserTradeConfigInfo(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, String str5, String str6, int i, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, List list2, String str14, boolean z5, boolean z6, String str15, List list3, String str16, String str17, String str18, String str19, String str20, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? false : z4, (i3 & 256) != 0 ? "" : str5, (i3 & 512) != 0 ? "" : str6, (i3 & 1024) != 0 ? 0 : i, (i3 & 2048) != 0 ? null : list, (i3 & 4096) != 0 ? "" : str7, (i3 & 8192) != 0 ? "" : str8, (i3 & 16384) != 0 ? "" : str9, (i3 & 32768) != 0 ? "" : str10, (i3 & 65536) != 0 ? "" : str11, (i3 & 131072) != 0 ? "" : str12, (i3 & 262144) != 0 ? "" : str13, (i3 & 524288) != 0 ? 0 : i2, (i3 & 1048576) != 0 ? null : list2, (i3 & 2097152) != 0 ? "" : str14, (i3 & 4194304) != 0 ? false : z5, (i3 & 8388608) != 0 ? false : z6, (i3 & 16777216) != 0 ? null : str15, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : list3, (i3 & 67108864) != 0 ? null : str16, (i3 & 134217728) != 0 ? null : str17, (i3 & 268435456) != 0 ? null : str18, (i3 & 536870912) != 0 ? null : str19, (i3 & 1073741824) != 0 ? null : str20);
    }
}
