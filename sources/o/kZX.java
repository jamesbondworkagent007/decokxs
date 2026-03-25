package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.ChainInfoResult;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.tokenlist.ui.TokenListFragment$initListener$1;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C30381laA;
import o.InterfaceC28377kZd;
import o.hTL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kZX extends wXX {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public Function1<? super DexMultiTokenInfoBean, Unit> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public C22319hdC copydefault;
    public final boolean djBIcL = true;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.lan
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kZX.fARcdN(this.EZpvd);
        }
    });
    public TabLayoutMediator gEmmrt;
    public final Function1<DexMultiTokenInfoBean, Unit> valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingBizType.values().length];
            try {
                iArr[TradingBizType.Market.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradingBizType.Simple.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingBizType.Meme.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TradingBizType.AdvancedMarket.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TradingBizType.Advanced.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[TradingBizType.Limit.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[TradingBizType.Bridge.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            OLrzqt = iArr;
        }
    }

    private final void gEmmrt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.djBIcL;
    }

    public kZX() {
        Function0 function0 = new Function0() { // from class: o.lal
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZX.values();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C30384laD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.lao
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZX.values(this.EZpvd);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.lam
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZX.ejfBZ(this.OLrzqt);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.lap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZX.fIwbmz(this.EZpvd);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.las
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(kZX.fJNWhG(this.OLrzqt));
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.kZY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZX.fetchVPNInfo(this.AEQbTJ);
            }
        });
        this.valueOf = new Function1() { // from class: o.lab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kZX.EZpvd(this.AEQbTJ, (DexMultiTokenInfoBean) obj);
            }
        };
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kZX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C28385kZl c28385kZl, @NotNull Function1<? super DexMultiTokenInfoBean, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(c28385kZl, "");
            Intrinsics.checkNotNullParameter(function1, "");
            kZX kzx = new kZX();
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("type", c28385kZl.valueOf().getType()), C56390yDp.OLrzqt("chain_id", c28385kZl.EZpvd()), C56390yDp.OLrzqt("extra_universal_1", c28385kZl.OLrzqt()), C56390yDp.OLrzqt("extra_universal_2", java.lang.Boolean.valueOf(c28385kZl.gEmmrt())), C56390yDp.OLrzqt("from_token_address", c28385kZl.copydefault()), C56390yDp.OLrzqt("extra_universal_3", java.lang.Boolean.valueOf(c28385kZl.AEQbTJ())), C56390yDp.OLrzqt("extra_universal_5", c28385kZl.AYXKKw()));
            java.util.List<java.lang.String> listKWHzl = c28385kZl.KWHzl();
            bundleBundleOf.putStringArrayList("extra_universal_4", listKWHzl != null ? new java.util.ArrayList<>(listKWHzl) : null);
            kzx.setArguments(bundleBundleOf);
            kzx.EZpvd = function1;
            kzx.show(fragmentManager);
        }
    }

    private final TradingBizType valueOf() {
        return (TradingBizType) this.fetchVPNInfo.getValue();
    }

    public static final TradingBizType fARcdN(kZX kzx) {
        java.lang.String string;
        TradingBizType tradingBizTypeOLrzqt;
        android.os.Bundle arguments = kzx.getArguments();
        return (arguments == null || (string = arguments.getString("type")) == null || (tradingBizTypeOLrzqt = TradingBizType.Companion.OLrzqt(string)) == null) ? TradingBizType.AdvancedMarket : tradingBizTypeOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory values() {
        return new C30382laB();
    }

    public final C30384laD EZpvd() {
        return (C30384laD) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String djBIcL() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String values(kZX kzx) {
        android.os.Bundle arguments = kzx.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("chain_id") : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String ejfBZ(kZX kzx) {
        android.os.Bundle arguments = kzx.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("extra_universal_1") : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.DbNXlk.getValue();
    }

    public static final java.lang.String fIwbmz(kZX kzx) {
        android.os.Bundle arguments = kzx.getArguments();
        if (arguments != null) {
            return arguments.getString("extra_universal_5");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AkhnZx() {
        return ((java.lang.Boolean) this.AhwBna.getValue()).booleanValue();
    }

    public static final boolean fJNWhG(kZX kzx) {
        android.os.Bundle arguments = kzx.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_universal_2");
        }
        return true;
    }

    public final java.lang.String copydefault() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String fetchVPNInfo(kZX kzx) {
        android.os.Bundle arguments = kzx.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("from_token_address") : null;
        return string == null ? "" : string;
    }

    public static final Unit EZpvd(kZX kzx, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Function1<? super DexMultiTokenInfoBean, Unit> function1 = kzx.EZpvd;
        if (function1 != null) {
            function1.invoke(dexMultiTokenInfoBean);
        }
        kzx.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.util.List<java.lang.String> listAhwBna;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("extra_universal_3") : true;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (listAhwBna = arguments2.getStringArrayList("extra_universal_4")) == null) {
            listAhwBna = yDY.AhwBna();
        }
        EZpvd().AEQbTJ(AkhnZx(), djBIcL(), valueOf(), z, listAhwBna);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.copydefault = C22319hdC.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        gEmmrt();
        AhwBna();
        fetchVPNInfo();
    }

    private final void fetchVPNInfo() {
        java.lang.String strOLrzqt;
        if (AkhnZx()) {
            strOLrzqt = djBIcL();
        } else {
            strOLrzqt = OLrzqt();
        }
        EZpvd().copydefault(strOLrzqt);
    }

    private final void AhwBna() {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        TabLayout tabLayout;
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenListFragment$initListener$1(this, null), 3, null);
        C22319hdC c22319hdC = this.copydefault;
        if (c22319hdC != null && (c55230xfy = c22319hdC.AEQbTJ) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.setContentDescription("web3_dex_token_list_search_bar");
            AbstractC58247yxg<AbstractC8066avi> abstractC58247yxgDebounce = C8062ave.EZpvd(oKEditTextKWHzl).debounce(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            final Function1 function1 = new Function1() { // from class: o.lac
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kZX.KWHzl((AbstractC8066avi) obj);
                }
            };
            AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgDebounce.map(new InterfaceC58229yxO() { // from class: o.laf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return kZX.AEQbTJ(function1, obj);
                }
            }).observeOn(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.lad
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kZX.AEQbTJ(this.EZpvd, (java.lang.String) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.lae
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    kZX.KWHzl(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.lag
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kZX.EZpvd((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCSubscribe = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.lai
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    kZX.AhwBna(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
            yBK.EZpvd(interfaceC58217yxCSubscribe, EZpvd().call());
        }
        C22319hdC c22319hdC2 = this.copydefault;
        if (c22319hdC2 != null && (tabLayout = c22319hdC2.KWHzl) != null) {
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar());
        }
        C22319hdC c22319hdC3 = this.copydefault;
        if (c22319hdC3 != null && (c55173xeu2 = c22319hdC3.EZpvd) != null) {
            c55173xeu2.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
        }
        C22319hdC c22319hdC4 = this.copydefault;
        if (c22319hdC4 == null || (c55173xeu = c22319hdC4.EZpvd) == null) {
            return;
        }
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.lah
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kZX.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final java.lang.String AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String KWHzl(AbstractC8066avi abstractC8066avi) {
        Intrinsics.checkNotNullParameter(abstractC8066avi, "");
        return abstractC8066avi.EZpvd().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(kZX kzx, java.lang.String str) {
        C30384laD c30384laDEZpvd = kzx.EZpvd();
        Intrinsics.copydefault((java.lang.Object) str);
        c30384laDEZpvd.OLrzqt(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(kZX kzx, android.view.View view) {
        kzx.fetchVPNInfo();
    }

    public final void copydefault(InterfaceC28377kZd interfaceC28377kZd) {
        TabLayoutMediator tabLayoutMediator = this.gEmmrt;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        if (interfaceC28377kZd instanceof InterfaceC28377kZd.Activity) {
            OLrzqt(false);
            InterfaceC28377kZd.Activity activity = (InterfaceC28377kZd.Activity) interfaceC28377kZd;
            OLrzqt(activity.copydefault(), activity.OLrzqt());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC28377kZd instanceof InterfaceC28377kZd.TaskDescription) {
            OLrzqt(false);
            AEQbTJ(((InterfaceC28377kZd.TaskDescription) interfaceC28377kZd).OLrzqt());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd(interfaceC28377kZd, InterfaceC28377kZd.Application.copydefault)) {
            OLrzqt(false);
        } else {
            if (!Intrinsics.EZpvd(interfaceC28377kZd, InterfaceC28377kZd.StateListAnimator.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            OLrzqt(true);
        }
    }

    public final void OLrzqt(final java.util.List<DefiChainInfo> list, final java.lang.String str) {
        C22319hdC c22319hdC = this.copydefault;
        if (c22319hdC == null) {
            return;
        }
        AppCompatImageView appCompatImageView = c22319hdC.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(0);
        android.view.View view = c22319hdC.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        C25352ivB.setOnDoubleCheckClickListener$default(c22319hdC.copydefault, 0L, new Function1() { // from class: o.kZW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kZX.EZpvd(this.OLrzqt, (android.view.View) obj);
            }
        }, 1, null);
        c22319hdC.valueOf.setAdapter(new TaskDescription(this, false, list));
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c22319hdC.KWHzl, c22319hdC.valueOf, true, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.laa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                kZX.OLrzqt(this.AEQbTJ, list, str, tab, i);
            }
        });
        tabLayoutMediator.attach();
        this.gEmmrt = tabLayoutMediator;
        java.util.Iterator<DefiChainInfo> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getChainId(), (java.lang.Object) str)) {
                break;
            } else {
                i++;
            }
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() + 2 : 1;
        TabLayout tabLayout = c22319hdC.KWHzl;
        tabLayout.selectTab(tabLayout.getTabAt(iIntValue));
        c22319hdC.valueOf.setCurrentItem(iIntValue, false);
    }

    public static final Unit EZpvd(kZX kzx, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        kzx.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(kZX kzx, java.util.List list, java.lang.String str, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        FragmentActivity fragmentActivityRequireActivity = kzx.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C30381laA c30381laA = new C30381laA(fragmentActivityRequireActivity, null, 2, 0 == true ? 1 : 0);
        if (i == 0) {
            c30381laA.EZpvd(C30381laA.ActionBar.Application.KWHzl);
        } else if (i == 1) {
            c30381laA.EZpvd(C30381laA.ActionBar.Activity.OLrzqt);
        } else {
            DefiChainInfo defiChainInfo = (DefiChainInfo) list.get(i - 2);
            tab.setTag(defiChainInfo);
            c30381laA.EZpvd(new C30381laA.ActionBar.StateListAnimator(defiChainInfo));
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) defiChainInfo.getChainId())) {
                c30381laA.setSelected(true);
            }
        }
        tab.setCustomView(c30381laA);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AYXKKw() {
        NetworkSource networkSource;
        java.lang.Object tag;
        java.lang.String str;
        TabLayout tabLayout;
        TradeMode tradeMode;
        TabLayout tabLayout2;
        TradingBizType tradingBizTypeValueOf = valueOf();
        int[] iArr = Application.OLrzqt;
        switch (iArr[tradingBizTypeValueOf.ordinal()]) {
            case 1:
                networkSource = NetworkSource.Market;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                networkSource = NetworkSource.Single;
                break;
            case 6:
                networkSource = NetworkSource.Limit;
                break;
            case 7:
                networkSource = NetworkSource.Bridge;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        NetworkSource networkSource2 = networkSource;
        C22319hdC c22319hdC = this.copydefault;
        java.lang.Integer numValueOf = (c22319hdC == null || (tabLayout2 = c22319hdC.KWHzl) == null) ? null : java.lang.Integer.valueOf(tabLayout2.getSelectedTabPosition());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            str = "chain_id_collection";
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            str = "chain_id_all_network";
        } else {
            C22319hdC c22319hdC2 = this.copydefault;
            if (c22319hdC2 == null || (tabLayout = c22319hdC2.KWHzl) == null) {
                tag = null;
                DefiChainInfo defiChainInfo = !(tag instanceof DefiChainInfo) ? (DefiChainInfo) tag : null;
                java.lang.String chainId = defiChainInfo != null ? defiChainInfo.getChainId() : null;
                str = chainId != null ? "" : chainId;
            } else {
                TabLayout.Tab tabAt = tabLayout.getTabAt((c22319hdC2 == null || tabLayout == null) ? 0 : tabLayout.getSelectedTabPosition());
                if (tabAt != null) {
                    tag = tabAt.getTag();
                }
                if (!(tag instanceof DefiChainInfo)) {
                }
                if (defiChainInfo != null) {
                }
                if (chainId != null) {
                }
            }
        }
        hTL.ActionBar actionBar = hTL.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        switch (iArr[valueOf().ordinal()]) {
            case 1:
            case 4:
                tradeMode = TradeMode.SwapMarket;
                break;
            case 2:
                tradeMode = TradeMode.EasyBuy;
                break;
            case 3:
                tradeMode = TradeMode.Meme;
                break;
            case 5:
                tradeMode = TradeMode.Advanced;
                break;
            case 6:
                tradeMode = TradeMode.SwapLimit;
                break;
            case 7:
                tradeMode = TradeMode.Bridge;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        actionBar.OLrzqt(childFragmentManager, new C21997hUb(networkSource2, str, true, tradeMode.getType(), true, djBIcL(), AkhnZx(), false, 128, null), new Function1() { // from class: o.lak
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kZX.EZpvd(this.KWHzl, (ChainInfoResult) obj);
            }
        });
    }

    public static final Unit EZpvd(kZX kzx, ChainInfoResult chainInfoResult) {
        TabLayout tabLayout;
        Intrinsics.checkNotNullParameter(chainInfoResult, "");
        if (!Intrinsics.EZpvd((java.lang.Object) chainInfoResult.copydefault(), (java.lang.Object) "chain_id_all_network")) {
            kzx.EZpvd().AEQbTJ(chainInfoResult.copydefault());
        } else {
            C22319hdC c22319hdC = kzx.copydefault;
            if (c22319hdC != null && (tabLayout = c22319hdC.KWHzl) != null) {
                tabLayout.selectTab(tabLayout.getTabAt(1));
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final DefiChainInfo defiChainInfo) {
        C22319hdC c22319hdC = this.copydefault;
        if (c22319hdC == null) {
            return;
        }
        AppCompatImageView appCompatImageView = c22319hdC.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(8);
        android.view.View view = c22319hdC.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        c22319hdC.valueOf.setAdapter(new TaskDescription(this, true, C56402yEa.EZpvd(defiChainInfo)));
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c22319hdC.KWHzl, c22319hdC.valueOf, true, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.laj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                kZX.OLrzqt(this.KWHzl, defiChainInfo, tab, i);
            }
        });
        tabLayoutMediator.attach();
        this.gEmmrt = tabLayoutMediator;
        TabLayout tabLayout = c22319hdC.KWHzl;
        tabLayout.selectTab(tabLayout.getTabAt(1));
        c22319hdC.valueOf.setCurrentItem(1, false);
    }

    public static final void OLrzqt(kZX kzx, DefiChainInfo defiChainInfo, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        FragmentActivity fragmentActivityRequireActivity = kzx.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C30381laA c30381laA = new C30381laA(fragmentActivityRequireActivity, null, 2, 0 == true ? 1 : 0);
        if (i == 0) {
            c30381laA.EZpvd(C30381laA.ActionBar.Application.KWHzl);
        } else {
            c30381laA.EZpvd(new C30381laA.ActionBar.StateListAnimator(defiChainInfo));
        }
        tab.setCustomView(c30381laA);
    }

    public final class TaskDescription extends FragmentStateAdapter {
        public final java.util.List<DefiChainInfo> AEQbTJ;
        public final boolean EZpvd;
        public final /* synthetic */ kZX OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(kZX kzx, @NotNull boolean z, java.util.List<DefiChainInfo> list) {
            super(kzx);
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = kzx;
            this.EZpvd = z;
            this.AEQbTJ = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.EZpvd) {
                return this.AEQbTJ.size() + 1;
            }
            return this.AEQbTJ.size() + 2;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            if (this.EZpvd) {
                kotlin.Pair pairOLrzqt = i == 0 ? this.OLrzqt.AkhnZx() ? C56390yDp.OLrzqt("chain_id_collection", this.OLrzqt.OLrzqt()) : C56390yDp.OLrzqt(this.OLrzqt.djBIcL(), "chain_id_collection") : this.OLrzqt.AkhnZx() ? C56390yDp.OLrzqt(this.AEQbTJ.get(i - 1).getChainId(), this.OLrzqt.OLrzqt()) : C56390yDp.OLrzqt(this.OLrzqt.djBIcL(), this.AEQbTJ.get(i - 1).getChainId());
                return kZJ.Companion.KWHzl((java.lang.String) pairOLrzqt.component1(), (java.lang.String) pairOLrzqt.component2(), this.OLrzqt.AkhnZx(), this.OLrzqt.copydefault(), this.OLrzqt.KWHzl(), this.OLrzqt.valueOf);
            }
            kotlin.Pair pairOLrzqt2 = i != 0 ? i != 1 ? this.OLrzqt.AkhnZx() ? C56390yDp.OLrzqt(this.AEQbTJ.get(i - 2).getChainId(), this.OLrzqt.OLrzqt()) : C56390yDp.OLrzqt(this.OLrzqt.djBIcL(), this.AEQbTJ.get(i - 2).getChainId()) : this.OLrzqt.AkhnZx() ? C56390yDp.OLrzqt("chain_id_all_network", this.OLrzqt.OLrzqt()) : C56390yDp.OLrzqt(this.OLrzqt.djBIcL(), "chain_id_all_network") : this.OLrzqt.AkhnZx() ? C56390yDp.OLrzqt("chain_id_collection", this.OLrzqt.OLrzqt()) : C56390yDp.OLrzqt(this.OLrzqt.djBIcL(), "chain_id_collection");
            return kZJ.Companion.KWHzl((java.lang.String) pairOLrzqt2.component1(), (java.lang.String) pairOLrzqt2.component2(), this.OLrzqt.AkhnZx(), this.OLrzqt.copydefault(), this.OLrzqt.KWHzl(), this.OLrzqt.valueOf);
        }
    }

    public final void OLrzqt(boolean z) {
        ViewPager2 viewPager2;
        C55173xeu c55173xeu;
        C22319hdC c22319hdC = this.copydefault;
        if (c22319hdC != null && (c55173xeu = c22319hdC.EZpvd) != null) {
            c55173xeu.setVisibility(z ? 0 : 8);
        }
        C22319hdC c22319hdC2 = this.copydefault;
        if (c22319hdC2 == null || (viewPager2 = c22319hdC2.valueOf) == null) {
            return;
        }
        viewPager2.setVisibility(z ^ true ? 0 : 8);
    }
}
