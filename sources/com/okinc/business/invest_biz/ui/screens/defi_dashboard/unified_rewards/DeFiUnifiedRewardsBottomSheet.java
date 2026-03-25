package com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsBottomSheet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.AbstractC26358jan;
import o.AbstractC27470jvm;
import o.C23740iHo;
import o.C25491ixi;
import o.C25493ixk;
import o.C25528iyS;
import o.C25533iyX;
import o.C26350jaf;
import o.C26356jal;
import o.C26534jeD;
import o.C26566jej;
import o.C26683jgu;
import o.C26684jgv;
import o.C27493jwI;
import o.C27589jxz;
import o.C52794wYp;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC25466ixJ;
import o.InterfaceC25527iyR;
import o.InterfaceC56387yDm;
import o.wXQ;
import o.wYF;
import o.yCM;
import o.yIP;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiUnifiedRewardsBottomSheet extends AbstractC26358jan implements InterfaceC25466ixJ {
    public static final /* synthetic */ yJA<Object>[] AEQbTJ = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(DeFiUnifiedRewardsBottomSheet.class, "contentBinding", "getContentBinding()Lcom/okinc/business/invest_biz/databinding/DialogUnifiedRewardsBinding;", 0))};
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public InterfaceC25527iyR AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public C26566jej KWHzl;
    public final yIP OLrzqt = C27589jxz.EZpvd(this);

    @yCM
    public C25528iyS claimTransactionHandler;
    public final InterfaceC56387yDm copydefault;
    public C26356jal djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public C26534jeD valueOf;

    public DeFiUnifiedRewardsBottomSheet() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsBottomSheet$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DeFiUnifiedRewardsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsBottomSheet$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.jab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DeFiUnifiedRewardsBottomSheet.fARcdN();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.iZZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(DeFiUnifiedRewardsBottomSheet.EZpvd(this.EZpvd));
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jad
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DeFiUnifiedRewardsBottomSheet.AEQbTJ(this.EZpvd);
            }
        });
    }

    public final void AEQbTJ(C23740iHo c23740iHo) {
        this.OLrzqt.KWHzl(this, AEQbTJ[0], c23740iHo);
    }

    public final C23740iHo AkhnZx() {
        return (C23740iHo) this.OLrzqt.getValue(this, AEQbTJ[0]);
    }

    public final DeFiUnifiedRewardsViewModel fetchVPNInfo() {
        return (DeFiUnifiedRewardsViewModel) this.DbNXlk.getValue();
    }

    private final C25491ixi AuCTel() {
        return (C25491ixi) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C25491ixi fARcdN() {
        return C25491ixi.copydefault;
    }

    public final boolean DbNXlk() {
        return ((Boolean) this.AhwBna.getValue()).booleanValue();
    }

    public static final boolean EZpvd(DeFiUnifiedRewardsBottomSheet deFiUnifiedRewardsBottomSheet) {
        return DeFiUnifiedRewardsViewModel.Companion.AEQbTJ(deFiUnifiedRewardsBottomSheet.gEmmrt());
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return DbNXlk();
    }

    public final C25528iyS AYXKKw() {
        C25528iyS c25528iyS = this.claimTransactionHandler;
        if (c25528iyS != null) {
            return c25528iyS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C26350jaf valueOf() {
        return (C26350jaf) this.copydefault.getValue();
    }

    public static final C26350jaf AEQbTJ(final DeFiUnifiedRewardsBottomSheet deFiUnifiedRewardsBottomSheet) {
        return new C26350jaf(new Function2() { // from class: o.iZW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return DeFiUnifiedRewardsBottomSheet.KWHzl(this.copydefault, (C26356jal) obj, (InvestUserRewardElementInfo) obj2);
            }
        }, new Function1() { // from class: o.iZX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeFiUnifiedRewardsBottomSheet.EZpvd(this.EZpvd, (C26356jal) obj);
            }
        });
    }

    public static final Unit KWHzl(DeFiUnifiedRewardsBottomSheet deFiUnifiedRewardsBottomSheet, C26356jal c26356jal, InvestUserRewardElementInfo investUserRewardElementInfo) {
        Intrinsics.checkNotNullParameter(c26356jal, "");
        Intrinsics.checkNotNullParameter(investUserRewardElementInfo, "");
        deFiUnifiedRewardsBottomSheet.copydefault(c26356jal, investUserRewardElementInfo);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(DeFiUnifiedRewardsBottomSheet deFiUnifiedRewardsBottomSheet, C26356jal c26356jal) {
        Intrinsics.checkNotNullParameter(c26356jal, "");
        deFiUnifiedRewardsBottomSheet.KWHzl(c26356jal);
        return Unit.INSTANCE;
    }

    public final DeFiUnifiedRewardsParams gEmmrt() {
        DeFiUnifiedRewardsParams deFiUnifiedRewardsParams;
        Bundle arguments = getArguments();
        if (arguments == null || (deFiUnifiedRewardsParams = (DeFiUnifiedRewardsParams) BundleCompat.getParcelable(arguments, "key.params_defi_unified_rewards", DeFiUnifiedRewardsParams.class)) == null) {
            throw new IllegalStateException("Must provide DeFiUnifiedRewardsParams".toString());
        }
        return deFiUnifiedRewardsParams;
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(2);
        String string = wxq.getContext().getString(C25493ixk.FragmentManager.aHXSQp);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AEQbTJ(C23740iHo.EZpvd(LayoutInflater.from(requireContext())));
        constraintLayout.addView(AkhnZx().getRoot(), new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(getString(C25493ixk.FragmentManager.OLrzqt));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.jaa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    DeFiUnifiedRewardsBottomSheet.OLrzqt(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void OLrzqt(DeFiUnifiedRewardsBottomSheet deFiUnifiedRewardsBottomSheet, View view) {
        C26356jal c26356jal = deFiUnifiedRewardsBottomSheet.djBIcL;
        if (c26356jal != null) {
            deFiUnifiedRewardsBottomSheet.KWHzl(c26356jal);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        values();
        fIwbmz();
    }

    public final void values() {
        InvestmentKind investmentCategory;
        String network;
        List<UnifiedRewardInfoByInvestment> allRewards;
        UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment;
        List<UnifiedRewardInfoByInvestment> allRewards2;
        UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment2;
        Long chainId;
        List<UnifiedRewardInfoByInvestment> allRewards3;
        UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment3;
        List<UnifiedRewardInfoByInvestment> allRewards4;
        UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment4;
        List<UnifiedRewardInfoByInvestment> allRewards5;
        UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment5;
        Long chainId2;
        List<UnifiedRewardInfoByInvestment> allRewards6;
        UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment6;
        this.valueOf = new C26534jeD(this, AuCTel());
        DeFiUnifiedRewardsParams deFiUnifiedRewardsParamsGEmmrt = gEmmrt();
        long jLongValue = 0;
        long investmentId = (deFiUnifiedRewardsParamsGEmmrt == null || (allRewards6 = deFiUnifiedRewardsParamsGEmmrt.getAllRewards()) == null || (unifiedRewardInfoByInvestment6 = (UnifiedRewardInfoByInvestment) CollectionsKt___CollectionsKt.firstOrNull(allRewards6)) == null) ? 0L : unifiedRewardInfoByInvestment6.getInvestmentId();
        DeFiUnifiedRewardsParams deFiUnifiedRewardsParamsGEmmrt2 = gEmmrt();
        boolean z = false;
        this.AYXKKw = new C25533iyX(this, new C26684jgv(new C26683jgu(investmentId, (deFiUnifiedRewardsParamsGEmmrt2 == null || (allRewards5 = deFiUnifiedRewardsParamsGEmmrt2.getAllRewards()) == null || (unifiedRewardInfoByInvestment5 = (UnifiedRewardInfoByInvestment) CollectionsKt___CollectionsKt.firstOrNull(allRewards5)) == null || (chainId2 = unifiedRewardInfoByInvestment5.getChainId()) == null) ? 0L : chainId2.longValue(), "dashboard", InvestAction.Claim), false, 2, null));
        DeFiUnifiedRewardsParams deFiUnifiedRewardsParamsGEmmrt3 = gEmmrt();
        long investmentId2 = (deFiUnifiedRewardsParamsGEmmrt3 == null || (allRewards4 = deFiUnifiedRewardsParamsGEmmrt3.getAllRewards()) == null || (unifiedRewardInfoByInvestment4 = (UnifiedRewardInfoByInvestment) CollectionsKt___CollectionsKt.firstOrNull(allRewards4)) == null) ? 0L : unifiedRewardInfoByInvestment4.getInvestmentId();
        DeFiUnifiedRewardsParams deFiUnifiedRewardsParamsGEmmrt4 = gEmmrt();
        if (deFiUnifiedRewardsParamsGEmmrt4 == null || (allRewards3 = deFiUnifiedRewardsParamsGEmmrt4.getAllRewards()) == null || (unifiedRewardInfoByInvestment3 = (UnifiedRewardInfoByInvestment) CollectionsKt___CollectionsKt.firstOrNull(allRewards3)) == null || (investmentCategory = unifiedRewardInfoByInvestment3.getInvestmentCategory()) == null) {
            investmentCategory = InvestmentKind.Default;
        }
        InvestmentKind investmentKind = investmentCategory;
        DeFiUnifiedRewardsParams deFiUnifiedRewardsParamsGEmmrt5 = gEmmrt();
        if (deFiUnifiedRewardsParamsGEmmrt5 != null && (allRewards2 = deFiUnifiedRewardsParamsGEmmrt5.getAllRewards()) != null && (unifiedRewardInfoByInvestment2 = (UnifiedRewardInfoByInvestment) CollectionsKt___CollectionsKt.firstOrNull(allRewards2)) != null && (chainId = unifiedRewardInfoByInvestment2.getChainId()) != null) {
            jLongValue = chainId.longValue();
        }
        long j = jLongValue;
        DeFiUnifiedRewardsParams deFiUnifiedRewardsParamsGEmmrt6 = gEmmrt();
        if (deFiUnifiedRewardsParamsGEmmrt6 == null || (allRewards = deFiUnifiedRewardsParamsGEmmrt6.getAllRewards()) == null || (unifiedRewardInfoByInvestment = (UnifiedRewardInfoByInvestment) CollectionsKt___CollectionsKt.firstOrNull(allRewards)) == null || (network = unifiedRewardInfoByInvestment.getNetwork()) == null) {
            network = "";
        }
        ChainInfo chainInfo = new ChainInfo(j, network, null, null, null, 28, null);
        List<UnifiedRewardInfoByInvestment> allRewards7 = gEmmrt().getAllRewards();
        if (!(allRewards7 instanceof Collection) || !allRewards7.isEmpty()) {
            Iterator<T> it = allRewards7.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((UnifiedRewardInfoByInvestment) it.next()).KWHzl()) {
                    z = true;
                    break;
                }
            }
        }
        this.KWHzl = new C26566jej(new ProductDetailsByChain(investmentId2, investmentKind, chainInfo, z, null, null, null, false, PsExtractor.VIDEO_STREAM_MASK, null), this, fetchVPNInfo(), this.valueOf, AYXKKw(), this.AYXKKw);
    }

    private final void fIwbmz() {
        fetchVPNInfo().OLrzqt(gEmmrt());
        AkhnZx().EZpvd.setAdapter(valueOf());
        Space space = AkhnZx().copydefault;
        Intrinsics.checkNotNullExpressionValue(space, "");
        space.setVisibility(DbNXlk() ^ true ? 0 : 8);
        if (DbNXlk()) {
            this.djBIcL = fetchVPNInfo().EZpvd(gEmmrt());
            AbstractC27470jvm.setData$default(valueOf(), fetchVPNInfo().EZpvd(gEmmrt(), true), null, 2, null);
        } else {
            this.djBIcL = null;
            AbstractC27470jvm.setData$default(valueOf(), fetchVPNInfo().EZpvd(gEmmrt(), false), null, 2, null);
        }
    }

    public final void copydefault(C26356jal c26356jal, InvestUserRewardElementInfo investUserRewardElementInfo) {
        InterfaceC25527iyR interfaceC25527iyR = this.AYXKKw;
        if (interfaceC25527iyR != null) {
            long jValueOf = c26356jal.valueOf();
            long jKWHzl = c26356jal.KWHzl();
            interfaceC25527iyR.KWHzl(Long.valueOf(jValueOf), Long.valueOf(jKWHzl), c26356jal.OLrzqt());
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DeFiUnifiedRewardsBottomSheet$onClaimToken$1(this, c26356jal, investUserRewardElementInfo, null), 3, null);
    }

    public final void KWHzl(C26356jal c26356jal) {
        InterfaceC25527iyR interfaceC25527iyR = this.AYXKKw;
        if (interfaceC25527iyR != null) {
            long jValueOf = c26356jal.valueOf();
            long jKWHzl = c26356jal.KWHzl();
            interfaceC25527iyR.KWHzl(Long.valueOf(jValueOf), Long.valueOf(jKWHzl), c26356jal.OLrzqt());
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DeFiUnifiedRewardsBottomSheet$onClaimSection$1(this, c26356jal, null), 3, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.valueOf = null;
        this.AYXKKw = null;
        this.KWHzl = null;
        this.djBIcL = null;
        super.onDestroyView();
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope KWHzl() {
        return LifecycleOwnerKt.getLifecycleScope(this);
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
    }

    @Override // o.InterfaceC25466ixJ
    public FragmentManager OLrzqt() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        return parentFragmentManager;
    }

    /* JADX DEBUG: Possible override for method o.jan.AEQbTJ()V */
    @Override // o.InterfaceC25466ixJ
    public Context AEQbTJ() {
        return getContext();
    }

    @Override // o.InterfaceC25466ixJ
    public AbstractActivityC33041mov EZpvd() {
        FragmentActivity activity = getActivity();
        if (activity instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) activity;
        }
        return null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsBottomSheet.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final DeFiUnifiedRewardsBottomSheet OLrzqt(@NotNull DeFiUnifiedRewardsParams deFiUnifiedRewardsParams) {
            Intrinsics.checkNotNullParameter(deFiUnifiedRewardsParams, "");
            DeFiUnifiedRewardsBottomSheet deFiUnifiedRewardsBottomSheet = new DeFiUnifiedRewardsBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.params_defi_unified_rewards", deFiUnifiedRewardsParams);
            deFiUnifiedRewardsBottomSheet.setArguments(bundle);
            return deFiUnifiedRewardsBottomSheet;
        }
    }
}
