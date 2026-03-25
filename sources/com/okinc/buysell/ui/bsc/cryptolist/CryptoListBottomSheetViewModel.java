package com.okinc.buysell.ui.bsc.cryptolist;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.buysell.util.PaymentLogger;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.core.util.SPUtils;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C30327lUg;
import o.C30350lVc;
import o.C31354lsT;
import o.C31656lzd;
import o.C32989mnw;
import o.C33129mqd;
import o.C47222tlv;
import o.C56403yEb;
import o.lUY;
import o.lyD;
import o.lyE;
import o.lyL;
import o.lyM;
import o.lyR;
import o.lzT;
import o.mHA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class CryptoListBottomSheetViewModel extends lzT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<C32989mnw<Boolean>> AYXKKw;
    public final MutableLiveData<C32989mnw<Boolean>> AhwBna;
    public final lyD AkhnZx;
    public final lyR AuCTel;
    public final C31656lzd AuCTelauCTel;
    public final MutableLiveData<C32989mnw<Boolean>> DbNXlk;
    public final MutableLiveData<C32989mnw<Boolean>> djBIcL;
    public BannerFlowType ejfBZ;
    public MutableLiveData<List<CurrencyToken>> fARcdN;
    public final lyM fIwbmz;
    public final lyL fJNWhG;
    public final MutableLiveData<C32989mnw<Boolean>> fetchVPNInfo;
    public final MutableLiveData<C32989mnw<List<CurrencyToken>>> gEmmrt;
    public long getFieldNames;
    public MutableLiveData<List<CryptoListItem>> getNewProxyInstance;
    public String hDKMBd;
    public final MutableLiveData<C32989mnw<Boolean>> isConnected;
    public final MutableLiveData<Boolean> iwGUEr;
    public String uzCIH;
    public final MutableLiveData<Map<String, FairPriceTickerData>> valueOf;
    public final lyE values;
    public boolean wlaJM;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CryptoListBottomSheet.ListType.values().length];
            try {
                iArr[CryptoListBottomSheet.ListType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoListBottomSheet.ListType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoListBottomSheet.ListType.CONVERT_TO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoListBottomSheet.ListType.CONVERT_FROM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<CurrencyToken>> AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<CryptoListItem>> AuCTel() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public String KWHzl() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uzCIH = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public BannerFlowType copydefault() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> fARcdN() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> fIwbmz() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> fJNWhG() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Map<String, FairPriceTickerData>> fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> getFieldNames() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> getNewProxyInstance() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> hDKMBd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<CurrencyToken>>> isConnected() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> uzCIH() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public CryptoListBottomSheetViewModel(@NotNull lyE lye, @NotNull lyD lyd, @NotNull C31656lzd c31656lzd, @NotNull lyL lyl, @NotNull lyR lyr, @NotNull lyM lym) {
        super(lym);
        Intrinsics.checkNotNullParameter(lye, "");
        Intrinsics.checkNotNullParameter(lyd, "");
        Intrinsics.checkNotNullParameter(c31656lzd, "");
        Intrinsics.checkNotNullParameter(lyl, "");
        Intrinsics.checkNotNullParameter(lyr, "");
        Intrinsics.checkNotNullParameter(lym, "");
        this.values = lye;
        this.AkhnZx = lyd;
        this.AuCTelauCTel = c31656lzd;
        this.fJNWhG = lyl;
        this.AuCTel = lyr;
        this.fIwbmz = lym;
        this.hDKMBd = BannerPageNames.BSC.getPageName();
        this.ejfBZ = BannerFlowType.MERGE;
        this.gEmmrt = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.getNewProxyInstance = new MutableLiveData<>();
        this.wlaJM = C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_FUZZY_SEARCH);
        this.uzCIH = "";
    }

    public final void wlaJM() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CryptoListBottomSheetViewModel$requestUserResidenceType$1(this, null), 3, null);
    }

    public final void iwGUEr() {
        KWHzl(true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.BSC_BUY, "cryptoList1: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CryptoListBottomSheetViewModel$loadDataForBuy$1(jCurrentTimeMillis, this, null), 3, null);
    }

    public static /* synthetic */ void loadDataForSell$default(CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        cryptoListBottomSheetViewModel.EZpvd(str, z);
    }

    public final void EZpvd(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.BSC_SELL, "cryptoList1: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CryptoListBottomSheetViewModel$loadDataForSell$1(jCurrentTimeMillis, this, str, z, null), 3, null);
    }

    public final void copydefault(@NotNull CryptoListBottomSheet.ListType listType, @NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(listType, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = Application.copydefault[listType.ordinal()];
        if (i == 1) {
            str2 = "bsc_crypto_search_history_selection";
        } else if (i == 2) {
            str2 = "bsc_crypto_search_history_selection_SELL";
        } else if (i == 3) {
            str2 = "bsc_crypto_search_history_selection_CONVERT_TO";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "bsc_crypto_search_history_selection_CONVERT_FROM";
        }
        ArrayList arrayList = SPUtils.getArrayList(str2, String.class);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        }
        arrayList.add(0, str);
        if (arrayList.size() > 5) {
            arrayList.remove(arrayList.size() - 1);
        }
        SPUtils.put(str2, arrayList);
    }

    public final List<String> EZpvd(@NotNull CryptoListBottomSheet.ListType listType) {
        String str;
        Intrinsics.checkNotNullParameter(listType, "");
        int i = Application.copydefault[listType.ordinal()];
        if (i == 1) {
            str = "bsc_crypto_search_history_selection";
        } else if (i == 2) {
            str = "bsc_crypto_search_history_selection_SELL";
        } else if (i == 3) {
            str = "bsc_crypto_search_history_selection_CONVERT_TO";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "bsc_crypto_search_history_selection_CONVERT_FROM";
        }
        ArrayList arrayList = SPUtils.getArrayList(str, String.class);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public final void AEQbTJ(@NotNull CryptoListBottomSheet.ListType listType) {
        String str;
        Intrinsics.checkNotNullParameter(listType, "");
        int i = Application.copydefault[listType.ordinal()];
        if (i == 1) {
            str = "bsc_crypto_search_history_selection";
        } else if (i == 2) {
            str = "bsc_crypto_search_history_selection_SELL";
        } else if (i == 3) {
            str = "bsc_crypto_search_history_selection_CONVERT_TO";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "bsc_crypto_search_history_selection_CONVERT_FROM";
        }
        SPUtils.remove(str);
    }

    public final List<CryptoListItem> KWHzl(@NotNull String str, @NotNull List<? extends CryptoListItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.uzCIH = str;
        if (this.getFieldNames == 0) {
            this.getFieldNames = System.currentTimeMillis();
        }
        if (this.wlaJM) {
            return C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, str, list, FuzzySearchEventSourceEnum.OKPAYMENTS_COIN.getSource(), false, 8, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CryptoListItem cryptoListItem = (CryptoListItem) obj;
            if (StringsKt__StringsKt.AhwBna((CharSequence) cryptoListItem.getCryptoId(), (CharSequence) str, true) || StringsKt__StringsKt.AhwBna((CharSequence) cryptoListItem.getCryptoName(), (CharSequence) str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<CryptoListItem> AEQbTJ(@NotNull List<CurrencyToken> list, @NotNull CryptoListBottomSheet.ListType listType, @NotNull String str, double d, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(listType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i = Application.copydefault[listType.ordinal()];
        if (i == 1) {
            return lUY.toBuyCryptoListItemsLegacy$default(list, str, d, null, 4, null);
        }
        if (i == 2) {
            return lUY.OLrzqt(list, str);
        }
        if (i == 3) {
            return lUY.toConvertToListItems$default(list, str, d, str2, null, 8, null);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return lUY.AEQbTJ(list, str, str2);
    }

    public final void values() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CryptoListBottomSheetViewModel$checkIfFiatDepositAvailable$1(this, null), 3, null);
    }

    public final void KWHzl(boolean z) {
        mHA.OLrzqt.OLrzqt(this.isConnected, Boolean.valueOf(z));
    }

    public static /* synthetic */ void trackSimpleTradeCryptoList$default(CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel, String str, CryptoListBottomSheet.ListType listType, C30350lVc c30350lVc, boolean z, int i, Object obj) {
        CryptoListBottomSheet.ListType listType2;
        boolean z2;
        C30350lVc c30350lVc2 = (i & 4) != 0 ? new C30350lVc(null, null, null, null, false, null, null, null, null, null, 1023, null) : c30350lVc;
        if ((i & 8) != 0) {
            z2 = false;
            listType2 = listType;
        } else {
            listType2 = listType;
            z2 = z;
        }
        cryptoListBottomSheetViewModel.OLrzqt(str, listType2, c30350lVc2, z2);
    }

    public final void OLrzqt(@NotNull String str, @NotNull CryptoListBottomSheet.ListType listType, @NotNull C30350lVc c30350lVc, boolean z) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(listType, "");
        Intrinsics.checkNotNullParameter(c30350lVc, "");
        C31354lsT c31354lsT = C31354lsT.KWHzl;
        int i = Application.copydefault[listType.ordinal()];
        if (i == 1) {
            str2 = "buy";
        } else if (i == 2) {
            str2 = "sell";
        } else if (i == 3) {
            str2 = "convert_to";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "convert_from";
        }
        c30350lVc.AEQbTJ(this.uzCIH);
        String strGEmmrt = C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis() - this.getFieldNames));
        if (!Boolean.valueOf(z && this.getFieldNames != 0).booleanValue()) {
            strGEmmrt = null;
        }
        c30350lVc.copydefault(strGEmmrt != null ? strGEmmrt : "");
        Unit unit = Unit.INSTANCE;
        c31354lsT.KWHzl("SimpleTrade_BuyCryptoPop_Button_Click", str, str2, c30350lVc);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheetViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull List<CurrencyToken> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CurrencyToken) it.next()).getCurrency());
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CryptoListBottomSheetViewModel$loadLivePrice$1(lifecycleOwner, arrayList, str, this, list, null), 3, null);
    }
}
