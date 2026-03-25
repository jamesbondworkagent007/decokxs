package o;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.relex.circleindicator.BuildConfig;
import o.mMP;

/* JADX INFO: renamed from: o.rCg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C41990rCg extends AbstractC43215rlA implements mMP {
    public final int EZpvd = 1;
    public final int KWHzl = BuildConfig.VERSION_CODE;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "OKCompliance pdf test";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
    }

    /* JADX INFO: renamed from: o.rCg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rCg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
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
        ((AppCompatActivity) activityAEQbTJ).startActivity(new android.content.Intent(activityAEQbTJ, (java.lang.Class<?>) rBZ.class));
        return true;
    }
}
