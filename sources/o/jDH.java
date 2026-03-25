package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerFragment$showTopTradersBottomSheet$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerParams;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheetParams;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.ui.NetworkOptionParams;
import com.okinc.business.market.features.filter.ui.TypeOptionParams;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C25747jEw;
import o.C52761wXj;
import o.gKO;
import o.jDH;
import o.jDZ;
import o.xWS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jDH extends AbstractC25722jDy<hET> {
    public java.lang.String gEmmrt;
    public boolean valueOf = true;
    public final InterfaceC56387yDm values;
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public static final java.lang.String AhwBna = "tracker_key_params";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.zeUYeG;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hET OLrzqt(jDH jdh) {
        return (hET) jdh.AEQbTJ();
    }

    public jDH() {
        final Function0 function0 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerFragment$special$$inlined$activityViewModels$default$3
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

    public final TrackerViewModel fetchVPNInfo() {
        return (TrackerViewModel) this.values.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public hET AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        hET hetAEQbTJ = hET.AEQbTJ(view);
        Intrinsics.checkNotNullExpressionValue(hetAEQbTJ, "");
        return hetAEQbTJ;
    }

    public final TrackerParams valueOf() {
        TrackerParams trackerParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (trackerParams = (TrackerParams) arguments.getParcelable(AhwBna)) == null) ? new TrackerParams(null, 1, null) : trackerParams;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jDH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final jDH KWHzl(@NotNull TrackerParams trackerParams) {
            Intrinsics.checkNotNullParameter(trackerParams, "");
            jDH jdh = new jDH();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(jDH.AhwBna, trackerParams);
            C31200lpY.EZpvd(bundle, "default_trade");
            jdh.setArguments(bundle);
            return jdh;
        }
    }

    @Override // o.AbstractC7000aZw, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getNewProxyInstance();
        DbNXlk();
        AkhnZx();
        fJNWhG();
        fARcdN();
        ejfBZ();
        iwGUEr();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        fetchVPNInfo().KWHzl(false);
    }

    private final void getNewProxyInstance() {
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().AuCTel(), null, new Fragment(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().AYXKKw(), null, new Dialog(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().copydefault(), null, new LoaderManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().OLrzqt(), null, new FragmentManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().AkhnZx(), null, new TaskStackBuilder(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().gEmmrt(), null, new SharedElementCallback(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().valueOf(), null, new PictureInPictureParams(), 2, null);
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(jDZ jdz, Continuation<? super Unit> continuation) {
            C55173xeu c55173xeu;
            C33546myW c33546myW;
            C55113xdn c55113xdn;
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            RecyclerView recyclerView3;
            C55173xeu c55173xeu2;
            C55113xdn c55113xdn2;
            C33546myW c33546myW2;
            C33546myW c33546myW3;
            RecyclerView recyclerView4;
            C33546myW c33546myW4;
            C33546myW c33546myW5;
            C55173xeu c55173xeu3;
            C55113xdn c55113xdn3;
            C55173xeu c55173xeu4;
            C55113xdn c55113xdn4;
            RecyclerView recyclerView5;
            RecyclerView recyclerView6;
            RecyclerView recyclerView7;
            RecyclerView recyclerView8;
            C55173xeu c55173xeu5;
            C55113xdn c55113xdn5;
            RecyclerView recyclerView9;
            RecyclerView recyclerView10;
            if (jdz instanceof jDZ.ActionBar) {
                hET hetOLrzqt = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt != null && (recyclerView10 = hetOLrzqt.EZpvd) != null) {
                    recyclerView10.setVisibility(4);
                }
                hET hetOLrzqt2 = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt2 != null && (recyclerView9 = hetOLrzqt2.ejfBZ) != null) {
                    recyclerView9.setVisibility(4);
                }
                hET hetOLrzqt3 = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt3 != null && (c55113xdn5 = hetOLrzqt3.AhwBna) != null) {
                    c55113xdn5.setVisibility(8);
                }
                hET hetOLrzqt4 = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt4 != null && (c55173xeu5 = hetOLrzqt4.KWHzl) != null) {
                    c55173xeu5.setVisibility(8);
                }
            } else if (jdz instanceof jDZ.TaskDescription) {
                hET hetOLrzqt5 = jDH.OLrzqt(jDH.this);
                RecyclerView.Adapter adapter = (hetOLrzqt5 == null || (recyclerView8 = hetOLrzqt5.EZpvd) == null) ? null : recyclerView8.getAdapter();
                kMM kmm = adapter instanceof kMM ? (kMM) adapter : null;
                if (kmm != null) {
                    kMM.setData$default(kmm, yDY.AhwBna(), null, 2, null);
                }
                hET hetOLrzqt6 = jDH.OLrzqt(jDH.this);
                RecyclerView.Adapter adapter2 = (hetOLrzqt6 == null || (recyclerView7 = hetOLrzqt6.ejfBZ) == null) ? null : recyclerView7.getAdapter();
                kMM kmm2 = adapter2 instanceof kMM ? (kMM) adapter2 : null;
                if (kmm2 != null) {
                    kMM.setData$default(kmm2, yDY.AhwBna(), null, 2, null);
                }
                hET hetOLrzqt7 = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt7 != null && (recyclerView6 = hetOLrzqt7.EZpvd) != null) {
                    recyclerView6.setVisibility(4);
                }
                hET hetOLrzqt8 = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt8 != null && (recyclerView5 = hetOLrzqt8.ejfBZ) != null) {
                    recyclerView5.setVisibility(4);
                }
                hET hetOLrzqt9 = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt9 != null && (c55113xdn4 = hetOLrzqt9.AhwBna) != null) {
                    c55113xdn4.setVisibility(0);
                }
                hET hetOLrzqt10 = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt10 != null && (c55173xeu4 = hetOLrzqt10.KWHzl) != null) {
                    c55173xeu4.setVisibility(8);
                }
            } else if (!(jdz instanceof jDZ.Activity)) {
                if (jdz instanceof jDZ.StateListAnimator) {
                    hET hetOLrzqt11 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt11 != null && (c55113xdn3 = hetOLrzqt11.AhwBna) != null) {
                        c55113xdn3.setVisibility(8);
                    }
                    hET hetOLrzqt12 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt12 != null && (c55173xeu3 = hetOLrzqt12.KWHzl) != null) {
                        c55173xeu3.setVisibility(8);
                    }
                    hET hetOLrzqt13 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt13 != null && (c33546myW5 = hetOLrzqt13.fetchVPNInfo) != null) {
                        c33546myW5.AEQbTJ();
                    }
                    hET hetOLrzqt14 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt14 != null && (c33546myW4 = hetOLrzqt14.fetchVPNInfo) != null) {
                        c33546myW4.djBIcL(true);
                    }
                    hET hetOLrzqt15 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt15 != null && (recyclerView4 = hetOLrzqt15.EZpvd) != null) {
                        jDH jdh = jDH.this;
                        if (jdh.fetchVPNInfo().AYXKKw().getValue().intValue() == 0) {
                            jdh.EZpvd(0);
                            jDZ.StateListAnimator stateListAnimator = (jDZ.StateListAnimator) jdz;
                            jdh.copydefault(stateListAnimator.AEQbTJ().isEmpty(), recyclerView4);
                            jdh.KWHzl(stateListAnimator.AEQbTJ());
                        }
                    }
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jDH.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                } else if (jdz instanceof jDZ.PendingIntent) {
                    hET hetOLrzqt16 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt16 != null && (c33546myW3 = hetOLrzqt16.fetchVPNInfo) != null) {
                        c33546myW3.AEQbTJ();
                    }
                    hET hetOLrzqt17 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt17 != null && (c33546myW2 = hetOLrzqt17.fetchVPNInfo) != null) {
                        c33546myW2.djBIcL(true);
                    }
                    hET hetOLrzqt18 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt18 != null && (c55113xdn2 = hetOLrzqt18.AhwBna) != null) {
                        c55113xdn2.setVisibility(8);
                    }
                    hET hetOLrzqt19 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt19 != null && (c55173xeu2 = hetOLrzqt19.KWHzl) != null) {
                        c55173xeu2.setVisibility(8);
                    }
                    hET hetOLrzqt20 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt20 != null && (recyclerView3 = hetOLrzqt20.ejfBZ) != null) {
                        jDH jdh2 = jDH.this;
                        if (jdh2.fetchVPNInfo().AYXKKw().getValue().intValue() == 1) {
                            jdh2.EZpvd(1);
                            jDZ.PendingIntent pendingIntent = (jDZ.PendingIntent) jdz;
                            jdh2.copydefault(pendingIntent.OLrzqt().isEmpty(), recyclerView3);
                            jdh2.copydefault(pendingIntent.OLrzqt(), pendingIntent.copydefault());
                        }
                    }
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jDH.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                } else {
                    if (!(jdz instanceof jDZ.Application)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hET hetOLrzqt21 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt21 != null && (recyclerView2 = hetOLrzqt21.EZpvd) != null) {
                        recyclerView2.setVisibility(4);
                    }
                    hET hetOLrzqt22 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt22 != null && (recyclerView = hetOLrzqt22.ejfBZ) != null) {
                        recyclerView.setVisibility(4);
                    }
                    hET hetOLrzqt23 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt23 != null && (c55113xdn = hetOLrzqt23.AhwBna) != null) {
                        c55113xdn.setVisibility(8);
                    }
                    hET hetOLrzqt24 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt24 != null && (c33546myW = hetOLrzqt24.fetchVPNInfo) != null) {
                        c33546myW.djBIcL(false);
                    }
                    hET hetOLrzqt25 = jDH.OLrzqt(jDH.this);
                    if (hetOLrzqt25 != null && (c55173xeu = hetOLrzqt25.KWHzl) != null) {
                        final jDH jdh3 = jDH.this;
                        c55173xeu.setVisibility(0);
                        c55173xeu.setEmptyTypeImage(8);
                        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
                        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
                        c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
                        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jDU
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                jDH.Fragment.OLrzqt(jdh3, view);
                            }
                        });
                    }
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jDH.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                }
            }
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(jDH jdh, android.view.View view) {
            TrackerViewModel.loadCurrentPage$default(jdh.fetchVPNInfo(), true, false, 2, null);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ jDH KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, jDH jdh) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = jdh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C25723jDz c25723jDzKWHzl = C25723jDz.Companion.KWHzl(yDY.AhwBna(), "");
                androidx.fragment.app.FragmentManager parentFragmentManager = this.KWHzl.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                c25723jDzKWHzl.show(parentFragmentManager);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ java.util.List EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ jDH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, java.util.List list, jDH jdh) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = list;
            this.copydefault = jdh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                jDJ jdjAEQbTJ = jDJ.Companion.AEQbTJ(this.EZpvd, this.copydefault.fetchVPNInfo().AkhnZx().getValue());
                androidx.fragment.app.FragmentManager parentFragmentManager = this.copydefault.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                jdjAEQbTJ.show(parentFragmentManager);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ jDH AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jDH jdh) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = jdh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.fIwbmz();
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ jDH OLrzqt;
        public final /* synthetic */ hET copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, jDH jdh, hET het) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = jdh;
            this.copydefault = het;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            RecyclerView recyclerView;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                hET hetOLrzqt = jDH.OLrzqt(this.OLrzqt);
                if (hetOLrzqt != null && (recyclerView = hetOLrzqt.EZpvd) != null) {
                    recyclerView.scrollToPosition(0);
                }
                ConstraintLayout constraintLayout = this.copydefault.djBIcL;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(8);
            }
        }
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return AEQbTJ(((java.lang.Number) obj).intValue(), continuation);
        }

        public final java.lang.Object AEQbTJ(int i, Continuation<? super Unit> continuation) {
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            jDH.this.EZpvd(i);
            if (i == 0) {
                hET hetOLrzqt = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt != null && (recyclerView2 = hetOLrzqt.EZpvd) != null) {
                    recyclerView2.scrollToPosition(0);
                }
            } else {
                hET hetOLrzqt2 = jDH.OLrzqt(jDH.this);
                if (hetOLrzqt2 != null && (recyclerView = hetOLrzqt2.ejfBZ) != null) {
                    recyclerView.scrollToPosition(0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TrackerAddressSourceResponse trackerAddressSourceResponse, Continuation<? super Unit> continuation) {
            jDH.this.AkhnZx();
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TrackerTxnListFilter trackerTxnListFilter, Continuation<? super Unit> continuation) {
            C54989xbV c54989xbV;
            android.widget.TextView textViewEZpvd;
            jDH.this.AEQbTJ(trackerTxnListFilter);
            hET hetOLrzqt = jDH.OLrzqt(jDH.this);
            if (hetOLrzqt != null && (c54989xbV = hetOLrzqt.fJNWhG) != null && (textViewEZpvd = c54989xbV.EZpvd()) != null) {
                textViewEZpvd.setText(jDH.this.djBIcL());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class TaskStackBuilder<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.lang.String str, Continuation<? super Unit> continuation) {
            C54989xbV c54989xbV;
            android.widget.TextView textViewEZpvd;
            hET hetOLrzqt = jDH.OLrzqt(jDH.this);
            if (hetOLrzqt != null && (c54989xbV = hetOLrzqt.gEmmrt) != null && (textViewEZpvd = c54989xbV.EZpvd()) != null) {
                android.content.Context context = jDH.this.getContext();
                textViewEZpvd.setText(context != null ? context.getString(jDH.this.fetchVPNInfo().fetchVPNInfo()) : null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class SharedElementCallback<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) {
            C54989xbV c54989xbV;
            android.widget.TextView textViewEZpvd;
            java.lang.CharSequence charSequenceEZpvd;
            hET hetOLrzqt = jDH.OLrzqt(jDH.this);
            if (hetOLrzqt != null && (c54989xbV = hetOLrzqt.DbNXlk) != null && (textViewEZpvd = c54989xbV.EZpvd()) != null) {
                if (list.size() == 1) {
                    charSequenceEZpvd = (java.lang.CharSequence) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
                } else {
                    android.content.Context context = jDH.this.getContext();
                    charSequenceEZpvd = context != null ? pTD.EZpvd(context, C23274hvD.FragmentManager.isConnected, list.size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C56443yFo.AEQbTJ(list.size())))) : null;
                }
                textViewEZpvd.setText(charSequenceEZpvd);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class PictureInPictureParams<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return AEQbTJ(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object AEQbTJ(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                jDH.this.getFieldNames();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Possible override for method o.jDy.djBIcL()V */
    public final java.lang.CharSequence djBIcL() {
        java.lang.String strEZpvd;
        if (!fetchVPNInfo().fIwbmz()) {
            strEZpvd = C23272hvB.KWHzl.OLrzqt().getIsoCode();
        } else {
            strEZpvd = fetchVPNInfo().EZpvd();
        }
        return C24324ibg.addSpanWithColor$default(C24324ibg.Companion.KWHzl(C23272hvB.KWHzl.OLrzqt().getIsoCode() + " / " + fetchVPNInfo().EZpvd()), strEZpvd, requireContext().getColor(C52761wXj.Activity.QwvEab), 0, 4, null).AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        C55249xgQ c55249xgQ;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        hET het = (hET) AEQbTJ();
        if (het == null || (c55249xgQ = het.isConnected) == null) {
            return;
        }
        TabLayout.Tab text = c55249xgQ.newTab().setText(c55249xgQ.getContext().getString(C23274hvD.Fragment.hijVBL));
        android.view.View customView = text.getCustomView();
        if (customView != null && (textView2 = (android.widget.TextView) customView.findViewById(android.R.id.text1)) != null) {
            TextViewCompat.setTextAppearance(textView2, C52761wXj.LoaderManager.giSNqX);
        }
        c55249xgQ.addTab(text);
        TabLayout.Tab text2 = c55249xgQ.newTab().setText(c55249xgQ.getContext().getString(C23274hvD.Fragment.extraCallbackWithResult));
        android.view.View customView2 = text2.getCustomView();
        if (customView2 != null && (textView = (android.widget.TextView) customView2.findViewById(android.R.id.text1)) != null) {
            TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.giSNqX);
        }
        c55249xgQ.addTab(text2);
        c55249xgQ.post(new java.lang.Runnable() { // from class: o.jDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                jDH.values(this.copydefault);
            }
        });
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void values(jDH jdh) {
        hET het = (hET) jdh.AEQbTJ();
        if (het != null) {
            if (jdh.fetchVPNInfo().iwGUEr() == 0) {
                jdh.fetchVPNInfo().AEQbTJ(true);
            }
            C55249xgQ c55249xgQ = het.isConnected;
            c55249xgQ.selectTab(c55249xgQ.getTabAt(jdh.fetchVPNInfo().iwGUEr()));
        }
    }

    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String strCopydefault;
            if (tab != null) {
                jDH.this.fetchVPNInfo().AEQbTJ(tab.getPosition());
            }
            jBN jbn = jBN.copydefault;
            FragmentActivity activity = jDH.this.getActivity();
            ActivityC25672jCb activityC25672jCb = activity instanceof ActivityC25672jCb ? (ActivityC25672jCb) activity : null;
            if (activityC25672jCb == null || (strCopydefault = activityC25672jCb.AEQbTJ()) == null) {
                strCopydefault = jDH.this.valueOf().copydefault();
            }
            jbn.OLrzqt(strCopydefault, true);
            if (!jDH.this.valueOf || (tab != null && tab.getPosition() == 0)) {
                jDH.this.valueOf = false;
                java.lang.Integer numValueOf = tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null;
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    jBN.trackMonitorPageClick$default(jbn, DexTrackEventParameter.MonitorButtonName.ACTIVITY_TAB, null, null, false, 14, null);
                    return;
                } else {
                    jBN.trackMonitorPageClick$default(jbn, DexTrackEventParameter.MonitorButtonName.TRENDS_TAB, null, null, false, 14, null);
                    return;
                }
            }
            jDH.this.valueOf = false;
        }
    }

    public final void EZpvd(C54989xbV c54989xbV) {
        c54989xbV.setStyle(2);
        c54989xbV.setOKDSSize(-20);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        AppCompatImageView appCompatImageView;
        C54989xbV c54989xbV;
        C54989xbV c54989xbV2;
        C54989xbV c54989xbV3;
        hET het = (hET) AEQbTJ();
        if (het != null && (c54989xbV3 = het.DbNXlk) != null) {
            EZpvd(c54989xbV3);
            c54989xbV3.setOnClickListener(new ActionBar(c54989xbV3, 1000L, this));
        }
        java.util.List<kotlin.Pair> listGEmmrt = yDY.gEmmrt(new kotlin.Pair("1", getString(C23274hvD.Fragment.HrFqwD)), new kotlin.Pair("2", getString(C23274hvD.Fragment.ilfrrN)), new kotlin.Pair("3", getString(C23274hvD.Fragment.nriSR)), new kotlin.Pair("4", getString(C23274hvD.Fragment.izFvvl)), new kotlin.Pair("5", getString(C23274hvD.Fragment.geAOna)));
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        for (kotlin.Pair pair : listGEmmrt) {
            arrayList.add(new C25726jEb((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond()));
        }
        hET het2 = (hET) AEQbTJ();
        if (het2 != null && (c54989xbV2 = het2.gEmmrt) != null) {
            EZpvd(c54989xbV2);
            c54989xbV2.setOnClickListener(new Activity(c54989xbV2, 1000L, arrayList, this));
        }
        hET het3 = (hET) AEQbTJ();
        if (het3 != null && (c54989xbV = het3.fJNWhG) != null) {
            EZpvd(c54989xbV);
            c54989xbV.setOnClickListener(new View.OnClickListener() { // from class: o.jDY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jDH.copydefault(this.OLrzqt, view);
                }
            });
        }
        hET het4 = (hET) AEQbTJ();
        if (het4 == null || (appCompatImageView = het4.copydefault) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(jDH jdh, android.view.View view) {
        C54989xbV c54989xbV;
        android.widget.TextView textViewEZpvd;
        jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.CURRENCY_MODE_IS_TOKEN_FILTER_TOGGLE, java.lang.String.valueOf(jdh.fetchVPNInfo().fIwbmz()), java.lang.String.valueOf(!jdh.fetchVPNInfo().fIwbmz()), false, 8, null);
        jdh.fetchVPNInfo().zsXlph();
        hET het = (hET) jdh.AEQbTJ();
        if (het == null || (c54989xbV = het.fJNWhG) == null || (textViewEZpvd = c54989xbV.EZpvd()) == null) {
            return;
        }
        textViewEZpvd.setText(jdh.djBIcL());
    }

    public final void getFieldNames() {
        FragmentActivity activity = getActivity();
        ActivityC25672jCb activityC25672jCb = activity instanceof ActivityC25672jCb ? (ActivityC25672jCb) activity : null;
        if (activityC25672jCb != null) {
            activityC25672jCb.EZpvd();
        }
    }

    public final void isConnected() {
        FragmentActivity activity = getActivity();
        ActivityC25672jCb activityC25672jCb = activity instanceof ActivityC25672jCb ? (ActivityC25672jCb) activity : null;
        if (activityC25672jCb != null) {
            activityC25672jCb.KWHzl();
        }
    }

    private final void iwGUEr() {
        fetchVPNInfo().fARcdN();
        fetchVPNInfo().ejfBZ();
        TrackerViewModel.loadAddressSourceList$default(fetchVPNInfo(), false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        C33546myW c33546myW;
        hET het = (hET) AEQbTJ();
        if (het == null || (c33546myW = het.fetchVPNInfo) == null) {
            return;
        }
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.jDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                jDH.KWHzl(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(jDH jdh, InterfaceC57934yrl interfaceC57934yrl) {
        C55249xgQ c55249xgQ;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        jdh.isConnected();
        hET het = (hET) jdh.AEQbTJ();
        if (het != null && (c55249xgQ = het.isConnected) != null && c55249xgQ.getSelectedTabPosition() == 0) {
            jdh.fetchVPNInfo().OLrzqt(false);
        } else {
            TrackerViewModel.loadTrends$default(jdh.fetchVPNInfo(), false, false, 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.util.List<jEB> list) {
        RecyclerView recyclerView;
        hET het;
        ConstraintLayout constraintLayout;
        RecyclerView recyclerView2;
        hET het2 = (hET) AEQbTJ();
        if (((het2 == null || (recyclerView2 = het2.EZpvd) == null) ? null : recyclerView2.getAdapter()) == null) {
            fJNWhG();
        }
        if (list.isEmpty() && (het = (hET) AEQbTJ()) != null && (constraintLayout = het.djBIcL) != null) {
            constraintLayout.setVisibility(8);
        }
        int iGEmmrt = gEmmrt();
        hET het3 = (hET) AEQbTJ();
        RecyclerView.Adapter adapter = (het3 == null || (recyclerView = het3.EZpvd) == null) ? null : recyclerView.getAdapter();
        kMM kmm = adapter instanceof kMM ? (kMM) adapter : null;
        hDKMBd();
        if (iGEmmrt <= 0) {
            if (kmm != null) {
                kmm.AEQbTJ(list, new Function0() { // from class: o.jDK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jDH.DbNXlk(this.copydefault);
                    }
                });
                return;
            }
            return;
        }
        final int i = 0;
        if (this.gEmmrt != null) {
            java.util.Iterator<jEB> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) it.next().zsXlph(), (java.lang.Object) this.gEmmrt)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (kmm != null) {
            kmm.AEQbTJ(list, new Function0() { // from class: o.jDO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jDH.KWHzl(this.OLrzqt, i);
                }
            });
        }
    }

    public static final Unit KWHzl(jDH jdh, int i) {
        jdh.AEQbTJ(i);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit DbNXlk(jDH jdh) {
        ConstraintLayout constraintLayout;
        RecyclerView recyclerView;
        hET het = (hET) jdh.AEQbTJ();
        if (het != null && (recyclerView = het.EZpvd) != null) {
            recyclerView.scrollToPosition(0);
        }
        hET het2 = (hET) jdh.AEQbTJ();
        if (het2 != null && (constraintLayout = het2.djBIcL) != null) {
            constraintLayout.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        java.util.List<?> items;
        RecyclerView recyclerView;
        int iGEmmrt = gEmmrt();
        hET het = (hET) AEQbTJ();
        RecyclerView.Adapter adapter = (het == null || (recyclerView = het.EZpvd) == null) ? null : recyclerView.getAdapter();
        kMM kmm = adapter instanceof kMM ? (kMM) adapter : null;
        if (kmm == null || (items = kmm.getItems()) == null || !(!items.isEmpty()) || iGEmmrt >= items.size()) {
            return;
        }
        java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(items, iGEmmrt);
        jEB jeb = objAkhnZx instanceof jEB ? (jEB) objAkhnZx : null;
        if (this.gEmmrt == null) {
            this.gEmmrt = jeb != null ? jeb.zsXlph() : null;
            return;
        }
        java.util.Iterator<?> it = items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            java.lang.Object next = it.next();
            jEB jeb2 = next instanceof jEB ? (jEB) next : null;
            if (Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) (jeb2 != null ? jeb2.zsXlph() : null))) {
                break;
            } else {
                i++;
            }
        }
        if (iGEmmrt < i) {
            this.gEmmrt = jeb != null ? jeb.zsXlph() : null;
        }
    }

    public static /* synthetic */ void updateTrendRecyclerView$default(jDH jdh, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        jdh.copydefault((java.util.List<TrackerTrendUIModel>) list, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.util.List<TrackerTrendUIModel> list, boolean z) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        hET het = (hET) AEQbTJ();
        if (((het == null || (recyclerView3 = het.ejfBZ) == null) ? null : recyclerView3.getAdapter()) == null) {
            fARcdN();
        }
        hET het2 = (hET) AEQbTJ();
        RecyclerView.Adapter adapter = (het2 == null || (recyclerView2 = het2.ejfBZ) == null) ? null : recyclerView2.getAdapter();
        kMM kmm = adapter instanceof kMM ? (kMM) adapter : null;
        hET het3 = (hET) AEQbTJ();
        RecyclerView.LayoutManager layoutManager = (het3 == null || (recyclerView = het3.ejfBZ) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        final int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0;
        if (z) {
            if (kmm != null) {
                kMM.forceReset$default(kmm, list, null, 2, null);
            }
        } else if (kmm != null) {
            kmm.AEQbTJ(list, new Function0() { // from class: o.jDX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jDH.AEQbTJ(iFindFirstVisibleItemPosition, this);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(int i, jDH jdh) {
        hET het;
        RecyclerView recyclerView;
        if (i == 0 && (het = (hET) jdh.AEQbTJ()) != null && (recyclerView = het.ejfBZ) != null) {
            recyclerView.scrollToPosition(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(int i) {
        hET het = (hET) AEQbTJ();
        if (het != null) {
            if (i == 0) {
                het.ejfBZ.setVisibility(4);
                het.fJNWhG.setVisibility(0);
            } else {
                if (i != 1) {
                    return;
                }
                ConstraintLayout constraintLayout = het.djBIcL;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(8);
                het.EZpvd.setVisibility(4);
                het.fJNWhG.setVisibility(8);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z, android.view.View view) {
        C55173xeu c55173xeu;
        if (!z) {
            view.setVisibility(0);
            hET het = (hET) AEQbTJ();
            if (het == null || (c55173xeu = het.KWHzl) == null) {
                return;
            }
            c55173xeu.setVisibility(8);
            return;
        }
        view.setVisibility(4);
        AuCTel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTel() {
        C55173xeu c55173xeu;
        C33546myW c33546myW;
        hET het = (hET) AEQbTJ();
        if (het != null && (c33546myW = het.fetchVPNInfo) != null) {
            c33546myW.djBIcL(false);
        }
        hET het2 = (hET) AEQbTJ();
        if (het2 == null || (c55173xeu = het2.KWHzl) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
        c55173xeu.setSubTitle((java.lang.CharSequence) "");
        if (fetchVPNInfo().OLrzqt().getValue().fetchVPNInfo()) {
            c55173xeu.setRetry("");
            return;
        }
        java.lang.String string = c55173xeu.getContext().getString(C23274hvD.Fragment.hDKMBd);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setRetry(string);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jDH.OLrzqt(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(jDH jdh, android.view.View view) {
        TrackerViewModel.loadCurrentPage$default(jdh.fetchVPNInfo(), true, false, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        kMM kmm = new kMM();
        kmm.register(jEB.class, new C25731jEg(new Function1() { // from class: o.jDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jDH.copydefault(this.copydefault, (jEB) obj);
            }
        }, new Function1() { // from class: o.jDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jDH.EZpvd(this.KWHzl, (jEB) obj);
            }
        }, new Function1() { // from class: o.jDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jDH.djBIcL(this.AEQbTJ, (jEB) obj);
            }
        }));
        hET het = (hET) AEQbTJ();
        if (het != null && (recyclerView2 = het.EZpvd) != null) {
            recyclerView2.setAdapter(kmm);
        }
        hET het2 = (hET) AEQbTJ();
        if (het2 == null || (recyclerView = het2.EZpvd) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new PendingIntent(kmm));
    }

    public static final Unit copydefault(jDH jdh, jEB jeb) {
        Intrinsics.checkNotNullParameter(jeb, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.Fragment.copydefault);
        jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.QUICK_BUY_BUTTON, null, null, false, 14, null);
        jdh.EZpvd(jeb);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(jDH jdh, jEB jeb) {
        Intrinsics.checkNotNullParameter(jeb, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.PendingIntent.OLrzqt);
        jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.TOKEN_DETAIL_PAGE_CARD, null, null, false, 14, null);
        jdh.OLrzqt(jeb);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(jDH jdh, jEB jeb) {
        Intrinsics.checkNotNullParameter(jeb, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.PendingIntent.OLrzqt);
        jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.ADDRESS_INFO_CARD, null, null, false, 14, null);
        jdh.EZpvd(jeb.AYXKKw());
        return Unit.INSTANCE;
    }

    public static final class PendingIntent extends RecyclerView.OnScrollListener {
        public final /* synthetic */ kMM OLrzqt;

        public PendingIntent(kMM kmm) {
            this.OLrzqt = kmm;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            jDH.this.hDKMBd();
            java.util.List<?> items = this.OLrzqt.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            int i3 = 0;
            if (jDH.this.gEmmrt != null) {
                jDH jdh = jDH.this;
                java.util.Iterator<?> it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    java.lang.Object next = it.next();
                    jEB jeb = next instanceof jEB ? (jEB) next : null;
                    if (Intrinsics.EZpvd((java.lang.Object) jdh.gEmmrt, (java.lang.Object) (jeb != null ? jeb.zsXlph() : null))) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            jDH.this.AEQbTJ(i3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(int i) {
        hET het = (hET) AEQbTJ();
        if (het != null) {
            if (i > 0) {
                android.widget.TextView textView = het.fIwbmz;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                textView.setText(pTD.EZpvd(contextRequireContext, C23274hvD.FragmentManager.hDKMBd, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i)))));
                ConstraintLayout constraintLayout = het.djBIcL;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                ConstraintLayout constraintLayout2 = het.djBIcL;
                constraintLayout2.setOnClickListener(new VoiceInteractor(constraintLayout2, 1000L, this, het));
                return;
            }
            ConstraintLayout constraintLayout3 = het.djBIcL;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final int gEmmrt() {
        RecyclerView recyclerView;
        hET het = (hET) AEQbTJ();
        if (het == null || (recyclerView = het.EZpvd) == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return -1;
        }
        return linearLayoutManager.findFirstVisibleItemPosition();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        RecyclerView recyclerView;
        kMM kmm = new kMM();
        kmm.register(TrackerTrendUIModel.class, new C25736jEl(new Function1() { // from class: o.jDM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jDH.OLrzqt(this.EZpvd, (TrackerTrendUIModel) obj);
            }
        }, new Function1() { // from class: o.jDL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jDH.EZpvd(this.EZpvd, (TrackerTrendUIModel) obj);
            }
        }, new Function1() { // from class: o.jDN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jDH.AYXKKw(this.EZpvd, (TrackerTrendUIModel) obj);
            }
        }, new Function1() { // from class: o.jDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jDH.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        hET het = (hET) AEQbTJ();
        if (het == null || (recyclerView = het.ejfBZ) == null) {
            return;
        }
        recyclerView.setAdapter(kmm);
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        recyclerView.setItemAnimator(null);
    }

    public static final Unit OLrzqt(jDH jdh, TrackerTrendUIModel trackerTrendUIModel) {
        Intrinsics.checkNotNullParameter(trackerTrendUIModel, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.Fragment.copydefault);
        jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.QUICK_BUY_BUTTON, null, null, false, 14, null);
        MemeQuickPopUpSource.Companion.copydefault(MemeQuickPopUpSource.MarketTracker);
        androidx.fragment.app.FragmentManager parentFragmentManager = jdh.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        C25738jEn.AEQbTJ(parentFragmentManager, trackerTrendUIModel, jdh.fetchVPNInfo().isConnected());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(jDH jdh, TrackerTrendUIModel trackerTrendUIModel) {
        Intrinsics.checkNotNullParameter(trackerTrendUIModel, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.PendingIntent.OLrzqt);
        jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.TOKEN_DETAIL_PAGE_CARD, null, null, false, 14, null);
        jdh.KWHzl(trackerTrendUIModel);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(jDH jdh, TrackerTrendUIModel trackerTrendUIModel) {
        Intrinsics.checkNotNullParameter(trackerTrendUIModel, "");
        jdh.OLrzqt(trackerTrendUIModel);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(jDH jdh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.PendingIntent.OLrzqt);
        jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.ADDRESS_INFO_CARD, null, null, false, 14, null);
        jdh.EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(jEB jeb) {
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gKO.StateListAnimator.openMemeQuickTransaction$default(gko, childFragmentManager, fetchVPNInfo().isConnected(), new TokenBase(jeb.djBIcL(), jeb.getNewProxyInstance(), jeb.uzCIH(), "", "", jeb.KWHzl(), "", 0, 0, 0, 0, null, "default_trade", null, null, jeb.isConnected(), null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -37120, null), TransactionType.Buy.getType(), "", null, null, 96, null);
    }

    public final void OLrzqt(jEB jeb) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, "default_trade", new TokenBase(jeb.djBIcL(), jeb.getNewProxyInstance(), jeb.uzCIH(), "", "", jeb.KWHzl(), "", 0, 0, 0, 0, null, "default_trade", null, null, jeb.isConnected(), null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -37120, null), "market_tracker", null, new int[0], 8, null);
        }
    }

    public final void EZpvd(java.lang.String str) {
        xWS xws;
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null || (xws = (xWS) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWS.class))) == null) {
            return;
        }
        xWS.Application.routeProfileAssetPage$default(xws, abstractActivityC33041mov, str, 0L, 4, null);
    }

    public final void KWHzl(TrackerTrendUIModel trackerTrendUIModel) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, "default_trade", new TokenBase(trackerTrendUIModel.AEQbTJ(), trackerTrendUIModel.djBIcL(), trackerTrendUIModel.fetchVPNInfo(), "", "", trackerTrendUIModel.isConnected(), "", 0, 0, 0, 0, null, "default_trade", null, null, trackerTrendUIModel.KWHzl(), null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -37120, null), "market_tracker", null, new int[0], 8, null);
        }
    }

    public final void OLrzqt(TrackerTrendUIModel trackerTrendUIModel) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerFragment$showTopTradersBottomSheet$1(this, trackerTrendUIModel, null), 3, null);
    }

    public final boolean values() {
        return fetchVPNInfo().AYXKKw().getValue().intValue() == 0;
    }

    public final void fIwbmz() {
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listEZpvd = TrackerTxnListFilter.Companion.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            arrayList.add(new PriceRangeFilter((java.lang.String) pair.getFirst(), (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) pair.getSecond(), (java.lang.String) null, false, WalletImportError.ERROR_CODE_AA_CREATE_KEY, (DefaultConstructorMarker) null));
        }
        java.lang.String string = getString(C23274hvD.Fragment.onPictureInPictureModeChanged);
        Intrinsics.checkNotNullExpressionValue(string, "");
        NetworkOptionParams networkOptionParams = new NetworkOptionParams("all", string);
        jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.FILTER_ICON, null, null, false, 14, null);
        C25747jEw.TaskDescription taskDescription = C25747jEw.Companion;
        java.lang.String string2 = getString(C23274hvD.Fragment.onPictureInPictureModeChanged);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TypeOptionParams typeOptionParams = new TypeOptionParams("all", string2);
        java.lang.String string3 = getString(C23274hvD.Fragment.onPreparePanel);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TypeOptionParams typeOptionParams2 = new TypeOptionParams("buy", string3);
        java.lang.String string4 = getString(C23274hvD.Fragment.removeMenuProvider);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        java.util.List listGEmmrt = yDY.gEmmrt(typeOptionParams, typeOptionParams2, new TypeOptionParams("sell", string4));
        java.util.List listEZpvd2 = C56402yEa.EZpvd(networkOptionParams);
        java.util.List<MarketChainBean> listDbNXlk = fetchVPNInfo().DbNXlk();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
        for (MarketChainBean marketChainBean : listDbNXlk) {
            arrayList2.add(new NetworkOptionParams(marketChainBean.getChainId(), marketChainBean.getChainName()));
        }
        taskDescription.OLrzqt(new TrackerFilterBottomSheetParams(listGEmmrt, CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listEZpvd2, (java.lang.Iterable) arrayList2), arrayList, new TrackerTxnListFilter(values(), null, null, null, null, null, null, null, null, null, 1022, null), fetchVPNInfo().OLrzqt().getValue(), null, 32, null)).show(getChildFragmentManager(), C25747jEw.class.getSimpleName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(TrackerTxnListFilter trackerTxnListFilter) {
        hET het;
        AppCompatImageView appCompatImageView;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(requireContext(), trackerTxnListFilter.fetchVPNInfo() ? C52761wXj.TaskDescription.fVBECu : C52761wXj.TaskDescription.GVpNrs);
        if (drawable == null || (het = (hET) AEQbTJ()) == null || (appCompatImageView = het.copydefault) == null) {
            return;
        }
        appCompatImageView.setImageDrawable(drawable);
    }
}
