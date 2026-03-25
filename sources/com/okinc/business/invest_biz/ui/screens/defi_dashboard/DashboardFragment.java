package com.okinc.business.invest_biz.ui.screens.defi_dashboard;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResult;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResultType;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailParams;
import com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation;
import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractActivityC33041mov;
import o.AbstractC32996moC;
import o.AbstractC58185ywX;
import o.C23580iBq;
import o.C23745iHt;
import o.C24193iYi;
import o.C24195iYk;
import o.C24204iYt;
import o.C24207iYw;
import o.C24214iZc;
import o.C25428iwY;
import o.C25493ixk;
import o.C25514iyE;
import o.C25515iyF;
import o.C26588jfE;
import o.C27117jpD;
import o.C27289jsQ;
import o.C27292jsT;
import o.C27369jtr;
import o.C27373jtv;
import o.C27375jtx;
import o.C27376jty;
import o.C27433jvB;
import o.C27437jvF;
import o.C27493jwI;
import o.C27589jxz;
import o.C33129mqd;
import o.C33492mxV;
import o.C55113xdn;
import o.C55173xeu;
import o.C55302xhQ;
import o.C56392yDr;
import o.C56524yIo;
import o.C56548yJl;
import o.C58156yvv;
import o.InterfaceC24202iYr;
import o.InterfaceC25466ixJ;
import o.InterfaceC25484ixb;
import o.InterfaceC27286jsN;
import o.InterfaceC27287jsO;
import o.InterfaceC27436jvE;
import o.InterfaceC33014moU;
import o.InterfaceC54847xXn;
import o.InterfaceC56387yDm;
import o.InterfaceC58227yxM;
import o.iDV;
import o.iNB;
import o.iNI;
import o.iYU;
import o.iZU;
import o.pUU;
import o.rVN;
import o.yCM;
import o.yIP;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardFragment extends AbstractC32996moC implements InterfaceC25466ixJ, InterfaceC54847xXn, InterfaceC27287jsO, InterfaceC25484ixb {
    public final MutableSharedFlow<Long> AEQbTJ;
    public Integer AYXKKw;
    public final List<InterfaceC27436jvE> AhwBna;
    public boolean AkhnZx;
    public boolean AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public InterfaceC27287jsO EZpvd;
    public final yIP KWHzl;
    public C25428iwY djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final Map<C27369jtr, Integer> fARcdN;
    public boolean fIwbmz;
    public final long fJNWhG;
    public boolean fetchVPNInfo;
    public androidx.fragment.app.FragmentManager gEmmrt;
    public Function1<? super C25428iwY, Unit> getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public long isConnected;
    public final InterfaceC56387yDm uzCIH;
    public final InterfaceC56387yDm valueOf;
    public boolean values;

    @yCM
    public iNB viewModelFactory;
    public static final /* synthetic */ yJA<Object>[] copydefault = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(DashboardFragment.class, "binding", "getBinding()Lcom/okinc/business/invest_biz/databinding/FragmentDashboardBinding;", 0))};
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AssetDetailsResultType.values().length];
            try {
                iArr[AssetDetailsResultType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DashboardFragment() {
        this(0L, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25484ixb
    public void OLrzqt(Function1<? super C25428iwY, Unit> function1) {
        this.getNewProxyInstance = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25484ixb
    public C25428iwY copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.zsXlph;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r2v0 long))
  (wrap:androidx.fragment.app.FragmentManager:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null androidx.fragment.app.FragmentManager) : (r4v0 androidx.fragment.app.FragmentManager))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(long, androidx.fragment.app.FragmentManager, java.lang.Integer):void (m)] (LINE:86) call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment.<init>(long, androidx.fragment.app.FragmentManager, java.lang.Integer):void type: THIS */
    public /* synthetic */ DashboardFragment(long j, androidx.fragment.app.FragmentManager fragmentManager, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? null : fragmentManager, (i & 4) != 0 ? null : num);
    }

    public DashboardFragment(long j, androidx.fragment.app.FragmentManager fragmentManager, Integer num) {
        this.fJNWhG = j;
        this.gEmmrt = fragmentManager;
        this.AYXKKw = num;
        this.KWHzl = C27589jxz.EZpvd(this);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$2
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
        this.hDKMBd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C24204iYt.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$5
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
        this.isConnected = -1L;
        this.fetchVPNInfo = true;
        this.djBIcL = new C25428iwY(false, false, null, 6, null);
        this.AhwBna = new ArrayList();
        this.fARcdN = new LinkedHashMap();
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.iYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DashboardFragment.isConnected(this.copydefault);
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.iYf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DashboardFragment.AkhnZx(this.KWHzl);
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$7
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
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C27117jpD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$special$$inlined$viewModels$default$10
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
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.iYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DashboardFragment.values(this.copydefault);
            }
        });
        this.AEQbTJ = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ DashboardFragment newInstance$default(TaskDescription taskDescription, String str, Long l, androidx.fragment.app.FragmentManager fragmentManager, Integer num, int i, Object obj) {
            if ((i & 4) != 0) {
                fragmentManager = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            return taskDescription.copydefault(str, l, fragmentManager, num);
        }

        public final DashboardFragment copydefault(String str, Long l, androidx.fragment.app.FragmentManager fragmentManager, Integer num) {
            C24193iYi.OLrzqt.KWHzl(str);
            return new DashboardFragment(l != null ? l.longValue() : -1L, fragmentManager, num);
        }
    }

    public final void AEQbTJ(C23745iHt c23745iHt) {
        this.KWHzl.KWHzl(this, copydefault[0], c23745iHt);
    }

    public final C23745iHt gEmmrt() {
        return (C23745iHt) this.KWHzl.getValue(this, copydefault[0]);
    }

    public final iNB fetchVPNInfo() {
        iNB inb = this.viewModelFactory;
        if (inb != null) {
            return inb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return fetchVPNInfo();
    }

    public final C24204iYt isConnected() {
        return (C24204iYt) this.hDKMBd.getValue();
    }

    public final C27289jsQ AYXKKw() {
        return (C27289jsQ) this.valueOf.getValue();
    }

    public static final void copydefault(DashboardFragment dashboardFragment, InterfaceC27286jsN interfaceC27286jsN) {
        Intrinsics.checkNotNullParameter(interfaceC27286jsN, "");
        dashboardFragment.OLrzqt(interfaceC27286jsN);
    }

    public static final C27289jsQ isConnected(final DashboardFragment dashboardFragment) {
        return new C27289jsQ(new InterfaceC27287jsO() { // from class: o.iYe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC27287jsO
            public final void OLrzqt(InterfaceC27286jsN interfaceC27286jsN) {
                DashboardFragment.copydefault(this.copydefault, interfaceC27286jsN);
            }
        }, new DashboardFragment$dashboardAdapter$2$2(dashboardFragment));
    }

    public final C27292jsT djBIcL() {
        return (C27292jsT) this.ejfBZ.getValue();
    }

    public static final C27292jsT AkhnZx(final DashboardFragment dashboardFragment) {
        return new C27292jsT(new Function1() { // from class: o.iXM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DashboardFragment.OLrzqt(this.OLrzqt, (C27375jtx) obj);
            }
        }, new Function0() { // from class: o.iXV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DashboardFragment.fetchVPNInfo(this.AEQbTJ);
            }
        }, false, 4, null);
    }

    public static final Unit OLrzqt(DashboardFragment dashboardFragment, C27375jtx c27375jtx) {
        Intrinsics.checkNotNullParameter(c27375jtx, "");
        dashboardFragment.copydefault(c27375jtx.copydefault(), c27375jtx.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(DashboardFragment dashboardFragment) {
        dashboardFragment.OLrzqt(InterfaceC27286jsN.Activity.KWHzl);
        return Unit.INSTANCE;
    }

    public final C27117jpD DbNXlk() {
        return (C27117jpD) this.uzCIH.getValue();
    }

    public final C26588jfE valueOf() {
        return (C26588jfE) this.DbNXlk.getValue();
    }

    public static final C26588jfE values(DashboardFragment dashboardFragment) {
        return new C26588jfE(dashboardFragment.DbNXlk(), dashboardFragment);
    }

    @Override // o.InterfaceC54847xXn
    public void KWHzl(long j, long j2, boolean z) {
        this.values = true;
        this.isConnected = j2;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DashboardFragment$onChainSet$1(this, j2, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C24193iYi.OLrzqt.copydefault();
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33016moW
    public boolean onRefresh(@NotNull Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null && bool.booleanValue()) {
            isConnected().OLrzqt(this.isConnected);
        }
        return super.onRefresh(obj, interfaceC33014moU);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33014moU
    public void onRefreshCompleted(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        RxBus.AEQbTJ(new C25514iyE());
    }

    @Override // o.InterfaceC27287jsO
    public void OLrzqt(@NotNull InterfaceC27286jsN interfaceC27286jsN) {
        Intrinsics.checkNotNullParameter(interfaceC27286jsN, "");
        if (interfaceC27286jsN instanceof InterfaceC27286jsN.StateListAnimator) {
            InterfaceC27286jsN.StateListAnimator stateListAnimator = (InterfaceC27286jsN.StateListAnimator) interfaceC27286jsN;
            EZpvd(stateListAnimator.OLrzqt(), stateListAnimator.KWHzl(), stateListAnimator.AEQbTJ(), stateListAnimator.EZpvd(), stateListAnimator.copydefault());
        } else if (interfaceC27286jsN instanceof InterfaceC27286jsN.LoaderManager) {
            InterfaceC27286jsN.LoaderManager loaderManager = (InterfaceC27286jsN.LoaderManager) interfaceC27286jsN;
            AEQbTJ(loaderManager.OLrzqt(), loaderManager.KWHzl(), loaderManager.AEQbTJ(), loaderManager.EZpvd());
        } else {
            InterfaceC27287jsO interfaceC27287jsO = this.EZpvd;
            if (interfaceC27287jsO != null) {
                interfaceC27287jsO.OLrzqt(interfaceC27286jsN);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        iNI.KWHzl(context).copydefault(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.isConnected = this.fJNWhG;
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C25515iyF.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.iXL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DashboardFragment.AEQbTJ(this.OLrzqt, (C25515iyF) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.iXK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DashboardFragment.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(DashboardFragment dashboardFragment, C25515iyF c25515iyF) {
        dashboardFragment.AkhnZx = true;
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.AkhnZx) {
            this.AkhnZx = false;
            values();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ(C23745iHt.copydefault(view));
        AuCTel();
        this.EZpvd = new iYU(this, this.gEmmrt, this.AYXKKw);
        Flow flowDebounce = FlowKt.debounce(this.AEQbTJ, 100L);
        Lifecycle.State state = Lifecycle.State.CREATED;
        C27589jxz.EZpvd(this, flowDebounce, state, new Application());
        C27589jxz.EZpvd(this, isConnected().AEQbTJ(), state, new Activity());
        C27589jxz.EZpvd(this, isConnected().OLrzqt(), state, new ActionBar());
        C27589jxz.EZpvd(this, isConnected().EZpvd(), state, new FragmentManager());
        getChildFragmentManager().setFragmentResultListener("result.asset_details", this, new FragmentResultListener() { // from class: o.iXQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                DashboardFragment.AEQbTJ(this.OLrzqt, str, bundle2);
            }
        });
        C27589jxz.EZpvd(this, isConnected().copydefault(), state, new LoaderManager());
        C27589jxz.EZpvd(this, isConnected().KWHzl(), state, new Fragment());
        values();
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return OLrzqt(((Number) obj).longValue(), continuation);
        }

        public final Object OLrzqt(long j, Continuation<? super Unit> continuation) {
            DashboardFragment.this.values();
            return Unit.INSTANCE;
        }
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(DashboardListMode dashboardListMode, Continuation<? super Unit> continuation) {
            DashboardFragment.this.fIwbmz = true;
            DashboardFragment.this.AuCTel = true;
            DashboardFragment.this.values();
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC24202iYr interfaceC24202iYr, Continuation<? super Unit> continuation) {
            DashboardFragment.this.OLrzqt(interfaceC24202iYr);
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return copydefault(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            DashboardFragment.this.KWHzl(z);
            return Unit.INSTANCE;
        }
    }

    public static final void AEQbTJ(DashboardFragment dashboardFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        AssetDetailsResult assetDetailsResult = (AssetDetailsResult) bundle.getParcelable("result.asset_details");
        if (assetDetailsResult != null) {
            if (StateListAnimator.KWHzl[assetDetailsResult.copydefault().ordinal()] == 1) {
                dashboardFragment.values();
            }
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
            if (bool != null) {
                DashboardFragment dashboardFragment = DashboardFragment.this;
                dashboardFragment.KWHzl(dashboardFragment.isConnected().OLrzqt().getValue());
                return Unit.INSTANCE;
            }
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
        public final Object emit(C24207iYw c24207iYw, Continuation<? super Unit> continuation) {
            if (c24207iYw != null) {
                DashboardFragment.this.AEQbTJ(c24207iYw);
            }
            return Unit.INSTANCE;
        }
    }

    private final void AuCTel() {
        C23745iHt c23745iHtGEmmrt = gEmmrt();
        NestedScrollView nestedScrollView = c23745iHtGEmmrt.copydefault;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(0);
        C55173xeu c55173xeu = c23745iHtGEmmrt.OLrzqt;
        String string = c55173xeu.getContext().getString(C25493ixk.FragmentManager.pauseLocationServices);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setSubTitle((CharSequence) string);
        c23745iHtGEmmrt.OLrzqt.AEQbTJ().setOKDSType(260);
        c23745iHtGEmmrt.OLrzqt.AEQbTJ().setVisibility(C24193iYi.OLrzqt.AEQbTJ() ^ true ? 0 : 8);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.iXO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DashboardFragment.EZpvd(this.AEQbTJ, view);
            }
        });
        RecyclerView recyclerView = c23745iHtGEmmrt.EZpvd;
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(AYXKKw());
        Context context = getContext();
        if (context != null) {
            int iOLrzqt = C55302xhQ.OLrzqt(context);
            C55113xdn c55113xdn = c23745iHtGEmmrt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            ViewGroup.LayoutParams layoutParams = c55113xdn.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = (int) ((((double) iOLrzqt) * 620.0d) / 375.0d);
                c55113xdn.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        c23745iHtGEmmrt.AEQbTJ.setAnimation(C33492mxV.OLrzqt() ? "invest_dashboard_loading_dark.lottie" : "invest_dashboard_loading.lottie");
    }

    public static final void EZpvd(DashboardFragment dashboardFragment, View view) {
        dashboardFragment.AkhnZx();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xdn.showLoading$default(o.xdn, long, int, java.lang.Object):void */
    public final void OLrzqt(InterfaceC24202iYr interfaceC24202iYr) {
        C23745iHt c23745iHtGEmmrt = gEmmrt();
        if (!(interfaceC24202iYr instanceof InterfaceC24202iYr.TaskDescription) && !(interfaceC24202iYr instanceof InterfaceC24202iYr.Fragment) && !(interfaceC24202iYr instanceof InterfaceC24202iYr.LoaderManager)) {
            boolean z = interfaceC24202iYr instanceof InterfaceC24202iYr.StateListAnimator;
            boolean z2 = true;
            boolean z3 = z && (this.fetchVPNInfo || this.fIwbmz);
            NestedScrollView nestedScrollView = c23745iHtGEmmrt.copydefault;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
            nestedScrollView.setVisibility((z3 || (interfaceC24202iYr instanceof InterfaceC24202iYr.Application) || (interfaceC24202iYr instanceof InterfaceC24202iYr.ActionBar) || (interfaceC24202iYr instanceof InterfaceC24202iYr.Activity)) ? 0 : 8);
            if (!z) {
                this.fetchVPNInfo = false;
                if (this.AuCTel) {
                    this.AuCTel = false;
                } else {
                    this.fIwbmz = false;
                }
                boolean z4 = interfaceC24202iYr instanceof InterfaceC24202iYr.Application;
                if (z4) {
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (String) null, 2, (Object) null);
                }
                boolean z5 = interfaceC24202iYr instanceof InterfaceC24202iYr.ActionBar;
                if (z5) {
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (String) null, 2, (Object) null);
                }
                if (!z5 && !z4 && !(interfaceC24202iYr instanceof InterfaceC24202iYr.Activity)) {
                    z2 = false;
                }
                c23745iHtGEmmrt.AEQbTJ.pauseAnimation();
                c23745iHtGEmmrt.AEQbTJ.copydefault();
                C55113xdn c55113xdn = c23745iHtGEmmrt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(8);
                C55173xeu c55173xeu = c23745iHtGEmmrt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(z2 ? 0 : 8);
                return;
            }
            if (z3) {
                this.AuCTel = false;
                C55113xdn c55113xdn2 = c23745iHtGEmmrt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(0);
                C55113xdn.showLoading$default(c23745iHtGEmmrt.AEQbTJ, 0L, 1, null);
                c23745iHtGEmmrt.AEQbTJ.playAnimation();
                C55173xeu c55173xeu2 = c23745iHtGEmmrt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(8);
                return;
            }
            if (!this.AuCTel) {
                this.fIwbmz = false;
            }
            c23745iHtGEmmrt.AEQbTJ.pauseAnimation();
            c23745iHtGEmmrt.AEQbTJ.copydefault();
            C55113xdn c55113xdn3 = c23745iHtGEmmrt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
            c55113xdn3.setVisibility(8);
            NestedScrollView nestedScrollView2 = c23745iHtGEmmrt.copydefault;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
            nestedScrollView2.setVisibility(8);
            C55173xeu c55173xeu3 = c23745iHtGEmmrt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
            c55173xeu3.setVisibility(8);
            return;
        }
        this.fetchVPNInfo = false;
        if (this.AuCTel) {
            this.AuCTel = false;
        } else {
            this.fIwbmz = false;
        }
        KWHzl(interfaceC24202iYr);
    }

    public final void KWHzl(InterfaceC24202iYr interfaceC24202iYr) {
        final C23745iHt c23745iHtGEmmrt = gEmmrt();
        final Function0 function0 = new Function0() { // from class: o.iXT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DashboardFragment.EZpvd(c23745iHtGEmmrt);
            }
        };
        if (interfaceC24202iYr instanceof InterfaceC24202iYr.TaskDescription) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (String) null, 2, (Object) null);
            EZpvd((InterfaceC24202iYr.TaskDescription) interfaceC24202iYr, new Function0() { // from class: o.iXW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DashboardFragment.valueOf(function0);
                }
            });
        } else if (interfaceC24202iYr instanceof InterfaceC24202iYr.Fragment) {
            OLrzqt((InterfaceC24202iYr.Fragment) interfaceC24202iYr, new Function0() { // from class: o.iXZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DashboardFragment.AhwBna(function0);
                }
            });
        } else if (interfaceC24202iYr instanceof InterfaceC24202iYr.LoaderManager) {
            AEQbTJ((InterfaceC24202iYr.LoaderManager) interfaceC24202iYr, new Function0() { // from class: o.iYa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DashboardFragment.djBIcL(function0);
                }
            });
        }
    }

    public static final Unit EZpvd(final C23745iHt c23745iHt) {
        c23745iHt.EZpvd.postDelayed(new Runnable() { // from class: o.iXJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DashboardFragment.OLrzqt(c23745iHt);
            }
        }, 100L);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C23745iHt c23745iHt) {
        c23745iHt.AEQbTJ.pauseAnimation();
        c23745iHt.AEQbTJ.copydefault();
        C55113xdn c55113xdn = c23745iHt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
        NestedScrollView nestedScrollView = c23745iHt.copydefault;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(8);
    }

    public static final Unit valueOf(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void renderDashboard$default(DashboardFragment dashboardFragment, InterfaceC24202iYr.TaskDescription taskDescription, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        dashboardFragment.EZpvd(taskDescription, (Function0<Unit>) function0);
    }

    public final void EZpvd(InterfaceC24202iYr.TaskDescription taskDescription, final Function0<Unit> function0) {
        gEmmrt().EZpvd.setAdapter(AYXKKw());
        AEQbTJ(taskDescription.KWHzl().EZpvd(), new Function0() { // from class: o.iXX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DashboardFragment.gEmmrt(function0);
            }
        });
    }

    public static final Unit gEmmrt(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void renderTokenDashboard$default(DashboardFragment dashboardFragment, InterfaceC24202iYr.Fragment fragment, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        dashboardFragment.OLrzqt(fragment, (Function0<Unit>) function0);
    }

    public final void OLrzqt(InterfaceC24202iYr.Fragment fragment, final Function0<Unit> function0) {
        gEmmrt().EZpvd.setAdapter(AYXKKw());
        AYXKKw().EZpvd(fragment.OLrzqt(), new Function0() { // from class: o.iYb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DashboardFragment.DbNXlk(function0);
            }
        });
    }

    public static final Unit DbNXlk(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void renderRecommendDashboard$default(DashboardFragment dashboardFragment, InterfaceC24202iYr.LoaderManager loaderManager, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        dashboardFragment.AEQbTJ(loaderManager, (Function0<Unit>) function0);
    }

    public final void AEQbTJ(InterfaceC24202iYr.LoaderManager loaderManager, final Function0<Unit> function0) {
        gEmmrt().EZpvd.setAdapter(djBIcL());
        djBIcL().EZpvd(loaderManager.copydefault().KWHzl(), new Function0() { // from class: o.iXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DashboardFragment.fetchVPNInfo(function0);
            }
        });
    }

    public static final Unit fetchVPNInfo(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(long j, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DashboardFragment$startRecommendInvestFlow$1(this, j, z, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setProtocols$default(DashboardFragment dashboardFragment, List list, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        dashboardFragment.AEQbTJ((List<? extends InterfaceC27436jvE>) list, (Function0<Unit>) function0);
    }

    public final void AEQbTJ(List<? extends InterfaceC27436jvE> list, Function0<Unit> function0) {
        InterfaceC27436jvE interfaceC27436jvEPrevious;
        RecyclerView.LayoutManager layoutManager = gEmmrt().EZpvd.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int i = 0;
        int iCopydefault = C56548yJl.copydefault(C56548yJl.valueOf(linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0, this.AhwBna.size() - 1), 0);
        Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(this.AhwBna, iCopydefault);
        C27369jtr c27369jtr = objAkhnZx instanceof C27369jtr ? (C27369jtr) objAkhnZx : null;
        if (c27369jtr == null) {
            List<InterfaceC27436jvE> listSubList = this.AhwBna.subList(0, iCopydefault);
            ListIterator<InterfaceC27436jvE> listIterator = listSubList.listIterator(listSubList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    interfaceC27436jvEPrevious = listIterator.previous();
                    if (interfaceC27436jvEPrevious instanceof C27369jtr) {
                        break;
                    }
                } else {
                    interfaceC27436jvEPrevious = null;
                    break;
                }
            }
            InterfaceC27436jvE interfaceC27436jvE = interfaceC27436jvEPrevious;
            c27369jtr = interfaceC27436jvE != null ? (C27369jtr) interfaceC27436jvE : null;
        }
        this.AhwBna.clear();
        this.fARcdN.clear();
        for (InterfaceC27436jvE interfaceC27436jvE2 : list) {
            this.AhwBna.add(interfaceC27436jvE2);
            if (interfaceC27436jvE2 instanceof C27369jtr) {
                C27369jtr c27369jtr2 = (C27369jtr) interfaceC27436jvE2;
                if (c27369jtr2.AkhnZx() && (c27369jtr2.OLrzqt() instanceof iZU.Activity)) {
                    List<InterfaceC27436jvE> listKWHzl = KWHzl(((iZU.Activity) c27369jtr2.OLrzqt()).OLrzqt());
                    this.fARcdN.put((C27369jtr) interfaceC27436jvE2, Integer.valueOf(listKWHzl.size()));
                    this.AhwBna.addAll(listKWHzl);
                }
            }
        }
        AYXKKw().EZpvd(this.AhwBna, function0);
        Unit unit = Unit.INSTANCE;
        scrollRecyclerViewInternally$default(this, 0, 1, null);
        final Ref.IntRef intRef = new Ref.IntRef();
        if (c27369jtr != null) {
            Iterator<InterfaceC27436jvE> it = this.AhwBna.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                InterfaceC27436jvE next = it.next();
                C27369jtr c27369jtr3 = next instanceof C27369jtr ? (C27369jtr) next : null;
                if (c27369jtr3 != null && c27369jtr3.gEmmrt() == c27369jtr.gEmmrt() && ((C27369jtr) next).copydefault() == c27369jtr.copydefault()) {
                    break;
                } else {
                    i++;
                }
            }
            intRef.element = i;
        }
        gEmmrt().EZpvd.post(new Runnable() { // from class: o.iYd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DashboardFragment.OLrzqt(this.copydefault, intRef);
            }
        });
    }

    public static final void OLrzqt(DashboardFragment dashboardFragment, Ref.IntRef intRef) {
        if (dashboardFragment.isAdded() && dashboardFragment.getView() != null && dashboardFragment.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            dashboardFragment.gEmmrt().EZpvd.scrollToPosition(intRef.element);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jtr.copy$default(o.jtr, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, o.iZU, boolean, java.lang.String, java.lang.String, int, java.lang.Object):o.jtr */
    public final void AEQbTJ(C24207iYw c24207iYw) {
        List<?> items = AYXKKw().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        Iterator<?> it = items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (next instanceof C27369jtr) {
                C27369jtr c27369jtr = (C27369jtr) next;
                if (c27369jtr.gEmmrt() == c24207iYw.EZpvd().gEmmrt() && c27369jtr.copydefault() == c24207iYw.EZpvd().copydefault()) {
                    break;
                }
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        Object obj = null;
        if (c24207iYw.EZpvd().OLrzqt() == null) {
            if (i >= AYXKKw().getItems().size() || i < 0) {
                return;
            }
            Object obj2 = AYXKKw().getItems().get(i);
            C27369jtr c27369jtr2 = obj2 instanceof C27369jtr ? (C27369jtr) obj2 : null;
            if (c27369jtr2 == null) {
                return;
            }
            final Long lValueOf = Long.valueOf(c27369jtr2.gEmmrt());
            final Long lValueOf2 = Long.valueOf(c27369jtr2.copydefault());
            Iterator<T> it2 = this.fARcdN.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Map.Entry entry = (Map.Entry) next2;
                long jGEmmrt = ((C27369jtr) entry.getKey()).gEmmrt();
                if (lValueOf != null && jGEmmrt == lValueOf.longValue()) {
                    long jCopydefault = ((C27369jtr) entry.getKey()).copydefault();
                    if (lValueOf2 != null && jCopydefault == lValueOf2.longValue()) {
                        obj = next2;
                        break;
                    }
                }
            }
            Map.Entry entry2 = (Map.Entry) obj;
            int iIntValue = (entry2 != null ? ((Number) entry2.getValue()).intValue() : 0) + i;
            if (iIntValue < i) {
                return;
            }
            Set<Map.Entry<C27369jtr, Integer>> setEntrySet = this.fARcdN.entrySet();
            final Function1 function1 = new Function1() { // from class: o.iXR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(DashboardFragment.OLrzqt(lValueOf, lValueOf2, (Map.Entry) obj3));
                }
            };
            setEntrySet.removeIf(new Predicate() { // from class: o.iXS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj3) {
                    return DashboardFragment.EZpvd(function1, obj3);
                }
            });
            if (i == iIntValue) {
                AYXKKw().KWHzl(i, c24207iYw.EZpvd());
            } else {
                AYXKKw().OLrzqt(i + 1, iIntValue - i, Integer.valueOf(i), c27369jtr2.KWHzl((15871 & 1) != 0 ? c27369jtr2.djBIcL : 0L, (15871 & 2) != 0 ? c27369jtr2.KWHzl : 0L, (15871 & 4) != 0 ? c27369jtr2.AYXKKw : null, (15871 & 8) != 0 ? c27369jtr2.gEmmrt : null, (15871 & 16) != 0 ? c27369jtr2.values : null, (15871 & 32) != 0 ? c27369jtr2.OLrzqt : null, (15871 & 64) != 0 ? c27369jtr2.valueOf : null, (15871 & 128) != 0 ? c27369jtr2.AhwBna : null, (15871 & 256) != 0 ? c27369jtr2.AkhnZx : null, (15871 & 512) != 0 ? c27369jtr2.AEQbTJ : c24207iYw.EZpvd().AkhnZx(), (15871 & 1024) != 0 ? c27369jtr2.EZpvd : null, (15871 & 2048) != 0 ? c27369jtr2.copydefault : false, (15871 & 4096) != 0 ? c27369jtr2.isConnected : null, (15871 & 8192) != 0 ? c27369jtr2.fetchVPNInfo : null));
            }
        } else {
            if ((c24207iYw.EZpvd().OLrzqt() instanceof iZU.Application) || (c24207iYw.EZpvd().OLrzqt() instanceof iZU.TaskDescription)) {
                AYXKKw().KWHzl(i, c24207iYw.EZpvd());
                return;
            }
            Object obj3 = AYXKKw().getItems().get(i);
            C27369jtr c27369jtr3 = obj3 instanceof C27369jtr ? (C27369jtr) obj3 : null;
            if (c27369jtr3 == null) {
                return;
            }
            if ((c24207iYw.EZpvd().OLrzqt() instanceof iZU.Activity) && (c27369jtr3.AkhnZx() || c24207iYw.AEQbTJ())) {
                Iterator<T> it3 = this.fARcdN.entrySet().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    Map.Entry entry3 = (Map.Entry) next3;
                    if (((C27369jtr) entry3.getKey()).gEmmrt() == c24207iYw.EZpvd().gEmmrt() && ((C27369jtr) entry3.getKey()).copydefault() == c24207iYw.EZpvd().copydefault()) {
                        obj = next3;
                        break;
                    }
                }
                if (((Map.Entry) obj) != null) {
                    return;
                }
                List<InterfaceC27436jvE> listKWHzl = KWHzl(((iZU.Activity) c24207iYw.EZpvd().OLrzqt()).OLrzqt());
                this.fARcdN.put(c24207iYw.EZpvd(), Integer.valueOf(listKWHzl.size()));
                AYXKKw().copydefault(i + 1, listKWHzl, Integer.valueOf(i), c24207iYw.EZpvd());
            }
        }
        gEmmrt().EZpvd.post(new Runnable() { // from class: o.iXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DashboardFragment.scrollRecyclerViewInternally$default(this.AEQbTJ, 0, 1, null);
            }
        });
    }

    public static final boolean EZpvd(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean OLrzqt(Long l, Long l2, Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        long jGEmmrt = ((C27369jtr) entry.getKey()).gEmmrt();
        if (l != null && jGEmmrt == l.longValue()) {
            long jCopydefault = ((C27369jtr) entry.getKey()).copydefault();
            if (l2 != null && jCopydefault == l2.longValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC27436jvE> KWHzl(iDV idv) {
        ArrayList arrayList = new ArrayList();
        byte b = idv.EZpvd() != null && (idv.KWHzl().isEmpty() ^ true);
        byte b2 = idv.AEQbTJ() != null && (idv.copydefault().isEmpty() ^ true);
        boolean z = idv.OLrzqt() != null && (idv.OLrzqt().copydefault().isEmpty() ^ true) && C33129mqd.OLrzqt((CharSequence) idv.OLrzqt().EZpvd()) && C33129mqd.OLrzqt((CharSequence) idv.OLrzqt().KWHzl());
        int i = 3;
        float f = 0.0f;
        Orientation orientation = null;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if (b != false) {
            C27376jty c27376jtyEZpvd = idv.EZpvd();
            Intrinsics.copydefault(c27376jtyEZpvd);
            arrayList.add(c27376jtyEZpvd);
            arrayList.addAll(idv.KWHzl());
            if (b2 != false) {
                arrayList.add(new C27433jvB(8.0f));
                arrayList.add(new C27437jvF(f, orientation, i, b5 == true ? 1 : 0));
                arrayList.add(new C27433jvB(8.0f));
            }
        }
        if (b2 != false) {
            C27376jty c27376jtyAEQbTJ = idv.AEQbTJ();
            Intrinsics.copydefault(c27376jtyAEQbTJ);
            arrayList.add(c27376jtyAEQbTJ);
            arrayList.addAll(idv.copydefault());
            if (z) {
                arrayList.add(new C27433jvB(8.0f));
                arrayList.add(new C27437jvF(f, b4 == true ? 1 : 0, i, b3 == true ? 1 : 0));
                arrayList.add(new C27433jvB(8.0f));
            }
        }
        if (z) {
            C27373jtv c27373jtvOLrzqt = idv.OLrzqt();
            Intrinsics.copydefault(c27373jtvOLrzqt);
            arrayList.add(c27373jtvOLrzqt);
        }
        return arrayList;
    }

    public final void values() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DashboardFragment$refreshDashBoard$1(this, null), 3, null);
    }

    public static /* synthetic */ void scrollRecyclerViewInternally$default(DashboardFragment dashboardFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        dashboardFragment.copydefault(i);
    }

    public final void copydefault(int i) {
        RecyclerView recyclerView = gEmmrt().EZpvd;
        recyclerView.suppressLayout(false);
        recyclerView.smoothScrollBy(0, i);
        recyclerView.smoothScrollBy(0, -i);
    }

    public final void KWHzl(InterfaceC27286jsN.PendingIntent pendingIntent) {
        List<?> items = AYXKKw().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        Iterator<?> it = items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (next instanceof C27369jtr) {
                C27369jtr c27369jtr = (C27369jtr) next;
                if (c27369jtr.gEmmrt() == pendingIntent.KWHzl() && c27369jtr.copydefault() == pendingIntent.copydefault()) {
                    break;
                }
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        Object obj = AYXKKw().getItems().get(i);
        Intrinsics.copydefault(obj, "");
        C27369jtr c27369jtr2 = (C27369jtr) obj;
        isConnected().OLrzqt(i, c27369jtr2.KWHzl((15871 & 1) != 0 ? c27369jtr2.djBIcL : 0L, (15871 & 2) != 0 ? c27369jtr2.KWHzl : 0L, (15871 & 4) != 0 ? c27369jtr2.AYXKKw : null, (15871 & 8) != 0 ? c27369jtr2.gEmmrt : null, (15871 & 16) != 0 ? c27369jtr2.values : null, (15871 & 32) != 0 ? c27369jtr2.OLrzqt : null, (15871 & 64) != 0 ? c27369jtr2.valueOf : null, (15871 & 128) != 0 ? c27369jtr2.AhwBna : null, (15871 & 256) != 0 ? c27369jtr2.AkhnZx : null, (15871 & 512) != 0 ? c27369jtr2.AEQbTJ : pendingIntent.OLrzqt(), (15871 & 1024) != 0 ? c27369jtr2.EZpvd : null, (15871 & 2048) != 0 ? c27369jtr2.copydefault : false, (15871 & 4096) != 0 ? c27369jtr2.isConnected : null, (15871 & 8192) != 0 ? c27369jtr2.fetchVPNInfo : null));
    }

    public final void AkhnZx() {
        OLrzqt(InterfaceC27286jsN.Activity.KWHzl);
    }

    public final void KWHzl(boolean z) {
        C25428iwY c25428iwY = new C25428iwY(z, false, new Function0() { // from class: o.iXY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DashboardFragment.ejfBZ(this.AEQbTJ);
            }
        });
        this.djBIcL = c25428iwY;
        Function1<? super C25428iwY, Unit> function1 = this.getNewProxyInstance;
        if (function1 != null) {
            function1.invoke(c25428iwY);
        }
    }

    public static final Unit ejfBZ(final DashboardFragment dashboardFragment) {
        if (!dashboardFragment.isAdded() || dashboardFragment.isStateSaved()) {
            return Unit.INSTANCE;
        }
        C25428iwY c25428iwYCopy$default = C25428iwY.copy$default(dashboardFragment.djBIcL, false, true, null, 5, null);
        dashboardFragment.djBIcL = c25428iwYCopy$default;
        Function1<? super C25428iwY, Unit> function1 = dashboardFragment.getNewProxyInstance;
        if (function1 != null) {
            function1.invoke(c25428iwYCopy$default);
        }
        C24195iYk c24195iYk = new C24195iYk();
        c24195iYk.OLrzqt(dashboardFragment.isConnected().AEQbTJ().getValue());
        c24195iYk.copydefault(new Function1() { // from class: o.iYc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DashboardFragment.KWHzl(this.AEQbTJ, (DashboardListMode) obj);
            }
        });
        c24195iYk.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.iYg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                DashboardFragment.AEQbTJ(this.copydefault, dialogInterface);
            }
        });
        c24195iYk.show(dashboardFragment.getChildFragmentManager(), "DashboardModeSelection");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(DashboardFragment dashboardFragment, DashboardListMode dashboardListMode) {
        Intrinsics.checkNotNullParameter(dashboardListMode, "");
        dashboardFragment.isConnected().KWHzl(dashboardListMode);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(DashboardFragment dashboardFragment, DialogInterface dialogInterface) {
        C25428iwY c25428iwYCopy$default = C25428iwY.copy$default(dashboardFragment.djBIcL, false, false, null, 5, null);
        dashboardFragment.djBIcL = c25428iwYCopy$default;
        Function1<? super C25428iwY, Unit> function1 = dashboardFragment.getNewProxyInstance;
        if (function1 != null) {
            function1.invoke(c25428iwYCopy$default);
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

    public final void EZpvd(long j, long j2, String str, String str2, List<DashboardInvestmentInfo> list) {
        String strCopydefault = C23580iBq.AEQbTJ.copydefault();
        if (strCopydefault.length() == 0) {
            pUU.copydefault("DashboardClickHandlerImpl", "Failed to get accountId");
            return;
        }
        C24214iZc c24214iZcOLrzqt = C24214iZc.Companion.OLrzqt(new DeFiDashboardAssetDetailParams.DeFiTokenModelAssetDetailParams(strCopydefault, j2, j, str, str2, list), this.gEmmrt, this.AYXKKw);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c24214iZcOLrzqt.show(childFragmentManager);
    }

    public final void AEQbTJ(InvestedToken investedToken, String str, String str2, long j) {
        if (C23580iBq.AEQbTJ.copydefault().length() == 0) {
            pUU.copydefault("DashboardClickHandlerImpl", "Failed to get accountId");
            return;
        }
        C24214iZc c24214iZcOLrzqt = C24214iZc.Companion.OLrzqt(new DeFiDashboardAssetDetailParams.DeFiProtocolModelAssetDetailParams(investedToken, str, str2, j), this.gEmmrt, this.AYXKKw);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c24214iZcOLrzqt.show(childFragmentManager);
    }
}
