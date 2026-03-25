package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.MemeFilterParams;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams;
import com.okinc.business.market.features.meme.selection_filter.MemeSelection;
import com.okinc.business.market.features.meme.selection_filter.MemeSelectionParams;
import com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2;
import com.okinc.business.market.features.scanner.trench.TrenchContainerFragment$updatePausePlayButtonVisibility$1;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C23274hvD;
import o.C28757kgm;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC28637keY;
import o.InterfaceC29291kqq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ksL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29366ksL extends AbstractC29358ksD implements InterfaceC28773khB, InterfaceC28758kgn, InterfaceC29291kqq {
    public boolean AhwBna;
    public int AkhnZx;
    public TabLayoutMediator DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public java.util.List<C28696kfe> fARcdN;
    public final java.util.Set<java.lang.Integer> fIwbmz;
    public int fetchVPNInfo;
    public hBY gEmmrt;
    public C29368ksN isConnected;
    public int valueOf;
    public Job values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    @Override // o.InterfaceC29291kqq
    public void AEQbTJ(int i, @NotNull java.util.List<java.lang.Integer> list) {
        InterfaceC29291kqq.Activity.EZpvd(this, i, list);
    }

    public C29366ksL() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.scanner.trench.TrenchContainerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.scanner.trench.TrenchContainerFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeActivityViewModelV2.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.scanner.trench.TrenchContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.scanner.trench.TrenchContainerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.scanner.trench.TrenchContainerFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = true;
        this.fARcdN = yDY.AhwBna();
        this.fIwbmz = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemeActivityViewModelV2 AYXKKw() {
        return (MemeActivityViewModelV2) this.djBIcL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBY hbyKWHzl = hBY.KWHzl(layoutInflater, viewGroup, false);
        this.gEmmrt = hbyKWHzl;
        if (hbyKWHzl != null) {
            return hbyKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        DbNXlk();
        valueOf();
        gEmmrt();
    }

    @Override // o.InterfaceC29291kqq
    public void AEQbTJ(int i) {
        this.AhwBna = true;
        AYXKKw().copydefault(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        AYXKKw().AkhnZx();
        C29229kph.EZpvd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AYXKKw().isConnected();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Job job = this.values;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.values = null;
        this.isConnected = null;
        TabLayoutMediator tabLayoutMediator = this.DbNXlk;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.DbNXlk = null;
        this.gEmmrt = null;
    }

    private final void DbNXlk() {
        hBY hby = this.gEmmrt;
        if (hby != null) {
            android.widget.ImageView imageView = hby.valueOf;
            imageView.setOnClickListener(new Dialog(imageView, 1000L, this));
            android.widget.ImageView imageView2 = hby.AYXKKw;
            imageView2.setOnClickListener(new LoaderManager(imageView2, 1000L, this));
            android.widget.ImageView imageView3 = hby.djBIcL;
            imageView3.setOnClickListener(new VoiceInteractor(imageView3, 1000L, this));
            LottieAnimationView lottieAnimationView = hby.AEQbTJ;
            lottieAnimationView.setOnClickListener(new TaskStackBuilder(lottieAnimationView, 1000L, this));
            C55173xeu c55173xeu = hby.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            C28577kdR.OLrzqt(this, c55173xeu, new Function0() { // from class: o.ksM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29366ksL.isConnected(this.KWHzl);
                }
            });
            C55113xdn.showLoading$default(hby.gEmmrt, 0L, 1, null);
        }
    }

    public static final Unit isConnected(C29366ksL c29366ksL) {
        c29366ksL.AYXKKw().copydefault(false);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        StateFlow stateFlow = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(AYXKKw().OLrzqt(), this.valueOf);
        if (stateFlow != null) {
            copydefault((C28634keV) stateFlow.getValue());
        }
    }

    /* JADX INFO: renamed from: o.ksL$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28637keY interfaceC28637keY, Continuation<? super Unit> continuation) {
            hBY hby = C29366ksL.this.gEmmrt;
            if (hby != null) {
                C55113xdn c55113xdn = hby.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                C55173xeu c55173xeu = hby.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                C28577kdR.AEQbTJ(interfaceC28637keY, c55113xdn, c55173xeu, (java.util.List<? extends android.view.View>) yDY.gEmmrt(hby.EZpvd, hby.fetchVPNInfo));
            }
            if (Intrinsics.EZpvd(interfaceC28637keY, InterfaceC28637keY.TaskDescription.KWHzl)) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C29366ksL.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            } else if (!(interfaceC28637keY instanceof InterfaceC28637keY.StateListAnimator)) {
                if (interfaceC28637keY instanceof InterfaceC28637keY.Activity) {
                    if (C29366ksL.this.AhwBna) {
                        C29366ksL.this.KWHzl((InterfaceC28637keY.Activity) interfaceC28637keY);
                        C29366ksL.this.AhwBna = false;
                    }
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C29366ksL.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void gEmmrt() {
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().KWHzl(), null, new Application(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().OLrzqt().get(0), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().OLrzqt().get(1), null, new Activity(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().OLrzqt().get(2), null, new TaskDescription(), 2, null);
    }

    /* JADX INFO: renamed from: o.ksL$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C29366ksL EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C29366ksL c29366ksL) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c29366ksL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.EZpvd();
            }
        }
    }

    /* JADX INFO: renamed from: o.ksL$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C29366ksL OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C29366ksL c29366ksL) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c29366ksL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.djBIcL();
            }
        }
    }

    /* JADX INFO: renamed from: o.ksL$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28634keV c28634keV, Continuation<? super Unit> continuation) {
            if (C29366ksL.this.valueOf == 0) {
                C29366ksL.this.copydefault(c28634keV);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ksL$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29366ksL OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, C29366ksL c29366ksL) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c29366ksL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.AYXKKw().EZpvd(this.OLrzqt.valueOf, true);
                C29229kph.AEQbTJ("stop", this.OLrzqt.valueOf);
            }
        }
    }

    /* JADX INFO: renamed from: o.ksL$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C29366ksL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C29366ksL c29366ksL) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c29366ksL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AYXKKw().copydefault(this.copydefault.valueOf, true);
                C29229kph.AEQbTJ(TtmlNode.START, this.copydefault.valueOf);
            }
        }
    }

    /* JADX INFO: renamed from: o.ksL$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28634keV c28634keV, Continuation<? super Unit> continuation) {
            if (C29366ksL.this.valueOf == 1) {
                C29366ksL.this.copydefault(c28634keV);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ksL$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28634keV c28634keV, Continuation<? super Unit> continuation) {
            if (C29366ksL.this.valueOf == 2) {
                C29366ksL.this.copydefault(c28634keV);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ksL$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return EZpvd(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object EZpvd(boolean z, Continuation<? super Unit> continuation) {
            C29366ksL.this.OLrzqt(!z);
            return Unit.INSTANCE;
        }
    }

    private final void valueOf() {
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().gEmmrt(), null, new FragmentManager(), 2, null);
    }

    public final void copydefault(C28634keV c28634keV) {
        ChainInfoData chainInfoData;
        android.graphics.drawable.Drawable drawableKWHzl;
        java.lang.String strKWHzl;
        java.util.List<ChainInfoData> chainInfos;
        java.lang.Object next;
        hBY hby = this.gEmmrt;
        if (hby != null) {
            ConfigInfoData configInfoDataEZpvd = AYXKKw().EZpvd();
            if (configInfoDataEZpvd == null || (chainInfos = configInfoDataEZpvd.getChainInfos()) == null) {
                chainInfoData = null;
            } else {
                java.util.Iterator<T> it = chainInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((ChainInfoData) next).EZpvd(), (java.lang.Object) c28634keV.copydefault())) {
                            break;
                        }
                    }
                }
                chainInfoData = (ChainInfoData) next;
            }
            android.widget.ImageView imageView = hby.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(chainInfoData != null ? 0 : 8);
            android.widget.ImageView imageView2 = hby.valueOf;
            Intrinsics.copydefault(imageView2);
            imageView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) (chainInfoData != null ? chainInfoData.KWHzl() : null)) ? 0 : 8);
            if (chainInfoData != null && (strKWHzl = chainInfoData.KWHzl()) != null) {
                C33054mpH.AEQbTJ(imageView2, strKWHzl);
            }
            android.widget.ImageView imageView3 = hby.AYXKKw;
            if (c28634keV.OLrzqt() || !Intrinsics.EZpvd(c28634keV.AEQbTJ().OLrzqt(), c28634keV.AEQbTJ().EZpvd())) {
                drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.GVpNrs);
            } else {
                drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.fVBECu);
            }
            imageView3.setImageDrawable(drawableKWHzl);
        }
    }

    public final void OLrzqt(boolean z) {
        android.view.View childAt;
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        hBY hby = this.gEmmrt;
        android.view.View childAt2 = (hby == null || (c55244xgL = hby.EZpvd) == null || (tabLayoutAYXKKw = c55244xgL.AYXKKw()) == null) ? null : tabLayoutAYXKKw.getChildAt(0);
        android.view.ViewGroup viewGroup = childAt2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt2 : null;
        int childCount = viewGroup != null ? viewGroup.getChildCount() : 0;
        for (int i = 0; i < childCount; i++) {
            if (viewGroup != null && (childAt = viewGroup.getChildAt(i)) != null) {
                childAt.setEnabled(z);
                childAt.setClickable(z);
            }
        }
    }

    public final void KWHzl(InterfaceC28637keY.Activity activity) {
        java.util.List<C28696kfe> listEZpvd = activity.EZpvd();
        this.fARcdN = listEZpvd;
        this.isConnected = new C29368ksN(this, listEZpvd.size());
        hBY hby = this.gEmmrt;
        if (hby != null) {
            C55244xgL c55244xgL = hby.EZpvd;
            c55244xgL.setOKDSSize(-20);
            c55244xgL.setStyle(2);
            c55244xgL.setIncludeVerticalPadding(false);
            ViewPager2 viewPager2 = hby.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "");
            C29368ksN c29368ksN = this.isConnected;
            if (c29368ksN == null) {
                return;
            }
            C28577kdR.AEQbTJ(viewPager2, (RecyclerView.Adapter<?>) c29368ksN, 1, false);
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(hby.EZpvd.AYXKKw(), hby.fetchVPNInfo, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.ksK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C29366ksL.EZpvd(this.KWHzl, tab, i);
                }
            });
            this.DbNXlk = tabLayoutMediator;
            tabLayoutMediator.attach();
            hby.fetchVPNInfo.registerOnPageChangeCallback(new Fragment());
            OLrzqt(!AYXKKw().gEmmrt().getValue().booleanValue());
            hby.EZpvd.AYXKKw().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new PendingIntent(hby, this));
            C55244xgL c55244xgL2 = hby.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55244xgL2, "");
            c55244xgL2.setVisibility(0);
            ViewPager2 viewPager22 = hby.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(viewPager22, "");
            viewPager22.setVisibility(0);
            EZpvd(this.valueOf);
        }
    }

    public static final void EZpvd(C29366ksL c29366ksL, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c29366ksL.fARcdN.get(i).AEQbTJ());
    }

    /* JADX INFO: renamed from: o.ksL$Fragment */
    public static final class Fragment extends ViewPager2.OnPageChangeCallback {
        public Fragment() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            C29370ksP c29370ksPCopydefault;
            super.onPageSelected(i);
            C29229kph.copydefault(C29366ksL.this.AkhnZx, i);
            if (!C29366ksL.this.fIwbmz.contains(java.lang.Integer.valueOf(i))) {
                C29368ksN c29368ksN = C29366ksL.this.isConnected;
                if (c29368ksN != null && (c29370ksPCopydefault = c29368ksN.copydefault(i)) != null) {
                    c29370ksPCopydefault.djBIcL();
                }
                C29366ksL.this.fIwbmz.add(java.lang.Integer.valueOf(i));
            }
            C29368ksN c29368ksN2 = C29366ksL.this.isConnected;
            C29370ksP c29370ksPCopydefault2 = c29368ksN2 != null ? c29368ksN2.copydefault(i) : null;
            C29368ksN c29368ksN3 = C29366ksL.this.isConnected;
            C29370ksP c29370ksPCopydefault3 = c29368ksN3 != null ? c29368ksN3.copydefault(C29366ksL.this.AkhnZx) : null;
            if (c29370ksPCopydefault3 != null) {
                c29370ksPCopydefault3.fetchVPNInfo();
            }
            if (c29370ksPCopydefault2 != null) {
                c29370ksPCopydefault2.valueOf();
            }
            C29366ksL.this.valueOf = i;
            C29366ksL.this.AYXKKw().copydefault(i);
            C29366ksL.this.AkhnZx = i;
            C29366ksL.this.AhwBna();
            C29366ksL.this.EZpvd(i);
        }
    }

    /* JADX INFO: renamed from: o.ksL$PendingIntent */
    public static final class PendingIntent implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C29366ksL EZpvd;
        public final /* synthetic */ hBY KWHzl;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public PendingIntent(hBY hby, C29366ksL c29366ksL) {
            this.KWHzl = hby;
            this.EZpvd = c29366ksL;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                hBY hby = this.KWHzl;
                C29366ksL c29366ksL = this.EZpvd;
                hby.fetchVPNInfo.setCurrentItem(tab.getPosition(), false);
                int position = tab.getPosition();
                if (position != 0) {
                    if (position == c29366ksL.fARcdN.size() - 1) {
                        hby.OLrzqt.fullScroll(66);
                        return;
                    }
                    return;
                }
                hby.OLrzqt.fullScroll(17);
            }
        }
    }

    public final void EZpvd(int i) {
        Job job = this.values;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        this.values = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TrenchContainerFragment$updatePausePlayButtonVisibility$1(this, i, null), 3, null);
    }

    public final void EZpvd() {
        java.util.List listAhwBna;
        java.util.List<ChainInfoData> chainInfos;
        ConfigInfoData configInfoDataEZpvd = AYXKKw().EZpvd();
        if (configInfoDataEZpvd == null || (chainInfos = configInfoDataEZpvd.getChainInfos()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(chainInfos, 10));
            for (ChainInfoData chainInfoData : chainInfos) {
                java.lang.String strEZpvd = chainInfoData.EZpvd();
                listAhwBna.add(new MemeSelection(chainInfoData.OLrzqt(), null, chainInfoData.KWHzl(), java.lang.Integer.valueOf(C57406yhn.Activity.QKVWgx), Intrinsics.EZpvd((java.lang.Object) chainInfoData.EZpvd(), (java.lang.Object) AYXKKw().AEQbTJ(this.valueOf).copydefault()), strEZpvd, null, 66, null));
            }
        }
        C28819khv.Companion.KWHzl(new MemeSelectionParams(listAhwBna, C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistryOwner), this.valueOf)).show(getChildFragmentManager(), "DexSelectionBottomSheet");
        C29229kph.AEQbTJ("network", this.valueOf);
    }

    @Override // o.InterfaceC28773khB
    public void copydefault(MemeSelection memeSelection, int i) {
        java.lang.String strKWHzl;
        if (memeSelection == null || (strKWHzl = memeSelection.KWHzl()) == null) {
            return;
        }
        AYXKKw().KWHzl(i, strKWHzl);
        C29229kph.copydefault(memeSelection.KWHzl(), memeSelection.djBIcL(), this.valueOf);
    }

    public final void djBIcL() {
        if (getChildFragmentManager().findFragmentByTag("MemeFilterBottomSheet") != null) {
            return;
        }
        C28757kgm.StateListAnimator stateListAnimator = C28757kgm.Companion;
        MemeFilter memeFilterKWHzl = AYXKKw().AEQbTJ(this.valueOf).KWHzl();
        stateListAnimator.KWHzl(new MemeFilterParams(memeFilterKWHzl.copy(((-1) & 1) != 0 ? memeFilterKWHzl.top10HoldingMin : null, ((-1) & 2) != 0 ? memeFilterKWHzl.top10HoldingMax : null, ((-1) & 4) != 0 ? memeFilterKWHzl.devHoldingMin : null, ((-1) & 8) != 0 ? memeFilterKWHzl.devHoldingMax : null, ((-1) & 16) != 0 ? memeFilterKWHzl.insiderMin : null, ((-1) & 32) != 0 ? memeFilterKWHzl.insiderMax : null, ((-1) & 64) != 0 ? memeFilterKWHzl.sniperMin : null, ((-1) & 128) != 0 ? memeFilterKWHzl.sniperMax : null, ((-1) & 256) != 0 ? memeFilterKWHzl.bundleMin : null, ((-1) & 512) != 0 ? memeFilterKWHzl.bundleMax : null, ((-1) & 1024) != 0 ? memeFilterKWHzl.freshHoldMin : null, ((-1) & 2048) != 0 ? memeFilterKWHzl.freshHoldMax : null, ((-1) & 4096) != 0 ? memeFilterKWHzl.phishHoldMin : null, ((-1) & 8192) != 0 ? memeFilterKWHzl.phishHoldMax : null, ((-1) & 16384) != 0 ? memeFilterKWHzl.bondingMin : null, ((-1) & 32768) != 0 ? memeFilterKWHzl.bondingMax : null, ((-1) & 65536) != 0 ? memeFilterKWHzl.migratedTokensMin : null, ((-1) & 131072) != 0 ? memeFilterKWHzl.migratedTokensMax : null, ((-1) & 262144) != 0 ? memeFilterKWHzl.marketCapMin : null, ((-1) & 524288) != 0 ? memeFilterKWHzl.marketCapMax : null, ((-1) & 1048576) != 0 ? memeFilterKWHzl.volumeMin : null, ((-1) & 2097152) != 0 ? memeFilterKWHzl.volumeMax : null, ((-1) & 4194304) != 0 ? memeFilterKWHzl.holdersMin : null, ((-1) & 8388608) != 0 ? memeFilterKWHzl.holdersMax : null, ((-1) & 16777216) != 0 ? memeFilterKWHzl.tokenAgeMin : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? memeFilterKWHzl.tokenAgeMax : null, ((-1) & 67108864) != 0 ? memeFilterKWHzl.tokenAgeUnit : null, ((-1) & 134217728) != 0 ? memeFilterKWHzl.transactionsMin : null, ((-1) & 268435456) != 0 ? memeFilterKWHzl.transactionsMax : null, ((-1) & 536870912) != 0 ? memeFilterKWHzl.buyMin : null, ((-1) & 1073741824) != 0 ? memeFilterKWHzl.buyMax : null, ((-1) & Integer.MIN_VALUE) != 0 ? memeFilterKWHzl.sellMin : null, (15 & 1) != 0 ? memeFilterKWHzl.sellMax : null, (15 & 2) != 0 ? memeFilterKWHzl.keyword : null, (15 & 4) != 0 ? memeFilterKWHzl.keywordExclude : null, (15 & 8) != 0 ? memeFilterKWHzl.selectedSocialData : null, (15 & 16) != 0 ? memeFilterKWHzl.lastTab : this.fetchVPNInfo), null, new MemeProtocolFilterBottomSheetParams(AYXKKw().AEQbTJ(this.valueOf).AEQbTJ(), this.valueOf), 0, false, 10, null)).show(getChildFragmentManager(), "MemeFilterBottomSheet");
        C29229kph.AEQbTJ("filter", this.valueOf);
    }

    /* JADX INFO: renamed from: o.ksL$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ksL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final androidx.fragment.app.Fragment copydefault() {
            return new C29366ksL();
        }
    }

    @Override // o.InterfaceC28758kgn
    public void OLrzqt(@NotNull MemeFilter memeFilter, @NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, boolean z) {
        Intrinsics.checkNotNullParameter(memeFilter, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        AYXKKw().copydefault(this.valueOf, memeFilter, list, z);
        java.util.List<ProtocolInfoData> listCopydefault = AYXKKw().AEQbTJ(this.valueOf).AEQbTJ().copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listCopydefault) {
            if (list.contains(((ProtocolInfoData) obj).getProtocolId())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ProtocolInfoData) it.next()).getProtocolTagKey());
        }
        C29229kph.KWHzl(memeFilter, arrayList2);
        this.fetchVPNInfo = memeFilter.getLastTab();
    }
}
