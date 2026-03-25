package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.campaign.bean.CampaignStatus;
import com.okinc.okex.campaign.bean.RedirectTarget;
import com.okinc.okex.campaign.ui.displaymodels.CampaignDisplayModel;
import com.okinc.okex.campaign.viewmodel.CampaignViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sdU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44784sdU extends AbstractC44789sdZ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C47361tob AEQbTJ;
    public final int EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX INFO: renamed from: o.sdU$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CampaignStatus.values().length];
            try {
                iArr[CampaignStatus.ONGOING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public C44784sdU() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.okex.campaign.ui.CampaignFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.campaign.ui.CampaignFragment$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CampaignViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.campaign.ui.CampaignFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.campaign.ui.CampaignFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.campaign.ui.CampaignFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.sdT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44784sdU.EZpvd(this.EZpvd);
            }
        });
        this.EZpvd = C47315tni.ActionBar.uzCIH;
    }

    /* JADX DEBUG: Possible override for method o.sdZ.OLrzqt()V */
    public final CampaignViewModel OLrzqt() {
        return (CampaignViewModel) this.OLrzqt.getValue();
    }

    public final C44764sdA KWHzl() {
        return (C44764sdA) this.KWHzl.getValue();
    }

    public static final C44764sdA EZpvd(final C44784sdU c44784sdU) {
        return new C44764sdA(new Function1() { // from class: o.sdW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44784sdU.OLrzqt(this.OLrzqt, (CampaignDisplayModel) obj);
            }
        });
    }

    public static final Unit OLrzqt(C44784sdU c44784sdU, CampaignDisplayModel campaignDisplayModel) {
        Intrinsics.checkNotNullParameter(campaignDisplayModel, "");
        C45363soQ.onSessionIdEvent$default("SupportCenter_Campaign_Card_Click", false, null, 3, null);
        c44784sdU.EZpvd(campaignDisplayModel.getSlug(), campaignDisplayModel.getRedirectList());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        boolean zIsEmpty = OLrzqt().OLrzqt().isEmpty();
        C47361tob c47361tobCopydefault = C47361tob.copydefault(view);
        Intrinsics.checkNotNullExpressionValue(c47361tobCopydefault, "");
        C44764sdA c44764sdAKWHzl = KWHzl();
        RecyclerView recyclerView = c47361tobCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c44764sdAKWHzl.copydefault(recyclerView, (java.util.List) OLrzqt().OLrzqt());
        RecyclerView recyclerView2 = c47361tobCopydefault.AEQbTJ;
        recyclerView2.addItemDecoration(new C45390sor(C52761wXj.StateListAnimator.zuWLRA, null, null, 6, null));
        recyclerView2.setAdapter(KWHzl());
        C55173xeu c55173xeu = c47361tobCopydefault.OLrzqt;
        CampaignStatus campaignStatusCopydefault = OLrzqt().copydefault();
        java.lang.String string = getString((campaignStatusCopydefault != null && Activity.KWHzl[campaignStatusCopydefault.ordinal()] == 1) ? C47315tni.PendingIntent.QUSxYX : C47315tni.PendingIntent.QbewEr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string);
        RecyclerView recyclerView3 = c47361tobCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
        recyclerView3.setVisibility(zIsEmpty ^ true ? 0 : 8);
        C55173xeu c55173xeu2 = c47361tobCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
        c55173xeu2.setVisibility(zIsEmpty ? 0 : 8);
        this.AEQbTJ = c47361tobCopydefault;
        view.post(new java.lang.Runnable() { // from class: o.sdX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C44784sdU.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final void AEQbTJ(C44784sdU c44784sdU) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c44784sdU, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd(java.lang.String str, java.util.ArrayList<RedirectTarget> arrayList) {
        C44772sdI c44772sdIOLrzqt = C44772sdI.Companion.OLrzqt(str, arrayList);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c44772sdIOLrzqt.show(childFragmentManager);
    }

    /* JADX INFO: renamed from: o.sdU$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sdU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C44784sdU copydefault(@NotNull CampaignStatus campaignStatus, @NotNull java.util.List<CampaignDisplayModel> list) {
            Intrinsics.checkNotNullParameter(campaignStatus, "");
            Intrinsics.checkNotNullParameter(list, "");
            C44784sdU c44784sdU = new C44784sdU();
            c44784sdU.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("type", campaignStatus), C56390yDp.OLrzqt("data", list)));
            return c44784sdU;
        }
    }
}
