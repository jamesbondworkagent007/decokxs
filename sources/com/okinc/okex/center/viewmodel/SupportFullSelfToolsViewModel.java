package com.okinc.okex.center.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C45396sox;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportFullSelfToolsViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final C45396sox EZpvd;
    public final StateFlow<ActionBar> KWHzl;
    public final MutableStateFlow<ActionBar> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public SupportFullSelfToolsViewModel(@NotNull C45396sox c45396sox) {
        Intrinsics.checkNotNullParameter(c45396sox, "");
        this.EZpvd = c45396sox;
        MutableStateFlow<ActionBar> MutableStateFlow = StateFlowKt.MutableStateFlow(ActionBar.Activity.KWHzl);
        this.copydefault = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportFullSelfToolsViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportFullSelfToolsViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends ActionBar {
            public static final Activity KWHzl = new Activity();

            private Activity() {
                super(null);
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application extends ActionBar {
            public final List<SelfServiceDisplayModel> KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.viewmodel.SupportFullSelfToolsViewModel$ActionBar$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = application.KWHzl;
                }
                return application.AEQbTJ(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull List<SelfServiceDisplayModel> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<SelfServiceDisplayModel> AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.KWHzl, ((Application) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(allToolsList=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull List<SelfServiceDisplayModel> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.KWHzl = list;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends ActionBar {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.copydefault;
                }
                return stateListAnimator.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(errorMsg=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new SupportFullSelfToolsViewModel$loadData$1(this, null), 2, null);
    }
}
