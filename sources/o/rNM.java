package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rNM extends android.widget.FrameLayout {
    public final AbstractC43907ryD EZpvd;
    public java.lang.String OLrzqt;
    public ViewStatus copydefault;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.copydefault = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rNM(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.hBpjJd, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43907ryD) viewDataBindingInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rNM(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.copydefault = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.hBpjJd, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43907ryD) viewDataBindingInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rNM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.hBpjJd, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43907ryD) viewDataBindingInflate;
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.util.List<rAX<Date>> listQbewEr;
        java.lang.String value;
        java.lang.Boolean required;
        java.lang.String value2;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        java.lang.String str = null;
        final rGL rgl = abstractC42074rFj instanceof rGL ? (rGL) abstractC42074rFj : null;
        final InputDateAppModel inputDateAppModel = uIComponentAppModel instanceof InputDateAppModel ? (InputDateAppModel) uIComponentAppModel : null;
        if (rgl == null || (listQbewEr = rgl.QbewEr()) == null) {
            return;
        }
        java.util.Iterator<T> it = listQbewEr.iterator();
        while (it.hasNext()) {
            final rAX rax = (rAX) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputDateAppModel != null ? inputDateAppModel.getId() : str))) {
                C55009xbp c55009xbpFIwbmz = this.EZpvd.OLrzqt.fIwbmz();
                if (c55009xbpFIwbmz != null) {
                    c55009xbpFIwbmz.setContentDescription(inputDateAppModel != null ? inputDateAppModel.getId() : str);
                }
                rax.setValue((inputDateAppModel == null || (value2 = inputDateAppModel.getValue()) == null) ? str : C43699ruH.KWHzl.OLrzqt(value2));
                boolean zBooleanValue = false;
                if (inputDateAppModel != null && Intrinsics.EZpvd(inputDateAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                    rax.EZpvd(false);
                    if (inputDateAppModel == null || !Intrinsics.EZpvd(inputDateAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                        rax.setValue(str);
                    }
                } else {
                    setVisibility(0);
                    if (inputDateAppModel != null && (required = inputDateAppModel.getRequired()) != null) {
                        zBooleanValue = required.booleanValue();
                    }
                    rax.EZpvd(zBooleanValue);
                    rax.setValue((inputDateAppModel == null || (value = inputDateAppModel.getValue()) == null) ? str : C43699ruH.KWHzl.OLrzqt(value));
                }
                rgl.gasjUx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rNU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rNM.KWHzl(inputDateAppModel, this, rax, (C42156rIk) obj);
                    }
                }));
                C41959rBc.EZpvd(rax, lifecycleOwner, new Function1() { // from class: o.rNR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rNM.copydefault(inputDateAppModel, uIComponentAppModel, this, (Date) obj);
                    }
                }, new Function1() { // from class: o.rNT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rNM.OLrzqt((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rNS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rNM.copydefault(rax, rgl, inputDateAppModel, this, (java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.rNQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rNM.copydefault();
                    }
                });
                C55009xbp c55009xbpFIwbmz2 = this.EZpvd.OLrzqt.fIwbmz();
                if (c55009xbpFIwbmz2 != null) {
                    c55009xbpFIwbmz2.setOnClickListener(new Application(c55009xbpFIwbmz2, 1000L, rax, fragmentManager, this));
                }
            }
            str = null;
        }
    }

    public static final Unit KWHzl(InputDateAppModel inputDateAppModel, rNM rnm, rAX rax, C42156rIk c42156rIk) {
        C55009xbp c55009xbpFIwbmz;
        C55001xbh c55001xbhEZpvd;
        C55009xbp c55009xbpFIwbmz2;
        C55001xbh c55001xbhEZpvd2;
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputDateAppModel != null ? inputDateAppModel.getId() : null) && rnm.getVisibility() == 8) {
                rnm.setVisibility(0);
                rax.EZpvd((inputDateAppModel == null || (required = inputDateAppModel.getRequired()) == null) ? false : required.booleanValue());
                if (inputDateAppModel == null || !Intrinsics.EZpvd(inputDateAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    C55008xbo c55008xbo = rnm.EZpvd.OLrzqt;
                    if (c55008xbo != null && (c55009xbpFIwbmz2 = c55008xbo.fIwbmz()) != null && (c55001xbhEZpvd2 = c55009xbpFIwbmz2.EZpvd()) != null) {
                        c55001xbhEZpvd2.setText("");
                    }
                }
                if (inputDateAppModel != null) {
                    inputDateAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputDateAppModel != null ? inputDateAppModel.getId() : null) && rnm.getVisibility() == 0) {
                rnm.setVisibility(8);
                rax.EZpvd(false);
                if (inputDateAppModel == null || !Intrinsics.EZpvd(inputDateAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    C55008xbo c55008xbo2 = rnm.EZpvd.OLrzqt;
                    if (c55008xbo2 != null && (c55009xbpFIwbmz = c55008xbo2.fIwbmz()) != null && (c55001xbhEZpvd = c55009xbpFIwbmz.EZpvd()) != null) {
                        c55001xbhEZpvd.setText("");
                    }
                }
                if (inputDateAppModel != null) {
                    inputDateAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(InputDateAppModel inputDateAppModel, UIComponentAppModel uIComponentAppModel, rNM rnm, Date date) {
        java.lang.String simpleDate$default;
        C55009xbp c55009xbpFIwbmz;
        C55001xbh c55001xbhEZpvd;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (inputDateAppModel != null ? inputDateAppModel.getDateFormat() : null))) {
            if (date != null) {
                C43699ruH c43699ruH = C43699ruH.KWHzl;
                java.lang.String dateFormat = inputDateAppModel != null ? inputDateAppModel.getDateFormat() : null;
                Intrinsics.copydefault((java.lang.Object) dateFormat);
                simpleDate$default = c43699ruH.OLrzqt(date, dateFormat);
            } else {
                simpleDate$default = null;
            }
        } else if (date != null) {
            simpleDate$default = pTA.formatSimpleDate$default(date, null, 1, null);
        }
        uIComponentAppModel.setValue(date != null ? C43699ruH.KWHzl.OLrzqt(date) : null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) simpleDate$default) && (c55009xbpFIwbmz = rnm.EZpvd.OLrzqt.fIwbmz()) != null && (c55001xbhEZpvd = c55009xbpFIwbmz.EZpvd()) != null) {
            c55001xbhEZpvd.setText(simpleDate$default);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(rAX rax, rGL rgl, InputDateAppModel inputDateAppModel, rNM rnm, java.lang.String str) {
        if (str != null && rax.getValue() != 0) {
            rgl.gasjUx().setValue(new C42156rIk(inputDateAppModel != null ? inputDateAppModel.getHiddenOnErrorItemIds() : null, null, 2, null));
            rnm.EZpvd.OLrzqt.setErrorText(str);
        } else {
            rgl.gasjUx().setValue(new C42156rIk(null, inputDateAppModel != null ? inputDateAppModel.getHiddenOnErrorItemIds() : null, 1, null));
            rnm.EZpvd.OLrzqt.values();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements rLF {
        public final /* synthetic */ rAX<Date> copydefault;

        public TaskDescription(rAX<Date> rax) {
            this.copydefault = rax;
        }

        @Override // o.rLF
        public void KWHzl(Date date) {
            Intrinsics.checkNotNullParameter(date, "");
            this.copydefault.setValue(date);
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ rAX AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ rNM KWHzl;
        public final /* synthetic */ androidx.fragment.app.FragmentManager OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, rAX rax, androidx.fragment.app.FragmentManager fragmentManager, rNM rnm) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = rax;
            this.OLrzqt = fragmentManager;
            this.KWHzl = rnm;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (C42459rTq.KWHzl.gEmmrt()) {
                    rLC.Companion.OLrzqt(new TaskDescription(this.AEQbTJ), (Date) this.AEQbTJ.getValue()).show(this.OLrzqt);
                    return;
                }
                C43699ruH c43699ruH = C43699ruH.KWHzl;
                long jEZpvd = c43699ruH.EZpvd();
                Date date = (Date) this.AEQbTJ.getValue();
                if (date != null) {
                    jEZpvd = date.getTime();
                }
                MaterialDatePicker<java.lang.Long> materialDatePickerBuild = MaterialDatePicker.Builder.datePicker().setSelection(java.lang.Long.valueOf(c43699ruH.AEQbTJ(jEZpvd))).setTitleText(this.KWHzl.getContext().getString(C43662rtX.Dialog.OcIXYQ)).setPositiveButtonText(this.KWHzl.getContext().getString(C43662rtX.Dialog.zsXlph)).setNegativeButtonText(this.KWHzl.getContext().getString(C43662rtX.Dialog.wlaJM)).setTheme(C34704nhP.copydefault.copydefault() ? C43662rtX.FragmentManager.OLrzqt : C43662rtX.FragmentManager.KWHzl).build();
                Intrinsics.checkNotNullExpressionValue(materialDatePickerBuild, "");
                materialDatePickerBuild.show(this.OLrzqt, "material_date_picker");
                materialDatePickerBuild.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener(new StateListAnimator(this.AEQbTJ)) { // from class: o.rNM.FragmentManager
                    public final /* synthetic */ Function1 copydefault;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.copydefault = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
                    public final /* synthetic */ void onPositiveButtonClick(java.lang.Object obj) {
                        this.copydefault.invoke(obj);
                    }
                });
                materialDatePickerBuild.addOnDismissListener(this.KWHzl.new ActionBar());
            }
        }
    }

    public static final class StateListAnimator implements Function1<java.lang.Long, Unit> {
        public final /* synthetic */ rAX<Date> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(rAX<Date> rax) {
            this.EZpvd = rax;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Long l) {
            KWHzl(l);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Long l) {
            rAX<Date> rax = this.EZpvd;
            C43699ruH c43699ruH = C43699ruH.KWHzl;
            Intrinsics.copydefault(l);
            rax.setValue(new Date(c43699ruH.OLrzqt(l.longValue())));
        }
    }

    public static final class ActionBar implements DialogInterface.OnDismissListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(android.content.DialogInterface dialogInterface) {
            C43699ruH c43699ruH = C43699ruH.KWHzl;
            if (c43699ruH.OLrzqt(rNM.this)) {
                c43699ruH.copydefault();
            }
        }
    }

    public void copydefault(@NotNull UIComponentAppModel uIComponentAppModel) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55009xbp c55009xbpFIwbmz;
        C55009xbp c55009xbpFIwbmz2;
        C55009xbp c55009xbpFIwbmz3;
        C43699ruH c43699ruH;
        Date dateOLrzqt;
        java.lang.String simpleDate$default;
        C55009xbp c55009xbpFIwbmz4;
        C55001xbh c55001xbhEZpvd;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.copydefault, uIComponentAppModel.getBottomMargin()));
        InputDateAppModel inputDateAppModel = uIComponentAppModel instanceof InputDateAppModel ? (InputDateAppModel) uIComponentAppModel : null;
        if (inputDateAppModel != null) {
            this.OLrzqt = inputDateAppModel.getId();
            java.lang.Boolean enabled = inputDateAppModel.getEnabled();
            if (enabled != null) {
                enabled.booleanValue();
                if (inputDateAppModel.getEnabled().booleanValue()) {
                    this.EZpvd.OLrzqt.setState(0);
                } else {
                    this.EZpvd.OLrzqt.setState(3);
                }
            }
            java.lang.String label = inputDateAppModel.getLabel();
            if (label != null) {
                this.EZpvd.OLrzqt.setLabelText(label);
            }
            java.lang.String placeholder = inputDateAppModel.getPlaceholder();
            if (placeholder != null) {
                this.EZpvd.OLrzqt.setHintText(placeholder);
            }
            InputDateAppModel inputDateAppModel2 = (InputDateAppModel) uIComponentAppModel;
            java.lang.String value = inputDateAppModel2.getValue();
            if (value != null && (dateOLrzqt = (c43699ruH = C43699ruH.KWHzl).OLrzqt(value)) != null) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) inputDateAppModel2.getDateFormat())) {
                    java.lang.String dateFormat = inputDateAppModel2.getDateFormat();
                    Intrinsics.copydefault((java.lang.Object) dateFormat);
                    simpleDate$default = c43699ruH.OLrzqt(dateOLrzqt, dateFormat);
                } else {
                    simpleDate$default = pTA.formatSimpleDate$default(dateOLrzqt, null, 1, null);
                }
                C55008xbo c55008xbo = this.EZpvd.OLrzqt;
                if (c55008xbo != null && (c55009xbpFIwbmz4 = c55008xbo.fIwbmz()) != null && (c55001xbhEZpvd = c55009xbpFIwbmz4.EZpvd()) != null) {
                    c55001xbhEZpvd.setText(simpleDate$default);
                }
            }
            android.util.TypedValue typedValue = new android.util.TypedValue();
            getContext().getTheme().resolveAttribute(C43662rtX.Application.djBIcL, typedValue, true);
            C55008xbo c55008xbo2 = this.EZpvd.OLrzqt;
            if (c55008xbo2 != null && (c55009xbpFIwbmz3 = c55008xbo2.fIwbmz()) != null) {
                C55009xbp.setIconImage$default(c55009xbpFIwbmz3, typedValue.resourceId, 0, 0, 0, 14, null);
            }
            C55008xbo c55008xbo3 = this.EZpvd.OLrzqt;
            if (c55008xbo3 != null && (c55009xbpFIwbmz2 = c55008xbo3.fIwbmz()) != null) {
                c55009xbpFIwbmz2.setImageTint(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
            }
            C55008xbo c55008xbo4 = this.EZpvd.OLrzqt;
            if (c55008xbo4 != null && (c55009xbpFIwbmz = c55008xbo4.fIwbmz()) != null) {
                c55009xbpFIwbmz.setInterceptEvent(true);
            }
            this.EZpvd.OLrzqt.setSaveEnabled(false);
            C55009xbp c55009xbpFIwbmz5 = this.EZpvd.OLrzqt.fIwbmz();
            if (c55009xbpFIwbmz5 != null) {
                c55009xbpFIwbmz5.setSaveEnabled(false);
            }
            C55009xbp c55009xbpFIwbmz6 = this.EZpvd.OLrzqt.fIwbmz();
            if (c55009xbpFIwbmz6 == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz6.AEQbTJ()) == null || (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) == null) {
                return;
            }
            c55001xbh.setSaveEnabled(false);
        }
    }
}
