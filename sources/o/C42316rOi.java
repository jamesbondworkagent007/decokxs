package o;

import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.ImageViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDescriptionAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Rule;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rOi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42316rOi extends android.widget.FrameLayout {
    public final AbstractC43950ryu AEQbTJ;
    public ViewStatus KWHzl;
    public java.lang.String OLrzqt;
    public final C42519rVw copydefault;

    /* JADX INFO: renamed from: o.rOi$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42316rOi(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42316rOi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.rOi.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42316rOi(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42316rOi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = ViewStatus.Form;
        this.copydefault = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.QSBOWP, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC43950ryu) viewDataBindingInflate;
    }

    public void AEQbTJ(@NotNull final UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.util.List<rAX<java.lang.String>> listDNCPSb;
        java.lang.Boolean required;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final rGL rgl = abstractC42074rFj instanceof rGL ? (rGL) abstractC42074rFj : null;
        final InputDescriptionAppModel inputDescriptionAppModel = uIComponentAppModel instanceof InputDescriptionAppModel ? (InputDescriptionAppModel) uIComponentAppModel : null;
        if (rgl == null || (listDNCPSb = rgl.dNCPSb()) == null) {
            return;
        }
        java.util.Iterator<T> it = listDNCPSb.iterator();
        while (it.hasNext()) {
            final rAX rax = (rAX) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputDescriptionAppModel != null ? inputDescriptionAppModel.getId() : null))) {
                if (inputDescriptionAppModel != null && Intrinsics.EZpvd(inputDescriptionAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                    rax.EZpvd(false);
                    if (inputDescriptionAppModel == null || !Intrinsics.EZpvd(inputDescriptionAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                        rax.setValue(null);
                    }
                } else {
                    setVisibility(0);
                    rax.EZpvd((inputDescriptionAppModel == null || (required = inputDescriptionAppModel.getRequired()) == null) ? false : required.booleanValue());
                    java.lang.String value = inputDescriptionAppModel != null ? inputDescriptionAppModel.getValue() : null;
                    if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                        value = null;
                    }
                    rax.setValue(value);
                }
                C41959rBc.observeKYCFormField$default(rax, lifecycleOwner, new Function1() { // from class: o.rOk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42316rOi.OLrzqt(uIComponentAppModel, rgl, inputDescriptionAppModel, rax, (java.lang.String) obj);
                    }
                }, null, new Function1() { // from class: o.rOm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42316rOi.OLrzqt(rax, this, (java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.rOl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C42316rOi.KWHzl();
                    }
                }, 8, null);
                rgl.gasjUx().observe(lifecycleOwner, new Application(new Function1() { // from class: o.rOn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42316rOi.OLrzqt(inputDescriptionAppModel, this, rax, (C42156rIk) obj);
                    }
                }));
                this.AEQbTJ.gEmmrt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.rOt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(android.view.View view, boolean z) {
                        C42316rOi.OLrzqt(this.copydefault, rgl, rax, view, z);
                    }
                });
                rgl.AuCTelauCTel().observe(lifecycleOwner, new Application(new Function1() { // from class: o.rOs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42316rOi.EZpvd(inputDescriptionAppModel, rax, this, (java.util.Map) obj);
                    }
                }));
                this.AEQbTJ.gEmmrt.addTextChangedListener(new ActionBar(rax, inputDescriptionAppModel, this));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(UIComponentAppModel uIComponentAppModel, rGL rgl, InputDescriptionAppModel inputDescriptionAppModel, rAX rax, java.lang.String str) {
        java.lang.String id;
        if (str != null) {
            uIComponentAppModel.setValue(str);
            java.util.Map<java.lang.String, java.lang.String> mapAubY = rgl.AubY();
            if (inputDescriptionAppModel == null || (id = inputDescriptionAppModel.getId()) == null) {
                id = "";
            }
            java.lang.String str2 = (java.lang.String) rax.getValue();
            mapAubY.put(id, str2 != null ? str2 : "");
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(rAX rax, C42316rOi c42316rOi, java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) rax.getValue())) {
            c42316rOi.AEQbTJ.KWHzl.setVisibility(0);
            c42316rOi.AEQbTJ.KWHzl.setText(str);
        } else {
            c42316rOi.AEQbTJ.KWHzl.setVisibility(8);
            c42316rOi.AEQbTJ.KWHzl.setText("");
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InputDescriptionAppModel inputDescriptionAppModel, C42316rOi c42316rOi, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputDescriptionAppModel != null ? inputDescriptionAppModel.getId() : null) && c42316rOi.getVisibility() == 8) {
                c42316rOi.setVisibility(0);
                rax.EZpvd((inputDescriptionAppModel == null || (required = inputDescriptionAppModel.getRequired()) == null) ? false : required.booleanValue());
                if (inputDescriptionAppModel == null || !Intrinsics.EZpvd(inputDescriptionAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    c42316rOi.AEQbTJ.gEmmrt.setText("");
                }
                if (inputDescriptionAppModel != null) {
                    inputDescriptionAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputDescriptionAppModel != null ? inputDescriptionAppModel.getId() : null) && c42316rOi.getVisibility() == 0) {
                c42316rOi.setVisibility(8);
                rax.EZpvd(false);
                if (inputDescriptionAppModel == null || !Intrinsics.EZpvd(inputDescriptionAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    c42316rOi.AEQbTJ.gEmmrt.setText("");
                }
                if (inputDescriptionAppModel != null) {
                    inputDescriptionAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C42316rOi c42316rOi, rGL rgl, rAX rax, android.view.View view, boolean z) {
        MutableLiveData<java.lang.Integer> mutableLiveDataAwvSrB;
        MutableLiveData<java.lang.Integer> mutableLiveDataAwvSrB2;
        int[] iArr = new int[2];
        c42316rOi.getLocationOnScreen(iArr);
        if (!z) {
            if (rgl != null && (mutableLiveDataAwvSrB2 = rgl.AwvSrB()) != null) {
                mutableLiveDataAwvSrB2.setValue(0);
            }
            rax.OLrzqt(true);
            c42316rOi.AEQbTJ.AEQbTJ.setVisibility(8);
            return;
        }
        if (rgl != null) {
            rgl.OLrzqt(c42316rOi.getContext().getResources().getDimensionPixelSize(C43662rtX.StateListAnimator.copydefault));
        }
        if (rgl != null && (mutableLiveDataAwvSrB = rgl.AwvSrB()) != null) {
            mutableLiveDataAwvSrB.setValue(java.lang.Integer.valueOf(iArr[1] + c42316rOi.getMeasuredHeight()));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c42316rOi.AEQbTJ.gEmmrt.getText())) {
            c42316rOi.AEQbTJ.AEQbTJ.setVisibility(0);
        } else {
            c42316rOi.AEQbTJ.AEQbTJ.setVisibility(8);
        }
    }

    public static final Unit EZpvd(InputDescriptionAppModel inputDescriptionAppModel, rAX rax, C42316rOi c42316rOi, java.util.Map map) {
        OKEditText oKEditText;
        Intrinsics.copydefault(map);
        kotlin.Pair pair = (kotlin.Pair) map.get(inputDescriptionAppModel != null ? inputDescriptionAppModel.getId() : null);
        if (pair != null) {
            rax.setValue(pair.getFirst());
            OKEditText oKEditText2 = c42316rOi.AEQbTJ.gEmmrt;
            if (oKEditText2 != null) {
                oKEditText2.setText((java.lang.CharSequence) pair.getSecond());
            }
            OKEditText oKEditText3 = c42316rOi.AEQbTJ.gEmmrt;
            if (oKEditText3 != null && oKEditText3.getText() != null && (oKEditText = c42316rOi.AEQbTJ.gEmmrt) != null) {
                oKEditText.setSelection(((java.lang.String) pair.getSecond()).length());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rOi$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ C42316rOi EZpvd;
        public final /* synthetic */ InputDescriptionAppModel KWHzl;
        public final /* synthetic */ rAX<java.lang.String> copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(rAX<java.lang.String> rax, InputDescriptionAppModel inputDescriptionAppModel, C42316rOi c42316rOi) {
            this.copydefault = rax;
            this.KWHzl = inputDescriptionAppModel;
            this.EZpvd = c42316rOi;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.util.List<Rule> rules;
            Rule rule;
            java.lang.Long max;
            this.copydefault.setValue(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(editable)).toString());
            InputDescriptionAppModel inputDescriptionAppModel = this.KWHzl;
            long jLongValue = ((inputDescriptionAppModel == null || (rules = inputDescriptionAppModel.getRules()) == null || (rule = rules.get(0)) == null || (max = rule.getMax()) == null) ? 101L : max.longValue()) - 1;
            this.EZpvd.AEQbTJ.copydefault.setText((editable != null ? java.lang.Integer.valueOf(editable.length()) : null) + "/" + jLongValue);
            if (editable != null) {
                C42316rOi c42316rOi = this.EZpvd;
                if (editable.length() > jLongValue) {
                    c42316rOi.AEQbTJ.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.BVXAa));
                } else {
                    c42316rOi.AEQbTJ.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dff));
                }
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) editable)) {
                this.EZpvd.AEQbTJ.AEQbTJ.setVisibility(0);
            } else {
                this.EZpvd.AEQbTJ.AEQbTJ.setVisibility(8);
            }
        }
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel) {
        Rule rule;
        java.lang.Long max;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.KWHzl, uIComponentAppModel.getBottomMargin()));
        InputDescriptionAppModel inputDescriptionAppModel = uIComponentAppModel instanceof InputDescriptionAppModel ? (InputDescriptionAppModel) uIComponentAppModel : null;
        if (inputDescriptionAppModel != null) {
            this.OLrzqt = inputDescriptionAppModel.getId();
            InputDescriptionAppModel inputDescriptionAppModel2 = (InputDescriptionAppModel) uIComponentAppModel;
            java.util.List<Rule> rules = inputDescriptionAppModel2.getRules();
            long jLongValue = ((rules == null || (rule = rules.get(0)) == null || (max = rule.getMax()) == null) ? 101L : max.longValue()) - 1;
            java.lang.String value = inputDescriptionAppModel2.getValue();
            this.AEQbTJ.copydefault.setText((value != null ? value.length() : 0) + "/" + jLongValue);
            setAllTextAppearance();
            this.AEQbTJ.gEmmrt.setHintTextColor(C33070mpX.copydefault(C52761wXj.Activity.Qsauvs));
            this.AEQbTJ.gEmmrt.setFilters(new android.text.InputFilter[]{new InputFilter.LengthFilter((int) jLongValue)});
            this.AEQbTJ.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rOo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42316rOi.KWHzl(this.copydefault, view);
                }
            });
            this.AEQbTJ.gEmmrt.setSaveEnabled(false);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inputDescriptionAppModel.getLabel())) {
                this.AEQbTJ.EZpvd.setVisibility(0);
                this.AEQbTJ.EZpvd.setText(inputDescriptionAppModel.getLabel());
            } else {
                this.AEQbTJ.EZpvd.setVisibility(8);
            }
            this.AEQbTJ.gEmmrt.setHint(inputDescriptionAppModel.getPlaceholder());
            this.AEQbTJ.gEmmrt.setText(inputDescriptionAppModel2.getValue());
        }
    }

    public static final void KWHzl(C42316rOi c42316rOi, android.view.View view) {
        c42316rOi.AEQbTJ.gEmmrt.setText((java.lang.CharSequence) null);
    }

    public final void setAllTextAppearance() {
        android.widget.TextView textView = this.AEQbTJ.EZpvd;
        TextViewCompat.setTextAppearance(textView, this.copydefault.AkhnZx());
        textView.setTextSize(0, this.copydefault.DbNXlk());
        textView.setTextColor(this.copydefault.fetchVPNInfo());
        android.widget.TextView textView2 = this.AEQbTJ.copydefault;
        TextViewCompat.setTextAppearance(textView2, this.copydefault.AkhnZx());
        textView2.setTextSize(0, this.copydefault.DbNXlk());
        OKEditText oKEditText = this.AEQbTJ.gEmmrt;
        TextViewCompat.setTextAppearance(oKEditText, this.copydefault.KWHzl());
        oKEditText.setTextSize(0, this.copydefault.EZpvd());
        oKEditText.setTextColor(this.copydefault.OLrzqt());
        oKEditText.setHintTextColor(this.copydefault.valueOf());
        Intrinsics.copydefault(oKEditText);
        int iAEQbTJ = this.copydefault.AEQbTJ();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55307xhV.setCursorDrawable$default(oKEditText, iAEQbTJ, C55298xhM.KWHzl(2.0f, context), 0.0f, 4, null);
        AppCompatImageView appCompatImageView = this.AEQbTJ.AEQbTJ;
        ImageViewCompat.setImageTintList(appCompatImageView, android.content.res.ColorStateList.valueOf(this.copydefault.ejfBZ()));
        appCompatImageView.setImageTintMode(PorterDuff.Mode.SRC_IN);
        android.widget.TextView textView3 = this.AEQbTJ.KWHzl;
        TextViewCompat.setTextAppearance(textView3, this.copydefault.AYXKKw());
        textView3.setTextSize(0, this.copydefault.copydefault());
        textView3.setTextColor(this.copydefault.gEmmrt());
    }
}
