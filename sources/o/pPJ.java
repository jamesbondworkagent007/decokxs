package o;

import o.mMP;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pPJ extends AbstractC43215rlA implements mMP {
    public final int EZpvd = 2;
    public final int AEQbTJ = 221;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "Lifecycle Debugger";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @yCM
    public pPJ() {
    }

    @Override // o.mMP
    public boolean onClick() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return true;
        }
        activityAEQbTJ.startActivity(new android.content.Intent(activityAEQbTJ, (java.lang.Class<?>) pPE.class));
        return true;
    }
}
