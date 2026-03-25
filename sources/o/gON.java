package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.dex.trade.common.reminder.PreCheckModel;
import com.okinc.business.dex.trade.common.reminder.PreCheckReminderType;
import com.okinc.business.dex.trade.common.reminder.PreCheckStatus;
import com.okinc.business.dex.trade.common.reminder.ReminderShowType;
import com.okinc.business.dex.trade.common.reminder.SaUiReminder;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderTierType;
import com.okinc.business.dex.trade.common.reminder.data.WalletTypeForReminder;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gON {

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PreCheckReminderType.values().length];
            try {
                iArr[PreCheckReminderType.Warning.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PreCheckReminderType.Error.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PreCheckReminderType.Info.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PreCheckReminderType.NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[WalletTypeForReminder.values().length];
            try {
                iArr2[WalletTypeForReminder.Hardware.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[WalletTypeForReminder.MPC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[WalletTypeForReminder.AA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[WalletTypeForReminder.PrivateKey.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            KWHzl = iArr2;
            int[] iArr3 = new int[TradeReminderType.values().length];
            try {
                iArr3[TradeReminderType.ServiceSuspended.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[TradeReminderType.ServiceSuspendedRecommendDapp.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[TradeReminderType.PRE_CHECK_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[TradeReminderType.WalletBusinessUnsupported.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[TradeReminderType.WalletStatusAbnormal.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[TradeReminderType.WalletMPCNeedRefreshed.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[TradeReminderType.WalletMPCAccountInUse.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[TradeReminderType.WalletMPCNeedLogin.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr3[TradeReminderType.WalletMPCAuthenticateAccount.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr3[TradeReminderType.WalletMPCLoggedOutNeedVerify.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr3[TradeReminderType.WalletMPCWalletHacked.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr3[TradeReminderType.WalletMPCAccountFrozen.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr3[TradeReminderType.WalletMPCAccountDeleted.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr3[TradeReminderType.ConnectWallet.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr3[TradeReminderType.SAException.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr3[TradeReminderType.SAExpiringSoon.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr3[TradeReminderType.SAOrderLimitExceeded.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr3[TradeReminderType.SANeedUpgrade.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr3[TradeReminderType.SAOrderExceedsValidity.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr3[TradeReminderType.SALimitUnsupportChain.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr3[TradeReminderType.TokenHighRiskLeverage.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr3[TradeReminderType.TokenHoneypot.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr3[TradeReminderType.ChainNeedUseDapp.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr3[TradeReminderType.QuoteDapp.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr3[TradeReminderType.QuoteSafemoon.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr3[TradeReminderType.QuoteValueDiffExceeded.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr3[TradeReminderType.QuoteNoLiquidityServer.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr3[TradeReminderType.NoSupportTPLS.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr3[TradeReminderType.NoLiquidityForOKX.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr3[TradeReminderType.NoLiquidityForOKXWarning.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr3[TradeReminderType.QuoteNoLiquidityFallback.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr3[TradeReminderType.QuoteFailed.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr3[TradeReminderType.QuoteBlackAddress.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr3[TradeReminderType.QuoteNewAddress.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr3[TradeReminderType.QuoteHoneypot.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr3[TradeReminderType.PresetConfigMiss.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                iArr3[TradeReminderType.RevokeApproval.ordinal()] = 37;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr3[TradeReminderType.LimitMiniTradeAmount.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                iArr3[TradeReminderType.MCapEmpty.ordinal()] = 39;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr3[TradeReminderType.AntiMevForbidden.ordinal()] = 40;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                iArr3[TradeReminderType.None.ordinal()] = 41;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                iArr3[TradeReminderType.AntiMevInstability.ordinal()] = 42;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            AEQbTJ = iArr3;
            int[] iArr4 = new int[ReminderTierType.values().length];
            try {
                iArr4[ReminderTierType.Blocking.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                iArr4[ReminderTierType.TokenAttribute.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                iArr4[ReminderTierType.TradeFailure.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                iArr4[ReminderTierType.TradeRisk.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                iArr4[ReminderTierType.TradeRule.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                iArr4[ReminderTierType.AccountStatus.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            copydefault = iArr4;
            int[] iArr5 = new int[PreCheckStatus.values().length];
            try {
                iArr5[PreCheckStatus.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                iArr5[PreCheckStatus.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            EZpvd = iArr5;
        }
    }

    public static final boolean EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null) {
            return false;
        }
        return dexMultiTokenInfoBean.isLeverage() || dexMultiTokenInfoBean.isHoneypotToken();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v45, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r1v46, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r1v57, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r2v25, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r2v26, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r2v30, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f4 A[PHI: r1
  0x02f4: PHI (r1v51 java.lang.String) = (r1v48 java.lang.String), (r1v53 java.lang.String) binds: [B:150:0x02f1, B:145:0x02e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair<java.lang.String, java.lang.String> copydefault(TradeReminderType tradeReminderType, PreCheckModel preCheckModel, BusinessType businessType, DefiChainInfo defiChainInfo, gOU gou, java.lang.Throwable th, SlippageMode slippageMode, java.lang.String str, java.lang.String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, int i2, InterfaceC19780gPa interfaceC19780gPa, gOT got, gLQ glq) {
        java.lang.String str3;
        java.lang.String tokenSymbol;
        java.lang.String tokenSymbol2;
        java.lang.String strCopydefault;
        java.lang.String tokenSymbol3;
        java.lang.String strCopydefault2;
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strDivCheckS$default;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw;
        java.lang.String tokenSymbol4;
        str3 = "";
        switch (Activity.AEQbTJ[tradeReminderType.ordinal()]) {
            case 1:
                return C56390yDp.OLrzqt(null, C33070mpX.AYXKKw(C23274hvD.Fragment.createFromParcel));
            case 2:
                return C56390yDp.OLrzqt(null, C33070mpX.AYXKKw(C23274hvD.Fragment.writeToParcel));
            case 3:
                java.lang.String preCheckMsg = preCheckModel != null ? preCheckModel.getPreCheckMsg() : null;
                return C56390yDp.OLrzqt(null, preCheckMsg != null ? preCheckMsg : "");
            case 4:
                gOW gow = interfaceC19780gPa instanceof gOW ? (gOW) interfaceC19780gPa : null;
                if ((gow != null ? gow.AEQbTJ() : null) == WalletTypeForReminder.AA) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.addQueueItem), C33069mpW.copydefault(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase6, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", defiChainInfo.getChainName()))));
                }
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.gtdfxv), C33070mpX.AYXKKw(C23274hvD.Fragment.HJWChPdNQGVJ));
            case 5:
                gOW gow2 = interfaceC19780gPa instanceof gOW ? (gOW) interfaceC19780gPa : null;
                WalletTypeForReminder walletTypeForReminderAEQbTJ = gow2 != null ? gow2.AEQbTJ() : null;
                int i3 = walletTypeForReminderAEQbTJ == null ? -1 : Activity.KWHzl[walletTypeForReminderAEQbTJ.ordinal()];
                if (i3 == -1) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable), C33069mpW.copydefault(C23274hvD.Fragment.IntentSenderRequest, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", defiChainInfo.getChainName()))));
                }
                if (i3 == 1) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.gtdfxv), C33069mpW.copydefault(C23274hvD.Fragment.registerCallbackMessenger, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", defiChainInfo.getChainName()))));
                }
                if (i3 == 2) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable), C33069mpW.copydefault(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase5, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", defiChainInfo.getChainName()))));
                }
                if (i3 == 3) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.addQueueItem), C33069mpW.copydefault(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase6, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", defiChainInfo.getChainName()))));
                }
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable), C33069mpW.copydefault(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", defiChainInfo.getChainName()))));
            case 6:
            case 7:
                gOW gow3 = interfaceC19780gPa instanceof gOW ? (gOW) interfaceC19780gPa : null;
                java.lang.String strOLrzqt = gow3 != null ? gow3.OLrzqt() : null;
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.fromMediaItemList), C33069mpW.copydefault(C23274hvD.Fragment.forceCloseConnection, C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, strOLrzqt != null ? strOLrzqt : ""), C56390yDp.OLrzqt(RequestParameters.X_OSS_RESTORE, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2)))));
            case 8:
            case 9:
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserServiceCallbackImpl), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase1));
            case 10:
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserServiceCallbackImpl), C33069mpW.copydefault(C23274hvD.Fragment.SqfPTR, C56423yEv.EZpvd(C56390yDp.OLrzqt("verify", C33070mpX.AYXKKw(C23274hvD.Fragment.RZOtbZ)))));
            case 11:
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection));
            case 12:
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase2));
            case 13:
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase4));
            case 14:
                return C56390yDp.OLrzqt(null, null);
            case 15:
            case 16:
            case 17:
            case 18:
                SaUiReminder saUiReminderEZpvd = got != null ? got.EZpvd(tradeReminderType, glq) : null;
                return C56390yDp.OLrzqt(saUiReminderEZpvd != null ? saUiReminderEZpvd.getTitle() : null, saUiReminderEZpvd != null ? saUiReminderEZpvd.getMessage() : null);
            case 19:
                return C56390yDp.OLrzqt(null, C33070mpX.AYXKKw(C23274hvD.Fragment.ORWKdN));
            case 20:
                return C56390yDp.OLrzqt(null, C33070mpX.AYXKKw(C23274hvD.Fragment.onCommand));
            case 21:
                if (dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isLeverage()) {
                    tokenSymbol = dexMultiTokenInfoBean.getTokenSymbol();
                } else {
                    tokenSymbol = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenSymbol() : null;
                }
                return C56390yDp.OLrzqt(null, C33069mpW.copydefault(C23274hvD.Fragment.IntentSenderRequestCompanion, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", tokenSymbol != null ? tokenSymbol : ""))));
            case 22:
                boolean zIsHoneypotToken = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.isHoneypotToken() : false;
                if (zIsHoneypotToken) {
                    tokenSymbol2 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
                } else if (dexMultiTokenInfoBean2 != null) {
                    tokenSymbol2 = dexMultiTokenInfoBean2.getTokenSymbol();
                }
                if (zIsHoneypotToken && !EZpvd(dexMultiTokenInfoBean2)) {
                    strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.getIntentSender, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", tokenSymbol2 != null ? tokenSymbol2 : "")));
                } else {
                    strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.IntentSenderRequestCompanion, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", tokenSymbol2 != null ? tokenSymbol2 : "")));
                }
                return C56390yDp.OLrzqt(null, strCopydefault);
            case 23:
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.hCLrkq), C33069mpW.copydefault(C23274hvD.Fragment.toString, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", defiChainInfo.getChainName()))));
            case 24:
                return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.onSearchResult), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaItem1));
            case 25:
                java.lang.String strDbNXlk = gou != null ? gou.DbNXlk() : null;
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                java.lang.String percent$default = C23311hvo.formatPercent$default(strDbNXlk, false, 0, 0, null, null, 31, null);
                byte b = dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isSafeMoonCoinToken();
                byte b2 = dexMultiTokenInfoBean2 != null && dexMultiTokenInfoBean2.isSafeMoonCoinToken();
                if (b == true && b2 == true) {
                    int i4 = C23274hvD.Fragment.IntentSenderRequestBuilder;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    java.lang.String tokenSymbol5 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
                    if (tokenSymbol5 == null) {
                        tokenSymbol5 = "";
                    }
                    pairArr[0] = C56390yDp.OLrzqt("token1", tokenSymbol5);
                    java.lang.String tokenSymbol6 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenSymbol() : null;
                    pairArr[1] = C56390yDp.OLrzqt("token2", tokenSymbol6 != null ? tokenSymbol6 : "");
                    pairArr[2] = C56390yDp.OLrzqt("value", percent$default);
                    strCopydefault2 = C33069mpW.copydefault(i4, C56424yEw.gEmmrt(pairArr));
                } else if (b != false) {
                    tokenSymbol3 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
                    if (tokenSymbol3 != null) {
                        str3 = tokenSymbol3;
                    }
                    strCopydefault2 = C33069mpW.copydefault(C23274hvD.Fragment.setMediaTypeactivity_release, C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", str3), C56390yDp.OLrzqt("value", percent$default)));
                } else {
                    tokenSymbol3 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenSymbol() : null;
                    if (tokenSymbol3 != null) {
                    }
                    strCopydefault2 = C33069mpW.copydefault(C23274hvD.Fragment.setMediaTypeactivity_release, C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", str3), C56390yDp.OLrzqt("value", percent$default)));
                }
                return C56390yDp.OLrzqt(null, strCopydefault2);
            case 26:
                java.lang.String strEZpvd = gou != null ? gou.EZpvd() : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                java.lang.String strAEQbTJ = gou != null ? gou.AEQbTJ() : null;
                java.lang.String scientificCurrency$default = strAEQbTJ != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strAEQbTJ, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null) : null;
                int i5 = C23274hvD.Fragment.registerMediaButtonEventReceiver;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = C56390yDp.OLrzqt("percentage", C23311hvo.formatPercent$default(strEZpvd, false, 0, 0, null, null, 31, null));
                pairArr2[1] = C56390yDp.OLrzqt("value", scientificCurrency$default != null ? scientificCurrency$default : "");
                return C56390yDp.OLrzqt(null, C33069mpW.copydefault(i5, C56424yEw.gEmmrt(pairArr2)));
            case 27:
                java.lang.String strAhwBna = gou != null ? gou.AhwBna() : null;
                return C56390yDp.OLrzqt(null, strAhwBna != null ? strAhwBna : "");
            case 28:
                return C56390yDp.OLrzqt(null, C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultCallerKt));
            case 29:
                return C56390yDp.OLrzqt(null, pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C23274hvD.FragmentManager.EZpvd, java.lang.Math.max(0, i2), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i2)))));
            case 30:
                return C56390yDp.OLrzqt(null, pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C23274hvD.FragmentManager.fIwbmz, java.lang.Math.max(0, i2), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i2)))));
            case 31:
                if (th == null || (strAYXKKw = th.getMessage()) == null) {
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.sVXHln);
                }
                return C56390yDp.OLrzqt(null, strAYXKKw);
            case 32:
                if (th == null || (strAYXKKw2 = th.getMessage()) == null) {
                    strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.heceqZ);
                }
                return C56390yDp.OLrzqt(null, strAYXKKw2);
            case 33:
                java.lang.String message = th != null ? th.getMessage() : null;
                return C56390yDp.OLrzqt(null, message != null ? message : "");
            case 34:
                java.lang.String message2 = th != null ? th.getMessage() : null;
                return C56390yDp.OLrzqt(null, message2 != null ? message2 : "");
            case 35:
                java.lang.String message3 = th != null ? th.getMessage() : null;
                return C56390yDp.OLrzqt(null, message3 != null ? message3 : "");
            case 36:
                return C56390yDp.OLrzqt(null, C33070mpX.AYXKKw(C23274hvD.Fragment.gdwsGQ));
            case 37:
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.setContent);
                int i6 = C23274hvD.Fragment.setOwners;
                java.lang.String tokenSymbol7 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
                return C56390yDp.OLrzqt(strAYXKKw3, C33069mpW.copydefault(i6, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", tokenSymbol7 != null ? tokenSymbol7 : ""))));
            case 38:
                java.lang.String limitOrderTradeMinUSD = defiChainInfo.getLimitOrderTradeMinUSD();
                java.lang.String strValueOf = gou != null ? gou.valueOf() : null;
                if (limitOrderTradeMinUSD == null) {
                    strDivCheckS$default = null;
                } else {
                    if (limitOrderTradeMinUSD.length() <= 0 || strValueOf == null || strValueOf.length() == 0) {
                        limitOrderTradeMinUSD = null;
                    }
                    if (limitOrderTradeMinUSD != null) {
                        strDivCheckS$default = C23313hvq.divCheckS$default(limitOrderTradeMinUSD, strValueOf, null, null, RoundingMode.UP, 6, null);
                    }
                }
                if (strDivCheckS$default == null) {
                    strDivCheckS$default = "";
                }
                int i7 = C23274hvD.Fragment.MediaSessionCompatApi21Callback;
                kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                pairArr3[0] = C56390yDp.OLrzqt("minTrade", C23271hvA.getShowData$default(C23271hvA.copydefault, strDivCheckS$default, false, RoundingMode.UP, false, false, 26, null));
                java.lang.String tokenSymbol8 = (gou == null || (dexMultiTokenInfoBeanAYXKKw = gou.AYXKKw()) == null) ? null : dexMultiTokenInfoBeanAYXKKw.getTokenSymbol();
                pairArr3[1] = C56390yDp.OLrzqt("token", tokenSymbol8 != null ? tokenSymbol8 : "");
                return C56390yDp.OLrzqt(null, C33069mpW.copydefault(i7, C56424yEw.gEmmrt(pairArr3)));
            case 39:
                if (dexMultiTokenInfoBean2 == null || (tokenSymbol4 = dexMultiTokenInfoBean2.getTokenSymbol()) == null) {
                    tokenSymbol4 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
                }
                return C56390yDp.OLrzqt(null, C33069mpW.copydefault(C23274hvD.Fragment.BVXAa, C56423yEv.EZpvd(C56390yDp.OLrzqt("tokenSymbol", tokenSymbol4 != null ? tokenSymbol4 : ""))));
            case 40:
                return C56390yDp.OLrzqt(null, null);
            case 41:
            case 42:
                return C56390yDp.OLrzqt(null, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final java.lang.String OLrzqt(TradeReminderType tradeReminderType, gOT got, gLQ glq) {
        int i = Activity.AEQbTJ[tradeReminderType.ordinal()];
        if (i == 29 || i == 30) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.uzCIH);
        }
        if (i != 36) {
            switch (i) {
                case 4:
                case 5:
                    return C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi181);
                case 6:
                case 7:
                    return C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2);
                case 8:
                case 9:
                    return C33070mpX.AYXKKw(C23274hvD.Fragment.postOrRun);
                case 10:
                    return C33070mpX.AYXKKw(C23274hvD.Fragment.RZOtbZ);
                default:
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            SaUiReminder saUiReminderEZpvd = got != null ? got.EZpvd(tradeReminderType, glq) : null;
                            if (saUiReminderEZpvd != null) {
                                return saUiReminderEZpvd.getActionMessage();
                            }
                            break;
                        case 19:
                            return C33070mpX.AYXKKw(C23274hvD.Fragment.QKDJJA);
                    }
                    return null;
            }
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJKDCKfqPDCfLja);
    }

    public static final ReminderShowType copydefault(TradeReminderType tradeReminderType) {
        switch (Activity.copydefault[AEQbTJ(tradeReminderType).ordinal()]) {
            case 1:
                return ReminderShowType.Critical;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return ReminderShowType.Warning;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ReminderTierType AEQbTJ(TradeReminderType tradeReminderType) {
        return yED.AEQbTJ(TradeReminderType.QuoteSafemoon).contains(tradeReminderType) ? ReminderTierType.TokenAttribute : yEE.AhwBna(TradeReminderType.QuoteValueDiffExceeded, TradeReminderType.NoLiquidityForOKXWarning).contains(tradeReminderType) ? ReminderTierType.TradeRisk : yEE.AhwBna(TradeReminderType.SANeedUpgrade, TradeReminderType.SAOrderExceedsValidity, TradeReminderType.SAExpiringSoon).contains(tradeReminderType) ? ReminderTierType.AccountStatus : yEE.AhwBna(TradeReminderType.PRE_CHECK_ERROR, TradeReminderType.ServiceSuspended, TradeReminderType.ServiceSuspendedRecommendDapp, TradeReminderType.WalletBusinessUnsupported, TradeReminderType.WalletStatusAbnormal, TradeReminderType.WalletMPCNeedRefreshed, TradeReminderType.WalletMPCNeedLogin, TradeReminderType.WalletMPCAccountInUse, TradeReminderType.WalletMPCAuthenticateAccount, TradeReminderType.WalletMPCLoggedOutNeedVerify, TradeReminderType.WalletMPCWalletHacked, TradeReminderType.WalletMPCAccountFrozen, TradeReminderType.WalletMPCAccountDeleted, TradeReminderType.SAException, TradeReminderType.SALimitUnsupportChain, TradeReminderType.ChainNeedUseDapp, TradeReminderType.PresetConfigMiss, TradeReminderType.TokenHighRiskLeverage, TradeReminderType.TokenHoneypot, TradeReminderType.MCapEmpty, TradeReminderType.QuoteDapp, TradeReminderType.NoLiquidityForOKX, TradeReminderType.QuoteNoLiquidityFallback, TradeReminderType.QuoteFailed, TradeReminderType.QuoteBlackAddress, TradeReminderType.QuoteHoneypot, TradeReminderType.QuoteNoLiquidityServer, TradeReminderType.NoSupportTPLS, TradeReminderType.LimitMiniTradeAmount, TradeReminderType.RevokeApproval, TradeReminderType.SAOrderLimitExceeded).contains(tradeReminderType) ? ReminderTierType.Blocking : ReminderTierType.Blocking;
    }

    public static final TradeReminderType AEQbTJ(@NotNull PreCheckModel preCheckModel) {
        Intrinsics.checkNotNullParameter(preCheckModel, "");
        int i = Activity.EZpvd[preCheckModel.getStatus().ordinal()];
        if (i == 1) {
            return TradeReminderType.None;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return TradeReminderType.PRE_CHECK_ERROR;
    }
}
