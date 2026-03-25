package com.okinc.tradingbot.impl.botDetail.ui.llmSignal;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.common.net.HttpHeaders;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC56429yFa;
import o.C48174uHs;
import o.C53673wpt;
import o.pUU;
import o.uCH;
import o.uLN;
import o.uLU;
import o.wUL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class LLMSignalDetailsViewModel extends uLN<ActionBar> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final C53673wpt AEQbTJ;
    public final StateFlow<uLU<C48174uHs>> AhwBna;
    public final uCH EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final MutableStateFlow<uLU<C48174uHs>> copydefault;
    public final SavedStateHandle gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLU<C48174uHs>> OLrzqt() {
        return this.AhwBna;
    }

    @yCM
    public LLMSignalDetailsViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull uCH uch, @NotNull C53673wpt c53673wpt) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(uch, "");
        Intrinsics.checkNotNullParameter(c53673wpt, "");
        this.gEmmrt = savedStateHandle;
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = uch;
        this.AEQbTJ = c53673wpt;
        MutableStateFlow<uLU<C48174uHs>> MutableStateFlow = StateFlowKt.MutableStateFlow(uLU.Companion.EZpvd(true));
        this.copydefault = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String EZpvd() {
        String str = (String) this.gEmmrt.get("algoId");
        return str == null ? "" : str;
    }

    public final boolean copydefault() {
        Boolean bool = (Boolean) this.gEmmrt.get("isBacktest");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ LLMSignalDetailsViewModel EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(CoroutineExceptionHandler.Key key, LLMSignalDetailsViewModel lLMSignalDetailsViewModel) {
            super(key);
            this.EZpvd = lLMSignalDetailsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            pUU.AEQbTJ("LLMSignalDetailsVM", "Failed to fetch AI detail", th);
            this.EZpvd.copydefault.setValue(uLU.Companion.KWHzl(th));
            this.EZpvd.EZpvd(new ActionBar.TaskDescription(th));
        }
    }

    public final void AEQbTJ(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        pUU.EZpvd("LLMSignalDetailsVM", "onAction: " + stateListAnimator);
        if (stateListAnimator instanceof StateListAnimator.C0637StateListAnimator) {
            KWHzl();
        } else {
            if (!(stateListAnimator instanceof StateListAnimator.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            AhwBna();
        }
    }

    private final void KWHzl() {
        if (EZpvd().length() == 0) {
            pUU.copydefault("LLMSignalDetailsVM", "Invalid algoId: " + EZpvd());
            return;
        }
        AEQbTJ();
    }

    public final void AEQbTJ() {
        if (EZpvd().length() == 0) {
            pUU.copydefault("LLMSignalDetailsVM", "Invalid algoId: " + EZpvd());
            return;
        }
        if (!(this.copydefault.getValue() instanceof uLU.ActionBar)) {
            this.copydefault.setValue(uLU.Companion.EZpvd(true));
        }
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt.plus(new TaskDescription(CoroutineExceptionHandler.Key, this)), null, new LLMSignalDetailsViewModel$fetchAiDetail$2(this, null), 2, null);
    }

    private final void AhwBna() {
        AEQbTJ();
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsViewModel$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0637StateListAnimator implements StateListAnimator {
            public static final C0637StateListAnimator OLrzqt = new C0637StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0637StateListAnimator)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 235596751;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "OnResume";
            }

            private C0637StateListAnimator() {
            }
        }

        public static final class TaskDescription implements StateListAnimator {
            public static final TaskDescription copydefault = new TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 353082776;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return HttpHeaders.REFRESH;
            }

            private TaskDescription() {
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Activity implements ActionBar {
            public static final Activity KWHzl = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 989686514;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FetchSuccess";
            }

            private Activity() {
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription implements ActionBar {
            public final Throwable AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = taskDescription.AEQbTJ;
                }
                return taskDescription.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new TaskDescription(th);
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
                return "FetchError(throwable=" + this.AEQbTJ + ")";
            }

            public TaskDescription(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                this.AEQbTJ = th;
            }
        }
    }
}
