package o;

import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;

/* JADX INFO: renamed from: o.ynp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57726ynp extends android.widget.RelativeLayout {
    public ViewDragHelper AEQbTJ;
    public StateListAnimator EZpvd;
    public boolean copydefault;
    public Application gEmmrt;
    public static final int OLrzqt = C57823ypg.copydefault(28);
    public static final int KWHzl = C57823ypg.copydefault(64);

    /* JADX INFO: renamed from: o.ynp$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ();

        void OLrzqt();

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setListener(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator;
    }

    /* JADX INFO: renamed from: o.ynp$Application */
    public static class Application {
        public int AEQbTJ;
        public int AYXKKw;
        public int AhwBna;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public boolean copydefault;
        public int djBIcL;
        public int gEmmrt;
        public int valueOf;
        public int values;
    }

    public C57726ynp(android.content.Context context) {
        super(context);
        setClipChildren(false);
        KWHzl();
    }

    public void setParams(Application application) {
        this.gEmmrt = application;
        application.valueOf = application.gEmmrt + application.values + ((android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels - application.gEmmrt) - application.values) + KWHzl;
        application.AEQbTJ = C57823ypg.copydefault(3000);
        if (application.KWHzl == 0) {
            application.valueOf = (-application.gEmmrt) - OLrzqt;
            application.AEQbTJ = -application.AEQbTJ;
            application.EZpvd = application.valueOf / 3;
            return;
        }
        application.EZpvd = (application.gEmmrt / 3) + (application.djBIcL * 2);
    }

    public final void KWHzl() {
        this.AEQbTJ = ViewDragHelper.create(this, 1.0f, new ViewDragHelper.Callback() { // from class: o.ynp.2
            public int OLrzqt;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@androidx.annotation.NonNull android.view.View view, int i) {
                return true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@androidx.annotation.NonNull android.view.View view, int i, int i2) {
                if (C57726ynp.this.gEmmrt.copydefault) {
                    return C57726ynp.this.gEmmrt.djBIcL;
                }
                this.OLrzqt = i;
                if (C57726ynp.this.gEmmrt.KWHzl == 1) {
                    if (i >= C57726ynp.this.gEmmrt.OLrzqt && C57726ynp.this.EZpvd != null) {
                        C57726ynp.this.EZpvd.copydefault();
                    }
                    if (i < C57726ynp.this.gEmmrt.djBIcL) {
                        return C57726ynp.this.gEmmrt.djBIcL;
                    }
                } else {
                    if (i <= C57726ynp.this.gEmmrt.OLrzqt && C57726ynp.this.EZpvd != null) {
                        C57726ynp.this.EZpvd.copydefault();
                    }
                    if (i > C57726ynp.this.gEmmrt.djBIcL) {
                        return C57726ynp.this.gEmmrt.djBIcL;
                    }
                }
                return i;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@androidx.annotation.NonNull android.view.View view, int i, int i2) {
                return C57726ynp.this.gEmmrt.AhwBna;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@androidx.annotation.NonNull android.view.View view, float f, float f2) {
                int i = C57726ynp.this.gEmmrt.djBIcL;
                if (!C57726ynp.this.copydefault) {
                    if (C57726ynp.this.gEmmrt.KWHzl == 1) {
                        if (this.OLrzqt > C57726ynp.this.gEmmrt.EZpvd || f2 > C57726ynp.this.gEmmrt.AEQbTJ) {
                            i = C57726ynp.this.gEmmrt.valueOf;
                            C57726ynp.this.copydefault = true;
                            if (C57726ynp.this.EZpvd != null) {
                                C57726ynp.this.EZpvd.OLrzqt();
                            }
                        }
                    } else if (this.OLrzqt < C57726ynp.this.gEmmrt.EZpvd || f2 < C57726ynp.this.gEmmrt.AEQbTJ) {
                        i = C57726ynp.this.gEmmrt.valueOf;
                        C57726ynp.this.copydefault = true;
                        if (C57726ynp.this.EZpvd != null) {
                            C57726ynp.this.EZpvd.OLrzqt();
                        }
                    }
                }
                if (C57726ynp.this.AEQbTJ.settleCapturedViewAt(C57726ynp.this.gEmmrt.AhwBna, i)) {
                    ViewCompat.postInvalidateOnAnimation(C57726ynp.this);
                }
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        StateListAnimator stateListAnimator;
        if (this.copydefault) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (stateListAnimator = this.EZpvd) != null) {
            stateListAnimator.AEQbTJ();
        }
        this.AEQbTJ.processTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.AEQbTJ.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void OLrzqt() {
        this.copydefault = true;
        this.AEQbTJ.smoothSlideViewTo(this, getLeft(), this.gEmmrt.valueOf);
        ViewCompat.postInvalidateOnAnimation(this);
    }
}
