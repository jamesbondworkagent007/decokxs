package o;

import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TableCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TableCardList;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rQL extends android.widget.FrameLayout {
    public final AbstractC43995rzm EZpvd;
    public ViewStatus OLrzqt;
    public final C42519rVw copydefault;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UIAlignment.values().length];
            try {
                iArr[UIAlignment.Trailing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
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
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rQL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rQL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.OLrzqt = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.rQL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rQL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rQL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.fERRXa, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43995rzm) viewDataBindingInflate;
        this.copydefault = new C42519rVw(context, attributeSet, i);
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            final TableCardAppModel tableCardAppModel = uIComponentAppModel instanceof TableCardAppModel ? (TableCardAppModel) uIComponentAppModel : null;
            if (tableCardAppModel != null) {
                rGL rgl = (rGL) abstractC42074rFj;
                java.util.Iterator<T> it = rgl.dNCPSb().iterator();
                while (it.hasNext()) {
                    rAX rax = (rAX) it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) tableCardAppModel.getId())) {
                        rax.setValue(null);
                    }
                }
                rgl.gasjUx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rQN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rQL.KWHzl(tableCardAppModel, this, (C42156rIk) obj);
                    }
                }));
                if (Intrinsics.EZpvd(tableCardAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                    return;
                } else {
                    setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            TableCardAppModel tableCardAppModel2 = uIComponentAppModel instanceof TableCardAppModel ? (TableCardAppModel) uIComponentAppModel : null;
            if (tableCardAppModel2 != null) {
                java.util.Iterator<T> it2 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) tableCardAppModel2.getId())) {
                        rax2.setValue(null);
                    }
                }
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof rIM) {
            TableCardAppModel tableCardAppModel3 = uIComponentAppModel instanceof TableCardAppModel ? (TableCardAppModel) uIComponentAppModel : null;
            if (tableCardAppModel3 != null) {
                java.util.Iterator<T> it3 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it3.hasNext()) {
                    rAX rax3 = (rAX) it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) tableCardAppModel3.getId())) {
                        rax3.setValue(null);
                    }
                }
            }
        }
    }

    public static final Unit KWHzl(TableCardAppModel tableCardAppModel, rQL rql, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(tableCardAppModel.getId()) && rql.getVisibility() == 8) {
            rql.setVisibility(0);
            tableCardAppModel.setHidden(java.lang.Boolean.FALSE);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(tableCardAppModel.getId()) && rql.getVisibility() == 0) {
            rql.setVisibility(8);
            tableCardAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull UIComponentAppModel uIComponentAppModel, AbstractC42074rFj abstractC42074rFj) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.OLrzqt, uIComponentAppModel.getBottomMargin()));
        TableCardAppModel tableCardAppModel = uIComponentAppModel instanceof TableCardAppModel ? (TableCardAppModel) uIComponentAppModel : null;
        if (tableCardAppModel != null) {
            this.EZpvd.OLrzqt.setContentDescription(tableCardAppModel.getId());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tableCardAppModel.getTitle())) {
                this.EZpvd.EZpvd.setText(tableCardAppModel.getTitle());
                android.widget.TextView textView = this.EZpvd.EZpvd;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                android.widget.TextView textView2 = this.EZpvd.EZpvd;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            TableCardAppModel tableCardAppModel2 = (TableCardAppModel) uIComponentAppModel;
            if (!tableCardAppModel2.getContentList().isEmpty()) {
                int size = tableCardAppModel2.getContentList().size();
                for (int i = 0; i < size; i++) {
                    TableCardList tableCardList = tableCardAppModel2.getContentList().get(i);
                    Intrinsics.checkNotNullExpressionValue(tableCardList, "");
                    TableCardList tableCardList2 = tableCardList;
                    ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.htlTjW, this.EZpvd.AEQbTJ, false);
                    Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
                    AbstractC43997rzo abstractC43997rzo = (AbstractC43997rzo) viewDataBindingInflate;
                    android.widget.TextView textView3 = abstractC43997rzo.copydefault;
                    java.lang.String title = tableCardList2.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    textView3.setText(title);
                    this.EZpvd.AEQbTJ.addView(abstractC43997rzo.getRoot());
                    java.util.ArrayList<java.lang.String> items = tableCardList2.getItems();
                    if (items != null) {
                        int size2 = items.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ViewDataBinding viewDataBindingInflate2 = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.Dmq, abstractC43997rzo.EZpvd, false);
                            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate2, "");
                            AbstractC44000rzr abstractC44000rzr = (AbstractC44000rzr) viewDataBindingInflate2;
                            abstractC44000rzr.copydefault.setText(items.get(i2));
                            if (i2 != items.size() - 1) {
                                android.widget.TextView textView4 = abstractC44000rzr.copydefault;
                                Intrinsics.checkNotNullExpressionValue(textView4, "");
                                C55296xhK.OLrzqt(textView4, fValueOf, fValueOf, fValueOf, java.lang.Float.valueOf(8.0f));
                            }
                            abstractC43997rzo.EZpvd.addView(abstractC44000rzr.getRoot());
                        }
                        if (i != tableCardAppModel2.getContentList().size() - 1) {
                            ViewDataBinding viewDataBindingInflate3 = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.igXuih, this.EZpvd.AEQbTJ, false);
                            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate3, "");
                            this.EZpvd.AEQbTJ.addView(((AbstractC44002rzt) viewDataBindingInflate3).getRoot());
                        }
                    }
                }
            }
            CTAButtonAppModel ctaButton = tableCardAppModel2.getCtaButton();
            if (ctaButton != null) {
                this.EZpvd.copydefault.setVisibility(0);
                C52794wYp c52794wYp = this.EZpvd.copydefault;
                c52794wYp.setContentDescription("compliance" + ctaButton.getAction() + "TableCardPrimaryButton");
                Intrinsics.copydefault(c52794wYp);
                KWHzl(c52794wYp, ctaButton, abstractC42074rFj);
                return;
            }
            this.EZpvd.copydefault.setVisibility(8);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ CTAButtonAppModel KWHzl;
        public final /* synthetic */ AbstractC42074rFj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = abstractC42074rFj;
            this.KWHzl = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataAYXKKw;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AbstractC42074rFj abstractC42074rFj = this.copydefault;
                if (abstractC42074rFj == null || (mutableLiveDataAYXKKw = abstractC42074rFj.AYXKKw()) == null) {
                    return;
                }
                mutableLiveDataAYXKKw.setValue(new C43734ruq<>(new kotlin.Pair(this.KWHzl, new DialogInformation("", false, null, 4, null))));
            }
        }
    }

    private final void KWHzl(C52794wYp c52794wYp, CTAButtonAppModel cTAButtonAppModel, AbstractC42074rFj abstractC42074rFj) {
        rQR rqr;
        android.graphics.drawable.Drawable drawableKWHzl;
        int iCopydefault;
        if (cTAButtonAppModel != null) {
            c52794wYp.setVisibility(0);
            java.lang.String text = cTAButtonAppModel.getText();
            if (text == null) {
                text = "";
            }
            c52794wYp.setText(text);
            CtaIcon icon = cTAButtonAppModel.getIcon();
            if (icon != null && (drawableKWHzl = (rqr = rQR.AEQbTJ).KWHzl(icon.getName(), this.copydefault)) != null) {
                android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(drawableKWHzl.mutate());
                Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
                if (C33129mqd.djBIcL(icon.getWidth()) > 0.0f && C33129mqd.djBIcL(icon.getHeight()) > 0.0f) {
                    drawableWrap.setBounds(0, 0, C55298xhM.dp2px$default(C33129mqd.djBIcL(icon.getWidth()), null, 1, null), C55298xhM.dp2px$default(C33129mqd.djBIcL(icon.getHeight()), null, 1, null));
                } else {
                    drawableWrap.setBounds(0, 0, drawableWrap.getIntrinsicWidth(), drawableWrap.getIntrinsicHeight());
                }
                java.lang.Integer numCopydefault = rqr.copydefault(icon.getRenderColor(), this.copydefault);
                if (numCopydefault != null) {
                    DrawableCompat.setTint(drawableWrap, numCopydefault.intValue());
                } else {
                    if (cTAButtonAppModel.getStyle() == ButtonStyle.Primary) {
                        iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.htlTjW);
                    } else {
                        iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
                    }
                    DrawableCompat.setTint(drawableWrap, iCopydefault);
                }
                CtaIcon icon2 = cTAButtonAppModel.getIcon();
                UIAlignment position = icon2 != null ? icon2.getPosition() : null;
                if (position != null && TaskDescription.AEQbTJ[position.ordinal()] == 1) {
                    c52794wYp.setCompoundDrawablesRelative(null, null, drawableWrap, null);
                } else {
                    c52794wYp.setCompoundDrawablesRelative(drawableWrap, null, null, null);
                }
            }
            java.lang.Boolean enabled = cTAButtonAppModel.getEnabled();
            c52794wYp.setEnabled(enabled != null ? enabled.booleanValue() : true);
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, abstractC42074rFj, cTAButtonAppModel));
            ButtonStyle style = cTAButtonAppModel.getStyle();
            int i = style == null ? -1 : TaskDescription.EZpvd[style.ordinal()];
            if (i == 1) {
                c52794wYp.setOKDSType(257);
                return;
            } else if (i == 2) {
                c52794wYp.setOKDSType(260);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                c52794wYp.setOKDSType(258);
                return;
            }
        }
        c52794wYp.setVisibility(8);
    }
}
