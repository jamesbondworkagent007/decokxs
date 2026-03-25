package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
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
import o.C18916frT;
import o.C19000fsy;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletAssetResultViewModel extends AbstractC33073mpa {
    public String AEQbTJ;
    public final StateFlow<C19000fsy> AYXKKw;
    public final C18916frT EZpvd;
    public final MutableSharedFlow<C19000fsy> KWHzl;
    public final MutableStateFlow<C19000fsy> OLrzqt;
    public final SharedFlow<C19000fsy> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C19000fsy> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C19000fsy> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public SearchWalletAssetResultViewModel(@NotNull C18916frT c18916frT) {
        Intrinsics.checkNotNullParameter(c18916frT, "");
        this.EZpvd = c18916frT;
        MutableStateFlow<C19000fsy> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<C19000fsy> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AEQbTJ = "";
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new SearchWalletAssetResultViewModel$getSearchResult$1(this, str, null), 2, null);
    }
}
