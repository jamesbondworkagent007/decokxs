package com.okinc.business.invest_biz.ui.screens.eventpage;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.InterfaceC23641iDx;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestMultiTabEventPageViewModel extends AbstractC33073mpa {
    public final InterfaceC23641iDx OLrzqt;
    public final MutableStateFlow<Activity> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Activity> EZpvd() {
        return this.copydefault;
    }

    @yCM
    public InvestMultiTabEventPageViewModel(@NotNull InterfaceC23641iDx interfaceC23641iDx) {
        Intrinsics.checkNotNullParameter(interfaceC23641iDx, "");
        this.OLrzqt = interfaceC23641iDx;
        this.copydefault = StateFlowKt.MutableStateFlow(Activity.TaskDescription.copydefault);
    }

    public interface Activity {

        public static final class TaskDescription implements Activity {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
            }
        }

        /* JADX INFO: loaded from: classes15.dex */
        public static final class StateListAnimator implements Activity {
            public final InvestMultiTabEventPageData OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InvestMultiTabEventPageData investMultiTabEventPageData, int i, Object obj) {
                if ((i & 1) != 0) {
                    investMultiTabEventPageData = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.copydefault(investMultiTabEventPageData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InvestMultiTabEventPageData OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull InvestMultiTabEventPageData investMultiTabEventPageData) {
                Intrinsics.checkNotNullParameter(investMultiTabEventPageData, "");
                return new StateListAnimator(investMultiTabEventPageData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Data(data=" + this.OLrzqt + ")";
            }

            public StateListAnimator(@NotNull InvestMultiTabEventPageData investMultiTabEventPageData) {
                Intrinsics.checkNotNullParameter(investMultiTabEventPageData, "");
                this.OLrzqt = investMultiTabEventPageData;
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageViewModel$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes15.dex */
        public static final class C0337Activity implements Activity {
            public static final C0337Activity OLrzqt = new C0337Activity();

            private C0337Activity() {
            }
        }
    }

    public final void OLrzqt(int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestMultiTabEventPageViewModel$loadData$1(this, i, null), 3, null);
    }
}
