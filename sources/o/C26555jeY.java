package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.invest_biz.data.bean.FilterChip;
import com.okinc.business.invest_biz.data.bean.FilterRecord;
import com.okinc.business.invest_biz.data.bean.InvestChip;
import com.okinc.business.invest_biz.data.usecase.V2ProductQuery;
import com.okinc.business.invest_biz.ui.screens.search.InvestSearchV2VM;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C25493ixk;
import o.C27189jqW;
import o.C27282jsJ;
import o.InterfaceC26619jfj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26555jeY extends AbstractC26553jeW implements InterfaceC26465jco, InterfaceC26396jbY {
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final TaskStackBuilder DbNXlk;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final yIP gEmmrt = C27589jxz.EZpvd(this);
    public C27189jqW valueOf;
    public final InterfaceC56387yDm values;
    public static final /* synthetic */ yJA<java.lang.Object>[] djBIcL = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C26555jeY.class, "mBinding", "getMBinding()Lcom/okinc/business/invest_biz/databinding/FragmentInvestSearchV2Binding;", 0))};
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.jeY$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FilterChip.ItemType.values().length];
            try {
                iArr[FilterChip.ItemType.TOKEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FilterChip.ItemType.PLATFORM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26465jco
    public java.lang.String AYXKKw() {
        return "newsearchpagelist";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.ORxRYg;
    }

    public C26555jeY() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.search.InvestSearchV2Fragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.search.InvestSearchV2Fragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestSearchV2VM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.search.InvestSearchV2Fragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.search.InvestSearchV2Fragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.search.InvestSearchV2Fragment$special$$inlined$viewModels$default$5
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
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.jfd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26555jeY.valueOf(this.KWHzl);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.jfa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26555jeY.DbNXlk(this.AEQbTJ);
            }
        });
        this.DbNXlk = new TaskStackBuilder();
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.jfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26555jeY.AYXKKw(this.copydefault);
            }
        });
    }

    public final void copydefault(iHG ihg) {
        this.gEmmrt.KWHzl(this, djBIcL[0], ihg);
    }

    public final iHG gEmmrt() {
        return (iHG) this.gEmmrt.getValue(this, djBIcL[0]);
    }

    public final InvestSearchV2VM djBIcL() {
        return (InvestSearchV2VM) this.AhwBna.getValue();
    }

    private final C26466jcp fetchVPNInfo() {
        return (C26466jcp) this.AkhnZx.getValue();
    }

    public static final C26466jcp valueOf(C26555jeY c26555jeY) {
        return new C26466jcp(c26555jeY);
    }

    public final C26551jeU AkhnZx() {
        return (C26551jeU) this.fetchVPNInfo.getValue();
    }

    public static final C26551jeU DbNXlk(final C26555jeY c26555jeY) {
        return new C26551jeU(new Function1() { // from class: o.jfc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26555jeY.AEQbTJ(this.OLrzqt, (InvestChip) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C26555jeY c26555jeY, InvestChip investChip) {
        Intrinsics.checkNotNullParameter(investChip, "");
        c26555jeY.gEmmrt().KWHzl.AEQbTJ(investChip);
        c26555jeY.djBIcL().AEQbTJ(c26555jeY.OLrzqt());
        ConstraintLayout constraintLayout = c26555jeY.gEmmrt().EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jeY$TaskStackBuilder */
    public static final class TaskStackBuilder implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskStackBuilder() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C26555jeY.this.djBIcL().AEQbTJ(C33129mqd.AhwBna(tab != null ? java.lang.Integer.valueOf(tab.getId()) : null));
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        copydefault(iHG.KWHzl(view));
        KWHzl(gEmmrt());
        EZpvd(gEmmrt());
        OLrzqt(gEmmrt());
        AEQbTJ(gEmmrt());
        ejfBZ();
    }

    @Override // o.InterfaceC26465jco
    public Flow<Unit> DbNXlk() {
        return FlowKt.emptyFlow();
    }

    @Override // o.InterfaceC26465jco
    public Flow<C55276xgr> AhwBna() {
        return djBIcL().copydefault();
    }

    @Override // o.InterfaceC26465jco
    public void EZpvd(C55276xgr c55276xgr) {
        djBIcL().AEQbTJ(c55276xgr);
    }

    @Override // o.InterfaceC26396jbY
    public void AEQbTJ(@NotNull C26526jdw c26526jdw) {
        Intrinsics.checkNotNullParameter(c26526jdw, "");
        djBIcL().EZpvd(OLrzqt());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C27189jqW c27189jqW = this.valueOf;
        if (c27189jqW != null) {
            c27189jqW.copydefault();
        }
    }

    public final void KWHzl(final iHG ihg) {
        ViewCompat.setOnApplyWindowInsetsListener(ihg.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.jfb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return C26555jeY.AEQbTJ(ihg, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat AEQbTJ(iHG ihg, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        ConstraintLayout constraintLayoutEZpvd = ihg.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd, "");
        ViewGroup.LayoutParams layoutParams = constraintLayoutEZpvd.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = insets.top;
            constraintLayoutEZpvd.setLayoutParams(marginLayoutParams);
            return windowInsetsCompat;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: renamed from: o.jeY$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InvestChip investChip, Continuation<? super Unit> continuation) {
            InvestChip value = C26555jeY.this.djBIcL().EZpvd().getValue();
            if (value != null) {
                C26555jeY.this.gEmmrt().KWHzl.AEQbTJ(value);
            }
            return Unit.INSTANCE;
        }
    }

    private final void ejfBZ() {
        StateFlow<InvestChip> stateFlowEZpvd = djBIcL().EZpvd();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C27589jxz.EZpvd(this, stateFlowEZpvd, state, new Activity());
        C27589jxz.EZpvd(this, djBIcL().gEmmrt(), state, new Dialog());
        C27589jxz.EZpvd(this, djBIcL().valueOf(), state, new FragmentManager());
        C27589jxz.EZpvd(this, djBIcL().AEQbTJ(), state, new LoaderManager());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C59541ziw.KWHzl(fragmentActivityRequireActivity, new Fragment());
    }

    /* JADX INFO: renamed from: o.jeY$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26619jfj interfaceC26619jfj, Continuation<? super Unit> continuation) {
            C26555jeY c26555jeY = C26555jeY.this;
            c26555jeY.OLrzqt(c26555jeY.gEmmrt(), interfaceC26619jfj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jeY$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<InvestChip> list, Continuation<? super Unit> continuation) {
            C26555jeY c26555jeY = C26555jeY.this;
            c26555jeY.OLrzqt(c26555jeY.gEmmrt(), list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jeY$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<FilterRecord> list, Continuation<? super Unit> continuation) {
            C26555jeY c26555jeY = C26555jeY.this;
            c26555jeY.KWHzl(c26555jeY.gEmmrt(), list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jeY$Fragment */
    public static final class Fragment implements InterfaceC59496ziD {
        public Fragment() {
        }

        @Override // o.InterfaceC59496ziD
        public void OLrzqt(boolean z) {
            ConstraintLayout constraintLayout = C26555jeY.this.gEmmrt().EZpvd;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility((z && C26555jeY.this.isConnected()) ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: o.jeY$PendingIntent */
    public static final class PendingIntent implements C27282jsJ.TaskDescription {
        public PendingIntent() {
        }

        @Override // o.C27282jsJ.TaskDescription
        public void copydefault(android.text.Editable editable) {
            if (editable == null || StringsKt__StringsKt.fARcdN(editable)) {
                C26555jeY c26555jeY = C26555jeY.this;
                c26555jeY.OLrzqt(c26555jeY.gEmmrt(), (java.util.List<InvestChip>) null);
                C26555jeY.this.djBIcL().AEQbTJ(C26555jeY.this.OLrzqt());
            } else {
                C26555jeY.this.djBIcL().OLrzqt(C26555jeY.this.OLrzqt(), StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) editable.toString()).toString());
            }
            ConstraintLayout constraintLayout = C26555jeY.this.gEmmrt().EZpvd;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility((editable == null || StringsKt__StringsKt.fARcdN(editable)) ? 0 : 8);
        }

        @Override // o.C27282jsJ.TaskDescription
        public void OLrzqt() {
            InvestChip investChip;
            RecyclerView recyclerView = C26555jeY.this.gEmmrt().valueOf;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            if (recyclerView.getVisibility() == 0) {
                java.util.List<InvestChip> value = C26555jeY.this.djBIcL().valueOf().getValue();
                if (value == null || (investChip = (InvestChip) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
                    C26555jeY.this.gEmmrt().KWHzl.AEQbTJ();
                    return;
                }
                C26555jeY c26555jeY = C26555jeY.this;
                c26555jeY.gEmmrt().KWHzl.AEQbTJ(investChip);
                c26555jeY.djBIcL().AEQbTJ(c26555jeY.OLrzqt());
                ConstraintLayout constraintLayout = c26555jeY.gEmmrt().EZpvd;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(8);
                return;
            }
            C26555jeY.this.gEmmrt().KWHzl.AEQbTJ();
        }

        @Override // o.C27282jsJ.TaskDescription
        public void copydefault() {
            android.text.Editable editableValueOf;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) C26555jeY.this.valueOf())) {
                return;
            }
            if (C26555jeY.this.OLrzqt().isEmpty() && ((editableValueOf = C26555jeY.this.valueOf()) == null || editableValueOf.length() == 0)) {
                C26555jeY.this.gEmmrt().AkhnZx.AYXKKw().selectTab(C26555jeY.this.gEmmrt().AkhnZx.KWHzl(0));
            }
            C26555jeY.this.djBIcL().AEQbTJ(C26555jeY.this.OLrzqt());
        }
    }

    public final PendingIntent values() {
        return (PendingIntent) this.values.getValue();
    }

    public static final PendingIntent AYXKKw(C26555jeY c26555jeY) {
        return c26555jeY.new PendingIntent();
    }

    /* JADX INFO: renamed from: o.jeY$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C26555jeY EZpvd;
        public final /* synthetic */ FilterRecord OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C26555jeY c26555jeY, FilterRecord filterRecord) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c26555jeY;
            this.OLrzqt = filterRecord;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.KWHzl(this.OLrzqt.getChips());
            }
        }
    }

    /* JADX INFO: renamed from: o.jeY$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C26555jeY EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26555jeY c26555jeY) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c26555jeY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                FragmentActivity activity = this.EZpvd.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jeY$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ iHG OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, iHG ihg) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = ihg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl.AEQbTJ();
            }
        }
    }

    public final void OLrzqt(iHG ihg) {
        ihg.fetchVPNInfo.setAdapter(fetchVPNInfo());
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        ViewPager2 viewPager2 = ihg.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        c27569jxf.EZpvd(viewPager2);
        ihg.valueOf.setAdapter(AkhnZx());
        ConstraintLayout constraintLayout = ihg.EZpvd;
        constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, ihg));
    }

    public final void OLrzqt(iHG ihg, java.util.List<InvestChip> list) {
        RecyclerView recyclerView = ihg.valueOf;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(C33129mqd.KWHzl((java.util.Collection) list) ? 0 : 8);
        if (list == null) {
            return;
        }
        C55173xeu c55173xeu = ihg.OLrzqt;
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(list.isEmpty() ? 0 : 8);
        c55173xeu.setEmptyTypeImage(7);
        java.lang.String string = getString(C25493ixk.FragmentManager.DcMfJKRKUgwx);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        c55173xeu.setRetry("");
        ihg.copydefault.copydefault();
        C27588jxy.AEQbTJ(AkhnZx(), list);
    }

    public final void KWHzl(iHG ihg, java.util.List<FilterRecord> list) {
        int[] referencedIds = ihg.AEQbTJ.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "");
        for (int i : referencedIds) {
            android.view.View viewFindViewById = ihg.EZpvd.findViewById(i);
            if (viewFindViewById != null) {
                ihg.AEQbTJ.removeView(viewFindViewById);
                ihg.EZpvd.removeView(viewFindViewById);
            }
        }
        for (FilterRecord filterRecord : list) {
            ConstraintLayout constraintLayout = ihg.EZpvd;
            Intrinsics.copydefault(constraintLayout, "");
            android.widget.TextView textViewAEQbTJ = AEQbTJ(constraintLayout);
            textViewAEQbTJ.setText(CollectionsKt___CollectionsKt.joinToString$default(filterRecord.getChips(), " ", null, null, 0, null, new Function1() { // from class: o.jfh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C26555jeY.copydefault((FilterChip) obj);
                }
            }, 30, null));
            textViewAEQbTJ.setOnClickListener(new ActionBar(textViewAEQbTJ, 1000L, this, filterRecord));
            ihg.EZpvd.addView(textViewAEQbTJ);
            ihg.AEQbTJ.addView(textViewAEQbTJ);
        }
    }

    public static final java.lang.CharSequence copydefault(FilterChip filterChip) {
        Intrinsics.checkNotNullParameter(filterChip, "");
        java.lang.String symbol = filterChip.getData().getSymbol();
        return symbol == null ? "" : symbol;
    }

    public final void OLrzqt(iHG ihg, InterfaceC26619jfj interfaceC26619jfj) {
        if (interfaceC26619jfj instanceof InterfaceC26619jfj.TaskDescription) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            InterfaceC26619jfj.TaskDescription taskDescription = (InterfaceC26619jfj.TaskDescription) interfaceC26619jfj;
            java.util.List<iWX> listAEQbTJ = taskDescription.AEQbTJ();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                int iAhwBna = C33129mqd.AhwBna(((iWX) it.next()).EZpvd());
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                arrayList3.add(new V2ProductQuery(iAhwBna, null, null, null, null, null, null, bool, bool, djBIcL().AYXKKw().getValue(), null, null, 3198, null));
            }
            arrayList.addAll(arrayList3);
            java.util.List<iWX> listAEQbTJ2 = taskDescription.AEQbTJ();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ2, 10));
            java.util.Iterator<T> it2 = listAEQbTJ2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((iWX) it2.next()).KWHzl());
            }
            arrayList2.addAll(arrayList4);
            fetchVPNInfo().KWHzl(arrayList, arrayList2);
            copydefault(ihg, taskDescription.AEQbTJ());
        } else if (interfaceC26619jfj instanceof InterfaceC26619jfj.StateListAnimator) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        KWHzl(ihg, interfaceC26619jfj);
    }

    public final void KWHzl(iHG ihg, InterfaceC26619jfj interfaceC26619jfj) {
        C55173xeu c55173xeu = ihg.OLrzqt;
        Intrinsics.copydefault(c55173xeu);
        boolean z = interfaceC26619jfj instanceof InterfaceC26619jfj.StateListAnimator;
        int i = 8;
        c55173xeu.setVisibility((z || ((interfaceC26619jfj instanceof InterfaceC26619jfj.TaskDescription) && ((InterfaceC26619jfj.TaskDescription) interfaceC26619jfj).AEQbTJ().isEmpty())) ? 0 : 8);
        c55173xeu.setEmptyTypeImage(AEQbTJ(interfaceC26619jfj));
        c55173xeu.setTitle(copydefault(interfaceC26619jfj));
        java.lang.String string = z ? getString(C25493ixk.FragmentManager.AEQbTJ) : "";
        Intrinsics.copydefault((java.lang.Object) string);
        c55173xeu.setRetry(string);
        Group group = ihg.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(group, "");
        if ((interfaceC26619jfj instanceof InterfaceC26619jfj.TaskDescription) && (!((InterfaceC26619jfj.TaskDescription) interfaceC26619jfj).AEQbTJ().isEmpty())) {
            i = 0;
        }
        group.setVisibility(i);
        if (interfaceC26619jfj instanceof InterfaceC26619jfj.Application) {
            ihg.copydefault.KWHzl(0L);
        } else {
            ihg.copydefault.copydefault();
        }
    }

    public final void copydefault(iHG ihg, final java.util.List<iWX> list) {
        if (list.isEmpty()) {
            return;
        }
        C55244xgL c55244xgL = ihg.AkhnZx;
        ihg.fetchVPNInfo.setOffscreenPageLimit(list.size());
        c55244xgL.EZpvd(this.DbNXlk);
        c55244xgL.copydefault(this.DbNXlk);
        C27189jqW c27189jqW = this.valueOf;
        if (c27189jqW != null) {
            c27189jqW.copydefault();
        }
        C27189jqW c27189jqW2 = new C27189jqW(c55244xgL.AYXKKw(), ihg.fetchVPNInfo, false, false, new C27189jqW.Activity() { // from class: o.jeZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C27189jqW.Activity
            public final void KWHzl(TabLayout.Tab tab, int i) {
                C26555jeY.OLrzqt(list, tab, i);
            }
        });
        this.valueOf = c27189jqW2;
        c27189jqW2.KWHzl();
        int selectedTabPosition = c55244xgL.AYXKKw().getSelectedTabPosition();
        java.util.Iterator<iWX> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().copydefault() > 0) {
                break;
            } else {
                i++;
            }
        }
        if (selectedTabPosition < 0 || selectedTabPosition >= list.size() || list.get(selectedTabPosition).copydefault() > 0 || i == -1) {
            return;
        }
        c55244xgL.AYXKKw().selectTab(c55244xgL.KWHzl(i));
    }

    public static final void OLrzqt(java.util.List list, TabLayout.Tab tab, int i) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(tab, "");
        if (list.size() <= i) {
            return;
        }
        iWX iwx = (iWX) list.get(i);
        if (iwx.copydefault() != -1) {
            strOLrzqt = iwx.OLrzqt() + " (" + pTB.formatLocalized$default(C33129mqd.gEmmrt(java.lang.Integer.valueOf(iwx.copydefault())), null, 1, null) + ")";
        } else {
            strOLrzqt = iwx.OLrzqt();
        }
        tab.setText(strOLrzqt);
        tab.setId(C33129mqd.AhwBna(iwx.EZpvd()));
    }

    public final void EZpvd(iHG ihg) {
        android.widget.TextView textView = ihg.values;
        textView.setOnClickListener(new Application(textView, 1000L, this));
        ihg.KWHzl.setOnChipListener(values());
    }

    public static final void copydefault(C26555jeY c26555jeY, android.view.View view) {
        c26555jeY.djBIcL().djBIcL();
    }

    public final void AEQbTJ(iHG ihg) {
        ihg.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.jfe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26555jeY.copydefault(this.copydefault, view);
            }
        });
    }

    private final java.lang.String copydefault(InterfaceC26619jfj interfaceC26619jfj) {
        if (interfaceC26619jfj instanceof InterfaceC26619jfj.StateListAnimator) {
            return C43422row.OLrzqt();
        }
        java.lang.String string = getString(C25493ixk.FragmentManager.DcMfJKRKUgwx);
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    private final int AEQbTJ(InterfaceC26619jfj interfaceC26619jfj) {
        return interfaceC26619jfj instanceof InterfaceC26619jfj.StateListAnimator ? 8 : 7;
    }

    /* JADX DEBUG: Possible override for method o.jeW.OLrzqt()V */
    public final java.util.List<InvestChip> OLrzqt() {
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) gEmmrt().KWHzl.EZpvd());
        Intrinsics.copydefault(listFJNWhG, "");
        return C56532yIw.OLrzqt(listFJNWhG);
    }

    public final android.text.Editable valueOf() {
        return gEmmrt().KWHzl.KWHzl().getText();
    }

    public final android.widget.TextView AEQbTJ(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = getLayoutInflater().inflate(C25493ixk.Activity.dUDNAs, viewGroup, false);
        viewInflate.setId(android.view.View.generateViewId());
        Intrinsics.copydefault(viewInflate, "");
        return (android.widget.TextView) viewInflate;
    }

    public final boolean isConnected() {
        java.util.List<InvestChip> value;
        return C33129mqd.KWHzl((java.util.Collection) djBIcL().AEQbTJ().getValue()) && ((value = djBIcL().valueOf().getValue()) == null || value.isEmpty());
    }

    public final void KWHzl(java.util.List<FilterChip> list) {
        for (FilterChip filterChip : list) {
            int i = StateListAnimator.EZpvd[filterChip.getType().ordinal()];
            if (i == 1) {
                gEmmrt().KWHzl.AEQbTJ(new InvestChip(filterChip.getData(), null, 2, null));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gEmmrt().KWHzl.AEQbTJ(new InvestChip(null, filterChip.getData(), 1, null));
            }
        }
        djBIcL().AEQbTJ(OLrzqt());
    }
}
