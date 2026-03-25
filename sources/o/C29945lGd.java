package o;

import com.google.android.gms.common.util.VisibleForTesting;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.InputBaseViewModel;
import com.okinc.buysell.ui.bsc.util.InputUtils;
import com.okinc.fiat.api.bean.FiatCryptoRange;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C29945lGd extends InputBaseViewModel {

    /* JADX INFO: renamed from: o.lGd$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[com.okinc.buysell.ui.bsc.util.InputType.values().length];
            try {
                iArr[com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public TradeType DbNXlk() {
        return TradeType.BUY;
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public int fetchVPNInfo() {
        int i = ActionBar.OLrzqt[valueOf().ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        return r1;
     */
    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String OLrzqt(com.okinc.buysell.ui.bsc.util.InputType inputType, BaseBuySellViewModel.ActionBar actionBar) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        CurrencyToken currencyTokenCopydefault;
        if (inputType == null) {
            inputType = valueOf();
        }
        int i = ActionBar.OLrzqt[inputType.ordinal()];
        java.lang.String symbol = null;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (actionBar != null && (currencyTokenCopydefault = actionBar.copydefault()) != null) {
                symbol = currencyTokenCopydefault.getCurrency();
            }
        } else if (actionBar != null && (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) != null) {
            symbol = buySellCurrencyAEQbTJ.getSymbol();
        }
    }

    public final java.lang.String KWHzl(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, BaseBuySellViewModel.ActionBar actionBar) {
        kotlin.Pair pairOLrzqt;
        BuySellCurrency buySellCurrencyAEQbTJ;
        BuySellCurrency buySellCurrencyAEQbTJ2;
        TradeLimit tradeLimit;
        TradeLimit tradeLimit2;
        java.lang.String currency = null;
        double dAEQbTJ = C33129mqd.AEQbTJ((channel == null || (tradeLimit2 = channel.getTradeLimit()) == null) ? null : tradeLimit2.getMinTradeLimit());
        double dAEQbTJ2 = C33129mqd.AEQbTJ((channel == null || (tradeLimit = channel.getTradeLimit()) == null) ? null : tradeLimit.getMinChannelLimit());
        if (dAEQbTJ > dAEQbTJ2) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), InputBaseViewModel.InputValidationResult.MIN_TRADE_LIMIT);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Double.valueOf(dAEQbTJ2), InputBaseViewModel.InputValidationResult.MIN_CHANNEL_LIMIT);
        }
        double dDoubleValue = ((java.lang.Number) pairOLrzqt.component1()).doubleValue();
        if (((InputBaseViewModel.InputValidationResult) pairOLrzqt.component2()) == InputBaseViewModel.InputValidationResult.MIN_CHANNEL_LIMIT) {
            java.lang.String strAEQbTJ = C33129mqd.AEQbTJ(java.lang.Double.valueOf(dDoubleValue), java.lang.Integer.valueOf(fIwbmz()), java.lang.Boolean.TRUE, RoundingMode.UP);
            if (actionBar != null && (buySellCurrencyAEQbTJ2 = actionBar.AEQbTJ()) != null) {
                currency = buySellCurrencyAEQbTJ2.getCurrency();
            }
            return C31661lzi.prependFiatSymbol$default(strAEQbTJ, currency == null ? "" : currency, OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT, actionBar), null, null, false, 28, null);
        }
        java.lang.String strOLrzqt = OLrzqt(valueOf(), actionBar);
        int i = ActionBar.OLrzqt[valueOf().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C31661lzi.appendCryptoSymbol$default(InputUtils.AEQbTJ.AEQbTJ(DbNXlk(), C33129mqd.OLrzqt(java.lang.Double.valueOf(dDoubleValue)), values(), EZpvd()), strOLrzqt, 0, null, null, null, 30, null);
        }
        java.lang.String strAEQbTJ2 = C33129mqd.AEQbTJ(java.lang.Double.valueOf(dDoubleValue), java.lang.Integer.valueOf(fIwbmz()), java.lang.Boolean.TRUE, RoundingMode.UP);
        if (actionBar != null && (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) != null) {
            currency = buySellCurrencyAEQbTJ.getCurrency();
        }
        return C31661lzi.prependFiatSymbol$default(strAEQbTJ2, currency == null ? "" : currency, strOLrzqt, null, null, false, 28, null);
    }

    public final java.lang.String EZpvd(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, BaseBuySellViewModel.ActionBar actionBar) {
        kotlin.Pair pairOLrzqt;
        BuySellCurrency buySellCurrencyAEQbTJ;
        BuySellCurrency buySellCurrencyAEQbTJ2;
        TradeLimit tradeLimit;
        TradeLimit tradeLimit2;
        java.lang.String currency = null;
        double dAEQbTJ = C33129mqd.AEQbTJ((channel == null || (tradeLimit2 = channel.getTradeLimit()) == null) ? null : tradeLimit2.getMaxTradeLimit());
        double dAEQbTJ2 = C33129mqd.AEQbTJ((channel == null || (tradeLimit = channel.getTradeLimit()) == null) ? null : tradeLimit.getMaxChannelLimit());
        if (dAEQbTJ < dAEQbTJ2) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Double.valueOf(dAEQbTJ), InputBaseViewModel.InputValidationResult.MAX_TRADE_LIMIT);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Double.valueOf(dAEQbTJ2), InputBaseViewModel.InputValidationResult.MAX_CHANNEL_LIMIT);
        }
        double dDoubleValue = ((java.lang.Number) pairOLrzqt.component1()).doubleValue();
        if (((InputBaseViewModel.InputValidationResult) pairOLrzqt.component2()) == InputBaseViewModel.InputValidationResult.MAX_CHANNEL_LIMIT) {
            java.lang.String strAEQbTJ = C33129mqd.AEQbTJ(java.lang.Double.valueOf(dDoubleValue), java.lang.Integer.valueOf(fIwbmz()), java.lang.Boolean.TRUE, RoundingMode.DOWN);
            if (actionBar != null && (buySellCurrencyAEQbTJ2 = actionBar.AEQbTJ()) != null) {
                currency = buySellCurrencyAEQbTJ2.getCurrency();
            }
            return C31661lzi.prependFiatSymbol$default(strAEQbTJ, currency == null ? "" : currency, OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT, actionBar), null, null, false, 28, null);
        }
        java.lang.String strOLrzqt = OLrzqt(valueOf(), actionBar);
        int i = ActionBar.OLrzqt[valueOf().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C31661lzi.appendCryptoSymbol$default(InputUtils.AEQbTJ.copydefault(DbNXlk(), C33129mqd.OLrzqt(java.lang.Double.valueOf(dDoubleValue)), values(), EZpvd()), strOLrzqt, 0, null, null, null, 30, null);
        }
        java.lang.String strAEQbTJ2 = C33129mqd.AEQbTJ(java.lang.Double.valueOf(dDoubleValue), java.lang.Integer.valueOf(fIwbmz()), java.lang.Boolean.TRUE, RoundingMode.DOWN);
        if (actionBar != null && (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) != null) {
            currency = buySellCurrencyAEQbTJ.getCurrency();
        }
        return C31661lzi.prependFiatSymbol$default(strAEQbTJ2, currency == null ? "" : currency, strOLrzqt, null, null, false, 28, null);
    }

    public final java.lang.String AEQbTJ(@NotNull com.okinc.buysell.ui.bsc.util.InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        int i = ActionBar.OLrzqt[inputType.ordinal()];
        if (i == 1) {
            java.lang.String strAEQbTJ = ejfBZ().AEQbTJ();
            return strAEQbTJ == null ? "" : strAEQbTJ;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        InputUtils inputUtils = InputUtils.AEQbTJ;
        TradeType tradeType = TradeType.BUY;
        java.lang.String strAEQbTJ2 = ejfBZ().AEQbTJ();
        return inputUtils.copydefault(tradeType, strAEQbTJ2 != null ? strAEQbTJ2 : "", values(), fIwbmz());
    }

    public final java.lang.String AEQbTJ(@NotNull com.okinc.buysell.ui.bsc.util.InputType inputType, com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        TradeLimit tradeLimit;
        TradeLimit tradeLimit2;
        Intrinsics.checkNotNullParameter(inputType, "");
        java.lang.String maxChannelLimit = null;
        java.lang.String maxTradeLimit = (channel == null || (tradeLimit2 = channel.getTradeLimit()) == null) ? null : tradeLimit2.getMaxTradeLimit();
        if (channel != null && (tradeLimit = channel.getTradeLimit()) != null) {
            maxChannelLimit = tradeLimit.getMaxChannelLimit();
        }
        java.lang.String strKWHzl = C33129mqd.KWHzl(maxTradeLimit, maxChannelLimit);
        int i = ActionBar.OLrzqt[inputType.ordinal()];
        if (i == 1) {
            return strKWHzl;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return InputUtils.AEQbTJ.copydefault(DbNXlk(), strKWHzl, values(), EZpvd());
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public FiatCryptoRange AhwBna() {
        int i = ActionBar.OLrzqt[valueOf().ordinal()];
        if (i == 1) {
            FiatCryptoRange fiatCryptoRangeFJNWhG = fJNWhG();
            if (fiatCryptoRangeFJNWhG == null) {
                return null;
            }
            FiatCryptoRange fiatCryptoRangeFJNWhG2 = fJNWhG();
            double dAEQbTJ = C33129mqd.AEQbTJ(fiatCryptoRangeFJNWhG2 != null ? fiatCryptoRangeFJNWhG2.getMin() : null);
            int iFIwbmz = fIwbmz();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            fiatCryptoRangeFJNWhG.setMin(C33129mqd.AEQbTJ(java.lang.Double.valueOf(dAEQbTJ), java.lang.Integer.valueOf(iFIwbmz), bool, RoundingMode.UP));
            FiatCryptoRange fiatCryptoRangeFJNWhG3 = fJNWhG();
            fiatCryptoRangeFJNWhG.setMax(C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(fiatCryptoRangeFJNWhG3 != null ? fiatCryptoRangeFJNWhG3.getMax() : null)), java.lang.Integer.valueOf(fIwbmz()), bool, RoundingMode.DOWN));
            return fiatCryptoRangeFJNWhG;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        InputUtils inputUtils = InputUtils.AEQbTJ;
        TradeType tradeTypeDbNXlk = DbNXlk();
        FiatCryptoRange fiatCryptoRangeFJNWhG4 = fJNWhG();
        java.lang.String min = fiatCryptoRangeFJNWhG4 != null ? fiatCryptoRangeFJNWhG4.getMin() : null;
        if (min == null) {
            min = "";
        }
        java.lang.String strAEQbTJ = inputUtils.AEQbTJ(tradeTypeDbNXlk, min, values(), EZpvd());
        TradeType tradeTypeDbNXlk2 = DbNXlk();
        FiatCryptoRange fiatCryptoRangeFJNWhG5 = fJNWhG();
        java.lang.String max = fiatCryptoRangeFJNWhG5 != null ? fiatCryptoRangeFJNWhG5.getMax() : null;
        java.lang.String strCopydefault = inputUtils.copydefault(tradeTypeDbNXlk2, max != null ? max : "", values(), EZpvd());
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(strAEQbTJ);
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(strCopydefault);
        FiatCryptoRange fiatCryptoRangeFJNWhG6 = fJNWhG();
        boolean z = fiatCryptoRangeFJNWhG6 != null && fiatCryptoRangeFJNWhG6.isLeftClose();
        FiatCryptoRange fiatCryptoRangeFJNWhG7 = fJNWhG();
        return new FiatCryptoRange(strGEmmrt, strGEmmrt2, z, fiatCryptoRangeFJNWhG7 != null && fiatCryptoRangeFJNWhG7.isRightClose());
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public void AEQbTJ(boolean z, VerificationStatus verificationStatus, @NotNull java.lang.String str, com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        InputBaseViewModel.InputValidationResult inputValidationResult;
        kotlin.Pair pairOLrzqt;
        kotlin.Pair pairOLrzqt2;
        InputBaseViewModel.InputValidationResult inputValidationResult2;
        TradeLimit tradeLimit;
        TradeLimit tradeLimit2;
        TradeLimit tradeLimit3;
        TradeLimit tradeLimit4;
        Intrinsics.checkNotNullParameter(str, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(djBIcL());
        double dAEQbTJ2 = C33129mqd.AEQbTJ(uzCIH());
        FiatCryptoRange fiatCryptoRangeAhwBna = AhwBna();
        java.lang.String maxChannelLimit = null;
        java.lang.String depositPlatformCode = channel != null ? channel.getDepositPlatformCode() : null;
        boolean zEZpvd = EZpvd(depositPlatformCode != null ? depositPlatformCode : "");
        if (verificationStatus == VerificationStatus.PRE_KYC || verificationStatus == VerificationStatus.PRE_LOGIN) {
            inputValidationResult = InputBaseViewModel.InputValidationResult.PRE_LOGIN_PRE_KYC;
        } else if (OLrzqt(dAEQbTJ)) {
            inputValidationResult = InputBaseViewModel.InputValidationResult.ZERO;
        } else if (zEZpvd) {
            if (z && OLrzqt(fiatCryptoRangeAhwBna)) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.DEX_24HOUR_TRADING_LIMIT_REACHED_BALANCE;
            } else if (AEQbTJ(fJNWhG(), C33129mqd.AEQbTJ(str))) {
                if (dAEQbTJ2 < C33129mqd.AEQbTJ(str)) {
                    inputValidationResult = InputBaseViewModel.InputValidationResult.INPUT_BALANCE_MIN_MAX;
                } else if (AEQbTJ(fiatCryptoRangeAhwBna, dAEQbTJ)) {
                    inputValidationResult = InputBaseViewModel.InputValidationResult.BALANCE_INPUT_MIN_MAX;
                } else if (KWHzl(fiatCryptoRangeAhwBna, dAEQbTJ)) {
                    inputValidationResult = InputBaseViewModel.InputValidationResult.BALANCE_MIN_MAX_INPUT;
                } else {
                    inputValidationResult = InputBaseViewModel.InputValidationResult.BALANCE_MIN_INPUT_MAX;
                }
            } else if (KWHzl(fJNWhG(), C33129mqd.AEQbTJ(str))) {
                if (dAEQbTJ2 > C33129mqd.AEQbTJ(str)) {
                    if (z && C33129mqd.gEmmrt(ejfBZ().AEQbTJ(), java.lang.Double.valueOf(C33129mqd.AEQbTJ(str))) && KWHzl(fJNWhG(), C33129mqd.AEQbTJ(ejfBZ().AEQbTJ()))) {
                        inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_MAX_DEXMAX_BALANCE_INPUT;
                    } else {
                        inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_MAX_BALANCE_INPUT;
                    }
                } else if (KWHzl(fiatCryptoRangeAhwBna, dAEQbTJ)) {
                    if (z && C33129mqd.gEmmrt(ejfBZ().AEQbTJ(), java.lang.Double.valueOf(dAEQbTJ2)) && KWHzl(fJNWhG(), C33129mqd.AEQbTJ(ejfBZ().AEQbTJ()))) {
                        inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_MAX_DEXMAX_INPUT_BALANCE;
                    } else {
                        inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_MAX_INPUT_BALANCE;
                    }
                } else if (AEQbTJ(fiatCryptoRangeAhwBna, dAEQbTJ)) {
                    inputValidationResult = InputBaseViewModel.InputValidationResult.INPUT_MIN_MAX_BALANCE;
                } else if (z && getFieldNames()) {
                    inputValidationResult = InputBaseViewModel.InputValidationResult.DEX_QUOTE_AMOUNT_UNAVAILABLE;
                } else {
                    inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_INPUT_MAX_BALANCE;
                }
            } else if (AEQbTJ(fiatCryptoRangeAhwBna, dAEQbTJ)) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.INPUT_MIN_BALANCE_MAX;
            } else if (KWHzl(fiatCryptoRangeAhwBna, dAEQbTJ)) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_BALANCE_MAX_INPUT;
            } else if (dAEQbTJ2 > C33129mqd.AEQbTJ(str)) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_BALANCE_INPUT_MAX;
            } else if (z && getFieldNames()) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.DEX_QUOTE_AMOUNT_UNAVAILABLE;
            } else {
                inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_INPUT_BALANCE_MAX;
            }
        } else if (copydefault(channel)) {
            double dAEQbTJ3 = C33129mqd.AEQbTJ((channel == null || (tradeLimit4 = channel.getTradeLimit()) == null) ? null : tradeLimit4.getMinTradeLimit());
            double dAEQbTJ4 = C33129mqd.AEQbTJ((channel == null || (tradeLimit3 = channel.getTradeLimit()) == null) ? null : tradeLimit3.getMaxTradeLimit());
            double dAEQbTJ5 = C33129mqd.AEQbTJ((channel == null || (tradeLimit2 = channel.getTradeLimit()) == null) ? null : tradeLimit2.getMinChannelLimit());
            if (channel != null && (tradeLimit = channel.getTradeLimit()) != null) {
                maxChannelLimit = tradeLimit.getMaxChannelLimit();
            }
            double dAEQbTJ6 = C33129mqd.AEQbTJ(maxChannelLimit);
            if (dAEQbTJ4 < dAEQbTJ6) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Double.valueOf(dAEQbTJ4), InputBaseViewModel.InputValidationResult.MAX_TRADE_LIMIT);
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Double.valueOf(dAEQbTJ6), InputBaseViewModel.InputValidationResult.MAX_CHANNEL_LIMIT);
            }
            double dDoubleValue = ((java.lang.Number) pairOLrzqt.component1()).doubleValue();
            InputBaseViewModel.InputValidationResult inputValidationResult3 = (InputBaseViewModel.InputValidationResult) pairOLrzqt.component2();
            if (dAEQbTJ3 > dAEQbTJ5) {
                pairOLrzqt2 = C56390yDp.OLrzqt(java.lang.Double.valueOf(dAEQbTJ3), InputBaseViewModel.InputValidationResult.MIN_TRADE_LIMIT);
            } else {
                pairOLrzqt2 = C56390yDp.OLrzqt(java.lang.Double.valueOf(dAEQbTJ5), InputBaseViewModel.InputValidationResult.MIN_CHANNEL_LIMIT);
            }
            double dDoubleValue2 = ((java.lang.Number) pairOLrzqt2.component1()).doubleValue();
            InputBaseViewModel.InputValidationResult inputValidationResult4 = (InputBaseViewModel.InputValidationResult) pairOLrzqt2.component2();
            if (z) {
                inputValidationResult2 = inputValidationResult3;
                if (KWHzl(C33129mqd.OLrzqt(java.lang.Double.valueOf(dDoubleValue2)))) {
                    inputValidationResult = InputBaseViewModel.InputValidationResult.DEX_24HOUR_TRADING_LIMIT_REACHED_NATIVE;
                }
            } else {
                inputValidationResult2 = inputValidationResult3;
            }
            if (dAEQbTJ6 < dAEQbTJ3 || dAEQbTJ6 < dAEQbTJ5 || dAEQbTJ4 < dAEQbTJ3 || dAEQbTJ4 < dAEQbTJ5) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.MAX_CHANNEL_LIMIT_LESS_THAN_BOTH_MIN;
            } else if (dAEQbTJ2 > dDoubleValue) {
                inputValidationResult = inputValidationResult2;
            } else if (dAEQbTJ2 < dDoubleValue2) {
                inputValidationResult = inputValidationResult4;
            } else if (z && getFieldNames()) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.DEX_QUOTE_AMOUNT_UNAVAILABLE;
            } else {
                inputValidationResult = InputBaseViewModel.InputValidationResult.NATIVE_CHANNEL_VALID;
            }
        } else if (AEQbTJ(fiatCryptoRangeAhwBna, dAEQbTJ)) {
            inputValidationResult = InputBaseViewModel.InputValidationResult.INPUT_MIN_MAX;
        } else if (KWHzl(fiatCryptoRangeAhwBna, dAEQbTJ)) {
            inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_MAX_INPUT;
        } else if (z && getFieldNames()) {
            inputValidationResult = InputBaseViewModel.InputValidationResult.DEX_QUOTE_AMOUNT_UNAVAILABLE;
        } else {
            inputValidationResult = InputBaseViewModel.InputValidationResult.THIRD_PARTY_VALID;
        }
        OLrzqt(inputValidationResult);
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public InputBaseViewModel.AmountCheckResult EZpvd(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        InputBaseViewModel.AmountCheckResult amountCheckResultOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        java.lang.String depositPlatformCode = channel != null ? channel.getDepositPlatformCode() : null;
        boolean zEZpvd = EZpvd(depositPlatformCode != null ? depositPlatformCode : "");
        boolean z2 = (channel != null ? channel.getCategoryCode() : null) == ChannelCategoryCode.NATIVE;
        FiatCryptoRange fiatCryptoRangeAhwBna = AhwBna();
        if ((z && OLrzqt(dAEQbTJ)) || (!z && OLrzqt(dAEQbTJ))) {
            amountCheckResultOLrzqt = InputBaseViewModel.AmountCheckResult.ZERO;
        } else if (z2 && EZpvd(channel)) {
            amountCheckResultOLrzqt = InputBaseViewModel.AmountCheckResult.LIMIT_BELOW_MINIMUM_ORDER;
        } else if (zEZpvd && fiatCryptoRangeAhwBna != null && copydefault(fiatCryptoRangeAhwBna, dAEQbTJ, C33129mqd.AEQbTJ(str2))) {
            amountCheckResultOLrzqt = OLrzqt(fiatCryptoRangeAhwBna, dAEQbTJ);
        } else if (zEZpvd && AEQbTJ(C33129mqd.AEQbTJ(str2)) && !AYXKKw(fiatCryptoRangeAhwBna, dAEQbTJ)) {
            amountCheckResultOLrzqt = InputBaseViewModel.AmountCheckResult.BALANCE;
        } else if (fiatCryptoRangeAhwBna == null || !EZpvd(fiatCryptoRangeAhwBna, dAEQbTJ)) {
            amountCheckResultOLrzqt = (fiatCryptoRangeAhwBna == null || !copydefault(fiatCryptoRangeAhwBna, dAEQbTJ)) ? InputBaseViewModel.AmountCheckResult.NORMAL : InputBaseViewModel.AmountCheckResult.MAX;
        } else {
            amountCheckResultOLrzqt = InputBaseViewModel.AmountCheckResult.MIN;
        }
        EZpvd(amountCheckResultOLrzqt);
        return amountCheckResultOLrzqt;
    }

    @VisibleForTesting
    public final boolean EZpvd(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        return channel != null && C33129mqd.AEQbTJ(channel.getMinLimitAmount(), C46876tfT.KWHzl(channel));
    }

    public final boolean copydefault(FiatCryptoRange fiatCryptoRange, double d, double d2) {
        return !copydefault(fiatCryptoRange, d) && AEQbTJ(fJNWhG(), d2);
    }

    public final boolean AYXKKw(FiatCryptoRange fiatCryptoRange, double d) {
        return fiatCryptoRange != null && copydefault(fiatCryptoRange, d);
    }

    public final InputBaseViewModel.AmountCheckResult OLrzqt(FiatCryptoRange fiatCryptoRange, double d) {
        if (!EZpvd(fiatCryptoRange, d)) {
            return InputBaseViewModel.AmountCheckResult.BALANCE_LOW_BALANCE_MIN;
        }
        return InputBaseViewModel.AmountCheckResult.BALANCE_LESS_THAN_RANGE_MIN;
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public int AYXKKw() {
        return fIwbmz();
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public int gEmmrt() {
        return EZpvd();
    }

    public void OLrzqt(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        AEQbTJ(InputUtils.AEQbTJ.EZpvd(channel));
        TradeLimit tradeLimit = channel.getTradeLimit();
        java.lang.String maxDexDailyLimit = tradeLimit != null ? tradeLimit.getMaxDexDailyLimit() : null;
        TradeLimit tradeLimit2 = channel.getTradeLimit();
        EZpvd(new InputBaseViewModel.StateListAnimator(maxDexDailyLimit, tradeLimit2 != null ? tradeLimit2.getRemainDexDailyLimit() : null));
    }

    public final boolean AEQbTJ(double d) {
        return C33129mqd.AEQbTJ(uzCIH()) > d;
    }
}
