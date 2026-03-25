package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xZA {
    public boolean AEQbTJ;
    public final AbstractC58185ywX<java.lang.Long> AhwBna;
    public final long EZpvd;
    public java.util.ArrayList<ActionBar> KWHzl;
    public final java.lang.String OLrzqt;
    public boolean copydefault;
    public final long djBIcL;
    public final AbstractC58253yxm gEmmrt;
    public InterfaceC58217yxC valueOf;

    public interface ActionBar {
        void KWHzl(@NotNull xZA xza);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.djBIcL > 0;
    }

    public xZA(long j, long j2, @NotNull AbstractC58253yxm abstractC58253yxm) {
        Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
        this.EZpvd = j;
        this.djBIcL = j2;
        this.gEmmrt = abstractC58253yxm;
        this.OLrzqt = "TimeIntervalHelper";
        this.KWHzl = new java.util.ArrayList<>();
        this.AhwBna = AbstractC58185ywX.KWHzl(j, j2, java.util.concurrent.TimeUnit.MILLISECONDS, abstractC58253yxm).copydefault(new InterfaceC58222yxH() { // from class: o.xZy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                xZA.OLrzqt(this.OLrzqt);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 long)
  (r9v0 long)
  (wrap:o.yxm:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yxm:0x0004: INVOKE  STATIC call: o.yxz.OLrzqt():o.yxm A[MD:():o.yxm (m), WRAPPED] (LINE:17)) : (r11v0 o.yxm))
 A[MD:(long, long, o.yxm):void (m)] (LINE:14) call: o.xZA.<init>(long, long, o.yxm):void type: THIS */
    public /* synthetic */ xZA(long j, long j2, AbstractC58253yxm abstractC58253yxm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? C58266yxz.OLrzqt() : abstractC58253yxm);
    }

    public static final void OLrzqt(xZA xza) {
        xza.AEQbTJ = false;
    }

    public final void EZpvd() {
        if (copydefault()) {
            this.AEQbTJ = true;
            AbstractC58185ywX<java.lang.Long> abstractC58185ywX = this.AhwBna;
            final Function1 function1 = new Function1() { // from class: o.xZz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xZA.OLrzqt(this.copydefault, (java.lang.Long) obj);
                }
            };
            this.valueOf = abstractC58185ywX.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xZC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    xZA.AEQbTJ(function1, obj);
                }
            });
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xZA xza, java.lang.Long l) {
        if (!xza.copydefault) {
            xza.AEQbTJ();
        } else {
            java.util.Iterator<T> it = xza.KWHzl.iterator();
            while (it.hasNext()) {
                ((ActionBar) it.next()).KWHzl(xza);
            }
            xza.copydefault = false;
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        if (copydefault()) {
            this.copydefault = false;
            InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
    }

    public final void AEQbTJ(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.KWHzl.add(actionBar);
    }

    public final void copydefault(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.KWHzl.remove(actionBar);
    }
}
