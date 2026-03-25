package com.okinc.buysell.ui.cedefiwallet;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.data.cedefi.BuySellDexEmailState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC30039lJq;
import o.C30042lJt;
import o.C30044lJv;
import o.C31351lsQ;
import o.C33070mpX;
import o.C52761wXj;
import o.lJG;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellDexEnableViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<C30042lJt> AEQbTJ;
    public BuySellDexEmailState KWHzl;
    public final StateFlow<C30042lJt> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C30042lJt> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public BuySellDexEnableViewModel() {
        MutableStateFlow<C30042lJt> MutableStateFlow = StateFlowKt.MutableStateFlow(new C30042lJt(false, null, 3, null));
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.cedefiwallet.BuySellDexEnableViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void AEQbTJ(@NotNull AbstractC30039lJq abstractC30039lJq) {
        Intrinsics.checkNotNullParameter(abstractC30039lJq, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellDexEnableViewModel$trigger$1(abstractC30039lJq, this, null), 3, null);
    }

    public final void OLrzqt(BuySellDexEmailState buySellDexEmailState) {
        pUU.EZpvd("BuySellDexEnableViewModel", "handleInitAction() - starting initialization " + buySellDexEmailState);
        this.KWHzl = buySellDexEmailState;
        List<C30044lJv> listCopydefault = copydefault(buySellDexEmailState);
        MutableStateFlow<C30042lJt> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(C30042lJt.copy$default(mutableStateFlow.getValue(), false, new lJG.Application(listCopydefault, C33070mpX.AYXKKw(C31351lsQ.Activity.AkhnZx)), 1, null));
        pUU.EZpvd("BuySellDexEnableViewModel", "handleInitAction() - completed with " + listCopydefault.size() + " items");
    }

    public final void EZpvd(boolean z) {
        pUU.EZpvd("BuySellDexEnableViewModel", "handleEnableDexSuccessAction() - DEX enabled successfully");
        MutableStateFlow<C30042lJt> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(mutableStateFlow.getValue().copydefault(z, lJG.TaskDescription.OLrzqt));
    }

    public final void KWHzl(AbstractC30039lJq.TaskDescription taskDescription) {
        pUU.KWHzl("BuySellDexEnableViewModel", "handleEnableDexFailureAction() - DEX enable failed: " + taskDescription.EZpvd());
        MutableStateFlow<C30042lJt> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(C30042lJt.copy$default(mutableStateFlow.getValue(), false, new lJG.ActionBar(taskDescription.EZpvd()), 1, null));
    }

    public final void AEQbTJ() {
        pUU.EZpvd("BuySellDexEnableViewModel", "handleOnResumeAction() - onResume");
    }

    public final void OLrzqt() {
        pUU.EZpvd("BuySellDexEnableViewModel", "handleOnPauseAction() - onPause");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(Throwable th) {
        pUU.AEQbTJ("BuySellDexEnableViewModel", "handleError() - " + th.getMessage(), th);
        MutableStateFlow<C30042lJt> mutableStateFlow = this.AEQbTJ;
        C30042lJt value = mutableStateFlow.getValue();
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        mutableStateFlow.setValue(C30042lJt.copy$default(value, false, new lJG.ActionBar(message), 1, null));
    }

    public final List<C30044lJv> copydefault(BuySellDexEmailState buySellDexEmailState) {
        ArrayList<C30044lJv> arrayList = new ArrayList<>();
        if (buySellDexEmailState != null && buySellDexEmailState.getNoEmail()) {
            AEQbTJ(arrayList);
        }
        EZpvd(arrayList);
        return arrayList;
    }

    public final void AEQbTJ(ArrayList<C30044lJv> arrayList) {
        arrayList.add(new C30044lJv(C33070mpX.AYXKKw(C31351lsQ.Activity.QXDzTk), Integer.valueOf(C52761wXj.TaskDescription.GiPPlLgiPPlL)));
    }

    public final void EZpvd(ArrayList<C30044lJv> arrayList) {
        arrayList.add(new C30044lJv(C33070mpX.AYXKKw(C31351lsQ.Activity.RKcVTr), Integer.valueOf(C52761wXj.TaskDescription.gHZMYf)));
    }
}
