package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import com.okinc.business.defi.wallet.mine.search.domain.type.SearchSortType;
import java.util.List;
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
import o.C18913frQ;
import o.C18914frR;
import o.C18915frS;
import o.C18980fse;
import o.C18982fsg;
import o.C18998fsw;
import o.C33129mqd;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenSearchResultViewModel extends AbstractC33073mpa {
    public MutableStateFlow<C18998fsw> AEQbTJ;
    public final C18913frQ AYXKKw;
    public final SharedFlow<C18998fsw> AhwBna;
    public boolean AkhnZx;
    public final StateFlow<SearchSortType> DbNXlk;
    public MutableSharedFlow<C18980fse> EZpvd;
    public MutableStateFlow<SearchSortType> KWHzl;
    public List<MarketChainBean> OLrzqt;
    public MutableStateFlow<C18980fse> copydefault;
    public String djBIcL;
    public final SharedFlow<C18980fse> fIwbmz;
    public final StateFlow<C18980fse> fJNWhG;
    public final C18915frS fetchVPNInfo;
    public boolean gEmmrt;
    public final C18914frR isConnected;
    public long valueOf;
    public List<C18982fsg> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MarketChainBean> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<SearchSortType> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C18980fse> KWHzl() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C18980fse> OLrzqt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C18998fsw> copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.gEmmrt;
    }

    @yCM
    public TokenSearchResultViewModel(@NotNull C18914frR c18914frR, @NotNull C18913frQ c18913frQ, @NotNull C18915frS c18915frS) {
        Intrinsics.checkNotNullParameter(c18914frR, "");
        Intrinsics.checkNotNullParameter(c18913frQ, "");
        Intrinsics.checkNotNullParameter(c18915frS, "");
        this.isConnected = c18914frR;
        this.AYXKKw = c18913frQ;
        this.fetchVPNInfo = c18915frS;
        MutableStateFlow<C18980fse> MutableStateFlow = StateFlowKt.MutableStateFlow(new C18980fse(true, null, null, null, null, null, null, null, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        this.copydefault = MutableStateFlow;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<C18980fse> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<C18998fsw> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C18998fsw(Long.MIN_VALUE, "", ""));
        this.AEQbTJ = MutableStateFlow2;
        this.AhwBna = FlowKt.asSharedFlow(MutableStateFlow2);
        this.OLrzqt = yDY.AhwBna();
        this.valueOf = Long.MIN_VALUE;
        this.djBIcL = "";
        this.AkhnZx = true;
        MutableStateFlow<SearchSortType> MutableStateFlow3 = StateFlowKt.MutableStateFlow(SearchSortType.DEFAULT);
        this.KWHzl = MutableStateFlow3;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = this.AkhnZx;
        this.AkhnZx = true;
        this.djBIcL = str;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TokenSearchResultViewModel$getSearchResult$1(this, str, z, null), 2, null);
    }

    public final boolean copydefault(String str) {
        return C33129mqd.copydefault((Object) Integer.valueOf(str.length()), (Object) 2) && C33129mqd.valueOf(Integer.valueOf(str.length()), 8);
    }

    public final void copydefault(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenSearchResultViewModel$reportDexValidSearch$1(this, j, str, null), 3, null);
    }

    public final void valueOf() {
        this.valueOf = Long.MIN_VALUE;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenSearchResultViewModel$resetFilterChainId$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull C18998fsw c18998fsw, @NotNull String str) {
        Intrinsics.checkNotNullParameter(c18998fsw, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = true;
        long jKWHzl = c18998fsw.KWHzl();
        this.valueOf = jKWHzl;
        this.AkhnZx = jKWHzl == Long.MIN_VALUE;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenSearchResultViewModel$updateChainFilter$1(this, c18998fsw, null), 3, null);
        if (str.length() == 0) {
            str = this.djBIcL;
        }
        AEQbTJ(str);
    }

    public final void OLrzqt(@NotNull SearchSortType searchSortType) {
        Intrinsics.checkNotNullParameter(searchSortType, "");
        this.KWHzl.setValue(searchSortType);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TokenSearchResultViewModel$updateSort$1(this, searchSortType, null), 2, null);
    }
}
