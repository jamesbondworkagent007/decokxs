package o;

import com.google.common.net.HttpHeaders;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Bundle implements BH<Unit> {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Bundle() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Bundle(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:225) call: o.Bundle.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ Bundle(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/DT;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.BH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull DT dt, @NotNull Unit unit, @NotNull Continuation<? super C5036Cg> continuation) {
        C5036Cg c5036Cg = new C5036Cg();
        c5036Cg.djBIcL().AYXKKw();
        C5034Ce.EZpvd(c5036Cg, HttpHeaders.ACCEPT, "application/json");
        C5034Ce.EZpvd(c5036Cg, HttpHeaders.ACCEPT_ENCODING, "identity");
        java.lang.String str = this.EZpvd;
        if (str != null) {
            C5034Ce.EZpvd(c5036Cg, "Authorization", str);
        }
        return c5036Cg;
    }
}
