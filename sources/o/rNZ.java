package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Rule;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import java.util.Date;
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
public final class rNZ extends android.widget.FrameLayout {
    public final AbstractC43909ryF AEQbTJ;
    public ViewStatus EZpvd;
    public java.lang.String OLrzqt;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rNZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rNZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.EZpvd = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:47) call: o.rNZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rNZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rNZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.RdAHlO, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC43909ryF) viewDataBindingInflate;
    }

    public final void EZpvd(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.util.List<rAX<InputDateRangeValue>> listQVAiDq;
        java.lang.Boolean required;
        C55009xbp c55009xbpFIwbmz;
        C55009xbp c55009xbpFIwbmz2;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        rGL rgl = abstractC42074rFj instanceof rGL ? (rGL) abstractC42074rFj : null;
        final InputDateRangeAppModel inputDateRangeAppModel = uIComponentAppModel instanceof InputDateRangeAppModel ? (InputDateRangeAppModel) uIComponentAppModel : null;
        if (rgl == null || (listQVAiDq = rgl.QVAiDq()) == null) {
            return;
        }
        java.util.Iterator<T> it = listQVAiDq.iterator();
        while (it.hasNext()) {
            final rAX rax = (rAX) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputDateRangeAppModel != null ? inputDateRangeAppModel.getId() : null))) {
                boolean zBooleanValue = false;
                if (inputDateRangeAppModel != null && Intrinsics.EZpvd(inputDateRangeAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                    rax.EZpvd(false);
                    if (inputDateRangeAppModel == null || !Intrinsics.EZpvd(inputDateRangeAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                        rax.setValue(null);
                    }
                } else {
                    setVisibility(0);
                    if (inputDateRangeAppModel != null && (required = inputDateRangeAppModel.getRequired()) != null) {
                        zBooleanValue = required.booleanValue();
                    }
                    rax.EZpvd(zBooleanValue);
                    rax.setValue(OLrzqt(inputDateRangeAppModel != null ? inputDateRangeAppModel.getFieldValue() : null));
                }
                rgl.gasjUx().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rNX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rNZ.KWHzl(inputDateRangeAppModel, this, rax, (C42156rIk) obj);
                    }
                }));
                C41959rBc.EZpvd(rax, lifecycleOwner, new Function1() { // from class: o.rOc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rNZ.OLrzqt(this.OLrzqt, inputDateRangeAppModel, (InputDateRangeValue) obj);
                    }
                }, new Function1() { // from class: o.rOe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rNZ.copydefault((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rOd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rNZ.AEQbTJ((java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.rOa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rNZ.EZpvd();
                    }
                });
                this.AEQbTJ.AEQbTJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.rOj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        rNZ.KWHzl(rax, compoundButton, z);
                    }
                });
                C55008xbo c55008xbo = this.AEQbTJ.EZpvd;
                if (c55008xbo != null && (c55009xbpFIwbmz2 = c55008xbo.fIwbmz()) != null) {
                    c55009xbpFIwbmz2.setOnClickListener(new View.OnClickListener() { // from class: o.rOh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            rNZ.copydefault(rax, this, fragmentManager, inputDateRangeAppModel, view);
                        }
                    });
                }
                C55008xbo c55008xbo2 = this.AEQbTJ.OLrzqt;
                if (c55008xbo2 != null && (c55009xbpFIwbmz = c55008xbo2.fIwbmz()) != null) {
                    c55009xbpFIwbmz.setOnClickListener(new View.OnClickListener() { // from class: o.rOf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            rNZ.EZpvd(rax, this, fragmentManager, inputDateRangeAppModel, view);
                        }
                    });
                }
            }
        }
    }

    public static final Unit KWHzl(InputDateRangeAppModel inputDateRangeAppModel, rNZ rnz, rAX rax, C42156rIk c42156rIk) {
        C55009xbp c55009xbpFIwbmz;
        C55001xbh c55001xbhEZpvd;
        C55009xbp c55009xbpFIwbmz2;
        C55001xbh c55001xbhEZpvd2;
        C55009xbp c55009xbpFIwbmz3;
        C55001xbh c55001xbhEZpvd3;
        C55009xbp c55009xbpFIwbmz4;
        C55001xbh c55001xbhEZpvd4;
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputDateRangeAppModel != null ? inputDateRangeAppModel.getId() : null) && rnz.getVisibility() == 8) {
                rnz.setVisibility(0);
                rax.EZpvd((inputDateRangeAppModel == null || (required = inputDateRangeAppModel.getRequired()) == null) ? false : required.booleanValue());
                if (inputDateRangeAppModel == null || !Intrinsics.EZpvd(inputDateRangeAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    C55008xbo c55008xbo = rnz.AEQbTJ.EZpvd;
                    if (c55008xbo != null && (c55009xbpFIwbmz4 = c55008xbo.fIwbmz()) != null && (c55001xbhEZpvd4 = c55009xbpFIwbmz4.EZpvd()) != null) {
                        c55001xbhEZpvd4.setText("");
                    }
                    C55008xbo c55008xbo2 = rnz.AEQbTJ.OLrzqt;
                    if (c55008xbo2 != null && (c55009xbpFIwbmz3 = c55008xbo2.fIwbmz()) != null && (c55001xbhEZpvd3 = c55009xbpFIwbmz3.EZpvd()) != null) {
                        c55001xbhEZpvd3.setText("");
                    }
                }
                if (inputDateRangeAppModel != null) {
                    inputDateRangeAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputDateRangeAppModel != null ? inputDateRangeAppModel.getId() : null) && rnz.getVisibility() == 0) {
                rnz.setVisibility(8);
                rax.EZpvd(false);
                if (inputDateRangeAppModel == null || !Intrinsics.EZpvd(inputDateRangeAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    C55008xbo c55008xbo3 = rnz.AEQbTJ.EZpvd;
                    if (c55008xbo3 != null && (c55009xbpFIwbmz2 = c55008xbo3.fIwbmz()) != null && (c55001xbhEZpvd2 = c55009xbpFIwbmz2.EZpvd()) != null) {
                        c55001xbhEZpvd2.setText("");
                    }
                    C55008xbo c55008xbo4 = rnz.AEQbTJ.OLrzqt;
                    if (c55008xbo4 != null && (c55009xbpFIwbmz = c55008xbo4.fIwbmz()) != null && (c55001xbhEZpvd = c55009xbpFIwbmz.EZpvd()) != null) {
                        c55001xbhEZpvd.setText("");
                    }
                }
                if (inputDateRangeAppModel != null) {
                    inputDateRangeAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088 A[PHI: r2
  0x0088: PHI (r2v30 java.lang.String) = (r2v27 java.lang.String), (r2v31 java.lang.String) binds: [B:47:0x0098, B:39:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(rNZ rnz, InputDateRangeAppModel inputDateRangeAppModel, InputDateRangeValue inputDateRangeValue) {
        java.lang.String str;
        C55009xbp c55009xbpFIwbmz;
        C55001xbh c55001xbhEZpvd;
        C55009xbp c55009xbpFIwbmz2;
        C55001xbh c55001xbhEZpvd2;
        java.lang.String simpleDate$default;
        Date date;
        java.lang.String simpleDate$default2;
        C55009xbp c55009xbpFIwbmz3;
        C55001xbh c55001xbhEZpvd3;
        InputDateRangeText placeholder;
        java.lang.String end;
        InputDateRangeText placeholder2;
        C55001xbh c55001xbhEZpvd4;
        C55009xbp c55009xbpFIwbmz4;
        C55001xbh c55001xbhEZpvd5;
        str = "";
        if (inputDateRangeValue != null) {
            java.lang.Long start = inputDateRangeValue.getStart();
            Date date2 = start != null ? new Date(start.longValue()) : null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (inputDateRangeAppModel != null ? inputDateRangeAppModel.getDateFormat() : null))) {
                if (date2 != null) {
                    C43699ruH c43699ruH = C43699ruH.KWHzl;
                    java.lang.String dateFormat = inputDateRangeAppModel != null ? inputDateRangeAppModel.getDateFormat() : null;
                    Intrinsics.copydefault((java.lang.Object) dateFormat);
                    simpleDate$default = c43699ruH.OLrzqt(date2, dateFormat);
                } else {
                    simpleDate$default = null;
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) simpleDate$default) && (c55009xbpFIwbmz4 = rnz.AEQbTJ.EZpvd.fIwbmz()) != null && (c55001xbhEZpvd5 = c55009xbpFIwbmz4.EZpvd()) != null) {
                    c55001xbhEZpvd5.setText(simpleDate$default);
                }
                if (!inputDateRangeValue.getToPresent()) {
                    rnz.AEQbTJ.OLrzqt.setState(3);
                    C55009xbp c55009xbpFIwbmz5 = rnz.AEQbTJ.OLrzqt.fIwbmz();
                    if (c55009xbpFIwbmz5 != null && (c55001xbhEZpvd4 = c55009xbpFIwbmz5.EZpvd()) != null) {
                        c55001xbhEZpvd4.setText("");
                    }
                    C55008xbo c55008xbo = rnz.AEQbTJ.OLrzqt;
                    if (inputDateRangeAppModel == null || (end = inputDateRangeAppModel.getEndDatePlaceholderIfToPresent()) == null) {
                        java.lang.String end2 = (inputDateRangeAppModel == null || (placeholder2 = inputDateRangeAppModel.getPlaceholder()) == null) ? null : placeholder2.getEnd();
                        str = end2 != null ? end2 : "";
                        c55008xbo.setHintText(str);
                        date = null;
                    }
                } else {
                    rnz.AEQbTJ.OLrzqt.setState(0);
                    C55008xbo c55008xbo2 = rnz.AEQbTJ.OLrzqt;
                    if (inputDateRangeAppModel != null && (placeholder = inputDateRangeAppModel.getPlaceholder()) != null && (end = placeholder.getEnd()) != null) {
                        str = end;
                    }
                    c55008xbo2.setHintText(str);
                    java.lang.Long end3 = inputDateRangeValue.getEnd();
                    date = end3 != null ? new Date(end3.longValue()) : null;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) (inputDateRangeAppModel != null ? inputDateRangeAppModel.getDateFormat() : null))) {
                        if (date != null) {
                            C43699ruH c43699ruH2 = C43699ruH.KWHzl;
                            java.lang.String dateFormat2 = inputDateRangeAppModel != null ? inputDateRangeAppModel.getDateFormat() : null;
                            Intrinsics.copydefault((java.lang.Object) dateFormat2);
                            simpleDate$default2 = c43699ruH2.OLrzqt(date, dateFormat2);
                        } else {
                            simpleDate$default2 = null;
                        }
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) simpleDate$default2) && (c55009xbpFIwbmz3 = rnz.AEQbTJ.OLrzqt.fIwbmz()) != null && (c55001xbhEZpvd3 = c55009xbpFIwbmz3.EZpvd()) != null) {
                            c55001xbhEZpvd3.setText(simpleDate$default2);
                        }
                    } else {
                        if (date != null) {
                            simpleDate$default2 = pTA.formatSimpleDate$default(date, null, 1, null);
                        }
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) simpleDate$default2)) {
                            c55001xbhEZpvd3.setText(simpleDate$default2);
                        }
                    }
                }
                if (inputDateRangeAppModel != null) {
                    inputDateRangeAppModel.setFieldValue(new InputDateRangeText(date2 != null ? C43699ruH.KWHzl.OLrzqt(date2) : null, date != null ? C43699ruH.KWHzl.OLrzqt(date) : null, java.lang.Boolean.valueOf(inputDateRangeValue.getToPresent())));
                }
            } else {
                if (date2 != null) {
                    simpleDate$default = pTA.formatSimpleDate$default(date2, null, 1, null);
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) simpleDate$default)) {
                    c55001xbhEZpvd5.setText(simpleDate$default);
                }
                if (!inputDateRangeValue.getToPresent()) {
                }
                if (inputDateRangeAppModel != null) {
                }
            }
        } else {
            if (inputDateRangeAppModel != null) {
                inputDateRangeAppModel.setFieldValue(null);
            }
            C55008xbo c55008xbo3 = rnz.AEQbTJ.EZpvd;
            if (c55008xbo3 != null && (c55009xbpFIwbmz2 = c55008xbo3.fIwbmz()) != null && (c55001xbhEZpvd2 = c55009xbpFIwbmz2.EZpvd()) != null) {
                c55001xbhEZpvd2.setText("");
            }
            C55008xbo c55008xbo4 = rnz.AEQbTJ.OLrzqt;
            if (c55008xbo4 != null && (c55009xbpFIwbmz = c55008xbo4.fIwbmz()) != null && (c55001xbhEZpvd = c55009xbpFIwbmz.EZpvd()) != null) {
                c55001xbhEZpvd.setText("");
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(rAX rax, android.widget.CompoundButton compoundButton, boolean z) {
        InputDateRangeValue inputDateRangeValue = (InputDateRangeValue) rax.getValue();
        rax.setValue(new InputDateRangeValue(inputDateRangeValue != null ? inputDateRangeValue.getStart() : null, null, z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(final rAX rax, rNZ rnz, androidx.fragment.app.FragmentManager fragmentManager, InputDateRangeAppModel inputDateRangeAppModel, android.view.View view) {
        Rule rule;
        java.lang.Long max;
        java.lang.Long end;
        Rule rule2;
        java.lang.Long min;
        java.lang.Long start;
        C43699ruH c43699ruH = C43699ruH.KWHzl;
        long jEZpvd = c43699ruH.EZpvd();
        InputDateRangeValue inputDateRangeValue = (InputDateRangeValue) rax.getValue();
        if (inputDateRangeValue != null && (start = inputDateRangeValue.getStart()) != null) {
            jEZpvd = start.longValue();
        }
        long jAEQbTJ = c43699ruH.AEQbTJ(jEZpvd);
        java.lang.Long lValueOf = (inputDateRangeAppModel == null || (rule2 = inputDateRangeAppModel.getRule()) == null || (min = rule2.getMin()) == null) ? null : java.lang.Long.valueOf(c43699ruH.AEQbTJ(min.longValue()));
        InputDateRangeValue inputDateRangeValue2 = (InputDateRangeValue) rax.getValue();
        rnz.AEQbTJ(fragmentManager, jAEQbTJ, lValueOf, (inputDateRangeValue2 == null || (end = inputDateRangeValue2.getEnd()) == null) ? (inputDateRangeAppModel == null || (rule = inputDateRangeAppModel.getRule()) == null || (max = rule.getMax()) == null) ? null : java.lang.Long.valueOf(c43699ruH.AEQbTJ(max.longValue())) : end, new Function1() { // from class: o.rNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rNZ.EZpvd(rax, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(rAX rax, long j) {
        long jOLrzqt = C43699ruH.KWHzl.OLrzqt(j);
        InputDateRangeValue inputDateRangeValue = (InputDateRangeValue) rax.getValue();
        java.lang.Long end = inputDateRangeValue != null ? inputDateRangeValue.getEnd() : null;
        InputDateRangeValue inputDateRangeValue2 = (InputDateRangeValue) rax.getValue();
        rax.setValue(new InputDateRangeValue(java.lang.Long.valueOf(jOLrzqt), end, inputDateRangeValue2 != null ? inputDateRangeValue2.getToPresent() : false));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(final rAX rax, rNZ rnz, androidx.fragment.app.FragmentManager fragmentManager, InputDateRangeAppModel inputDateRangeAppModel, android.view.View view) {
        java.lang.Long l;
        Rule rule;
        java.lang.Long min;
        Rule rule2;
        java.lang.Long max;
        java.lang.Long end;
        C43699ruH c43699ruH = C43699ruH.KWHzl;
        long jEZpvd = c43699ruH.EZpvd();
        InputDateRangeValue inputDateRangeValue = (InputDateRangeValue) rax.getValue();
        if (inputDateRangeValue != null && (end = inputDateRangeValue.getEnd()) != null) {
            jEZpvd = end.longValue();
        }
        long jAEQbTJ = c43699ruH.AEQbTJ(jEZpvd);
        InputDateRangeValue inputDateRangeValue2 = (InputDateRangeValue) rax.getValue();
        if (inputDateRangeValue2 != null && (lValueOf = inputDateRangeValue2.getStart()) != null) {
            l = lValueOf;
        } else if (inputDateRangeAppModel == null || (rule = inputDateRangeAppModel.getRule()) == null || (min = rule.getMin()) == null) {
            l = null;
        } else {
            java.lang.Long lValueOf = java.lang.Long.valueOf(c43699ruH.AEQbTJ(min.longValue()));
            l = lValueOf;
        }
        rnz.AEQbTJ(fragmentManager, jAEQbTJ, l, (inputDateRangeAppModel == null || (rule2 = inputDateRangeAppModel.getRule()) == null || (max = rule2.getMax()) == null) ? null : java.lang.Long.valueOf(c43699ruH.AEQbTJ(max.longValue())), new Function1() { // from class: o.rOb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rNZ.AEQbTJ(rax, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(rAX rax, long j) {
        InputDateRangeValue inputDateRangeValue = (InputDateRangeValue) rax.getValue();
        java.lang.Long start = inputDateRangeValue != null ? inputDateRangeValue.getStart() : null;
        long jOLrzqt = C43699ruH.KWHzl.OLrzqt(j);
        InputDateRangeValue inputDateRangeValue2 = (InputDateRangeValue) rax.getValue();
        rax.setValue(new InputDateRangeValue(start, java.lang.Long.valueOf(jOLrzqt), inputDateRangeValue2 != null ? inputDateRangeValue2.getToPresent() : false));
        return Unit.INSTANCE;
    }

    public final InputDateRangeValue OLrzqt(InputDateRangeText inputDateRangeText) {
        Date dateOLrzqt;
        Date dateOLrzqt2;
        java.lang.Long lValueOf = null;
        if (inputDateRangeText == null) {
            return null;
        }
        java.lang.String start = inputDateRangeText.getStart();
        java.lang.Long lValueOf2 = (start == null || (dateOLrzqt2 = C43699ruH.KWHzl.OLrzqt(start)) == null) ? null : java.lang.Long.valueOf(dateOLrzqt2.getTime());
        java.lang.String end = inputDateRangeText.getEnd();
        if (end != null && (dateOLrzqt = C43699ruH.KWHzl.OLrzqt(end)) != null) {
            lValueOf = java.lang.Long.valueOf(dateOLrzqt.getTime());
        }
        java.lang.Boolean toPresent = inputDateRangeText.getToPresent();
        return new InputDateRangeValue(lValueOf2, lValueOf, toPresent != null ? toPresent.booleanValue() : false);
    }

    public final void AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, long j, java.lang.Long l, java.lang.Long l2, final Function1<? super java.lang.Long, Unit> function1) {
        int i = C34704nhP.copydefault.copydefault() ? C43662rtX.FragmentManager.OLrzqt : C43662rtX.FragmentManager.KWHzl;
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (l != null) {
            DateValidatorPointForward dateValidatorPointForwardFrom = DateValidatorPointForward.from(l.longValue());
            Intrinsics.checkNotNullExpressionValue(dateValidatorPointForwardFrom, "");
            arrayList.add(dateValidatorPointForwardFrom);
        }
        if (l2 != null) {
            l2.longValue();
            DateValidatorPointBackward dateValidatorPointBackwardBefore = DateValidatorPointBackward.before(l2.longValue());
            Intrinsics.checkNotNullExpressionValue(dateValidatorPointBackwardBefore, "");
            arrayList.add(dateValidatorPointBackwardBefore);
        }
        CalendarConstraints.DateValidator dateValidatorAllOf = CompositeDateValidator.allOf(arrayList);
        Intrinsics.checkNotNullExpressionValue(dateValidatorAllOf, "");
        builder.setValidator(dateValidatorAllOf);
        MaterialDatePicker<java.lang.Long> materialDatePickerBuild = MaterialDatePicker.Builder.datePicker().setSelection(java.lang.Long.valueOf(j)).setCalendarConstraints(builder.build()).setTheme(i).setTitleText(getContext().getString(C43662rtX.Dialog.OcIXYQ)).setPositiveButtonText(getContext().getString(C43662rtX.Dialog.zsXlph)).setNegativeButtonText(getContext().getString(C43662rtX.Dialog.wlaJM)).build();
        Intrinsics.checkNotNullExpressionValue(materialDatePickerBuild, "");
        materialDatePickerBuild.show(fragmentManager, "material_date_picker");
        final Function1 function12 = new Function1() { // from class: o.rOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rNZ.EZpvd(function1, (java.lang.Long) obj);
            }
        };
        materialDatePickerBuild.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() { // from class: o.rNV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
            public final void onPositiveButtonClick(java.lang.Object obj) {
                rNZ.copydefault(function12, obj);
            }
        });
        materialDatePickerBuild.addOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.rNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                rNZ.AEQbTJ(this.AEQbTJ, dialogInterface);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Long l) {
        Intrinsics.copydefault(l);
        function1.invoke(l);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(rNZ rnz, android.content.DialogInterface dialogInterface) {
        C43699ruH c43699ruH = C43699ruH.KWHzl;
        if (c43699ruH.OLrzqt(rnz)) {
            c43699ruH.copydefault();
        }
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55009xbp c55009xbpFIwbmz;
        C55009xbp c55009xbpFIwbmz2;
        C55009xbp c55009xbpFIwbmz3;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        C55009xbp c55009xbpFIwbmz4;
        C55009xbp c55009xbpFIwbmz5;
        C55009xbp c55009xbpFIwbmz6;
        C43699ruH c43699ruH;
        Date dateOLrzqt;
        java.lang.String simpleDate$default;
        C55009xbp c55009xbpFIwbmz7;
        C55001xbh c55001xbhEZpvd;
        C55001xbh c55001xbhEZpvd2;
        C43699ruH c43699ruH2;
        Date dateOLrzqt2;
        java.lang.String simpleDate$default2;
        C55009xbp c55009xbpFIwbmz8;
        C55001xbh c55001xbhEZpvd3;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.EZpvd, uIComponentAppModel.getBottomMargin()));
        InputDateRangeAppModel inputDateRangeAppModel = uIComponentAppModel instanceof InputDateRangeAppModel ? (InputDateRangeAppModel) uIComponentAppModel : null;
        if (inputDateRangeAppModel != null) {
            this.OLrzqt = inputDateRangeAppModel.getId();
            this.AEQbTJ.copydefault.setContentDescription(inputDateRangeAppModel.getId());
            this.AEQbTJ.EZpvd.setContentDescription("start_input_date");
            this.AEQbTJ.OLrzqt.setContentDescription("end_input_date");
            this.AEQbTJ.AEQbTJ.setContentDescription("toPresent_checkbox");
            java.lang.Boolean enabled = inputDateRangeAppModel.getEnabled();
            if (enabled != null) {
                enabled.booleanValue();
                if (inputDateRangeAppModel.getEnabled().booleanValue()) {
                    this.AEQbTJ.EZpvd.setState(0);
                    this.AEQbTJ.OLrzqt.setState(0);
                } else {
                    this.AEQbTJ.EZpvd.setState(3);
                    this.AEQbTJ.OLrzqt.setState(3);
                }
            }
            InputDateRangeText label = inputDateRangeAppModel.getLabel();
            if (label != null) {
                C55008xbo c55008xbo = this.AEQbTJ.EZpvd;
                java.lang.String start = label.getStart();
                if (start == null) {
                    start = "";
                }
                c55008xbo.setLabelText(start);
                C55008xbo c55008xbo2 = this.AEQbTJ.OLrzqt;
                java.lang.String end = label.getEnd();
                if (end == null) {
                    end = "";
                }
                c55008xbo2.setLabelText(end);
            }
            InputDateRangeText placeholder = inputDateRangeAppModel.getPlaceholder();
            if (placeholder != null) {
                C55008xbo c55008xbo3 = this.AEQbTJ.EZpvd;
                java.lang.String start2 = placeholder.getStart();
                if (start2 == null) {
                    start2 = "";
                }
                c55008xbo3.setHintText(start2);
                C55008xbo c55008xbo4 = this.AEQbTJ.OLrzqt;
                java.lang.String end2 = placeholder.getEnd();
                if (end2 == null) {
                    end2 = "";
                }
                c55008xbo4.setHintText(end2);
            }
            wYK wyk = this.AEQbTJ.AEQbTJ;
            java.lang.String toPresentCheckboxText = inputDateRangeAppModel.getToPresentCheckboxText();
            if (toPresentCheckboxText == null) {
                toPresentCheckboxText = "";
            }
            wyk.setText(toPresentCheckboxText);
            InputDateRangeAppModel inputDateRangeAppModel2 = (InputDateRangeAppModel) uIComponentAppModel;
            InputDateRangeText fieldValue = inputDateRangeAppModel2.getFieldValue();
            if (fieldValue != null) {
                java.lang.String start3 = fieldValue.getStart();
                if (start3 != null && (dateOLrzqt2 = (c43699ruH2 = C43699ruH.KWHzl).OLrzqt(start3)) != null) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) inputDateRangeAppModel2.getDateFormat())) {
                        java.lang.String dateFormat = inputDateRangeAppModel2.getDateFormat();
                        Intrinsics.copydefault((java.lang.Object) dateFormat);
                        simpleDate$default2 = c43699ruH2.OLrzqt(dateOLrzqt2, dateFormat);
                    } else {
                        simpleDate$default2 = pTA.formatSimpleDate$default(dateOLrzqt2, null, 1, null);
                    }
                    C55008xbo c55008xbo5 = this.AEQbTJ.EZpvd;
                    if (c55008xbo5 != null && (c55009xbpFIwbmz8 = c55008xbo5.fIwbmz()) != null && (c55001xbhEZpvd3 = c55009xbpFIwbmz8.EZpvd()) != null) {
                        c55001xbhEZpvd3.setText(simpleDate$default2);
                    }
                }
                wYK wyk2 = this.AEQbTJ.AEQbTJ;
                java.lang.Boolean toPresent = fieldValue.getToPresent();
                wyk2.setChecked(toPresent != null ? toPresent.booleanValue() : false);
                if (Intrinsics.EZpvd(fieldValue.getToPresent(), java.lang.Boolean.TRUE)) {
                    this.AEQbTJ.OLrzqt.setState(3);
                    C55009xbp c55009xbpFIwbmz9 = this.AEQbTJ.OLrzqt.fIwbmz();
                    if (c55009xbpFIwbmz9 != null && (c55001xbhEZpvd2 = c55009xbpFIwbmz9.EZpvd()) != null) {
                        c55001xbhEZpvd2.setText("");
                    }
                    C55008xbo c55008xbo6 = this.AEQbTJ.OLrzqt;
                    java.lang.String endDatePlaceholderIfToPresent = inputDateRangeAppModel2.getEndDatePlaceholderIfToPresent();
                    if (endDatePlaceholderIfToPresent == null) {
                        InputDateRangeText placeholder2 = inputDateRangeAppModel2.getPlaceholder();
                        java.lang.String end3 = placeholder2 != null ? placeholder2.getEnd() : null;
                        if (end3 != null) {
                            str = end3;
                        }
                    } else {
                        str = endDatePlaceholderIfToPresent;
                    }
                    c55008xbo6.setHintText(str);
                } else {
                    java.lang.String end4 = fieldValue.getEnd();
                    if (end4 != null && (dateOLrzqt = (c43699ruH = C43699ruH.KWHzl).OLrzqt(end4)) != null) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) inputDateRangeAppModel2.getDateFormat())) {
                            java.lang.String dateFormat2 = inputDateRangeAppModel2.getDateFormat();
                            Intrinsics.copydefault((java.lang.Object) dateFormat2);
                            simpleDate$default = c43699ruH.OLrzqt(dateOLrzqt, dateFormat2);
                        } else {
                            simpleDate$default = pTA.formatSimpleDate$default(dateOLrzqt, null, 1, null);
                        }
                        C55008xbo c55008xbo7 = this.AEQbTJ.OLrzqt;
                        if (c55008xbo7 != null && (c55009xbpFIwbmz7 = c55008xbo7.fIwbmz()) != null && (c55001xbhEZpvd = c55009xbpFIwbmz7.EZpvd()) != null) {
                            c55001xbhEZpvd.setText(simpleDate$default);
                        }
                    }
                }
            }
            android.util.TypedValue typedValue = new android.util.TypedValue();
            getContext().getTheme().resolveAttribute(C43662rtX.Application.djBIcL, typedValue, true);
            C55008xbo c55008xbo8 = this.AEQbTJ.EZpvd;
            if (c55008xbo8 != null && (c55009xbpFIwbmz6 = c55008xbo8.fIwbmz()) != null) {
                C55009xbp.setIconImage$default(c55009xbpFIwbmz6, typedValue.resourceId, 0, 0, 0, 14, null);
            }
            C55008xbo c55008xbo9 = this.AEQbTJ.EZpvd;
            if (c55008xbo9 != null && (c55009xbpFIwbmz5 = c55008xbo9.fIwbmz()) != null) {
                c55009xbpFIwbmz5.setImageTint(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
            }
            C55008xbo c55008xbo10 = this.AEQbTJ.EZpvd;
            if (c55008xbo10 != null && (c55009xbpFIwbmz4 = c55008xbo10.fIwbmz()) != null) {
                c55009xbpFIwbmz4.setInterceptEvent(true);
            }
            this.AEQbTJ.EZpvd.setSaveEnabled(false);
            C55009xbp c55009xbpFIwbmz10 = this.AEQbTJ.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz10 != null) {
                c55009xbpFIwbmz10.setSaveEnabled(false);
            }
            C55009xbp c55009xbpFIwbmz11 = this.AEQbTJ.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz11 != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz11.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                c55001xbh2.setSaveEnabled(false);
            }
            android.util.TypedValue typedValue2 = new android.util.TypedValue();
            getContext().getTheme().resolveAttribute(C43662rtX.Application.djBIcL, typedValue2, true);
            C55008xbo c55008xbo11 = this.AEQbTJ.OLrzqt;
            if (c55008xbo11 != null && (c55009xbpFIwbmz3 = c55008xbo11.fIwbmz()) != null) {
                C55009xbp.setIconImage$default(c55009xbpFIwbmz3, typedValue2.resourceId, 0, 0, 0, 14, null);
            }
            C55008xbo c55008xbo12 = this.AEQbTJ.OLrzqt;
            if (c55008xbo12 != null && (c55009xbpFIwbmz2 = c55008xbo12.fIwbmz()) != null) {
                c55009xbpFIwbmz2.setImageTint(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
            }
            C55008xbo c55008xbo13 = this.AEQbTJ.OLrzqt;
            if (c55008xbo13 != null && (c55009xbpFIwbmz = c55008xbo13.fIwbmz()) != null) {
                c55009xbpFIwbmz.setInterceptEvent(true);
            }
            this.AEQbTJ.OLrzqt.setSaveEnabled(false);
            C55009xbp c55009xbpFIwbmz12 = this.AEQbTJ.OLrzqt.fIwbmz();
            if (c55009xbpFIwbmz12 != null) {
                c55009xbpFIwbmz12.setSaveEnabled(false);
            }
            C55009xbp c55009xbpFIwbmz13 = this.AEQbTJ.OLrzqt.fIwbmz();
            if (c55009xbpFIwbmz13 == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz13.AEQbTJ()) == null || (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) == null) {
                return;
            }
            c55001xbh.setSaveEnabled(false);
        }
    }
}
