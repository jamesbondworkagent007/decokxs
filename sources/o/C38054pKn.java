package o;

/* JADX INFO: renamed from: o.pKn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C38054pKn {
    public static C38054pKn AEQbTJ;
    public C38045pKe KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C38045pKe OLrzqt() {
        return this.KWHzl;
    }

    public static C38054pKn KWHzl() {
        C38054pKn c38054pKn;
        synchronized (C38054pKn.class) {
            if (AEQbTJ == null) {
                AEQbTJ = new C38054pKn();
            }
            c38054pKn = AEQbTJ;
        }
        return c38054pKn;
    }

    public void EZpvd(android.view.MotionEvent motionEvent) {
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C38045pKe c38045pKe = new C38045pKe();
            this.KWHzl = c38045pKe;
            c38045pKe.OLrzqt(motionEvent);
            return;
        }
        C38045pKe c38045pKe2 = this.KWHzl;
        if (c38045pKe2 == null || c38045pKe2.AhwBna != pointerId || actionMasked == 2) {
            return;
        }
        if (actionMasked == 1) {
            c38045pKe2.KWHzl(motionEvent);
        } else if (actionMasked == 3) {
            this.KWHzl = null;
        }
    }
}
