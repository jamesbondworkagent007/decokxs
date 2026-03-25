package o;

import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.OKAppBarLayoutBehavior;
import com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetOverviewCoinDetailFragment$initFlowListener$1;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetOverviewViewModel;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C57439yiT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class eYA extends AbstractC32998moE {
    public final InterfaceC56387yDm AYXKKw;
    public Function2<? super C19419gBr, ? super java.lang.Integer, Unit> AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public boolean OLrzqt;
    public AddressTokenAsset copydefault;
    public AbstractC16581emd gEmmrt;
    public C57439yiT.Application values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final int djBIcL = C13754dXa.TaskDescription.DGUQLIhJrIAr;
    public final C43316rmw valueOf = new C43316rmw();
    public java.lang.String EZpvd = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function2<? super C19419gBr, ? super java.lang.Integer, Unit> function2) {
        this.AhwBna = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public eYA() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressProfileAssetOverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetOverviewCoinDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetOverviewCoinDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetOverviewCoinDetailFragment$special$$inlined$activityViewModels$default$3
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19503gEu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetOverviewCoinDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetOverviewCoinDetailFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetOverviewCoinDetailFragment$special$$inlined$activityViewModels$default$6
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

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eYA.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final eYA EZpvd(@NotNull AddressTokenAsset addressTokenAsset, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(addressTokenAsset, "");
            Intrinsics.checkNotNullParameter(str, "");
            eYA eya = new eYA();
            eya.copydefault = addressTokenAsset;
            eya.EZpvd = str;
            return eya;
        }
    }

    public final AddressProfileAssetOverviewViewModel KWHzl() {
        return (AddressProfileAssetOverviewViewModel) this.AYXKKw.getValue();
    }

    private final C19503gEu AEQbTJ() {
        return (C19503gEu) this.KWHzl.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        AbstractC16581emd abstractC16581emd = (AbstractC16581emd) viewDataBindingBind;
        this.gEmmrt = abstractC16581emd;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16581emd.KWHzl.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            OKAppBarLayoutBehavior oKAppBarLayoutBehavior = new OKAppBarLayoutBehavior(null, null, 3, null);
            oKAppBarLayoutBehavior.setLimitId(C13754dXa.ActionBar.ZNPcth);
            layoutParams2.setBehavior(oKAppBarLayoutBehavior);
            AbstractC16581emd abstractC16581emd2 = this.gEmmrt;
            if (abstractC16581emd2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd2 = null;
            }
            abstractC16581emd2.KWHzl.setLayoutParams(layoutParams2);
            AbstractC16581emd abstractC16581emd3 = this.gEmmrt;
            if (abstractC16581emd3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd3 = null;
            }
            abstractC16581emd3.KWHzl.requestLayout();
        }
        AbstractC16581emd abstractC16581emd4 = this.gEmmrt;
        if (abstractC16581emd4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd4 = null;
        }
        abstractC16581emd4.KWHzl.setOnClickListener(null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd();
        this.values = new Activity();
        AbstractC16581emd abstractC16581emd = this.gEmmrt;
        AbstractC16581emd abstractC16581emd2 = null;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        abstractC16581emd.EZpvd.setOnSelectedListener(this.values);
        OLrzqt();
        copydefault();
        AbstractC16581emd abstractC16581emd3 = this.gEmmrt;
        if (abstractC16581emd3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd3 = null;
        }
        abstractC16581emd3.AYXKKw.setVisibility(8);
        view.post(new java.lang.Runnable() { // from class: o.eYH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eYA.djBIcL(this.AEQbTJ);
            }
        });
        AbstractC16581emd abstractC16581emd4 = this.gEmmrt;
        if (abstractC16581emd4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd4 = null;
        }
        abstractC16581emd4.values.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        AbstractC16581emd abstractC16581emd5 = this.gEmmrt;
        if (abstractC16581emd5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16581emd2 = abstractC16581emd5;
        }
        C33546myW c33546myW = abstractC16581emd2.isConnected;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.eYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                eYA.KWHzl(this.OLrzqt, interfaceC57934yrl);
            }
        });
        c33546myW.AhwBna(false);
    }

    public static final class Activity implements C57439yiT.Application {
        public Activity() {
        }

        @Override // o.C57439yiT.Application
        public void KWHzl(int i, C57439yiT.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            eYA.this.OLrzqt = true;
            eYA.this.copydefault(stateListAnimator);
            C14724dqp.EZpvd.AEQbTJ(100L);
        }

        @Override // o.C57439yiT.Application
        public void EZpvd() {
            AddressTokenAsset addressTokenAsset = eYA.this.copydefault;
            if (addressTokenAsset != null) {
                eYA eya = eYA.this;
                eya.OLrzqt = false;
                eya.copydefault(addressTokenAsset);
                C14724dqp.EZpvd.AEQbTJ(100L);
            }
        }
    }

    public static final void djBIcL(eYA eya) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) eya, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void KWHzl(eYA eya, InterfaceC57934yrl interfaceC57934yrl) {
        java.lang.String symbol;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        AddressProfileAssetOverviewViewModel addressProfileAssetOverviewViewModelKWHzl = eya.KWHzl();
        AddressTokenAsset addressTokenAsset = eya.copydefault;
        if (addressTokenAsset != null && (symbol = addressTokenAsset.getSymbol()) != null) {
            str = symbol;
        }
        addressProfileAssetOverviewViewModelKWHzl.OLrzqt(str, eya.EZpvd);
        eya.AEQbTJ().copydefault(eya.AEQbTJ().copydefault());
    }

    public final void copydefault() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new ProfileAssetOverviewCoinDetailFragment$initFlowListener$1(this, null));
    }

    public final void OLrzqt() {
        AddressTokenAsset addressTokenAsset = this.copydefault;
        if (addressTokenAsset != null) {
            if (!this.OLrzqt) {
                copydefault(addressTokenAsset);
            }
            java.util.List<AddressCoinBalanceDetail> coinBalanceDetails = addressTokenAsset.getCoinBalanceDetails();
            if (coinBalanceDetails != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(coinBalanceDetails, 10));
                java.util.Iterator<T> it = coinBalanceDetails.iterator();
                while (true) {
                    int iAkhnZx = 6;
                    if (!it.hasNext()) {
                        break;
                    }
                    AddressCoinBalanceDetail addressCoinBalanceDetail = (AddressCoinBalanceDetail) it.next();
                    C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                    java.lang.String address = addressCoinBalanceDetail.getAddress();
                    C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(address != null ? address : "", addressCoinBalanceDetail.getChainIndex());
                    java.lang.String chainImageUrl = addressCoinBalanceDetail.getChainImageUrl();
                    java.lang.String tokenType = addressCoinBalanceDetail.getTokenType();
                    java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.divB$default(addressCoinBalanceDetail.getCurrencyAmount(), addressTokenAsset.getCurrencyAmount(), 0, null, 6, null), false, null, null, 7, null);
                    java.lang.String strOLrzqt = C54870xYj.OLrzqt(addressCoinBalanceDetail.getCoinAmount(), (249 & 1) != 0 ? 0 : 0, c10854bwMEZpvd != null ? c10854bwMEZpvd.AkhnZx() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                    java.lang.String coinAmount = addressCoinBalanceDetail.getCoinAmount();
                    if (c10854bwMEZpvd != null) {
                        iAkhnZx = c10854bwMEZpvd.AkhnZx();
                    }
                    arrayList.add(new C19419gBr(0L, 0L, chainImageUrl, tokenType, "", 0, strConvertToString$default, strOLrzqt, C54870xYj.OLrzqt(coinAmount, (249 & 1) != 0 ? 0 : 0, iAkhnZx, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null), C54880xYt.formatValuationFromAsset$default(addressCoinBalanceDetail.getCurrencyAmount(), null, false, 0, false, 15, null), addressCoinBalanceDetail.getCurrencyAmount(), false, null, false, false, 30723, null));
                }
                C33064mpR.OLrzqt(this.valueOf, (java.util.List<? extends java.lang.Object>) arrayList);
                AbstractC16581emd abstractC16581emd = null;
                if (!this.OLrzqt) {
                    AbstractC16581emd abstractC16581emd2 = this.gEmmrt;
                    if (abstractC16581emd2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16581emd2 = null;
                    }
                    C57439yiT c57439yiT = abstractC16581emd2.EZpvd;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(coinBalanceDetails, 10));
                    for (AddressCoinBalanceDetail addressCoinBalanceDetail2 : coinBalanceDetails) {
                        java.lang.String address2 = addressCoinBalanceDetail2.getAddress();
                        C10854bwM c10854bwMEZpvd2 = address2 != null ? C10954byG.EZpvd.valueOf().EZpvd(address2, C33129mqd.valueOf(java.lang.Long.valueOf(addressCoinBalanceDetail2.getChainIndex()))) : null;
                        arrayList2.add(new C57444yiY(addressCoinBalanceDetail2.getTokenType(), C33129mqd.AEQbTJ(C54862xYb.convertToString$default(C54862xYb.divB$default(addressCoinBalanceDetail2.getCurrencyAmount(), addressTokenAsset.getCurrencyAmount(), 0, null, 6, null), false, null, null, 7, null)), C33129mqd.AEQbTJ(addressCoinBalanceDetail2.getCoinAmount()), C33129mqd.AEQbTJ(addressCoinBalanceDetail2.getCurrencyAmount()), c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.AkhnZx() : 6));
                    }
                    C57439yiT.setData$default(c57439yiT, arrayList2, null, new Function1() { // from class: o.eYz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return eYA.AEQbTJ(((java.lang.Double) obj).doubleValue());
                        }
                    }, 2, null);
                }
                AbstractC16581emd abstractC16581emd3 = this.gEmmrt;
                if (abstractC16581emd3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16581emd3 = null;
                }
                CardView cardView = abstractC16581emd3.fetchVPNInfo;
                AbstractC16581emd abstractC16581emd4 = this.gEmmrt;
                if (abstractC16581emd4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16581emd = abstractC16581emd4;
                }
                cardView.setVisibility(abstractC16581emd.EZpvd.getVisibility());
            }
        }
    }

    public static final java.lang.String AEQbTJ(double d) {
        return C54873xYm.formatPriceChangePercentage$default(C33129mqd.EZpvd(java.lang.Double.valueOf(d)), 0, 0, true, DisplaySign.AUTO, null, 19, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(AddressTokenAsset addressTokenAsset) {
        java.lang.String address;
        java.lang.String strOLrzqt;
        java.lang.String valuationFromAsset$default;
        java.util.List<AddressCoinBalanceDetail> coinBalanceDetails = addressTokenAsset.getCoinBalanceDetails();
        AbstractC16581emd abstractC16581emd = null;
        AddressCoinBalanceDetail addressCoinBalanceDetail = coinBalanceDetails != null ? (AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.firstOrNull(coinBalanceDetails) : null;
        java.lang.Long lValueOf = addressCoinBalanceDetail != null ? java.lang.Long.valueOf(addressCoinBalanceDetail.getChainIndex()) : null;
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        if (addressCoinBalanceDetail == null || (address = addressCoinBalanceDetail.getAddress()) == null) {
            address = "";
        }
        C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(address, C33129mqd.valueOf(lValueOf));
        AbstractC16581emd abstractC16581emd2 = this.gEmmrt;
        if (abstractC16581emd2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd2 = null;
        }
        gBL gbl = abstractC16581emd2.OLrzqt;
        java.lang.String coinAmount = addressTokenAsset.getCoinAmount();
        java.lang.String str = "--";
        if (coinAmount == null) {
            strOLrzqt = "--";
        } else {
            strOLrzqt = C54870xYj.OLrzqt(coinAmount, (249 & 1) != 0 ? 0 : 0, c10854bwMEZpvd != null ? c10854bwMEZpvd.AkhnZx() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            if (strOLrzqt == null) {
            }
        }
        gbl.setCoinCount(strOLrzqt, false);
        AbstractC16581emd abstractC16581emd3 = this.gEmmrt;
        if (abstractC16581emd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16581emd = abstractC16581emd3;
        }
        gBL gbl2 = abstractC16581emd.OLrzqt;
        java.lang.String currencyAmount = addressTokenAsset.getCurrencyAmount();
        if (currencyAmount != null && (valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(currencyAmount, null, false, 0, false, 15, null)) != null) {
            str = valuationFromAsset$default;
        }
        gbl2.setValuation(str);
    }

    private final void EZpvd() {
        AbstractC16581emd abstractC16581emd = this.gEmmrt;
        AbstractC16581emd abstractC16581emd2 = null;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        abstractC16581emd.AkhnZx.setLayoutManager(new LinearLayoutManager(getContext()));
        AbstractC16581emd abstractC16581emd3 = this.gEmmrt;
        if (abstractC16581emd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16581emd2 = abstractC16581emd3;
        }
        abstractC16581emd2.AkhnZx.setAdapter(this.valueOf);
        C43316rmw c43316rmw = this.valueOf;
        C19398gAx c19398gAx = new C19398gAx(new Function2() { // from class: o.eYG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return eYA.OLrzqt(this.OLrzqt, (C19419gBr) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        c19398gAx.KWHzl(true);
        Unit unit = Unit.INSTANCE;
        c43316rmw.register(C19419gBr.class, c19398gAx);
    }

    public static final Unit OLrzqt(eYA eya, C19419gBr c19419gBr, int i) {
        Intrinsics.checkNotNullParameter(c19419gBr, "");
        Function2<? super C19419gBr, ? super java.lang.Integer, Unit> function2 = eya.AhwBna;
        if (function2 != null) {
            function2.invoke(c19419gBr, java.lang.Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(C57439yiT.StateListAnimator stateListAnimator) {
        AbstractC16581emd abstractC16581emd = this.gEmmrt;
        AbstractC16581emd abstractC16581emd2 = null;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        gBL gbl = abstractC16581emd.OLrzqt;
        java.util.Iterator<T> it = stateListAnimator.OLrzqt().iterator();
        double dCopydefault = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dOLrzqt = 0.0d;
        while (it.hasNext()) {
            dOLrzqt += ((C57444yiY) it.next()).OLrzqt();
        }
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C33129mqd.EZpvd(java.lang.Double.valueOf(dOLrzqt)), false, null, null, 7, null);
        C57444yiY c57444yiY = (C57444yiY) CollectionsKt___CollectionsKt.firstOrNull(stateListAnimator.OLrzqt());
        gBL.setCoinCount$default(gbl, C54870xYj.OLrzqt(strConvertToString$default, (249 & 1) != 0 ? 0 : 0, c57444yiY != null ? c57444yiY.EZpvd() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null), false, 2, null);
        AbstractC16581emd abstractC16581emd3 = this.gEmmrt;
        if (abstractC16581emd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16581emd2 = abstractC16581emd3;
        }
        gBL gbl2 = abstractC16581emd2.OLrzqt;
        java.util.Iterator<T> it2 = stateListAnimator.OLrzqt().iterator();
        while (it2.hasNext()) {
            dCopydefault += ((C57444yiY) it2.next()).copydefault();
        }
        gbl2.setValuation(C54880xYt.formatValuationFromAsset$default(C54862xYb.convertToString$default(C33129mqd.EZpvd(java.lang.Double.valueOf(dCopydefault)), false, null, null, 7, null), null, false, 0, false, 15, null));
    }
}
