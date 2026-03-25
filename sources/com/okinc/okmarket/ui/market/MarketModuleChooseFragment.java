package com.okinc.okmarket.ui.market;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okmarket.ui.market.MarketModuleChooseFragment;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.uilab.stateful.StatefulView;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC32998moE;
import o.C32866mlf;
import o.C33070mpX;
import o.C33606mzd;
import o.C42931rfi;
import o.C46654tbJ;
import o.C46655tbK;
import o.C46698tcA;
import o.C52761wXj;
import o.C55237xgE;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C57682ymy;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import o.kFS;
import o.pUU;
import o.qZH;
import o.rVN;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class MarketModuleChooseFragment extends AbstractC32998moE {
    private C42931rfi binding;
    private List<Pair<Boolean, TradeGroupData>> datas;
    private final InterfaceC56387yDm moduleChooseViewModel$delegate;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42931rfi getBinding() {
        return this.binding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Pair<Boolean, TradeGroupData>> getDatas() {
        return this.datas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.ExKek;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBinding(C42931rfi c42931rfi) {
        this.binding = c42931rfi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDatas(@NotNull List<Pair<Boolean, TradeGroupData>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.datas = list;
    }

    public MarketModuleChooseFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$special$$inlined$viewModels$default$2
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
        this.moduleChooseViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C46698tcA.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$special$$inlined$viewModels$default$5
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
        this.datas = yDY.AhwBna();
    }

    public final C46698tcA getModuleChooseViewModel() {
        return (C46698tcA) this.moduleChooseViewModel$delegate.getValue();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.ui.market.MarketModuleChooseFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final Object KWHzl(@NotNull FragmentManager fragmentManager, TradeGroupData tradeGroupData, @NotNull final String str, @NotNull Continuation<Object> continuation) {
            Bundle bundle = new Bundle();
            if (tradeGroupData != null) {
                bundle.putParcelable("data", tradeGroupData);
            }
            bundle.putString("from", str);
            bundle.putString("fragment_class_name", MarketModuleChooseFragment.class.getName());
            C32866mlf.onEvent$default("Markets_Category_Tab_Click", (TrackChannel[]) null, new Function1() { // from class: o.tct
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketModuleChooseFragment.Activity.EZpvd(str, (EventParamsList) obj);
                }
            }, 1, (Object) null);
            return C46654tbJ.Companion.copydefault(bundle).AEQbTJ(fragmentManager, continuation);
        }

        public static final Unit EZpvd(String str, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, str, false, 4, null);
            EventParamsList.put$default(eventParamsList, "more_button", "1", false, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42931rfi c42931rfiCopydefault = C42931rfi.copydefault(view);
        this.binding = c42931rfiCopydefault;
        if (c42931rfiCopydefault != null) {
            C33606mzd.AEQbTJ(c42931rfiCopydefault.EZpvd.KWHzl(), new Function1() { // from class: o.tcu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketModuleChooseFragment.initView$lambda$1$lambda$0(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
            c42931rfiCopydefault.EZpvd.KWHzl().setInputType(1);
            c42931rfiCopydefault.EZpvd.KWHzl().setImeOptions(3);
            c42931rfiCopydefault.EZpvd.KWHzl().setSingleLine(true);
            c42931rfiCopydefault.EZpvd.KWHzl().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(50)});
            c42931rfiCopydefault.EZpvd.KWHzl().setEllipsize(TextUtils.TruncateAt.END);
            c42931rfiCopydefault.EZpvd.KWHzl().setImeActionLabel(C33070mpX.AYXKKw(qZH.PendingIntent.zuBGHE), 3);
            c42931rfiCopydefault.EZpvd.KWHzl().setHint(C33070mpX.AYXKKw(qZH.PendingIntent.fJNWhG));
            c42931rfiCopydefault.KWHzl.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            c42931rfiCopydefault.KWHzl.setHasFixedSize(true);
            c42931rfiCopydefault.KWHzl.setAdapter(new TaskDescription());
        }
        try {
            Result.Application application = Result.Companion;
            Bundle arguments = getArguments();
            TradeGroupData tradeGroupData = arguments != null ? (TradeGroupData) arguments.getParcelable("data") : null;
            if (!(tradeGroupData instanceof TradeGroupData)) {
                tradeGroupData = null;
            }
            getModuleChooseViewModel().copydefault(tradeGroupData);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new AnonymousClass3(null));
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$lambda$0(MarketModuleChooseFragment marketModuleChooseFragment, CharSequence charSequence) {
        C46698tcA moduleChooseViewModel = marketModuleChooseFragment.getModuleChooseViewModel();
        if (charSequence == null) {
            charSequence = "";
        }
        moduleChooseViewModel.AEQbTJ(charSequence);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$initView$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarketModuleChooseFragment.this.new AnonymousClass3(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$initView$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends Pair<? extends Boolean, ? extends TradeGroupData>>>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MarketModuleChooseFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MarketModuleChooseFragment marketModuleChooseFragment, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = marketModuleChooseFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHO
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends Pair<? extends Boolean, ? extends TradeGroupData>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super List<Pair<Boolean, TradeGroupData>>>) flowCollector, th, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super List<Pair<Boolean, TradeGroupData>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = th;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    pUU.AEQbTJ(this.this$0.getTAG(), "stateFlow error", (Throwable) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowConflate = FlowKt.conflate(FlowKt.m7441catch(MarketModuleChooseFragment.this.getModuleChooseViewModel().KWHzl(), new AnonymousClass1(MarketModuleChooseFragment.this, null)));
                final MarketModuleChooseFragment marketModuleChooseFragment = MarketModuleChooseFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment.initView.3.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<Pair<Boolean, TradeGroupData>> list, Continuation<? super Unit> continuation) {
                        RecyclerView recyclerView;
                        marketModuleChooseFragment.updateUI(list == null || list.isEmpty());
                        marketModuleChooseFragment.setDatas(list);
                        C42931rfi binding = marketModuleChooseFragment.getBinding();
                        RecyclerView.Adapter adapter = (binding == null || (recyclerView = binding.KWHzl) == null) ? null : recyclerView.getAdapter();
                        TaskDescription taskDescription = adapter instanceof TaskDescription ? (TaskDescription) adapter : null;
                        if (taskDescription != null) {
                            taskDescription.submitList(list);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowConflate.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUI(boolean z) {
        C55237xgE c55237xgE;
        C42931rfi c42931rfi = this.binding;
        if (c42931rfi == null || (c55237xgE = c42931rfi.AEQbTJ) == null) {
            return;
        }
        c55237xgE.setStatus(z ? StatefulView.Status.Empty : StatefulView.Status.Content);
    }

    public final void onDataSelected(@NotNull TradeGroupData tradeGroupData) {
        C46655tbK c46655tbK;
        Intrinsics.checkNotNullParameter(tradeGroupData, "");
        final Fragment parentFragment = getParentFragment();
        byte b = 0;
        if (parentFragment != null) {
            final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$onDataSelected$$inlined$viewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return parentFragment;
                }
            };
            final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$onDataSelected$$inlined$viewModels$default$2
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
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C46655tbK.class);
            Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$onDataSelected$$inlined$viewModels$default$3
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
            };
            final byte b2 = b == true ? 1 : 0;
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(parentFragment, interfaceC56551yJoAEQbTJ, function02, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$onDataSelected$$inlined$viewModels$default$4
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
                    Function0 function03 = b2;
                    if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.ui.market.MarketModuleChooseFragment$onDataSelected$$inlined$viewModels$default$5
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
                        defaultViewModelProviderFactory = parentFragment.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            });
            if (interfaceC56387yDmCreateViewModelLazy != null && (c46655tbK = (C46655tbK) interfaceC56387yDmCreateViewModelLazy.getValue()) != null) {
                c46655tbK.KWHzl(tradeGroupData);
            }
        }
        if (getParentFragment() instanceof C46654tbJ) {
            Fragment parentFragment2 = getParentFragment();
            C46654tbJ c46654tbJ = parentFragment2 instanceof C46654tbJ ? (C46654tbJ) parentFragment2 : null;
            if (c46654tbJ != null) {
                c46654tbJ.dismissAllowingStateLoss();
            }
        }
    }

    public final class ActionBar extends DiffUtil.ItemCallback<Pair<? extends Boolean, ? extends TradeGroupData>> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull Pair<Boolean, TradeGroupData> pair, @NotNull Pair<Boolean, TradeGroupData> pair2) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            return Intrinsics.EZpvd((Object) pair.getSecond().getId(), (Object) pair2.getSecond().getId());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull Pair<Boolean, TradeGroupData> pair, @NotNull Pair<Boolean, TradeGroupData> pair2) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            return Intrinsics.EZpvd(pair, pair2);
        }
    }

    public final class TaskDescription extends ListAdapter<Pair<? extends Boolean, ? extends TradeGroupData>, kFS> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
            super(MarketModuleChooseFragment.this.new ActionBar());
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public kFS onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(qZH.ActionBar.jNexW, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new kFS(viewInflate);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<kotlin.Pair<java.lang.Boolean, com.okinc.tradeapi.bean.TradeGroupData>>, java.util.List<kotlin.Pair<java.lang.Boolean, com.okinc.tradeapi.bean.TradeGroupData>>] */
        @Override // androidx.recyclerview.widget.ListAdapter
        public void onCurrentListChanged(@NotNull List<Pair<? extends Boolean, ? extends TradeGroupData>> list, @NotNull List<Pair<? extends Boolean, ? extends TradeGroupData>> list2) {
            RecyclerView recyclerView;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            super.onCurrentListChanged(list, list2);
            notifyDataSetChanged();
            C42931rfi binding = MarketModuleChooseFragment.this.getBinding();
            if (binding == null || (recyclerView = binding.KWHzl) == null) {
                return;
            }
            recyclerView.requestLayout();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull kFS kfs, int i) {
            Intrinsics.checkNotNullParameter(kfs, "");
            final Pair<? extends Boolean, ? extends TradeGroupData> item = getItem(i);
            TextView textViewAEQbTJ = kfs.AEQbTJ();
            if (textViewAEQbTJ != null) {
                textViewAEQbTJ.setText(item.getSecond().getName());
            }
            View view = kfs.itemView;
            final MarketModuleChooseFragment marketModuleChooseFragment = MarketModuleChooseFragment.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.tcy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    MarketModuleChooseFragment.TaskDescription.copydefault(marketModuleChooseFragment, item, view2);
                }
            });
            if (item.getFirst().booleanValue()) {
                C57682ymy c57682ymyEZpvd = kfs.EZpvd();
                if (c57682ymyEZpvd != null) {
                    c57682ymyEZpvd.setVisibility(0);
                }
                C57682ymy c57682ymyEZpvd2 = kfs.EZpvd();
                if (c57682ymyEZpvd2 != null) {
                    c57682ymyEZpvd2.setImageResource(C52761wXj.TaskDescription.fdt);
                    return;
                }
                return;
            }
            C57682ymy c57682ymyEZpvd3 = kfs.EZpvd();
            if (c57682ymyEZpvd3 != null) {
                c57682ymyEZpvd3.setVisibility(4);
            }
        }

        public static final void copydefault(final MarketModuleChooseFragment marketModuleChooseFragment, final Pair pair, View view) {
            marketModuleChooseFragment.onDataSelected((TradeGroupData) pair.getSecond());
            C32866mlf.onEvent$default("Markets_Category_Popup_Click", (TrackChannel[]) null, new Function1() { // from class: o.tcv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketModuleChooseFragment.TaskDescription.KWHzl(marketModuleChooseFragment, pair, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }

        public static final Unit KWHzl(MarketModuleChooseFragment marketModuleChooseFragment, Pair pair, EventParamsList eventParamsList) {
            String string;
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
            Bundle arguments = marketModuleChooseFragment.getArguments();
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, (arguments == null || (string = arguments.getString("from", "market_page")) == null) ? "market_page" : string, false, 4, null);
            EventParamsList.put$default(eventParamsList, "category_type", ((TradeGroupData) pair.getSecond()).getType(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "search_keyword", marketModuleChooseFragment.getModuleChooseViewModel().copydefault().getValue(), false, 4, null);
            return Unit.INSTANCE;
        }
    }
}
