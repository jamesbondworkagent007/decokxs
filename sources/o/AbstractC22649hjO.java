package o;

import androidx.work.WorkRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hjO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22649hjO<T> {
    public InterfaceC58217yxC EZpvd;
    public boolean KWHzl;
    public C23227huJ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC22649hjO() {
        this(0L, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23227huJ KWHzl() {
        return this.copydefault;
    }

    public abstract void KWHzl(@NotNull InterfaceC58184ywW<T> interfaceC58184ywW, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC58217yxC interfaceC58217yxC) {
        this.EZpvd = interfaceC58217yxC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    public AbstractC22649hjO(long j) {
        this.copydefault = new C23227huJ(j, 3);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: SGET  A[WRAPPED] androidx.work.WorkRequest.MIN_BACKOFF_MILLIS long) : (r1v0 long))
 A[MD:(long):void (m)] (LINE:10) call: o.hjO.<init>(long):void type: THIS */
    public /* synthetic */ AbstractC22649hjO(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WorkRequest.MIN_BACKOFF_MILLIS : j);
    }

    public final void EZpvd() {
        OLrzqt();
        this.copydefault.EZpvd();
    }

    public final void OLrzqt() {
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.EZpvd = null;
        this.copydefault.KWHzl();
    }

    public final void copydefault(@NotNull final InterfaceC58184ywW<T> interfaceC58184ywW, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault.AEQbTJ(new Function0() { // from class: o.hjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC22649hjO.AEQbTJ(this.KWHzl, interfaceC58184ywW, function1);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC22649hjO abstractC22649hjO, InterfaceC58184ywW interfaceC58184ywW, Function1 function1) {
        abstractC22649hjO.KWHzl = false;
        abstractC22649hjO.KWHzl(interfaceC58184ywW, function1);
        return Unit.INSTANCE;
    }
}
