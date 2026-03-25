package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C44227sI implements InterfaceC44281sK {
    public final InterfaceC44416sP EZpvd;
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC52616wS>> OLrzqt;
    public final java.util.List<InterfaceC52616wS> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C44227sI() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C44227sI(InterfaceC44416sP interfaceC44416sP) {
        this.EZpvd = interfaceC44416sP;
        this.OLrzqt = C56424yEw.KWHzl();
        this.copydefault = C56402yEa.EZpvd(C3020Ae.sigV4$default(false, null, null, null, null, 31, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.sP:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.sP) : (r1v0 o.sP))
 A[MD:(o.sP):void (m)] (LINE:9) call: o.sI.<init>(o.sP):void type: THIS */
    public /* synthetic */ C44227sI(InterfaceC44416sP interfaceC44416sP, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC44416sP);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC52724wW
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull C44335sM c44335sM, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        java.util.List<InterfaceC52616wS> list = this.OLrzqt.get(c44335sM.KWHzl());
        if (list == null) {
            list = this.copydefault;
        }
        return list;
    }
}
