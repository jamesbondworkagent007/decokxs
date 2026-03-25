package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.BaseStrategyInfoOrderPagerFragment$initView$2;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.BaseStrategyInfoOrderPagerFragment$initView$3;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyBasicInfoViewModel;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyInfoViewModel;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC20068gZs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gXp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20011gXp extends hTH<hBC> {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.gXv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC20011gXp.copydefault(this.AEQbTJ);
        }
    });
    public final boolean OLrzqt = true;

    public abstract void AEQbTJ(@NotNull java.lang.String str);

    public void EZpvd() {
    }

    public AbstractC20011gXp() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StrategyInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.BaseStrategyInfoOrderPagerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.BaseStrategyInfoOrderPagerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.BaseStrategyInfoOrderPagerFragment$special$$inlined$activityViewModels$default$3
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StrategyBasicInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.BaseStrategyInfoOrderPagerFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.BaseStrategyInfoOrderPagerFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.BaseStrategyInfoOrderPagerFragment$special$$inlined$activityViewModels$default$6
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

    public final C22194hak KWHzl() {
        return (C22194hak) this.copydefault.getValue();
    }

    public static final C22194hak copydefault(AbstractC20011gXp abstractC20011gXp) {
        LifecycleOwner viewLifecycleOwner = abstractC20011gXp.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return new C22194hak(false, viewLifecycleOwner, 1, null);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public hBC OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBC hbcOLrzqt = hBC.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hbcOLrzqt, "");
        return hbcOLrzqt;
    }

    public final StrategyInfoViewModel AEQbTJ() {
        return (StrategyInfoViewModel) this.AEQbTJ.getValue();
    }

    public final StrategyBasicInfoViewModel OLrzqt() {
        return (StrategyBasicInfoViewModel) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull hBC hbc, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(hbc, "");
        hbc.EZpvd.djBIcL(false);
        hbc.EZpvd.AhwBna(false);
        hbc.EZpvd.KWHzl(new InterfaceC57900yrD() { // from class: o.gXs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                AbstractC20011gXp.AEQbTJ(this.OLrzqt, interfaceC57934yrl);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseStrategyInfoOrderPagerFragment$initView$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseStrategyInfoOrderPagerFragment$initView$3(this, null), 3, null);
        hbc.djBIcL.setLayoutManager(new LinearLayoutManager(requireActivity()));
        hbc.djBIcL.addItemDecoration(new C22202has(false));
        KWHzl().AEQbTJ();
        hbc.djBIcL.setAdapter(KWHzl());
    }

    public static final void AEQbTJ(AbstractC20011gXp abstractC20011gXp, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        abstractC20011gXp.EZpvd();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        KWHzl().AEQbTJ(new Function1() { // from class: o.gXw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20011gXp.EZpvd(this.KWHzl, (C20066gZq) obj);
            }
        });
        KWHzl().AEQbTJ(new Function0() { // from class: o.gXt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20011gXp.AEQbTJ(this.copydefault);
            }
        });
        KWHzl().KWHzl(new Function1() { // from class: o.gXu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20011gXp.AEQbTJ(this.OLrzqt, (C20072gZw) obj);
            }
        });
    }

    public static final Unit EZpvd(AbstractC20011gXp abstractC20011gXp, C20066gZq c20066gZq) {
        Intrinsics.checkNotNullParameter(c20066gZq, "");
        abstractC20011gXp.AEQbTJ().copydefault(abstractC20011gXp instanceof C20043gYu ? TrackButtonName.TRADE_DETAILS.getButtonName() : TrackButtonName.ORDER_DETAILS.getButtonName(), abstractC20011gXp.OLrzqt().AhwBna());
        C22206haw c22206haw = C22206haw.copydefault;
        FragmentActivity fragmentActivityRequireActivity = abstractC20011gXp.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c22206haw.AEQbTJ(fragmentActivityRequireActivity, c20066gZq, abstractC20011gXp.AEQbTJ().AEQbTJ(c20066gZq.AEQbTJ()));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC20011gXp abstractC20011gXp) {
        abstractC20011gXp.DbNXlk();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC20011gXp abstractC20011gXp, C20072gZw c20072gZw) {
        Intrinsics.checkNotNullParameter(c20072gZw, "");
        if (abstractC20011gXp instanceof C20037gYo) {
            abstractC20011gXp.AEQbTJ().copydefault(TrackButtonName.POSITIONS_DETAILS.getButtonName(), abstractC20011gXp.OLrzqt().AhwBna());
        }
        abstractC20011gXp.KWHzl(c20072gZw);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hak.showEmpty$default(o.hak, boolean, boolean, int, java.lang.Object):void */
    public final void EZpvd(@NotNull InterfaceC20068gZs interfaceC20068gZs) {
        Intrinsics.checkNotNullParameter(interfaceC20068gZs, "");
        if (interfaceC20068gZs instanceof InterfaceC20068gZs.StateListAnimator) {
            InterfaceC20068gZs.StateListAnimator stateListAnimator = (InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs;
            copydefault(stateListAnimator.AEQbTJ());
            AEQbTJ(false);
            KWHzl().OLrzqt(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) stateListAnimator.EZpvd()));
            return;
        }
        if (interfaceC20068gZs instanceof InterfaceC20068gZs.Application) {
            copydefault(false);
            AEQbTJ(false);
            KWHzl().OLrzqt(((InterfaceC20068gZs.Application) interfaceC20068gZs).EZpvd());
        } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.ActionBar) {
            copydefault(false);
            AEQbTJ(false);
            C22194hak.showEmpty$default(KWHzl(), false, false, 3, null);
        } else if (Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Activity.OLrzqt)) {
            AEQbTJ(true);
        } else if (Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Fragment.KWHzl)) {
            copydefault(true);
        } else if (!Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.TaskDescription.OLrzqt)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void KWHzl(C20072gZw c20072gZw) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.copydefault(contextRequireContext);
        C25352ivB.openMarketDetailPage$default(contextRequireContext, "default_trade", new TokenBase(c20072gZw.OLrzqt(), c20072gZw.copydefault(), c20072gZw.KWHzl(), null, null, c20072gZw.EZpvd(), null, -1, 0, 0, 0, null, "view_details", null, TokenBase.TYPE_COPY_TRADE, c20072gZw.AEQbTJ(), null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -53416, null), "trade_copy_trade", null, new int[0], 8, null);
    }

    public final void copydefault(boolean z) {
        C33546myW c33546myW;
        C33546myW c33546myW2;
        hBC hbcFARcdN = fARcdN();
        if (hbcFARcdN != null && (c33546myW2 = hbcFARcdN.EZpvd) != null) {
            c33546myW2.valueOf();
        }
        hBC hbcFARcdN2 = fARcdN();
        if (hbcFARcdN2 == null || (c33546myW = hbcFARcdN2.EZpvd) == null) {
            return;
        }
        c33546myW.AhwBna(z);
    }

    private final void AEQbTJ(boolean z) {
        RecyclerView recyclerView;
        C55113xdn c55113xdn;
        hBC hbcFARcdN = fARcdN();
        if (hbcFARcdN != null && (c55113xdn = hbcFARcdN.KWHzl) != null) {
            c55113xdn.setVisibility(z ? 0 : 8);
        }
        hBC hbcFARcdN2 = fARcdN();
        if (hbcFARcdN2 == null || (recyclerView = hbcFARcdN2.djBIcL) == null) {
            return;
        }
        recyclerView.setVisibility(z ? 4 : 0);
    }
}
