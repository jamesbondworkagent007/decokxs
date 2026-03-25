package o;

import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55890xsV implements InterfaceC54501xKt<BenefitDetails, java.util.ArrayList<ItemData>> {
    public StrategyConfigInfo KWHzl = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        this.KWHzl = strategyConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1296=8] */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:98:0x08fd  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<ItemData> KWHzl(@NotNull BenefitDetails benefitDetails) {
        Intrinsics.checkNotNullParameter(benefitDetails, "");
        java.util.ArrayList<ItemData> arrayList = new java.util.ArrayList<>();
        java.lang.String orderType = benefitDetails.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                if (orderType.equals("spot_dca")) {
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.accept), benefitDetails.getTotalCycleProfit(), false, benefitDetails.getTotalCycleProfitColor(), (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.OqFWZa), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777172, (DefaultConstructorMarker) null));
                    C55884xsP.copydefault(arrayList, benefitDetails, this.KWHzl);
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIdCUTEI), benefitDetails.getMaxBotUsage(), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.ixgjPv), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    if (!benefitDetails.isHistory() && !benefitDetails.getReserveFunds()) {
                        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.fjfviF), benefitDetails.getAdditionalFundNeeded(), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.igXuih), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    }
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.RlQdEF), benefitDetails.getCompletedCycles(), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.ODWQjV), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                }
                return arrayList;
            case -1574173039:
                if (orderType.equals("infinite_grid")) {
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler11), benefitDetails.getGridProfit(), false, 0, (java.lang.String) null, C33129mqd.OLrzqt((java.lang.CharSequence) benefitDetails.getSourceCcy()) ? C33070mpX.AYXKKw(C55688xof.Application.MediaMetadataCompat) : C33070mpX.AYXKKw(C55688xof.Application.selectTab), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler11), (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16252892, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), benefitDetails.getFloatProfit(), false, benefitDetails.getFloatProfitColor(), (java.lang.String) null, C33129mqd.OLrzqt((java.lang.CharSequence) benefitDetails.getSourceCcy()) ? C33070mpX.AYXKKw(C55688xof.Application.MediaDescriptionCompatApi23Builder) : C33070mpX.AYXKKw(C55688xof.Application.getState), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16252884, (DefaultConstructorMarker) null));
                    C55884xsP.copydefault(arrayList, benefitDetails, this.KWHzl);
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.LocalActivityResultRegistryOwnerLocalComposition1), benefitDetails.getInvestment(), false, 0, (java.lang.String) null, C33129mqd.OLrzqt((java.lang.CharSequence) benefitDetails.getSourceCcy()) ? C33070mpX.AYXKKw(C55688xof.Application.getBundle) : C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatBuilder), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.LocalActivityResultRegistryOwnerLocalComposition1), (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16252892, (DefaultConstructorMarker) null));
                    if (benefitDetails.isHistory()) {
                        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequest), benefitDetails.getRebateTrans(), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.setTitle), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequest), (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16252892, (DefaultConstructorMarker) null));
                    }
                }
                return arrayList;
            case -1402017003:
                if (orderType.equals("contract_dca")) {
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.fcfzuX), C56033xvF.fmtBotValueBySymbol$default(benefitDetails.getInvestmentCcy(), benefitDetails.getMaxBotUsage(), RoundingMode.UP, true, null, false, null, null, null, null, null, 2032, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.ixgjPv), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.apAOXX);
                    java.lang.String investmentCcy = benefitDetails.getInvestmentCcy();
                    java.lang.String transferInMargin = benefitDetails.getTransferInMargin();
                    java.lang.String str = transferInMargin == null ? "" : transferInMargin;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    arrayList.add(new ItemData(strAYXKKw, C56033xvF.fmtBotValueBySymbol$default(investmentCcy, str, roundingMode, true, null, false, null, null, null, null, null, 2032, null), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKdMCrTj), C56033xvF.fmtBotValueBySymbol$default(benefitDetails.getInvestmentCcy(), benefitDetails.getTotalCycleProfit(), roundingMode, true, null, false, null, null, null, null, null, 2032, null), false, C56033xvF.djBIcL(benefitDetails.getInstId(), benefitDetails.getInstType(), benefitDetails.getTotalCycleProfit(), benefitDetails.getInvestmentCcy()), (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.OqFWZa), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777172, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKOmnske), xMR.copydefault.copydefault(benefitDetails.getCompletedCycles()), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.DcMfJKRKUgwx), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.getErrorCode);
                    java.lang.String investmentCcy2 = benefitDetails.getInvestmentCcy();
                    java.lang.String reserveFundingFee = benefitDetails.getReserveFundingFee();
                    arrayList.add(new ItemData(strAYXKKw2, C56033xvF.fmtBotValueBySymbol$default(investmentCcy2, reserveFundingFee == null ? "" : reserveFundingFee, roundingMode, true, null, false, null, null, null, null, null, 2032, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatActions), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    C55884xsP.copydefault(arrayList, benefitDetails, this.KWHzl);
                }
                return arrayList;
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.DisplayContext);
                    java.lang.String investCcy = benefitDetails.getInvestCcy();
                    java.lang.String mktCap = benefitDetails.getMktCap();
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    arrayList.add(new ItemData(strAYXKKw3, C56033xvF.fmtBotValueBySymbol$default(investCcy, mktCap, roundingMode2, true, null, false, benefitDetails.getInstType(), benefitDetails.getInstId(), null, null, null, 1840, null), false, 0, (java.lang.String) null, "", false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    C55884xsP.copydefault(arrayList, benefitDetails, this.KWHzl);
                    java.lang.String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(benefitDetails.getInvestCcy(), benefitDetails.getInvestAmt(), roundingMode2, false, null, false, null, null, null, null, null, 2040, null);
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.DeprecatedSinceApi), strFmtBotValueBySymbol$default + " " + benefitDetails.getInvestCcy(), false, 0, (java.lang.String) null, "", false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                }
                return arrayList;
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.OhRmUC), benefitDetails.getInvestment(), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ManagedActivityResultLauncher), C56033xvF.getBotPnl$default(benefitDetails.getInstId(), benefitDetails.getInstType(), benefitDetails.getFloatProfit(), null, true, true, null, false, null, null, null, 1992, null), false, C56033xvF.getPnlColor$default(benefitDetails.getInstId(), benefitDetails.getInstType(), benefitDetails.getFloatProfit(), null, 8, null), (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777204, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestBuilderFlag), C56033xvF.getBotPnl$default(benefitDetails.getInstId(), benefitDetails.getInstType(), benefitDetails.getRealizedPnl(), null, true, true, null, false, null, null, null, 1992, null), false, C56033xvF.getPnlColor$default(benefitDetails.getInstId(), benefitDetails.getInstType(), benefitDetails.getRealizedPnl(), null, 8, null), (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestBuilder), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777172, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getErrorMessage), benefitDetails.getOrdFrozen(), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcher2), benefitDetails.getAvailEq(), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                    C55884xsP.copydefault(arrayList, benefitDetails, this.KWHzl);
                }
                return arrayList;
            case -591806012:
                if (orderType.equals("moon_grid")) {
                }
                return arrayList;
            case -512749997:
                if (orderType.equals("contract_grid")) {
                    java.lang.String str2 = benefitDetails.isHistory() ? "" : "WithdrawProfitIcon";
                    java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.GQzpsZgQzpsZ);
                    java.lang.String gridProfit = benefitDetails.getGridProfit();
                    BalanceDetailInfoDto botBalanceDetails = benefitDetails.getBotBalanceDetails();
                    if (botBalanceDetails == null) {
                        botBalanceDetails = BalanceDetailInfoDto.Companion.EZpvd();
                    }
                    arrayList.add(new ItemData(strAYXKKw4, gridProfit, false, benefitDetails.getGridProfitColor(), (java.lang.String) null, (java.lang.String) null, false, !benefitDetails.isHistory(), (java.lang.String) null, false, false, str2, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str2, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) new TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails(benefitDetails.getAigoId(), benefitDetails.getInstId(), benefitDetails.getInstType(), botBalanceDetails), (java.lang.String) null, (java.lang.String) null, 14415732, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), benefitDetails.getFloatProfit(), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.setCustomView), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    C55884xsP.copydefault(arrayList, benefitDetails, this.KWHzl);
                    arrayList.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.hgxRZI), benefitDetails.getInvestment() + "\n(" + benefitDetails.getExtraMarginSz() + ")", false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.zXhzOT), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.createOnBackInvokedCallback), benefitDetails.getOrdFrozen(), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.hasEnabledCallbacks), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcher2), benefitDetails.getAvailEq(), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.createOnBackInvokedCallbacklambda0), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.isHideOnContentScrollEnabled), benefitDetails.getEq(), false, 0, (java.lang.String) null, C33069mpW.copydefault(C55688xof.Application.removeTab, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", benefitDetails.getPriceUnit()))), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.fromPlaybackState), benefitDetails.getNetMarginTransfer(), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ParcelableVolumeInfo), benefitDetails.getFee(), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                }
                return arrayList;
            case 3181382:
                if (orderType.equals("grid")) {
                }
                return arrayList;
            case 1165749981:
                if (orderType.equals("recurring")) {
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCustomAction), C56033xvF.fmtBotValueBySymbol$default(benefitDetails.getPriceUnit(), benefitDetails.getMktCap(), RoundingMode.DOWN, false, null, false, benefitDetails.getInstType(), benefitDetails.getInstId(), null, null, null, 1848, null) + " " + benefitDetails.getPriceUnit(), false, 0, (java.lang.String) null, "", false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                    java.lang.String strFmtBotValueBySymbol$default2 = C56033xvF.fmtBotValueBySymbol$default(benefitDetails.getPriceUnit(), benefitDetails.getInvestAmt(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null);
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.enumMapping), strFmtBotValueBySymbol$default2 + " " + benefitDetails.getPriceUnit(), false, 0, (java.lang.String) null, "", false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777180, (DefaultConstructorMarker) null));
                }
                return arrayList;
            case 1485620813:
                if (orderType.equals("dcd_bot")) {
                    java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.sTzBva);
                    java.lang.String instId = benefitDetails.getInstId();
                    java.lang.String instType = benefitDetails.getInstType();
                    java.lang.String arbPnl = benefitDetails.getArbPnl();
                    java.lang.String str3 = arbPnl == null ? "" : arbPnl;
                    java.lang.String notionalCcy = benefitDetails.getNotionalCcy();
                    java.lang.String botPnl$default = C56033xvF.getBotPnl$default(instId, instType, str3, notionalCcy == null ? "" : notionalCcy, true, true, null, false, null, null, null, 1984, null);
                    java.lang.String instId2 = benefitDetails.getInstId();
                    java.lang.String instType2 = benefitDetails.getInstType();
                    java.lang.String arbPnl2 = benefitDetails.getArbPnl();
                    if (arbPnl2 == null) {
                        arbPnl2 = "";
                    }
                    java.lang.String notionalCcy2 = benefitDetails.getNotionalCcy();
                    if (notionalCcy2 == null) {
                        notionalCcy2 = "";
                    }
                    arrayList.add(new ItemData(strAYXKKw5, botPnl$default, false, C56033xvF.djBIcL(instId2, instType2, arbPnl2, notionalCcy2), (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777204, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.gUEfcq);
                    java.lang.String strCopydefault = C56068xvo.copydefault.copydefault(benefitDetails.getArbApy(), true);
                    java.lang.String arbApy = benefitDetails.getArbApy();
                    if (arbApy == null) {
                        arbApy = "";
                    }
                    arrayList.add(new ItemData(strAYXKKw6, strCopydefault, false, C56033xvF.OLrzqt((java.lang.Object) arbApy), (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.fsSxsn), false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.gUEfcq), (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16252884, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.zAEkPU);
                    java.lang.String instId3 = benefitDetails.getInstId();
                    java.lang.String instType3 = benefitDetails.getInstType();
                    java.lang.String coinPnl = benefitDetails.getCoinPnl();
                    java.lang.String str4 = coinPnl == null ? "" : coinPnl;
                    java.lang.String notionalCcy3 = benefitDetails.getNotionalCcy();
                    java.lang.String botPnl$default2 = C56033xvF.getBotPnl$default(instId3, instType3, str4, notionalCcy3 == null ? "" : notionalCcy3, true, true, null, false, null, null, null, 1984, null);
                    java.lang.String instId4 = benefitDetails.getInstId();
                    java.lang.String instType4 = benefitDetails.getInstType();
                    java.lang.String coinPnl2 = benefitDetails.getCoinPnl();
                    if (coinPnl2 == null) {
                        coinPnl2 = "";
                    }
                    java.lang.String notionalCcy4 = benefitDetails.getNotionalCcy();
                    if (notionalCcy4 == null) {
                        notionalCcy4 = "";
                    }
                    arrayList.add(new ItemData(strAYXKKw7, botPnl$default2, false, C56033xvF.djBIcL(instId4, instType4, coinPnl2, notionalCcy4), (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777204, (DefaultConstructorMarker) null));
                    java.lang.String investmentCcy3 = benefitDetails.getInvestmentCcy();
                    java.lang.String investmentAmt = benefitDetails.getInvestmentAmt();
                    RoundingMode roundingMode3 = RoundingMode.DOWN;
                    arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt), C56033xvF.fmtBotValueBySymbol$default(investmentCcy3, investmentAmt, roundingMode3, true, null, false, null, null, null, null, null, 2032, null), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C55688xof.Application.DGUQLIDGUQLI);
                    java.lang.String currency = benefitDetails.getCurrency();
                    if (currency == null) {
                        currency = "";
                    }
                    java.lang.String currencyBal = benefitDetails.getCurrencyBal();
                    if (currencyBal == null) {
                        currencyBal = "";
                    }
                    arrayList.add(new ItemData(strAYXKKw8, C56033xvF.fmtBotValueBySymbol$default(currency, currencyBal, roundingMode3, true, "8", false, null, null, null, null, null, 2016, null), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C55688xof.Application.swzYdv);
                    java.lang.String instType5 = benefitDetails.getInstType();
                    java.lang.String instId5 = benefitDetails.getInstId();
                    java.lang.String avgCost = benefitDetails.getAvgCost();
                    arrayList.add(new ItemData(strAYXKKw9, C56033xvF.getBotPrice$default(instType5, instId5, avgCost == null ? "" : avgCost, true, false, RoundingMode.UP, null, 80, null), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C55688xof.Application.zYHWMc);
                    xMR xmr = xMR.copydefault;
                    java.lang.String cycle = benefitDetails.getCycle();
                    arrayList.add(new ItemData(strAYXKKw10, xmr.copydefault(cycle != null ? cycle : ""), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                }
                return arrayList;
            default:
                return arrayList;
        }
    }
}
