package o;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mHZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mHV implements View.OnTouchListener {
    public boolean AYXKKw;
    public android.animation.ValueAnimator AhwBna;
    public final int AkhnZx;
    public final boolean DbNXlk;
    public android.animation.ValueAnimator djBIcL;
    public final java.util.List<android.view.View> fIwbmz;
    public android.animation.ValueAnimator fetchVPNInfo;
    public final android.view.View gEmmrt;
    public android.animation.ValueAnimator isConnected;
    public final android.view.View valueOf;
    public boolean values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final Activity AEQbTJ = new Activity(100, 1.0f, 0.97f);
    public static final Activity KWHzl = new Activity(100, 0.97f, 1.0f);
    public static final Activity copydefault = new Activity(100, 0.0f, 255.0f);
    public static final Activity OLrzqt = new Activity(100, 255.0f, 0.0f);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    public mHV(@NotNull android.view.View view, android.view.View view2, @NotNull java.util.List<? extends android.view.View> list, boolean z, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = view;
        this.valueOf = view2;
        this.fIwbmz = list;
        this.DbNXlk = z;
        this.AkhnZx = i;
        this.AYXKKw = z;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (!this.AYXKKw) {
            return false;
        }
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            if (!this.values) {
                this.values = true;
                OLrzqt();
                return true;
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            this.values = false;
            if (view != null) {
                view.performClick();
            }
            copydefault();
        } else if (numValueOf != null && numValueOf.intValue() == 3 && this.values) {
            this.values = false;
            copydefault();
        }
        return false;
    }

    public final void EZpvd(boolean z) {
        if (z) {
            this.AYXKKw = true;
            return;
        }
        if (this.AYXKKw) {
            if (this.values) {
                android.animation.ValueAnimator valueAnimator = this.fetchVPNInfo;
                if (valueAnimator != null) {
                    valueAnimator.end();
                }
                android.animation.ValueAnimator valueAnimator2 = this.AhwBna;
                if (valueAnimator2 != null) {
                    valueAnimator2.end();
                }
                copydefault();
            } else {
                EZpvd();
            }
            this.AYXKKw = false;
            this.values = false;
        }
    }

    public final void AEQbTJ() {
        EZpvd();
        android.view.View view = this.gEmmrt;
        Activity activity = KWHzl;
        view.setScaleX(activity.EZpvd());
        this.gEmmrt.setScaleY(activity.EZpvd());
        android.view.View view2 = this.valueOf;
        if (view2 != null) {
            view2.setAlpha(OLrzqt.EZpvd());
        }
        this.AYXKKw = this.DbNXlk;
        this.values = false;
    }

    public final void OLrzqt() {
        final android.view.View view;
        mHZ.Activity activity = mHZ.Companion;
        if (activity.AEQbTJ(this.AkhnZx)) {
            this.fetchVPNInfo = AEQbTJ(Activity.copy$default(AEQbTJ, 0L, 0.0f, EZpvd(this.AkhnZx), 3, null), new Function1() { // from class: o.mIb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mHV.EZpvd(this.copydefault, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        if (!activity.EZpvd(this.AkhnZx, 4) || (view = this.valueOf) == null) {
            return;
        }
        this.AhwBna = AEQbTJ(copydefault, new Function1() { // from class: o.mId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mHV.EZpvd(view, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit EZpvd(mHV mhv, float f) {
        mhv.gEmmrt.setScaleX(f);
        mhv.gEmmrt.setScaleY(f);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.view.View view, float f) {
        view.setAlpha(f);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        final android.view.View view;
        mHZ.Activity activity = mHZ.Companion;
        if (activity.AEQbTJ(this.AkhnZx)) {
            this.isConnected = AEQbTJ(Activity.copy$default(KWHzl, 0L, EZpvd(this.AkhnZx), 0.0f, 5, null), new Function1() { // from class: o.mHY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mHV.copydefault(this.OLrzqt, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        if (!activity.EZpvd(this.AkhnZx, 4) || (view = this.valueOf) == null) {
            return;
        }
        this.djBIcL = AEQbTJ(OLrzqt, new Function1() { // from class: o.mHU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mHV.OLrzqt(view, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit copydefault(mHV mhv, float f) {
        mhv.gEmmrt.setScaleX(f);
        mhv.gEmmrt.setScaleY(f);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.view.View view, float f) {
        view.setAlpha(f);
        return Unit.INSTANCE;
    }

    public final android.animation.ValueAnimator AEQbTJ(Activity activity, final Function1<? super java.lang.Float, Unit> function1) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(activity.KWHzl(), activity.EZpvd());
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(activity.AEQbTJ());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mHX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                mHV.OLrzqt(function1, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        return valueAnimatorOfFloat;
    }

    public static final void OLrzqt(Function1 function1, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        function1.invoke((java.lang.Float) animatedValue);
    }

    public final void EZpvd() {
        android.animation.ValueAnimator valueAnimator = this.fetchVPNInfo;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.AhwBna;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimator3 = this.isConnected;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        android.animation.ValueAnimator valueAnimator4 = this.djBIcL;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
    }

    public final float EZpvd(int i) {
        return mHZ.Companion.EZpvd(i, 2) ? 0.9f : 0.97f;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        public final float AEQbTJ;
        public final long EZpvd;
        public final float KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, long j, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                f = activity.KWHzl;
            }
            if ((i & 4) != 0) {
                f2 = activity.AEQbTJ;
            }
            return activity.KWHzl(j, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(long j, float f, float f2) {
            return new Activity(j, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.EZpvd == activity.EZpvd && java.lang.Float.compare(this.KWHzl, activity.KWHzl) == 0 && java.lang.Float.compare(this.AEQbTJ, activity.AEQbTJ) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Long.hashCode(this.EZpvd) * 31) + java.lang.Float.hashCode(this.KWHzl)) * 31) + java.lang.Float.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AnimationOptions(durationMs=" + this.EZpvd + ", from=" + this.KWHzl + ", to=" + this.AEQbTJ + ")";
        }

        public Activity(long j, float f, float f2) {
            this.EZpvd = j;
            this.KWHzl = f;
            this.AEQbTJ = f2;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mHV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ mHV applyTouchFeedback$default(TaskDescription taskDescription, android.view.View view, android.view.View view2, java.util.List list, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                view2 = null;
            }
            android.view.View view3 = view2;
            if ((i2 & 8) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                i = 5;
            }
            return taskDescription.AEQbTJ(view, view3, list, z2, i);
        }

        public final mHV AEQbTJ(@NotNull android.view.View view, android.view.View view2, @NotNull java.util.List<? extends android.view.View> list, boolean z, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new mHV(view, view2, list, z, i);
        }
    }
}
