package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.home.fragment.ChooseNetworkContainerViewModel$fetchMainWallet$2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C12827cuN;
import o.Point;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.faQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18013faQ extends ViewModel {
    public final C12827cuN EZpvd;
    public final MutableStateFlow<Point<AbstractC12782ctV>> OLrzqt;
    public final StateFlow<Point<AbstractC12782ctV>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18013faQ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<AbstractC12782ctV>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0007: INVOKE 
  (wrap:o.cuN$Application:0x0004: SGET  A[WRAPPED] (LINE:16) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:16)) : (r1v0 o.cuN))
 A[MD:(o.cuN):void (m)] (LINE:15) call: o.faQ.<init>(o.cuN):void type: THIS */
    public /* synthetic */ C18013faQ(C12827cuN c12827cuN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN);
    }

    public C18013faQ(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.EZpvd = c12827cuN;
        MutableStateFlow<Point<AbstractC12782ctV>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        MutableStateFlow<Point<AbstractC12782ctV>> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Point.StateListAnimator(null, 1, null))) {
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChooseNetworkContainerViewModel$fetchMainWallet$2(this, null), 3, null);
    }
}
