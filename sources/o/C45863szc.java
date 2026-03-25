package o;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.szc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45863szc extends ConstraintLayout {
    public final java.util.List<LottieAnimationView> AEQbTJ;
    public final java.util.HashMap<java.lang.Integer, java.lang.String> EZpvd;
    public int KWHzl;
    public final long OLrzqt;
    public Function1<? super java.lang.Integer, Unit> copydefault;
    public final AbstractC47533trr djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45863szc(@NotNull android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45863szc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45863szc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<java.lang.Integer, Unit> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRatingClickListener(Function1<? super java.lang.Integer, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int, int):void (m)] (LINE:16) call: o.szc.<init>(android.content.Context, android.util.AttributeSet, int, int):void type: THIS */
    public /* synthetic */ C45863szc(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45863szc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.HashMap<>();
        this.OLrzqt = 70L;
        AbstractC47533trr abstractC47533trrOLrzqt = AbstractC47533trr.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        this.djBIcL = abstractC47533trrOLrzqt;
        java.util.List listGEmmrt = yDY.gEmmrt(abstractC47533trrOLrzqt.copydefault, abstractC47533trrOLrzqt.AYXKKw, abstractC47533trrOLrzqt.AhwBna, abstractC47533trrOLrzqt.valueOf, abstractC47533trrOLrzqt.gEmmrt);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            arrayList.add(((C47532trq) it.next()).EZpvd);
        }
        this.AEQbTJ = arrayList;
        int i3 = 0;
        for (java.lang.Object obj : listGEmmrt) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            final C47532trq c47532trq = (C47532trq) obj;
            final float f = 0.5f;
            c47532trq.EZpvd.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.szk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    C45863szc.EZpvd(c47532trq, f, valueAnimator);
                }
            });
            android.widget.FrameLayout root = c47532trq.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, this, i3));
            i3++;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C47315tni.FragmentManager.fIwbmz, 0, 0);
        try {
            java.lang.String string = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.ejfBZ);
            if (string != null) {
                this.EZpvd.put(1, string);
            }
            java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.fJNWhG);
            if (string2 != null) {
                this.EZpvd.put(2, string2);
            }
            java.lang.String string3 = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.AuCTel);
            if (string3 != null) {
                this.EZpvd.put(3, string3);
            }
            java.lang.String string4 = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.getFieldNames);
            if (string4 != null) {
                this.EZpvd.put(4, string4);
            }
            java.lang.String string5 = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.uzCIH);
            if (string5 != null) {
                this.EZpvd.put(5, string5);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
            KWHzl();
        }
    }

    private final int AEQbTJ() {
        return this.AEQbTJ.size();
    }

    public static final void EZpvd(C47532trq c47532trq, float f, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        if (c47532trq.EZpvd.getSpeed() > 0.0f) {
            c47532trq.KWHzl.setVisibility(valueAnimator.getAnimatedFraction() >= f ? 4 : 0);
        } else {
            c47532trq.KWHzl.setVisibility(valueAnimator.getAnimatedFraction() <= f ? 4 : 0);
        }
    }

    public final void KWHzl() {
        this.djBIcL.EZpvd.setText(this.EZpvd.get(1));
        this.djBIcL.OLrzqt.setText(this.EZpvd.get(java.lang.Integer.valueOf(AEQbTJ())));
    }

    public final boolean EZpvd(int i) {
        return 1 <= i && i <= AEQbTJ();
    }

    public final void setActiveStar(int i) {
        if (EZpvd(i)) {
            AEQbTJ(i);
            OLrzqt(i);
        } else {
            EZpvd(false);
            OLrzqt(0);
        }
    }

    public final void OLrzqt(int i) {
        int i2;
        int iValueOf = C56548yJl.valueOf(this.KWHzl, i);
        int iCopydefault = C56548yJl.copydefault(this.KWHzl, i);
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        int i3 = this.KWHzl;
        if (i > i3) {
            for (final int i4 = iValueOf; i4 < iCopydefault; i4++) {
                handler.postDelayed(new java.lang.Runnable() { // from class: o.szf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45863szc.OLrzqt(this.copydefault, i4);
                    }
                }, this.OLrzqt * ((long) (i4 - iValueOf)));
            }
        } else if (i < i3 && (i2 = iValueOf + 1) <= iCopydefault) {
            final int i5 = iCopydefault;
            while (true) {
                handler.postDelayed(new java.lang.Runnable() { // from class: o.szd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45863szc.AEQbTJ(this.EZpvd, i5);
                    }
                }, (-this.OLrzqt) * ((long) (i5 - iCopydefault)));
                if (i5 == i2) {
                    break;
                } else {
                    i5--;
                }
            }
        }
        this.KWHzl = i;
    }

    public static final void OLrzqt(C45863szc c45863szc, int i) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) CollectionsKt___CollectionsKt.AkhnZx(c45863szc.AEQbTJ, i);
        if (lottieAnimationView != null) {
            lottieAnimationView.setSpeed(1.0f);
            lottieAnimationView.playAnimation();
        }
    }

    public static final void AEQbTJ(C45863szc c45863szc, int i) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) CollectionsKt___CollectionsKt.AkhnZx(c45863szc.AEQbTJ, i - 1);
        if (lottieAnimationView != null) {
            lottieAnimationView.setSpeed(-2.0f);
            lottieAnimationView.playAnimation();
        }
    }

    /* JADX INFO: renamed from: o.szc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C45863szc EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C45863szc c45863szc, int i) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c45863szc;
            this.copydefault = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1<java.lang.Integer, Unit> function1Copydefault = this.EZpvd.copydefault();
                if (function1Copydefault != null) {
                    function1Copydefault.invoke(java.lang.Integer.valueOf(this.copydefault + 1));
                }
            }
        }
    }

    private final void AEQbTJ(int i) {
        if (this.EZpvd.containsKey(java.lang.Integer.valueOf(i))) {
            this.djBIcL.KWHzl.setText(this.EZpvd.get(java.lang.Integer.valueOf(i)));
            EZpvd(true);
        } else {
            EZpvd(false);
        }
    }

    public final void EZpvd(boolean z) {
        if (z) {
            android.widget.TextView textView = this.djBIcL.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            android.widget.TextView textView2 = this.djBIcL.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            android.widget.TextView textView3 = this.djBIcL.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            return;
        }
        android.widget.TextView textView4 = this.djBIcL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(8);
        android.widget.TextView textView5 = this.djBIcL.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(0);
        android.widget.TextView textView6 = this.djBIcL.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(0);
    }

    public final void setStarLabels(@NotNull java.util.HashMap<java.lang.Integer, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        for (Map.Entry<java.lang.Integer, java.lang.String> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            java.lang.String value = entry.getValue();
            if (EZpvd(iIntValue)) {
                this.EZpvd.put(java.lang.Integer.valueOf(iIntValue), value);
            }
        }
        KWHzl();
    }
}
