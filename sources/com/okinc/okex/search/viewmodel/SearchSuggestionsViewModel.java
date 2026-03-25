package com.okinc.okex.search.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC44051sBn;
import o.C44055sBr;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchSuggestionsViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<TaskDescription> AEQbTJ;
    public final SavedStateHandle EZpvd;
    public final StateFlow<String> KWHzl;
    public final MutableStateFlow<String> copydefault;
    public final C44055sBr djBIcL;
    public final StateFlow<TaskDescription> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> copydefault() {
        return this.valueOf;
    }

    @yCM
    public SearchSuggestionsViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C44055sBr c44055sBr) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c44055sBr, "");
        this.EZpvd = savedStateHandle;
        this.djBIcL = c44055sBr;
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(TaskDescription.Application.OLrzqt);
        this.AEQbTJ = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow2;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.viewmodel.SearchSuggestionsViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.viewmodel.SearchSuggestionsViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Application extends TaskDescription {
            public static final Application OLrzqt = new Application();

            private Application() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: com.okinc.okex.search.viewmodel.SearchSuggestionsViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0567TaskDescription extends TaskDescription {
            public final List<AbstractC44051sBn> KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.search.viewmodel.SearchSuggestionsViewModel$TaskDescription$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C0567TaskDescription copy$default(C0567TaskDescription c0567TaskDescription, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = c0567TaskDescription.KWHzl;
                }
                return c0567TaskDescription.AEQbTJ(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0567TaskDescription AEQbTJ(@NotNull List<? extends AbstractC44051sBn> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new C0567TaskDescription(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<AbstractC44051sBn> KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0567TaskDescription) && Intrinsics.EZpvd(this.KWHzl, ((C0567TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Results(list=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.sBn> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0567TaskDescription(@NotNull List<? extends AbstractC44051sBn> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.KWHzl = list;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends TaskDescription {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.AEQbTJ;
                }
                return activity.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((Activity) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Empty(keyword=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }
    }

    private final String AEQbTJ() {
        return (String) this.EZpvd.get("ARG_KEYWORD");
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!StringsKt__StringsKt.fARcdN((CharSequence) str)) || Intrinsics.EZpvd((Object) str, (Object) AEQbTJ())) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchSuggestionsViewModel$getSearchSuggestions$1(this, str, null), 3, null);
    }
}
