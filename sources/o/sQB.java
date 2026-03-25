package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQB {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final OKMessage AEQbTJ;
    public final int EZpvd;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ sQB copy$default(sQB sqb, int i, OKMessage oKMessage, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = sqb.OLrzqt;
        }
        if ((i3 & 2) != 0) {
            oKMessage = sqb.AEQbTJ;
        }
        if ((i3 & 4) != 0) {
            i2 = sqb.EZpvd;
        }
        return sqb.KWHzl(i, oKMessage, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sQB KWHzl(int i, @NotNull OKMessage oKMessage, int i2) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return new sQB(i, oKMessage, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sQB)) {
            return false;
        }
        sQB sqb = (sQB) obj;
        return this.OLrzqt == sqb.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, sqb.AEQbTJ) && this.EZpvd == sqb.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SendMediaEvent(event=" + this.OLrzqt + ", message=" + this.AEQbTJ + ", progress=" + this.EZpvd + ")";
    }

    public sQB(int i, @NotNull OKMessage oKMessage, int i2) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.OLrzqt = i;
        this.AEQbTJ = oKMessage;
        this.EZpvd = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 com.okinc.okimcore.model.im.OKMessage)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(int, com.okinc.okimcore.model.im.OKMessage, int):void (m)] (LINE:81) call: o.sQB.<init>(int, com.okinc.okimcore.model.im.OKMessage, int):void type: THIS */
    public /* synthetic */ sQB(int i, OKMessage oKMessage, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, oKMessage, (i3 & 4) != 0 ? 0 : i2);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sQB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
