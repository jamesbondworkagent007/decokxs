package o;

import kotlin.jvm.internal.Intrinsics;
import o.ActivityC38392pXb;
import o.mMP;

/* JADX INFO: renamed from: o.pXc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38393pXc extends AbstractC43215rlA implements mMP {
    public final int AEQbTJ = 1;
    public final int KWHzl = 220;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "💹 OKMarket Debugging";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return false;
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @Override // o.mMP
    public boolean onClick() {
        ActivityC38392pXb.Activity activity = ActivityC38392pXb.Companion;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        activity.KWHzl(activityAEQbTJ);
        return true;
    }
}
