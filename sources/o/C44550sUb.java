package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sUb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44550sUb {
    public final sUC KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C44550sUb() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44550sUb copy$default(C44550sUb c44550sUb, sUC suc, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            suc = c44550sUb.KWHzl;
        }
        return c44550sUb.KWHzl(suc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sUC EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44550sUb KWHzl(sUC suc) {
        return new C44550sUb(suc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44550sUb) && Intrinsics.EZpvd(this.KWHzl, ((C44550sUb) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        sUC suc = this.KWHzl;
        if (suc == null) {
            return 0;
        }
        return suc.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingCardUiState(cardData=" + this.KWHzl + ")";
    }

    public C44550sUb(sUC suc) {
        this.KWHzl = suc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.sUC:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.sUC) : (r1v0 o.sUC))
 A[MD:(o.sUC):void (m)] (LINE:22) call: o.sUb.<init>(o.sUC):void type: THIS */
    public /* synthetic */ C44550sUb(sUC suc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : suc);
    }
}
