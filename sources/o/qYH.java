package o;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.market.widget.calendar.AttrsHolder;
import com.okinc.market.widget.calendar.DayItem;
import java.util.Calendar;
import java.util.Date;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40497qYa;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYH extends android.widget.LinearLayout implements InterfaceC40497qYa {
    public final AttrsHolder AEQbTJ;
    public final qYS EZpvd;
    public android.animation.ValueAnimator KWHzl;
    public qYJ<?> OLrzqt;
    public final /* synthetic */ C40500qYd copydefault;
    public yHO<? super Date, ? super java.lang.Integer, ? super java.lang.Integer, Unit> djBIcL;
    public final ViewPager2 gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qYH(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qYH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHO<? super java.util.Date, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit>, o.yHO<java.util.Date, java.lang.Integer, java.lang.Integer, kotlin.Unit> */
    public final yHO<Date, java.lang.Integer, java.lang.Integer, Unit> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40497qYa
    public java.lang.Boolean KWHzl(@NotNull android.view.ViewGroup viewGroup, android.view.View view, @NotNull android.view.MotionEvent motionEvent, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.copydefault.KWHzl(viewGroup, view, motionEvent, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMonthChangedCallback(yHO<? super Date, ? super java.lang.Integer, ? super java.lang.Integer, Unit> yho) {
        this.djBIcL = yho;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.qYH.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qYH(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qYH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        java.lang.Object objM7377constructorimpl;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new C40500qYd();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(AttrsHolder.Companion.copydefault(context, attributeSet));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("CalendarView", "Failed to parse attrs", thM7380exceptionOrNullimpl);
        }
        AttrsHolder attrsHolder = (AttrsHolder) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        attrsHolder = attrsHolder == null ? new AttrsHolder(null, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0, false, false, false, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, false, 0.0f, 0, 0, 0.0f, 0, false, false, 0.0f, 0, false, false, false, 0, false, false, false, null, null, null, null, 0.0f, 0.0f, -1, 8191, null) : attrsHolder;
        this.AEQbTJ = attrsHolder;
        qYS qys = new qYS(context, attrsHolder);
        this.EZpvd = qys;
        setOrientation(1);
        final qYW qyw = new qYW(context, attrsHolder);
        addView(qyw);
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.gEmmrt = viewPager2;
        viewPager2.setAdapter(qys);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: o.qYH.5
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i2) {
                Date dateEZpvd = qYH.this.EZpvd.EZpvd(i2);
                if (dateEZpvd != null) {
                    qYH qyh = qYH.this;
                    yHO<Date, java.lang.Integer, java.lang.Integer, Unit> yhoEZpvd = qyh.EZpvd();
                    if (yhoEZpvd != null) {
                        yhoEZpvd.invoke(dateEZpvd, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(qyh.EZpvd.getItemCount()));
                    }
                    qyh.copydefault(i2);
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i2) {
                qYJ qyj = qYH.this.OLrzqt;
                if (qyj != null) {
                    qyj.EZpvd();
                }
            }
        });
        addView(viewPager2, -1, -2);
        attrsHolder.KWHzl(new Function1() { // from class: o.qYG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qYH.copydefault(this.EZpvd, qyw, (DayItem) obj);
            }
        });
        attrsHolder.AEQbTJ(new Function1() { // from class: o.qYE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(qYH.KWHzl(this.KWHzl, (DayItem) obj));
            }
        });
        attrsHolder.copydefault(new Function1() { // from class: o.qYK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(qYH.copydefault(this.AEQbTJ, (DayItem) obj));
            }
        });
        RecyclerView recyclerViewGEmmrt = gEmmrt();
        if (recyclerViewGEmmrt != null) {
            recyclerViewGEmmrt.setItemAnimator(null);
        }
        djBIcL();
    }

    public static final Unit copydefault(qYH qyh, qYW qyw, DayItem dayItem) {
        Intrinsics.checkNotNullParameter(dayItem, "");
        qYJ<?> qyj = qyh.OLrzqt;
        if (qyj != null) {
            qyj.KWHzl(dayItem, qyw.getHeight());
        }
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl(qYH qyh, DayItem dayItem) {
        Intrinsics.checkNotNullParameter(dayItem, "");
        scrollTo$default(qyh, dayItem.OLrzqt(), false, 2, null);
        return true;
    }

    public static final boolean copydefault(qYH qyh, DayItem dayItem) {
        Intrinsics.checkNotNullParameter(dayItem, "");
        scrollTo$default(qyh, dayItem.OLrzqt(), false, 2, null);
        return false;
    }

    private final void djBIcL() {
        if (isInEditMode()) {
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "");
            Calendar calendarAEQbTJ = qYU.AEQbTJ(calendar);
            Calendar calendar2 = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar2, "");
            Calendar calendarAEQbTJ2 = qYU.AEQbTJ(calendar2);
            calendarAEQbTJ2.add(2, 1);
            Date time = calendarAEQbTJ.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            Date time2 = calendarAEQbTJ2.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "");
            setMonthRange$default(this, time, time2, null, 4, null);
        }
    }

    public static /* synthetic */ void scrollTo$default(qYH qyh, Date date, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        qyh.AEQbTJ(date, z);
    }

    public final void AEQbTJ(Date date, boolean z) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.EZpvd.EZpvd(date));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            this.gEmmrt.setCurrentItem(iIntValue, z);
            OLrzqt(iIntValue);
        }
    }

    public final void copydefault(int i) {
        Date dateEZpvd = this.EZpvd.EZpvd(i);
        if (dateEZpvd == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateEZpvd);
        calendar.setFirstDayOfWeek(this.AEQbTJ.uzCIH() == AttrsHolder.FirstDayOfWeek.SUNDAY ? 1 : 2);
        calendar.set(5, 1);
        calendar.setMinimalDaysInFirstWeek(1);
        int actualMaximum = (int) (calendar.getActualMaximum(4) * this.AEQbTJ.djBIcL());
        if (this.gEmmrt.getLayoutParams().height != actualMaximum) {
            OLrzqt(this.gEmmrt.getHeight(), actualMaximum);
        }
    }

    public static final void OLrzqt(qYH qyh, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        ViewPager2 viewPager2 = qyh.gEmmrt;
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iIntValue;
            viewPager2.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void OLrzqt(int i) {
        copydefault(i);
    }

    private final RecyclerView gEmmrt() {
        android.view.View childAt = this.gEmmrt.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    public static /* synthetic */ void setMonthRange$default(qYH qyh, Date date, Date date2, Date date3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            date3 = date2;
        }
        qyh.setMonthRange(date, date2, date3);
    }

    public final void setMonthRange(@NotNull Date date, @NotNull Date date2, @NotNull Date date3) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(date2, "");
        Intrinsics.checkNotNullParameter(date3, "");
        this.EZpvd.KWHzl(date, date2);
        setCurrentMonth(date3, false);
    }

    public static /* synthetic */ void setCurrentMonth$default(qYH qyh, Date date, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        qyh.setCurrentMonth(date, z);
    }

    public final void setCurrentMonth(@NotNull Date date, boolean z) {
        Intrinsics.checkNotNullParameter(date, "");
        qYJ<?> qyj = this.OLrzqt;
        if (qyj != null) {
            qyj.EZpvd();
        }
        AEQbTJ(date, z);
    }

    public final Date OLrzqt() {
        return this.EZpvd.EZpvd(this.gEmmrt.getCurrentItem());
    }

    public static /* synthetic */ void toNextMonth$default(qYH qyh, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        qyh.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        qYJ<?> qyj = this.OLrzqt;
        if (qyj != null) {
            qyj.EZpvd();
        }
        ViewPager2 viewPager2 = this.gEmmrt;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, z);
        OLrzqt(this.gEmmrt.getCurrentItem());
    }

    public static /* synthetic */ void toPreMonth$default(qYH qyh, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        qyh.copydefault(z);
    }

    public final void copydefault(boolean z) {
        qYJ<?> qyj = this.OLrzqt;
        if (qyj != null) {
            qyj.EZpvd();
        }
        this.gEmmrt.setCurrentItem(r0.getCurrentItem() - 1, z);
        OLrzqt(this.gEmmrt.getCurrentItem());
    }

    public final void setMonthExtra(@NotNull Date date, @NotNull java.util.List<qYM> list) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(list, "");
        qYJ<?> qyj = this.OLrzqt;
        if (qyj != null) {
            qyj.EZpvd();
        }
        this.EZpvd.EZpvd(date, list);
    }

    public static /* synthetic */ void setupMarketView$default(qYH qyh, ViewBinding viewBinding, Function2 function2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = pVX.ActionBar.AhwBna;
        }
        qyh.setupMarketView(viewBinding, function2, i);
    }

    public final <T extends ViewBinding> void setupMarketView(@NotNull T t, @NotNull final Function2<? super T, ? super qYM, Unit> function2, @androidx.annotation.IdRes int i) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(function2, "");
        qYJ<?> qyj = this.OLrzqt;
        if (qyj != null) {
            qyj.EZpvd();
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.OLrzqt = new qYJ<>(context, this, t, i, new Function2() { // from class: o.qYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return qYH.EZpvd(function2, (DayItem) obj, (ViewBinding) obj2);
            }
        });
    }

    public static final Unit EZpvd(Function2 function2, DayItem dayItem, ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(dayItem, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        function2.invoke(viewBinding, dayItem.KWHzl());
        return Unit.INSTANCE;
    }

    public final int KWHzl() {
        return this.gEmmrt.getCurrentItem();
    }

    public final int copydefault() {
        return this.EZpvd.getItemCount();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        InterfaceC40497qYa.StateListAnimator.handleInterceptTouchEvent$default(this, this, this.gEmmrt, motionEvent, false, 8, null);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void AEQbTJ() {
        qYJ<?> qyj = this.OLrzqt;
        if (qyj != null) {
            qyj.OLrzqt();
        }
    }

    public final void OLrzqt(int i, int i2) {
        if (i == 0) {
            ViewPager2 viewPager2 = this.gEmmrt;
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i2;
                viewPager2.setLayoutParams(layoutParams);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (i == i2) {
            return;
        }
        android.animation.ValueAnimator valueAnimator = this.KWHzl;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            android.animation.ValueAnimator valueAnimator2 = this.KWHzl;
            java.lang.Object animatedValue = valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null;
            java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
            if (num != null) {
                i = num.intValue();
            }
        }
        android.animation.ValueAnimator valueAnimator3 = this.KWHzl;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.qYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator4) {
                qYH.OLrzqt(this.AEQbTJ, valueAnimator4);
            }
        });
        this.KWHzl = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }
}
