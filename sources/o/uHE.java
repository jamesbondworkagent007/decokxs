package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.botDetail.ui.BotDetailLeadInfoFragment$initViewModel$1;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewViewModel;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class uHE extends AbstractC48197uIo {
    public final int EZpvd = C48033uCm.Activity.DLGVGj;
    public uRM KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public uHE() {
        final Function0 function0 = new Function0() { // from class: o.uHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uHE.AEQbTJ(this.OLrzqt);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailLeadInfoFragment$special$$inlined$viewModels$default$1
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailLeadInfoFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailLeadInfoFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailLeadInfoFragment$special$$inlined$viewModels$default$4
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailLeadInfoFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailLeadInfoFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailLeadInfoFragment$special$$inlined$activityViewModels$default$3
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

    public static final ViewModelStoreOwner AEQbTJ(uHE uhe) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = uhe.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    private final OverviewViewModel AYXKKw() {
        return (OverviewViewModel) this.OLrzqt.getValue();
    }

    private final TacticsDetailPresenter OLrzqt() {
        return (TacticsDetailPresenter) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StrategyDetailsResponse valueOf() {
        return OLrzqt().AhwBna();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout root;
        Intrinsics.checkNotNullParameter(view, "");
        uRM urmEZpvd = uRM.EZpvd(view);
        this.KWHzl = urmEZpvd;
        if (urmEZpvd != null && (root = urmEZpvd.getRoot()) != null) {
            root.setVisibility(8);
        }
        AhwBna();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r0.equals("contract_grid") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.equals("contract_dca") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r0.equals("spot_dca") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0.equals("grid") == false) goto L19;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AhwBna() {
        C52692wUv.EZpvd(AYXKKw().EZpvd(), this, Lifecycle.State.CREATED, new BotDetailLeadInfoFragment$initViewModel$1(this, null));
        if (Intrinsics.EZpvd((java.lang.Object) valueOf().getCopyType(), (java.lang.Object) "3")) {
            java.lang.String orderType = valueOf().getOrderType();
            switch (orderType.hashCode()) {
                case -1831183611:
                    break;
                case -1402017003:
                    break;
                case -512749997:
                    break;
                case 3181382:
                    break;
            }
            AYXKKw().copydefault(valueOf().getAlgoId());
            return;
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
        ConstraintLayout root;
        if (botLeadProfitProfitOrderDetails == null) {
            uRM urm = this.KWHzl;
            if (urm == null || (root = urm.getRoot()) == null) {
                return;
            }
            root.setVisibility(8);
            return;
        }
        uRM urm2 = this.KWHzl;
        if (urm2 != null) {
            ConstraintLayout root2 = urm2.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            root2.setVisibility(0);
            uNT unt = urm2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(unt, "");
            int i = C55688xof.Application.onRemoveQueueItem;
            java.lang.String profitSharingCcy = botLeadProfitProfitOrderDetails.getProfitSharingCcy();
            if (profitSharingCcy == null) {
                profitSharingCcy = "";
            }
            java.lang.String strCopydefault = C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy)));
            java.lang.String estimatedProfitSharing = botLeadProfitProfitOrderDetails.getEstimatedProfitSharing();
            java.lang.String str = estimatedProfitSharing == null ? "" : estimatedProfitSharing;
            java.lang.String profitSharingCcy2 = botLeadProfitProfitOrderDetails.getProfitSharingCcy();
            KWHzl(unt, 8388611, strCopydefault, C56033xvF.getBotPnl$default("", "", str, profitSharingCcy2 == null ? "" : profitSharingCcy2, false, false, null, false, null, null, null, 2032, null), java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) botLeadProfitProfitOrderDetails.getEstimatedProfitSharing())));
            uNT unt2 = urm2.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(unt2, "");
            int i2 = C55688xof.Application.onPlayFromUri;
            java.lang.String profitSharingCcy3 = botLeadProfitProfitOrderDetails.getProfitSharingCcy();
            if (profitSharingCcy3 == null) {
                profitSharingCcy3 = "";
            }
            java.lang.String strCopydefault2 = C33069mpW.copydefault(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy3)));
            java.lang.String accumulatedProfitSharing = botLeadProfitProfitOrderDetails.getAccumulatedProfitSharing();
            java.lang.String str2 = accumulatedProfitSharing == null ? "" : accumulatedProfitSharing;
            java.lang.String profitSharingCcy4 = botLeadProfitProfitOrderDetails.getProfitSharingCcy();
            KWHzl(unt2, 8388613, strCopydefault2, C56033xvF.getBotPnl$default("", "", str2, profitSharingCcy4 == null ? "" : profitSharingCcy4, false, false, null, false, null, null, null, 2032, null), java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) botLeadProfitProfitOrderDetails.getAccumulatedProfitSharing())));
            uNT unt3 = urm2.copydefault;
            Intrinsics.checkNotNullExpressionValue(unt3, "");
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2);
            java.lang.String profitSharingRatio = botLeadProfitProfitOrderDetails.getProfitSharingRatio();
            if (profitSharingRatio == null) {
                profitSharingRatio = "";
            }
            setupBlock$default(this, unt3, 8388611, strAYXKKw, pTB.formatICUPercent$default(C33129mqd.EZpvd(profitSharingRatio), null, C38307pTy.Companion.KWHzl(0, 2), null, java.lang.Double.valueOf(100.0d), null, 21, null), null, 16, null);
            uNT unt4 = urm2.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(unt4, "");
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setCallback);
            java.lang.String followerCount = botLeadProfitProfitOrderDetails.getFollowerCount();
            if (followerCount == null) {
                followerCount = "0";
            }
            setupBlock$default(this, unt4, 8388611, strAYXKKw2, followerCount, null, 16, null);
            uNT unt5 = urm2.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(unt5, "");
            int i3 = C55688xof.Application.MediaSessionCompatCallbackStubApi21;
            java.lang.String profitSharingCcy5 = botLeadProfitProfitOrderDetails.getProfitSharingCcy();
            if (profitSharingCcy5 == null) {
                profitSharingCcy5 = "";
            }
            java.lang.String strCopydefault3 = C33069mpW.copydefault(this, i3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy5)));
            java.lang.String instId = valueOf().getInstId();
            java.lang.String instType = valueOf().getInstType();
            java.lang.String followerAssets = botLeadProfitProfitOrderDetails.getFollowerAssets();
            setupBlock$default(this, unt5, 8388613, strCopydefault3, C56033xvF.getBotPnl$default(instId, instType, followerAssets == null ? "" : followerAssets, null, false, false, null, false, null, null, null, 2008, null), null, 16, null);
            AppCompatTextView appCompatTextView = urm2.EZpvd;
            appCompatTextView.setOnClickListener(new TaskDescription(appCompatTextView, 1000L, this, botLeadProfitProfitOrderDetails));
        }
    }

    public static final class StateListAnimator implements Function0<java.lang.String> {
        public final /* synthetic */ BotLeadProfitProfitOrderDetails KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
            this.KWHzl = botLeadProfitProfitOrderDetails;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            java.lang.String profitSharingCcy = this.KWHzl.getProfitSharingCcy();
            return profitSharingCcy == null ? "" : profitSharingCcy;
        }
    }

    public static /* synthetic */ void setupBlock$default(uHE uhe, uNT unt, int i, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            num = null;
        }
        uhe.KWHzl(unt, i, str, str2, num);
    }

    public final void KWHzl(uNT unt, int i, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        unt.getRoot().setGravity(i);
        C55320xhi c55320xhi = unt.AEQbTJ;
        c55320xhi.setGravity(i);
        c55320xhi.setText(str);
        C55320xhi c55320xhi2 = unt.EZpvd;
        c55320xhi2.setGravity(i);
        c55320xhi2.setText(str2);
        if (num != null) {
            c55320xhi2.setTextColor(num.intValue());
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ uHE EZpvd;
        public final /* synthetic */ BotLeadProfitProfitOrderDetails OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, uHE uhe, BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = uhe;
            this.OLrzqt = botLeadProfitProfitOrderDetails;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C52555wPt c52555wPtAEQbTJ = C52555wPt.Companion.AEQbTJ(this.EZpvd.valueOf().getAlgoId(), new StateListAnimator(this.OLrzqt));
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c52555wPtAEQbTJ.show(childFragmentManager);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.KWHzl = null;
        super.onDestroyView();
    }
}
