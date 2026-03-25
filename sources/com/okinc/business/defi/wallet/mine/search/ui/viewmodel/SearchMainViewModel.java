package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC19261fxu;
import o.AbstractC33073mpa;
import o.C18913frQ;
import o.C18914frR;
import o.C18981fsf;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchMainViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<AbstractC19261fxu> AEQbTJ;
    public boolean AYXKKw;
    public final StateFlow<C18981fsf> AhwBna;
    public final MutableStateFlow<C18981fsf> EZpvd;
    public final StateFlow<AbstractC19261fxu> OLrzqt;
    public final CoroutineDispatcher copydefault;
    public Job djBIcL;
    public final C18914frR gEmmrt;
    public final C18913frQ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC19261fxu> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C18981fsf> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AYXKKw = z;
    }

    @yCM
    public SearchMainViewModel(@NotNull C18914frR c18914frR, @NotNull C18913frQ c18913frQ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c18914frR, "");
        Intrinsics.checkNotNullParameter(c18913frQ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.gEmmrt = c18914frR;
        this.valueOf = c18913frQ;
        this.copydefault = coroutineDispatcher;
        MutableStateFlow<C18981fsf> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC19261fxu> MutableStateFlow2 = StateFlowKt.MutableStateFlow(AbstractC19261fxu.Application.OLrzqt);
        this.AEQbTJ = MutableStateFlow2;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.ui.viewmodel.SearchMainViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchMainViewModel$getHotSearchList$1(this, null), 3, null);
    }

    public final void EZpvd(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchMainViewModel$requestDataLoad$1(this, z, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchMainViewModel$onTransitionComplete$1(this, null), 3, null);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchMainViewModel$resetLoadState$1(this, null), 3, null);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
