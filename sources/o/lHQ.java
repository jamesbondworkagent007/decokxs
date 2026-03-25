package o;

import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.InputBaseViewModel;
import com.okinc.buysell.ui.bsc.util.InputUtils;
import com.okinc.fiat.api.bean.FiatCryptoRange;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lHQ extends InputBaseViewModel {

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public int fetchVPNInfo() {
        return 0;
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public TradeType DbNXlk() {
        return TradeType.SELL;
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
        int i = StateListAnimator.KWHzl[inputType.ordinal()];
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

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public FiatCryptoRange AhwBna() {
        int i = StateListAnimator.KWHzl[valueOf().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            FiatCryptoRange fiatCryptoRangeCopydefault = copydefault();
            if (fiatCryptoRangeCopydefault == null) {
                return null;
            }
            FiatCryptoRange fiatCryptoRangeCopydefault2 = copydefault();
            double dAEQbTJ = C33129mqd.AEQbTJ(fiatCryptoRangeCopydefault2 != null ? fiatCryptoRangeCopydefault2.getMin() : null);
            int iEZpvd = EZpvd();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            fiatCryptoRangeCopydefault.setMin(C33129mqd.AEQbTJ(java.lang.Double.valueOf(dAEQbTJ), java.lang.Integer.valueOf(iEZpvd), bool, RoundingMode.UP));
            FiatCryptoRange fiatCryptoRangeCopydefault3 = copydefault();
            fiatCryptoRangeCopydefault.setMax(C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(fiatCryptoRangeCopydefault3 != null ? fiatCryptoRangeCopydefault3.getMax() : null)), java.lang.Integer.valueOf(EZpvd()), bool, RoundingMode.DOWN));
            return fiatCryptoRangeCopydefault;
        }
        InputUtils inputUtils = InputUtils.AEQbTJ;
        TradeType tradeTypeDbNXlk = DbNXlk();
        FiatCryptoRange fiatCryptoRangeCopydefault4 = copydefault();
        java.lang.String min = fiatCryptoRangeCopydefault4 != null ? fiatCryptoRangeCopydefault4.getMin() : null;
        if (min == null) {
            min = "";
        }
        java.lang.String strAEQbTJ = inputUtils.AEQbTJ(tradeTypeDbNXlk, min, values(), fIwbmz());
        TradeType tradeTypeDbNXlk2 = DbNXlk();
        FiatCryptoRange fiatCryptoRangeCopydefault5 = copydefault();
        java.lang.String max = fiatCryptoRangeCopydefault5 != null ? fiatCryptoRangeCopydefault5.getMax() : null;
        java.lang.String strCopydefault = inputUtils.copydefault(tradeTypeDbNXlk2, max != null ? max : "", values(), fIwbmz());
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(strAEQbTJ);
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(strCopydefault);
        FiatCryptoRange fiatCryptoRangeCopydefault6 = copydefault();
        boolean z = fiatCryptoRangeCopydefault6 != null && fiatCryptoRangeCopydefault6.isLeftClose();
        FiatCryptoRange fiatCryptoRangeCopydefault7 = copydefault();
        return new FiatCryptoRange(strGEmmrt, strGEmmrt2, z, fiatCryptoRangeCopydefault7 != null && fiatCryptoRangeCopydefault7.isRightClose());
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public void AEQbTJ(boolean z, VerificationStatus verificationStatus, @NotNull java.lang.String str, com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        InputBaseViewModel.InputValidationResult inputValidationResult;
        Intrinsics.checkNotNullParameter(str, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(djBIcL());
        double dAEQbTJ2 = C33129mqd.AEQbTJ(OLrzqt());
        FiatCryptoRange fiatCryptoRangeAhwBna = AhwBna();
        if (verificationStatus == VerificationStatus.PRE_KYC || verificationStatus == VerificationStatus.PRE_LOGIN) {
            inputValidationResult = InputBaseViewModel.InputValidationResult.PRE_LOGIN_PRE_KYC;
        } else if (OLrzqt(dAEQbTJ)) {
            inputValidationResult = InputBaseViewModel.InputValidationResult.ZERO;
        } else if (z && OLrzqt(fiatCryptoRangeAhwBna)) {
            inputValidationResult = InputBaseViewModel.InputValidationResult.DEX_24HOUR_TRADING_LIMIT_REACHED_BALANCE;
        } else if (AEQbTJ(copydefault(), C33129mqd.AEQbTJ(str))) {
            if (dAEQbTJ2 < C33129mqd.AEQbTJ(str)) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.INPUT_BALANCE_MIN_MAX;
            } else if (AEQbTJ(fiatCryptoRangeAhwBna, dAEQbTJ)) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.BALANCE_INPUT_MIN_MAX;
            } else if (KWHzl(fiatCryptoRangeAhwBna, dAEQbTJ)) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.BALANCE_MIN_MAX_INPUT;
            } else {
                inputValidationResult = InputBaseViewModel.InputValidationResult.BALANCE_MIN_INPUT_MAX;
            }
        } else if (KWHzl(copydefault(), C33129mqd.AEQbTJ(str))) {
            if (dAEQbTJ2 > C33129mqd.AEQbTJ(str)) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_MAX_BALANCE_INPUT;
            } else if (KWHzl(fiatCryptoRangeAhwBna, dAEQbTJ)) {
                inputValidationResult = InputBaseViewModel.InputValidationResult.MIN_MAX_INPUT_BALANCE;
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
        OLrzqt(inputValidationResult);
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public InputBaseViewModel.AmountCheckResult EZpvd(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        InputBaseViewModel.AmountCheckResult amountCheckResult;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FiatCryptoRange fiatCryptoRangeAhwBna = AhwBna();
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        if ((z && OLrzqt(dAEQbTJ)) || (OLrzqt(dAEQbTJ) && !z)) {
            amountCheckResult = InputBaseViewModel.AmountCheckResult.ZERO;
        } else if (OLrzqt(copydefault(), C33129mqd.AEQbTJ(str2))) {
            amountCheckResult = InputBaseViewModel.AmountCheckResult.BALANCE_LESS_THAN_RANGE_MIN;
        } else if (EZpvd(C33129mqd.AEQbTJ(str2)) && (fiatCryptoRangeAhwBna == null || !copydefault(fiatCryptoRangeAhwBna, dAEQbTJ))) {
            amountCheckResult = InputBaseViewModel.AmountCheckResult.BALANCE;
        } else if (fiatCryptoRangeAhwBna != null && EZpvd(fiatCryptoRangeAhwBna, dAEQbTJ)) {
            amountCheckResult = InputBaseViewModel.AmountCheckResult.MIN;
        } else if (fiatCryptoRangeAhwBna != null && copydefault(fiatCryptoRangeAhwBna, dAEQbTJ)) {
            amountCheckResult = InputBaseViewModel.AmountCheckResult.MAX;
        } else {
            amountCheckResult = InputBaseViewModel.AmountCheckResult.NORMAL;
        }
        EZpvd(amountCheckResult);
        return amountCheckResult;
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public int AYXKKw() {
        return fIwbmz();
    }

    @Override // com.okinc.buysell.ui.bsc.InputBaseViewModel
    public int gEmmrt() {
        return EZpvd();
    }

    public void KWHzl(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        copydefault(InputUtils.AEQbTJ.EZpvd(channel));
    }

    private final boolean EZpvd(double d) {
        return C33129mqd.AEQbTJ(OLrzqt()) > d;
    }

    public final boolean OLrzqt(FiatCryptoRange fiatCryptoRange, double d) {
        if (fiatCryptoRange == null) {
            return false;
        }
        if (!fiatCryptoRange.isLeftClose() || d >= C33129mqd.AEQbTJ(fiatCryptoRange.getMin())) {
            return !fiatCryptoRange.isLeftClose() && d <= C33129mqd.AEQbTJ(fiatCryptoRange.getMin());
        }
        return true;
    }
}
