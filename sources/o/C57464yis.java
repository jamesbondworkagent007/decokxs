package o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yis, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57464yis extends android.widget.LinearLayout {
    public boolean KWHzl;
    public final AbstractC57375yhI OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57464yis(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57464yis(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.yis.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57464yis(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57464yis(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC57375yhI abstractC57375yhIEZpvd = AbstractC57375yhI.EZpvd(android.view.LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(abstractC57375yhIEZpvd, "");
        this.OLrzqt = abstractC57375yhIEZpvd;
        this.KWHzl = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57406yhn.Fragment.fJNWhG);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.fARcdN);
        setFoldTitleInfo(string != null ? string : "");
        setOrientation(1);
        typedArrayObtainStyledAttributes.recycle();
        setPadding(0, 0, 0, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(this.OLrzqt.getRoot());
    }

    public final void setViewDataBean(@NotNull TransactionFoldInfoDataBean transactionFoldInfoDataBean) {
        Intrinsics.checkNotNullParameter(transactionFoldInfoDataBean, "");
        if (this.OLrzqt.getRoot().getParent() == null) {
            addView(this.OLrzqt.getRoot());
        }
        setFoldTitleInfo(transactionFoldInfoDataBean.getFoldTitle());
        if (this.KWHzl) {
            AEQbTJ();
            this.KWHzl = false;
        }
        setFoldExpandStatus(transactionFoldInfoDataBean.isExpand());
        KWHzl(transactionFoldInfoDataBean.getClickCallback());
    }

    public final void setFoldTitleInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public final void AEQbTJ() {
        for (android.view.View view : EZpvd()) {
            view.setTag(view.getId(), java.lang.Integer.valueOf(view.getVisibility()));
        }
    }

    public static /* synthetic */ void setFoldExpandStatus$default(C57464yis c57464yis, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57464yis.setFoldExpandStatus(z);
    }

    public final void setFoldExpandStatus(boolean z) {
        if (z) {
            this.OLrzqt.OLrzqt.setRotation(180.0f);
            copydefault(EZpvd());
            OLrzqt(true);
        } else {
            this.OLrzqt.OLrzqt.setRotation(0.0f);
            EZpvd(EZpvd());
            OLrzqt(false);
        }
    }

    private final void EZpvd(java.util.ArrayList<android.view.View> arrayList) {
        C56404yEc.zsXlph(arrayList);
        float f = 0.0f;
        for (android.view.View view : arrayList) {
            int height = view.getHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i = 0;
            float f2 = f + height + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r3.bottomMargin : 0);
            view.setTranslationY(-f2);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            }
            f = f2 + i;
        }
    }

    public final boolean copydefault() {
        return this.OLrzqt.OLrzqt.getRotation() == 180.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(boolean z) {
        int i;
        for (android.view.View view : EZpvd()) {
            if (z) {
                i = 0;
                if (!Intrinsics.EZpvd(view.getTag(view.getId()), (java.lang.Object) 0)) {
                    i = 8;
                }
            }
            view.setVisibility(i);
        }
    }

    private final java.util.ArrayList<android.view.View> EZpvd() {
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            arrayList.add(getChildAt(i));
        }
        return arrayList;
    }

    public final void setViewTagVisibility(@NotNull android.view.View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setTag(view.getId(), java.lang.Integer.valueOf(z ? 0 : 8));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yis */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFoldArrowClickListener$default(C57464yis c57464yis, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57464yis.KWHzl(function0);
    }

    private final void KWHzl(final Function0<Unit> function0) {
        this.OLrzqt.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.yiy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C57464yis.setFoldArrowClickListener$lambda$4(this.OLrzqt, function0, view);
            }
        });
    }

    public static final void setFoldArrowClickListener$lambda$4(C57464yis c57464yis, Function0 function0, android.view.View view) {
        c57464yis.setCustomViewVisibility();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setCustomViewVisibility() {
        if (copydefault()) {
            EZpvd(false);
        } else {
            EZpvd(true);
        }
    }

    private final void EZpvd(boolean z) {
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(EZpvd());
        if (z) {
            AEQbTJ(arrayList);
        } else {
            OLrzqt(arrayList);
        }
    }

    public final void AEQbTJ(java.util.ArrayList<android.view.View> arrayList) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        C56404yEc.zsXlph(arrayList);
        for (android.view.View view : arrayList) {
            view.getHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            }
            arrayList2.add(android.animation.ObjectAnimator.ofFloat(view, "translationY", -view.getHeight(), 0.0f));
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            }
        }
        arrayList2.add(android.animation.ObjectAnimator.ofFloat(this.OLrzqt.EZpvd, "translationY", 0.0f, 0.0f));
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(100L);
        animatorSet.addListener(new TaskDescription());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: o.yis$TaskDescription */
    public static final class TaskDescription implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C57464yis.this.OLrzqt(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C57464yis.this.OLrzqt.OLrzqt.setRotation(180.0f);
        }
    }

    public final void OLrzqt(java.util.ArrayList<android.view.View> arrayList) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        C56404yEc.zsXlph(arrayList);
        float f = 0.0f;
        for (android.view.View view : arrayList) {
            int height = view.getHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i = 0;
            float f2 = f + height + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r8.bottomMargin : 0);
            arrayList2.add(android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, -f2));
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            }
            f = f2 + i;
        }
        arrayList2.add(android.animation.ObjectAnimator.ofFloat(this.OLrzqt.EZpvd, "translationY", 0.0f, 0.0f));
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(100L);
        animatorSet.addListener(new Activity());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: o.yis$Activity */
    public static final class Activity implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C57464yis.this.OLrzqt(false);
            C57464yis.this.OLrzqt.OLrzqt.setRotation(0.0f);
        }
    }

    private final void copydefault(java.util.ArrayList<android.view.View> arrayList) {
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setTranslationY(0.0f);
        }
    }
}
