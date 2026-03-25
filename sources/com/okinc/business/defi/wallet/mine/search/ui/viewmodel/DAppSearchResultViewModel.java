package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C18914frR;
import o.C18977fsb;
import o.C56442yFn;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DAppSearchResultViewModel extends AbstractC33073mpa {
    public MutableSharedFlow<List<C18977fsb>> AEQbTJ;
    public long EZpvd;
    public final C18914frR OLrzqt;
    public final SharedFlow<List<C18977fsb>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<C18977fsb>> EZpvd() {
        return this.copydefault;
    }

    @yCM
    public DAppSearchResultViewModel(@NotNull C18914frR c18914frR) {
        Intrinsics.checkNotNullParameter(c18914frR, "");
        this.OLrzqt = c18914frR;
        MutableSharedFlow<List<C18977fsb>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.EZpvd = 2L;
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DAppSearchResultViewModel$getSearchResult$1(this, str, null), 3, null);
    }

    public final Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        this.EZpvd = 2L;
        Object objEmit = this.AEQbTJ.emit(yDY.AhwBna(), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }
}
