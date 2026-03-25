package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.invest_biz.data.usecase.DexEntranceProductQuery;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceFrgParam;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceSortOrder;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceSortType;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceVM;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25493ixk;
import o.C27189jqW;
import o.InterfaceC26619jfj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jbl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26409jbl extends AbstractC26408jbk implements InterfaceC26465jco {
    public final java.util.List<iWX> AYXKKw;
    public C26344jaZ DbNXlk;
    public final yIP gEmmrt = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm isConnected;
    public C27189jqW valueOf;
    public final StateListAnimator values;
    public static final /* synthetic */ yJA<java.lang.Object>[] djBIcL = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C26409jbl.class, "mBinding", "getMBinding()Lcom/okinc/business/invest_biz/databinding/FragmentDexEntranceLayoutBinding;", 0))};
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26465jco
    public java.lang.String AYXKKw() {
        return "dexentrance";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.AubY;
    }

    public C26409jbl() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.InvestDexEntranceFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.InvestDexEntranceFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexEntranceVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.InvestDexEntranceFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.InvestDexEntranceFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.InvestDexEntranceFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = new java.util.ArrayList();
        this.values = new StateListAnimator();
    }

    public final void EZpvd(C23746iHu c23746iHu) {
        this.gEmmrt.KWHzl(this, djBIcL[0], c23746iHu);
    }

    /* JADX DEBUG: Possible override for method o.jbk.OLrzqt()V */
    public final C23746iHu OLrzqt() {
        return (C23746iHu) this.gEmmrt.getValue(this, djBIcL[0]);
    }

    public final DexEntranceVM gEmmrt() {
        return (DexEntranceVM) this.isConnected.getValue();
    }

    /* JADX INFO: renamed from: o.jbl$StateListAnimator */
    public static final class StateListAnimator extends ViewPager2.OnPageChangeCallback {
        public StateListAnimator() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            C26344jaZ c26344jaZ = C26409jbl.this.DbNXlk;
            if ((c26344jaZ != null ? c26344jaZ.getItemCount() : 0) <= i || !C33129mqd.KWHzl((java.util.Collection) C26409jbl.this.AYXKKw)) {
                return;
            }
            C26409jbl.this.gEmmrt().EZpvd(C26409jbl.this.djBIcL(), ((iWX) C26409jbl.this.AYXKKw.get(i)).OLrzqt());
        }
    }

    public final long djBIcL() {
        DexEntranceFrgParam dexEntranceFrgParam;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (dexEntranceFrgParam = (DexEntranceFrgParam) arguments.getParcelable("key.args")) == null) {
            return -1L;
        }
        return dexEntranceFrgParam.AEQbTJ();
    }

    private final java.lang.String valueOf() {
        DexEntranceFrgParam dexEntranceFrgParam;
        java.lang.String strKWHzl;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (dexEntranceFrgParam = (DexEntranceFrgParam) arguments.getParcelable("key.args")) == null || (strKWHzl = dexEntranceFrgParam.KWHzl()) == null) ? "" : strKWHzl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt().AEQbTJ(djBIcL(), valueOf());
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd(C23746iHu.AEQbTJ(view));
        AEQbTJ(OLrzqt());
        values();
        OLrzqt().AEQbTJ.OLrzqt(new InterfaceC57903yrG() { // from class: o.jbm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C26409jbl.copydefault(this.EZpvd, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(C26409jbl c26409jbl, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c26409jbl.gEmmrt().AEQbTJ(c26409jbl.djBIcL(), c26409jbl.valueOf());
    }

    public final void AEQbTJ(C23746iHu c23746iHu) {
        C26344jaZ c26344jaZ = new C26344jaZ(this);
        this.DbNXlk = c26344jaZ;
        c23746iHu.AYXKKw.setAdapter(c26344jaZ);
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        ViewPager2 viewPager2 = c23746iHu.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        c27569jxf.EZpvd(viewPager2);
    }

    /* JADX INFO: renamed from: o.jbl$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26619jfj interfaceC26619jfj, Continuation<? super Unit> continuation) {
            C26409jbl c26409jbl = C26409jbl.this;
            c26409jbl.KWHzl(c26409jbl.OLrzqt(), interfaceC26619jfj);
            C26409jbl.this.OLrzqt().AEQbTJ.AEQbTJ();
            return Unit.INSTANCE;
        }
    }

    private final void values() {
        C27589jxz.EZpvd(this, gEmmrt().copydefault(), Lifecycle.State.CREATED, new Activity());
    }

    public final void KWHzl(C23746iHu c23746iHu, InterfaceC26619jfj interfaceC26619jfj) {
        if (interfaceC26619jfj instanceof InterfaceC26619jfj.TaskDescription) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            InterfaceC26619jfj.TaskDescription taskDescription = (InterfaceC26619jfj.TaskDescription) interfaceC26619jfj;
            java.util.List<iWX> listAEQbTJ = taskDescription.AEQbTJ();
            java.util.ArrayList<iWX> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ) {
                if (((iWX) obj).copydefault() > 0) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (iWX iwx : arrayList2) {
                arrayList3.add(new DexEntranceProductQuery(C33129mqd.AhwBna(iwx.EZpvd()), djBIcL(), valueOf(), null, DexEntranceSortType.RATE.getValue(), DexEntranceSortOrder.DESC.getValue(), java.lang.Boolean.TRUE, iwx.OLrzqt(), 8, null));
            }
            arrayList.addAll(arrayList3);
            C26344jaZ c26344jaZ = this.DbNXlk;
            if (c26344jaZ != null) {
                c26344jaZ.AEQbTJ(arrayList);
            }
            java.util.List<iWX> listAEQbTJ2 = taskDescription.AEQbTJ();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : listAEQbTJ2) {
                if (((iWX) obj2).copydefault() > 0) {
                    arrayList4.add(obj2);
                }
            }
            AEQbTJ(c23746iHu, arrayList4);
        } else if (interfaceC26619jfj instanceof InterfaceC26619jfj.StateListAnimator) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        EZpvd(c23746iHu, interfaceC26619jfj);
    }

    public final void EZpvd(C23746iHu c23746iHu, InterfaceC26619jfj interfaceC26619jfj) {
        C55173xeu c55173xeu = c23746iHu.OLrzqt;
        Intrinsics.copydefault(c55173xeu);
        boolean z = interfaceC26619jfj instanceof InterfaceC26619jfj.StateListAnimator;
        c55173xeu.setVisibility((z || ((interfaceC26619jfj instanceof InterfaceC26619jfj.TaskDescription) && ((InterfaceC26619jfj.TaskDescription) interfaceC26619jfj).AEQbTJ().isEmpty())) ? 0 : 8);
        c55173xeu.setEmptyTypeImage(copydefault(interfaceC26619jfj));
        c55173xeu.setTitle(OLrzqt(interfaceC26619jfj));
        java.lang.String string = z ? getString(C25493ixk.FragmentManager.AEQbTJ) : "";
        Intrinsics.copydefault((java.lang.Object) string);
        c55173xeu.setRetry(string);
        if (interfaceC26619jfj instanceof InterfaceC26619jfj.Application) {
            c23746iHu.valueOf.KWHzl(0L);
        } else {
            c23746iHu.valueOf.copydefault();
        }
    }

    public final void AEQbTJ(C23746iHu c23746iHu, final java.util.List<iWX> list) {
        if (list.isEmpty()) {
            return;
        }
        C55244xgL c55244xgL = c23746iHu.copydefault;
        this.AYXKKw.clear();
        this.AYXKKw.addAll(list);
        c23746iHu.AYXKKw.setOffscreenPageLimit(list.size());
        C27189jqW c27189jqW = this.valueOf;
        if (c27189jqW != null) {
            c27189jqW.copydefault();
        }
        c23746iHu.AYXKKw.unregisterOnPageChangeCallback(this.values);
        c23746iHu.AYXKKw.registerOnPageChangeCallback(this.values);
        C27189jqW c27189jqW2 = new C27189jqW(c55244xgL.AYXKKw(), c23746iHu.AYXKKw, false, true, new C27189jqW.Activity() { // from class: o.jbi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C27189jqW.Activity
            public final void KWHzl(TabLayout.Tab tab, int i) {
                C26409jbl.copydefault(list, tab, i);
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
        if (selectedTabPosition >= 0 && selectedTabPosition < list.size() && list.get(selectedTabPosition).copydefault() <= 0 && i != -1) {
            c55244xgL.AYXKKw().selectTab(c55244xgL.KWHzl(i));
        }
        c23746iHu.AYXKKw.setCurrentItem(0);
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            gEmmrt().OLrzqt(djBIcL(), list.get(0).OLrzqt());
        }
    }

    public static final void copydefault(java.util.List list, TabLayout.Tab tab, int i) {
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

    public final int copydefault(InterfaceC26619jfj interfaceC26619jfj) {
        return interfaceC26619jfj instanceof InterfaceC26619jfj.StateListAnimator ? 8 : 7;
    }

    public final java.lang.String OLrzqt(InterfaceC26619jfj interfaceC26619jfj) {
        if (interfaceC26619jfj instanceof InterfaceC26619jfj.StateListAnimator) {
            return C43422row.OLrzqt();
        }
        java.lang.String string = getString(C25493ixk.FragmentManager.DcMfJKRKUgwx);
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C27189jqW c27189jqW = this.valueOf;
        if (c27189jqW != null) {
            c27189jqW.copydefault();
        }
    }

    /* JADX INFO: renamed from: o.jbl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jbl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C26409jbl OLrzqt(@NotNull DexEntranceFrgParam dexEntranceFrgParam) {
            Intrinsics.checkNotNullParameter(dexEntranceFrgParam, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.args", dexEntranceFrgParam);
            C26409jbl c26409jbl = new C26409jbl();
            c26409jbl.setArguments(bundle);
            return c26409jbl;
        }
    }

    @Override // o.InterfaceC26465jco
    public Flow<Unit> DbNXlk() {
        return FlowKt.emptyFlow();
    }

    @Override // o.InterfaceC26465jco
    public Flow<C55276xgr> AhwBna() {
        return StateFlowKt.MutableStateFlow(null);
    }

    @Override // o.InterfaceC26465jco
    public void EZpvd(C55276xgr c55276xgr) {
        gEmmrt().OLrzqt(c55276xgr);
    }
}
