package o;

import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import o.mDC;

/* JADX INFO: renamed from: o.mIk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31909mIk extends android.view.ViewGroup {
    public float AEQbTJ;
    public final GestureDetector.OnGestureListener AYXKKw;
    public Application AhwBna;
    public volatile boolean AkhnZx;
    public volatile boolean AuCTel;
    public final android.graphics.Rect AuCTelauCTel;
    public final android.graphics.Rect AubY;
    public TaskDescription AxsJAY;
    public int DbNXlk;
    public ViewDragHelper EZpvd;
    public final ViewDragHelper.Callback KWHzl;
    public volatile boolean OLrzqt;
    public int copydefault;
    public int djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public android.view.View fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public boolean gEmmrt;
    public int gHZMYf;
    public int getFieldNames;
    public float getNewProxyInstance;
    public int hDKMBd;
    public boolean isConnected;
    public int iwGUEr;
    public android.view.View sSMYrx;
    public float uzCIH;
    public GestureDetectorCompat valueOf;
    public int values;
    public final android.graphics.Rect wlaJM;
    public final android.graphics.Rect zLjUOn;
    public final android.graphics.Rect zsXlph;
    public final android.graphics.Rect zuBGHE;

    /* JADX INFO: renamed from: o.mIk$Application */
    public interface Application {
        void copydefault(int i);
    }

    /* JADX INFO: renamed from: o.mIk$TaskDescription */
    public interface TaskDescription {
        void KWHzl(C31909mIk c31909mIk);

        void OLrzqt(C31909mIk c31909mIk);

        void copydefault(C31909mIk c31909mIk);

        void copydefault(C31909mIk c31909mIk, float f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDragStateChangeListener(Application application) {
        this.AhwBna = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEnableFullReveal(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFullRevealThreshold(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setHighFlingVelocity(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIntermediateThreshold(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLockDrag(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMinFlingVelocity(int i) {
        this.fJNWhG = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSwipeListener(TaskDescription taskDescription) {
        this.AxsJAY = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.iwGUEr < 2;
    }

    public C31909mIk(android.content.Context context) {
        super(context);
        this.AubY = new android.graphics.Rect();
        this.AuCTelauCTel = new android.graphics.Rect();
        this.zLjUOn = new android.graphics.Rect();
        this.zuBGHE = new android.graphics.Rect();
        this.wlaJM = new android.graphics.Rect();
        this.zsXlph = new android.graphics.Rect();
        this.ejfBZ = 0;
        this.gEmmrt = false;
        this.values = 36;
        this.djBIcL = 250;
        this.hDKMBd = 72;
        this.isConnected = false;
        this.OLrzqt = false;
        this.AkhnZx = false;
        this.AuCTel = false;
        this.fJNWhG = 300;
        this.fetchVPNInfo = 3500;
        this.gHZMYf = 0;
        this.getFieldNames = 0;
        this.DbNXlk = 0;
        this.fARcdN = 0;
        this.AEQbTJ = 0.0f;
        this.getNewProxyInstance = -1.0f;
        this.uzCIH = -1.0f;
        this.iwGUEr = 0;
        this.AYXKKw = new GestureDetector.SimpleOnGestureListener() { // from class: o.mIk.1
            public boolean EZpvd = false;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(android.view.MotionEvent motionEvent) {
                C31909mIk.this.AkhnZx = false;
                this.EZpvd = false;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
                C31909mIk.this.AkhnZx = true;
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
                boolean z = true;
                C31909mIk.this.AkhnZx = true;
                if (C31909mIk.this.getParent() != null) {
                    if (!this.EZpvd) {
                        boolean z2 = C31909mIk.this.AhwBna() >= C31909mIk.this.ejfBZ;
                        if (z2) {
                            this.EZpvd = true;
                        }
                        z = z2;
                    }
                    C31909mIk.this.getParent().requestDisallowInterceptTouchEvent(z);
                }
                return false;
            }
        };
        this.KWHzl = new ViewDragHelper.Callback() { // from class: o.mIk.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(android.view.View view, int i) {
                C31909mIk.this.OLrzqt = false;
                if (C31909mIk.this.AuCTel) {
                    return false;
                }
                C31909mIk.this.EZpvd.captureChildView(C31909mIk.this.fIwbmz, i);
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(android.view.View view, int i, int i2) {
                int i3 = C31909mIk.this.copydefault;
                if (i3 == 4) {
                    return java.lang.Math.max(java.lang.Math.min(i, C31909mIk.this.AubY.top + C31909mIk.this.sSMYrx.getHeight()), C31909mIk.this.AubY.top);
                }
                if (i3 == 8) {
                    return java.lang.Math.max(java.lang.Math.min(i, C31909mIk.this.AubY.top), C31909mIk.this.AubY.top - C31909mIk.this.sSMYrx.getHeight());
                }
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
                int i3 = C31909mIk.this.copydefault;
                if (i3 == 1) {
                    return java.lang.Math.max(java.lang.Math.min(i, C31909mIk.this.AubY.left + C31909mIk.this.sSMYrx.getWidth()), C31909mIk.this.AubY.left);
                }
                if (i3 == 2) {
                    return java.lang.Math.max(java.lang.Math.min(i, C31909mIk.this.AubY.left), C31909mIk.this.AubY.left - C31909mIk.this.sSMYrx.getWidth());
                }
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(android.view.View view, float f, float f2) {
                int i = (int) f;
                boolean z = C31909mIk.this.copydefault(i) >= C31909mIk.this.fJNWhG;
                boolean z2 = C31909mIk.this.copydefault(i) <= (-C31909mIk.this.fJNWhG);
                int i2 = (int) f2;
                boolean z3 = C31909mIk.this.copydefault(i2) <= (-C31909mIk.this.fJNWhG);
                boolean z4 = C31909mIk.this.copydefault(i2) >= C31909mIk.this.fJNWhG;
                boolean z5 = C31909mIk.this.copydefault(i) >= C31909mIk.this.fetchVPNInfo;
                boolean z6 = C31909mIk.this.copydefault(i) <= (-C31909mIk.this.fetchVPNInfo);
                boolean z7 = C31909mIk.this.copydefault(i2) <= (-C31909mIk.this.fetchVPNInfo);
                boolean z8 = C31909mIk.this.copydefault(i2) >= C31909mIk.this.fetchVPNInfo;
                int i3 = C31909mIk.this.copydefault;
                if (i3 == 1) {
                    copydefault(z, z2, z5);
                    return;
                }
                if (i3 == 2) {
                    AEQbTJ(z, z2, z6);
                } else if (i3 == 4) {
                    EZpvd(z3, z4, z8);
                } else {
                    if (i3 != 8) {
                        return;
                    }
                    KWHzl(z3, z4, z7);
                }
            }

            private void AEQbTJ(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.AubY.left - C31909mIk.this.fIwbmz.getLeft());
                if (z || z2) {
                    AEQbTJ(iCopydefault, z, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void copydefault(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.fIwbmz.getLeft() - C31909mIk.this.AubY.left);
                if (z || z2) {
                    AEQbTJ(iCopydefault, z2, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void EZpvd(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.fIwbmz.getTop() - C31909mIk.this.AubY.top);
                if (z || z2) {
                    AEQbTJ(iCopydefault, z, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void KWHzl(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.AubY.top - C31909mIk.this.fIwbmz.getTop());
                if (z || z2) {
                    AEQbTJ(iCopydefault, z2, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void AEQbTJ(int i, boolean z, boolean z2) {
                if (z) {
                    if (C31909mIk.this.gEmmrt && i >= C31909mIk.this.djBIcL) {
                        C31909mIk.this.EZpvd(true);
                        return;
                    } else if (i >= C31909mIk.this.values) {
                        C31909mIk.this.OLrzqt(true);
                        return;
                    } else {
                        C31909mIk.this.OLrzqt(true);
                        return;
                    }
                }
                if (z2 && C31909mIk.this.gEmmrt) {
                    C31909mIk.this.AEQbTJ(true);
                    return;
                }
                if (i < C31909mIk.this.values) {
                    C31909mIk.this.EZpvd(true);
                } else if (!C31909mIk.this.gEmmrt || i < C31909mIk.this.djBIcL) {
                    C31909mIk.this.EZpvd(true);
                } else {
                    C31909mIk.this.AEQbTJ(true);
                }
            }

            private void copydefault(int i) {
                if (i < C31909mIk.this.values) {
                    C31909mIk.this.OLrzqt(true);
                } else if (!C31909mIk.this.gEmmrt || i < C31909mIk.this.djBIcL) {
                    C31909mIk.this.EZpvd(true);
                } else {
                    C31909mIk.this.AEQbTJ(true);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onEdgeDragStarted(int i, int i2) {
                super.onEdgeDragStarted(i, i2);
                if (C31909mIk.this.AuCTel) {
                    return;
                }
                boolean z = false;
                boolean z2 = C31909mIk.this.copydefault == 2 && i == 1;
                boolean z3 = C31909mIk.this.copydefault == 1 && i == 2;
                boolean z4 = C31909mIk.this.copydefault == 8 && i == 4;
                if (C31909mIk.this.copydefault == 4 && i == 8) {
                    z = true;
                }
                if (z2 || z3 || z4 || z) {
                    C31909mIk.this.EZpvd.captureChildView(C31909mIk.this.fIwbmz, i2);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
                super.onViewPositionChanged(view, i, i2, i3, i4);
                boolean z = true;
                if (C31909mIk.this.getFieldNames == 1) {
                    if (C31909mIk.this.copydefault == 1 || C31909mIk.this.copydefault == 2) {
                        C31909mIk.this.sSMYrx.offsetLeftAndRight(i3);
                    } else {
                        C31909mIk.this.sSMYrx.offsetTopAndBottom(i4);
                    }
                }
                if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.DbNXlk && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.fARcdN) {
                    z = false;
                }
                if (C31909mIk.this.AxsJAY != null && z) {
                    if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AubY.left && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AubY.top) {
                        C31909mIk.this.AxsJAY.KWHzl(C31909mIk.this);
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AuCTelauCTel.left && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AuCTelauCTel.top) {
                        C31909mIk.this.AxsJAY.copydefault(C31909mIk.this);
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.wlaJM.left && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.wlaJM.top) {
                        C31909mIk.this.AxsJAY.OLrzqt(C31909mIk.this);
                    } else {
                        C31909mIk.this.AxsJAY.copydefault(C31909mIk.this, EZpvd());
                    }
                }
                C31909mIk c31909mIk = C31909mIk.this;
                c31909mIk.DbNXlk = c31909mIk.fIwbmz.getLeft();
                C31909mIk c31909mIk2 = C31909mIk.this;
                c31909mIk2.fARcdN = c31909mIk2.fIwbmz.getTop();
                ViewCompat.postInvalidateOnAnimation(C31909mIk.this);
            }

            private float EZpvd() {
                float left;
                int width;
                int i = C31909mIk.this.copydefault;
                if (i == 1) {
                    left = C31909mIk.this.fIwbmz.getLeft() - C31909mIk.this.AubY.left;
                    width = C31909mIk.this.sSMYrx.getWidth();
                } else if (i == 2) {
                    left = C31909mIk.this.AubY.left - C31909mIk.this.fIwbmz.getLeft();
                    width = C31909mIk.this.sSMYrx.getWidth();
                } else if (i == 4) {
                    left = C31909mIk.this.fIwbmz.getTop() - C31909mIk.this.AubY.top;
                    width = C31909mIk.this.sSMYrx.getHeight();
                } else {
                    if (i != 8) {
                        return 0.0f;
                    }
                    left = C31909mIk.this.AubY.top - C31909mIk.this.fIwbmz.getTop();
                    width = C31909mIk.this.sSMYrx.getHeight();
                }
                return left / width;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                super.onViewDragStateChanged(i);
                int i2 = C31909mIk.this.gHZMYf;
                if (i != 0) {
                    if (i == 1) {
                        C31909mIk.this.gHZMYf = 4;
                    }
                } else if (C31909mIk.this.copydefault == 1 || C31909mIk.this.copydefault == 2) {
                    if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AubY.left) {
                        C31909mIk.this.gHZMYf = 0;
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AuCTelauCTel.left) {
                        C31909mIk.this.gHZMYf = 2;
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.wlaJM.left) {
                        C31909mIk.this.gHZMYf = 5;
                    }
                } else if (C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AubY.top) {
                    C31909mIk.this.gHZMYf = 0;
                } else if (C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AuCTelauCTel.top) {
                    C31909mIk.this.gHZMYf = 2;
                } else if (C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.wlaJM.top) {
                    C31909mIk.this.gHZMYf = 5;
                }
                if (C31909mIk.this.AhwBna == null || C31909mIk.this.OLrzqt || i2 == C31909mIk.this.gHZMYf) {
                    return;
                }
                C31909mIk.this.AhwBna.copydefault(C31909mIk.this.gHZMYf);
            }
        };
        AEQbTJ(context, (android.util.AttributeSet) null);
    }

    public C31909mIk(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AubY = new android.graphics.Rect();
        this.AuCTelauCTel = new android.graphics.Rect();
        this.zLjUOn = new android.graphics.Rect();
        this.zuBGHE = new android.graphics.Rect();
        this.wlaJM = new android.graphics.Rect();
        this.zsXlph = new android.graphics.Rect();
        this.ejfBZ = 0;
        this.gEmmrt = false;
        this.values = 36;
        this.djBIcL = 250;
        this.hDKMBd = 72;
        this.isConnected = false;
        this.OLrzqt = false;
        this.AkhnZx = false;
        this.AuCTel = false;
        this.fJNWhG = 300;
        this.fetchVPNInfo = 3500;
        this.gHZMYf = 0;
        this.getFieldNames = 0;
        this.DbNXlk = 0;
        this.fARcdN = 0;
        this.AEQbTJ = 0.0f;
        this.getNewProxyInstance = -1.0f;
        this.uzCIH = -1.0f;
        this.iwGUEr = 0;
        this.AYXKKw = new GestureDetector.SimpleOnGestureListener() { // from class: o.mIk.1
            public boolean EZpvd = false;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(android.view.MotionEvent motionEvent) {
                C31909mIk.this.AkhnZx = false;
                this.EZpvd = false;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
                C31909mIk.this.AkhnZx = true;
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
                boolean z = true;
                C31909mIk.this.AkhnZx = true;
                if (C31909mIk.this.getParent() != null) {
                    if (!this.EZpvd) {
                        boolean z2 = C31909mIk.this.AhwBna() >= C31909mIk.this.ejfBZ;
                        if (z2) {
                            this.EZpvd = true;
                        }
                        z = z2;
                    }
                    C31909mIk.this.getParent().requestDisallowInterceptTouchEvent(z);
                }
                return false;
            }
        };
        this.KWHzl = new ViewDragHelper.Callback() { // from class: o.mIk.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(android.view.View view, int i) {
                C31909mIk.this.OLrzqt = false;
                if (C31909mIk.this.AuCTel) {
                    return false;
                }
                C31909mIk.this.EZpvd.captureChildView(C31909mIk.this.fIwbmz, i);
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(android.view.View view, int i, int i2) {
                int i3 = C31909mIk.this.copydefault;
                if (i3 == 4) {
                    return java.lang.Math.max(java.lang.Math.min(i, C31909mIk.this.AubY.top + C31909mIk.this.sSMYrx.getHeight()), C31909mIk.this.AubY.top);
                }
                if (i3 == 8) {
                    return java.lang.Math.max(java.lang.Math.min(i, C31909mIk.this.AubY.top), C31909mIk.this.AubY.top - C31909mIk.this.sSMYrx.getHeight());
                }
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
                int i3 = C31909mIk.this.copydefault;
                if (i3 == 1) {
                    return java.lang.Math.max(java.lang.Math.min(i, C31909mIk.this.AubY.left + C31909mIk.this.sSMYrx.getWidth()), C31909mIk.this.AubY.left);
                }
                if (i3 == 2) {
                    return java.lang.Math.max(java.lang.Math.min(i, C31909mIk.this.AubY.left), C31909mIk.this.AubY.left - C31909mIk.this.sSMYrx.getWidth());
                }
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(android.view.View view, float f, float f2) {
                int i = (int) f;
                boolean z = C31909mIk.this.copydefault(i) >= C31909mIk.this.fJNWhG;
                boolean z2 = C31909mIk.this.copydefault(i) <= (-C31909mIk.this.fJNWhG);
                int i2 = (int) f2;
                boolean z3 = C31909mIk.this.copydefault(i2) <= (-C31909mIk.this.fJNWhG);
                boolean z4 = C31909mIk.this.copydefault(i2) >= C31909mIk.this.fJNWhG;
                boolean z5 = C31909mIk.this.copydefault(i) >= C31909mIk.this.fetchVPNInfo;
                boolean z6 = C31909mIk.this.copydefault(i) <= (-C31909mIk.this.fetchVPNInfo);
                boolean z7 = C31909mIk.this.copydefault(i2) <= (-C31909mIk.this.fetchVPNInfo);
                boolean z8 = C31909mIk.this.copydefault(i2) >= C31909mIk.this.fetchVPNInfo;
                int i3 = C31909mIk.this.copydefault;
                if (i3 == 1) {
                    copydefault(z, z2, z5);
                    return;
                }
                if (i3 == 2) {
                    AEQbTJ(z, z2, z6);
                } else if (i3 == 4) {
                    EZpvd(z3, z4, z8);
                } else {
                    if (i3 != 8) {
                        return;
                    }
                    KWHzl(z3, z4, z7);
                }
            }

            private void AEQbTJ(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.AubY.left - C31909mIk.this.fIwbmz.getLeft());
                if (z || z2) {
                    AEQbTJ(iCopydefault, z, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void copydefault(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.fIwbmz.getLeft() - C31909mIk.this.AubY.left);
                if (z || z2) {
                    AEQbTJ(iCopydefault, z2, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void EZpvd(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.fIwbmz.getTop() - C31909mIk.this.AubY.top);
                if (z || z2) {
                    AEQbTJ(iCopydefault, z, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void KWHzl(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.AubY.top - C31909mIk.this.fIwbmz.getTop());
                if (z || z2) {
                    AEQbTJ(iCopydefault, z2, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void AEQbTJ(int i, boolean z, boolean z2) {
                if (z) {
                    if (C31909mIk.this.gEmmrt && i >= C31909mIk.this.djBIcL) {
                        C31909mIk.this.EZpvd(true);
                        return;
                    } else if (i >= C31909mIk.this.values) {
                        C31909mIk.this.OLrzqt(true);
                        return;
                    } else {
                        C31909mIk.this.OLrzqt(true);
                        return;
                    }
                }
                if (z2 && C31909mIk.this.gEmmrt) {
                    C31909mIk.this.AEQbTJ(true);
                    return;
                }
                if (i < C31909mIk.this.values) {
                    C31909mIk.this.EZpvd(true);
                } else if (!C31909mIk.this.gEmmrt || i < C31909mIk.this.djBIcL) {
                    C31909mIk.this.EZpvd(true);
                } else {
                    C31909mIk.this.AEQbTJ(true);
                }
            }

            private void copydefault(int i) {
                if (i < C31909mIk.this.values) {
                    C31909mIk.this.OLrzqt(true);
                } else if (!C31909mIk.this.gEmmrt || i < C31909mIk.this.djBIcL) {
                    C31909mIk.this.EZpvd(true);
                } else {
                    C31909mIk.this.AEQbTJ(true);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onEdgeDragStarted(int i, int i2) {
                super.onEdgeDragStarted(i, i2);
                if (C31909mIk.this.AuCTel) {
                    return;
                }
                boolean z = false;
                boolean z2 = C31909mIk.this.copydefault == 2 && i == 1;
                boolean z3 = C31909mIk.this.copydefault == 1 && i == 2;
                boolean z4 = C31909mIk.this.copydefault == 8 && i == 4;
                if (C31909mIk.this.copydefault == 4 && i == 8) {
                    z = true;
                }
                if (z2 || z3 || z4 || z) {
                    C31909mIk.this.EZpvd.captureChildView(C31909mIk.this.fIwbmz, i2);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
                super.onViewPositionChanged(view, i, i2, i3, i4);
                boolean z = true;
                if (C31909mIk.this.getFieldNames == 1) {
                    if (C31909mIk.this.copydefault == 1 || C31909mIk.this.copydefault == 2) {
                        C31909mIk.this.sSMYrx.offsetLeftAndRight(i3);
                    } else {
                        C31909mIk.this.sSMYrx.offsetTopAndBottom(i4);
                    }
                }
                if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.DbNXlk && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.fARcdN) {
                    z = false;
                }
                if (C31909mIk.this.AxsJAY != null && z) {
                    if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AubY.left && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AubY.top) {
                        C31909mIk.this.AxsJAY.KWHzl(C31909mIk.this);
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AuCTelauCTel.left && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AuCTelauCTel.top) {
                        C31909mIk.this.AxsJAY.copydefault(C31909mIk.this);
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.wlaJM.left && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.wlaJM.top) {
                        C31909mIk.this.AxsJAY.OLrzqt(C31909mIk.this);
                    } else {
                        C31909mIk.this.AxsJAY.copydefault(C31909mIk.this, EZpvd());
                    }
                }
                C31909mIk c31909mIk = C31909mIk.this;
                c31909mIk.DbNXlk = c31909mIk.fIwbmz.getLeft();
                C31909mIk c31909mIk2 = C31909mIk.this;
                c31909mIk2.fARcdN = c31909mIk2.fIwbmz.getTop();
                ViewCompat.postInvalidateOnAnimation(C31909mIk.this);
            }

            private float EZpvd() {
                float left;
                int width;
                int i = C31909mIk.this.copydefault;
                if (i == 1) {
                    left = C31909mIk.this.fIwbmz.getLeft() - C31909mIk.this.AubY.left;
                    width = C31909mIk.this.sSMYrx.getWidth();
                } else if (i == 2) {
                    left = C31909mIk.this.AubY.left - C31909mIk.this.fIwbmz.getLeft();
                    width = C31909mIk.this.sSMYrx.getWidth();
                } else if (i == 4) {
                    left = C31909mIk.this.fIwbmz.getTop() - C31909mIk.this.AubY.top;
                    width = C31909mIk.this.sSMYrx.getHeight();
                } else {
                    if (i != 8) {
                        return 0.0f;
                    }
                    left = C31909mIk.this.AubY.top - C31909mIk.this.fIwbmz.getTop();
                    width = C31909mIk.this.sSMYrx.getHeight();
                }
                return left / width;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                super.onViewDragStateChanged(i);
                int i2 = C31909mIk.this.gHZMYf;
                if (i != 0) {
                    if (i == 1) {
                        C31909mIk.this.gHZMYf = 4;
                    }
                } else if (C31909mIk.this.copydefault == 1 || C31909mIk.this.copydefault == 2) {
                    if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AubY.left) {
                        C31909mIk.this.gHZMYf = 0;
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AuCTelauCTel.left) {
                        C31909mIk.this.gHZMYf = 2;
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.wlaJM.left) {
                        C31909mIk.this.gHZMYf = 5;
                    }
                } else if (C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AubY.top) {
                    C31909mIk.this.gHZMYf = 0;
                } else if (C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AuCTelauCTel.top) {
                    C31909mIk.this.gHZMYf = 2;
                } else if (C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.wlaJM.top) {
                    C31909mIk.this.gHZMYf = 5;
                }
                if (C31909mIk.this.AhwBna == null || C31909mIk.this.OLrzqt || i2 == C31909mIk.this.gHZMYf) {
                    return;
                }
                C31909mIk.this.AhwBna.copydefault(C31909mIk.this.gHZMYf);
            }
        };
        AEQbTJ(context, attributeSet);
    }

    public C31909mIk(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AubY = new android.graphics.Rect();
        this.AuCTelauCTel = new android.graphics.Rect();
        this.zLjUOn = new android.graphics.Rect();
        this.zuBGHE = new android.graphics.Rect();
        this.wlaJM = new android.graphics.Rect();
        this.zsXlph = new android.graphics.Rect();
        this.ejfBZ = 0;
        this.gEmmrt = false;
        this.values = 36;
        this.djBIcL = 250;
        this.hDKMBd = 72;
        this.isConnected = false;
        this.OLrzqt = false;
        this.AkhnZx = false;
        this.AuCTel = false;
        this.fJNWhG = 300;
        this.fetchVPNInfo = 3500;
        this.gHZMYf = 0;
        this.getFieldNames = 0;
        this.DbNXlk = 0;
        this.fARcdN = 0;
        this.AEQbTJ = 0.0f;
        this.getNewProxyInstance = -1.0f;
        this.uzCIH = -1.0f;
        this.iwGUEr = 0;
        this.AYXKKw = new GestureDetector.SimpleOnGestureListener() { // from class: o.mIk.1
            public boolean EZpvd = false;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(android.view.MotionEvent motionEvent) {
                C31909mIk.this.AkhnZx = false;
                this.EZpvd = false;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
                C31909mIk.this.AkhnZx = true;
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
                boolean z = true;
                C31909mIk.this.AkhnZx = true;
                if (C31909mIk.this.getParent() != null) {
                    if (!this.EZpvd) {
                        boolean z2 = C31909mIk.this.AhwBna() >= C31909mIk.this.ejfBZ;
                        if (z2) {
                            this.EZpvd = true;
                        }
                        z = z2;
                    }
                    C31909mIk.this.getParent().requestDisallowInterceptTouchEvent(z);
                }
                return false;
            }
        };
        this.KWHzl = new ViewDragHelper.Callback() { // from class: o.mIk.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(android.view.View view, int i2) {
                C31909mIk.this.OLrzqt = false;
                if (C31909mIk.this.AuCTel) {
                    return false;
                }
                C31909mIk.this.EZpvd.captureChildView(C31909mIk.this.fIwbmz, i2);
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(android.view.View view, int i2, int i22) {
                int i3 = C31909mIk.this.copydefault;
                if (i3 == 4) {
                    return java.lang.Math.max(java.lang.Math.min(i2, C31909mIk.this.AubY.top + C31909mIk.this.sSMYrx.getHeight()), C31909mIk.this.AubY.top);
                }
                if (i3 == 8) {
                    return java.lang.Math.max(java.lang.Math.min(i2, C31909mIk.this.AubY.top), C31909mIk.this.AubY.top - C31909mIk.this.sSMYrx.getHeight());
                }
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(android.view.View view, int i2, int i22) {
                int i3 = C31909mIk.this.copydefault;
                if (i3 == 1) {
                    return java.lang.Math.max(java.lang.Math.min(i2, C31909mIk.this.AubY.left + C31909mIk.this.sSMYrx.getWidth()), C31909mIk.this.AubY.left);
                }
                if (i3 == 2) {
                    return java.lang.Math.max(java.lang.Math.min(i2, C31909mIk.this.AubY.left), C31909mIk.this.AubY.left - C31909mIk.this.sSMYrx.getWidth());
                }
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(android.view.View view, float f, float f2) {
                int i2 = (int) f;
                boolean z = C31909mIk.this.copydefault(i2) >= C31909mIk.this.fJNWhG;
                boolean z2 = C31909mIk.this.copydefault(i2) <= (-C31909mIk.this.fJNWhG);
                int i22 = (int) f2;
                boolean z3 = C31909mIk.this.copydefault(i22) <= (-C31909mIk.this.fJNWhG);
                boolean z4 = C31909mIk.this.copydefault(i22) >= C31909mIk.this.fJNWhG;
                boolean z5 = C31909mIk.this.copydefault(i2) >= C31909mIk.this.fetchVPNInfo;
                boolean z6 = C31909mIk.this.copydefault(i2) <= (-C31909mIk.this.fetchVPNInfo);
                boolean z7 = C31909mIk.this.copydefault(i22) <= (-C31909mIk.this.fetchVPNInfo);
                boolean z8 = C31909mIk.this.copydefault(i22) >= C31909mIk.this.fetchVPNInfo;
                int i3 = C31909mIk.this.copydefault;
                if (i3 == 1) {
                    copydefault(z, z2, z5);
                    return;
                }
                if (i3 == 2) {
                    AEQbTJ(z, z2, z6);
                } else if (i3 == 4) {
                    EZpvd(z3, z4, z8);
                } else {
                    if (i3 != 8) {
                        return;
                    }
                    KWHzl(z3, z4, z7);
                }
            }

            private void AEQbTJ(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.AubY.left - C31909mIk.this.fIwbmz.getLeft());
                if (z || z2) {
                    AEQbTJ(iCopydefault, z, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void copydefault(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.fIwbmz.getLeft() - C31909mIk.this.AubY.left);
                if (z || z2) {
                    AEQbTJ(iCopydefault, z2, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void EZpvd(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.fIwbmz.getTop() - C31909mIk.this.AubY.top);
                if (z || z2) {
                    AEQbTJ(iCopydefault, z, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void KWHzl(boolean z, boolean z2, boolean z3) {
                int iCopydefault = C31909mIk.this.copydefault(C31909mIk.this.AubY.top - C31909mIk.this.fIwbmz.getTop());
                if (z || z2) {
                    AEQbTJ(iCopydefault, z2, z3);
                } else {
                    copydefault(iCopydefault);
                }
            }

            private void AEQbTJ(int i2, boolean z, boolean z2) {
                if (z) {
                    if (C31909mIk.this.gEmmrt && i2 >= C31909mIk.this.djBIcL) {
                        C31909mIk.this.EZpvd(true);
                        return;
                    } else if (i2 >= C31909mIk.this.values) {
                        C31909mIk.this.OLrzqt(true);
                        return;
                    } else {
                        C31909mIk.this.OLrzqt(true);
                        return;
                    }
                }
                if (z2 && C31909mIk.this.gEmmrt) {
                    C31909mIk.this.AEQbTJ(true);
                    return;
                }
                if (i2 < C31909mIk.this.values) {
                    C31909mIk.this.EZpvd(true);
                } else if (!C31909mIk.this.gEmmrt || i2 < C31909mIk.this.djBIcL) {
                    C31909mIk.this.EZpvd(true);
                } else {
                    C31909mIk.this.AEQbTJ(true);
                }
            }

            private void copydefault(int i2) {
                if (i2 < C31909mIk.this.values) {
                    C31909mIk.this.OLrzqt(true);
                } else if (!C31909mIk.this.gEmmrt || i2 < C31909mIk.this.djBIcL) {
                    C31909mIk.this.EZpvd(true);
                } else {
                    C31909mIk.this.AEQbTJ(true);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onEdgeDragStarted(int i2, int i22) {
                super.onEdgeDragStarted(i2, i22);
                if (C31909mIk.this.AuCTel) {
                    return;
                }
                boolean z = false;
                boolean z2 = C31909mIk.this.copydefault == 2 && i2 == 1;
                boolean z3 = C31909mIk.this.copydefault == 1 && i2 == 2;
                boolean z4 = C31909mIk.this.copydefault == 8 && i2 == 4;
                if (C31909mIk.this.copydefault == 4 && i2 == 8) {
                    z = true;
                }
                if (z2 || z3 || z4 || z) {
                    C31909mIk.this.EZpvd.captureChildView(C31909mIk.this.fIwbmz, i22);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(android.view.View view, int i2, int i22, int i3, int i4) {
                super.onViewPositionChanged(view, i2, i22, i3, i4);
                boolean z = true;
                if (C31909mIk.this.getFieldNames == 1) {
                    if (C31909mIk.this.copydefault == 1 || C31909mIk.this.copydefault == 2) {
                        C31909mIk.this.sSMYrx.offsetLeftAndRight(i3);
                    } else {
                        C31909mIk.this.sSMYrx.offsetTopAndBottom(i4);
                    }
                }
                if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.DbNXlk && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.fARcdN) {
                    z = false;
                }
                if (C31909mIk.this.AxsJAY != null && z) {
                    if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AubY.left && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AubY.top) {
                        C31909mIk.this.AxsJAY.KWHzl(C31909mIk.this);
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AuCTelauCTel.left && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AuCTelauCTel.top) {
                        C31909mIk.this.AxsJAY.copydefault(C31909mIk.this);
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.wlaJM.left && C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.wlaJM.top) {
                        C31909mIk.this.AxsJAY.OLrzqt(C31909mIk.this);
                    } else {
                        C31909mIk.this.AxsJAY.copydefault(C31909mIk.this, EZpvd());
                    }
                }
                C31909mIk c31909mIk = C31909mIk.this;
                c31909mIk.DbNXlk = c31909mIk.fIwbmz.getLeft();
                C31909mIk c31909mIk2 = C31909mIk.this;
                c31909mIk2.fARcdN = c31909mIk2.fIwbmz.getTop();
                ViewCompat.postInvalidateOnAnimation(C31909mIk.this);
            }

            private float EZpvd() {
                float left;
                int width;
                int i2 = C31909mIk.this.copydefault;
                if (i2 == 1) {
                    left = C31909mIk.this.fIwbmz.getLeft() - C31909mIk.this.AubY.left;
                    width = C31909mIk.this.sSMYrx.getWidth();
                } else if (i2 == 2) {
                    left = C31909mIk.this.AubY.left - C31909mIk.this.fIwbmz.getLeft();
                    width = C31909mIk.this.sSMYrx.getWidth();
                } else if (i2 == 4) {
                    left = C31909mIk.this.fIwbmz.getTop() - C31909mIk.this.AubY.top;
                    width = C31909mIk.this.sSMYrx.getHeight();
                } else {
                    if (i2 != 8) {
                        return 0.0f;
                    }
                    left = C31909mIk.this.AubY.top - C31909mIk.this.fIwbmz.getTop();
                    width = C31909mIk.this.sSMYrx.getHeight();
                }
                return left / width;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i2) {
                super.onViewDragStateChanged(i2);
                int i22 = C31909mIk.this.gHZMYf;
                if (i2 != 0) {
                    if (i2 == 1) {
                        C31909mIk.this.gHZMYf = 4;
                    }
                } else if (C31909mIk.this.copydefault == 1 || C31909mIk.this.copydefault == 2) {
                    if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AubY.left) {
                        C31909mIk.this.gHZMYf = 0;
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.AuCTelauCTel.left) {
                        C31909mIk.this.gHZMYf = 2;
                    } else if (C31909mIk.this.fIwbmz.getLeft() == C31909mIk.this.wlaJM.left) {
                        C31909mIk.this.gHZMYf = 5;
                    }
                } else if (C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AubY.top) {
                    C31909mIk.this.gHZMYf = 0;
                } else if (C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.AuCTelauCTel.top) {
                    C31909mIk.this.gHZMYf = 2;
                } else if (C31909mIk.this.fIwbmz.getTop() == C31909mIk.this.wlaJM.top) {
                    C31909mIk.this.gHZMYf = 5;
                }
                if (C31909mIk.this.AhwBna == null || C31909mIk.this.OLrzqt || i22 == C31909mIk.this.gHZMYf) {
                    return;
                }
                C31909mIk.this.AhwBna.copydefault(C31909mIk.this.gHZMYf);
            }
        };
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        this.valueOf.onTouchEvent(motionEvent);
        this.EZpvd.processTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (OLrzqt()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.EZpvd.processTouchEvent(motionEvent);
        this.valueOf.onTouchEvent(motionEvent);
        EZpvd(motionEvent);
        boolean zKWHzl = KWHzl(motionEvent);
        boolean z = this.EZpvd.getViewDragState() == 2;
        boolean z2 = this.EZpvd.getViewDragState() == 0 && this.AkhnZx;
        this.getNewProxyInstance = motionEvent.getX();
        this.uzCIH = motionEvent.getY();
        return !zKWHzl && (z || z2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() >= 2) {
            this.sSMYrx = getChildAt(0);
            this.fIwbmz = getChildAt(1);
        } else if (getChildCount() == 1) {
            this.fIwbmz = getChildAt(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int iMin;
        int iMin2;
        int iMin3;
        int iMin4;
        int i5 = 0;
        this.OLrzqt = false;
        int i6 = 0;
        while (i6 < getChildCount()) {
            android.view.View childAt = getChildAt(i6);
            int paddingLeft = getPaddingLeft();
            int iMax = java.lang.Math.max((i3 - getPaddingRight()) - i, i5);
            int paddingTop = getPaddingTop();
            int iMax2 = java.lang.Math.max((i4 - getPaddingBottom()) - i2, i5);
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                int i7 = layoutParams.height;
                z3 = i7 == -1 || i7 == -1;
                int i8 = layoutParams.width;
                z2 = i8 == -1 || i8 == -1;
            } else {
                z2 = false;
                z3 = false;
            }
            if (z3) {
                measuredHeight = iMax2 - paddingTop;
                layoutParams.height = measuredHeight;
            }
            if (z2) {
                measuredWidth = iMax - paddingLeft;
                layoutParams.width = measuredWidth;
            }
            int i9 = this.copydefault;
            if (i9 == 1) {
                iMin = java.lang.Math.min(getPaddingLeft(), iMax);
                iMin2 = java.lang.Math.min(getPaddingTop(), iMax2);
                iMin3 = java.lang.Math.min(measuredWidth + getPaddingLeft(), iMax);
                iMin4 = java.lang.Math.min(measuredHeight + getPaddingTop(), iMax2);
            } else if (i9 == 2) {
                iMin = java.lang.Math.max(((i3 - measuredWidth) - getPaddingRight()) - i, paddingLeft);
                iMin2 = java.lang.Math.min(getPaddingTop(), iMax2);
                iMin3 = java.lang.Math.max((i3 - getPaddingRight()) - i, paddingLeft);
                iMin4 = java.lang.Math.min(measuredHeight + getPaddingTop(), iMax2);
            } else if (i9 == 4) {
                iMin = java.lang.Math.min(getPaddingLeft(), iMax);
                iMin2 = java.lang.Math.min(getPaddingTop(), iMax2);
                iMin3 = java.lang.Math.min(measuredWidth + getPaddingLeft(), iMax);
                iMin4 = java.lang.Math.min(measuredHeight + getPaddingTop(), iMax2);
            } else if (i9 != 8) {
                iMin = 0;
                iMin2 = 0;
                iMin3 = 0;
                iMin4 = 0;
            } else {
                iMin = java.lang.Math.min(getPaddingLeft(), iMax);
                iMin2 = java.lang.Math.max(((i4 - measuredHeight) - getPaddingBottom()) - i2, paddingTop);
                iMin3 = java.lang.Math.min(measuredWidth + getPaddingLeft(), iMax);
                iMin4 = java.lang.Math.max((i4 - getPaddingBottom()) - i2, paddingTop);
            }
            childAt.layout(iMin, iMin2, iMin3, iMin4);
            i6++;
            i5 = 0;
        }
        if (this.getFieldNames == 1) {
            int i10 = this.copydefault;
            if (i10 == 1) {
                android.view.View view = this.sSMYrx;
                view.offsetLeftAndRight(-view.getWidth());
            } else if (i10 == 2) {
                android.view.View view2 = this.sSMYrx;
                view2.offsetLeftAndRight(view2.getWidth());
            } else if (i10 == 4) {
                android.view.View view3 = this.sSMYrx;
                view3.offsetTopAndBottom(-view3.getHeight());
            } else if (i10 == 8) {
                android.view.View view4 = this.sSMYrx;
                view4.offsetTopAndBottom(view4.getHeight());
            }
        }
        AEQbTJ();
        if (this.isConnected) {
            EZpvd(false);
        } else {
            OLrzqt(false);
        }
        this.DbNXlk = this.fIwbmz.getLeft();
        this.fARcdN = this.fIwbmz.getTop();
        this.iwGUEr++;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (getChildCount() < 2) {
            throw new java.lang.RuntimeException("Layout must have two children");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            android.view.View childAt = getChildAt(i3);
            measureChild(childAt, i, i2);
            iMax = java.lang.Math.max(childAt.getMeasuredWidth(), iMax);
            iMax2 = java.lang.Math.max(childAt.getMeasuredHeight(), iMax2);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode2);
        int size = View.MeasureSpec.getSize(iMakeMeasureSpec);
        int size2 = View.MeasureSpec.getSize(iMakeMeasureSpec2);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            android.view.View childAt2 = getChildAt(i4);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height == -1) {
                    childAt2.setMinimumHeight(size2);
                }
                if (layoutParams2.width == -1) {
                    childAt2.setMinimumWidth(size);
                }
            }
            measureChild(childAt2, iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = java.lang.Math.max(childAt2.getMeasuredWidth(), iMax);
            iMax2 = java.lang.Math.max(childAt2.getMeasuredHeight(), iMax2);
        }
        int paddingLeft = iMax + getPaddingLeft() + getPaddingRight();
        int paddingTop = iMax2 + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            if (layoutParams.width == -1) {
                paddingLeft = size;
            }
            if (mode != Integer.MIN_VALUE || paddingLeft <= size) {
                size = paddingLeft;
            }
        }
        if (mode2 != 1073741824) {
            if (layoutParams.height == -1) {
                paddingTop = size2;
            }
            if (mode2 != Integer.MIN_VALUE || paddingTop <= size2) {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.EZpvd.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void EZpvd(boolean z) {
        this.isConnected = true;
        this.OLrzqt = false;
        if (z) {
            this.gHZMYf = 3;
            ViewDragHelper viewDragHelper = this.EZpvd;
            android.view.View view = this.fIwbmz;
            android.graphics.Rect rect = this.AuCTelauCTel;
            viewDragHelper.smoothSlideViewTo(view, rect.left, rect.top);
            Application application = this.AhwBna;
            if (application != null) {
                application.copydefault(this.gHZMYf);
            }
        } else {
            this.gHZMYf = 2;
            this.EZpvd.abort();
            android.view.View view2 = this.fIwbmz;
            android.graphics.Rect rect2 = this.AuCTelauCTel;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            android.view.View view3 = this.sSMYrx;
            android.graphics.Rect rect3 = this.zuBGHE;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void AEQbTJ(boolean z) {
        this.isConnected = true;
        this.OLrzqt = false;
        if (z) {
            this.gHZMYf = 6;
            ViewDragHelper viewDragHelper = this.EZpvd;
            android.view.View view = this.fIwbmz;
            android.graphics.Rect rect = this.wlaJM;
            viewDragHelper.smoothSlideViewTo(view, rect.left, rect.top);
            Application application = this.AhwBna;
            if (application != null) {
                application.copydefault(this.gHZMYf);
            }
        } else {
            this.gHZMYf = 5;
            this.EZpvd.abort();
            android.view.View view2 = this.fIwbmz;
            android.graphics.Rect rect2 = this.wlaJM;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            android.view.View view3 = this.sSMYrx;
            android.graphics.Rect rect3 = this.zsXlph;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void OLrzqt(boolean z) {
        this.isConnected = false;
        this.OLrzqt = false;
        if (z) {
            this.gHZMYf = 1;
            ViewDragHelper viewDragHelper = this.EZpvd;
            android.view.View view = this.fIwbmz;
            android.graphics.Rect rect = this.AubY;
            viewDragHelper.smoothSlideViewTo(view, rect.left, rect.top);
            Application application = this.AhwBna;
            if (application != null) {
                application.copydefault(this.gHZMYf);
            }
        } else {
            this.gHZMYf = 0;
            this.EZpvd.abort();
            android.view.View view2 = this.fIwbmz;
            android.graphics.Rect rect2 = this.AubY;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            android.view.View view3 = this.sSMYrx;
            android.graphics.Rect rect3 = this.zLjUOn;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setPartialRevealWidth(int i) {
        this.hDKMBd = i;
        if (this.fIwbmz == null || this.sSMYrx == null) {
            return;
        }
        AEQbTJ();
    }

    public void KWHzl() {
        this.OLrzqt = true;
        this.EZpvd.abort();
    }

    private int AYXKKw() {
        int iEZpvd = this.gEmmrt ? EZpvd(this.hDKMBd) : this.sSMYrx.getWidth();
        int i = this.copydefault;
        if (i == 1) {
            return this.AubY.left + iEZpvd;
        }
        if (i == 2) {
            return this.AubY.left - iEZpvd;
        }
        if (i == 4 || i == 8) {
            return this.AubY.left;
        }
        return 0;
    }

    private int isConnected() {
        int iEZpvd = this.gEmmrt ? EZpvd(this.hDKMBd) : this.sSMYrx.getHeight();
        int i = this.copydefault;
        if (i == 1 || i == 2) {
            return this.AubY.top;
        }
        if (i == 4) {
            return this.AubY.top + iEZpvd;
        }
        if (i != 8) {
            return 0;
        }
        return this.AubY.top - iEZpvd;
    }

    private int djBIcL() {
        int i = this.copydefault;
        if (i == 1) {
            return this.AubY.left + this.sSMYrx.getWidth();
        }
        if (i == 2) {
            return this.AubY.left - this.sSMYrx.getWidth();
        }
        if (i == 4 || i == 8) {
            return this.AubY.left;
        }
        return 0;
    }

    private int gEmmrt() {
        int i = this.copydefault;
        if (i == 1 || i == 2) {
            return this.AubY.top;
        }
        if (i == 4) {
            return this.AubY.top + this.sSMYrx.getHeight();
        }
        if (i != 8) {
            return 0;
        }
        return this.AubY.top - this.sSMYrx.getHeight();
    }

    private int AkhnZx() {
        int i;
        if (this.getFieldNames == 0 || (i = this.copydefault) == 8 || i == 4) {
            return this.zLjUOn.left;
        }
        int iEZpvd = this.gEmmrt ? EZpvd(this.hDKMBd) : this.sSMYrx.getWidth();
        if (this.copydefault == 1) {
            return this.zLjUOn.left + iEZpvd;
        }
        return this.zLjUOn.left - iEZpvd;
    }

    private int fetchVPNInfo() {
        int i;
        if (this.getFieldNames == 0 || (i = this.copydefault) == 1 || i == 2) {
            return this.zLjUOn.top;
        }
        int iEZpvd = this.gEmmrt ? EZpvd(this.hDKMBd) : this.sSMYrx.getHeight();
        if (this.copydefault == 4) {
            return this.zLjUOn.top + iEZpvd;
        }
        return this.zLjUOn.top - iEZpvd;
    }

    private int values() {
        int i;
        if (this.getFieldNames == 0 || (i = this.copydefault) == 8 || i == 4) {
            return this.zLjUOn.left;
        }
        if (i == 1) {
            return this.zLjUOn.left + this.sSMYrx.getWidth();
        }
        return this.zLjUOn.left - this.sSMYrx.getWidth();
    }

    private int DbNXlk() {
        int i;
        if (this.getFieldNames == 0 || (i = this.copydefault) == 1 || i == 2) {
            return this.zLjUOn.top;
        }
        if (i == 4) {
            return this.zLjUOn.top + this.sSMYrx.getHeight();
        }
        return this.zLjUOn.top - this.sSMYrx.getHeight();
    }

    public final void AEQbTJ() {
        this.AubY.set(this.fIwbmz.getLeft(), this.fIwbmz.getTop(), this.fIwbmz.getRight(), this.fIwbmz.getBottom());
        this.zLjUOn.set(this.sSMYrx.getLeft(), this.sSMYrx.getTop(), this.sSMYrx.getRight(), this.sSMYrx.getBottom());
        this.AuCTelauCTel.set(AYXKKw(), isConnected(), AYXKKw() + this.fIwbmz.getWidth(), isConnected() + this.fIwbmz.getHeight());
        this.zuBGHE.set(AkhnZx(), fetchVPNInfo(), AkhnZx() + this.sSMYrx.getWidth(), fetchVPNInfo() + this.sSMYrx.getHeight());
        this.wlaJM.set(djBIcL(), gEmmrt(), djBIcL() + this.fIwbmz.getWidth(), gEmmrt() + this.fIwbmz.getHeight());
        this.zsXlph.set(values(), DbNXlk(), values() + this.sSMYrx.getWidth(), DbNXlk() + this.sSMYrx.getHeight());
    }

    public final boolean KWHzl(android.view.MotionEvent motionEvent) {
        return OLrzqt(motionEvent) && !EZpvd();
    }

    public final boolean OLrzqt(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return ((((float) this.fIwbmz.getTop()) > y ? 1 : (((float) this.fIwbmz.getTop()) == y ? 0 : -1)) <= 0 && (y > ((float) this.fIwbmz.getBottom()) ? 1 : (y == ((float) this.fIwbmz.getBottom()) ? 0 : -1)) <= 0) && ((((float) this.fIwbmz.getLeft()) > x ? 1 : (((float) this.fIwbmz.getLeft()) == x ? 0 : -1)) <= 0 && (x > ((float) this.fIwbmz.getRight()) ? 1 : (x == ((float) this.fIwbmz.getRight()) ? 0 : -1)) <= 0);
    }

    public final boolean EZpvd() {
        return this.AEQbTJ >= ((float) this.EZpvd.getTouchSlop());
    }

    public final void EZpvd(android.view.MotionEvent motionEvent) {
        float fAbs;
        if (motionEvent.getAction() == 0) {
            this.AEQbTJ = 0.0f;
            return;
        }
        if (copydefault() == 1 || copydefault() == 2) {
            fAbs = java.lang.Math.abs(motionEvent.getX() - this.getNewProxyInstance);
        } else {
            fAbs = java.lang.Math.abs(motionEvent.getY() - this.uzCIH);
        }
        this.AEQbTJ += fAbs;
    }

    public final void AEQbTJ(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null && context != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, mDC.LoaderManager.fARcdN, 0, 0);
            this.copydefault = getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : 2;
            this.fJNWhG = typedArrayObtainStyledAttributes.getInteger(mDC.LoaderManager.AuCTel, 300);
            this.getFieldNames = typedArrayObtainStyledAttributes.getInteger(mDC.LoaderManager.getFieldNames, 0);
            this.ejfBZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(mDC.LoaderManager.iwGUEr, EZpvd(1));
            this.gEmmrt = typedArrayObtainStyledAttributes.getBoolean(mDC.LoaderManager.ejfBZ, false);
            this.values = typedArrayObtainStyledAttributes.getInteger(mDC.LoaderManager.uzCIH, 36);
            this.djBIcL = typedArrayObtainStyledAttributes.getInteger(mDC.LoaderManager.getNewProxyInstance, 250);
            this.hDKMBd = typedArrayObtainStyledAttributes.getInteger(mDC.LoaderManager.hDKMBd, 72);
            typedArrayObtainStyledAttributes.recycle();
        }
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 1.0f, this.KWHzl);
        this.EZpvd = viewDragHelperCreate;
        viewDragHelperCreate.setEdgeTrackingEnabled(15);
        this.valueOf = new GestureDetectorCompat(context, this.AYXKKw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int AhwBna() {
        int i = this.copydefault;
        if (i == 1) {
            int i2 = this.AubY.left;
            int width = this.sSMYrx.getWidth();
            return java.lang.Math.min(this.fIwbmz.getLeft() - this.AubY.left, (i2 + width) - this.fIwbmz.getLeft());
        }
        if (i == 2) {
            int i3 = this.AubY.right;
            int width2 = this.sSMYrx.getWidth();
            return java.lang.Math.min(this.fIwbmz.getRight() - (i3 - width2), this.AubY.right - this.fIwbmz.getRight());
        }
        if (i == 4) {
            int height = this.AubY.top + this.sSMYrx.getHeight();
            return java.lang.Math.min(this.fIwbmz.getBottom() - height, height - this.fIwbmz.getTop());
        }
        if (i != 8) {
            return 0;
        }
        int i4 = this.AubY.bottom;
        int height2 = this.sSMYrx.getHeight();
        return java.lang.Math.min(this.AubY.bottom - this.fIwbmz.getBottom(), this.fIwbmz.getBottom() - (i4 - height2));
    }

    public final int copydefault(int i) {
        return (int) (i / (getContext().getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public final int EZpvd(int i) {
        return (int) (i * (getContext().getResources().getDisplayMetrics().densityDpi / 160.0f));
    }
}
