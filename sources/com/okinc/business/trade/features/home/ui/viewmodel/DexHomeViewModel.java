package com.okinc.business.trade.features.home.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.domain.model.TradingCategory;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.C22353hdk;
import o.C22400hee;
import o.C23274hvD;
import o.C23314hvr;
import o.C25389ivm;
import o.C25626jAj;
import o.C28242kUd;
import o.C28244kUf;
import o.C28258kUt;
import o.C28262kUx;
import o.C28263kUy;
import o.C28264kUz;
import o.C33070mpX;
import o.C56402yEa;
import o.C56403yEb;
import o.C6961aZJ;
import o.InterfaceC19701gMc;
import o.InterfaceC9738bbJ;
import o.gZF;
import o.kUA;
import o.kUB;
import o.yCM;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class DexHomeViewModel extends AbstractC33073mpa {
    public final C6961aZJ<Unit> AEQbTJ;
    public int AYXKKw;
    public final C23314hvr<C22400hee> AhwBna;
    public final C28258kUt AkhnZx;
    public final CoroutineDispatcher AuCTel;
    public final C19700gMb AubY;
    public final gZF DbNXlk;
    public final MutableStateFlow<DexMultiTokenInfoBean> copydefault;
    public final LiveData<Unit> djBIcL;
    public final kUB ejfBZ;
    public final C28262kUx fARcdN;
    public TradingType fIwbmz;
    public InterfaceC19701gMc fJNWhG;
    public final C25626jAj fetchVPNInfo;
    public final StateFlow<DexMultiTokenInfoBean> gEmmrt;
    public final C28263kUy getFieldNames;
    public InterfaceC19701gMc getNewProxyInstance;
    public int hDKMBd;
    public C28242kUd isConnected;
    public int iwGUEr;
    public final kUA uzCIH;
    public MutableLiveData<String> valueOf;
    public final C28264kUz values;
    public final MutableLiveData<TradingType> wlaJM;
    public int zsXlph;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final Set<String> OLrzqt = yEE.AhwBna(ExtJson.BRC20TYPE_TRADE, "Pending");
    public static final Set<String> KWHzl = yEE.AhwBna("1", MultiTransferSignData.DEFAULT_INTERVAL, "-2");

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingType.values().length];
            try {
                iArr[TradingType.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradingType.Meme.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingType.Swap.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradingType.Bridge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradingType.Advanced.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradingType.CopyTrading.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.hDKMBd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ(@NotNull TradingType tradingType) {
        Intrinsics.checkNotNullParameter(tradingType, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingType AhwBna() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<TradingType> AkhnZx() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C22400hee> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C28242kUd c28242kUd) {
        this.isConnected = c28242kUd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.zsXlph = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28242kUd gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> values() {
        return this.valueOf;
    }

    @yCM
    public DexHomeViewModel(@NotNull C28262kUx c28262kUx, @NotNull C28264kUz c28264kUz, @NotNull C28263kUy c28263kUy, @NotNull C28258kUt c28258kUt, @NotNull kUB kub, @NotNull kUA kua, @NotNull C25626jAj c25626jAj, @NotNull C19700gMb c19700gMb, @NotNull gZF gzf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c28262kUx, "");
        Intrinsics.checkNotNullParameter(c28264kUz, "");
        Intrinsics.checkNotNullParameter(c28263kUy, "");
        Intrinsics.checkNotNullParameter(c28258kUt, "");
        Intrinsics.checkNotNullParameter(kub, "");
        Intrinsics.checkNotNullParameter(kua, "");
        Intrinsics.checkNotNullParameter(c25626jAj, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(gzf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.fARcdN = c28262kUx;
        this.values = c28264kUz;
        this.getFieldNames = c28263kUy;
        this.AkhnZx = c28258kUt;
        this.ejfBZ = kub;
        this.uzCIH = kua;
        this.fetchVPNInfo = c25626jAj;
        this.AubY = c19700gMb;
        this.DbNXlk = gzf;
        this.AuCTel = coroutineDispatcher;
        this.valueOf = new MutableLiveData<>();
        C6961aZJ<Unit> c6961aZJ = new C6961aZJ<>();
        this.AEQbTJ = c6961aZJ;
        this.djBIcL = c6961aZJ;
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        this.fIwbmz = TradingType.None;
        this.wlaJM = new MutableLiveData<>();
        this.AhwBna = new C23314hvr<>();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final TradingType OLrzqt() {
        TradingType value = this.wlaJM.getValue();
        return value == null ? TradingType.None : value;
    }

    public final void EZpvd(@NotNull C22400hee c22400hee) {
        Intrinsics.checkNotNullParameter(c22400hee, "");
        this.AhwBna.setValue(c22400hee);
    }

    public final void fIwbmz() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DexHomeViewModel$onAdvancedTokenClick$1(this, null), 3, null);
    }

    public final void copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DexHomeViewModel$onAdvancedTokenChange$1(this, dexMultiTokenInfoBean, null), 3, null);
    }

    public final boolean ejfBZ() {
        return this.fARcdN.EZpvd();
    }

    public final boolean fARcdN() {
        return this.AubY.djBIcL();
    }

    public final boolean isConnected() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.AubY.KWHzl();
        return interfaceC9738bbJKWHzl != null && interfaceC9738bbJKWHzl.gHZMYf();
    }

    public static /* synthetic */ void updateTradeType$default(DexHomeViewModel dexHomeViewModel, TradingType tradingType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        dexHomeViewModel.EZpvd(tradingType, z, z2);
    }

    public final void EZpvd(@NotNull TradingType tradingType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tradingType, "");
        if (OLrzqt() != tradingType || z2) {
            TradingType.TaskDescription taskDescription = TradingType.Companion;
            if (taskDescription.AEQbTJ().contains(tradingType)) {
                if (this.isConnected == null) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DexHomeViewModel$updateTradeType$2(this, tradingType, z, null), 3, null);
                    return;
                } else {
                    AEQbTJ(tradingType, z);
                    return;
                }
            }
            TradingType tradingType2 = (TradingType) CollectionsKt___CollectionsKt.firstOrNull(taskDescription.AEQbTJ());
            if (tradingType2 != null) {
                updateTradeType$default(this, tradingType2, z, false, 4, null);
            }
        }
    }

    public final void AEQbTJ(TradingType tradingType, boolean z) {
        this.fIwbmz = OLrzqt();
        this.wlaJM.postValue(tradingType);
        if (z) {
            this.getFieldNames.AEQbTJ(tradingType);
        }
    }

    public final TradingType DbNXlk() {
        TradingType tradingTypeCopydefault = this.values.copydefault();
        if (!TradingType.Companion.AEQbTJ().contains(tradingTypeCopydefault)) {
            tradingTypeCopydefault = null;
        }
        return tradingTypeCopydefault == null ? TradingType.Swap : tradingTypeCopydefault;
    }

    public final InterfaceC9738bbJ djBIcL() {
        return this.AubY.KWHzl();
    }

    public final void EZpvd(boolean z) {
        this.uzCIH.KWHzl(z);
    }

    public final void KWHzl() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AuCTel, null, new DexHomeViewModel$checkSwapStopService$1(this, null), 2, null);
    }

    public final void AYXKKw() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AuCTel, null, new DexHomeViewModel$getStrategyOrderCount$1(this, null), 2, null);
    }

    public final void fJNWhG() {
        InterfaceC19701gMc interfaceC19701gMc = this.getNewProxyInstance;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.getNewProxyInstance = null;
        InterfaceC19701gMc interfaceC19701gMc2 = this.fJNWhG;
        if (interfaceC19701gMc2 != null) {
            interfaceC19701gMc2.KWHzl();
        }
        this.fJNWhG = null;
    }

    public final String KWHzl(@NotNull TradingType tradingType) {
        Intrinsics.checkNotNullParameter(tradingType, "");
        switch (Application.EZpvd[tradingType.ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 6:
                return "";
            case 2:
                return this.hDKMBd == 0 ? "buy" : "sell";
            case 3:
                return this.AYXKKw == 0 ? "swap" : "limit";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean EZpvd(@NotNull TradingType tradingType) {
        Intrinsics.checkNotNullParameter(tradingType, "");
        C28242kUd c28242kUd = this.isConnected;
        if (c28242kUd == null) {
            return false;
        }
        switch (Application.EZpvd[tradingType.ordinal()]) {
            case 1:
            case 6:
                return false;
            case 2:
                return c28242kUd.gEmmrt();
            case 3:
                return c28242kUd.KWHzl();
            case 4:
                return c28242kUd.AEQbTJ();
            case 5:
                return c28242kUd.EZpvd();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final List<Object> fetchVPNInfo() {
        List<TradingType> listAEQbTJ = TradingType.Companion.AEQbTJ();
        if (!(listAEQbTJ instanceof Collection) || !listAEQbTJ.isEmpty()) {
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((TradingType) it.next()).getCategory() == TradingCategory.Tools) {
                    List listOLrzqt = C56402yEa.OLrzqt();
                    listOLrzqt.add(new C28244kUf(C33070mpX.AYXKKw(C23274hvD.Fragment.dlRikr)));
                    List<TradingType> listOLrzqt2 = TradingType.Companion.OLrzqt();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
                    for (TradingType tradingType : listOLrzqt2) {
                        arrayList.add(new C22353hdk(tradingType, AEQbTJ(tradingType), false, 4, null));
                    }
                    listOLrzqt.addAll(arrayList);
                    listOLrzqt.add(new C28244kUf(C33070mpX.AYXKKw(C23274hvD.Fragment.GFUIi)));
                    List<TradingType> listCopydefault = TradingType.Companion.copydefault();
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                    for (TradingType tradingType2 : listCopydefault) {
                        arrayList2.add(new C22353hdk(tradingType2, AEQbTJ(tradingType2), false, 4, null));
                    }
                    listOLrzqt.addAll(arrayList2);
                    return C56402yEa.fARcdN(listOLrzqt);
                }
            }
        }
        List listOLrzqt3 = C56402yEa.OLrzqt();
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (TradingType tradingType3 : listAEQbTJ) {
            arrayList3.add(new C22353hdk(tradingType3, AEQbTJ(tradingType3), false, 4, null));
        }
        listOLrzqt3.addAll(arrayList3);
        return C56402yEa.fARcdN(listOLrzqt3);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.AkhnZx.AEQbTJ();
        fJNWhG();
    }
}
