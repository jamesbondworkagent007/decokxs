package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.strategy.fragment.detail.nocloseposition.OpenOrdersFragment$initViewModel$1;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.bot.presenter.NoClosePositionPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wGT extends wGL<AbstractC48402uQd, NoClosePositionPresenter> {
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wGY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wGT.gEmmrt();
        }
    });
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.Ufzxmz;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wGT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final wGT copydefault(java.lang.String str) {
            wGT wgt = new wGT();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("BOT_TYPE_KEY", str);
            wgt.setArguments(bundle);
            return wgt;
        }
    }

    private final C43316rmw AYXKKw() {
        return (C43316rmw) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw gEmmrt() {
        return new C43316rmw();
    }

    private final java.lang.String AkhnZx() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("BOT_TYPE_KEY");
        }
        return null;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        values();
        fetchVPNInfo();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        AYXKKw().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wGQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wGT.copydefault(this.KWHzl, (EmptyData) obj);
            }
        }));
        AYXKKw().register(TransDetailsData.class, new C52502wNu(new Function1() { // from class: o.wGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wGT.OLrzqt(this.OLrzqt, (TransDetailsData) obj);
            }
        }));
        ((AbstractC48402uQd) gGvvIC()).AEQbTJ.setAdapter(AYXKKw());
        ((AbstractC48402uQd) gGvvIC()).AEQbTJ.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    public static final Unit copydefault(wGT wgt, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        wgt.isConnected();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(wGT wgt, TransDetailsData transDetailsData) {
        Intrinsics.checkNotNullParameter(transDetailsData, "");
        java.lang.String algoId = ((NoClosePositionPresenter) wgt.dxcTrN()).AEQbTJ().getAlgoId();
        java.lang.String orderId = transDetailsData.getOrderId();
        ((NoClosePositionPresenter) wgt.dxcTrN()).OLrzqt(new ContractGridClosePositionData(algoId, orderId == null ? "" : orderId, (java.lang.String) null, 4, (DefaultConstructorMarker) null), Intrinsics.EZpvd((java.lang.Object) wgt.AkhnZx(), (java.lang.Object) "contract_dca"));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchVPNInfo() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OpenOrdersFragment$initViewModel$1(this, null), 3, null);
        ((NoClosePositionPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wGT.KWHzl(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        C56111xwe<java.util.List<ContractGridClosePositionData>> c56111xweKWHzl = ((NoClosePositionPresenter) dxcTrN()).KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweKWHzl.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wGP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wGT.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }));
        TradeLiveData<java.util.List<StrategyOrderBillDetailsResponse>> tradeLiveDataAYXKKw = ((NoClosePositionPresenter) dxcTrN()).AYXKKw();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.wGW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wGT.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uyJ.updateDataOrEmpty$default(o.rmw, java.util.List, java.lang.String, int, java.lang.String, java.lang.String, boolean, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(wGT wgt, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((NoClosePositionPresenter) wgt.dxcTrN()).djBIcL().bB_())) {
            C49952uyJ.updateDataOrEmpty$default(wgt.AYXKKw(), yDY.AhwBna(), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wgt, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((NoClosePositionPresenter) wgt.dxcTrN()).EZpvd().bB_())) {
            wgt.isConnected();
        }
        java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wGT wgt, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.syncState), 1000);
        wgt.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(wGT wgt, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C49952uyJ.updateDataOrEmpty$default(wgt.AYXKKw(), new C55893xsY().KWHzl(new C55804xqp<>("", list, null, null, 12, null)), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wgt, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        ((NoClosePositionPresenter) dxcTrN()).AhwBna();
    }
}
