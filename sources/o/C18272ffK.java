package o;

import com.okinc.business.defi.wallet.home.viewmodel.SupportDexMarketViewModel$isSupportDexMarket$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ffK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18272ffK extends AbstractC33073mpa {
    public final IS<java.lang.String> KWHzl;
    public final C13934dbu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18272ffK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x000b: INVOKE 
  (wrap:o.dKx:0x0007: INVOKE 
  (wrap:o.dKx$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:11) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:11))
 INTERFACE call: o.dKx.DTwDnp():o.dbu A[MD:():o.dbu (m), WRAPPED] (LINE:11)) : (r1v0 o.dbu))
 A[MD:(o.dbu):void (m)] (LINE:10) call: o.ffK.<init>(o.dbu):void type: THIS */
    public /* synthetic */ C18272ffK(C13934dbu c13934dbu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp() : c13934dbu);
    }

    public C18272ffK(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.copydefault = c13934dbu;
        this.KWHzl = new IS<>();
    }

    public final java.lang.Object OLrzqt(long j, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SupportDexMarketViewModel$isSupportDexMarket$2(this, j, null), continuation);
    }
}
