package o;

import com.okinc.business.defi.wallet.imported.GetSupportedChainsForAddressUseCase$getSupportedChains$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.C13092czN;
import o.InterfaceC18379fhL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18373fhF {
    public final C13092czN AEQbTJ;
    public final C10948byA EZpvd;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18373fhF() {
        this(null, null, null, 7, null);
    }

    public C18373fhF(@NotNull C10948byA c10948byA, @NotNull C13092czN c13092czN, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c13092czN, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c10948byA;
        this.AEQbTJ = c13092czN;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x0006: INVOKE (wrap:o.byG:0x0004: SGET  A[WRAPPED] (LINE:14) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:14)) : (r2v0 o.byA))
  (wrap:o.czN:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.czN:0x0012: INVOKE 
  (wrap:o.czN$Activity:0x000e: SGET  A[WRAPPED] (LINE:15) o.czN.Companion o.czN$Activity)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.czN.Activity.getInstance$default(o.czN$Activity, android.content.Context, int, java.lang.Object):o.czN A[MD:(o.czN$Activity, android.content.Context, int, java.lang.Object):o.czN (m), WRAPPED] (LINE:15)) : (r3v0 o.czN))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0016: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x001a: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:16)) : (r4v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(o.byA, o.czN, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:13) call: o.fhF.<init>(o.byA, o.czN, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C18373fhF(C10948byA c10948byA, C13092czN c13092czN, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA, (i & 2) != 0 ? C13092czN.Activity.getInstance$default(C13092czN.Companion, null, 1, null) : c13092czN, (i & 4) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, boolean z2, @NotNull Continuation<? super java.util.List<InterfaceC18379fhL.Activity>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new GetSupportedChainsForAddressUseCase$getSupportedChains$2(str, z, str2, z2, this, null), continuation);
    }
}
