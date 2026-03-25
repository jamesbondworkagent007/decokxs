package com.okinc.okex.center.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter;
import com.okinc.okex.center.ui.displaymodels.HighlightArticleDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment;
import com.okinc.okex.center.viewmodel.SupportFullRecentActivitiesViewModel;
import com.okinc.p2p.api.OTCService;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC45034siF;
import o.AbstractC47345toL;
import o.C33070mpX;
import o.C43251rlk;
import o.C44962sgn;
import o.C44987shL;
import o.C44993shR;
import o.C45224slk;
import o.C45351soE;
import o.C45363soQ;
import o.C45388sop;
import o.C45397soy;
import o.C47315tni;
import o.C52761wXj;
import o.C55326xho;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC44921sfz;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC57900yrD;
import o.InterfaceC57934yrl;
import o.InterfaceC8224ayh;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SupportRecentActivitiesListFragment extends AbstractC45034siF implements C44993shR.ActionBar, ActivityHighlightCardAdapter.StateListAnimator {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC47345toL AkhnZx;
    public final int DbNXlk;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;

    @yCM
    public C45397soy selfServiceUseCase;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Deposit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Withdrawal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.P2P.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.DbNXlk;
    }

    public SupportRecentActivitiesListFragment() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportFullRecentActivitiesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment$special$$inlined$activityViewModels$default$3
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
        Function0 function02 = new Function0() { // from class: o.sjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportRecentActivitiesListFragment.DbNXlk(this.OLrzqt);
            }
        };
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C45224slk.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function02);
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.sjx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportRecentActivitiesListFragment.AkhnZx(this.EZpvd);
            }
        });
        this.DbNXlk = C47315tni.ActionBar.QbewEr;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.sjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportRecentActivitiesListFragment.isConnected(this.KWHzl);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.sjB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportRecentActivitiesListFragment.fetchVPNInfo(this.EZpvd);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.sjy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportRecentActivitiesListFragment.values(this.OLrzqt);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.sjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportRecentActivitiesListFragment.djBIcL(this.AEQbTJ);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.siF.AEQbTJ()V */
    public final SupportFullRecentActivitiesViewModel AEQbTJ() {
        return (SupportFullRecentActivitiesViewModel) this.AhwBna.getValue();
    }

    public final C45224slk isConnected() {
        return (C45224slk) this.isConnected.getValue();
    }

    public static final class TaskDescription implements ViewModelProvider.Factory {
        public TaskDescription() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C45224slk(SupportRecentActivitiesListFragment.this.gEmmrt(), new C45351soE(InterfaceC44921sfz.Companion.AEQbTJ()));
        }
    }

    public static final ViewModelProvider.Factory DbNXlk(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment) {
        return supportRecentActivitiesListFragment.new TaskDescription();
    }

    public final TransactionType gEmmrt() {
        return (TransactionType) this.values.getValue();
    }

    public static final TransactionType AkhnZx(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment) {
        Bundle arguments = supportRecentActivitiesListFragment.getArguments();
        if (arguments != null) {
            TransactionType transactionType = TransactionType.values()[arguments.getInt("type")];
            if (transactionType != null) {
                return transactionType;
            }
        }
        return TransactionType.Unknown;
    }

    public final C45397soy djBIcL() {
        C45397soy c45397soy = this.selfServiceUseCase;
        if (c45397soy != null) {
            return c45397soy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final ActivityHighlightCardAdapter valueOf() {
        return (ActivityHighlightCardAdapter) this.AYXKKw.getValue();
    }

    public static final ActivityHighlightCardAdapter isConnected(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment) {
        ActivityHighlightCardAdapter activityHighlightCardAdapter = new ActivityHighlightCardAdapter(true);
        activityHighlightCardAdapter.OLrzqt(supportRecentActivitiesListFragment);
        return activityHighlightCardAdapter;
    }

    public final C44993shR AhwBna() {
        return (C44993shR) this.fetchVPNInfo.getValue();
    }

    public static final C44993shR fetchVPNInfo(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment) {
        FragmentActivity fragmentActivityRequireActivity = supportRecentActivitiesListFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C44993shR c44993shR = new C44993shR(fragmentActivityRequireActivity);
        c44993shR.EZpvd(supportRecentActivitiesListFragment);
        return c44993shR;
    }

    private final C44987shL DbNXlk() {
        return (C44987shL) this.gEmmrt.getValue();
    }

    public static final C44987shL values(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment) {
        C44987shL c44987shL = new C44987shL();
        C44987shL.updateEmptyProperties$default(c44987shL, 6, supportRecentActivitiesListFragment.AYXKKw(), null, null, 12, null);
        return c44987shL;
    }

    private final ConcatAdapter fetchVPNInfo() {
        return (ConcatAdapter) this.valueOf.getValue();
    }

    public static final ConcatAdapter djBIcL(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment) {
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{supportRecentActivitiesListFragment.valueOf(), supportRecentActivitiesListFragment.AhwBna(), supportRecentActivitiesListFragment.DbNXlk()});
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final SupportRecentActivitiesListFragment OLrzqt(@NotNull TransactionType transactionType) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            SupportRecentActivitiesListFragment supportRecentActivitiesListFragment = new SupportRecentActivitiesListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", transactionType.ordinal());
            supportRecentActivitiesListFragment.setArguments(bundle);
            return supportRecentActivitiesListFragment;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final AbstractC47345toL abstractC47345toLCopydefault = AbstractC47345toL.copydefault(view);
        this.AkhnZx = abstractC47345toLCopydefault;
        if (abstractC47345toLCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC47345toLCopydefault = null;
        }
        AYXKKw();
        RecyclerView recyclerView = abstractC47345toLCopydefault.KWHzl;
        recyclerView.addItemDecoration(new C45388sop(C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA)));
        recyclerView.setAdapter(fetchVPNInfo());
        abstractC47345toLCopydefault.AEQbTJ.KWHzl(new InterfaceC57900yrD() { // from class: o.sjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                SupportRecentActivitiesListFragment.copydefault(this.OLrzqt, abstractC47345toLCopydefault, interfaceC57934yrl);
            }
        });
        values();
    }

    public static final void copydefault(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment, AbstractC47345toL abstractC47345toL, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        Integer value = supportRecentActivitiesListFragment.isConnected().AEQbTJ().getValue();
        if (value != null) {
            int iIntValue = value.intValue();
            Boolean value2 = supportRecentActivitiesListFragment.isConnected().copydefault().getValue();
            if (value2 != null) {
                int i = iIntValue + 1;
                supportRecentActivitiesListFragment.isConnected().OLrzqt(i, 10, supportRecentActivitiesListFragment.gEmmrt(), value2.booleanValue());
            }
        }
        abstractC47345toL.AEQbTJ.valueOf();
    }

    private final void values() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new SupportRecentActivitiesListFragment$initViewModel$1(FlowKt.combine(isConnected().EZpvd(), AEQbTJ().AEQbTJ(), new SupportRecentActivitiesListFragment$initViewModel$combinedStateFlow$1(null)), this, null));
        C45224slk c45224slkIsConnected = isConnected();
        c45224slkIsConnected.AYXKKw().observe(this, new Application(new Function1() { // from class: o.sjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportRecentActivitiesListFragment.EZpvd(this.copydefault, (java.util.List) obj);
            }
        }));
        isConnected().AYXKKw().observe(this, new Application(new Function1() { // from class: o.sjD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportRecentActivitiesListFragment.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        }));
        AEQbTJ().EZpvd().observe(this, new Application(new Function1() { // from class: o.sjE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportRecentActivitiesListFragment.copydefault(this.copydefault, (java.util.Map) obj);
            }
        }));
        c45224slkIsConnected.KWHzl().observe(this, new Application(new Function1() { // from class: o.sju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportRecentActivitiesListFragment.copydefault(this.OLrzqt, (SelfServiceToolBean) obj);
            }
        }));
    }

    public static final Unit EZpvd(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment, List list) {
        supportRecentActivitiesListFragment.DbNXlk().AEQbTJ(list.isEmpty());
        Intrinsics.copydefault(list);
        supportRecentActivitiesListFragment.copydefault((List<TransactionDisplayModelV2>) list);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment, List list) {
        if (list != null && (!list.isEmpty())) {
            C44993shR c44993shRAhwBna = supportRecentActivitiesListFragment.AhwBna();
            AbstractC47345toL abstractC47345toL = supportRecentActivitiesListFragment.AkhnZx;
            AbstractC47345toL abstractC47345toL2 = null;
            if (abstractC47345toL == null) {
                Intrinsics.gEmmrt("");
                abstractC47345toL = null;
            }
            RecyclerView recyclerView = abstractC47345toL.KWHzl;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            c44993shRAhwBna.copydefault(recyclerView, list);
            AbstractC47345toL abstractC47345toL3 = supportRecentActivitiesListFragment.AkhnZx;
            if (abstractC47345toL3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC47345toL2 = abstractC47345toL3;
            }
            abstractC47345toL2.AEQbTJ.valueOf();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment, Map map) {
        Boolean bool = (Boolean) map.get(supportRecentActivitiesListFragment.gEmmrt());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            AbstractC47345toL abstractC47345toL = supportRecentActivitiesListFragment.AkhnZx;
            if (abstractC47345toL == null) {
                Intrinsics.gEmmrt("");
                abstractC47345toL = null;
            }
            abstractC47345toL.AEQbTJ.AhwBna(zBooleanValue);
            supportRecentActivitiesListFragment.isConnected().KWHzl(zBooleanValue);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment, SelfServiceToolBean selfServiceToolBean) {
        ActivityHighlightCardAdapter activityHighlightCardAdapterValueOf = supportRecentActivitiesListFragment.valueOf();
        if (selfServiceToolBean != null) {
            activityHighlightCardAdapterValueOf.AEQbTJ(new HighlightArticleDisplayModel(selfServiceToolBean.getTitle(), selfServiceToolBean.getDescription(), selfServiceToolBean));
            activityHighlightCardAdapterValueOf.AEQbTJ(true);
        } else {
            activityHighlightCardAdapterValueOf.AEQbTJ(false);
        }
        return Unit.INSTANCE;
    }

    public final String AYXKKw() {
        int i = StateListAnimator.EZpvd[isConnected().OLrzqt().ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C47315tni.PendingIntent.fetchVPNInfo);
        }
        if (i != 2) {
            return i != 3 ? "" : C33070mpX.AYXKKw(C47315tni.PendingIntent.fARcdN);
        }
        return C33070mpX.AYXKKw(C47315tni.PendingIntent.fIwbmz);
    }

    private final void copydefault(List<TransactionDisplayModelV2> list) {
        C44993shR c44993shRAhwBna = AhwBna();
        AbstractC47345toL abstractC47345toL = this.AkhnZx;
        if (abstractC47345toL == null) {
            Intrinsics.gEmmrt("");
            abstractC47345toL = null;
        }
        RecyclerView recyclerView = abstractC47345toL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c44993shRAhwBna.copydefault(recyclerView, (List) list);
    }

    @Override // o.C44993shR.ActionBar
    public void KWHzl(@NotNull final TransactionDisplayModel transactionDisplayModel) {
        Intrinsics.checkNotNullParameter(transactionDisplayModel, "");
        Context context = getContext();
        if (context != null) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Transaction_DetailPage_Click", false, new Function1() { // from class: o.sjA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SupportRecentActivitiesListFragment.AEQbTJ(transactionDisplayModel, (EventParamsList) obj);
                }
            }, 1, null);
            startActivity(C44962sgn.KWHzl.KWHzl(context, (26 & 2) != 0 ? null : transactionDisplayModel, (26 & 4) != 0 ? null : null, (26 & 8) != 0 ? null : null, (26 & 16) != 0 ? null : null, IntegratedSolutionPageType.Transaction));
        }
    }

    public static final Unit AEQbTJ(TransactionDisplayModel transactionDisplayModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "transaction_type", transactionDisplayModel.getTransactionType().getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "transaction_status", transactionDisplayModel.getStatusValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "label", transactionDisplayModel.getTransactionTag().getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, transactionDisplayModel.getId(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.C44993shR.ActionBar
    public void EZpvd(@NotNull SelfServiceToolBean selfServiceToolBean, Object obj) {
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new SupportRecentActivitiesListFragment$onSelfServiceItemClicked$1$1(this, activity, selfServiceToolBean, obj, null), 3, null);
        }
    }

    @Override // com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter.StateListAnimator
    public void copydefault(SelfServiceToolBean selfServiceToolBean) {
        Context context = getContext();
        if (context == null || selfServiceToolBean == null) {
            return;
        }
        AEQbTJ(selfServiceToolBean);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportRecentActivitiesListFragment$onHighlightArticleClick$1$1(this, context, selfServiceToolBean, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ayh.TaskDescription.goToWithdrawHistoryDetails$default(o.ayh, android.content.Context, com.okinc.assets.backend.api.model.WithdrawHis, java.lang.String, java.lang.Boolean, java.lang.String, int, java.lang.Object):void */
    @Override // com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter.StateListAnimator
    public void EZpvd(@NotNull String str, @NotNull TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Context context = getContext();
        if (context != null) {
            int i = StateListAnimator.EZpvd[transactionType.ordinal()];
            if (i == 1) {
                InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.OLrzqt(InterfaceC8224ayh.class);
                if (interfaceC8224ayh != null) {
                    InterfaceC8224ayh.TaskDescription.goToDepositHistoryDetails$default(interfaceC8224ayh, context, str, null, null, null, null, 60, null);
                    return;
                }
                return;
            }
            if (i == 2) {
                InterfaceC8224ayh interfaceC8224ayh2 = (InterfaceC8224ayh) C43251rlk.OLrzqt(InterfaceC8224ayh.class);
                if (interfaceC8224ayh2 != null) {
                    InterfaceC8224ayh.TaskDescription.goToWithdrawHistoryDetails$default(interfaceC8224ayh2, context, null, str, null, null, 26, null);
                    return;
                }
                return;
            }
            if (i == 3) {
                OTCService oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class);
                if (oTCService != null) {
                    OTCService.DefaultImpls.gotoC2COrderDetail$default(oTCService, context, str, null, 4, null);
                    return;
                }
                return;
            }
            C55326xho.OLrzqt("Unknown transaction type: " + transactionType);
        }
    }

    public final void AEQbTJ(final SelfServiceToolBean selfServiceToolBean) {
        C45363soQ.onSessionIdEvent$default("SupportCenter_Top_SelfService_Click", false, new Function1() { // from class: o.sjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportRecentActivitiesListFragment.OLrzqt(selfServiceToolBean, this, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(SelfServiceToolBean selfServiceToolBean, SupportRecentActivitiesListFragment supportRecentActivitiesListFragment, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("index", selfServiceToolBean.getDataTrackingKey(), false);
        eventParamsList.put("page", "transaction_list", true);
        EventParamsList.put$default(eventParamsList, "page_topic_name", selfServiceToolBean.getSlug(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_transaction_type", supportRecentActivitiesListFragment.isConnected().OLrzqt().getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_transaction_status", "", false, 4, null);
        eventParamsList.put("mini_support_page", "false", true);
        return Unit.INSTANCE;
    }
}
