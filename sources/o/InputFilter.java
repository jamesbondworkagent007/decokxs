package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ParcelableSpan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class InputFilter implements InterfaceC52778wY {
    public final HL AEQbTJ;
    public final InterfaceC3972Aw KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputFilter() {
        this(null, null, null, 7, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public InputFilter(@NotNull HL hl, InterfaceC3972Aw interfaceC3972Aw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(hl, "");
        this.AEQbTJ = hl;
        this.KWHzl = interfaceC3972Aw;
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:o.HL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HL:0x0006: INVOKE (wrap:o.HL$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:89) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:89)) : (r2v0 o.HL))
  (wrap:o.Aw:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.Aw) : (r3v0 o.Aw))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(o.HL, o.Aw, java.lang.String):void (m)] (LINE:88) call: o.InputFilter.<init>(o.HL, o.Aw, java.lang.String):void type: THIS */
    public /* synthetic */ InputFilter(HL hl, InterfaceC3972Aw interfaceC3972Aw, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HL.OLrzqt.copydefault() : hl, (i & 2) != 0 ? null : interfaceC3972Aw, (i & 4) != 0 ? null : str);
    }

    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) {
        return ParcelableSpan.Application.m8551fromEnvironmentTUYock$default(ParcelableSpan.copydefault, null, null, this.OLrzqt, null, 0L, this.AEQbTJ, this.KWHzl, 27, null).resolve(interfaceC57843yq, continuation);
    }
}
