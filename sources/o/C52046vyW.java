package o;

import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotPresenter;
import com.okinc.tradingbot.impl.nmp.my_bot.presenter.MyBotAndSignalPresenter;
import com.okinc.tradingbot.impl.nmp.my_bot.presenter.NmpTabType;
import com.okinc.unify_trade.biz.OrderPositionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vyW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52046vyW extends AbstractC54505xKx<AbstractC48548uVm, MyBotAndSignalPresenter> {
    public final int KWHzl = C48033uCm.Activity.QFTsTN;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX INFO: renamed from: o.vyW$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    public static final boolean copydefault(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public C52046vyW() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MyBotPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.MyBotAndSignalFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.MyBotAndSignalFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.MyBotAndSignalFragment$special$$inlined$activityViewModels$default$3
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
    }

    private final MyBotPresenter KWHzl() {
        return (MyBotPresenter) this.OLrzqt.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        AEQbTJ();
        copydefault();
        KWHzl().AYXKKw();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AEQbTJ() {
        final java.util.List<C52107vze> listAEQbTJ = dxcTrN().AEQbTJ();
        ViewPager2 viewPager2 = gGvvIC().EZpvd;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        viewPager2.setAdapter(new C47976uAj(childFragmentManager, listAEQbTJ, lifecycle, null, 8, null));
        gGvvIC().EZpvd.setOffscreenPageLimit(listAEQbTJ.size());
        gGvvIC().KWHzl.KWHzl(false);
        new TabLayoutMediator(gGvvIC().KWHzl.copydefault(), gGvvIC().EZpvd, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vyY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C52046vyW.KWHzl(this.AEQbTJ, listAEQbTJ, tab, i);
            }
        }).attach();
    }

    public static final void KWHzl(C52046vyW c52046vyW, java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vyX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C52046vyW.copydefault(view);
            }
        });
        tab.setText(c52046vyW.dxcTrN().EZpvd(((C52107vze) list.get(i)).copydefault()));
    }

    private final void copydefault() {
        TradeLiveData<OrderPositionData> tradeLiveDataCopydefault = KWHzl().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52046vyW.EZpvd(this.copydefault, (OrderPositionData) obj);
            }
        }));
    }

    public static final Unit EZpvd(C52046vyW c52046vyW, OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        c52046vyW.dxcTrN().copydefault(orderPositionData);
        C55254xgV c55254xgV = c52046vyW.gGvvIC().KWHzl;
        NmpTabType nmpTabType = NmpTabType.RUNNING_BOT;
        TabLayout.Tab tabCopydefault = c55254xgV.copydefault(nmpTabType.ordinal());
        if (tabCopydefault != null) {
            tabCopydefault.setText(c52046vyW.dxcTrN().EZpvd(nmpTabType));
        }
        return Unit.INSTANCE;
    }
}
