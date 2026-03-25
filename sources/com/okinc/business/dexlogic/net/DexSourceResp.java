package com.okinc.business.dexlogic.net;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class DexSourceResp<T> {
    public static final int $stable = 8;
    private T data;
    private Throwable exp;
    private boolean isSuccess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexSourceResp() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable getExp() {
        return this.exp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(T t) {
        this.data = t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExp(Throwable th) {
        this.exp = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public DexSourceResp(boolean z, T t, Throwable th) {
        this.isSuccess = z;
        this.data = t;
        this.exp = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r4v0 java.lang.Throwable))
 A[MD:(boolean, T, java.lang.Throwable):void (m)] (LINE:6) call: com.okinc.business.dexlogic.net.DexSourceResp.<init>(boolean, java.lang.Object, java.lang.Throwable):void type: THIS */
    public /* synthetic */ DexSourceResp(boolean z, Object obj, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : th);
    }
}
