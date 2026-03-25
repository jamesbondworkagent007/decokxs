package o;

import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.okinc.business.invest_biz.data.bean.BorrowedInfo;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.HeathFactorInfo;
import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean;
import com.okinc.business.invest_biz.data.bean.InvestHoverOnData;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipsBean;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.Maturity;
import com.okinc.business.invest_biz.data.bean.PointInfo;
import com.okinc.business.invest_biz.data.bean.SwapSlippageConfig;
import com.okinc.business.invest_biz.data.contants.HealthRateLevel;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCB {
    public static final iCB EZpvd = new iCB();

    private iCB() {
    }

    public final InterfaceC24178iXu.PendingIntent KWHzl(@NotNull InvestTransactionLossInfo investTransactionLossInfo) {
        Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
        return new InterfaceC24178iXu.PendingIntent(investTransactionLossInfo, null, 2, null);
    }

    public final InterfaceC24178iXu.PictureInPictureParams EZpvd(BorrowedInfo borrowedInfo) {
        if (borrowedInfo == null) {
            borrowedInfo = new BorrowedInfo("", (java.lang.String) null, "", (java.lang.String) null, 10, (DefaultConstructorMarker) null);
        }
        return new InterfaceC24178iXu.PictureInPictureParams(borrowedInfo, null, 2, null);
    }

    public final InterfaceC24178iXu.TaskDescription copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.QWpYiD;
        int i2 = C25493ixk.FragmentManager.dbwnZN;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), null, null, 0, C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, str, false, 2, null), null, 0, null, DetailItemType.FIXED_APY, 476, null);
    }

    public final InterfaceC24178iXu.TaskDescription AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.jNexW;
        int i2 = C25493ixk.FragmentManager.gsvlRV;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), null, null, 0, "", null, 0, new iXF(new Maturity(str)), DetailItemType.MATURITY, 220, null);
    }

    public final InterfaceC24178iXu.StateListAnimator AEQbTJ(boolean z, @NotNull java.lang.String str, int i, @NotNull java.util.List<InvestTokenWithAmount> list, @NotNull java.util.List<PointInfo> list2, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InterfaceC24178iXu.StateListAnimator(z, str, list, i, list2, false, str2, str3, null, 288, null);
    }

    public final InterfaceC24178iXu.TaskDescription OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.QCjLjM;
        int i2 = C25493ixk.FragmentManager.RqmePg;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), null, null, 0, str, null, 0, null, DetailItemType.EST_RECEIVE, 220, null);
    }

    public static /* synthetic */ InterfaceC24178iXu.LoaderManager getRedeemReceiveTokenInfoItem$default(iCB icb, int i, java.util.List list, boolean z, boolean z2, InvestAssetPositionType investAssetPositionType, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            investAssetPositionType = null;
        }
        InvestAssetPositionType investAssetPositionType2 = investAssetPositionType;
        if ((i2 & 32) != 0) {
            z3 = false;
        }
        return icb.copydefault(i, list, z, z2, investAssetPositionType2, z3);
    }

    public final InterfaceC24178iXu.LoaderManager copydefault(int i, @NotNull java.util.List<InvestTokenWithAmount> list, boolean z, boolean z2, InvestAssetPositionType investAssetPositionType, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InterfaceC24178iXu.LoaderManager(C27577jxn.copydefault.EZpvd(java.lang.Integer.valueOf(i)) ? C25493ixk.FragmentManager.QCjLjM : C25493ixk.FragmentManager.idLUrz, list, i, z, z2, DetailItemType.RECEIVE_TOKEN, z3, investAssetPositionType == InvestAssetPositionType.EXPIRY_POSITION ? C33070mpX.AYXKKw(C25493ixk.FragmentManager.DNMMPQ) : null, null, 256, null);
    }

    public final InterfaceC24178iXu.Fragment copydefault(InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InterfaceC24178iXu.Fragment(str, investTokenWithAmount, investTokenWithAmount2, null, 8, null);
    }

    public final InterfaceC24178iXu.Application KWHzl(int i, @NotNull CollateralRatioInfo collateralRatioInfo, CollateralRatioInfo collateralRatioInfo2) {
        Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
        return new InterfaceC24178iXu.Application(java.lang.Integer.valueOf(i), collateralRatioInfo, collateralRatioInfo2, null, 8, null);
    }

    public final InterfaceC24178iXu.TaskDescription EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i = C25493ixk.FragmentManager.USBtdM;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), null, null, null, 0, "", null, 0, new iXF(new InvestExchangeRateBean(str, str2, str3)), DetailItemType.EXCHANGE_RATE, 222, null);
    }

    public final InterfaceC24178iXu.TaskDescription OLrzqt(@NotNull java.lang.String str, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.DKtBnz;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), null, null, investTipInfoVo, 0, str, null, 0, null, DetailItemType.PAY_WITH, 470, null);
    }

    public final InterfaceC24178iXu.Dialog EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, boolean z2, DisplayText displayText) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InterfaceC24178iXu.Dialog(2, str, str2, str3, z, 0, str4, z2, displayText, null, 544, null);
    }

    public final InterfaceC24178iXu.TaskDescription AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.EZpvd;
        int i2 = C25493ixk.FragmentManager.iqMDAV;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), null, null, 0, str, null, 0, null, DetailItemType.NETWORK_FEE, 404, null);
    }

    public final InterfaceC24178iXu.TaskDescription djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.RlQdEF;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), null, null, null, 0, str, null, 0, null, DetailItemType.VALIDATOR, 478, null);
    }

    public final InterfaceC24178iXu.TaskDescription AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.RIuxYh;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), null, null, null, 0, str, null, 0, null, DetailItemType.FINALITY_PROVIDER, 478, null);
    }

    public final InterfaceC24178iXu.TaskDescription EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.gGNlxh;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), null, null, null, 0, str, null, 0, null, DetailItemType.EST_UNBOND_TIME, 478, null);
    }

    public final InterfaceC24178iXu.TaskDescription valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.QSBOWP;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), null, null, null, 0, str, null, 0, null, DetailItemType.SUPPLY_COLLATERAL, 478, null);
    }

    public final InterfaceC24178iXu.TaskDescription KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.RKDWNf;
        DetailItemType detailItemType = DetailItemType.BORROW_FEE;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.RKDWNf);
        InvestClickActionType investClickActionType = InvestClickActionType.POPUP;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C25493ixk.FragmentManager.RKDWNf);
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), null, null, new InvestTipInfoVo(investClickActionType, (InvestCustomRedirectData) null, (InvestHoverOnData) null, new InvestPopUpData(C56402yEa.EZpvd(new InvestButtonAction(InvestButtonAction.ACTION_CALLBACK_CLOSE, C33070mpX.AYXKKw(C25493ixk.FragmentManager.AYXKKw), (java.lang.String) null, 4, (DefaultConstructorMarker) null)), C33070mpX.AYXKKw(C25493ixk.FragmentManager.ffGIBT), (java.lang.String) null, (java.lang.String) null, strAYXKKw2, (java.lang.String) null, 44, (DefaultConstructorMarker) null), (InvestRedirectData) null, strAYXKKw, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 982, (DefaultConstructorMarker) null), 0, str, null, 0, null, detailItemType, 470, null);
    }

    public static /* synthetic */ InterfaceC24178iXu.Activity getBorrowReceiveTokenInfoItem$default(iCB icb, int i, java.util.List list, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return icb.EZpvd(i, list, z, z2);
    }

    public final InterfaceC24178iXu.Activity EZpvd(int i, @NotNull java.util.List<InvestTokenWithAmount> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InterfaceC24178iXu.Activity(C25493ixk.FragmentManager.idLUrz, list, i, false, z, DetailItemType.BORROW_RECEIVE_TOKEN, z2, null, 128, null);
    }

    public final InterfaceC24178iXu.ActionBar copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull HealthRateLevel healthRateLevel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        return new InterfaceC24178iXu.ActionBar(new HeathFactorInfo(str, str2, healthRateLevel), null, 2, null);
    }

    public final InterfaceC24178iXu.TaskStackBuilder EZpvd(@NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo) {
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        return new InterfaceC24178iXu.TaskStackBuilder(redeemInitialInfo.isConnected(), redeemInitialInfo.AhwBna(), redeemInitialInfo.AuCTelauCTel().get(1).getTokenSymbol(), redeemInitialInfo.AuCTelauCTel().get(0).getTokenSymbol(), redeemInitialInfo.DbNXlk(), redeemInitialInfo.zuBGHE(), true, false, Intrinsics.EZpvd((java.lang.Object) redeemInitialInfo.hDKMBd(), (java.lang.Object) "ACTIVE"), null, LivenessCoordinator.TARGET_HEIGHT, null);
    }

    public final InterfaceC24178iXu.AssistContent copydefault(@NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        return new InterfaceC24178iXu.AssistContent(C33129mqd.divS$default("1", redeemDetailsAndGasFee.OLrzqt(), null, null, null, 14, null), redeemInitialInfo.AuCTelauCTel().get(0).getTokenSymbol(), redeemInitialInfo.AuCTelauCTel().get(1).getTokenSymbol(), false, false, 0, null, 120, null);
    }

    public final InterfaceC24178iXu.SharedElementCallback KWHzl(@NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        java.lang.String strUzCIH = redeemDetailsAndGasFee.uzCIH();
        java.lang.String str = strUzCIH == null ? "" : strUzCIH;
        SwapSlippageConfig swapSlippage = redeemDetailsAndGasFee.valueOf().getSwapSlippage();
        if (swapSlippage == null) {
            swapSlippage = new SwapSlippageConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1023, (DefaultConstructorMarker) null);
        }
        return new InterfaceC24178iXu.SharedElementCallback(str, null, null, null, false, false, false, swapSlippage, null, 382, null);
    }

    public final InterfaceC24178iXu.TaskDescription gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C25493ixk.FragmentManager.DGgnkA;
        return new InterfaceC24178iXu.TaskDescription(java.lang.Integer.valueOf(i), null, null, null, 0, pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(str) * ((long) 1000)), null, 1, null), null, 0, null, DetailItemType.SETTLEMENT, 478, null);
    }

    public final InterfaceC24178iXu.TaskDescription AEQbTJ(@NotNull InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(investTipInfoVo, "");
        java.lang.String title = investTipInfoVo.getTitle();
        java.lang.String tipContent = investTipInfoVo.getTipContent();
        return new InterfaceC24178iXu.TaskDescription(null, null, title, null, 0, tipContent == null ? "" : tipContent, null, 0, null, DetailItemType.EXT_INFO, 475, null);
    }

    public final InterfaceC24178iXu.VoiceInteractor EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.util.List<InvestTokenWithAmount> list, @NotNull java.util.List<InvestTokenWithAmount> list2, @NotNull java.util.List<InvestTokenWithAmount> list3, InvestTokenWithAmount investTokenWithAmount, @NotNull InvestTokenWithAmount investTokenWithAmount2, @NotNull java.lang.String str3, int i2) {
        java.lang.String strEZpvd;
        boolean z;
        int i3;
        java.lang.String strJoinToString$default;
        int i4;
        java.lang.String tokenSymbol;
        int i5;
        java.lang.String tokenSymbol2;
        int i6;
        java.lang.String tokenSymbol3;
        java.lang.String tokenSymbol4;
        java.lang.String tokenSymbol5 = "";
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) iCP.KWHzl(list2, investTokenWithAmount2).getTokenAddress());
        InvestTokenWithAmount investTokenWithAmountKWHzl = iCP.KWHzl(list, investTokenWithAmount2);
        C27577jxn c27577jxn = C27577jxn.copydefault;
        if (c27577jxn.AEQbTJ(i, zOLrzqt, list2.size())) {
            if (str3.length() > 0) {
                tokenSymbol2 = investTokenWithAmountKWHzl.getTokenSymbol();
                i6 = 1;
            } else {
                tokenSymbol2 = "";
                i6 = 0;
            }
            InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(list2);
            if (C33129mqd.OLrzqt((java.lang.Object) (investTokenWithAmount3 != null ? investTokenWithAmount3.getCurrencyAmount() : null), (java.lang.Object) 0)) {
                InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(list2);
                if (investTokenWithAmount4 == null || (tokenSymbol4 = investTokenWithAmount4.getTokenSymbol()) == null) {
                    tokenSymbol4 = "";
                }
                strJoinToString$default = tokenSymbol4;
                tokenSymbol2 = "";
                i4 = 3;
            } else {
                i4 = i6;
                strJoinToString$default = "";
            }
            if (!C33129mqd.OLrzqt((java.lang.Object) investTokenWithAmountKWHzl.getCurrencyAmount(), (java.lang.Object) 0)) {
                tokenSymbol5 = tokenSymbol2;
                i3 = i4;
                strEZpvd = strJoinToString$default;
                z = true;
            } else if (i4 == 3) {
                tokenSymbol = investTokenWithAmountKWHzl.getTokenSymbol();
                InvestTokenWithAmount investTokenWithAmount5 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(list2);
                if (investTokenWithAmount5 != null && (tokenSymbol3 = investTokenWithAmount5.getTokenSymbol()) != null) {
                    tokenSymbol5 = tokenSymbol3;
                }
                i5 = 4;
                strJoinToString$default = tokenSymbol5;
                i3 = i5;
                tokenSymbol5 = tokenSymbol;
                strEZpvd = strJoinToString$default;
                z = true;
            } else {
                tokenSymbol = investTokenWithAmountKWHzl.getTokenSymbol();
                i5 = 2;
                strJoinToString$default = tokenSymbol5;
                i3 = i5;
                tokenSymbol5 = tokenSymbol;
                strEZpvd = strJoinToString$default;
                z = true;
            }
        } else if (c27577jxn.AEQbTJ(i, transactionConfig.AwvSrB(), zOLrzqt, list2.size())) {
            kotlin.Pair<java.lang.Boolean, java.util.List<InvestTokenWithAmount>> pairEZpvd = c27577jxn.EZpvd(list2);
            if (pairEZpvd.getFirst().booleanValue()) {
                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(pairEZpvd.getSecond(), ",", null, null, 0, null, new Function1() { // from class: o.iCE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return iCB.OLrzqt((InvestTokenWithAmount) obj);
                    }
                }, 30, null);
                i4 = 3;
            } else {
                strJoinToString$default = "";
                i4 = 0;
            }
            if (C33129mqd.OLrzqt((java.lang.Object) investTokenWithAmountKWHzl.getCurrencyAmount(), (java.lang.Object) 0)) {
                if (i4 == 3) {
                    tokenSymbol5 = investTokenWithAmountKWHzl.getTokenSymbol();
                    strEZpvd = C27581jxr.EZpvd(pairEZpvd.getSecond(), C56402yEa.EZpvd(investTokenWithAmountKWHzl));
                    z = true;
                    i3 = 4;
                } else {
                    tokenSymbol = investTokenWithAmountKWHzl.getTokenSymbol();
                    i5 = 2;
                    strJoinToString$default = tokenSymbol5;
                    i3 = i5;
                    tokenSymbol5 = tokenSymbol;
                    strEZpvd = strJoinToString$default;
                    z = true;
                }
            }
            i3 = i4;
            strEZpvd = strJoinToString$default;
            z = true;
        } else {
            strEZpvd = "";
            z = false;
            i3 = 0;
        }
        if ((!list3.isEmpty()) && i3 == 0) {
            tokenSymbol5 = CollectionsKt___CollectionsKt.joinToString$default(list3, ",", null, null, 0, null, new Function1() { // from class: o.iCD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return iCB.KWHzl((InvestTokenWithAmount) obj);
                }
            }, 30, null);
            i3 = 5;
        }
        InvestTipsBean investTipsBean = i3 != 0 ? new InvestTipsBean(i3, str3, tokenSymbol5, strEZpvd) : null;
        java.util.List<InvestTokenWithAmount> list4 = z ? list2 : null;
        int iAkhnZx = transactionConfig.AkhnZx();
        if (investTipsBean == null) {
            investTipsBean = new InvestTipsBean(0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null);
        }
        return new InterfaceC24178iXu.VoiceInteractor(i2, str2, str, list, list4, investTokenWithAmount, investTipsBean, java.lang.Integer.valueOf(iAkhnZx), null, 256, null);
    }

    public static final java.lang.CharSequence OLrzqt(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    public static final java.lang.CharSequence KWHzl(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }
}
