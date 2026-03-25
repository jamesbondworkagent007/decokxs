package com.okinc.okex.search.viewmodel;

import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import com.okinc.okex.search.viewmodel.SearchLandingViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC44050sBm;
import o.C33070mpX;
import o.C44058sBu;
import o.C47315tni;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC56387yDm;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchLandingViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<ActionBar> AEQbTJ;
    public final C44058sBu KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final StateFlow<ActionBar> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> EZpvd() {
        return this.copydefault;
    }

    @yCM
    public SearchLandingViewModel(@NotNull C44058sBu c44058sBu) {
        Intrinsics.checkNotNullParameter(c44058sBu, "");
        this.KWHzl = c44058sBu;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.sBy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchLandingViewModel.copydefault();
            }
        });
        MutableStateFlow<ActionBar> MutableStateFlow = StateFlowKt.MutableStateFlow(ActionBar.StateListAnimator.KWHzl);
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final List<AbstractC44050sBm.ActionBar> OLrzqt() {
        return (List) this.OLrzqt.getValue();
    }

    public static final List copydefault() {
        return C56402yEa.EZpvd(new AbstractC44050sBm.ActionBar(C33070mpX.AYXKKw(C47315tni.PendingIntent.aHXSQp)));
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.viewmodel.SearchLandingViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class StateListAnimator extends ActionBar {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class TaskDescription extends ActionBar {
            public final List<AbstractC44050sBm> AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.search.viewmodel.SearchLandingViewModel$ActionBar$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = taskDescription.AEQbTJ;
                }
                return taskDescription.EZpvd(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription EZpvd(@NotNull List<? extends AbstractC44050sBm> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new TaskDescription(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<AbstractC44050sBm> KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Results(list=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.sBm> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public TaskDescription(@NotNull List<? extends AbstractC44050sBm> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
            }
        }
    }

    public final void AEQbTJ() {
        ActionBar taskDescription;
        List<SearchArticleDisplayModel> listAEQbTJ = this.KWHzl.AEQbTJ();
        if (!listAEQbTJ.isEmpty()) {
            List<AbstractC44050sBm.ActionBar> listOLrzqt = OLrzqt();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractC44050sBm.TaskDescription((SearchArticleDisplayModel) it.next()));
            }
            taskDescription = new ActionBar.TaskDescription(CollectionsKt___CollectionsKt.djBIcL((Collection) listOLrzqt, (Iterable) arrayList));
        } else {
            taskDescription = ActionBar.StateListAnimator.KWHzl;
        }
        this.AEQbTJ.tryEmit(taskDescription);
    }

    public final void AEQbTJ(@NotNull SearchArticleDisplayModel searchArticleDisplayModel) {
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
        this.KWHzl.EZpvd(searchArticleDisplayModel);
        AEQbTJ();
    }
}
