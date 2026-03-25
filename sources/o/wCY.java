package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.fragment.detail.GridPendingOrderFragment$subscribeOnUIChange$4;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.GridPendingEmptyData;
import com.okinc.unify_trade.bot.data.GridPendingItemData;
import com.okinc.unify_trade.bot.data.GridPendingOrderData;
import com.okinc.unify_trade.bot.presenter.GridPendingOrderPresenter;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.wCY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wCY extends AbstractC54505xKx<uPG, GridPendingOrderPresenter> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wDd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wCY.KWHzl();
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wDk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wCY.gEmmrt();
        }
    });
    public final int OLrzqt = C48033uCm.Activity.DGUQLI;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wDh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wCY.valueOf(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wDl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wCY.AhwBna(this.EZpvd);
        }
    });
    public final InterfaceC33171mrS gEmmrt = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);

    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public wCY() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.GridPendingOrderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.GridPendingOrderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.GridPendingOrderFragment$special$$inlined$activityViewModels$default$3
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

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wCY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.util.List<java.lang.String> AkhnZx() {
        return (java.util.List) this.EZpvd.getValue();
    }

    public static final java.util.List KWHzl() {
        return yDY.gEmmrt("grid", "contract_grid");
    }

    public final PendingIntent valueOf() {
        return (PendingIntent) this.AYXKKw.getValue();
    }

    public static final PendingIntent gEmmrt() {
        return new PendingIntent();
    }

    public static final class PendingIntent extends DiffUtil.ItemCallback<InterfaceC55787xqY> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public java.lang.Object getChangePayload(InterfaceC55787xqY interfaceC55787xqY, InterfaceC55787xqY interfaceC55787xqY2) {
            Intrinsics.checkNotNullParameter(interfaceC55787xqY, "");
            Intrinsics.checkNotNullParameter(interfaceC55787xqY2, "");
            return interfaceC55787xqY2;
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(InterfaceC55787xqY interfaceC55787xqY, InterfaceC55787xqY interfaceC55787xqY2) {
            Intrinsics.checkNotNullParameter(interfaceC55787xqY, "");
            Intrinsics.checkNotNullParameter(interfaceC55787xqY2, "");
            if ((interfaceC55787xqY instanceof GridPendingItemData) && (interfaceC55787xqY2 instanceof GridPendingItemData)) {
                return Intrinsics.EZpvd((java.lang.Object) ((GridPendingItemData) interfaceC55787xqY).getTitle(), (java.lang.Object) ((GridPendingItemData) interfaceC55787xqY2).getTitle());
            }
            if ((interfaceC55787xqY instanceof GridPendingEmptyData) && (interfaceC55787xqY2 instanceof GridPendingEmptyData)) {
                GridPendingEmptyData gridPendingEmptyData = (GridPendingEmptyData) interfaceC55787xqY;
                GridPendingEmptyData gridPendingEmptyData2 = (GridPendingEmptyData) interfaceC55787xqY2;
                if (Intrinsics.EZpvd((java.lang.Object) gridPendingEmptyData.getDesc(), (java.lang.Object) gridPendingEmptyData2.getDesc()) && gridPendingEmptyData.isLeft() == gridPendingEmptyData2.isLeft()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(InterfaceC55787xqY interfaceC55787xqY, InterfaceC55787xqY interfaceC55787xqY2) {
            Intrinsics.checkNotNullParameter(interfaceC55787xqY, "");
            Intrinsics.checkNotNullParameter(interfaceC55787xqY2, "");
            if ((interfaceC55787xqY instanceof GridPendingItemData) && (interfaceC55787xqY2 instanceof GridPendingItemData)) {
                GridPendingItemData gridPendingItemData = (GridPendingItemData) interfaceC55787xqY;
                GridPendingItemData gridPendingItemData2 = (GridPendingItemData) interfaceC55787xqY2;
                if (Intrinsics.EZpvd((java.lang.Object) gridPendingItemData.getTitle(), (java.lang.Object) gridPendingItemData2.getTitle()) && Intrinsics.EZpvd((java.lang.Object) gridPendingItemData.getOrderTag(), (java.lang.Object) gridPendingItemData2.getOrderTag()) && Intrinsics.EZpvd((java.lang.Object) gridPendingItemData.getText(), (java.lang.Object) gridPendingItemData2.getText()) && gridPendingItemData.getIndex() == gridPendingItemData2.getIndex() && Intrinsics.EZpvd((java.lang.Object) gridPendingItemData.getPx(), (java.lang.Object) gridPendingItemData2.getPx()) && Intrinsics.EZpvd((java.lang.Object) gridPendingItemData.getAmount(), (java.lang.Object) gridPendingItemData2.getAmount())) {
                    return true;
                }
            }
            return false;
        }
    }

    private final TacticsDetailPresenter values() {
        return (TacticsDetailPresenter) this.KWHzl.getValue();
    }

    public final C50027uzf<InterfaceC55787xqY> djBIcL() {
        return (C50027uzf) this.AEQbTJ.getValue();
    }

    public static final C50027uzf valueOf(wCY wcy) {
        return new C50027uzf(wcy.valueOf());
    }

    public final C50027uzf<InterfaceC55787xqY> AYXKKw() {
        return (C50027uzf) this.valueOf.getValue();
    }

    public static final C50027uzf AhwBna(wCY wcy) {
        return new C50027uzf(wcy.valueOf());
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(view, "");
        dxcTrN().KWHzl(values().AhwBna());
        djBIcL().register(GridPendingEmptyData.class, new C52543wPh(null, 1, null));
        AYXKKw().register(GridPendingEmptyData.class, new C52543wPh(null, 1, null));
        AYXKKw().register(GridPendingItemData.class, new ActionBar(true));
        djBIcL().register(GridPendingItemData.class, new ActionBar(false, 1, null));
        uPG upgGGvvIC = gGvvIC();
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            upgGGvvIC.AuCTelauCTel.setBackgroundResource(C48033uCm.ActionBar.copydefault);
            upgGGvvIC.OcIXYQ.setBackgroundResource(C48033uCm.ActionBar.copydefault);
            upgGGvvIC.KWHzl.setBackgroundResource(C48033uCm.ActionBar.AEQbTJ);
            upgGGvvIC.QKVWgx.setBackgroundResource(C48033uCm.ActionBar.AEQbTJ);
        }
        android.widget.TextView textView = upgGGvvIC.KWHzl;
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        textView.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56071xvr.getRiseUpColor$default(c56071xvr, 0.0f, 1, null)));
        upgGGvvIC.AuCTelauCTel.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56071xvr.getFallDownColor$default(c56071xvr, 0.0f, 1, null)));
        upgGGvvIC.QKVWgx.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56071xvr.getRiseUpColor$default(c56071xvr, 0.0f, 1, null)));
        upgGGvvIC.OcIXYQ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56071xvr.getFallDownColor$default(c56071xvr, 0.0f, 1, null)));
        upgGGvvIC.fARcdN.setAdapter(djBIcL());
        upgGGvvIC.AubY.setAdapter(AYXKKw());
        upgGGvvIC.fARcdN.setLayoutManager(new LinearLayoutManager(getActivity()));
        upgGGvvIC.AubY.setLayoutManager(new LinearLayoutManager(getActivity()));
        upgGGvvIC.fARcdN.setNestedScrollingEnabled(false);
        upgGGvvIC.AubY.setNestedScrollingEnabled(false);
        LinearLayoutCompat linearLayoutCompat = upgGGvvIC.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            linearLayoutCompat.setLayoutParams(layoutParams);
            java.lang.String orderType = dxcTrN().EZpvd().getOrderType();
            Group group = upgGGvvIC.gHZMYf;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(0);
            LinearLayoutCompat linearLayoutCompat2 = upgGGvvIC.AuCTel;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(((this.gEmmrt.getFieldNames() && Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) || Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) ? 0 : 8);
            android.widget.TextView textView2 = upgGGvvIC.DbNXlk;
            if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.getSerial);
            } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.iKEqwx);
            }
            textView2.setText(strAYXKKw);
            android.widget.TextView textView3 = upgGGvvIC.copydefault;
            textView3.setOnClickListener(new Activity(textView3, 1000L, this));
            upgGGvvIC.hDKMBd.setShowNewPriceIcon(true);
            upgGGvvIC.hDKMBd.setIsNeedColorChange(false);
            upgGGvvIC.hDKMBd.copydefault().setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ wCY AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, wCY wcy) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = wcy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.HJWChPURsaBn);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintView), (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ java.util.List AEQbTJ;
        public final /* synthetic */ wCY EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, boolean z, wCY wcy, java.util.List list) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = z;
            this.EZpvd = wcy;
            this.AEQbTJ = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.copydefault) {
                    android.content.Context contextRequireContext = this.EZpvd.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                    viewOnClickListenerC54939xaY.EZpvd(CollectionsKt___CollectionsKt.joinToString$default(this.AEQbTJ, "\n", null, null, 0, null, null, 62, null));
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new FragmentManager(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        isConnected();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dxcTrN().valueOf();
        dxcTrN().DbNXlk();
        gGvvIC().hDKMBd.OLrzqt(dxcTrN().EZpvd().getInstId(), dxcTrN().EZpvd().getInstType());
    }

    private final void isConnected() {
        TradeLiveData<kotlin.Pair<java.lang.String, java.lang.Integer>> tradeLiveDataDjBIcL = dxcTrN().djBIcL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataDjBIcL.observe(viewLifecycleOwner, new Dialog(new Function1() { // from class: o.wCZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCY.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = values().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        newProxyInstance.observe(viewLifecycleOwner2, new Dialog(new Function1() { // from class: o.wDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCY.OLrzqt(this.copydefault, (C55804xqp) obj);
            }
        }));
        TradeLiveData<java.util.List<TickersData>> tradeLiveDataKWHzl = dxcTrN().KWHzl();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner3, new Dialog(new Function1() { // from class: o.wDg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCY.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        }));
        SharedFlow<GridPendingOrderData> sharedFlowOLrzqt = dxcTrN().OLrzqt();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C52692wUv.flowAndCollect$default(sharedFlowOLrzqt, viewLifecycleOwner4, null, new GridPendingOrderFragment$subscribeOnUIChange$4(this, null), 2, null);
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.wDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCY.copydefault(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner5, new Dialog(new Function1() { // from class: o.wDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCY.OLrzqt(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit OLrzqt(wCY wcy, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        GridPendingOrderData value = wcy.dxcTrN().AEQbTJ().getValue();
        if (value != null) {
            TradeLiveData<GridPendingOrderData> tradeLiveDataAEQbTJ = wcy.dxcTrN().AEQbTJ();
            C55956xti c55956xtiGEmmrt = wcy.dxcTrN().gEmmrt();
            c55956xtiGEmmrt.KWHzl((java.lang.String) pair.getFirst());
            tradeLiveDataAEQbTJ.setValue(c55956xtiGEmmrt.EZpvd(value));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(wCY wcy, C55804xqp c55804xqp) {
        boolean z;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        uPG upgGGvvIC = wcy.gGvvIC();
        upgGGvvIC.fetchVPNInfo.setText(wcy.dxcTrN().AEQbTJ((StrategyDetailsResponse) c55804xqp.copydefault()));
        SmartEarnParam simpleEarn = ((StrategyDetailsResponse) c55804xqp.copydefault()).getSimpleEarn();
        if (Intrinsics.EZpvd((java.lang.Object) ((StrategyDetailsResponse) c55804xqp.copydefault()).getOrderType(), (java.lang.Object) "grid") && ((StrategyDetailsResponse) c55804xqp.copydefault()).getShouldShowEarn() && simpleEarn != null) {
            z = true;
            if (!simpleEarn.isEarnSupported() || !simpleEarn.getEnabled()) {
            }
        } else {
            z = false;
        }
        ConstraintLayout constraintLayout = upgGGvvIC.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(z ^ true ? 8 : 0);
        ConstraintLayout constraintLayout2 = wcy.gGvvIC().djBIcL;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, z ? C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ORxRYg) : 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            constraintLayout2.setLayoutParams(marginLayoutParams);
            if (Intrinsics.EZpvd((java.lang.Object) ((StrategyDetailsResponse) c55804xqp.copydefault()).getOrderType(), (java.lang.Object) "grid")) {
                java.lang.String strEZpvd = "--";
                if (simpleEarn == null || wcy.EZpvd(simpleEarn.getActiveRegionLow()) || wcy.EZpvd(simpleEarn.getActiveRegionHigh())) {
                    upgGGvvIC.EZpvd.setText("--");
                    upgGGvvIC.zuBGHE.setText("--");
                    upgGGvvIC.sSMYrx.setText("--");
                } else {
                    C56068xvo c56068xvo = C56068xvo.copydefault;
                    java.lang.String processedPrice$default = C56068xvo.getProcessedPrice$default(c56068xvo, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), simpleEarn.getActiveRegionLow(), null, false, false, 56, null);
                    java.lang.String processedPrice$default2 = C56068xvo.getProcessedPrice$default(c56068xvo, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), simpleEarn.getActiveRegionHigh(), null, false, false, 56, null);
                    java.lang.String processedPrice$default3 = C56068xvo.getProcessedPrice$default(c56068xvo, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getMinPx(), null, false, false, 56, null);
                    java.lang.String processedPrice$default4 = C56068xvo.getProcessedPrice$default(c56068xvo, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getMaxPx(), null, false, false, 56, null);
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), null, null, 12, null) : null;
                    SmartEarnParam simpleEarn2 = ((StrategyDetailsResponse) c55804xqp.copydefault()).getSimpleEarn();
                    java.lang.String earnMinLimit = simpleEarn2 != null ? simpleEarn2.getEarnMinLimit() : null;
                    SmartEarnParam simpleEarn3 = ((StrategyDetailsResponse) c55804xqp.copydefault()).getSimpleEarn();
                    java.lang.String earnMaxLimit = simpleEarn3 != null ? simpleEarn3.getEarnMaxLimit() : null;
                    SmartEarnParam simpleEarn4 = ((StrategyDetailsResponse) c55804xqp.copydefault()).getSimpleEarn();
                    EarnType earnType = simpleEarn4 != null ? simpleEarn4.getEarnType() : null;
                    android.widget.TextView textView = upgGGvvIC.EZpvd;
                    if (suggestedInstrument$default != null && earnMinLimit != null && earnMaxLimit != null && earnType != null) {
                        strEZpvd = C56033xvF.EZpvd((InterfaceC56538yJb<java.lang.String>) C56547yJk.EZpvd(earnMinLimit, earnMaxLimit), earnType, suggestedInstrument$default);
                    }
                    textView.setText(strEZpvd);
                    upgGGvvIC.zuBGHE.setText(processedPrice$default3 + " - " + processedPrice$default);
                    android.widget.TextView textView2 = upgGGvvIC.sSMYrx;
                    if (C33129mqd.copydefault(((StrategyDetailsResponse) c55804xqp.copydefault()).getMaxPx(), simpleEarn.getActiveRegionHigh())) {
                        str = processedPrice$default2 + " - " + processedPrice$default4;
                    } else {
                        str = processedPrice$default4 + " - " + processedPrice$default2;
                    }
                    textView2.setText(str);
                }
            }
            return Unit.INSTANCE;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final Unit AEQbTJ(wCY wcy, java.util.List list) {
        java.lang.String last;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        GridPendingOrderPresenter gridPendingOrderPresenterDxcTrN = wcy.dxcTrN();
        TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tickersData != null && (last = tickersData.getLast()) != null) {
            str = last;
        }
        kotlin.Pair<java.lang.String, java.lang.Integer> pairOLrzqt = gridPendingOrderPresenterDxcTrN.OLrzqt(str);
        wcy.dxcTrN().djBIcL().postValue(pairOLrzqt);
        wcy.dxcTrN().AEQbTJ(pairOLrzqt.getFirst());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(wCY wcy, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            wcy.showLoading();
        } else {
            wcy.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final wCY wcy, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C55173xeu c55173xeu = wcy.gGvvIC().isConnected;
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(0);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.OeawrHRnVkix));
        java.lang.String message = exc.getMessage();
        if (message == null) {
            message = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) message);
        c55173xeu.setRetry(C33070mpX.AYXKKw(C48033uCm.Fragment.OHqIaq));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.wDi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wCY.AEQbTJ(this.copydefault, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(wCY wcy, android.view.View view) {
        wcy.dxcTrN().valueOf();
        wcy.dxcTrN().DbNXlk();
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (djBIcL().getItemCount() == 0 || AYXKKw().getItemCount() == 0) {
            super.showLoading();
        }
    }

    public final void KWHzl(int i, int i2) {
        boolean z = java.lang.Math.max(i, i2) >= 20;
        uPG upgGGvvIC = gGvvIC();
        upgGGvvIC.fARcdN.setNestedScrollingEnabled(z);
        upgGGvvIC.AubY.setNestedScrollingEnabled(z);
        LinearLayoutCompat linearLayoutCompat = upgGGvvIC.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = z ? (int) android.util.TypedValue.applyDimension(1, 494.0f, getResources().getDisplayMetrics()) : -2;
            linearLayoutCompat.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void fetchVPNInfo() {
        ViewGroup.LayoutParams layoutParams = gGvvIC().ORxRYg.getLayoutParams();
        int iMax = java.lang.Math.max(gGvvIC().fARcdN.getHeight(), gGvvIC().AubY.getHeight());
        if (C33129mqd.OLrzqt(java.lang.Integer.valueOf(gGvvIC().ORxRYg.getHeight()), java.lang.Integer.valueOf(iMax))) {
            return;
        }
        layoutParams.height = iMax;
        gGvvIC().ORxRYg.setLayoutParams(layoutParams);
    }

    public static final class ActionBar extends AbstractC59533zio<GridPendingItemData, TaskDescription> {
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(false, 1, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:412) call: o.wCY.ActionBar.<init>(boolean):void type: THIS */
        public /* synthetic */ ActionBar(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object, java.util.List] */
        @Override // o.AbstractC59533zio
        public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, GridPendingItemData gridPendingItemData, java.util.List list) {
            copydefault((TaskDescription) viewHolder, gridPendingItemData, (java.util.List<? extends java.lang.Object>) list);
        }

        public ActionBar(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (this.KWHzl) {
                android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.dPnHjp, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "");
                return new TaskDescription(viewInflate);
            }
            android.view.View viewInflate2 = layoutInflater.inflate(C48033uCm.Activity.aVhqwO, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "");
            return new TaskDescription(viewInflate2);
        }

        public void copydefault(@NotNull TaskDescription taskDescription, @NotNull GridPendingItemData gridPendingItemData, @NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(gridPendingItemData, "");
            Intrinsics.checkNotNullParameter(list, "");
            onBindViewHolder(taskDescription, gridPendingItemData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [465=5] */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull GridPendingItemData gridPendingItemData) {
            kotlin.Pair pairOLrzqt;
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(gridPendingItemData, "");
            taskDescription.KWHzl().setText(xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(gridPendingItemData.getIndex()))));
            taskDescription.KWHzl().setTextColor(this.KWHzl ? C56071xvr.getFallDownColor$default(C56071xvr.gEmmrt, 0.0f, 1, null) : C56071xvr.getRiseUpColor$default(C56071xvr.gEmmrt, 0.0f, 1, null));
            if (gridPendingItemData.getTitle().length() == 0) {
                taskDescription.copydefault().setText("--");
            } else if (C33129mqd.gEmmrt(gridPendingItemData.getTitle(), "0")) {
                taskDescription.copydefault().setText(C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor));
            } else {
                taskDescription.copydefault().setText(gridPendingItemData.getTitle());
            }
            if (gridPendingItemData.getText().length() == 0) {
                taskDescription.EZpvd().setText("--");
            } else {
                taskDescription.EZpvd().setText(gridPendingItemData.getText());
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
            final android.widget.TextView textViewCopydefault = taskDescription.copydefault();
            textViewCopydefault.setTextColor(iIntValue);
            textViewCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.wDn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wCY.ActionBar.copydefault(str, textViewCopydefault, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void copydefault(java.lang.String str, android.widget.TextView textView, android.view.View view) {
            if (str != null) {
                android.content.Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(str);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.wDj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        wCY.ActionBar.copydefault(viewOnClickListenerC54939xaY, view2);
                    }
                });
                viewOnClickListenerC54939xaY.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView OLrzqt;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.sYOsaF);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.onAddQueueItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.onPlay);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.copydefault = (android.widget.TextView) viewFindViewById3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
        ViewGroup.LayoutParams layoutParams = gGvvIC().KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = gGvvIC().AuCTelauCTel.getLayoutParams();
        Intrinsics.copydefault(layoutParams3, "");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ViewGroup.LayoutParams layoutParams5 = gGvvIC().QOLQEE.getLayoutParams();
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
            gGvvIC().KWHzl.requestLayout();
            gGvvIC().AuCTelauCTel.requestLayout();
            android.widget.TextView textView = gGvvIC().QKVWgx;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.TextView textView2 = gGvvIC().OcIXYQ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            android.widget.TextView textView3 = gGvvIC().KWHzl;
            java.lang.String string = getString(C55688xof.Application.setHomeActionContentDescription);
            xMR xmr = xMR.copydefault;
            textView3.setText(string + " " + xmr.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size3))));
            gGvvIC().AuCTelauCTel.setText(xmr.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size4))) + " " + getString(C55688xof.Application.setStackedBackgroundDrawable));
            return;
        }
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(size), 0)) {
            layoutParams4.matchConstraintPercentWidth = 1.0f;
            layoutParams6.matchConstraintPercentWidth = 0.0f;
            layoutParams2.matchConstraintPercentWidth = 0.0f;
            gGvvIC().KWHzl.requestLayout();
            gGvvIC().AuCTelauCTel.requestLayout();
            android.widget.TextView textView4 = gGvvIC().QKVWgx;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
            android.widget.TextView textView5 = gGvvIC().OcIXYQ;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
            android.widget.TextView textView6 = gGvvIC().QKVWgx;
            java.lang.String string2 = getString(C55688xof.Application.setHomeActionContentDescription);
            xMR xmr2 = xMR.copydefault;
            textView6.setText(string2 + " " + xmr2.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size))));
            gGvvIC().AuCTelauCTel.setText(xmr2.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size4))) + " " + getString(C55688xof.Application.setStackedBackgroundDrawable));
            return;
        }
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(size2), 0)) {
            layoutParams2.matchConstraintPercentWidth = 1.0f;
            layoutParams6.matchConstraintPercentWidth = 0.0f;
            layoutParams4.matchConstraintPercentWidth = 0.0f;
            gGvvIC().KWHzl.requestLayout();
            gGvvIC().AuCTelauCTel.requestLayout();
            android.widget.TextView textView7 = gGvvIC().QKVWgx;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            textView7.setVisibility(8);
            android.widget.TextView textView8 = gGvvIC().OcIXYQ;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            textView8.setVisibility(0);
            android.widget.TextView textView9 = gGvvIC().KWHzl;
            java.lang.String string3 = getString(C55688xof.Application.setHomeActionContentDescription);
            xMR xmr3 = xMR.copydefault;
            textView9.setText(string3 + " " + xmr3.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size3))));
            gGvvIC().OcIXYQ.setText(xmr3.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(size2))) + " " + getString(C55688xof.Application.setStackedBackgroundDrawable));
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    private final boolean EZpvd(java.lang.String str) {
        return str.length() == 0 || C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) (-1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [588=4] */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.util.List<GridPendingItemData> list, C55258xgZ c55258xgZ, java.lang.String str) {
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
        c55258xgZ.setOnClickListener(new Fragment(c55258xgZ, 1000L, z, this, listAhwBna));
    }
}
