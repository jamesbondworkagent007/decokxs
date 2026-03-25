package com.scwang.smartrefresh.header;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o.AbstractC57946yrx;
import o.C57863yqT;
import o.C57867yqX;
import o.C57940yrr;
import o.InterfaceC57933yrk;
import o.InterfaceC57934yrl;
import o.InterpolatorC57905yrI;
import o.ViewTreeObserverOnPreDrawListenerC57868yqY;

/* JADX INFO: loaded from: classes24.dex */
public class WaveSwipeHeader extends AbstractC57946yrx implements InterfaceC57933yrk {
    public Activity AEQbTJ;
    public C57867yqX EZpvd;
    public ViewTreeObserverOnPreDrawListenerC57868yqY KWHzl;
    public float OLrzqt;
    public RefreshState copydefault;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SECOND' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class VERTICAL_DRAG_THRESHOLD {
        private static final /* synthetic */ VERTICAL_DRAG_THRESHOLD[] $VALUES;
        public static final VERTICAL_DRAG_THRESHOLD FIRST;
        public static final VERTICAL_DRAG_THRESHOLD SECOND;
        public static final VERTICAL_DRAG_THRESHOLD THIRD;
        final float val;

        public static VERTICAL_DRAG_THRESHOLD valueOf(String str) {
            return (VERTICAL_DRAG_THRESHOLD) Enum.valueOf(VERTICAL_DRAG_THRESHOLD.class, str);
        }

        public static VERTICAL_DRAG_THRESHOLD[] values() {
            return (VERTICAL_DRAG_THRESHOLD[]) $VALUES.clone();
        }

        static {
            VERTICAL_DRAG_THRESHOLD vertical_drag_threshold = new VERTICAL_DRAG_THRESHOLD("FIRST", 0, 0.1f);
            FIRST = vertical_drag_threshold;
            VERTICAL_DRAG_THRESHOLD vertical_drag_threshold2 = new VERTICAL_DRAG_THRESHOLD("SECOND", 1, vertical_drag_threshold.val + 0.16f);
            SECOND = vertical_drag_threshold2;
            VERTICAL_DRAG_THRESHOLD vertical_drag_threshold3 = new VERTICAL_DRAG_THRESHOLD("THIRD", 2, vertical_drag_threshold.val + 0.5f);
            THIRD = vertical_drag_threshold3;
            $VALUES = new VERTICAL_DRAG_THRESHOLD[]{vertical_drag_threshold, vertical_drag_threshold2, vertical_drag_threshold3};
        }

        private VERTICAL_DRAG_THRESHOLD(String str, int i, float f) {
            this.val = f;
        }
    }

    public WaveSwipeHeader(Context context) {
        this(context, null);
    }

    public WaveSwipeHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.AuCTelauCTel = C57940yrr.EZpvd;
        ViewTreeObserverOnPreDrawListenerC57868yqY viewTreeObserverOnPreDrawListenerC57868yqY = new ViewTreeObserverOnPreDrawListenerC57868yqY(context);
        this.KWHzl = viewTreeObserverOnPreDrawListenerC57868yqY;
        addView(viewTreeObserverOnPreDrawListenerC57868yqY);
        Activity activity = new Activity(context);
        this.AEQbTJ = activity;
        addView(activity);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57863yqT.TaskDescription.values);
        int color = typedArrayObtainStyledAttributes.getColor(C57863yqT.TaskDescription.fJNWhG, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(C57863yqT.TaskDescription.AuCTel, 0);
        if (color != 0) {
            this.KWHzl.setWaveColor(color);
        }
        if (color2 != 0) {
            this.EZpvd.OLrzqt(color2);
        } else {
            this.EZpvd.OLrzqt(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C57863yqT.TaskDescription.ejfBZ)) {
            this.KWHzl.setShadow(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C57863yqT.TaskDescription.ejfBZ, 0), typedArrayObtainStyledAttributes.getColor(C57863yqT.TaskDescription.fIwbmz, ViewCompat.MEASURED_STATE_MASK));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        ViewTreeObserverOnPreDrawListenerC57868yqY viewTreeObserverOnPreDrawListenerC57868yqY = this.KWHzl;
        Activity activity = this.AEQbTJ;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.EZpvd.getIntrinsicWidth(), 1073741824);
        activity.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        viewTreeObserverOnPreDrawListenerC57868yqY.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewTreeObserverOnPreDrawListenerC57868yqY viewTreeObserverOnPreDrawListenerC57868yqY = this.KWHzl;
        Activity activity = this.AEQbTJ;
        viewTreeObserverOnPreDrawListenerC57868yqY.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = activity.getMeasuredWidth();
        activity.layout((measuredWidth - measuredWidth2) / 2, -activity.getMeasuredHeight(), (measuredWidth + measuredWidth2) / 2, 0);
        if (isInEditMode()) {
            copydefault(true, 0.99f, InterpolatorC57905yrI.OLrzqt(99.0f), InterpolatorC57905yrI.OLrzqt(100.0f), InterpolatorC57905yrI.OLrzqt(100.0f));
        }
    }

    public void setColorSchemeColors(int... iArr) {
        this.EZpvd.OLrzqt(iArr);
    }

    public void setColorSchemeColorIds(@IdRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = ContextCompat.getColor(context, iArr[1]);
        }
        this.EZpvd.OLrzqt(iArr2);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void copydefault(boolean z, float f, int i, int i2, int i3) {
        if (z) {
            if (this.copydefault == RefreshState.Refreshing) {
                return;
            }
            Activity activity = this.AEQbTJ;
            float fMax = (((float) Math.max(((double) Math.min(1.0f, f)) - 0.4d, AudioStats.AUDIO_AMPLITUDE_NONE)) * 5.0f) / 3.0f;
            float f2 = f > 3.0f ? 2.0f : f > 1.0f ? f - 1.0f : 0.0f;
            float f3 = ((4.0f - f2) * f2) / 8.0f;
            if (f < 1.0f) {
                this.EZpvd.EZpvd(0.0f, Math.min(0.8f, fMax * 0.8f));
                this.EZpvd.AEQbTJ(Math.min(1.0f, fMax));
            }
            this.EZpvd.EZpvd((((fMax * 0.4f) - 0.25f) + (f3 * 2.0f)) * 0.5f);
            activity.setTranslationY(this.KWHzl.KWHzl());
            float fMin = (i * 1.0f) / Math.min(getMeasuredWidth(), getMeasuredHeight());
            float f4 = (fMin * (5.0f - (2.0f * fMin))) / 3.5f;
            float f5 = VERTICAL_DRAG_THRESHOLD.FIRST.val;
            float f6 = f4 - f5;
            float f7 = VERTICAL_DRAG_THRESHOLD.SECOND.val;
            float f8 = (f4 - f7) / 5.0f;
            this.OLrzqt = f4;
            if (f4 < f5) {
                this.KWHzl.copydefault(f4);
                return;
            } else if (f4 < f7) {
                this.KWHzl.AEQbTJ(f4, f6);
                return;
            } else {
                this.KWHzl.EZpvd(f4, f6, f8);
                return;
            }
        }
        if (this.OLrzqt == 0.0f || this.copydefault != RefreshState.None) {
            return;
        }
        this.EZpvd.KWHzl(false);
        this.EZpvd.EZpvd(0.0f);
        this.EZpvd.EZpvd(0.0f, 0.0f);
        this.KWHzl.OLrzqt(this.OLrzqt);
        this.OLrzqt = 0.0f;
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void OLrzqt(@NonNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        this.OLrzqt = 0.0f;
        this.KWHzl.copydefault();
        this.EZpvd.setAlpha(255);
        this.EZpvd.start();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scwang.smartrefresh.header.WaveSwipeHeader.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                WaveSwipeHeader waveSwipeHeader = WaveSwipeHeader.this;
                waveSwipeHeader.AEQbTJ.setTranslationY(waveSwipeHeader.KWHzl.KWHzl() + (r0.getHeight() / 2.0f));
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: com.scwang.smartrefresh.header.WaveSwipeHeader$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[RefreshState.values().length];
            EZpvd = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EZpvd[RefreshState.ReleaseToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EZpvd[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EZpvd[RefreshState.PullDownToRefresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EZpvd[RefreshState.PullDownCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57908yrL
    public void OLrzqt(@NonNull InterfaceC57934yrl interfaceC57934yrl, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        Activity activity = this.AEQbTJ;
        this.copydefault = refreshState2;
        int i = AnonymousClass3.EZpvd[refreshState2.ordinal()];
        if (i == 4) {
            this.EZpvd.KWHzl(true);
            activity.setScaleX(1.0f);
            activity.setScaleY(1.0f);
            this.EZpvd.setAlpha(255);
            return;
        }
        if (i != 5) {
            return;
        }
        this.EZpvd.KWHzl(false);
        this.EZpvd.EZpvd(0.0f);
        this.EZpvd.EZpvd(0.0f, 0.0f);
        this.KWHzl.OLrzqt(this.OLrzqt);
        this.OLrzqt = 0.0f;
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@NonNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        final Activity activity = this.AEQbTJ;
        Animation animation = new Animation() { // from class: com.scwang.smartrefresh.header.WaveSwipeHeader.5
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                float f2 = 1.0f - f;
                activity.setScaleX(f2);
                activity.setScaleY(f2);
            }
        };
        animation.setDuration(200L);
        this.AEQbTJ.setAnimationListener(new Animation.AnimationListener() { // from class: com.scwang.smartrefresh.header.WaveSwipeHeader.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation2) {
                WaveSwipeHeader.this.EZpvd.stop();
                WaveSwipeHeader.this.EZpvd.setAlpha(255);
                WaveSwipeHeader.this.KWHzl.djBIcL();
            }
        });
        activity.clearAnimation();
        activity.startAnimation(animation);
        return 0;
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            this.KWHzl.setWaveColor(iArr[0]);
            if (iArr.length > 1) {
                this.EZpvd.OLrzqt(iArr[1]);
            }
        }
    }

    public static boolean OLrzqt() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return ((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f;
    }

    public class Activity extends ImageView {
        public Animation.AnimationListener AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setAnimationListener(Animation.AnimationListener animationListener) {
            this.AEQbTJ = animationListener;
        }

        @Override // android.view.View
        public void onAnimationStart() {
            super.onAnimationStart();
            Animation.AnimationListener animationListener = this.AEQbTJ;
            if (animationListener != null) {
                animationListener.onAnimationStart(getAnimation());
            }
        }

        @Override // android.view.View
        public void onAnimationEnd() {
            super.onAnimationEnd();
            Animation.AnimationListener animationListener = this.AEQbTJ;
            if (animationListener != null) {
                animationListener.onAnimationEnd(getAnimation());
            }
        }

        public Activity(Context context) {
            super(context);
            WaveSwipeHeader.this.EZpvd = new C57867yqX(WaveSwipeHeader.this);
            if (WaveSwipeHeader.OLrzqt()) {
                WaveSwipeHeader.this.EZpvd.OLrzqt(0);
            }
            super.setImageDrawable(WaveSwipeHeader.this.EZpvd);
        }
    }
}
