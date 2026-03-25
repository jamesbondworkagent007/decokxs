package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsBottomSheet$initListener$1;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsBottomSheet$initListener$2;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsSheetViewModel;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsType;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C52912wba;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.waG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52839waG extends AbstractC52837waE {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public C48328uNk AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public Function2<? super SmartArbDetailsType, ? super java.lang.String, Unit> valueOf;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public C52839waG() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsBottomSheet$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartArbDetailsSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsBottomSheet$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.waK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52839waG.copydefault(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.waE.KWHzl()V */
    public final C48328uNk KWHzl() {
        C48328uNk c48328uNk = this.AhwBna;
        Intrinsics.copydefault(c48328uNk);
        return c48328uNk;
    }

    /* JADX INFO: renamed from: o.waG$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.waG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C52839waG copydefault(@NotNull SmartArbDetailsType smartArbDetailsType, TacticsData tacticsData, @NotNull Function2<? super SmartArbDetailsType, ? super java.lang.String, Unit> function2) {
            Intrinsics.checkNotNullParameter(smartArbDetailsType, "");
            Intrinsics.checkNotNullParameter(function2, "");
            C52839waG c52839waG = new C52839waG();
            c52839waG.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_details_type", smartArbDetailsType), C56390yDp.OLrzqt("arg_tactics_data", tacticsData)));
            c52839waG.valueOf = function2;
            return c52839waG;
        }
    }

    public final SmartArbDetailsSheetViewModel djBIcL() {
        return (SmartArbDetailsSheetViewModel) this.gEmmrt.getValue();
    }

    public final SmartArbDetailsType AhwBna() {
        return (SmartArbDetailsType) this.AYXKKw.getValue();
    }

    public static final SmartArbDetailsType copydefault(C52839waG c52839waG) {
        return c52839waG.djBIcL().copydefault();
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        textViewAYXKKw.setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        textViewAYXKKw.setText(C33070mpX.AYXKKw(AhwBna().getTitle()));
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AhwBna = C48328uNk.KWHzl(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        constraintLayout.addView(KWHzl().getRoot());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
        valueOf();
        SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModelDjBIcL = djBIcL();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        smartArbDetailsSheetViewModelDjBIcL.EZpvd(lifecycle);
    }

    private final void AYXKKw() {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        C55320xhi c55320xhiKWHzl4;
        C55320xhi c55320xhiKWHzl5;
        C48328uNk c48328uNkKWHzl = KWHzl();
        if (AhwBna() == SmartArbDetailsType.Staking) {
            c48328uNkKWHzl.gEmmrt.setHelperLabelType(1);
            C55312xha c55312xhaValueOf = c48328uNkKWHzl.gEmmrt.valueOf();
            if (c55312xhaValueOf != null) {
                c55312xhaValueOf.setOnClickListener(new StateListAnimator(c55312xhaValueOf, 1000L, this));
            }
        } else {
            c48328uNkKWHzl.gEmmrt.setHelperLabelType(2);
            C55312xha c55312xhaValueOf2 = c48328uNkKWHzl.gEmmrt.valueOf();
            if (c55312xhaValueOf2 != null) {
                c55312xhaValueOf2.setOnClickListener(new Activity(c55312xhaValueOf2, 1000L));
            }
        }
        C55312xha c55312xhaValueOf3 = c48328uNkKWHzl.gEmmrt.valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl5 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl5.setText(C33069mpW.copydefault(AhwBna().getTotalProfitLabel(), C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", "--"))));
        }
        uNN unn = c48328uNkKWHzl.KWHzl;
        C55258xgZ c55258xgZ = unn.KWHzl;
        c55258xgZ.setHelperLabelType(2);
        C55312xha c55312xhaValueOf4 = c55258xgZ.valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl4 = c55312xhaValueOf4.KWHzl()) != null) {
            c55320xhiKWHzl4.setText(C33070mpX.AYXKKw(AhwBna().getCurrentProfitLabel()));
        }
        C55258xgZ c55258xgZ2 = unn.AEQbTJ;
        c55258xgZ2.setHelperLabelType(2);
        C55312xha c55312xhaValueOf5 = c55258xgZ2.valueOf();
        if (c55312xhaValueOf5 != null && (c55320xhiKWHzl3 = c55312xhaValueOf5.KWHzl()) != null) {
            c55320xhiKWHzl3.setText("--");
        }
        uNN unn2 = c48328uNkKWHzl.copydefault;
        C55258xgZ c55258xgZ3 = unn2.KWHzl;
        c55258xgZ3.setHelperLabelType(2);
        C55312xha c55312xhaValueOf6 = c55258xgZ3.valueOf();
        if (c55312xhaValueOf6 != null && (c55320xhiKWHzl2 = c55312xhaValueOf6.KWHzl()) != null) {
            c55320xhiKWHzl2.setText(C33070mpX.AYXKKw(AhwBna().getHistoricalWithdrawalLabel()));
        }
        C55258xgZ c55258xgZ4 = unn2.AEQbTJ;
        c55258xgZ4.setHelperLabelType(2);
        C55312xha c55312xhaValueOf7 = c55258xgZ4.valueOf();
        if (c55312xhaValueOf7 != null && (c55320xhiKWHzl = c55312xhaValueOf7.KWHzl()) != null) {
            c55320xhiKWHzl.setText("--");
        }
        android.widget.TextView textView = c48328uNkKWHzl.EZpvd;
        textView.setOnClickListener(new Application(textView, 1000L, this));
    }

    private final void valueOf() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SmartArbDetailsBottomSheet$initListener$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new SmartArbDetailsBottomSheet$initListener$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.waG$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j) {
            this.copydefault = view;
            this.AEQbTJ = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: o.waG$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C52839waG OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52839waG c52839waG) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c52839waG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function2 function2 = this.OLrzqt.valueOf;
                if (function2 != null) {
                    SmartArbDetailsType smartArbDetailsTypeAhwBna = this.OLrzqt.AhwBna();
                    TacticsData tacticsDataAYXKKw = this.OLrzqt.djBIcL().AYXKKw();
                    java.lang.String algoId = tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getAlgoId() : null;
                    if (algoId == null) {
                        algoId = "";
                    }
                    function2.invoke(smartArbDetailsTypeAhwBna, algoId);
                }
                this.OLrzqt.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.waG$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j) {
            this.KWHzl = view;
            this.OLrzqt = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: o.waG$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C52839waG AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52839waG c52839waG) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c52839waG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.djBIcL().AEQbTJ(SmartArbDetailsSheetViewModel.Application.StateListAnimator.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.waG$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C52839waG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52839waG c52839waG) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c52839waG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.dismiss();
            }
        }
    }

    public final void EZpvd(SmartArbDetailsSheetViewModel.ActionBar actionBar) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        C48328uNk c48328uNkKWHzl = KWHzl();
        if (AhwBna() == SmartArbDetailsType.Staking && actionBar.KWHzl()) {
            c48328uNkKWHzl.gEmmrt.setHelperLabelType(2);
            C55312xha c55312xhaValueOf = c48328uNkKWHzl.gEmmrt.valueOf();
            if (c55312xhaValueOf != null) {
                c55312xhaValueOf.setOnClickListener(new FragmentManager(c55312xhaValueOf, 1000L));
            }
        }
        c48328uNkKWHzl.gEmmrt.setText(C33069mpW.copydefault(AhwBna().getTotalProfitLabel(), C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", actionBar.EZpvd()))));
        c48328uNkKWHzl.AEQbTJ.setText(uLP.AEQbTJ(actionBar.AYXKKw()));
        c48328uNkKWHzl.AEQbTJ.setTextColor(actionBar.gEmmrt());
        C55312xha c55312xhaValueOf2 = c48328uNkKWHzl.KWHzl.AEQbTJ.valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl2.setText(uLP.AEQbTJ(actionBar.AEQbTJ()));
        }
        C55312xha c55312xhaValueOf3 = c48328uNkKWHzl.copydefault.AEQbTJ.valueOf();
        if (c55312xhaValueOf3 == null || (c55320xhiKWHzl = c55312xhaValueOf3.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(uLP.AEQbTJ(actionBar.OLrzqt()));
    }

    public final void copydefault(C52912wba.ActionBar actionBar, C52912wba.ActionBar actionBar2) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strCopydefault;
        android.content.Context context = getContext();
        if (context != null) {
            java.lang.String strAddS$default = C33129mqd.addS$default(actionBar.AEQbTJ(), actionBar2.AEQbTJ(), null, null, null, 14, null);
            java.lang.String strAddS$default2 = C33129mqd.addS$default(actionBar.valueOf(), actionBar2.valueOf(), null, null, null, 14, null);
            java.lang.String strAddS$default3 = C33129mqd.addS$default(actionBar.KWHzl(), actionBar2.KWHzl(), null, null, null, 14, null);
            TacticsData tacticsDataAYXKKw = djBIcL().AYXKKw();
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DztXDE));
            if (tacticsDataAYXKKw == null) {
                obj = "ccy6";
                str = strAddS$default3;
                str2 = strAddS$default2;
            } else {
                if (tacticsDataAYXKKw.isSmartArbitrageWithStaking()) {
                    if (tacticsDataAYXKKw.getHistory()) {
                        strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.hNurIN, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt1", actionBar.AYXKKw()), C56390yDp.OLrzqt("ccy1", actionBar.copydefault()), C56390yDp.OLrzqt("amt2", actionBar2.AYXKKw()), C56390yDp.OLrzqt("ccy2", actionBar2.copydefault()), C56390yDp.OLrzqt("amt3", strAddS$default), C56390yDp.OLrzqt("ccy3", actionBar.OLrzqt()), C56390yDp.OLrzqt("amt4", actionBar.AhwBna()), C56390yDp.OLrzqt("ccy4", actionBar.copydefault()), C56390yDp.OLrzqt("amt5", actionBar2.AhwBna()), C56390yDp.OLrzqt("ccy5", actionBar2.copydefault()), C56390yDp.OLrzqt("amt6", strAddS$default2), C56390yDp.OLrzqt("ccy6", actionBar.OLrzqt()), C56390yDp.OLrzqt("amt7", actionBar.EZpvd()), C56390yDp.OLrzqt("ccy7", actionBar.copydefault()), C56390yDp.OLrzqt("amt8", actionBar2.EZpvd()), C56390yDp.OLrzqt("ccy8", actionBar2.copydefault()), C56390yDp.OLrzqt("amt9", strAddS$default3), C56390yDp.OLrzqt("ccy9", actionBar.OLrzqt())));
                    } else {
                        strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.gCZUJG, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt1", actionBar.EZpvd()), C56390yDp.OLrzqt("ccy1", actionBar.copydefault()), C56390yDp.OLrzqt("amt2", actionBar2.EZpvd()), C56390yDp.OLrzqt("ccy2", actionBar2.copydefault()), C56390yDp.OLrzqt("amt3", strAddS$default3), C56390yDp.OLrzqt("ccy3", actionBar.OLrzqt()), C56390yDp.OLrzqt("amt4", actionBar.AYXKKw()), C56390yDp.OLrzqt("ccy4", actionBar.copydefault()), C56390yDp.OLrzqt("amt5", actionBar2.AYXKKw()), C56390yDp.OLrzqt("ccy5", actionBar2.copydefault()), C56390yDp.OLrzqt("amt6", strAddS$default), C56390yDp.OLrzqt("ccy6", actionBar.OLrzqt()), C56390yDp.OLrzqt("amt7", actionBar.AhwBna()), C56390yDp.OLrzqt("ccy7", actionBar.copydefault()), C56390yDp.OLrzqt("amt8", actionBar2.AhwBna()), C56390yDp.OLrzqt("ccy8", actionBar2.copydefault()), C56390yDp.OLrzqt("amt9", strAddS$default2), C56390yDp.OLrzqt("ccy9", actionBar.OLrzqt())));
                    }
                    viewOnClickListenerC54939xaY.EZpvd(strCopydefault);
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.waM
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C52839waG.AEQbTJ(viewOnClickListenerC54939xaY, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.show();
                }
                str2 = strAddS$default2;
                str = strAddS$default3;
                obj = "ccy6";
            }
            strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.DzkRMH, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt1", actionBar2.AYXKKw()), C56390yDp.OLrzqt("ccy1", actionBar2.copydefault()), C56390yDp.OLrzqt("amt2", strAddS$default), C56390yDp.OLrzqt("ccy2", actionBar2.OLrzqt()), C56390yDp.OLrzqt("amt3", actionBar2.AhwBna()), C56390yDp.OLrzqt("ccy3", actionBar2.copydefault()), C56390yDp.OLrzqt("amt4", str2), C56390yDp.OLrzqt("ccy4", actionBar2.OLrzqt()), C56390yDp.OLrzqt("amt5", actionBar2.EZpvd()), C56390yDp.OLrzqt("ccy5", actionBar2.copydefault()), C56390yDp.OLrzqt("amt6", str), C56390yDp.OLrzqt(obj, actionBar2.OLrzqt())));
            viewOnClickListenerC54939xaY.EZpvd(strCopydefault);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.waM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52839waG.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.aUsmxb));
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        djBIcL().AEQbTJ();
        this.valueOf = null;
        this.AhwBna = null;
        super.onDestroyView();
    }
}
