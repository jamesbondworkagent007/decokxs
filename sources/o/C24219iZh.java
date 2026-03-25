package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24219iZh extends AbstractC27470jvm {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C24219iZh() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:15) call: o.iZn.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0009: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:16) call: o.iZo.<init>():void type: CONSTRUCTOR) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:o.jsO:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.jsO) : (r4v0 o.jsO))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0018: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function1<? super o.iZw, kotlin.Unit>, kotlin.jvm.functions.Function1<? super o.iZz, kotlin.Unit>, o.jsO, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:14) call: o.iZh.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.jsO, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C24219iZh(Function1 function1, Function1 function12, InterfaceC27287jsO interfaceC27287jsO, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: o.iZn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24219iZh.copydefault((C24234iZw) obj);
            }
        } : function1, (i & 2) != 0 ? new Function1() { // from class: o.iZo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24219iZh.OLrzqt((C24237iZz) obj);
            }
        } : function12, (i & 4) != 0 ? null : interfaceC27287jsO, (i & 8) != 0 ? null : function0);
    }

    public static final Unit copydefault(C24234iZw c24234iZw) {
        Intrinsics.checkNotNullParameter(c24234iZw, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C24237iZz c24237iZz) {
        Intrinsics.checkNotNullParameter(c24237iZz, "");
        return Unit.INSTANCE;
    }

    public C24219iZh(@NotNull Function1<? super C24234iZw, Unit> function1, @NotNull Function1<? super C24237iZz, Unit> function12, InterfaceC27287jsO interfaceC27287jsO, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        register(C24234iZw.class, new C24233iZv(function1, interfaceC27287jsO, function0));
        register(C24237iZz.class, new iZB(function12, interfaceC27287jsO, function0));
    }
}
