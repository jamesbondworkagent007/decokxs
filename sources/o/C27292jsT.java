package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27286jsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27292jsT extends AbstractC27470jvm {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 kotlin.jvm.functions.Function1)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r2v0 kotlin.jvm.functions.Function0))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(kotlin.jvm.functions.Function1<? super o.jtx, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean):void (m)] (LINE:21) call: o.jsT.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean):void type: THIS */
    public /* synthetic */ C27292jsT(Function1 function1, Function0 function0, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? true : z);
    }

    public C27292jsT(@NotNull Function1<? super C27375jtx, Unit> function1, final Function0<Unit> function0, boolean z) {
        Intrinsics.checkNotNullParameter(function1, "");
        register(C27375jtx.class, new C27362jtk(function1));
        if (z) {
            register(C27326jtA.class, new C27366jto());
            register(C27328jtC.class, new C27330jtE(new InterfaceC27287jsO() { // from class: o.jsT.5
                @Override // o.InterfaceC27287jsO
                public void OLrzqt(InterfaceC27286jsN interfaceC27286jsN) {
                    Function0<Unit> function02;
                    Intrinsics.checkNotNullParameter(interfaceC27286jsN, "");
                    if (!(interfaceC27286jsN instanceof InterfaceC27286jsN.Activity) || (function02 = function0) == null) {
                        return;
                    }
                    function02.invoke();
                }
            }));
        }
    }
}
