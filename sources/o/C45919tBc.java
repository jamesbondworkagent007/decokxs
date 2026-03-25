package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_performance.assets.ProfileAssetsViewModel$loadData$2;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tBc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45919tBc extends tLY<Unit> {
    public final tBE AEQbTJ;
    public final StateFlow<AbstractC46197tLk<java.util.List<tBG>>> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final SavedStateHandle OLrzqt;
    public final MutableStateFlow<AbstractC46197tLk<java.util.List<tBG>>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<java.util.List<tBG>>> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.SavedStateHandle)
  (wrap:o.tBE:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBE:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:18) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.run():o.tBE A[MD:():o.tBE (m), WRAPPED] (LINE:18)) : (r2v0 o.tBE))
 A[MD:(androidx.lifecycle.SavedStateHandle, o.tBE):void (m)] (LINE:16) call: o.tBc.<init>(androidx.lifecycle.SavedStateHandle, o.tBE):void type: THIS */
    public /* synthetic */ C45919tBc(SavedStateHandle savedStateHandle, tBE tbe, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? tPF.copydefault.run() : tbe);
    }

    /* JADX INFO: renamed from: o.tBc$Application */
    public static final class Application implements Function0<PlanetAuthorId> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ PlanetAuthorId invoke() {
            java.lang.String strEZpvd = EZpvd();
            if (strEZpvd != null) {
                return PlanetAuthorId.OLrzqt(strEZpvd);
            }
            return null;
        }

        public final java.lang.String EZpvd() {
            PlanetAuthorId planetAuthorId = (PlanetAuthorId) C45919tBc.this.OLrzqt.get(PlanetAuthorId.Key);
            if (planetAuthorId != null) {
                return planetAuthorId.copydefault();
            }
            return null;
        }
    }

    public C45919tBc(@NotNull SavedStateHandle savedStateHandle, @NotNull tBE tbe) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(tbe, "");
        this.OLrzqt = savedStateHandle;
        this.AEQbTJ = tbe;
        this.KWHzl = C56392yDr.copydefault(new Application());
        MutableStateFlow<AbstractC46197tLk<java.util.List<tBG>>> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC46197tLk.Companion.OLrzqt(true));
        this.copydefault = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final java.lang.String AEQbTJ() {
        PlanetAuthorId planetAuthorId = (PlanetAuthorId) this.KWHzl.getValue();
        if (planetAuthorId != null) {
            return planetAuthorId.copydefault();
        }
        return null;
    }

    public final void EZpvd() {
        this.copydefault.setValue(AbstractC46197tLk.Companion.OLrzqt(true));
        C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), new TaskDescription(CoroutineExceptionHandler.Key, this), null, new ProfileAssetsViewModel$loadData$2(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o.tBc$TaskDescription */
    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ C45919tBc copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(CoroutineExceptionHandler.Key key, C45919tBc c45919tBc) {
            super(key);
            this.copydefault = c45919tBc;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            this.copydefault.copydefault.setValue(AbstractC46197tLk.Companion.OLrzqt(th));
        }
    }
}
