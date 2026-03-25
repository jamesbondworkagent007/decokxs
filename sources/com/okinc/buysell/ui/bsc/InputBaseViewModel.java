package com.okinc.buysell.ui.bsc;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.util.InputType;
import com.okinc.buysell.ui.bsc.util.InputUtils;
import com.okinc.fiat.api.bean.FiatCryptoRange;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C31661lzi;
import o.C32989mnw;
import o.C33129mqd;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.mHA;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class InputBaseViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public boolean DbNXlk;
    public FiatCryptoRange djBIcL;
    public boolean ejfBZ;
    public boolean fJNWhG;
    public FiatCryptoRange fetchVPNInfo;
    public boolean isConnected;
    public boolean values;
    public final MutableLiveData<C32989mnw<AmountCheckResult>> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<InputValidationResult>> OLrzqt = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<InputType>> copydefault = new MutableLiveData<>();
    public InputType valueOf = InputType.FIAT_INPUT;
    public String KWHzl = "0";
    public String AuCTel = "0";
    public String AYXKKw = "";
    public int AkhnZx = 2;
    public int AhwBna = 2;
    public List<Integer> fIwbmz = yDY.AhwBna();
    public StateListAnimator gEmmrt = new StateListAnimator(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputType.values().length];
            try {
                iArr[InputType.CRYPTO_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputType.FIAT_INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(FiatCryptoRange fiatCryptoRange) {
        this.fetchVPNInfo = fiatCryptoRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.DbNXlk = z;
    }

    public abstract void AEQbTJ(boolean z, VerificationStatus verificationStatus, @NotNull String str, Channel channel);

    public abstract int AYXKKw();

    public abstract FiatCryptoRange AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<InputValidationResult>> AuCTel() {
        return this.OLrzqt;
    }

    public abstract TradeType DbNXlk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AhwBna;
    }

    public abstract AmountCheckResult EZpvd(boolean z, @NotNull String str, @NotNull String str2, Channel channel);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.gEmmrt = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.fJNWhG = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputType KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.values = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    public abstract String OLrzqt(InputType inputType, BaseBuySellViewModel.ActionBar actionBar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fIwbmz = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.ejfBZ = z;
    }

    public final boolean OLrzqt(double d) {
        return d == AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatCryptoRange copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(FiatCryptoRange fiatCryptoRange) {
        this.djBIcL = fiatCryptoRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator ejfBZ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<InputType>> fARcdN() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fIwbmz() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatCryptoRange fJNWhG() {
        return this.fetchVPNInfo;
    }

    public abstract int fetchVPNInfo();

    public abstract int gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<AmountCheckResult>> isConnected() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> iwGUEr() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputType valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.AYXKKw;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        public final String EZpvd;
        public final String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.EZpvd;
            }
            return stateListAnimator.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(String str, String str2) {
            return new StateListAnimator(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.KWHzl;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DexTradeLimit(maxDexDailyLimit=" + this.KWHzl + ", remainingDexDailyLimit=" + this.EZpvd + ")";
        }

        public StateListAnimator(String str, String str2) {
            this.KWHzl = str;
            this.EZpvd = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:60) call: com.okinc.buysell.ui.bsc.InputBaseViewModel.StateListAnimator.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    public final void copydefault(@NotNull InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        this.valueOf = inputType;
        mHA.OLrzqt.OLrzqt(this.copydefault, inputType);
    }

    public final void EZpvd(@NotNull AmountCheckResult amountCheckResult) {
        Intrinsics.checkNotNullParameter(amountCheckResult, "");
        mHA.OLrzqt.OLrzqt(this.AEQbTJ, amountCheckResult);
    }

    public final void OLrzqt(@NotNull InputValidationResult inputValidationResult) {
        Intrinsics.checkNotNullParameter(inputValidationResult, "");
        mHA.OLrzqt.OLrzqt(this.OLrzqt, inputValidationResult);
    }

    public final void AubY() {
        InputType inputType;
        int i = Application.AEQbTJ[this.valueOf.ordinal()];
        if (i == 1) {
            inputType = InputType.FIAT_INPUT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            inputType = InputType.CRYPTO_INPUT;
        }
        this.valueOf = inputType;
        copydefault(inputType);
    }

    public final void copydefault(String str) {
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            str = "0";
        }
        this.AuCTel = str;
    }

    public final void AEQbTJ(String str) {
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            str = "0";
        }
        this.KWHzl = str;
    }

    public static /* synthetic */ void saveContent$default(InputBaseViewModel inputBaseViewModel, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveContent");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        inputBaseViewModel.copydefault(str, z);
    }

    public final void copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!Intrinsics.EZpvd((Object) str, (Object) djBIcL()) || z) {
            int i = Application.AEQbTJ[this.valueOf.ordinal()];
            if (i == 1) {
                AEQbTJ(str);
                copydefault(AkhnZx());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                copydefault(str);
                AEQbTJ(AEQbTJ());
            }
        }
    }

    public final String EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i = Application.AEQbTJ[this.valueOf.ordinal()];
        if (i == 1) {
            return InputUtils.AEQbTJ.EZpvd(this.valueOf, str, str2, AkhnZx(), AYXKKw());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return InputUtils.AEQbTJ.EZpvd(this.valueOf, str, str2, AEQbTJ(), gEmmrt());
    }

    public final String AEQbTJ() {
        int i = Application.AEQbTJ[this.valueOf.ordinal()];
        if (i == 1) {
            return djBIcL();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        InputUtils inputUtils = InputUtils.AEQbTJ;
        return (inputUtils.copydefault(this.isConnected, this.values, this.KWHzl, this.AuCTel) || this.DbNXlk) ? this.KWHzl : C33129mqd.AEQbTJ(this.AuCTel) <= AudioStats.AUDIO_AMPLITUDE_NONE ? "0" : inputUtils.copydefault(djBIcL(), this.AYXKKw, gEmmrt());
    }

    public final String AkhnZx() {
        int i = Application.AEQbTJ[this.valueOf.ordinal()];
        if (i == 1) {
            InputUtils inputUtils = InputUtils.AEQbTJ;
            return (inputUtils.copydefault(this.isConnected, this.values, this.KWHzl, this.AuCTel) || this.DbNXlk) ? this.AuCTel : C33129mqd.AEQbTJ(this.KWHzl) <= AudioStats.AUDIO_AMPLITUDE_NONE ? "0" : inputUtils.EZpvd(djBIcL(), this.AYXKKw, AYXKKw());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return djBIcL();
    }

    public final String djBIcL() {
        int i = Application.AEQbTJ[this.valueOf.ordinal()];
        if (i == 1) {
            return this.KWHzl;
        }
        if (i == 2) {
            return this.AuCTel;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String KWHzl(@NotNull InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        int i = Application.AEQbTJ[inputType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (DbNXlk() != TradeType.BUY) {
                InputUtils inputUtils = InputUtils.AEQbTJ;
                TradeType tradeType = TradeType.SELL;
                FiatCryptoRange fiatCryptoRange = this.djBIcL;
                return inputUtils.copydefault(tradeType, fiatCryptoRange != null ? fiatCryptoRange.getMax() : "", this.AYXKKw, this.AkhnZx);
            }
            FiatCryptoRange fiatCryptoRange2 = this.fetchVPNInfo;
            if (fiatCryptoRange2 != null) {
                return fiatCryptoRange2.getMax();
            }
        } else {
            if (DbNXlk() != TradeType.SELL) {
                InputUtils inputUtils2 = InputUtils.AEQbTJ;
                TradeType tradeType2 = TradeType.BUY;
                FiatCryptoRange fiatCryptoRange3 = this.fetchVPNInfo;
                return inputUtils2.copydefault(tradeType2, fiatCryptoRange3 != null ? fiatCryptoRange3.getMax() : "", this.AYXKKw, this.AhwBna);
            }
            FiatCryptoRange fiatCryptoRange4 = this.djBIcL;
            if (fiatCryptoRange4 != null) {
                return fiatCryptoRange4.getMax();
            }
        }
        return null;
    }

    public final String OLrzqt(BaseBuySellViewModel.ActionBar actionBar) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        String strAEQbTJ = this.gEmmrt.AEQbTJ();
        String str = strAEQbTJ == null ? "" : strAEQbTJ;
        String currency = (actionBar == null || (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getCurrency();
        if (currency == null) {
            currency = "";
        }
        return C31661lzi.prependFiatSymbol$default(str, currency, getCurrentUnit$default(this, null, actionBar, 1, null), null, null, false, 28, null);
    }

    public final String EZpvd(BaseBuySellViewModel.ActionBar actionBar) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        String strOLrzqt = this.gEmmrt.OLrzqt();
        String str = strOLrzqt == null ? "" : strOLrzqt;
        String currency = (actionBar == null || (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getCurrency();
        if (currency == null) {
            currency = "";
        }
        return C31661lzi.prependFiatSymbol$default(str, currency, getCurrentUnit$default(this, null, actionBar, 1, null), null, null, false, 28, null);
    }

    public String EZpvd(BaseBuySellViewModel.ActionBar actionBar, boolean z, boolean z2, boolean z3, @NotNull String str) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        BuySellCurrency buySellCurrencyAEQbTJ2;
        BuySellCurrency buySellCurrencyAEQbTJ3;
        Intrinsics.checkNotNullParameter(str, "");
        FiatCryptoRange fiatCryptoRangeAhwBna = AhwBna();
        String currency = null;
        String min = fiatCryptoRangeAhwBna != null ? fiatCryptoRangeAhwBna.getMin() : null;
        String str2 = min == null ? "" : min;
        int i = Application.AEQbTJ[this.valueOf.ordinal()];
        if (i == 1) {
            return C31661lzi.appendCryptoSymbol$default(str2, getCurrentUnit$default(this, null, actionBar, 1, null), 0, null, RoundingMode.UP, null, 22, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            if (actionBar != null && (buySellCurrencyAEQbTJ3 = actionBar.AEQbTJ()) != null) {
                currency = buySellCurrencyAEQbTJ3.getCurrency();
            }
            return C31661lzi.appendCryptoSymbol$default(str2, currency == null ? "" : currency, 0, null, RoundingMode.UP, null, 22, null);
        }
        if (!z2) {
            String currency2 = (actionBar == null || (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getCurrency();
            return C31661lzi.prependFiatSymbol$default(str2, currency2 != null ? currency2 : "", getCurrentUnit$default(this, null, actionBar, 1, null), null, null, false, 28, null);
        }
        if (z3) {
            return C31661lzi.prependFiatSymbol$default(str2, str, "", null, null, false, 28, null);
        }
        if (actionBar != null && (buySellCurrencyAEQbTJ2 = actionBar.AEQbTJ()) != null) {
            currency = buySellCurrencyAEQbTJ2.getCurrency();
        }
        return C31661lzi.appendCryptoSymbol$default(str2, currency == null ? "" : currency, 0, null, RoundingMode.UP, null, 22, null);
    }

    public String KWHzl(BaseBuySellViewModel.ActionBar actionBar, boolean z, boolean z2, boolean z3, @NotNull String str) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        BuySellCurrency buySellCurrencyAEQbTJ2;
        Intrinsics.checkNotNullParameter(str, "");
        FiatCryptoRange fiatCryptoRangeAhwBna = AhwBna();
        String currency = null;
        String max = fiatCryptoRangeAhwBna != null ? fiatCryptoRangeAhwBna.getMax() : null;
        String str2 = max == null ? "" : max;
        int i = Application.AEQbTJ[this.valueOf.ordinal()];
        if (i == 1) {
            return C31661lzi.appendCryptoSymbol$default(str2, getCurrentUnit$default(this, null, actionBar, 1, null), 0, null, null, null, 30, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return C31661lzi.appendCryptoSymbol$default(str2, getCurrentUnit$default(this, null, actionBar, 1, null), 0, null, null, null, 30, null);
        }
        if (!z2) {
            String currency2 = (actionBar == null || (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getCurrency();
            return C31661lzi.prependFiatSymbol$default(str2, currency2 != null ? currency2 : "", getCurrentUnit$default(this, null, actionBar, 1, null), null, null, false, 28, null);
        }
        if (z3) {
            return C31661lzi.prependFiatSymbol$default(str2, str, "", null, null, false, 28, null);
        }
        if (actionBar != null && (buySellCurrencyAEQbTJ2 = actionBar.AEQbTJ()) != null) {
            currency = buySellCurrencyAEQbTJ2.getCurrency();
        }
        return C31661lzi.appendCryptoSymbol$default(str2, currency == null ? "" : currency, 0, null, null, null, 30, null);
    }

    public final boolean EZpvd(@NotNull FiatCryptoRange fiatCryptoRange, double d) {
        Intrinsics.checkNotNullParameter(fiatCryptoRange, "");
        return InputUtils.AEQbTJ.OLrzqt(fiatCryptoRange, d);
    }

    public final boolean copydefault(@NotNull FiatCryptoRange fiatCryptoRange, double d) {
        Intrinsics.checkNotNullParameter(fiatCryptoRange, "");
        return InputUtils.AEQbTJ.EZpvd(fiatCryptoRange, d);
    }

    public final boolean OLrzqt(FiatCryptoRange fiatCryptoRange) {
        String min = fiatCryptoRange != null ? fiatCryptoRange.getMin() : null;
        String strAEQbTJ = this.gEmmrt.AEQbTJ();
        if (min == null || min.length() == 0 || strAEQbTJ == null || strAEQbTJ.length() == 0) {
            return false;
        }
        return C33129mqd.gEmmrt(strAEQbTJ, min);
    }

    public final boolean KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strAEQbTJ = this.gEmmrt.AEQbTJ();
        if (str.length() == 0 || strAEQbTJ == null || strAEQbTJ.length() == 0) {
            return false;
        }
        return C33129mqd.gEmmrt(strAEQbTJ, str);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, Channel channel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw = str;
        copydefault(djBIcL(), true);
        if (this.fJNWhG) {
            this.fJNWhG = false;
        } else {
            EZpvd(false, djBIcL(), str2, channel);
        }
        this.isConnected = false;
        this.values = false;
    }

    public final boolean KWHzl(FiatCryptoRange fiatCryptoRange, double d) {
        if (fiatCryptoRange == null) {
            return false;
        }
        if (!fiatCryptoRange.isRightClose() || d <= C33129mqd.AEQbTJ(fiatCryptoRange.getMax())) {
            return !fiatCryptoRange.isRightClose() && d >= C33129mqd.AEQbTJ(fiatCryptoRange.getMax());
        }
        return true;
    }

    public final boolean AEQbTJ(FiatCryptoRange fiatCryptoRange, double d) {
        if (fiatCryptoRange == null) {
            return false;
        }
        if (!fiatCryptoRange.isLeftClose() || d >= C33129mqd.AEQbTJ(fiatCryptoRange.getMin())) {
            return !fiatCryptoRange.isLeftClose() && d <= C33129mqd.AEQbTJ(fiatCryptoRange.getMin());
        }
        return true;
    }

    public final boolean EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((Object) str, (Object) ChannelPlatformCode.BALANCE.getCode());
    }

    public final boolean copydefault(Channel channel) {
        return channel != null && channel.getCategoryCode() == ChannelCategoryCode.NATIVE;
    }

    public final int OLrzqt(@NotNull InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        int i = Application.AEQbTJ[inputType.ordinal()];
        if (i == 1) {
            return this.AhwBna;
        }
        if (i == 2) {
            return this.AkhnZx;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ String getCurrentUnit$default(InputBaseViewModel inputBaseViewModel, InputType inputType, BaseBuySellViewModel.ActionBar actionBar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentUnit");
        }
        if ((i & 1) != 0) {
            inputType = null;
        }
        return inputBaseViewModel.OLrzqt(inputType, actionBar);
    }

    public static /* synthetic */ AmountCheckResult checkContentValidate$default(InputBaseViewModel inputBaseViewModel, boolean z, String str, String str2, Channel channel, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkContentValidate");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return inputBaseViewModel.EZpvd(z, str, str2, channel);
    }

    public final void OLrzqt(boolean z, @NotNull BaseBuySellViewModel.Companion.DexTradeStatus dexTradeStatus, VerificationStatus verificationStatus, @NotNull String str, Channel channel) {
        Intrinsics.checkNotNullParameter(dexTradeStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!z || dexTradeStatus == BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR) {
            AEQbTJ(z, verificationStatus, str, channel);
        }
    }

    public final String AEQbTJ(@NotNull String str, @NotNull String str2, String str3, boolean z, boolean z2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (!z) {
            return C31661lzi.prependFiatSymbol$default(str, str2, str3 == null ? "" : str3, null, null, false, 28, null);
        }
        if (z2) {
            return C31661lzi.prependFiatSymbol$default(C33129mqd.gEmmrt(str), str4, str3 == null ? "" : str3, null, null, false, 28, null);
        }
        return C31661lzi.appendCryptoSymbol$default(str, str2, 0, null, null, null, 30, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class InputValidationResult {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InputValidationResult[] $VALUES;
        public static final InputValidationResult ZERO = new InputValidationResult("ZERO", 0);
        public static final InputValidationResult PRE_LOGIN_PRE_KYC = new InputValidationResult("PRE_LOGIN_PRE_KYC", 1);
        public static final InputValidationResult DEX_24HOUR_TRADING_LIMIT_REACHED_BALANCE = new InputValidationResult("DEX_24HOUR_TRADING_LIMIT_REACHED_BALANCE", 2);
        public static final InputValidationResult DEX_24HOUR_TRADING_LIMIT_REACHED_NATIVE = new InputValidationResult("DEX_24HOUR_TRADING_LIMIT_REACHED_NATIVE", 3);
        public static final InputValidationResult DEX_QUOTE_AMOUNT_UNAVAILABLE = new InputValidationResult("DEX_QUOTE_AMOUNT_UNAVAILABLE", 4);
        public static final InputValidationResult INPUT_BALANCE_MIN_MAX = new InputValidationResult("INPUT_BALANCE_MIN_MAX", 5);
        public static final InputValidationResult BALANCE_INPUT_MIN_MAX = new InputValidationResult("BALANCE_INPUT_MIN_MAX", 6);
        public static final InputValidationResult BALANCE_MIN_INPUT_MAX = new InputValidationResult("BALANCE_MIN_INPUT_MAX", 7);
        public static final InputValidationResult BALANCE_MIN_MAX_INPUT = new InputValidationResult("BALANCE_MIN_MAX_INPUT", 8);
        public static final InputValidationResult INPUT_MIN_BALANCE_MAX = new InputValidationResult("INPUT_MIN_BALANCE_MAX", 9);
        public static final InputValidationResult MIN_INPUT_BALANCE_MAX = new InputValidationResult("MIN_INPUT_BALANCE_MAX", 10);
        public static final InputValidationResult MIN_BALANCE_INPUT_MAX = new InputValidationResult("MIN_BALANCE_INPUT_MAX", 11);
        public static final InputValidationResult MIN_BALANCE_MAX_INPUT = new InputValidationResult("MIN_BALANCE_MAX_INPUT", 12);
        public static final InputValidationResult INPUT_MIN_MAX_BALANCE = new InputValidationResult("INPUT_MIN_MAX_BALANCE", 13);
        public static final InputValidationResult MIN_INPUT_MAX_BALANCE = new InputValidationResult("MIN_INPUT_MAX_BALANCE", 14);
        public static final InputValidationResult MIN_MAX_INPUT_BALANCE = new InputValidationResult("MIN_MAX_INPUT_BALANCE", 15);
        public static final InputValidationResult MIN_MAX_DEXMAX_INPUT_BALANCE = new InputValidationResult("MIN_MAX_DEXMAX_INPUT_BALANCE", 16);
        public static final InputValidationResult MIN_MAX_BALANCE_INPUT = new InputValidationResult("MIN_MAX_BALANCE_INPUT", 17);
        public static final InputValidationResult MIN_MAX_DEXMAX_BALANCE_INPUT = new InputValidationResult("MIN_MAX_DEXMAX_BALANCE_INPUT", 18);
        public static final InputValidationResult MAX_CHANNEL_LIMIT_LESS_THAN_BOTH_MIN = new InputValidationResult("MAX_CHANNEL_LIMIT_LESS_THAN_BOTH_MIN", 19);
        public static final InputValidationResult MAX_CHANNEL_LIMIT = new InputValidationResult("MAX_CHANNEL_LIMIT", 20);
        public static final InputValidationResult MIN_CHANNEL_LIMIT = new InputValidationResult("MIN_CHANNEL_LIMIT", 21);
        public static final InputValidationResult MAX_TRADE_LIMIT = new InputValidationResult("MAX_TRADE_LIMIT", 22);
        public static final InputValidationResult MIN_TRADE_LIMIT = new InputValidationResult("MIN_TRADE_LIMIT", 23);
        public static final InputValidationResult NATIVE_CHANNEL_VALID = new InputValidationResult("NATIVE_CHANNEL_VALID", 24);
        public static final InputValidationResult INPUT_MIN_MAX = new InputValidationResult("INPUT_MIN_MAX", 25);
        public static final InputValidationResult MIN_MAX_INPUT = new InputValidationResult("MIN_MAX_INPUT", 26);
        public static final InputValidationResult THIRD_PARTY_VALID = new InputValidationResult("THIRD_PARTY_VALID", 27);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InputValidationResult[] $values() {
            return new InputValidationResult[]{ZERO, PRE_LOGIN_PRE_KYC, DEX_24HOUR_TRADING_LIMIT_REACHED_BALANCE, DEX_24HOUR_TRADING_LIMIT_REACHED_NATIVE, DEX_QUOTE_AMOUNT_UNAVAILABLE, INPUT_BALANCE_MIN_MAX, BALANCE_INPUT_MIN_MAX, BALANCE_MIN_INPUT_MAX, BALANCE_MIN_MAX_INPUT, INPUT_MIN_BALANCE_MAX, MIN_INPUT_BALANCE_MAX, MIN_BALANCE_INPUT_MAX, MIN_BALANCE_MAX_INPUT, INPUT_MIN_MAX_BALANCE, MIN_INPUT_MAX_BALANCE, MIN_MAX_INPUT_BALANCE, MIN_MAX_DEXMAX_INPUT_BALANCE, MIN_MAX_BALANCE_INPUT, MIN_MAX_DEXMAX_BALANCE_INPUT, MAX_CHANNEL_LIMIT_LESS_THAN_BOTH_MIN, MAX_CHANNEL_LIMIT, MIN_CHANNEL_LIMIT, MAX_TRADE_LIMIT, MIN_TRADE_LIMIT, NATIVE_CHANNEL_VALID, INPUT_MIN_MAX, MIN_MAX_INPUT, THIRD_PARTY_VALID};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InputValidationResult> getEntries() {
            return $ENTRIES;
        }

        private InputValidationResult(String str, int i) {
        }

        static {
            InputValidationResult[] inputValidationResultArr$values = $values();
            $VALUES = inputValidationResultArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(inputValidationResultArr$values);
        }

        public static InputValidationResult valueOf(String str) {
            return (InputValidationResult) Enum.valueOf(InputValidationResult.class, str);
        }

        public static InputValidationResult[] values() {
            return (InputValidationResult[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class AmountCheckResult {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AmountCheckResult[] $VALUES;
        public static final AmountCheckResult MAX = new AmountCheckResult("MAX", 0);
        public static final AmountCheckResult MIN = new AmountCheckResult("MIN", 1);
        public static final AmountCheckResult ZERO = new AmountCheckResult("ZERO", 2);
        public static final AmountCheckResult NORMAL = new AmountCheckResult("NORMAL", 3);
        public static final AmountCheckResult BALANCE = new AmountCheckResult("BALANCE", 4);
        public static final AmountCheckResult BALANCE_LESS_THAN_RANGE_MIN = new AmountCheckResult("BALANCE_LESS_THAN_RANGE_MIN", 5);
        public static final AmountCheckResult BALANCE_LOW_BALANCE_MIN = new AmountCheckResult("BALANCE_LOW_BALANCE_MIN", 6);
        public static final AmountCheckResult LIMIT_BELOW_MINIMUM_ORDER = new AmountCheckResult("LIMIT_BELOW_MINIMUM_ORDER", 7);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AmountCheckResult[] $values() {
            return new AmountCheckResult[]{MAX, MIN, ZERO, NORMAL, BALANCE, BALANCE_LESS_THAN_RANGE_MIN, BALANCE_LOW_BALANCE_MIN, LIMIT_BELOW_MINIMUM_ORDER};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AmountCheckResult> getEntries() {
            return $ENTRIES;
        }

        private AmountCheckResult(String str, int i) {
        }

        static {
            AmountCheckResult[] amountCheckResultArr$values = $values();
            $VALUES = amountCheckResultArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(amountCheckResultArr$values);
        }

        public static AmountCheckResult valueOf(String str) {
            return (AmountCheckResult) Enum.valueOf(AmountCheckResult.class, str);
        }

        public static AmountCheckResult[] values() {
            return (AmountCheckResult[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.InputBaseViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
