package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C18914frR;
import o.C18980fse;
import o.C18982fsg;
import o.C18995fst;
import o.C33129mqd;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchAllResultViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<SearchRecommendResponse> AEQbTJ;
    public SharedFlow<SearchRecommendResponse> AYXKKw;
    public final SharedFlow<C18995fst> AhwBna;
    public C18980fse AkhnZx;
    public final MutableStateFlow<C18995fst> EZpvd;
    public final MutableSharedFlow<C18995fst> KWHzl;
    public final MutableSharedFlow<Integer> OLrzqt;
    public final MutableStateFlow<String> copydefault;
    public final SharedFlow<String> djBIcL;
    public final C18914frR fetchVPNInfo;
    public final SharedFlow<Integer> gEmmrt;
    public final StateFlow<C18995fst> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<SearchRecommendResponse> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw() {
        this.AkhnZx = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18980fse AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Integer> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C18995fst> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C18995fst> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public WalletSearchAllResultViewModel(@NotNull C18914frR c18914frR) {
        Intrinsics.checkNotNullParameter(c18914frR, "");
        this.fetchVPNInfo = c18914frR;
        MutableSharedFlow<SearchRecommendResponse> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<C18995fst> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<C18995fst> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default3;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.copydefault = MutableStateFlow2;
        this.djBIcL = FlowKt.asSharedFlow(MutableStateFlow2);
    }

    public final void OLrzqt(@NotNull C18980fse c18980fse) {
        Intrinsics.checkNotNullParameter(c18980fse, "");
        this.AkhnZx = c18980fse;
        List<C18982fsg> listAYXKKw = c18980fse.AYXKKw();
        if (listAYXKKw == null) {
            listAYXKKw = yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAYXKKw) {
            C18982fsg c18982fsg = (C18982fsg) obj;
            if (Intrinsics.EZpvd((Object) c18982fsg.copydefault().fetchVPNInfo(), (Object) c18982fsg.OLrzqt())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new WalletSearchAllResultViewModel$saveTokenDataList$1(this, null), 2, null);
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(((C18982fsg) next).copydefault().KWHzl());
            do {
                Object next2 = it.next();
                BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(((C18982fsg) next2).copydefault().KWHzl());
                if (bigDecimalEZpvd.compareTo(bigDecimalEZpvd2) < 0) {
                    next = next2;
                    bigDecimalEZpvd = bigDecimalEZpvd2;
                }
            } while (it.hasNext());
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletSearchAllResultViewModel$saveTokenDataList$2(this, (C18982fsg) next, null), 2, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new WalletSearchAllResultViewModel$setInputContentData$1(this, str, null), 2, null);
    }

    public final void KWHzl(int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new WalletSearchAllResultViewModel$changeSelectedPosition$1(this, i, null), 2, null);
    }

    public final void AEQbTJ(@NotNull C18995fst c18995fst) {
        Intrinsics.checkNotNullParameter(c18995fst, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new WalletSearchAllResultViewModel$setAllResultData$1(this, c18995fst, null), 2, null);
    }
}
