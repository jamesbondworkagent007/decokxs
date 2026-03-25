package com.okinc.preference.ui.language;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AXZ;
import o.AbstractC4712Bof;
import o.BnW;
import o.C4718Bol;
import o.InterfaceC4707Boa;
import o.InterfaceC4714Boh;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SelectLangCoreViewModel extends ViewModel {
    public final LiveData<BnW> AEQbTJ;
    public final MutableSharedFlow<AbstractC4712Bof> EZpvd;
    public final C4718Bol KWHzl;
    public final MutableLiveData<BnW> OLrzqt;
    public final SharedFlow<AbstractC4712Bof> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<BnW> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC4712Bof> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public SelectLangCoreViewModel(@NotNull C4718Bol c4718Bol) {
        Intrinsics.checkNotNullParameter(c4718Bol, "");
        this.KWHzl = c4718Bol;
        MutableLiveData<BnW> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.AEQbTJ = mutableLiveData;
        MutableSharedFlow<AbstractC4712Bof> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final class TaskDescription implements InterfaceC4707Boa {
        public TaskDescription() {
        }

        @Override // o.InterfaceC4707Boa
        public void AEQbTJ(BnW bnW) {
            Intrinsics.checkNotNullParameter(bnW, "");
            SelectLangCoreViewModel.this.OLrzqt.setValue(bnW);
        }
    }

    public final void copydefault() {
        this.KWHzl.EZpvd(new TaskDescription());
        this.KWHzl.EZpvd(new StateListAnimator());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectLangCoreViewModel$init$3(this, null), 3, null);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator implements InterfaceC4714Boh {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC4714Boh
        public void onEvent(AbstractC4712Bof abstractC4712Bof) {
            Intrinsics.checkNotNullParameter(abstractC4712Bof, "");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(SelectLangCoreViewModel.this), null, null, new SelectLangCoreViewModel$init$2$onEvent$1(SelectLangCoreViewModel.this, abstractC4712Bof, null), 3, null);
        }
    }

    public final void OLrzqt(@NotNull AXZ axz) {
        Intrinsics.checkNotNullParameter(axz, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectLangCoreViewModel$changeLanguage$1(this, axz, null), 3, null);
    }
}
