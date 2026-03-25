package o;

import com.okinc.uilab.stateful.StatefulView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32943mnC<T> extends AbstractC32992mnz<java.util.List<? extends T>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC32943mnC() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.uilab.stateful.StatefulView:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.uilab.stateful.StatefulView) : (r2v0 com.okinc.uilab.stateful.StatefulView))
  (wrap:o.mnM:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.mnM) : (r3v0 o.mnM))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(com.okinc.uilab.stateful.StatefulView, o.mnM, int):void (m)] (LINE:10) call: o.mnC.<init>(com.okinc.uilab.stateful.StatefulView, o.mnM, int):void type: THIS */
    public /* synthetic */ AbstractC32943mnC(StatefulView statefulView, InterfaceC32953mnM interfaceC32953mnM, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : statefulView, (i2 & 2) != 0 ? null : interfaceC32953mnM, (i2 & 4) != 0 ? 0 : i);
    }

    public AbstractC32943mnC(StatefulView statefulView, InterfaceC32953mnM interfaceC32953mnM, int i) {
        super(statefulView, interfaceC32953mnM, i);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
    @Override // o.AbstractC32992mnz
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.isEmpty();
    }
}
