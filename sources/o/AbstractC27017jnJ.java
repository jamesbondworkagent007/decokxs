package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.ZapSubBaseFragment$initView$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jnJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC27017jnJ extends AbstractC27046jnm {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int ejfBZ = 8;
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.jnK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC27017jnJ.KWHzl(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm fARcdN;

    /* JADX INFO: renamed from: o.jnJ$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    public abstract void AEQbTJ();

    public abstract void AEQbTJ(boolean z);

    /* JADX INFO: renamed from: o.jnJ$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jnJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public AbstractC27017jnJ() {
        final Function0 function0 = null;
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestUniv3SubscribeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.ZapSubBaseFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.ZapSubBaseFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.ZapSubBaseFragment$special$$inlined$activityViewModels$default$3
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

    public final InvestUniv3SubscribeViewModel AYXKKw() {
        return (InvestUniv3SubscribeViewModel) this.fARcdN.getValue();
    }

    public final InvestUniv3SubscribeInfo valueOf() {
        return (InvestUniv3SubscribeInfo) this.AuCTel.getValue();
    }

    public static final InvestUniv3SubscribeInfo KWHzl(AbstractC27017jnJ abstractC27017jnJ) {
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo;
        android.os.Bundle arguments = abstractC27017jnJ.getArguments();
        if (arguments == null || (investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) arguments.getParcelable("args")) == null) {
            throw new java.lang.IllegalStateException("Must provide params");
        }
        return investUniv3SubscribeInfo;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ZapSubBaseFragment$initView$1(this, null), 3, null);
        AYXKKw().ORxRYg().observe(this, new TaskDescription(new Function1() { // from class: o.jnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC27017jnJ.EZpvd(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(AbstractC27017jnJ abstractC27017jnJ, java.lang.Boolean bool) {
        if (!bool.booleanValue()) {
            return Unit.INSTANCE;
        }
        if (abstractC27017jnJ.isResumed()) {
            abstractC27017jnJ.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public final C25480ixX AEQbTJ(@NotNull InvestUniv3SubscribeInfo investUniv3SubscribeInfo, int i) {
        Intrinsics.checkNotNullParameter(investUniv3SubscribeInfo, "");
        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investUniv3SubscribeInfo.getInvestWithTokenList(), i);
        if (investTokenWithAmount != null) {
            return KWHzl(investTokenWithAmount, true);
        }
        return null;
    }

    public static /* synthetic */ C25480ixX toInputUIBean$default(AbstractC27017jnJ abstractC27017jnJ, InvestTokenWithAmount investTokenWithAmount, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toInputUIBean");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return abstractC27017jnJ.KWHzl(investTokenWithAmount, z);
    }

    public final C25480ixX KWHzl(@NotNull InvestTokenWithAmount investTokenWithAmount, boolean z) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return new C25480ixX(z ? "0" : investTokenWithAmount.getCoinAmount(), investTokenWithAmount.getTokenSymbol(), investTokenWithAmount.getTokenLogo(), z ? "0" : investTokenWithAmount.getCurrencyAmount(), false, OLrzqt(investTokenWithAmount.isBaseToken(), investTokenWithAmount.getCoinAmount()), false, false, false, null, C33129mqd.AhwBna(investTokenWithAmount.getTokenPrecision()), investTokenWithAmount.getCoinAmount(), false, 5072, null);
    }

    public final boolean OLrzqt(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return z && C33129mqd.gEmmrt(str, valueOf().getReserveFee());
    }

    public final void gEmmrt() {
        java.lang.Boolean value = AYXKKw().ORxRYg().getValue();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(value, bool)) {
            AYXKKw().DTwDnp().setValue(bool);
        }
    }

    public final java.util.List<C27021jnN> OLrzqt(@NotNull InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo) {
        Intrinsics.checkNotNullParameter(investUniv3SubscribeReceiveInfo, "");
        java.util.List<InvestTokenWithAmount> swapToTokenList = investUniv3SubscribeReceiveInfo.getSwapToTokenList();
        java.util.ArrayList<InvestTokenWithAmount> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(swapToTokenList, 10));
        for (InvestTokenWithAmount investTokenWithAmount : swapToTokenList) {
            arrayList.add(investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : C23626iDi.EZpvd(investTokenWithAmount, (InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)), (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), false, 2, null), (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InvestTokenWithAmount investTokenWithAmount2 : arrayList) {
            arrayList2.add(new C27021jnN(investTokenWithAmount2.getTokenSymbol(), investTokenWithAmount2.getCoinAmount(), investTokenWithAmount2.getCurrencyAmount()));
        }
        return arrayList2;
    }
}
