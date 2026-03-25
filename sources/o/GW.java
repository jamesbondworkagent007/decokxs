package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class GW extends AbstractC56429yFa {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final GU OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GW copy$default(GW gw, GU gu, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            gu = gw.OLrzqt;
        }
        return gw.copydefault(gu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GU copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GW copydefault(@NotNull GU gu) {
        Intrinsics.checkNotNullParameter(gu, "");
        return new GW(gu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GW) && Intrinsics.EZpvd(this.OLrzqt, ((GW) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public static final class StateListAnimator implements CoroutineContext.TaskDescription<GW> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.GW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GW(@NotNull GU gu) {
        super(copydefault);
        Intrinsics.checkNotNullParameter(gu, "");
        this.OLrzqt = gu;
    }

    public java.lang.String toString() {
        return "TraceSpanContextElement(" + this.OLrzqt + ')';
    }
}
