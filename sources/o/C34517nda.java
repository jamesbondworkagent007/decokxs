package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.position.ui.PositionsViewModel;
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
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nda, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34517nda extends AbstractC34463ncZ {
    public C36060oNu AYXKKw;
    public final float djBIcL = 0.9f;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.djBIcL;
    }

    public C34517nda() {
        final Function0 function0 = new Function0() { // from class: o.ndb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34517nda.valueOf(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.position.ui.recent_transactions.RecentTransactionsBottomSheet$special$$inlined$viewModels$default$1
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PositionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.position.ui.recent_transactions.RecentTransactionsBottomSheet$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.position.ui.recent_transactions.RecentTransactionsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.position.ui.recent_transactions.RecentTransactionsBottomSheet$special$$inlined$viewModels$default$4
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ncX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34517nda.djBIcL(this.copydefault);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PositionsViewModel djBIcL() {
        return (PositionsViewModel) this.valueOf.getValue();
    }

    public static final ViewModelStoreOwner valueOf(C34517nda c34517nda) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c34517nda.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX DEBUG: Possible override for method o.ncZ.AEQbTJ()V */
    public final C34478nco AEQbTJ() {
        return (C34478nco) this.gEmmrt.getValue();
    }

    public static final Unit EZpvd(C34517nda c34517nda, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c34517nda.KWHzl(str);
        return Unit.INSTANCE;
    }

    public static final C34478nco djBIcL(final C34517nda c34517nda) {
        return new C34478nco(new Function1() { // from class: o.ndc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34517nda.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.ndd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34517nda.EZpvd((java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.dbwnZN));
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
        wxq.EZpvd().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = C36060oNu.EZpvd(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        valueOf();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        mUN.collectOnViewLifecycle$default(this, djBIcL().fetchVPNInfo(), null, new StateListAnimator(), 2, null);
        PositionsViewModel.loadRecentTransactions$default(djBIcL(), 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.nda$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C34455ncR c34455ncR, Continuation<? super Unit> continuation) {
            C34517nda.this.AEQbTJ(c34455ncR);
            return Unit.INSTANCE;
        }
    }

    private final void valueOf() {
        displayTransactionOptions$default(this, null, 1, null);
        gEmmrt();
        C36060oNu c36060oNu = this.AYXKKw;
        if (c36060oNu != null) {
            RecyclerView recyclerView = c36060oNu.gEmmrt;
            recyclerView.setAdapter(AEQbTJ());
            recyclerView.setItemAnimator(null);
            recyclerView.addOnScrollListener(new TaskDescription());
        }
    }

    /* JADX INFO: renamed from: o.nda$TaskDescription */
    public static final class TaskDescription extends RecyclerView.OnScrollListener {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            int itemCount = C34517nda.this.AEQbTJ().getItemCount();
            boolean z = C34517nda.this.djBIcL().fetchVPNInfo().getValue().EZpvd() || C34517nda.this.djBIcL().fetchVPNInfo().getValue().AYXKKw();
            if (!C34517nda.this.djBIcL().fetchVPNInfo().getValue().OLrzqt() || z || itemCount <= 0 || itemCount > iFindLastVisibleItemPosition + 4) {
                return;
            }
            C34517nda.this.AhwBna();
        }
    }

    private final void gEmmrt() {
        C36060oNu c36060oNu = this.AYXKKw;
        if (c36060oNu != null) {
            OKSortTextView oKSortTextView = c36060oNu.KWHzl;
            oKSortTextView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialROgMPW));
            oKSortTextView.setDefaultIndicator(null);
            oKSortTextView.setOnClickListener(new ActionBar(oKSortTextView, 1000L, c36060oNu));
            oKSortTextView.setOnSortTypeChangeListener(new Function2() { // from class: o.ndg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C34517nda.KWHzl(this.copydefault, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                }
            });
            OKSortTextView oKSortTextView2 = c36060oNu.AEQbTJ;
            oKSortTextView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DxnCrt));
            oKSortTextView2.setDefaultIndicator(null);
            OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
            OKSortTextView.setSortType$default(oKSortTextView2, sortType, false, 2, null);
            OKSortTextView oKSortTextView3 = c36060oNu.EZpvd;
            oKSortTextView3.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.dIjzlO));
            oKSortTextView3.setDefaultIndicator(null);
            OKSortTextView.setSortType$default(oKSortTextView3, sortType, false, 2, null);
        }
    }

    public static final Unit KWHzl(C34517nda c34517nda, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c34517nda.djBIcL().KWHzl(sortType == OKSortTextView.SortType.DOWN);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void displayTransactionOptions$default(C34517nda c34517nda, TxType txType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            txType = TxType.ALL;
        }
        c34517nda.copydefault(txType);
    }

    public final void copydefault(TxType txType) {
        C36060oNu c36060oNu = this.AYXKKw;
        if (c36060oNu != null) {
            c36060oNu.copydefault.removeAllViews();
            TxType[] txTypeArrValues = TxType.values();
            int length = txTypeArrValues.length;
            for (int i = 0; i < length; i++) {
                TxType txType2 = txTypeArrValues[i];
                boolean z = txType2 == txType;
                android.content.Context context = c36060oNu.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C54989xbV c54989xbVEZpvd = EZpvd(context, txType2, z);
                LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
                C55296xhK.margin$default(c54989xbVEZpvd, null, null, null, null, 15, null);
                c36060oNu.copydefault.addView(c54989xbVEZpvd, layoutParams);
                c54989xbVEZpvd.setOnClickListener(new Activity(c54989xbVEZpvd, 1000L, this, txType2));
            }
        }
    }

    public static /* synthetic */ void setSelection$default(C34517nda c34517nda, TxType txType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            txType = TxType.ALL;
        }
        c34517nda.EZpvd(txType);
    }

    public final void EZpvd(@NotNull TxType txType) {
        Intrinsics.checkNotNullParameter(txType, "");
        copydefault(txType);
    }

    public final C54989xbV EZpvd(android.content.Context context, TxType txType, boolean z) {
        C54989xbV c54989xbV = new C54989xbV(context, null, 0, 6, null);
        c54989xbV.setStyle(1);
        c54989xbV.setOKDSSize(-6);
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        C55296xhK.OLrzqt(c54989xbV, fValueOf, fValueOf, java.lang.Float.valueOf(8.0f), fValueOf);
        c54989xbV.setSelected(z);
        c54989xbV.EZpvd().setText(C34476ncm.Companion.copydefault(txType));
        return c54989xbV;
    }

    /* JADX INFO: renamed from: o.nda$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C36060oNu KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C36060oNu c36060oNu) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c36060oNu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                OKSortTextView.SortType sortTypeAEQbTJ = this.KWHzl.KWHzl.AEQbTJ();
                OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
                if (sortTypeAEQbTJ == sortType) {
                    sortType = OKSortTextView.SortType.UP;
                }
                OKSortTextView.setSortType$default(this.KWHzl.KWHzl, sortType, false, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.nda$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C34517nda EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ TxType OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C34517nda c34517nda, TxType txType) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c34517nda;
            this.OLrzqt = txType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TokenFilter tokenFilterEZpvd = this.EZpvd.djBIcL().EZpvd();
                TokenFilter tokenFilterAEQbTJ = tokenFilterEZpvd.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd.DbNXlk : this.OLrzqt.getValue(), (15359 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (15359 & 16) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterEZpvd.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (15359 & 256) != 0 ? tokenFilterEZpvd.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterEZpvd.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterEZpvd.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd.AkhnZx : null);
                this.EZpvd.EZpvd(this.OLrzqt);
                this.EZpvd.djBIcL().AEQbTJ(tokenFilterAEQbTJ);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        C34462ncY c34462ncY = (C34462ncY) CollectionsKt___CollectionsKt.wlaJM(djBIcL().fetchVPNInfo().getValue().copydefault());
        if (c34462ncY != null) {
            long jOLrzqt = c34462ncY.OLrzqt();
            AEQbTJ().submitList(djBIcL().fetchVPNInfo().getValue().copydefault());
            djBIcL().EZpvd(jOLrzqt);
        }
    }

    public final void AEQbTJ(C34455ncR c34455ncR) {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        RecyclerView recyclerView;
        LinearLayoutCompat linearLayoutCompat;
        if (c34455ncR.AEQbTJ()) {
            AYXKKw();
        }
        if (c34455ncR.EZpvd() || c34455ncR.AYXKKw() || c34455ncR.KWHzl() != null) {
            return;
        }
        C36060oNu c36060oNu = this.AYXKKw;
        if (c36060oNu != null && (linearLayoutCompat = c36060oNu.valueOf) != null) {
            linearLayoutCompat.setVisibility(c34455ncR.copydefault().isEmpty() ^ true ? 0 : 8);
        }
        C36060oNu c36060oNu2 = this.AYXKKw;
        if (c36060oNu2 != null && (recyclerView = c36060oNu2.gEmmrt) != null) {
            recyclerView.setVisibility(c34455ncR.copydefault().isEmpty() ^ true ? 0 : 8);
        }
        C36060oNu c36060oNu3 = this.AYXKKw;
        if (c36060oNu3 != null && (c55173xeu2 = c36060oNu3.OLrzqt) != null) {
            c55173xeu2.setVisibility(c34455ncR.copydefault().isEmpty() ? 0 : 8);
        }
        if (!c34455ncR.copydefault().isEmpty()) {
            AEQbTJ().submitList(c34455ncR.copydefault());
            return;
        }
        C36060oNu c36060oNu4 = this.AYXKKw;
        if (c36060oNu4 == null || (c55173xeu = c36060oNu4.OLrzqt) == null) {
            return;
        }
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.aCSzUz));
        c55173xeu.setSubTitle((java.lang.CharSequence) "");
        c55173xeu.setRetry("");
    }

    private final void AYXKKw() {
        java.util.List<C34462ncY> currentList = AEQbTJ().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        AEQbTJ().submitList(currentList);
    }

    private final void KWHzl(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        mUO.AEQbTJ(contextRequireContext, "", str, C35964oKf.Fragment.DcMfJKDDUqPf);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        djBIcL().AEQbTJ(djBIcL().gEmmrt());
    }

    /* JADX INFO: renamed from: o.nda$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nda.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C34517nda AEQbTJ() {
            android.os.Bundle bundle = new android.os.Bundle();
            C34517nda c34517nda = new C34517nda();
            c34517nda.setArguments(bundle);
            return c34517nda;
        }
    }
}
