package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C28586kda;
import o.jAL;
import o.jEI;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AddAddressTrackerGroupViewModel extends ViewModel {
    public final StateFlow<jEI> AEQbTJ;
    public final C28586kda KWHzl;
    public final jAL OLrzqt;
    public final MutableStateFlow<jEI> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jEI> EZpvd() {
        return this.AEQbTJ;
    }

    @yCM
    public AddAddressTrackerGroupViewModel(@NotNull jAL jal, @NotNull C28586kda c28586kda) {
        Intrinsics.checkNotNullParameter(jal, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        this.OLrzqt = jal;
        this.KWHzl = c28586kda;
        MutableStateFlow<jEI> MutableStateFlow = StateFlowKt.MutableStateFlow(new jEI(null, null, null, 7, null));
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AddAddressTrackerGroupViewModel$loadData$1(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.business.market.features.address_tracker_sa.ui.user_management.AddAddressTrackerGroupViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInitialData$default(AddAddressTrackerGroupViewModel addAddressTrackerGroupViewModel, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        addAddressTrackerGroupViewModel.copydefault(list, str, str2);
    }

    public final void copydefault(@NotNull List<CommonGroupUiModel> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MutableStateFlow<jEI> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(mutableStateFlow.getValue().KWHzl(list, str, str2));
    }

    public final void copydefault(@NotNull List<CommonGroupUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        MutableStateFlow<jEI> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(jEI.copy$default(mutableStateFlow.getValue(), list, null, null, 6, null));
    }

    public static /* synthetic */ void onUpdateAlias$default(AddAddressTrackerGroupViewModel addAddressTrackerGroupViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        addAddressTrackerGroupViewModel.EZpvd(str);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<jEI> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(jEI.copy$default(mutableStateFlow.getValue(), null, null, str, 3, null));
    }

    public static /* synthetic */ void onUpdateAddress$default(AddAddressTrackerGroupViewModel addAddressTrackerGroupViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        addAddressTrackerGroupViewModel.KWHzl(str);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<jEI> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(jEI.copy$default(mutableStateFlow.getValue(), null, str, null, 5, null));
    }
}
