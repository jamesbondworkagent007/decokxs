package com.okinc.business.invest_biz.ui.screens.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.InvestChip;
import com.okinc.business.invest_biz.data.bean.ProductJumpParam;
import com.okinc.business.invest_biz.data.usecase.V2ProductQuery;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC32996moC;
import o.ActivityC24156iWz;
import o.C23743iHr;
import o.C24148iWr;
import o.C25493ixk;
import o.C26454jcd;
import o.C26467jcq;
import o.C26468jcr;
import o.C26526jdw;
import o.C27215jqw;
import o.C27385juG;
import o.C27508jwX;
import o.C27588jxy;
import o.C27589jxz;
import o.C33054mpH;
import o.C33129mqd;
import o.C33546myW;
import o.C43422row;
import o.C52761wXj;
import o.C52794wYp;
import o.C54982xbO;
import o.C54990xbW;
import o.C55113xdn;
import o.C55173xeu;
import o.C55276xgr;
import o.C55296xhK;
import o.C55328xhq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56524yIo;
import o.InterfaceC24155iWy;
import o.InterfaceC26396jbY;
import o.InterfaceC26463jcm;
import o.InterfaceC26465jco;
import o.InterfaceC26469jcs;
import o.InterfaceC56387yDm;
import o.InterfaceC57900yrD;
import o.InterfaceC57927yre;
import o.InterfaceC57934yrl;
import o.iNB;
import o.iNI;
import o.iWA;
import o.iWQ;
import o.rVN;
import o.yCM;
import o.yDY;
import o.yIP;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public class CommonProductListFragment extends AbstractC32996moC implements InterfaceC24155iWy {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public List<C24148iWr> gEmmrt;
    public iWA valueOf;

    @yCM
    public iNB viewModelFactory;
    public static final /* synthetic */ yJA<Object>[] EZpvd = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(CommonProductListFragment.class, "mBinding", "getMBinding()Lcom/okinc/business/invest_biz/databinding/FragmentCommonProductListBinding;", 0))};
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final String KWHzl = C56524yIo.AEQbTJ(CommonProductListFragment.class).valueOf();
    public final yIP copydefault = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.jcg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return CommonProductListFragment.DbNXlk(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.jcj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(CommonProductListFragment.AkhnZx(this.OLrzqt));
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.zLjUOn;
    }

    public CommonProductListFragment() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.home.CommonProductListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.home.CommonProductListFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C26467jcq.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.home.CommonProductListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.home.CommonProductListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.home.CommonProductListFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = yDY.AhwBna();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jcn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CommonProductListFragment.valueOf(this.copydefault);
            }
        });
    }

    public final iNB AhwBna() {
        iNB inb = this.viewModelFactory;
        if (inb != null) {
            return inb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C23743iHr AEQbTJ() {
        return (C23743iHr) this.copydefault.getValue(this, EZpvd[0]);
    }

    public final void EZpvd(C23743iHr c23743iHr) {
        this.copydefault.KWHzl(this, EZpvd[0], c23743iHr);
    }

    public static final V2ProductQuery DbNXlk(CommonProductListFragment commonProductListFragment) {
        Bundle arguments = commonProductListFragment.getArguments();
        V2ProductQuery v2ProductQuery = arguments != null ? (V2ProductQuery) arguments.getParcelable("product_query") : null;
        if (v2ProductQuery instanceof V2ProductQuery) {
            return v2ProductQuery;
        }
        return null;
    }

    public final V2ProductQuery EZpvd() {
        return (V2ProductQuery) this.AYXKKw.getValue();
    }

    public static final boolean AkhnZx(CommonProductListFragment commonProductListFragment) {
        Boolean supportPaging;
        V2ProductQuery v2ProductQueryEZpvd = commonProductListFragment.EZpvd();
        if (v2ProductQueryEZpvd == null || (supportPaging = v2ProductQueryEZpvd.getSupportPaging()) == null) {
            return false;
        }
        return supportPaging.booleanValue();
    }

    public final boolean copydefault() {
        return ((Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public final C26467jcq OLrzqt() {
        return (C26467jcq) this.AhwBna.getValue();
    }

    private final C26454jcd AYXKKw() {
        return (C26454jcd) this.AEQbTJ.getValue();
    }

    public static final android.app.Activity AhwBna(CommonProductListFragment commonProductListFragment) {
        FragmentActivity fragmentActivityRequireActivity = commonProductListFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public static final C26454jcd valueOf(final CommonProductListFragment commonProductListFragment) {
        return new C26454jcd(new Function0() { // from class: o.jci
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CommonProductListFragment.AhwBna(this.AEQbTJ);
            }
        }, new Function1() { // from class: o.jcf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CommonProductListFragment.EZpvd(this.AEQbTJ, (C26526jdw) obj);
            }
        }, null, 4, null);
    }

    public static final Unit EZpvd(CommonProductListFragment commonProductListFragment, C26526jdw c26526jdw) {
        Intrinsics.checkNotNullParameter(c26526jdw, "");
        ActivityResultCaller parentFragment = commonProductListFragment.getParentFragment();
        InterfaceC26396jbY interfaceC26396jbY = parentFragment instanceof InterfaceC26396jbY ? (InterfaceC26396jbY) parentFragment : null;
        if (interfaceC26396jbY != null) {
            interfaceC26396jbY.AEQbTJ(c26526jdw);
        }
        int iGEmmrt = c26526jdw.gEmmrt();
        if (iGEmmrt == 1) {
            commonProductListFragment.OLrzqt(c26526jdw);
        } else if (iGEmmrt == 2) {
            commonProductListFragment.copydefault(c26526jdw);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AhwBna();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        iNI.KWHzl(context).EZpvd(this);
        super.onAttach(context);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd(C23743iHr.KWHzl(view));
        C23743iHr c23743iHrAEQbTJ = AEQbTJ();
        OLrzqt(c23743iHrAEQbTJ);
        KWHzl(c23743iHrAEQbTJ);
        AEQbTJ(c23743iHrAEQbTJ);
        gEmmrt();
        OLrzqt().OLrzqt(EZpvd());
        AEQbTJ(this.gEmmrt);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (AYXKKw().getItemCount() > 0) {
            AEQbTJ().getRoot().requestLayout();
        }
    }

    @Override // o.InterfaceC24155iWy
    public void OLrzqt(@NotNull C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        if (OLrzqt().EZpvd(c55276xgr)) {
            OLrzqt().AEQbTJ(c55276xgr);
        }
    }

    @Override // o.InterfaceC24155iWy
    public void KWHzl() {
        View childAt = AEQbTJ().EZpvd.getChildAt(0);
        C54990xbW c54990xbW = childAt instanceof C54990xbW ? (C54990xbW) childAt : null;
        if (c54990xbW != null) {
            c54990xbW.KWHzl(c54990xbW.OLrzqt().getSelectedTabPosition());
        }
    }

    public final void valueOf(@NotNull final C23743iHr c23743iHr) {
        Intrinsics.checkNotNullParameter(c23743iHr, "");
        if (copydefault()) {
            ViewCompat.setOnApplyWindowInsetsListener(c23743iHr.getRoot(), new OnApplyWindowInsetsListener() { // from class: o.jch
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                    return CommonProductListFragment.EZpvd(c23743iHr, view, windowInsetsCompat);
                }
            });
        }
    }

    public static final WindowInsetsCompat EZpvd(C23743iHr c23743iHr, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        RecyclerView recyclerView = c23743iHr.AhwBna;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = c23743iHr.EZpvd.getHeight();
            recyclerView.setLayoutParams(marginLayoutParams);
            return windowInsetsCompat;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC26469jcs interfaceC26469jcs, Continuation<? super Unit> continuation) {
            CommonProductListFragment commonProductListFragment = CommonProductListFragment.this;
            commonProductListFragment.AEQbTJ(commonProductListFragment.AEQbTJ(), interfaceC26469jcs);
            return Unit.INSTANCE;
        }
    }

    private final void gEmmrt() {
        StateFlow<InterfaceC26469jcs> stateFlowDjBIcL = OLrzqt().djBIcL();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C27589jxz.EZpvd(this, stateFlowDjBIcL, state, new StateListAnimator());
        C27589jxz.EZpvd(this, OLrzqt().KWHzl(), state, new Application());
        C27589jxz.EZpvd(this, FlowKt.debounce(OLrzqt().EZpvd(), 200L), state, new Activity());
        ActivityResultCaller parentFragment = getParentFragment();
        Intrinsics.copydefault(parentFragment, "");
        C27589jxz.EZpvd(this, ((InterfaceC26465jco) parentFragment).DbNXlk(), state, new Fragment());
        C27589jxz.EZpvd(this, OLrzqt().OLrzqt(), state, new PendingIntent());
        ActivityResultCaller parentFragment2 = getParentFragment();
        Intrinsics.copydefault(parentFragment2, "");
        C27589jxz.EZpvd(this, ((InterfaceC26465jco) parentFragment2).AhwBna(), state, new FragmentManager());
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC26463jcm interfaceC26463jcm, Continuation<? super Unit> continuation) {
            CommonProductListFragment commonProductListFragment = CommonProductListFragment.this;
            commonProductListFragment.KWHzl(commonProductListFragment.AEQbTJ(), interfaceC26463jcm);
            return Unit.INSTANCE;
        }
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            CommonProductListFragment.this.OLrzqt().gEmmrt();
            return Unit.INSTANCE;
        }
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            CommonProductListFragment.this.OLrzqt().valueOf();
            return Unit.INSTANCE;
        }
    }

    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(C55276xgr c55276xgr, Continuation<? super Unit> continuation) {
            ActivityResultCaller parentFragment = CommonProductListFragment.this.getParentFragment();
            Intrinsics.copydefault(parentFragment, "");
            ((InterfaceC26465jco) parentFragment).EZpvd(c55276xgr);
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(C55276xgr c55276xgr, Continuation<? super Unit> continuation) {
            CommonProductListFragment.this.AEQbTJ(c55276xgr);
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(V2ProductQuery v2ProductQuery, @NotNull List<C24148iWr> list) {
        Intrinsics.checkNotNullParameter(list, "");
        OLrzqt().OLrzqt(v2ProductQuery);
        EZpvd(list);
        List<InvestChip> keyword = v2ProductQuery != null ? v2ProductQuery.getKeyword() : null;
        if (keyword == null || keyword.isEmpty()) {
            valueOf();
        } else {
            OLrzqt().valueOf();
        }
    }

    public final void OLrzqt(C23743iHr c23743iHr) {
        c23743iHr.AhwBna.setAdapter(AYXKKw());
        copydefault(c23743iHr);
        C33546myW c33546myW = c23743iHr.OLrzqt;
        c33546myW.setNoMoreDataEffective(copydefault());
        c33546myW.AhwBna(copydefault());
        InterfaceC57927yre interfaceC57927yreIsConnected = c33546myW.isConnected();
        C27215jqw c27215jqw = interfaceC57927yreIsConnected instanceof C27215jqw ? (C27215jqw) interfaceC57927yreIsConnected : null;
        if (c27215jqw != null) {
            String string = getString(C25493ixk.FragmentManager.fbC);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c27215jqw.setNoMoreText(string);
        }
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.jca
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                CommonProductListFragment.copydefault(this.OLrzqt, interfaceC57934yrl);
            }
        });
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ CommonProductListFragment EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, CommonProductListFragment commonProductListFragment) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = commonProductListFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.AEQbTJ;
                C26467jcq c26467jcqOLrzqt = this.EZpvd.OLrzqt();
                V2ProductQuery v2ProductQueryEZpvd = this.EZpvd.EZpvd();
                c26467jcqOLrzqt.EZpvd(v2ProductQueryEZpvd != null ? Integer.valueOf(v2ProductQueryEZpvd.getTabId()) : null);
                CommonProductListFragment commonProductListFragment = this.EZpvd;
                Intent intent = new Intent(c52794wYp.getContext(), (Class<?>) ActivityC24156iWz.class);
                V2ProductQuery v2ProductQueryEZpvd2 = this.EZpvd.EZpvd();
                intent.putExtra("aggregate_tab_id", v2ProductQueryEZpvd2 != null ? Integer.valueOf(v2ProductQueryEZpvd2.getTabId()) : null);
                V2ProductQuery v2ProductQueryEZpvd3 = this.EZpvd.EZpvd();
                intent.putExtra("aggregate_item_key", v2ProductQueryEZpvd3 != null ? v2ProductQueryEZpvd3.getItemKey() : null);
                commonProductListFragment.startActivity(intent);
            }
        }
    }

    public static final void copydefault(CommonProductListFragment commonProductListFragment, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        commonProductListFragment.djBIcL();
    }

    public static final void EZpvd(CommonProductListFragment commonProductListFragment, View view) {
        commonProductListFragment.OLrzqt().valueOf();
    }

    public final void KWHzl(C23743iHr c23743iHr) {
        c23743iHr.AEQbTJ.setRetryClickListener(new View.OnClickListener() { // from class: o.jcc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                CommonProductListFragment.EZpvd(this.AEQbTJ, view);
            }
        });
    }

    public final void AEQbTJ(C23743iHr c23743iHr, InterfaceC26469jcs interfaceC26469jcs) {
        EZpvd(c23743iHr, interfaceC26469jcs, OLrzqt().copydefault().OLrzqt());
        if (interfaceC26469jcs instanceof InterfaceC26469jcs.ActionBar) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (String) null, 2, (Object) null);
            copydefault(c23743iHr, ((InterfaceC26469jcs.ActionBar) interfaceC26469jcs).OLrzqt());
        }
        if (interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (String) null, 2, (Object) null);
        }
    }

    public final void KWHzl(C23743iHr c23743iHr, InterfaceC26463jcm interfaceC26463jcm) {
        if (interfaceC26463jcm instanceof InterfaceC26463jcm.TaskDescription) {
            c23743iHr.OLrzqt.valueOf();
            c23743iHr.OLrzqt.KWHzl(OLrzqt().copydefault().KWHzl());
        } else {
            if (!(interfaceC26463jcm instanceof InterfaceC26463jcm.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            c23743iHr.OLrzqt.copydefault(false);
            C55328xhq.show$default(C55328xhq.OLrzqt, getString(C25493ixk.FragmentManager.DcMfJKfNLfdT), ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
        }
    }

    public final void EZpvd(C23743iHr c23743iHr, InterfaceC26469jcs interfaceC26469jcs, boolean z) {
        C33546myW c33546myW = c23743iHr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        boolean z2 = interfaceC26469jcs instanceof InterfaceC26469jcs.ActionBar;
        int i = 8;
        c33546myW.setVisibility((!z2 || z) ? 8 : 0);
        C55173xeu c55173xeu = c23743iHr.AEQbTJ;
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(((z2 || (interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription)) && z) ? 0 : 8);
        c55173xeu.setEmptyTypeImage(AEQbTJ(interfaceC26469jcs));
        c55173xeu.setTitle(OLrzqt(interfaceC26469jcs));
        String string = interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription ? getString(C25493ixk.FragmentManager.AEQbTJ) : "";
        Intrinsics.copydefault((Object) string);
        c55173xeu.setRetry(string);
        C55113xdn c55113xdn = c23743iHr.KWHzl;
        if (interfaceC26469jcs instanceof InterfaceC26469jcs.StateListAnimator) {
            c55113xdn.KWHzl(100L);
        } else {
            c55113xdn.copydefault();
        }
        C52794wYp c52794wYp = c23743iHr.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        if (!copydefault() && z2 && !z) {
            i = 0;
        }
        c52794wYp.setVisibility(i);
    }

    private final String OLrzqt(InterfaceC26469jcs interfaceC26469jcs) {
        if (interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription) {
            return C43422row.OLrzqt();
        }
        String string = getString(C25493ixk.FragmentManager.DcMfJKRKUgwx);
        Intrinsics.copydefault((Object) string);
        return string;
    }

    private final int AEQbTJ(InterfaceC26469jcs interfaceC26469jcs) {
        return interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription ? 8 : 7;
    }

    public final void copydefault(C23743iHr c23743iHr, C26468jcr c26468jcr) {
        if (c26468jcr.copydefault().isEmpty()) {
            return;
        }
        C27588jxy.AEQbTJ(AYXKKw(), !copydefault() ? CollectionsKt___CollectionsKt.AhwBna((Iterable) c26468jcr.copydefault(), 10) : c26468jcr.copydefault());
        C52794wYp c52794wYp = c23743iHr.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility((copydefault() || (!c26468jcr.AEQbTJ() && c26468jcr.copydefault().size() <= 10)) ? 8 : 0);
        c23743iHr.getRoot().requestLayout();
    }

    public final void AEQbTJ(C23743iHr c23743iHr) {
        C52794wYp c52794wYp = c23743iHr.copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    public static final class Dialog extends RecyclerView.OnScrollListener {
        public final /* synthetic */ LinearLayoutManager OLrzqt;

        public Dialog(LinearLayoutManager linearLayoutManager) {
            this.OLrzqt = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            if (CommonProductListFragment.this.EZpvd(this.OLrzqt)) {
                CommonProductListFragment.this.djBIcL();
            }
        }
    }

    public final void copydefault(C23743iHr c23743iHr) {
        RecyclerView.LayoutManager layoutManager = c23743iHr.AhwBna.getLayoutManager();
        Intrinsics.copydefault(layoutManager, "");
        c23743iHr.AhwBna.addOnScrollListener(new Dialog((LinearLayoutManager) layoutManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean EZpvd(LinearLayoutManager linearLayoutManager) {
        RecyclerView.Adapter adapter = AEQbTJ().AhwBna.getAdapter();
        return copydefault() && linearLayoutManager.findLastVisibleItemPosition() > (adapter != null ? adapter.getItemCount() : 0) + (-10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CommonProductListFragment$triggerLoadMoreEvent$1(this, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xbW.setData$default(o.xbW, java.util.List, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, java.lang.Object):void */
    public void AEQbTJ(@NotNull List<C24148iWr> list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        C27385juG c27385juG = AEQbTJ().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c27385juG, "");
        c27385juG.setVisibility(C33129mqd.KWHzl((Collection) list) ? 0 : 8);
        OLrzqt().OLrzqt(list);
        if (list.isEmpty()) {
            return;
        }
        AEQbTJ().EZpvd.removeAllViews();
        View viewInflate = getLayoutInflater().inflate(C25493ixk.Activity.hCLrkq, AEQbTJ().EZpvd);
        Intrinsics.copydefault(viewInflate, "");
        View childAt = ((C27385juG) viewInflate).getChildAt(0);
        C54990xbW c54990xbW = childAt instanceof C54990xbW ? (C54990xbW) childAt : null;
        if (c54990xbW != null) {
            View view = c54990xbW.KWHzl().copydefault;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (final C24148iWr c24148iWr : list) {
                Iterator<T> it = c24148iWr.KWHzl().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((C55276xgr) next).AEQbTJ()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C55276xgr c55276xgr = (C55276xgr) next;
                if (c55276xgr == null) {
                    c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.AuCTelauCTel(c24148iWr.KWHzl());
                }
                arrayList.add(new C54982xbO(c55276xgr.AhwBna(), c55276xgr.KWHzl(), null, false, false, new Function0() { // from class: o.jce
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(CommonProductListFragment.copydefault(this.KWHzl, c24148iWr));
                    }
                }, null, null, null, null, null, null, null, null, null, null, null, null, null, 524252, null));
            }
            C54990xbW.setData$default(c54990xbW, arrayList, null, null, null, 14, null);
        }
        valueOf(AEQbTJ());
    }

    public static final boolean copydefault(CommonProductListFragment commonProductListFragment, C24148iWr c24148iWr) {
        return commonProductListFragment.EZpvd(c24148iWr);
    }

    public final void EZpvd(List<C24148iWr> list) {
        Object next;
        Object next2;
        Object next3;
        C27385juG c27385juG = AEQbTJ().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c27385juG, "");
        c27385juG.setVisibility(C33129mqd.KWHzl((Collection) list) ? 0 : 8);
        if (list.isEmpty()) {
            return;
        }
        List<C24148iWr> list2 = this.gEmmrt;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            C24148iWr c24148iWr = (C24148iWr) it.next();
            Iterator<T> it2 = c24148iWr.KWHzl().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                if (((C55276xgr) next4).AEQbTJ()) {
                    obj = next4;
                    break;
                }
            }
            C55276xgr c55276xgr = (C55276xgr) obj;
            if (c55276xgr == null) {
                c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.AuCTelauCTel(c24148iWr.KWHzl());
            }
            arrayList.add(c55276xgr);
        }
        this.gEmmrt = list;
        AEQbTJ().EZpvd.removeAllViews();
        View viewInflate = getLayoutInflater().inflate(C25493ixk.Activity.hCLrkq, AEQbTJ().EZpvd);
        Intrinsics.copydefault(viewInflate, "");
        View childAt = ((C27385juG) viewInflate).getChildAt(0);
        C54990xbW c54990xbW = childAt instanceof C54990xbW ? (C54990xbW) childAt : null;
        if (c54990xbW != null) {
            View view = c54990xbW.KWHzl().copydefault;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                final C24148iWr c24148iWr2 = (C24148iWr) obj2;
                Iterator<T> it3 = c24148iWr2.KWHzl().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    C55276xgr c55276xgr2 = (C55276xgr) next;
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (Intrinsics.EZpvd(((C55276xgr) it4.next()).OLrzqt(), c55276xgr2.OLrzqt())) {
                                break;
                            }
                        }
                    }
                }
                C55276xgr c55276xgr3 = (C55276xgr) next;
                if (c55276xgr3 == null) {
                    c55276xgr3 = (C55276xgr) CollectionsKt___CollectionsKt.AuCTelauCTel(c24148iWr2.KWHzl());
                }
                List<C55276xgr> listKWHzl = this.gEmmrt.get(i).KWHzl();
                Iterator<T> it5 = listKWHzl.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next2 = it5.next();
                        if (((C55276xgr) next2).AEQbTJ()) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C55276xgr c55276xgr4 = (C55276xgr) next2;
                if (c55276xgr4 != null) {
                    c55276xgr4.copydefault(false);
                }
                Iterator<T> it6 = listKWHzl.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it6.next();
                    Object objOLrzqt = ((C55276xgr) next3).OLrzqt();
                    iWQ iwq = objOLrzqt instanceof iWQ ? (iWQ) objOLrzqt : null;
                    String strOLrzqt = iwq != null ? iwq.OLrzqt() : null;
                    Object objOLrzqt2 = c55276xgr3.OLrzqt();
                    iWQ iwq2 = objOLrzqt2 instanceof iWQ ? (iWQ) objOLrzqt2 : null;
                    if (Intrinsics.EZpvd((Object) strOLrzqt, (Object) (iwq2 != null ? iwq2.OLrzqt() : null))) {
                        break;
                    }
                }
                C55276xgr c55276xgr5 = (C55276xgr) next3;
                if (c55276xgr5 != null) {
                    c55276xgr5.copydefault(true);
                }
                arrayList2.add(new C54982xbO(c55276xgr3.AhwBna(), c55276xgr3.KWHzl(), null, false, false, new Function0() { // from class: o.jcl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(CommonProductListFragment.OLrzqt(this.OLrzqt, c24148iWr2));
                    }
                }, null, null, null, null, null, null, null, null, null, null, null, null, null, 524252, null));
                i++;
            }
            C54990xbW.setData$default(c54990xbW, arrayList2, null, null, null, 14, null);
        }
    }

    public static final boolean OLrzqt(CommonProductListFragment commonProductListFragment, C24148iWr c24148iWr) {
        return commonProductListFragment.EZpvd(c24148iWr);
    }

    public final void AEQbTJ(C55276xgr c55276xgr) {
        Object next;
        Object next2;
        Object obj;
        Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        iWQ iwq = objOLrzqt instanceof iWQ ? (iWQ) objOLrzqt : null;
        if (iwq == null) {
            return;
        }
        List<C24148iWr> list = this.gEmmrt;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C55276xgr c55276xgr2 = (C55276xgr) CollectionsKt___CollectionsKt.firstOrNull(((C24148iWr) it.next()).KWHzl());
            Object objOLrzqt2 = c55276xgr2 != null ? c55276xgr2.OLrzqt() : null;
            arrayList.add(objOLrzqt2 instanceof iWQ ? (iWQ) objOLrzqt2 : null);
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            iWQ iwq2 = (iWQ) it2.next();
            if (iwq2 != null && iwq2.EZpvd() == iwq.EZpvd()) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || i >= this.gEmmrt.size()) {
            return;
        }
        Iterator<T> it3 = this.gEmmrt.get(i).KWHzl().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            Object objOLrzqt3 = ((C55276xgr) next).OLrzqt();
            iWQ iwq3 = objOLrzqt3 instanceof iWQ ? (iWQ) objOLrzqt3 : null;
            if (Intrinsics.EZpvd((Object) (iwq3 != null ? iwq3.OLrzqt() : null), (Object) iwq.OLrzqt())) {
                break;
            }
        }
        C55276xgr c55276xgr3 = (C55276xgr) next;
        if (c55276xgr3 == null) {
            c55276xgr3 = (C55276xgr) CollectionsKt___CollectionsKt.AuCTelauCTel(this.gEmmrt.get(i).KWHzl());
        }
        OLrzqt().EZpvd(c55276xgr3);
        View childAt = AEQbTJ().EZpvd.getChildAt(0);
        C54990xbW c54990xbW = childAt instanceof C54990xbW ? (C54990xbW) childAt : null;
        if (c54990xbW != null) {
            c54990xbW.OLrzqt(i, new C54982xbO(c55276xgr3.AhwBna(), c55276xgr3.KWHzl(), null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524284, null));
        }
        List<C55276xgr> listKWHzl = this.gEmmrt.get(i).KWHzl();
        Iterator<T> it4 = listKWHzl.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it4.next();
                if (((C55276xgr) next2).AEQbTJ()) {
                    break;
                }
            }
        }
        C55276xgr c55276xgr4 = (C55276xgr) next2;
        if (c55276xgr4 != null) {
            c55276xgr4.copydefault(false);
        }
        Iterator<T> it5 = listKWHzl.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj = null;
                break;
            }
            Object next3 = it5.next();
            Object objOLrzqt4 = ((C55276xgr) next3).OLrzqt();
            iWQ iwq4 = objOLrzqt4 instanceof iWQ ? (iWQ) objOLrzqt4 : null;
            if (Intrinsics.EZpvd((Object) (iwq4 != null ? iwq4.OLrzqt() : null), (Object) iwq.OLrzqt())) {
                obj = next3;
                break;
            }
        }
        C55276xgr c55276xgr5 = (C55276xgr) obj;
        if (c55276xgr5 != null) {
            c55276xgr5.copydefault(true);
        }
    }

    public final boolean EZpvd(C24148iWr c24148iWr) {
        if (C33054mpH.copydefault((android.app.Activity) getActivity())) {
            return false;
        }
        iWA iwa = this.valueOf;
        if (iwa != null && iwa.isVisible()) {
            iWA iwa2 = this.valueOf;
            if (iwa2 != null) {
                iwa2.dismiss();
            }
            return false;
        }
        iWA.ActionBar actionBar = iWA.Companion;
        List<C55276xgr> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) c24148iWr.KWHzl());
        Object objOLrzqt = ((C55276xgr) CollectionsKt___CollectionsKt.AuCTelauCTel(c24148iWr.KWHzl())).OLrzqt();
        Intrinsics.copydefault(objOLrzqt, "");
        iWA iwaKWHzl = actionBar.KWHzl(listFJNWhG, ((iWQ) objOLrzqt).EZpvd());
        this.valueOf = iwaKWHzl;
        if (iwaKWHzl != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            iwaKWHzl.show(childFragmentManager);
        }
        return true;
    }

    public final void OLrzqt(C26526jdw c26526jdw) {
        ProductJumpParam productJumpParamEZpvd = OLrzqt().EZpvd(c26526jdw.AhwBna());
        if (productJumpParamEZpvd == null || C33129mqd.OLrzqt((Object) Long.valueOf(productJumpParamEZpvd.AEQbTJ()), (Object) (-1))) {
            return;
        }
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        long jAEQbTJ = productJumpParamEZpvd.AEQbTJ();
        ActivityResultCaller parentFragment = getParentFragment();
        Intrinsics.copydefault(parentFragment, "");
        C27508jwX.startInvestDetailActivity$default(c27508jwX, fragmentActivityRequireActivity, Long.valueOf(jAEQbTJ), null, ((InterfaceC26465jco) parentFragment).AYXKKw(), null, false, 24, null);
    }

    public final void copydefault(C26526jdw c26526jdw) {
        Intent intent = new Intent(requireContext(), (Class<?>) ActivityC24156iWz.class);
        V2ProductQuery v2ProductQueryEZpvd = EZpvd();
        intent.putExtra("aggregate_tab_id", v2ProductQueryEZpvd != null ? Integer.valueOf(v2ProductQueryEZpvd.getTabId()) : null);
        intent.putExtra("aggregate_item_key", c26526jdw.AhwBna());
        startActivity(intent);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.home.CommonProductListFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final CommonProductListFragment OLrzqt(@NotNull V2ProductQuery v2ProductQuery, @NotNull List<C24148iWr> list) {
            Intrinsics.checkNotNullParameter(v2ProductQuery, "");
            Intrinsics.checkNotNullParameter(list, "");
            CommonProductListFragment commonProductListFragment = new CommonProductListFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("product_query", v2ProductQuery);
            commonProductListFragment.setArguments(bundle);
            commonProductListFragment.gEmmrt = list;
            return commonProductListFragment;
        }
    }

    public final void valueOf() {
        Object next;
        int i = 0;
        int i2 = 0;
        for (Object obj : this.gEmmrt) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            C24148iWr c24148iWr = (C24148iWr) obj;
            Iterator<T> it = c24148iWr.KWHzl().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((C55276xgr) next).AEQbTJ()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C55276xgr c55276xgr = (C55276xgr) next;
            C55276xgr c55276xgr2 = (C55276xgr) CollectionsKt___CollectionsKt.AuCTelauCTel(c24148iWr.KWHzl());
            c55276xgr2.copydefault(true);
            if (OLrzqt().EZpvd(c55276xgr2) || !Intrinsics.EZpvd(c55276xgr, c55276xgr2)) {
                View childAt = AEQbTJ().EZpvd.getChildAt(i);
                C54990xbW c54990xbW = childAt instanceof C54990xbW ? (C54990xbW) childAt : null;
                if (c54990xbW != null) {
                    c54990xbW.OLrzqt(i2, new C54982xbO(c55276xgr2.AhwBna(), c55276xgr2.KWHzl(), null, false, false, null, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, 524284, null));
                }
                if (c55276xgr != null) {
                    c55276xgr.copydefault(!c55276xgr2.AEQbTJ());
                }
            } else {
                OLrzqt().valueOf();
            }
            i2++;
            i = 0;
        }
    }
}
