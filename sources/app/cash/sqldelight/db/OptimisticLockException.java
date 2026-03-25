package app.cash.sqldelight.db;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class OptimisticLockException extends IllegalStateException {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:3) call: app.cash.sqldelight.db.OptimisticLockException.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ OptimisticLockException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public OptimisticLockException(String str, Throwable th) {
        super(str, th);
    }
}
