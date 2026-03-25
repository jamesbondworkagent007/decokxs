package o;

import android.graphics.drawable.InsetDrawable;
import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.meme.holder_info.domain.model.HolderInfoData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.DevTokenTabViewModel;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28796khY;
import o.InterfaceC28856kif;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28793khV extends AbstractC28862kil<C21457hAb> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public HolderInfoData AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public jNU EZpvd;
    public jOR KWHzl;
    public LinearLayoutManager gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AYXKKw() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String djBIcL() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String gEmmrt() {
        return "--";
    }

    public C28793khV() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DevTokenTabFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DevTokenTabFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DevTokenTabViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DevTokenTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DevTokenTabFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DevTokenTabFragment$special$$inlined$viewModels$default$5
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

    public final DevTokenTabViewModel fetchVPNInfo() {
        return (DevTokenTabViewModel) this.AYXKKw.getValue();
    }

    private final TokenDetailCommonParams AkhnZx() {
        TokenDetailCommonParams tokenDetailCommonParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (tokenDetailCommonParams = (TokenDetailCommonParams) BundleCompat.getParcelable(arguments, "common_data", TokenDetailCommonParams.class)) == null) ? new TokenDetailCommonParams(null, null, null, null, null, false, false, null, null, false, 1023, null) : tokenDetailCommonParams;
    }

    public final TokenDetailTabData.DevTokenTab valueOf() {
        TokenDetailTabData.DevTokenTab devTokenTab;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (devTokenTab = (TokenDetailTabData.DevTokenTab) BundleCompat.getParcelable(arguments, "dev_token_data", TokenDetailTabData.DevTokenTab.class)) == null) ? new TokenDetailTabData.DevTokenTab(null, null, false, null, 15, null) : devTokenTab;
    }

    /* JADX INFO: renamed from: o.khV$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.khV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C28793khV OLrzqt(@NotNull TokenDetailCommonParams tokenDetailCommonParams, @NotNull TokenDetailTabData.DevTokenTab devTokenTab) {
            Intrinsics.checkNotNullParameter(tokenDetailCommonParams, "");
            Intrinsics.checkNotNullParameter(devTokenTab, "");
            C28793khV c28793khV = new C28793khV();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("common_data", tokenDetailCommonParams);
            bundle.putParcelable("dev_token_data", devTokenTab);
            c28793khV.setArguments(bundle);
            return c28793khV;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C21457hAb KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21457hAb c21457hAbCopydefault = C21457hAb.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21457hAbCopydefault, "");
        return c21457hAbCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21457hAb c21457hAb, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21457hAb, "");
        fJNWhG();
        AuCTel();
        fIwbmz();
        DevTokenTabViewModel.loadData$default(fetchVPNInfo(), AkhnZx().KWHzl(), AkhnZx().djBIcL(), valueOf().AEQbTJ(), 0, 0, 24, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        C55173xeu c55173xeu;
        C21457hAb c21457hAb = (C21457hAb) aX_();
        if (c21457hAb == null || (c55173xeu = c21457hAb.OLrzqt) == null) {
            return;
        }
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C28793khV.EZpvd(this.EZpvd, view);
            }
        });
    }

    public static final void EZpvd(C28793khV c28793khV, android.view.View view) {
        c28793khV.valueOf = false;
        DevTokenTabViewModel.loadData$default(c28793khV.fetchVPNInfo(), c28793khV.AkhnZx().KWHzl(), c28793khV.AkhnZx().djBIcL(), c28793khV.valueOf().AEQbTJ(), 0, 0, 24, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        RecyclerView recyclerView;
        C21457hAb c21457hAb = (C21457hAb) aX_();
        if (c21457hAb == null || (recyclerView = c21457hAb.KWHzl) == null) {
            return;
        }
        this.KWHzl = new jOR(new Function1() { // from class: o.kic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28793khV.OLrzqt(this.KWHzl, (TokenBase) obj);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.gEmmrt = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.KWHzl);
        recyclerView.addOnScrollListener(new StateListAnimator(new Function0() { // from class: o.kib
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28793khV.OLrzqt(this.EZpvd);
            }
        }));
    }

    public static final Unit OLrzqt(C28793khV c28793khV, TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        c28793khV.OLrzqt(tokenBase);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.khV$StateListAnimator */
    public static final class StateListAnimator extends kME {
        public StateListAnimator(Function0<? extends LinearLayoutManager> function0) {
            super(5, function0);
        }

        @Override // o.kME
        public void AEQbTJ() {
            if (C28793khV.this.fetchVPNInfo().EZpvd()) {
                C28793khV.this.fetchVPNInfo().copydefault();
            }
        }
    }

    public static final LinearLayoutManager OLrzqt(C28793khV c28793khV) {
        return c28793khV.gEmmrt;
    }

    /* JADX INFO: renamed from: o.khV$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28856kif interfaceC28856kif, Continuation<? super Unit> continuation) {
            C28793khV.this.KWHzl(interfaceC28856kif);
            return Unit.INSTANCE;
        }
    }

    private final void fIwbmz() {
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().AEQbTJ(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().OLrzqt(), null, new Application(), 2, null);
    }

    /* JADX INFO: renamed from: o.khV$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28796khY interfaceC28796khY, Continuation<? super Unit> continuation) {
            C28793khV.this.copydefault(interfaceC28796khY);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(InterfaceC28856kif interfaceC28856kif) {
        C21457hAb c21457hAb = (C21457hAb) aX_();
        if (c21457hAb != null) {
            C55173xeu c55173xeu = c21457hAb.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(interfaceC28856kif instanceof InterfaceC28856kif.ActionBar ? 0 : 8);
            C55113xdn c55113xdn = c21457hAb.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(interfaceC28856kif instanceof InterfaceC28856kif.Application ? 0 : 8);
            RecyclerView recyclerView = c21457hAb.KWHzl;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            boolean z = interfaceC28856kif instanceof InterfaceC28856kif.StateListAnimator;
            recyclerView.setVisibility(z ? 0 : 8);
            if (!z) {
                this.valueOf = false;
                return;
            }
            InterfaceC28856kif.StateListAnimator stateListAnimator = (InterfaceC28856kif.StateListAnimator) interfaceC28856kif;
            this.EZpvd = stateListAnimator.EZpvd();
            if (!this.valueOf) {
                EZpvd(stateListAnimator.EZpvd(), this.AEQbTJ);
                this.valueOf = true;
            }
            jOR jor = this.KWHzl;
            if (jor != null) {
                jor.submitList(stateListAnimator.OLrzqt());
            }
        }
    }

    public final void copydefault(InterfaceC28796khY interfaceC28796khY) {
        if (interfaceC28796khY instanceof InterfaceC28796khY.Activity) {
            return;
        }
        if (interfaceC28796khY instanceof InterfaceC28796khY.TaskDescription) {
            InterfaceC28796khY.TaskDescription taskDescription = (InterfaceC28796khY.TaskDescription) interfaceC28796khY;
            this.AEQbTJ = taskDescription.OLrzqt();
            jNU jnu = this.EZpvd;
            if (jnu != null) {
                EZpvd(jnu, taskDescription.OLrzqt());
                return;
            }
            return;
        }
        if (!(interfaceC28796khY instanceof InterfaceC28796khY.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ void setupHeaderData$default(C28793khV c28793khV, jNU jnu, HolderInfoData holderInfoData, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            holderInfoData = null;
        }
        c28793khV.EZpvd(jnu, holderInfoData);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(final jNU jnu, final HolderInfoData holderInfoData) {
        java.lang.String str;
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        int iKWHzl;
        int iKWHzl2;
        java.lang.String first;
        java.lang.String fundingSourceTime;
        java.lang.String fundingSourceAddress;
        java.lang.String nativeTokenHoldAmount;
        java.lang.String strKWHzl3;
        jOR jor = this.KWHzl;
        if (jor != null) {
            jor.KWHzl(valueOf().OLrzqt());
        }
        android.content.Context context = getContext();
        kotlin.Pair<java.lang.String, java.lang.Integer> pairEZpvd = context != null ? C28926kjw.EZpvd(valueOf().copydefault(), valueOf().KWHzl(), context) : null;
        if (holderInfoData == null || (nativeTokenHoldAmount = holderInfoData.getNativeTokenHoldAmount()) == null) {
            str = "--";
        } else {
            java.lang.String tokenCode$default = C33129mqd.OLrzqt((java.lang.CharSequence) nativeTokenHoldAmount) ? C23271hvA.formatTokenCode$default(C23271hvA.copydefault, nativeTokenHoldAmount, true, null, false, holderInfoData.getNativeTokenSymbol(), null, 22, null) : "";
            if (tokenCode$default != null && (strKWHzl3 = C31256lqb.KWHzl(tokenCode$default, (Function0<java.lang.String>) new Function0() { // from class: o.khW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28793khV.gEmmrt();
                }
            })) != null) {
                str = strKWHzl3;
            }
        }
        if (holderInfoData == null || (fundingSourceAddress = holderInfoData.getFundingSourceAddress()) == null) {
            strKWHzl = "--";
        } else {
            java.lang.String strOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) fundingSourceAddress) ? C25352ivB.OLrzqt(fundingSourceAddress) : "";
            if (strOLrzqt == null || (strKWHzl = C31256lqb.KWHzl(strOLrzqt, (Function0<java.lang.String>) new Function0() { // from class: o.khU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28793khV.AYXKKw();
                }
            })) == null) {
            }
        }
        if (holderInfoData == null || (fundingSourceTime = holderInfoData.getFundingSourceTime()) == null) {
            strKWHzl2 = "--";
        } else {
            java.lang.String strKWHzl4 = C33129mqd.OLrzqt((java.lang.CharSequence) fundingSourceTime) ? C25322iuY.OLrzqt.KWHzl(fundingSourceTime) : "";
            if (strKWHzl4 == null || (strKWHzl2 = C31256lqb.KWHzl(strKWHzl4, (Function0<java.lang.String>) new Function0() { // from class: o.khX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28793khV.djBIcL();
                }
            })) == null) {
            }
        }
        jOR jor2 = this.KWHzl;
        if (jor2 != null) {
            C26047jPz[] c26047jPzArr = new C26047jPz[8];
            c26047jPzArr[0] = new C26047jPz(C23274hvD.Fragment.dXcUrg, null, C25352ivB.formatAddress$default(jnu.AEQbTJ(), 6, 4, null, 4, null), C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "", null, null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZxnNGp), new Function0() { // from class: o.kid
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28793khV.copydefault(this.copydefault, jnu);
                }
            }, 96, null);
            int i = C23274hvD.Fragment.iOIMNp;
            java.lang.String str2 = (pairEZpvd == null || (first = pairEZpvd.getFirst()) == null) ? "--" : first;
            if (pairEZpvd != null) {
                iKWHzl = C25382ivf.KWHzl(pairEZpvd.getSecond().intValue());
            } else {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
            }
            c26047jPzArr[1] = new C26047jPz(i, null, str2, iKWHzl, "", null, null, null, null, 96, null);
            c26047jPzArr[2] = new C26047jPz(C23274hvD.Fragment.Qsauvs, new jPD(C23274hvD.Fragment.Qsauvs, C23274hvD.Fragment.hcetpZ, C23274hvD.Fragment.fmB), str, C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "", null, null, null, null, 96, null);
            java.lang.String str3 = strKWHzl;
            c26047jPzArr[3] = new C26047jPz(C23274hvD.Fragment.OxbLUn, new jPD(C23274hvD.Fragment.DjwCMv, C23274hvD.Fragment.putInt, C23274hvD.Fragment.fmB), C23311hvo.formatPercentWithoutSymbol$default(jnu.valueOf(), false, 0, new BigDecimal(0.01d), true, null, 19, null), C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), copydefault(jnu.OLrzqt(), jnu.EZpvd()), null, null, null, null, 96, null);
            int i2 = C23274hvD.Fragment.gFTCsA;
            jPD jpd = new jPD(C23274hvD.Fragment.HJWChPOKBmQNaCIdOM, C23274hvD.Fragment.fAklCm, C23274hvD.Fragment.fmB);
            java.lang.String percentWithoutSymbol$default = C23311hvo.formatPercentWithoutSymbol$default(jnu.djBIcL(), false, 0, new BigDecimal(0.01d), true, null, 19, null);
            if (C33129mqd.AEQbTJ(jnu.djBIcL()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                iKWHzl2 = C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI);
            } else {
                iKWHzl2 = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
            }
            int i3 = iKWHzl2;
            C23271hvA c23271hvA = C23271hvA.copydefault;
            java.lang.String strAhwBna = jnu.AhwBna();
            RoundingMode roundingMode = RoundingMode.DOWN;
            c26047jPzArr[4] = new C26047jPz(i2, jpd, percentWithoutSymbol$default, i3, "(" + C23271hvA.formatTokenCode$default(c23271hvA, strAhwBna, true, roundingMode, false, null, null, 28, null) + "/" + C23271hvA.formatTokenCode$default(c23271hvA, jnu.EZpvd(), true, roundingMode, false, null, null, 28, null) + ")", null, null, null, null, 96, null);
            c26047jPzArr[5] = new C26047jPz(C23274hvD.Fragment.DeEinT, new jPD(C23274hvD.Fragment.fDu, C23274hvD.Fragment.hwkNQP, C23274hvD.Fragment.fmB), C23311hvo.formatPercentWithoutSymbol$default(jnu.copydefault(), false, 0, new BigDecimal(0.01d), true, null, 19, null), C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "(" + C23271hvA.formatTokenCode$default(c23271hvA, jnu.KWHzl(), true, roundingMode, false, null, null, 28, null) + "/" + C23271hvA.formatTokenCode$default(c23271hvA, jnu.EZpvd(), true, roundingMode, false, null, null, 28, null) + ")", null, null, null, null, 96, null);
            c26047jPzArr[6] = new C26047jPz(C23274hvD.Fragment.dSJNDS, null, str3, C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "", null, holderInfoData != null ? holderInfoData.getFundingSourceLogo() : null, C33129mqd.OLrzqt((java.lang.CharSequence) (holderInfoData != null ? holderInfoData.getFundingSourceAddressOkExplorerUrl() : null)) ? java.lang.Integer.valueOf(C52761wXj.TaskDescription.getDefaultCipherSuites) : null, C33129mqd.OLrzqt((java.lang.CharSequence) (holderInfoData != null ? holderInfoData.getFundingSourceAddressOkExplorerUrl() : null)) ? new Function0() { // from class: o.khZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28793khV.AEQbTJ(this.EZpvd, holderInfoData);
                }
            } : null, 32, null);
            c26047jPzArr[7] = new C26047jPz(C23274hvD.Fragment.DVmcag, null, strKWHzl2, C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "", null, null, null, null, 96, null);
            jor2.KWHzl(yDY.gEmmrt(c26047jPzArr), true);
        }
    }

    public static final Unit copydefault(C28793khV c28793khV, jNU jnu) {
        int i = C23274hvD.Fragment.ComponentActivity22;
        android.content.Context contextRequireContext = c28793khV.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        hSW.copyAddress$default(i, contextRequireContext, jnu.AEQbTJ(), null, null, 24, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C28793khV c28793khV, HolderInfoData holderInfoData) {
        java.lang.String fundingSourceAddressOkExplorerUrl;
        FragmentActivity activity = c28793khV.getActivity();
        if (activity != null) {
            if (holderInfoData == null || (fundingSourceAddressOkExplorerUrl = holderInfoData.getFundingSourceAddressOkExplorerUrl()) == null) {
                fundingSourceAddressOkExplorerUrl = "";
            }
            C25352ivB.KWHzl(activity, fundingSourceAddressOkExplorerUrl);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.CharSequence copydefault(java.lang.String str, java.lang.String str2) {
        android.content.Context context = getContext();
        if (context == null) {
            return "";
        }
        C23271hvA c23271hvA = C23271hvA.copydefault;
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String tokenCode$default = C23271hvA.formatTokenCode$default(c23271hvA, str, true, roundingMode, false, null, null, 28, null);
        java.lang.String tokenCode$default2 = C23271hvA.formatTokenCode$default(c23271hvA, str2, true, roundingMode, false, null, null, 28, null);
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq);
        int iKWHzl2 = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.DGUQLIDGUQLI);
        if (drawable == null) {
            return "(" + tokenCode$default + "/" + tokenCode$default2 + ")";
        }
        float f = context.getResources().getDisplayMetrics().density;
        int i = (int) (14 * f);
        int i2 = (int) (2 * f);
        drawable.setBounds(0, 0, i, i);
        drawable.setTint(iKWHzl);
        InsetDrawable insetDrawable = new InsetDrawable(drawable, 0, 0, i2, 0);
        insetDrawable.setBounds(0, 0, i2 + i, i);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) "( ");
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl2), 0, 1, 33);
        spannableStringBuilder.setSpan(new android.text.style.ImageSpan(insetDrawable, 2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) tokenCode$default);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), length, spannableStringBuilder.length(), 33);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) ("/" + tokenCode$default2 + ")"));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl2), length2, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void OLrzqt(TokenBase tokenBase) {
        C28840kiP.EZpvd("dev_token_list_item");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, "view_details", tokenBase, "app_dev_token", null, new int[0], 8, null);
        }
    }
}
