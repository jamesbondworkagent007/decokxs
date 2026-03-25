package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AccordionAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rKo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42214rKo extends android.widget.FrameLayout {
    public java.lang.Boolean AEQbTJ;
    public final AbstractC43803rwF EZpvd;
    public AccordionAppModel KWHzl;
    public boolean OLrzqt;
    public rQO copydefault;
    public final C42519rVw djBIcL;
    public ViewStatus valueOf;

    /* JADX INFO: renamed from: o.rKo$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42214rKo(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42214rKo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.valueOf = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.rKo.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42214rKo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42214rKo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.sSMYrx, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43803rwF) viewDataBindingInflate;
        this.djBIcL = new C42519rVw(context, attributeSet, i);
    }

    public static /* synthetic */ void updateContentVisibilityWithAnimation$default(C42214rKo c42214rKo, java.util.List list, TextStyle textStyle, java.lang.String str, java.lang.Boolean bool, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c42214rKo.AEQbTJ(list, textStyle, str, bool, z);
    }

    public final void AEQbTJ(java.util.List<java.lang.String> list, TextStyle textStyle, java.lang.String str, java.lang.Boolean bool, boolean z) {
        if (this.OLrzqt) {
            return;
        }
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.util.List<java.lang.String> listAhwBna = !Intrinsics.EZpvd(bool, bool2) ? list : yDY.AhwBna();
        float f = !Intrinsics.EZpvd(bool, bool2) ? 180.0f : 0.0f;
        if (!z) {
            KWHzl(listAhwBna, textStyle, str, list.size(), f);
            return;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        int i = 0;
        for (java.lang.Object obj : listAhwBna) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            android.widget.TextView textView = new android.widget.TextView(getContext());
            setTextStyle(textView, (java.lang.String) obj, textStyle, java.lang.Boolean.TRUE, str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(list.size()));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i > 0) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams.topMargin = C55298xhM.copydefault(8.0f, context);
            }
            textView.setLayoutParams(layoutParams);
            linearLayout.addView(textView);
            i = i2;
        }
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(this.EZpvd.AEQbTJ.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight();
        int height = this.EZpvd.AEQbTJ.getHeight();
        this.OLrzqt = true;
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(height, measuredHeight);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.rKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C42214rKo.copydefault(this.copydefault, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new TaskDescription(bool, this, listAhwBna, textStyle, str, list, f));
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.EZpvd.EZpvd.getRotation(), f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.rKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C42214rKo.OLrzqt(this.KWHzl, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfFloat.start();
    }

    public static final void copydefault(C42214rKo c42214rKo, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c42214rKo.EZpvd.AEQbTJ.getLayoutParams().height = ((java.lang.Integer) animatedValue).intValue();
        c42214rKo.EZpvd.AEQbTJ.requestLayout();
    }

    /* JADX INFO: renamed from: o.rKo$TaskDescription */
    public static final class TaskDescription extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ TextStyle AEQbTJ;
        public final /* synthetic */ C42214rKo AYXKKw;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.util.List<java.lang.String> KWHzl;
        public final /* synthetic */ java.lang.Boolean OLrzqt;
        public final /* synthetic */ java.util.List<java.lang.String> copydefault;
        public final /* synthetic */ float djBIcL;

        public TaskDescription(java.lang.Boolean bool, C42214rKo c42214rKo, java.util.List<java.lang.String> list, TextStyle textStyle, java.lang.String str, java.util.List<java.lang.String> list2, float f) {
            this.OLrzqt = bool;
            this.AYXKKw = c42214rKo;
            this.copydefault = list;
            this.AEQbTJ = textStyle;
            this.EZpvd = str;
            this.KWHzl = list2;
            this.djBIcL = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (Intrinsics.EZpvd(this.OLrzqt, java.lang.Boolean.TRUE)) {
                return;
            }
            this.AYXKKw.KWHzl(this.copydefault, this.AEQbTJ, this.EZpvd, this.KWHzl.size(), this.djBIcL);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (Intrinsics.EZpvd(this.OLrzqt, java.lang.Boolean.TRUE)) {
                this.AYXKKw.KWHzl(this.copydefault, this.AEQbTJ, this.EZpvd, this.KWHzl.size(), this.djBIcL);
            }
            this.AYXKKw.EZpvd.AEQbTJ.getLayoutParams().height = -2;
            this.AYXKKw.EZpvd.AEQbTJ.requestLayout();
            this.AYXKKw.OLrzqt = false;
        }
    }

    public static final void OLrzqt(C42214rKo c42214rKo, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        android.widget.ImageView imageView = c42214rKo.EZpvd.EZpvd;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        imageView.setRotation(((java.lang.Float) animatedValue).floatValue());
    }

    public final void KWHzl(java.util.List<java.lang.String> list, TextStyle textStyle, java.lang.String str, int i, float f) {
        this.EZpvd.AEQbTJ.removeAllViews();
        int i2 = 0;
        for (java.lang.Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            android.widget.TextView textView = new android.widget.TextView(getContext());
            setTextStyle(textView, (java.lang.String) obj, textStyle, java.lang.Boolean.TRUE, str, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i2 > 0) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams.topMargin = C55298xhM.copydefault(8.0f, context);
            }
            textView.setLayoutParams(layoutParams);
            this.EZpvd.AEQbTJ.addView(textView);
            i2 = i3;
        }
        android.widget.LinearLayout linearLayout = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        this.EZpvd.EZpvd.setRotation(f);
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            final AccordionAppModel accordionAppModel = uIComponentAppModel instanceof AccordionAppModel ? (AccordionAppModel) uIComponentAppModel : null;
            if (accordionAppModel != null) {
                rGL rgl = (rGL) abstractC42074rFj;
                java.util.Iterator<T> it = rgl.dNCPSb().iterator();
                while (it.hasNext()) {
                    rAX rax = (rAX) it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) accordionAppModel.getId())) {
                        java.lang.String value = accordionAppModel.getValue();
                        int i = 0;
                        if (!java.lang.Boolean.valueOf(true ^ (value == null || value.length() == 0)).booleanValue()) {
                            value = null;
                        }
                        rax.setValue(value);
                        rgl.gasjUx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rKp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42214rKo.AEQbTJ(accordionAppModel, this, (C42156rIk) obj);
                            }
                        }));
                        java.lang.Boolean boolIsHidden = accordionAppModel.isHidden();
                        if (boolIsHidden != null && boolIsHidden.booleanValue()) {
                            i = 8;
                        }
                        setVisibility(i);
                        rgl.zuBGHE().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rKn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42214rKo.KWHzl(accordionAppModel, this, (java.lang.String) obj);
                            }
                        }));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.rKo$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ AccordionAppModel EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C42214rKo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42214rKo c42214rKo, AccordionAppModel accordionAppModel) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c42214rKo;
            this.EZpvd = accordionAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C42214rKo c42214rKo = this.copydefault;
                c42214rKo.AEQbTJ = c42214rKo.AEQbTJ != null ? java.lang.Boolean.valueOf(!r0.booleanValue()) : null;
                this.copydefault.AEQbTJ(this.EZpvd.getContentList(), this.EZpvd.getContentListStyle(), this.EZpvd.getContentListType(), this.copydefault.AEQbTJ, true);
            }
        }
    }

    public static final Unit AEQbTJ(AccordionAppModel accordionAppModel, C42214rKo c42214rKo, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listKWHzl;
        java.lang.Boolean boolIsHidden;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        boolean z = (listCopydefault != null && listCopydefault.contains(accordionAppModel.getId())) || (((listKWHzl = c42156rIk.KWHzl()) == null || !listKWHzl.contains(accordionAppModel.getId())) && ((boolIsHidden = accordionAppModel.isHidden()) == null || !boolIsHidden.booleanValue()));
        c42214rKo.setVisibility(z ? 0 : 8);
        accordionAppModel.setHidden(java.lang.Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AccordionAppModel accordionAppModel, C42214rKo c42214rKo, java.lang.String str) {
        if (str != null) {
            boolean zContains$default = StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) accordionAppModel.getId(), false, 2, (java.lang.Object) null);
            if (!Intrinsics.EZpvd(c42214rKo.AEQbTJ, java.lang.Boolean.valueOf(zContains$default))) {
                c42214rKo.AEQbTJ = java.lang.Boolean.valueOf(zContains$default);
                c42214rKo.AEQbTJ(accordionAppModel.getContentList(), accordionAppModel.getContentListStyle(), accordionAppModel.getContentListType(), c42214rKo.AEQbTJ, true);
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull rQO rqo) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(rqo, "");
        this.copydefault = rqo;
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.valueOf, uIComponentAppModel.getBottomMargin()));
        AccordionAppModel accordionAppModel = uIComponentAppModel instanceof AccordionAppModel ? (AccordionAppModel) uIComponentAppModel : null;
        if (accordionAppModel != null) {
            this.KWHzl = accordionAppModel;
            this.AEQbTJ = accordionAppModel.isCollapsed();
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            android.widget.LinearLayout linearLayout = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            rqr.EZpvd(context3, linearLayout, accordionAppModel.getBackgroundStyle());
            this.EZpvd.AEQbTJ.setContentDescription(((AccordionAppModel) uIComponentAppModel).getId());
            android.widget.LinearLayout linearLayout2 = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(0);
            android.widget.TextView textView = this.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            setTextStyle$default(this, textView, accordionAppModel.getSectionTitle(), accordionAppModel.getSectionTitleStyle(), null, null, null, null, 120, null);
            this.EZpvd.OLrzqt.setText(accordionAppModel.getSectionTitle());
            android.widget.LinearLayout linearLayout3 = this.EZpvd.copydefault;
            linearLayout3.setOnClickListener(new StateListAnimator(linearLayout3, 1000L, this, accordionAppModel));
            AEQbTJ(accordionAppModel.getContentList(), accordionAppModel.getContentListStyle(), accordionAppModel.getContentListType(), accordionAppModel.isCollapsed(), false);
        }
    }

    public static /* synthetic */ void setTextStyle$default(C42214rKo c42214rKo, android.widget.TextView textView, java.lang.String str, TextStyle textStyle, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        c42214rKo.setTextStyle(textView, (i & 2) != 0 ? "" : str, textStyle, (i & 8) != 0 ? java.lang.Boolean.FALSE : bool, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2);
    }

    public final void setTextStyle(android.widget.TextView textView, java.lang.String str, TextStyle textStyle, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2) {
        android.text.SpannableString spannableString;
        java.lang.CharSequence charSequence;
        java.lang.Integer fontSize;
        if ((textStyle != null ? textStyle.getLineHeight() : null) != null) {
            textView.setLineSpacing(0.0f, textStyle.getLineHeight().floatValue());
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            textView.setTextAppearance(C52761wXj.LoaderManager.zuWLRA);
        }
        textView.setTextColor(rQR.AEQbTJ.AEQbTJ(textStyle != null ? textStyle.getColor() : null, this.djBIcL));
        textView.setTextSize((textStyle == null || (fontSize = textStyle.getFontSize()) == null) ? 16.0f : fontSize.intValue());
        java.lang.String str3 = str;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "dot")) {
            if (str == null) {
                str3 = "";
            }
            spannableString = new android.text.SpannableString(str3);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            spannableString.setSpan(new android.text.style.BulletSpan(C55298xhM.copydefault(4.0f, context)), 0, spannableString.length(), 0);
        } else {
            charSequence = str;
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER)) {
                java.lang.String str4 = (num != null ? num.intValue() : 1) + JwtUtilsKt.JWT_DELIMITER;
                float fMeasureText = textView.getPaint().measureText(num2 + JwtUtilsKt.JWT_DELIMITER);
                float fMeasureText2 = textView.getPaint().measureText(str4);
                float fMeasureText3 = textView.getPaint().measureText(" ");
                int i = (int) (fMeasureText + fMeasureText3);
                java.lang.String str5 = C59449zhJ.copydefault(" ", (int) ((fMeasureText - fMeasureText2) / fMeasureText3)) + str4;
                java.lang.String str6 = str;
                if (str == null) {
                    str6 = "";
                }
                spannableString = new android.text.SpannableString(str5 + " " + str6);
                spannableString.setSpan(new rLE(i), 0, spannableString.length(), 0);
            }
            textView.setText(charSequence);
        }
        charSequence = spannableString;
        textView.setText(charSequence);
    }
}
