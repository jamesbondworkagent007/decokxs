package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.market.common.constants.RankingSortType;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardViewModel;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jCR extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public RankingSortType AEQbTJ;
    public Function1<? super LeaderBoardSortModel, Unit> AhwBna;
    public hEH EZpvd;
    public Function0<Unit> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public LeaderBoardSortModel gEmmrt;
    public RankingSortType valueOf;
    public java.lang.String AYXKKw = "";
    public java.lang.String djBIcL = "";

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RankingSortType.values().length];
            try {
                iArr[RankingSortType.CATEGORY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RankingSortType.RANKING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RankingSortType.DURATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 40.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public jCR() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LeaderBoardViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardSettingFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardSettingFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardSettingFragment$special$$inlined$activityViewModels$default$3
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

    private final LeaderBoardViewModel OLrzqt() {
        return (LeaderBoardViewModel) this.OLrzqt.getValue();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jCR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final jCR OLrzqt(@NotNull RankingSortType rankingSortType, @NotNull LeaderBoardSortModel leaderBoardSortModel, @NotNull java.lang.String str, @NotNull Function1<? super LeaderBoardSortModel, Unit> function1, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(rankingSortType, "");
            Intrinsics.checkNotNullParameter(leaderBoardSortModel, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            jCR jcr = new jCR();
            android.os.Bundle bundle = new android.os.Bundle();
            jcr.valueOf = rankingSortType;
            jcr.gEmmrt = leaderBoardSortModel;
            jcr.AhwBna = function1;
            jcr.KWHzl = function0;
            jcr.djBIcL = str2;
            jcr.AYXKKw = str;
            jcr.setArguments(bundle);
            jcr.AEQbTJ = rankingSortType;
            return jcr;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(KWHzl());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd();
        view.post(new java.lang.Runnable() { // from class: o.jCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                jCR.OLrzqt(this.copydefault);
            }
        });
    }

    public static final void OLrzqt(jCR jcr) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jcr, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final java.lang.CharSequence KWHzl() {
        RankingSortType rankingSortType = this.valueOf;
        int i = rankingSortType == null ? -1 : Application.AEQbTJ[rankingSortType.ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.OHsvZP);
        }
        if (i != 2) {
            return i != 3 ? "" : C33070mpX.AYXKKw(C23274hvD.Fragment.uLLnq);
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.QVsKAR);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = hEH.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        RankingSortType rankingSortType = this.AEQbTJ;
        if (rankingSortType != null) {
            LeaderBoardViewModel leaderBoardViewModelOLrzqt = OLrzqt();
            LeaderBoardSortModel leaderBoardSortModel = this.gEmmrt;
            java.util.List<LeaderBoardSortModel> listCopydefault = leaderBoardViewModelOLrzqt.copydefault(rankingSortType, leaderBoardSortModel != null ? leaderBoardSortModel.getFilterId() : null);
            if (listCopydefault != null) {
                KWHzl(listCopydefault);
            }
        }
    }

    private final void KWHzl(java.util.List<LeaderBoardSortModel> list) {
        RecyclerView recyclerView;
        jCW jcw = new jCW(list, new Function2() { // from class: o.jCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jCR.EZpvd(this.copydefault, (LeaderBoardSortModel) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        hEH heh = this.EZpvd;
        if (heh == null || (recyclerView = heh.AEQbTJ) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(jcw);
    }

    public static final Unit EZpvd(jCR jcr, LeaderBoardSortModel leaderBoardSortModel, int i) {
        Intrinsics.checkNotNullParameter(leaderBoardSortModel, "");
        Function1<? super LeaderBoardSortModel, Unit> function1 = jcr.AhwBna;
        if (function1 != null) {
            function1.invoke(leaderBoardSortModel);
        }
        jcr.dismiss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void EZpvd() {
        C32866mlf.onEvent$default(this.djBIcL, (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }
}
