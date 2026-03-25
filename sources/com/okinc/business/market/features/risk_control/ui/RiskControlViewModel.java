package com.okinc.business.market.features.risk_control.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C2298AGj;
import o.C25389ivm;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RiskControlViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<String> KWHzl = new MutableLiveData<>();
    public boolean OLrzqt;
    public C2298AGj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2298AGj EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> copydefault() {
        return this.KWHzl;
    }

    @yCM
    public RiskControlViewModel() {
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.risk_control.ui.RiskControlViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new RiskControlViewModel$fetchRiskControlDetails$1(str2, str, this, null), 3, null);
    }
}
