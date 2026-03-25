package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.history.viewmodel.TypesSelectViewModel$getTradeTypes$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eLf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15516eLf extends ViewModel {
    public final StateFlow<java.util.List<C15505eKv>> AEQbTJ;
    public final StateFlow<C15505eKv> EZpvd;
    public final MutableStateFlow<C15505eKv> KWHzl;
    public final MutableStateFlow<java.util.List<C15505eKv>> OLrzqt;
    public C15505eKv copydefault;
    public final C15504eKu valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C15516eLf() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<C15505eKv>> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C15505eKv> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C15505eKv OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.eKu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eKu:0x0013: CONSTRUCTOR 
  (wrap:o.eKs:0x000b: CONSTRUCTOR (wrap:o.dbu:0x0008: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: o.dbu.<init>():void type: CONSTRUCTOR) A[MD:(o.dbu):void (m), WRAPPED] (LINE:16) call: o.eKs.<init>(o.dbu):void type: CONSTRUCTOR)
 A[MD:(o.eKr):void (m), WRAPPED] (LINE:15) call: o.eKu.<init>(o.eKr):void type: CONSTRUCTOR) : (r1v0 o.eKu))
 A[MD:(o.eKu):void (m)] (LINE:14) call: o.eLf.<init>(o.eKu):void type: THIS */
    public /* synthetic */ C15516eLf(C15504eKu c15504eKu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C15504eKu(new C15502eKs(new C13934dbu())) : c15504eKu);
    }

    public C15516eLf(@NotNull C15504eKu c15504eKu) {
        Intrinsics.checkNotNullParameter(c15504eKu, "");
        this.valueOf = c15504eKu;
        MutableStateFlow<java.util.List<C15505eKv>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C15505eKv> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow2);
        KWHzl();
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TypesSelectViewModel$getTradeTypes$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull C15505eKv c15505eKv) {
        Intrinsics.checkNotNullParameter(c15505eKv, "");
        if (Intrinsics.EZpvd(this.copydefault, c15505eKv)) {
            return;
        }
        C15505eKv c15505eKv2 = this.copydefault;
        if (c15505eKv2 != null) {
            c15505eKv2.AEQbTJ(false);
        }
        c15505eKv.AEQbTJ(true);
        this.copydefault = c15505eKv;
    }

    public final void OLrzqt(C15505eKv c15505eKv) {
        if (c15505eKv != null) {
            MutableStateFlow<C15505eKv> mutableStateFlow = this.KWHzl;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), c15505eKv)) {
            }
        }
    }
}
