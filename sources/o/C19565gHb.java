package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.tx.send.CeDeFiAAAssetInfo;
import com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAViewModel$loadAddressList$1;
import com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAViewModel$onAddressSelected$1;
import com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAViewModel$updateAddressList$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19565gHb extends ViewModel {
    public final MutableStateFlow<java.util.List<C19574gHk>> AEQbTJ;
    public java.lang.String AhwBna;
    public final C10948byA EZpvd;
    public final MutableSharedFlow<C19577gHn> KWHzl;
    public final SharedFlow<C19577gHn> OLrzqt;
    public C10854bwM copydefault;
    public CeDeFiAAAssetInfo djBIcL;
    public final C12827cuN gEmmrt;
    public final StateFlow<java.util.List<C19574gHk>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C19565gHb() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C19577gHn> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDeFiAAAssetInfo KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<C19574gHk>> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0008: INVOKE 
  (wrap:o.cuN$Application:0x0004: SGET  A[WRAPPED] (LINE:29) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:29)) : (r2v0 o.cuN))
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x0012: INVOKE (wrap:o.byG:0x0010: SGET  A[WRAPPED] (LINE:30) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:30)) : (r3v0 o.byA))
 A[MD:(o.cuN, o.byA):void (m)] (LINE:28) call: o.gHb.<init>(o.cuN, o.byA):void type: THIS */
    public /* synthetic */ C19565gHb(C12827cuN c12827cuN, C10948byA c10948byA, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 2) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA);
    }

    public C19565gHb(@NotNull C12827cuN c12827cuN, @NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.gEmmrt = c12827cuN;
        this.EZpvd = c10948byA;
        MutableStateFlow<java.util.List<C19574gHk>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<C19577gHn> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AhwBna = "";
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull CeDeFiAAAssetInfo ceDeFiAAAssetInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ceDeFiAAAssetInfo, "");
        this.AhwBna = str;
        this.djBIcL = ceDeFiAAAssetInfo;
        this.copydefault = this.EZpvd.copydefault(C33129mqd.valueOf(ceDeFiAAAssetInfo.getChainIndex()));
        djBIcL();
    }

    private final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletSelectReceiveAddressForAAViewModel$loadAddressList$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull java.util.List<C19574gHk> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletSelectReceiveAddressForAAViewModel$updateAddressList$1(this, list, null), 3, null);
    }

    public final void OLrzqt(@NotNull C19577gHn c19577gHn) {
        Intrinsics.checkNotNullParameter(c19577gHn, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletSelectReceiveAddressForAAViewModel$onAddressSelected$1(this, c19577gHn, null), 3, null);
    }
}
