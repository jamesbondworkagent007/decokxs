package o;

/* JADX INFO: renamed from: o.pKg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C38047pKg extends WindowCallbackC38041pKa {
    public android.view.Window KWHzl;

    public C38047pKg(android.view.Window window) {
        super(window.getCallback());
        this.KWHzl = window;
    }

    @Override // o.WindowCallbackC38041pKa
    public boolean KWHzl(android.view.MotionEvent motionEvent) {
        C38054pKn.KWHzl().EZpvd(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            try {
                C38045pKe c38045pKeOLrzqt = C38054pKn.KWHzl().OLrzqt();
                if (c38045pKeOLrzqt != null && c38045pKeOLrzqt.EZpvd) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    int[] iArr = {(int) c38045pKeOLrzqt.KWHzl, (int) c38045pKeOLrzqt.copydefault};
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.KWHzl.getDecorView();
                    if (!c38045pKeOLrzqt.EZpvd) {
                        iArr = null;
                    }
                    android.view.View viewKWHzl = C38051pKk.KWHzl(viewGroup, iArr);
                    if (viewKWHzl != null) {
                        pUU.KWHzl(C38043pKc.EZpvd, "WindowInfo:" + C38049pKi.copydefault(this.KWHzl) + "\nViewPath:" + C38049pKi.copydefault(viewKWHzl, c38045pKeOLrzqt).toString() + "\nViewId:" + C38049pKi.OLrzqt(viewKWHzl) + "\nViewContent:" + C38049pKi.EZpvd(viewKWHzl) + "\ncostTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault(C38043pKc.EZpvd, "error with OKMonitorWindowCallbacks.touchEvent:" + e.getMessage());
            }
        }
        return false;
    }

    @Override // o.WindowCallbackC38041pKa
    public boolean KWHzl() {
        pUU.KWHzl(C38043pKc.EZpvd, "dispatchBackKeyEvent");
        return false;
    }

    @Override // o.WindowCallbackC38041pKa, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.KWHzl.getAttributes().type == 2) {
            pUU.KWHzl(C38043pKc.EZpvd, "dialog onAttachedToWindow");
        }
    }

    @Override // o.WindowCallbackC38041pKa, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.KWHzl.getAttributes().type == 2) {
            pUU.KWHzl(C38043pKc.EZpvd, "dialog onDetachedFromWindow");
        }
    }
}
