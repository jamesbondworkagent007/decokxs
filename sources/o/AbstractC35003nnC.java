package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.viewmodel.NewCoinRankingViewModel;
import com.okinc.unify_find.viewmodel.RankModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27808kEb;
import o.oKA;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nnC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35003nnC extends AbstractC34904nlJ implements mAS {
    public final int fIwbmz;
    public final InterfaceC56387yDm getFieldNames;
    public qZX uzCIH;
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.nnF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC35003nnC.KWHzl(this.copydefault);
        }
    });
    public final InterfaceC56387yDm iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.nnB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC35003nnC.AEQbTJ(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.nnC$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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
    @Override // o.AbstractC34904nlJ
    public java.lang.String AkhnZx() {
        return "Opportunity_Rank_New";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qZX AubY() {
        return this.uzCIH;
    }

    public abstract C59534zip AxsJAY();

    public abstract C59534zip copydefault();

    @Override // o.AbstractC34904nlJ
    public boolean fJNWhG() {
        return true;
    }

    public void gHZMYf() {
    }

    @Override // o.AbstractC34904nlJ
    public void getFieldNames() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.zsXlph;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int zsXlph() {
        return this.fIwbmz;
    }

    public abstract void zuBGHE();

    public AbstractC35003nnC() {
        final Activity activity = new Activity(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.find_ui.ranking.newcoin.home.sub.BaseMarketHomeNewCoinFragment$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) activity.invoke();
            }
        });
        final Function0 function0 = null;
        this.getFieldNames = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NewCoinRankingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.find_ui.ranking.newcoin.home.sub.BaseMarketHomeNewCoinFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.find_ui.ranking.newcoin.home.sub.BaseMarketHomeNewCoinFragment$special$$inlined$parentViewModels$4
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.find_ui.ranking.newcoin.home.sub.BaseMarketHomeNewCoinFragment$special$$inlined$parentViewModels$5
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
        this.fIwbmz = qZH.ActionBar.gVEiQJ;
    }

    public static final C59534zip KWHzl(AbstractC35003nnC abstractC35003nnC) {
        return abstractC35003nnC.AxsJAY();
    }

    public final C59534zip AuCTelauCTel() {
        return (C59534zip) this.AuCTel.getValue();
    }

    public static final C59534zip AEQbTJ(AbstractC35003nnC abstractC35003nnC) {
        return abstractC35003nnC.copydefault();
    }

    public final C59534zip zLjUOn() {
        return (C59534zip) this.iwGUEr.getValue();
    }

    public final NewCoinRankingViewModel wlaJM() {
        return (NewCoinRankingViewModel) this.getFieldNames.getValue();
    }

    @Override // o.AbstractC34904nlJ, o.AbstractC27793kDo, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        qZX qzxEZpvd = qZX.EZpvd(view);
        this.uzCIH = qzxEZpvd;
        if (qzxEZpvd != null && (frameLayout2 = qzxEZpvd.copydefault) != null) {
            frameLayout2.setVisibility(8);
        }
        qZX qzx = this.uzCIH;
        if (qzx != null && (frameLayout = qzx.OLrzqt) != null) {
            frameLayout.setVisibility(8);
        }
        AEQbTJ();
    }

    private final void KWHzl() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        qZX qzx = this.uzCIH;
        if (qzx != null && (recyclerView2 = qzx.KWHzl) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        qZX qzx2 = this.uzCIH;
        if (qzx2 == null || (recyclerView = qzx2.KWHzl) == null) {
            return;
        }
        recyclerView.setAdapter(zLjUOn());
    }

    private final void AEQbTJ() {
        MutableLiveData<java.lang.Boolean> mutableLiveDataEjfBZ;
        wlaJM().AEQbTJ().observe(this, new ActionBar(new Function1() { // from class: o.nnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC35003nnC.KWHzl(this.EZpvd, (Unit) obj);
            }
        }));
        RankModel rankModelFIwbmz = fIwbmz();
        if (rankModelFIwbmz != null && (mutableLiveDataEjfBZ = rankModelFIwbmz.ejfBZ()) != null) {
            mutableLiveDataEjfBZ.observe(this, new ActionBar(new Function1() { // from class: o.nnG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC35003nnC.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
                }
            }));
        }
        zuBGHE();
    }

    public static final Unit KWHzl(final AbstractC35003nnC abstractC35003nnC, Unit unit) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        qZX qzx = abstractC35003nnC.uzCIH;
        if (((qzx == null || (recyclerView2 = qzx.KWHzl) == null) ? null : recyclerView2.getAdapter()) == null) {
            abstractC35003nnC.KWHzl();
        }
        abstractC35003nnC.EZpvd(false);
        C59534zip c59534zipAuCTelauCTel = abstractC35003nnC.AuCTelauCTel();
        if (c59534zipAuCTelauCTel != null) {
            c59534zipAuCTelauCTel.notifyDataSetChanged();
        }
        abstractC35003nnC.zLjUOn().notifyDataSetChanged();
        qZX qzx2 = abstractC35003nnC.uzCIH;
        if (qzx2 != null && (recyclerView = qzx2.KWHzl) != null) {
            recyclerView.post(new java.lang.Runnable() { // from class: o.nnE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC35003nnC.AYXKKw(this.AEQbTJ);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC35003nnC, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(AbstractC35003nnC abstractC35003nnC) {
        abstractC35003nnC.gHZMYf();
    }

    public static final Unit AEQbTJ(AbstractC35003nnC abstractC35003nnC, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC35003nnC, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC34904nlJ
    public boolean iwGUEr() {
        C59534zip c59534zipAuCTelauCTel = AuCTelauCTel();
        java.util.List<?> items = c59534zipAuCTelauCTel != null ? c59534zipAuCTelauCTel.getItems() : null;
        return (items == null || items.isEmpty()) && zLjUOn().getItems().isEmpty();
    }

    @Override // o.AbstractC34904nlJ
    public RankModel fIwbmz() {
        return wlaJM();
    }

    @Override // o.AbstractC34904nlJ
    public void getNewProxyInstance() {
        InterfaceC34987nmn interfaceC34987nmn;
        super.getNewProxyInstance();
        if (this instanceof C35047nnu) {
            interfaceC34987nmn = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C35047nnu)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C35047nnu)) {
                parentFragment = null;
            }
            interfaceC34987nmn = (C35047nnu) parentFragment;
        }
        C35047nnu c35047nnu = (C35047nnu) interfaceC34987nmn;
        if (c35047nnu != null) {
            c35047nnu.AwvSrB();
        }
    }

    public final Function1<C55525xlb, Unit> copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Function1() { // from class: o.nnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC35003nnC.OLrzqt(str, this, (C55525xlb) obj);
            }
        };
    }

    public static final Unit OLrzqt(java.lang.String str, AbstractC35003nnC abstractC35003nnC, C55525xlb c55525xlb) {
        oKA oka;
        Intrinsics.checkNotNullParameter(c55525xlb, "");
        int size = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "spot") ? abstractC35003nnC.wlaJM().AhwBna().size() : 0;
        InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(abstractC35003nnC);
        if (interfaceC27808kEbEZpvd != null) {
            InterfaceC27808kEb.StateListAnimator.trackRankingTradingPairClick$default(interfaceC27808kEbEZpvd, OtpEventTracker.OTP_EVENT_VALUE_NEW, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "spot") ? "spot" : "futures", C33129mqd.gEmmrt(java.lang.Integer.valueOf(size + c55525xlb.AEQbTJ() + 1)), c55525xlb.copydefault(), str, null, null, 96, null);
        }
        MarketCoinInfo marketCoinInfoOLrzqt = abstractC35003nnC.OLrzqt(c55525xlb);
        android.content.Context context = abstractC35003nnC.getContext();
        if (context != null && (oka = (oKA) C43251rlk.OLrzqt(oKA.class)) != null) {
            oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfoOLrzqt, null, null, "page_info", java.lang.Integer.valueOf(c55525xlb.AEQbTJ()), null, null, abstractC35003nnC.AkhnZx(), null, null, 1740, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.nnC$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.EZpvd;
            if (fragment != null && !(fragment instanceof C35047nnu)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C35047nnu)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof C35047nnu)) {
                    parentFragment = null;
                }
                fragment = (C35047nnu) parentFragment;
            }
            if (!(fragment instanceof C35047nnu)) {
                fragment = null;
            }
            C35047nnu c35047nnu = (C35047nnu) fragment;
            C35047nnu c35047nnu2 = c35047nnu instanceof ViewModelStoreOwner ? c35047nnu : null;
            if (c35047nnu2 != null) {
                return c35047nnu2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + C35047nnu.class.getSimpleName()).toString());
        }
    }
}
