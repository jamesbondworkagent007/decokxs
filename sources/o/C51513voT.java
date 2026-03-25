package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.uilab.banner.OKBannerLayout;
import com.okinc.unify_trade.biz.RecommendBulletItem;
import com.okinc.unify_trade.biz.RecommendBulletMPDataB;
import com.okinc.unify_trade.biz.RecommendInvestItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C48033uCm;
import o.C51513voT;
import o.C52761wXj;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51513voT extends AbstractC59533zio<RecommendBulletMPDataB, StateListAnimator> {
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51513voT() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: o.voT$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j) {
            this.copydefault = view;
            this.AEQbTJ = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.copydefault;
                Intrinsics.copydefault(constraintLayout);
                android.app.Activity activityKWHzl = C35334ntP.KWHzl(constraintLayout);
                C55867xrz.clickForNewNmpRecommend$default(C55867xrz.KWHzl, null, 1, null);
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activityKWHzl, "social/trade/community?location=HOT&channel=trade_bot_main_page_smartpicks_card", null, Dialog.copydefault, 4, null);
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:389) call: o.voT.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51513voT(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51513voT(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uWB uwbAEQbTJ = uWB.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(uwbAEQbTJ, "");
        return new StateListAnimator(uwbAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        super.onViewAttachedToWindow(stateListAnimator);
        OKBannerLayout oKBannerLayout = stateListAnimator.OLrzqt().AEQbTJ;
        if (!oKBannerLayout.EZpvd() || oKBannerLayout.KWHzl() <= 1) {
            return;
        }
        oKBannerLayout.djBIcL();
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull StateListAnimator stateListAnimator) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewTreeObserver viewTreeObserver2;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        super.onViewDetachedFromWindow(stateListAnimator);
        android.animation.ValueAnimator valueAnimatorKWHzl = stateListAnimator.KWHzl();
        if (valueAnimatorKWHzl != null) {
            valueAnimatorKWHzl.cancel();
        }
        stateListAnimator.EZpvd(null);
        java.lang.Object objAEQbTJ = stateListAnimator.AEQbTJ();
        if (objAEQbTJ != null) {
            try {
                android.view.View viewEZpvd = stateListAnimator.EZpvd();
                if (viewEZpvd != null && (viewTreeObserver2 = viewEZpvd.getViewTreeObserver()) != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(objAEQbTJ instanceof ViewTreeObserver.OnGlobalLayoutListener ? (ViewTreeObserver.OnGlobalLayoutListener) objAEQbTJ : null);
                }
                android.view.View viewEZpvd2 = stateListAnimator.EZpvd();
                if (viewEZpvd2 != null && (viewTreeObserver = viewEZpvd2.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnPreDrawListener(objAEQbTJ instanceof ViewTreeObserver.OnPreDrawListener ? (ViewTreeObserver.OnPreDrawListener) objAEQbTJ : null);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (java.lang.Exception unused) {
                Unit unit2 = Unit.INSTANCE;
            }
        }
        stateListAnimator.AEQbTJ(null);
        stateListAnimator.copydefault(null);
        OKBannerLayout oKBannerLayout = stateListAnimator.OLrzqt().AEQbTJ;
        if (!oKBannerLayout.EZpvd() || oKBannerLayout.KWHzl() <= 1) {
            return;
        }
        oKBannerLayout.AhwBna();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final StateListAnimator stateListAnimator, @NotNull RecommendBulletMPDataB recommendBulletMPDataB) {
        java.util.List listValueOf;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(recommendBulletMPDataB, "");
        java.util.List<RecommendBulletItem> bulletChatInfo = recommendBulletMPDataB.getBulletChatInfo();
        if (bulletChatInfo != null && (listValueOf = CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) bulletChatInfo, 2)) != null) {
            C51604vqE c51604vqE = new C51604vqE(listValueOf, this.KWHzl);
            final OKBannerLayout oKBannerLayout = stateListAnimator.OLrzqt().AEQbTJ;
            oKBannerLayout.OLrzqt(true);
            oKBannerLayout.OLrzqt(5000L);
            oKBannerLayout.OLrzqt(1);
            oKBannerLayout.EZpvd(new ActionBar(oKBannerLayout, this, stateListAnimator));
            oKBannerLayout.setAdapter(c51604vqE);
            oKBannerLayout.post(new java.lang.Runnable() { // from class: o.voQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C51513voT.copydefault(oKBannerLayout, this, stateListAnimator);
                }
            });
        }
        java.util.List<RecommendInvestItem> latestInvestors = recommendBulletMPDataB.getLatestInvestors();
        if (latestInvestors != null) {
            C51648vqw.refreshCircleCoins$default(stateListAnimator.OLrzqt().KWHzl, CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) latestInvestors, 3), 0, 0, 6, null);
        }
        uWB uwbOLrzqt = stateListAnimator.OLrzqt();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = (uwbOLrzqt.KWHzl.KWHzl() * 3) + 1;
        uwbOLrzqt.KWHzl.getViewTreeObserver().addOnPreDrawListener(new Activity(intRef, uwbOLrzqt));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialRtjmuc);
        android.text.SpannableString spannableString = new android.text.SpannableString(strAYXKKw + " ");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(stateListAnimator.itemView.getContext(), C52761wXj.TaskDescription.DlmWDR);
        Intrinsics.copydefault(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        try {
            android.content.Context context = stateListAnimator.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C55296xhK.OLrzqt(context)) {
                DrawableCompat.setLayoutDirection(drawable, 1);
            }
        } catch (java.lang.Exception unused) {
        }
        spannableString.setSpan(new C51602vqC(drawable), strAYXKKw.length(), strAYXKKw.length() + 1, 17);
        stateListAnimator.OLrzqt().AhwBna.setText(spannableString);
        ConstraintLayout constraintLayout = stateListAnimator.OLrzqt().copydefault;
        constraintLayout.setOnClickListener(new Application(constraintLayout, 1000L));
    }

    /* JADX INFO: renamed from: o.voT$ActionBar */
    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ StateListAnimator AEQbTJ;
        public final /* synthetic */ OKBannerLayout EZpvd;
        public final /* synthetic */ C51513voT OLrzqt;

        public ActionBar(OKBannerLayout oKBannerLayout, C51513voT c51513voT, StateListAnimator stateListAnimator) {
            this.EZpvd = oKBannerLayout;
            this.OLrzqt = c51513voT;
            this.AEQbTJ = stateListAnimator;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            android.view.View childAt = this.EZpvd.getChildAt(0);
            ViewPager2 viewPager2 = childAt instanceof ViewPager2 ? (ViewPager2) childAt : null;
            if (viewPager2 != null) {
                C51513voT c51513voT = this.OLrzqt;
                StateListAnimator stateListAnimator = this.AEQbTJ;
                if (viewPager2.getVisibility() == 0 && viewPager2.isAttachedToWindow()) {
                    OKBannerLayout oKBannerLayout = stateListAnimator.OLrzqt().AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(oKBannerLayout, "");
                    c51513voT.copydefault(viewPager2, oKBannerLayout, stateListAnimator);
                }
            }
        }
    }

    public static final void copydefault(OKBannerLayout oKBannerLayout, C51513voT c51513voT, StateListAnimator stateListAnimator) {
        android.view.View childAt = oKBannerLayout.getChildAt(0);
        ViewPager2 viewPager2 = childAt instanceof ViewPager2 ? (ViewPager2) childAt : null;
        if (viewPager2 != null && viewPager2.getVisibility() == 0 && viewPager2.isAttachedToWindow()) {
            OKBannerLayout oKBannerLayout2 = stateListAnimator.OLrzqt().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(oKBannerLayout2, "");
            c51513voT.copydefault(viewPager2, oKBannerLayout2, stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: o.voT$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ uWB AEQbTJ;
        public final /* synthetic */ Ref.IntRef OLrzqt;

        public Activity(Ref.IntRef intRef, uWB uwb) {
            this.OLrzqt = intRef;
            this.AEQbTJ = uwb;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.OLrzqt.element == 0) {
                this.AEQbTJ.KWHzl.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            this.OLrzqt.element--;
            android.text.SpannableString spannableString = new android.text.SpannableString(C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialhOMIpD) + "  ");
            C51648vqw c51648vqw = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c51648vqw, "");
            android.graphics.drawable.Drawable drawableViewToDrawable$default = C55296xhK.viewToDrawable$default(c51648vqw, 0, 0, 3, null);
            if (drawableViewToDrawable$default != null) {
                drawableViewToDrawable$default.setBounds(0, 0, drawableViewToDrawable$default.getIntrinsicWidth(), drawableViewToDrawable$default.getIntrinsicHeight());
                spannableString.setSpan(new C51602vqC(drawableViewToDrawable$default), spannableString.length() - 1, spannableString.length(), 33);
            }
            AppCompatTextView appCompatTextView = this.AEQbTJ.AYXKKw;
            appCompatTextView.setLineHeight(C33129mqd.AhwBna(java.lang.Float.valueOf(appCompatTextView.getTextSize())));
            this.AEQbTJ.AYXKKw.setText(spannableString);
            this.AEQbTJ.AYXKKw.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0986Activity(this.AEQbTJ));
            return true;
        }

        /* JADX INFO: renamed from: o.voT$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0986Activity implements ViewTreeObserver.OnPreDrawListener {
            public final /* synthetic */ uWB AEQbTJ;

            public ViewTreeObserverOnPreDrawListenerC0986Activity(uWB uwb) {
                this.AEQbTJ = uwb;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (this.AEQbTJ.AYXKKw.getLineCount() > 0) {
                    this.AEQbTJ.AYXKKw.getViewTreeObserver().removeOnPreDrawListener(this);
                    AppCompatImageView appCompatImageView = this.AEQbTJ.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                    C55296xhK.margin$default(appCompatImageView, null, java.lang.Float.valueOf(this.AEQbTJ.AYXKKw.getLineCount() == 1 ? 3.0f : 0.0f), null, null, 13, null);
                    this.AEQbTJ.EZpvd.requestLayout();
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: o.voT$Dialog */
    public static final class Dialog implements Function1<AbstractC43238rlX, Unit> {
        public static final Dialog copydefault = new Dialog();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            EZpvd(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r3 > 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(ViewPager2 viewPager2, final OKBannerLayout oKBannerLayout, StateListAnimator stateListAnimator) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewTreeObserver viewTreeObserver2;
        if (viewPager2.isAttachedToWindow()) {
            int height = 0;
            try {
                android.view.View childAt = viewPager2.getChildAt(0);
                Intrinsics.copydefault(childAt, "");
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((RecyclerView) childAt).findViewHolderForAdapterPosition(viewPager2.getCurrentItem());
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    android.view.View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    if (view.isAttachedToWindow()) {
                        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.SePrCP);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById;
                        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.RZOtbZ);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewFindViewById2;
                        int height2 = viewGroup.getVisibility() == 8 ? 0 : viewGroup.getHeight();
                        if (viewGroup2.getVisibility() != 8) {
                            height = viewGroup2.getHeight();
                        }
                        if (viewGroup.getVisibility() == 8 || height2 > 0) {
                            if (viewGroup2.getVisibility() != 8) {
                            }
                            android.content.Context context = view.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            int iCopydefault = height2 + height + C55298xhM.copydefault(24.0f, context);
                            int height3 = oKBannerLayout.getHeight();
                            if (height3 != iCopydefault) {
                                android.animation.ValueAnimator valueAnimatorKWHzl = stateListAnimator.KWHzl();
                                if (valueAnimatorKWHzl != null) {
                                    valueAnimatorKWHzl.cancel();
                                }
                                android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(height3, iCopydefault);
                                valueAnimatorOfInt.setDuration(150L);
                                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.voV
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                                        C51513voT.OLrzqt(oKBannerLayout, valueAnimator);
                                    }
                                });
                                valueAnimatorOfInt.start();
                                stateListAnimator.EZpvd(valueAnimatorOfInt);
                                return;
                            }
                            return;
                        }
                        java.lang.Object objAEQbTJ = stateListAnimator.AEQbTJ();
                        if (objAEQbTJ != null) {
                            try {
                                android.view.View viewEZpvd = stateListAnimator.EZpvd();
                                if (viewEZpvd != null && (viewTreeObserver2 = viewEZpvd.getViewTreeObserver()) != null) {
                                    viewTreeObserver2.removeOnGlobalLayoutListener(objAEQbTJ instanceof ViewTreeObserver.OnGlobalLayoutListener ? (ViewTreeObserver.OnGlobalLayoutListener) objAEQbTJ : null);
                                }
                                android.view.View viewEZpvd2 = stateListAnimator.EZpvd();
                                if (viewEZpvd2 != null && (viewTreeObserver = viewEZpvd2.getViewTreeObserver()) != null) {
                                    viewTreeObserver.removeOnPreDrawListener(objAEQbTJ instanceof ViewTreeObserver.OnPreDrawListener ? (ViewTreeObserver.OnPreDrawListener) objAEQbTJ : null);
                                    Unit unit = Unit.INSTANCE;
                                }
                            } catch (java.lang.Exception unused) {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        ViewTreeObserver.OnGlobalLayoutListener taskDescription = new TaskDescription(view, stateListAnimator, viewGroup, viewGroup2, oKBannerLayout);
                        stateListAnimator.AEQbTJ(taskDescription);
                        stateListAnimator.copydefault(view);
                        view.getViewTreeObserver().addOnGlobalLayoutListener(taskDescription);
                    }
                }
            } catch (java.lang.Exception unused2) {
                android.animation.ValueAnimator valueAnimatorKWHzl2 = stateListAnimator.KWHzl();
                if (valueAnimatorKWHzl2 != null) {
                    valueAnimatorKWHzl2.cancel();
                }
                android.content.Context context2 = oKBannerLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                int iCopydefault2 = C55298xhM.copydefault(120.0f, context2);
                int height4 = oKBannerLayout.getHeight();
                if (height4 != iCopydefault2) {
                    android.animation.ValueAnimator valueAnimatorOfInt2 = android.animation.ValueAnimator.ofInt(height4, iCopydefault2);
                    valueAnimatorOfInt2.setDuration(150L);
                    valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.voW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                            C51513voT.EZpvd(oKBannerLayout, valueAnimator);
                        }
                    });
                    valueAnimatorOfInt2.start();
                    stateListAnimator.EZpvd(valueAnimatorOfInt2);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = oKBannerLayout.getLayoutParams();
                layoutParams.height = iCopydefault2;
                oKBannerLayout.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void OLrzqt(OKBannerLayout oKBannerLayout, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = oKBannerLayout.getLayoutParams();
        layoutParams.height = iIntValue;
        oKBannerLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: o.voT$TaskDescription */
    public static final class TaskDescription implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ StateListAnimator EZpvd;
        public final /* synthetic */ OKBannerLayout KWHzl;
        public final /* synthetic */ android.view.ViewGroup OLrzqt;
        public final /* synthetic */ android.view.ViewGroup copydefault;

        public TaskDescription(android.view.View view, StateListAnimator stateListAnimator, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, OKBannerLayout oKBannerLayout) {
            this.AEQbTJ = view;
            this.EZpvd = stateListAnimator;
            this.copydefault = viewGroup;
            this.OLrzqt = viewGroup2;
            this.KWHzl = oKBannerLayout;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!this.AEQbTJ.isAttachedToWindow()) {
                try {
                    this.AEQbTJ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } catch (java.lang.Exception unused) {
                }
                this.EZpvd.AEQbTJ(null);
                this.EZpvd.copydefault(null);
                return;
            }
            try {
                this.AEQbTJ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } catch (java.lang.Exception unused2) {
            }
            this.EZpvd.AEQbTJ(null);
            this.EZpvd.copydefault(null);
            int height = this.copydefault.getVisibility() == 8 ? 0 : this.copydefault.getHeight();
            int height2 = this.OLrzqt.getVisibility() != 8 ? this.OLrzqt.getHeight() : 0;
            android.content.Context context = this.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault = height + height2 + C55298xhM.copydefault(24.0f, context);
            int height3 = this.KWHzl.getHeight();
            if (height3 == iCopydefault) {
                return;
            }
            android.animation.ValueAnimator valueAnimatorKWHzl = this.EZpvd.KWHzl();
            if (valueAnimatorKWHzl != null) {
                valueAnimatorKWHzl.cancel();
            }
            StateListAnimator stateListAnimator = this.EZpvd;
            android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(height3, iCopydefault);
            final OKBannerLayout oKBannerLayout = this.KWHzl;
            valueAnimatorOfInt.setDuration(150L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.voY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    C51513voT.TaskDescription.KWHzl(oKBannerLayout, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
            stateListAnimator.EZpvd(valueAnimatorOfInt);
        }

        public static final void KWHzl(OKBannerLayout oKBannerLayout, android.animation.ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            int iIntValue = ((java.lang.Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = oKBannerLayout.getLayoutParams();
            layoutParams.height = iIntValue;
            oKBannerLayout.setLayoutParams(layoutParams);
        }
    }

    public static final void EZpvd(OKBannerLayout oKBannerLayout, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = oKBannerLayout.getLayoutParams();
        layoutParams.height = iIntValue;
        oKBannerLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: o.voT$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public android.view.View AEQbTJ;
        public final uWB EZpvd;
        public java.lang.Object OLrzqt;
        public android.animation.ValueAnimator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Object obj) {
            this.OLrzqt = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(android.animation.ValueAnimator valueAnimator) {
            this.copydefault = valueAnimator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.animation.ValueAnimator KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uWB OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(android.view.View view) {
            this.AEQbTJ = view;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull uWB uwb) {
            super(uwb.getRoot());
            Intrinsics.checkNotNullParameter(uwb, "");
            this.EZpvd = uwb;
        }
    }
}
