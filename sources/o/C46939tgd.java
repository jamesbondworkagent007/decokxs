package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import o.mMP;

/* JADX INFO: renamed from: o.tgd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46939tgd extends AbstractC43215rlA implements mMP {
    public final int AEQbTJ = 2;
    public final int EZpvd = 211;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.EZpvd;
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    public final int AEQbTJ() {
        java.lang.Integer num = SPUtils.getInt("force_push_channel", 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    @Override // o.mMP
    public java.lang.String name() {
        int iAEQbTJ = AEQbTJ();
        return "Switch Push Channel: " + (iAEQbTJ != 1 ? iAEQbTJ != 2 ? "Default" : "JPUSH" : "ONE SIGNAL");
    }

    @Override // o.mMP
    public boolean onClick() {
        SPUtils.put("force_push_channel", java.lang.Integer.valueOf((AEQbTJ() + 1) % 3));
        C55326xho.toast$default(name() + " after restart", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return true;
    }
}
