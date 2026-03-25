package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.data.constant.TokenGroupActionType;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.watch_list_groups.ui.manage.TokenGroupSelectionBottomSheet$setupViews$1$1$1;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams;
import com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kCW extends kCN implements InterfaceC26241jXd {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public C23465hyj AYXKKw;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.kCS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kCW.AYXKKw(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL;

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public kCW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.manage.TokenGroupSelectionBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.manage.TokenGroupSelectionBottomSheet$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedWatchListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.manage.TokenGroupSelectionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.manage.TokenGroupSelectionBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.manage.TokenGroupSelectionBottomSheet$special$$inlined$viewModels$default$5
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

    /* JADX DEBUG: Possible override for method o.kCN.OLrzqt()V */
    public final TokenGroupSelectionParams OLrzqt() {
        TokenGroupSelectionParams tokenGroupSelectionParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (tokenGroupSelectionParams = (TokenGroupSelectionParams) BundleCompat.getParcelable(arguments, "key.selected_token", TokenGroupSelectionParams.class)) == null) ? (TokenGroupSelectionParams) C31200lpY.throwIfDebug$default(null, 1, null) : tokenGroupSelectionParams;
    }

    private final kMM gEmmrt() {
        return (kMM) this.AhwBna.getValue();
    }

    public static final kMM AYXKKw(final kCW kcw) {
        kMM kmm = new kMM();
        kmm.register(CommonGroupUiModel.class, new C27773kCv(false, new Function1() { // from class: o.kCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kCW.copydefault(this.AEQbTJ, (CommonGroupUiModel) obj);
            }
        }, 1, null));
        return kmm;
    }

    public static final Unit copydefault(kCW kcw, CommonGroupUiModel commonGroupUiModel) {
        Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
        kcw.AYXKKw().EZpvd(commonGroupUiModel.KWHzl());
        return Unit.INSTANCE;
    }

    public final SharedWatchListViewModel AYXKKw() {
        return (SharedWatchListViewModel) this.djBIcL.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = C23465hyj.copydefault(getCustomLayoutInflater(), constraintLayout, true);
    }

    private final void AhwBna() {
        C23465hyj c23465hyj = this.AYXKKw;
        if (c23465hyj != null) {
            c23465hyj.AEQbTJ.setAdapter(gEmmrt());
            c23465hyj.AEQbTJ.setItemAnimator(null);
            C52794wYp c52794wYp = c23465hyj.OLrzqt;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
            OKRegularCell oKRegularCell = c23465hyj.copydefault;
            oKRegularCell.setOnClickListener(new Dialog(oKRegularCell, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AkhnZx();
        AhwBna();
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().AEQbTJ(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().OLrzqt(), null, new Activity(), 2, null);
        C25390ivn.AEQbTJ(this, AYXKKw().KWHzl(), Lifecycle.State.RESUMED, new TaskDescription());
        djBIcL();
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<CommonGroupUiModel> list, Continuation<? super Unit> continuation) {
            kCW.this.copydefault(list);
            return Unit.INSTANCE;
        }
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return OLrzqt(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            C52794wYp c52794wYp;
            C23465hyj c23465hyj = kCW.this.AYXKKw;
            if (c23465hyj != null && (c52794wYp = c23465hyj.OLrzqt) != null) {
                c52794wYp.setEnabled(z);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return AEQbTJ(((java.lang.Number) obj).longValue(), continuation);
        }

        public final java.lang.Object AEQbTJ(long j, Continuation<? super Unit> continuation) {
            kCW.this.djBIcL();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        TokenGroupSelectionParams tokenGroupSelectionParamsOLrzqt = OLrzqt();
        if (tokenGroupSelectionParamsOLrzqt != null) {
            AYXKKw().OLrzqt(tokenGroupSelectionParamsOLrzqt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.util.List<CommonGroupUiModel> list) {
        C23465hyj c23465hyj = this.AYXKKw;
        if (c23465hyj != null) {
            java.util.List<?> items = gEmmrt().getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            kMM.setData$default(gEmmrt(), list, null, 2, null);
            if ((!items.isEmpty()) && items.size() != list.size()) {
                c23465hyj.AEQbTJ.smoothScrollToPosition(list.size() - 1);
            }
            LinearLayoutCompat linearLayoutCompat = c23465hyj.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(C33129mqd.KWHzl((java.util.Collection) list) ? 0 : 8);
        }
    }

    public static /* synthetic */ void openGroupNameInputBottomSheet$default(kCW kcw, java.lang.String str, java.lang.Integer num, TokenGroupActionType tokenGroupActionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            tokenGroupActionType = TokenGroupActionType.NEW;
        }
        kcw.EZpvd(str, num, tokenGroupActionType);
    }

    private final void EZpvd(java.lang.String str, java.lang.Integer num, TokenGroupActionType tokenGroupActionType) {
        kCI kciOLrzqt = kCI.Companion.OLrzqt(str, num, tokenGroupActionType);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        kciOLrzqt.show(childFragmentManager);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.AYXKKw = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ kCW OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, kCW kcw) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = kcw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), null, null, new TokenGroupSelectionBottomSheet$setupViews$1$1$1(this.OLrzqt, null), 3, null);
                this.OLrzqt.EZpvd("save");
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ kCW EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, kCW kcw) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = kcw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TokenGroupSelectionParams tokenGroupSelectionParamsOLrzqt = this.EZpvd.OLrzqt();
                if (C33129mqd.copydefault(java.lang.Integer.valueOf(this.EZpvd.AYXKKw().AEQbTJ().getValue().size()), java.lang.Integer.valueOf(20 - ((tokenGroupSelectionParamsOLrzqt != null ? tokenGroupSelectionParamsOLrzqt.KWHzl() : null) == GroupSelectionMode.BULK ? 1 : 0)))) {
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.getSupportedCipherSuites, 0, 1, (java.lang.Object) null);
                } else {
                    kCW.openGroupNameInputBottomSheet$default(this.EZpvd, "", null, TokenGroupActionType.NEW, 2, null);
                    this.EZpvd.EZpvd("add_group");
                }
            }
        }
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        C32866mlf.onEvent$default("DEXMarket_TokenFavorite_PopUp_View", (TrackChannel[]) null, new Function1() { // from class: o.kCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kCW.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(java.lang.String str) {
        C21847hOn.EZpvd("DEXMarket_TokenFavorite_PopUp_Click", str);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final kCW OLrzqt(@NotNull TokenGroupSelectionParams tokenGroupSelectionParams) {
            Intrinsics.checkNotNullParameter(tokenGroupSelectionParams, "");
            kCW kcw = new kCW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.selected_token", tokenGroupSelectionParams);
            kcw.setArguments(bundle);
            return kcw;
        }
    }

    @Override // o.InterfaceC26241jXd
    public void valueOf() {
        djBIcL();
    }
}
