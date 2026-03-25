package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42414rRz;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rNi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42289rNi extends android.widget.FrameLayout {
    public ViewStatus AEQbTJ;
    public java.lang.String EZpvd;
    public final C42519rVw OLrzqt;
    public final AbstractC43809rwL copydefault;

    /* JADX INFO: renamed from: o.rNi$ActionBar */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42289rNi(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42289rNi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.AEQbTJ = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:32) call: o.rNi.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42289rNi(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42289rNi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = ViewStatus.Form;
        this.OLrzqt = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.DTwDnp, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43809rwL) viewDataBindingInflate;
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.util.List<rAX<AddressCascaderFildValue>> listOcIXYQ;
        java.lang.Boolean required;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        AddressCascaderFildValue addressCascaderFildValue = null;
        rGL rgl = abstractC42074rFj instanceof rGL ? (rGL) abstractC42074rFj : null;
        final AddressCascaderAppModel addressCascaderAppModel = uIComponentAppModel instanceof AddressCascaderAppModel ? (AddressCascaderAppModel) uIComponentAppModel : null;
        if (rgl == null || (listOcIXYQ = rgl.OcIXYQ()) == null) {
            return;
        }
        java.util.Iterator<T> it = listOcIXYQ.iterator();
        while (it.hasNext()) {
            final rAX rax = (rAX) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (addressCascaderAppModel != null ? addressCascaderAppModel.getId() : addressCascaderFildValue))) {
                rax.setValue(addressCascaderAppModel != null ? addressCascaderAppModel.getFieldValue() : addressCascaderFildValue);
                boolean zBooleanValue = false;
                if (addressCascaderAppModel != null && Intrinsics.EZpvd(addressCascaderAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                    rax.EZpvd(false);
                    if (!Intrinsics.EZpvd(addressCascaderAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                        rax.setValue(addressCascaderFildValue);
                    }
                } else {
                    setVisibility(0);
                    if (addressCascaderAppModel != null && (required = addressCascaderAppModel.getRequired()) != null) {
                        zBooleanValue = required.booleanValue();
                    }
                    rax.EZpvd(zBooleanValue);
                    rax.setValue(addressCascaderAppModel != null ? addressCascaderAppModel.getFieldValue() : addressCascaderFildValue);
                }
                rgl.gasjUx().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.rNl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42289rNi.copydefault(addressCascaderAppModel, this, rax, (C42156rIk) obj);
                    }
                }));
                C41959rBc.observeKYCFormField$default(rax, lifecycleOwner, new Function1() { // from class: o.rNn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42289rNi.OLrzqt(addressCascaderAppModel, (AddressCascaderFildValue) obj);
                    }
                }, null, new Function1() { // from class: o.rNm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42289rNi.OLrzqt((java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.rNo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C42289rNi.KWHzl();
                    }
                }, 8, null);
                C55009xbp c55009xbpFIwbmz = this.copydefault.OLrzqt.fIwbmz();
                if (c55009xbpFIwbmz != null) {
                    c55009xbpFIwbmz.setOnClickListener(new TaskDescription(c55009xbpFIwbmz, 1000L, addressCascaderAppModel, fragmentManager, rax, this));
                }
            }
            addressCascaderFildValue = null;
        }
    }

    public static final Unit copydefault(AddressCascaderAppModel addressCascaderAppModel, C42289rNi c42289rNi, rAX rax, C42156rIk c42156rIk) {
        C55001xbh c55001xbhEZpvd;
        java.lang.String placeholder;
        C55001xbh c55001xbhEZpvd2;
        java.lang.String placeholder2;
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), addressCascaderAppModel != null ? addressCascaderAppModel.getId() : null) && c42289rNi.getVisibility() == 8) {
                c42289rNi.setVisibility(0);
                rax.EZpvd((addressCascaderAppModel == null || (required = addressCascaderAppModel.getRequired()) == null) ? false : required.booleanValue());
                if (addressCascaderAppModel == null || !Intrinsics.EZpvd(addressCascaderAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    if (addressCascaderAppModel != null && (placeholder2 = addressCascaderAppModel.getPlaceholder()) != null) {
                        c42289rNi.copydefault.OLrzqt.setHintText(placeholder2);
                    }
                    C55009xbp c55009xbpFIwbmz = c42289rNi.copydefault.OLrzqt.fIwbmz();
                    if (c55009xbpFIwbmz != null && (c55001xbhEZpvd2 = c55009xbpFIwbmz.EZpvd()) != null) {
                        c55001xbhEZpvd2.setText("");
                    }
                }
                if (addressCascaderAppModel != null) {
                    addressCascaderAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), addressCascaderAppModel != null ? addressCascaderAppModel.getId() : null) && c42289rNi.getVisibility() == 0) {
                c42289rNi.setVisibility(8);
                rax.EZpvd(false);
                if (addressCascaderAppModel == null || !Intrinsics.EZpvd(addressCascaderAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                    rax.setValue(null);
                    if (addressCascaderAppModel != null && (placeholder = addressCascaderAppModel.getPlaceholder()) != null) {
                        c42289rNi.copydefault.OLrzqt.setHintText(placeholder);
                    }
                    C55009xbp c55009xbpFIwbmz2 = c42289rNi.copydefault.OLrzqt.fIwbmz();
                    if (c55009xbpFIwbmz2 != null && (c55001xbhEZpvd = c55009xbpFIwbmz2.EZpvd()) != null) {
                        c55001xbhEZpvd.setText("");
                    }
                }
                if (addressCascaderAppModel != null) {
                    addressCascaderAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AddressCascaderAppModel addressCascaderAppModel, AddressCascaderFildValue addressCascaderFildValue) {
        if (addressCascaderFildValue != null && addressCascaderAppModel != null) {
            addressCascaderAppModel.setFieldValue(addressCascaderFildValue);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rNi$Activity */
    public static final class Activity implements Function1<AddressCascaderFildValue, Unit> {
        public final /* synthetic */ C42289rNi EZpvd;
        public final /* synthetic */ rAX<AddressCascaderFildValue> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(rAX<AddressCascaderFildValue> rax, C42289rNi c42289rNi) {
            this.copydefault = rax;
            this.EZpvd = c42289rNi;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AddressCascaderFildValue addressCascaderFildValue) {
            OLrzqt(addressCascaderFildValue);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(AddressCascaderFildValue addressCascaderFildValue) {
            C55001xbh c55001xbhEZpvd;
            Intrinsics.checkNotNullParameter(addressCascaderFildValue, "");
            this.copydefault.setValue(addressCascaderFildValue);
            C55009xbp c55009xbpFIwbmz = this.EZpvd.copydefault.OLrzqt.fIwbmz();
            if (c55009xbpFIwbmz == null || (c55001xbhEZpvd = c55009xbpFIwbmz.EZpvd()) == null) {
                return;
            }
            AddressCascaderValue province = addressCascaderFildValue.getProvince();
            java.lang.String name = province != null ? province.getName() : null;
            AddressCascaderValue city = addressCascaderFildValue.getCity();
            java.lang.String name2 = city != null ? city.getName() : null;
            AddressCascaderValue district = addressCascaderFildValue.getDistrict();
            c55001xbhEZpvd.setText(name + " " + name2 + " " + (district != null ? district.getName() : null));
        }
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55009xbp c55009xbpFIwbmz;
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
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.AEQbTJ, uIComponentAppModel.getBottomMargin()));
        AddressCascaderAppModel addressCascaderAppModel = uIComponentAppModel instanceof AddressCascaderAppModel ? (AddressCascaderAppModel) uIComponentAppModel : null;
        if (addressCascaderAppModel != null) {
            this.EZpvd = addressCascaderAppModel.getId();
            java.lang.Boolean enabled = addressCascaderAppModel.getEnabled();
            if (enabled != null) {
                enabled.booleanValue();
                if (addressCascaderAppModel.getEnabled().booleanValue()) {
                    this.copydefault.OLrzqt.setState(0);
                } else {
                    this.copydefault.OLrzqt.setState(3);
                }
            }
            java.lang.String label = addressCascaderAppModel.getLabel();
            if (label != null) {
                this.copydefault.OLrzqt.setLabelText(label);
            }
            java.lang.String placeholder = addressCascaderAppModel.getPlaceholder();
            if (placeholder != null) {
                this.copydefault.OLrzqt.setHintText(placeholder);
            }
            AddressCascaderFildValue fieldValue = addressCascaderAppModel.getFieldValue();
            if (fieldValue != null && (c55009xbpFIwbmz = this.copydefault.OLrzqt.fIwbmz()) != null && (c55001xbhEZpvd = c55009xbpFIwbmz.EZpvd()) != null) {
                AddressCascaderValue province = fieldValue.getProvince();
                java.lang.String name = province != null ? province.getName() : null;
                AddressCascaderValue city = fieldValue.getCity();
                java.lang.String name2 = city != null ? city.getName() : null;
                AddressCascaderValue district = fieldValue.getDistrict();
                c55001xbhEZpvd.setText(name + " " + name2 + " " + (district != null ? district.getName() : null));
            }
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(C43662rtX.Application.djBIcL, typedValue, true);
        C55009xbp c55009xbpFIwbmz2 = this.copydefault.OLrzqt.fIwbmz();
        if (c55009xbpFIwbmz2 != null) {
            C55009xbp.setIconImage$default(c55009xbpFIwbmz2, typedValue.resourceId, 0, 0, 0, 14, null);
        }
        C55009xbp c55009xbpFIwbmz3 = this.copydefault.OLrzqt.fIwbmz();
        if (c55009xbpFIwbmz3 != null) {
            c55009xbpFIwbmz3.setImageTint(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
        }
        C55009xbp c55009xbpFIwbmz4 = this.copydefault.OLrzqt.fIwbmz();
        if (c55009xbpFIwbmz4 != null) {
            c55009xbpFIwbmz4.setInterceptEvent(true);
        }
        this.copydefault.OLrzqt.setSaveEnabled(false);
        C55009xbp c55009xbpFIwbmz5 = this.copydefault.OLrzqt.fIwbmz();
        if (c55009xbpFIwbmz5 != null) {
            c55009xbpFIwbmz5.setSaveEnabled(false);
        }
        C55009xbp c55009xbpFIwbmz6 = this.copydefault.OLrzqt.fIwbmz();
        if (c55009xbpFIwbmz6 == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz6.AEQbTJ()) == null || (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) == null) {
            return;
        }
        c55001xbh.setSaveEnabled(false);
    }

    /* JADX INFO: renamed from: o.rNi$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ rAX AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.FragmentManager EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ AddressCascaderAppModel copydefault;
        public final /* synthetic */ C42289rNi valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AddressCascaderAppModel addressCascaderAppModel, androidx.fragment.app.FragmentManager fragmentManager, rAX rax, C42289rNi c42289rNi) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = addressCascaderAppModel;
            this.EZpvd = fragmentManager;
            this.AEQbTJ = rax;
            this.valueOf = c42289rNi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C42414rRz.ActionBar actionBar = C42414rRz.Companion;
                AddressCascaderAppModel addressCascaderAppModel = this.copydefault;
                AddressCascaderFildValue fieldValue = addressCascaderAppModel != null ? addressCascaderAppModel.getFieldValue() : null;
                AddressCascaderAppModel addressCascaderAppModel2 = this.copydefault;
                C42414rRz c42414rRzKWHzl = actionBar.KWHzl(fieldValue, addressCascaderAppModel2 != null ? addressCascaderAppModel2.getDivisionTitle() : null);
                c42414rRzKWHzl.AEQbTJ(new Activity(this.AEQbTJ, this.valueOf));
                c42414rRzKWHzl.show(this.EZpvd);
            }
        }
    }
}
