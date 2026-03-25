package com.okinc.buysell.ui.bsc.fragment.sell;

import androidx.camera.video.AudioStats;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.InputBaseViewModel;
import com.okinc.buysell.ui.bsc.util.InputType;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C31351lsQ;
import o.C31354lsT;
import o.C31657lze;
import o.C31659lzg;
import o.C33070mpX;
import o.C33129mqd;
import o.C38307pTy;
import o.C56444yFp;
import o.InterfaceC31764mDa;
import o.InterfaceC47278tmy;
import o.InterfaceC56445yFq;
import o.lyI;
import o.lyM;
import o.lyR;
import o.lyT;
import o.lyX;
import o.pTB;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SellViewModel extends BaseBuySellViewModel {
    public final MutableStateFlow<String> AxsJAYsNCnLh;
    public final MutableStateFlow<String> DAIeex;
    public final MutableStateFlow<String> DCJXGO;
    public final MutableStateFlow<String> DCUTEI;
    public final StateFlow<String> DLWbHP;
    public final MutableStateFlow<String> DXXBbs;
    public final MutableStateFlow<Boolean> DarRvM;
    public String OBJEWx;
    public final MutableStateFlow<String> ODWQjV;
    public final StateFlow<String> OFhtUX;
    public final StateFlow<String> OHqIaq;
    public final MutableStateFlow<String> OqFWZa;
    public final StateFlow<String> OuxcSI;
    public BannerFlowType QHmsKR;
    public boolean QSBOWP;
    public final StateFlow<String> QkdxfA;
    public final StateFlow<Boolean> RKDWNf;
    public final StateFlow<String> RdAHlO;
    public final MutableStateFlow<Boolean> RlQdEF;
    public final MutableStateFlow<String> accept;
    public final StateFlow<String> dHguZz;
    public final StateFlow<String> dmfpNf;
    public final StateFlow<String> ffGIBT;
    public final MutableStateFlow<String> getPostValueLengthLimit;
    public ChipAmount gwTjWJ;
    public final StateFlow<String> hBpjJd;
    public final StateFlow<Boolean> hrNTAI;
    public final MutableStateFlow<String> zuWLRA;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DCJXGO() {
        return this.QSBOWP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> DCUTEI() {
        return this.dHguZz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> DXXBbs() {
        return this.OuxcSI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> DarRvM() {
        return this.QkdxfA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public String KWHzl() {
        return this.OBJEWx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> OqFWZa() {
        return this.ffGIBT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChipAmount OuxcSI() {
        return this.gwTjWJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> QHmsKR() {
        return this.OHqIaq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> QSBOWP() {
        return this.hrNTAI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> QkdxfA() {
        return this.OFhtUX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> RKDWNf() {
        return this.DLWbHP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public BannerFlowType copydefault() {
        return this.QHmsKR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> ffGIBT() {
        return this.hBpjJd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> getPostValueLengthLimit() {
        return this.dmfpNf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> zuWLRA() {
        return this.RdAHlO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SellViewModel(@NotNull C31659lzg c31659lzg, @NotNull C31657lze c31657lze, @NotNull lyX lyx, @NotNull lyT lyt, @NotNull lyI lyi, @NotNull InterfaceC31764mDa interfaceC31764mDa, @NotNull lyM lym, @NotNull lyR lyr, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        super(c31659lzg, c31657lze, lyx, lyt, lyi, interfaceC31764mDa, lym, lyr, interfaceC47278tmy);
        Intrinsics.checkNotNullParameter(c31659lzg, "");
        Intrinsics.checkNotNullParameter(c31657lze, "");
        Intrinsics.checkNotNullParameter(lyx, "");
        Intrinsics.checkNotNullParameter(lyt, "");
        Intrinsics.checkNotNullParameter(lyi, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        Intrinsics.checkNotNullParameter(lym, "");
        Intrinsics.checkNotNullParameter(lyr, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.gwTjWJ = ChipAmount.TWENTY_FIVE_PERCENT;
        this.OBJEWx = BannerPageNames.BSC.getPageName();
        this.QHmsKR = BannerFlowType.MERGE;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.getPostValueLengthLimit = MutableStateFlow;
        this.DLWbHP = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.zuWLRA = MutableStateFlow2;
        this.OHqIaq = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.accept = MutableStateFlow3;
        this.ffGIBT = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.DAIeex = MutableStateFlow4;
        this.OuxcSI = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.DCUTEI = MutableStateFlow5;
        this.OFhtUX = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.DXXBbs = MutableStateFlow6;
        this.hBpjJd = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<String> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.OqFWZa = MutableStateFlow7;
        this.dmfpNf = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<String> MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.ODWQjV = MutableStateFlow8;
        this.dHguZz = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<String> MutableStateFlow9 = StateFlowKt.MutableStateFlow(null);
        this.DCJXGO = MutableStateFlow9;
        this.RdAHlO = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.DarRvM = MutableStateFlow10;
        this.hrNTAI = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<String> MutableStateFlow11 = StateFlowKt.MutableStateFlow(null);
        this.AxsJAYsNCnLh = MutableStateFlow11;
        this.QkdxfA = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<Boolean> MutableStateFlow12 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.RlQdEF = MutableStateFlow12;
        this.RKDWNf = FlowKt.asStateFlow(MutableStateFlow12);
    }

    public final void valueOf(boolean z) {
        this.RlQdEF.setValue(Boolean.valueOf(z));
    }

    public final void values(String str) {
        this.AxsJAYsNCnLh.setValue(str);
    }

    public final void AhwBna(boolean z) {
        this.DarRvM.setValue(Boolean.valueOf(z));
    }

    public final void AkhnZx(String str) {
        this.getPostValueLengthLimit.setValue(str);
    }

    public final void fJNWhG(String str) {
        this.zuWLRA.setValue(str);
    }

    public final void isConnected(String str) {
        this.DCUTEI.setValue(str);
    }

    public final void fetchVPNInfo(String str) {
        this.accept.setValue(str);
    }

    public final void DbNXlk(String str) {
        this.DAIeex.setValue(str);
    }

    public final void AEQbTJ(@NotNull String str, String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.DXXBbs.setValue(str);
        this.OqFWZa.setValue(str2);
        this.DCJXGO.setValue(str3);
        this.ODWQjV.setValue(str4);
    }

    public final void AEQbTJ(@NotNull InputBaseViewModel inputBaseViewModel) {
        Intrinsics.checkNotNullParameter(inputBaseViewModel, "");
        if (C33129mqd.OLrzqt((CharSequence) zLjUOn())) {
            inputBaseViewModel.OLrzqt(zLjUOn());
            AEQbTJ("");
        }
        inputBaseViewModel.copydefault(InputType.CRYPTO_INPUT);
        inputBaseViewModel.copydefault(C33129mqd.AEQbTJ(inputBaseViewModel.OLrzqt()) >= AudioStats.AUDIO_AMPLITUDE_NONE ? inputBaseViewModel.OLrzqt() : "0", true);
    }

    public final List<Pair<Double, String>> ODWQjV() {
        BigDecimal bigDecimal = new BigDecimal(ChipAmount.TWENTY_FIVE_PERCENT.getPercentage());
        C38307pTy.Application application = C38307pTy.Companion;
        return yDY.AhwBna(new Pair(Double.valueOf(0.25d), pTB.formatICUPercent$default(bigDecimal, null, application.AEQbTJ(0), null, null, null, 29, null)), new Pair(Double.valueOf(0.5d), pTB.formatICUPercent$default(new BigDecimal(ChipAmount.FIFTY_PERCENT.getPercentage()), null, application.AEQbTJ(0), null, null, null, 29, null)), new Pair(Double.valueOf(0.75d), pTB.formatICUPercent$default(new BigDecimal(ChipAmount.SEVENTY_FIVE_PERCENT.getPercentage()), null, application.AEQbTJ(0), null, null, null, 29, null)), new Pair(Double.valueOf(1.0d), C33070mpX.AYXKKw(C31351lsQ.Activity.profile)));
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellViewModel
    public TradeType flVtFt() {
        return TradeType.SELL;
    }

    public final String copydefault(@NotNull InputBaseViewModel inputBaseViewModel, double d) {
        Intrinsics.checkNotNullParameter(inputBaseViewModel, "");
        String strFJNWhG = fJNWhG();
        if (inputBaseViewModel.valueOf() == InputType.FIAT_INPUT) {
            return C33129mqd.mulS$default(C33129mqd.mulS$default(strFJNWhG, Double.valueOf(d), null, null, null, 14, null), inputBaseViewModel.values(), null, Boolean.TRUE, RoundingMode.DOWN, 2, null);
        }
        return C33129mqd.mulS$default(strFJNWhG, Double.valueOf(d), null, null, null, 14, null);
    }

    public final void EZpvd(double d) {
        this.gwTjWJ = ChipAmount.Companion.KWHzl(d);
        this.QSBOWP = true;
    }

    public final void OBJEWx() {
        this.QSBOWP = false;
        this.gwTjWJ = ChipAmount.TWENTY_FIVE_PERCENT;
    }

    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C31354lsT.KWHzl.AEQbTJ(str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChipAmount {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ChipAmount[] $VALUES;
        public static final Application Companion;
        private final double amount;
        private final int percentage;
        public static final ChipAmount TWENTY_FIVE_PERCENT = new ChipAmount("TWENTY_FIVE_PERCENT", 0, 0.25d, 25);
        public static final ChipAmount FIFTY_PERCENT = new ChipAmount("FIFTY_PERCENT", 1, 0.5d, 50);
        public static final ChipAmount SEVENTY_FIVE_PERCENT = new ChipAmount("SEVENTY_FIVE_PERCENT", 2, 0.75d, 75);
        public static final ChipAmount HUNDRED_PERCENT = new ChipAmount("HUNDRED_PERCENT", 3, 1.0d, 100);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ChipAmount[] $values() {
            return new ChipAmount[]{TWENTY_FIVE_PERCENT, FIFTY_PERCENT, SEVENTY_FIVE_PERCENT, HUNDRED_PERCENT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ChipAmount> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getPercentage() {
            return this.percentage;
        }

        private ChipAmount(String str, int i, double d, int i2) {
            this.amount = d;
            this.percentage = i2;
        }

        static {
            ChipAmount[] chipAmountArr$values = $values();
            $VALUES = chipAmountArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(chipAmountArr$values);
            Companion = new Application(null);
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.fragment.sell.SellViewModel.ChipAmount.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt(double d) {
                return d == 0.25d ? "25" : d == 0.5d ? "50" : d == 0.75d ? "75" : "max";
            }

            private Application() {
            }

            public final ChipAmount KWHzl(double d) {
                ChipAmount chipAmount;
                ChipAmount[] chipAmountArrValues = ChipAmount.values();
                int length = chipAmountArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        chipAmount = null;
                        break;
                    }
                    chipAmount = chipAmountArrValues[i];
                    if (chipAmount.getAmount() == d) {
                        break;
                    }
                    i++;
                }
                return chipAmount == null ? ChipAmount.TWENTY_FIVE_PERCENT : chipAmount;
            }
        }

        public static ChipAmount valueOf(String str) {
            return (ChipAmount) Enum.valueOf(ChipAmount.class, str);
        }

        public static ChipAmount[] values() {
            return (ChipAmount[]) $VALUES.clone();
        }
    }
}
