package com.okinc.business.invest_biz.ui.screens.home;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.HomeTokensItemData;
import com.okinc.business.invest_biz.data.bean.InvestDetail;
import com.okinc.business.invest_biz.data.bean.LearnCardItem;
import com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2;
import com.okinc.business.invest_biz.ui.widget.SpanningLinearLayoutManager;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractActivityC33041mov;
import o.AbstractC27470jvm;
import o.AbstractC32996moC;
import o.AbstractC43238rlX;
import o.ActivityC26554jeX;
import o.C25493ixk;
import o.C25595izg;
import o.C26450jcZ;
import o.C26471jcu;
import o.C26473jcw;
import o.C26518jdo;
import o.C26588jfE;
import o.C27117jpD;
import o.C27292jsT;
import o.C27339jtN;
import o.C27359jth;
import o.C27375jtx;
import o.C27492jwH;
import o.C27508jwX;
import o.C27588jxy;
import o.C27589jxz;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C43251rlk;
import o.C43422row;
import o.C52761wXj;
import o.C55024xcD;
import o.C55113xdn;
import o.C55173xeu;
import o.C55230xfy;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56424yEw;
import o.C56524yIo;
import o.InterfaceC23916iOb;
import o.InterfaceC25466ixJ;
import o.InterfaceC26470jct;
import o.InterfaceC26472jcv;
import o.InterfaceC26474jcx;
import o.InterfaceC26475jcy;
import o.InterfaceC27342jtQ;
import o.InterfaceC27344jtS;
import o.InterfaceC43294rma;
import o.InterfaceC56387yDm;
import o.InterfaceC57903yrG;
import o.InterfaceC57934yrl;
import o.iCF;
import o.iHB;
import o.iJI;
import o.iJJ;
import o.iJM;
import o.iJN;
import o.iNB;
import o.iNI;
import o.yCM;
import o.yHS;
import o.yIP;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeFragmentV2 extends AbstractC32996moC implements InterfaceC25466ixJ {
    public static final /* synthetic */ yJA<Object>[] AEQbTJ = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(InvestHomeFragmentV2.class, "mBinding", "getMBinding()Lcom/okinc/business/invest_biz/databinding/FragmentInvestHomeV2Binding;", 0))};
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final Activity copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final yIP gEmmrt = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    @yCM
    public iNB viewModelFactory;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.AxsJAY;
    }

    public InvestHomeFragmentV2() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestHomeV2ViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.jcE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.hDKMBd(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$6
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C26518jdo.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$9
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jcG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.getFieldNames(this.AEQbTJ);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.jcF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.zsXlph(this.KWHzl);
            }
        });
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$10
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C27117jpD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$13
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$special$$inlined$viewModels$default$14
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jcN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.getNewProxyInstance(this.EZpvd);
            }
        });
        this.copydefault = new Activity();
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.jcL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.iwGUEr(this.AEQbTJ);
            }
        });
    }

    public final iHB AYXKKw() {
        return (iHB) this.gEmmrt.getValue(this, AEQbTJ[0]);
    }

    public final void copydefault(iHB ihb) {
        this.gEmmrt.KWHzl(this, AEQbTJ[0], ihb);
    }

    public final InvestHomeV2ViewModel valueOf() {
        return (InvestHomeV2ViewModel) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner hDKMBd(InvestHomeFragmentV2 investHomeFragmentV2) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = investHomeFragmentV2.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final C26518jdo gEmmrt() {
        return (C26518jdo) this.djBIcL.getValue();
    }

    public final C26471jcu copydefault() {
        return (C26471jcu) this.KWHzl.getValue();
    }

    public static final Unit KWHzl(InvestHomeFragmentV2 investHomeFragmentV2, LearnCardItem learnCardItem) {
        Intrinsics.checkNotNullParameter(learnCardItem, "");
        investHomeFragmentV2.AEQbTJ(learnCardItem);
        return Unit.INSTANCE;
    }

    public static final C26471jcu getFieldNames(final InvestHomeFragmentV2 investHomeFragmentV2) {
        return new C26471jcu(new Function1() { // from class: o.jcA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestHomeFragmentV2.KWHzl(this.KWHzl, (LearnCardItem) obj);
            }
        });
    }

    public final C27292jsT fetchVPNInfo() {
        return (C27292jsT) this.values.getValue();
    }

    public static final C27292jsT zsXlph(final InvestHomeFragmentV2 investHomeFragmentV2) {
        return new C27292jsT(new Function1() { // from class: o.jcO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestHomeFragmentV2.OLrzqt(this.AEQbTJ, (C27375jtx) obj);
            }
        }, null, false, 2, null);
    }

    public static final Unit OLrzqt(InvestHomeFragmentV2 investHomeFragmentV2, C27375jtx c27375jtx) {
        Intrinsics.checkNotNullParameter(c27375jtx, "");
        investHomeFragmentV2.OLrzqt(c27375jtx.copydefault(), c27375jtx.OLrzqt());
        return Unit.INSTANCE;
    }

    private final C27117jpD fIwbmz() {
        return (C27117jpD) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C26588jfE fJNWhG() {
        return (C26588jfE) this.EZpvd.getValue();
    }

    public static final C26588jfE getNewProxyInstance(InvestHomeFragmentV2 investHomeFragmentV2) {
        return new C26588jfE(investHomeFragmentV2.fIwbmz(), investHomeFragmentV2);
    }

    public static final class Activity extends FragmentManager.FragmentLifecycleCallbacks {
        public Activity() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            InvestHomeFragmentV2 investHomeFragmentV2 = InvestHomeFragmentV2.this;
            investHomeFragmentV2.djBIcL(investHomeFragmentV2.AYXKKw());
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPaused(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            InvestHomeFragmentV2 investHomeFragmentV2 = InvestHomeFragmentV2.this;
            investHomeFragmentV2.AhwBna(investHomeFragmentV2.AYXKKw());
        }
    }

    public static final class VoiceInteractor implements InterfaceC27344jtS {
        public VoiceInteractor() {
        }

        @Override // o.InterfaceC27344jtS
        public void OLrzqt(InterfaceC27342jtQ interfaceC27342jtQ) {
            Intrinsics.checkNotNullParameter(interfaceC27342jtQ, "");
            InvestHomeFragmentV2.this.valueOf().fJNWhG();
        }
    }

    public final VoiceInteractor djBIcL() {
        return (VoiceInteractor) this.AYXKKw.getValue();
    }

    public static final VoiceInteractor iwGUEr(InvestHomeFragmentV2 investHomeFragmentV2) {
        return investHomeFragmentV2.new VoiceInteractor();
    }

    public final iNB isConnected() {
        iNB inb = this.viewModelFactory;
        if (inb != null) {
            return inb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return isConnected();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        iNI.KWHzl(context).OLrzqt(this);
        super.onAttach(context);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        copydefault(iHB.copydefault(view));
        iHB ihbAYXKKw = AYXKKw();
        EZpvd(ihbAYXKKw);
        OLrzqt(ihbAYXKKw);
        AEQbTJ(ihbAYXKKw);
        KWHzl(ihbAYXKKw);
        C55173xeu c55173xeu = ihbAYXKKw.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        OLrzqt(c55173xeu, new Function0() { // from class: o.jcz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.uzCIH(this.copydefault);
            }
        });
        C25595izg c25595izg = C25595izg.AEQbTJ;
        c25595izg.KWHzl("invest_global");
        c25595izg.AEQbTJ("invest_global").OLrzqt().clearListener();
        c25595izg.AEQbTJ("invest_global").OLrzqt().startSync();
        InvestHomeV2ViewModel.initData$default(valueOf(), false, 1, null);
        AuCTel();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel.initData$default(com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel, boolean, int, java.lang.Object):void */
    public static final Unit uzCIH(InvestHomeFragmentV2 investHomeFragmentV2) {
        InvestHomeV2ViewModel.initData$default(investHomeFragmentV2.valueOf(), false, 1, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getParentFragmentManager().unregisterFragmentLifecycleCallbacks(this.copydefault);
        C25595izg c25595izg = C25595izg.AEQbTJ;
        c25595izg.AEQbTJ("invest_global").OLrzqt().clearListener();
        c25595izg.AEQbTJ("invest_global").OLrzqt().stopSync();
        c25595izg.copydefault("invest_global");
    }

    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return KWHzl(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                InvestHomeFragmentV2.this.values();
            } else {
                C55113xdn c55113xdn = InvestHomeFragmentV2.this.AYXKKw().valueOf;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    private final void AuCTel() {
        StateFlow<Boolean> stateFlowAkhnZx = valueOf().AkhnZx();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C27589jxz.EZpvd(this, stateFlowAkhnZx, state, new PendingIntent());
        C27589jxz.EZpvd(this, valueOf().KWHzl(), state, new Dialog());
        C27589jxz.EZpvd(this, valueOf().copydefault(), state, new FragmentManager());
        C27589jxz.EZpvd(this, valueOf().OLrzqt(), state, new Fragment());
        C27589jxz.EZpvd(this, valueOf().DbNXlk(), state, new LoaderManager());
        C27589jxz.EZpvd(this, valueOf().AhwBna(), state, new TaskStackBuilder());
        C27589jxz.EZpvd(this, valueOf().isConnected(), state, new PictureInPictureParams());
        C27589jxz.EZpvd(this, valueOf().valueOf(), state, new AssistContent());
        C27589jxz.EZpvd(this, gEmmrt().OLrzqt(), state, new SharedElementCallback());
        getParentFragmentManager().registerFragmentLifecycleCallbacks(this.copydefault, true);
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return OLrzqt(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            C55173xeu c55173xeu = InvestHomeFragmentV2.this.AYXKKw().copydefault;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(z ? 0 : 8);
            if (z) {
                C55113xdn c55113xdn = InvestHomeFragmentV2.this.AYXKKw().valueOf;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return OLrzqt(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                C55113xdn c55113xdn = InvestHomeFragmentV2.this.AYXKKw().valueOf;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(8);
                C55173xeu c55173xeu = InvestHomeFragmentV2.this.AYXKKw().copydefault;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ InvestHomeFragmentV2 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, InvestHomeFragmentV2 investHomeFragmentV2) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = investHomeFragmentV2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), null, null, new InvestHomeFragmentV2$initTokensSection$2$1(this.OLrzqt, null), 3, null);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ InvestHomeFragmentV2 KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, InvestHomeFragmentV2 investHomeFragmentV2) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = investHomeFragmentV2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.DbNXlk();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ InvestHomeFragmentV2 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, InvestHomeFragmentV2 investHomeFragmentV2) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = investHomeFragmentV2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.valueOf().OLrzqt("search_bar");
                ActivityC26554jeX.StateListAnimator stateListAnimator = ActivityC26554jeX.Companion;
                FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                stateListAnimator.copydefault(fragmentActivityRequireActivity);
            }
        }
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC26470jct interfaceC26470jct, Continuation<? super Unit> continuation) {
            InvestHomeFragmentV2 investHomeFragmentV2 = InvestHomeFragmentV2.this;
            investHomeFragmentV2.AEQbTJ(investHomeFragmentV2.AYXKKw(), interfaceC26470jct);
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
        public final Object emit(InterfaceC26472jcv interfaceC26472jcv, Continuation<? super Unit> continuation) {
            InvestHomeFragmentV2 investHomeFragmentV2 = InvestHomeFragmentV2.this;
            investHomeFragmentV2.EZpvd(investHomeFragmentV2.AYXKKw(), interfaceC26472jcv);
            return Unit.INSTANCE;
        }
    }

    public static final class TaskStackBuilder<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC26475jcy interfaceC26475jcy, Continuation<? super Unit> continuation) {
            InvestHomeFragmentV2 investHomeFragmentV2 = InvestHomeFragmentV2.this;
            investHomeFragmentV2.copydefault(investHomeFragmentV2.AYXKKw(), interfaceC26475jcy);
            return Unit.INSTANCE;
        }
    }

    public static final class PictureInPictureParams<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC26474jcx interfaceC26474jcx, Continuation<? super Unit> continuation) {
            InvestHomeFragmentV2 investHomeFragmentV2 = InvestHomeFragmentV2.this;
            investHomeFragmentV2.copydefault(investHomeFragmentV2.AYXKKw(), interfaceC26474jcx);
            return Unit.INSTANCE;
        }
    }

    public static final class AssistContent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            InvestHomeFragmentV2.this.AYXKKw().AYXKKw.AEQbTJ();
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
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            InvestHomeFragmentV2.this.valueOf().copydefault(true);
            return Unit.INSTANCE;
        }
    }

    public static final void EZpvd(InvestHomeFragmentV2 investHomeFragmentV2, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        investHomeFragmentV2.valueOf().copydefault(true);
    }

    public final void EZpvd(iHB ihb) {
        ihb.AYXKKw.OLrzqt(new InterfaceC57903yrG() { // from class: o.jcX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                InvestHomeFragmentV2.EZpvd(this.EZpvd, interfaceC57934yrl);
            }
        });
        ihb.AhwBna.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
    }

    public final void OLrzqt(final iHB ihb) {
        ihb.gEmmrt.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.jcK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                InvestHomeFragmentV2.AEQbTJ(ihb, this, view, i, i2, i3, i4);
            }
        });
        C55230xfy c55230xfy = ihb.DbNXlk;
        c55230xfy.setOnClickListener(new StateListAnimator(c55230xfy, 1000L, this));
    }

    public static final void AEQbTJ(iHB ihb, InvestHomeFragmentV2 investHomeFragmentV2, View view, int i, int i2, int i3, int i4) {
        int height = ihb.DbNXlk.getHeight();
        int scrollY = ihb.gEmmrt.getScrollY();
        investHomeFragmentV2.gEmmrt().KWHzl(scrollY >= 0 && scrollY <= height);
    }

    public final void AEQbTJ(iHB ihb) {
        RecyclerView recyclerView = ihb.EZpvd.AYXKKw;
        recyclerView.setHasFixedSize(true);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        recyclerView.setLayoutManager(new SpanningLinearLayoutManager(contextRequireContext, C55298xhM.copydefault(12.0f, context), 0, 0, 0, 28, null));
        recyclerView.setAdapter(copydefault());
        C55024xcD c55024xcD = ihb.EZpvd.copydefault;
        c55024xcD.setOnClickListener(new Application(c55024xcD, 1000L, this));
    }

    public final void KWHzl(iHB ihb) {
        ihb.AEQbTJ.EZpvd.setAdapter(fetchVPNInfo());
        LinearLayout linearLayout = ihb.AEQbTJ.KWHzl;
        linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, this));
    }

    public final void OLrzqt(C55173xeu c55173xeu, final Function0<Unit> function0) {
        String string = getString(C25493ixk.FragmentManager.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setRetry(string);
        c55173xeu.setTitle(C43422row.OLrzqt());
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jcJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestHomeFragmentV2.OLrzqt(function0, view);
            }
        });
    }

    public static final void OLrzqt(Function0 function0, View view) {
        function0.invoke();
    }

    public final void OLrzqt(long j, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestHomeFragmentV2$startInvestFlow$1(this, j, z, null), 3, null);
    }

    public final void values() {
        AYXKKw().valueOf.setAnimation(C33492mxV.OLrzqt() ? "home_container_loading_dark.lottie" : "home_container_loading.lottie");
        AYXKKw().valueOf.KWHzl(0L);
        final C55113xdn c55113xdn = AYXKKw().valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.post(new Runnable() { // from class: o.jcI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                InvestHomeFragmentV2.AEQbTJ(this.OLrzqt, c55113xdn);
            }
        });
    }

    public static final void AEQbTJ(InvestHomeFragmentV2 investHomeFragmentV2, C55113xdn c55113xdn) {
        int width;
        if (!investHomeFragmentV2.isAdded() || investHomeFragmentV2.getView() == null || (width = c55113xdn.getWidth()) <= 0) {
            return;
        }
        int i = (width * 740) / 375;
        ViewGroup.LayoutParams layoutParams = c55113xdn.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            c55113xdn.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void AEQbTJ(iHB ihb, InterfaceC26470jct interfaceC26470jct) {
        iJJ ijj = ihb.KWHzl;
        C55173xeu c55173xeu = ijj.copydefault;
        Intrinsics.copydefault(c55173xeu);
        OLrzqt(c55173xeu, new Function0() { // from class: o.jcH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.fJNWhG(this.EZpvd);
            }
        });
        c55173xeu.setVisibility(interfaceC26470jct instanceof InterfaceC26470jct.Application ? 0 : 8);
        if (interfaceC26470jct instanceof InterfaceC26470jct.ActionBar) {
            InterfaceC26470jct.ActionBar actionBar = (InterfaceC26470jct.ActionBar) interfaceC26470jct;
            if (!actionBar.copydefault().isEmpty()) {
                C27339jtN c27339jtN = ijj.KWHzl;
                Intrinsics.copydefault(c27339jtN);
                c27339jtN.setVisibility(0);
                c27339jtN.setItemRenderCallback(djBIcL());
                c27339jtN.setData(AEQbTJ(actionBar.copydefault()));
            }
        }
    }

    public static final Unit fJNWhG(InvestHomeFragmentV2 investHomeFragmentV2) {
        investHomeFragmentV2.valueOf().EZpvd();
        return Unit.INSTANCE;
    }

    public final void djBIcL(iHB ihb) {
        iJJ ijj = ihb.KWHzl;
        C27339jtN c27339jtN = ijj.KWHzl;
        Intrinsics.copydefault(c27339jtN);
        if (c27339jtN.getVisibility() == 0) {
            ijj.KWHzl.AEQbTJ();
        }
    }

    public final void AhwBna(iHB ihb) {
        iJJ ijj = ihb.KWHzl;
        C27339jtN c27339jtN = ijj.KWHzl;
        Intrinsics.copydefault(c27339jtN);
        if (c27339jtN.getVisibility() == 0) {
            ijj.KWHzl.copydefault();
        }
    }

    public final void EZpvd(iHB ihb, InterfaceC26472jcv interfaceC26472jcv) {
        iJI iji = ihb.OLrzqt;
        C55173xeu c55173xeu = iji.KWHzl;
        Intrinsics.copydefault(c55173xeu);
        OLrzqt(c55173xeu, new Function0() { // from class: o.jcM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.fARcdN(this.copydefault);
            }
        });
        c55173xeu.setVisibility(interfaceC26472jcv instanceof InterfaceC26472jcv.ActionBar ? 0 : 8);
        Group group = iji.copydefault;
        Intrinsics.checkNotNullExpressionValue(group, "");
        boolean z = interfaceC26472jcv instanceof InterfaceC26472jcv.TaskDescription;
        group.setVisibility(z ? 0 : 8);
        if (z) {
            iHB ihbAYXKKw = AYXKKw();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C26450jcZ.OLrzqt(ihbAYXKKw, contextRequireContext, ((InterfaceC26472jcv.TaskDescription) interfaceC26472jcv).OLrzqt());
        }
    }

    public static final Unit fARcdN(InvestHomeFragmentV2 investHomeFragmentV2) {
        investHomeFragmentV2.valueOf().gEmmrt();
        return Unit.INSTANCE;
    }

    public final void copydefault(iHB ihb, InterfaceC26475jcy interfaceC26475jcy) {
        iJN ijn = ihb.EZpvd;
        C55173xeu c55173xeu = ijn.OLrzqt;
        Intrinsics.copydefault(c55173xeu);
        OLrzqt(c55173xeu, new Function0() { // from class: o.jcB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.AuCTel(this.KWHzl);
            }
        });
        c55173xeu.setVisibility(interfaceC26475jcy instanceof InterfaceC26475jcy.Application ? 0 : 8);
        Group group = ijn.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        boolean z = interfaceC26475jcy instanceof InterfaceC26475jcy.ActionBar;
        group.setVisibility(z ? 0 : 8);
        if (z) {
            C55024xcD c55024xcD = ijn.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55024xcD, "");
            InterfaceC26475jcy.ActionBar actionBar = (InterfaceC26475jcy.ActionBar) interfaceC26475jcy;
            c55024xcD.setVisibility(C33129mqd.OLrzqt((CharSequence) actionBar.copydefault()) ? 0 : 8);
            ijn.copydefault.setTitleText(actionBar.copydefault());
            ijn.copydefault.setShowDescription(C33129mqd.OLrzqt((CharSequence) actionBar.KWHzl()));
            ijn.copydefault.setDescriptionText(actionBar.KWHzl());
            C27588jxy.AEQbTJ(copydefault(), actionBar.EZpvd());
        }
    }

    public static final Unit AuCTel(InvestHomeFragmentV2 investHomeFragmentV2) {
        investHomeFragmentV2.valueOf().AYXKKw();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jvm.setData$default(o.jvm, java.util.List, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void copydefault(iHB ihb, InterfaceC26474jcx interfaceC26474jcx) {
        iJM ijm = ihb.AEQbTJ;
        C55173xeu c55173xeu = ijm.djBIcL;
        Intrinsics.copydefault(c55173xeu);
        OLrzqt(c55173xeu, new Function0() { // from class: o.jcR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeFragmentV2.ejfBZ(this.AEQbTJ);
            }
        });
        int iOLrzqt = 0;
        c55173xeu.setVisibility(interfaceC26474jcx instanceof InterfaceC26474jcx.ActionBar ? 0 : 8);
        if (!(interfaceC26474jcx instanceof InterfaceC26474jcx.TaskDescription)) {
            AYXKKw().AYXKKw.AEQbTJ();
        }
        LinearLayout linearLayout = ijm.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        boolean z = interfaceC26474jcx instanceof InterfaceC26474jcx.StateListAnimator;
        linearLayout.setVisibility((z && valueOf().fARcdN()) ? 0 : 8);
        RecyclerView recyclerView = ijm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(z ? 0 : 8);
        if (z) {
            InterfaceC26474jcx.StateListAnimator stateListAnimator = (InterfaceC26474jcx.StateListAnimator) interfaceC26474jcx;
            if (stateListAnimator.EZpvd().AEQbTJ() == 1) {
                ijm.AhwBna.setTitleText(getString(C25493ixk.FragmentManager.fZBcTu));
            } else {
                ijm.AhwBna.setTitleText(getString(C25493ixk.FragmentManager.finit));
            }
            AkhnZx();
            C27292jsT c27292jsTFetchVPNInfo = fetchVPNInfo();
            List<HomeTokensItemData> listKWHzl = stateListAnimator.EZpvd().KWHzl();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                arrayList.add(C27359jth.copydefault((HomeTokensItemData) it.next()));
            }
            AbstractC27470jvm.setData$default(c27292jsTFetchVPNInfo, arrayList, null, 2, null);
        }
        ViewGroup.LayoutParams layoutParams = ihb.OLrzqt.getRoot().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            LinearLayout linearLayout2 = ihb.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            if (linearLayout2.getVisibility() != 0) {
                Context context = ihb.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iOLrzqt = C55298xhM.OLrzqt(16, context);
            }
            marginLayoutParams.topMargin = iOLrzqt;
            ihb.OLrzqt.getRoot().setLayoutParams(marginLayoutParams);
        }
    }

    public static final Unit ejfBZ(InvestHomeFragmentV2 investHomeFragmentV2) {
        investHomeFragmentV2.valueOf().djBIcL();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jwH.formatRatePercent$default(o.jwH, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
    public static final String EZpvd(String str, String str2) {
        String strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.apAOXX);
        Pair[] pairArr = new Pair[2];
        pairArr[0] = C56390yDp.OLrzqt("percent", C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, str, false, 2, null));
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("rateDescStr", str2);
        return C33069mpW.OLrzqt(strAYXKKw, C56424yEw.gEmmrt(pairArr));
    }

    public static final Unit AEQbTJ(InvestHomeFragmentV2 investHomeFragmentV2, long j, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        investHomeFragmentV2.copydefault(j, str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InvestHomeFragmentV2 investHomeFragmentV2, String str, String str2, String str3, Boolean bool, String str4) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        investHomeFragmentV2.copydefault(str, str2, str3, bool, str4);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void launchCampaignUrl$default(InvestHomeFragmentV2 investHomeFragmentV2, String str, String str2, String str3, Boolean bool, String str4, int i, Object obj) throws UnsupportedEncodingException {
        if ((i & 8) != 0) {
            bool = Boolean.FALSE;
        }
        investHomeFragmentV2.copydefault(str, str2, str3, bool, str4);
    }

    public final void copydefault(String str, String str2, String str3, Boolean bool, String str4) throws UnsupportedEncodingException {
        valueOf().AEQbTJ(str4);
        if (str.length() > 0) {
            C27508jwX c27508jwX = C27508jwX.AEQbTJ;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C27508jwX.openUrl$default(c27508jwX, contextRequireContext, str, false, 2, null);
            return;
        }
        if (Intrinsics.EZpvd(bool, Boolean.TRUE) && C33129mqd.OLrzqt((CharSequence) str3)) {
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC23916iOb.class);
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, contextRequireContext2, C33129mqd.gEmmrt(str3), null, new Function1() { // from class: o.jcC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestHomeFragmentV2.EZpvd((AbstractC43238rlX) obj);
                }
            }, 4, null);
            return;
        }
        InterfaceC43294rma interfaceC43294rma2 = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC23916iOb.class);
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma2, contextRequireContext3, str2, null, new Function1() { // from class: o.jcD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestHomeFragmentV2.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(long j, String str) {
        valueOf().KWHzl(j, str);
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C27508jwX.startInvestDetailActivity$default(c27508jwX, contextRequireContext, Long.valueOf(j), null, "homepagehot", null, false, 24, null);
    }

    public final void AEQbTJ(LearnCardItem learnCardItem) {
        String strOLrzqt;
        valueOf().EZpvd(learnCardItem.copydefault());
        if (C33492mxV.OLrzqt()) {
            strOLrzqt = learnCardItem.KWHzl().KWHzl();
        } else {
            strOLrzqt = learnCardItem.KWHzl().OLrzqt();
        }
        C26473jcw.Companion.EZpvd(learnCardItem.copydefault(), learnCardItem.AEQbTJ(), strOLrzqt).show(getChildFragmentManager(), C56524yIo.AEQbTJ(C26473jcw.class).valueOf());
    }

    public final void DbNXlk() {
        valueOf().OLrzqt("faq_tips");
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c27508jwX.KWHzl(contextRequireContext);
    }

    public final void AkhnZx() {
        boolean zAEQbTJ = valueOf().AEQbTJ();
        iJM ijm = AYXKKw().AEQbTJ;
        if (zAEQbTJ) {
            ijm.AEQbTJ.setText(getString(C25493ixk.FragmentManager.dxcTrN));
            ijm.OLrzqt.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
        } else {
            ijm.AEQbTJ.setText(getString(C25493ixk.FragmentManager.dvKsVJ));
            ijm.OLrzqt.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
        }
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope KWHzl() {
        return LifecycleOwnerKt.getLifecycleScope(this);
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
    }

    @Override // o.InterfaceC25466ixJ
    public androidx.fragment.app.FragmentManager OLrzqt() {
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        return parentFragmentManager;
    }

    @Override // o.InterfaceC25466ixJ
    public Context AEQbTJ() {
        return getContext();
    }

    @Override // o.InterfaceC25466ixJ
    public AbstractActivityC33041mov EZpvd() {
        FragmentActivity activity = getActivity();
        if (activity instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) activity;
        }
        return null;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final InvestHomeFragmentV2 KWHzl() {
            return new InvestHomeFragmentV2();
        }
    }

    public final List<InterfaceC27342jtQ> AEQbTJ(List<InvestDetail> list) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(iCF.copydefault((InvestDetail) it.next(), new Function2() { // from class: o.jcP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return InvestHomeFragmentV2.EZpvd((java.lang.String) obj, (java.lang.String) obj2);
                }
            }, new Function2() { // from class: o.jcQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return InvestHomeFragmentV2.AEQbTJ(this.KWHzl, ((java.lang.Long) obj).longValue(), (java.lang.String) obj2);
                }
            }, new yHS() { // from class: o.jcS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHS
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return InvestHomeFragmentV2.copydefault(this.OLrzqt, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3, (java.lang.Boolean) obj4, (java.lang.String) obj5);
                }
            }));
        }
        return arrayList;
    }
}
