package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.kline.ui.formula.data.KlineFormulaData;
import com.okinc.kline.ui.formula.ui.viewmodel.KlineFormulaViewModel$getHistoryFormulaCandles$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pte, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39507pte extends ViewModel {
    public final MutableSharedFlow<Activity> EZpvd;
    public final C39384prL KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final SharedFlow<Activity> copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> EZpvd() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.pte$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pte.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public C39507pte(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C39384prL c39384prL) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c39384prL, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = c39384prL;
        MutableSharedFlow<Activity> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 4, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull KlineFormulaData klineFormulaData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(klineFormulaData, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new KlineFormulaViewModel$getHistoryFormulaCandles$1(this, klineFormulaData, str, null), 2, null);
    }

    /* JADX INFO: renamed from: o.pte$Activity */
    public interface Activity {

        /* JADX INFO: renamed from: o.pte$Activity$Activity, reason: collision with other inner class name */
        public static final class C0920Activity implements Activity {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0920Activity copy$default(C0920Activity c0920Activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0920Activity.copydefault;
                }
                return c0920Activity.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0920Activity copydefault(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0920Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0920Activity) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C0920Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FormulaCheckError(msg=" + this.copydefault + ")";
            }

            public C0920Activity(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: o.pte$Activity$Application */
        public static final class Application implements Activity {
            public final C39503pta KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, C39503pta c39503pta, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    c39503pta = application.KWHzl;
                }
                return application.KWHzl(c39503pta);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C39503pta EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull C39503pta c39503pta) {
                Intrinsics.checkNotNullParameter(c39503pta, "");
                return new Application(c39503pta);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
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
            public java.lang.String toString() {
                return "FormulaCheckSuccess(formulaInfo=" + this.KWHzl + ")";
            }

            public Application(@NotNull C39503pta c39503pta) {
                Intrinsics.checkNotNullParameter(c39503pta, "");
                this.KWHzl = c39503pta;
            }
        }
    }
}
