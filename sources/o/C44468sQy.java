package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44468sQy {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final int AEQbTJ;
    public final OKMessage OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44468sQy copy$default(C44468sQy c44468sQy, int i, OKMessage oKMessage, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c44468sQy.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            oKMessage = c44468sQy.OLrzqt;
        }
        return c44468sQy.AEQbTJ(i, oKMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44468sQy AEQbTJ(int i, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return new C44468sQy(i, oKMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44468sQy)) {
            return false;
        }
        C44468sQy c44468sQy = (C44468sQy) obj;
        return this.AEQbTJ == c44468sQy.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, c44468sQy.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SendEvent(event=" + this.AEQbTJ + ", message=" + this.OLrzqt + ")";
    }

    public C44468sQy(int i, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.AEQbTJ = i;
        this.OLrzqt = oKMessage;
    }

    /* JADX INFO: renamed from: o.sQy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sQy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
