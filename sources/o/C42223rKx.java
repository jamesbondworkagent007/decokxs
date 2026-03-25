package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42405rRq;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rKx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42223rKx extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final AbstractC43812rwO EZpvd;
    public ViewStatus OLrzqt;

    /* JADX INFO: renamed from: o.rKx$StateListAnimator */
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
    public C42223rKx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42223rKx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.rKx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42223rKx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42223rKx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.QOLQEE, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43812rwO) viewDataBindingInflate;
    }

    /* JADX INFO: renamed from: o.rKx$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rKx.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public void copydefault(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final AddressSearchAppModel addressSearchAppModel = uIComponentAppModel instanceof AddressSearchAppModel ? (AddressSearchAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (addressSearchAppModel != null ? addressSearchAppModel.getId() : null))) {
                    rax.setValue(null);
                }
            }
            if (addressSearchAppModel != null && Intrinsics.EZpvd(addressSearchAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            rgl.gasjUx().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rKz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42223rKx.copydefault(addressSearchAppModel, this, (C42156rIk) obj);
                }
            }));
        }
    }

    public static final Unit copydefault(AddressSearchAppModel addressSearchAppModel, C42223rKx c42223rKx, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), addressSearchAppModel != null ? addressSearchAppModel.getId() : null) && c42223rKx.getVisibility() == 8) {
                c42223rKx.setVisibility(0);
                if (addressSearchAppModel != null) {
                    addressSearchAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), addressSearchAppModel != null ? addressSearchAppModel.getId() : null) && c42223rKx.getVisibility() == 0) {
                c42223rKx.setVisibility(8);
                if (addressSearchAppModel != null) {
                    addressSearchAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull FragmentActivity fragmentActivity, AbstractC42074rFj abstractC42074rFj, @NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        AddressSearchAppModel addressSearchAppModel = uIComponentAppModel instanceof AddressSearchAppModel ? (AddressSearchAppModel) uIComponentAppModel : null;
        if (addressSearchAppModel != null) {
            this.EZpvd.AEQbTJ.setText(addressSearchAppModel.getPlaceholder());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) addressSearchAppModel.getValue())) {
                this.EZpvd.AEQbTJ.setText(addressSearchAppModel.getValue());
                this.EZpvd.AEQbTJ.setTextColor(getContext().getColor(C52761wXj.Activity.fdOvFl));
            }
            android.widget.LinearLayout linearLayout = this.EZpvd.EZpvd;
            linearLayout.setOnClickListener(new TaskDescription(linearLayout, 1000L, uIComponentAppModel, addressSearchAppModel, fragmentActivity, this, abstractC42074rFj));
        }
    }

    /* JADX INFO: renamed from: o.rKx$Activity */
    public static final class Activity implements Function2<java.util.HashMap<java.lang.String, java.lang.String>, java.lang.String, Unit> {
        public final /* synthetic */ UIComponentAppModel AEQbTJ;
        public final /* synthetic */ AbstractC42074rFj KWHzl;
        public final /* synthetic */ AddressSearchAppModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(AddressSearchAppModel addressSearchAppModel, AbstractC42074rFj abstractC42074rFj, UIComponentAppModel uIComponentAppModel) {
            this.copydefault = addressSearchAppModel;
            this.KWHzl = abstractC42074rFj;
            this.AEQbTJ = uIComponentAppModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String str) {
            copydefault(map, str);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String str) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            C42223rKx.this.EZpvd.AEQbTJ.setText(str);
            C42223rKx.this.EZpvd.AEQbTJ.setTextColor(C42223rKx.this.getContext().getColor(C52761wXj.Activity.fdOvFl));
            this.copydefault.setValue(str);
            if (this.KWHzl != null && ((AddressSearchAppModel) this.AEQbTJ).getCtaButton() != null) {
                if (((AddressSearchAppModel) this.AEQbTJ).getCtaButton().getActionParams() == null) {
                    ((AddressSearchAppModel) this.AEQbTJ).getCtaButton().setActionParams(new ActionParams((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.HashMap) null, (java.lang.Integer) null, (java.lang.Integer) null, 0, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.util.HashMap) null, (java.util.HashMap) null, (java.lang.Integer) null, (VerificationPayload) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (CallApiModel) null, (CallApiModel) null, (CallApiModel) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -1, 16383, (DefaultConstructorMarker) null));
                }
                ActionParams actionParams = ((AddressSearchAppModel) this.AEQbTJ).getCtaButton().getActionParams();
                Intrinsics.copydefault(actionParams);
                actionParams.setLocalParams(map);
                this.KWHzl.AYXKKw().setValue(new C43734ruq<>(new kotlin.Pair(((AddressSearchAppModel) this.AEQbTJ).getCtaButton(), new DialogInformation("", false, null, 4, null))));
                return;
            }
            pUU.KWHzl("search-address", "vm=" + this.KWHzl + " cta=" + ((AddressSearchAppModel) this.AEQbTJ).getCtaButton());
        }
    }

    /* JADX INFO: renamed from: o.rKx$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ AddressSearchAppModel KWHzl;
        public final /* synthetic */ UIComponentAppModel OLrzqt;
        public final /* synthetic */ FragmentActivity copydefault;
        public final /* synthetic */ C42223rKx djBIcL;
        public final /* synthetic */ AbstractC42074rFj valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, UIComponentAppModel uIComponentAppModel, AddressSearchAppModel addressSearchAppModel, FragmentActivity fragmentActivity, C42223rKx c42223rKx, AbstractC42074rFj abstractC42074rFj) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = uIComponentAppModel;
            this.KWHzl = addressSearchAppModel;
            this.copydefault = fragmentActivity;
            this.djBIcL = c42223rKx;
            this.valueOf = abstractC42074rFj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (((AddressSearchAppModel) this.OLrzqt).getAddressAutoComplete() == null) {
                    pUU.KWHzl("search-address", "addressAutoComplete = null");
                    return;
                }
                C42405rRq.StateListAnimator stateListAnimator = C42405rRq.Companion;
                AddressAutoComplete addressAutoComplete = ((AddressSearchAppModel) this.OLrzqt).getAddressAutoComplete();
                java.lang.String placeholder = ((AddressSearchAppModel) this.OLrzqt).getPlaceholder();
                if (placeholder == null) {
                    placeholder = "";
                }
                java.lang.String value = this.KWHzl.getValue();
                if (value == null) {
                    value = "";
                }
                C42405rRq c42405rRqCopydefault = stateListAnimator.copydefault(addressAutoComplete, placeholder, value);
                c42405rRqCopydefault.EZpvd(this.djBIcL.new Activity(this.KWHzl, this.valueOf, this.OLrzqt));
                androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c42405rRqCopydefault.show(supportFragmentManager);
            }
        }
    }
}
