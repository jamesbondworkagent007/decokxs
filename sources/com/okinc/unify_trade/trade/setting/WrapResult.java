package com.okinc.unify_trade.trade.setting;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class WrapResult {
    public static final int $stable = 8;
    private Throwable error;
    private boolean result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WrapResult() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WrapResult copy$default(WrapResult wrapResult, boolean z, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wrapResult.result;
        }
        if ((i & 2) != 0) {
            th = wrapResult.error;
        }
        return wrapResult.copy(z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable component2() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WrapResult copy(boolean z, Throwable th) {
        return new WrapResult(z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrapResult)) {
            return false;
        }
        WrapResult wrapResult = (WrapResult) obj;
        return this.result == wrapResult.result && Intrinsics.EZpvd(this.error, wrapResult.error);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getResult() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.result);
        Throwable th = this.error;
        return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError(Throwable th) {
        this.error = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResult(boolean z) {
        this.result = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WrapResult(result=" + this.result + ", error=" + this.error + ")";
    }

    public WrapResult(boolean z, Throwable th) {
        this.result = z;
        this.error = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(boolean, java.lang.Throwable):void (m)] (LINE:14) call: com.okinc.unify_trade.trade.setting.WrapResult.<init>(boolean, java.lang.Throwable):void type: THIS */
    public /* synthetic */ WrapResult(boolean z, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : th);
    }
}
