package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41811qxp extends AbstractC41802qxg {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int DbNXlk = 8;
    public final InterfaceC56387yDm isConnected;
    public final RankingSubPage values = RankingSubPage.RANKING_NEW_LISTINGS;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41738qwV
    public RankingSubPage AEQbTJ() {
        return this.values;
    }

    public C41811qxp() {
        final Function0 function0 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C41778qxI.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.ranking.features.main.ui.sub.pager.RankingNewListingSubPagerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.ranking.features.main.ui.sub.pager.RankingNewListingSubPagerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.ranking.features.main.ui.sub.pager.RankingNewListingSubPagerFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.qxp$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final androidx.fragment.app.Fragment KWHzl() {
            return new C41811qxp();
        }
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment gEmmrt() {
        return new C41732qwP();
    }

    @Override // o.AbstractC41738qwV
    public androidx.fragment.app.Fragment EZpvd() {
        return new C41755qwm();
    }

    private final C41778qxI isConnected() {
        return (C41778qxI) this.isConnected.getValue();
    }

    @Override // o.AbstractC41738qwV, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C42833rdq c42833rdqOLrzqt;
        ViewPager2 viewPager2;
        Intrinsics.checkNotNullParameter(view, "");
        isConnected().OLrzqt("spot");
        super.initView(view, bundle);
        if (!Intrinsics.EZpvd((java.lang.Object) isConnected().KWHzl(), (java.lang.Object) "RANKING_NEW_LISTINGS_FUTURE") || (c42833rdqOLrzqt = OLrzqt()) == null || (viewPager2 = c42833rdqOLrzqt.AEQbTJ) == null) {
            return;
        }
        viewPager2.setCurrentItem(1, false);
    }

    @Override // o.AbstractC41738qwV
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        isConnected().OLrzqt(str);
    }
}
