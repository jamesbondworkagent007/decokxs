package o;

import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17216eyc;
import o.mMP;

/* JADX INFO: renamed from: o.eyd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17217eyd extends AbstractC43215rlA implements mMP {
    public final int OLrzqt = 1;
    public final int KWHzl = 210;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "钱包工具 (Wallet tools)";
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
        ActivityC17216eyc.Activity activity = ActivityC17216eyc.Companion;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        activity.EZpvd(activityAEQbTJ);
        return true;
    }
}
