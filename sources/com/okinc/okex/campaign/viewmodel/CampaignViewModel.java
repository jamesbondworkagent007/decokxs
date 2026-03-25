package com.okinc.okex.campaign.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.okex.campaign.bean.CampaignStatus;
import com.okinc.okex.campaign.ui.displaymodels.CampaignDisplayModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class CampaignViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final CampaignStatus AEQbTJ;
    public final List<CampaignDisplayModel> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CampaignDisplayModel> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignStatus copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public CampaignViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = (CampaignStatus) savedStateHandle.get("type");
        List<CampaignDisplayModel> list = (List) savedStateHandle.get("data");
        this.EZpvd = list == null ? yDY.AhwBna() : list;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.campaign.viewmodel.CampaignViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
