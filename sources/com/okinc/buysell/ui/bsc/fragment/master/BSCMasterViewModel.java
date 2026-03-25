package com.okinc.buysell.ui.bsc.fragment.master;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.data.BuyFrequencyOption;
import com.okinc.buysell.data.FrequencyType;
import com.okinc.buysell.ui.bsc.common.BSCTabIndex;
import com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.RecurringBuyOrderType;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33244msm;
import o.C31349lsO;
import o.C31354lsT;
import o.C31393ltF;
import o.C32866mlf;
import o.C32989mnw;
import o.C34754niS;
import o.C43251rlk;
import o.C46876tfT;
import o.C46880tfX;
import o.C46881tfY;
import o.C56390yDp;
import o.C56402yEa;
import o.C56424yEw;
import o.InterfaceC31764mDa;
import o.InterfaceC33171mrS;
import o.lTU;
import o.lyM;
import o.lzT;
import o.mHA;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BSCMasterViewModel extends lzT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<C32989mnw<Unit>> AYXKKw;
    public BSCTabIndex AhwBna;
    public final MutableLiveData<C32989mnw<String>> AkhnZx;
    public final MutableStateFlow<Pair<Channel, PaymentMethod>> AuCTel;
    public final LiveData<C32989mnw<Unit>> AuCTelauCTel;
    public BuySellConvertParameters AubY;
    public BuyFrequencyOption AwvSrB;
    public final SharedFlow<CurrencyToken> AxsJAY;
    public final MutableLiveData<C32989mnw<TransferDetail>> DbNXlk;
    public final MutableLiveData<C32989mnw<Unit>> djBIcL;
    public final MutableSharedFlow<CurrencyToken> ejfBZ;
    public final MutableLiveData<C32989mnw<Unit>> fARcdN;
    public List<BuyFrequencyOption> fIwbmz;
    public ActionBar fJNWhG;
    public final MutableLiveData<C32989mnw<Unit>> fetchVPNInfo;
    public final MutableSharedFlow<Unit> gEmmrt;
    public final InterfaceC31764mDa getFieldNames;
    public final List<BuyFrequencyOption> getNewProxyInstance;
    public VerificationStatus hDKMBd;
    public final MutableLiveData<Integer> isConnected;
    public boolean iwGUEr;
    public final StateFlow<Pair<Channel, PaymentMethod>> sSMYrx;
    public BannerFlowType uzCIH;
    public final MutableLiveData<C32989mnw<Boolean>> valueOf;
    public final MutableLiveData<C32989mnw<List<BuyFrequencyOption>>> values;
    public BSCLevel wlaJM;
    public String zLjUOn;
    public FrequencyType zsXlph;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TargetTab.values().length];
            try {
                iArr[TargetTab.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetTab.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetTab.CONVERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[BSCTabIndex.values().length];
            try {
                iArr2[BSCTabIndex.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BSCTabIndex.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BSCTabIndex.CONVERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(VerificationStatus verificationStatus) {
        this.hDKMBd = verificationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ(@NotNull BSCLevel bSCLevel) {
        Intrinsics.checkNotNullParameter(bSCLevel, "");
        return this.wlaJM == bSCLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCTabIndex AkhnZx() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AuCTel() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<CurrencyToken> AuCTelauCTel() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<BuyFrequencyOption>>> AubY() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> AxsJAY() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(ActionBar actionBar) {
        this.fJNWhG = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(BuySellConvertParameters buySellConvertParameters) {
        this.AubY = buySellConvertParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zLjUOn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public String KWHzl() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull BSCLevel bSCLevel) {
        Intrinsics.checkNotNullParameter(bSCLevel, "");
        this.wlaJM = bSCLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull FrequencyType frequencyType) {
        Intrinsics.checkNotNullParameter(frequencyType, "");
        this.zsXlph = frequencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.iwGUEr = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public BannerFlowType copydefault() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull List<BuyFrequencyOption> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fIwbmz = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> ejfBZ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCLevel fARcdN() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> fIwbmz() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerificationStatus fJNWhG() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellConvertParameters getFieldNames() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<TransferDetail>> getNewProxyInstance() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> hDKMBd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuyFrequencyOption> isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> iwGUEr() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> sSMYrx() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrequencyType uzCIH() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar values() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<Channel, PaymentMethod>> wlaJM() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuyFrequencyOption zLjUOn() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zuBGHE() {
        return this.iwGUEr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public BSCMasterViewModel(@NotNull lyM lym, @NotNull InterfaceC31764mDa interfaceC31764mDa) {
        super(lym);
        Intrinsics.checkNotNullParameter(lym, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.getFieldNames = interfaceC31764mDa;
        this.wlaJM = BSCLevel.LEVEL1;
        this.zLjUOn = BannerPageNames.BSC.getPageName();
        this.uzCIH = BannerFlowType.MERGE;
        BuyFrequencyOption.TaskDescription taskDescription = BuyFrequencyOption.Companion;
        this.AwvSrB = taskDescription.KWHzl();
        this.fIwbmz = yDY.AhwBna();
        this.zsXlph = FrequencyType.ONE_TIME;
        this.valueOf = new MutableLiveData<>();
        this.getNewProxyInstance = C56402yEa.EZpvd(taskDescription.KWHzl());
        this.AhwBna = BSCTabIndex.BUY;
        MutableSharedFlow<CurrencyToken> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.ejfBZ = mutableSharedFlowMutableSharedFlow$default;
        this.AxsJAY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.DbNXlk = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.gEmmrt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.AkhnZx = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        MutableStateFlow<Pair<Channel, PaymentMethod>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AuCTel = MutableStateFlow;
        this.sSMYrx = MutableStateFlow;
        this.AYXKKw = new MutableLiveData<>();
        MutableLiveData<C32989mnw<Unit>> mutableLiveData = new MutableLiveData<>();
        this.fetchVPNInfo = mutableLiveData;
        this.AuCTelauCTel = mutableLiveData;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public final String AEQbTJ;
        public final String AYXKKw;
        public final String AhwBna;
        public final List<CurrencyToken> EZpvd;
        public final String KWHzl;
        public final CryptoListBottomSheet.ListType OLrzqt;
        public final String copydefault;
        public final double gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CryptoListBottomSheet.ListType AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CurrencyToken> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull CryptoListBottomSheet.ListType listType, @NotNull List<CurrencyToken> list, @NotNull String str, @NotNull String str2, double d, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(listType, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new ActionBar(listType, list, str, str2, d, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) actionBar.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) actionBar.AEQbTJ) && Double.compare(this.gEmmrt, actionBar.gEmmrt) == 0 && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) actionBar.AYXKKw) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) actionBar.AhwBna) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Double.hashCode(this.gEmmrt)) * 31) + this.AYXKKw.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CryptoListBottomSheetArgs(listType=" + this.OLrzqt + ", cryptoList=" + this.EZpvd + ", currencySymbol=" + this.copydefault + ", quoteCurrency=" + this.AEQbTJ + ", usdRate=" + this.gEmmrt + ", selectedToken=" + this.AYXKKw + ", selectedCurrency=" + this.AhwBna + ", filteredTokenId=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull CryptoListBottomSheet.ListType listType, @NotNull List<CurrencyToken> list, @NotNull String str, @NotNull String str2, double d, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(listType, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.OLrzqt = listType;
            this.EZpvd = list;
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.gEmmrt = d;
            this.AYXKKw = str3;
            this.AhwBna = str4;
            this.KWHzl = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (wrap:com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$ListType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:142) com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet.ListType.BUY com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$ListType) : (r11v0 com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$ListType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:143)) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0024: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r15v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$ListType, java.util.List<com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken>, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:141) call: com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel.ActionBar.<init>(com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$ListType, java.util.List, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(CryptoListBottomSheet.ListType listType, List list, String str, String str2, double d, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CryptoListBottomSheet.ListType.BUY : listType, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) == 0 ? str5 : "");
        }
    }

    public final void QOLQEE() {
        mHA.OLrzqt.OLrzqt(this.fetchVPNInfo, Unit.INSTANCE);
    }

    public final void copydefault(@NotNull Channel channel, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        this.AuCTel.setValue(new Pair<>(channel, paymentMethod));
    }

    public final void OcIXYQ() {
        mHA.OLrzqt.KWHzl(this.AYXKKw);
    }

    public final void QKVWgx() {
        mHA.OLrzqt.KWHzl(this.fARcdN);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        mHA.OLrzqt.OLrzqt(this.AkhnZx, str);
    }

    public final void fetchVPNInfo() {
        mHA.OLrzqt.KWHzl(this.djBIcL);
    }

    public final boolean AwvSrB() {
        C32989mnw<Boolean> value = this.valueOf.getValue();
        if (value != null) {
            return value.OLrzqt().booleanValue();
        }
        return false;
    }

    public final void AEQbTJ(@NotNull BSCTabIndex bSCTabIndex) {
        Intrinsics.checkNotNullParameter(bSCTabIndex, "");
        if (this.wlaJM == BSCLevel.LEVEL1) {
            this.isConnected.setValue(Integer.valueOf(bSCTabIndex.getIndex()));
        }
        KWHzl(bSCTabIndex);
    }

    public final void OLrzqt(@NotNull CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BSCMasterViewModel$setSelectedToken$1(this, currencyToken, null), 3, null);
    }

    public static /* synthetic */ void trackPageViewEvent$default(BSCMasterViewModel bSCMasterViewModel, TargetTab targetTab, OrderType orderType, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            orderType = OrderType.OTHERS;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        bSCMasterViewModel.KWHzl(targetTab, orderType, str);
    }

    public final void KWHzl(@NotNull TargetTab targetTab, @NotNull OrderType orderType, String str) {
        String type;
        PaymentsReporterProperty.PaymentsReportSource paymentsReportSource;
        OKPaymentSource oKPaymentSourceAkhnZx;
        Intrinsics.checkNotNullParameter(targetTab, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        C31349lsO c31349lsO = C31349lsO.EZpvd;
        String type2 = PaymentsReporterProperty.PaymentsReportAttrPage.BSC_SIMPLE_TRADE.getType();
        int i = Application.AEQbTJ[targetTab.ordinal()];
        if (i == 1) {
            type = PaymentsReporterProperty.PaymentsReportAttrType.BUY.getType();
        } else if (i == 2) {
            type = PaymentsReporterProperty.PaymentsReportAttrType.SELL.getType();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            type = PaymentsReporterProperty.PaymentsReportAttrType.CONVERT.getType();
        }
        c31349lsO.AEQbTJ(type2, type);
        C34754niS c34754niS = C34754niS.AEQbTJ;
        if (this.wlaJM == BSCLevel.LEVEL1) {
            paymentsReportSource = PaymentsReporterProperty.PaymentsReportSource.SIMPLE_TRADE_L1_ENTRANCE;
        } else {
            paymentsReportSource = PaymentsReporterProperty.PaymentsReportSource.SIMPLE_TRADE_L2_ENTRANCE;
        }
        c34754niS.copydefault(paymentsReportSource);
        OKPaymentSource.Companion companion = OKPaymentSource.Companion;
        BuySellConvertParameters buySellConvertParameters = this.AubY;
        String tag = (buySellConvertParameters == null || (oKPaymentSourceAkhnZx = buySellConvertParameters.AkhnZx()) == null) ? null : oKPaymentSourceAkhnZx.getTag();
        OKPaymentSource oKPaymentSourceKWHzl = companion.KWHzl(tag != null ? tag : "");
        BuySellConvertParameters buySellConvertParameters2 = this.AubY;
        C31354lsT.KWHzl.copydefault(targetTab, oKPaymentSourceKWHzl, this.wlaJM, (16 & 8) != 0 ? OrderType.OTHERS : orderType, (16 & 16) != 0 ? OrderFrequency.NO_FREQ : null, (16 & 32) != 0 ? null : str, (buySellConvertParameters2 != null ? buySellConvertParameters2.AEQbTJ() : null) != null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C31354lsT.KWHzl.EZpvd("Simpletrade_Toggle_Switch_Click", str, true);
    }

    public final boolean AEQbTJ(@NotNull TargetTab targetTab) {
        int index;
        Intrinsics.checkNotNullParameter(targetTab, "");
        int index2 = AkhnZx().getIndex();
        int i = Application.AEQbTJ[targetTab.ordinal()];
        if (i == 1) {
            index = BSCTabIndex.BUY.getIndex();
        } else if (i == 2) {
            index = BSCTabIndex.SELL.getIndex();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            index = BSCTabIndex.CONVERT.getIndex();
        }
        return index2 == index;
    }

    @Override // o.lzT
    public void copydefault(boolean z) {
        super.copydefault(z);
        if (z && this.wlaJM == BSCLevel.LEVEL2) {
            lTU.OLrzqt.EZpvd().remove(BannerFlowType.MERGE);
        }
    }

    public final void KWHzl(@NotNull BSCTabIndex bSCTabIndex) {
        Intrinsics.checkNotNullParameter(bSCTabIndex, "");
        this.AhwBna = bSCTabIndex;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BSCMasterViewModel$setCurrentTab$1(this, null), 3, null);
    }

    public final void zsXlph() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BSCMasterViewModel$getRecurringFrequency$1(this, null), 3, null);
    }

    public final void EZpvd(@NotNull BuyFrequencyOption buyFrequencyOption) {
        Intrinsics.checkNotNullParameter(buyFrequencyOption, "");
        this.AwvSrB = buyFrequencyOption;
        this.fIwbmz = BuyFrequencyOption.Companion.EZpvd(this.fIwbmz, buyFrequencyOption);
        this.zsXlph = buyFrequencyOption.getFrequencyType();
        mHA.OLrzqt.OLrzqt(this.valueOf, Boolean.valueOf(buyFrequencyOption.getFrequencyType() == FrequencyType.ONE_TIME));
    }

    public final void ORxRYg() {
        this.zsXlph = FrequencyType.ONE_TIME;
        this.AwvSrB = BuyFrequencyOption.Companion.KWHzl();
        mHA.OLrzqt.OLrzqt(this.valueOf, Boolean.TRUE);
    }

    public final RecurringBuyOrderType KWHzl(BuySellCurrency buySellCurrency) {
        String currency;
        String txt = C46881tfY.KWHzl(BuyFrequencyOption.Companion.OLrzqt(this.AwvSrB) ? "recurring" : "one_time").getTxt();
        int iOrdinal = C46880tfX.AEQbTJ(this.AwvSrB.getFrequencyModel().getFrequency()).ordinal();
        String localizedName = this.AwvSrB.getFrequencyModel().getLocalizedName();
        String displayLabel = this.AwvSrB.getDisplayLabel();
        String nextPurchaseTime = this.AwvSrB.getFrequencyModel().getNextPurchaseTime();
        String symbol = buySellCurrency != null ? buySellCurrency.getSymbol() : null;
        return new RecurringBuyOrderType(txt, iOrdinal, localizedName, displayLabel, "Today", nextPurchaseTime, symbol == null ? "" : symbol, (buySellCurrency == null || (currency = buySellCurrency.getCurrency()) == null) ? "" : currency);
    }

    public final void DTwDnp() {
        String str;
        AbstractC33244msm value;
        int i = Application.copydefault[AkhnZx().ordinal()];
        if (i == 1) {
            str = "trade_bsc_buy";
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            str = "trade_bsc_sell";
        }
        EventData eventData = new EventData();
        eventData.setAct("mobile_obs_page_view");
        eventData.setSource(str);
        Pair[] pairArr = new Pair[1];
        StateFlow<AbstractC33244msm> stateFlowValues = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).values();
        pairArr[0] = C56390yDp.OLrzqt("app_mode", (stateFlowValues == null || (value = stateFlowValues.getValue()) == null) ? null : value.EZpvd());
        eventData.setAttrs(C56424yEw.djBIcL(pairArr));
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    public final void copydefault(@NotNull final BuyFrequencyOption buyFrequencyOption) {
        Intrinsics.checkNotNullParameter(buyFrequencyOption, "");
        C32866mlf.onEvent$default("SimpleTrade_RecurringBuy_DropDown_Click", (TrackChannel[]) null, new Function1() { // from class: o.lGG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterViewModel.copydefault(buyFrequencyOption, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit copydefault(BuyFrequencyOption buyFrequencyOption, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "cadence", C31393ltF.OLrzqt(buyFrequencyOption.getFrequencyType()), false, 4, null);
        return Unit.INSTANCE;
    }

    public final FrequencyType EZpvd(@NotNull String str, @NotNull OrderFrequency orderFrequency) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        if (str.length() > 0) {
            return FrequencyType.Companion.copydefault(str);
        }
        if (orderFrequency != OrderFrequency.NO_FREQ) {
            return FrequencyType.Companion.copydefault(orderFrequency.getTxt());
        }
        return FrequencyType.ONE_TIME;
    }

    public final boolean gHZMYf() {
        Pair<Channel, PaymentMethod> value;
        Channel first;
        if (AkhnZx() == BSCTabIndex.BUY && (value = this.sSMYrx.getValue()) != null && (first = value.getFirst()) != null && C46876tfT.EZpvd(first)) {
            BuySellConvertParameters buySellConvertParameters = this.AubY;
            if ((buySellConvertParameters != null ? buySellConvertParameters.AEQbTJ() : null) == null) {
                return true;
            }
        }
        return false;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
