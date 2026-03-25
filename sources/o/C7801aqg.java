package o;

import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C7343ahz;
import o.C7801aqg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aqg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7801aqg extends android.widget.RelativeLayout {
    public ViewPager.OnPageChangeListener AEQbTJ;
    public Application AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public ViewPager.OnPageChangeListener EZpvd;
    public float KWHzl;
    public ViewPager OLrzqt;
    public android.graphics.Typeface copydefault;
    public java.util.List<TaskDescription> djBIcL;
    public ViewPager gEmmrt;
    public java.lang.Boolean isConnected;
    public int valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7801aqg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7801aqg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFontSizePx(float f) {
        this.KWHzl = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFontTypeface(android.graphics.Typeface typeface) {
        this.copydefault = typeface;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemSpacing(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemWidth(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextColor(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewPager(@NotNull ViewPager viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "");
        this.OLrzqt = viewPager;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.aqg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C7801aqg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7801aqg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = C55298xhM.dp2px$default(62.0f, null, 1, null);
        this.AkhnZx = C33070mpX.copydefault(C52761wXj.Activity.DeEinT);
        this.KWHzl = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.gkJEwt);
        Application application = new Application();
        application.KWHzl(new Function1() { // from class: o.aqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7801aqg.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        });
        this.AYXKKw = application;
        android.view.View.inflate(context, C7343ahz.Activity.zLjUOn, this);
        this.gEmmrt = (ViewPager) findViewById(C7343ahz.TaskDescription.hDKMBd);
    }

    public static final Unit EZpvd(C7801aqg c7801aqg, int i) {
        c7801aqg.isConnected = java.lang.Boolean.TRUE;
        c7801aqg.AEQbTJ(i);
        return Unit.INSTANCE;
    }

    public final void setItems(@NotNull java.util.List<TaskDescription> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<TaskDescription> list2 = this.djBIcL;
        if (list2 == null || !Intrinsics.EZpvd(list2, list)) {
            ViewPager.OnPageChangeListener onPageChangeListener = this.AEQbTJ;
            ViewPager viewPager = null;
            if (onPageChangeListener != null) {
                ViewPager viewPager2 = this.OLrzqt;
                if (viewPager2 == null) {
                    Intrinsics.gEmmrt("");
                    viewPager2 = null;
                }
                viewPager2.removeOnPageChangeListener(onPageChangeListener);
            }
            ViewPager.OnPageChangeListener onPageChangeListener2 = this.EZpvd;
            if (onPageChangeListener2 != null) {
                this.gEmmrt.removeOnPageChangeListener(onPageChangeListener2);
            }
            pUU.EZpvd("peiyong", "items:" + list);
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iEZpvd = (c33566myq.EZpvd(context) - this.valueOf) / 2;
            this.gEmmrt.setPaddingRelative(iEZpvd, 0, iEZpvd, 0);
            this.gEmmrt.setOffscreenPageLimit(list.size());
            this.gEmmrt.setPageMargin(this.AhwBna);
            this.AYXKKw.copydefault(this.AkhnZx);
            this.AYXKKw.OLrzqt(this.KWHzl);
            this.AYXKKw.OLrzqt(this.copydefault);
            Application application = this.AYXKKw;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            application.AEQbTJ(context2, list);
            this.gEmmrt.setAdapter(this.AYXKKw);
            ViewPager viewPager3 = this.gEmmrt;
            ViewPager viewPager4 = this.OLrzqt;
            if (viewPager4 == null) {
                Intrinsics.gEmmrt("");
                viewPager4 = null;
            }
            viewPager3.setCurrentItem(viewPager4.getCurrentItem(), false);
            setScaleView(this.AYXKKw.KWHzl(this.gEmmrt.getCurrentItem()), 0.0f);
            this.djBIcL = list;
            ViewPager viewPager5 = this.OLrzqt;
            if (viewPager5 == null) {
                Intrinsics.gEmmrt("");
                viewPager5 = null;
            }
            viewPager5.setOffscreenPageLimit(list.size());
            this.AEQbTJ = new ActionBar();
            ViewPager viewPager6 = this.OLrzqt;
            if (viewPager6 == null) {
                Intrinsics.gEmmrt("");
                viewPager6 = null;
            }
            viewPager6.setOnTouchListener(new View.OnTouchListener() { // from class: o.aqf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return C7801aqg.copydefault(this.OLrzqt, view, motionEvent);
                }
            });
            ViewPager viewPager7 = this.OLrzqt;
            if (viewPager7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                viewPager = viewPager7;
            }
            ViewPager.OnPageChangeListener onPageChangeListener3 = this.AEQbTJ;
            Intrinsics.copydefault(onPageChangeListener3);
            viewPager.addOnPageChangeListener(onPageChangeListener3);
            this.EZpvd = new Activity();
            this.gEmmrt.setOnTouchListener(new View.OnTouchListener() { // from class: o.aqj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return C7801aqg.EZpvd(this.AEQbTJ, view, motionEvent);
                }
            });
            ViewPager viewPager8 = this.gEmmrt;
            ViewPager.OnPageChangeListener onPageChangeListener4 = this.EZpvd;
            Intrinsics.copydefault(onPageChangeListener4);
            viewPager8.addOnPageChangeListener(onPageChangeListener4);
        }
    }

    /* JADX INFO: renamed from: o.aqg$ActionBar */
    public static final class ActionBar implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }

        public ActionBar() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (Intrinsics.EZpvd(C7801aqg.this.isConnected, java.lang.Boolean.TRUE)) {
                return;
            }
            if (C7801aqg.this.values != 0.0f) {
                if (f > C7801aqg.this.values) {
                    android.view.View viewKWHzl = C7801aqg.this.AYXKKw.KWHzl(i);
                    android.view.View viewKWHzl2 = C7801aqg.this.AYXKKw.KWHzl(i + 1);
                    C7801aqg.this.setScaleView(viewKWHzl, f);
                    C7801aqg.this.setScaleView(viewKWHzl2, 1 - f);
                } else {
                    android.view.View viewKWHzl3 = C7801aqg.this.AYXKKw.KWHzl(i + 1);
                    android.view.View viewKWHzl4 = C7801aqg.this.AYXKKw.KWHzl(i);
                    C7801aqg.this.setScaleView(viewKWHzl3, 1 - f);
                    C7801aqg.this.setScaleView(viewKWHzl4, f);
                }
                int width = C7801aqg.this.gEmmrt.getWidth();
                int pageMargin = C7801aqg.this.gEmmrt.getPageMargin();
                int iMulD$default = (int) C33129mqd.mulD$default(java.lang.Double.valueOf(C33129mqd.addD$default(java.lang.Integer.valueOf(i), java.lang.Float.valueOf(f), null, null, null, 14, null)), java.lang.Integer.valueOf(((width + pageMargin) - C7801aqg.this.gEmmrt.getPaddingStart()) - C7801aqg.this.gEmmrt.getPaddingEnd()), null, null, null, 14, null);
                if (C7801aqg.this.gEmmrt.getScrollX() != iMulD$default) {
                    C7801aqg.this.gEmmrt.setScrollX(iMulD$default);
                }
            }
            if (f == 0.0f) {
                C7801aqg.this.gEmmrt.setCurrentItem(i, false);
            }
            C7801aqg.this.values = f;
        }
    }

    public static final boolean copydefault(C7801aqg c7801aqg, android.view.View view, android.view.MotionEvent motionEvent) {
        c7801aqg.isConnected = java.lang.Boolean.FALSE;
        return false;
    }

    /* JADX INFO: renamed from: o.aqg$Activity */
    public static final class Activity implements ViewPager.OnPageChangeListener {
        public int AEQbTJ;
        public float copydefault;

        public Activity() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (Intrinsics.EZpvd(C7801aqg.this.isConnected, java.lang.Boolean.FALSE)) {
                return;
            }
            float f2 = this.copydefault;
            if (f2 != 0.0f && f != 0.0f && f != 1.0f) {
                if (f > f2) {
                    android.view.View viewKWHzl = C7801aqg.this.AYXKKw.KWHzl(i);
                    android.view.View viewKWHzl2 = C7801aqg.this.AYXKKw.KWHzl(i + 1);
                    C7801aqg.this.setScaleView(viewKWHzl, f);
                    C7801aqg.this.setScaleView(viewKWHzl2, 1 - f);
                } else {
                    android.view.View viewKWHzl3 = C7801aqg.this.AYXKKw.KWHzl(i + 1);
                    android.view.View viewKWHzl4 = C7801aqg.this.AYXKKw.KWHzl(i);
                    C7801aqg.this.setScaleView(viewKWHzl3, 1 - f);
                    C7801aqg.this.setScaleView(viewKWHzl4, f);
                }
            }
            if (f == 0.0f) {
                int count = C7801aqg.this.AYXKKw.getCount();
                for (int i3 = 0; i3 < count; i3++) {
                    if (i == i3) {
                        C7801aqg c7801aqg = C7801aqg.this;
                        c7801aqg.setScaleView(c7801aqg.AYXKKw.KWHzl(i3), 0.0f);
                    } else {
                        C7801aqg c7801aqg2 = C7801aqg.this;
                        c7801aqg2.setScaleView(c7801aqg2.AYXKKw.KWHzl(i3), 1.0f);
                    }
                }
            }
            this.copydefault = f;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            C7801aqg.this.gEmmrt.getCurrentItem();
            this.AEQbTJ = i;
            ViewPager viewPager = C7801aqg.this.OLrzqt;
            if (viewPager == null) {
                Intrinsics.gEmmrt("");
                viewPager = null;
            }
            viewPager.setCurrentItem(this.AEQbTJ, false);
            if (C7801aqg.this.isConnected == null) {
                int count = C7801aqg.this.AYXKKw.getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    if (i == i2) {
                        C7801aqg c7801aqg = C7801aqg.this;
                        c7801aqg.setScaleView(c7801aqg.AYXKKw.KWHzl(i2), 0.0f);
                    } else {
                        C7801aqg c7801aqg2 = C7801aqg.this;
                        c7801aqg2.setScaleView(c7801aqg2.AYXKKw.KWHzl(i2), 1.0f);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            Intrinsics.EZpvd(C7801aqg.this.isConnected, java.lang.Boolean.FALSE);
        }
    }

    public static final boolean EZpvd(C7801aqg c7801aqg, android.view.View view, android.view.MotionEvent motionEvent) {
        c7801aqg.isConnected = java.lang.Boolean.TRUE;
        return false;
    }

    public final void setScaleView(android.view.View view, float f) {
        if (view == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(C7343ahz.TaskDescription.getFieldNames);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(C7343ahz.TaskDescription.finit);
        float f2 = (float) (((double) 1) - (((double) f) * 0.5d));
        imageView.setAlpha(f2);
        textView.setAlpha(f2);
        Intrinsics.copydefault(imageView);
        int iOLrzqt = (int) (C7809aqo.Companion.OLrzqt() * f);
        imageView.setPadding(iOLrzqt, iOLrzqt, iOLrzqt, iOLrzqt);
    }

    public final void AEQbTJ(int i) {
        this.gEmmrt.setCurrentItem(i, true);
        ViewPager viewPager = this.OLrzqt;
        if (viewPager == null) {
            Intrinsics.gEmmrt("");
            viewPager = null;
        }
        viewPager.setCurrentItem(i, false);
    }

    /* JADX INFO: renamed from: o.aqg$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public java.lang.String EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Item(title=" + this.EZpvd + ", url=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:256) call: o.aqg.TaskDescription.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof TaskDescription) {
                TaskDescription taskDescription = (TaskDescription) obj;
                if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: o.aqg$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application extends PagerAdapter {
        public Function1<? super java.lang.Integer, Unit> OLrzqt;
        public android.graphics.Typeface copydefault;
        public int valueOf = C33070mpX.copydefault(C52761wXj.Activity.DeEinT);
        public float AEQbTJ = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.gkJEwt);
        public final java.util.List<TaskDescription> EZpvd = new java.util.ArrayList();
        public final java.util.ArrayList<android.view.View> KWHzl = new java.util.ArrayList<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(Function1<? super java.lang.Integer, Unit> function1) {
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(float f) {
            this.AEQbTJ = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(android.graphics.Typeface typeface) {
            this.copydefault = typeface;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.valueOf = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NotNull android.view.View view, @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return view == obj;
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.util.List<TaskDescription> list) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd.clear();
            this.EZpvd.addAll(list);
            this.KWHzl.clear();
            for (TaskDescription taskDescription : this.EZpvd) {
                android.view.View viewInflate = android.view.View.inflate(context, C7343ahz.Activity.wlaJM, null);
                android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C7343ahz.TaskDescription.getFieldNames);
                int iDp2px$default = C55298xhM.dp2px$default(42.0f, null, 1, null);
                Intrinsics.copydefault(imageView);
                C33054mpH.AEQbTJ(imageView, taskDescription.KWHzl(), iDp2px$default, iDp2px$default);
                android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C7343ahz.TaskDescription.finit);
                textView.setTextColor(this.valueOf);
                textView.setText(taskDescription.EZpvd());
                textView.setTextSize(0, this.AEQbTJ);
                this.KWHzl.add(viewInflate);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.EZpvd.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.Object instantiateItem(@NotNull android.view.ViewGroup viewGroup, final int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View view = this.KWHzl.get(i);
            Intrinsics.checkNotNullExpressionValue(view, "");
            android.view.View view2 = view;
            view2.setOnClickListener(new View.OnClickListener() { // from class: o.aqm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    C7801aqg.Application.AEQbTJ(this.KWHzl, i, view3);
                }
            });
            viewGroup.addView(view2);
            return view2;
        }

        public static final void AEQbTJ(Application application, int i, android.view.View view) {
            Function1<? super java.lang.Integer, Unit> function1 = application.OLrzqt;
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(i));
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull android.view.ViewGroup viewGroup, int i, @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(obj, "");
            if (obj instanceof android.view.View) {
                viewGroup.removeView((android.view.View) obj);
            }
        }

        public final android.view.View KWHzl(int i) {
            return (android.view.View) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
        }
    }
}
