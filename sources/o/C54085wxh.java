package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54085wxh extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public AbstractC48366uOv AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public java.util.ArrayList<java.lang.String> EZpvd = new java.util.ArrayList<>();
    public C53988wvq KWHzl;
    public Function1<? super MarketArbCoinInfo, Unit> copydefault;
    public boolean djBIcL;
    public Function1<? super java.lang.Boolean, Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public C54085wxh() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.ArbitrageSearchDialogFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.ArbitrageSearchDialogFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54056wxE.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.ArbitrageSearchDialogFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.ArbitrageSearchDialogFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.ArbitrageSearchDialogFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C54056wxE copydefault() {
        return (C54056wxE) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.wxh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wxh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wxh$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C54085wxh newInstance$default(Activity activity, Function1 function1, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return activity.OLrzqt(function1, z);
        }

        public final C54085wxh OLrzqt(Function1<? super MarketArbCoinInfo, Unit> function1, boolean z) {
            C54085wxh c54085wxh = new C54085wxh();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("save_cache_key", z);
            c54085wxh.setArguments(bundle);
            c54085wxh.copydefault = function1;
            return c54085wxh;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = (AbstractC48366uOv) DataBindingUtil.inflate(getCustomLayoutInflater(), C48033uCm.Activity.ODXsMY, constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    /* JADX INFO: renamed from: o.wxh$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C54085wxh.this.copydefault().EZpvd().postValue(java.lang.String.valueOf(editable));
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.djBIcL = arguments != null ? arguments.getBoolean("save_cache_key") : false;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ViewPager2 viewPager2;
        C55230xfy c55230xfy;
        android.widget.EditText editTextEZpvd;
        ViewPager2 viewPager22;
        ViewPager2 viewPager23;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && interfaceC54581xNrOLrzqt.sSMYrx() && !C55697xoo.OLrzqt.AkhnZx()) {
            this.EZpvd.add("Watchlist");
        }
        this.EZpvd.add("fundingRateArbitrage");
        this.EZpvd.add("spreadArbitrage");
        AbstractC48366uOv abstractC48366uOv = this.AEQbTJ;
        if (abstractC48366uOv != null && (viewPager23 = abstractC48366uOv.KWHzl) != null) {
            viewPager23.setOffscreenPageLimit(this.EZpvd.size());
        }
        C53988wvq c53988wvq = new C53988wvq(this.EZpvd, this);
        this.KWHzl = c53988wvq;
        c53988wvq.OLrzqt(this.copydefault);
        C53988wvq c53988wvq2 = this.KWHzl;
        if (c53988wvq2 != null) {
            c53988wvq2.OLrzqt(this.djBIcL);
        }
        AbstractC48366uOv abstractC48366uOv2 = this.AEQbTJ;
        if (abstractC48366uOv2 != null && (viewPager22 = abstractC48366uOv2.KWHzl) != null) {
            viewPager22.setAdapter(this.KWHzl);
        }
        AbstractC48366uOv abstractC48366uOv3 = this.AEQbTJ;
        if (abstractC48366uOv3 != null) {
            new TabLayoutMediator(abstractC48366uOv3.AEQbTJ.copydefault(), abstractC48366uOv3.KWHzl, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.wxe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C54085wxh.OLrzqt(this.copydefault, tab, i);
                }
            }).attach();
            abstractC48366uOv3.KWHzl.registerOnPageChangeCallback(new ActionBar());
        }
        AbstractC48366uOv abstractC48366uOv4 = this.AEQbTJ;
        if (abstractC48366uOv4 != null && (c55230xfy = abstractC48366uOv4.EZpvd) != null && (editTextEZpvd = c55230xfy.EZpvd()) != null) {
            editTextEZpvd.addTextChangedListener(new StateListAnimator());
        }
        AbstractC48366uOv abstractC48366uOv5 = this.AEQbTJ;
        if (abstractC48366uOv5 != null && (viewPager2 = abstractC48366uOv5.KWHzl) != null) {
            viewPager2.setCurrentItem(EZpvd(), false);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void OLrzqt(C54085wxh c54085wxh, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        C53988wvq c53988wvq = c54085wxh.KWHzl;
        tab.setText(c53988wvq != null ? c53988wvq.AEQbTJ(i) : null);
    }

    /* JADX INFO: renamed from: o.wxh$ActionBar */
    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public ActionBar() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            C54085wxh.this.KWHzl(i);
        }
    }

    public final int EZpvd() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && interfaceC54581xNrOLrzqt.sSMYrx() && !C55697xoo.OLrzqt.AkhnZx()) {
            java.lang.Integer num = SPUtils.getInt("login_arbitrage_search_save_index", 1);
            Intrinsics.copydefault(num);
            return num.intValue();
        }
        java.lang.Integer num2 = SPUtils.getInt("un_login_arbitrage_search_save_index", 0);
        Intrinsics.copydefault(num2);
        return num2.intValue();
    }

    public final void KWHzl(int i) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && interfaceC54581xNrOLrzqt.sSMYrx() && !C55697xoo.OLrzqt.AkhnZx()) {
            SPUtils.put("login_arbitrage_search_save_index", java.lang.Integer.valueOf(i));
        } else {
            SPUtils.put("un_login_arbitrage_search_save_index", java.lang.Integer.valueOf(i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Function1<? super java.lang.Boolean, Unit> function1 = this.gEmmrt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Function1<? super java.lang.Boolean, Unit> function1 = this.gEmmrt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }
}
