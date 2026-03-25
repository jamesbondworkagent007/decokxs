package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.main.market.detail.TrackingAddressViewModel;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$handleHeaderUiState$1$1$4$1;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$handleHeaderUiState$1$1$5$1;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsParams;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel;
import com.okinc.business.market.features.holders.ui.detail.model.AccountDetail;
import com.okinc.business.market.features.holders.ui.detail.widget.HolderDetailsUiModel;
import com.okinc.business.market.widget.recycler_view.NonScrollableGridLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.uilab.view.OKSortTextView;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C25247itC;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jZE extends androidx.fragment.app.Fragment {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public InterfaceC26310jZs AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public RecyclerView.ItemDecoration KWHzl;
    public final C28015kLt OLrzqt;
    public C21470hAo copydefault;
    public final InterfaceC56387yDm valueOf;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AccountDetail.values().length];
            try {
                iArr[AccountDetail.HOLDER_DETAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AccountDetail.TRADER_DETAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
    public static final java.lang.String OLrzqt() {
        return "--";
    }

    public jZE() {
        final Function0 function0 = new Function0() { // from class: o.jZB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jZE.fetchVPNInfo(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$special$$inlined$viewModels$default$1
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HolderDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$special$$inlined$viewModels$default$4
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackingAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.OLrzqt = new C28015kLt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HolderDetailsViewModel djBIcL() {
        return (HolderDetailsViewModel) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner fetchVPNInfo(jZE jze) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = jze.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    private final HolderDetailsParams AhwBna() {
        HolderDetailsParams holderDetailsParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (holderDetailsParams = (HolderDetailsParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "holder_detail", HolderDetailsParams.class))) == null) ? new HolderDetailsParams(null, null, null, null, null, null, null, 0, null, false, null, null, false, null, 16383, null) : holderDetailsParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingAddressViewModel AYXKKw() {
        return (TrackingAddressViewModel) this.valueOf.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21470hAo c21470hAoAEQbTJ = C21470hAo.AEQbTJ(layoutInflater, viewGroup, false);
        this.copydefault = c21470hAoAEQbTJ;
        if (c21470hAoAEQbTJ != null) {
            return c21470hAoAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        values();
        gEmmrt();
    }

    private final void values() {
        C21470hAo c21470hAo = this.copydefault;
        if (c21470hAo != null) {
            c21470hAo.AuCTel.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.ComponentActivityApi33Impl));
            wYC wycCopydefault = c21470hAo.AuCTel.copydefault();
            if (wycCopydefault != null) {
                wycCopydefault.setImageResource(C52761wXj.TaskDescription.GGlJim);
            }
            C55258xgZ c55258xgZ = c21470hAo.AuCTel;
            c55258xgZ.setOnClickListener(new LoaderManager(c55258xgZ, 1000L, this));
            valueOf();
            c21470hAo.values.setAdapter(this.OLrzqt);
            android.content.Context context = getContext();
            NonScrollableGridLayoutManager nonScrollableGridLayoutManager = context != null ? new NonScrollableGridLayoutManager(context, 2, 0, false, 12, null) : null;
            RecyclerView recyclerView = c21470hAo.values;
            recyclerView.setLayoutManager(nonScrollableGridLayoutManager);
            recyclerView.setItemAnimator(null);
            RecyclerView.ItemDecoration itemDecoration = this.KWHzl;
            if (itemDecoration != null) {
                recyclerView.removeItemDecoration(itemDecoration);
            }
            RecyclerView.ItemDecoration itemDecorationAEQbTJ = C33047mpA.AEQbTJ(2, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            this.KWHzl = itemDecorationAEQbTJ;
            if (itemDecorationAEQbTJ != null) {
                recyclerView.addItemDecoration(itemDecorationAEQbTJ);
            }
            TxType.Companion companion = TxType.Companion;
            c21470hAo.ejfBZ.copydefault().setText(C33070mpX.AYXKKw(companion.KWHzl(companion.OLrzqt(djBIcL().KWHzl().DbNXlk()))));
            C55052xcf c55052xcf = c21470hAo.ejfBZ;
            c55052xcf.setOnClickListener(new Fragment(c55052xcf, 1000L, this));
            c21470hAo.getNewProxyInstance.setTransactionValueData("HOLDERS_HISTORY", new C25630jAn("", "", ""));
            LinearLayoutCompat linearLayoutCompat = c21470hAo.isConnected;
            linearLayoutCompat.setOnClickListener(new PendingIntent(linearLayoutCompat, 1000L, this, c21470hAo));
        }
    }

    public static final class Dialog implements Function1<C55276xgr, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            copydefault(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void copydefault(C55276xgr c55276xgr) {
            java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
            TxType txType = objOLrzqt instanceof TxType ? (TxType) objOLrzqt : null;
            if (txType == null) {
                txType = TxType.ALL;
            }
            jZE.this.KWHzl(txType);
        }
    }

    public static final class FragmentManager implements Function0<Unit> {
        public static final FragmentManager copydefault = new FragmentManager();

        public final void EZpvd() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(boolean z) {
        C21470hAo c21470hAo = this.copydefault;
        if (c21470hAo != null) {
            c21470hAo.AYXKKw.setImageDrawable(ContextCompat.getDrawable(c21470hAo.getRoot().getContext(), z ? C52761wXj.TaskDescription.OxVOHk : C52761wXj.TaskDescription.OJuSTm));
            RecyclerView recyclerView = c21470hAo.values;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(z ? 0 : 8);
        }
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(jZP jzp, Continuation<? super Unit> continuation) {
            jZE.this.OLrzqt(jzp);
            if (!jzp.AYXKKw() && jzp.valueOf() != null) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jZE.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            if (!jzp.AYXKKw() && jzp.EZpvd() != null) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jZE.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void gEmmrt() {
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().OLrzqt(), null, new StateListAnimator(), 2, null);
        AYXKKw().OLrzqt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.jZJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jZE.OLrzqt(this.copydefault, (java.lang.Long) obj);
            }
        }));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jZE KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, jZE jze) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = jze;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.KWHzl();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ jZE EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, jZE jze) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = jze;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TxType txTypeOLrzqt = TxType.Companion.OLrzqt(this.EZpvd.djBIcL().KWHzl().DbNXlk());
                java.util.List<TxType> listGEmmrt = yDY.gEmmrt(TxType.ALL, TxType.BUY, TxType.SELL);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
                for (TxType txType : listGEmmrt) {
                    arrayList.add(new C55276xgr(C33070mpX.AYXKKw(TxType.Companion.KWHzl(txType)), txType, null, txType == txTypeOLrzqt, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                }
                this.EZpvd.AEQbTJ();
                C25247itC c25247itCNewInstance$default = C25247itC.Application.newInstance$default(C25247itC.Companion, arrayList, null, true, 0, 10, null);
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                java.lang.String name = C25247itC.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                c25247itCNewInstance$default.AEQbTJ(childFragmentManager, name, this.EZpvd.new Dialog(), FragmentManager.copydefault);
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ jZE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, jZE jze) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = jze;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C21470hAo KWHzl;
        public final /* synthetic */ jZE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, jZE jze, C21470hAo c21470hAo) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = jze;
            this.KWHzl = c21470hAo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                jZE jze = this.copydefault;
                RecyclerView recyclerView = this.KWHzl.values;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                jze.KWHzl(!(recyclerView.getVisibility() == 0));
            }
        }
    }

    public static final Unit OLrzqt(jZE jze, java.lang.Long l) {
        if (jze.djBIcL().OLrzqt().getValue().AYXKKw()) {
            return Unit.INSTANCE;
        }
        if (l != null) {
            l.longValue();
            jze.djBIcL().gEmmrt();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(jZP jzp) {
        C21470hAo c21470hAo = this.copydefault;
        if (c21470hAo != null) {
            LinearLayoutCompat linearLayoutCompat = c21470hAo.AhwBna;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            java.util.List<C26277jYm> listCopydefault = jzp.copydefault();
            linearLayoutCompat.setVisibility((listCopydefault == null || !(listCopydefault.isEmpty() ^ true)) ? 8 : 0);
            C55052xcf c55052xcf = c21470hAo.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55052xcf, "");
            c55052xcf.setVisibility(jzp.EZpvd() == null ? 0 : 8);
            final HolderDetailsUiModel holderDetailsUiModelValueOf = jzp.valueOf();
            if (holderDetailsUiModelValueOf != null) {
                copydefault(holderDetailsUiModelValueOf.OLrzqt());
                C28431kae c28431kae = c21470hAo.copydefault;
                HolderDetailModel holderDetailModelOLrzqt = holderDetailsUiModelValueOf.OLrzqt();
                java.lang.String strAEQbTJ = AYXKKw().AEQbTJ(holderDetailsUiModelValueOf.OLrzqt().valueOf());
                c28431kae.setData(holderDetailModelOLrzqt.EZpvd((268402687 & 1) != 0 ? holderDetailModelOLrzqt.uzCIH : AhwBna().AYXKKw(), (268402687 & 2) != 0 ? holderDetailModelOLrzqt.AEQbTJ : null, (268402687 & 4) != 0 ? holderDetailModelOLrzqt.wlaJM : null, (268402687 & 8) != 0 ? holderDetailModelOLrzqt.DbNXlk : null, (268402687 & 16) != 0 ? holderDetailModelOLrzqt.AYXKKw : null, (268402687 & 32) != 0 ? holderDetailModelOLrzqt.isConnected : null, (268402687 & 64) != 0 ? holderDetailModelOLrzqt.AkhnZx : null, (268402687 & 128) != 0 ? holderDetailModelOLrzqt.AhwBna : null, (268402687 & 256) != 0 ? holderDetailModelOLrzqt.gEmmrt : null, (268402687 & 512) != 0 ? holderDetailModelOLrzqt.djBIcL : null, (268402687 & 1024) != 0 ? holderDetailModelOLrzqt.valueOf : null, (268402687 & 2048) != 0 ? holderDetailModelOLrzqt.fJNWhG : false, (268402687 & 4096) != 0 ? holderDetailModelOLrzqt.ejfBZ : false, (268402687 & 8192) != 0 ? holderDetailModelOLrzqt.iwGUEr : null, (268402687 & 16384) != 0 ? holderDetailModelOLrzqt.OLrzqt : null, (268402687 & 32768) != 0 ? holderDetailModelOLrzqt.AuCTel : false, (268402687 & 65536) != 0 ? holderDetailModelOLrzqt.KWHzl : strAEQbTJ == null ? "" : strAEQbTJ, (268402687 & 131072) != 0 ? holderDetailModelOLrzqt.hDKMBd : null, (268402687 & 262144) != 0 ? holderDetailModelOLrzqt.getNewProxyInstance : null, (268402687 & 524288) != 0 ? holderDetailModelOLrzqt.AubY : null, (268402687 & 1048576) != 0 ? holderDetailModelOLrzqt.zLjUOn : null, (268402687 & 2097152) != 0 ? holderDetailModelOLrzqt.fIwbmz : null, (268402687 & 4194304) != 0 ? holderDetailModelOLrzqt.fARcdN : null, (268402687 & 8388608) != 0 ? holderDetailModelOLrzqt.fetchVPNInfo : null, (268402687 & 16777216) != 0 ? holderDetailModelOLrzqt.values : null, (268402687 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? holderDetailModelOLrzqt.getFieldNames : null, (268402687 & 67108864) != 0 ? holderDetailModelOLrzqt.copydefault : null, (268402687 & 134217728) != 0 ? holderDetailModelOLrzqt.EZpvd : null), new Function0() { // from class: o.jZK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jZE.AhwBna(this.KWHzl);
                    }
                }, new Function1() { // from class: o.jZH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return jZE.copydefault(this.AEQbTJ, (java.util.List) obj);
                    }
                });
                this.OLrzqt.submitList(holderDetailsUiModelValueOf.OLrzqt(AhwBna().fetchVPNInfo(), AhwBna().djBIcL(), AhwBna().values()));
                c21470hAo.KWHzl.setupActions(new Function0() { // from class: o.jZI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jZE.AEQbTJ(this.KWHzl, holderDetailsUiModelValueOf);
                    }
                }, new Function0() { // from class: o.jZM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jZE.copydefault(this.copydefault, holderDetailsUiModelValueOf);
                    }
                }, new Function0() { // from class: o.jZO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jZE.djBIcL(this.copydefault, holderDetailsUiModelValueOf);
                    }
                });
                c21470hAo.KWHzl.setState(holderDetailsUiModelValueOf.OLrzqt().getNewProxyInstance());
                OLrzqt(holderDetailsUiModelValueOf.AYXKKw());
            }
        }
    }

    public static final Unit AhwBna(jZE jze) {
        InterfaceC26310jZs interfaceC26310jZs = jze.AEQbTJ;
        if (interfaceC26310jZs != null) {
            interfaceC26310jZs.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(jZE jze, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C21951hSj.Companion.EZpvd(new HolderInfoParams(jze.AhwBna().djBIcL(), "DEXMarket_Token_Holders_AddressLabel_View", list)).show(jze.getChildFragmentManager(), C56524yIo.AEQbTJ(C21951hSj.class).valueOf());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(jZE jze, HolderDetailsUiModel holderDetailsUiModel) {
        InterfaceC26310jZs interfaceC26310jZs = jze.AEQbTJ;
        if (interfaceC26310jZs != null) {
            interfaceC26310jZs.OLrzqt(holderDetailsUiModel.OLrzqt().valueOf(), jze.djBIcL().KWHzl().KWHzl());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(jZE jze, HolderDetailsUiModel holderDetailsUiModel) {
        LifecycleOwner viewLifecycleOwner = jze.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HolderDetailsHeaderFragment$handleHeaderUiState$1$1$4$1(jze, holderDetailsUiModel, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(jZE jze, HolderDetailsUiModel holderDetailsUiModel) {
        java.lang.String strAEQbTJ = jze.AYXKKw().AEQbTJ(holderDetailsUiModel.OLrzqt().valueOf());
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        LifecycleOwner viewLifecycleOwner = jze.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HolderDetailsHeaderFragment$handleHeaderUiState$1$1$5$1(jze, holderDetailsUiModel, strAEQbTJ, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(HolderDetailModel holderDetailModel) {
        int i;
        int i2;
        C21470hAo c21470hAo = this.copydefault;
        if (c21470hAo != null) {
            android.widget.TextView textView = c21470hAo.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            AccountDetail accountDetailValues = AhwBna().values();
            AccountDetail accountDetail = AccountDetail.HOLDER_DETAIL;
            textView.setVisibility(accountDetailValues == accountDetail ? 0 : 8);
            android.widget.TextView textView2 = c21470hAo.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(AhwBna().values() == accountDetail ? 0 : 8);
            c21470hAo.fetchVPNInfo.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, holderDetailModel.gEmmrt(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            java.lang.String strFJNWhG = holderDetailModel.fJNWhG();
            java.lang.String strKWHzl = C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) strFJNWhG) ? kLY.formatPercentage$default(strFJNWhG, DisplaySign.EXCEPT_ZERO, false, null, null, 14, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.jZG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jZE.OLrzqt();
                }
            });
            java.lang.String strOLrzqt = kLY.OLrzqt(djBIcL().djBIcL(), holderDetailModel.AuCTel(), holderDetailModel.DbNXlk(), AhwBna().gEmmrt());
            android.widget.TextView textView3 = c21470hAo.fARcdN;
            AccountDetail accountDetailValues2 = AhwBna().values();
            int[] iArr = Activity.KWHzl;
            int i3 = iArr[accountDetailValues2.ordinal()];
            if (i3 == 1) {
                i = C52761wXj.LoaderManager.zuBGHE;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C52761wXj.LoaderManager.AYXKKw;
            }
            textView3.setTextAppearance(i);
            textView3.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            android.widget.TextView textView4 = c21470hAo.fJNWhG;
            int i4 = iArr[AhwBna().values().ordinal()];
            if (i4 == 1) {
                i2 = C52761wXj.LoaderManager.zuBGHE;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C52761wXj.LoaderManager.gHZMYf;
            }
            textView4.setTextAppearance(i2);
            textView4.setText(strOLrzqt + " (" + strKWHzl + ")");
            android.content.Context context = c21470hAo.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView4.setTextColor(C25352ivB.EZpvd(context, holderDetailModel.AuCTel()));
        }
    }

    public final void KWHzl(TxType txType) {
        TokenFilter tokenFilterKWHzl = djBIcL().KWHzl();
        djBIcL().KWHzl(tokenFilterKWHzl.OLrzqt((6143 & 1) != 0 ? tokenFilterKWHzl.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterKWHzl.isConnected : null, (6143 & 4) != 0 ? tokenFilterKWHzl.AkhnZx : txType.getValue(), (6143 & 8) != 0 ? tokenFilterKWHzl.AhwBna : null, (6143 & 16) != 0 ? tokenFilterKWHzl.KWHzl : null, (6143 & 32) != 0 ? tokenFilterKWHzl.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterKWHzl.valueOf : false, (6143 & 128) != 0 ? tokenFilterKWHzl.EZpvd : null, (6143 & 256) != 0 ? tokenFilterKWHzl.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterKWHzl.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterKWHzl.copydefault : null, (6143 & 2048) != 0 ? tokenFilterKWHzl.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterKWHzl.fetchVPNInfo : null));
        C21470hAo c21470hAo = this.copydefault;
        if (c21470hAo != null) {
            c21470hAo.ejfBZ.copydefault().setText(C33070mpX.AYXKKw(TxType.Companion.KWHzl(txType)));
        }
    }

    private final void valueOf() {
        C21470hAo c21470hAo = this.copydefault;
        if (c21470hAo != null) {
            c21470hAo.uzCIH.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getDefaultViewModelProviderFactory));
            c21470hAo.uzCIH.setDefaultIndicator(null);
            OKSortTextView oKSortTextView = c21470hAo.uzCIH;
            OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
            OKSortTextView.setSortType$default(oKSortTextView, sortType, false, 2, null);
            c21470hAo.valueOf.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getDefaultViewModelCreationExtras));
            c21470hAo.valueOf.setDefaultIndicator(null);
            OKSortTextView.setSortType$default(c21470hAo.valueOf, sortType, false, 2, null);
            android.widget.LinearLayout linearLayout = c21470hAo.DbNXlk;
            linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, this));
            c21470hAo.djBIcL.setTag("icon.tag.calendar");
        }
    }

    public final void OLrzqt(HistoryStatistics historyStatistics) {
        C21470hAo c21470hAo = this.copydefault;
        if (c21470hAo != null) {
            C25630jAn c25630jAn = new C25630jAn(historyStatistics.AEQbTJ() + historyStatistics.valueOf(), historyStatistics.AEQbTJ(), historyStatistics.valueOf());
            hTG htg = c21470hAo.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(htg, "");
            int i = 0;
            if (!C33129mqd.AEQbTJ(c25630jAn.KWHzl(), 0) && !C33129mqd.AEQbTJ(c25630jAn.AEQbTJ(), 0)) {
                i = 8;
            }
            htg.setVisibility(i);
            c21470hAo.getNewProxyInstance.setTransactionValueData("HOLDERS_HISTORY", c25630jAn);
        }
    }

    public final void KWHzl() {
        kotlin.Pair pairOLrzqt;
        C21470hAo c21470hAo = this.copydefault;
        if (c21470hAo != null) {
            if (!Intrinsics.EZpvd(c21470hAo.djBIcL.getTag(), (java.lang.Object) "icon.tag.calendar")) {
                pairOLrzqt = C56390yDp.OLrzqt("icon.tag.calendar", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QSBOWP));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt("icon.tag.time", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UhxbNG));
            }
            java.lang.String str = (java.lang.String) pairOLrzqt.component1();
            int iIntValue = ((java.lang.Number) pairOLrzqt.component2()).intValue();
            c21470hAo.djBIcL.setTag(str);
            c21470hAo.djBIcL.setImageResource(iIntValue);
        }
        djBIcL().fetchVPNInfo();
    }

    public final void copydefault() {
        android.content.Context context = getContext();
        if (context != null) {
            C25352ivB.showOKDialogWithCallback$default(context, C33070mpX.AYXKKw(C23274hvD.Fragment.ComponentActivityApi33Impl), C33070mpX.AYXKKw(C23274hvD.Fragment.getOnBackInvokedDispatcher), C23274hvD.Fragment.gwwzsY, C33070mpX.AYXKKw(C23274hvD.Fragment.DTwDnp), null, new Function0() { // from class: o.jZF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jZE.isConnected(this.OLrzqt);
                }
            }, 16, null);
        }
    }

    public static final Unit isConnected(final jZE jze) {
        android.content.Context context = jze.getContext();
        if (context != null) {
            C25352ivB.KWHzl(context, C31256lqb.KWHzl(jze.djBIcL().OLrzqt().getValue().KWHzl(), (Function0<java.lang.String>) new Function0() { // from class: o.jZD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jZE.DbNXlk(this.AEQbTJ);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String DbNXlk(jZE jze) {
        return jze.AhwBna().OLrzqt();
    }

    public final void AEQbTJ() {
        C32866mlf.onEvent$default("DEXMarket_Token_Holders_Tnxs_View", (TrackChannel[]) null, new Function1() { // from class: o.jZC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jZE.KWHzl(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(jZE jze, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", jze.AhwBna().valueOf(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jZE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final jZE copydefault(@NotNull HolderDetailsParams holderDetailsParams, InterfaceC26310jZs interfaceC26310jZs) {
            Intrinsics.checkNotNullParameter(holderDetailsParams, "");
            jZE jze = new jZE();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("holder_detail", holderDetailsParams);
            jze.setArguments(bundle);
            jze.AEQbTJ = interfaceC26310jZs;
            return jze;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C21470hAo c21470hAo = this.copydefault;
        if (c21470hAo != null) {
            c21470hAo.values.setAdapter(null);
            c21470hAo.values.setLayoutManager(null);
            RecyclerView.ItemDecoration itemDecoration = this.KWHzl;
            if (itemDecoration != null) {
                c21470hAo.values.removeItemDecoration(itemDecoration);
            }
        }
        this.KWHzl = null;
        this.copydefault = null;
        super.onDestroyView();
    }
}
