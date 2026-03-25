package o;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import o.mMP;

/* JADX INFO: renamed from: o.rCp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C41999rCp extends AbstractC43215rlA implements mMP {
    public final int copydefault = 1;
    public final int EZpvd = 213;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "OKCompliance 模拟主体(Simulation Entity)";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
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
        C41988rCe c41988rCe = new C41988rCe();
        androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) activityAEQbTJ).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c41988rCe.show(supportFragmentManager);
        return true;
    }
}
