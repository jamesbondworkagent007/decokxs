package o;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: o.myp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33565myp {
    public static C33565myp OLrzqt;
    public Application EZpvd;
    public ViewTreeObserver.OnGlobalLayoutListener KWHzl = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.myp.5
        public int KWHzl = -1;

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (C33565myp.this.copydefault != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                C33565myp.this.copydefault.getWindowVisibleDisplayFrame(rect);
                int i = rect.bottom;
                int height = C33565myp.this.copydefault.getHeight();
                int i2 = height - i;
                if (this.KWHzl != i2 && C33565myp.this.EZpvd != null) {
                    C33565myp.this.EZpvd.EZpvd(i2, ((double) i) / ((double) height) < 0.8d);
                }
                this.KWHzl = height;
            }
        }
    };
    public android.view.View copydefault;

    /* JADX INFO: renamed from: o.myp$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public interface Application {
        void EZpvd(int i, boolean z);
    }

    public static C33565myp EZpvd() {
        if (OLrzqt == null) {
            OLrzqt = new C33565myp();
        }
        return OLrzqt;
    }

    public void copydefault(android.app.Activity activity, Application application) {
        this.EZpvd = application;
        android.view.View decorView = activity.getWindow().getDecorView();
        this.copydefault = decorView;
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.KWHzl);
    }

    public void OLrzqt() {
        android.view.View view = this.copydefault;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.KWHzl);
            this.copydefault = null;
        }
        this.EZpvd = null;
    }

    public boolean KWHzl(android.app.Activity activity) {
        int height = activity.getWindow().getDecorView().getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return (height * 2) / 3 > rect.bottom;
    }
}
