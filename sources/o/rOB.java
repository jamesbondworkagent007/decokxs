package o;

import android.text.InputFilter;
import android.view.View;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputSSNAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Rule;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rOB extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public ViewStatus AhwBna;
    public final C42519rVw KWHzl;
    public final AbstractC43913ryJ OLrzqt;
    public final android.text.method.KeyListener copydefault;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
    public rOB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rOB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.AhwBna = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:34) call: o.rOB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rOB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rOB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = ViewStatus.Form;
        android.text.method.DigitsKeyListener digitsKeyListener = android.text.method.DigitsKeyListener.getInstance("1234567890");
        Intrinsics.checkNotNullExpressionValue(digitsKeyListener, "");
        this.copydefault = digitsKeyListener;
        this.KWHzl = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.ODXsMY, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC43913ryJ) viewDataBindingInflate;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rOB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public void copydefault(@NotNull final UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        C55001xbh c55001xbhEZpvd;
        java.util.List<rAX<java.lang.String>> listDNCPSb;
        java.lang.Boolean required;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final rGL rgl = abstractC42074rFj instanceof rGL ? (rGL) abstractC42074rFj : null;
        final InputSSNAppModel inputSSNAppModel = uIComponentAppModel instanceof InputSSNAppModel ? (InputSSNAppModel) uIComponentAppModel : null;
        if (rgl != null && (listDNCPSb = rgl.dNCPSb()) != null) {
            java.util.Iterator<T> it = listDNCPSb.iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputSSNAppModel != null ? inputSSNAppModel.getId() : null))) {
                    rax.setValue(inputSSNAppModel != null ? inputSSNAppModel.getValue() : null);
                    if (inputSSNAppModel != null && Intrinsics.EZpvd(inputSSNAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        if (!Intrinsics.EZpvd(inputSSNAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                            rax.setValue(null);
                        }
                    } else {
                        setVisibility(0);
                        rax.EZpvd((inputSSNAppModel == null || (required = inputSSNAppModel.getRequired()) == null) ? false : required.booleanValue());
                        java.lang.String value = inputSSNAppModel != null ? inputSSNAppModel.getValue() : null;
                        if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                            value = null;
                        }
                        rax.setValue(value);
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rOD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rOB.copydefault(inputSSNAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    C41959rBc.observeKYCFormField$default(rax, lifecycleOwner, new Function1() { // from class: o.rOF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rOB.OLrzqt(uIComponentAppModel, (java.lang.String) obj);
                        }
                    }, null, new Function1() { // from class: o.rOI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rOB.copydefault(this.EZpvd, rax, (java.lang.String) obj);
                        }
                    }, new Function0() { // from class: o.rOH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return rOB.OLrzqt();
                        }
                    }, 8, null);
                }
            }
        }
        C55009xbp c55009xbpFIwbmz = this.OLrzqt.valueOf.fIwbmz();
        if (c55009xbpFIwbmz != null && (c55001xbhEZpvd = c55009xbpFIwbmz.EZpvd()) != null) {
            c55001xbhEZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.rOE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    rOB.EZpvd(rgl, this, view, z);
                }
            });
        }
        this.OLrzqt.valueOf.OLrzqt(new Application(rgl, this));
    }

    public static final Unit copydefault(InputSSNAppModel inputSSNAppModel, rOB rob, rAX rax, C42156rIk c42156rIk) {
        C55001xbh c55001xbhEZpvd;
        java.lang.String placeholder;
        C55001xbh c55001xbhEZpvd2;
        java.lang.String placeholder2;
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputSSNAppModel != null ? inputSSNAppModel.getId() : null) && rob.getVisibility() == 8) {
                rob.setVisibility(0);
                rax.EZpvd((inputSSNAppModel == null || (required = inputSSNAppModel.getRequired()) == null) ? false : required.booleanValue());
                if (inputSSNAppModel == null || !Intrinsics.EZpvd(inputSSNAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    if (inputSSNAppModel != null && (placeholder2 = inputSSNAppModel.getPlaceholder()) != null) {
                        rob.OLrzqt.valueOf.setHintText(placeholder2);
                    }
                    C55009xbp c55009xbpFIwbmz = rob.OLrzqt.valueOf.fIwbmz();
                    if (c55009xbpFIwbmz != null && (c55001xbhEZpvd2 = c55009xbpFIwbmz.EZpvd()) != null) {
                        c55001xbhEZpvd2.setText("");
                    }
                }
                if (inputSSNAppModel != null) {
                    inputSSNAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputSSNAppModel != null ? inputSSNAppModel.getId() : null) && rob.getVisibility() == 0) {
                rob.setVisibility(8);
                rax.EZpvd(false);
                if (inputSSNAppModel == null || !Intrinsics.EZpvd(inputSSNAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    if (inputSSNAppModel != null && (placeholder = inputSSNAppModel.getPlaceholder()) != null) {
                        rob.OLrzqt.valueOf.setHintText(placeholder);
                    }
                    C55009xbp c55009xbpFIwbmz2 = rob.OLrzqt.valueOf.fIwbmz();
                    if (c55009xbpFIwbmz2 != null && (c55001xbhEZpvd = c55009xbpFIwbmz2.EZpvd()) != null) {
                        c55001xbhEZpvd.setText("");
                    }
                }
                if (inputSSNAppModel != null) {
                    inputSSNAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        if (str != null) {
            uIComponentAppModel.setValue(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(rOB rob, rAX rax, java.lang.String str) {
        java.lang.CharSequence charSequence;
        if (str == null || (charSequence = (java.lang.CharSequence) rax.getValue()) == null || charSequence.length() == 0) {
            rob.OLrzqt.AEQbTJ.setVisibility(8);
        } else {
            rob.OLrzqt.AEQbTJ.setVisibility(8);
            rob.OLrzqt.AEQbTJ.setText(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final void EZpvd(rGL rgl, rOB rob, android.view.View view, boolean z) {
        java.util.List<rAX<java.lang.String>> listDNCPSb;
        if (z || rgl == null || (listDNCPSb = rgl.dNCPSb()) == null) {
            return;
        }
        java.util.Iterator<T> it = listDNCPSb.iterator();
        while (it.hasNext()) {
            rAX rax = (rAX) it.next();
            java.lang.String str = rob.AEQbTJ;
            if (str == null) {
                Intrinsics.gEmmrt("");
                str = null;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) rax.OLrzqt())) {
                rax.OLrzqt(true);
            }
        }
    }

    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ rOB OLrzqt;
        public final /* synthetic */ rGL copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(rGL rgl, rOB rob) {
            this.copydefault = rgl;
            this.OLrzqt = rob;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.util.List<rAX<java.lang.String>> listDNCPSb;
            rGL rgl = this.copydefault;
            if (rgl == null || (listDNCPSb = rgl.dNCPSb()) == null) {
                return;
            }
            rOB rob = this.OLrzqt;
            java.util.Iterator<T> it = listDNCPSb.iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                java.lang.String str = rob.AEQbTJ;
                if (str == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                }
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) rax.OLrzqt())) {
                    rax.setValue(java.lang.String.valueOf(editable));
                }
            }
        }
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel) {
        C55001xbh c55001xbhEZpvd;
        Rule rule;
        java.lang.Long max;
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55001xbh c55001xbhEZpvd2;
        C55001xbh c55001xbhEZpvd3;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.AhwBna, uIComponentAppModel.getBottomMargin()));
        final InputSSNAppModel inputSSNAppModel = uIComponentAppModel instanceof InputSSNAppModel ? (InputSSNAppModel) uIComponentAppModel : null;
        if (inputSSNAppModel != null) {
            this.AEQbTJ = inputSSNAppModel.getId();
            android.widget.TextView textView = this.OLrzqt.KWHzl;
            TextViewCompat.setTextAppearance(textView, this.KWHzl.AkhnZx());
            textView.setTextSize(0, this.KWHzl.DbNXlk());
            textView.setTextColor(this.KWHzl.fetchVPNInfo());
            android.widget.TextView textView2 = this.OLrzqt.AEQbTJ;
            TextViewCompat.setTextAppearance(textView2, this.KWHzl.AYXKKw());
            textView2.setTextSize(0, this.KWHzl.copydefault());
            textView2.setTextColor(this.KWHzl.gEmmrt());
            C55009xbp c55009xbpFIwbmz = this.OLrzqt.valueOf.fIwbmz();
            if (c55009xbpFIwbmz != null && (c55001xbhEZpvd3 = c55009xbpFIwbmz.EZpvd()) != null) {
                c55001xbhEZpvd3.setInputType(3);
            }
            C55009xbp c55009xbpFIwbmz2 = this.OLrzqt.valueOf.fIwbmz();
            if (c55009xbpFIwbmz2 != null && (c55001xbhEZpvd2 = c55009xbpFIwbmz2.EZpvd()) != null) {
                c55001xbhEZpvd2.setKeyListener(this.copydefault);
            }
            this.OLrzqt.valueOf.setSaveEnabled(false);
            C55009xbp c55009xbpFIwbmz3 = this.OLrzqt.valueOf.fIwbmz();
            if (c55009xbpFIwbmz3 != null) {
                c55009xbpFIwbmz3.setSaveEnabled(false);
            }
            C55009xbp c55009xbpFIwbmz4 = this.OLrzqt.valueOf.fIwbmz();
            if (c55009xbpFIwbmz4 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz4.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                c55001xbh.setSaveEnabled(false);
            }
            C55001xbh c55001xbhAkhnZx = this.OLrzqt.valueOf.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[1];
                java.util.List<Rule> rules = inputSSNAppModel.getRules();
                inputFilterArr[0] = new InputFilter.LengthFilter((int) (((rules == null || (rule = rules.get(0)) == null || (max = rule.getMax()) == null) ? 9999L : max.longValue()) - 1));
                c55001xbhAkhnZx.setFilters(inputFilterArr);
            }
            if (inputSSNAppModel.getShowInput()) {
                C55009xbp c55009xbpFIwbmz5 = this.OLrzqt.valueOf.fIwbmz();
                if (c55009xbpFIwbmz5 != null) {
                    c55009xbpFIwbmz5.values();
                }
                this.OLrzqt.valueOf.setIconView(C52761wXj.TaskDescription.ODCBUN);
            } else {
                C55009xbp c55009xbpFIwbmz6 = this.OLrzqt.valueOf.fIwbmz();
                if (c55009xbpFIwbmz6 != null) {
                    c55009xbpFIwbmz6.isConnected();
                }
                this.OLrzqt.valueOf.setIconView(C52761wXj.TaskDescription.invokespecialgBtXYZ);
            }
            java.lang.Boolean enabled = inputSSNAppModel.getEnabled();
            if (enabled != null) {
                enabled.booleanValue();
                if (Intrinsics.EZpvd(inputSSNAppModel.getEnabled(), java.lang.Boolean.TRUE)) {
                    if (hasFocus()) {
                        this.OLrzqt.valueOf.setState(1);
                    } else {
                        this.OLrzqt.valueOf.setState(0);
                    }
                } else {
                    this.OLrzqt.valueOf.setState(3);
                }
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inputSSNAppModel.getLabel())) {
                this.OLrzqt.KWHzl.setVisibility(0);
                this.OLrzqt.KWHzl.setText(inputSSNAppModel.getLabel());
            } else {
                this.OLrzqt.KWHzl.setVisibility(8);
            }
            java.lang.String placeholder = inputSSNAppModel.getPlaceholder();
            if (placeholder != null) {
                this.OLrzqt.valueOf.setHintText(placeholder);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inputSSNAppModel.getPrefix())) {
                this.OLrzqt.copydefault.setVisibility(0);
                this.OLrzqt.copydefault.setText(inputSSNAppModel.getPrefix());
            } else {
                this.OLrzqt.copydefault.setVisibility(8);
            }
            C55009xbp c55009xbpFIwbmz7 = this.OLrzqt.valueOf.fIwbmz();
            if (c55009xbpFIwbmz7 != null && (c55001xbhEZpvd = c55009xbpFIwbmz7.EZpvd()) != null) {
                c55001xbhEZpvd.setText(((InputSSNAppModel) uIComponentAppModel).getValue());
            }
            this.OLrzqt.valueOf.setOnIconClickListener(new View.OnClickListener() { // from class: o.rOG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rOB.OLrzqt(inputSSNAppModel, this, view);
                }
            });
        }
    }

    public static final void OLrzqt(InputSSNAppModel inputSSNAppModel, rOB rob, android.view.View view) {
        if (inputSSNAppModel.getShowInput()) {
            C55009xbp c55009xbpFIwbmz = rob.OLrzqt.valueOf.fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.isConnected();
            }
            rob.OLrzqt.valueOf.setIconView(C52761wXj.TaskDescription.invokespecialgBtXYZ);
        } else {
            C55009xbp c55009xbpFIwbmz2 = rob.OLrzqt.valueOf.fIwbmz();
            if (c55009xbpFIwbmz2 != null) {
                c55009xbpFIwbmz2.values();
            }
            rob.OLrzqt.valueOf.setIconView(C52761wXj.TaskDescription.ODCBUN);
        }
        inputSSNAppModel.setShowInput(!inputSSNAppModel.getShowInput());
    }
}
