package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import com.okinc.business.market.features.position.ui.PositionsViewModel;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29188kot extends AbstractC29181kom {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C23472hyq djBIcL;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.valueOf;
    }

    public C29188kot() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.position.ui.recent_transactions.RecentTransactionsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.position.ui.recent_transactions.RecentTransactionsBottomSheet$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PositionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.position.ui.recent_transactions.RecentTransactionsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.position.ui.recent_transactions.RecentTransactionsBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.position.ui.recent_transactions.RecentTransactionsBottomSheet$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.kos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29188kot.EZpvd(this.AEQbTJ);
            }
        });
        this.valueOf = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PositionsViewModel AhwBna() {
        return (PositionsViewModel) this.AhwBna.getValue();
    }

    /* JADX DEBUG: Possible override for method o.kom.OLrzqt()V */
    public final C29094knE OLrzqt() {
        return (C29094knE) this.AYXKKw.getValue();
    }

    public static final Unit EZpvd(C29188kot c29188kot, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c29188kot.KWHzl(str);
        return Unit.INSTANCE;
    }

    public static final C29094knE EZpvd(final C29188kot c29188kot) {
        return new C29094knE(new Function1() { // from class: o.kou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29188kot.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.kow
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29188kot.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        }, c29188kot.AhwBna().isConnected().getValue().booleanValue());
    }

    public static final Unit copydefault(C29188kot c29188kot, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25352ivB.KWHzl(c29188kot.requireContext(), str);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.ComponentActivityReportFullyDrawnExecutor));
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
        wxq.EZpvd().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = C23472hyq.EZpvd(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        valueOf();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().fetchVPNInfo(), null, new TaskDescription(), 2, null);
        PositionsViewModel.loadRecentTransactions$default(AhwBna(), 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.kot$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29176koh c29176koh, Continuation<? super Unit> continuation) {
            C29188kot.this.EZpvd(c29176koh);
            return Unit.INSTANCE;
        }
    }

    public final void valueOf() {
        displayTransactionOptions$default(this, null, 1, null);
        djBIcL();
        C23472hyq c23472hyq = this.djBIcL;
        if (c23472hyq != null) {
            RecyclerView recyclerView = c23472hyq.valueOf;
            recyclerView.setAdapter(OLrzqt());
            recyclerView.setItemAnimator(null);
            recyclerView.addOnScrollListener(new Application());
        }
    }

    /* JADX INFO: renamed from: o.kot$Application */
    public static final class Application extends RecyclerView.OnScrollListener {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            int itemCount = C29188kot.this.OLrzqt().getItemCount();
            boolean z = C29188kot.this.AhwBna().fetchVPNInfo().getValue().OLrzqt() || C29188kot.this.AhwBna().fetchVPNInfo().getValue().AhwBna();
            if (!C29188kot.this.AhwBna().fetchVPNInfo().getValue().KWHzl() || z || itemCount <= 0 || itemCount > iFindLastVisibleItemPosition + 4) {
                return;
            }
            C29188kot.this.gEmmrt();
        }
    }

    private final void djBIcL() {
        C23472hyq c23472hyq = this.djBIcL;
        if (c23472hyq != null) {
            OKSortTextView oKSortTextView = c23472hyq.AhwBna;
            oKSortTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.Zpvmxu));
            oKSortTextView.setDefaultIndicator(null);
            oKSortTextView.setOnClickListener(new Activity(oKSortTextView, 1000L, c23472hyq));
            oKSortTextView.setOnSortTypeChangeListener(new Function2() { // from class: o.kor
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29188kot.copydefault(this.AEQbTJ, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                }
            });
            OKSortTextView oKSortTextView2 = c23472hyq.OLrzqt;
            oKSortTextView2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.registerForActivityResult));
            oKSortTextView2.setDefaultIndicator(null);
            OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
            OKSortTextView.setSortType$default(oKSortTextView2, sortType, false, 2, null);
            OKSortTextView oKSortTextView3 = c23472hyq.copydefault;
            oKSortTextView3.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getDefaultImpl));
            oKSortTextView3.setDefaultIndicator(null);
            OKSortTextView.setSortType$default(oKSortTextView3, sortType, false, 2, null);
        }
    }

    public static final Unit copydefault(C29188kot c29188kot, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c29188kot.AhwBna().KWHzl(sortType == OKSortTextView.SortType.DOWN);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void displayTransactionOptions$default(C29188kot c29188kot, TxType txType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            txType = TxType.ALL;
        }
        c29188kot.AEQbTJ(txType);
    }

    public final void AEQbTJ(TxType txType) {
        C23472hyq c23472hyq = this.djBIcL;
        if (c23472hyq != null) {
            c23472hyq.AEQbTJ.removeAllViews();
            TxType[] txTypeArrValues = TxType.values();
            int length = txTypeArrValues.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                TxType txType2 = txTypeArrValues[i];
                boolean z = txType2 == txType;
                android.content.Context context = c23472hyq.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C54989xbV c54989xbVKWHzl = KWHzl(context, txType2, z);
                LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
                layoutParams.setMarginEnd(C55298xhM.dp2px$default(8.0f, null, 1, null));
                c23472hyq.AEQbTJ.addView(c54989xbVKWHzl, layoutParams);
                c54989xbVKWHzl.setOnClickListener(new StateListAnimator(c54989xbVKWHzl, 1000L, i2, c23472hyq, this, txType2));
                i++;
                i2++;
            }
        }
    }

    public static /* synthetic */ void setSelection$default(C29188kot c29188kot, TxType txType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            txType = TxType.ALL;
        }
        c29188kot.OLrzqt(txType);
    }

    public final void OLrzqt(@NotNull TxType txType) {
        Intrinsics.checkNotNullParameter(txType, "");
        AEQbTJ(txType);
    }

    /* JADX INFO: renamed from: o.kot$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C23472hyq EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C23472hyq c23472hyq) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c23472hyq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                OKSortTextView.SortType sortTypeAEQbTJ = this.EZpvd.AhwBna.AEQbTJ();
                OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
                if (sortTypeAEQbTJ == sortType) {
                    sortType = OKSortTextView.SortType.UP;
                }
                OKSortTextView.setSortType$default(this.EZpvd.AhwBna, sortType, false, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kot$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C23472hyq KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ TxType copydefault;
        public final /* synthetic */ C29188kot djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, int i, C23472hyq c23472hyq, C29188kot c29188kot, TxType txType) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = i;
            this.KWHzl = c23472hyq;
            this.djBIcL = c29188kot;
            this.copydefault = txType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C43246rlf c43246rlf = C43246rlf.OLrzqt;
                int i = C55296xhK.OLrzqt(c43246rlf.valueOf()) ? 66 : 17;
                int i2 = C55296xhK.OLrzqt(c43246rlf.valueOf()) ? 17 : 66;
                int i3 = this.OLrzqt;
                if (i3 == 0) {
                    this.KWHzl.KWHzl.fullScroll(i);
                } else if (i3 == TxType.getEntries().size() - 1) {
                    this.KWHzl.KWHzl.fullScroll(i2);
                }
                TokenFilter tokenFilterAEQbTJ = this.djBIcL.AhwBna().AEQbTJ();
                TokenFilter tokenFilterOLrzqt = tokenFilterAEQbTJ.OLrzqt((6143 & 1) != 0 ? tokenFilterAEQbTJ.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterAEQbTJ.isConnected : null, (6143 & 4) != 0 ? tokenFilterAEQbTJ.AkhnZx : this.copydefault.getValue(), (6143 & 8) != 0 ? tokenFilterAEQbTJ.AhwBna : null, (6143 & 16) != 0 ? tokenFilterAEQbTJ.KWHzl : null, (6143 & 32) != 0 ? tokenFilterAEQbTJ.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterAEQbTJ.valueOf : false, (6143 & 128) != 0 ? tokenFilterAEQbTJ.EZpvd : null, (6143 & 256) != 0 ? tokenFilterAEQbTJ.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterAEQbTJ.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterAEQbTJ.copydefault : null, (6143 & 2048) != 0 ? tokenFilterAEQbTJ.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterAEQbTJ.fetchVPNInfo : null);
                this.djBIcL.OLrzqt(this.copydefault);
                this.djBIcL.AhwBna().AEQbTJ(tokenFilterOLrzqt);
            }
        }
    }

    public final C54989xbV KWHzl(android.content.Context context, TxType txType, boolean z) {
        C54989xbV c54989xbV = new C54989xbV(context, null, 0, 6, null);
        c54989xbV.setStyle(2);
        c54989xbV.setOKDSSize(-20);
        c54989xbV.setSelected(z);
        c54989xbV.EZpvd().setText(C29137knv.Companion.OLrzqt(txType));
        return c54989xbV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        C29182kon c29182kon;
        java.util.List<C29182kon> listCopydefault = AhwBna().fetchVPNInfo().getValue().copydefault();
        if (listCopydefault == null || (c29182kon = (C29182kon) CollectionsKt___CollectionsKt.wlaJM(listCopydefault)) == null) {
            return;
        }
        long jKWHzl = c29182kon.KWHzl();
        OLrzqt().submitList(AhwBna().fetchVPNInfo().getValue().copydefault());
        AhwBna().OLrzqt(jKWHzl);
    }

    public final void EZpvd(C29176koh c29176koh) {
        C23472hyq c23472hyq;
        java.util.List<C29182kon> listCopydefault;
        if (c29176koh.EZpvd()) {
            DbNXlk();
        }
        if (c29176koh.AhwBna() || (c23472hyq = this.djBIcL) == null) {
            return;
        }
        C55113xdn c55113xdn = c23472hyq.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(c29176koh.OLrzqt() ? 0 : 8);
        C55173xeu c55173xeu = c23472hyq.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility((c29176koh.AEQbTJ() != null || ((listCopydefault = c29176koh.copydefault()) != null && listCopydefault.isEmpty())) ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = c23472hyq.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        java.util.List<C29182kon> listCopydefault2 = c29176koh.copydefault();
        linearLayoutCompat.setVisibility((listCopydefault2 == null || !(listCopydefault2.isEmpty() ^ true)) ? 8 : 0);
        RecyclerView recyclerView = c23472hyq.valueOf;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        java.util.List<C29182kon> listCopydefault3 = c29176koh.copydefault();
        recyclerView.setVisibility((listCopydefault3 == null || !(listCopydefault3.isEmpty() ^ true)) ? 8 : 0);
        if (c29176koh.copydefault() != null && (!r0.isEmpty())) {
            OLrzqt().submitList(c29176koh.copydefault());
        } else {
            AYXKKw();
        }
        if (c29176koh.AEQbTJ() != null) {
            isConnected();
        }
    }

    private final void AYXKKw() {
        C55173xeu c55173xeu;
        C23472hyq c23472hyq = this.djBIcL;
        if (c23472hyq == null || (c55173xeu = c23472hyq.EZpvd) == null) {
            return;
        }
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.sendSocketRequest));
        c55173xeu.setSubTitle((java.lang.CharSequence) "");
        c55173xeu.setRetry("");
    }

    private final void isConnected() {
        C55173xeu c55173xeu;
        C23472hyq c23472hyq = this.djBIcL;
        if (c23472hyq == null || (c55173xeu = c23472hyq.EZpvd) == null) {
            return;
        }
        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
        c55173xeu.setEmptyTypeImage(8);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29188kot.AEQbTJ(this.OLrzqt, view);
            }
        });
    }

    public static final void AEQbTJ(C29188kot c29188kot, android.view.View view) {
        PositionsViewModel.loadRecentTransactions$default(c29188kot.AhwBna(), 0L, 1, null);
    }

    private final void DbNXlk() {
        java.util.List<C29182kon> currentList = OLrzqt().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        OLrzqt().submitList(currentList);
    }

    private final void KWHzl(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C25352ivB.OLrzqt(contextRequireContext, "", str, C23274hvD.Fragment.buildRccMetadata);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        AhwBna().AEQbTJ(AhwBna().EZpvd());
    }

    /* JADX INFO: renamed from: o.kot$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kot.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C29188kot copydefault(PositionDetailsParam positionDetailsParam) {
            C29188kot c29188kot = new C29188kot();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.position_details", positionDetailsParam);
            c29188kot.setArguments(bundle);
            return c29188kot;
        }
    }
}
