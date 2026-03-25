package com.okinc.buysell.ui.currencylist;

import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.util.PaymentLogger;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import o.AbstractC43419rot;
import o.C30350lVc;
import o.C31354lsT;
import o.C31656lzd;
import o.C32989mnw;
import o.lyD;
import o.lyE;
import o.lyM;
import o.lyR;
import o.lzT;
import o.mHA;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class CurrencySelectionViewModel extends lzT {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<C32989mnw<Boolean>> AYXKKw;
    public final MutableLiveData<C32989mnw<TaskDescription>> AhwBna;
    public final lyR AkhnZx;
    public final lyD DbNXlk;
    public final MutableLiveData<C32989mnw<Boolean>> djBIcL;
    public final C31656lzd ejfBZ;
    public String fARcdN;
    public String fIwbmz;
    public final lyE fetchVPNInfo;
    public final MutableLiveData<C32989mnw<Boolean>> gEmmrt;
    public final MutableLiveData<C32989mnw<Pair<String, String>>> isConnected;
    public final MutableLiveData<C32989mnw<Boolean>> valueOf;
    public BannerFlowType values;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<String, String>>> AuCTel() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public String KWHzl() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public BannerFlowType copydefault() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fARcdN = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> fARcdN() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<TaskDescription>> fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> isConnected() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> values() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public CurrencySelectionViewModel(@NotNull lyR lyr, @NotNull lyE lye, @NotNull lyD lyd, @NotNull C31656lzd c31656lzd, @NotNull lyM lym) {
        super(lym);
        Intrinsics.checkNotNullParameter(lyr, "");
        Intrinsics.checkNotNullParameter(lye, "");
        Intrinsics.checkNotNullParameter(lyd, "");
        Intrinsics.checkNotNullParameter(c31656lzd, "");
        Intrinsics.checkNotNullParameter(lym, "");
        this.AkhnZx = lyr;
        this.fetchVPNInfo = lye;
        this.DbNXlk = lyd;
        this.ejfBZ = c31656lzd;
        this.fIwbmz = BannerPageNames.CURRENCY_SELECTION.getPageName();
        this.values = BannerFlowType.BUY;
        this.djBIcL = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.fARcdN = "";
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        public final List<BuySellCurrency> EZpvd;
        public final BuySellCurrency KWHzl;
        public final BuySellCurrency OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.ui.currencylist.CurrencySelectionViewModel$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, BuySellCurrency buySellCurrency, List list, BuySellCurrency buySellCurrency2, int i, Object obj) {
            if ((i & 1) != 0) {
                buySellCurrency = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                list = taskDescription.EZpvd;
            }
            if ((i & 4) != 0) {
                buySellCurrency2 = taskDescription.KWHzl;
            }
            return taskDescription.AEQbTJ(buySellCurrency, list, buySellCurrency2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull BuySellCurrency buySellCurrency, @NotNull List<BuySellCurrency> list, BuySellCurrency buySellCurrency2) {
            Intrinsics.checkNotNullParameter(buySellCurrency, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(buySellCurrency, list, buySellCurrency2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BuySellCurrency> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BuySellCurrency copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            BuySellCurrency buySellCurrency = this.KWHzl;
            return (((iHashCode * 31) + iHashCode2) * 31) + (buySellCurrency == null ? 0 : buySellCurrency.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CurrencyListData(defaultCurrency=" + this.OLrzqt + ", currencyList=" + this.EZpvd + ", sellSelectedCurrency=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull BuySellCurrency buySellCurrency, @NotNull List<BuySellCurrency> list, BuySellCurrency buySellCurrency2) {
            Intrinsics.checkNotNullParameter(buySellCurrency, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = buySellCurrency;
            this.EZpvd = list;
            this.KWHzl = buySellCurrency2;
        }
    }

    public final void EZpvd(@NotNull String str, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new CurrencySelectionViewModel$checkIfSelectedCurrencyHasCryptos$1(tradeType, this, str, null), 3, null);
    }

    public static /* synthetic */ void loadData$default(CurrencySelectionViewModel currencySelectionViewModel, TradeType tradeType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        currencySelectionViewModel.OLrzqt(tradeType, z);
    }

    public final void OLrzqt(@NotNull TradeType tradeType, boolean z) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        KWHzl(true);
        PaymentLogger.Type type = tradeType == TradeType.BUY ? PaymentLogger.Type.BSC_BUY : PaymentLogger.Type.BSC_SELL;
        PaymentLogger.EZpvd.EZpvd(type, "currencyList1: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CurrencySelectionViewModel$loadData$1(copydefault(tradeType), this, type, jCurrentTimeMillis, tradeType, z, null), 3, null);
    }

    public final List<Deferred<AbstractC43419rot<?, OKServerException>>> copydefault(TradeType tradeType) {
        int i = StateListAnimator.AEQbTJ[tradeType.ordinal()];
        if (i == 1 || i == 2) {
            return yDY.gEmmrt(BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new CurrencySelectionViewModel$getCurrencyFetchTasks$1(this, null), 3, null), BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new CurrencySelectionViewModel$getCurrencyFetchTasks$2(this, null), 3, null));
        }
        return yDY.AhwBna();
    }

    public final void KWHzl(boolean z) {
        mHA.OLrzqt.OLrzqt(this.valueOf, Boolean.valueOf(z));
    }

    public static /* synthetic */ void trackSimpleTradeCryptoList$default(CurrencySelectionViewModel currencySelectionViewModel, TradeType tradeType, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        currencySelectionViewModel.KWHzl(tradeType, str, str2);
    }

    public final void KWHzl(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C31354lsT.KWHzl.KWHzl("SimpleTrade_SelectFiatPop_Button_Click", str, tradeType == TradeType.BUY ? "buy" : "sell", new C30350lVc(null, null, str2, null, false, null, null, null, null, null, PointerIconCompat.TYPE_ZOOM_OUT, null));
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.currencylist.CurrencySelectionViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
