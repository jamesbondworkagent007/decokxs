package com.okinc.okex.campaign.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.campaign.ui.displaymodels.CampaignDisplayModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C44848sef;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class CampaignActivityViewModel extends ViewModel {
    public final StateFlow<ActionBar> EZpvd;
    public final MutableStateFlow<ActionBar> KWHzl;
    public final C44848sef copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> EZpvd() {
        return this.EZpvd;
    }

    @yCM
    public CampaignActivityViewModel(@NotNull C44848sef c44848sef, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c44848sef, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = c44848sef;
        MutableStateFlow<ActionBar> MutableStateFlow = StateFlowKt.MutableStateFlow(ActionBar.TaskDescription.KWHzl);
        this.KWHzl = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CampaignActivityViewModel$loadData$1(this, null), 3, null);
    }

    public interface ActionBar {

        public static final class TaskDescription implements ActionBar {
            public static final TaskDescription KWHzl = new TaskDescription();

            private TaskDescription() {
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity implements ActionBar {
            public static final Activity EZpvd = new Activity();

            private Activity() {
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application implements ActionBar {
            public final List<CampaignDisplayModel> EZpvd;
            public final List<CampaignDisplayModel> KWHzl;
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.campaign.viewmodel.CampaignActivityViewModel$ActionBar$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, boolean z, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = application.OLrzqt;
                }
                if ((i & 2) != 0) {
                    list = application.KWHzl;
                }
                if ((i & 4) != 0) {
                    list2 = application.EZpvd;
                }
                return application.EZpvd(z, list, list2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(boolean z, @NotNull List<CampaignDisplayModel> list, @NotNull List<CampaignDisplayModel> list2) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(list2, "");
                return new Application(z, list, list2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<CampaignDisplayModel> KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<CampaignDisplayModel> OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((Boolean.hashCode(this.OLrzqt) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Data(isUserRiskControlled=" + this.OLrzqt + ", ongoingCampaigns=" + this.KWHzl + ", endedCampaigns=" + this.EZpvd + ")";
            }

            public Application(boolean z, @NotNull List<CampaignDisplayModel> list, @NotNull List<CampaignDisplayModel> list2) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(list2, "");
                this.OLrzqt = z;
                this.KWHzl = list;
                this.EZpvd = list2;
            }
        }
    }
}
