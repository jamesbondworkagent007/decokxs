package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.transfer.receive.SmartWalletChainInfoViewModel$init$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gsV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21052gsV extends ViewModel {
    public final StateFlow<C21050gsT> AEQbTJ;
    public final C12827cuN EZpvd;
    public final MutableStateFlow<C21050gsT> OLrzqt;
    public final C10954byG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C21052gsV() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C21050gsT> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:o.byG:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byG:0x0004: SGET  A[WRAPPED] (LINE:18) o.byG.EZpvd o.byG) : (r1v0 o.byG))
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x000e: INVOKE 
  (wrap:o.cuN$Application:0x000a: SGET  A[WRAPPED] (LINE:19) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:19)) : (r2v0 o.cuN))
 A[MD:(o.byG, o.cuN):void (m)] (LINE:17) call: o.gsV.<init>(o.byG, o.cuN):void type: THIS */
    public /* synthetic */ C21052gsV(C10954byG c10954byG, C12827cuN c12827cuN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10954byG.EZpvd : c10954byG, (i & 2) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN);
    }

    public C21052gsV(@NotNull C10954byG c10954byG, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c10954byG, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.copydefault = c10954byG;
        this.EZpvd = c12827cuN;
        MutableStateFlow<C21050gsT> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final Job EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SmartWalletChainInfoViewModel$init$1(this, str, null), 3, null);
    }
}
