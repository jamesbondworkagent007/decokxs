package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.Constants;
import com.okinc.business.invest_biz.data.usecase.V2ProductQuery;
import com.okinc.business.invest_biz.ui.screens.aggregate.AggregateProductListVM;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C25493ixk;
import o.C27189jqW;
import o.C32113mPz;
import o.C52761wXj;
import o.iWU;
import o.iWV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iWF extends iWW implements InterfaceC26465jco {
    public final InterfaceC56387yDm AYXKKw;
    public C27189jqW AhwBna;
    public final Activity AkhnZx;
    public final yIP KWHzl = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm OLrzqt;
    public boolean copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;
    public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(iWF.class, "mBinding", "getMBinding()Lcom/okinc/business/invest_biz/databinding/FragmentAggregateProductListBinding;", 0))};
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.getFieldNames;
    }

    public iWF() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.aggregate.AggregateProductListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.aggregate.AggregateProductListFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AggregateProductListVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.aggregate.AggregateProductListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.aggregate.AggregateProductListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.aggregate.AggregateProductListFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.iWC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(iWF.AYXKKw(this.OLrzqt));
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.iWD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iWF.djBIcL(this.EZpvd);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.iWE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iWF.fetchVPNInfo(this.EZpvd);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.iWI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iWF.gEmmrt(this.EZpvd);
            }
        });
        this.AkhnZx = new Activity();
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.iWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iWF.values(this.OLrzqt);
            }
        });
    }

    public final C23742iHq OLrzqt() {
        return (C23742iHq) this.KWHzl.getValue(this, EZpvd[0]);
    }

    public final void OLrzqt(C23742iHq c23742iHq) {
        this.KWHzl.KWHzl(this, EZpvd[0], c23742iHq);
    }

    public final AggregateProductListVM valueOf() {
        return (AggregateProductListVM) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Possible override for method o.iWW.KWHzl()V */
    public final int KWHzl() {
        return ((java.lang.Number) this.gEmmrt.getValue()).intValue();
    }

    public static final int AYXKKw(iWF iwf) {
        android.content.Intent intent;
        FragmentActivity activity = iwf.getActivity();
        return C33129mqd.AhwBna((activity == null || (intent = activity.getIntent()) == null) ? null : java.lang.Integer.valueOf(intent.getIntExtra("aggregate_tab_id", 0)));
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String djBIcL(iWF iwf) {
        android.content.Intent intent;
        FragmentActivity activity = iwf.getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return intent.getStringExtra("aggregate_item_key");
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String fetchVPNInfo(iWF iwf) {
        android.content.Intent intent;
        FragmentActivity activity = iwf.getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return intent.getStringExtra("aggregate_token_amount");
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String gEmmrt(iWF iwf) {
        android.content.Intent intent;
        FragmentActivity activity = iwf.getActivity();
        return C33129mqd.gEmmrt((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("aggregate_source"));
    }

    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            iWF.this.valueOf().copydefault(tab != null ? java.lang.Integer.valueOf(tab.getId()) : null);
        }
    }

    public static final C26466jcp values(iWF iwf) {
        return new C26466jcp(iwf);
    }

    public final C26466jcp djBIcL() {
        return (C26466jcp) this.values.getValue();
    }

    @Override // o.InterfaceC26465jco
    public Flow<Unit> DbNXlk() {
        return valueOf().EZpvd();
    }

    @Override // o.InterfaceC26465jco
    public java.lang.String AYXKKw() {
        java.lang.String strEZpvd = EZpvd();
        return strEZpvd.length() == 0 ? "newhomepagelist_secondary" : strEZpvd;
    }

    @Override // o.InterfaceC26465jco
    public Flow<C55276xgr> AhwBna() {
        return valueOf().AEQbTJ();
    }

    @Override // o.InterfaceC26465jco
    public void EZpvd(C55276xgr c55276xgr) {
        valueOf().AEQbTJ(c55276xgr);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        OLrzqt(C23742iHq.OLrzqt(view));
        C23742iHq c23742iHqOLrzqt = OLrzqt();
        EZpvd(c23742iHqOLrzqt);
        copydefault(c23742iHqOLrzqt);
        getDataFromApi$default(this, false, 1, null);
        values();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C27189jqW c27189jqW = this.AhwBna;
        if (c27189jqW != null) {
            c27189jqW.copydefault();
        }
    }

    public final void EZpvd(final C23742iHq c23742iHq) {
        c23742iHq.AhwBna.setExpandedTitleColor(0);
        c23742iHq.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.iWH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iWF.AEQbTJ(this.AEQbTJ, view);
            }
        });
        c23742iHq.DTwDnp.setAdapter(djBIcL());
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        ViewPager2 viewPager2 = c23742iHq.DTwDnp;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        c27569jxf.EZpvd(viewPager2);
        c23742iHq.AuCTelauCTel.OLrzqt(new InterfaceC57903yrG() { // from class: o.iWO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                iWF.KWHzl(this.copydefault, interfaceC57934yrl);
            }
        });
        c23742iHq.getFieldNames.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        c23742iHq.copydefault.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: o.iWP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                iWF.EZpvd(this.AEQbTJ, appBarLayout, i);
            }
        });
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
        ViewCompat.setOnApplyWindowInsetsListener(requireActivity().getWindow().getDecorView(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.iWB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return iWF.AEQbTJ(c23742iHq, view, windowInsetsCompat);
            }
        });
    }

    public static final void AEQbTJ(iWF iwf, android.view.View view) {
        FragmentActivity activity = iwf.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void KWHzl(iWF iwf, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        iwf.KWHzl(true);
    }

    public static final void EZpvd(iWF iwf, AppBarLayout appBarLayout, int i) {
        float fAbs = java.lang.Math.abs(i) / appBarLayout.getTotalScrollRange();
        iwf.OLrzqt(fAbs);
        if (fAbs == 0.0f) {
            iwf.copydefault(true);
        } else if (fAbs == 1.0f) {
            iwf.copydefault(false);
        }
    }

    public static final WindowInsetsCompat AEQbTJ(C23742iHq c23742iHq, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()), "");
        LinearLayoutCompat linearLayoutCompat = c23742iHq.AuCTel;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C33570myu.OLrzqt() + C55298xhM.dp2px$default(60.0f, null, 1, null);
            linearLayoutCompat.setLayoutParams(marginLayoutParams);
            androidx.appcompat.widget.Toolbar toolbar = c23742iHq.AxsJAY;
            Intrinsics.checkNotNullExpressionValue(toolbar, "");
            ViewGroup.LayoutParams layoutParams2 = toolbar.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = C33570myu.OLrzqt();
                toolbar.setLayoutParams(marginLayoutParams2);
                return windowInsetsCompat;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void copydefault(C23742iHq c23742iHq) {
        C55173xeu c55173xeu = c23742iHq.AYXKKw;
        java.lang.String string = getString(C25493ixk.FragmentManager.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setRetry(string);
        c55173xeu.setTitle(C43422row.OLrzqt());
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.iWK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iWF.KWHzl(this.OLrzqt, view);
            }
        });
    }

    public static final void KWHzl(iWF iwf, android.view.View view) {
        iwf.valueOf().KWHzl(iwf.KWHzl(), iwf.AEQbTJ(), iwf.gEmmrt());
    }

    public static /* synthetic */ void getDataFromApi$default(iWF iwf, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        iwf.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        if (z) {
            valueOf().copydefault();
            OLrzqt().AuCTelauCTel.AEQbTJ();
        } else {
            valueOf().KWHzl(KWHzl(), AEQbTJ(), gEmmrt());
        }
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iWU iwu, Continuation<? super Unit> continuation) {
            iWF iwf = iWF.this;
            iwf.KWHzl(iwf.OLrzqt(), iwu);
            return Unit.INSTANCE;
        }
    }

    private final void values() {
        StateFlow<iWU> stateFlowOLrzqt = valueOf().OLrzqt();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C27589jxz.EZpvd(this, stateFlowOLrzqt, state, new TaskDescription());
        C27589jxz.EZpvd(this, valueOf().KWHzl(), state, new Application());
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iWV iwv, Continuation<? super Unit> continuation) {
            iWF iwf = iWF.this;
            iwf.OLrzqt(iwf.OLrzqt(), iwv);
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(C23742iHq c23742iHq, iWU iwu) {
        C55173xeu c55173xeu = c23742iHq.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(iwu instanceof iWU.TaskDescription ? 0 : 8);
        if (Intrinsics.EZpvd(iwu, iWU.Application.EZpvd)) {
            C55113xdn.showLoading$default(c23742iHq.uzCIH, 0L, 1, null);
            c23742iHq.AuCTelauCTel.AEQbTJ();
            return;
        }
        if (iwu instanceof iWU.Activity) {
            c23742iHq.uzCIH.copydefault();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            iWU.Activity activity = (iWU.Activity) iwu;
            KWHzl(c23742iHq, activity.OLrzqt());
            iWS iwsCopydefault = activity.OLrzqt().copydefault();
            if (iwsCopydefault != null) {
                LinearLayoutCompat linearLayoutCompat = c23742iHq.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                linearLayoutCompat.setVisibility(0);
                KWHzl(c23742iHq, iwsCopydefault);
            }
            iWZ iwzEZpvd = activity.OLrzqt().EZpvd();
            if (iwzEZpvd != null) {
                LinearLayoutCompat linearLayoutCompat2 = c23742iHq.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                linearLayoutCompat2.setVisibility(0);
                OLrzqt(c23742iHq, iwzEZpvd);
                return;
            }
            return;
        }
        if (!Intrinsics.EZpvd(iwu, iWU.TaskDescription.EZpvd)) {
            throw new NoWhenBranchMatchedException();
        }
        c23742iHq.uzCIH.copydefault();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        C55173xeu c55173xeu2 = c23742iHq.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
        c55173xeu2.setVisibility(0);
        valueOf().AEQbTJ(java.lang.Integer.valueOf(KWHzl()), Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    public final void copydefault(boolean z) {
        OLrzqt().AkhnZx.setVisibility((!z || this.copydefault) ? 8 : 0);
    }

    public final void OLrzqt(float f) {
        float fKWHzl = f > 0.5f ? C56548yJl.KWHzl((f - 0.5f) / 0.5f, 0.0f, 1.0f) : 0.0f;
        OLrzqt().valueOf.setAlpha(fKWHzl);
        android.widget.TextView textView = OLrzqt().valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(fKWHzl > 0.0f ? 0 : 8);
        OLrzqt().gEmmrt.setAlpha(1.0f);
        android.widget.ImageView imageView = OLrzqt().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
    }

    public final void KWHzl(C23742iHq c23742iHq, iWT iwt) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AEQbTJ())) {
            c23742iHq.fJNWhG.setTextAppearance(C52761wXj.LoaderManager.zsXlph);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) iwt.OLrzqt())) {
                android.widget.ImageView imageView = c23742iHq.fARcdN;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                android.widget.ImageView imageView2 = c23742iHq.fARcdN;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                c27569jxf.AEQbTJ(imageView2, iwt.OLrzqt(), C52761wXj.TaskDescription.DuXjdv);
            }
        }
        copydefault(c23742iHq, c23742iHq.AuCTel.getBottom() + C55298xhM.dp2px$default(30.0f, null, 1, null));
        AggregateProductListVM aggregateProductListVMValueOf = valueOf();
        int iKWHzl = KWHzl();
        java.lang.String strAhwBna = iwt.AhwBna();
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        aggregateProductListVMValueOf.AEQbTJ(java.lang.Integer.valueOf(iKWHzl), strAhwBna);
        java.lang.String strKWHzl = C33492mxV.OLrzqt() ? iwt.KWHzl().KWHzl() : iwt.KWHzl().OLrzqt();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
            C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
            android.widget.ImageView imageView3 = c23742iHq.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            c27569jxf2.AEQbTJ(imageView3, strKWHzl, C52761wXj.TaskDescription.DuXjdv);
        }
        C55258xgZ c55258xgZ = c23742iHq.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        c55258xgZ.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) iwt.AhwBna()) ? 0 : 8);
        c23742iHq.fJNWhG.setTextValue(iwt.AhwBna());
        c23742iHq.valueOf.setText(iwt.AhwBna());
        c23742iHq.valueOf.setAlpha(0.0f);
        android.widget.TextView textView = c23742iHq.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        c23742iHq.gEmmrt.setAlpha(1.0f);
        android.widget.ImageView imageView4 = c23742iHq.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView4, "");
        imageView4.setVisibility(0);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) iwt.OLrzqt())) {
            AppCompatImageView appCompatImageView = c23742iHq.values;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(0);
            C27569jxf c27569jxf3 = C27569jxf.OLrzqt;
            AppCompatImageView appCompatImageView2 = c23742iHq.values;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            C27569jxf.loadCircleWithBorder$default(c27569jxf3, appCompatImageView2, iwt.OLrzqt(), 0, 0, 0.0f, 28, null);
        }
    }

    public final void copydefault(C23742iHq c23742iHq, int i) {
        android.widget.ImageView imageView = c23742iHq.fARcdN;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
            android.widget.ImageView imageView2 = c23742iHq.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = i;
                imageView2.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void KWHzl(C23742iHq c23742iHq, iWS iws) {
        copydefault(c23742iHq, (int) (C33570myu.AEQbTJ() * 0.624f));
        c23742iHq.AwvSrB.setText(requireContext().getString(C25493ixk.FragmentManager.AuCTelauCTel));
        c23742iHq.zuBGHE.setText(C59449zhJ.replace$default(C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, iws.gEmmrt(), 0, 0, true, true, 6, null), " ", "", false, 4, (java.lang.Object) null));
        C27538jxA c27538jxA = C27538jxA.EZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c27538jxA.OLrzqt(contextRequireContext, c23742iHq.iwGUEr, iws.EZpvd(), 16.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : C25493ixk.TaskDescription.OLrzqt, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : 0);
        android.widget.TextView textView = c23742iHq.zsXlph;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        textView.setText(C33069mpW.KWHzl(contextRequireContext2, C25493ixk.FragmentManager.ejfBZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("projectName", ""))));
        c23742iHq.zLjUOn.setText(iws.AYXKKw());
        android.widget.TextView textView2 = c23742iHq.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.widget.TextView textView3 = c23742iHq.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        c27569jxf.copydefault(textView3, iws.valueOf(), iws.OLrzqt(), C55298xhM.dp2px$default(8.0f, null, 1, null), 6);
        c23742iHq.fIwbmz.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        c23742iHq.ejfBZ.AEQbTJ(3);
        C27216jqx c27216jqx = c23742iHq.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c27216jqx, "");
        c27216jqx.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) iws.AEQbTJ()) ? 0 : 8);
        c23742iHq.ejfBZ.setContent(iws.AEQbTJ());
        C27439jvH c27439jvH = OLrzqt().wlaJM;
        Intrinsics.checkNotNullExpressionValue(c27439jvH, "");
        c27439jvH.setVisibility(0);
        OLrzqt().wlaJM.setRiskIconSize(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null));
        C27439jvH c27439jvH2 = OLrzqt().wlaJM;
        int iKWHzl = iws.KWHzl();
        c27439jvH2.setRiskTag((iKWHzl == 2 || iKWHzl == 3) ? iws.copydefault() : null);
    }

    public final void OLrzqt(C23742iHq c23742iHq, iWZ iwz) {
        copydefault(c23742iHq, (int) (C33570myu.AEQbTJ() * 0.624f));
        c23742iHq.ejfBZ.AEQbTJ(3);
        C27216jqx c27216jqx = c23742iHq.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c27216jqx, "");
        c27216jqx.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) iwz.KWHzl()) ? 0 : 8);
        c23742iHq.ejfBZ.setContent(iwz.KWHzl());
        android.widget.TextView textView = c23742iHq.AwvSrB;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) iwz.AhwBna()) ? 0 : 8);
        android.widget.TextView textView2 = c23742iHq.zuBGHE;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) iwz.AhwBna()) ? 0 : 8);
        c23742iHq.AwvSrB.setText(requireContext().getString(C25493ixk.FragmentManager.heceqZ));
        c23742iHq.zuBGHE.setText(C27492jwH.formatTvl$default(C27492jwH.OLrzqt, iwz.AhwBna(), false, false, 6, null));
        c23742iHq.iwGUEr.setVisibility(8);
        android.widget.TextView textView3 = c23742iHq.zsXlph;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) iwz.copydefault()) ? 0 : 8);
        android.widget.TextView textView4 = c23742iHq.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) iwz.copydefault()) ? 0 : 8);
        c23742iHq.zsXlph.setText(requireContext().getString(C25493ixk.FragmentManager.registerUser));
        c23742iHq.zLjUOn.setText(iwz.copydefault());
        ViewGroup.LayoutParams layoutParams = c23742iHq.QKVWgx.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) iwz.OLrzqt())) {
            ((LinearLayout.LayoutParams) layoutParams2).weight = 1.0f;
        } else {
            ((LinearLayout.LayoutParams) layoutParams2).weight = 0.0f;
        }
        android.widget.TextView textView5 = c23742iHq.ORxRYg;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) iwz.OLrzqt()) ? 0 : 8);
        android.widget.TextView textView6 = c23742iHq.QOLQEE;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) iwz.OLrzqt()) ? 0 : 8);
        c23742iHq.ORxRYg.setText(requireContext().getString(C25493ixk.FragmentManager.scanPackages));
        c23742iHq.QOLQEE.setText(iwz.OLrzqt());
        C27439jvH c27439jvH = OLrzqt().wlaJM;
        Intrinsics.checkNotNullExpressionValue(c27439jvH, "");
        c27439jvH.setVisibility(0);
        OLrzqt().wlaJM.setRiskIconSize(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null));
        C27439jvH c27439jvH2 = OLrzqt().wlaJM;
        int iEZpvd = iwz.EZpvd();
        c27439jvH2.setRiskTag((iEZpvd == 2 || iEZpvd == 3) ? iwz.AEQbTJ() : null);
    }

    public final void OLrzqt(C23742iHq c23742iHq, iWV iwv) {
        if (iwv instanceof iWV.StateListAnimator) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean z = iwv instanceof iWV.ActionBar;
        if (z) {
            iWV.ActionBar actionBar = (iWV.ActionBar) iwv;
            if (actionBar.OLrzqt().isEmpty()) {
                arrayList.add(new V2ProductQuery(KWHzl(), AEQbTJ(), null, null, null, null, null, java.lang.Boolean.TRUE, null, null, null, null, 3964, null));
            } else {
                java.util.List<iWX> listOLrzqt = actionBar.OLrzqt();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                java.util.Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new V2ProductQuery(KWHzl(), AEQbTJ(), null, ((iWX) it.next()).EZpvd(), null, null, null, java.lang.Boolean.TRUE, null, null, null, null, 3956, null));
                }
                arrayList.addAll(arrayList3);
                java.util.List<iWX> listOLrzqt2 = actionBar.OLrzqt();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
                java.util.Iterator<T> it2 = listOLrzqt2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((iWX) it2.next()).KWHzl());
                }
                arrayList2.addAll(arrayList4);
            }
        }
        djBIcL().KWHzl(arrayList, arrayList2);
        if (z) {
            iWV.ActionBar actionBar2 = (iWV.ActionBar) iwv;
            boolean z2 = actionBar2.OLrzqt().size() > 1;
            this.copydefault = z2;
            if (z2) {
                copydefault(c23742iHq, actionBar2.OLrzqt());
                copydefault(false);
            } else {
                copydefault(true);
            }
        }
    }

    public final void copydefault(C23742iHq c23742iHq, final java.util.List<iWX> list) {
        NestedScrollView nestedScrollView = c23742iHq.djBIcL;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(0);
        c23742iHq.DTwDnp.setOffscreenPageLimit(list.size());
        C55244xgL c55244xgL = c23742iHq.gHZMYf;
        c55244xgL.EZpvd(this.AkhnZx);
        c55244xgL.copydefault(this.AkhnZx);
        C27189jqW c27189jqW = this.AhwBna;
        if (c27189jqW != null) {
            c27189jqW.copydefault();
        }
        C27189jqW c27189jqW2 = new C27189jqW(c55244xgL.AYXKKw(), OLrzqt().DTwDnp, false, true, new C27189jqW.Activity() { // from class: o.iWG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C27189jqW.Activity
            public final void KWHzl(TabLayout.Tab tab, int i) {
                iWF.KWHzl(list, tab, i);
            }
        });
        this.AhwBna = c27189jqW2;
        c27189jqW2.KWHzl();
    }

    public static final void KWHzl(java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (list.size() <= i) {
            return;
        }
        iWX iwx = (iWX) list.get(i);
        tab.setText(iwx.OLrzqt());
        tab.setId(C33129mqd.AhwBna(iwx.EZpvd()));
    }
}
