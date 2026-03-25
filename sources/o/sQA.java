package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQA {
    public final OKMessage KWHzl;
    public final java.lang.Integer OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ sQA copy$default(sQA sqa, OKMessage oKMessage, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKMessage = sqa.KWHzl;
        }
        if ((i & 2) != 0) {
            num = sqa.OLrzqt;
        }
        return sqa.AEQbTJ(oKMessage, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sQA AEQbTJ(@NotNull OKMessage oKMessage, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return new sQA(oKMessage, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sQA)) {
            return false;
        }
        sQA sqa = (sQA) obj;
        return Intrinsics.EZpvd(this.KWHzl, sqa.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, sqa.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.Integer num = this.OLrzqt;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RefreshEvent(message=" + this.KWHzl + ", scenario=" + this.OLrzqt + ")";
    }

    public sQA(@NotNull OKMessage oKMessage, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.KWHzl = oKMessage;
        this.OLrzqt = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.okimcore.model.im.OKMessage)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
 A[MD:(com.okinc.okimcore.model.im.OKMessage, java.lang.Integer):void (m)] (LINE:24) call: o.sQA.<init>(com.okinc.okimcore.model.im.OKMessage, java.lang.Integer):void type: THIS */
    public /* synthetic */ sQA(OKMessage oKMessage, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oKMessage, (i & 2) != 0 ? null : num);
    }
}
