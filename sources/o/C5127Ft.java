package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5127Ft extends EY implements InterfaceC5096Eo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5127Ft(@NotNull java.lang.String str, java.lang.String str2) {
        super(str, str2);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:107) call: o.Ft.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C5127Ft(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
