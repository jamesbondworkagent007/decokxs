package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yZZ extends yZX {
    public final InterfaceC59182zcH<InterfaceC59098zad> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yZZ(@NotNull Function0<? extends InterfaceC59098zad> function0) {
        this(null, function0, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(function0, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:o.zcM:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.zcM:0x0004: SGET  A[WRAPPED] (LINE:23) kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KWHzl o.zcM) : (r1v0 o.zcM))
  (r2v0 kotlin.jvm.functions.Function0)
 A[MD:(o.zcM, kotlin.jvm.functions.Function0<? extends o.zad>):void (m)] (LINE:22) call: o.yZZ.<init>(o.zcM, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ yZZ(InterfaceC59187zcM interfaceC59187zcM, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LockBasedStorageManager.KWHzl : interfaceC59187zcM, function0);
    }

    public yZZ(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull Function0<? extends InterfaceC59098zad> function0) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = interfaceC59187zcM.KWHzl(new C59097zac(function0));
    }

    public static final InterfaceC59098zad AEQbTJ(Function0 function0) {
        InterfaceC59098zad interfaceC59098zad = (InterfaceC59098zad) function0.invoke();
        return interfaceC59098zad instanceof yZX ? ((yZX) interfaceC59098zad).OLrzqt() : interfaceC59098zad;
    }

    @Override // o.yZX
    public InterfaceC59098zad KWHzl() {
        return this.EZpvd.invoke();
    }
}
