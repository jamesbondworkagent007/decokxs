package com.keystone.module;

import com.sparrowwallet.hummingbird.UR;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DecodeResult {
    private final int progress;
    private final UR ur;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DecodeResult copy$default(DecodeResult decodeResult, int i, UR ur, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = decodeResult.progress;
        }
        if ((i2 & 2) != 0) {
            ur = decodeResult.ur;
        }
        return decodeResult.copy(i, ur);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UR component2() {
        return this.ur;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DecodeResult copy(int i, UR ur) {
        return new DecodeResult(i, ur);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecodeResult)) {
            return false;
        }
        DecodeResult decodeResult = (DecodeResult) obj;
        return this.progress == decodeResult.progress && Intrinsics.EZpvd(this.ur, decodeResult.ur);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UR getUr() {
        return this.ur;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.progress);
        UR ur = this.ur;
        return (iHashCode * 31) + (ur == null ? 0 : ur.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DecodeResult(progress=" + this.progress + ", ur=" + this.ur + ')';
    }

    public DecodeResult(int i, UR ur) {
        this.progress = i;
        this.ur = ur;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:com.sparrowwallet.hummingbird.UR:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.sparrowwallet.hummingbird.UR) : (r2v0 com.sparrowwallet.hummingbird.UR))
 A[MD:(int, com.sparrowwallet.hummingbird.UR):void (m)] (LINE:5) call: com.keystone.module.DecodeResult.<init>(int, com.sparrowwallet.hummingbird.UR):void type: THIS */
    public /* synthetic */ DecodeResult(int i, UR ur, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : ur);
    }
}
