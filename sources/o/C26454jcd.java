package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26454jcd extends C43316rmw {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 kotlin.jvm.functions.Function0)
  (r2v0 kotlin.jvm.functions.Function1)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(kotlin.jvm.functions.Function0<? extends android.app.Activity>, kotlin.jvm.functions.Function1<? super o.jdw, kotlin.Unit>, java.lang.Integer):void (m)] (LINE:20) call: o.jcd.<init>(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, java.lang.Integer):void type: THIS */
    public /* synthetic */ C26454jcd(Function0 function0, Function1 function1, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function1, (i & 4) != 0 ? null : num);
    }

    public C26454jcd(@NotNull Function0<? extends android.app.Activity> function0, @NotNull Function1<? super C26526jdw, Unit> function1, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        register(C26526jdw.class, new C26395jbX(function0, function1, num));
        register(C26522jds.class, new C26510jdg(function0, function1));
        register(C26523jdt.class, new C26509jdf(function0, function1));
    }
}
