package o;

import android.view.View;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.data.constant.TokenGroupActionType;
import com.okinc.business.market.features.address_tracker.TrackerGroupManageViewModel;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.watch_list_groups.GroupEditParams;
import com.okinc.business.market.features.watch_list_groups.GroupType;
import com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$checkLoginStatus$2;
import com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$handleLoginFlow$1;
import com.okinc.business.market.features.watch_list_groups.WatchlistJwtViewModel;
import com.okinc.business.market.features.watch_list_groups.ui.viewmodel.WatchlistGroupViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
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
import o.InterfaceC26239jXb;
import o.InterfaceC27779kDa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kBV extends kBW implements kMO, InterfaceC26241jXd, kCP {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm gEmmrt;
    public C23385hxI valueOf;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.kBZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kBV.djBIcL(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.kCc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kBV.valueOf(this.KWHzl);
        }
    });

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupType.values().length];
            try {
                iArr[GroupType.TRACKER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[TokenGroupActionType.values().length];
            try {
                iArr2[TokenGroupActionType.EDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[TokenGroupActionType.DELETE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr2;
        }
    }

    public kBV() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(WatchlistGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(TrackerGroupManageViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$special$$inlined$viewModels$default$6
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(WatchlistJwtViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$special$$inlined$viewModels$default$9
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final GroupEditParams values() {
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        GroupEditParams groupEditParams = (GroupEditParams) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "group_params", GroupEditParams.class));
        return groupEditParams == null ? new GroupEditParams(null, false, 3, null) : groupEditParams;
    }

    public final WatchlistGroupViewModel fetchVPNInfo() {
        return (WatchlistGroupViewModel) this.AkhnZx.getValue();
    }

    public final TrackerGroupManageViewModel AkhnZx() {
        return (TrackerGroupManageViewModel) this.gEmmrt.getValue();
    }

    public final WatchlistJwtViewModel djBIcL() {
        return (WatchlistJwtViewModel) this.AYXKKw.getValue();
    }

    public final InterfaceC26246jXi isConnected() {
        GroupEditParams groupEditParamsValues = values();
        return (groupEditParamsValues != null ? groupEditParamsValues.copydefault() : null) == GroupType.FAVOURITE ? fetchVPNInfo() : AkhnZx();
    }

    private final ItemTouchHelper DbNXlk() {
        return (ItemTouchHelper) this.djBIcL.getValue();
    }

    public static final ItemTouchHelper djBIcL(kBV kbv) {
        return new ItemTouchHelper(new kMR(kbv));
    }

    public final C27777kCz AYXKKw() {
        return (C27777kCz) this.AhwBna.getValue();
    }

    public static final C27777kCz valueOf(final kBV kbv) {
        return new C27777kCz(kbv.DbNXlk(), new Function1() { // from class: o.kCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kBV.KWHzl(this.copydefault, (CommonGroupUiModel) obj);
            }
        });
    }

    public static final Unit KWHzl(kBV kbv, CommonGroupUiModel commonGroupUiModel) {
        java.util.List<CommonGroupUiModel> listEZpvd;
        Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
        if (kbv.values().copydefault() == GroupType.TRACKER) {
            jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.ALL_GROUPS_OPTIONS);
        } else {
            C29229kph.KWHzl(kbv.values().KWHzl(), "all_groups_options");
        }
        java.util.List<? extends TokenGroupActionType> listAhwBna = yDY.AhwBna(TokenGroupActionType.EDIT);
        InterfaceC26239jXb value = kbv.isConnected().copydefault().getValue();
        java.lang.Integer numValueOf = null;
        InterfaceC26239jXb.ActionBar actionBar = value instanceof InterfaceC26239jXb.ActionBar ? (InterfaceC26239jXb.ActionBar) value : null;
        if (actionBar != null && (listEZpvd = actionBar.EZpvd()) != null) {
            numValueOf = java.lang.Integer.valueOf(listEZpvd.size());
        }
        if (C33129mqd.AEQbTJ(numValueOf, 1)) {
            listAhwBna.add(TokenGroupActionType.DELETE);
        }
        kCO kcoKWHzl = kCO.Companion.KWHzl(listAhwBna, commonGroupUiModel);
        androidx.fragment.app.FragmentManager supportFragmentManager = kbv.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        kcoKWHzl.show(supportFragmentManager);
        return Unit.INSTANCE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kBV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.kMO
    public boolean KWHzl(int i, int i2) {
        if (values().copydefault() == GroupType.TRACKER) {
            jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.MOVE_GROUP);
        }
        AYXKKw().AEQbTJ(i, i2);
        AYXKKw().notifyItemMoved(i, i2);
        return true;
    }

    @Override // o.kMO
    public void AhwBna() {
        final java.util.List<CommonGroupUiModel> listOLrzqt = AYXKKw().OLrzqt();
        EZpvd(new Function0() { // from class: o.kCb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kBV.OLrzqt(this.AEQbTJ, listOLrzqt);
            }
        });
        AEQbTJ("drag_move");
        C29229kph.KWHzl(values().KWHzl(), "move_group");
    }

    public static final Unit OLrzqt(kBV kbv, java.util.List list) {
        kbv.isConnected().copydefault(list);
        return Unit.INSTANCE;
    }

    @Override // o.kBW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C23385hxI c23385hxIAEQbTJ = C23385hxI.AEQbTJ(getLayoutInflater());
        this.valueOf = c23385hxIAEQbTJ;
        setContentView(c23385hxIAEQbTJ != null ? c23385hxIAEQbTJ.getRoot() : null);
        fARcdN();
        fJNWhG();
        C25390ivn.collectOnLifecycle$default(this, isConnected().copydefault(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnLifecycle$default(this, isConnected().AEQbTJ(), null, new ActionBar(), 2, null);
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26239jXb interfaceC26239jXb, Continuation<? super Unit> continuation) {
            kBV.this.copydefault(interfaceC26239jXb);
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC27779kDa interfaceC27779kDa, Continuation<? super Unit> continuation) {
            kBV.this.OLrzqt(interfaceC27779kDa);
            return Unit.INSTANCE;
        }
    }

    private final void fARcdN() {
        C23385hxI c23385hxI = this.valueOf;
        if (c23385hxI != null) {
            GroupEditParams groupEditParamsValues = values();
            GroupType groupTypeCopydefault = groupEditParamsValues != null ? groupEditParamsValues.copydefault() : null;
            if (groupTypeCopydefault != null && StateListAnimator.AEQbTJ[groupTypeCopydefault.ordinal()] == 1) {
                c23385hxI.AEQbTJ.setAppBarTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.OnBackPressedDispatcherKtaddCallbackcallback1));
            } else {
                c23385hxI.AEQbTJ.setAppBarTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.INotificationSideChannel));
            }
            c23385hxI.AEQbTJ.getTitle().setContentDescription("web3_dex_watchlist_group_title_view");
            C52794wYp c52794wYp = c23385hxI.OLrzqt;
            c52794wYp.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getSmallIconBitmap));
            c52794wYp.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onLocationChanged);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
            } else {
                drawableKWHzl = null;
            }
            c52794wYp.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableKWHzl, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            c23385hxI.AEQbTJ.setBackListener(new View.OnClickListener() { // from class: o.kBU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    kBV.copydefault(this.AEQbTJ, view);
                }
            });
            RecyclerView recyclerView = c23385hxI.djBIcL;
            recyclerView.setLayoutManager(new LinearLayoutManager(c23385hxI.getRoot().getContext(), 1, false));
            recyclerView.setAdapter(AYXKKw());
            DbNXlk().attachToRecyclerView(recyclerView);
            C52794wYp c52794wYp2 = c23385hxI.OLrzqt;
            c52794wYp2.setOnClickListener(new Fragment(c52794wYp2, 1000L, this));
            c23385hxI.KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.kBY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    kBV.OLrzqt(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ kBV KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, kBV kbv) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = kbv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.List<CommonGroupUiModel> listEZpvd;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InterfaceC26239jXb value = this.KWHzl.isConnected().copydefault().getValue();
                InterfaceC26239jXb.ActionBar actionBar = value instanceof InterfaceC26239jXb.ActionBar ? (InterfaceC26239jXb.ActionBar) value : null;
                if (!C33129mqd.copydefault((java.lang.Object) ((actionBar == null || (listEZpvd = actionBar.EZpvd()) == null) ? null : java.lang.Integer.valueOf(listEZpvd.size())), (java.lang.Object) 20)) {
                    if (this.KWHzl.values().copydefault() != GroupType.TRACKER) {
                        this.KWHzl.AEQbTJ("add_group");
                        C29229kph.KWHzl(this.KWHzl.values().KWHzl(), "create_group");
                    } else {
                        jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.CREATE_GROUP);
                    }
                    kBV kbv = this.KWHzl;
                    kbv.EZpvd(kbv.new Activity());
                    return;
                }
                C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.getSupportedCipherSuites, 0, 1, (java.lang.Object) null);
            }
        }
    }

    public static final void copydefault(kBV kbv, android.view.View view) {
        jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.BACK);
        kbv.finish();
    }

    public static final class Activity implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            kBV.openGroupNameInputBottomSheet$default(kBV.this, null, null, null, 7, null);
        }
    }

    public static final void OLrzqt(kBV kbv, android.view.View view) {
        kbv.isConnected().OLrzqt();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(InterfaceC26239jXb interfaceC26239jXb) {
        java.util.List<CommonGroupUiModel> listFARcdN;
        C23385hxI c23385hxI = this.valueOf;
        if (c23385hxI != null) {
            C55113xdn c55113xdn = c23385hxI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(interfaceC26239jXb instanceof InterfaceC26239jXb.Activity ? 0 : 8);
            C55173xeu c55173xeu = c23385hxI.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            boolean z = interfaceC26239jXb instanceof InterfaceC26239jXb.TaskDescription;
            c55173xeu.setVisibility((z || (interfaceC26239jXb instanceof InterfaceC26239jXb.Application)) ? 0 : 8);
            if (z || (interfaceC26239jXb instanceof InterfaceC26239jXb.Application) || !(interfaceC26239jXb instanceof InterfaceC26239jXb.ActionBar)) {
                return;
            }
            if (AYXKKw().getItemCount() != 1) {
                InterfaceC26239jXb.ActionBar actionBar = (InterfaceC26239jXb.ActionBar) interfaceC26239jXb;
                if (actionBar.EZpvd().size() == 1) {
                    java.util.List listOLrzqt = C56402yEa.OLrzqt();
                    InterfaceC26239jXb.ActionBar actionBar2 = (InterfaceC26239jXb.ActionBar) interfaceC26239jXb;
                    listOLrzqt.addAll(actionBar2.EZpvd());
                    java.util.List listFARcdN2 = C56402yEa.fARcdN(listOLrzqt);
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFARcdN2, 10));
                    java.util.Iterator it = listFARcdN2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(CommonGroupUiModel.copy$default((CommonGroupUiModel) it.next(), 0, null, 0, 0, 0, false, actionBar2.EZpvd().size() > 1, 63, null));
                    }
                    listFARcdN = arrayList;
                } else {
                    java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
                    listOLrzqt2.addAll(actionBar.EZpvd());
                    listFARcdN = C56402yEa.fARcdN(listOLrzqt2);
                }
            }
            AYXKKw().OLrzqt(listFARcdN);
            rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final void OLrzqt(InterfaceC27779kDa interfaceC27779kDa) {
        if (interfaceC27779kDa instanceof InterfaceC27779kDa.TaskDescription) {
            showToast$default(this, ((InterfaceC27779kDa.TaskDescription) interfaceC27779kDa).copydefault(), false, 2, null);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("group_results", true);
            setResult(-1, intent);
        } else if (interfaceC27779kDa instanceof InterfaceC27779kDa.ActionBar) {
            showToast$default(this, ((InterfaceC27779kDa.ActionBar) interfaceC27779kDa).AEQbTJ(), false, 2, null);
            isConnected().OLrzqt();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("group_results", true);
            setResult(-1, intent2);
        } else {
            if (!(interfaceC27779kDa instanceof InterfaceC27779kDa.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            OLrzqt(((InterfaceC27779kDa.Application) interfaceC27779kDa).EZpvd(), true);
        }
        if (interfaceC27779kDa instanceof InterfaceC27779kDa.Application) {
            return;
        }
        isConnected().KWHzl();
    }

    @Override // o.kCP
    public void OLrzqt(@NotNull TokenGroupActionType tokenGroupActionType, @NotNull CommonGroupUiModel commonGroupUiModel) {
        Intrinsics.checkNotNullParameter(tokenGroupActionType, "");
        Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
        int i = StateListAnimator.KWHzl[tokenGroupActionType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            AEQbTJ(commonGroupUiModel);
        } else {
            java.lang.String strEZpvd = commonGroupUiModel.EZpvd();
            int iKWHzl = commonGroupUiModel.KWHzl();
            KWHzl(strEZpvd, java.lang.Integer.valueOf(iKWHzl), TokenGroupActionType.EDIT);
            AEQbTJ("rename");
        }
    }

    public static /* synthetic */ void openGroupNameInputBottomSheet$default(kBV kbv, java.lang.String str, java.lang.Integer num, TokenGroupActionType tokenGroupActionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            tokenGroupActionType = TokenGroupActionType.NEW;
        }
        kbv.KWHzl(str, num, tokenGroupActionType);
    }

    public final void KWHzl(java.lang.String str, java.lang.Integer num, TokenGroupActionType tokenGroupActionType) {
        wXX wxxOLrzqt;
        GroupEditParams groupEditParamsValues = values();
        GroupType groupTypeCopydefault = groupEditParamsValues != null ? groupEditParamsValues.copydefault() : null;
        if (groupTypeCopydefault != null && StateListAnimator.AEQbTJ[groupTypeCopydefault.ordinal()] == 1) {
            wxxOLrzqt = C25639jAw.Companion.OLrzqt(str, num, tokenGroupActionType);
        } else {
            wxxOLrzqt = kCI.Companion.OLrzqt(str, num, tokenGroupActionType);
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        wxxOLrzqt.show(supportFragmentManager);
    }

    public final void AEQbTJ(final CommonGroupUiModel commonGroupUiModel) {
        C25352ivB.EZpvd(this, C33070mpX.AYXKKw(C23274hvD.Fragment.ITrustedWebActivityServiceDefault), C33070mpX.AYXKKw(C23274hvD.Fragment.ITrustedWebActivityServiceStubProxy), C23274hvD.Fragment.fIwbmz, C33070mpX.AYXKKw(C23274hvD.Fragment.ORxRYg), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN)), new Function0() { // from class: o.kBX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kBV.AEQbTJ(this.OLrzqt, commonGroupUiModel);
            }
        });
        AEQbTJ(RequestParameters.SUBRESOURCE_DELETE);
    }

    public static final Unit AEQbTJ(kBV kbv, CommonGroupUiModel commonGroupUiModel) {
        kbv.isConnected().AEQbTJ(commonGroupUiModel);
        if (kbv.values().copydefault() == GroupType.TRACKER) {
            jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.DELETE_GROUP);
        } else {
            C29229kph.KWHzl(kbv.values().KWHzl(), "delete_group");
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showToast$default(kBV kbv, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        kbv.OLrzqt(str, z);
    }

    public final void OLrzqt(java.lang.String str, boolean z) {
        if (z) {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        } else {
            C55326xho.toastWithSuccessfulIcon$default(str, 0, 1, (java.lang.Object) null);
        }
    }

    private final void fJNWhG() {
        C32866mlf.onEvent$default("DEXMarket_Watchlist_GroupManage_View", (TrackChannel[]) null, new Function1() { // from class: o.kCi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kBV.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "source", "list_group_manage", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("DEXMarket_Watchlist_GroupManage_Click", (TrackChannel[]) null, new Function1() { // from class: o.kCf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kBV.AEQbTJ(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kBV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkLoginStatus$default(kBV kbv, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: o.kCa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kBV.gEmmrt();
                }
            };
        }
        kbv.EZpvd((Function0<Unit>) function0);
    }

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(Function0<Unit> function0) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WatchlistGroupActivity$checkLoginStatus$2(this, function0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(Function0<Unit> function0) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WatchlistGroupActivity$handleLoginFlow$1(this, function0, null), 3, null);
    }

    @Override // o.InterfaceC26241jXd
    public void valueOf() {
        isConnected().OLrzqt();
        if (values().copydefault() == GroupType.TRACKER) {
            jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.SAVE_GROUP_NAME);
        } else {
            C29229kph.KWHzl(values().KWHzl(), "save_group_name");
        }
    }

    @Override // o.kBW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.kBW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.kBW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.kBW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
