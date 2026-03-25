package o;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadSignalBotSettlementPresenter;
import com.okinc.unify_trade.biz.SettlementBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51871vvG extends AbstractC54505xKx<uOP, BotLeadSignalBotSettlementPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public C59534zip AEQbTJ = new C59534zip();
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vvJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51871vvG.EZpvd(this.copydefault);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vvI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51871vvG.AEQbTJ(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.vvG$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.fERRXa;
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String EZpvd(C51871vvG c51871vvG) {
        java.lang.String string;
        android.os.Bundle arguments = c51871vvG.getArguments();
        return (arguments == null || (string = arguments.getString("type")) == null) ? "" : string;
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String AEQbTJ(C51871vvG c51871vvG) {
        java.lang.String string;
        android.os.Bundle arguments = c51871vvG.getArguments();
        return (arguments == null || (string = arguments.getString("id")) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: o.vvG$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vvG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        uOP uopGGvvIC = gGvvIC();
        uopGGvvIC.copydefault.KWHzl(new InterfaceC57900yrD() { // from class: o.vvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C51871vvG.KWHzl(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        RecyclerView recyclerView = uopGGvvIC.AEQbTJ;
        this.AEQbTJ.register(SettlementBean.class, new C51894vvd());
        this.AEQbTJ.register(C57637ymF.class, new C57634ymC(new Function0() { // from class: o.vvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51871vvG.KWHzl();
            }
        }));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.AEQbTJ);
    }

    public static final void KWHzl(C51871vvG c51871vvG, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51871vvG.valueOf();
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54505xKx
    public void uzCIH() {
        super.uzCIH();
        showLoading();
        valueOf();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        dxcTrN().AEQbTJ().observe(this, new Application(new Function1() { // from class: o.vvH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51871vvG.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        }));
        dxcTrN().KWHzl().AhwBna().observe(this, new Application(new Function1() { // from class: o.vvK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51871vvG.KWHzl(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
        dxcTrN().EZpvd().observe(this, new Application(new Function1() { // from class: o.vvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51871vvG.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
    }

    public static final Unit OLrzqt(C51871vvG c51871vvG, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c51871vvG.dismissLoading();
        c51871vvG.EZpvd((java.util.List<SettlementBean>) list);
        c51871vvG.gGvvIC().copydefault.valueOf();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51871vvG, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51871vvG c51871vvG, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51871vvG.dismissLoading();
        c51871vvG.EZpvd((java.util.List<SettlementBean>) null);
        c51871vvG.gGvvIC().copydefault.valueOf();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51871vvG, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51871vvG c51871vvG, boolean z) {
        c51871vvG.gGvvIC().copydefault.AhwBna(z);
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        dxcTrN().copydefault(EZpvd(), AEQbTJ());
    }

    private final void EZpvd(java.util.List<SettlementBean> list) {
        if (list == null || list.isEmpty()) {
            if (this.AEQbTJ.getItems().isEmpty()) {
                C33064mpR.OLrzqt(this.AEQbTJ, (java.util.List<? extends java.lang.Object>) C56402yEa.EZpvd(new C57637ymF(C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, C55298xhM.dp2pxFloat$default(50.0f, null, 1, null), 2, null)));
                return;
            }
            return;
        }
        C33064mpR.OLrzqt(this.AEQbTJ, list);
    }
}
