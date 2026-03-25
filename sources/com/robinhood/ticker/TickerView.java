package com.robinhood.ticker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import o.C57853yqJ;
import o.C57858yqO;
import o.C57859yqP;
import o.C57862yqS;

/* JADX INFO: loaded from: classes12.dex */
public class TickerView extends View {
    public static final Interpolator AhwBna = new AccelerateDecelerateInterpolator();
    public boolean AYXKKw;
    public TaskDescription AkhnZx;
    public final C57859yqP AuCTel;
    public final C57858yqO DbNXlk;
    public long djBIcL;
    public int ejfBZ;
    public String fARcdN;
    public String fIwbmz;
    public TaskDescription fJNWhG;
    public int fetchVPNInfo;
    public Interpolator gEmmrt;
    public final Rect getFieldNames;
    public int getNewProxyInstance;
    public float hDKMBd;
    public final ValueAnimator isConnected;
    public int iwGUEr;
    public final Paint uzCIH;
    public long valueOf;
    public int values;

    public enum ScrollingDirection {
        ANY,
        UP,
        DOWN
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAnimateMeasurementChange(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAnimationDelay(long j) {
        this.valueOf = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAnimationDuration(long j) {
        this.djBIcL = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAnimationInterpolator(Interpolator interpolator) {
        this.gEmmrt = interpolator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float valueOf() {
        return this.hDKMBd;
    }

    public TickerView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.uzCIH = textPaint;
        C57859yqP c57859yqP = new C57859yqP(textPaint);
        this.AuCTel = c57859yqP;
        this.DbNXlk = new C57858yqO(c57859yqP);
        this.isConnected = ValueAnimator.ofFloat(1.0f);
        this.getFieldNames = new Rect();
        OLrzqt(context, null, 0, 0);
    }

    public TickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint(1);
        this.uzCIH = textPaint;
        C57859yqP c57859yqP = new C57859yqP(textPaint);
        this.AuCTel = c57859yqP;
        this.DbNXlk = new C57858yqO(c57859yqP);
        this.isConnected = ValueAnimator.ofFloat(1.0f);
        this.getFieldNames = new Rect();
        OLrzqt(context, attributeSet, 0, 0);
    }

    public TickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextPaint textPaint = new TextPaint(1);
        this.uzCIH = textPaint;
        C57859yqP c57859yqP = new C57859yqP(textPaint);
        this.AuCTel = c57859yqP;
        this.DbNXlk = new C57858yqO(c57859yqP);
        this.isConnected = ValueAnimator.ofFloat(1.0f);
        this.getFieldNames = new Rect();
        OLrzqt(context, attributeSet, i, 0);
    }

    public void OLrzqt(Context context, AttributeSet attributeSet, int i, int i2) {
        StateListAnimator stateListAnimator = new StateListAnimator(context.getResources());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57853yqJ.StateListAnimator.KWHzl, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C57853yqJ.StateListAnimator.valueOf, -1);
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, C57853yqJ.StateListAnimator.KWHzl);
            stateListAnimator.copydefault(typedArrayObtainStyledAttributes2);
            typedArrayObtainStyledAttributes2.recycle();
        }
        stateListAnimator.copydefault(typedArrayObtainStyledAttributes);
        this.gEmmrt = AhwBna;
        this.djBIcL = typedArrayObtainStyledAttributes.getInt(C57853yqJ.StateListAnimator.isConnected, 350);
        this.AYXKKw = typedArrayObtainStyledAttributes.getBoolean(C57853yqJ.StateListAnimator.DbNXlk, false);
        this.values = stateListAnimator.copydefault;
        int i3 = stateListAnimator.EZpvd;
        if (i3 != 0) {
            this.uzCIH.setShadowLayer(stateListAnimator.AEQbTJ, stateListAnimator.KWHzl, stateListAnimator.OLrzqt, i3);
        }
        int i4 = stateListAnimator.djBIcL;
        if (i4 != 0) {
            this.iwGUEr = i4;
            setTypeface(this.uzCIH.getTypeface());
        }
        setTextColor(stateListAnimator.valueOf);
        setTextSize(stateListAnimator.AhwBna);
        int i5 = typedArrayObtainStyledAttributes.getInt(C57853yqJ.StateListAnimator.AkhnZx, 0);
        if (i5 == 1) {
            setCharacterLists(C57862yqS.copydefault());
        } else if (i5 == 2) {
            setCharacterLists(C57862yqS.EZpvd());
        } else if (isInEditMode()) {
            setCharacterLists(C57862yqS.copydefault());
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(C57853yqJ.StateListAnimator.fetchVPNInfo, 0);
        if (i6 == 0) {
            this.AuCTel.EZpvd(ScrollingDirection.ANY);
        } else if (i6 == 1) {
            this.AuCTel.EZpvd(ScrollingDirection.UP);
        } else if (i6 == 2) {
            this.AuCTel.EZpvd(ScrollingDirection.DOWN);
        } else {
            throw new IllegalArgumentException("Unsupported ticker_defaultPreferredScrollingDirection: " + i6);
        }
        if (gEmmrt()) {
            setText(stateListAnimator.gEmmrt, false);
        } else {
            this.fIwbmz = stateListAnimator.gEmmrt;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.isConnected.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.ticker.TickerView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TickerView.this.DbNXlk.copydefault(valueAnimator.getAnimatedFraction());
                TickerView.this.AEQbTJ();
                TickerView.this.invalidate();
            }
        });
        final Runnable runnable = new Runnable() { // from class: com.robinhood.ticker.TickerView.4
            @Override // java.lang.Runnable
            public void run() {
                TickerView.this.fetchVPNInfo();
            }
        };
        this.isConnected.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.ticker.TickerView.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TickerView.this.DbNXlk.EZpvd();
                TickerView.this.AEQbTJ();
                TickerView.this.invalidate();
                if (Build.VERSION.SDK_INT >= 26) {
                    runnable.run();
                } else {
                    TickerView.this.post(runnable);
                }
            }
        });
    }

    public class StateListAnimator {
        public float AEQbTJ;
        public float AhwBna;
        public int EZpvd;
        public float KWHzl;
        public float OLrzqt;
        public int djBIcL;
        public String gEmmrt;
        public int valueOf = ViewCompat.MEASURED_STATE_MASK;
        public int copydefault = 8388611;

        public StateListAnimator(Resources resources) {
            this.AhwBna = TypedValue.applyDimension(2, 12.0f, resources.getDisplayMetrics());
        }

        public void copydefault(TypedArray typedArray) {
            this.copydefault = typedArray.getInt(C57853yqJ.StateListAnimator.EZpvd, this.copydefault);
            this.EZpvd = typedArray.getColor(C57853yqJ.StateListAnimator.AEQbTJ, this.EZpvd);
            this.KWHzl = typedArray.getFloat(C57853yqJ.StateListAnimator.OLrzqt, this.KWHzl);
            this.OLrzqt = typedArray.getFloat(C57853yqJ.StateListAnimator.copydefault, this.OLrzqt);
            this.AEQbTJ = typedArray.getFloat(C57853yqJ.StateListAnimator.gEmmrt, this.AEQbTJ);
            this.gEmmrt = typedArray.getString(C57853yqJ.StateListAnimator.djBIcL);
            this.valueOf = typedArray.getColor(C57853yqJ.StateListAnimator.AhwBna, this.valueOf);
            this.AhwBna = typedArray.getDimension(C57853yqJ.StateListAnimator.AYXKKw, this.AhwBna);
            this.djBIcL = typedArray.getInt(C57853yqJ.StateListAnimator.values, this.djBIcL);
        }
    }

    public void setCharacterLists(String... strArr) {
        this.DbNXlk.OLrzqt(strArr);
        String str = this.fIwbmz;
        if (str != null) {
            setText(str, false);
            this.fIwbmz = null;
        }
    }

    public boolean gEmmrt() {
        return this.DbNXlk.AEQbTJ() != null;
    }

    public void setText(String str) {
        setText(str, !TextUtils.isEmpty(this.fARcdN));
    }

    public void setText(String str, boolean z) {
        if (TextUtils.equals(str, this.fARcdN)) {
            return;
        }
        if (!z && this.isConnected.isRunning()) {
            this.isConnected.cancel();
            this.fJNWhG = null;
            this.AkhnZx = null;
        }
        if (z) {
            this.fJNWhG = new TaskDescription(str, this.valueOf, this.djBIcL, this.gEmmrt);
            if (this.AkhnZx == null) {
                fetchVPNInfo();
                return;
            }
            return;
        }
        copydefault(str);
        this.DbNXlk.copydefault(1.0f);
        this.DbNXlk.EZpvd();
        AEQbTJ();
        invalidate();
    }

    public void setTextColor(int i) {
        if (this.getNewProxyInstance != i) {
            this.getNewProxyInstance = i;
            this.uzCIH.setColor(i);
            invalidate();
        }
    }

    public void setTextSize(float f) {
        if (this.hDKMBd != f) {
            this.hDKMBd = f;
            this.uzCIH.setTextSize(f);
            isConnected();
        }
    }

    public void setTypeface(Typeface typeface) {
        int i = this.iwGUEr;
        if (i == 3) {
            typeface = Typeface.create(typeface, 3);
        } else if (i == 1) {
            typeface = Typeface.create(typeface, 1);
        } else if (i == 2) {
            typeface = Typeface.create(typeface, 2);
        }
        this.uzCIH.setTypeface(typeface);
        isConnected();
    }

    public void setPreferredScrollingDirection(ScrollingDirection scrollingDirection) {
        this.AuCTel.EZpvd(scrollingDirection);
    }

    public void setGravity(int i) {
        if (this.values != i) {
            this.values = i;
            invalidate();
        }
    }

    public void copydefault(Animator.AnimatorListener animatorListener) {
        this.isConnected.addListener(animatorListener);
    }

    public void EZpvd(Animator.AnimatorListener animatorListener) {
        this.isConnected.removeListener(animatorListener);
    }

    public void setPaintFlags(int i) {
        this.uzCIH.setFlags(i);
        isConnected();
    }

    public void setBlurMaskFilter(BlurMaskFilter.Blur blur, float f) {
        if (blur != null && f > 0.0f) {
            this.uzCIH.setMaskFilter(new BlurMaskFilter(f, blur));
        } else {
            setLayerType(1, null);
            this.uzCIH.setMaskFilter(null);
        }
    }

    public final void AEQbTJ() {
        boolean z = this.ejfBZ != AYXKKw();
        boolean z2 = this.fetchVPNInfo != copydefault();
        if (z || z2) {
            requestLayout();
        }
    }

    public final int AYXKKw() {
        return ((int) (this.AYXKKw ? this.DbNXlk.KWHzl() : this.DbNXlk.copydefault())) + getPaddingLeft() + getPaddingRight();
    }

    public final int copydefault() {
        return ((int) this.AuCTel.AEQbTJ()) + getPaddingTop() + getPaddingBottom();
    }

    public final void isConnected() {
        this.AuCTel.EZpvd();
        AEQbTJ();
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.ejfBZ = AYXKKw();
        this.fetchVPNInfo = copydefault();
        setMeasuredDimension(View.resolveSize(this.ejfBZ, i), View.resolveSize(this.fetchVPNInfo, i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.getFieldNames.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        EZpvd(canvas);
        canvas.translate(0.0f, this.AuCTel.KWHzl());
        this.DbNXlk.AEQbTJ(canvas, this.uzCIH);
        canvas.restore();
    }

    public final void EZpvd(Canvas canvas) {
        EZpvd(canvas, this.values, this.getFieldNames, this.DbNXlk.KWHzl(), this.AuCTel.AEQbTJ());
    }

    public static void EZpvd(Canvas canvas, int i, Rect rect, float f, float f2) {
        int iWidth = rect.width();
        int iHeight = rect.height();
        float f3 = (i & 16) == 16 ? rect.top + ((iHeight - f2) / 2.0f) : 0.0f;
        float f4 = (i & 1) == 1 ? rect.left + ((iWidth - f) / 2.0f) : 0.0f;
        if ((i & 48) == 48) {
            f3 = 0.0f;
        }
        if ((i & 80) == 80) {
            f3 = rect.top + (iHeight - f2);
        }
        if ((i & 8388611) == 8388611) {
            f4 = 0.0f;
        }
        if ((i & 8388613) == 8388613) {
            f4 = rect.left + (iWidth - f);
        }
        canvas.translate(f4, f3);
        canvas.clipRect(0.0f, 0.0f, f, f2);
    }

    private void copydefault(String str) {
        this.fARcdN = str;
        this.DbNXlk.OLrzqt(str == null ? new char[0] : str.toCharArray());
        setContentDescription(str);
    }

    public final void fetchVPNInfo() {
        TaskDescription taskDescription = this.fJNWhG;
        this.AkhnZx = taskDescription;
        this.fJNWhG = null;
        if (taskDescription == null) {
            return;
        }
        copydefault(taskDescription.EZpvd);
        this.isConnected.setStartDelay(taskDescription.copydefault);
        this.isConnected.setDuration(taskDescription.AEQbTJ);
        this.isConnected.setInterpolator(taskDescription.KWHzl);
        this.isConnected.start();
    }

    public static final class TaskDescription {
        public final long AEQbTJ;
        public final String EZpvd;
        public final Interpolator KWHzl;
        public final long copydefault;

        public TaskDescription(String str, long j, long j2, Interpolator interpolator) {
            this.EZpvd = str;
            this.copydefault = j;
            this.AEQbTJ = j2;
            this.KWHzl = interpolator;
        }
    }
}
