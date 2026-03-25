package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.MemeFilterParams;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1;
import com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1;
import com.okinc.business.market.features.meme.filter.ui.MemeFilterViewModel;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28757kgm extends AbstractC28687kfV {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public final boolean AYXKKw = true;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public TabLayoutMediator isConnected;
    public C21571hEh valueOf;
    public final InterfaceC56387yDm values;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.AYXKKw;
    }

    public C28757kgm() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeProtocolFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterBottomSheet$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.kgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28757kgm.AhwBna(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.kgm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kgm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C28757kgm KWHzl(@NotNull MemeFilterParams memeFilterParams) {
            Intrinsics.checkNotNullParameter(memeFilterParams, "");
            C28757kgm c28757kgm = new C28757kgm();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.meme_filter_params", memeFilterParams);
            c28757kgm.setArguments(bundle);
            return c28757kgm;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemeFilterParams gEmmrt() {
        MemeFilterParams memeFilterParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (memeFilterParams = (MemeFilterParams) BundleCompat.getParcelable(arguments, "key.meme_filter_params", MemeFilterParams.class)) == null) ? new MemeFilterParams(null, null, null, 0, false, 31, null) : memeFilterParams;
    }

    /* JADX INFO: renamed from: o.kgm$Application */
    public static final class Application implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C28757kgm copydefault;

        /* JADX INFO: renamed from: o.kgm$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ C28757kgm OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C28757kgm c28757kgm) {
                this.copydefault = flowCollector;
                this.OLrzqt = c28757kgm;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MemeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1 memeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1;
                if (continuation instanceof MemeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1) {
                    memeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1 = (MemeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1) continuation;
                    int i = memeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        memeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        memeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1 = new MemeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = memeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = memeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    C28667kfB c28667kfB = (C28667kfB) obj;
                    java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(!c28667kfB.copydefault() && (c28667kfB.OLrzqt() || !this.OLrzqt.gEmmrt().AEQbTJ()));
                    memeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, memeFilterBottomSheet$onFooterCreated$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, C28757kgm c28757kgm) {
            this.AEQbTJ = flow;
            this.copydefault = c28757kgm;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final boolean valueOf() {
        return gEmmrt().EZpvd() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemeFilterViewModel isConnected() {
        return (MemeFilterViewModel) this.values.getValue();
    }

    public final MemeProtocolFilterViewModel AhwBna() {
        return (MemeProtocolFilterViewModel) this.gEmmrt.getValue();
    }

    public final C28722kgD AYXKKw() {
        return (C28722kgD) this.AhwBna.getValue();
    }

    public static final C28722kgD AhwBna(C28757kgm c28757kgm) {
        return new C28722kgD(c28757kgm, c28757kgm.gEmmrt());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        isConnected().OLrzqt(gEmmrt());
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = wxq.getContext().getString(C23274hvD.Fragment.copydefault);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.valueOf = C21571hEh.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        values();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Flow application;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(wyf.getContext().getString(C23274hvD.Fragment.dpErvT));
        wyf.setSecondaryText(wyf.getContext().getString(C23274hvD.Fragment.hDKMBd));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setVisibility(0);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(0);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setContentDescription("web3_dex_market_pump_filter_apply_btn");
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setContentDescription("web3_dex_market_pump_filter_reject_btn");
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new TaskDescription(c52794wYpCopydefault3, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ4 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ4 != null) {
            c52794wYpAEQbTJ4.setOnClickListener(new ActionBar(c52794wYpAEQbTJ4, 1000L, this));
        }
        if (valueOf()) {
            application = FlowKt.combine(isConnected().getFieldNames(), AhwBna().OLrzqt(), new MemeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1(this, null));
        } else {
            application = new Application(isConnected().getFieldNames(), this);
        }
        C25390ivn.collectOnViewLifecycle$default(this, application, null, new Activity(wyf), 2, null);
    }

    /* JADX INFO: renamed from: o.kgm$Activity */
    public static final class Activity<T> implements FlowCollector {
        public final /* synthetic */ wYF EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(wYF wyf) {
            this.EZpvd = wyf;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return OLrzqt(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            C52794wYp c52794wYpCopydefault = this.EZpvd.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(z);
            }
            return Unit.INSTANCE;
        }
    }

    public final InterfaceC28758kgn djBIcL() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC28758kgn) {
            return (InterfaceC28758kgn) parentFragment;
        }
        return null;
    }

    private final void values() {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (valueOf()) {
            java.lang.String string = getString(C23274hvD.Fragment.gZKUVK);
            Intrinsics.checkNotNullExpressionValue(string, "");
            listOLrzqt.add(string);
        }
        java.lang.String string2 = getString(C23274hvD.Fragment.onProviderEnabled);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        listOLrzqt.add(string2);
        java.lang.String string3 = getString(C23274hvD.Fragment.onProviderDisabled);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        listOLrzqt.add(string3);
        java.lang.String string4 = getString(C23274hvD.Fragment.skipToQueueItem);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        listOLrzqt.add(string4);
        final java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        C21571hEh c21571hEh = this.valueOf;
        if (c21571hEh != null) {
            c21571hEh.OLrzqt.setAdapter(AYXKKw());
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c21571hEh.copydefault.copydefault(), c21571hEh.OLrzqt, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.kgj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C28757kgm.AEQbTJ(listFARcdN, tab, i);
                }
            });
            tabLayoutMediator.attach();
            this.isConnected = tabLayoutMediator;
            c21571hEh.copydefault.setFadingEdgeLength(0);
            android.view.View viewFindViewById = c21571hEh.copydefault.findViewById(C52761wXj.FragmentManager.hrjNmC);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            android.view.View viewFindViewById2 = c21571hEh.copydefault.findViewById(C52761wXj.FragmentManager.AxsJAYaxsJAY);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            c21571hEh.OLrzqt.setCurrentItem(gEmmrt().OLrzqt(), false);
        }
    }

    public static final void AEQbTJ(java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText((java.lang.CharSequence) list.get(i));
    }

    /* JADX INFO: renamed from: o.kgm$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C28757kgm AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28757kgm c28757kgm) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c28757kgm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.List<java.lang.String> listAhwBna;
            MemeProtocolFilterUiData memeProtocolFilterUiDataEZpvd;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.isConnected().getNewProxyInstance();
                MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParamsEZpvd = this.AEQbTJ.gEmmrt().EZpvd();
                if (memeProtocolFilterBottomSheetParamsEZpvd == null || (memeProtocolFilterUiDataEZpvd = memeProtocolFilterBottomSheetParamsEZpvd.EZpvd()) == null || (listAhwBna = memeProtocolFilterUiDataEZpvd.EZpvd()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                java.util.List<InterfaceC28823khz.ActionBar> value = this.AEQbTJ.AhwBna().OLrzqt().getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : value) {
                    if (((InterfaceC28823khz.ActionBar) obj).EZpvd()) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((InterfaceC28823khz.ActionBar) it.next()).copydefault());
                }
                InterfaceC28758kgn interfaceC28758kgnDjBIcL = this.AEQbTJ.djBIcL();
                if (interfaceC28758kgnDjBIcL != null) {
                    MemeFilter memeFilterCopydefault = this.AEQbTJ.gEmmrt().copydefault();
                    if (memeFilterCopydefault == null) {
                        memeFilterCopydefault = new MemeFilter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, 0, -1, 31, (DefaultConstructorMarker) null);
                    }
                    interfaceC28758kgnDjBIcL.OLrzqt(memeFilterCopydefault, listAhwBna, arrayList2, this.AEQbTJ.isConnected().AYXKKw());
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.kgm$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C28757kgm AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C28757kgm c28757kgm) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c28757kgm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ();
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public final void AEQbTJ() {
        C55254xgV c55254xgV;
        MemeFilter memeFilterValues = isConnected().values();
        java.util.List<InterfaceC28823khz.ActionBar> value = AhwBna().OLrzqt().getValue();
        java.util.ArrayList<InterfaceC28823khz.ActionBar> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : value) {
            if (((InterfaceC28823khz.ActionBar) obj).EZpvd()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InterfaceC28823khz.ActionBar actionBar : arrayList) {
            arrayList2.add(C56390yDp.OLrzqt(actionBar.OLrzqt(), actionBar.copydefault()));
        }
        kotlin.Pair pairDTwDnp = C56403yEb.DTwDnp(arrayList2);
        java.util.List<java.lang.String> list = (java.util.List) pairDTwDnp.component1();
        java.util.List<java.lang.String> list2 = (java.util.List) pairDTwDnp.component2();
        InterfaceC28758kgn interfaceC28758kgnDjBIcL = djBIcL();
        if (interfaceC28758kgnDjBIcL != null) {
            C21571hEh c21571hEh = this.valueOf;
            interfaceC28758kgnDjBIcL.OLrzqt(memeFilterValues.copy(((-1) & 1) != 0 ? memeFilterValues.top10HoldingMin : null, ((-1) & 2) != 0 ? memeFilterValues.top10HoldingMax : null, ((-1) & 4) != 0 ? memeFilterValues.devHoldingMin : null, ((-1) & 8) != 0 ? memeFilterValues.devHoldingMax : null, ((-1) & 16) != 0 ? memeFilterValues.insiderMin : null, ((-1) & 32) != 0 ? memeFilterValues.insiderMax : null, ((-1) & 64) != 0 ? memeFilterValues.sniperMin : null, ((-1) & 128) != 0 ? memeFilterValues.sniperMax : null, ((-1) & 256) != 0 ? memeFilterValues.bundleMin : null, ((-1) & 512) != 0 ? memeFilterValues.bundleMax : null, ((-1) & 1024) != 0 ? memeFilterValues.freshHoldMin : null, ((-1) & 2048) != 0 ? memeFilterValues.freshHoldMax : null, ((-1) & 4096) != 0 ? memeFilterValues.phishHoldMin : null, ((-1) & 8192) != 0 ? memeFilterValues.phishHoldMax : null, ((-1) & 16384) != 0 ? memeFilterValues.bondingMin : null, ((-1) & 32768) != 0 ? memeFilterValues.bondingMax : null, ((-1) & 65536) != 0 ? memeFilterValues.migratedTokensMin : null, ((-1) & 131072) != 0 ? memeFilterValues.migratedTokensMax : null, ((-1) & 262144) != 0 ? memeFilterValues.marketCapMin : null, ((-1) & 524288) != 0 ? memeFilterValues.marketCapMax : null, ((-1) & 1048576) != 0 ? memeFilterValues.volumeMin : null, ((-1) & 2097152) != 0 ? memeFilterValues.volumeMax : null, ((-1) & 4194304) != 0 ? memeFilterValues.holdersMin : null, ((-1) & 8388608) != 0 ? memeFilterValues.holdersMax : null, ((-1) & 16777216) != 0 ? memeFilterValues.tokenAgeMin : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? memeFilterValues.tokenAgeMax : null, ((-1) & 67108864) != 0 ? memeFilterValues.tokenAgeUnit : null, ((-1) & 134217728) != 0 ? memeFilterValues.transactionsMin : null, ((-1) & 268435456) != 0 ? memeFilterValues.transactionsMax : null, ((-1) & 536870912) != 0 ? memeFilterValues.buyMin : null, ((-1) & 1073741824) != 0 ? memeFilterValues.buyMax : null, ((-1) & Integer.MIN_VALUE) != 0 ? memeFilterValues.sellMin : null, (15 & 1) != 0 ? memeFilterValues.sellMax : null, (15 & 2) != 0 ? memeFilterValues.keyword : null, (15 & 4) != 0 ? memeFilterValues.keywordExclude : null, (15 & 8) != 0 ? memeFilterValues.selectedSocialData : null, (15 & 16) != 0 ? memeFilterValues.lastTab : (c21571hEh == null || (c55254xgV = c21571hEh.copydefault) == null) ? 0 : c55254xgV.AEQbTJ()), list, list2, isConnected().AYXKKw());
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (isConnected().AYXKKw()) {
            AEQbTJ();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
        TabLayoutMediator tabLayoutMediator = this.isConnected;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.isConnected = null;
    }
}
