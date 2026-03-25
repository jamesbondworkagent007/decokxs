package o;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.mMP;

/* JADX INFO: loaded from: classes10.dex */
public final class rBX extends AbstractC43215rlA implements mMP {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final int KWHzl = 1;
    public final int EZpvd = 211;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "OKCompliance okface test";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return false;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rBX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @Override // o.mMP
    public boolean onClick() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (!(activityAEQbTJ instanceof AppCompatActivity)) {
            return true;
        }
        ((AppCompatActivity) activityAEQbTJ).startActivity(new android.content.Intent(activityAEQbTJ, (java.lang.Class<?>) ActivityC41985rCb.class));
        return true;
    }
}
