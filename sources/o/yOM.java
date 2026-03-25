package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yOM implements yOJ {
    public final C56933yXs AEQbTJ;
    public final AbstractC56640yMw EZpvd;
    public final java.util.Map<C56935yXu, AbstractC56975yZg<?>> KWHzl;
    public final boolean OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOJ
    public C56933yXs KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOJ
    public java.util.Map<C56935yXu, AbstractC56975yZg<?>> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<o.yXu, ? extends o.yZg<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public yOM(@NotNull AbstractC56640yMw abstractC56640yMw, @NotNull C56933yXs c56933yXs, @NotNull java.util.Map<C56935yXu, ? extends AbstractC56975yZg<?>> map, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = abstractC56640yMw;
        this.AEQbTJ = c56933yXs;
        this.KWHzl = map;
        this.OLrzqt = z;
        this.copydefault = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new yON(this));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.yMw)
  (r2v0 o.yXs)
  (r3v0 java.util.Map)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(o.yMw, o.yXs, java.util.Map<o.yXu, ? extends o.yZg<?>>, boolean):void (m)] (LINE:27) call: o.yOM.<init>(o.yMw, o.yXs, java.util.Map, boolean):void type: THIS */
    public /* synthetic */ yOM(AbstractC56640yMw abstractC56640yMw, C56933yXs c56933yXs, java.util.Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC56640yMw, c56933yXs, map, (i & 8) != 0 ? false : z);
    }

    @Override // o.yOJ
    public AbstractC59233zdF AEQbTJ() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AbstractC59233zdF) value;
    }

    public static final AbstractC59242zdO OLrzqt(yOM yom) {
        return yom.EZpvd.OLrzqt(yom.KWHzl()).bQ_();
    }

    @Override // o.yOJ
    public InterfaceC56686yOo EZpvd() {
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
        return interfaceC56686yOo;
    }
}
