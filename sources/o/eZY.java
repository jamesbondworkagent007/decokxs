package o;

import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.wallet.home.analytics.WalletHomeAnalyticsImpl$trackBalanceEvent$2;
import com.okinc.business.defi.wallet.home.analytics.WalletHomeAnalyticsImpl$trackDefiHubShow$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.C14557dnh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eZY implements eZZ {
    public final CoroutineDispatcher EZpvd;
    public final ReferralManager OLrzqt;
    public final InterfaceC14563dnn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public eZY() {
        this(null, null, null, 7, null);
    }

    public eZY(@NotNull InterfaceC14563dnn interfaceC14563dnn, @NotNull ReferralManager referralManager, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC14563dnn, "");
        Intrinsics.checkNotNullParameter(referralManager, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC14563dnn;
        this.OLrzqt = referralManager;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:o.dnn:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dnn:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:37) call: o.dnp.<init>():void type: CONSTRUCTOR) : (r2v0 o.dnn))
  (wrap:com.okinc.business.defi.common.utils.ReferralManager:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.common.utils.ReferralManager:0x0011: INVOKE 
  (wrap:com.okinc.business.defi.common.utils.ReferralManager$StateListAnimator:0x000d: SGET  A[WRAPPED] (LINE:38) com.okinc.business.defi.common.utils.ReferralManager.Companion com.okinc.business.defi.common.utils.ReferralManager$StateListAnimator)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: com.okinc.business.defi.common.utils.ReferralManager.StateListAnimator.getInstance$default(com.okinc.business.defi.common.utils.ReferralManager$StateListAnimator, android.content.Context, int, java.lang.Object):com.okinc.business.defi.common.utils.ReferralManager A[MD:(com.okinc.business.defi.common.utils.ReferralManager$StateListAnimator, android.content.Context, int, java.lang.Object):com.okinc.business.defi.common.utils.ReferralManager (m), WRAPPED] (LINE:38)) : (r3v0 com.okinc.business.defi.common.utils.ReferralManager))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0015: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0019: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:39)) : (r4v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(o.dnn, com.okinc.business.defi.common.utils.ReferralManager, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:36) call: o.eZY.<init>(o.dnn, com.okinc.business.defi.common.utils.ReferralManager, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ eZY(InterfaceC14563dnn interfaceC14563dnn, ReferralManager referralManager, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C14565dnp() : interfaceC14563dnn, (i & 2) != 0 ? ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null) : referralManager, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // o.eZZ
    public java.lang.Object AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new WalletHomeAnalyticsImpl$trackBalanceEvent$2(this, abstractC12782ctV, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.eZZ
    public java.lang.Object copydefault(@NotNull java.util.List<? extends AbstractC12782ctV> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new WalletHomeAnalyticsImpl$trackDefiHubShow$2(this, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.eZZ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.KWHzl(C14564dno.EZpvd(C14557dnh.StateListAnimator.copydefault, str));
    }
}
