package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.find_ui.ranking.percentchange.sub.MarketHomeUpRankingSpotFragment$setListener$1$1;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_find.model.UpRankViewModel;
import com.okinc.unify_find.viewmodel.PercentChangeRankingViewModel;
import com.okinc.unify_find.viewmodel.RankModel;
import com.okinc.unify_trade.biz.DexInstrument;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC55526xlc;
import o.AbstractC58185ywX;
import o.C35094noo;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35094noo extends AbstractC35085nof implements InterfaceC27808kEb, mAS {
    public final InterfaceC56387yDm AuCTelauCTel;
    public qZY AubY;
    public final /* synthetic */ kDL getFieldNames = new kDL();
    public final InterfaceC56387yDm iwGUEr;
    public boolean zsXlph;

    /* JADX INFO: renamed from: o.noo$StateListAnimator */
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
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getFieldNames.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getFieldNames.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.getFieldNames.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34904nlJ
    public java.lang.String AkhnZx() {
        return "Home_Rank_Rise";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getFieldNames.EZpvd(dexInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getFieldNames.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.getFieldNames.EZpvd(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt() {
        this.getFieldNames.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getFieldNames.OLrzqt(dexInstrument, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getFieldNames.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void aZ_() {
        this.getFieldNames.aZ_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void ba_() {
        this.getFieldNames.ba_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getFieldNames.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.getFieldNames.copydefault(str, str2, str3, str4, str5, str6, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.AuCTelauCTel;
    }

    public boolean zsXlph() {
        return true;
    }

    public C35094noo() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.find_ui.ranking.percentchange.sub.MarketHomeUpRankingSpotFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.find_ui.ranking.percentchange.sub.MarketHomeUpRankingSpotFragment$special$$inlined$viewModels$default$2
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
        this.AuCTelauCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(UpRankViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.find_ui.ranking.percentchange.sub.MarketHomeUpRankingSpotFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.find_ui.ranking.percentchange.sub.MarketHomeUpRankingSpotFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.find_ui.ranking.percentchange.sub.MarketHomeUpRankingSpotFragment$special$$inlined$viewModels$default$5
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
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.nok
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35094noo.AEQbTJ(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PercentChangeRankingViewModel sSMYrx() {
        return (PercentChangeRankingViewModel) this.AuCTelauCTel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C59534zip zLjUOn() {
        return (C59534zip) this.iwGUEr.getValue();
    }

    public static final C59534zip AEQbTJ(C35094noo c35094noo) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(AbstractC55526xlc.ActionBar.class, new C34982nmi(c35094noo.values()));
        c59534zip.register(AbstractC55526xlc.TaskDescription.class, new C34996nmw(c35094noo, qZH.ActionBar.invokespecialRtjmuc));
        return c59534zip;
    }

    @Override // o.AbstractC34904nlJ, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46688tbr.registerTradeFragmentTrack$default(C46688tbr.KWHzl, this, "MarketHomeUpRankingSpotFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC34904nlJ, o.AbstractC27793kDo, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        qZY qzyKWHzl = qZY.KWHzl(view);
        qzyKWHzl.EZpvd.setLayoutManager(new LinearLayoutManager(getContext()));
        qzyKWHzl.EZpvd.setAdapter(zLjUOn());
        this.AubY = qzyKWHzl;
        if (this.zsXlph) {
            return;
        }
        this.zsXlph = true;
        EZpvd(true);
    }

    @Override // o.AbstractC34904nlJ, o.AbstractC32998moE
    public void onVisible() {
        androidx.fragment.app.Fragment parentFragment;
        androidx.fragment.app.FragmentManager childFragmentManager;
        InterfaceC27808kEb interfaceC27808kEbEZpvd;
        super.onVisible();
        if (valueOf()) {
            OLrzqt(C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null));
            OLrzqt(false);
        }
        if (!this.zsXlph) {
            this.zsXlph = true;
            EZpvd(true);
        }
        sSMYrx().KWHzl(C55633xnd.getStableText$default(null, 1, null));
        gHZMYf();
        android.view.View view = getView();
        if (view != null && view.isShown() && view.isAttachedToWindow()) {
            if (view.getGlobalVisibleRect(new android.graphics.Rect()) && view.getHeight() > 0 && C33129mqd.copydefault(java.lang.Float.valueOf(r1.height() / view.getHeight()), java.lang.Float.valueOf(0.5f)) && (interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this)) != null) {
                interfaceC27808kEbEZpvd.copydefault("gainers", "spot");
            }
        }
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.setFragmentResultListener("REQUEST_CLICK_ARROW", this, new FragmentResultListener() { // from class: o.nom
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C35094noo.OLrzqt(this.copydefault, str, bundle);
            }
        });
    }

    public static final void OLrzqt(C35094noo c35094noo, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Intrinsics.EZpvd((java.lang.Object) bundle.getString("type"), (java.lang.Object) "up-rank")) {
            c35094noo.EZpvd(0);
        }
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        androidx.fragment.app.Fragment parentFragment;
        androidx.fragment.app.FragmentManager childFragmentManager;
        sSMYrx().bA_();
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.clearFragmentResultListener("REQUEST_CLICK_ARROW");
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        sSMYrx().AhwBna().observe(this, new StateListAnimator(new Function1() { // from class: o.nol
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35094noo.OLrzqt(this.KWHzl, (Unit) obj);
            }
        }));
        final java.lang.String[] strArr = {"event_home_page_refresh"};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.find_ui.ranking.percentchange.sub.MarketHomeUpRankingSpotFragment$setListener$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC KWHzl;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length));
                final C35094noo c35094noo = this;
                this.KWHzl = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM(new Function1<String, Unit>() { // from class: com.okinc.find_ui.ranking.percentchange.sub.MarketHomeUpRankingSpotFragment$setListener$$inlined$repeatListenRxEventOnResume$1.4
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        KWHzl(str);
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl(String str) {
                        Intrinsics.copydefault((Object) str);
                        c35094noo.gHZMYf();
                    }
                }) { // from class: o.jSA.PendingIntent
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.find_ui.ranking.percentchange.sub.MarketHomeUpRankingSpotFragment$setListener$$inlined$repeatListenRxEventOnResume$1.1
                    public final void AEQbTJ(Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        AEQbTJ(th);
                        return Unit.INSTANCE;
                    }
                }) { // from class: o.jSA.PendingIntent
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                });
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
    }

    public static final Unit OLrzqt(C35094noo c35094noo, Unit unit) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c35094noo), null, null, new MarketHomeUpRankingSpotFragment$setListener$1$1(c35094noo, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC34904nlJ
    public InterfaceC55467xkW values() {
        return sSMYrx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gHZMYf() {
        if (isDetached()) {
            return;
        }
        sSMYrx().EZpvd(java.lang.Boolean.valueOf(zsXlph()));
    }

    @Override // o.AbstractC34904nlJ
    public boolean iwGUEr() {
        return zLjUOn().getItems().isEmpty();
    }

    @Override // o.AbstractC34904nlJ
    public RankModel fIwbmz() {
        return sSMYrx();
    }

    @Override // o.AbstractC34904nlJ
    public void getNewProxyInstance() {
        super.getNewProxyInstance();
        gHZMYf();
    }

    @Override // o.AbstractC34904nlJ, o.InterfaceC34987nmn
    public void copydefault(int i) {
        InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this);
        if (interfaceC27808kEbEZpvd != null) {
            interfaceC27808kEbEZpvd.OLrzqt("gainers", "SPOT");
        }
        EZpvd(i);
    }

    private final void EZpvd(int i) {
        if (C27563jxZ.OLrzqt.fetchVPNInfo()) {
            android.content.Context context = getContext();
            if (context != null) {
                sZQ.EZpvd.EZpvd(context, "gainers");
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) ActivityC34993nmt.class);
        intent.putExtra("ranking_id", i);
        intent.putExtra("ranking_tab_key", "RANKING_TOP_GAINERS");
        intent.putExtra("ranking_biz_type", "SPOT");
        startActivity(intent);
    }
}
