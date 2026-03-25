package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.trader.ui.filter.TradersFilterViewModel;
import com.okinc.business.market.features.trader.ui.model.TraderPnLFilter;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kAr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27715kAr extends AbstractC27713kAp {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public Function2<? super TraderPnLFilter, ? super java.lang.String, Unit> AhwBna;
    public hBV DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm isConnected;
    public int valueOf;

    /* JADX INFO: renamed from: o.kAr$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TraderPnLFilter.values().length];
            try {
                iArr[TraderPnLFilter.TOTAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TraderPnLFilter.REALIZED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TraderPnLFilter.UNREALIZED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.kAr$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.valueOf = i;
    }

    public C27715kAr() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.trader.ui.filter.TradersFilterBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.trader.ui.filter.TradersFilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TradersFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.trader.ui.filter.TradersFilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.trader.ui.filter.TradersFilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.trader.ui.filter.TradersFilterBottomSheet$special$$inlined$viewModels$default$5
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.kAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27715kAr.gEmmrt(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.kAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27715kAr.djBIcL(this.AEQbTJ);
            }
        });
        this.valueOf = 2;
    }

    public final TradersFilterViewModel AYXKKw() {
        return (TradersFilterViewModel) this.isConnected.getValue();
    }

    /* JADX DEBUG: Possible override for method o.kAp.EZpvd()V */
    public final TraderPnLFilter EZpvd() {
        return (TraderPnLFilter) this.djBIcL.getValue();
    }

    public static final TraderPnLFilter gEmmrt(C27715kAr c27715kAr) {
        TraderPnLFilter traderPnLFilter;
        android.os.Bundle arguments = c27715kAr.getArguments();
        return (arguments == null || (traderPnLFilter = (TraderPnLFilter) arguments.getParcelable("PNL_SELECTED")) == null) ? TraderPnLFilter.TOTAL : traderPnLFilter;
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String djBIcL(C27715kAr c27715kAr) {
        java.lang.String string;
        android.os.Bundle arguments = c27715kAr.getArguments();
        return (arguments == null || (string = arguments.getString("FILTER_ADDRESS")) == null) ? "" : string;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.addOnTrimMemoryListener));
        wxq.setStyle(2);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.dpErvT));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.sanrWj));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new Activity(c52794wYpAEQbTJ2, 1000L, this));
        }
        AYXKKw().copydefault().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.kAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27715kAr.EZpvd(wyf, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit EZpvd(wYF wyf, java.lang.Boolean bool) {
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        hBV hbvAEQbTJ = hBV.AEQbTJ(getLayoutInflater(), constraintLayout, true);
        this.DbNXlk = hbvAEQbTJ;
        if (hbvAEQbTJ != null) {
            hbvAEQbTJ.copydefault.EZpvd(true);
            hbvAEQbTJ.copydefault.setText(valueOf());
            hbvAEQbTJ.djBIcL.setText(C33070mpX.AYXKKw(TraderPnLFilter.TOTAL.getTitle()));
            hbvAEQbTJ.AEQbTJ.setText(C33070mpX.AYXKKw(TraderPnLFilter.REALIZED.getTitle()));
            hbvAEQbTJ.AhwBna.setText(C33070mpX.AYXKKw(TraderPnLFilter.UNREALIZED.getTitle()));
            AhwBna();
            gEmmrt();
        }
        OLrzqt(EZpvd());
        TradersFilterViewModel.updateFilter$default(AYXKKw(), null, valueOf(), 1, null);
    }

    public final void AhwBna() {
        hBV hbv = this.DbNXlk;
        if (hbv != null) {
            C54984xbQ c54984xbQ = hbv.djBIcL;
            c54984xbQ.setOnClickListener(new FragmentManager(c54984xbQ, 1000L, this));
            C54984xbQ c54984xbQ2 = hbv.AEQbTJ;
            c54984xbQ2.setOnClickListener(new LoaderManager(c54984xbQ2, 1000L, this));
            C54984xbQ c54984xbQ3 = hbv.AhwBna;
            c54984xbQ3.setOnClickListener(new PendingIntent(c54984xbQ3, 1000L, this));
        }
    }

    public final void gEmmrt() {
        C55001xbh c55001xbhAkhnZx;
        hBV hbv = this.DbNXlk;
        if (hbv == null || (c55001xbhAkhnZx = hbv.copydefault.AkhnZx()) == null) {
            return;
        }
        C33606mzd.AEQbTJ(c55001xbhAkhnZx, new Function1() { // from class: o.kAo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27715kAr.AEQbTJ(this.AEQbTJ, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C27715kAr c27715kAr, java.lang.CharSequence charSequence) {
        TradersFilterViewModel.updateFilter$default(c27715kAr.AYXKKw(), null, java.lang.String.valueOf(charSequence), 1, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(TraderPnLFilter traderPnLFilter) {
        TradersFilterViewModel.updateFilter$default(AYXKKw(), traderPnLFilter, null, 2, null);
        hBV hbv = this.DbNXlk;
        if (hbv != null) {
            hbv.djBIcL.setSelectedStyle(false, 3);
            hbv.AEQbTJ.setSelectedStyle(false, 3);
            hbv.AhwBna.setSelectedStyle(false, 3);
            int i = ActionBar.KWHzl[traderPnLFilter.ordinal()];
            if (i == 1) {
                hbv.djBIcL.setSelectedStyle(true, 3);
            } else if (i == 2) {
                hbv.AEQbTJ.setSelectedStyle(true, 3);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hbv.AhwBna.setSelectedStyle(true, 3);
            }
        }
    }

    public final void djBIcL() {
        C55008xbo c55008xbo;
        AYXKKw().AEQbTJ();
        TradersFilterViewModel.updateFilter$default(AYXKKw(), null, AYXKKw().KWHzl(), 1, null);
        OLrzqt(AYXKKw().EZpvd());
        hBV hbv = this.DbNXlk;
        if (hbv == null || (c55008xbo = hbv.copydefault) == null) {
            return;
        }
        c55008xbo.clearFocus();
        c55008xbo.setText("");
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C33570myu.copydefault((android.app.Activity) getActivity());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        C33570myu.copydefault((android.app.Activity) getActivity());
    }

    /* JADX INFO: renamed from: o.kAr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kAr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C27715kAr OLrzqt(@NotNull TraderPnLFilter traderPnLFilter, @NotNull java.lang.String str, @NotNull Function2<? super TraderPnLFilter, ? super java.lang.String, Unit> function2) {
            Intrinsics.checkNotNullParameter(traderPnLFilter, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("PNL_SELECTED", traderPnLFilter);
            bundle.putString("FILTER_ADDRESS", str);
            C27715kAr c27715kAr = new C27715kAr();
            c27715kAr.setArguments(bundle);
            c27715kAr.AhwBna = function2;
            return c27715kAr;
        }
    }

    /* JADX INFO: renamed from: o.kAr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C27715kAr EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C27715kAr c27715kAr) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c27715kAr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.djBIcL();
                Function2 function2 = this.EZpvd.AhwBna;
                if (function2 != null) {
                    function2.invoke(this.EZpvd.AYXKKw().EZpvd(), this.EZpvd.AYXKKw().KWHzl());
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.kAr$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C27715kAr OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C27715kAr c27715kAr) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c27715kAr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt(TraderPnLFilter.TOTAL);
            }
        }
    }

    /* JADX INFO: renamed from: o.kAr$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C27715kAr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C27715kAr c27715kAr) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c27715kAr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.OLrzqt(TraderPnLFilter.REALIZED);
            }
        }
    }

    /* JADX INFO: renamed from: o.kAr$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C27715kAr OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C27715kAr c27715kAr) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c27715kAr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt(TraderPnLFilter.UNREALIZED);
            }
        }
    }

    /* JADX INFO: renamed from: o.kAr$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C27715kAr AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C27715kAr c27715kAr) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c27715kAr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
                Function2 function2 = this.AEQbTJ.AhwBna;
                if (function2 != null) {
                    function2.invoke(this.AEQbTJ.AYXKKw().EZpvd(), this.AEQbTJ.AYXKKw().KWHzl());
                }
                C27698kAa.EZpvd(this.AEQbTJ.AYXKKw().EZpvd(), this.AEQbTJ.AYXKKw().KWHzl());
            }
        }
    }
}
