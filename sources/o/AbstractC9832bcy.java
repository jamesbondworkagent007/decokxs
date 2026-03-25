package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.bcy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9832bcy {
    public final int AYXKKw;
    public final boolean djBIcL;
    public final boolean gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 boolean), (r3v0 boolean) A[MD:(int, boolean, boolean):void (m)] call: o.bcy.<init>(int, boolean, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC9832bcy(int i, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, z2);
    }

    public abstract int AYXKKw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AYXKKw;
    }

    public AbstractC9832bcy(int i, boolean z, boolean z2) {
        this.AYXKKw = i;
        this.gEmmrt = z;
        this.djBIcL = z2;
    }
}
