package o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.okinc.core.ok_app.ModeManager;
import com.okinc.core.ok_app.api.bean.TabBean;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC33169mrQ;
import o.AbstractC33173mrU;
import o.AbstractC33240msi;
import o.C32113mPz;
import o.C33160mrH;
import o.C33436mwS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33436mwS extends android.widget.FrameLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Function1<? super java.lang.Integer, Unit> AEQbTJ;
    public boolean KWHzl;
    public android.view.ViewGroup OLrzqt;
    public final AbstractC33303mts copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33436mwS(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final boolean OLrzqt(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<java.lang.Integer, Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDismissCallback(Function1<? super java.lang.Integer, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX INFO: renamed from: o.mwS$Activity */
    public static final class Activity implements View.OnLayoutChangeListener {
        public Activity() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            C33436mwS.this.copydefault();
        }
    }

    /* JADX INFO: renamed from: o.mwS$TaskDescription */
    public static final class TaskDescription implements View.OnLayoutChangeListener {
        public TaskDescription() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            C33436mwS.this.copydefault();
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:45) call: o.mwS.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C33436mwS(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33436mwS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C33160mrH.Application.values, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC33303mts) viewDataBindingInflate;
    }

    /* JADX INFO: renamed from: o.mwS$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(@NotNull android.app.Activity activity, int i, @NotNull AbstractC33169mrQ abstractC33169mrQ, @NotNull AbstractC33173mrU abstractC33173mrU) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(abstractC33169mrQ, "");
        Intrinsics.checkNotNullParameter(abstractC33173mrU, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getWindow().getDecorView();
        java.lang.String strKWHzl = null;
        this.OLrzqt = viewGroup != null ? (android.view.ViewGroup) viewGroup.findViewById(android.R.id.content) : null;
        pUU.EZpvd("qjf", "mode=" + i);
        if (i == 1 || i == 2) {
            this.copydefault.OLrzqt.setText(C33070mpX.AYXKKw(C34703nhO.AEQbTJ() ? C33160mrH.TaskDescription.gEmmrt : C33160mrH.TaskDescription.fIwbmz));
        } else if (i == 3) {
            this.copydefault.OLrzqt.setText(getContext().getString(C33160mrH.TaskDescription.getNewProxyInstance));
        } else if (i == 5) {
            this.copydefault.OLrzqt.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.hDKMBd));
        }
        if (Intrinsics.EZpvd(abstractC33173mrU, AbstractC33173mrU.StateListAnimator.copydefault)) {
            if (i == 1 || i == 2) {
                strKWHzl = EZpvd(i);
            }
        } else if (abstractC33173mrU instanceof AbstractC33173mrU.TaskDescription) {
            strKWHzl = ((AbstractC33173mrU.TaskDescription) abstractC33173mrU).KWHzl();
        } else if (!Intrinsics.EZpvd(abstractC33173mrU, AbstractC33173mrU.Activity.EZpvd)) {
            throw new NoWhenBranchMatchedException();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
            AbstractC33303mts abstractC33303mts = this.copydefault;
            abstractC33303mts.copydefault.setVisibility(0);
            abstractC33303mts.copydefault.setText(strKWHzl);
            if (C33492mxV.OLrzqt()) {
                abstractC33303mts.copydefault.setTextColor(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.AEQbTJ));
            } else {
                abstractC33303mts.copydefault.setTextColor(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.OcIXYQ));
            }
        } else {
            this.copydefault.copydefault.setVisibility(8);
        }
        ConstraintLayout constraintLayout = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        if (ViewCompat.isLaidOut(constraintLayout) && !constraintLayout.isLayoutRequested()) {
            copydefault();
        } else {
            constraintLayout.addOnLayoutChangeListener(new Activity());
        }
        this.copydefault.EZpvd.setAlpha(0.0f);
        this.copydefault.KWHzl.setAlpha(0.0f);
        KWHzl(abstractC33169mrQ);
    }

    public final void copydefault() {
        ConstraintLayout constraintLayout = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        int width = constraintLayout.getWidth();
        int width2 = this.copydefault.copydefault.getWidth();
        android.widget.TextView textView = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        this.copydefault.OLrzqt.setMaxWidth((width - width2) - (layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0));
        TextViewCompat.setAutoSizeTextTypeWithDefaults(this.copydefault.OLrzqt, 1);
    }

    public final java.lang.String EZpvd(int i) {
        ModeManager modeManager = ModeManager.EZpvd;
        if (modeManager.isConnected().fIwbmz().size() != 1) {
            if (i == 2) {
                return C33070mpX.AYXKKw(C33160mrH.TaskDescription.djBIcL);
            }
            return i == 1 ? C33070mpX.AYXKKw(C33160mrH.TaskDescription.fJNWhG) : "";
        }
        if (Intrinsics.EZpvd(CollectionsKt___CollectionsKt.AuCTelauCTel(modeManager.isConnected().fIwbmz()), (java.lang.Object) OKComplianceRestrictionService.CefiMode.LITE.getModeName())) {
            if (((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl().getValue() instanceof AbstractC33240msi.Activity) {
                return C33070mpX.AYXKKw(C33160mrH.TaskDescription.AYXKKw);
            }
            return C33070mpX.AYXKKw(C33160mrH.TaskDescription.ejfBZ);
        }
        return C33070mpX.AYXKKw(C33160mrH.TaskDescription.ejfBZ);
    }

    public final void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
        final InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        final C55249xgQ c55249xgQ = this.copydefault.AEQbTJ.copydefault;
        c55249xgQ.setVisibility(0);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        interfaceC33171mrS.KWHzl(new Function1() { // from class: o.mwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33436mwS.AEQbTJ(c55249xgQ, interfaceC33171mrS, objectRef, objectRef2, (java.util.List) obj);
            }
        });
    }

    public final void OLrzqt() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        android.view.ViewGroup viewGroup = this.OLrzqt;
        if (viewGroup != null) {
            viewGroup.addView(this);
        }
    }

    public final void AYXKKw() {
        this.KWHzl = true;
        Function1<? super java.lang.Integer, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            function1.invoke(0);
        }
        valueOf();
    }

    public final void valueOf() {
        post(new java.lang.Runnable() { // from class: o.mwU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C33436mwS.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(C33436mwS c33436mwS) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(c33436mwS.copydefault.EZpvd, "alpha", 0.0f, 1.0f), android.animation.ObjectAnimator.ofFloat(c33436mwS.copydefault.KWHzl, "alpha", 0.0f, 1.0f), android.animation.ObjectAnimator.ofFloat(c33436mwS.copydefault.EZpvd, "translationY", 0.0f, -50.0f), android.animation.ObjectAnimator.ofFloat(c33436mwS.copydefault.KWHzl, "translationY", 0.0f, -50.0f));
        animatorSet.setDuration(400L);
        animatorSet.addListener(c33436mwS.new ActionBar());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: o.mwS$ActionBar */
    public static final class ActionBar implements Animator.AnimatorListener {
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

        public ActionBar() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            Function1<java.lang.Integer, Unit> function1AEQbTJ = C33436mwS.this.AEQbTJ();
            if (function1AEQbTJ != null) {
                function1AEQbTJ.invoke(1);
            }
            final C33436mwS c33436mwS = C33436mwS.this;
            c33436mwS.postDelayed(new java.lang.Runnable() { // from class: o.mwZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C33436mwS.ActionBar.EZpvd(c33436mwS);
                }
            }, 400L);
        }

        public static final void EZpvd(C33436mwS c33436mwS) {
            c33436mwS.KWHzl();
        }
    }

    public final void KWHzl() {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.Animator[] animatorArr = new android.animation.Animator[3];
        animatorArr[0] = android.animation.ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        AbstractC33303mts abstractC33303mts = this.copydefault;
        animatorArr[1] = android.animation.ObjectAnimator.ofFloat(abstractC33303mts != null ? abstractC33303mts.EZpvd : null, "alpha", 1.0f, 0.0f);
        AbstractC33303mts abstractC33303mts2 = this.copydefault;
        animatorArr[2] = android.animation.ObjectAnimator.ofFloat(abstractC33303mts2 != null ? abstractC33303mts2.KWHzl : null, "alpha", 1.0f, 0.0f);
        animatorSet.playTogether(animatorArr);
        animatorSet.setDuration(250L);
        animatorSet.addListener(new StateListAnimator());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: o.mwS$StateListAnimator */
    public static final class StateListAnimator implements Animator.AnimatorListener {
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

        public StateListAnimator() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C33436mwS.this.EZpvd();
            Function1<java.lang.Integer, Unit> function1AEQbTJ = C33436mwS.this.AEQbTJ();
            if (function1AEQbTJ != null) {
                function1AEQbTJ.invoke(2);
            }
        }
    }

    public final void EZpvd() {
        this.KWHzl = false;
        android.view.ViewGroup viewGroup = this.OLrzqt;
        if (viewGroup != null) {
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
            this.OLrzqt = null;
        }
    }

    public static /* synthetic */ void init$default(C33436mwS c33436mwS, android.app.Activity activity, int i, AbstractC33169mrQ abstractC33169mrQ, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, AbstractC33173mrU abstractC33173mrU, int i2, java.lang.Object obj) {
        if ((i2 & 32) != 0) {
            abstractC33173mrU = AbstractC33173mrU.StateListAnimator.copydefault;
        }
        c33436mwS.AEQbTJ(activity, i, abstractC33169mrQ, charSequence, charSequence2, abstractC33173mrU);
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity, int i, @NotNull AbstractC33169mrQ abstractC33169mrQ, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, @NotNull AbstractC33173mrU abstractC33173mrU) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(abstractC33169mrQ, "");
        Intrinsics.checkNotNullParameter(abstractC33173mrU, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getWindow().getDecorView();
        this.OLrzqt = viewGroup != null ? (android.view.ViewGroup) viewGroup.findViewById(android.R.id.content) : null;
        pUU.EZpvd("TradeModeChangeAnimView", "mode=" + i);
        if (charSequence != null && C33129mqd.OLrzqt(charSequence)) {
            copydefault(charSequence, charSequence2);
            KWHzl(abstractC33169mrQ);
        } else {
            copydefault(activity, i, abstractC33169mrQ, abstractC33173mrU);
        }
    }

    public final void KWHzl(AbstractC33169mrQ abstractC33169mrQ) {
        InterfaceC33237msf interfaceC33237msf;
        if (Intrinsics.EZpvd(abstractC33169mrQ, AbstractC33169mrQ.Application.OLrzqt)) {
            this.copydefault.AEQbTJ.copydefault.setVisibility(8);
            return;
        }
        if (!(abstractC33169mrQ instanceof AbstractC33169mrQ.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        if (ModeManager.EZpvd.isConnected().AEQbTJ(OKComplianceRestrictionService.CefiMode.LITE) || ((interfaceC33237msf = (InterfaceC33237msf) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC33237msf.class))) != null && interfaceC33237msf.AEQbTJ())) {
            this.copydefault.AEQbTJ.copydefault.setVisibility(8);
        } else {
            AbstractC33169mrQ.TaskDescription taskDescription = (AbstractC33169mrQ.TaskDescription) abstractC33169mrQ;
            AEQbTJ(taskDescription.EZpvd(), taskDescription.OLrzqt());
        }
    }

    public final void copydefault(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        this.copydefault.OLrzqt.setText(charSequence);
        if (C33129mqd.OLrzqt(charSequence2)) {
            AbstractC33303mts abstractC33303mts = this.copydefault;
            abstractC33303mts.copydefault.setVisibility(0);
            abstractC33303mts.copydefault.setText(charSequence2);
            if (C33492mxV.OLrzqt()) {
                abstractC33303mts.copydefault.setTextColor(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.AEQbTJ));
            } else {
                abstractC33303mts.copydefault.setTextColor(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.OcIXYQ));
            }
        } else {
            this.copydefault.copydefault.setVisibility(8);
        }
        ConstraintLayout constraintLayout = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        if (ViewCompat.isLaidOut(constraintLayout) && !constraintLayout.isLayoutRequested()) {
            copydefault();
        } else {
            constraintLayout.addOnLayoutChangeListener(new TaskDescription());
        }
        this.copydefault.EZpvd.setAlpha(0.0f);
        this.copydefault.KWHzl.setAlpha(0.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.xgQ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.google.android.material.tabs.TabLayout$Tab] */
    public static final Unit AEQbTJ(C55249xgQ c55249xgQ, InterfaceC33171mrS interfaceC33171mrS, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            TabBean tabBean = (TabBean) it.next();
            ?? NewTab = c55249xgQ.newTab();
            NewTab.setText(tabBean.getTabName());
            NewTab.setId(tabBean.getId());
            NewTab.view.setOnTouchListener(new View.OnTouchListener() { // from class: o.mwT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return C33436mwS.OLrzqt(view, motionEvent);
                }
            });
            if (NewTab.getId() == 0) {
                objectRef2.element = NewTab;
            } else if (NewTab.getId() == 1) {
                objectRef.element = NewTab;
            }
            NewTab.setContentDescription(NewTab.getId() + "_tab");
            c55249xgQ.addTab(NewTab);
        }
        c55249xgQ.selectTab((TabLayout.Tab) (interfaceC33171mrS.fIwbmz() ? objectRef.element : objectRef2.element));
        return Unit.INSTANCE;
    }
}
