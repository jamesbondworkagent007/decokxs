package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridPendingOrderFragment$subscribeOnUIChange$3$1;
import com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridPendingOrderFragment$subscribeTickerPrice$1$2$1;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.tradingbot.impl.strategy.view.TickerIconView;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.GridPendingEmptyData;
import com.okinc.unify_trade.bot.data.GridPendingItemData;
import com.okinc.unify_trade.bot.data.GridPendingOrderData;
import com.okinc.unify_trade.bot.presenter.GridPendingOrderPresenter;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C48033uCm;
import o.C52132wAb;
import o.C52761wXj;
import o.C55688xof;
import o.wAI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wAb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52132wAb extends AbstractC54505xKx<AbstractC48396uPy, GridPendingOrderPresenter> {
    public GridPendingOrderData AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final int copydefault = C48033uCm.Activity.fHqPtx;
    public final C43316rmw OLrzqt = new C43316rmw();
    public final C43316rmw EZpvd = new C43316rmw();
    public final InterfaceC33171mrS AhwBna = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);

    /* JADX INFO: renamed from: o.wAb$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public C52132wAb() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridPendingOrderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridPendingOrderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridPendingOrderFragment$special$$inlined$activityViewModels$default$3
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
    }

    private final TacticsDetailPresenter djBIcL() {
        return (TacticsDetailPresenter) this.KWHzl.getValue();
    }

    public final boolean AEQbTJ() {
        return Intrinsics.EZpvd((java.lang.Object) dxcTrN().EZpvd().getState(), (java.lang.Object) "no_close_position");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(view, "");
        dxcTrN().KWHzl(djBIcL().AhwBna());
        AEQbTJ(view, bundle);
        int i = 8;
        if (AEQbTJ()) {
            gGvvIC().valueOf.setVisibility(8);
            gGvvIC().AhwBna.setVisibility(8);
            gGvvIC().djBIcL.setVisibility(8);
            return;
        }
        gGvvIC().valueOf.setVisibility(0);
        gGvvIC().AhwBna.setVisibility(0);
        gGvvIC().djBIcL.setVisibility(0);
        LinearLayoutCompat.LayoutParams layoutParams = null;
        this.OLrzqt.register(GridPendingEmptyData.class, new C52543wPh(null, 1, null));
        this.EZpvd.register(GridPendingEmptyData.class, new C52543wPh(null, 1, null));
        this.EZpvd.register(GridPendingItemData.class, new StateListAnimator(true));
        this.OLrzqt.register(GridPendingItemData.class, new StateListAnimator(false, 1, 0 == true ? 1 : 0));
        AbstractC48396uPy abstractC48396uPyGGvvIC = gGvvIC();
        android.widget.TextView textView = abstractC48396uPyGGvvIC.gEmmrt;
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        textView.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56071xvr.getRiseUpColor$default(c56071xvr, 0.0f, 1, null)));
        abstractC48396uPyGGvvIC.AxsJAY.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56071xvr.getFallDownColor$default(c56071xvr, 0.0f, 1, null)));
        abstractC48396uPyGGvvIC.zuBGHE.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56071xvr.getRiseUpColor$default(c56071xvr, 0.0f, 1, null)));
        abstractC48396uPyGGvvIC.QKVWgx.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56071xvr.getFallDownColor$default(c56071xvr, 0.0f, 1, null)));
        abstractC48396uPyGGvvIC.AuCTel.setAdapter(this.OLrzqt);
        abstractC48396uPyGGvvIC.AubY.setAdapter(this.EZpvd);
        abstractC48396uPyGGvvIC.AuCTel.setLayoutManager(new LinearLayoutManager(getActivity()));
        abstractC48396uPyGGvvIC.AubY.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView = abstractC48396uPyGGvvIC.AuCTel;
        ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
        LinearLayoutCompat.LayoutParams layoutParams3 = layoutParams2 instanceof LinearLayoutCompat.LayoutParams ? (LinearLayoutCompat.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ((LinearLayout.LayoutParams) layoutParams3).width = (C55302xhQ.OLrzqt(contextRequireContext) - C55298xhM.dp2px$default(0.5f, null, 1, null)) / 2;
        } else {
            layoutParams3 = null;
        }
        recyclerView.setLayoutParams(layoutParams3);
        RecyclerView recyclerView2 = abstractC48396uPyGGvvIC.AubY;
        ViewGroup.LayoutParams layoutParams4 = recyclerView2.getLayoutParams();
        LinearLayoutCompat.LayoutParams layoutParams5 = layoutParams4 instanceof LinearLayoutCompat.LayoutParams ? (LinearLayoutCompat.LayoutParams) layoutParams4 : null;
        if (layoutParams5 != null) {
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            ((LinearLayout.LayoutParams) layoutParams5).width = (C55302xhQ.OLrzqt(contextRequireContext2) - C55298xhM.dp2px$default(0.5f, null, 1, null)) / 2;
            layoutParams = layoutParams5;
        }
        recyclerView2.setLayoutParams(layoutParams);
        java.lang.String orderType = dxcTrN().EZpvd().getOrderType();
        Group group = abstractC48396uPyGGvvIC.gHZMYf;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        LinearLayoutCompat linearLayoutCompat = abstractC48396uPyGGvvIC.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        if (this.AhwBna.getFieldNames() && (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid"))) {
            i = 0;
        }
        linearLayoutCompat.setVisibility(i);
        android.widget.TextView textView2 = abstractC48396uPyGGvvIC.fIwbmz;
        if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.getSerial);
        } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.iKEqwx);
        }
        textView2.setText(strAYXKKw);
        C55320xhi c55320xhi = abstractC48396uPyGGvvIC.AEQbTJ;
        c55320xhi.setOnClickListener(new LoaderManager(c55320xhi, 1000L, this));
        C55320xhi c55320xhi2 = abstractC48396uPyGGvvIC.AYXKKw;
        c55320xhi2.setOnClickListener(new PendingIntent(c55320xhi2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.wAb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wAb$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        gGvvIC().zsXlph.copydefault();
    }

    public final void AEQbTJ(android.view.View view, android.os.Bundle bundle) {
        wAI wai = gGvvIC().zsXlph;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        TacticsDetailPresenter tacticsDetailPresenterDjBIcL = djBIcL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        wai.KWHzl(childFragmentManager, tacticsDetailPresenterDjBIcL, viewLifecycleOwner, new TaskDescription());
    }

    /* JADX INFO: renamed from: o.wAb$TaskDescription */
    public static final class TaskDescription implements wAI.ActionBar {
        public TaskDescription() {
        }

        @Override // o.wAI.ActionBar
        public void EZpvd() {
            C52132wAb.this.showLoading();
        }

        @Override // o.wAI.ActionBar
        public void AEQbTJ() {
            C52132wAb.this.dismissLoading();
        }
    }

    /* JADX INFO: renamed from: o.wAb$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C52132wAb AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ java.util.List copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, boolean z, C52132wAb c52132wAb, java.util.List list) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = z;
            this.AEQbTJ = c52132wAb;
            this.copydefault = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.OLrzqt) {
                    android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                    viewOnClickListenerC54939xaY.EZpvd(CollectionsKt___CollectionsKt.joinToString$default(this.copydefault, "\n", null, null, 0, null, null, 62, null));
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new Fragment(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wAb$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C52132wAb EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C52132wAb c52132wAb) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c52132wAb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.HJWChPURsaBn);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintView), (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wAb$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C52132wAb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C52132wAb c52132wAb) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c52132wAb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.gCNefq);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintView), (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        gEmmrt();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dxcTrN().valueOf();
        KWHzl();
    }

    public final void KWHzl() {
        TickerIconView tickerIconView = gGvvIC().zLjUOn;
        gGvvIC().zLjUOn.setIsNeedColorChange(false);
        gGvvIC().zLjUOn.setShowNewPriceIcon(true);
        AppCompatTextView appCompatTextViewCopydefault = gGvvIC().zLjUOn.copydefault();
        appCompatTextViewCopydefault.setTextSize(14.0f);
        appCompatTextViewCopydefault.setTextAppearance(C52761wXj.LoaderManager.QSLkRj);
        appCompatTextViewCopydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        tickerIconView.OLrzqt(dxcTrN().EZpvd().getInstId(), dxcTrN().EZpvd().getInstType());
        tickerIconView.setOnTickerChange(new Function1() { // from class: o.wAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52132wAb.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(C52132wAb c52132wAb, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c52132wAb.dxcTrN().djBIcL().postValue(C56390yDp.OLrzqt(str, 0));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c52132wAb), Dispatchers.getIO(), null, new ContractGridPendingOrderFragment$subscribeTickerPrice$1$2$1(c52132wAb, str, null), 2, null);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        GridPendingOrderData gridPendingOrderData = this.AEQbTJ;
        if (gridPendingOrderData != null) {
            boolean z = yDY.copydefault("contract_grid").contains(dxcTrN().EZpvd().getOrderType()) && yDY.copydefault("starting", "stopping").contains(dxcTrN().EZpvd().getState());
            int i = yDY.copydefault("grid", "contract_grid").contains(dxcTrN().EZpvd().getOrderType()) ? C55688xof.Application.setListNavigationCallbacks : C55688xof.Application.startActionMode;
            int i2 = yDY.copydefault("grid", "contract_grid").contains(dxcTrN().EZpvd().getOrderType()) ? C55688xof.Application.setHomeButtonEnabled : C55688xof.Application.show;
            if (gridPendingOrderData.getBuyList().isEmpty() || z) {
                C56402yEa.EZpvd(new GridPendingEmptyData(C33070mpX.AYXKKw(i), true, 8.0f));
                C33064mpR.OLrzqt(this.OLrzqt, (java.util.List<? extends java.lang.Object>) C56402yEa.EZpvd(new GridPendingEmptyData(C33070mpX.AYXKKw(i), true, 8.0f)));
            } else {
                C33064mpR.OLrzqt(this.OLrzqt, (java.util.List<? extends java.lang.Object>) gridPendingOrderData.getBuyList());
            }
            if (gridPendingOrderData.getSellList().isEmpty() || z) {
                C33064mpR.OLrzqt(this.EZpvd, (java.util.List<? extends java.lang.Object>) C56402yEa.EZpvd(new GridPendingEmptyData(C33070mpX.AYXKKw(i2), false, 8.0f)));
            } else {
                C33064mpR.OLrzqt(this.EZpvd, (java.util.List<? extends java.lang.Object>) gridPendingOrderData.getSellList());
            }
            try {
                Result.Application application = Result.Companion;
                java.util.List<GridPendingItemData> buyList = gridPendingOrderData.getBuyList();
                if (java.lang.Boolean.valueOf(z).booleanValue()) {
                    buyList = null;
                }
                if (buyList == null) {
                    buyList = yDY.AhwBna();
                }
                java.util.List<GridPendingItemData> sellList = z ? null : gridPendingOrderData.getSellList();
                if (sellList == null) {
                    sellList = yDY.AhwBna();
                }
                copydefault(buyList, sellList);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            C55173xeu c55173xeu = gGvvIC().AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            java.util.List<GridPendingItemData> buyList2 = gridPendingOrderData.getBuyList();
            C55258xgZ c55258xgZ = gGvvIC().AuCTelauCTel;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            KWHzl(buyList2, c55258xgZ, dxcTrN().EZpvd().getOrderType());
            java.util.List<GridPendingItemData> sellList2 = gridPendingOrderData.getSellList();
            C55258xgZ c55258xgZ2 = gGvvIC().wlaJM;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ2, "");
            KWHzl(sellList2, c55258xgZ2, dxcTrN().EZpvd().getOrderType());
            boolean z2 = gridPendingOrderData.getBuyList().isEmpty() && gridPendingOrderData.getSellList().isEmpty();
            LinearLayoutCompat linearLayoutCompat = gGvvIC().getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            boolean z3 = !z2;
            linearLayoutCompat.setVisibility(z3 ? 0 : 8);
            if (z) {
                ConstraintLayout constraintLayout = gGvvIC().djBIcL;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                boolean z4 = !z;
                constraintLayout.setVisibility(z4 ? 0 : 8);
                LinearLayoutCompat linearLayoutCompat2 = gGvvIC().iwGUEr;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                linearLayoutCompat2.setVisibility(z4 ? 0 : 8);
                C55173xeu c55173xeu2 = gGvvIC().DbNXlk;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(z ? 0 : 8);
                gGvvIC().DbNXlk.EZpvd().setText(C33070mpX.AYXKKw(C48033uCm.Fragment.fBE));
                return;
            }
            java.lang.String orderType = dxcTrN().EZpvd().getOrderType();
            LinearLayoutCompat linearLayoutCompat3 = gGvvIC().iwGUEr;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
            linearLayoutCompat3.setVisibility((this.AhwBna.getFieldNames() && (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid"))) ? 0 : 8);
            C55173xeu c55173xeu3 = gGvvIC().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
            c55173xeu3.setVisibility(z2 ? 0 : 8);
            ConstraintLayout constraintLayout2 = gGvvIC().djBIcL;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(z3 ? 0 : 8);
            if (Intrinsics.EZpvd((java.lang.Object) djBIcL().AhwBna().getState(), (java.lang.Object) "pending_signal")) {
                gGvvIC().DbNXlk.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fBE));
            } else {
                gGvvIC().DbNXlk.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.setMediaId));
            }
        }
    }

    private final void gEmmrt() {
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = djBIcL().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new FragmentManager(new Function1() { // from class: o.wAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52132wAb.KWHzl(this.KWHzl, (C55804xqp) obj);
            }
        }));
        TradeLiveData<java.util.List<TickersData>> tradeLiveDataKWHzl = dxcTrN().KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner2, new FragmentManager(new Function1() { // from class: o.wAe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52132wAb.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        }));
        TradeLiveData<C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>> tradeLiveDataAYXKKw = dxcTrN().AYXKKw();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner3, new FragmentManager(new Function1() { // from class: o.wAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52132wAb.EZpvd(this.OLrzqt, (C55804xqp) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.wAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52132wAb.copydefault(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner4, new FragmentManager(new Function1() { // from class: o.wAj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52132wAb.EZpvd(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit KWHzl(C52132wAb c52132wAb, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        AbstractC48396uPy abstractC48396uPyGGvvIC = c52132wAb.gGvvIC();
        abstractC48396uPyGGvvIC.ejfBZ.setText(c52132wAb.dxcTrN().AEQbTJ((StrategyDetailsResponse) c55804xqp.copydefault()));
        Group group = abstractC48396uPyGGvvIC.isConnected;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility((Intrinsics.EZpvd((java.lang.Object) ((StrategyDetailsResponse) c55804xqp.copydefault()).getOrderType(), (java.lang.Object) "grid") && ((StrategyDetailsResponse) c55804xqp.copydefault()).getShouldShowEarn()) ? 0 : 8);
        if (Intrinsics.EZpvd((java.lang.Object) ((StrategyDetailsResponse) c55804xqp.copydefault()).getOrderType(), (java.lang.Object) "grid")) {
            SmartEarnParam simpleEarn = ((StrategyDetailsResponse) c55804xqp.copydefault()).getSimpleEarn();
            if (simpleEarn == null || c52132wAb.KWHzl(simpleEarn.getActiveRegionLow()) || c52132wAb.KWHzl(simpleEarn.getActiveRegionHigh())) {
                abstractC48396uPyGGvvIC.copydefault.setText("--");
                abstractC48396uPyGGvvIC.values.setText("--");
            } else {
                C56068xvo c56068xvo = C56068xvo.copydefault;
                java.lang.String processedPrice$default = C56068xvo.getProcessedPrice$default(c56068xvo, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), simpleEarn.getActiveRegionLow(), null, false, false, 56, null);
                java.lang.String processedPrice$default2 = C56068xvo.getProcessedPrice$default(c56068xvo, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), simpleEarn.getActiveRegionHigh(), null, false, false, 56, null);
                java.lang.String processedPrice$default3 = C56068xvo.getProcessedPrice$default(c56068xvo, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getMinPx(), null, false, false, 56, null);
                java.lang.String processedPrice$default4 = C56068xvo.getProcessedPrice$default(c56068xvo, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getMaxPx(), null, false, false, 56, null);
                abstractC48396uPyGGvvIC.copydefault.setText(processedPrice$default + " - " + processedPrice$default2);
                abstractC48396uPyGGvvIC.values.setText(C59442zhC.fJNWhG("\n                    {" + processedPrice$default3 + " - " + processedPrice$default + "}, {" + processedPrice$default4 + " - " + processedPrice$default2 + "}\n                    "));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52132wAb c52132wAb, java.util.List list) {
        java.lang.String last;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        GridPendingOrderPresenter gridPendingOrderPresenterDxcTrN = c52132wAb.dxcTrN();
        TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tickersData != null && (last = tickersData.getLast()) != null) {
            str = last;
        }
        c52132wAb.dxcTrN().djBIcL().postValue(gridPendingOrderPresenterDxcTrN.OLrzqt(str));
        c52132wAb.dxcTrN().AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52132wAb c52132wAb, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c52132wAb), Dispatchers.getIO(), null, new ContractGridPendingOrderFragment$subscribeOnUIChange$3$1(c52132wAb, (java.util.List) c55804xqp.copydefault(), null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52132wAb c52132wAb, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            c52132wAb.showLoading();
        } else {
            c52132wAb.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C52132wAb c52132wAb, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C55173xeu c55173xeu = c52132wAb.gGvvIC().AkhnZx;
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(0);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.OeawrHRnVkix));
        java.lang.String message = exc.getMessage();
        if (message == null) {
            message = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) message);
        c55173xeu.setRetry(C33070mpX.AYXKKw(C48033uCm.Fragment.OHqIaq));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.wAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52132wAb.OLrzqt(this.OLrzqt, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C52132wAb c52132wAb, android.view.View view) {
        c52132wAb.dxcTrN().valueOf();
        c52132wAb.KWHzl();
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (this.OLrzqt.getItemCount() == 0 || this.EZpvd.getItemCount() == 0) {
            super.showLoading();
        }
    }

    /* JADX INFO: renamed from: o.wAb$StateListAnimator */
    public static final class StateListAnimator extends AbstractC59533zio<GridPendingItemData, ActionBar> {
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(false, 1, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:420) call: o.wAb.StateListAnimator.<init>(boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public StateListAnimator(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (this.OLrzqt) {
                android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.dPnHjp, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "");
                return new ActionBar(viewInflate);
            }
            android.view.View viewInflate2 = layoutInflater.inflate(C48033uCm.Activity.aVhqwO, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "");
            return new ActionBar(viewInflate2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [466=5] */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull GridPendingItemData gridPendingItemData) {
            kotlin.Pair pairOLrzqt;
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(gridPendingItemData, "");
            actionBar.KWHzl().setText(xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(gridPendingItemData.getIndex()))));
            actionBar.KWHzl().setTextColor(this.OLrzqt ? C56071xvr.getFallDownColor$default(C56071xvr.gEmmrt, 0.0f, 1, null) : C56071xvr.getRiseUpColor$default(C56071xvr.gEmmrt, 0.0f, 1, null));
            if (gridPendingItemData.getTitle().length() == 0) {
                actionBar.OLrzqt().setText("--");
            } else if (C33129mqd.gEmmrt(gridPendingItemData.getTitle(), "0")) {
                actionBar.OLrzqt().setText(C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor));
            } else {
                actionBar.OLrzqt().setText(gridPendingItemData.getTitle());
            }
            if (gridPendingItemData.getText().length() == 0) {
                actionBar.copydefault().setText("--");
            } else {
                actionBar.copydefault().setText(gridPendingItemData.getText());
            }
            java.lang.String orderTag = gridPendingItemData.getOrderTag();
            if (orderTag != null) {
                switch (orderTag.hashCode()) {
                    case -1792430638:
                        pairOLrzqt = !orderTag.equals("combinedPriceAdjusted") ? C56390yDp.OLrzqt(java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null) : C56390yDp.OLrzqt(java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DcMfJK)), C33070mpX.AYXKKw(C48033uCm.Fragment.DLGVGj));
                        break;
                    case -1790551849:
                        if (!orderTag.equals("priceAdjusted")) {
                        }
                        break;
                    case -1645804283:
                        if (orderTag.equals("retryFailed")) {
                            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv)), C33070mpX.AYXKKw(C48033uCm.Fragment.fGQ));
                            break;
                        }
                        break;
                    case 24665195:
                        if (orderTag.equals("inactive")) {
                            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), C33070mpX.AYXKKw(C48033uCm.Fragment.iCPUKe));
                            break;
                        }
                        break;
                    case 545992985:
                        if (!orderTag.equals("riskRetry")) {
                        }
                        break;
                    case 1185350545:
                        if (orderTag.equals("insufficientMargin")) {
                            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)), C33070mpX.AYXKKw(C48033uCm.Fragment.DKtBnz));
                            break;
                        }
                        break;
                }
            }
            int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
            final java.lang.String str = (java.lang.String) pairOLrzqt.component2();
            final android.widget.TextView textViewOLrzqt = actionBar.OLrzqt();
            textViewOLrzqt.setTextColor(iIntValue);
            textViewOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.wAk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52132wAb.StateListAnimator.KWHzl(str, textViewOLrzqt, view);
                }
            });
        }

        public static final void KWHzl(java.lang.String str, android.widget.TextView textView, android.view.View view) {
            if (str != null) {
                android.content.Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(str);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.wAi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C52132wAb.StateListAnimator.KWHzl(viewOnClickListenerC54939xaY, view2);
                    }
                });
                viewOnClickListenerC54939xaY.show();
            }
        }

        public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wAb$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView OLrzqt;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.sYOsaF);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.onAddQueueItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.onPlay);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.copydefault = (android.widget.TextView) viewFindViewById3;
        }
    }

    public final void copydefault(java.util.List<GridPendingItemData> list, java.util.List<GridPendingItemData> list2) {
        float f;
        int size = list.size();
        int size2 = list2.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (true ^ CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) TacticsUiConst.Application.copydefault.KWHzl()), ((GridPendingItemData) obj).getOrderTag())) {
                arrayList.add(obj);
            }
        }
        int size3 = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) TacticsUiConst.Application.copydefault.KWHzl()), ((GridPendingItemData) obj2).getOrderTag())) {
                arrayList2.add(obj2);
            }
        }
        int size4 = arrayList2.size();
        int i = size + size2;
        if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), 0)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = gGvvIC().gEmmrt.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = gGvvIC().AxsJAY.getLayoutParams();
        Intrinsics.copydefault(layoutParams3, "");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ViewGroup.LayoutParams layoutParams5 = gGvvIC().sSMYrx.getLayoutParams();
        Intrinsics.copydefault(layoutParams5, "");
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        if ((C33129mqd.valueOf(java.lang.Integer.valueOf(size), 0) && C33129mqd.valueOf(java.lang.Integer.valueOf(size2), 0)) || (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(size), 0) && C33129mqd.AEQbTJ(java.lang.Integer.valueOf(size2), 0))) {
            float f2 = size / i;
            if (C33129mqd.valueOf(java.lang.Integer.valueOf(size), 0) && C33129mqd.valueOf(java.lang.Integer.valueOf(size2), 0)) {
                f = 0.5f;
            } else {
                if (C33129mqd.gEmmrt(java.lang.Float.valueOf(f2), java.lang.Float.valueOf(0.2f))) {
                    f2 = 0.2f;
                }
                f = 1 - 0.2f;
                if (!C33129mqd.AEQbTJ(java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f))) {
                    f = f2;
                }
            }
            layoutParams2.matchConstraintPercentWidth = f;
            layoutParams6.matchConstraintPercentWidth = 0.01f;
            layoutParams4.matchConstraintPercentWidth = (1 - f) - 0.01f;
            gGvvIC().gEmmrt.requestLayout();
            gGvvIC().AxsJAY.requestLayout();
            android.widget.TextView textView = gGvvIC().zuBGHE;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.TextView textView2 = gGvvIC().QKVWgx;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            android.widget.TextView textView3 = gGvvIC().gEmmrt;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setHomeActionContentDescription);
            xMR xmr = xMR.copydefault;
            textView3.setText(strAYXKKw + " " + xmr.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size3))));
            gGvvIC().AxsJAY.setText(C33070mpX.AYXKKw(C55688xof.Application.setStackedBackgroundDrawable) + " " + xmr.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size4))));
            return;
        }
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(size), 0)) {
            layoutParams4.matchConstraintPercentWidth = 1.0f;
            layoutParams6.matchConstraintPercentWidth = 0.0f;
            layoutParams2.matchConstraintPercentWidth = 0.0f;
            gGvvIC().gEmmrt.requestLayout();
            gGvvIC().AxsJAY.requestLayout();
            android.widget.TextView textView4 = gGvvIC().zuBGHE;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
            android.widget.TextView textView5 = gGvvIC().QKVWgx;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
            android.widget.TextView textView6 = gGvvIC().zuBGHE;
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setHomeActionContentDescription);
            xMR xmr2 = xMR.copydefault;
            textView6.setText(strAYXKKw2 + " " + xmr2.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size))));
            gGvvIC().AxsJAY.setText(C33070mpX.AYXKKw(C55688xof.Application.setStackedBackgroundDrawable) + " " + xmr2.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size4))));
            return;
        }
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(size2), 0)) {
            layoutParams2.matchConstraintPercentWidth = 1.0f;
            layoutParams6.matchConstraintPercentWidth = 0.0f;
            layoutParams4.matchConstraintPercentWidth = 0.0f;
            gGvvIC().gEmmrt.requestLayout();
            gGvvIC().AxsJAY.requestLayout();
            android.widget.TextView textView7 = gGvvIC().zuBGHE;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            textView7.setVisibility(8);
            android.widget.TextView textView8 = gGvvIC().QKVWgx;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            textView8.setVisibility(0);
            android.widget.TextView textView9 = gGvvIC().gEmmrt;
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.setHomeActionContentDescription);
            xMR xmr3 = xMR.copydefault;
            textView9.setText(strAYXKKw3 + " " + xmr3.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size3))));
            gGvvIC().QKVWgx.setText(C33070mpX.AYXKKw(C55688xof.Application.setStackedBackgroundDrawable) + " " + xmr3.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size2))));
        }
    }

    /* JADX INFO: renamed from: o.wAb$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public final boolean KWHzl(java.lang.String str) {
        return str.length() == 0 || C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) (-1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [593=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(java.util.List<GridPendingItemData> list, C55258xgZ c55258xgZ, java.lang.String str) {
        java.util.List listAhwBna;
        java.lang.String strAYXKKw;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String orderTag = ((GridPendingItemData) obj).getOrderTag();
            java.lang.Object arrayList = linkedHashMap.get(orderTag);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(orderTag, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.Set<java.lang.String> setKeySet = linkedHashMap.keySet();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid")) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str2 : setKeySet) {
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1792430638:
                            strAYXKKw = str2.equals("combinedPriceAdjusted") ? C33070mpX.AYXKKw(C48033uCm.Fragment.DLGVGj) : null;
                            break;
                        case -1790551849:
                            if (!str2.equals("priceAdjusted")) {
                            }
                            break;
                        case -1645804283:
                            if (str2.equals("retryFailed")) {
                                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.fGQ);
                                break;
                            }
                            break;
                        case 24665195:
                            if (str2.equals("inactive")) {
                                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.iCPUKe);
                                break;
                            }
                            break;
                        case 545992985:
                            if (!str2.equals("riskRetry")) {
                            }
                            break;
                        case 1185350545:
                            if (str2.equals("insufficientMargin")) {
                                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.DKtBnz);
                                break;
                            }
                            break;
                    }
                }
                if (strAYXKKw != null) {
                    arrayList2.add(strAYXKKw);
                }
            }
            listAhwBna = arrayList2;
        } else {
            listAhwBna = yDY.AhwBna();
        }
        boolean z = !listAhwBna.isEmpty();
        c55258xgZ.setHelperLabelType(z ? 1 : 2);
        c55258xgZ.setOnClickListener(new Dialog(c55258xgZ, 1000L, z, this, listAhwBna));
    }
}
