package o;

import android.text.InputFilter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Dependency;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormat;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormatTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Rule;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.InputFormattedTextItemView$observe$1$1$9$afterTextChanged$1$2$run$1$2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rOp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42323rOp extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public ViewStatus AhwBna;
    public final AbstractC43912ryI EZpvd;
    public boolean OLrzqt;
    public final android.text.method.KeyListener copydefault;
    public java.util.Map<java.lang.String, java.lang.String> gEmmrt;

    /* JADX INFO: renamed from: o.rOp$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.AhwBna = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42323rOp(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.OFhtUX, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43912ryI) viewDataBindingInflate;
        this.AhwBna = ViewStatus.Form;
        this.gEmmrt = new LinkedHashMap();
        android.text.method.DigitsKeyListener digitsKeyListener = android.text.method.DigitsKeyListener.getInstance("1234567890");
        Intrinsics.checkNotNullExpressionValue(digitsKeyListener, "");
        this.copydefault = digitsKeyListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42323rOp(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.OFhtUX, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43912ryI) viewDataBindingInflate;
        this.AhwBna = ViewStatus.Form;
        this.gEmmrt = new LinkedHashMap();
        android.text.method.DigitsKeyListener digitsKeyListener = android.text.method.DigitsKeyListener.getInstance("1234567890");
        Intrinsics.checkNotNullExpressionValue(digitsKeyListener, "");
        this.copydefault = digitsKeyListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42323rOp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.OFhtUX, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43912ryI) viewDataBindingInflate;
        this.AhwBna = ViewStatus.Form;
        this.gEmmrt = new LinkedHashMap();
        android.text.method.DigitsKeyListener digitsKeyListener = android.text.method.DigitsKeyListener.getInstance("1234567890");
        Intrinsics.checkNotNullExpressionValue(digitsKeyListener, "");
        this.copydefault = digitsKeyListener;
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull final UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.util.List<rAX<java.lang.String>> listDNCPSb;
        final C42323rOp c42323rOp = this;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        java.lang.String str = null;
        final rGL rgl = abstractC42074rFj instanceof rGL ? (rGL) abstractC42074rFj : null;
        final InputFormatTextAppModel inputFormatTextAppModel = uIComponentAppModel instanceof InputFormatTextAppModel ? (InputFormatTextAppModel) uIComponentAppModel : null;
        if (inputFormatTextAppModel == null || rgl == null || (listDNCPSb = rgl.dNCPSb()) == null) {
            return;
        }
        java.util.Iterator<T> it = listDNCPSb.iterator();
        while (it.hasNext()) {
            final rAX rax = (rAX) it.next();
            final java.lang.String id = inputFormatTextAppModel.getId();
            if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) id)) {
                C55009xbp c55009xbpFIwbmz = c42323rOp.EZpvd.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz != null) {
                    c55009xbpFIwbmz.setContentDescription(id);
                }
                rax.setValue(inputFormatTextAppModel.getValue());
                if (Intrinsics.EZpvd(inputFormatTextAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    c42323rOp.setVisibility(8);
                    rax.EZpvd(false);
                    if (!Intrinsics.EZpvd(inputFormatTextAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                        rax.setValue(str);
                    }
                } else {
                    c42323rOp.setVisibility(0);
                    java.lang.Boolean required = inputFormatTextAppModel.getRequired();
                    rax.EZpvd(required != null ? required.booleanValue() : false);
                    java.lang.String value = inputFormatTextAppModel.getValue();
                    if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                        value = str;
                    }
                    rax.setValue(value);
                }
                rgl.gasjUx().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rOr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42323rOp.OLrzqt(inputFormatTextAppModel, c42323rOp, rax, (C42156rIk) obj);
                    }
                }));
                C41959rBc.EZpvd(rax, lifecycleOwner, new Function1() { // from class: o.rOq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42323rOp.EZpvd(uIComponentAppModel, rax, rgl, id, (java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rOy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42323rOp.OLrzqt((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rOu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42323rOp.OLrzqt(this.AEQbTJ, rax, (java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.rOv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C42323rOp.EZpvd();
                    }
                });
                if (inputFormatTextAppModel.getDependency() != null) {
                    c42323rOp.OLrzqt = true;
                }
                final C55009xbp c55009xbpFIwbmz2 = c42323rOp.EZpvd.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz2 != null) {
                    c55009xbpFIwbmz2.setOnFocusChangeCallback(new Function1() { // from class: o.rOw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42323rOp.EZpvd(c55009xbpFIwbmz2, rgl, rax, c42323rOp, ((java.lang.Boolean) obj).booleanValue());
                        }
                    });
                }
                c42323rOp.EZpvd.EZpvd.OLrzqt(new Application(rax, this, uIComponentAppModel, lifecycleOwner, rgl, inputFormatTextAppModel, fragmentActivity));
            }
            str = null;
            c42323rOp = this;
        }
    }

    public static final Unit OLrzqt(InputFormatTextAppModel inputFormatTextAppModel, C42323rOp c42323rOp, rAX rax, C42156rIk c42156rIk) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(inputFormatTextAppModel.getId()) && c42323rOp.getVisibility() == 8) {
            c42323rOp.setVisibility(0);
            java.lang.Boolean required = inputFormatTextAppModel.getRequired();
            rax.EZpvd(required != null ? required.booleanValue() : false);
            java.lang.Boolean enabled = inputFormatTextAppModel.getEnabled();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (!Intrinsics.EZpvd(enabled, bool)) {
                rax.setValue(null);
                C55009xbp c55009xbpFIwbmz = c42323rOp.EZpvd.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                    c55001xbh2.setText("");
                }
            }
            inputFormatTextAppModel.setHidden(bool);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(inputFormatTextAppModel.getId()) && c42323rOp.getVisibility() == 0) {
            c42323rOp.setVisibility(8);
            rax.EZpvd(false);
            if (!Intrinsics.EZpvd(inputFormatTextAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                rax.setValue(null);
                C55009xbp c55009xbpFIwbmz2 = c42323rOp.EZpvd.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                    c55001xbh.setText("");
                }
            }
            inputFormatTextAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(UIComponentAppModel uIComponentAppModel, rAX rax, rGL rgl, java.lang.String str, java.lang.String str2) {
        ((InputFormatTextAppModel) uIComponentAppModel).setValue((java.lang.String) rax.getValue());
        java.util.Map<java.lang.String, java.lang.String> mapAubY = rgl.AubY();
        java.lang.String str3 = (java.lang.String) rax.getValue();
        if (str3 == null) {
            str3 = "";
        }
        mapAubY.put(str, str3);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C42323rOp c42323rOp, rAX rax, java.lang.String str) {
        java.lang.CharSequence charSequence;
        if (str == null || (charSequence = (java.lang.CharSequence) rax.getValue()) == null || charSequence.length() == 0) {
            c42323rOp.EZpvd.EZpvd.values();
        } else {
            c42323rOp.EZpvd.EZpvd.setErrorText(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C55009xbp c55009xbp, rGL rgl, rAX rax, C42323rOp c42323rOp, boolean z) {
        int dimensionPixelSize;
        int[] iArr = new int[2];
        c55009xbp.getLocationOnScreen(iArr);
        if (!z) {
            rgl.AwvSrB().setValue(0);
            rax.OLrzqt(true);
        } else {
            if (c42323rOp.OLrzqt) {
                dimensionPixelSize = c55009xbp.getContext().getResources().getDimensionPixelSize(C43662rtX.StateListAnimator.valueOf);
            } else {
                dimensionPixelSize = c55009xbp.getContext().getResources().getDimensionPixelSize(C43662rtX.StateListAnimator.copydefault);
            }
            rgl.OLrzqt(dimensionPixelSize);
            rgl.AwvSrB().setValue(java.lang.Integer.valueOf(iArr[1] + c55009xbp.getMeasuredHeight()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rOp$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ rAX<java.lang.String> AEQbTJ;
        public Timer AhwBna = new Timer();
        public final /* synthetic */ UIComponentAppModel EZpvd;
        public final /* synthetic */ LifecycleOwner KWHzl;
        public final /* synthetic */ FragmentActivity OLrzqt;
        public final /* synthetic */ InputFormatTextAppModel copydefault;
        public final /* synthetic */ C42323rOp djBIcL;
        public final /* synthetic */ rGL valueOf;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(rAX<java.lang.String> rax, C42323rOp c42323rOp, UIComponentAppModel uIComponentAppModel, LifecycleOwner lifecycleOwner, rGL rgl, InputFormatTextAppModel inputFormatTextAppModel, FragmentActivity fragmentActivity) {
            this.AEQbTJ = rax;
            this.djBIcL = c42323rOp;
            this.EZpvd = uIComponentAppModel;
            this.KWHzl = lifecycleOwner;
            this.valueOf = rgl;
            this.copydefault = inputFormatTextAppModel;
            this.OLrzqt = fragmentActivity;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C54957xaq c54957xaqAEQbTJ;
            C55001xbh c55001xbh;
            java.util.ArrayList<java.lang.String> itemIds;
            java.lang.String strValueOf = java.lang.String.valueOf(editable);
            if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) this.AEQbTJ.getValue())) {
                return;
            }
            try {
                C42323rOp c42323rOp = this.djBIcL;
                InputFormat format = ((InputFormatTextAppModel) this.EZpvd).getFormat();
                java.util.ArrayList<java.lang.Integer> indices = format != null ? format.getIndices() : null;
                InputFormat format2 = ((InputFormatTextAppModel) this.EZpvd).getFormat();
                java.lang.String strCopydefault = c42323rOp.copydefault(strValueOf, indices, format2 != null ? format2.getSeparators() : null);
                C55009xbp c55009xbpFIwbmz = this.djBIcL.EZpvd.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) == null || (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) == null) {
                    return;
                }
                rAX<java.lang.String> rax = this.AEQbTJ;
                C42323rOp c42323rOp2 = this.djBIcL;
                UIComponentAppModel uIComponentAppModel = this.EZpvd;
                LifecycleOwner lifecycleOwner = this.KWHzl;
                rGL rgl = this.valueOf;
                InputFormatTextAppModel inputFormatTextAppModel = this.copydefault;
                FragmentActivity fragmentActivity = this.OLrzqt;
                rax.setValue(strCopydefault);
                int selectionStart = c55001xbh.getSelectionStart();
                android.text.Editable text = c55001xbh.getText();
                int length = text != null ? text.length() : 0;
                java.lang.String value = rax.getValue();
                if (value == null) {
                    value = "";
                }
                c55001xbh.setText(value);
                if (c55001xbh.hasFocus()) {
                    android.text.Editable text2 = c55001xbh.getText();
                    int length2 = text2 != null ? text2.length() : 0;
                    int i = selectionStart + (length2 - length);
                    if (i < 0) {
                        c55001xbh.setSelection(0);
                    } else if (i > length2) {
                        c55001xbh.setSelection(length2);
                    } else {
                        c55001xbh.setSelection(i);
                    }
                }
                if (c42323rOp2.OLrzqt) {
                    if (strCopydefault != null && strCopydefault.length() != 0) {
                        int length3 = strCopydefault.length();
                        java.lang.Integer minValidLength = ((InputFormatTextAppModel) uIComponentAppModel).getMinValidLength();
                        if (length3 >= (minValidLength != null ? minValidLength.intValue() : 9999)) {
                            for (Map.Entry<java.lang.String, java.lang.String> entry : rgl.AubY().entrySet()) {
                                Dependency dependency = inputFormatTextAppModel.getDependency();
                                if (dependency != null && (itemIds = dependency.getItemIds()) != null) {
                                    java.util.Iterator<T> it = itemIds.iterator();
                                    while (it.hasNext()) {
                                        if (Intrinsics.EZpvd((java.lang.Object) entry.getKey(), it.next()) && C33129mqd.OLrzqt((java.lang.CharSequence) entry.getValue())) {
                                            JobKt__JobKt.cancelChildren$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
                                            c42323rOp2.AEQbTJ = false;
                                            return;
                                        }
                                    }
                                }
                            }
                            c42323rOp2.AEQbTJ = true;
                            this.AhwBna.cancel();
                            Timer timer = new Timer();
                            this.AhwBna = timer;
                            timer.schedule(new Activity(inputFormatTextAppModel, rgl, lifecycleOwner, c42323rOp2, fragmentActivity), 10L);
                            return;
                        }
                    }
                    JobKt__JobKt.cancelChildren$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
                    c42323rOp2.AEQbTJ = false;
                }
            } catch (java.lang.Exception e) {
                java.lang.String message = e.getMessage();
                pUU.KWHzl("InputTextItemView_cpf", message != null ? message : "");
            }
        }

        /* JADX INFO: renamed from: o.rOp$Application$Activity */
        public static final class Activity extends TimerTask {
            public final /* synthetic */ rGL AEQbTJ;
            public final /* synthetic */ FragmentActivity EZpvd;
            public final /* synthetic */ C42323rOp KWHzl;
            public final /* synthetic */ LifecycleOwner OLrzqt;
            public final /* synthetic */ InputFormatTextAppModel copydefault;

            public Activity(InputFormatTextAppModel inputFormatTextAppModel, rGL rgl, LifecycleOwner lifecycleOwner, C42323rOp c42323rOp, FragmentActivity fragmentActivity) {
                this.copydefault = inputFormatTextAppModel;
                this.AEQbTJ = rgl;
                this.OLrzqt = lifecycleOwner;
                this.KWHzl = c42323rOp;
                this.EZpvd = fragmentActivity;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Dependency dependency = this.copydefault.getDependency();
                if (dependency != null) {
                    rGL rgl = this.AEQbTJ;
                    LifecycleOwner lifecycleOwner = this.OLrzqt;
                    C42323rOp c42323rOp = this.KWHzl;
                    FragmentActivity fragmentActivity = this.EZpvd;
                    java.util.Map<java.lang.String, java.lang.String> params = dependency.getParams();
                    for (Map.Entry<java.lang.String, java.lang.String> entry : rgl.AubY().entrySet()) {
                        for (Map.Entry<java.lang.String, java.lang.String> entry2 : params.entrySet()) {
                            if (Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) entry2.getValue())) {
                                c42323rOp.gEmmrt.put(entry2.getKey(), entry.getValue());
                            }
                        }
                    }
                    JobKt__JobKt.cancelChildren$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), Dispatchers.getMain(), null, new InputFormattedTextItemView$observe$1$1$9$afterTextChanged$1$2$run$1$2(fragmentActivity, c42323rOp, rgl, dependency, null), 2, null);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.rOp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String formatInput$default(C42323rOp c42323rOp, java.lang.String str, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            arrayList = null;
        }
        if ((i & 4) != 0) {
            arrayList2 = null;
        }
        return c42323rOp.copydefault(str, arrayList, arrayList2);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:9:0x0033 */
    public final java.lang.String copydefault(java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        if (arrayList2 == null || arrayList == null) {
            return str;
        }
        java.util.Iterator<java.lang.String> it = arrayList2.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        java.lang.String strReplace$default = str;
        while (it.hasNext()) {
            java.lang.String next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            strReplace$default = C59449zhJ.replace$default(strReplace$default, next, "", false, 4, (java.lang.Object) null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strReplace$default);
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                java.lang.Integer num = arrayList.get(size);
                Intrinsics.checkNotNullExpressionValue(num, "");
                int iIntValue = num.intValue();
                if (sb.length() > iIntValue) {
                    java.lang.String str2 = arrayList2.get(size);
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    sb = sb.insert(iIntValue, str2);
                }
            } else {
                java.lang.String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
        }
    }

    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        Rule rule;
        java.lang.Long max;
        C55001xbh c55001xbhEZpvd;
        C55001xbh c55001xbhEZpvd2;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        C54957xaq c54957xaqAEQbTJ3;
        C55001xbh c55001xbh3;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPadding(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.AhwBna, uIComponentAppModel.getBottomMargin()));
        InputFormatTextAppModel inputFormatTextAppModel = uIComponentAppModel instanceof InputFormatTextAppModel ? (InputFormatTextAppModel) uIComponentAppModel : null;
        if (inputFormatTextAppModel != null) {
            java.lang.Boolean enabled = inputFormatTextAppModel.getEnabled();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(enabled, bool)) {
                this.EZpvd.EZpvd.setState(0);
            } else {
                this.EZpvd.EZpvd.setState(3);
            }
            java.lang.String label = inputFormatTextAppModel.getLabel();
            if (label != null) {
                this.EZpvd.EZpvd.setLabelText(label);
            }
            InputFormatTextAppModel inputFormatTextAppModel2 = (InputFormatTextAppModel) uIComponentAppModel;
            java.lang.String placeholder = inputFormatTextAppModel2.getPlaceholder();
            if (placeholder != null) {
                this.EZpvd.EZpvd.setHintText(placeholder);
            }
            this.EZpvd.OLrzqt.setVisibility(8);
            this.EZpvd.EZpvd.setSaveEnabled(false);
            C55009xbp c55009xbpFIwbmz = this.EZpvd.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.setSaveEnabled(false);
            }
            C55009xbp c55009xbpFIwbmz2 = this.EZpvd.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ3 = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh3 = c54957xaqAEQbTJ3.AEQbTJ) != null) {
                c55001xbh3.setSaveEnabled(false);
            }
            C55009xbp c55009xbpFIwbmz3 = this.EZpvd.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz3 != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz3.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                c55001xbh2.setText(inputFormatTextAppModel2.getValue());
            }
            if (!Intrinsics.EZpvd(inputFormatTextAppModel.getAllowLetters(), bool)) {
                C55009xbp c55009xbpFIwbmz4 = this.EZpvd.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz4 != null && (c55001xbhEZpvd2 = c55009xbpFIwbmz4.EZpvd()) != null) {
                    c55001xbhEZpvd2.setInputType(2);
                }
                C55009xbp c55009xbpFIwbmz5 = this.EZpvd.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz5 != null && (c55001xbhEZpvd = c55009xbpFIwbmz5.EZpvd()) != null) {
                    c55001xbhEZpvd.setKeyListener(this.copydefault);
                }
            }
            C55009xbp c55009xbpFIwbmz6 = this.EZpvd.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz6 == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz6.AEQbTJ()) == null || (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) == null) {
                return;
            }
            InputFilter.LengthFilter[] lengthFilterArr = new InputFilter.LengthFilter[1];
            java.util.List<Rule> rules = inputFormatTextAppModel.getRules();
            lengthFilterArr[0] = new InputFilter.LengthFilter((int) (((rules == null || (rule = rules.get(0)) == null || (max = rule.getMax()) == null) ? 9999L : max.longValue()) - 1));
            c55001xbh.setFilters(lengthFilterArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.EZpvd.EZpvd.gHZMYf();
        C55009xbp c55009xbpFIwbmz = this.EZpvd.EZpvd.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setOnFocusChangeCallback(null);
        }
        this.EZpvd.unbind();
    }

    /* JADX INFO: renamed from: o.rOp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rOp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
