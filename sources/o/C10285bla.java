package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$setupViews$1$1;
import com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$updateContent$1;
import com.okinc.business.defi.assets.utxo.list.InvestUtxoListViewModel;
import com.okinc.business.defi.assets.utxo.previewasset.InvestUtxoAssetPreviewParams;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoAction;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoManagementViewModel;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItem;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoWalletInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.InterfaceC10317bmF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bla, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10285bla extends AbstractC10229bkX {
    public C10228bkW AhwBna;
    public C16568emQ djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.ihnvzI;
    }

    public C10285bla() {
        final Function0 function0 = new Function0() { // from class: o.blg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10285bla.AhwBna(this.EZpvd);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$special$$inlined$viewModels$default$1
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestUtxoManagementViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$special$$inlined$viewModels$default$4
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestUtxoListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$special$$inlined$viewModels$default$8
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$special$$inlined$viewModels$default$9
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.bkX.OLrzqt()V */
    public final C16568emQ OLrzqt() {
        C16568emQ c16568emQ = this.djBIcL;
        Intrinsics.copydefault(c16568emQ);
        return c16568emQ;
    }

    public final UtxoWalletInfo AhwBna() {
        UtxoWalletInfo utxoWalletInfo;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (utxoWalletInfo = (UtxoWalletInfo) arguments.getParcelable("key.wallet_info")) == null) {
            throw new java.lang.IllegalStateException("Must provide UTXO info");
        }
        return utxoWalletInfo;
    }

    public final boolean AYXKKw() {
        java.lang.Integer numEZpvd = AhwBna().EZpvd();
        return numEZpvd != null && numEZpvd.intValue() == 8;
    }

    public final InvestUtxoManagementViewModel gEmmrt() {
        return (InvestUtxoManagementViewModel) this.valueOf.getValue();
    }

    public static final ViewModelStoreOwner AhwBna(C10285bla c10285bla) {
        FragmentActivity fragmentActivityRequireActivity = c10285bla.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public final InvestUtxoListViewModel djBIcL() {
        return (InvestUtxoListViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.djBIcL = C16568emQ.copydefault(view);
        valueOf();
        C14646dpQ.collectOnLifecycle$default(this, djBIcL().KWHzl(), null, new Function1() { // from class: o.blh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10285bla.OLrzqt(this.EZpvd, (C10296bll) obj);
            }
        }, 2, null);
        C14646dpQ.collectOnLifecycle$default(this, djBIcL().EZpvd(), null, new Function1() { // from class: o.blf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10285bla.AEQbTJ(this.copydefault, (C10304blt) obj);
            }
        }, 2, null);
        C14646dpQ.collectOnLifecycle$default(this, gEmmrt().copydefault(), null, new Function1() { // from class: o.blj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10285bla.KWHzl(this.AEQbTJ, (InterfaceC10317bmF) obj);
            }
        }, 2, null);
    }

    public static final Unit OLrzqt(C10285bla c10285bla, C10296bll c10296bll) {
        Intrinsics.checkNotNullParameter(c10296bll, "");
        c10285bla.EZpvd(c10296bll);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C10285bla c10285bla, C10304blt c10304blt) {
        Intrinsics.checkNotNullParameter(c10304blt, "");
        c10285bla.EZpvd(c10304blt);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C10285bla c10285bla, InterfaceC10317bmF interfaceC10317bmF) {
        Intrinsics.checkNotNullParameter(interfaceC10317bmF, "");
        c10285bla.OLrzqt(interfaceC10317bmF);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.djBIcL = null;
        super.onDestroy();
    }

    private final void valueOf() {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        C16568emQ c16568emQOLrzqt = OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new InvestUtxoListFragment$setupViews$1$1(this, c16568emQOLrzqt, null), 3, null);
        android.widget.TextView textView = c16568emQOLrzqt.values;
        if (AYXKKw()) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gdmIOq);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.fXYAwm);
        }
        textView.setText(strAYXKKw);
        C55173xeu c55173xeu = c16568emQOLrzqt.KWHzl;
        java.lang.Integer numEZpvd = AhwBna().EZpvd();
        if (numEZpvd != null && numEZpvd.intValue() == 8) {
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.jh);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DsL);
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) strAYXKKw2);
        c55173xeu.setEmptyTypeImage(6);
        C33546myW c33546myW = c16568emQOLrzqt.AYXKKw;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.blc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C10285bla.KWHzl(this.EZpvd, interfaceC57934yrl);
            }
        });
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.KWHzl(true);
        android.widget.TextView textView2 = c16568emQOLrzqt.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(AYXKKw() ? 0 : 8);
        C52794wYp c52794wYp = c16568emQOLrzqt.copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c16568emQOLrzqt.AEQbTJ;
        c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
    }

    public static final void KWHzl(C10285bla c10285bla, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        KeyEventDispatcher.Component activity = c10285bla.getActivity();
        InterfaceC10352bmo interfaceC10352bmo = activity instanceof InterfaceC10352bmo ? (InterfaceC10352bmo) activity : null;
        if (interfaceC10352bmo != null) {
            interfaceC10352bmo.KWHzl();
        }
    }

    public final void OLrzqt(InterfaceC10317bmF interfaceC10317bmF) {
        OLrzqt().AYXKKw.AEQbTJ();
        if (interfaceC10317bmF instanceof InterfaceC10317bmF.Application) {
            InterfaceC10317bmF.Application application = (InterfaceC10317bmF.Application) interfaceC10317bmF;
            java.util.List<UtxoItem> listEZpvd = application.EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listEZpvd) {
                if (((UtxoItem) obj).EZpvd() == djBIcL().KWHzl(AhwBna().EZpvd())) {
                    arrayList.add(obj);
                }
            }
            djBIcL().KWHzl(arrayList, application.KWHzl());
        }
    }

    public final void EZpvd(C10296bll c10296bll) {
        boolean zIsEmpty = c10296bll.EZpvd().isEmpty();
        C16568emQ c16568emQOLrzqt = OLrzqt();
        C55173xeu c55173xeu = c16568emQOLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(zIsEmpty ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = c16568emQOLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(zIsEmpty ^ true ? 0 : 8);
        OLrzqt().AYXKKw.AEQbTJ();
        C10228bkW c10228bkW = this.AhwBna;
        if (c10228bkW != null) {
            c10228bkW.copydefault(c10296bll.EZpvd());
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        EZpvd(c10296bll.KWHzl());
    }

    public final void EZpvd(C10304blt c10304blt) {
        C16568emQ c16568emQOLrzqt = OLrzqt();
        C52794wYp c52794wYp = c16568emQOLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(c10304blt.copydefault() ^ true ? 0 : 8);
        C52794wYp c52794wYp2 = c16568emQOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        c52794wYp2.setVisibility(c10304blt.copydefault() ? 0 : 8);
        c16568emQOLrzqt.OLrzqt.setEnabled(c10304blt.EZpvd() > 0);
        AEQbTJ(c10304blt);
        OLrzqt(c10304blt);
    }

    public final void EZpvd(long j) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUtxoListFragment$updateContent$1(this, j, null), 3, null);
    }

    /* JADX INFO: renamed from: o.bla$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C10285bla OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C10285bla c10285bla) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c10285bla;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: androidx.fragment.app.FragmentActivity */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                InvestUtxoAction investUtxoActionCopy$default = InvestUtxoAction.copy$default(this.OLrzqt.djBIcL().AEQbTJ(this.OLrzqt.AhwBna().KWHzl()), 0L, null, null, java.lang.Integer.valueOf(this.OLrzqt.AYXKKw() ? 1 : 0), 7, null);
                FragmentActivity activity = this.OLrzqt.getActivity();
                InterfaceC10352bmo interfaceC10352bmo = activity instanceof InterfaceC10352bmo ? (InterfaceC10352bmo) activity : null;
                if (this.OLrzqt.AYXKKw()) {
                    if (interfaceC10352bmo != null) {
                        interfaceC10352bmo.KWHzl(investUtxoActionCopy$default);
                    }
                } else if (interfaceC10352bmo != null) {
                    interfaceC10352bmo.copydefault(investUtxoActionCopy$default);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.bla$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C10285bla EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C10285bla c10285bla) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c10285bla;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.djBIcL().copydefault();
            }
        }
    }

    /* JADX INFO: renamed from: o.bla$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C10285bla OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C10285bla c10285bla) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c10285bla;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.djBIcL().OLrzqt();
            }
        }
    }

    public final void AEQbTJ(C10304blt c10304blt) {
        java.lang.String string;
        C52794wYp c52794wYp = OLrzqt().OLrzqt;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = OLrzqt().OLrzqt;
        if (c10304blt.EZpvd() > 0) {
            string = C33069mpW.copydefault(this, AYXKKw() ? C13754dXa.FragmentManager.Rtjmuc : C13754dXa.FragmentManager.YFmri, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.Integer.valueOf(c10304blt.EZpvd()))));
        } else {
            string = getString(AYXKKw() ? C13754dXa.FragmentManager.aGOrKO : C13754dXa.FragmentManager.aCSzUz);
            Intrinsics.copydefault((java.lang.Object) string);
        }
        c52794wYp2.setText(string);
    }

    public final void OLrzqt(C10304blt c10304blt) {
        if (AYXKKw()) {
            copydefault(c10304blt);
        } else {
            KWHzl(c10304blt);
        }
    }

    public final void copydefault(C10304blt c10304blt) {
        java.lang.String strCopydefault;
        boolean z = c10304blt.EZpvd() > 0 || c10304blt.AEQbTJ() > 300;
        android.widget.TextView textView = OLrzqt().isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        if (z) {
            android.widget.TextView textView2 = OLrzqt().isConnected;
            if (c10304blt.EZpvd() > 0) {
                strCopydefault = pTD.KWHzl(this, C13754dXa.Dialog.KWHzl, c10304blt.EZpvd(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(c10304blt.EZpvd())), C56390yDp.OLrzqt("numToken", C10353bmp.OLrzqt.AEQbTJ(c10304blt.KWHzl()))));
            } else if (c10304blt.AEQbTJ() > 1000) {
                strCopydefault = C33069mpW.getFormattedString$default(this, C13754dXa.FragmentManager.WS, (java.util.Map) null, 2, (java.lang.Object) null);
            } else {
                strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.call, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(c10304blt.AEQbTJ()))));
            }
            textView2.setText(strCopydefault);
        }
    }

    public final void KWHzl(C10304blt c10304blt) {
        java.lang.String strCopydefault;
        boolean z = c10304blt.AEQbTJ() > 300;
        android.widget.TextView textView = OLrzqt().isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        if (z) {
            android.widget.TextView textView2 = OLrzqt().isConnected;
            if (c10304blt.AEQbTJ() > 1000) {
                strCopydefault = C33069mpW.getFormattedString$default(this, C13754dXa.FragmentManager.WS, (java.util.Map) null, 2, (java.lang.Object) null);
            } else {
                strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.call, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(c10304blt.AEQbTJ()))));
            }
            textView2.setText(strCopydefault);
        }
    }

    public final void AEQbTJ(C10303bls c10303bls) {
        java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        if (!(fragments instanceof java.util.Collection) || !fragments.isEmpty()) {
            java.util.Iterator<T> it = fragments.iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.Fragment) it.next()) instanceof C10305blu) {
                    return;
                }
            }
        }
        C10305blu c10305bluEZpvd = C10305blu.Companion.EZpvd(new InvestUtxoAssetPreviewParams(c10303bls.KWHzl(), c10303bls.AEQbTJ(), AhwBna().KWHzl(), c10303bls.OLrzqt(), AhwBna().OLrzqt()));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c10305bluEZpvd.show(childFragmentManager);
    }

    /* JADX INFO: renamed from: o.bla$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bla.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C10285bla AEQbTJ(@NotNull UtxoWalletInfo utxoWalletInfo) {
            Intrinsics.checkNotNullParameter(utxoWalletInfo, "");
            C10285bla c10285bla = new C10285bla();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.wallet_info", utxoWalletInfo);
            c10285bla.setArguments(bundle);
            return c10285bla;
        }
    }
}
