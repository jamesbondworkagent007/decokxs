package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.core.util.SPUtils;
import com.okinc.tradeuilib.menu.mvp.ContractDualAdjustLeverP;
import com.okinc.unify_trade.biz.DualLeverageResp;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C49511upt;
import o.C49791uvH;
import o.C54520xLl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uvj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49819uvj extends AbstractC49945uyC<AbstractC49541uqW, ContractDualAdjustLeverP> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public Function1<? super java.lang.Boolean, Unit> AEQbTJ;
    public final float OLrzqt = 0.95f;
    public Function1<? super android.content.Context, Unit> copydefault;

    /* JADX INFO: renamed from: o.uvj$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C49511upt.StateListAnimator.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super java.lang.Boolean, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "ContractAdjustDualLeverDFragment";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.uvj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uvj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.uvj$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C49819uvj newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
            if ((i & 32) != 0) {
                function12 = null;
            }
            return actionBar.KWHzl(str, str2, str3, str4, function1, function12);
        }

        public final C49819uvj KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Function1<? super android.content.Context, Unit> function1, Function1<? super java.lang.Boolean, Unit> function12) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C49819uvj c49819uvj = new C49819uvj();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instId", str);
            bundle.putString("instType", str2);
            bundle.putString("marginModel", "isolated");
            bundle.putString("longLever", str3);
            bundle.putString("shortLever", str4);
            c49819uvj.setArguments(bundle);
            c49819uvj.OLrzqt(function12);
            c49819uvj.copydefault = function1;
            return c49819uvj;
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt().KWHzl(getArguments());
        OLrzqt().fJNWhG();
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i = C49511upt.Application.QVAiDq;
        C49791uvH.Application application = C49791uvH.Companion;
        fragmentTransactionBeginTransaction.replace(i, application.AEQbTJ(getArguments(), "long", new Function1() { // from class: o.uvo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49819uvj.EZpvd(this.AEQbTJ, (android.content.Context) obj);
            }
        }), "long-f").replace(C49511upt.Application.dNCPSb, application.AEQbTJ(getArguments(), "short", new Function1() { // from class: o.uvm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49819uvj.AEQbTJ(this.AEQbTJ, (android.content.Context) obj);
            }
        }), "short-f").commitAllowingStateLoss();
    }

    public static final Unit EZpvd(C49819uvj c49819uvj, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Function1<? super android.content.Context, Unit> function1 = c49819uvj.copydefault;
        if (function1 != null) {
            function1.invoke(context);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C49819uvj c49819uvj, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Function1<? super android.content.Context, Unit> function1 = c49819uvj.copydefault;
        if (function1 != null) {
            function1.invoke(context);
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setVisibility(8);
        wxq.setGravity(8388611);
        java.lang.String string = getString(C49511upt.Activity.gEmmrt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        TradeLiveData<java.util.List<DualLeverageResp>> tradeLiveDataKWHzl = OLrzqt().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.uvh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49819uvj.AhwBna(this.copydefault, (java.util.List) obj);
            }
        }));
        C52794wYp c52794wYp = values().EZpvd;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        TradeLiveData<java.lang.Boolean> tradeLiveDataAYXKKw = OLrzqt().AYXKKw();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.uvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49819uvj.KWHzl(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        OLrzqt().DbNXlk();
    }

    public static final Unit AhwBna(C49819uvj c49819uvj, java.util.List list) {
        DualLeverageResp dualLeverageResp;
        Function1<? super java.lang.Boolean, Unit> function1;
        java.lang.Object next;
        java.lang.Object obj = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DualLeverageResp dualLeverageResp2 = (DualLeverageResp) next;
                if (C33129mqd.AhwBna(dualLeverageResp2.getCode(), 0) && C33129mqd.OLrzqt((java.lang.CharSequence) dualLeverageResp2.getErrorMessage())) {
                    break;
                }
            }
            dualLeverageResp = (DualLeverageResp) next;
        } else {
            dualLeverageResp = null;
        }
        if (dualLeverageResp == null) {
            c49819uvj.dismissAllowingStateLoss();
            Function1<? super java.lang.Boolean, Unit> function12 = c49819uvj.AEQbTJ;
            if (function12 != null) {
                function12.invoke(java.lang.Boolean.TRUE);
            }
        } else {
            if (list != null) {
                java.util.Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it2.next();
                    if (C33129mqd.OLrzqt((java.lang.Object) ((DualLeverageResp) next2).getCode(), (java.lang.Object) 0)) {
                        obj = next2;
                        break;
                    }
                }
                obj = (DualLeverageResp) obj;
            }
            if (obj != null && (function1 = c49819uvj.AEQbTJ) != null) {
                function1.invoke(java.lang.Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.uvj$TaskDescription */
    public static final class TaskDescription implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            C49819uvj c49819uvj = C49819uvj.this;
            c49819uvj.OLrzqt(c49819uvj.OLrzqt().valueOf(), C49819uvj.this.OLrzqt().gEmmrt(), C33129mqd.gEmmrt(java.lang.Double.valueOf(3.0d)));
            C49819uvj.this.OLrzqt().AEQbTJ();
        }
    }

    public static final Unit KWHzl(C49819uvj c49819uvj, boolean z) {
        c49819uvj.values().EZpvd.setEnabled(z);
        return Unit.INSTANCE;
    }

    public final java.lang.CharSequence OLrzqt(boolean z, boolean z2) {
        xMR xmr = xMR.copydefault;
        java.lang.String iCUNumber$default = xMR.formatICUNumber$default(xmr, OLrzqt().valueOf(), null, null, null, null, 30, null);
        java.lang.String iCUNumber$default2 = xMR.formatICUNumber$default(xmr, OLrzqt().gEmmrt(), null, null, null, null, 30, null);
        if (z && z2) {
            return C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C49511upt.Activity.dvKsVJ, C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, iCUNumber$default), C56390yDp.OLrzqt("number2", iCUNumber$default2))), new java.lang.String[]{iCUNumber$default, iCUNumber$default2}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.uvn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49819uvj.gEmmrt(this.EZpvd, (java.util.List) obj);
                }
            }, 10, null);
        }
        if (z) {
            return C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C49511upt.Activity.fZBcTu, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, iCUNumber$default))), new java.lang.String[]{iCUNumber$default}, 0, null, false, new Function1() { // from class: o.uvl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49819uvj.djBIcL(this.OLrzqt, (java.util.List) obj);
                }
            }, 14, null);
        }
        return z2 ? C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C49511upt.Activity.fFgQHt, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, iCUNumber$default2))), new java.lang.String[]{iCUNumber$default2}, 0, null, false, new Function1() { // from class: o.uvp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49819uvj.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        }, 14, null) : "";
    }

    public static final Unit gEmmrt(C49819uvj c49819uvj, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c49819uvj.getContext(), C32113mPz.Dialog.wlaJM));
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C49819uvj c49819uvj, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c49819uvj.getContext(), C32113mPz.Dialog.wlaJM));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C49819uvj c49819uvj, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c49819uvj.getContext(), C32113mPz.Dialog.wlaJM));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.uvj$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C49819uvj OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C49819uvj c49819uvj) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c49819uvj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("PlaceOrder_PopUp_AdjustLeverage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                C49819uvj c49819uvj = this.OLrzqt;
                c49819uvj.OLrzqt(c49819uvj.new TaskDescription());
            }
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String string;
        java.lang.String string2;
        C54520xLl c54520xLl = C54520xLl.KWHzl;
        android.os.Bundle arguments = getArguments();
        java.lang.String str4 = (arguments == null || (string2 = arguments.getString("instId", "")) == null) ? "" : string2;
        android.os.Bundle arguments2 = getArguments();
        c54520xLl.AEQbTJ(new C54520xLl.Activity("user", Web3SecurityTrackEvent.VALUE_INPUT, "adjust_leverage", str4, (arguments2 == null || (string = arguments2.getString("instType", "")) == null) ? "" : string, C56424yEw.gEmmrt(C56390yDp.OLrzqt("input_long_leverage", C33129mqd.gEmmrt(str)), C56390yDp.OLrzqt("input_short_leverage", C33129mqd.gEmmrt(str2)), C56390yDp.OLrzqt("risk_leverage", C33129mqd.gEmmrt(str3)))));
    }

    public static final void copydefault(C49819uvj c49819uvj, final Function0<Unit> function0, java.lang.CharSequence charSequence) {
        android.view.View viewInflate = android.view.LayoutInflater.from(c49819uvj.getActivity()).inflate(C49511upt.StateListAnimator.gEmmrt, (android.view.ViewGroup) null);
        android.widget.TextView textView = viewInflate != null ? (android.widget.TextView) viewInflate.findViewById(C49511upt.Application.DUUtXg) : null;
        android.widget.CheckBox checkBox = viewInflate != null ? (android.widget.CheckBox) viewInflate.findViewById(C49511upt.Application.ejfBZ) : null;
        C52794wYp c52794wYp = viewInflate != null ? (C52794wYp) viewInflate.findViewById(C49511upt.Application.DGUQLIekVPG) : null;
        C52794wYp c52794wYp2 = viewInflate != null ? (C52794wYp) viewInflate.findViewById(C49511upt.Application.getPriority) : null;
        if (c52794wYp2 != null) {
            c52794wYp2.setVisibility(8);
        }
        if (c52794wYp != null) {
            c52794wYp.setVisibility(8);
        }
        if (textView != null) {
            textView.setText(charSequence);
        }
        android.content.Context contextRequireContext = c49819uvj.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(c49819uvj.getResources().getString(C49511upt.Activity.flVtFt));
        Intrinsics.copydefault(viewInflate);
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, viewInflate, 0, 2, null);
        viewOnClickListenerC54939xaY.EZpvd(C49511upt.Activity.iwGUEr, new View.OnClickListener() { // from class: o.uvq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49819uvj.OLrzqt(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C49511upt.Activity.getFieldNames, new View.OnClickListener() { // from class: o.uvu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49819uvj.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.uvt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C49819uvj.copydefault(compoundButton, z);
                }
            });
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        C32866mlf.onEvent$default("app_marginstill_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C32866mlf.onEvent$default("app_marginreset_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(android.widget.CompoundButton compoundButton, boolean z) {
        SPUtils.put("adjust_lever_risk_remind", java.lang.Boolean.valueOf(z));
    }

    public final void OLrzqt(Function0<Unit> function0) {
        boolean zCopydefault = OLrzqt().copydefault();
        boolean zOLrzqt = OLrzqt().OLrzqt();
        if ((zCopydefault || zOLrzqt) && !SPUtils.getBoolean("adjust_lever_risk_remind", false)) {
            copydefault(this, function0, OLrzqt(zCopydefault, zOLrzqt));
            C32866mlf.onEvent$default("app_marginriskpop_show", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        } else {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.AEQbTJ = null;
    }
}
