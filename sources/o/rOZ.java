package o;

import android.graphics.drawable.ColorDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressField;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddress;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.InputTextItemView$observe$1$1$10$onItemClick$1;
import com.okinc.ok_kyc_core.presentation.views.InputTextItemView$observe$1$1$10$onItemClick$2$1;
import com.okinc.ok_kyc_core.presentation.views.InputTextItemView$observe$1$1$11$1$1;
import com.okinc.ok_kyc_core.presentation.views.InputTextItemView$observe$1$1$12$afterTextChanged$1;
import com.okinc.ok_kyc_core.presentation.views.InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1;
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
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import o.C42376rQo;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rOZ extends android.widget.FrameLayout {
    public java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public boolean AhwBna;
    public ViewStatus AkhnZx;
    public final int DbNXlk;
    public C42376rQo EZpvd;
    public final AbstractC43912ryI KWHzl;
    public java.util.List<AutoCompleteAddress> OLrzqt;
    public android.widget.PopupWindow copydefault;
    public final int djBIcL;
    public final int fetchVPNInfo;
    public java.util.List<android.text.SpannableString> gEmmrt;
    public final int isConnected;
    public boolean valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

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
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.AkhnZx = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rOZ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.OFhtUX, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC43912ryI) viewDataBindingInflate;
        this.AkhnZx = ViewStatus.Form;
        this.AYXKKw = new LinkedHashMap();
        this.OLrzqt = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(C43662rtX.Application.DbNXlk, typedValue, true);
        this.djBIcL = ContextCompat.getColor(getContext(), typedValue.resourceId);
        getContext().getTheme().resolveAttribute(C43662rtX.Application.gEmmrt, typedValue, true);
        this.isConnected = ContextCompat.getColor(getContext(), typedValue.resourceId);
        getContext().getTheme().resolveAttribute(C43662rtX.Application.AkhnZx, typedValue, true);
        this.DbNXlk = ContextCompat.getColor(getContext(), typedValue.resourceId);
        getContext().getTheme().resolveAttribute(C43662rtX.Application.AhwBna, typedValue, true);
        this.fetchVPNInfo = typedValue.resourceId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rOZ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.OFhtUX, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC43912ryI) viewDataBindingInflate;
        this.AkhnZx = ViewStatus.Form;
        this.AYXKKw = new LinkedHashMap();
        this.OLrzqt = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(C43662rtX.Application.DbNXlk, typedValue, true);
        this.djBIcL = ContextCompat.getColor(getContext(), typedValue.resourceId);
        getContext().getTheme().resolveAttribute(C43662rtX.Application.gEmmrt, typedValue, true);
        this.isConnected = ContextCompat.getColor(getContext(), typedValue.resourceId);
        getContext().getTheme().resolveAttribute(C43662rtX.Application.AkhnZx, typedValue, true);
        this.DbNXlk = ContextCompat.getColor(getContext(), typedValue.resourceId);
        getContext().getTheme().resolveAttribute(C43662rtX.Application.AhwBna, typedValue, true);
        this.fetchVPNInfo = typedValue.resourceId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rOZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.OFhtUX, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC43912ryI) viewDataBindingInflate;
        this.AkhnZx = ViewStatus.Form;
        this.AYXKKw = new LinkedHashMap();
        this.OLrzqt = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(C43662rtX.Application.DbNXlk, typedValue, true);
        this.djBIcL = ContextCompat.getColor(getContext(), typedValue.resourceId);
        getContext().getTheme().resolveAttribute(C43662rtX.Application.gEmmrt, typedValue, true);
        this.isConnected = ContextCompat.getColor(getContext(), typedValue.resourceId);
        getContext().getTheme().resolveAttribute(C43662rtX.Application.AkhnZx, typedValue, true);
        this.DbNXlk = ContextCompat.getColor(getContext(), typedValue.resourceId);
        getContext().getTheme().resolveAttribute(C43662rtX.Application.AhwBna, typedValue, true);
        this.fetchVPNInfo = typedValue.resourceId;
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.util.List<rAX<java.lang.String>> listDNCPSb;
        final UIComponentAppModel uIComponentAppModel2 = uIComponentAppModel;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel2, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
        java.lang.String str = null;
        final rGL rgl = abstractC42074rFj instanceof rGL ? (rGL) abstractC42074rFj : null;
        final InputTextAppModel inputTextAppModel = uIComponentAppModel2 instanceof InputTextAppModel ? (InputTextAppModel) uIComponentAppModel2 : null;
        if (inputTextAppModel == null || rgl == null || (listDNCPSb = rgl.dNCPSb()) == null) {
            return;
        }
        java.util.Iterator<T> it = listDNCPSb.iterator();
        while (it.hasNext()) {
            final rAX rax = (rAX) it.next();
            final java.lang.String id = inputTextAppModel.getId();
            if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) id)) {
                C55009xbp c55009xbpFIwbmz = this.KWHzl.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz != null) {
                    c55009xbpFIwbmz.setContentDescription(id);
                }
                java.lang.String value = inputTextAppModel.getValue();
                if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                    value = str;
                }
                rax.setValue(value);
                if (Intrinsics.EZpvd(inputTextAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                    rax.EZpvd(false);
                    if (!Intrinsics.EZpvd(inputTextAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                        rax.setValue(str);
                    }
                } else {
                    setVisibility(0);
                    java.lang.Boolean required = inputTextAppModel.getRequired();
                    rax.EZpvd(required != null ? required.booleanValue() : false);
                    java.lang.String value2 = inputTextAppModel.getValue();
                    if (!java.lang.Boolean.valueOf(!(value2 == null || value2.length() == 0)).booleanValue()) {
                        value2 = str;
                    }
                    rax.setValue(value2);
                }
                rgl.gasjUx().observe(lifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.rPa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rOZ.OLrzqt(inputTextAppModel, this, rax, (C42156rIk) obj);
                    }
                }));
                C41959rBc.EZpvd(rax, lifecycleOwner, new Function1() { // from class: o.rPc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rOZ.KWHzl(uIComponentAppModel2, rax, rgl, id, (java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rPb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rOZ.EZpvd((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rPd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rOZ.OLrzqt(this.AEQbTJ, rax, uIComponentAppModel2, (java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.rPf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rOZ.OLrzqt();
                    }
                });
                if (inputTextAppModel.getAddressAutoComplete() != null) {
                    this.AhwBna = true;
                }
                rgl.AuCTelauCTel().observe(lifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.rPh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rOZ.copydefault(inputTextAppModel, rax, this, (java.util.Map) obj);
                    }
                }));
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                C42376rQo c42376rQo = new C42376rQo(this.gEmmrt);
                this.EZpvd = c42376rQo;
                c42376rQo.AEQbTJ(new Application(booleanRef, lifecycleOwner, inputTextAppModel, this, rax, rgl));
                if (this.AhwBna) {
                    android.view.View viewAEQbTJ = C33054mpH.AEQbTJ((android.view.ViewGroup) new ConstraintLayout(getContext()), C43662rtX.TaskDescription.DGOPHZDGOPHZ, false);
                    RecyclerView recyclerView = viewAEQbTJ != null ? (RecyclerView) viewAEQbTJ.findViewById(C43662rtX.ActionBar.RbVjfb) : null;
                    Intrinsics.copydefault(recyclerView);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    recyclerView.setAdapter(this.EZpvd);
                    C55375xik c55375xik = viewAEQbTJ != null ? (C55375xik) viewAEQbTJ.findViewById(C43662rtX.ActionBar.RZNAhV) : null;
                    Intrinsics.copydefault(c55375xik);
                    c55375xik.setXOffset(getResources().getDimension(C52761wXj.StateListAnimator.DTwDnp));
                    c55375xik.setYOffset(getResources().getDimension(C52761wXj.StateListAnimator.RJOkX));
                    c55375xik.setShadowSpreadY(getResources().getDimension(C52761wXj.StateListAnimator.RJOkX));
                    c55375xik.setShadowSpreadX(getResources().getDimension(C52761wXj.StateListAnimator.QOLQEE));
                    c55375xik.setShadowColor(copydefault(this.DbNXlk, 10));
                    c55375xik.setCornerRadius(getResources().getDimension(C52761wXj.StateListAnimator.AubY));
                    c55375xik.setShowLeftShadow(false);
                    c55375xik.setShowTopShadow(false);
                    android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(viewAEQbTJ, -2, -2, false);
                    this.copydefault = popupWindow;
                    popupWindow.setWidth(getResources().getDisplayMetrics().widthPixels - (getResources().getDimensionPixelSize(this.fetchVPNInfo) * 2));
                    android.widget.PopupWindow popupWindow2 = this.copydefault;
                    if (popupWindow2 != null) {
                        popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    android.widget.PopupWindow popupWindow3 = this.copydefault;
                    if (popupWindow3 != null) {
                        popupWindow3.setOutsideTouchable(true);
                    }
                    android.widget.PopupWindow popupWindow4 = this.copydefault;
                    if (popupWindow4 != null) {
                        popupWindow4.setInputMethodMode(1);
                    }
                }
                final C55009xbp c55009xbpFIwbmz2 = this.KWHzl.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz2 != null) {
                    c55009xbpFIwbmz2.setOnFocusChangeCallback(new Function1() { // from class: o.rPe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rOZ.AEQbTJ(c55009xbpFIwbmz2, rgl, rax, this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    });
                }
                C55001xbh c55001xbhAkhnZx = this.KWHzl.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx != null) {
                    c55001xbhAkhnZx.addTextChangedListener(new ActionBar(uIComponentAppModel, this, rax, lifecycleOwner, booleanRef, rgl, inputTextAppModel, id));
                }
            }
            uIComponentAppModel2 = uIComponentAppModel;
            lifecycleOwner2 = lifecycleOwner;
            str = null;
        }
    }

    public static final Unit OLrzqt(InputTextAppModel inputTextAppModel, rOZ roz, rAX rax, C42156rIk c42156rIk) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(inputTextAppModel.getId()) && roz.getVisibility() == 8) {
            roz.setVisibility(0);
            java.lang.Boolean required = inputTextAppModel.getRequired();
            rax.EZpvd(required != null ? required.booleanValue() : false);
            java.lang.Boolean enabled = inputTextAppModel.getEnabled();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (!Intrinsics.EZpvd(enabled, bool)) {
                C55009xbp c55009xbpFIwbmz = roz.KWHzl.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                    c55001xbh2.setText("");
                }
                rax.setValue(null);
            }
            inputTextAppModel.setHidden(bool);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(inputTextAppModel.getId()) && roz.getVisibility() == 0) {
            roz.setVisibility(8);
            rax.EZpvd(false);
            if (!Intrinsics.EZpvd(inputTextAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                C55009xbp c55009xbpFIwbmz2 = roz.KWHzl.EZpvd.fIwbmz();
                if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                    c55001xbh.setText("");
                }
                rax.setValue(null);
            }
            inputTextAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(UIComponentAppModel uIComponentAppModel, rAX rax, rGL rgl, java.lang.String str, java.lang.String str2) {
        ((InputTextAppModel) uIComponentAppModel).setValue((java.lang.String) rax.getValue());
        java.util.Map<java.lang.String, java.lang.String> mapAubY = rgl.AubY();
        java.lang.String str3 = (java.lang.String) rax.getValue();
        if (str3 == null) {
            str3 = "";
        }
        mapAubY.put(str, str3);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(rOZ roz, rAX rax, UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        if (str != null) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) rax.getValue();
            if (charSequence == null || charSequence.length() == 0) {
                roz.KWHzl.EZpvd.values();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((InputTextAppModel) uIComponentAppModel).getTip())) {
                    roz.KWHzl.OLrzqt.setVisibility(0);
                }
            } else {
                roz.KWHzl.EZpvd.setErrorText(str);
                roz.KWHzl.OLrzqt.setVisibility(8);
            }
        } else {
            roz.KWHzl.EZpvd.values();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((InputTextAppModel) uIComponentAppModel).getTip())) {
                roz.KWHzl.OLrzqt.setVisibility(0);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InputTextAppModel inputTextAppModel, rAX rax, rOZ roz, java.util.Map map) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55009xbp c55009xbpFIwbmz;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        C54957xaq c54957xaqAEQbTJ3;
        C55001xbh c55001xbh3;
        kotlin.Pair pair = (kotlin.Pair) map.get(inputTextAppModel.getId());
        if (pair != null) {
            rax.setValue(pair.getFirst());
            C55009xbp c55009xbpFIwbmz2 = roz.KWHzl.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ3 = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh3 = c54957xaqAEQbTJ3.AEQbTJ) != null) {
                c55001xbh3.setText((java.lang.CharSequence) pair.getFirst());
            }
            C55009xbp c55009xbpFIwbmz3 = roz.KWHzl.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz3 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz3.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null && c55001xbh.getText() != null && (c55009xbpFIwbmz = roz.KWHzl.EZpvd.fIwbmz()) != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                c55001xbh2.setSelection(((java.lang.String) pair.getFirst()).length());
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements C42376rQo.Application {
        public final /* synthetic */ Ref.BooleanRef AEQbTJ;
        public final /* synthetic */ rOZ AhwBna;
        public final /* synthetic */ rGL EZpvd;
        public final /* synthetic */ InputTextAppModel KWHzl;
        public final /* synthetic */ rAX<java.lang.String> OLrzqt;
        public final /* synthetic */ LifecycleOwner copydefault;

        public Application(Ref.BooleanRef booleanRef, LifecycleOwner lifecycleOwner, InputTextAppModel inputTextAppModel, rOZ roz, rAX<java.lang.String> rax, rGL rgl) {
            this.AEQbTJ = booleanRef;
            this.copydefault = lifecycleOwner;
            this.KWHzl = inputTextAppModel;
            this.AhwBna = roz;
            this.OLrzqt = rax;
            this.EZpvd = rgl;
        }

        @Override // o.C42376rQo.Application
        public void OLrzqt(android.view.View view, int i) {
            this.AEQbTJ.element = false;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), Dispatchers.getMain(), null, new InputTextItemView$observe$1$1$10$onItemClick$1(this.AhwBna, null), 2, null);
            if (this.KWHzl.getAddressAutoComplete() != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), Dispatchers.getMain(), null, new InputTextItemView$observe$1$1$10$onItemClick$2$1(i, this.AhwBna, this.OLrzqt, this.EZpvd, null), 2, null);
            }
        }
    }

    public static final Unit AEQbTJ(C55009xbp c55009xbp, rGL rgl, rAX rax, rOZ roz, boolean z) {
        int dimensionPixelSize;
        int[] iArr = new int[2];
        c55009xbp.getLocationOnScreen(iArr);
        if (!z) {
            rgl.AwvSrB().setValue(0);
            rax.OLrzqt(true);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new InputTextItemView$observe$1$1$11$1$1(roz, null), 3, null);
        } else {
            if (roz.AhwBna) {
                dimensionPixelSize = c55009xbp.getContext().getResources().getDimensionPixelSize(C43662rtX.StateListAnimator.valueOf);
            } else {
                dimensionPixelSize = c55009xbp.getContext().getResources().getDimensionPixelSize(C43662rtX.StateListAnimator.copydefault);
            }
            rgl.OLrzqt(dimensionPixelSize);
            rgl.AwvSrB().setValue(java.lang.Integer.valueOf(iArr[1] + c55009xbp.getMeasuredHeight()));
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ Ref.BooleanRef AEQbTJ;
        public final /* synthetic */ rGL AhwBna;
        public final /* synthetic */ LifecycleOwner EZpvd;
        public final /* synthetic */ UIComponentAppModel KWHzl;
        public final /* synthetic */ rAX<java.lang.String> OLrzqt;
        public final /* synthetic */ InputTextAppModel copydefault;
        public Timer djBIcL = new Timer();
        public final /* synthetic */ java.lang.String gEmmrt;
        public final /* synthetic */ rOZ valueOf;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(UIComponentAppModel uIComponentAppModel, rOZ roz, rAX<java.lang.String> rax, LifecycleOwner lifecycleOwner, Ref.BooleanRef booleanRef, rGL rgl, InputTextAppModel inputTextAppModel, java.lang.String str) {
            this.KWHzl = uIComponentAppModel;
            this.valueOf = roz;
            this.OLrzqt = rax;
            this.EZpvd = lifecycleOwner;
            this.AEQbTJ = booleanRef;
            this.AhwBna = rgl;
            this.copydefault = inputTextAppModel;
            this.gEmmrt = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strValueOf;
            java.lang.String str;
            if (Intrinsics.EZpvd(((InputTextAppModel) this.KWHzl).isNumber(), java.lang.Boolean.TRUE)) {
                C55001xbh c55001xbhAkhnZx = this.valueOf.KWHzl.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx == null) {
                    str = null;
                    this.OLrzqt.setValue(str == null ? StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString() : null);
                    if (this.valueOf.AhwBna) {
                        return;
                    }
                    if (str == null || str.length() == 0) {
                        JobKt__JobKt.cancelChildren$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd).getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), Dispatchers.getMain(), null, new InputTextItemView$observe$1$1$12$afterTextChanged$1(this.valueOf, null), 2, null);
                        this.valueOf.valueOf = false;
                        this.AEQbTJ.element = true;
                        return;
                    }
                    this.valueOf.valueOf = true;
                    this.djBIcL.cancel();
                    Timer timer = new Timer();
                    this.djBIcL = timer;
                    timer.schedule(new C0931ActionBar(this.AEQbTJ, this.KWHzl, this.AhwBna, this.copydefault, this.valueOf, this.EZpvd, str, this.gEmmrt), 500L);
                    return;
                }
                strValueOf = c55001xbhAkhnZx.isConnected();
            } else {
                strValueOf = java.lang.String.valueOf(editable);
            }
            str = strValueOf;
            this.OLrzqt.setValue(str == null ? StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString() : null);
            if (this.valueOf.AhwBna) {
            }
        }

        /* JADX INFO: renamed from: o.rOZ$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0931ActionBar extends TimerTask {
            public final /* synthetic */ UIComponentAppModel AEQbTJ;
            public final /* synthetic */ rOZ AYXKKw;
            public final /* synthetic */ java.lang.String EZpvd;
            public final /* synthetic */ InputTextAppModel KWHzl;
            public final /* synthetic */ LifecycleOwner OLrzqt;
            public final /* synthetic */ Ref.BooleanRef copydefault;
            public final /* synthetic */ java.lang.String djBIcL;
            public final /* synthetic */ rGL gEmmrt;

            public C0931ActionBar(Ref.BooleanRef booleanRef, UIComponentAppModel uIComponentAppModel, rGL rgl, InputTextAppModel inputTextAppModel, rOZ roz, LifecycleOwner lifecycleOwner, java.lang.String str, java.lang.String str2) {
                this.copydefault = booleanRef;
                this.AEQbTJ = uIComponentAppModel;
                this.gEmmrt = rgl;
                this.KWHzl = inputTextAppModel;
                this.AYXKKw = roz;
                this.OLrzqt = lifecycleOwner;
                this.EZpvd = str;
                this.djBIcL = str2;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                java.util.Map<java.lang.String, java.lang.String> linkedHashMap;
                java.util.Map<java.lang.String, java.lang.String> extraParams;
                Ref.BooleanRef booleanRef = this.copydefault;
                if (!booleanRef.element) {
                    booleanRef.element = true;
                    return;
                }
                AddressAutoComplete addressAutoComplete = ((InputTextAppModel) this.AEQbTJ).getAddressAutoComplete();
                if (addressAutoComplete == null || (linkedHashMap = addressAutoComplete.getListUriParams()) == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                for (Map.Entry<java.lang.String, java.lang.String> entry : this.gEmmrt.AubY().entrySet()) {
                    rOZ roz = this.AYXKKw;
                    for (Map.Entry<java.lang.String, java.lang.String> entry2 : linkedHashMap.entrySet()) {
                        if (Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) entry2.getValue())) {
                            roz.AYXKKw.put(entry2.getKey(), entry.getValue());
                        }
                    }
                }
                AddressAutoComplete addressAutoComplete2 = ((InputTextAppModel) this.AEQbTJ).getAddressAutoComplete();
                if (addressAutoComplete2 != null && (extraParams = addressAutoComplete2.getExtraParams()) != null) {
                    rOZ roz2 = this.AYXKKw;
                    for (Map.Entry<java.lang.String, java.lang.String> entry3 : extraParams.entrySet()) {
                        roz2.AYXKKw.put(entry3.getKey(), entry3.getValue());
                    }
                }
                AddressAutoComplete addressAutoComplete3 = this.KWHzl.getAddressAutoComplete();
                if (addressAutoComplete3 != null) {
                    LifecycleOwner lifecycleOwner = this.OLrzqt;
                    rOZ roz3 = this.AYXKKw;
                    java.lang.String str = this.EZpvd;
                    java.lang.String str2 = this.djBIcL;
                    rGL rgl = this.gEmmrt;
                    JobKt__JobKt.cancelChildren$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), Dispatchers.getMain(), null, new InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1(roz3, str, str2, rgl, addressAutoComplete3, null), 2, null);
                }
            }
        }
    }

    public final int copydefault(int i, int i2) {
        return ((i & 16777215) | java.lang.Math.min(255, java.lang.Math.max(0, i2))) << 24;
    }

    public final void setDataList(AutoCompleteAddresses autoCompleteAddresses, int i, java.lang.String str) {
        java.util.List<android.text.SpannableString> list = this.gEmmrt;
        if (list != null) {
            list.clear();
        }
        this.OLrzqt.clear();
        for (AutoCompleteAddress autoCompleteAddress : autoCompleteAddresses.getResults()) {
            for (AddressField addressField : autoCompleteAddress.getFields()) {
                if (Intrinsics.EZpvd((java.lang.Object) addressField.getId(), (java.lang.Object) str)) {
                    android.text.SpannableString spannableString = new android.text.SpannableString(addressField.getValueName());
                    int iMin = java.lang.Math.min(i, addressField.getValueName().length());
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.djBIcL), 0, iMin, 33);
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.isConnected), iMin, spannableString.length(), 33);
                    java.util.List<android.text.SpannableString> list2 = this.gEmmrt;
                    if (list2 != null) {
                        list2.add(new android.text.SpannableString(spannableString));
                    }
                }
            }
            this.OLrzqt.add(autoCompleteAddress);
        }
        C42376rQo c42376rQo = this.EZpvd;
        if (c42376rQo != null) {
            c42376rQo.notifyDataSetChanged();
        }
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        C55001xbh c55001xbhAkhnZx;
        C55009xbp c55009xbpFIwbmz;
        C54957xaq c54957xaqAEQbTJ3;
        C55009xbp c55009xbpFIwbmz2;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.AkhnZx, uIComponentAppModel.getBottomMargin()));
        InputTextAppModel inputTextAppModel = uIComponentAppModel instanceof InputTextAppModel ? (InputTextAppModel) uIComponentAppModel : null;
        if (inputTextAppModel != null) {
            java.lang.Boolean enabled = inputTextAppModel.getEnabled();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(enabled, bool)) {
                this.KWHzl.EZpvd.setState(0);
            } else {
                this.KWHzl.EZpvd.setState(3);
            }
            java.lang.String label = inputTextAppModel.getLabel();
            if (label != null) {
                this.KWHzl.EZpvd.setLabelText(label);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inputTextAppModel.getTip())) {
                this.KWHzl.OLrzqt.setText(inputTextAppModel.getTip());
                this.KWHzl.OLrzqt.setVisibility(0);
            } else {
                this.KWHzl.OLrzqt.setVisibility(8);
            }
            InputTextAppModel inputTextAppModel2 = (InputTextAppModel) uIComponentAppModel;
            java.lang.String placeholder = inputTextAppModel2.getPlaceholder();
            if (placeholder != null) {
                this.KWHzl.EZpvd.setHintText(placeholder);
            }
            java.lang.String suffix = inputTextAppModel2.getSuffix();
            if (suffix != null && (c55009xbpFIwbmz2 = this.KWHzl.EZpvd.fIwbmz()) != null) {
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                C42518rVv c42518rVv = new C42518rVv(context3, null, 0, 6, null);
                c42518rVv.setData(suffix);
                c55009xbpFIwbmz2.EZpvd(c42518rVv);
            }
            java.lang.String prefix = inputTextAppModel2.getPrefix();
            if (prefix != null && (c55009xbpFIwbmz = this.KWHzl.EZpvd.fIwbmz()) != null && (c54957xaqAEQbTJ3 = c55009xbpFIwbmz.AEQbTJ()) != null) {
                android.widget.TextView textView = c54957xaqAEQbTJ3.OLrzqt;
                Intrinsics.copydefault(textView);
                textView.setVisibility(0);
                textView.setText(prefix);
                textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            }
            if (Intrinsics.EZpvd(inputTextAppModel.isNumber(), bool) && (c55001xbhAkhnZx = this.KWHzl.EZpvd.AkhnZx()) != null) {
                java.lang.Integer precision = inputTextAppModel.getPrecision();
                c55001xbhAkhnZx.setMaxDecimalValue(precision != null ? precision.intValue() : 0);
                c55001xbhAkhnZx.setShowThousandsSeparator(true);
                c55001xbhAkhnZx.setKeyListener(c55001xbhAkhnZx.AYXKKw());
            }
            this.KWHzl.EZpvd.setSaveEnabled(false);
            C55009xbp c55009xbpFIwbmz3 = this.KWHzl.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz3 != null) {
                c55009xbpFIwbmz3.setSaveEnabled(false);
            }
            C55009xbp c55009xbpFIwbmz4 = this.KWHzl.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz4 != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz4.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                c55001xbh2.setSaveEnabled(false);
            }
            if (Intrinsics.EZpvd(inputTextAppModel.isNumber(), bool)) {
                C55001xbh c55001xbhAkhnZx2 = this.KWHzl.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx2 != null) {
                    java.lang.String value = inputTextAppModel2.getValue();
                    c55001xbhAkhnZx2.setLocalizedNumericText(value != null ? value : "");
                    return;
                }
                return;
            }
            C55009xbp c55009xbpFIwbmz5 = this.KWHzl.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz5 == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz5.AEQbTJ()) == null || (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) == null) {
                return;
            }
            c55001xbh.setText(inputTextAppModel2.getValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.KWHzl.EZpvd.gHZMYf();
        C55009xbp c55009xbpFIwbmz = this.KWHzl.EZpvd.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setOnFocusChangeCallback(null);
        }
        this.KWHzl.unbind();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rOZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
