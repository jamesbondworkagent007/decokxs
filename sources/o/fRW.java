package o;

import com.okinc.business.defi.wallet.switchComponent.viewmodel.SwitchWalletSearchResultsUseCase$getFilteredWallets$2;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRW implements InterfaceC17404fEb {
    public final long AEQbTJ;
    public final java.util.List<UnsupportedWalletType> EZpvd;
    public final Function2<InterfaceC9738bbJ, java.lang.Long, java.lang.Boolean> KWHzl;
    public final CurrentWalletSelectMode OLrzqt;
    public final CurrentWalletSwitchNetworkMode copydefault;
    public final C17412fEj gEmmrt;
    public final InterfaceC17773fRt valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super o.bbJ, ? super java.lang.Long, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.okinc.wallet.api.bean.UnsupportedWalletType> */
    /* JADX WARN: Multi-variable type inference failed */
    public fRW(@NotNull C17412fEj c17412fEj, @NotNull InterfaceC17773fRt interfaceC17773fRt, CurrentWalletSelectMode currentWalletSelectMode, CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, @NotNull java.util.List<? extends UnsupportedWalletType> list) {
        Intrinsics.checkNotNullParameter(c17412fEj, "");
        Intrinsics.checkNotNullParameter(interfaceC17773fRt, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = c17412fEj;
        this.valueOf = interfaceC17773fRt;
        this.OLrzqt = currentWalletSelectMode;
        this.copydefault = currentWalletSwitchNetworkMode;
        this.KWHzl = function2;
        this.EZpvd = list;
        this.AEQbTJ = fRA.OLrzqt.OLrzqt(currentWalletSwitchNetworkMode);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:o.fEj:0x000a: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fEj:0x0006: INVOKE (wrap:o.fRA:0x0004: SGET  A[WRAPPED] (LINE:27) o.fRA.OLrzqt o.fRA) VIRTUAL call: o.fRA.EZpvd():o.fEj A[MD:():o.fEj (m), WRAPPED] (LINE:27)) : (r8v0 o.fEj))
  (wrap:o.fRt:0x0015: TERNARY null = ((wrap:int:0x000b: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fRt:0x0011: INVOKE (wrap:o.fRx$StateListAnimator:0x000f: SGET  A[WRAPPED] (LINE:28) o.fRx.Companion o.fRx$StateListAnimator) VIRTUAL call: o.fRx.StateListAnimator.KWHzl():o.fRt A[MD:():o.fRt (m), WRAPPED] (LINE:28)) : (r9v0 o.fRt))
  (r10v0 com.okinc.wallet.api.bean.CurrentWalletSelectMode)
  (r11v0 com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode)
  (wrap:kotlin.jvm.functions.Function2:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r12v0 kotlin.jvm.functions.Function2))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:32)) : (r13v0 java.util.List))
 A[MD:(o.fEj, o.fRt, com.okinc.wallet.api.bean.CurrentWalletSelectMode, com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode, kotlin.jvm.functions.Function2<? super o.bbJ, ? super java.lang.Long, java.lang.Boolean>, java.util.List<? extends com.okinc.wallet.api.bean.UnsupportedWalletType>):void (m)] (LINE:26) call: o.fRW.<init>(o.fEj, o.fRt, com.okinc.wallet.api.bean.CurrentWalletSelectMode, com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode, kotlin.jvm.functions.Function2, java.util.List):void type: THIS */
    public /* synthetic */ fRW(C17412fEj c17412fEj, InterfaceC17773fRt interfaceC17773fRt, CurrentWalletSelectMode currentWalletSelectMode, CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode, Function2 function2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? fRA.OLrzqt.EZpvd() : c17412fEj, (i & 2) != 0 ? C17777fRx.Companion.KWHzl() : interfaceC17773fRt, currentWalletSelectMode, currentWalletSwitchNetworkMode, (i & 16) != 0 ? null : function2, (i & 32) != 0 ? yDY.AhwBna() : list);
    }

    @Override // o.InterfaceC17404fEb
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super java.util.List<fDU>> continuation) {
        return copydefault(z, continuation);
    }

    public final java.lang.Object copydefault(boolean z, Continuation<? super java.util.List<fDU>> continuation) {
        return CoroutineScopeKt.coroutineScope(new SwitchWalletSearchResultsUseCase$getFilteredWallets$2(this, z, null), continuation);
    }
}
