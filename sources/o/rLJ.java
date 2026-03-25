package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.EditCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.Icon;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rLJ extends android.widget.FrameLayout {
    public final AbstractC43892rxp AEQbTJ;
    public ViewStatus KWHzl;
    public final C42519rVw OLrzqt;
    public rQO copydefault;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UIAlignment.values().length];
            try {
                iArr[UIAlignment.Trailing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Primary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonStyle.Tertiary.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rLJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rLJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.KWHzl = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:48) call: o.rLJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rLJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rLJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.fvQaOB, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC43892rxp) viewDataBindingInflate;
        this.OLrzqt = new C42519rVw(context, attributeSet, i);
    }

    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        rGL rgl;
        java.util.List<rAX<java.lang.String>> listDNCPSb;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            final EditCardAppModel editCardAppModel = uIComponentAppModel instanceof EditCardAppModel ? (EditCardAppModel) uIComponentAppModel : null;
            if (editCardAppModel == null || (listDNCPSb = (rgl = (rGL) abstractC42074rFj).dNCPSb()) == null) {
                return;
            }
            java.util.Iterator<T> it = listDNCPSb.iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) editCardAppModel.getId())) {
                    java.lang.String value = editCardAppModel.getValue();
                    if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                        value = null;
                    }
                    rax.setValue(value);
                    rgl.gasjUx().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.rLH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rLJ.copydefault(editCardAppModel, this, (C42156rIk) obj);
                        }
                    }));
                    if (Intrinsics.EZpvd(editCardAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                    } else {
                        setVisibility(0);
                    }
                }
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            EditCardAppModel editCardAppModel2 = uIComponentAppModel instanceof EditCardAppModel ? (EditCardAppModel) uIComponentAppModel : null;
            if (editCardAppModel2 != null) {
                java.util.Iterator<T> it2 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) editCardAppModel2.getId())) {
                        java.lang.String value2 = editCardAppModel2.getValue();
                        if (!java.lang.Boolean.valueOf(!(value2 == null || value2.length() == 0)).booleanValue()) {
                            value2 = null;
                        }
                        rax2.setValue(value2);
                    }
                }
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof rIM) {
            EditCardAppModel editCardAppModel3 = uIComponentAppModel instanceof EditCardAppModel ? (EditCardAppModel) uIComponentAppModel : null;
            if (editCardAppModel3 != null) {
                java.util.Iterator<T> it3 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it3.hasNext()) {
                    rAX rax3 = (rAX) it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) editCardAppModel3.getId())) {
                        java.lang.String value3 = editCardAppModel3.getValue();
                        if (!java.lang.Boolean.valueOf(!(value3 == null || value3.length() == 0)).booleanValue()) {
                            value3 = null;
                        }
                        rax3.setValue(value3);
                    }
                }
            }
        }
    }

    public static final Unit copydefault(EditCardAppModel editCardAppModel, rLJ rlj, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(editCardAppModel.getId()) && rlj.getVisibility() == 8) {
            rlj.setVisibility(0);
            editCardAppModel.setHidden(java.lang.Boolean.FALSE);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(editCardAppModel.getId()) && rlj.getVisibility() == 0) {
            rlj.setVisibility(8);
            editCardAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r1v61. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v23, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull UIComponentAppModel uIComponentAppModel, AbstractC42074rFj abstractC42074rFj, @NotNull rQO rqo) {
        rQR rqr;
        android.graphics.drawable.Drawable drawableKWHzl;
        java.lang.Object objCopydefault;
        java.util.List<UIComponentAppModel> items;
        android.content.res.ColorStateList colorStateList;
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(rqo, "");
        this.copydefault = rqo;
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr2 = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr2.AEQbTJ(context2, this.KWHzl, uIComponentAppModel.getBottomMargin()));
        android.content.Context context3 = null;
        EditCardAppModel editCardAppModel = uIComponentAppModel instanceof EditCardAppModel ? (EditCardAppModel) uIComponentAppModel : null;
        if (editCardAppModel != null) {
            android.widget.LinearLayout linearLayout2 = this.AEQbTJ.AEQbTJ;
            if (linearLayout2 != null) {
                linearLayout2.setContentDescription(((EditCardAppModel) uIComponentAppModel).getId());
            }
            android.widget.LinearLayout linearLayout3 = this.AEQbTJ.AEQbTJ;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            EditCardAppModel editCardAppModel2 = (EditCardAppModel) uIComponentAppModel;
            if (!editCardAppModel2.getContentList().isEmpty()) {
                ((UIComponentAppModel) CollectionsKt___CollectionsKt.AubY(editCardAppModel2.getContentList())).setBottomMargin(fValueOf);
                for (android.view.View view : rqo.AEQbTJ(fragmentActivity, editCardAppModel2.getContentList(), ViewStatus.Card)) {
                    AbstractC43892rxp abstractC43892rxp = this.AEQbTJ;
                    if (abstractC43892rxp != null && (linearLayout = abstractC43892rxp.copydefault) != null) {
                        linearLayout.addView(view);
                    }
                }
            }
            if (editCardAppModel.getIcon() != null || editCardAppModel.getStep() != null) {
                this.AEQbTJ.djBIcL.setVisibility(0);
                FreetextStep step = editCardAppModel.getStep();
                if (step != null) {
                    if (Intrinsics.EZpvd(step.getCompleted(), java.lang.Boolean.TRUE)) {
                        this.AEQbTJ.OLrzqt.setVisibility(0);
                        this.AEQbTJ.AhwBna.setVisibility(8);
                        android.graphics.drawable.Drawable drawableKWHzl2 = rQR.AEQbTJ.KWHzl("completed", this.OLrzqt);
                        if (drawableKWHzl2 != null) {
                            android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(drawableKWHzl2.mutate());
                            Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
                            DrawableCompat.setTint(drawableWrap, C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
                            this.AEQbTJ.OLrzqt.setImageDrawable(drawableWrap);
                        }
                        objCopydefault = copydefault(editCardAppModel.getIconWidth(), editCardAppModel.getIconHeight());
                    } else {
                        this.AEQbTJ.OLrzqt.setVisibility(8);
                        this.AEQbTJ.AhwBna.setVisibility(0);
                        android.widget.TextView textView = this.AEQbTJ.AhwBna;
                        java.lang.String number = step.getNumber();
                        if (number == null) {
                            number = "";
                        }
                        textView.setText(number);
                        objCopydefault = Unit.INSTANCE;
                    }
                    if (objCopydefault == null) {
                    }
                } else {
                    java.lang.String icon = editCardAppModel.getIcon();
                    if (icon != null && (drawableKWHzl = (rqr = rQR.AEQbTJ).KWHzl(icon, this.OLrzqt)) != null) {
                        android.graphics.drawable.Drawable drawableWrap2 = DrawableCompat.wrap(drawableKWHzl.mutate());
                        Intrinsics.checkNotNullExpressionValue(drawableWrap2, "");
                        java.lang.Integer numCopydefault = rqr.copydefault(editCardAppModel.getIconRenderColor(), this.OLrzqt);
                        if (numCopydefault != null) {
                            DrawableCompat.setTint(drawableWrap2, numCopydefault.intValue());
                        } else {
                            if (Intrinsics.EZpvd((java.lang.Object) icon, (java.lang.Object) Icon.Check.getNameValue())) {
                                DrawableCompat.setTint(drawableWrap2, C33070mpX.copydefault(C52761wXj.Activity.iLWfRf));
                            }
                            if (Intrinsics.EZpvd((java.lang.Object) icon, (java.lang.Object) Icon.SHIELD.getNameValue())) {
                                DrawableCompat.setTint(drawableWrap2, C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
                            }
                        }
                        this.AEQbTJ.OLrzqt.setVisibility(0);
                        this.AEQbTJ.OLrzqt.setImageDrawable(drawableWrap2);
                        copydefault(editCardAppModel.getIconWidth(), editCardAppModel.getIconHeight());
                    }
                }
            } else {
                this.AEQbTJ.djBIcL.setVisibility(8);
                Unit unit = Unit.INSTANCE;
            }
            CTAButtonAppModel ctaArrow = editCardAppModel2.getCtaArrow();
            if (ctaArrow != null) {
                this.AEQbTJ.EZpvd.setVisibility(0);
                this.AEQbTJ.KWHzl.setVisibility(8);
                this.AEQbTJ.valueOf.setVisibility(8);
                android.widget.ImageView imageView = this.AEQbTJ.EZpvd;
                if (Intrinsics.EZpvd(ctaArrow.getEnabled(), java.lang.Boolean.FALSE)) {
                    colorStateList = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.UlJrfe);
                } else {
                    colorStateList = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.DCUTEIddSDPG);
                }
                imageView.setImageTintList(colorStateList);
                android.widget.LinearLayout linearLayout4 = this.AEQbTJ.AEQbTJ;
                linearLayout4.setOnClickListener(new StateListAnimator(linearLayout4, 1000L, ctaArrow, uIComponentAppModel, abstractC42074rFj));
            } else {
                this.AEQbTJ.EZpvd.setVisibility(8);
                CtaAppModel cta = editCardAppModel2.getCta();
                if (cta != null && (items = cta.getItems()) != null) {
                    CtaAppModel cta2 = editCardAppModel2.getCta();
                    if (Intrinsics.EZpvd((java.lang.Object) (cta2 != null ? cta2.getPosition() : null), (java.lang.Object) "bottom")) {
                        this.AEQbTJ.valueOf.setVisibility(8);
                        this.AEQbTJ.KWHzl.setVisibility(0);
                        int size = items.size();
                        int i = 0;
                        while (i < size) {
                            UIComponentAppModel uIComponentAppModel2 = items.get(i);
                            if (uIComponentAppModel2 instanceof CTAButtonAppModel) {
                                CTAButtonAppModel cTAButtonAppModel = (CTAButtonAppModel) uIComponentAppModel2;
                                ?? KWHzl = KWHzl(cTAButtonAppModel, abstractC42074rFj, C55298xhM.dp2px$default(8.0f, context3, 1, context3), editCardAppModel2.getId());
                                CtaIcon icon2 = cTAButtonAppModel.getIcon();
                                KWHzl.setContentDescription(icon2 != null ? icon2.getName() : context3);
                                if (KWHzl instanceof C52794wYp) {
                                    ((C52794wYp) KWHzl).setOKDSSize(36);
                                }
                                java.lang.String widthWeight = cTAButtonAppModel.getWidthWeight();
                                if (widthWeight == null) {
                                    widthWeight = "1";
                                }
                                KWHzl.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, C33129mqd.djBIcL(widthWeight)));
                                if (i < items.size() - 1) {
                                    C55296xhK.OLrzqt(KWHzl, fValueOf, fValueOf, java.lang.Float.valueOf(12.0f), fValueOf);
                                }
                                this.AEQbTJ.KWHzl.addView(KWHzl);
                            }
                            i++;
                            context3 = null;
                        }
                    } else {
                        this.AEQbTJ.valueOf.setVisibility(0);
                        this.AEQbTJ.KWHzl.setVisibility(8);
                        int size2 = items.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            UIComponentAppModel uIComponentAppModel3 = items.get(i2);
                            if (uIComponentAppModel3 instanceof CTAButtonAppModel) {
                                CTAButtonAppModel cTAButtonAppModel2 = (CTAButtonAppModel) uIComponentAppModel3;
                                android.view.View viewKWHzl = KWHzl(cTAButtonAppModel2, abstractC42074rFj, C55298xhM.dp2px$default(4.0f, null, 1, null), editCardAppModel2.getId());
                                CtaIcon icon3 = cTAButtonAppModel2.getIcon();
                                viewKWHzl.setContentDescription(icon3 != null ? icon3.getName() : null);
                                if (i2 < items.size() - 1) {
                                    C55296xhK.OLrzqt(viewKWHzl, fValueOf, fValueOf, java.lang.Float.valueOf(12.0f), fValueOf);
                                }
                                this.AEQbTJ.valueOf.addView(viewKWHzl);
                            }
                        }
                    }
                } else {
                    this.AEQbTJ.KWHzl.setVisibility(8);
                    this.AEQbTJ.valueOf.setVisibility(8);
                }
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) editCardAppModel2.getErrorMsg())) {
                this.AEQbTJ.AYXKKw.setVisibility(0);
                this.AEQbTJ.AYXKKw.setText(editCardAppModel2.getErrorMsg());
            } else {
                this.AEQbTJ.AYXKKw.setVisibility(8);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ AbstractC42074rFj KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ CTAButtonAppModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, java.lang.String str, AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = str;
            this.KWHzl = abstractC42074rFj;
            this.copydefault = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataAYXKKw;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C43693ruB.copydefault("KYC_Edit_Card_CtaImage_Click", C56424yEw.AYXKKw(C56390yDp.OLrzqt("viewId", this.EZpvd)));
                AbstractC42074rFj abstractC42074rFj = this.KWHzl;
                if (abstractC42074rFj == null || (mutableLiveDataAYXKKw = abstractC42074rFj.AYXKKw()) == null) {
                    return;
                }
                mutableLiveDataAYXKKw.setValue(new C43734ruq<>(new kotlin.Pair(this.copydefault, new DialogInformation("", false, null, 4, null))));
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ CTAButtonAppModel EZpvd;
        public final /* synthetic */ UIComponentAppModel KWHzl;
        public final /* synthetic */ AbstractC42074rFj OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, CTAButtonAppModel cTAButtonAppModel, UIComponentAppModel uIComponentAppModel, AbstractC42074rFj abstractC42074rFj) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = cTAButtonAppModel;
            this.KWHzl = uIComponentAppModel;
            this.OLrzqt = abstractC42074rFj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataAYXKKw;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (Intrinsics.EZpvd(this.EZpvd.getEnabled(), java.lang.Boolean.FALSE)) {
                    return;
                }
                C43693ruB.copydefault("KYC_Edit_Card_Arrow_Click", C56424yEw.AYXKKw(C56390yDp.OLrzqt("viewId", ((EditCardAppModel) this.KWHzl).getId())));
                AbstractC42074rFj abstractC42074rFj = this.OLrzqt;
                if (abstractC42074rFj == null || (mutableLiveDataAYXKKw = abstractC42074rFj.AYXKKw()) == null) {
                    return;
                }
                mutableLiveDataAYXKKw.setValue(new C43734ruq<>(new kotlin.Pair(this.EZpvd, new DialogInformation("", false, null, 4, null))));
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ CTAButtonAppModel AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ AbstractC42074rFj KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, java.lang.String str, AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = str;
            this.KWHzl = abstractC42074rFj;
            this.AEQbTJ = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataAYXKKw;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C43693ruB.copydefault("KYC_Edit_Card_Cta_Click", C56424yEw.AYXKKw(C56390yDp.OLrzqt("viewId", this.copydefault)));
                AbstractC42074rFj abstractC42074rFj = this.KWHzl;
                if (abstractC42074rFj == null || (mutableLiveDataAYXKKw = abstractC42074rFj.AYXKKw()) == null) {
                    return;
                }
                mutableLiveDataAYXKKw.setValue(new C43734ruq<>(new kotlin.Pair(this.AEQbTJ, new DialogInformation("", false, null, 4, null))));
            }
        }
    }

    public final android.view.View KWHzl(CTAButtonAppModel cTAButtonAppModel, AbstractC42074rFj abstractC42074rFj, int i, java.lang.String str) {
        int i2;
        rQR rqr;
        android.graphics.drawable.Drawable drawableKWHzl;
        int iCopydefault;
        rQR rqr2;
        android.graphics.drawable.Drawable drawableKWHzl2;
        if (cTAButtonAppModel.getStyle() == ButtonStyle.Image) {
            ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.getNewProxyInstance, this.AEQbTJ.KWHzl, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
            AbstractC43833rwj abstractC43833rwj = (AbstractC43833rwj) viewDataBindingInflate;
            CtaIcon icon = cTAButtonAppModel.getIcon();
            if (icon != null && (drawableKWHzl2 = (rqr2 = rQR.AEQbTJ).KWHzl(icon.getName(), this.OLrzqt)) != null) {
                android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(drawableKWHzl2.mutate());
                Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
                if (C33129mqd.djBIcL(icon.getWidth()) > 0.0f && C33129mqd.djBIcL(icon.getHeight()) > 0.0f) {
                    drawableWrap.setBounds(0, 0, C55298xhM.dp2px$default(C33129mqd.djBIcL(icon.getWidth()), null, 1, null), C55298xhM.dp2px$default(C33129mqd.djBIcL(icon.getHeight()), null, 1, null));
                } else {
                    drawableWrap.setBounds(0, 0, drawableWrap.getIntrinsicWidth(), drawableWrap.getIntrinsicHeight());
                }
                java.lang.Integer numCopydefault = rqr2.copydefault(icon.getRenderColor(), this.OLrzqt);
                if (numCopydefault != null) {
                    DrawableCompat.setTint(drawableWrap, numCopydefault.intValue());
                }
                abstractC43833rwj.KWHzl.setImageDrawable(drawableWrap);
            }
            android.widget.ImageView imageView = abstractC43833rwj.KWHzl;
            if (imageView != null) {
                imageView.setOnClickListener(new Activity(imageView, 1000L, str, abstractC42074rFj, cTAButtonAppModel));
            }
            android.view.View root = abstractC43833rwj.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            return root;
        }
        ViewDataBinding viewDataBindingInflate2 = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.getFieldNames, this.AEQbTJ.KWHzl, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate2, "");
        AbstractC43831rwh abstractC43831rwh = (AbstractC43831rwh) viewDataBindingInflate2;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getText())) {
            C52794wYp c52794wYp = abstractC43831rwh.KWHzl;
            if (c52794wYp != null) {
                c52794wYp.setText(cTAButtonAppModel.getText());
            }
            i2 = i;
        } else {
            i2 = 0;
        }
        C52794wYp c52794wYp2 = abstractC43831rwh.KWHzl;
        if (c52794wYp2 != null) {
            c52794wYp2.setCompoundDrawablePadding(i2);
        }
        CtaIcon icon2 = cTAButtonAppModel.getIcon();
        if (icon2 != null && (drawableKWHzl = (rqr = rQR.AEQbTJ).KWHzl(icon2.getName(), this.OLrzqt)) != null) {
            android.graphics.drawable.Drawable drawableWrap2 = DrawableCompat.wrap(drawableKWHzl.mutate());
            Intrinsics.checkNotNullExpressionValue(drawableWrap2, "");
            if (C33129mqd.djBIcL(icon2.getWidth()) > 0.0f && C33129mqd.djBIcL(icon2.getHeight()) > 0.0f) {
                drawableWrap2.setBounds(0, 0, C55298xhM.dp2px$default(C33129mqd.djBIcL(icon2.getWidth()), null, 1, null), C55298xhM.dp2px$default(C33129mqd.djBIcL(icon2.getHeight()), null, 1, null));
            } else {
                drawableWrap2.setBounds(0, 0, drawableWrap2.getIntrinsicWidth(), drawableWrap2.getIntrinsicHeight());
            }
            java.lang.Integer numCopydefault2 = rqr.copydefault(icon2.getRenderColor(), this.OLrzqt);
            if (numCopydefault2 != null) {
                DrawableCompat.setTint(drawableWrap2, numCopydefault2.intValue());
            } else {
                if (cTAButtonAppModel.getStyle() == ButtonStyle.Primary) {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.htlTjW);
                } else {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
                }
                DrawableCompat.setTint(drawableWrap2, iCopydefault);
            }
            CtaIcon icon3 = cTAButtonAppModel.getIcon();
            UIAlignment position = icon3 != null ? icon3.getPosition() : null;
            if (position != null && Application.EZpvd[position.ordinal()] == 1) {
                C52794wYp c52794wYp3 = abstractC43831rwh.KWHzl;
                if (c52794wYp3 != null) {
                    c52794wYp3.setCompoundDrawablesRelative(null, null, drawableWrap2, null);
                }
            } else {
                C52794wYp c52794wYp4 = abstractC43831rwh.KWHzl;
                if (c52794wYp4 != null) {
                    c52794wYp4.setCompoundDrawablesRelative(drawableWrap2, null, null, null);
                }
            }
        }
        C52794wYp c52794wYp5 = abstractC43831rwh.KWHzl;
        if (c52794wYp5 != null) {
            java.lang.Boolean enabled = cTAButtonAppModel.getEnabled();
            c52794wYp5.setEnabled(enabled != null ? enabled.booleanValue() : true);
        }
        C52794wYp c52794wYp6 = abstractC43831rwh.KWHzl;
        if (c52794wYp6 != null) {
            c52794wYp6.setOnClickListener(new TaskDescription(c52794wYp6, 1000L, str, abstractC42074rFj, cTAButtonAppModel));
        }
        ButtonStyle style = cTAButtonAppModel.getStyle();
        int i3 = style == null ? -1 : Application.copydefault[style.ordinal()];
        if (i3 == 1) {
            abstractC43831rwh.KWHzl.setOKDSType(257);
        } else if (i3 == 2) {
            abstractC43831rwh.KWHzl.setOKDSType(260);
        } else if (i3 == 3) {
            abstractC43831rwh.KWHzl.setOKDSType(258);
        }
        C52794wYp c52794wYp7 = abstractC43831rwh.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp7, "");
        return c52794wYp7;
    }

    public final ViewGroup.LayoutParams copydefault(java.lang.String str, java.lang.String str2) {
        ViewGroup.LayoutParams layoutParams = this.AEQbTJ.OLrzqt.getLayoutParams();
        layoutParams.width = C55298xhM.dp2px$default(16.0f, null, 1, null);
        layoutParams.height = C55298xhM.dp2px$default(16.0f, null, 1, null);
        if (str != null) {
            layoutParams.width = C55298xhM.dp2px$default(C33129mqd.djBIcL(str), null, 1, null);
        }
        if (str2 != null) {
            layoutParams.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(str2), null, 1, null);
        }
        this.AEQbTJ.OLrzqt.setLayoutParams(layoutParams);
        Intrinsics.copydefault(layoutParams);
        return layoutParams;
    }
}
