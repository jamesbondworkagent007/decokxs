package com.okinc.business.market.features.address_tracker.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C28586kda;
import o.C56403yEb;
import o.InterfaceC25659jBp;
import o.jAL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerGroupSelectionViewModel extends ViewModel {
    public final StateFlow<InterfaceC25659jBp> AEQbTJ;
    public final jAL EZpvd;
    public final MutableStateFlow<InterfaceC25659jBp> OLrzqt;
    public final C28586kda copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC25659jBp> KWHzl() {
        return this.AEQbTJ;
    }

    @yCM
    public TrackerGroupSelectionViewModel(@NotNull jAL jal, @NotNull C28586kda c28586kda) {
        Intrinsics.checkNotNullParameter(jal, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        this.EZpvd = jal;
        this.copydefault = c28586kda;
        MutableStateFlow<InterfaceC25659jBp> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC25659jBp.TaskDescription.copydefault);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static /* synthetic */ void loadData$default(TrackerGroupSelectionViewModel trackerGroupSelectionViewModel, TrackerGroupSelectionParams trackerGroupSelectionParams, int i, Object obj) {
        if ((i & 1) != 0) {
            trackerGroupSelectionParams = null;
        }
        trackerGroupSelectionViewModel.OLrzqt(trackerGroupSelectionParams);
    }

    public final void OLrzqt(TrackerGroupSelectionParams trackerGroupSelectionParams) {
        List<CommonGroupUiModel> listEZpvd;
        if (trackerGroupSelectionParams != null && (listEZpvd = trackerGroupSelectionParams.EZpvd()) != null && listEZpvd.size() > 0) {
            this.OLrzqt.setValue(new InterfaceC25659jBp.Application(trackerGroupSelectionParams.EZpvd()));
            return;
        }
        InterfaceC25659jBp value = this.OLrzqt.getValue();
        if (!(value instanceof InterfaceC25659jBp.Application)) {
            this.OLrzqt.setValue(InterfaceC25659jBp.TaskDescription.copydefault);
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerGroupSelectionViewModel$loadData$1(this, value, null), 3, null);
    }

    public static /* synthetic */ void onToggleGroup$default(TrackerGroupSelectionViewModel trackerGroupSelectionViewModel, GroupSelectionMode groupSelectionMode, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        trackerGroupSelectionViewModel.OLrzqt(groupSelectionMode, i);
    }

    public final void OLrzqt(@NotNull GroupSelectionMode groupSelectionMode, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupSelectionMode, "");
        InterfaceC25659jBp value = this.OLrzqt.getValue();
        if (value instanceof InterfaceC25659jBp.Application) {
            if (groupSelectionMode != GroupSelectionMode.BULK) {
                List<CommonGroupUiModel> listOLrzqt = ((InterfaceC25659jBp.Application) value).OLrzqt();
                arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (CommonGroupUiModel commonGroupUiModel : listOLrzqt) {
                    arrayList.add(CommonGroupUiModel.copy$default(commonGroupUiModel, 0, null, 0, 0, 0, commonGroupUiModel.KWHzl() == i, false, 95, null));
                }
            } else {
                List<CommonGroupUiModel> listOLrzqt2 = ((InterfaceC25659jBp.Application) value).OLrzqt();
                arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
                for (CommonGroupUiModel commonGroupUiModelCopy$default : listOLrzqt2) {
                    if (commonGroupUiModelCopy$default.KWHzl() == i) {
                        commonGroupUiModelCopy$default = CommonGroupUiModel.copy$default(commonGroupUiModelCopy$default, 0, null, 0, 0, 0, !commonGroupUiModelCopy$default.copydefault(), false, 95, null);
                    }
                    arrayList.add(commonGroupUiModelCopy$default);
                }
            }
            this.OLrzqt.setValue(new InterfaceC25659jBp.Application(arrayList));
        }
    }
}
