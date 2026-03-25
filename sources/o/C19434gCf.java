package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.tx.history.segwit.AggregationAddressSwitchViewModel$fetchAddressAggregationData$2;
import com.okinc.business.defi.wallet.tx.history.segwit.AggregationAddressSwitchViewModel$updateDefaultAggregationAddress$2;
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

/* JADX INFO: renamed from: o.gCf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19434gCf extends ViewModel {
    public final StateFlow<Point<java.util.List<C19437gCi>>> AEQbTJ;
    public final C11205cFp AYXKKw;
    public final StateFlow<Point<gCC>> AhwBna;
    public final C8301bAD EZpvd;
    public final C10948byA KWHzl;
    public final MutableStateFlow<Point<gCC>> OLrzqt;
    public final MutableStateFlow<Point<java.util.List<C19437gCi>>> copydefault;
    public final C12827cuN djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C19434gCf() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<java.util.List<C19437gCi>>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<gCC>> copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (wrap:o.bAD:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bAD:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:24) call: o.bAD.<init>():void type: CONSTRUCTOR) : (r2v0 o.bAD))
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0009: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0011: INVOKE 
  (wrap:o.cuN$Application:0x000d: SGET  A[WRAPPED] (LINE:25) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:25)) : (r3v0 o.cuN))
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x001b: INVOKE (wrap:o.byG:0x0019: SGET  A[WRAPPED] (LINE:26) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:26)) : (r4v0 o.byA))
  (wrap:o.cFp:?: TERNARY null = ((wrap:int:0x001f: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cFp:0x0023: SGET  A[WRAPPED] (LINE:27) o.cFp.EZpvd o.cFp) : (r5v0 o.cFp))
 A[MD:(o.bAD, o.cuN, o.byA, o.cFp):void (m)] (LINE:23) call: o.gCf.<init>(o.bAD, o.cuN, o.byA, o.cFp):void type: THIS */
    public /* synthetic */ C19434gCf(C8301bAD c8301bAD, C12827cuN c12827cuN, C10948byA c10948byA, C11205cFp c11205cFp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C8301bAD() : c8301bAD, (i & 2) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 4) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA, (i & 8) != 0 ? C11205cFp.EZpvd : c11205cFp);
    }

    public C19434gCf(@NotNull C8301bAD c8301bAD, @NotNull C12827cuN c12827cuN, @NotNull C10948byA c10948byA, @NotNull C11205cFp c11205cFp) {
        Intrinsics.checkNotNullParameter(c8301bAD, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c11205cFp, "");
        this.EZpvd = c8301bAD;
        this.djBIcL = c12827cuN;
        this.KWHzl = c10948byA;
        this.AYXKKw = c11205cFp;
        MutableStateFlow<Point<java.util.List<C19437gCi>>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Point<gCC>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final void EZpvd(int i) {
        this.EZpvd.KWHzl(i);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, long j, long j2, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MutableStateFlow<Point<java.util.List<C19437gCi>>> mutableStateFlow = this.copydefault;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Point.StateListAnimator(null, 1, null))) {
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AggregationAddressSwitchViewModel$fetchAddressAggregationData$2(this, j2, str, j, str2, z, null), 3, null);
    }

    public final void copydefault(long j, @NotNull java.lang.String str, int i, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        MutableStateFlow<Point<gCC>> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Point.StateListAnimator(null, 1, null))) {
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AggregationAddressSwitchViewModel$updateDefaultAggregationAddress$2(abstractC12782ctV, j, str, i, this, null), 3, null);
    }
}
