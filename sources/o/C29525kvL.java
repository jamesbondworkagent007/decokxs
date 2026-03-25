package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.market.features.smart_money.signal.ui.alert_history.SignalAlertHistoryViewModel;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC29518kvE;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29525kvL extends AbstractC29517kvD {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public hEV gEmmrt;
    public wXQ valueOf;
    public final InterfaceC56387yDm values;

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C29525kvL() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.alert_history.SmartMoneyAlertHistoryBottomSheet$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.alert_history.SmartMoneyAlertHistoryBottomSheet$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalAlertHistoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.alert_history.SmartMoneyAlertHistoryBottomSheet$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.alert_history.SmartMoneyAlertHistoryBottomSheet$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.alert_history.SmartMoneyAlertHistoryBottomSheet$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.kvH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29525kvL.OLrzqt(this.KWHzl);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.kvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29525kvL.djBIcL(this.copydefault);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.kvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29525kvL.EZpvd(this.KWHzl);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.kvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29525kvL.gEmmrt();
            }
        });
    }

    /* JADX INFO: renamed from: o.kvL$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kvL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29525kvL EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            C29525kvL c29525kvL = new C29525kvL();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("chain_id", str);
            bundle.putString("token_address", str2);
            bundle.putIntegerArrayList("signal_labels", new java.util.ArrayList<>(list));
            c29525kvL.setArguments(bundle);
            return c29525kvL;
        }
    }

    public final SignalAlertHistoryViewModel AYXKKw() {
        return (SignalAlertHistoryViewModel) this.values.getValue();
    }

    public static final java.lang.String OLrzqt(C29525kvL c29525kvL) {
        java.lang.String string;
        android.os.Bundle arguments = c29525kvL.getArguments();
        return (arguments == null || (string = arguments.getString("chain_id")) == null) ? "" : string;
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String djBIcL(C29525kvL c29525kvL) {
        java.lang.String string;
        android.os.Bundle arguments = c29525kvL.getArguments();
        return (arguments == null || (string = arguments.getString("token_address")) == null) ? "" : string;
    }

    private final java.lang.String fetchVPNInfo() {
        return (java.lang.String) this.AkhnZx.getValue();
    }

    public final java.util.List<java.lang.Integer> AhwBna() {
        return (java.util.List) this.DbNXlk.getValue();
    }

    public static final java.util.List EZpvd(C29525kvL c29525kvL) {
        java.util.ArrayList<java.lang.Integer> integerArrayList;
        android.os.Bundle arguments = c29525kvL.getArguments();
        return (arguments == null || (integerArrayList = arguments.getIntegerArrayList("signal_labels")) == null) ? yDY.AhwBna() : integerArrayList;
    }

    private final kMM valueOf() {
        return (kMM) this.AhwBna.getValue();
    }

    public static final kMM gEmmrt() {
        kMM kmm = new kMM();
        kmm.register(C29582kwP.class, new C29516kvC());
        return kmm;
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        this.valueOf = wxq;
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setPaddingRelative(0, C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, 12);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.gEmmrt = hEV.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        values();
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().AEQbTJ(), null, new ActionBar(), 2, null);
        isConnected();
    }

    /* JADX INFO: renamed from: o.kvL$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC29518kvE abstractC29518kvE, Continuation<? super Unit> continuation) {
            C29525kvL.this.OLrzqt(abstractC29518kvE);
            return Unit.INSTANCE;
        }
    }

    private final void isConnected() {
        AYXKKw().OLrzqt(djBIcL(), fetchVPNInfo(), AhwBna());
    }

    private final void values() {
        hEV hev = this.gEmmrt;
        if (hev != null) {
            hev.copydefault.setAdapter(valueOf());
            hev.KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.kvJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29525kvL.AEQbTJ(this.EZpvd, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C29525kvL c29525kvL, android.view.View view) {
        c29525kvL.isConnected();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(AbstractC29518kvE abstractC29518kvE) {
        boolean z;
        C29584kwR c29584kwROLrzqt;
        java.util.List<C29582kwP> listAEQbTJ;
        hEV hev = this.gEmmrt;
        if (hev != null) {
            C55113xdn c55113xdn = hev.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            boolean z2 = abstractC29518kvE instanceof AbstractC29518kvE.Application;
            c55113xdn.setVisibility(z2 ? 0 : 8);
            boolean z3 = abstractC29518kvE instanceof AbstractC29518kvE.Activity;
            AbstractC29518kvE.Activity activity = z3 ? (AbstractC29518kvE.Activity) abstractC29518kvE : null;
            if (activity == null || (c29584kwROLrzqt = activity.OLrzqt()) == null || (listAEQbTJ = c29584kwROLrzqt.AEQbTJ()) == null) {
                z = false;
            } else {
                z = true;
                if (!(!listAEQbTJ.isEmpty())) {
                }
            }
            C55173xeu c55173xeu = hev.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(((abstractC29518kvE instanceof AbstractC29518kvE.StateListAnimator) || !(z || z2)) ? 0 : 8);
            RecyclerView recyclerView = hev.copydefault;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(z ? 0 : 8);
            ConstraintLayout constraintLayout = hev.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(z ? 0 : 8);
            if (z3 && z) {
                AbstractC29518kvE.Activity activity2 = (AbstractC29518kvE.Activity) abstractC29518kvE;
                kMM.setData$default(valueOf(), activity2.OLrzqt().AEQbTJ(), null, 2, null);
                wXQ wxq = this.valueOf;
                if (wxq != null) {
                    wxq.setTitle(copydefault(kLY.formatPercentage$default(activity2.OLrzqt().KWHzl(), DisplaySign.ALWAYS, false, null, null, 14, null)));
                    wxq.AYXKKw().setMaxLines(2);
                }
            }
        }
    }

    public final android.text.SpannableString copydefault(java.lang.String str) {
        java.lang.String strCopydefault = C33069mpW.copydefault(this, C23274hvD.Fragment.AxsJAYaxsJAY, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", str)));
        android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, str, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default != -1) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI)), iIndexOf$default, str.length() + iIndexOf$default, 33);
        }
        return spannableString;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
        this.gEmmrt = null;
    }
}
