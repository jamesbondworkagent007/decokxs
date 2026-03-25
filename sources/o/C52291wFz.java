package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.InformationFragmentData;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.TacticsPortfolioInfoDetailItem;
import com.okinc.unify_trade.bot.data.TacticsRecInfoDetailItem;
import com.okinc.unify_trade.bot.presenter.TacticsInformationPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;

/* JADX INFO: renamed from: o.wFz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52291wFz extends AbstractC54505xKx<uQV, TacticsInformationPresenter> {
    public final InterfaceC56387yDm AEQbTJ;
    public final int OLrzqt = C48033uCm.Activity.hvKCwS;
    public final C43316rmw EZpvd = new C43316rmw();
    public final C43316rmw KWHzl = new C43316rmw();

    /* JADX INFO: renamed from: o.wFz$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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
        return this.OLrzqt;
    }

    public C52291wFz() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsInformationFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsInformationFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsInformationFragment$special$$inlined$activityViewModels$default$3
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

    private final TacticsDetailPresenter KWHzl() {
        return (TacticsDetailPresenter) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().OLrzqt(KWHzl().AhwBna());
        copydefault();
        djBIcL();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dxcTrN().values();
    }

    public final void copydefault() {
        this.EZpvd.register(ItemData.class, new wNH(new Function1() { // from class: o.wFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52291wFz.KWHzl(this.copydefault, (ItemData) obj);
            }
        }, null, null, null, null, 30, null));
        this.EZpvd.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52291wFz.AEQbTJ(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        gGvvIC().AhwBna.setAdapter(this.EZpvd);
        gGvvIC().AhwBna.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.KWHzl.register(TacticsPortfolioInfoDetailItem.class, new C52545wPj());
        C43316rmw c43316rmw = this.KWHzl;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c43316rmw.register(TacticsRecInfoDetailItem.class, new C52546wPk(fragmentActivityRequireActivity));
        gGvvIC().DbNXlk.setAdapter(this.KWHzl);
        gGvvIC().DbNXlk.setLayoutManager(new LinearLayoutManager(getActivity()));
        AEQbTJ();
    }

    public static final Unit KWHzl(C52291wFz c52291wFz, ItemData itemData) {
        Intrinsics.checkNotNullParameter(itemData, "");
        c52291wFz.EZpvd(itemData.AuCTel());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52291wFz c52291wFz, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        TacticsDetailPresenter.queryBotDetails$default(c52291wFz.KWHzl(), false, 1, null);
        RecyclerView recyclerView = c52291wFz.gGvvIC().DbNXlk;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(0);
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = KWHzl().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.wFE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52291wFz.copydefault(this.OLrzqt, (C55804xqp) obj);
            }
        }));
        TradeLiveData<InformationFragmentData> tradeLiveDataOLrzqt = dxcTrN().OLrzqt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.wFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52291wFz.KWHzl(this.EZpvd, (InformationFragmentData) obj);
            }
        }));
        C56111xwe<java.util.List<StgySourceInfo>> c56111xweAYXKKw = dxcTrN().AYXKKw();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweAYXKKw.observe(viewLifecycleOwner3, new ActionBar(new Function1() { // from class: o.wFJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52291wFz.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.wFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52291wFz.KWHzl(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        KWHzl().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.wFI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52291wFz.copydefault(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit copydefault(C52291wFz c52291wFz, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        c52291wFz.dxcTrN().OLrzqt((StrategyDetailsResponse) c55804xqp.copydefault());
        c52291wFz.dxcTrN().valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52291wFz c52291wFz, InformationFragmentData informationFragmentData) {
        Intrinsics.checkNotNullParameter(informationFragmentData, "");
        c52291wFz.AEQbTJ(informationFragmentData.getCurrentF(), informationFragmentData.getCurrentS(), informationFragmentData.getInitF(), informationFragmentData.getInitS(), Intrinsics.EZpvd((java.lang.Object) c52291wFz.dxcTrN().AEQbTJ().getOrderType(), (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) c52291wFz.dxcTrN().AEQbTJ().getOrderType(), (java.lang.Object) "moon_grid"));
        C33064mpR.OLrzqt(c52291wFz.EZpvd, (java.util.List<? extends java.lang.Object>) informationFragmentData.getDataList());
        C33064mpR.OLrzqt(c52291wFz.KWHzl, (java.util.List<? extends java.lang.Object>) informationFragmentData.getDetailList());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52291wFz c52291wFz, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c52291wFz.dxcTrN().valueOf();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52291wFz c52291wFz, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            c52291wFz.showLoading();
        } else {
            c52291wFz.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52291wFz c52291wFz, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c52291wFz.KWHzl().uzCIH().bB_())) {
            c52291wFz.EZpvd.setItems(CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, C33129mqd.gEmmrt(((java.lang.Exception) pair.second).getMessage()), 0, false, null, null, false, 62, null));
            c52291wFz.EZpvd.notifyDataSetChanged();
            RecyclerView recyclerView = c52291wFz.gGvvIC().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        gGvvIC().djBIcL.setVisibility(0);
        gGvvIC().fJNWhG.setVisibility(0);
        gGvvIC().fIwbmz.setVisibility(0);
        gGvvIC().AkhnZx.setVisibility(0);
    }

    public static /* synthetic */ void setProfitView$default(C52291wFz c52291wFz, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        c52291wFz.AEQbTJ(str, str2, str3, str4, z);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        if (!z) {
            gGvvIC().gEmmrt.setVisibility(8);
            return;
        }
        if (dxcTrN().AEQbTJ().isHistory()) {
            gGvvIC().AEQbTJ.setVisibility(8);
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4)) {
                gGvvIC().EZpvd.setGravity(17);
                gGvvIC().isConnected.setText(str3 + str4);
            } else {
                gGvvIC().isConnected.setText(str3 + "    " + str4);
            }
            gGvvIC().values.setVisibility(8);
        } else {
            gGvvIC().KWHzl.setText(str);
            gGvvIC().KWHzl.setVisibility(C56033xvF.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) str)));
            gGvvIC().valueOf.setText(str2);
            gGvvIC().valueOf.setVisibility(C56033xvF.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) str2)));
            gGvvIC().isConnected.setText(str3);
            gGvvIC().isConnected.setVisibility(C56033xvF.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) str3)));
            gGvvIC().values.setText(str4);
            gGvvIC().values.setVisibility(C56033xvF.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) str4)));
        }
        gGvvIC().gEmmrt.setVisibility(0);
    }

    private final void EZpvd(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(str);
        java.lang.String string = getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52291wFz.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (this.EZpvd.getItemCount() == 0) {
            super.showLoading();
        }
    }
}
