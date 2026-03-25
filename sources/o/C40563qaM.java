package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.qaM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40563qaM extends C40512qYp {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C40563qaM() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:31) call: o.qaM.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C40563qaM(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    public C40563qaM(final Function0<Unit> function0) {
        register(C27622jyf.class, new kJB(new Function1() { // from class: o.qaL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40563qaM.EZpvd(function0, (android.view.View) obj);
            }
        }));
        register(C41646quj.class, new C40559qaI());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
