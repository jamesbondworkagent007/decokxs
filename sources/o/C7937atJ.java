package o;

import android.content.res.Resources;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;

/* JADX INFO: renamed from: o.atJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7937atJ extends android.widget.FrameLayout {
    public int AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public float AkhnZx;
    public final int[] AuCTel;
    public final android.graphics.Paint AuCTelauCTel;
    public final android.graphics.Rect AubY;
    public float AwvSrB;
    public float DbNXlk;
    public int EZpvd;
    public final android.graphics.Camera KWHzl;
    public boolean OLrzqt;
    public final float copydefault;
    public float djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public final android.graphics.Matrix fIwbmz;
    public int fJNWhG;
    public final TaskDescription<Activity> fetchVPNInfo;
    public final android.util.SparseArray<java.lang.String> gEmmrt;
    public float getFieldNames;
    public final float getNewProxyInstance;
    public float hDKMBd;
    public final Deque<Activity> isConnected;
    public final android.content.res.Resources iwGUEr;
    public float uzCIH;
    public boolean valueOf;
    public float values;
    public final float wlaJM;
    public final float zLjUOn;
    public final BitSet zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDrawViewNames(boolean z) {
        this.valueOf = z;
    }

    /* JADX INFO: renamed from: o.atJ$Activity */
    public static class Activity {
        public int KWHzl;
        public android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd() {
            this.OLrzqt = null;
            this.KWHzl = -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(android.view.View view, int i) {
            this.OLrzqt = view;
            this.KWHzl = i;
        }

        private Activity() {
        }
    }

    public C7937atJ(android.content.Context context) {
        this(context, null);
    }

    public C7937atJ(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7937atJ(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AubY = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.AuCTelauCTel = paint;
        this.KWHzl = new android.graphics.Camera();
        this.fIwbmz = new android.graphics.Matrix();
        this.AuCTel = new int[2];
        this.zsXlph = new BitSet(25);
        this.gEmmrt = new android.util.SparseArray<>();
        this.isConnected = new ArrayDeque();
        this.fetchVPNInfo = new TaskDescription<Activity>(25) { // from class: o.atJ.5
            /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
            @Override // o.C7937atJ.TaskDescription
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public Activity AEQbTJ() {
                return new Activity();
            }
        };
        this.AYXKKw = true;
        this.valueOf = false;
        this.fJNWhG = -1;
        this.ejfBZ = -1;
        this.fARcdN = 0;
        this.uzCIH = 15.0f;
        this.hDKMBd = -10.0f;
        this.AwvSrB = 0.6f;
        this.getFieldNames = 25.0f;
        this.iwGUEr = context.getResources();
        float f = context.getResources().getDisplayMetrics().density;
        this.copydefault = f;
        this.getNewProxyInstance = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        float f2 = 10.0f * f;
        this.zLjUOn = f2;
        this.wlaJM = f * 2.0f;
        setChromeColor(-7829368);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(f2);
        setChromeShadowColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setTypeface(android.graphics.Typeface.create("sans-serif-condensed", 0));
    }

    public void setChromeColor(int i) {
        if (this.AEQbTJ != i) {
            this.AuCTelauCTel.setColor(i);
            this.AEQbTJ = i;
            invalidate();
        }
    }

    public void setChromeShadowColor(int i) {
        if (this.EZpvd != i) {
            this.AuCTelauCTel.setShadowLayer(1.0f, -1.0f, 1.0f, i);
            this.EZpvd = i;
            invalidate();
        }
    }

    public void setLayerInteractionEnabled(boolean z) {
        if (this.AhwBna != z) {
            this.AhwBna = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public void setDrawViews(boolean z) {
        if (this.AYXKKw != z) {
            this.AYXKKw = z;
            invalidate();
        }
    }

    public void setDrawIds(boolean z) {
        if (this.OLrzqt != z) {
            this.OLrzqt = z;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.AhwBna || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.AhwBna) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            actionIndex = actionMasked != 0 ? motionEvent.getActionIndex() : 0;
            if (this.fJNWhG == -1) {
                this.fJNWhG = motionEvent.getPointerId(actionIndex);
                this.djBIcL = motionEvent.getX(actionIndex);
                this.AkhnZx = motionEvent.getY(actionIndex);
            } else if (this.ejfBZ == -1) {
                this.ejfBZ = motionEvent.getPointerId(actionIndex);
                this.DbNXlk = motionEvent.getX(actionIndex);
                this.values = motionEvent.getY(actionIndex);
            }
        } else if (actionMasked == 1) {
            int pointerId = motionEvent.getPointerId(actionMasked != 6 ? 0 : motionEvent.getActionIndex());
            if (this.fJNWhG == pointerId) {
                this.fJNWhG = this.ejfBZ;
                this.djBIcL = this.DbNXlk;
                this.AkhnZx = this.values;
            } else if (this.ejfBZ == pointerId) {
            }
            this.ejfBZ = -1;
            this.fARcdN = 0;
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                    }
                }
            }
        } else if (this.ejfBZ == -1) {
            int pointerCount = motionEvent.getPointerCount();
            while (actionIndex < pointerCount) {
                if (this.fJNWhG == motionEvent.getPointerId(actionIndex)) {
                    float x = motionEvent.getX(actionIndex);
                    float y = motionEvent.getY(actionIndex);
                    float f = this.djBIcL;
                    float height = (-(y - this.AkhnZx)) / getHeight();
                    this.uzCIH = java.lang.Math.min(java.lang.Math.max(this.uzCIH + (((x - f) / getWidth()) * 90.0f), -60.0f), 60.0f);
                    this.hDKMBd = java.lang.Math.min(java.lang.Math.max(this.hDKMBd + (height * 90.0f), -60.0f), 60.0f);
                    this.djBIcL = x;
                    this.AkhnZx = y;
                    invalidate();
                }
                actionIndex++;
            }
        } else {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.fJNWhG);
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.ejfBZ);
            float x2 = motionEvent.getX(iFindPointerIndex);
            float y2 = motionEvent.getY(iFindPointerIndex);
            float x3 = motionEvent.getX(iFindPointerIndex2);
            float y3 = motionEvent.getY(iFindPointerIndex2);
            float f2 = x2 - this.djBIcL;
            float f3 = y2 - this.AkhnZx;
            float f4 = x3 - this.DbNXlk;
            float f5 = y3 - this.values;
            if (this.fARcdN == 0) {
                float fAbs = java.lang.Math.abs(f2) + java.lang.Math.abs(f4);
                float fAbs2 = java.lang.Math.abs(f3) + java.lang.Math.abs(f5);
                float f6 = this.getNewProxyInstance * 2.0f;
                if (fAbs > f6 || fAbs2 > f6) {
                    if (fAbs > fAbs2) {
                        this.fARcdN = -1;
                    } else {
                        this.fARcdN = 1;
                    }
                }
            }
            int i = this.fARcdN;
            if (i == 1) {
                if (y2 >= y3) {
                    this.AwvSrB += (f3 / getHeight()) - (f5 / getHeight());
                } else {
                    this.AwvSrB += (f5 / getHeight()) - (f3 / getHeight());
                }
                this.AwvSrB = java.lang.Math.min(java.lang.Math.max(this.AwvSrB, 0.33f), 2.0f);
                invalidate();
            } else if (i == -1) {
                if (x2 >= x3) {
                    this.getFieldNames += ((f2 / getWidth()) * 100.0f) - ((f4 / getWidth()) * 100.0f);
                } else {
                    this.getFieldNames += ((f4 / getWidth()) * 100.0f) - ((f2 / getWidth()) * 100.0f);
                }
                this.getFieldNames = java.lang.Math.min(java.lang.Math.max(this.getFieldNames, 10.0f), 100.0f);
                invalidate();
            }
            if (this.fARcdN != 0) {
                this.djBIcL = x2;
                this.AkhnZx = y2;
                this.DbNXlk = x3;
                this.values = y3;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (!this.AhwBna) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            super.draw(canvas);
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis2 > 16) {
                C7870arw.EZpvd("draw lua view cast: " + jCurrentTimeMillis2);
                return;
            }
            return;
        }
        getLocationInWindow(this.AuCTel);
        int[] iArr = this.AuCTel;
        float f = iArr[0];
        float f2 = iArr[1];
        int iSave = canvas.save();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        this.KWHzl.save();
        this.KWHzl.rotate(this.hDKMBd, this.uzCIH, 0.0f);
        this.KWHzl.getMatrix(this.fIwbmz);
        this.KWHzl.restore();
        this.fIwbmz.preTranslate(-width, -height);
        this.fIwbmz.postTranslate(width, height);
        canvas.concat(this.fIwbmz);
        float f3 = this.AwvSrB;
        canvas.scale(f3, f3, width, height);
        if (!this.isConnected.isEmpty()) {
            throw new java.lang.AssertionError("View queue is not empty.");
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Activity activityOLrzqt = this.fetchVPNInfo.OLrzqt();
            activityOLrzqt.OLrzqt(getChildAt(i), 0);
            this.isConnected.add(activityOLrzqt);
        }
        while (!this.isConnected.isEmpty()) {
            Activity activityRemoveFirst = this.isConnected.removeFirst();
            android.view.View view = activityRemoveFirst.OLrzqt;
            int i2 = activityRemoveFirst.KWHzl;
            activityRemoveFirst.EZpvd();
            this.fetchVPNInfo.copydefault(activityRemoveFirst);
            boolean z = view instanceof android.view.ViewGroup;
            if (z) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                this.zsXlph.clear();
                int childCount2 = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    android.view.View childAt = viewGroup.getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        this.zsXlph.set(i3);
                        childAt.setVisibility(4);
                    }
                }
            }
            int iSave2 = canvas.save();
            float f4 = this.uzCIH / 60.0f;
            float f5 = this.hDKMBd / 60.0f;
            float f6 = i2 * this.getFieldNames * this.copydefault;
            canvas.translate(f6 * f4, -(f5 * f6));
            view.getLocationInWindow(this.AuCTel);
            int[] iArr2 = this.AuCTel;
            canvas.translate(iArr2[0] - f, iArr2[1] - f2);
            this.AubY.set(0, 0, view.getWidth(), view.getHeight());
            canvas.drawRect(this.AubY, this.AuCTelauCTel);
            if (this.AYXKKw) {
                view.draw(canvas);
            }
            if (this.OLrzqt) {
                int id = view.getId();
                if (id != -1) {
                    canvas.drawText(AEQbTJ(id), this.wlaJM, this.zLjUOn, this.AuCTelauCTel);
                }
            } else if (this.valueOf) {
                canvas.drawText(view.getClass().getSimpleName() + " " + view.getMeasuredWidth() + "X" + view.getMeasuredHeight(), this.wlaJM, this.zLjUOn, this.AuCTelauCTel);
            }
            canvas.restoreToCount(iSave2);
            if (z) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view;
                int childCount3 = viewGroup2.getChildCount();
                for (int i4 = 0; i4 < childCount3; i4++) {
                    if (this.zsXlph.get(i4)) {
                        android.view.View childAt2 = viewGroup2.getChildAt(i4);
                        childAt2.setVisibility(0);
                        Activity activityOLrzqt2 = this.fetchVPNInfo.OLrzqt();
                        activityOLrzqt2.OLrzqt(childAt2, i2 + 1);
                        this.isConnected.add(activityOLrzqt2);
                    }
                }
            }
        }
        canvas.restoreToCount(iSave);
    }

    public final java.lang.String AEQbTJ(int i) {
        java.lang.String resourceEntryName = this.gEmmrt.get(i);
        if (resourceEntryName == null) {
            try {
                resourceEntryName = this.iwGUEr.getResourceEntryName(i);
            } catch (Resources.NotFoundException unused) {
                resourceEntryName = java.lang.String.format("0x%8x", java.lang.Integer.valueOf(i));
            }
            this.gEmmrt.put(i, resourceEntryName);
        }
        return resourceEntryName;
    }

    /* JADX INFO: renamed from: o.atJ$TaskDescription */
    public static abstract class TaskDescription<T> {
        public final Deque<T> copydefault;

        public abstract T AEQbTJ();

        public TaskDescription(int i) {
            this.copydefault = new ArrayDeque(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.copydefault.addLast(AEQbTJ());
            }
        }

        public T OLrzqt() {
            return this.copydefault.isEmpty() ? AEQbTJ() : this.copydefault.removeLast();
        }

        public void copydefault(T t) {
            this.copydefault.addLast(t);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        super.onLayout(z, i, i2, i3, i4);
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            C7870arw.EZpvd("layout lua view cast: " + jCurrentTimeMillis2);
        }
    }
}
