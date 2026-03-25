package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalSocketImpl implements MatchAllNetworkSpecifier {
    public final NetworkAgent KWHzl;
    public final java.util.List<InterfaceC52616wS> OLrzqt;
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC52616wS>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LocalSocketImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LocalSocketImpl(NetworkAgent networkAgent) {
        this.KWHzl = networkAgent;
        this.copydefault = C56424yEw.KWHzl();
        this.OLrzqt = C56402yEa.EZpvd(C3020Ae.sigV4$default(false, null, null, null, null, 31, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.NetworkAgent:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.NetworkAgent) : (r1v0 o.NetworkAgent))
 A[MD:(o.NetworkAgent):void (m)] (LINE:9) call: o.LocalSocketImpl.<init>(o.NetworkAgent):void type: THIS */
    public /* synthetic */ LocalSocketImpl(NetworkAgent networkAgent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : networkAgent);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC52724wW
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull LocalSocketAddress localSocketAddress, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        java.util.List<InterfaceC52616wS> list = this.copydefault.get(localSocketAddress.KWHzl());
        if (list == null) {
            list = this.OLrzqt;
        }
        return list;
    }
}
