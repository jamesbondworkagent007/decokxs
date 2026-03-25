package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.TopTradersBottomSheet$onCreateContent$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTraderUIModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C52761wXj;
import o.xWS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25719jDv extends wXX {
    public hEM EZpvd;
    public android.os.CountDownTimer KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jDx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25719jDv.EZpvd(this.copydefault);
        }
    });
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

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

    public C25719jDv() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TopTradersBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TopTradersBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TopTradersBottomSheet$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String OLrzqt() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("source_type") : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackerViewModel AEQbTJ() {
        return (TrackerViewModel) this.OLrzqt.getValue();
    }

    private final kMM EZpvd() {
        return (kMM) this.copydefault.getValue();
    }

    public static final kMM EZpvd(final C25719jDv c25719jDv) {
        kMM kmm = new kMM();
        kmm.register(TrendTraderUIModel.class, new C25729jEe(new Function1() { // from class: o.jDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25719jDv.KWHzl(this.AEQbTJ, (TrendTraderUIModel) obj);
            }
        }));
        return kmm;
    }

    public static final Unit KWHzl(C25719jDv c25719jDv, TrendTraderUIModel trendTraderUIModel) {
        Intrinsics.checkNotNullParameter(trendTraderUIModel, "");
        c25719jDv.copydefault(trendTraderUIModel);
        return Unit.INSTANCE;
    }

    public final void copydefault(TrendTraderUIModel trendTraderUIModel) {
        xWS xws;
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null || (xws = (xWS) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWS.class))) == null) {
            return;
        }
        xWS.Application.routeProfileAssetPage$default(xws, abstractActivityC33041mov, trendTraderUIModel.OLrzqt(), 0L, 4, null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = hEM.EZpvd(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TopTradersBottomSheet$onCreateContent$1(this, null), 3, null);
    }

    public final void AEQbTJ(TrackerTrendUIModel trackerTrendUIModel) {
        hEM hem = this.EZpvd;
        if (hem != null) {
            AppCompatImageView appCompatImageView = hem.valueOf;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C33054mpH.copydefault(appCompatImageView, trackerTrendUIModel.values(), C55298xhM.dp2px$default(4.0f, null, 1, null));
            hem.isConnected.setText(trackerTrendUIModel.isConnected());
            hem.fetchVPNInfo.setText(trackerTrendUIModel.AkhnZx());
            hem.gEmmrt.setText(trackerTrendUIModel.OLrzqt());
            android.widget.TextView textView = hem.AEQbTJ;
            android.content.Context context = hem.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setText(C33069mpW.KWHzl(context, C23274hvD.Fragment.playFromSearch, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", C23272hvB.KWHzl.OLrzqt().getSymbol()))));
            if (trackerTrendUIModel.AhwBna().length() == 0) {
                AppCompatImageView appCompatImageView2 = hem.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                appCompatImageView2.setVisibility(8);
            } else {
                AppCompatImageView appCompatImageView3 = hem.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
                appCompatImageView3.setVisibility(0);
                AppCompatImageView appCompatImageView4 = hem.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
                C28884kjG.EZpvd(appCompatImageView4, trackerTrendUIModel.AhwBna(), C55298xhM.dp2px$default(2.0f, null, 1, null), trackerTrendUIModel.AYXKKw(), trackerTrendUIModel.EZpvd(), C52761wXj.TaskDescription.dzCpvv, C55298xhM.dp2px$default(2.0f, null, 1, null), java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.EZpvd)));
            }
            RecyclerView recyclerView = hem.AkhnZx;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(EZpvd());
            C52794wYp c52794wYp = hem.values;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, trackerTrendUIModel));
        }
        OLrzqt(trackerTrendUIModel);
        KWHzl(trackerTrendUIModel);
        EZpvd(trackerTrendUIModel);
    }

    public final void OLrzqt(TrackerTrendUIModel trackerTrendUIModel) {
        kMM.setData$default(EZpvd(), trackerTrendUIModel.AuCTel(), null, 2, null);
    }

    public final void KWHzl(TrackerTrendUIModel trackerTrendUIModel) {
        int i = java.lang.System.currentTimeMillis() - trackerTrendUIModel.valueOf() < CalendarModelKt.MillisecondsIn24Hours ? C52761wXj.Activity.RWIpjU : C52761wXj.Activity.QwvEab;
        hEM hem = this.EZpvd;
        if (hem != null) {
            hem.DbNXlk.setText(C25322iuY.OLrzqt.EZpvd(java.lang.String.valueOf(trackerTrendUIModel.valueOf())));
            hem.DbNXlk.setTextColor(hem.getRoot().getContext().getColor(i));
        }
    }

    /* JADX INFO: renamed from: o.jDv$Activity */
    public static final class Activity extends android.os.CountDownTimer {
        public final /* synthetic */ TrackerTrendUIModel EZpvd;

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(TrackerTrendUIModel trackerTrendUIModel) {
            super(Long.MAX_VALUE, 1000L);
            this.EZpvd = trackerTrendUIModel;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C25719jDv.this.KWHzl(this.EZpvd);
        }
    }

    public final void EZpvd(TrackerTrendUIModel trackerTrendUIModel) {
        Activity activity = new Activity(trackerTrendUIModel);
        this.KWHzl = activity;
        activity.start();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        android.os.CountDownTimer countDownTimer = this.KWHzl;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.EZpvd = null;
    }

    /* JADX INFO: renamed from: o.jDv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jDv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C25719jDv OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C25719jDv c25719jDv = new C25719jDv();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("source_type", str);
            c25719jDv.setArguments(bundle);
            return c25719jDv;
        }
    }

    /* JADX INFO: renamed from: o.jDv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ TrackerTrendUIModel KWHzl;
        public final /* synthetic */ C25719jDv copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25719jDv c25719jDv, TrackerTrendUIModel trackerTrendUIModel) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c25719jDv;
            this.KWHzl = trackerTrendUIModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager parentFragmentManager = this.copydefault.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                C25738jEn.AEQbTJ(parentFragmentManager, this.KWHzl, this.copydefault.OLrzqt());
            }
        }
    }
}
