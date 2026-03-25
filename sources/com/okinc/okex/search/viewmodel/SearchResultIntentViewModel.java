package com.okinc.okex.search.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C44052sBo;
import o.C44760scx;
import o.sBA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchResultIntentViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final StateFlow<Activity> AEQbTJ;
    public final sBA KWHzl;
    public final MutableStateFlow<Activity> OLrzqt;
    public final SavedStateHandle copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> valueOf() {
        return this.AEQbTJ;
    }

    @yCM
    public SearchResultIntentViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull sBA sba) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(sba, "");
        this.copydefault = savedStateHandle;
        this.KWHzl = sba;
        MutableStateFlow<Activity> MutableStateFlow = StateFlowKt.MutableStateFlow(Activity.Application.copydefault);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.viewmodel.SearchResultIntentViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.viewmodel.SearchResultIntentViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Application extends Activity {
            public static final Application copydefault = new Application();

            private Application() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends Activity {
            public final String EZpvd;
            public final C44052sBo OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, C44052sBo c44052sBo, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.EZpvd;
                }
                if ((i & 2) != 0) {
                    c44052sBo = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.KWHzl(str, c44052sBo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C44052sBo EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull String str, @NotNull C44052sBo c44052sBo) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(c44052sBo, "");
                return new StateListAnimator(str, c44052sBo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "NewResult(intentId=" + this.EZpvd + ", model=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str, @NotNull C44052sBo c44052sBo) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(c44052sBo, "");
                this.EZpvd = str;
                this.OLrzqt = c44052sBo;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Dialog extends Activity {
            public static final Dialog EZpvd = new Dialog();

            private Dialog() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.okex.search.viewmodel.SearchResultIntentViewModel$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0566Activity extends Activity {
            public static final C0566Activity copydefault = new C0566Activity();

            private C0566Activity() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class TaskDescription extends Activity {
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = taskDescription.copydefault;
                }
                return taskDescription.KWHzl(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(boolean z) {
                return new TaskDescription(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.copydefault == ((TaskDescription) obj).copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Collapsed(answerIsClipped=" + this.copydefault + ")";
            }

            public TaskDescription(boolean z) {
                super(null);
                this.copydefault = z;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar extends Activity {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }
    }

    public final String EZpvd() {
        return (String) this.copydefault.get("ARG_INTENT_ID");
    }

    public final boolean copydefault() {
        Boolean bool = (Boolean) this.copydefault.get("ARG_HAS_MORE");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean OLrzqt() {
        Boolean bool = (Boolean) this.copydefault.get("ARG_IS_CLIPPED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void AEQbTJ(String str) {
        C44760scx.log$default("SearchResultIntentViewModel: getSearchIntents > intentId: " + str + " | currentId: " + EZpvd(), null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultIntentViewModel$getSearchIntents$1(str, this, null), 3, null);
    }

    public final void OLrzqt(boolean z) {
        this.copydefault.set("ARG_IS_CLIPPED", Boolean.valueOf(z));
        if (z) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultIntentViewModel$setAnswerIsClipped$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultIntentViewModel$expandShowMore$1(this, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultIntentViewModel$collapseShowMore$1(this, null), 3, null);
    }
}
