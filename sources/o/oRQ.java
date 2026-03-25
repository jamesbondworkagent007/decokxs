package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class oRQ extends AbstractC49408unw<oRQ> {
    public oLZ AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public oRQ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ oRQ copy$default(oRQ orq, oLZ olz, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            olz = orq.AEQbTJ;
        }
        return orq.AEQbTJ(olz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oRQ AEQbTJ(oLZ olz) {
        return new oRQ(olz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oRQ) && Intrinsics.EZpvd(this.AEQbTJ, ((oRQ) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        oLZ olz = this.AEQbTJ;
        if (olz == null) {
            return 0;
        }
        return olz.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineIndicatorUiState(supportResistanceVo=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.oLZ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.oLZ) : (r1v0 o.oLZ))
 A[MD:(o.oLZ):void (m)] (LINE:40) call: o.oRQ.<init>(o.oLZ):void type: THIS */
    public /* synthetic */ oRQ(oLZ olz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : olz);
    }

    public oRQ(oLZ olz) {
        super(new Function1() { // from class: o.oRY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oRQ.KWHzl((oRQ) obj);
            }
        });
        this.AEQbTJ = olz;
    }

    public static final oRQ KWHzl(oRQ orq) {
        Intrinsics.checkNotNullParameter(orq, "");
        return copy$default(orq, null, 1, null);
    }
}
